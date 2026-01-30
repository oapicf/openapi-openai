{-# LANGUAGE CPP #-}
{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import OpenAI.Model
import OpenAI.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V
import Data.String (fromString)

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

#if MIN_VERSION_aeson(2,0,0)
#else
-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = arbitraryValue
#endif

arbitraryValue :: Gen A.Value
arbitraryValue =
  frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (fromString k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays

-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models

instance Arbitrary AdminApiKey where
  arbitrary = sized genAdminApiKey

genAdminApiKey :: Int -> Gen AdminApiKey
genAdminApiKey n =
  AdminApiKey
    <$> arbitraryReducedMaybe n -- adminApiKeyObject :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyRedactedValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyCreatedAt :: Maybe Integer
    <*> arbitraryReducedMaybe n -- adminApiKeyOwner :: Maybe AdminApiKeyOwner
  
instance Arbitrary AdminApiKeyOwner where
  arbitrary = sized genAdminApiKeyOwner

genAdminApiKeyOwner :: Int -> Gen AdminApiKeyOwner
genAdminApiKeyOwner n =
  AdminApiKeyOwner
    <$> arbitraryReducedMaybe n -- adminApiKeyOwnerType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyOwnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyOwnerName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeyOwnerCreatedAt :: Maybe Integer
    <*> arbitraryReducedMaybe n -- adminApiKeyOwnerRole :: Maybe Text
  
instance Arbitrary AdminApiKeysCreateRequest where
  arbitrary = sized genAdminApiKeysCreateRequest

genAdminApiKeysCreateRequest :: Int -> Gen AdminApiKeysCreateRequest
genAdminApiKeysCreateRequest n =
  AdminApiKeysCreateRequest
    <$> arbitrary -- adminApiKeysCreateRequestName :: Text
  
instance Arbitrary AdminApiKeysDelete200Response where
  arbitrary = sized genAdminApiKeysDelete200Response

genAdminApiKeysDelete200Response :: Int -> Gen AdminApiKeysDelete200Response
genAdminApiKeysDelete200Response n =
  AdminApiKeysDelete200Response
    <$> arbitraryReducedMaybe n -- adminApiKeysDelete200ResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeysDelete200ResponseObject :: Maybe Text
    <*> arbitraryReducedMaybe n -- adminApiKeysDelete200ResponseDeleted :: Maybe Bool
  
instance Arbitrary ApiKeyList where
  arbitrary = sized genApiKeyList

genApiKeyList :: Int -> Gen ApiKeyList
genApiKeyList n =
  ApiKeyList
    <$> arbitraryReducedMaybe n -- apiKeyListObject :: Maybe Text
    <*> arbitraryReducedMaybe n -- apiKeyListData :: Maybe [AdminApiKey]
    <*> arbitraryReducedMaybe n -- apiKeyListHasMore :: Maybe Bool
    <*> arbitraryReducedMaybe n -- apiKeyListFirstId :: Maybe Text
    <*> arbitraryReducedMaybe n -- apiKeyListLastId :: Maybe Text
  
instance Arbitrary ArrayOfContentPartsInner where
  arbitrary = sized genArrayOfContentPartsInner

genArrayOfContentPartsInner :: Int -> Gen ArrayOfContentPartsInner
genArrayOfContentPartsInner n =
  ArrayOfContentPartsInner
    <$> arbitrary -- arrayOfContentPartsInnerType :: E'Type70
    <*> arbitraryReduced n -- arrayOfContentPartsInnerImageFile :: MessageContentImageFileObjectImageFile
    <*> arbitraryReduced n -- arrayOfContentPartsInnerImageUrl :: MessageContentImageUrlObjectImageUrl
    <*> arbitrary -- arrayOfContentPartsInnerText :: Text
  
instance Arbitrary AssistantObject where
  arbitrary = sized genAssistantObject

genAssistantObject :: Int -> Gen AssistantObject
genAssistantObject n =
  AssistantObject
    <$> arbitrary -- assistantObjectId :: Text
    <*> arbitrary -- assistantObjectObject :: E'Object
    <*> arbitrary -- assistantObjectCreatedAt :: Int
    <*> arbitrary -- assistantObjectName :: Text
    <*> arbitrary -- assistantObjectDescription :: Text
    <*> arbitrary -- assistantObjectModel :: Text
    <*> arbitrary -- assistantObjectInstructions :: Text
    <*> arbitraryReduced n -- assistantObjectTools :: [AssistantObjectToolsInner]
    <*> arbitraryReducedMaybe n -- assistantObjectToolResources :: Maybe AssistantObjectToolResources
    <*> arbitraryReduced n -- assistantObjectMetadata :: A.Value
    <*> arbitraryReducedMaybe n -- assistantObjectTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- assistantObjectTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- assistantObjectResponseFormat :: Maybe AssistantsApiResponseFormatOption
  
instance Arbitrary AssistantObjectToolResources where
  arbitrary = sized genAssistantObjectToolResources

genAssistantObjectToolResources :: Int -> Gen AssistantObjectToolResources
genAssistantObjectToolResources n =
  AssistantObjectToolResources
    <$> arbitraryReducedMaybe n -- assistantObjectToolResourcesCodeInterpreter :: Maybe AssistantObjectToolResourcesCodeInterpreter
    <*> arbitraryReducedMaybe n -- assistantObjectToolResourcesFileSearch :: Maybe AssistantObjectToolResourcesFileSearch
  
instance Arbitrary AssistantObjectToolResourcesCodeInterpreter where
  arbitrary = sized genAssistantObjectToolResourcesCodeInterpreter

genAssistantObjectToolResourcesCodeInterpreter :: Int -> Gen AssistantObjectToolResourcesCodeInterpreter
genAssistantObjectToolResourcesCodeInterpreter n =
  AssistantObjectToolResourcesCodeInterpreter
    <$> arbitraryReducedMaybe n -- assistantObjectToolResourcesCodeInterpreterFileIds :: Maybe [Text]
  
instance Arbitrary AssistantObjectToolResourcesFileSearch where
  arbitrary = sized genAssistantObjectToolResourcesFileSearch

genAssistantObjectToolResourcesFileSearch :: Int -> Gen AssistantObjectToolResourcesFileSearch
genAssistantObjectToolResourcesFileSearch n =
  AssistantObjectToolResourcesFileSearch
    <$> arbitraryReducedMaybe n -- assistantObjectToolResourcesFileSearchVectorStoreIds :: Maybe [Text]
  
instance Arbitrary AssistantObjectToolsInner where
  arbitrary = sized genAssistantObjectToolsInner

genAssistantObjectToolsInner :: Int -> Gen AssistantObjectToolsInner
genAssistantObjectToolsInner n =
  AssistantObjectToolsInner
    <$> arbitrary -- assistantObjectToolsInnerType :: E'Type69
    <*> arbitraryReducedMaybe n -- assistantObjectToolsInnerFileSearch :: Maybe AssistantToolsFileSearchFileSearch
    <*> arbitraryReduced n -- assistantObjectToolsInnerFunction :: FunctionObject
  
instance Arbitrary AssistantStreamEvent where
  arbitrary = sized genAssistantStreamEvent

genAssistantStreamEvent :: Int -> Gen AssistantStreamEvent
genAssistantStreamEvent n =
  AssistantStreamEvent
    <$> arbitraryReducedMaybe n -- assistantStreamEventEnabled :: Maybe Bool
    <*> arbitrary -- assistantStreamEventEvent :: E'Event
    <*> arbitrary -- assistantStreamEventData :: E'Data
  
instance Arbitrary AssistantToolsCode where
  arbitrary = sized genAssistantToolsCode

genAssistantToolsCode :: Int -> Gen AssistantToolsCode
genAssistantToolsCode n =
  AssistantToolsCode
    <$> arbitrary -- assistantToolsCodeType :: E'Type
  
instance Arbitrary AssistantToolsFileSearch where
  arbitrary = sized genAssistantToolsFileSearch

genAssistantToolsFileSearch :: Int -> Gen AssistantToolsFileSearch
genAssistantToolsFileSearch n =
  AssistantToolsFileSearch
    <$> arbitrary -- assistantToolsFileSearchType :: E'Type2
    <*> arbitraryReducedMaybe n -- assistantToolsFileSearchFileSearch :: Maybe AssistantToolsFileSearchFileSearch
  
instance Arbitrary AssistantToolsFileSearchFileSearch where
  arbitrary = sized genAssistantToolsFileSearchFileSearch

genAssistantToolsFileSearchFileSearch :: Int -> Gen AssistantToolsFileSearchFileSearch
genAssistantToolsFileSearchFileSearch n =
  AssistantToolsFileSearchFileSearch
    <$> arbitraryReducedMaybe n -- assistantToolsFileSearchFileSearchMaxNumResults :: Maybe Int
    <*> arbitraryReducedMaybe n -- assistantToolsFileSearchFileSearchRankingOptions :: Maybe FileSearchRankingOptions
  
instance Arbitrary AssistantToolsFileSearchTypeOnly where
  arbitrary = sized genAssistantToolsFileSearchTypeOnly

genAssistantToolsFileSearchTypeOnly :: Int -> Gen AssistantToolsFileSearchTypeOnly
genAssistantToolsFileSearchTypeOnly n =
  AssistantToolsFileSearchTypeOnly
    <$> arbitrary -- assistantToolsFileSearchTypeOnlyType :: E'Type2
  
instance Arbitrary AssistantToolsFunction where
  arbitrary = sized genAssistantToolsFunction

genAssistantToolsFunction :: Int -> Gen AssistantToolsFunction
genAssistantToolsFunction n =
  AssistantToolsFunction
    <$> arbitrary -- assistantToolsFunctionType :: E'Type3
    <*> arbitraryReduced n -- assistantToolsFunctionFunction :: FunctionObject
  
instance Arbitrary AssistantsApiResponseFormatOption where
  arbitrary = sized genAssistantsApiResponseFormatOption

genAssistantsApiResponseFormatOption :: Int -> Gen AssistantsApiResponseFormatOption
genAssistantsApiResponseFormatOption n =
  AssistantsApiResponseFormatOption
    <$> arbitrary -- assistantsApiResponseFormatOptionType :: E'Type4
    <*> arbitraryReduced n -- assistantsApiResponseFormatOptionJsonSchema :: ResponseFormatJsonSchemaJsonSchema
  
instance Arbitrary AssistantsApiToolChoiceOption where
  arbitrary = sized genAssistantsApiToolChoiceOption

genAssistantsApiToolChoiceOption :: Int -> Gen AssistantsApiToolChoiceOption
genAssistantsApiToolChoiceOption n =
  AssistantsApiToolChoiceOption
    <$> arbitrary -- assistantsApiToolChoiceOptionType :: E'Type5
    <*> arbitraryReducedMaybe n -- assistantsApiToolChoiceOptionFunction :: Maybe AssistantsNamedToolChoiceFunction
  
instance Arbitrary AssistantsNamedToolChoice where
  arbitrary = sized genAssistantsNamedToolChoice

genAssistantsNamedToolChoice :: Int -> Gen AssistantsNamedToolChoice
genAssistantsNamedToolChoice n =
  AssistantsNamedToolChoice
    <$> arbitrary -- assistantsNamedToolChoiceType :: E'Type5
    <*> arbitraryReducedMaybe n -- assistantsNamedToolChoiceFunction :: Maybe AssistantsNamedToolChoiceFunction
  
instance Arbitrary AssistantsNamedToolChoiceFunction where
  arbitrary = sized genAssistantsNamedToolChoiceFunction

genAssistantsNamedToolChoiceFunction :: Int -> Gen AssistantsNamedToolChoiceFunction
genAssistantsNamedToolChoiceFunction n =
  AssistantsNamedToolChoiceFunction
    <$> arbitrary -- assistantsNamedToolChoiceFunctionName :: Text
  
instance Arbitrary AuditLog where
  arbitrary = sized genAuditLog

genAuditLog :: Int -> Gen AuditLog
genAuditLog n =
  AuditLog
    <$> arbitrary -- auditLogId :: Text
    <*> arbitraryReduced n -- auditLogType :: AuditLogEventType
    <*> arbitrary -- auditLogEffectiveAt :: Int
    <*> arbitraryReducedMaybe n -- auditLogProject :: Maybe AuditLogProject
    <*> arbitraryReduced n -- auditLogActor :: AuditLogActor
    <*> arbitraryReducedMaybe n -- auditLogApiKeyCreated :: Maybe AuditLogApiKeyCreated
    <*> arbitraryReducedMaybe n -- auditLogApiKeyUpdated :: Maybe AuditLogApiKeyUpdated
    <*> arbitraryReducedMaybe n -- auditLogApiKeyDeleted :: Maybe AuditLogApiKeyDeleted
    <*> arbitraryReducedMaybe n -- auditLogInviteSent :: Maybe AuditLogInviteSent
    <*> arbitraryReducedMaybe n -- auditLogInviteAccepted :: Maybe AuditLogInviteAccepted
    <*> arbitraryReducedMaybe n -- auditLogInviteDeleted :: Maybe AuditLogInviteAccepted
    <*> arbitraryReducedMaybe n -- auditLogLoginFailed :: Maybe AuditLogLoginFailed
    <*> arbitraryReducedMaybe n -- auditLogLogoutFailed :: Maybe AuditLogLoginFailed
    <*> arbitraryReducedMaybe n -- auditLogOrganizationUpdated :: Maybe AuditLogOrganizationUpdated
    <*> arbitraryReducedMaybe n -- auditLogProjectCreated :: Maybe AuditLogProjectCreated
    <*> arbitraryReducedMaybe n -- auditLogProjectUpdated :: Maybe AuditLogProjectUpdated
    <*> arbitraryReducedMaybe n -- auditLogProjectArchived :: Maybe AuditLogProjectArchived
    <*> arbitraryReducedMaybe n -- auditLogRateLimitUpdated :: Maybe AuditLogRateLimitUpdated
    <*> arbitraryReducedMaybe n -- auditLogRateLimitDeleted :: Maybe AuditLogRateLimitDeleted
    <*> arbitraryReducedMaybe n -- auditLogServiceAccountCreated :: Maybe AuditLogServiceAccountCreated
    <*> arbitraryReducedMaybe n -- auditLogServiceAccountUpdated :: Maybe AuditLogServiceAccountUpdated
    <*> arbitraryReducedMaybe n -- auditLogServiceAccountDeleted :: Maybe AuditLogServiceAccountDeleted
    <*> arbitraryReducedMaybe n -- auditLogUserAdded :: Maybe AuditLogUserAdded
    <*> arbitraryReducedMaybe n -- auditLogUserUpdated :: Maybe AuditLogUserUpdated
    <*> arbitraryReducedMaybe n -- auditLogUserDeleted :: Maybe AuditLogUserDeleted
  
instance Arbitrary AuditLogActor where
  arbitrary = sized genAuditLogActor

genAuditLogActor :: Int -> Gen AuditLogActor
genAuditLogActor n =
  AuditLogActor
    <$> arbitraryReducedMaybe n -- auditLogActorType :: Maybe E'Type6
    <*> arbitraryReducedMaybe n -- auditLogActorSession :: Maybe AuditLogActorSession
    <*> arbitraryReducedMaybe n -- auditLogActorApiKey :: Maybe AuditLogActorApiKey
  
instance Arbitrary AuditLogActorApiKey where
  arbitrary = sized genAuditLogActorApiKey

genAuditLogActorApiKey :: Int -> Gen AuditLogActorApiKey
genAuditLogActorApiKey n =
  AuditLogActorApiKey
    <$> arbitraryReducedMaybe n -- auditLogActorApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogActorApiKeyType :: Maybe E'Type7
    <*> arbitraryReducedMaybe n -- auditLogActorApiKeyUser :: Maybe AuditLogActorUser
    <*> arbitraryReducedMaybe n -- auditLogActorApiKeyServiceAccount :: Maybe AuditLogActorServiceAccount
  
instance Arbitrary AuditLogActorServiceAccount where
  arbitrary = sized genAuditLogActorServiceAccount

genAuditLogActorServiceAccount :: Int -> Gen AuditLogActorServiceAccount
genAuditLogActorServiceAccount n =
  AuditLogActorServiceAccount
    <$> arbitraryReducedMaybe n -- auditLogActorServiceAccountId :: Maybe Text
  
instance Arbitrary AuditLogActorSession where
  arbitrary = sized genAuditLogActorSession

genAuditLogActorSession :: Int -> Gen AuditLogActorSession
genAuditLogActorSession n =
  AuditLogActorSession
    <$> arbitraryReducedMaybe n -- auditLogActorSessionUser :: Maybe AuditLogActorUser
    <*> arbitraryReducedMaybe n -- auditLogActorSessionIpAddress :: Maybe Text
  
instance Arbitrary AuditLogActorUser where
  arbitrary = sized genAuditLogActorUser

genAuditLogActorUser :: Int -> Gen AuditLogActorUser
genAuditLogActorUser n =
  AuditLogActorUser
    <$> arbitraryReducedMaybe n -- auditLogActorUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogActorUserEmail :: Maybe Text
  
instance Arbitrary AuditLogApiKeyCreated where
  arbitrary = sized genAuditLogApiKeyCreated

genAuditLogApiKeyCreated :: Int -> Gen AuditLogApiKeyCreated
genAuditLogApiKeyCreated n =
  AuditLogApiKeyCreated
    <$> arbitraryReducedMaybe n -- auditLogApiKeyCreatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogApiKeyCreatedData :: Maybe AuditLogApiKeyCreatedData
  
instance Arbitrary AuditLogApiKeyCreatedData where
  arbitrary = sized genAuditLogApiKeyCreatedData

genAuditLogApiKeyCreatedData :: Int -> Gen AuditLogApiKeyCreatedData
genAuditLogApiKeyCreatedData n =
  AuditLogApiKeyCreatedData
    <$> arbitraryReducedMaybe n -- auditLogApiKeyCreatedDataScopes :: Maybe [Text]
  
instance Arbitrary AuditLogApiKeyDeleted where
  arbitrary = sized genAuditLogApiKeyDeleted

genAuditLogApiKeyDeleted :: Int -> Gen AuditLogApiKeyDeleted
genAuditLogApiKeyDeleted n =
  AuditLogApiKeyDeleted
    <$> arbitraryReducedMaybe n -- auditLogApiKeyDeletedId :: Maybe Text
  
instance Arbitrary AuditLogApiKeyUpdated where
  arbitrary = sized genAuditLogApiKeyUpdated

genAuditLogApiKeyUpdated :: Int -> Gen AuditLogApiKeyUpdated
genAuditLogApiKeyUpdated n =
  AuditLogApiKeyUpdated
    <$> arbitraryReducedMaybe n -- auditLogApiKeyUpdatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogApiKeyUpdatedChangesRequested :: Maybe AuditLogApiKeyUpdatedChangesRequested
  
instance Arbitrary AuditLogApiKeyUpdatedChangesRequested where
  arbitrary = sized genAuditLogApiKeyUpdatedChangesRequested

genAuditLogApiKeyUpdatedChangesRequested :: Int -> Gen AuditLogApiKeyUpdatedChangesRequested
genAuditLogApiKeyUpdatedChangesRequested n =
  AuditLogApiKeyUpdatedChangesRequested
    <$> arbitraryReducedMaybe n -- auditLogApiKeyUpdatedChangesRequestedScopes :: Maybe [Text]
  
instance Arbitrary AuditLogInviteAccepted where
  arbitrary = sized genAuditLogInviteAccepted

genAuditLogInviteAccepted :: Int -> Gen AuditLogInviteAccepted
genAuditLogInviteAccepted n =
  AuditLogInviteAccepted
    <$> arbitraryReducedMaybe n -- auditLogInviteAcceptedId :: Maybe Text
  
instance Arbitrary AuditLogInviteSent where
  arbitrary = sized genAuditLogInviteSent

genAuditLogInviteSent :: Int -> Gen AuditLogInviteSent
genAuditLogInviteSent n =
  AuditLogInviteSent
    <$> arbitraryReducedMaybe n -- auditLogInviteSentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogInviteSentData :: Maybe AuditLogInviteSentData
  
instance Arbitrary AuditLogInviteSentData where
  arbitrary = sized genAuditLogInviteSentData

genAuditLogInviteSentData :: Int -> Gen AuditLogInviteSentData
genAuditLogInviteSentData n =
  AuditLogInviteSentData
    <$> arbitraryReducedMaybe n -- auditLogInviteSentDataEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogInviteSentDataRole :: Maybe Text
  
instance Arbitrary AuditLogLoginFailed where
  arbitrary = sized genAuditLogLoginFailed

genAuditLogLoginFailed :: Int -> Gen AuditLogLoginFailed
genAuditLogLoginFailed n =
  AuditLogLoginFailed
    <$> arbitraryReducedMaybe n -- auditLogLoginFailedErrorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogLoginFailedErrorMessage :: Maybe Text
  
instance Arbitrary AuditLogOrganizationUpdated where
  arbitrary = sized genAuditLogOrganizationUpdated

genAuditLogOrganizationUpdated :: Int -> Gen AuditLogOrganizationUpdated
genAuditLogOrganizationUpdated n =
  AuditLogOrganizationUpdated
    <$> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedChangesRequested :: Maybe AuditLogOrganizationUpdatedChangesRequested
  
instance Arbitrary AuditLogOrganizationUpdatedChangesRequested where
  arbitrary = sized genAuditLogOrganizationUpdatedChangesRequested

genAuditLogOrganizationUpdatedChangesRequested :: Int -> Gen AuditLogOrganizationUpdatedChangesRequested
genAuditLogOrganizationUpdatedChangesRequested n =
  AuditLogOrganizationUpdatedChangesRequested
    <$> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedChangesRequestedTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedChangesRequestedDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedChangesRequestedName :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedChangesRequestedSettings :: Maybe AuditLogOrganizationUpdatedChangesRequestedSettings
  
instance Arbitrary AuditLogOrganizationUpdatedChangesRequestedSettings where
  arbitrary = sized genAuditLogOrganizationUpdatedChangesRequestedSettings

genAuditLogOrganizationUpdatedChangesRequestedSettings :: Int -> Gen AuditLogOrganizationUpdatedChangesRequestedSettings
genAuditLogOrganizationUpdatedChangesRequestedSettings n =
  AuditLogOrganizationUpdatedChangesRequestedSettings
    <$> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedChangesRequestedSettingsThreadsUiVisibility :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogOrganizationUpdatedChangesRequestedSettingsUsageDashboardVisibility :: Maybe Text
  
instance Arbitrary AuditLogProject where
  arbitrary = sized genAuditLogProject

genAuditLogProject :: Int -> Gen AuditLogProject
genAuditLogProject n =
  AuditLogProject
    <$> arbitraryReducedMaybe n -- auditLogProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogProjectName :: Maybe Text
  
instance Arbitrary AuditLogProjectArchived where
  arbitrary = sized genAuditLogProjectArchived

genAuditLogProjectArchived :: Int -> Gen AuditLogProjectArchived
genAuditLogProjectArchived n =
  AuditLogProjectArchived
    <$> arbitraryReducedMaybe n -- auditLogProjectArchivedId :: Maybe Text
  
instance Arbitrary AuditLogProjectCreated where
  arbitrary = sized genAuditLogProjectCreated

genAuditLogProjectCreated :: Int -> Gen AuditLogProjectCreated
genAuditLogProjectCreated n =
  AuditLogProjectCreated
    <$> arbitraryReducedMaybe n -- auditLogProjectCreatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogProjectCreatedData :: Maybe AuditLogProjectCreatedData
  
instance Arbitrary AuditLogProjectCreatedData where
  arbitrary = sized genAuditLogProjectCreatedData

genAuditLogProjectCreatedData :: Int -> Gen AuditLogProjectCreatedData
genAuditLogProjectCreatedData n =
  AuditLogProjectCreatedData
    <$> arbitraryReducedMaybe n -- auditLogProjectCreatedDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogProjectCreatedDataTitle :: Maybe Text
  
instance Arbitrary AuditLogProjectUpdated where
  arbitrary = sized genAuditLogProjectUpdated

genAuditLogProjectUpdated :: Int -> Gen AuditLogProjectUpdated
genAuditLogProjectUpdated n =
  AuditLogProjectUpdated
    <$> arbitraryReducedMaybe n -- auditLogProjectUpdatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogProjectUpdatedChangesRequested :: Maybe AuditLogProjectUpdatedChangesRequested
  
instance Arbitrary AuditLogProjectUpdatedChangesRequested where
  arbitrary = sized genAuditLogProjectUpdatedChangesRequested

genAuditLogProjectUpdatedChangesRequested :: Int -> Gen AuditLogProjectUpdatedChangesRequested
genAuditLogProjectUpdatedChangesRequested n =
  AuditLogProjectUpdatedChangesRequested
    <$> arbitraryReducedMaybe n -- auditLogProjectUpdatedChangesRequestedTitle :: Maybe Text
  
instance Arbitrary AuditLogRateLimitDeleted where
  arbitrary = sized genAuditLogRateLimitDeleted

genAuditLogRateLimitDeleted :: Int -> Gen AuditLogRateLimitDeleted
genAuditLogRateLimitDeleted n =
  AuditLogRateLimitDeleted
    <$> arbitraryReducedMaybe n -- auditLogRateLimitDeletedId :: Maybe Text
  
instance Arbitrary AuditLogRateLimitUpdated where
  arbitrary = sized genAuditLogRateLimitUpdated

genAuditLogRateLimitUpdated :: Int -> Gen AuditLogRateLimitUpdated
genAuditLogRateLimitUpdated n =
  AuditLogRateLimitUpdated
    <$> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedChangesRequested :: Maybe AuditLogRateLimitUpdatedChangesRequested
  
instance Arbitrary AuditLogRateLimitUpdatedChangesRequested where
  arbitrary = sized genAuditLogRateLimitUpdatedChangesRequested

genAuditLogRateLimitUpdatedChangesRequested :: Int -> Gen AuditLogRateLimitUpdatedChangesRequested
genAuditLogRateLimitUpdatedChangesRequested n =
  AuditLogRateLimitUpdatedChangesRequested
    <$> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedChangesRequestedMaxRequestsPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedChangesRequestedMaxTokensPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedChangesRequestedMaxImagesPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedChangesRequestedMaxAudioMegabytesPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedChangesRequestedMaxRequestsPer1Day :: Maybe Int
    <*> arbitraryReducedMaybe n -- auditLogRateLimitUpdatedChangesRequestedBatch1DayMaxInputTokens :: Maybe Int
  
instance Arbitrary AuditLogServiceAccountCreated where
  arbitrary = sized genAuditLogServiceAccountCreated

genAuditLogServiceAccountCreated :: Int -> Gen AuditLogServiceAccountCreated
genAuditLogServiceAccountCreated n =
  AuditLogServiceAccountCreated
    <$> arbitraryReducedMaybe n -- auditLogServiceAccountCreatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogServiceAccountCreatedData :: Maybe AuditLogServiceAccountCreatedData
  
instance Arbitrary AuditLogServiceAccountCreatedData where
  arbitrary = sized genAuditLogServiceAccountCreatedData

genAuditLogServiceAccountCreatedData :: Int -> Gen AuditLogServiceAccountCreatedData
genAuditLogServiceAccountCreatedData n =
  AuditLogServiceAccountCreatedData
    <$> arbitraryReducedMaybe n -- auditLogServiceAccountCreatedDataRole :: Maybe Text
  
instance Arbitrary AuditLogServiceAccountDeleted where
  arbitrary = sized genAuditLogServiceAccountDeleted

genAuditLogServiceAccountDeleted :: Int -> Gen AuditLogServiceAccountDeleted
genAuditLogServiceAccountDeleted n =
  AuditLogServiceAccountDeleted
    <$> arbitraryReducedMaybe n -- auditLogServiceAccountDeletedId :: Maybe Text
  
instance Arbitrary AuditLogServiceAccountUpdated where
  arbitrary = sized genAuditLogServiceAccountUpdated

genAuditLogServiceAccountUpdated :: Int -> Gen AuditLogServiceAccountUpdated
genAuditLogServiceAccountUpdated n =
  AuditLogServiceAccountUpdated
    <$> arbitraryReducedMaybe n -- auditLogServiceAccountUpdatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogServiceAccountUpdatedChangesRequested :: Maybe AuditLogServiceAccountUpdatedChangesRequested
  
instance Arbitrary AuditLogServiceAccountUpdatedChangesRequested where
  arbitrary = sized genAuditLogServiceAccountUpdatedChangesRequested

genAuditLogServiceAccountUpdatedChangesRequested :: Int -> Gen AuditLogServiceAccountUpdatedChangesRequested
genAuditLogServiceAccountUpdatedChangesRequested n =
  AuditLogServiceAccountUpdatedChangesRequested
    <$> arbitraryReducedMaybe n -- auditLogServiceAccountUpdatedChangesRequestedRole :: Maybe Text
  
instance Arbitrary AuditLogUserAdded where
  arbitrary = sized genAuditLogUserAdded

genAuditLogUserAdded :: Int -> Gen AuditLogUserAdded
genAuditLogUserAdded n =
  AuditLogUserAdded
    <$> arbitraryReducedMaybe n -- auditLogUserAddedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogUserAddedData :: Maybe AuditLogUserAddedData
  
instance Arbitrary AuditLogUserAddedData where
  arbitrary = sized genAuditLogUserAddedData

genAuditLogUserAddedData :: Int -> Gen AuditLogUserAddedData
genAuditLogUserAddedData n =
  AuditLogUserAddedData
    <$> arbitraryReducedMaybe n -- auditLogUserAddedDataRole :: Maybe Text
  
instance Arbitrary AuditLogUserDeleted where
  arbitrary = sized genAuditLogUserDeleted

genAuditLogUserDeleted :: Int -> Gen AuditLogUserDeleted
genAuditLogUserDeleted n =
  AuditLogUserDeleted
    <$> arbitraryReducedMaybe n -- auditLogUserDeletedId :: Maybe Text
  
instance Arbitrary AuditLogUserUpdated where
  arbitrary = sized genAuditLogUserUpdated

genAuditLogUserUpdated :: Int -> Gen AuditLogUserUpdated
genAuditLogUserUpdated n =
  AuditLogUserUpdated
    <$> arbitraryReducedMaybe n -- auditLogUserUpdatedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- auditLogUserUpdatedChangesRequested :: Maybe AuditLogUserUpdatedChangesRequested
  
instance Arbitrary AuditLogUserUpdatedChangesRequested where
  arbitrary = sized genAuditLogUserUpdatedChangesRequested

genAuditLogUserUpdatedChangesRequested :: Int -> Gen AuditLogUserUpdatedChangesRequested
genAuditLogUserUpdatedChangesRequested n =
  AuditLogUserUpdatedChangesRequested
    <$> arbitraryReducedMaybe n -- auditLogUserUpdatedChangesRequestedRole :: Maybe Text
  
instance Arbitrary AutoChunkingStrategy where
  arbitrary = sized genAutoChunkingStrategy

genAutoChunkingStrategy :: Int -> Gen AutoChunkingStrategy
genAutoChunkingStrategy n =
  AutoChunkingStrategy
    <$> arbitrary -- autoChunkingStrategyType :: E'OneOf0
  
instance Arbitrary AutoChunkingStrategyRequestParam where
  arbitrary = sized genAutoChunkingStrategyRequestParam

genAutoChunkingStrategyRequestParam :: Int -> Gen AutoChunkingStrategyRequestParam
genAutoChunkingStrategyRequestParam n =
  AutoChunkingStrategyRequestParam
    <$> arbitrary -- autoChunkingStrategyRequestParamType :: E'OneOf0
  
instance Arbitrary Batch where
  arbitrary = sized genBatch

genBatch :: Int -> Gen Batch
genBatch n =
  Batch
    <$> arbitrary -- batchId :: Text
    <*> arbitrary -- batchObject :: E'Object2
    <*> arbitrary -- batchEndpoint :: Text
    <*> arbitraryReducedMaybe n -- batchErrors :: Maybe BatchErrors
    <*> arbitrary -- batchInputFileId :: Text
    <*> arbitrary -- batchCompletionWindow :: Text
    <*> arbitrary -- batchStatus :: E'Status
    <*> arbitraryReducedMaybe n -- batchOutputFileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchErrorFileId :: Maybe Text
    <*> arbitrary -- batchCreatedAt :: Int
    <*> arbitraryReducedMaybe n -- batchInProgressAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchExpiresAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchFinalizingAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchCompletedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchFailedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchExpiredAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchCancellingAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchCancelledAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchRequestCounts :: Maybe BatchRequestCounts
    <*> arbitraryReducedMaybeValue n -- batchMetadata :: Maybe A.Value
  
instance Arbitrary BatchErrors where
  arbitrary = sized genBatchErrors

genBatchErrors :: Int -> Gen BatchErrors
genBatchErrors n =
  BatchErrors
    <$> arbitraryReducedMaybe n -- batchErrorsObject :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchErrorsData :: Maybe [BatchErrorsDataInner]
  
instance Arbitrary BatchErrorsDataInner where
  arbitrary = sized genBatchErrorsDataInner

genBatchErrorsDataInner :: Int -> Gen BatchErrorsDataInner
genBatchErrorsDataInner n =
  BatchErrorsDataInner
    <$> arbitraryReducedMaybe n -- batchErrorsDataInnerCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchErrorsDataInnerMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchErrorsDataInnerParam :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchErrorsDataInnerLine :: Maybe Int
  
instance Arbitrary BatchRequestCounts where
  arbitrary = sized genBatchRequestCounts

genBatchRequestCounts :: Int -> Gen BatchRequestCounts
genBatchRequestCounts n =
  BatchRequestCounts
    <$> arbitrary -- batchRequestCountsTotal :: Int
    <*> arbitrary -- batchRequestCountsCompleted :: Int
    <*> arbitrary -- batchRequestCountsFailed :: Int
  
instance Arbitrary BatchRequestInput where
  arbitrary = sized genBatchRequestInput

genBatchRequestInput :: Int -> Gen BatchRequestInput
genBatchRequestInput n =
  BatchRequestInput
    <$> arbitraryReducedMaybe n -- batchRequestInputCustomId :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchRequestInputMethod :: Maybe E'Method
    <*> arbitraryReducedMaybe n -- batchRequestInputUrl :: Maybe Text
  
instance Arbitrary BatchRequestOutput where
  arbitrary = sized genBatchRequestOutput

genBatchRequestOutput :: Int -> Gen BatchRequestOutput
genBatchRequestOutput n =
  BatchRequestOutput
    <$> arbitraryReducedMaybe n -- batchRequestOutputId :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchRequestOutputCustomId :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchRequestOutputResponse :: Maybe BatchRequestOutputResponse
    <*> arbitraryReducedMaybe n -- batchRequestOutputError :: Maybe BatchRequestOutputError
  
instance Arbitrary BatchRequestOutputError where
  arbitrary = sized genBatchRequestOutputError

genBatchRequestOutputError :: Int -> Gen BatchRequestOutputError
genBatchRequestOutputError n =
  BatchRequestOutputError
    <$> arbitraryReducedMaybe n -- batchRequestOutputErrorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- batchRequestOutputErrorMessage :: Maybe Text
  
instance Arbitrary BatchRequestOutputResponse where
  arbitrary = sized genBatchRequestOutputResponse

genBatchRequestOutputResponse :: Int -> Gen BatchRequestOutputResponse
genBatchRequestOutputResponse n =
  BatchRequestOutputResponse
    <$> arbitraryReducedMaybe n -- batchRequestOutputResponseStatusCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- batchRequestOutputResponseRequestId :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- batchRequestOutputResponseBody :: Maybe A.Value
  
instance Arbitrary ChatCompletionFunctionCallOption where
  arbitrary = sized genChatCompletionFunctionCallOption

genChatCompletionFunctionCallOption :: Int -> Gen ChatCompletionFunctionCallOption
genChatCompletionFunctionCallOption n =
  ChatCompletionFunctionCallOption
    <$> arbitrary -- chatCompletionFunctionCallOptionName :: Text
  
instance Arbitrary ChatCompletionFunctions where
  arbitrary = sized genChatCompletionFunctions

genChatCompletionFunctions :: Int -> Gen ChatCompletionFunctions
genChatCompletionFunctions n =
  ChatCompletionFunctions
    <$> arbitraryReducedMaybe n -- chatCompletionFunctionsDescription :: Maybe Text
    <*> arbitrary -- chatCompletionFunctionsName :: Text
    <*> arbitraryReducedMaybe n -- chatCompletionFunctionsParameters :: Maybe (Map.Map String AnyType)
  
instance Arbitrary ChatCompletionMessageToolCall where
  arbitrary = sized genChatCompletionMessageToolCall

genChatCompletionMessageToolCall :: Int -> Gen ChatCompletionMessageToolCall
genChatCompletionMessageToolCall n =
  ChatCompletionMessageToolCall
    <$> arbitrary -- chatCompletionMessageToolCallId :: Text
    <*> arbitrary -- chatCompletionMessageToolCallType :: E'Type3
    <*> arbitraryReduced n -- chatCompletionMessageToolCallFunction :: ChatCompletionMessageToolCallFunction
  
instance Arbitrary ChatCompletionMessageToolCallChunk where
  arbitrary = sized genChatCompletionMessageToolCallChunk

genChatCompletionMessageToolCallChunk :: Int -> Gen ChatCompletionMessageToolCallChunk
genChatCompletionMessageToolCallChunk n =
  ChatCompletionMessageToolCallChunk
    <$> arbitrary -- chatCompletionMessageToolCallChunkIndex :: Int
    <*> arbitraryReducedMaybe n -- chatCompletionMessageToolCallChunkId :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionMessageToolCallChunkType :: Maybe E'Type3
    <*> arbitraryReducedMaybe n -- chatCompletionMessageToolCallChunkFunction :: Maybe ChatCompletionMessageToolCallChunkFunction
  
instance Arbitrary ChatCompletionMessageToolCallChunkFunction where
  arbitrary = sized genChatCompletionMessageToolCallChunkFunction

genChatCompletionMessageToolCallChunkFunction :: Int -> Gen ChatCompletionMessageToolCallChunkFunction
genChatCompletionMessageToolCallChunkFunction n =
  ChatCompletionMessageToolCallChunkFunction
    <$> arbitraryReducedMaybe n -- chatCompletionMessageToolCallChunkFunctionName :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionMessageToolCallChunkFunctionArguments :: Maybe Text
  
instance Arbitrary ChatCompletionMessageToolCallFunction where
  arbitrary = sized genChatCompletionMessageToolCallFunction

genChatCompletionMessageToolCallFunction :: Int -> Gen ChatCompletionMessageToolCallFunction
genChatCompletionMessageToolCallFunction n =
  ChatCompletionMessageToolCallFunction
    <$> arbitrary -- chatCompletionMessageToolCallFunctionName :: Text
    <*> arbitrary -- chatCompletionMessageToolCallFunctionArguments :: Text
  
instance Arbitrary ChatCompletionNamedToolChoice where
  arbitrary = sized genChatCompletionNamedToolChoice

genChatCompletionNamedToolChoice :: Int -> Gen ChatCompletionNamedToolChoice
genChatCompletionNamedToolChoice n =
  ChatCompletionNamedToolChoice
    <$> arbitrary -- chatCompletionNamedToolChoiceType :: E'Type3
    <*> arbitraryReduced n -- chatCompletionNamedToolChoiceFunction :: AssistantsNamedToolChoiceFunction
  
instance Arbitrary ChatCompletionRequestAssistantMessage where
  arbitrary = sized genChatCompletionRequestAssistantMessage

genChatCompletionRequestAssistantMessage :: Int -> Gen ChatCompletionRequestAssistantMessage
genChatCompletionRequestAssistantMessage n =
  ChatCompletionRequestAssistantMessage
    <$> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageContent :: Maybe ChatCompletionRequestAssistantMessageContent
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageRefusal :: Maybe Text
    <*> arbitrary -- chatCompletionRequestAssistantMessageRole :: E'Object
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageName :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageAudio :: Maybe ChatCompletionRequestAssistantMessageAudio
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
  
instance Arbitrary ChatCompletionRequestAssistantMessageAudio where
  arbitrary = sized genChatCompletionRequestAssistantMessageAudio

genChatCompletionRequestAssistantMessageAudio :: Int -> Gen ChatCompletionRequestAssistantMessageAudio
genChatCompletionRequestAssistantMessageAudio n =
  ChatCompletionRequestAssistantMessageAudio
    <$> arbitrary -- chatCompletionRequestAssistantMessageAudioId :: Text
  
instance Arbitrary ChatCompletionRequestAssistantMessageContent where
  arbitrary = sized genChatCompletionRequestAssistantMessageContent

genChatCompletionRequestAssistantMessageContent :: Int -> Gen ChatCompletionRequestAssistantMessageContent
genChatCompletionRequestAssistantMessageContent n =
  
  pure ChatCompletionRequestAssistantMessageContent
   
instance Arbitrary ChatCompletionRequestAssistantMessageContentPart where
  arbitrary = sized genChatCompletionRequestAssistantMessageContentPart

genChatCompletionRequestAssistantMessageContentPart :: Int -> Gen ChatCompletionRequestAssistantMessageContentPart
genChatCompletionRequestAssistantMessageContentPart n =
  ChatCompletionRequestAssistantMessageContentPart
    <$> arbitrary -- chatCompletionRequestAssistantMessageContentPartType :: E'Type8
    <*> arbitrary -- chatCompletionRequestAssistantMessageContentPartText :: Text
    <*> arbitrary -- chatCompletionRequestAssistantMessageContentPartRefusal :: Text
  
instance Arbitrary ChatCompletionRequestAssistantMessageFunctionCall where
  arbitrary = sized genChatCompletionRequestAssistantMessageFunctionCall

genChatCompletionRequestAssistantMessageFunctionCall :: Int -> Gen ChatCompletionRequestAssistantMessageFunctionCall
genChatCompletionRequestAssistantMessageFunctionCall n =
  ChatCompletionRequestAssistantMessageFunctionCall
    <$> arbitrary -- chatCompletionRequestAssistantMessageFunctionCallArguments :: Text
    <*> arbitrary -- chatCompletionRequestAssistantMessageFunctionCallName :: Text
  
instance Arbitrary ChatCompletionRequestDeveloperMessage where
  arbitrary = sized genChatCompletionRequestDeveloperMessage

genChatCompletionRequestDeveloperMessage :: Int -> Gen ChatCompletionRequestDeveloperMessage
genChatCompletionRequestDeveloperMessage n =
  ChatCompletionRequestDeveloperMessage
    <$> arbitraryReduced n -- chatCompletionRequestDeveloperMessageContent :: ChatCompletionRequestDeveloperMessageContent
    <*> arbitrary -- chatCompletionRequestDeveloperMessageRole :: E'Role
    <*> arbitraryReducedMaybe n -- chatCompletionRequestDeveloperMessageName :: Maybe Text
  
instance Arbitrary ChatCompletionRequestDeveloperMessageContent where
  arbitrary = sized genChatCompletionRequestDeveloperMessageContent

genChatCompletionRequestDeveloperMessageContent :: Int -> Gen ChatCompletionRequestDeveloperMessageContent
genChatCompletionRequestDeveloperMessageContent n =
  
  pure ChatCompletionRequestDeveloperMessageContent
   
instance Arbitrary ChatCompletionRequestFunctionMessage where
  arbitrary = sized genChatCompletionRequestFunctionMessage

genChatCompletionRequestFunctionMessage :: Int -> Gen ChatCompletionRequestFunctionMessage
genChatCompletionRequestFunctionMessage n =
  ChatCompletionRequestFunctionMessage
    <$> arbitrary -- chatCompletionRequestFunctionMessageRole :: E'Type3
    <*> arbitrary -- chatCompletionRequestFunctionMessageContent :: Text
    <*> arbitrary -- chatCompletionRequestFunctionMessageName :: Text
  
instance Arbitrary ChatCompletionRequestMessage where
  arbitrary = sized genChatCompletionRequestMessage

genChatCompletionRequestMessage :: Int -> Gen ChatCompletionRequestMessage
genChatCompletionRequestMessage n =
  ChatCompletionRequestMessage
    <$> arbitrary -- chatCompletionRequestMessageContent :: Text
    <*> arbitrary -- chatCompletionRequestMessageRole :: E'Type3
    <*> arbitrary -- chatCompletionRequestMessageName :: Text
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageRefusal :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageAudio :: Maybe ChatCompletionRequestAssistantMessageAudio
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
    <*> arbitrary -- chatCompletionRequestMessageToolCallId :: Text
  
instance Arbitrary ChatCompletionRequestMessageContentPartAudio where
  arbitrary = sized genChatCompletionRequestMessageContentPartAudio

genChatCompletionRequestMessageContentPartAudio :: Int -> Gen ChatCompletionRequestMessageContentPartAudio
genChatCompletionRequestMessageContentPartAudio n =
  ChatCompletionRequestMessageContentPartAudio
    <$> arbitrary -- chatCompletionRequestMessageContentPartAudioType :: E'Type9
    <*> arbitraryReduced n -- chatCompletionRequestMessageContentPartAudioInputAudio :: ChatCompletionRequestMessageContentPartAudioInputAudio
  
instance Arbitrary ChatCompletionRequestMessageContentPartAudioInputAudio where
  arbitrary = sized genChatCompletionRequestMessageContentPartAudioInputAudio

genChatCompletionRequestMessageContentPartAudioInputAudio :: Int -> Gen ChatCompletionRequestMessageContentPartAudioInputAudio
genChatCompletionRequestMessageContentPartAudioInputAudio n =
  ChatCompletionRequestMessageContentPartAudioInputAudio
    <$> arbitrary -- chatCompletionRequestMessageContentPartAudioInputAudioData :: Text
    <*> arbitrary -- chatCompletionRequestMessageContentPartAudioInputAudioFormat :: E'Format
  
instance Arbitrary ChatCompletionRequestMessageContentPartImage where
  arbitrary = sized genChatCompletionRequestMessageContentPartImage

genChatCompletionRequestMessageContentPartImage :: Int -> Gen ChatCompletionRequestMessageContentPartImage
genChatCompletionRequestMessageContentPartImage n =
  ChatCompletionRequestMessageContentPartImage
    <$> arbitrary -- chatCompletionRequestMessageContentPartImageType :: E'Type10
    <*> arbitraryReduced n -- chatCompletionRequestMessageContentPartImageImageUrl :: ChatCompletionRequestMessageContentPartImageImageUrl
  
instance Arbitrary ChatCompletionRequestMessageContentPartImageImageUrl where
  arbitrary = sized genChatCompletionRequestMessageContentPartImageImageUrl

genChatCompletionRequestMessageContentPartImageImageUrl :: Int -> Gen ChatCompletionRequestMessageContentPartImageImageUrl
genChatCompletionRequestMessageContentPartImageImageUrl n =
  ChatCompletionRequestMessageContentPartImageImageUrl
    <$> arbitrary -- chatCompletionRequestMessageContentPartImageImageUrlUrl :: Text
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageContentPartImageImageUrlDetail :: Maybe E'Detail
  
instance Arbitrary ChatCompletionRequestMessageContentPartRefusal where
  arbitrary = sized genChatCompletionRequestMessageContentPartRefusal

genChatCompletionRequestMessageContentPartRefusal :: Int -> Gen ChatCompletionRequestMessageContentPartRefusal
genChatCompletionRequestMessageContentPartRefusal n =
  ChatCompletionRequestMessageContentPartRefusal
    <$> arbitrary -- chatCompletionRequestMessageContentPartRefusalType :: E'Type11
    <*> arbitrary -- chatCompletionRequestMessageContentPartRefusalRefusal :: Text
  
instance Arbitrary ChatCompletionRequestMessageContentPartText where
  arbitrary = sized genChatCompletionRequestMessageContentPartText

genChatCompletionRequestMessageContentPartText :: Int -> Gen ChatCompletionRequestMessageContentPartText
genChatCompletionRequestMessageContentPartText n =
  ChatCompletionRequestMessageContentPartText
    <$> arbitrary -- chatCompletionRequestMessageContentPartTextType :: E'Type12
    <*> arbitrary -- chatCompletionRequestMessageContentPartTextText :: Text
  
instance Arbitrary ChatCompletionRequestSystemMessage where
  arbitrary = sized genChatCompletionRequestSystemMessage

genChatCompletionRequestSystemMessage :: Int -> Gen ChatCompletionRequestSystemMessage
genChatCompletionRequestSystemMessage n =
  ChatCompletionRequestSystemMessage
    <$> arbitraryReduced n -- chatCompletionRequestSystemMessageContent :: ChatCompletionRequestSystemMessageContent
    <*> arbitrary -- chatCompletionRequestSystemMessageRole :: E'Role2
    <*> arbitraryReducedMaybe n -- chatCompletionRequestSystemMessageName :: Maybe Text
  
instance Arbitrary ChatCompletionRequestSystemMessageContent where
  arbitrary = sized genChatCompletionRequestSystemMessageContent

genChatCompletionRequestSystemMessageContent :: Int -> Gen ChatCompletionRequestSystemMessageContent
genChatCompletionRequestSystemMessageContent n =
  
  pure ChatCompletionRequestSystemMessageContent
   
instance Arbitrary ChatCompletionRequestToolMessage where
  arbitrary = sized genChatCompletionRequestToolMessage

genChatCompletionRequestToolMessage :: Int -> Gen ChatCompletionRequestToolMessage
genChatCompletionRequestToolMessage n =
  ChatCompletionRequestToolMessage
    <$> arbitrary -- chatCompletionRequestToolMessageRole :: E'Role3
    <*> arbitraryReduced n -- chatCompletionRequestToolMessageContent :: ChatCompletionRequestToolMessageContent
    <*> arbitrary -- chatCompletionRequestToolMessageToolCallId :: Text
  
instance Arbitrary ChatCompletionRequestToolMessageContent where
  arbitrary = sized genChatCompletionRequestToolMessageContent

genChatCompletionRequestToolMessageContent :: Int -> Gen ChatCompletionRequestToolMessageContent
genChatCompletionRequestToolMessageContent n =
  
  pure ChatCompletionRequestToolMessageContent
   
instance Arbitrary ChatCompletionRequestUserMessage where
  arbitrary = sized genChatCompletionRequestUserMessage

genChatCompletionRequestUserMessage :: Int -> Gen ChatCompletionRequestUserMessage
genChatCompletionRequestUserMessage n =
  ChatCompletionRequestUserMessage
    <$> arbitraryReduced n -- chatCompletionRequestUserMessageContent :: ChatCompletionRequestUserMessageContent
    <*> arbitrary -- chatCompletionRequestUserMessageRole :: E'Role4
    <*> arbitraryReducedMaybe n -- chatCompletionRequestUserMessageName :: Maybe Text
  
instance Arbitrary ChatCompletionRequestUserMessageContent where
  arbitrary = sized genChatCompletionRequestUserMessageContent

genChatCompletionRequestUserMessageContent :: Int -> Gen ChatCompletionRequestUserMessageContent
genChatCompletionRequestUserMessageContent n =
  
  pure ChatCompletionRequestUserMessageContent
   
instance Arbitrary ChatCompletionRequestUserMessageContentPart where
  arbitrary = sized genChatCompletionRequestUserMessageContentPart

genChatCompletionRequestUserMessageContentPart :: Int -> Gen ChatCompletionRequestUserMessageContentPart
genChatCompletionRequestUserMessageContentPart n =
  ChatCompletionRequestUserMessageContentPart
    <$> arbitrary -- chatCompletionRequestUserMessageContentPartType :: E'Type13
    <*> arbitrary -- chatCompletionRequestUserMessageContentPartText :: Text
    <*> arbitraryReduced n -- chatCompletionRequestUserMessageContentPartImageUrl :: ChatCompletionRequestMessageContentPartImageImageUrl
    <*> arbitraryReduced n -- chatCompletionRequestUserMessageContentPartInputAudio :: ChatCompletionRequestMessageContentPartAudioInputAudio
  
instance Arbitrary ChatCompletionResponseMessage where
  arbitrary = sized genChatCompletionResponseMessage

genChatCompletionResponseMessage :: Int -> Gen ChatCompletionResponseMessage
genChatCompletionResponseMessage n =
  ChatCompletionResponseMessage
    <$> arbitrary -- chatCompletionResponseMessageContent :: Text
    <*> arbitrary -- chatCompletionResponseMessageRefusal :: Text
    <*> arbitraryReducedMaybe n -- chatCompletionResponseMessageToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitrary -- chatCompletionResponseMessageRole :: E'Object
    <*> arbitraryReducedMaybe n -- chatCompletionResponseMessageFunctionCall :: Maybe ChatCompletionResponseMessageFunctionCall
    <*> arbitraryReducedMaybe n -- chatCompletionResponseMessageAudio :: Maybe ChatCompletionResponseMessageAudio
  
instance Arbitrary ChatCompletionResponseMessageAudio where
  arbitrary = sized genChatCompletionResponseMessageAudio

genChatCompletionResponseMessageAudio :: Int -> Gen ChatCompletionResponseMessageAudio
genChatCompletionResponseMessageAudio n =
  ChatCompletionResponseMessageAudio
    <$> arbitrary -- chatCompletionResponseMessageAudioId :: Text
    <*> arbitrary -- chatCompletionResponseMessageAudioExpiresAt :: Int
    <*> arbitrary -- chatCompletionResponseMessageAudioData :: Text
    <*> arbitrary -- chatCompletionResponseMessageAudioTranscript :: Text
  
instance Arbitrary ChatCompletionResponseMessageFunctionCall where
  arbitrary = sized genChatCompletionResponseMessageFunctionCall

genChatCompletionResponseMessageFunctionCall :: Int -> Gen ChatCompletionResponseMessageFunctionCall
genChatCompletionResponseMessageFunctionCall n =
  ChatCompletionResponseMessageFunctionCall
    <$> arbitrary -- chatCompletionResponseMessageFunctionCallArguments :: Text
    <*> arbitrary -- chatCompletionResponseMessageFunctionCallName :: Text
  
instance Arbitrary ChatCompletionStreamOptions where
  arbitrary = sized genChatCompletionStreamOptions

genChatCompletionStreamOptions :: Int -> Gen ChatCompletionStreamOptions
genChatCompletionStreamOptions n =
  ChatCompletionStreamOptions
    <$> arbitraryReducedMaybe n -- chatCompletionStreamOptionsIncludeUsage :: Maybe Bool
  
instance Arbitrary ChatCompletionStreamResponseDelta where
  arbitrary = sized genChatCompletionStreamResponseDelta

genChatCompletionStreamResponseDelta :: Int -> Gen ChatCompletionStreamResponseDelta
genChatCompletionStreamResponseDelta n =
  ChatCompletionStreamResponseDelta
    <$> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaContent :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaFunctionCall :: Maybe ChatCompletionStreamResponseDeltaFunctionCall
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaToolCalls :: Maybe [ChatCompletionMessageToolCallChunk]
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaRole :: Maybe E'Role5
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaRefusal :: Maybe Text
  
instance Arbitrary ChatCompletionStreamResponseDeltaFunctionCall where
  arbitrary = sized genChatCompletionStreamResponseDeltaFunctionCall

genChatCompletionStreamResponseDeltaFunctionCall :: Int -> Gen ChatCompletionStreamResponseDeltaFunctionCall
genChatCompletionStreamResponseDeltaFunctionCall n =
  ChatCompletionStreamResponseDeltaFunctionCall
    <$> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaFunctionCallArguments :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaFunctionCallName :: Maybe Text
  
instance Arbitrary ChatCompletionTokenLogprob where
  arbitrary = sized genChatCompletionTokenLogprob

genChatCompletionTokenLogprob :: Int -> Gen ChatCompletionTokenLogprob
genChatCompletionTokenLogprob n =
  ChatCompletionTokenLogprob
    <$> arbitrary -- chatCompletionTokenLogprobToken :: Text
    <*> arbitrary -- chatCompletionTokenLogprobLogprob :: Double
    <*> arbitrary -- chatCompletionTokenLogprobBytes :: [Int]
    <*> arbitraryReduced n -- chatCompletionTokenLogprobTopLogprobs :: [ChatCompletionTokenLogprobTopLogprobsInner]
  
instance Arbitrary ChatCompletionTokenLogprobTopLogprobsInner where
  arbitrary = sized genChatCompletionTokenLogprobTopLogprobsInner

genChatCompletionTokenLogprobTopLogprobsInner :: Int -> Gen ChatCompletionTokenLogprobTopLogprobsInner
genChatCompletionTokenLogprobTopLogprobsInner n =
  ChatCompletionTokenLogprobTopLogprobsInner
    <$> arbitrary -- chatCompletionTokenLogprobTopLogprobsInnerToken :: Text
    <*> arbitrary -- chatCompletionTokenLogprobTopLogprobsInnerLogprob :: Double
    <*> arbitrary -- chatCompletionTokenLogprobTopLogprobsInnerBytes :: [Int]
  
instance Arbitrary ChatCompletionTool where
  arbitrary = sized genChatCompletionTool

genChatCompletionTool :: Int -> Gen ChatCompletionTool
genChatCompletionTool n =
  ChatCompletionTool
    <$> arbitrary -- chatCompletionToolType :: E'Type3
    <*> arbitraryReduced n -- chatCompletionToolFunction :: FunctionObject
  
instance Arbitrary ChatCompletionToolChoiceOption where
  arbitrary = sized genChatCompletionToolChoiceOption

genChatCompletionToolChoiceOption :: Int -> Gen ChatCompletionToolChoiceOption
genChatCompletionToolChoiceOption n =
  ChatCompletionToolChoiceOption
    <$> arbitrary -- chatCompletionToolChoiceOptionType :: E'Type3
    <*> arbitraryReduced n -- chatCompletionToolChoiceOptionFunction :: AssistantsNamedToolChoiceFunction
  
instance Arbitrary ChunkingStrategyRequestParam where
  arbitrary = sized genChunkingStrategyRequestParam

genChunkingStrategyRequestParam :: Int -> Gen ChunkingStrategyRequestParam
genChunkingStrategyRequestParam n =
  ChunkingStrategyRequestParam
    <$> arbitrary -- chunkingStrategyRequestParamType :: E'Type14
    <*> arbitraryReduced n -- chunkingStrategyRequestParamStatic :: StaticChunkingStrategy
  
instance Arbitrary CompleteUploadRequest where
  arbitrary = sized genCompleteUploadRequest

genCompleteUploadRequest :: Int -> Gen CompleteUploadRequest
genCompleteUploadRequest n =
  CompleteUploadRequest
    <$> arbitrary -- completeUploadRequestPartIds :: [Text]
    <*> arbitraryReducedMaybe n -- completeUploadRequestMd5 :: Maybe Text
  
instance Arbitrary CompletionUsage where
  arbitrary = sized genCompletionUsage

genCompletionUsage :: Int -> Gen CompletionUsage
genCompletionUsage n =
  CompletionUsage
    <$> arbitrary -- completionUsageCompletionTokens :: Int
    <*> arbitrary -- completionUsagePromptTokens :: Int
    <*> arbitrary -- completionUsageTotalTokens :: Int
    <*> arbitraryReducedMaybe n -- completionUsageCompletionTokensDetails :: Maybe CompletionUsageCompletionTokensDetails
    <*> arbitraryReducedMaybe n -- completionUsagePromptTokensDetails :: Maybe CompletionUsagePromptTokensDetails
  
instance Arbitrary CompletionUsageCompletionTokensDetails where
  arbitrary = sized genCompletionUsageCompletionTokensDetails

genCompletionUsageCompletionTokensDetails :: Int -> Gen CompletionUsageCompletionTokensDetails
genCompletionUsageCompletionTokensDetails n =
  CompletionUsageCompletionTokensDetails
    <$> arbitraryReducedMaybe n -- completionUsageCompletionTokensDetailsAcceptedPredictionTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- completionUsageCompletionTokensDetailsAudioTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- completionUsageCompletionTokensDetailsReasoningTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- completionUsageCompletionTokensDetailsRejectedPredictionTokens :: Maybe Int
  
instance Arbitrary CompletionUsagePromptTokensDetails where
  arbitrary = sized genCompletionUsagePromptTokensDetails

genCompletionUsagePromptTokensDetails :: Int -> Gen CompletionUsagePromptTokensDetails
genCompletionUsagePromptTokensDetails n =
  CompletionUsagePromptTokensDetails
    <$> arbitraryReducedMaybe n -- completionUsagePromptTokensDetailsAudioTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- completionUsagePromptTokensDetailsCachedTokens :: Maybe Int
  
instance Arbitrary CostsResult where
  arbitrary = sized genCostsResult

genCostsResult :: Int -> Gen CostsResult
genCostsResult n =
  CostsResult
    <$> arbitrary -- costsResultObject :: E'Object3
    <*> arbitraryReducedMaybe n -- costsResultAmount :: Maybe CostsResultAmount
    <*> arbitraryReducedMaybe n -- costsResultLineItem :: Maybe Text
    <*> arbitraryReducedMaybe n -- costsResultProjectId :: Maybe Text
  
instance Arbitrary CostsResultAmount where
  arbitrary = sized genCostsResultAmount

genCostsResultAmount :: Int -> Gen CostsResultAmount
genCostsResultAmount n =
  CostsResultAmount
    <$> arbitraryReducedMaybe n -- costsResultAmountValue :: Maybe Double
    <*> arbitraryReducedMaybe n -- costsResultAmountCurrency :: Maybe Text
  
instance Arbitrary CreateAssistantRequest where
  arbitrary = sized genCreateAssistantRequest

genCreateAssistantRequest :: Int -> Gen CreateAssistantRequest
genCreateAssistantRequest n =
  CreateAssistantRequest
    <$> arbitraryReduced n -- createAssistantRequestModel :: CreateAssistantRequestModel
    <*> arbitraryReducedMaybe n -- createAssistantRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- createAssistantRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- createAssistantRequestInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- createAssistantRequestTools :: Maybe [AssistantObjectToolsInner]
    <*> arbitraryReducedMaybe n -- createAssistantRequestToolResources :: Maybe CreateAssistantRequestToolResources
    <*> arbitraryReducedMaybeValue n -- createAssistantRequestMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- createAssistantRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- createAssistantRequestTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- createAssistantRequestResponseFormat :: Maybe AssistantsApiResponseFormatOption
  
instance Arbitrary CreateAssistantRequestModel where
  arbitrary = sized genCreateAssistantRequestModel

genCreateAssistantRequestModel :: Int -> Gen CreateAssistantRequestModel
genCreateAssistantRequestModel n =
  
  pure CreateAssistantRequestModel
   
instance Arbitrary CreateAssistantRequestToolResources where
  arbitrary = sized genCreateAssistantRequestToolResources

genCreateAssistantRequestToolResources :: Int -> Gen CreateAssistantRequestToolResources
genCreateAssistantRequestToolResources n =
  CreateAssistantRequestToolResources
    <$> arbitraryReducedMaybe n -- createAssistantRequestToolResourcesCodeInterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter
    <*> arbitraryReducedMaybe n -- createAssistantRequestToolResourcesFileSearch :: Maybe CreateAssistantRequestToolResourcesFileSearch
  
instance Arbitrary CreateAssistantRequestToolResourcesCodeInterpreter where
  arbitrary = sized genCreateAssistantRequestToolResourcesCodeInterpreter

genCreateAssistantRequestToolResourcesCodeInterpreter :: Int -> Gen CreateAssistantRequestToolResourcesCodeInterpreter
genCreateAssistantRequestToolResourcesCodeInterpreter n =
  CreateAssistantRequestToolResourcesCodeInterpreter
    <$> arbitraryReducedMaybe n -- createAssistantRequestToolResourcesCodeInterpreterFileIds :: Maybe [Text]
  
instance Arbitrary CreateAssistantRequestToolResourcesFileSearch where
  arbitrary = sized genCreateAssistantRequestToolResourcesFileSearch

genCreateAssistantRequestToolResourcesFileSearch :: Int -> Gen CreateAssistantRequestToolResourcesFileSearch
genCreateAssistantRequestToolResourcesFileSearch n =
  CreateAssistantRequestToolResourcesFileSearch
    <$> arbitraryReducedMaybe n -- createAssistantRequestToolResourcesFileSearchVectorStoreIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- createAssistantRequestToolResourcesFileSearchVectorStores :: Maybe [CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]
  
instance Arbitrary CreateAssistantRequestToolResourcesFileSearchVectorStoresInner where
  arbitrary = sized genCreateAssistantRequestToolResourcesFileSearchVectorStoresInner

genCreateAssistantRequestToolResourcesFileSearchVectorStoresInner :: Int -> Gen CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
genCreateAssistantRequestToolResourcesFileSearchVectorStoresInner n =
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
    <$> arbitraryReducedMaybe n -- createAssistantRequestToolResourcesFileSearchVectorStoresInnerFileIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy :: Maybe CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
    <*> arbitraryReducedMaybeValue n -- createAssistantRequestToolResourcesFileSearchVectorStoresInnerMetadata :: Maybe A.Value
  
instance Arbitrary CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy where
  arbitrary = sized genCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

genCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy :: Int -> Gen CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
genCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy n =
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
    <$> arbitrary -- createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyType :: E'Type14
    <*> arbitraryReduced n -- createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyStatic :: StaticChunkingStrategyStatic
  
instance Arbitrary CreateBatchRequest where
  arbitrary = sized genCreateBatchRequest

genCreateBatchRequest :: Int -> Gen CreateBatchRequest
genCreateBatchRequest n =
  CreateBatchRequest
    <$> arbitrary -- createBatchRequestInputFileId :: Text
    <*> arbitrary -- createBatchRequestEndpoint :: E'Endpoint
    <*> arbitrary -- createBatchRequestCompletionWindow :: E'CompletionWindow
    <*> arbitraryReducedMaybe n -- createBatchRequestMetadata :: Maybe (Map.Map String Text)
  
instance Arbitrary CreateChatCompletionFunctionResponse where
  arbitrary = sized genCreateChatCompletionFunctionResponse

genCreateChatCompletionFunctionResponse :: Int -> Gen CreateChatCompletionFunctionResponse
genCreateChatCompletionFunctionResponse n =
  CreateChatCompletionFunctionResponse
    <$> arbitrary -- createChatCompletionFunctionResponseId :: Text
    <*> arbitraryReduced n -- createChatCompletionFunctionResponseChoices :: [CreateChatCompletionFunctionResponseChoicesInner]
    <*> arbitrary -- createChatCompletionFunctionResponseCreated :: Int
    <*> arbitrary -- createChatCompletionFunctionResponseModel :: Text
    <*> arbitraryReducedMaybe n -- createChatCompletionFunctionResponseSystemFingerprint :: Maybe Text
    <*> arbitrary -- createChatCompletionFunctionResponseObject :: E'Object4
    <*> arbitraryReducedMaybe n -- createChatCompletionFunctionResponseUsage :: Maybe CompletionUsage
  
instance Arbitrary CreateChatCompletionFunctionResponseChoicesInner where
  arbitrary = sized genCreateChatCompletionFunctionResponseChoicesInner

genCreateChatCompletionFunctionResponseChoicesInner :: Int -> Gen CreateChatCompletionFunctionResponseChoicesInner
genCreateChatCompletionFunctionResponseChoicesInner n =
  CreateChatCompletionFunctionResponseChoicesInner
    <$> arbitrary -- createChatCompletionFunctionResponseChoicesInnerFinishReason :: E'FinishReason
    <*> arbitrary -- createChatCompletionFunctionResponseChoicesInnerIndex :: Int
    <*> arbitraryReduced n -- createChatCompletionFunctionResponseChoicesInnerMessage :: ChatCompletionResponseMessage
  
instance Arbitrary CreateChatCompletionRequest where
  arbitrary = sized genCreateChatCompletionRequest

genCreateChatCompletionRequest :: Int -> Gen CreateChatCompletionRequest
genCreateChatCompletionRequest n =
  CreateChatCompletionRequest
    <$> arbitraryReduced n -- createChatCompletionRequestMessages :: [ChatCompletionRequestMessage]
    <*> arbitraryReduced n -- createChatCompletionRequestModel :: CreateChatCompletionRequestModel
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestStore :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestReasoningEffort :: Maybe E'ReasoningEffort
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestMetadata :: Maybe (Map.Map String Text)
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestFrequencyPenalty :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestLogitBias :: Maybe (Map.Map String Int)
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestLogprobs :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTopLogprobs :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestMaxTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestMaxCompletionTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestN :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestModalities :: Maybe [E'Modalities]
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestPrediction :: Maybe PredictionContent
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestAudio :: Maybe CreateChatCompletionRequestAudio
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestPresencePenalty :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestResponseFormat :: Maybe CreateChatCompletionRequestResponseFormat
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestSeed :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestServiceTier :: Maybe E'ServiceTier
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestStop :: Maybe CreateChatCompletionRequestStop
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestStream :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestStreamOptions :: Maybe ChatCompletionStreamOptions
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTools :: Maybe [ChatCompletionTool]
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestToolChoice :: Maybe ChatCompletionToolChoiceOption
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestParallelToolCalls :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestUser :: Maybe Text
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestFunctionCall :: Maybe CreateChatCompletionRequestFunctionCall
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestFunctions :: Maybe [ChatCompletionFunctions]
  
instance Arbitrary CreateChatCompletionRequestAudio where
  arbitrary = sized genCreateChatCompletionRequestAudio

genCreateChatCompletionRequestAudio :: Int -> Gen CreateChatCompletionRequestAudio
genCreateChatCompletionRequestAudio n =
  CreateChatCompletionRequestAudio
    <$> arbitrary -- createChatCompletionRequestAudioVoice :: E'Voice2
    <*> arbitrary -- createChatCompletionRequestAudioFormat :: E'Format2
  
instance Arbitrary CreateChatCompletionRequestFunctionCall where
  arbitrary = sized genCreateChatCompletionRequestFunctionCall

genCreateChatCompletionRequestFunctionCall :: Int -> Gen CreateChatCompletionRequestFunctionCall
genCreateChatCompletionRequestFunctionCall n =
  CreateChatCompletionRequestFunctionCall
    <$> arbitrary -- createChatCompletionRequestFunctionCallName :: Text
  
instance Arbitrary CreateChatCompletionRequestModel where
  arbitrary = sized genCreateChatCompletionRequestModel

genCreateChatCompletionRequestModel :: Int -> Gen CreateChatCompletionRequestModel
genCreateChatCompletionRequestModel n =
  
  pure CreateChatCompletionRequestModel
   
instance Arbitrary CreateChatCompletionRequestResponseFormat where
  arbitrary = sized genCreateChatCompletionRequestResponseFormat

genCreateChatCompletionRequestResponseFormat :: Int -> Gen CreateChatCompletionRequestResponseFormat
genCreateChatCompletionRequestResponseFormat n =
  CreateChatCompletionRequestResponseFormat
    <$> arbitrary -- createChatCompletionRequestResponseFormatType :: E'Type4
    <*> arbitraryReduced n -- createChatCompletionRequestResponseFormatJsonSchema :: ResponseFormatJsonSchemaJsonSchema
  
instance Arbitrary CreateChatCompletionRequestStop where
  arbitrary = sized genCreateChatCompletionRequestStop

genCreateChatCompletionRequestStop :: Int -> Gen CreateChatCompletionRequestStop
genCreateChatCompletionRequestStop n =
  
  pure CreateChatCompletionRequestStop
   
instance Arbitrary CreateChatCompletionResponse where
  arbitrary = sized genCreateChatCompletionResponse

genCreateChatCompletionResponse :: Int -> Gen CreateChatCompletionResponse
genCreateChatCompletionResponse n =
  CreateChatCompletionResponse
    <$> arbitrary -- createChatCompletionResponseId :: Text
    <*> arbitraryReduced n -- createChatCompletionResponseChoices :: [CreateChatCompletionResponseChoicesInner]
    <*> arbitrary -- createChatCompletionResponseCreated :: Int
    <*> arbitrary -- createChatCompletionResponseModel :: Text
    <*> arbitraryReducedMaybe n -- createChatCompletionResponseServiceTier :: Maybe E'ServiceTier2
    <*> arbitraryReducedMaybe n -- createChatCompletionResponseSystemFingerprint :: Maybe Text
    <*> arbitrary -- createChatCompletionResponseObject :: E'Object4
    <*> arbitraryReducedMaybe n -- createChatCompletionResponseUsage :: Maybe CompletionUsage
  
instance Arbitrary CreateChatCompletionResponseChoicesInner where
  arbitrary = sized genCreateChatCompletionResponseChoicesInner

genCreateChatCompletionResponseChoicesInner :: Int -> Gen CreateChatCompletionResponseChoicesInner
genCreateChatCompletionResponseChoicesInner n =
  CreateChatCompletionResponseChoicesInner
    <$> arbitrary -- createChatCompletionResponseChoicesInnerFinishReason :: E'FinishReason2
    <*> arbitrary -- createChatCompletionResponseChoicesInnerIndex :: Int
    <*> arbitraryReduced n -- createChatCompletionResponseChoicesInnerMessage :: ChatCompletionResponseMessage
    <*> arbitraryReduced n -- createChatCompletionResponseChoicesInnerLogprobs :: CreateChatCompletionResponseChoicesInnerLogprobs
  
instance Arbitrary CreateChatCompletionResponseChoicesInnerLogprobs where
  arbitrary = sized genCreateChatCompletionResponseChoicesInnerLogprobs

genCreateChatCompletionResponseChoicesInnerLogprobs :: Int -> Gen CreateChatCompletionResponseChoicesInnerLogprobs
genCreateChatCompletionResponseChoicesInnerLogprobs n =
  CreateChatCompletionResponseChoicesInnerLogprobs
    <$> arbitraryReduced n -- createChatCompletionResponseChoicesInnerLogprobsContent :: [ChatCompletionTokenLogprob]
    <*> arbitraryReduced n -- createChatCompletionResponseChoicesInnerLogprobsRefusal :: [ChatCompletionTokenLogprob]
  
instance Arbitrary CreateChatCompletionStreamResponse where
  arbitrary = sized genCreateChatCompletionStreamResponse

genCreateChatCompletionStreamResponse :: Int -> Gen CreateChatCompletionStreamResponse
genCreateChatCompletionStreamResponse n =
  CreateChatCompletionStreamResponse
    <$> arbitrary -- createChatCompletionStreamResponseId :: Text
    <*> arbitraryReduced n -- createChatCompletionStreamResponseChoices :: [CreateChatCompletionStreamResponseChoicesInner]
    <*> arbitrary -- createChatCompletionStreamResponseCreated :: Int
    <*> arbitrary -- createChatCompletionStreamResponseModel :: Text
    <*> arbitraryReducedMaybe n -- createChatCompletionStreamResponseServiceTier :: Maybe E'ServiceTier2
    <*> arbitraryReducedMaybe n -- createChatCompletionStreamResponseSystemFingerprint :: Maybe Text
    <*> arbitrary -- createChatCompletionStreamResponseObject :: E'Object5
    <*> arbitraryReducedMaybe n -- createChatCompletionStreamResponseUsage :: Maybe CreateChatCompletionStreamResponseUsage
  
instance Arbitrary CreateChatCompletionStreamResponseChoicesInner where
  arbitrary = sized genCreateChatCompletionStreamResponseChoicesInner

genCreateChatCompletionStreamResponseChoicesInner :: Int -> Gen CreateChatCompletionStreamResponseChoicesInner
genCreateChatCompletionStreamResponseChoicesInner n =
  CreateChatCompletionStreamResponseChoicesInner
    <$> arbitraryReduced n -- createChatCompletionStreamResponseChoicesInnerDelta :: ChatCompletionStreamResponseDelta
    <*> arbitraryReducedMaybe n -- createChatCompletionStreamResponseChoicesInnerLogprobs :: Maybe CreateChatCompletionResponseChoicesInnerLogprobs
    <*> arbitrary -- createChatCompletionStreamResponseChoicesInnerFinishReason :: E'FinishReason2
    <*> arbitrary -- createChatCompletionStreamResponseChoicesInnerIndex :: Int
  
instance Arbitrary CreateChatCompletionStreamResponseUsage where
  arbitrary = sized genCreateChatCompletionStreamResponseUsage

genCreateChatCompletionStreamResponseUsage :: Int -> Gen CreateChatCompletionStreamResponseUsage
genCreateChatCompletionStreamResponseUsage n =
  CreateChatCompletionStreamResponseUsage
    <$> arbitrary -- createChatCompletionStreamResponseUsageCompletionTokens :: Int
    <*> arbitrary -- createChatCompletionStreamResponseUsagePromptTokens :: Int
    <*> arbitrary -- createChatCompletionStreamResponseUsageTotalTokens :: Int
  
instance Arbitrary CreateCompletionRequest where
  arbitrary = sized genCreateCompletionRequest

genCreateCompletionRequest :: Int -> Gen CreateCompletionRequest
genCreateCompletionRequest n =
  CreateCompletionRequest
    <$> arbitraryReduced n -- createCompletionRequestModel :: CreateCompletionRequestModel
    <*> arbitraryReduced n -- createCompletionRequestPrompt :: CreateCompletionRequestPrompt
    <*> arbitraryReducedMaybe n -- createCompletionRequestBestOf :: Maybe Int
    <*> arbitraryReducedMaybe n -- createCompletionRequestEcho :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createCompletionRequestFrequencyPenalty :: Maybe Double
    <*> arbitraryReducedMaybe n -- createCompletionRequestLogitBias :: Maybe (Map.Map String Int)
    <*> arbitraryReducedMaybe n -- createCompletionRequestLogprobs :: Maybe Int
    <*> arbitraryReducedMaybe n -- createCompletionRequestMaxTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createCompletionRequestN :: Maybe Int
    <*> arbitraryReducedMaybe n -- createCompletionRequestPresencePenalty :: Maybe Double
    <*> arbitraryReducedMaybe n -- createCompletionRequestSeed :: Maybe Int
    <*> arbitraryReducedMaybe n -- createCompletionRequestStop :: Maybe CreateCompletionRequestStop
    <*> arbitraryReducedMaybe n -- createCompletionRequestStream :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createCompletionRequestStreamOptions :: Maybe ChatCompletionStreamOptions
    <*> arbitraryReducedMaybe n -- createCompletionRequestSuffix :: Maybe Text
    <*> arbitraryReducedMaybe n -- createCompletionRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- createCompletionRequestTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- createCompletionRequestUser :: Maybe Text
  
instance Arbitrary CreateCompletionRequestModel where
  arbitrary = sized genCreateCompletionRequestModel

genCreateCompletionRequestModel :: Int -> Gen CreateCompletionRequestModel
genCreateCompletionRequestModel n =
  
  pure CreateCompletionRequestModel
   
instance Arbitrary CreateCompletionRequestPrompt where
  arbitrary = sized genCreateCompletionRequestPrompt

genCreateCompletionRequestPrompt :: Int -> Gen CreateCompletionRequestPrompt
genCreateCompletionRequestPrompt n =
  
  pure CreateCompletionRequestPrompt
   
instance Arbitrary CreateCompletionRequestStop where
  arbitrary = sized genCreateCompletionRequestStop

genCreateCompletionRequestStop :: Int -> Gen CreateCompletionRequestStop
genCreateCompletionRequestStop n =
  
  pure CreateCompletionRequestStop
   
instance Arbitrary CreateCompletionResponse where
  arbitrary = sized genCreateCompletionResponse

genCreateCompletionResponse :: Int -> Gen CreateCompletionResponse
genCreateCompletionResponse n =
  CreateCompletionResponse
    <$> arbitrary -- createCompletionResponseId :: Text
    <*> arbitraryReduced n -- createCompletionResponseChoices :: [CreateCompletionResponseChoicesInner]
    <*> arbitrary -- createCompletionResponseCreated :: Int
    <*> arbitrary -- createCompletionResponseModel :: Text
    <*> arbitraryReducedMaybe n -- createCompletionResponseSystemFingerprint :: Maybe Text
    <*> arbitrary -- createCompletionResponseObject :: E'Object6
    <*> arbitraryReducedMaybe n -- createCompletionResponseUsage :: Maybe CompletionUsage
  
instance Arbitrary CreateCompletionResponseChoicesInner where
  arbitrary = sized genCreateCompletionResponseChoicesInner

genCreateCompletionResponseChoicesInner :: Int -> Gen CreateCompletionResponseChoicesInner
genCreateCompletionResponseChoicesInner n =
  CreateCompletionResponseChoicesInner
    <$> arbitrary -- createCompletionResponseChoicesInnerFinishReason :: E'FinishReason3
    <*> arbitrary -- createCompletionResponseChoicesInnerIndex :: Int
    <*> arbitraryReduced n -- createCompletionResponseChoicesInnerLogprobs :: CreateCompletionResponseChoicesInnerLogprobs
    <*> arbitrary -- createCompletionResponseChoicesInnerText :: Text
  
instance Arbitrary CreateCompletionResponseChoicesInnerLogprobs where
  arbitrary = sized genCreateCompletionResponseChoicesInnerLogprobs

genCreateCompletionResponseChoicesInnerLogprobs :: Int -> Gen CreateCompletionResponseChoicesInnerLogprobs
genCreateCompletionResponseChoicesInnerLogprobs n =
  CreateCompletionResponseChoicesInnerLogprobs
    <$> arbitraryReducedMaybe n -- createCompletionResponseChoicesInnerLogprobsTextOffset :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- createCompletionResponseChoicesInnerLogprobsTokenLogprobs :: Maybe [Double]
    <*> arbitraryReducedMaybe n -- createCompletionResponseChoicesInnerLogprobsTokens :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- createCompletionResponseChoicesInnerLogprobsTopLogprobs :: Maybe [(Map.Map String Double)]
  
instance Arbitrary CreateEmbeddingRequest where
  arbitrary = sized genCreateEmbeddingRequest

genCreateEmbeddingRequest :: Int -> Gen CreateEmbeddingRequest
genCreateEmbeddingRequest n =
  CreateEmbeddingRequest
    <$> arbitraryReduced n -- createEmbeddingRequestInput :: CreateEmbeddingRequestInput
    <*> arbitraryReduced n -- createEmbeddingRequestModel :: CreateEmbeddingRequestModel
    <*> arbitraryReducedMaybe n -- createEmbeddingRequestEncodingFormat :: Maybe E'EncodingFormat
    <*> arbitraryReducedMaybe n -- createEmbeddingRequestDimensions :: Maybe Int
    <*> arbitraryReducedMaybe n -- createEmbeddingRequestUser :: Maybe Text
  
instance Arbitrary CreateEmbeddingRequestInput where
  arbitrary = sized genCreateEmbeddingRequestInput

genCreateEmbeddingRequestInput :: Int -> Gen CreateEmbeddingRequestInput
genCreateEmbeddingRequestInput n =
  
  pure CreateEmbeddingRequestInput
   
instance Arbitrary CreateEmbeddingRequestModel where
  arbitrary = sized genCreateEmbeddingRequestModel

genCreateEmbeddingRequestModel :: Int -> Gen CreateEmbeddingRequestModel
genCreateEmbeddingRequestModel n =
  
  pure CreateEmbeddingRequestModel
   
instance Arbitrary CreateEmbeddingResponse where
  arbitrary = sized genCreateEmbeddingResponse

genCreateEmbeddingResponse :: Int -> Gen CreateEmbeddingResponse
genCreateEmbeddingResponse n =
  CreateEmbeddingResponse
    <$> arbitraryReduced n -- createEmbeddingResponseData :: [Embedding]
    <*> arbitrary -- createEmbeddingResponseModel :: Text
    <*> arbitrary -- createEmbeddingResponseObject :: E'Object7
    <*> arbitraryReduced n -- createEmbeddingResponseUsage :: CreateEmbeddingResponseUsage
  
instance Arbitrary CreateEmbeddingResponseUsage where
  arbitrary = sized genCreateEmbeddingResponseUsage

genCreateEmbeddingResponseUsage :: Int -> Gen CreateEmbeddingResponseUsage
genCreateEmbeddingResponseUsage n =
  CreateEmbeddingResponseUsage
    <$> arbitrary -- createEmbeddingResponseUsagePromptTokens :: Int
    <*> arbitrary -- createEmbeddingResponseUsageTotalTokens :: Int
  
instance Arbitrary CreateFineTuningJobRequest where
  arbitrary = sized genCreateFineTuningJobRequest

genCreateFineTuningJobRequest :: Int -> Gen CreateFineTuningJobRequest
genCreateFineTuningJobRequest n =
  CreateFineTuningJobRequest
    <$> arbitraryReduced n -- createFineTuningJobRequestModel :: CreateFineTuningJobRequestModel
    <*> arbitrary -- createFineTuningJobRequestTrainingFile :: Text
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestHyperparameters :: Maybe CreateFineTuningJobRequestHyperparameters
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestSuffix :: Maybe Text
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestValidationFile :: Maybe Text
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestIntegrations :: Maybe [CreateFineTuningJobRequestIntegrationsInner]
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestSeed :: Maybe Int
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestMethod :: Maybe FineTuneMethod
  
instance Arbitrary CreateFineTuningJobRequestHyperparameters where
  arbitrary = sized genCreateFineTuningJobRequestHyperparameters

genCreateFineTuningJobRequestHyperparameters :: Int -> Gen CreateFineTuningJobRequestHyperparameters
genCreateFineTuningJobRequestHyperparameters n =
  CreateFineTuningJobRequestHyperparameters
    <$> arbitraryReducedMaybe n -- createFineTuningJobRequestHyperparametersBatchSize :: Maybe CreateFineTuningJobRequestHyperparametersBatchSize
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestHyperparametersLearningRateMultiplier :: Maybe CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestHyperparametersNEpochs :: Maybe CreateFineTuningJobRequestHyperparametersNEpochs
  
instance Arbitrary CreateFineTuningJobRequestHyperparametersBatchSize where
  arbitrary = sized genCreateFineTuningJobRequestHyperparametersBatchSize

genCreateFineTuningJobRequestHyperparametersBatchSize :: Int -> Gen CreateFineTuningJobRequestHyperparametersBatchSize
genCreateFineTuningJobRequestHyperparametersBatchSize n =
  
  pure CreateFineTuningJobRequestHyperparametersBatchSize
   
instance Arbitrary CreateFineTuningJobRequestHyperparametersLearningRateMultiplier where
  arbitrary = sized genCreateFineTuningJobRequestHyperparametersLearningRateMultiplier

genCreateFineTuningJobRequestHyperparametersLearningRateMultiplier :: Int -> Gen CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
genCreateFineTuningJobRequestHyperparametersLearningRateMultiplier n =
  
  pure CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
   
instance Arbitrary CreateFineTuningJobRequestHyperparametersNEpochs where
  arbitrary = sized genCreateFineTuningJobRequestHyperparametersNEpochs

genCreateFineTuningJobRequestHyperparametersNEpochs :: Int -> Gen CreateFineTuningJobRequestHyperparametersNEpochs
genCreateFineTuningJobRequestHyperparametersNEpochs n =
  
  pure CreateFineTuningJobRequestHyperparametersNEpochs
   
instance Arbitrary CreateFineTuningJobRequestIntegrationsInner where
  arbitrary = sized genCreateFineTuningJobRequestIntegrationsInner

genCreateFineTuningJobRequestIntegrationsInner :: Int -> Gen CreateFineTuningJobRequestIntegrationsInner
genCreateFineTuningJobRequestIntegrationsInner n =
  CreateFineTuningJobRequestIntegrationsInner
    <$> arbitrary -- createFineTuningJobRequestIntegrationsInnerType :: E'Type16
    <*> arbitraryReduced n -- createFineTuningJobRequestIntegrationsInnerWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb
  
instance Arbitrary CreateFineTuningJobRequestIntegrationsInnerWandb where
  arbitrary = sized genCreateFineTuningJobRequestIntegrationsInnerWandb

genCreateFineTuningJobRequestIntegrationsInnerWandb :: Int -> Gen CreateFineTuningJobRequestIntegrationsInnerWandb
genCreateFineTuningJobRequestIntegrationsInnerWandb n =
  CreateFineTuningJobRequestIntegrationsInnerWandb
    <$> arbitrary -- createFineTuningJobRequestIntegrationsInnerWandbProject :: Text
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestIntegrationsInnerWandbName :: Maybe Text
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestIntegrationsInnerWandbEntity :: Maybe Text
    <*> arbitraryReducedMaybe n -- createFineTuningJobRequestIntegrationsInnerWandbTags :: Maybe [Text]
  
instance Arbitrary CreateFineTuningJobRequestModel where
  arbitrary = sized genCreateFineTuningJobRequestModel

genCreateFineTuningJobRequestModel :: Int -> Gen CreateFineTuningJobRequestModel
genCreateFineTuningJobRequestModel n =
  
  pure CreateFineTuningJobRequestModel
   
instance Arbitrary CreateImageEditRequestModel where
  arbitrary = sized genCreateImageEditRequestModel

genCreateImageEditRequestModel :: Int -> Gen CreateImageEditRequestModel
genCreateImageEditRequestModel n =
  
  pure CreateImageEditRequestModel
   
instance Arbitrary CreateImageRequest where
  arbitrary = sized genCreateImageRequest

genCreateImageRequest :: Int -> Gen CreateImageRequest
genCreateImageRequest n =
  CreateImageRequest
    <$> arbitrary -- createImageRequestPrompt :: Text
    <*> arbitraryReducedMaybe n -- createImageRequestModel :: Maybe CreateImageRequestModel
    <*> arbitraryReducedMaybe n -- createImageRequestN :: Maybe Int
    <*> arbitraryReducedMaybe n -- createImageRequestQuality :: Maybe E'Quality
    <*> arbitraryReducedMaybe n -- createImageRequestResponseFormat :: Maybe E'ResponseFormat
    <*> arbitraryReducedMaybe n -- createImageRequestSize :: Maybe E'Size
    <*> arbitraryReducedMaybe n -- createImageRequestStyle :: Maybe E'Style
    <*> arbitraryReducedMaybe n -- createImageRequestUser :: Maybe Text
  
instance Arbitrary CreateImageRequestModel where
  arbitrary = sized genCreateImageRequestModel

genCreateImageRequestModel :: Int -> Gen CreateImageRequestModel
genCreateImageRequestModel n =
  
  pure CreateImageRequestModel
   
instance Arbitrary CreateMessageRequest where
  arbitrary = sized genCreateMessageRequest

genCreateMessageRequest :: Int -> Gen CreateMessageRequest
genCreateMessageRequest n =
  CreateMessageRequest
    <$> arbitrary -- createMessageRequestRole :: E'Role6
    <*> arbitraryReduced n -- createMessageRequestContent :: CreateMessageRequestContent
    <*> arbitraryReducedMaybe n -- createMessageRequestAttachments :: Maybe [CreateMessageRequestAttachmentsInner]
    <*> arbitraryReducedMaybeValue n -- createMessageRequestMetadata :: Maybe A.Value
  
instance Arbitrary CreateMessageRequestAttachmentsInner where
  arbitrary = sized genCreateMessageRequestAttachmentsInner

genCreateMessageRequestAttachmentsInner :: Int -> Gen CreateMessageRequestAttachmentsInner
genCreateMessageRequestAttachmentsInner n =
  CreateMessageRequestAttachmentsInner
    <$> arbitraryReducedMaybe n -- createMessageRequestAttachmentsInnerFileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- createMessageRequestAttachmentsInnerTools :: Maybe [CreateMessageRequestAttachmentsInnerToolsInner]
  
instance Arbitrary CreateMessageRequestAttachmentsInnerToolsInner where
  arbitrary = sized genCreateMessageRequestAttachmentsInnerToolsInner

genCreateMessageRequestAttachmentsInnerToolsInner :: Int -> Gen CreateMessageRequestAttachmentsInnerToolsInner
genCreateMessageRequestAttachmentsInnerToolsInner n =
  CreateMessageRequestAttachmentsInnerToolsInner
    <$> arbitrary -- createMessageRequestAttachmentsInnerToolsInnerType :: E'Type71
  
instance Arbitrary CreateMessageRequestContent where
  arbitrary = sized genCreateMessageRequestContent

genCreateMessageRequestContent :: Int -> Gen CreateMessageRequestContent
genCreateMessageRequestContent n =
  
  pure CreateMessageRequestContent
   
instance Arbitrary CreateModerationRequest where
  arbitrary = sized genCreateModerationRequest

genCreateModerationRequest :: Int -> Gen CreateModerationRequest
genCreateModerationRequest n =
  CreateModerationRequest
    <$> arbitraryReduced n -- createModerationRequestInput :: CreateModerationRequestInput
    <*> arbitraryReducedMaybe n -- createModerationRequestModel :: Maybe CreateModerationRequestModel
  
instance Arbitrary CreateModerationRequestInput where
  arbitrary = sized genCreateModerationRequestInput

genCreateModerationRequestInput :: Int -> Gen CreateModerationRequestInput
genCreateModerationRequestInput n =
  
  pure CreateModerationRequestInput
   
instance Arbitrary CreateModerationRequestInputOneOfInner where
  arbitrary = sized genCreateModerationRequestInputOneOfInner

genCreateModerationRequestInputOneOfInner :: Int -> Gen CreateModerationRequestInputOneOfInner
genCreateModerationRequestInputOneOfInner n =
  CreateModerationRequestInputOneOfInner
    <$> arbitrary -- createModerationRequestInputOneOfInnerType :: E'Type72
    <*> arbitraryReduced n -- createModerationRequestInputOneOfInnerImageUrl :: CreateModerationRequestInputOneOfInnerOneOfImageUrl
    <*> arbitrary -- createModerationRequestInputOneOfInnerText :: Text
  
instance Arbitrary CreateModerationRequestInputOneOfInnerOneOf where
  arbitrary = sized genCreateModerationRequestInputOneOfInnerOneOf

genCreateModerationRequestInputOneOfInnerOneOf :: Int -> Gen CreateModerationRequestInputOneOfInnerOneOf
genCreateModerationRequestInputOneOfInnerOneOf n =
  CreateModerationRequestInputOneOfInnerOneOf
    <$> arbitrary -- createModerationRequestInputOneOfInnerOneOfType :: E'Type10
    <*> arbitraryReduced n -- createModerationRequestInputOneOfInnerOneOfImageUrl :: CreateModerationRequestInputOneOfInnerOneOfImageUrl
  
instance Arbitrary CreateModerationRequestInputOneOfInnerOneOf1 where
  arbitrary = sized genCreateModerationRequestInputOneOfInnerOneOf1

genCreateModerationRequestInputOneOfInnerOneOf1 :: Int -> Gen CreateModerationRequestInputOneOfInnerOneOf1
genCreateModerationRequestInputOneOfInnerOneOf1 n =
  CreateModerationRequestInputOneOfInnerOneOf1
    <$> arbitrary -- createModerationRequestInputOneOfInnerOneOf1Type :: E'Type12
    <*> arbitrary -- createModerationRequestInputOneOfInnerOneOf1Text :: Text
  
instance Arbitrary CreateModerationRequestInputOneOfInnerOneOfImageUrl where
  arbitrary = sized genCreateModerationRequestInputOneOfInnerOneOfImageUrl

genCreateModerationRequestInputOneOfInnerOneOfImageUrl :: Int -> Gen CreateModerationRequestInputOneOfInnerOneOfImageUrl
genCreateModerationRequestInputOneOfInnerOneOfImageUrl n =
  CreateModerationRequestInputOneOfInnerOneOfImageUrl
    <$> arbitrary -- createModerationRequestInputOneOfInnerOneOfImageUrlUrl :: Text
  
instance Arbitrary CreateModerationRequestModel where
  arbitrary = sized genCreateModerationRequestModel

genCreateModerationRequestModel :: Int -> Gen CreateModerationRequestModel
genCreateModerationRequestModel n =
  
  pure CreateModerationRequestModel
   
instance Arbitrary CreateModerationResponse where
  arbitrary = sized genCreateModerationResponse

genCreateModerationResponse :: Int -> Gen CreateModerationResponse
genCreateModerationResponse n =
  CreateModerationResponse
    <$> arbitrary -- createModerationResponseId :: Text
    <*> arbitrary -- createModerationResponseModel :: Text
    <*> arbitraryReduced n -- createModerationResponseResults :: [CreateModerationResponseResultsInner]
  
instance Arbitrary CreateModerationResponseResultsInner where
  arbitrary = sized genCreateModerationResponseResultsInner

genCreateModerationResponseResultsInner :: Int -> Gen CreateModerationResponseResultsInner
genCreateModerationResponseResultsInner n =
  CreateModerationResponseResultsInner
    <$> arbitrary -- createModerationResponseResultsInnerFlagged :: Bool
    <*> arbitraryReduced n -- createModerationResponseResultsInnerCategories :: CreateModerationResponseResultsInnerCategories
    <*> arbitraryReduced n -- createModerationResponseResultsInnerCategoryScores :: CreateModerationResponseResultsInnerCategoryScores
    <*> arbitraryReduced n -- createModerationResponseResultsInnerCategoryAppliedInputTypes :: CreateModerationResponseResultsInnerCategoryAppliedInputTypes
  
instance Arbitrary CreateModerationResponseResultsInnerCategories where
  arbitrary = sized genCreateModerationResponseResultsInnerCategories

genCreateModerationResponseResultsInnerCategories :: Int -> Gen CreateModerationResponseResultsInnerCategories
genCreateModerationResponseResultsInnerCategories n =
  CreateModerationResponseResultsInnerCategories
    <$> arbitrary -- createModerationResponseResultsInnerCategoriesHate :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesHateThreatening :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesHarassment :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesHarassmentThreatening :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesIllicit :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesIllicitViolent :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSelfHarm :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSelfHarmIntent :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSelfHarmInstructions :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSexual :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSexualMinors :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesViolence :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesViolenceGraphic :: Bool
  
instance Arbitrary CreateModerationResponseResultsInnerCategoryAppliedInputTypes where
  arbitrary = sized genCreateModerationResponseResultsInnerCategoryAppliedInputTypes

genCreateModerationResponseResultsInnerCategoryAppliedInputTypes :: Int -> Gen CreateModerationResponseResultsInnerCategoryAppliedInputTypes
genCreateModerationResponseResultsInnerCategoryAppliedInputTypes n =
  CreateModerationResponseResultsInnerCategoryAppliedInputTypes
    <$> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesHate :: [E'Type12]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesHateThreatening :: [E'Type12]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesHarassment :: [E'Type12]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentThreatening :: [E'Type12]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesIllicit :: [E'Type12]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitViolent :: [E'Type12]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarm :: [E'SelfHarm]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmIntent :: [E'SelfHarm]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmInstructions :: [E'SelfHarm]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesSexual :: [E'SelfHarm]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesSexualMinors :: [E'Type12]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesViolence :: [E'SelfHarm]
    <*> arbitrary -- createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceGraphic :: [E'SelfHarm]
  
instance Arbitrary CreateModerationResponseResultsInnerCategoryScores where
  arbitrary = sized genCreateModerationResponseResultsInnerCategoryScores

genCreateModerationResponseResultsInnerCategoryScores :: Int -> Gen CreateModerationResponseResultsInnerCategoryScores
genCreateModerationResponseResultsInnerCategoryScores n =
  CreateModerationResponseResultsInnerCategoryScores
    <$> arbitrary -- createModerationResponseResultsInnerCategoryScoresHate :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresHateThreatening :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresHarassment :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresHarassmentThreatening :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresIllicit :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresIllicitViolent :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresSelfHarm :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresSelfHarmIntent :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresSelfHarmInstructions :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresSexual :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresSexualMinors :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresViolence :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresViolenceGraphic :: Double
  
instance Arbitrary CreateRunRequest where
  arbitrary = sized genCreateRunRequest

genCreateRunRequest :: Int -> Gen CreateRunRequest
genCreateRunRequest n =
  CreateRunRequest
    <$> arbitrary -- createRunRequestAssistantId :: Text
    <*> arbitraryReducedMaybe n -- createRunRequestModel :: Maybe CreateRunRequestModel
    <*> arbitraryReducedMaybe n -- createRunRequestInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- createRunRequestAdditionalInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- createRunRequestAdditionalMessages :: Maybe [CreateMessageRequest]
    <*> arbitraryReducedMaybe n -- createRunRequestTools :: Maybe [AssistantObjectToolsInner]
    <*> arbitraryReducedMaybeValue n -- createRunRequestMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- createRunRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- createRunRequestTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- createRunRequestStream :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createRunRequestMaxPromptTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createRunRequestMaxCompletionTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createRunRequestTruncationStrategy :: Maybe TruncationObject
    <*> arbitraryReducedMaybe n -- createRunRequestToolChoice :: Maybe AssistantsApiToolChoiceOption
    <*> arbitraryReducedMaybe n -- createRunRequestParallelToolCalls :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createRunRequestResponseFormat :: Maybe AssistantsApiResponseFormatOption
  
instance Arbitrary CreateRunRequestModel where
  arbitrary = sized genCreateRunRequestModel

genCreateRunRequestModel :: Int -> Gen CreateRunRequestModel
genCreateRunRequestModel n =
  
  pure CreateRunRequestModel
   
instance Arbitrary CreateSpeechRequest where
  arbitrary = sized genCreateSpeechRequest

genCreateSpeechRequest :: Int -> Gen CreateSpeechRequest
genCreateSpeechRequest n =
  CreateSpeechRequest
    <$> arbitraryReduced n -- createSpeechRequestModel :: CreateSpeechRequestModel
    <*> arbitrary -- createSpeechRequestInput :: Text
    <*> arbitrary -- createSpeechRequestVoice :: E'Voice
    <*> arbitraryReducedMaybe n -- createSpeechRequestResponseFormat :: Maybe E'ResponseFormat2
    <*> arbitraryReducedMaybe n -- createSpeechRequestSpeed :: Maybe Double
  
instance Arbitrary CreateSpeechRequestModel where
  arbitrary = sized genCreateSpeechRequestModel

genCreateSpeechRequestModel :: Int -> Gen CreateSpeechRequestModel
genCreateSpeechRequestModel n =
  
  pure CreateSpeechRequestModel
   
instance Arbitrary CreateThreadAndRunRequest where
  arbitrary = sized genCreateThreadAndRunRequest

genCreateThreadAndRunRequest :: Int -> Gen CreateThreadAndRunRequest
genCreateThreadAndRunRequest n =
  CreateThreadAndRunRequest
    <$> arbitrary -- createThreadAndRunRequestAssistantId :: Text
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestThread :: Maybe CreateThreadRequest
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestModel :: Maybe CreateRunRequestModel
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestTools :: Maybe [CreateThreadAndRunRequestToolsInner]
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestToolResources :: Maybe CreateThreadAndRunRequestToolResources
    <*> arbitraryReducedMaybeValue n -- createThreadAndRunRequestMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestStream :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestMaxPromptTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestMaxCompletionTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestTruncationStrategy :: Maybe TruncationObject
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestToolChoice :: Maybe AssistantsApiToolChoiceOption
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestParallelToolCalls :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestResponseFormat :: Maybe AssistantsApiResponseFormatOption
  
instance Arbitrary CreateThreadAndRunRequestToolResources where
  arbitrary = sized genCreateThreadAndRunRequestToolResources

genCreateThreadAndRunRequestToolResources :: Int -> Gen CreateThreadAndRunRequestToolResources
genCreateThreadAndRunRequestToolResources n =
  CreateThreadAndRunRequestToolResources
    <$> arbitraryReducedMaybe n -- createThreadAndRunRequestToolResourcesCodeInterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestToolResourcesFileSearch :: Maybe AssistantObjectToolResourcesFileSearch
  
instance Arbitrary CreateThreadAndRunRequestToolsInner where
  arbitrary = sized genCreateThreadAndRunRequestToolsInner

genCreateThreadAndRunRequestToolsInner :: Int -> Gen CreateThreadAndRunRequestToolsInner
genCreateThreadAndRunRequestToolsInner n =
  CreateThreadAndRunRequestToolsInner
    <$> arbitrary -- createThreadAndRunRequestToolsInnerType :: E'Type69
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestToolsInnerFileSearch :: Maybe AssistantToolsFileSearchFileSearch
    <*> arbitraryReduced n -- createThreadAndRunRequestToolsInnerFunction :: FunctionObject
  
instance Arbitrary CreateThreadRequest where
  arbitrary = sized genCreateThreadRequest

genCreateThreadRequest :: Int -> Gen CreateThreadRequest
genCreateThreadRequest n =
  CreateThreadRequest
    <$> arbitraryReducedMaybe n -- createThreadRequestMessages :: Maybe [CreateMessageRequest]
    <*> arbitraryReducedMaybe n -- createThreadRequestToolResources :: Maybe CreateThreadRequestToolResources
    <*> arbitraryReducedMaybeValue n -- createThreadRequestMetadata :: Maybe A.Value
  
instance Arbitrary CreateThreadRequestToolResources where
  arbitrary = sized genCreateThreadRequestToolResources

genCreateThreadRequestToolResources :: Int -> Gen CreateThreadRequestToolResources
genCreateThreadRequestToolResources n =
  CreateThreadRequestToolResources
    <$> arbitraryReducedMaybe n -- createThreadRequestToolResourcesCodeInterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter
    <*> arbitraryReducedMaybe n -- createThreadRequestToolResourcesFileSearch :: Maybe CreateThreadRequestToolResourcesFileSearch
  
instance Arbitrary CreateThreadRequestToolResourcesFileSearch where
  arbitrary = sized genCreateThreadRequestToolResourcesFileSearch

genCreateThreadRequestToolResourcesFileSearch :: Int -> Gen CreateThreadRequestToolResourcesFileSearch
genCreateThreadRequestToolResourcesFileSearch n =
  CreateThreadRequestToolResourcesFileSearch
    <$> arbitraryReducedMaybe n -- createThreadRequestToolResourcesFileSearchVectorStoreIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- createThreadRequestToolResourcesFileSearchVectorStores :: Maybe [CreateThreadRequestToolResourcesFileSearchVectorStoresInner]
  
instance Arbitrary CreateThreadRequestToolResourcesFileSearchVectorStoresInner where
  arbitrary = sized genCreateThreadRequestToolResourcesFileSearchVectorStoresInner

genCreateThreadRequestToolResourcesFileSearchVectorStoresInner :: Int -> Gen CreateThreadRequestToolResourcesFileSearchVectorStoresInner
genCreateThreadRequestToolResourcesFileSearchVectorStoresInner n =
  CreateThreadRequestToolResourcesFileSearchVectorStoresInner
    <$> arbitraryReducedMaybe n -- createThreadRequestToolResourcesFileSearchVectorStoresInnerFileIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- createThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy :: Maybe CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
    <*> arbitraryReducedMaybeValue n -- createThreadRequestToolResourcesFileSearchVectorStoresInnerMetadata :: Maybe A.Value
  
instance Arbitrary CreateTranscription200Response where
  arbitrary = sized genCreateTranscription200Response

genCreateTranscription200Response :: Int -> Gen CreateTranscription200Response
genCreateTranscription200Response n =
  CreateTranscription200Response
    <$> arbitrary -- createTranscription200ResponseText :: Text
    <*> arbitrary -- createTranscription200ResponseLanguage :: Text
    <*> arbitrary -- createTranscription200ResponseDuration :: Text
    <*> arbitraryReducedMaybe n -- createTranscription200ResponseWords :: Maybe [TranscriptionWord]
    <*> arbitraryReducedMaybe n -- createTranscription200ResponseSegments :: Maybe [TranscriptionSegment]
  
instance Arbitrary CreateTranscriptionRequestModel where
  arbitrary = sized genCreateTranscriptionRequestModel

genCreateTranscriptionRequestModel :: Int -> Gen CreateTranscriptionRequestModel
genCreateTranscriptionRequestModel n =
  
  pure CreateTranscriptionRequestModel
   
instance Arbitrary CreateTranscriptionResponseJson where
  arbitrary = sized genCreateTranscriptionResponseJson

genCreateTranscriptionResponseJson :: Int -> Gen CreateTranscriptionResponseJson
genCreateTranscriptionResponseJson n =
  CreateTranscriptionResponseJson
    <$> arbitrary -- createTranscriptionResponseJsonText :: Text
  
instance Arbitrary CreateTranscriptionResponseVerboseJson where
  arbitrary = sized genCreateTranscriptionResponseVerboseJson

genCreateTranscriptionResponseVerboseJson :: Int -> Gen CreateTranscriptionResponseVerboseJson
genCreateTranscriptionResponseVerboseJson n =
  CreateTranscriptionResponseVerboseJson
    <$> arbitrary -- createTranscriptionResponseVerboseJsonLanguage :: Text
    <*> arbitrary -- createTranscriptionResponseVerboseJsonDuration :: Text
    <*> arbitrary -- createTranscriptionResponseVerboseJsonText :: Text
    <*> arbitraryReducedMaybe n -- createTranscriptionResponseVerboseJsonWords :: Maybe [TranscriptionWord]
    <*> arbitraryReducedMaybe n -- createTranscriptionResponseVerboseJsonSegments :: Maybe [TranscriptionSegment]
  
instance Arbitrary CreateTranslation200Response where
  arbitrary = sized genCreateTranslation200Response

genCreateTranslation200Response :: Int -> Gen CreateTranslation200Response
genCreateTranslation200Response n =
  CreateTranslation200Response
    <$> arbitrary -- createTranslation200ResponseText :: Text
    <*> arbitrary -- createTranslation200ResponseLanguage :: Text
    <*> arbitrary -- createTranslation200ResponseDuration :: Text
    <*> arbitraryReducedMaybe n -- createTranslation200ResponseSegments :: Maybe [TranscriptionSegment]
  
instance Arbitrary CreateTranslationResponseJson where
  arbitrary = sized genCreateTranslationResponseJson

genCreateTranslationResponseJson :: Int -> Gen CreateTranslationResponseJson
genCreateTranslationResponseJson n =
  CreateTranslationResponseJson
    <$> arbitrary -- createTranslationResponseJsonText :: Text
  
instance Arbitrary CreateTranslationResponseVerboseJson where
  arbitrary = sized genCreateTranslationResponseVerboseJson

genCreateTranslationResponseVerboseJson :: Int -> Gen CreateTranslationResponseVerboseJson
genCreateTranslationResponseVerboseJson n =
  CreateTranslationResponseVerboseJson
    <$> arbitrary -- createTranslationResponseVerboseJsonLanguage :: Text
    <*> arbitrary -- createTranslationResponseVerboseJsonDuration :: Text
    <*> arbitrary -- createTranslationResponseVerboseJsonText :: Text
    <*> arbitraryReducedMaybe n -- createTranslationResponseVerboseJsonSegments :: Maybe [TranscriptionSegment]
  
instance Arbitrary CreateUploadRequest where
  arbitrary = sized genCreateUploadRequest

genCreateUploadRequest :: Int -> Gen CreateUploadRequest
genCreateUploadRequest n =
  CreateUploadRequest
    <$> arbitrary -- createUploadRequestFilename :: Text
    <*> arbitrary -- createUploadRequestPurpose :: E'Purpose
    <*> arbitrary -- createUploadRequestBytes :: Int
    <*> arbitrary -- createUploadRequestMimeType :: Text
  
instance Arbitrary CreateVectorStoreFileBatchRequest where
  arbitrary = sized genCreateVectorStoreFileBatchRequest

genCreateVectorStoreFileBatchRequest :: Int -> Gen CreateVectorStoreFileBatchRequest
genCreateVectorStoreFileBatchRequest n =
  CreateVectorStoreFileBatchRequest
    <$> arbitrary -- createVectorStoreFileBatchRequestFileIds :: [Text]
    <*> arbitraryReducedMaybe n -- createVectorStoreFileBatchRequestChunkingStrategy :: Maybe ChunkingStrategyRequestParam
  
instance Arbitrary CreateVectorStoreFileRequest where
  arbitrary = sized genCreateVectorStoreFileRequest

genCreateVectorStoreFileRequest :: Int -> Gen CreateVectorStoreFileRequest
genCreateVectorStoreFileRequest n =
  CreateVectorStoreFileRequest
    <$> arbitrary -- createVectorStoreFileRequestFileId :: Text
    <*> arbitraryReducedMaybe n -- createVectorStoreFileRequestChunkingStrategy :: Maybe ChunkingStrategyRequestParam
  
instance Arbitrary CreateVectorStoreRequest where
  arbitrary = sized genCreateVectorStoreRequest

genCreateVectorStoreRequest :: Int -> Gen CreateVectorStoreRequest
genCreateVectorStoreRequest n =
  CreateVectorStoreRequest
    <$> arbitraryReducedMaybe n -- createVectorStoreRequestFileIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- createVectorStoreRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- createVectorStoreRequestExpiresAfter :: Maybe VectorStoreExpirationAfter
    <*> arbitraryReducedMaybe n -- createVectorStoreRequestChunkingStrategy :: Maybe CreateVectorStoreRequestChunkingStrategy
    <*> arbitraryReducedMaybeValue n -- createVectorStoreRequestMetadata :: Maybe A.Value
  
instance Arbitrary CreateVectorStoreRequestChunkingStrategy where
  arbitrary = sized genCreateVectorStoreRequestChunkingStrategy

genCreateVectorStoreRequestChunkingStrategy :: Int -> Gen CreateVectorStoreRequestChunkingStrategy
genCreateVectorStoreRequestChunkingStrategy n =
  CreateVectorStoreRequestChunkingStrategy
    <$> arbitrary -- createVectorStoreRequestChunkingStrategyType :: E'Type14
    <*> arbitraryReduced n -- createVectorStoreRequestChunkingStrategyStatic :: StaticChunkingStrategy
  
instance Arbitrary DefaultProjectErrorResponse where
  arbitrary = sized genDefaultProjectErrorResponse

genDefaultProjectErrorResponse :: Int -> Gen DefaultProjectErrorResponse
genDefaultProjectErrorResponse n =
  DefaultProjectErrorResponse
    <$> arbitrary -- defaultProjectErrorResponseCode :: Int
    <*> arbitrary -- defaultProjectErrorResponseMessage :: Text
  
instance Arbitrary DeleteAssistantResponse where
  arbitrary = sized genDeleteAssistantResponse

genDeleteAssistantResponse :: Int -> Gen DeleteAssistantResponse
genDeleteAssistantResponse n =
  DeleteAssistantResponse
    <$> arbitrary -- deleteAssistantResponseId :: Text
    <*> arbitrary -- deleteAssistantResponseDeleted :: Bool
    <*> arbitrary -- deleteAssistantResponseObject :: E'Object8
  
instance Arbitrary DeleteFileResponse where
  arbitrary = sized genDeleteFileResponse

genDeleteFileResponse :: Int -> Gen DeleteFileResponse
genDeleteFileResponse n =
  DeleteFileResponse
    <$> arbitrary -- deleteFileResponseId :: Text
    <*> arbitrary -- deleteFileResponseObject :: E'Object9
    <*> arbitrary -- deleteFileResponseDeleted :: Bool
  
instance Arbitrary DeleteMessageResponse where
  arbitrary = sized genDeleteMessageResponse

genDeleteMessageResponse :: Int -> Gen DeleteMessageResponse
genDeleteMessageResponse n =
  DeleteMessageResponse
    <$> arbitrary -- deleteMessageResponseId :: Text
    <*> arbitrary -- deleteMessageResponseDeleted :: Bool
    <*> arbitrary -- deleteMessageResponseObject :: E'Object10
  
instance Arbitrary DeleteModelResponse where
  arbitrary = sized genDeleteModelResponse

genDeleteModelResponse :: Int -> Gen DeleteModelResponse
genDeleteModelResponse n =
  DeleteModelResponse
    <$> arbitrary -- deleteModelResponseId :: Text
    <*> arbitrary -- deleteModelResponseDeleted :: Bool
    <*> arbitrary -- deleteModelResponseObject :: Text
  
instance Arbitrary DeleteThreadResponse where
  arbitrary = sized genDeleteThreadResponse

genDeleteThreadResponse :: Int -> Gen DeleteThreadResponse
genDeleteThreadResponse n =
  DeleteThreadResponse
    <$> arbitrary -- deleteThreadResponseId :: Text
    <*> arbitrary -- deleteThreadResponseDeleted :: Bool
    <*> arbitrary -- deleteThreadResponseObject :: E'Object11
  
instance Arbitrary DeleteVectorStoreFileResponse where
  arbitrary = sized genDeleteVectorStoreFileResponse

genDeleteVectorStoreFileResponse :: Int -> Gen DeleteVectorStoreFileResponse
genDeleteVectorStoreFileResponse n =
  DeleteVectorStoreFileResponse
    <$> arbitrary -- deleteVectorStoreFileResponseId :: Text
    <*> arbitrary -- deleteVectorStoreFileResponseDeleted :: Bool
    <*> arbitrary -- deleteVectorStoreFileResponseObject :: E'Object12
  
instance Arbitrary DeleteVectorStoreResponse where
  arbitrary = sized genDeleteVectorStoreResponse

genDeleteVectorStoreResponse :: Int -> Gen DeleteVectorStoreResponse
genDeleteVectorStoreResponse n =
  DeleteVectorStoreResponse
    <$> arbitrary -- deleteVectorStoreResponseId :: Text
    <*> arbitrary -- deleteVectorStoreResponseDeleted :: Bool
    <*> arbitrary -- deleteVectorStoreResponseObject :: E'Object13
  
instance Arbitrary DoneEvent where
  arbitrary = sized genDoneEvent

genDoneEvent :: Int -> Gen DoneEvent
genDoneEvent n =
  DoneEvent
    <$> arbitrary -- doneEventEvent :: E'Event
    <*> arbitrary -- doneEventData :: E'Data
  
instance Arbitrary Embedding where
  arbitrary = sized genEmbedding

genEmbedding :: Int -> Gen Embedding
genEmbedding n =
  Embedding
    <$> arbitrary -- embeddingIndex :: Int
    <*> arbitrary -- embeddingEmbedding :: [Double]
    <*> arbitrary -- embeddingObject :: E'Object14
  
instance Arbitrary Error where
  arbitrary = sized genError

genError :: Int -> Gen Error
genError n =
  Error
    <$> arbitrary -- errorCode :: Text
    <*> arbitrary -- errorMessage :: Text
    <*> arbitrary -- errorParam :: Text
    <*> arbitrary -- errorType :: Text
  
instance Arbitrary ErrorEvent where
  arbitrary = sized genErrorEvent

genErrorEvent :: Int -> Gen ErrorEvent
genErrorEvent n =
  ErrorEvent
    <$> arbitrary -- errorEventEvent :: E'Event2
    <*> arbitraryReduced n -- errorEventData :: Error
  
instance Arbitrary ErrorResponse where
  arbitrary = sized genErrorResponse

genErrorResponse :: Int -> Gen ErrorResponse
genErrorResponse n =
  ErrorResponse
    <$> arbitraryReduced n -- errorResponseError :: Error
  
instance Arbitrary FileSearchRankingOptions where
  arbitrary = sized genFileSearchRankingOptions

genFileSearchRankingOptions :: Int -> Gen FileSearchRankingOptions
genFileSearchRankingOptions n =
  FileSearchRankingOptions
    <$> arbitraryReducedMaybe n -- fileSearchRankingOptionsRanker :: Maybe E'Ranker
    <*> arbitrary -- fileSearchRankingOptionsScoreThreshold :: Double
  
instance Arbitrary FineTuneChatCompletionRequestAssistantMessage where
  arbitrary = sized genFineTuneChatCompletionRequestAssistantMessage

genFineTuneChatCompletionRequestAssistantMessage :: Int -> Gen FineTuneChatCompletionRequestAssistantMessage
genFineTuneChatCompletionRequestAssistantMessage n =
  FineTuneChatCompletionRequestAssistantMessage
    <$> arbitraryReducedMaybe n -- fineTuneChatCompletionRequestAssistantMessageContent :: Maybe ChatCompletionRequestAssistantMessageContent
    <*> arbitraryReducedMaybe n -- fineTuneChatCompletionRequestAssistantMessageRefusal :: Maybe Text
    <*> arbitrary -- fineTuneChatCompletionRequestAssistantMessageRole :: E'Object
    <*> arbitraryReducedMaybe n -- fineTuneChatCompletionRequestAssistantMessageName :: Maybe Text
    <*> arbitraryReducedMaybe n -- fineTuneChatCompletionRequestAssistantMessageAudio :: Maybe ChatCompletionRequestAssistantMessageAudio
    <*> arbitraryReducedMaybe n -- fineTuneChatCompletionRequestAssistantMessageToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitraryReducedMaybe n -- fineTuneChatCompletionRequestAssistantMessageFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
    <*> arbitraryReducedMaybe n -- fineTuneChatCompletionRequestAssistantMessageWeight :: Maybe E'Weight
  
instance Arbitrary FineTuneChatRequestInput where
  arbitrary = sized genFineTuneChatRequestInput

genFineTuneChatRequestInput :: Int -> Gen FineTuneChatRequestInput
genFineTuneChatRequestInput n =
  FineTuneChatRequestInput
    <$> arbitraryReducedMaybe n -- fineTuneChatRequestInputMessages :: Maybe [FineTuneChatRequestInputMessagesInner]
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputTools :: Maybe [ChatCompletionTool]
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputParallelToolCalls :: Maybe Bool
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputFunctions :: Maybe [ChatCompletionFunctions]
  
instance Arbitrary FineTuneChatRequestInputMessagesInner where
  arbitrary = sized genFineTuneChatRequestInputMessagesInner

genFineTuneChatRequestInputMessagesInner :: Int -> Gen FineTuneChatRequestInputMessagesInner
genFineTuneChatRequestInputMessagesInner n =
  FineTuneChatRequestInputMessagesInner
    <$> arbitrary -- fineTuneChatRequestInputMessagesInnerContent :: Text
    <*> arbitrary -- fineTuneChatRequestInputMessagesInnerRole :: E'Type3
    <*> arbitrary -- fineTuneChatRequestInputMessagesInnerName :: Text
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputMessagesInnerWeight :: Maybe E'Weight
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputMessagesInnerRefusal :: Maybe Text
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputMessagesInnerAudio :: Maybe ChatCompletionRequestAssistantMessageAudio
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputMessagesInnerToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitraryReducedMaybe n -- fineTuneChatRequestInputMessagesInnerFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
    <*> arbitrary -- fineTuneChatRequestInputMessagesInnerToolCallId :: Text
  
instance Arbitrary FineTuneCompletionRequestInput where
  arbitrary = sized genFineTuneCompletionRequestInput

genFineTuneCompletionRequestInput :: Int -> Gen FineTuneCompletionRequestInput
genFineTuneCompletionRequestInput n =
  FineTuneCompletionRequestInput
    <$> arbitraryReducedMaybe n -- fineTuneCompletionRequestInputPrompt :: Maybe Text
    <*> arbitraryReducedMaybe n -- fineTuneCompletionRequestInputCompletion :: Maybe Text
  
instance Arbitrary FineTuneDPOMethod where
  arbitrary = sized genFineTuneDPOMethod

genFineTuneDPOMethod :: Int -> Gen FineTuneDPOMethod
genFineTuneDPOMethod n =
  FineTuneDPOMethod
    <$> arbitraryReducedMaybe n -- fineTuneDPOMethodHyperparameters :: Maybe FineTuneDPOMethodHyperparameters
  
instance Arbitrary FineTuneDPOMethodHyperparameters where
  arbitrary = sized genFineTuneDPOMethodHyperparameters

genFineTuneDPOMethodHyperparameters :: Int -> Gen FineTuneDPOMethodHyperparameters
genFineTuneDPOMethodHyperparameters n =
  FineTuneDPOMethodHyperparameters
    <$> arbitraryReducedMaybe n -- fineTuneDPOMethodHyperparametersBeta :: Maybe FineTuneDPOMethodHyperparametersBeta
    <*> arbitraryReducedMaybe n -- fineTuneDPOMethodHyperparametersBatchSize :: Maybe FineTuneDPOMethodHyperparametersBatchSize
    <*> arbitraryReducedMaybe n -- fineTuneDPOMethodHyperparametersLearningRateMultiplier :: Maybe FineTuneDPOMethodHyperparametersLearningRateMultiplier
    <*> arbitraryReducedMaybe n -- fineTuneDPOMethodHyperparametersNEpochs :: Maybe FineTuneDPOMethodHyperparametersNEpochs
  
instance Arbitrary FineTuneDPOMethodHyperparametersBatchSize where
  arbitrary = sized genFineTuneDPOMethodHyperparametersBatchSize

genFineTuneDPOMethodHyperparametersBatchSize :: Int -> Gen FineTuneDPOMethodHyperparametersBatchSize
genFineTuneDPOMethodHyperparametersBatchSize n =
  
  pure FineTuneDPOMethodHyperparametersBatchSize
   
instance Arbitrary FineTuneDPOMethodHyperparametersBeta where
  arbitrary = sized genFineTuneDPOMethodHyperparametersBeta

genFineTuneDPOMethodHyperparametersBeta :: Int -> Gen FineTuneDPOMethodHyperparametersBeta
genFineTuneDPOMethodHyperparametersBeta n =
  
  pure FineTuneDPOMethodHyperparametersBeta
   
instance Arbitrary FineTuneDPOMethodHyperparametersLearningRateMultiplier where
  arbitrary = sized genFineTuneDPOMethodHyperparametersLearningRateMultiplier

genFineTuneDPOMethodHyperparametersLearningRateMultiplier :: Int -> Gen FineTuneDPOMethodHyperparametersLearningRateMultiplier
genFineTuneDPOMethodHyperparametersLearningRateMultiplier n =
  
  pure FineTuneDPOMethodHyperparametersLearningRateMultiplier
   
instance Arbitrary FineTuneDPOMethodHyperparametersNEpochs where
  arbitrary = sized genFineTuneDPOMethodHyperparametersNEpochs

genFineTuneDPOMethodHyperparametersNEpochs :: Int -> Gen FineTuneDPOMethodHyperparametersNEpochs
genFineTuneDPOMethodHyperparametersNEpochs n =
  
  pure FineTuneDPOMethodHyperparametersNEpochs
   
instance Arbitrary FineTuneMethod where
  arbitrary = sized genFineTuneMethod

genFineTuneMethod :: Int -> Gen FineTuneMethod
genFineTuneMethod n =
  FineTuneMethod
    <$> arbitraryReducedMaybe n -- fineTuneMethodType :: Maybe E'Type15
    <*> arbitraryReducedMaybe n -- fineTuneMethodSupervised :: Maybe FineTuneSupervisedMethod
    <*> arbitraryReducedMaybe n -- fineTuneMethodDpo :: Maybe FineTuneDPOMethod
  
instance Arbitrary FineTunePreferenceRequestInput where
  arbitrary = sized genFineTunePreferenceRequestInput

genFineTunePreferenceRequestInput :: Int -> Gen FineTunePreferenceRequestInput
genFineTunePreferenceRequestInput n =
  FineTunePreferenceRequestInput
    <$> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputInput :: Maybe FineTunePreferenceRequestInputInput
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputPreferredCompletion :: Maybe [FineTunePreferenceRequestInputPreferredCompletionInner]
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputNonPreferredCompletion :: Maybe [FineTunePreferenceRequestInputPreferredCompletionInner]
  
instance Arbitrary FineTunePreferenceRequestInputInput where
  arbitrary = sized genFineTunePreferenceRequestInputInput

genFineTunePreferenceRequestInputInput :: Int -> Gen FineTunePreferenceRequestInputInput
genFineTunePreferenceRequestInputInput n =
  FineTunePreferenceRequestInputInput
    <$> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputInputMessages :: Maybe [FineTuneChatRequestInputMessagesInner]
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputInputTools :: Maybe [ChatCompletionTool]
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputInputParallelToolCalls :: Maybe Bool
  
instance Arbitrary FineTunePreferenceRequestInputPreferredCompletionInner where
  arbitrary = sized genFineTunePreferenceRequestInputPreferredCompletionInner

genFineTunePreferenceRequestInputPreferredCompletionInner :: Int -> Gen FineTunePreferenceRequestInputPreferredCompletionInner
genFineTunePreferenceRequestInputPreferredCompletionInner n =
  FineTunePreferenceRequestInputPreferredCompletionInner
    <$> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputPreferredCompletionInnerContent :: Maybe ChatCompletionRequestAssistantMessageContent
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputPreferredCompletionInnerRefusal :: Maybe Text
    <*> arbitrary -- fineTunePreferenceRequestInputPreferredCompletionInnerRole :: E'Object
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputPreferredCompletionInnerName :: Maybe Text
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputPreferredCompletionInnerAudio :: Maybe ChatCompletionRequestAssistantMessageAudio
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputPreferredCompletionInnerToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitraryReducedMaybe n -- fineTunePreferenceRequestInputPreferredCompletionInnerFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
  
instance Arbitrary FineTuneSupervisedMethod where
  arbitrary = sized genFineTuneSupervisedMethod

genFineTuneSupervisedMethod :: Int -> Gen FineTuneSupervisedMethod
genFineTuneSupervisedMethod n =
  FineTuneSupervisedMethod
    <$> arbitraryReducedMaybe n -- fineTuneSupervisedMethodHyperparameters :: Maybe FineTuneSupervisedMethodHyperparameters
  
instance Arbitrary FineTuneSupervisedMethodHyperparameters where
  arbitrary = sized genFineTuneSupervisedMethodHyperparameters

genFineTuneSupervisedMethodHyperparameters :: Int -> Gen FineTuneSupervisedMethodHyperparameters
genFineTuneSupervisedMethodHyperparameters n =
  FineTuneSupervisedMethodHyperparameters
    <$> arbitraryReducedMaybe n -- fineTuneSupervisedMethodHyperparametersBatchSize :: Maybe FineTuneDPOMethodHyperparametersBatchSize
    <*> arbitraryReducedMaybe n -- fineTuneSupervisedMethodHyperparametersLearningRateMultiplier :: Maybe FineTuneDPOMethodHyperparametersLearningRateMultiplier
    <*> arbitraryReducedMaybe n -- fineTuneSupervisedMethodHyperparametersNEpochs :: Maybe FineTuneDPOMethodHyperparametersNEpochs
  
instance Arbitrary FineTuningIntegration where
  arbitrary = sized genFineTuningIntegration

genFineTuningIntegration :: Int -> Gen FineTuningIntegration
genFineTuningIntegration n =
  FineTuningIntegration
    <$> arbitrary -- fineTuningIntegrationType :: E'Type16
    <*> arbitraryReduced n -- fineTuningIntegrationWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb
  
instance Arbitrary FineTuningJob where
  arbitrary = sized genFineTuningJob

genFineTuningJob :: Int -> Gen FineTuningJob
genFineTuningJob n =
  FineTuningJob
    <$> arbitrary -- fineTuningJobId :: Text
    <*> arbitrary -- fineTuningJobCreatedAt :: Int
    <*> arbitraryReduced n -- fineTuningJobError :: FineTuningJobError
    <*> arbitrary -- fineTuningJobFineTunedModel :: Text
    <*> arbitrary -- fineTuningJobFinishedAt :: Int
    <*> arbitraryReduced n -- fineTuningJobHyperparameters :: FineTuningJobHyperparameters
    <*> arbitrary -- fineTuningJobModel :: Text
    <*> arbitrary -- fineTuningJobObject :: E'Object15
    <*> arbitrary -- fineTuningJobOrganizationId :: Text
    <*> arbitrary -- fineTuningJobResultFiles :: [Text]
    <*> arbitrary -- fineTuningJobStatus :: E'Status2
    <*> arbitrary -- fineTuningJobTrainedTokens :: Int
    <*> arbitrary -- fineTuningJobTrainingFile :: Text
    <*> arbitrary -- fineTuningJobValidationFile :: Text
    <*> arbitraryReducedMaybe n -- fineTuningJobIntegrations :: Maybe [FineTuningJobIntegrationsInner]
    <*> arbitrary -- fineTuningJobSeed :: Int
    <*> arbitraryReducedMaybe n -- fineTuningJobEstimatedFinish :: Maybe Int
    <*> arbitraryReducedMaybe n -- fineTuningJobMethod :: Maybe FineTuneMethod
  
instance Arbitrary FineTuningJobCheckpoint where
  arbitrary = sized genFineTuningJobCheckpoint

genFineTuningJobCheckpoint :: Int -> Gen FineTuningJobCheckpoint
genFineTuningJobCheckpoint n =
  FineTuningJobCheckpoint
    <$> arbitrary -- fineTuningJobCheckpointId :: Text
    <*> arbitrary -- fineTuningJobCheckpointCreatedAt :: Int
    <*> arbitrary -- fineTuningJobCheckpointFineTunedModelCheckpoint :: Text
    <*> arbitrary -- fineTuningJobCheckpointStepNumber :: Int
    <*> arbitraryReduced n -- fineTuningJobCheckpointMetrics :: FineTuningJobCheckpointMetrics
    <*> arbitrary -- fineTuningJobCheckpointFineTuningJobId :: Text
    <*> arbitrary -- fineTuningJobCheckpointObject :: E'Object16
  
instance Arbitrary FineTuningJobCheckpointMetrics where
  arbitrary = sized genFineTuningJobCheckpointMetrics

genFineTuningJobCheckpointMetrics :: Int -> Gen FineTuningJobCheckpointMetrics
genFineTuningJobCheckpointMetrics n =
  FineTuningJobCheckpointMetrics
    <$> arbitraryReducedMaybe n -- fineTuningJobCheckpointMetricsStep :: Maybe Double
    <*> arbitraryReducedMaybe n -- fineTuningJobCheckpointMetricsTrainLoss :: Maybe Double
    <*> arbitraryReducedMaybe n -- fineTuningJobCheckpointMetricsTrainMeanTokenAccuracy :: Maybe Double
    <*> arbitraryReducedMaybe n -- fineTuningJobCheckpointMetricsValidLoss :: Maybe Double
    <*> arbitraryReducedMaybe n -- fineTuningJobCheckpointMetricsValidMeanTokenAccuracy :: Maybe Double
    <*> arbitraryReducedMaybe n -- fineTuningJobCheckpointMetricsFullValidLoss :: Maybe Double
    <*> arbitraryReducedMaybe n -- fineTuningJobCheckpointMetricsFullValidMeanTokenAccuracy :: Maybe Double
  
instance Arbitrary FineTuningJobError where
  arbitrary = sized genFineTuningJobError

genFineTuningJobError :: Int -> Gen FineTuningJobError
genFineTuningJobError n =
  FineTuningJobError
    <$> arbitrary -- fineTuningJobErrorCode :: Text
    <*> arbitrary -- fineTuningJobErrorMessage :: Text
    <*> arbitrary -- fineTuningJobErrorParam :: Text
  
instance Arbitrary FineTuningJobEvent where
  arbitrary = sized genFineTuningJobEvent

genFineTuningJobEvent :: Int -> Gen FineTuningJobEvent
genFineTuningJobEvent n =
  FineTuningJobEvent
    <$> arbitrary -- fineTuningJobEventObject :: E'Object17
    <*> arbitrary -- fineTuningJobEventId :: Text
    <*> arbitrary -- fineTuningJobEventCreatedAt :: Int
    <*> arbitrary -- fineTuningJobEventLevel :: E'Level
    <*> arbitrary -- fineTuningJobEventMessage :: Text
    <*> arbitraryReducedMaybe n -- fineTuningJobEventType :: Maybe E'Type17
    <*> arbitraryReducedMaybeValue n -- fineTuningJobEventData :: Maybe A.Value
  
instance Arbitrary FineTuningJobHyperparameters where
  arbitrary = sized genFineTuningJobHyperparameters

genFineTuningJobHyperparameters :: Int -> Gen FineTuningJobHyperparameters
genFineTuningJobHyperparameters n =
  FineTuningJobHyperparameters
    <$> arbitraryReducedMaybe n -- fineTuningJobHyperparametersBatchSize :: Maybe CreateFineTuningJobRequestHyperparametersBatchSize
    <*> arbitraryReducedMaybe n -- fineTuningJobHyperparametersLearningRateMultiplier :: Maybe CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
    <*> arbitraryReducedMaybe n -- fineTuningJobHyperparametersNEpochs :: Maybe CreateFineTuningJobRequestHyperparametersNEpochs
  
instance Arbitrary FineTuningJobIntegrationsInner where
  arbitrary = sized genFineTuningJobIntegrationsInner

genFineTuningJobIntegrationsInner :: Int -> Gen FineTuningJobIntegrationsInner
genFineTuningJobIntegrationsInner n =
  FineTuningJobIntegrationsInner
    <$> arbitrary -- fineTuningJobIntegrationsInnerType :: E'Type16
    <*> arbitraryReduced n -- fineTuningJobIntegrationsInnerWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb
  
instance Arbitrary FunctionObject where
  arbitrary = sized genFunctionObject

genFunctionObject :: Int -> Gen FunctionObject
genFunctionObject n =
  FunctionObject
    <$> arbitraryReducedMaybe n -- functionObjectDescription :: Maybe Text
    <*> arbitrary -- functionObjectName :: Text
    <*> arbitraryReducedMaybe n -- functionObjectParameters :: Maybe (Map.Map String AnyType)
    <*> arbitraryReducedMaybe n -- functionObjectStrict :: Maybe Bool
  
instance Arbitrary Image where
  arbitrary = sized genImage

genImage :: Int -> Gen Image
genImage n =
  Image
    <$> arbitraryReducedMaybe n -- imageB64Json :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageRevisedPrompt :: Maybe Text
  
instance Arbitrary ImagesResponse where
  arbitrary = sized genImagesResponse

genImagesResponse :: Int -> Gen ImagesResponse
genImagesResponse n =
  ImagesResponse
    <$> arbitrary -- imagesResponseCreated :: Int
    <*> arbitraryReduced n -- imagesResponseData :: [Image]
  
instance Arbitrary Invite where
  arbitrary = sized genInvite

genInvite :: Int -> Gen Invite
genInvite n =
  Invite
    <$> arbitrary -- inviteObject :: E'Object18
    <*> arbitrary -- inviteId :: Text
    <*> arbitrary -- inviteEmail :: Text
    <*> arbitrary -- inviteRole :: E'Role7
    <*> arbitrary -- inviteStatus :: E'Status3
    <*> arbitrary -- inviteInvitedAt :: Int
    <*> arbitrary -- inviteExpiresAt :: Int
    <*> arbitraryReducedMaybe n -- inviteAcceptedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- inviteProjects :: Maybe [InviteProjectsInner]
  
instance Arbitrary InviteDeleteResponse where
  arbitrary = sized genInviteDeleteResponse

genInviteDeleteResponse :: Int -> Gen InviteDeleteResponse
genInviteDeleteResponse n =
  InviteDeleteResponse
    <$> arbitrary -- inviteDeleteResponseObject :: E'Object19
    <*> arbitrary -- inviteDeleteResponseId :: Text
    <*> arbitrary -- inviteDeleteResponseDeleted :: Bool
  
instance Arbitrary InviteListResponse where
  arbitrary = sized genInviteListResponse

genInviteListResponse :: Int -> Gen InviteListResponse
genInviteListResponse n =
  InviteListResponse
    <$> arbitrary -- inviteListResponseObject :: E'Object7
    <*> arbitraryReduced n -- inviteListResponseData :: [Invite]
    <*> arbitraryReducedMaybe n -- inviteListResponseFirstId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteListResponseLastId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteListResponseHasMore :: Maybe Bool
  
instance Arbitrary InviteProjectsInner where
  arbitrary = sized genInviteProjectsInner

genInviteProjectsInner :: Int -> Gen InviteProjectsInner
genInviteProjectsInner n =
  InviteProjectsInner
    <$> arbitraryReducedMaybe n -- inviteProjectsInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteProjectsInnerRole :: Maybe E'Role12
  
instance Arbitrary InviteRequest where
  arbitrary = sized genInviteRequest

genInviteRequest :: Int -> Gen InviteRequest
genInviteRequest n =
  InviteRequest
    <$> arbitrary -- inviteRequestEmail :: Text
    <*> arbitrary -- inviteRequestRole :: E'Role8
    <*> arbitraryReducedMaybe n -- inviteRequestProjects :: Maybe [InviteRequestProjectsInner]
  
instance Arbitrary InviteRequestProjectsInner where
  arbitrary = sized genInviteRequestProjectsInner

genInviteRequestProjectsInner :: Int -> Gen InviteRequestProjectsInner
genInviteRequestProjectsInner n =
  InviteRequestProjectsInner
    <$> arbitrary -- inviteRequestProjectsInnerId :: Text
    <*> arbitrary -- inviteRequestProjectsInnerRole :: E'Role12
  
instance Arbitrary ListAssistantsResponse where
  arbitrary = sized genListAssistantsResponse

genListAssistantsResponse :: Int -> Gen ListAssistantsResponse
genListAssistantsResponse n =
  ListAssistantsResponse
    <$> arbitrary -- listAssistantsResponseObject :: Text
    <*> arbitraryReduced n -- listAssistantsResponseData :: [AssistantObject]
    <*> arbitrary -- listAssistantsResponseFirstId :: Text
    <*> arbitrary -- listAssistantsResponseLastId :: Text
    <*> arbitrary -- listAssistantsResponseHasMore :: Bool
  
instance Arbitrary ListAuditLogsEffectiveAtParameter where
  arbitrary = sized genListAuditLogsEffectiveAtParameter

genListAuditLogsEffectiveAtParameter :: Int -> Gen ListAuditLogsEffectiveAtParameter
genListAuditLogsEffectiveAtParameter n =
  ListAuditLogsEffectiveAtParameter
    <$> arbitraryReducedMaybe n -- listAuditLogsEffectiveAtParameterGt :: Maybe Int
    <*> arbitraryReducedMaybe n -- listAuditLogsEffectiveAtParameterGte :: Maybe Int
    <*> arbitraryReducedMaybe n -- listAuditLogsEffectiveAtParameterLt :: Maybe Int
    <*> arbitraryReducedMaybe n -- listAuditLogsEffectiveAtParameterLte :: Maybe Int
  
instance Arbitrary ListAuditLogsResponse where
  arbitrary = sized genListAuditLogsResponse

genListAuditLogsResponse :: Int -> Gen ListAuditLogsResponse
genListAuditLogsResponse n =
  ListAuditLogsResponse
    <$> arbitrary -- listAuditLogsResponseObject :: E'Object7
    <*> arbitraryReduced n -- listAuditLogsResponseData :: [AuditLog]
    <*> arbitrary -- listAuditLogsResponseFirstId :: Text
    <*> arbitrary -- listAuditLogsResponseLastId :: Text
    <*> arbitrary -- listAuditLogsResponseHasMore :: Bool
  
instance Arbitrary ListBatchesResponse where
  arbitrary = sized genListBatchesResponse

genListBatchesResponse :: Int -> Gen ListBatchesResponse
genListBatchesResponse n =
  ListBatchesResponse
    <$> arbitraryReduced n -- listBatchesResponseData :: [Batch]
    <*> arbitraryReducedMaybe n -- listBatchesResponseFirstId :: Maybe Text
    <*> arbitraryReducedMaybe n -- listBatchesResponseLastId :: Maybe Text
    <*> arbitrary -- listBatchesResponseHasMore :: Bool
    <*> arbitrary -- listBatchesResponseObject :: E'Object7
  
instance Arbitrary ListFilesResponse where
  arbitrary = sized genListFilesResponse

genListFilesResponse :: Int -> Gen ListFilesResponse
genListFilesResponse n =
  ListFilesResponse
    <$> arbitrary -- listFilesResponseObject :: Text
    <*> arbitraryReduced n -- listFilesResponseData :: [OpenAIFile]
    <*> arbitrary -- listFilesResponseFirstId :: Text
    <*> arbitrary -- listFilesResponseLastId :: Text
    <*> arbitrary -- listFilesResponseHasMore :: Bool
  
instance Arbitrary ListFineTuningJobCheckpointsResponse where
  arbitrary = sized genListFineTuningJobCheckpointsResponse

genListFineTuningJobCheckpointsResponse :: Int -> Gen ListFineTuningJobCheckpointsResponse
genListFineTuningJobCheckpointsResponse n =
  ListFineTuningJobCheckpointsResponse
    <$> arbitraryReduced n -- listFineTuningJobCheckpointsResponseData :: [FineTuningJobCheckpoint]
    <*> arbitrary -- listFineTuningJobCheckpointsResponseObject :: E'Object7
    <*> arbitraryReducedMaybe n -- listFineTuningJobCheckpointsResponseFirstId :: Maybe Text
    <*> arbitraryReducedMaybe n -- listFineTuningJobCheckpointsResponseLastId :: Maybe Text
    <*> arbitrary -- listFineTuningJobCheckpointsResponseHasMore :: Bool
  
instance Arbitrary ListFineTuningJobEventsResponse where
  arbitrary = sized genListFineTuningJobEventsResponse

genListFineTuningJobEventsResponse :: Int -> Gen ListFineTuningJobEventsResponse
genListFineTuningJobEventsResponse n =
  ListFineTuningJobEventsResponse
    <$> arbitraryReduced n -- listFineTuningJobEventsResponseData :: [FineTuningJobEvent]
    <*> arbitrary -- listFineTuningJobEventsResponseObject :: E'Object7
  
instance Arbitrary ListMessagesResponse where
  arbitrary = sized genListMessagesResponse

genListMessagesResponse :: Int -> Gen ListMessagesResponse
genListMessagesResponse n =
  ListMessagesResponse
    <$> arbitrary -- listMessagesResponseObject :: Text
    <*> arbitraryReduced n -- listMessagesResponseData :: [MessageObject]
    <*> arbitrary -- listMessagesResponseFirstId :: Text
    <*> arbitrary -- listMessagesResponseLastId :: Text
    <*> arbitrary -- listMessagesResponseHasMore :: Bool
  
instance Arbitrary ListModelsResponse where
  arbitrary = sized genListModelsResponse

genListModelsResponse :: Int -> Gen ListModelsResponse
genListModelsResponse n =
  ListModelsResponse
    <$> arbitrary -- listModelsResponseObject :: E'Object7
    <*> arbitraryReduced n -- listModelsResponseData :: [Model]
  
instance Arbitrary ListPaginatedFineTuningJobsResponse where
  arbitrary = sized genListPaginatedFineTuningJobsResponse

genListPaginatedFineTuningJobsResponse :: Int -> Gen ListPaginatedFineTuningJobsResponse
genListPaginatedFineTuningJobsResponse n =
  ListPaginatedFineTuningJobsResponse
    <$> arbitraryReduced n -- listPaginatedFineTuningJobsResponseData :: [FineTuningJob]
    <*> arbitrary -- listPaginatedFineTuningJobsResponseHasMore :: Bool
    <*> arbitrary -- listPaginatedFineTuningJobsResponseObject :: E'Object7
  
instance Arbitrary ListRunStepsResponse where
  arbitrary = sized genListRunStepsResponse

genListRunStepsResponse :: Int -> Gen ListRunStepsResponse
genListRunStepsResponse n =
  ListRunStepsResponse
    <$> arbitrary -- listRunStepsResponseObject :: Text
    <*> arbitraryReduced n -- listRunStepsResponseData :: [RunStepObject]
    <*> arbitrary -- listRunStepsResponseFirstId :: Text
    <*> arbitrary -- listRunStepsResponseLastId :: Text
    <*> arbitrary -- listRunStepsResponseHasMore :: Bool
  
instance Arbitrary ListRunsResponse where
  arbitrary = sized genListRunsResponse

genListRunsResponse :: Int -> Gen ListRunsResponse
genListRunsResponse n =
  ListRunsResponse
    <$> arbitrary -- listRunsResponseObject :: Text
    <*> arbitraryReduced n -- listRunsResponseData :: [RunObject]
    <*> arbitrary -- listRunsResponseFirstId :: Text
    <*> arbitrary -- listRunsResponseLastId :: Text
    <*> arbitrary -- listRunsResponseHasMore :: Bool
  
instance Arbitrary ListThreadsResponse where
  arbitrary = sized genListThreadsResponse

genListThreadsResponse :: Int -> Gen ListThreadsResponse
genListThreadsResponse n =
  ListThreadsResponse
    <$> arbitrary -- listThreadsResponseObject :: Text
    <*> arbitraryReduced n -- listThreadsResponseData :: [ThreadObject]
    <*> arbitrary -- listThreadsResponseFirstId :: Text
    <*> arbitrary -- listThreadsResponseLastId :: Text
    <*> arbitrary -- listThreadsResponseHasMore :: Bool
  
instance Arbitrary ListVectorStoreFilesResponse where
  arbitrary = sized genListVectorStoreFilesResponse

genListVectorStoreFilesResponse :: Int -> Gen ListVectorStoreFilesResponse
genListVectorStoreFilesResponse n =
  ListVectorStoreFilesResponse
    <$> arbitrary -- listVectorStoreFilesResponseObject :: Text
    <*> arbitraryReduced n -- listVectorStoreFilesResponseData :: [VectorStoreFileObject]
    <*> arbitrary -- listVectorStoreFilesResponseFirstId :: Text
    <*> arbitrary -- listVectorStoreFilesResponseLastId :: Text
    <*> arbitrary -- listVectorStoreFilesResponseHasMore :: Bool
  
instance Arbitrary ListVectorStoresResponse where
  arbitrary = sized genListVectorStoresResponse

genListVectorStoresResponse :: Int -> Gen ListVectorStoresResponse
genListVectorStoresResponse n =
  ListVectorStoresResponse
    <$> arbitrary -- listVectorStoresResponseObject :: Text
    <*> arbitraryReduced n -- listVectorStoresResponseData :: [VectorStoreObject]
    <*> arbitrary -- listVectorStoresResponseFirstId :: Text
    <*> arbitrary -- listVectorStoresResponseLastId :: Text
    <*> arbitrary -- listVectorStoresResponseHasMore :: Bool
  
instance Arbitrary MessageContentImageFileObject where
  arbitrary = sized genMessageContentImageFileObject

genMessageContentImageFileObject :: Int -> Gen MessageContentImageFileObject
genMessageContentImageFileObject n =
  MessageContentImageFileObject
    <$> arbitrary -- messageContentImageFileObjectType :: E'Type18
    <*> arbitraryReduced n -- messageContentImageFileObjectImageFile :: MessageContentImageFileObjectImageFile
  
instance Arbitrary MessageContentImageFileObjectImageFile where
  arbitrary = sized genMessageContentImageFileObjectImageFile

genMessageContentImageFileObjectImageFile :: Int -> Gen MessageContentImageFileObjectImageFile
genMessageContentImageFileObjectImageFile n =
  MessageContentImageFileObjectImageFile
    <$> arbitrary -- messageContentImageFileObjectImageFileFileId :: Text
    <*> arbitraryReducedMaybe n -- messageContentImageFileObjectImageFileDetail :: Maybe E'Detail
  
instance Arbitrary MessageContentImageUrlObject where
  arbitrary = sized genMessageContentImageUrlObject

genMessageContentImageUrlObject :: Int -> Gen MessageContentImageUrlObject
genMessageContentImageUrlObject n =
  MessageContentImageUrlObject
    <$> arbitrary -- messageContentImageUrlObjectType :: E'Type10
    <*> arbitraryReduced n -- messageContentImageUrlObjectImageUrl :: MessageContentImageUrlObjectImageUrl
  
instance Arbitrary MessageContentImageUrlObjectImageUrl where
  arbitrary = sized genMessageContentImageUrlObjectImageUrl

genMessageContentImageUrlObjectImageUrl :: Int -> Gen MessageContentImageUrlObjectImageUrl
genMessageContentImageUrlObjectImageUrl n =
  MessageContentImageUrlObjectImageUrl
    <$> arbitrary -- messageContentImageUrlObjectImageUrlUrl :: Text
    <*> arbitraryReducedMaybe n -- messageContentImageUrlObjectImageUrlDetail :: Maybe E'Detail
  
instance Arbitrary MessageContentRefusalObject where
  arbitrary = sized genMessageContentRefusalObject

genMessageContentRefusalObject :: Int -> Gen MessageContentRefusalObject
genMessageContentRefusalObject n =
  MessageContentRefusalObject
    <$> arbitrary -- messageContentRefusalObjectType :: E'Type11
    <*> arbitrary -- messageContentRefusalObjectRefusal :: Text
  
instance Arbitrary MessageContentTextAnnotationsFileCitationObject where
  arbitrary = sized genMessageContentTextAnnotationsFileCitationObject

genMessageContentTextAnnotationsFileCitationObject :: Int -> Gen MessageContentTextAnnotationsFileCitationObject
genMessageContentTextAnnotationsFileCitationObject n =
  MessageContentTextAnnotationsFileCitationObject
    <$> arbitrary -- messageContentTextAnnotationsFileCitationObjectType :: E'Type19
    <*> arbitrary -- messageContentTextAnnotationsFileCitationObjectText :: Text
    <*> arbitraryReduced n -- messageContentTextAnnotationsFileCitationObjectFileCitation :: MessageContentTextAnnotationsFileCitationObjectFileCitation
    <*> arbitrary -- messageContentTextAnnotationsFileCitationObjectStartIndex :: Int
    <*> arbitrary -- messageContentTextAnnotationsFileCitationObjectEndIndex :: Int
  
instance Arbitrary MessageContentTextAnnotationsFileCitationObjectFileCitation where
  arbitrary = sized genMessageContentTextAnnotationsFileCitationObjectFileCitation

genMessageContentTextAnnotationsFileCitationObjectFileCitation :: Int -> Gen MessageContentTextAnnotationsFileCitationObjectFileCitation
genMessageContentTextAnnotationsFileCitationObjectFileCitation n =
  MessageContentTextAnnotationsFileCitationObjectFileCitation
    <$> arbitrary -- messageContentTextAnnotationsFileCitationObjectFileCitationFileId :: Text
  
instance Arbitrary MessageContentTextAnnotationsFilePathObject where
  arbitrary = sized genMessageContentTextAnnotationsFilePathObject

genMessageContentTextAnnotationsFilePathObject :: Int -> Gen MessageContentTextAnnotationsFilePathObject
genMessageContentTextAnnotationsFilePathObject n =
  MessageContentTextAnnotationsFilePathObject
    <$> arbitrary -- messageContentTextAnnotationsFilePathObjectType :: E'Type20
    <*> arbitrary -- messageContentTextAnnotationsFilePathObjectText :: Text
    <*> arbitraryReduced n -- messageContentTextAnnotationsFilePathObjectFilePath :: MessageContentTextAnnotationsFilePathObjectFilePath
    <*> arbitrary -- messageContentTextAnnotationsFilePathObjectStartIndex :: Int
    <*> arbitrary -- messageContentTextAnnotationsFilePathObjectEndIndex :: Int
  
instance Arbitrary MessageContentTextAnnotationsFilePathObjectFilePath where
  arbitrary = sized genMessageContentTextAnnotationsFilePathObjectFilePath

genMessageContentTextAnnotationsFilePathObjectFilePath :: Int -> Gen MessageContentTextAnnotationsFilePathObjectFilePath
genMessageContentTextAnnotationsFilePathObjectFilePath n =
  MessageContentTextAnnotationsFilePathObjectFilePath
    <$> arbitrary -- messageContentTextAnnotationsFilePathObjectFilePathFileId :: Text
  
instance Arbitrary MessageContentTextObject where
  arbitrary = sized genMessageContentTextObject

genMessageContentTextObject :: Int -> Gen MessageContentTextObject
genMessageContentTextObject n =
  MessageContentTextObject
    <$> arbitrary -- messageContentTextObjectType :: E'Type12
    <*> arbitraryReduced n -- messageContentTextObjectText :: MessageContentTextObjectText
  
instance Arbitrary MessageContentTextObjectText where
  arbitrary = sized genMessageContentTextObjectText

genMessageContentTextObjectText :: Int -> Gen MessageContentTextObjectText
genMessageContentTextObjectText n =
  MessageContentTextObjectText
    <$> arbitrary -- messageContentTextObjectTextValue :: Text
    <*> arbitraryReduced n -- messageContentTextObjectTextAnnotations :: [MessageContentTextObjectTextAnnotationsInner]
  
instance Arbitrary MessageContentTextObjectTextAnnotationsInner where
  arbitrary = sized genMessageContentTextObjectTextAnnotationsInner

genMessageContentTextObjectTextAnnotationsInner :: Int -> Gen MessageContentTextObjectTextAnnotationsInner
genMessageContentTextObjectTextAnnotationsInner n =
  MessageContentTextObjectTextAnnotationsInner
    <$> arbitrary -- messageContentTextObjectTextAnnotationsInnerType :: E'Type73
    <*> arbitrary -- messageContentTextObjectTextAnnotationsInnerText :: Text
    <*> arbitraryReduced n -- messageContentTextObjectTextAnnotationsInnerFileCitation :: MessageContentTextAnnotationsFileCitationObjectFileCitation
    <*> arbitrary -- messageContentTextObjectTextAnnotationsInnerStartIndex :: Int
    <*> arbitrary -- messageContentTextObjectTextAnnotationsInnerEndIndex :: Int
    <*> arbitraryReduced n -- messageContentTextObjectTextAnnotationsInnerFilePath :: MessageContentTextAnnotationsFilePathObjectFilePath
  
instance Arbitrary MessageDeltaContentImageFileObject where
  arbitrary = sized genMessageDeltaContentImageFileObject

genMessageDeltaContentImageFileObject :: Int -> Gen MessageDeltaContentImageFileObject
genMessageDeltaContentImageFileObject n =
  MessageDeltaContentImageFileObject
    <$> arbitrary -- messageDeltaContentImageFileObjectIndex :: Int
    <*> arbitrary -- messageDeltaContentImageFileObjectType :: E'Type18
    <*> arbitraryReducedMaybe n -- messageDeltaContentImageFileObjectImageFile :: Maybe MessageDeltaContentImageFileObjectImageFile
  
instance Arbitrary MessageDeltaContentImageFileObjectImageFile where
  arbitrary = sized genMessageDeltaContentImageFileObjectImageFile

genMessageDeltaContentImageFileObjectImageFile :: Int -> Gen MessageDeltaContentImageFileObjectImageFile
genMessageDeltaContentImageFileObjectImageFile n =
  MessageDeltaContentImageFileObjectImageFile
    <$> arbitraryReducedMaybe n -- messageDeltaContentImageFileObjectImageFileFileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaContentImageFileObjectImageFileDetail :: Maybe E'Detail
  
instance Arbitrary MessageDeltaContentImageUrlObject where
  arbitrary = sized genMessageDeltaContentImageUrlObject

genMessageDeltaContentImageUrlObject :: Int -> Gen MessageDeltaContentImageUrlObject
genMessageDeltaContentImageUrlObject n =
  MessageDeltaContentImageUrlObject
    <$> arbitrary -- messageDeltaContentImageUrlObjectIndex :: Int
    <*> arbitrary -- messageDeltaContentImageUrlObjectType :: E'Type10
    <*> arbitraryReducedMaybe n -- messageDeltaContentImageUrlObjectImageUrl :: Maybe MessageDeltaContentImageUrlObjectImageUrl
  
instance Arbitrary MessageDeltaContentImageUrlObjectImageUrl where
  arbitrary = sized genMessageDeltaContentImageUrlObjectImageUrl

genMessageDeltaContentImageUrlObjectImageUrl :: Int -> Gen MessageDeltaContentImageUrlObjectImageUrl
genMessageDeltaContentImageUrlObjectImageUrl n =
  MessageDeltaContentImageUrlObjectImageUrl
    <$> arbitraryReducedMaybe n -- messageDeltaContentImageUrlObjectImageUrlUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaContentImageUrlObjectImageUrlDetail :: Maybe E'Detail
  
instance Arbitrary MessageDeltaContentRefusalObject where
  arbitrary = sized genMessageDeltaContentRefusalObject

genMessageDeltaContentRefusalObject :: Int -> Gen MessageDeltaContentRefusalObject
genMessageDeltaContentRefusalObject n =
  MessageDeltaContentRefusalObject
    <$> arbitrary -- messageDeltaContentRefusalObjectIndex :: Int
    <*> arbitrary -- messageDeltaContentRefusalObjectType :: E'Type11
    <*> arbitraryReducedMaybe n -- messageDeltaContentRefusalObjectRefusal :: Maybe Text
  
instance Arbitrary MessageDeltaContentTextAnnotationsFileCitationObject where
  arbitrary = sized genMessageDeltaContentTextAnnotationsFileCitationObject

genMessageDeltaContentTextAnnotationsFileCitationObject :: Int -> Gen MessageDeltaContentTextAnnotationsFileCitationObject
genMessageDeltaContentTextAnnotationsFileCitationObject n =
  MessageDeltaContentTextAnnotationsFileCitationObject
    <$> arbitrary -- messageDeltaContentTextAnnotationsFileCitationObjectIndex :: Int
    <*> arbitrary -- messageDeltaContentTextAnnotationsFileCitationObjectType :: E'Type19
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFileCitationObjectText :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFileCitationObjectFileCitation :: Maybe MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFileCitationObjectStartIndex :: Maybe Int
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFileCitationObjectEndIndex :: Maybe Int
  
instance Arbitrary MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation where
  arbitrary = sized genMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

genMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation :: Int -> Gen MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
genMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation n =
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    <$> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFileCitationObjectFileCitationFileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFileCitationObjectFileCitationQuote :: Maybe Text
  
instance Arbitrary MessageDeltaContentTextAnnotationsFilePathObject where
  arbitrary = sized genMessageDeltaContentTextAnnotationsFilePathObject

genMessageDeltaContentTextAnnotationsFilePathObject :: Int -> Gen MessageDeltaContentTextAnnotationsFilePathObject
genMessageDeltaContentTextAnnotationsFilePathObject n =
  MessageDeltaContentTextAnnotationsFilePathObject
    <$> arbitrary -- messageDeltaContentTextAnnotationsFilePathObjectIndex :: Int
    <*> arbitrary -- messageDeltaContentTextAnnotationsFilePathObjectType :: E'Type20
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFilePathObjectText :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFilePathObjectFilePath :: Maybe MessageDeltaContentTextAnnotationsFilePathObjectFilePath
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFilePathObjectStartIndex :: Maybe Int
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFilePathObjectEndIndex :: Maybe Int
  
instance Arbitrary MessageDeltaContentTextAnnotationsFilePathObjectFilePath where
  arbitrary = sized genMessageDeltaContentTextAnnotationsFilePathObjectFilePath

genMessageDeltaContentTextAnnotationsFilePathObjectFilePath :: Int -> Gen MessageDeltaContentTextAnnotationsFilePathObjectFilePath
genMessageDeltaContentTextAnnotationsFilePathObjectFilePath n =
  MessageDeltaContentTextAnnotationsFilePathObjectFilePath
    <$> arbitraryReducedMaybe n -- messageDeltaContentTextAnnotationsFilePathObjectFilePathFileId :: Maybe Text
  
instance Arbitrary MessageDeltaContentTextObject where
  arbitrary = sized genMessageDeltaContentTextObject

genMessageDeltaContentTextObject :: Int -> Gen MessageDeltaContentTextObject
genMessageDeltaContentTextObject n =
  MessageDeltaContentTextObject
    <$> arbitrary -- messageDeltaContentTextObjectIndex :: Int
    <*> arbitrary -- messageDeltaContentTextObjectType :: E'Type12
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextObjectText :: Maybe MessageDeltaContentTextObjectText
  
instance Arbitrary MessageDeltaContentTextObjectText where
  arbitrary = sized genMessageDeltaContentTextObjectText

genMessageDeltaContentTextObjectText :: Int -> Gen MessageDeltaContentTextObjectText
genMessageDeltaContentTextObjectText n =
  MessageDeltaContentTextObjectText
    <$> arbitraryReducedMaybe n -- messageDeltaContentTextObjectTextValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextObjectTextAnnotations :: Maybe [MessageDeltaContentTextObjectTextAnnotationsInner]
  
instance Arbitrary MessageDeltaContentTextObjectTextAnnotationsInner where
  arbitrary = sized genMessageDeltaContentTextObjectTextAnnotationsInner

genMessageDeltaContentTextObjectTextAnnotationsInner :: Int -> Gen MessageDeltaContentTextObjectTextAnnotationsInner
genMessageDeltaContentTextObjectTextAnnotationsInner n =
  MessageDeltaContentTextObjectTextAnnotationsInner
    <$> arbitrary -- messageDeltaContentTextObjectTextAnnotationsInnerIndex :: Int
    <*> arbitrary -- messageDeltaContentTextObjectTextAnnotationsInnerType :: E'Type73
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextObjectTextAnnotationsInnerText :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextObjectTextAnnotationsInnerFileCitation :: Maybe MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextObjectTextAnnotationsInnerStartIndex :: Maybe Int
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextObjectTextAnnotationsInnerEndIndex :: Maybe Int
    <*> arbitraryReducedMaybe n -- messageDeltaContentTextObjectTextAnnotationsInnerFilePath :: Maybe MessageDeltaContentTextAnnotationsFilePathObjectFilePath
  
instance Arbitrary MessageDeltaObject where
  arbitrary = sized genMessageDeltaObject

genMessageDeltaObject :: Int -> Gen MessageDeltaObject
genMessageDeltaObject n =
  MessageDeltaObject
    <$> arbitrary -- messageDeltaObjectId :: Text
    <*> arbitrary -- messageDeltaObjectObject :: E'Object20
    <*> arbitraryReduced n -- messageDeltaObjectDelta :: MessageDeltaObjectDelta
  
instance Arbitrary MessageDeltaObjectDelta where
  arbitrary = sized genMessageDeltaObjectDelta

genMessageDeltaObjectDelta :: Int -> Gen MessageDeltaObjectDelta
genMessageDeltaObjectDelta n =
  MessageDeltaObjectDelta
    <$> arbitraryReducedMaybe n -- messageDeltaObjectDeltaRole :: Maybe E'Role6
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContent :: Maybe [MessageDeltaObjectDeltaContentInner]
  
instance Arbitrary MessageDeltaObjectDeltaContentInner where
  arbitrary = sized genMessageDeltaObjectDeltaContentInner

genMessageDeltaObjectDeltaContentInner :: Int -> Gen MessageDeltaObjectDeltaContentInner
genMessageDeltaObjectDeltaContentInner n =
  MessageDeltaObjectDeltaContentInner
    <$> arbitrary -- messageDeltaObjectDeltaContentInnerIndex :: Int
    <*> arbitrary -- messageDeltaObjectDeltaContentInnerType :: E'Type74
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContentInnerImageFile :: Maybe MessageDeltaContentImageFileObjectImageFile
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContentInnerText :: Maybe MessageDeltaContentTextObjectText
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContentInnerRefusal :: Maybe Text
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContentInnerImageUrl :: Maybe MessageDeltaContentImageUrlObjectImageUrl
  
instance Arbitrary MessageObject where
  arbitrary = sized genMessageObject

genMessageObject :: Int -> Gen MessageObject
genMessageObject n =
  MessageObject
    <$> arbitrary -- messageObjectId :: Text
    <*> arbitrary -- messageObjectObject :: E'Object21
    <*> arbitrary -- messageObjectCreatedAt :: Int
    <*> arbitrary -- messageObjectThreadId :: Text
    <*> arbitrary -- messageObjectStatus :: E'Status4
    <*> arbitraryReduced n -- messageObjectIncompleteDetails :: MessageObjectIncompleteDetails
    <*> arbitrary -- messageObjectCompletedAt :: Int
    <*> arbitrary -- messageObjectIncompleteAt :: Int
    <*> arbitrary -- messageObjectRole :: E'Role6
    <*> arbitraryReduced n -- messageObjectContent :: [MessageObjectContentInner]
    <*> arbitrary -- messageObjectAssistantId :: Text
    <*> arbitrary -- messageObjectRunId :: Text
    <*> arbitraryReduced n -- messageObjectAttachments :: [CreateMessageRequestAttachmentsInner]
    <*> arbitraryReduced n -- messageObjectMetadata :: A.Value
  
instance Arbitrary MessageObjectContentInner where
  arbitrary = sized genMessageObjectContentInner

genMessageObjectContentInner :: Int -> Gen MessageObjectContentInner
genMessageObjectContentInner n =
  MessageObjectContentInner
    <$> arbitrary -- messageObjectContentInnerType :: E'Type75
    <*> arbitraryReduced n -- messageObjectContentInnerImageFile :: MessageContentImageFileObjectImageFile
    <*> arbitraryReduced n -- messageObjectContentInnerImageUrl :: MessageContentImageUrlObjectImageUrl
    <*> arbitraryReduced n -- messageObjectContentInnerText :: MessageContentTextObjectText
    <*> arbitrary -- messageObjectContentInnerRefusal :: Text
  
instance Arbitrary MessageObjectIncompleteDetails where
  arbitrary = sized genMessageObjectIncompleteDetails

genMessageObjectIncompleteDetails :: Int -> Gen MessageObjectIncompleteDetails
genMessageObjectIncompleteDetails n =
  MessageObjectIncompleteDetails
    <$> arbitrary -- messageObjectIncompleteDetailsReason :: E'Reason
  
instance Arbitrary MessageRequestContentTextObject where
  arbitrary = sized genMessageRequestContentTextObject

genMessageRequestContentTextObject :: Int -> Gen MessageRequestContentTextObject
genMessageRequestContentTextObject n =
  MessageRequestContentTextObject
    <$> arbitrary -- messageRequestContentTextObjectType :: E'Type12
    <*> arbitrary -- messageRequestContentTextObjectText :: Text
  
instance Arbitrary MessageStreamEvent where
  arbitrary = sized genMessageStreamEvent

genMessageStreamEvent :: Int -> Gen MessageStreamEvent
genMessageStreamEvent n =
  MessageStreamEvent
    <$> arbitrary -- messageStreamEventEvent :: E'Event3
    <*> arbitraryReduced n -- messageStreamEventData :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf where
  arbitrary = sized genMessageStreamEventOneOf

genMessageStreamEventOneOf :: Int -> Gen MessageStreamEventOneOf
genMessageStreamEventOneOf n =
  MessageStreamEventOneOf
    <$> arbitrary -- messageStreamEventOneOfEvent :: E'Event7
    <*> arbitraryReduced n -- messageStreamEventOneOfData :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf1 where
  arbitrary = sized genMessageStreamEventOneOf1

genMessageStreamEventOneOf1 :: Int -> Gen MessageStreamEventOneOf1
genMessageStreamEventOneOf1 n =
  MessageStreamEventOneOf1
    <$> arbitrary -- messageStreamEventOneOf1Event :: E'Event8
    <*> arbitraryReduced n -- messageStreamEventOneOf1Data :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf2 where
  arbitrary = sized genMessageStreamEventOneOf2

genMessageStreamEventOneOf2 :: Int -> Gen MessageStreamEventOneOf2
genMessageStreamEventOneOf2 n =
  MessageStreamEventOneOf2
    <$> arbitrary -- messageStreamEventOneOf2Event :: E'Object20
    <*> arbitraryReduced n -- messageStreamEventOneOf2Data :: MessageDeltaObject
  
instance Arbitrary MessageStreamEventOneOf3 where
  arbitrary = sized genMessageStreamEventOneOf3

genMessageStreamEventOneOf3 :: Int -> Gen MessageStreamEventOneOf3
genMessageStreamEventOneOf3 n =
  MessageStreamEventOneOf3
    <$> arbitrary -- messageStreamEventOneOf3Event :: E'Event9
    <*> arbitraryReduced n -- messageStreamEventOneOf3Data :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf4 where
  arbitrary = sized genMessageStreamEventOneOf4

genMessageStreamEventOneOf4 :: Int -> Gen MessageStreamEventOneOf4
genMessageStreamEventOneOf4 n =
  MessageStreamEventOneOf4
    <$> arbitrary -- messageStreamEventOneOf4Event :: E'Event3
    <*> arbitraryReduced n -- messageStreamEventOneOf4Data :: MessageObject
  
instance Arbitrary Model where
  arbitrary = sized genModel

genModel :: Int -> Gen Model
genModel n =
  Model
    <$> arbitrary -- modelId :: Text
    <*> arbitrary -- modelCreated :: Int
    <*> arbitrary -- modelObject :: E'Object22
    <*> arbitrary -- modelOwnedBy :: Text
  
instance Arbitrary ModifyAssistantRequest where
  arbitrary = sized genModifyAssistantRequest

genModifyAssistantRequest :: Int -> Gen ModifyAssistantRequest
genModifyAssistantRequest n =
  ModifyAssistantRequest
    <$> arbitraryReducedMaybe n -- modifyAssistantRequestModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestTools :: Maybe [AssistantObjectToolsInner]
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestToolResources :: Maybe ModifyAssistantRequestToolResources
    <*> arbitraryReducedMaybeValue n -- modifyAssistantRequestMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestResponseFormat :: Maybe AssistantsApiResponseFormatOption
  
instance Arbitrary ModifyAssistantRequestToolResources where
  arbitrary = sized genModifyAssistantRequestToolResources

genModifyAssistantRequestToolResources :: Int -> Gen ModifyAssistantRequestToolResources
genModifyAssistantRequestToolResources n =
  ModifyAssistantRequestToolResources
    <$> arbitraryReducedMaybe n -- modifyAssistantRequestToolResourcesCodeInterpreter :: Maybe ModifyAssistantRequestToolResourcesCodeInterpreter
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestToolResourcesFileSearch :: Maybe ModifyAssistantRequestToolResourcesFileSearch
  
instance Arbitrary ModifyAssistantRequestToolResourcesCodeInterpreter where
  arbitrary = sized genModifyAssistantRequestToolResourcesCodeInterpreter

genModifyAssistantRequestToolResourcesCodeInterpreter :: Int -> Gen ModifyAssistantRequestToolResourcesCodeInterpreter
genModifyAssistantRequestToolResourcesCodeInterpreter n =
  ModifyAssistantRequestToolResourcesCodeInterpreter
    <$> arbitraryReducedMaybe n -- modifyAssistantRequestToolResourcesCodeInterpreterFileIds :: Maybe [Text]
  
instance Arbitrary ModifyAssistantRequestToolResourcesFileSearch where
  arbitrary = sized genModifyAssistantRequestToolResourcesFileSearch

genModifyAssistantRequestToolResourcesFileSearch :: Int -> Gen ModifyAssistantRequestToolResourcesFileSearch
genModifyAssistantRequestToolResourcesFileSearch n =
  ModifyAssistantRequestToolResourcesFileSearch
    <$> arbitraryReducedMaybe n -- modifyAssistantRequestToolResourcesFileSearchVectorStoreIds :: Maybe [Text]
  
instance Arbitrary ModifyMessageRequest where
  arbitrary = sized genModifyMessageRequest

genModifyMessageRequest :: Int -> Gen ModifyMessageRequest
genModifyMessageRequest n =
  ModifyMessageRequest
    <$> arbitraryReducedMaybeValue n -- modifyMessageRequestMetadata :: Maybe A.Value
  
instance Arbitrary ModifyRunRequest where
  arbitrary = sized genModifyRunRequest

genModifyRunRequest :: Int -> Gen ModifyRunRequest
genModifyRunRequest n =
  ModifyRunRequest
    <$> arbitraryReducedMaybeValue n -- modifyRunRequestMetadata :: Maybe A.Value
  
instance Arbitrary ModifyThreadRequest where
  arbitrary = sized genModifyThreadRequest

genModifyThreadRequest :: Int -> Gen ModifyThreadRequest
genModifyThreadRequest n =
  ModifyThreadRequest
    <$> arbitraryReducedMaybe n -- modifyThreadRequestToolResources :: Maybe ModifyThreadRequestToolResources
    <*> arbitraryReducedMaybeValue n -- modifyThreadRequestMetadata :: Maybe A.Value
  
instance Arbitrary ModifyThreadRequestToolResources where
  arbitrary = sized genModifyThreadRequestToolResources

genModifyThreadRequestToolResources :: Int -> Gen ModifyThreadRequestToolResources
genModifyThreadRequestToolResources n =
  ModifyThreadRequestToolResources
    <$> arbitraryReducedMaybe n -- modifyThreadRequestToolResourcesCodeInterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter
    <*> arbitraryReducedMaybe n -- modifyThreadRequestToolResourcesFileSearch :: Maybe ModifyThreadRequestToolResourcesFileSearch
  
instance Arbitrary ModifyThreadRequestToolResourcesFileSearch where
  arbitrary = sized genModifyThreadRequestToolResourcesFileSearch

genModifyThreadRequestToolResourcesFileSearch :: Int -> Gen ModifyThreadRequestToolResourcesFileSearch
genModifyThreadRequestToolResourcesFileSearch n =
  ModifyThreadRequestToolResourcesFileSearch
    <$> arbitraryReducedMaybe n -- modifyThreadRequestToolResourcesFileSearchVectorStoreIds :: Maybe [Text]
  
instance Arbitrary OpenAIFile where
  arbitrary = sized genOpenAIFile

genOpenAIFile :: Int -> Gen OpenAIFile
genOpenAIFile n =
  OpenAIFile
    <$> arbitrary -- openAIFileId :: Text
    <*> arbitrary -- openAIFileBytes :: Int
    <*> arbitrary -- openAIFileCreatedAt :: Int
    <*> arbitrary -- openAIFileFilename :: Text
    <*> arbitrary -- openAIFileObject :: E'Object9
    <*> arbitrary -- openAIFilePurpose :: E'Purpose2
    <*> arbitrary -- openAIFileStatus :: E'Status5
    <*> arbitraryReducedMaybe n -- openAIFileStatusDetails :: Maybe Text
  
instance Arbitrary OtherChunkingStrategyResponseParam where
  arbitrary = sized genOtherChunkingStrategyResponseParam

genOtherChunkingStrategyResponseParam :: Int -> Gen OtherChunkingStrategyResponseParam
genOtherChunkingStrategyResponseParam n =
  OtherChunkingStrategyResponseParam
    <$> arbitrary -- otherChunkingStrategyResponseParamType :: E'Type21
  
instance Arbitrary PredictionContent where
  arbitrary = sized genPredictionContent

genPredictionContent :: Int -> Gen PredictionContent
genPredictionContent n =
  PredictionContent
    <$> arbitrary -- predictionContentType :: E'Type22
    <*> arbitraryReduced n -- predictionContentContent :: PredictionContentContent
  
instance Arbitrary PredictionContentContent where
  arbitrary = sized genPredictionContentContent

genPredictionContentContent :: Int -> Gen PredictionContentContent
genPredictionContentContent n =
  
  pure PredictionContentContent
   
instance Arbitrary Project where
  arbitrary = sized genProject

genProject :: Int -> Gen Project
genProject n =
  Project
    <$> arbitrary -- projectId :: Text
    <*> arbitrary -- projectObject :: E'Object23
    <*> arbitrary -- projectName :: Text
    <*> arbitrary -- projectCreatedAt :: Int
    <*> arbitraryReducedMaybe n -- projectArchivedAt :: Maybe Int
    <*> arbitrary -- projectStatus :: E'Status6
  
instance Arbitrary ProjectApiKey where
  arbitrary = sized genProjectApiKey

genProjectApiKey :: Int -> Gen ProjectApiKey
genProjectApiKey n =
  ProjectApiKey
    <$> arbitrary -- projectApiKeyObject :: E'Object24
    <*> arbitrary -- projectApiKeyRedactedValue :: Text
    <*> arbitrary -- projectApiKeyName :: Text
    <*> arbitrary -- projectApiKeyCreatedAt :: Int
    <*> arbitrary -- projectApiKeyId :: Text
    <*> arbitraryReduced n -- projectApiKeyOwner :: ProjectApiKeyOwner
  
instance Arbitrary ProjectApiKeyDeleteResponse where
  arbitrary = sized genProjectApiKeyDeleteResponse

genProjectApiKeyDeleteResponse :: Int -> Gen ProjectApiKeyDeleteResponse
genProjectApiKeyDeleteResponse n =
  ProjectApiKeyDeleteResponse
    <$> arbitrary -- projectApiKeyDeleteResponseObject :: E'Object25
    <*> arbitrary -- projectApiKeyDeleteResponseId :: Text
    <*> arbitrary -- projectApiKeyDeleteResponseDeleted :: Bool
  
instance Arbitrary ProjectApiKeyListResponse where
  arbitrary = sized genProjectApiKeyListResponse

genProjectApiKeyListResponse :: Int -> Gen ProjectApiKeyListResponse
genProjectApiKeyListResponse n =
  ProjectApiKeyListResponse
    <$> arbitrary -- projectApiKeyListResponseObject :: E'Object7
    <*> arbitraryReduced n -- projectApiKeyListResponseData :: [ProjectApiKey]
    <*> arbitrary -- projectApiKeyListResponseFirstId :: Text
    <*> arbitrary -- projectApiKeyListResponseLastId :: Text
    <*> arbitrary -- projectApiKeyListResponseHasMore :: Bool
  
instance Arbitrary ProjectApiKeyOwner where
  arbitrary = sized genProjectApiKeyOwner

genProjectApiKeyOwner :: Int -> Gen ProjectApiKeyOwner
genProjectApiKeyOwner n =
  ProjectApiKeyOwner
    <$> arbitraryReducedMaybe n -- projectApiKeyOwnerType :: Maybe E'Type7
    <*> arbitraryReducedMaybe n -- projectApiKeyOwnerUser :: Maybe ProjectUser
    <*> arbitraryReducedMaybe n -- projectApiKeyOwnerServiceAccount :: Maybe ProjectServiceAccount
  
instance Arbitrary ProjectCreateRequest where
  arbitrary = sized genProjectCreateRequest

genProjectCreateRequest :: Int -> Gen ProjectCreateRequest
genProjectCreateRequest n =
  ProjectCreateRequest
    <$> arbitrary -- projectCreateRequestName :: Text
  
instance Arbitrary ProjectListResponse where
  arbitrary = sized genProjectListResponse

genProjectListResponse :: Int -> Gen ProjectListResponse
genProjectListResponse n =
  ProjectListResponse
    <$> arbitrary -- projectListResponseObject :: E'Object7
    <*> arbitraryReduced n -- projectListResponseData :: [Project]
    <*> arbitrary -- projectListResponseFirstId :: Text
    <*> arbitrary -- projectListResponseLastId :: Text
    <*> arbitrary -- projectListResponseHasMore :: Bool
  
instance Arbitrary ProjectRateLimit where
  arbitrary = sized genProjectRateLimit

genProjectRateLimit :: Int -> Gen ProjectRateLimit
genProjectRateLimit n =
  ProjectRateLimit
    <$> arbitrary -- projectRateLimitObject :: E'Object26
    <*> arbitrary -- projectRateLimitId :: Text
    <*> arbitrary -- projectRateLimitModel :: Text
    <*> arbitrary -- projectRateLimitMaxRequestsPer1Minute :: Int
    <*> arbitrary -- projectRateLimitMaxTokensPer1Minute :: Int
    <*> arbitraryReducedMaybe n -- projectRateLimitMaxImagesPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitMaxAudioMegabytesPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitMaxRequestsPer1Day :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitBatch1DayMaxInputTokens :: Maybe Int
  
instance Arbitrary ProjectRateLimitListResponse where
  arbitrary = sized genProjectRateLimitListResponse

genProjectRateLimitListResponse :: Int -> Gen ProjectRateLimitListResponse
genProjectRateLimitListResponse n =
  ProjectRateLimitListResponse
    <$> arbitrary -- projectRateLimitListResponseObject :: E'Object7
    <*> arbitraryReduced n -- projectRateLimitListResponseData :: [ProjectRateLimit]
    <*> arbitrary -- projectRateLimitListResponseFirstId :: Text
    <*> arbitrary -- projectRateLimitListResponseLastId :: Text
    <*> arbitrary -- projectRateLimitListResponseHasMore :: Bool
  
instance Arbitrary ProjectRateLimitUpdateRequest where
  arbitrary = sized genProjectRateLimitUpdateRequest

genProjectRateLimitUpdateRequest :: Int -> Gen ProjectRateLimitUpdateRequest
genProjectRateLimitUpdateRequest n =
  ProjectRateLimitUpdateRequest
    <$> arbitraryReducedMaybe n -- projectRateLimitUpdateRequestMaxRequestsPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitUpdateRequestMaxTokensPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitUpdateRequestMaxImagesPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitUpdateRequestMaxAudioMegabytesPer1Minute :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitUpdateRequestMaxRequestsPer1Day :: Maybe Int
    <*> arbitraryReducedMaybe n -- projectRateLimitUpdateRequestBatch1DayMaxInputTokens :: Maybe Int
  
instance Arbitrary ProjectServiceAccount where
  arbitrary = sized genProjectServiceAccount

genProjectServiceAccount :: Int -> Gen ProjectServiceAccount
genProjectServiceAccount n =
  ProjectServiceAccount
    <$> arbitrary -- projectServiceAccountObject :: E'Object27
    <*> arbitrary -- projectServiceAccountId :: Text
    <*> arbitrary -- projectServiceAccountName :: Text
    <*> arbitrary -- projectServiceAccountRole :: E'Role9
    <*> arbitrary -- projectServiceAccountCreatedAt :: Int
  
instance Arbitrary ProjectServiceAccountApiKey where
  arbitrary = sized genProjectServiceAccountApiKey

genProjectServiceAccountApiKey :: Int -> Gen ProjectServiceAccountApiKey
genProjectServiceAccountApiKey n =
  ProjectServiceAccountApiKey
    <$> arbitrary -- projectServiceAccountApiKeyObject :: E'Object28
    <*> arbitrary -- projectServiceAccountApiKeyValue :: Text
    <*> arbitrary -- projectServiceAccountApiKeyName :: Text
    <*> arbitrary -- projectServiceAccountApiKeyCreatedAt :: Int
    <*> arbitrary -- projectServiceAccountApiKeyId :: Text
  
instance Arbitrary ProjectServiceAccountCreateRequest where
  arbitrary = sized genProjectServiceAccountCreateRequest

genProjectServiceAccountCreateRequest :: Int -> Gen ProjectServiceAccountCreateRequest
genProjectServiceAccountCreateRequest n =
  ProjectServiceAccountCreateRequest
    <$> arbitrary -- projectServiceAccountCreateRequestName :: Text
  
instance Arbitrary ProjectServiceAccountCreateResponse where
  arbitrary = sized genProjectServiceAccountCreateResponse

genProjectServiceAccountCreateResponse :: Int -> Gen ProjectServiceAccountCreateResponse
genProjectServiceAccountCreateResponse n =
  ProjectServiceAccountCreateResponse
    <$> arbitrary -- projectServiceAccountCreateResponseObject :: E'Object27
    <*> arbitrary -- projectServiceAccountCreateResponseId :: Text
    <*> arbitrary -- projectServiceAccountCreateResponseName :: Text
    <*> arbitrary -- projectServiceAccountCreateResponseRole :: E'Role10
    <*> arbitrary -- projectServiceAccountCreateResponseCreatedAt :: Int
    <*> arbitraryReduced n -- projectServiceAccountCreateResponseApiKey :: ProjectServiceAccountApiKey
  
instance Arbitrary ProjectServiceAccountDeleteResponse where
  arbitrary = sized genProjectServiceAccountDeleteResponse

genProjectServiceAccountDeleteResponse :: Int -> Gen ProjectServiceAccountDeleteResponse
genProjectServiceAccountDeleteResponse n =
  ProjectServiceAccountDeleteResponse
    <$> arbitrary -- projectServiceAccountDeleteResponseObject :: E'Object29
    <*> arbitrary -- projectServiceAccountDeleteResponseId :: Text
    <*> arbitrary -- projectServiceAccountDeleteResponseDeleted :: Bool
  
instance Arbitrary ProjectServiceAccountListResponse where
  arbitrary = sized genProjectServiceAccountListResponse

genProjectServiceAccountListResponse :: Int -> Gen ProjectServiceAccountListResponse
genProjectServiceAccountListResponse n =
  ProjectServiceAccountListResponse
    <$> arbitrary -- projectServiceAccountListResponseObject :: E'Object7
    <*> arbitraryReduced n -- projectServiceAccountListResponseData :: [ProjectServiceAccount]
    <*> arbitrary -- projectServiceAccountListResponseFirstId :: Text
    <*> arbitrary -- projectServiceAccountListResponseLastId :: Text
    <*> arbitrary -- projectServiceAccountListResponseHasMore :: Bool
  
instance Arbitrary ProjectUpdateRequest where
  arbitrary = sized genProjectUpdateRequest

genProjectUpdateRequest :: Int -> Gen ProjectUpdateRequest
genProjectUpdateRequest n =
  ProjectUpdateRequest
    <$> arbitrary -- projectUpdateRequestName :: Text
  
instance Arbitrary ProjectUser where
  arbitrary = sized genProjectUser

genProjectUser :: Int -> Gen ProjectUser
genProjectUser n =
  ProjectUser
    <$> arbitrary -- projectUserObject :: E'Object30
    <*> arbitrary -- projectUserId :: Text
    <*> arbitrary -- projectUserName :: Text
    <*> arbitrary -- projectUserEmail :: Text
    <*> arbitrary -- projectUserRole :: E'Role9
    <*> arbitrary -- projectUserAddedAt :: Int
  
instance Arbitrary ProjectUserCreateRequest where
  arbitrary = sized genProjectUserCreateRequest

genProjectUserCreateRequest :: Int -> Gen ProjectUserCreateRequest
genProjectUserCreateRequest n =
  ProjectUserCreateRequest
    <$> arbitrary -- projectUserCreateRequestUserId :: Text
    <*> arbitrary -- projectUserCreateRequestRole :: E'Role9
  
instance Arbitrary ProjectUserDeleteResponse where
  arbitrary = sized genProjectUserDeleteResponse

genProjectUserDeleteResponse :: Int -> Gen ProjectUserDeleteResponse
genProjectUserDeleteResponse n =
  ProjectUserDeleteResponse
    <$> arbitrary -- projectUserDeleteResponseObject :: E'Object31
    <*> arbitrary -- projectUserDeleteResponseId :: Text
    <*> arbitrary -- projectUserDeleteResponseDeleted :: Bool
  
instance Arbitrary ProjectUserListResponse where
  arbitrary = sized genProjectUserListResponse

genProjectUserListResponse :: Int -> Gen ProjectUserListResponse
genProjectUserListResponse n =
  ProjectUserListResponse
    <$> arbitrary -- projectUserListResponseObject :: Text
    <*> arbitraryReduced n -- projectUserListResponseData :: [ProjectUser]
    <*> arbitrary -- projectUserListResponseFirstId :: Text
    <*> arbitrary -- projectUserListResponseLastId :: Text
    <*> arbitrary -- projectUserListResponseHasMore :: Bool
  
instance Arbitrary ProjectUserUpdateRequest where
  arbitrary = sized genProjectUserUpdateRequest

genProjectUserUpdateRequest :: Int -> Gen ProjectUserUpdateRequest
genProjectUserUpdateRequest n =
  ProjectUserUpdateRequest
    <$> arbitrary -- projectUserUpdateRequestRole :: E'Role9
  
instance Arbitrary RealtimeClientEventConversationItemCreate where
  arbitrary = sized genRealtimeClientEventConversationItemCreate

genRealtimeClientEventConversationItemCreate :: Int -> Gen RealtimeClientEventConversationItemCreate
genRealtimeClientEventConversationItemCreate n =
  RealtimeClientEventConversationItemCreate
    <$> arbitraryReducedMaybe n -- realtimeClientEventConversationItemCreateEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventConversationItemCreateType :: E'Type23
    <*> arbitraryReducedMaybe n -- realtimeClientEventConversationItemCreatePreviousItemId :: Maybe Text
    <*> arbitraryReduced n -- realtimeClientEventConversationItemCreateItem :: RealtimeConversationItem
  
instance Arbitrary RealtimeClientEventConversationItemDelete where
  arbitrary = sized genRealtimeClientEventConversationItemDelete

genRealtimeClientEventConversationItemDelete :: Int -> Gen RealtimeClientEventConversationItemDelete
genRealtimeClientEventConversationItemDelete n =
  RealtimeClientEventConversationItemDelete
    <$> arbitraryReducedMaybe n -- realtimeClientEventConversationItemDeleteEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventConversationItemDeleteType :: E'Type24
    <*> arbitrary -- realtimeClientEventConversationItemDeleteItemId :: Text
  
instance Arbitrary RealtimeClientEventConversationItemTruncate where
  arbitrary = sized genRealtimeClientEventConversationItemTruncate

genRealtimeClientEventConversationItemTruncate :: Int -> Gen RealtimeClientEventConversationItemTruncate
genRealtimeClientEventConversationItemTruncate n =
  RealtimeClientEventConversationItemTruncate
    <$> arbitraryReducedMaybe n -- realtimeClientEventConversationItemTruncateEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventConversationItemTruncateType :: E'Type25
    <*> arbitrary -- realtimeClientEventConversationItemTruncateItemId :: Text
    <*> arbitrary -- realtimeClientEventConversationItemTruncateContentIndex :: Int
    <*> arbitrary -- realtimeClientEventConversationItemTruncateAudioEndMs :: Int
  
instance Arbitrary RealtimeClientEventInputAudioBufferAppend where
  arbitrary = sized genRealtimeClientEventInputAudioBufferAppend

genRealtimeClientEventInputAudioBufferAppend :: Int -> Gen RealtimeClientEventInputAudioBufferAppend
genRealtimeClientEventInputAudioBufferAppend n =
  RealtimeClientEventInputAudioBufferAppend
    <$> arbitraryReducedMaybe n -- realtimeClientEventInputAudioBufferAppendEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventInputAudioBufferAppendType :: E'Type26
    <*> arbitrary -- realtimeClientEventInputAudioBufferAppendAudio :: Text
  
instance Arbitrary RealtimeClientEventInputAudioBufferClear where
  arbitrary = sized genRealtimeClientEventInputAudioBufferClear

genRealtimeClientEventInputAudioBufferClear :: Int -> Gen RealtimeClientEventInputAudioBufferClear
genRealtimeClientEventInputAudioBufferClear n =
  RealtimeClientEventInputAudioBufferClear
    <$> arbitraryReducedMaybe n -- realtimeClientEventInputAudioBufferClearEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventInputAudioBufferClearType :: E'Type27
  
instance Arbitrary RealtimeClientEventInputAudioBufferCommit where
  arbitrary = sized genRealtimeClientEventInputAudioBufferCommit

genRealtimeClientEventInputAudioBufferCommit :: Int -> Gen RealtimeClientEventInputAudioBufferCommit
genRealtimeClientEventInputAudioBufferCommit n =
  RealtimeClientEventInputAudioBufferCommit
    <$> arbitraryReducedMaybe n -- realtimeClientEventInputAudioBufferCommitEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventInputAudioBufferCommitType :: E'Type28
  
instance Arbitrary RealtimeClientEventResponseCancel where
  arbitrary = sized genRealtimeClientEventResponseCancel

genRealtimeClientEventResponseCancel :: Int -> Gen RealtimeClientEventResponseCancel
genRealtimeClientEventResponseCancel n =
  RealtimeClientEventResponseCancel
    <$> arbitraryReducedMaybe n -- realtimeClientEventResponseCancelEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventResponseCancelType :: E'Type29
    <*> arbitraryReducedMaybe n -- realtimeClientEventResponseCancelResponseId :: Maybe Text
  
instance Arbitrary RealtimeClientEventResponseCreate where
  arbitrary = sized genRealtimeClientEventResponseCreate

genRealtimeClientEventResponseCreate :: Int -> Gen RealtimeClientEventResponseCreate
genRealtimeClientEventResponseCreate n =
  RealtimeClientEventResponseCreate
    <$> arbitraryReducedMaybe n -- realtimeClientEventResponseCreateEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventResponseCreateType :: E'Type30
    <*> arbitraryReducedMaybe n -- realtimeClientEventResponseCreateResponse :: Maybe RealtimeResponseCreateParams
  
instance Arbitrary RealtimeClientEventSessionUpdate where
  arbitrary = sized genRealtimeClientEventSessionUpdate

genRealtimeClientEventSessionUpdate :: Int -> Gen RealtimeClientEventSessionUpdate
genRealtimeClientEventSessionUpdate n =
  RealtimeClientEventSessionUpdate
    <$> arbitraryReducedMaybe n -- realtimeClientEventSessionUpdateEventId :: Maybe Text
    <*> arbitrary -- realtimeClientEventSessionUpdateType :: E'Type31
    <*> arbitraryReduced n -- realtimeClientEventSessionUpdateSession :: RealtimeSessionCreateRequest
  
instance Arbitrary RealtimeConversationItem where
  arbitrary = sized genRealtimeConversationItem

genRealtimeConversationItem :: Int -> Gen RealtimeConversationItem
genRealtimeConversationItem n =
  RealtimeConversationItem
    <$> arbitraryReducedMaybe n -- realtimeConversationItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeConversationItemType :: Maybe E'Type32
    <*> arbitraryReducedMaybe n -- realtimeConversationItemObject :: Maybe E'Object32
    <*> arbitraryReducedMaybe n -- realtimeConversationItemStatus :: Maybe E'Status7
    <*> arbitraryReducedMaybe n -- realtimeConversationItemRole :: Maybe E'Role11
    <*> arbitraryReducedMaybe n -- realtimeConversationItemContent :: Maybe [RealtimeConversationItemContentInner]
    <*> arbitraryReducedMaybe n -- realtimeConversationItemCallId :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeConversationItemName :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeConversationItemArguments :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeConversationItemOutput :: Maybe Text
  
instance Arbitrary RealtimeConversationItemContentInner where
  arbitrary = sized genRealtimeConversationItemContentInner

genRealtimeConversationItemContentInner :: Int -> Gen RealtimeConversationItemContentInner
genRealtimeConversationItemContentInner n =
  RealtimeConversationItemContentInner
    <$> arbitraryReducedMaybe n -- realtimeConversationItemContentInnerType :: Maybe E'Type76
    <*> arbitraryReducedMaybe n -- realtimeConversationItemContentInnerText :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeConversationItemContentInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeConversationItemContentInnerAudio :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeConversationItemContentInnerTranscript :: Maybe Text
  
instance Arbitrary RealtimeResponse where
  arbitrary = sized genRealtimeResponse

genRealtimeResponse :: Int -> Gen RealtimeResponse
genRealtimeResponse n =
  RealtimeResponse
    <$> arbitraryReducedMaybe n -- realtimeResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeResponseObject :: Maybe E'Object33
    <*> arbitraryReducedMaybe n -- realtimeResponseStatus :: Maybe E'Status8
    <*> arbitraryReducedMaybe n -- realtimeResponseStatusDetails :: Maybe RealtimeResponseStatusDetails
    <*> arbitraryReducedMaybe n -- realtimeResponseOutput :: Maybe [RealtimeConversationItem]
    <*> arbitraryReducedMaybeValue n -- realtimeResponseMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- realtimeResponseUsage :: Maybe RealtimeResponseUsage
  
instance Arbitrary RealtimeResponseCreateParams where
  arbitrary = sized genRealtimeResponseCreateParams

genRealtimeResponseCreateParams :: Int -> Gen RealtimeResponseCreateParams
genRealtimeResponseCreateParams n =
  RealtimeResponseCreateParams
    <$> arbitraryReducedMaybe n -- realtimeResponseCreateParamsModalities :: Maybe [E'Modalities]
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsVoice :: Maybe E'Voice2
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsOutputAudioFormat :: Maybe E'OutputAudioFormat
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsTools :: Maybe [RealtimeResponseCreateParamsToolsInner]
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsToolChoice :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsMaxResponseOutputTokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsConversation :: Maybe RealtimeResponseCreateParamsConversation
    <*> arbitraryReducedMaybeValue n -- realtimeResponseCreateParamsMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsInput :: Maybe [RealtimeConversationItem]
  
instance Arbitrary RealtimeResponseCreateParamsConversation where
  arbitrary = sized genRealtimeResponseCreateParamsConversation

genRealtimeResponseCreateParamsConversation :: Int -> Gen RealtimeResponseCreateParamsConversation
genRealtimeResponseCreateParamsConversation n =
  
  pure RealtimeResponseCreateParamsConversation
   
instance Arbitrary RealtimeResponseCreateParamsMaxResponseOutputTokens where
  arbitrary = sized genRealtimeResponseCreateParamsMaxResponseOutputTokens

genRealtimeResponseCreateParamsMaxResponseOutputTokens :: Int -> Gen RealtimeResponseCreateParamsMaxResponseOutputTokens
genRealtimeResponseCreateParamsMaxResponseOutputTokens n =
  
  pure RealtimeResponseCreateParamsMaxResponseOutputTokens
   
instance Arbitrary RealtimeResponseCreateParamsToolsInner where
  arbitrary = sized genRealtimeResponseCreateParamsToolsInner

genRealtimeResponseCreateParamsToolsInner :: Int -> Gen RealtimeResponseCreateParamsToolsInner
genRealtimeResponseCreateParamsToolsInner n =
  RealtimeResponseCreateParamsToolsInner
    <$> arbitraryReducedMaybe n -- realtimeResponseCreateParamsToolsInnerType :: Maybe E'Type3
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsToolsInnerName :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeResponseCreateParamsToolsInnerDescription :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- realtimeResponseCreateParamsToolsInnerParameters :: Maybe A.Value
  
instance Arbitrary RealtimeResponseStatusDetails where
  arbitrary = sized genRealtimeResponseStatusDetails

genRealtimeResponseStatusDetails :: Int -> Gen RealtimeResponseStatusDetails
genRealtimeResponseStatusDetails n =
  RealtimeResponseStatusDetails
    <$> arbitraryReducedMaybe n -- realtimeResponseStatusDetailsType :: Maybe E'Status8
    <*> arbitraryReducedMaybe n -- realtimeResponseStatusDetailsReason :: Maybe E'Reason2
    <*> arbitraryReducedMaybe n -- realtimeResponseStatusDetailsError :: Maybe RealtimeResponseStatusDetailsError
  
instance Arbitrary RealtimeResponseStatusDetailsError where
  arbitrary = sized genRealtimeResponseStatusDetailsError

genRealtimeResponseStatusDetailsError :: Int -> Gen RealtimeResponseStatusDetailsError
genRealtimeResponseStatusDetailsError n =
  RealtimeResponseStatusDetailsError
    <$> arbitraryReducedMaybe n -- realtimeResponseStatusDetailsErrorType :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeResponseStatusDetailsErrorCode :: Maybe Text
  
instance Arbitrary RealtimeResponseUsage where
  arbitrary = sized genRealtimeResponseUsage

genRealtimeResponseUsage :: Int -> Gen RealtimeResponseUsage
genRealtimeResponseUsage n =
  RealtimeResponseUsage
    <$> arbitraryReducedMaybe n -- realtimeResponseUsageTotalTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeResponseUsageInputTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeResponseUsageOutputTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeResponseUsageInputTokenDetails :: Maybe RealtimeResponseUsageInputTokenDetails
    <*> arbitraryReducedMaybe n -- realtimeResponseUsageOutputTokenDetails :: Maybe RealtimeResponseUsageOutputTokenDetails
  
instance Arbitrary RealtimeResponseUsageInputTokenDetails where
  arbitrary = sized genRealtimeResponseUsageInputTokenDetails

genRealtimeResponseUsageInputTokenDetails :: Int -> Gen RealtimeResponseUsageInputTokenDetails
genRealtimeResponseUsageInputTokenDetails n =
  RealtimeResponseUsageInputTokenDetails
    <$> arbitraryReducedMaybe n -- realtimeResponseUsageInputTokenDetailsCachedTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeResponseUsageInputTokenDetailsTextTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeResponseUsageInputTokenDetailsAudioTokens :: Maybe Int
  
instance Arbitrary RealtimeResponseUsageOutputTokenDetails where
  arbitrary = sized genRealtimeResponseUsageOutputTokenDetails

genRealtimeResponseUsageOutputTokenDetails :: Int -> Gen RealtimeResponseUsageOutputTokenDetails
genRealtimeResponseUsageOutputTokenDetails n =
  RealtimeResponseUsageOutputTokenDetails
    <$> arbitraryReducedMaybe n -- realtimeResponseUsageOutputTokenDetailsTextTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeResponseUsageOutputTokenDetailsAudioTokens :: Maybe Int
  
instance Arbitrary RealtimeServerEventConversationCreated where
  arbitrary = sized genRealtimeServerEventConversationCreated

genRealtimeServerEventConversationCreated :: Int -> Gen RealtimeServerEventConversationCreated
genRealtimeServerEventConversationCreated n =
  RealtimeServerEventConversationCreated
    <$> arbitrary -- realtimeServerEventConversationCreatedEventId :: Text
    <*> arbitrary -- realtimeServerEventConversationCreatedType :: E'Type33
    <*> arbitraryReduced n -- realtimeServerEventConversationCreatedConversation :: RealtimeServerEventConversationCreatedConversation
  
instance Arbitrary RealtimeServerEventConversationCreatedConversation where
  arbitrary = sized genRealtimeServerEventConversationCreatedConversation

genRealtimeServerEventConversationCreatedConversation :: Int -> Gen RealtimeServerEventConversationCreatedConversation
genRealtimeServerEventConversationCreatedConversation n =
  RealtimeServerEventConversationCreatedConversation
    <$> arbitraryReducedMaybe n -- realtimeServerEventConversationCreatedConversationId :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventConversationCreatedConversationObject :: Maybe Text
  
instance Arbitrary RealtimeServerEventConversationItemCreated where
  arbitrary = sized genRealtimeServerEventConversationItemCreated

genRealtimeServerEventConversationItemCreated :: Int -> Gen RealtimeServerEventConversationItemCreated
genRealtimeServerEventConversationItemCreated n =
  RealtimeServerEventConversationItemCreated
    <$> arbitrary -- realtimeServerEventConversationItemCreatedEventId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemCreatedType :: E'Type34
    <*> arbitrary -- realtimeServerEventConversationItemCreatedPreviousItemId :: Text
    <*> arbitraryReduced n -- realtimeServerEventConversationItemCreatedItem :: RealtimeConversationItem
  
instance Arbitrary RealtimeServerEventConversationItemDeleted where
  arbitrary = sized genRealtimeServerEventConversationItemDeleted

genRealtimeServerEventConversationItemDeleted :: Int -> Gen RealtimeServerEventConversationItemDeleted
genRealtimeServerEventConversationItemDeleted n =
  RealtimeServerEventConversationItemDeleted
    <$> arbitrary -- realtimeServerEventConversationItemDeletedEventId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemDeletedType :: E'Type35
    <*> arbitrary -- realtimeServerEventConversationItemDeletedItemId :: Text
  
instance Arbitrary RealtimeServerEventConversationItemInputAudioTranscriptionCompleted where
  arbitrary = sized genRealtimeServerEventConversationItemInputAudioTranscriptionCompleted

genRealtimeServerEventConversationItemInputAudioTranscriptionCompleted :: Int -> Gen RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
genRealtimeServerEventConversationItemInputAudioTranscriptionCompleted n =
  RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
    <$> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionCompletedEventId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionCompletedType :: E'Type36
    <*> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionCompletedItemId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionCompletedContentIndex :: Int
    <*> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionCompletedTranscript :: Text
  
instance Arbitrary RealtimeServerEventConversationItemInputAudioTranscriptionFailed where
  arbitrary = sized genRealtimeServerEventConversationItemInputAudioTranscriptionFailed

genRealtimeServerEventConversationItemInputAudioTranscriptionFailed :: Int -> Gen RealtimeServerEventConversationItemInputAudioTranscriptionFailed
genRealtimeServerEventConversationItemInputAudioTranscriptionFailed n =
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed
    <$> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionFailedEventId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionFailedType :: E'Type37
    <*> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionFailedItemId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemInputAudioTranscriptionFailedContentIndex :: Int
    <*> arbitraryReduced n -- realtimeServerEventConversationItemInputAudioTranscriptionFailedError :: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
  
instance Arbitrary RealtimeServerEventConversationItemInputAudioTranscriptionFailedError where
  arbitrary = sized genRealtimeServerEventConversationItemInputAudioTranscriptionFailedError

genRealtimeServerEventConversationItemInputAudioTranscriptionFailedError :: Int -> Gen RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
genRealtimeServerEventConversationItemInputAudioTranscriptionFailedError n =
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
    <$> arbitraryReducedMaybe n -- realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorType :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorParam :: Maybe Text
  
instance Arbitrary RealtimeServerEventConversationItemTruncated where
  arbitrary = sized genRealtimeServerEventConversationItemTruncated

genRealtimeServerEventConversationItemTruncated :: Int -> Gen RealtimeServerEventConversationItemTruncated
genRealtimeServerEventConversationItemTruncated n =
  RealtimeServerEventConversationItemTruncated
    <$> arbitrary -- realtimeServerEventConversationItemTruncatedEventId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemTruncatedType :: E'Type38
    <*> arbitrary -- realtimeServerEventConversationItemTruncatedItemId :: Text
    <*> arbitrary -- realtimeServerEventConversationItemTruncatedContentIndex :: Int
    <*> arbitrary -- realtimeServerEventConversationItemTruncatedAudioEndMs :: Int
  
instance Arbitrary RealtimeServerEventError where
  arbitrary = sized genRealtimeServerEventError

genRealtimeServerEventError :: Int -> Gen RealtimeServerEventError
genRealtimeServerEventError n =
  RealtimeServerEventError
    <$> arbitrary -- realtimeServerEventErrorEventId :: Text
    <*> arbitrary -- realtimeServerEventErrorType :: E'Event2
    <*> arbitraryReduced n -- realtimeServerEventErrorError :: RealtimeServerEventErrorError
  
instance Arbitrary RealtimeServerEventErrorError where
  arbitrary = sized genRealtimeServerEventErrorError

genRealtimeServerEventErrorError :: Int -> Gen RealtimeServerEventErrorError
genRealtimeServerEventErrorError n =
  RealtimeServerEventErrorError
    <$> arbitrary -- realtimeServerEventErrorErrorType :: Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventErrorErrorCode :: Maybe Text
    <*> arbitrary -- realtimeServerEventErrorErrorMessage :: Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventErrorErrorParam :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventErrorErrorEventId :: Maybe Text
  
instance Arbitrary RealtimeServerEventInputAudioBufferCleared where
  arbitrary = sized genRealtimeServerEventInputAudioBufferCleared

genRealtimeServerEventInputAudioBufferCleared :: Int -> Gen RealtimeServerEventInputAudioBufferCleared
genRealtimeServerEventInputAudioBufferCleared n =
  RealtimeServerEventInputAudioBufferCleared
    <$> arbitrary -- realtimeServerEventInputAudioBufferClearedEventId :: Text
    <*> arbitrary -- realtimeServerEventInputAudioBufferClearedType :: E'Type39
  
instance Arbitrary RealtimeServerEventInputAudioBufferCommitted where
  arbitrary = sized genRealtimeServerEventInputAudioBufferCommitted

genRealtimeServerEventInputAudioBufferCommitted :: Int -> Gen RealtimeServerEventInputAudioBufferCommitted
genRealtimeServerEventInputAudioBufferCommitted n =
  RealtimeServerEventInputAudioBufferCommitted
    <$> arbitrary -- realtimeServerEventInputAudioBufferCommittedEventId :: Text
    <*> arbitrary -- realtimeServerEventInputAudioBufferCommittedType :: E'Type40
    <*> arbitrary -- realtimeServerEventInputAudioBufferCommittedPreviousItemId :: Text
    <*> arbitrary -- realtimeServerEventInputAudioBufferCommittedItemId :: Text
  
instance Arbitrary RealtimeServerEventInputAudioBufferSpeechStarted where
  arbitrary = sized genRealtimeServerEventInputAudioBufferSpeechStarted

genRealtimeServerEventInputAudioBufferSpeechStarted :: Int -> Gen RealtimeServerEventInputAudioBufferSpeechStarted
genRealtimeServerEventInputAudioBufferSpeechStarted n =
  RealtimeServerEventInputAudioBufferSpeechStarted
    <$> arbitrary -- realtimeServerEventInputAudioBufferSpeechStartedEventId :: Text
    <*> arbitrary -- realtimeServerEventInputAudioBufferSpeechStartedType :: E'Type41
    <*> arbitrary -- realtimeServerEventInputAudioBufferSpeechStartedAudioStartMs :: Int
    <*> arbitrary -- realtimeServerEventInputAudioBufferSpeechStartedItemId :: Text
  
instance Arbitrary RealtimeServerEventInputAudioBufferSpeechStopped where
  arbitrary = sized genRealtimeServerEventInputAudioBufferSpeechStopped

genRealtimeServerEventInputAudioBufferSpeechStopped :: Int -> Gen RealtimeServerEventInputAudioBufferSpeechStopped
genRealtimeServerEventInputAudioBufferSpeechStopped n =
  RealtimeServerEventInputAudioBufferSpeechStopped
    <$> arbitrary -- realtimeServerEventInputAudioBufferSpeechStoppedEventId :: Text
    <*> arbitrary -- realtimeServerEventInputAudioBufferSpeechStoppedType :: E'Type42
    <*> arbitrary -- realtimeServerEventInputAudioBufferSpeechStoppedAudioEndMs :: Int
    <*> arbitrary -- realtimeServerEventInputAudioBufferSpeechStoppedItemId :: Text
  
instance Arbitrary RealtimeServerEventRateLimitsUpdated where
  arbitrary = sized genRealtimeServerEventRateLimitsUpdated

genRealtimeServerEventRateLimitsUpdated :: Int -> Gen RealtimeServerEventRateLimitsUpdated
genRealtimeServerEventRateLimitsUpdated n =
  RealtimeServerEventRateLimitsUpdated
    <$> arbitrary -- realtimeServerEventRateLimitsUpdatedEventId :: Text
    <*> arbitrary -- realtimeServerEventRateLimitsUpdatedType :: E'Type43
    <*> arbitraryReduced n -- realtimeServerEventRateLimitsUpdatedRateLimits :: [RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
  
instance Arbitrary RealtimeServerEventRateLimitsUpdatedRateLimitsInner where
  arbitrary = sized genRealtimeServerEventRateLimitsUpdatedRateLimitsInner

genRealtimeServerEventRateLimitsUpdatedRateLimitsInner :: Int -> Gen RealtimeServerEventRateLimitsUpdatedRateLimitsInner
genRealtimeServerEventRateLimitsUpdatedRateLimitsInner n =
  RealtimeServerEventRateLimitsUpdatedRateLimitsInner
    <$> arbitraryReducedMaybe n -- realtimeServerEventRateLimitsUpdatedRateLimitsInnerName :: Maybe E'Name
    <*> arbitraryReducedMaybe n -- realtimeServerEventRateLimitsUpdatedRateLimitsInnerLimit :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeServerEventRateLimitsUpdatedRateLimitsInnerRemaining :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeServerEventRateLimitsUpdatedRateLimitsInnerResetSeconds :: Maybe Double
  
instance Arbitrary RealtimeServerEventResponseAudioDelta where
  arbitrary = sized genRealtimeServerEventResponseAudioDelta

genRealtimeServerEventResponseAudioDelta :: Int -> Gen RealtimeServerEventResponseAudioDelta
genRealtimeServerEventResponseAudioDelta n =
  RealtimeServerEventResponseAudioDelta
    <$> arbitrary -- realtimeServerEventResponseAudioDeltaEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioDeltaType :: E'Type44
    <*> arbitrary -- realtimeServerEventResponseAudioDeltaResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioDeltaItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioDeltaOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseAudioDeltaContentIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseAudioDeltaDelta :: Text
  
instance Arbitrary RealtimeServerEventResponseAudioDone where
  arbitrary = sized genRealtimeServerEventResponseAudioDone

genRealtimeServerEventResponseAudioDone :: Int -> Gen RealtimeServerEventResponseAudioDone
genRealtimeServerEventResponseAudioDone n =
  RealtimeServerEventResponseAudioDone
    <$> arbitrary -- realtimeServerEventResponseAudioDoneEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioDoneType :: E'Type45
    <*> arbitrary -- realtimeServerEventResponseAudioDoneResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioDoneItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioDoneOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseAudioDoneContentIndex :: Int
  
instance Arbitrary RealtimeServerEventResponseAudioTranscriptDelta where
  arbitrary = sized genRealtimeServerEventResponseAudioTranscriptDelta

genRealtimeServerEventResponseAudioTranscriptDelta :: Int -> Gen RealtimeServerEventResponseAudioTranscriptDelta
genRealtimeServerEventResponseAudioTranscriptDelta n =
  RealtimeServerEventResponseAudioTranscriptDelta
    <$> arbitrary -- realtimeServerEventResponseAudioTranscriptDeltaEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDeltaType :: E'Type46
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDeltaResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDeltaItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDeltaOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDeltaContentIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDeltaDelta :: Text
  
instance Arbitrary RealtimeServerEventResponseAudioTranscriptDone where
  arbitrary = sized genRealtimeServerEventResponseAudioTranscriptDone

genRealtimeServerEventResponseAudioTranscriptDone :: Int -> Gen RealtimeServerEventResponseAudioTranscriptDone
genRealtimeServerEventResponseAudioTranscriptDone n =
  RealtimeServerEventResponseAudioTranscriptDone
    <$> arbitrary -- realtimeServerEventResponseAudioTranscriptDoneEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDoneType :: E'Type47
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDoneResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDoneItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDoneOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDoneContentIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseAudioTranscriptDoneTranscript :: Text
  
instance Arbitrary RealtimeServerEventResponseContentPartAdded where
  arbitrary = sized genRealtimeServerEventResponseContentPartAdded

genRealtimeServerEventResponseContentPartAdded :: Int -> Gen RealtimeServerEventResponseContentPartAdded
genRealtimeServerEventResponseContentPartAdded n =
  RealtimeServerEventResponseContentPartAdded
    <$> arbitrary -- realtimeServerEventResponseContentPartAddedEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseContentPartAddedType :: E'Type48
    <*> arbitrary -- realtimeServerEventResponseContentPartAddedResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseContentPartAddedItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseContentPartAddedOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseContentPartAddedContentIndex :: Int
    <*> arbitraryReduced n -- realtimeServerEventResponseContentPartAddedPart :: RealtimeServerEventResponseContentPartAddedPart
  
instance Arbitrary RealtimeServerEventResponseContentPartAddedPart where
  arbitrary = sized genRealtimeServerEventResponseContentPartAddedPart

genRealtimeServerEventResponseContentPartAddedPart :: Int -> Gen RealtimeServerEventResponseContentPartAddedPart
genRealtimeServerEventResponseContentPartAddedPart n =
  RealtimeServerEventResponseContentPartAddedPart
    <$> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartAddedPartType :: Maybe E'Type77
    <*> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartAddedPartText :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartAddedPartAudio :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartAddedPartTranscript :: Maybe Text
  
instance Arbitrary RealtimeServerEventResponseContentPartDone where
  arbitrary = sized genRealtimeServerEventResponseContentPartDone

genRealtimeServerEventResponseContentPartDone :: Int -> Gen RealtimeServerEventResponseContentPartDone
genRealtimeServerEventResponseContentPartDone n =
  RealtimeServerEventResponseContentPartDone
    <$> arbitrary -- realtimeServerEventResponseContentPartDoneEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseContentPartDoneType :: E'Type49
    <*> arbitrary -- realtimeServerEventResponseContentPartDoneResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseContentPartDoneItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseContentPartDoneOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseContentPartDoneContentIndex :: Int
    <*> arbitraryReduced n -- realtimeServerEventResponseContentPartDonePart :: RealtimeServerEventResponseContentPartDonePart
  
instance Arbitrary RealtimeServerEventResponseContentPartDonePart where
  arbitrary = sized genRealtimeServerEventResponseContentPartDonePart

genRealtimeServerEventResponseContentPartDonePart :: Int -> Gen RealtimeServerEventResponseContentPartDonePart
genRealtimeServerEventResponseContentPartDonePart n =
  RealtimeServerEventResponseContentPartDonePart
    <$> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartDonePartType :: Maybe E'Type77
    <*> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartDonePartText :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartDonePartAudio :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeServerEventResponseContentPartDonePartTranscript :: Maybe Text
  
instance Arbitrary RealtimeServerEventResponseCreated where
  arbitrary = sized genRealtimeServerEventResponseCreated

genRealtimeServerEventResponseCreated :: Int -> Gen RealtimeServerEventResponseCreated
genRealtimeServerEventResponseCreated n =
  RealtimeServerEventResponseCreated
    <$> arbitrary -- realtimeServerEventResponseCreatedEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseCreatedType :: E'Type50
    <*> arbitraryReduced n -- realtimeServerEventResponseCreatedResponse :: RealtimeResponse
  
instance Arbitrary RealtimeServerEventResponseDone where
  arbitrary = sized genRealtimeServerEventResponseDone

genRealtimeServerEventResponseDone :: Int -> Gen RealtimeServerEventResponseDone
genRealtimeServerEventResponseDone n =
  RealtimeServerEventResponseDone
    <$> arbitrary -- realtimeServerEventResponseDoneEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseDoneType :: E'Type51
    <*> arbitraryReduced n -- realtimeServerEventResponseDoneResponse :: RealtimeResponse
  
instance Arbitrary RealtimeServerEventResponseFunctionCallArgumentsDelta where
  arbitrary = sized genRealtimeServerEventResponseFunctionCallArgumentsDelta

genRealtimeServerEventResponseFunctionCallArgumentsDelta :: Int -> Gen RealtimeServerEventResponseFunctionCallArgumentsDelta
genRealtimeServerEventResponseFunctionCallArgumentsDelta n =
  RealtimeServerEventResponseFunctionCallArgumentsDelta
    <$> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDeltaEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDeltaType :: E'Type52
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDeltaResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDeltaItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDeltaOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDeltaCallId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDeltaDelta :: Text
  
instance Arbitrary RealtimeServerEventResponseFunctionCallArgumentsDone where
  arbitrary = sized genRealtimeServerEventResponseFunctionCallArgumentsDone

genRealtimeServerEventResponseFunctionCallArgumentsDone :: Int -> Gen RealtimeServerEventResponseFunctionCallArgumentsDone
genRealtimeServerEventResponseFunctionCallArgumentsDone n =
  RealtimeServerEventResponseFunctionCallArgumentsDone
    <$> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDoneEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDoneType :: E'Type53
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDoneResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDoneItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDoneOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDoneCallId :: Text
    <*> arbitrary -- realtimeServerEventResponseFunctionCallArgumentsDoneArguments :: Text
  
instance Arbitrary RealtimeServerEventResponseOutputItemAdded where
  arbitrary = sized genRealtimeServerEventResponseOutputItemAdded

genRealtimeServerEventResponseOutputItemAdded :: Int -> Gen RealtimeServerEventResponseOutputItemAdded
genRealtimeServerEventResponseOutputItemAdded n =
  RealtimeServerEventResponseOutputItemAdded
    <$> arbitrary -- realtimeServerEventResponseOutputItemAddedEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseOutputItemAddedType :: E'Type54
    <*> arbitrary -- realtimeServerEventResponseOutputItemAddedResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseOutputItemAddedOutputIndex :: Int
    <*> arbitraryReduced n -- realtimeServerEventResponseOutputItemAddedItem :: RealtimeConversationItem
  
instance Arbitrary RealtimeServerEventResponseOutputItemDone where
  arbitrary = sized genRealtimeServerEventResponseOutputItemDone

genRealtimeServerEventResponseOutputItemDone :: Int -> Gen RealtimeServerEventResponseOutputItemDone
genRealtimeServerEventResponseOutputItemDone n =
  RealtimeServerEventResponseOutputItemDone
    <$> arbitrary -- realtimeServerEventResponseOutputItemDoneEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseOutputItemDoneType :: E'Type55
    <*> arbitrary -- realtimeServerEventResponseOutputItemDoneResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseOutputItemDoneOutputIndex :: Int
    <*> arbitraryReduced n -- realtimeServerEventResponseOutputItemDoneItem :: RealtimeConversationItem
  
instance Arbitrary RealtimeServerEventResponseTextDelta where
  arbitrary = sized genRealtimeServerEventResponseTextDelta

genRealtimeServerEventResponseTextDelta :: Int -> Gen RealtimeServerEventResponseTextDelta
genRealtimeServerEventResponseTextDelta n =
  RealtimeServerEventResponseTextDelta
    <$> arbitrary -- realtimeServerEventResponseTextDeltaEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseTextDeltaType :: E'Type56
    <*> arbitrary -- realtimeServerEventResponseTextDeltaResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseTextDeltaItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseTextDeltaOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseTextDeltaContentIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseTextDeltaDelta :: Text
  
instance Arbitrary RealtimeServerEventResponseTextDone where
  arbitrary = sized genRealtimeServerEventResponseTextDone

genRealtimeServerEventResponseTextDone :: Int -> Gen RealtimeServerEventResponseTextDone
genRealtimeServerEventResponseTextDone n =
  RealtimeServerEventResponseTextDone
    <$> arbitrary -- realtimeServerEventResponseTextDoneEventId :: Text
    <*> arbitrary -- realtimeServerEventResponseTextDoneType :: E'Type57
    <*> arbitrary -- realtimeServerEventResponseTextDoneResponseId :: Text
    <*> arbitrary -- realtimeServerEventResponseTextDoneItemId :: Text
    <*> arbitrary -- realtimeServerEventResponseTextDoneOutputIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseTextDoneContentIndex :: Int
    <*> arbitrary -- realtimeServerEventResponseTextDoneText :: Text
  
instance Arbitrary RealtimeServerEventSessionCreated where
  arbitrary = sized genRealtimeServerEventSessionCreated

genRealtimeServerEventSessionCreated :: Int -> Gen RealtimeServerEventSessionCreated
genRealtimeServerEventSessionCreated n =
  RealtimeServerEventSessionCreated
    <$> arbitrary -- realtimeServerEventSessionCreatedEventId :: Text
    <*> arbitrary -- realtimeServerEventSessionCreatedType :: E'Type58
    <*> arbitraryReduced n -- realtimeServerEventSessionCreatedSession :: RealtimeSession
  
instance Arbitrary RealtimeServerEventSessionUpdated where
  arbitrary = sized genRealtimeServerEventSessionUpdated

genRealtimeServerEventSessionUpdated :: Int -> Gen RealtimeServerEventSessionUpdated
genRealtimeServerEventSessionUpdated n =
  RealtimeServerEventSessionUpdated
    <$> arbitrary -- realtimeServerEventSessionUpdatedEventId :: Text
    <*> arbitrary -- realtimeServerEventSessionUpdatedType :: E'Type59
    <*> arbitraryReduced n -- realtimeServerEventSessionUpdatedSession :: RealtimeSession
  
instance Arbitrary RealtimeSession where
  arbitrary = sized genRealtimeSession

genRealtimeSession :: Int -> Gen RealtimeSession
genRealtimeSession n =
  RealtimeSession
    <$> arbitraryReducedMaybe n -- realtimeSessionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionModalities :: Maybe [E'Modalities]
    <*> arbitraryReducedMaybe n -- realtimeSessionModel :: Maybe RealtimeSessionModel
    <*> arbitraryReducedMaybe n -- realtimeSessionInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionVoice :: Maybe E'Voice2
    <*> arbitraryReducedMaybe n -- realtimeSessionInputAudioFormat :: Maybe E'OutputAudioFormat
    <*> arbitraryReducedMaybe n -- realtimeSessionOutputAudioFormat :: Maybe E'OutputAudioFormat
    <*> arbitraryReducedMaybe n -- realtimeSessionInputAudioTranscription :: Maybe RealtimeSessionInputAudioTranscription
    <*> arbitraryReducedMaybe n -- realtimeSessionTurnDetection :: Maybe RealtimeSessionTurnDetection
    <*> arbitraryReducedMaybe n -- realtimeSessionTools :: Maybe [RealtimeResponseCreateParamsToolsInner]
    <*> arbitraryReducedMaybe n -- realtimeSessionToolChoice :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- realtimeSessionMaxResponseOutputTokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens
  
instance Arbitrary RealtimeSessionCreateRequest where
  arbitrary = sized genRealtimeSessionCreateRequest

genRealtimeSessionCreateRequest :: Int -> Gen RealtimeSessionCreateRequest
genRealtimeSessionCreateRequest n =
  RealtimeSessionCreateRequest
    <$> arbitraryReducedMaybe n -- realtimeSessionCreateRequestModalities :: Maybe [E'Modalities]
    <*> arbitrary -- realtimeSessionCreateRequestModel :: E'Model
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestVoice :: Maybe E'Voice2
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestInputAudioFormat :: Maybe E'OutputAudioFormat
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestOutputAudioFormat :: Maybe E'OutputAudioFormat
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestInputAudioTranscription :: Maybe RealtimeSessionInputAudioTranscription
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTurnDetection :: Maybe RealtimeSessionCreateRequestTurnDetection
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTools :: Maybe [RealtimeResponseCreateParamsToolsInner]
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestToolChoice :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestMaxResponseOutputTokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens
  
instance Arbitrary RealtimeSessionCreateRequestTurnDetection where
  arbitrary = sized genRealtimeSessionCreateRequestTurnDetection

genRealtimeSessionCreateRequestTurnDetection :: Int -> Gen RealtimeSessionCreateRequestTurnDetection
genRealtimeSessionCreateRequestTurnDetection n =
  RealtimeSessionCreateRequestTurnDetection
    <$> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTurnDetectionType :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTurnDetectionThreshold :: Maybe Double
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTurnDetectionPrefixPaddingMs :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTurnDetectionSilenceDurationMs :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateRequestTurnDetectionCreateResponse :: Maybe Bool
  
instance Arbitrary RealtimeSessionCreateResponse where
  arbitrary = sized genRealtimeSessionCreateResponse

genRealtimeSessionCreateResponse :: Int -> Gen RealtimeSessionCreateResponse
genRealtimeSessionCreateResponse n =
  RealtimeSessionCreateResponse
    <$> arbitraryReducedMaybe n -- realtimeSessionCreateResponseClientSecret :: Maybe RealtimeSessionCreateResponseClientSecret
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseModalities :: Maybe [E'Modalities]
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseInstructions :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseVoice :: Maybe E'Voice2
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseInputAudioFormat :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseOutputAudioFormat :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseInputAudioTranscription :: Maybe RealtimeSessionInputAudioTranscription
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseTurnDetection :: Maybe RealtimeSessionCreateResponseTurnDetection
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseTools :: Maybe [RealtimeResponseCreateParamsToolsInner]
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseToolChoice :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseMaxResponseOutputTokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens
  
instance Arbitrary RealtimeSessionCreateResponseClientSecret where
  arbitrary = sized genRealtimeSessionCreateResponseClientSecret

genRealtimeSessionCreateResponseClientSecret :: Int -> Gen RealtimeSessionCreateResponseClientSecret
genRealtimeSessionCreateResponseClientSecret n =
  RealtimeSessionCreateResponseClientSecret
    <$> arbitraryReducedMaybe n -- realtimeSessionCreateResponseClientSecretValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseClientSecretExpiresAt :: Maybe Int
  
instance Arbitrary RealtimeSessionCreateResponseTurnDetection where
  arbitrary = sized genRealtimeSessionCreateResponseTurnDetection

genRealtimeSessionCreateResponseTurnDetection :: Int -> Gen RealtimeSessionCreateResponseTurnDetection
genRealtimeSessionCreateResponseTurnDetection n =
  RealtimeSessionCreateResponseTurnDetection
    <$> arbitraryReducedMaybe n -- realtimeSessionCreateResponseTurnDetectionType :: Maybe Text
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseTurnDetectionThreshold :: Maybe Double
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseTurnDetectionPrefixPaddingMs :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeSessionCreateResponseTurnDetectionSilenceDurationMs :: Maybe Int
  
instance Arbitrary RealtimeSessionInputAudioTranscription where
  arbitrary = sized genRealtimeSessionInputAudioTranscription

genRealtimeSessionInputAudioTranscription :: Int -> Gen RealtimeSessionInputAudioTranscription
genRealtimeSessionInputAudioTranscription n =
  RealtimeSessionInputAudioTranscription
    <$> arbitraryReducedMaybe n -- realtimeSessionInputAudioTranscriptionModel :: Maybe Text
  
instance Arbitrary RealtimeSessionModel where
  arbitrary = sized genRealtimeSessionModel

genRealtimeSessionModel :: Int -> Gen RealtimeSessionModel
genRealtimeSessionModel n =
  
  pure RealtimeSessionModel
   
instance Arbitrary RealtimeSessionTurnDetection where
  arbitrary = sized genRealtimeSessionTurnDetection

genRealtimeSessionTurnDetection :: Int -> Gen RealtimeSessionTurnDetection
genRealtimeSessionTurnDetection n =
  RealtimeSessionTurnDetection
    <$> arbitraryReducedMaybe n -- realtimeSessionTurnDetectionType :: Maybe E'Type78
    <*> arbitraryReducedMaybe n -- realtimeSessionTurnDetectionThreshold :: Maybe Double
    <*> arbitraryReducedMaybe n -- realtimeSessionTurnDetectionPrefixPaddingMs :: Maybe Int
    <*> arbitraryReducedMaybe n -- realtimeSessionTurnDetectionSilenceDurationMs :: Maybe Int
  
instance Arbitrary ResponseFormatJsonObject where
  arbitrary = sized genResponseFormatJsonObject

genResponseFormatJsonObject :: Int -> Gen ResponseFormatJsonObject
genResponseFormatJsonObject n =
  ResponseFormatJsonObject
    <$> arbitrary -- responseFormatJsonObjectType :: E'Type60
  
instance Arbitrary ResponseFormatJsonSchema where
  arbitrary = sized genResponseFormatJsonSchema

genResponseFormatJsonSchema :: Int -> Gen ResponseFormatJsonSchema
genResponseFormatJsonSchema n =
  ResponseFormatJsonSchema
    <$> arbitrary -- responseFormatJsonSchemaType :: E'Type61
    <*> arbitraryReduced n -- responseFormatJsonSchemaJsonSchema :: ResponseFormatJsonSchemaJsonSchema
  
instance Arbitrary ResponseFormatJsonSchemaJsonSchema where
  arbitrary = sized genResponseFormatJsonSchemaJsonSchema

genResponseFormatJsonSchemaJsonSchema :: Int -> Gen ResponseFormatJsonSchemaJsonSchema
genResponseFormatJsonSchemaJsonSchema n =
  ResponseFormatJsonSchemaJsonSchema
    <$> arbitraryReducedMaybe n -- responseFormatJsonSchemaJsonSchemaDescription :: Maybe Text
    <*> arbitrary -- responseFormatJsonSchemaJsonSchemaName :: Text
    <*> arbitraryReducedMaybe n -- responseFormatJsonSchemaJsonSchemaSchema :: Maybe (Map.Map String AnyType)
    <*> arbitraryReducedMaybe n -- responseFormatJsonSchemaJsonSchemaStrict :: Maybe Bool
  
instance Arbitrary ResponseFormatText where
  arbitrary = sized genResponseFormatText

genResponseFormatText :: Int -> Gen ResponseFormatText
genResponseFormatText n =
  ResponseFormatText
    <$> arbitrary -- responseFormatTextType :: E'Type12
  
instance Arbitrary RunCompletionUsage where
  arbitrary = sized genRunCompletionUsage

genRunCompletionUsage :: Int -> Gen RunCompletionUsage
genRunCompletionUsage n =
  RunCompletionUsage
    <$> arbitrary -- runCompletionUsageCompletionTokens :: Int
    <*> arbitrary -- runCompletionUsagePromptTokens :: Int
    <*> arbitrary -- runCompletionUsageTotalTokens :: Int
  
instance Arbitrary RunObject where
  arbitrary = sized genRunObject

genRunObject :: Int -> Gen RunObject
genRunObject n =
  RunObject
    <$> arbitrary -- runObjectId :: Text
    <*> arbitrary -- runObjectObject :: E'Object34
    <*> arbitrary -- runObjectCreatedAt :: Int
    <*> arbitrary -- runObjectThreadId :: Text
    <*> arbitrary -- runObjectAssistantId :: Text
    <*> arbitrary -- runObjectStatus :: E'Status9
    <*> arbitraryReduced n -- runObjectRequiredAction :: RunObjectRequiredAction
    <*> arbitraryReduced n -- runObjectLastError :: RunObjectLastError
    <*> arbitrary -- runObjectExpiresAt :: Int
    <*> arbitrary -- runObjectStartedAt :: Int
    <*> arbitrary -- runObjectCancelledAt :: Int
    <*> arbitrary -- runObjectFailedAt :: Int
    <*> arbitrary -- runObjectCompletedAt :: Int
    <*> arbitraryReduced n -- runObjectIncompleteDetails :: RunObjectIncompleteDetails
    <*> arbitrary -- runObjectModel :: Text
    <*> arbitrary -- runObjectInstructions :: Text
    <*> arbitraryReduced n -- runObjectTools :: [AssistantObjectToolsInner]
    <*> arbitraryReduced n -- runObjectMetadata :: A.Value
    <*> arbitraryReduced n -- runObjectUsage :: RunCompletionUsage
    <*> arbitraryReducedMaybe n -- runObjectTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- runObjectTopP :: Maybe Double
    <*> arbitrary -- runObjectMaxPromptTokens :: Int
    <*> arbitrary -- runObjectMaxCompletionTokens :: Int
    <*> arbitraryReduced n -- runObjectTruncationStrategy :: TruncationObject
    <*> arbitraryReduced n -- runObjectToolChoice :: AssistantsApiToolChoiceOption
    <*> arbitrary -- runObjectParallelToolCalls :: Bool
    <*> arbitraryReduced n -- runObjectResponseFormat :: AssistantsApiResponseFormatOption
  
instance Arbitrary RunObjectIncompleteDetails where
  arbitrary = sized genRunObjectIncompleteDetails

genRunObjectIncompleteDetails :: Int -> Gen RunObjectIncompleteDetails
genRunObjectIncompleteDetails n =
  RunObjectIncompleteDetails
    <$> arbitraryReducedMaybe n -- runObjectIncompleteDetailsReason :: Maybe E'Reason3
  
instance Arbitrary RunObjectLastError where
  arbitrary = sized genRunObjectLastError

genRunObjectLastError :: Int -> Gen RunObjectLastError
genRunObjectLastError n =
  RunObjectLastError
    <$> arbitrary -- runObjectLastErrorCode :: E'Code
    <*> arbitrary -- runObjectLastErrorMessage :: Text
  
instance Arbitrary RunObjectRequiredAction where
  arbitrary = sized genRunObjectRequiredAction

genRunObjectRequiredAction :: Int -> Gen RunObjectRequiredAction
genRunObjectRequiredAction n =
  RunObjectRequiredAction
    <$> arbitrary -- runObjectRequiredActionType :: E'Type79
    <*> arbitraryReduced n -- runObjectRequiredActionSubmitToolOutputs :: RunObjectRequiredActionSubmitToolOutputs
  
instance Arbitrary RunObjectRequiredActionSubmitToolOutputs where
  arbitrary = sized genRunObjectRequiredActionSubmitToolOutputs

genRunObjectRequiredActionSubmitToolOutputs :: Int -> Gen RunObjectRequiredActionSubmitToolOutputs
genRunObjectRequiredActionSubmitToolOutputs n =
  RunObjectRequiredActionSubmitToolOutputs
    <$> arbitraryReduced n -- runObjectRequiredActionSubmitToolOutputsToolCalls :: [RunToolCallObject]
  
instance Arbitrary RunStepCompletionUsage where
  arbitrary = sized genRunStepCompletionUsage

genRunStepCompletionUsage :: Int -> Gen RunStepCompletionUsage
genRunStepCompletionUsage n =
  RunStepCompletionUsage
    <$> arbitrary -- runStepCompletionUsageCompletionTokens :: Int
    <*> arbitrary -- runStepCompletionUsagePromptTokens :: Int
    <*> arbitrary -- runStepCompletionUsageTotalTokens :: Int
  
instance Arbitrary RunStepDeltaObject where
  arbitrary = sized genRunStepDeltaObject

genRunStepDeltaObject :: Int -> Gen RunStepDeltaObject
genRunStepDeltaObject n =
  RunStepDeltaObject
    <$> arbitrary -- runStepDeltaObjectId :: Text
    <*> arbitrary -- runStepDeltaObjectObject :: E'Object35
    <*> arbitraryReduced n -- runStepDeltaObjectDelta :: RunStepDeltaObjectDelta
  
instance Arbitrary RunStepDeltaObjectDelta where
  arbitrary = sized genRunStepDeltaObjectDelta

genRunStepDeltaObjectDelta :: Int -> Gen RunStepDeltaObjectDelta
genRunStepDeltaObjectDelta n =
  RunStepDeltaObjectDelta
    <$> arbitraryReducedMaybe n -- runStepDeltaObjectDeltaStepDetails :: Maybe RunStepDeltaObjectDeltaStepDetails
  
instance Arbitrary RunStepDeltaObjectDeltaStepDetails where
  arbitrary = sized genRunStepDeltaObjectDeltaStepDetails

genRunStepDeltaObjectDeltaStepDetails :: Int -> Gen RunStepDeltaObjectDeltaStepDetails
genRunStepDeltaObjectDeltaStepDetails n =
  RunStepDeltaObjectDeltaStepDetails
    <$> arbitrary -- runStepDeltaObjectDeltaStepDetailsType :: E'Type66
    <*> arbitraryReducedMaybe n -- runStepDeltaObjectDeltaStepDetailsMessageCreation :: Maybe RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    <*> arbitraryReducedMaybe n -- runStepDeltaObjectDeltaStepDetailsToolCalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
  
instance Arbitrary RunStepDeltaStepDetailsMessageCreationObject where
  arbitrary = sized genRunStepDeltaStepDetailsMessageCreationObject

genRunStepDeltaStepDetailsMessageCreationObject :: Int -> Gen RunStepDeltaStepDetailsMessageCreationObject
genRunStepDeltaStepDetailsMessageCreationObject n =
  RunStepDeltaStepDetailsMessageCreationObject
    <$> arbitrary -- runStepDeltaStepDetailsMessageCreationObjectType :: E'Type62
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsMessageCreationObjectMessageCreation :: Maybe RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
  
instance Arbitrary RunStepDeltaStepDetailsMessageCreationObjectMessageCreation where
  arbitrary = sized genRunStepDeltaStepDetailsMessageCreationObjectMessageCreation

genRunStepDeltaStepDetailsMessageCreationObjectMessageCreation :: Int -> Gen RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
genRunStepDeltaStepDetailsMessageCreationObjectMessageCreation n =
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    <$> arbitraryReducedMaybe n -- runStepDeltaStepDetailsMessageCreationObjectMessageCreationMessageId :: Maybe Text
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsCodeObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsCodeObject

genRunStepDeltaStepDetailsToolCallsCodeObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsCodeObject
genRunStepDeltaStepDetailsToolCallsCodeObject n =
  RunStepDeltaStepDetailsToolCallsCodeObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsCodeObjectIndex :: Int
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectId :: Maybe Text
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeObjectType :: E'Type
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter :: Maybe RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

genRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter :: Int -> Gen RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
genRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter n =
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
    <$> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterInput :: Maybe Text
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputs :: Maybe [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

genRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner :: Int -> Gen RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
genRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner n =
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerIndex :: Int
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType :: E'Type80
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs :: Maybe Text
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage :: Maybe RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsCodeOutputImageObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsCodeOutputImageObject

genRunStepDeltaStepDetailsToolCallsCodeOutputImageObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
genRunStepDeltaStepDetailsToolCallsCodeOutputImageObject n =
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsCodeOutputImageObjectIndex :: Int
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeOutputImageObjectType :: E'Type63
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage :: Maybe RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage

genRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage :: Int -> Gen RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
genRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage n =
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    <$> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageFileId :: Maybe Text
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

genRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
genRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject n =
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectIndex :: Int
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectType :: E'Type64
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectLogs :: Maybe Text
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsFileSearchObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsFileSearchObject

genRunStepDeltaStepDetailsToolCallsFileSearchObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsFileSearchObject
genRunStepDeltaStepDetailsToolCallsFileSearchObject n =
  RunStepDeltaStepDetailsToolCallsFileSearchObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsFileSearchObjectIndex :: Int
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsFileSearchObjectId :: Maybe Text
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsFileSearchObjectType :: E'Type2
    <*> arbitraryReduced n -- runStepDeltaStepDetailsToolCallsFileSearchObjectFileSearch :: A.Value
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsFunctionObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsFunctionObject

genRunStepDeltaStepDetailsToolCallsFunctionObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsFunctionObject
genRunStepDeltaStepDetailsToolCallsFunctionObject n =
  RunStepDeltaStepDetailsToolCallsFunctionObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsFunctionObjectIndex :: Int
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsFunctionObjectId :: Maybe Text
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsFunctionObjectType :: E'Type3
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsFunctionObjectFunction :: Maybe RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsFunctionObjectFunction where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsFunctionObjectFunction

genRunStepDeltaStepDetailsToolCallsFunctionObjectFunction :: Int -> Gen RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
genRunStepDeltaStepDetailsToolCallsFunctionObjectFunction n =
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
    <$> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsFunctionObjectFunctionName :: Maybe Text
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsFunctionObjectFunctionArguments :: Maybe Text
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsFunctionObjectFunctionOutput :: Maybe Text
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsObject

genRunStepDeltaStepDetailsToolCallsObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsObject
genRunStepDeltaStepDetailsToolCallsObject n =
  RunStepDeltaStepDetailsToolCallsObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsObjectType :: E'Type65
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsObjectToolCallsInner where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsObjectToolCallsInner

genRunStepDeltaStepDetailsToolCallsObjectToolCallsInner :: Int -> Gen RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
genRunStepDeltaStepDetailsToolCallsObjectToolCallsInner n =
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerIndex :: Int
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerId :: Maybe Text
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerType :: E'Type69
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerCodeInterpreter :: Maybe RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
    <*> arbitraryReduced n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFileSearch :: A.Value
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFunction :: Maybe RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
  
instance Arbitrary RunStepDetailsMessageCreationObject where
  arbitrary = sized genRunStepDetailsMessageCreationObject

genRunStepDetailsMessageCreationObject :: Int -> Gen RunStepDetailsMessageCreationObject
genRunStepDetailsMessageCreationObject n =
  RunStepDetailsMessageCreationObject
    <$> arbitrary -- runStepDetailsMessageCreationObjectType :: E'Type62
    <*> arbitraryReduced n -- runStepDetailsMessageCreationObjectMessageCreation :: RunStepDetailsMessageCreationObjectMessageCreation
  
instance Arbitrary RunStepDetailsMessageCreationObjectMessageCreation where
  arbitrary = sized genRunStepDetailsMessageCreationObjectMessageCreation

genRunStepDetailsMessageCreationObjectMessageCreation :: Int -> Gen RunStepDetailsMessageCreationObjectMessageCreation
genRunStepDetailsMessageCreationObjectMessageCreation n =
  RunStepDetailsMessageCreationObjectMessageCreation
    <$> arbitrary -- runStepDetailsMessageCreationObjectMessageCreationMessageId :: Text
  
instance Arbitrary RunStepDetailsToolCallsCodeObject where
  arbitrary = sized genRunStepDetailsToolCallsCodeObject

genRunStepDetailsToolCallsCodeObject :: Int -> Gen RunStepDetailsToolCallsCodeObject
genRunStepDetailsToolCallsCodeObject n =
  RunStepDetailsToolCallsCodeObject
    <$> arbitrary -- runStepDetailsToolCallsCodeObjectId :: Text
    <*> arbitrary -- runStepDetailsToolCallsCodeObjectType :: E'Type
    <*> arbitraryReduced n -- runStepDetailsToolCallsCodeObjectCodeInterpreter :: RunStepDetailsToolCallsCodeObjectCodeInterpreter
  
instance Arbitrary RunStepDetailsToolCallsCodeObjectCodeInterpreter where
  arbitrary = sized genRunStepDetailsToolCallsCodeObjectCodeInterpreter

genRunStepDetailsToolCallsCodeObjectCodeInterpreter :: Int -> Gen RunStepDetailsToolCallsCodeObjectCodeInterpreter
genRunStepDetailsToolCallsCodeObjectCodeInterpreter n =
  RunStepDetailsToolCallsCodeObjectCodeInterpreter
    <$> arbitrary -- runStepDetailsToolCallsCodeObjectCodeInterpreterInput :: Text
    <*> arbitraryReduced n -- runStepDetailsToolCallsCodeObjectCodeInterpreterOutputs :: [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
  
instance Arbitrary RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner where
  arbitrary = sized genRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

genRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner :: Int -> Gen RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
genRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner n =
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
    <$> arbitrary -- runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType :: E'Type80
    <*> arbitrary -- runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs :: Text
    <*> arbitraryReduced n -- runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage :: RunStepDetailsToolCallsCodeOutputImageObjectImage
  
instance Arbitrary RunStepDetailsToolCallsCodeOutputImageObject where
  arbitrary = sized genRunStepDetailsToolCallsCodeOutputImageObject

genRunStepDetailsToolCallsCodeOutputImageObject :: Int -> Gen RunStepDetailsToolCallsCodeOutputImageObject
genRunStepDetailsToolCallsCodeOutputImageObject n =
  RunStepDetailsToolCallsCodeOutputImageObject
    <$> arbitrary -- runStepDetailsToolCallsCodeOutputImageObjectType :: E'Type63
    <*> arbitraryReduced n -- runStepDetailsToolCallsCodeOutputImageObjectImage :: RunStepDetailsToolCallsCodeOutputImageObjectImage
  
instance Arbitrary RunStepDetailsToolCallsCodeOutputImageObjectImage where
  arbitrary = sized genRunStepDetailsToolCallsCodeOutputImageObjectImage

genRunStepDetailsToolCallsCodeOutputImageObjectImage :: Int -> Gen RunStepDetailsToolCallsCodeOutputImageObjectImage
genRunStepDetailsToolCallsCodeOutputImageObjectImage n =
  RunStepDetailsToolCallsCodeOutputImageObjectImage
    <$> arbitrary -- runStepDetailsToolCallsCodeOutputImageObjectImageFileId :: Text
  
instance Arbitrary RunStepDetailsToolCallsCodeOutputLogsObject where
  arbitrary = sized genRunStepDetailsToolCallsCodeOutputLogsObject

genRunStepDetailsToolCallsCodeOutputLogsObject :: Int -> Gen RunStepDetailsToolCallsCodeOutputLogsObject
genRunStepDetailsToolCallsCodeOutputLogsObject n =
  RunStepDetailsToolCallsCodeOutputLogsObject
    <$> arbitrary -- runStepDetailsToolCallsCodeOutputLogsObjectType :: E'Type64
    <*> arbitrary -- runStepDetailsToolCallsCodeOutputLogsObjectLogs :: Text
  
instance Arbitrary RunStepDetailsToolCallsFileSearchObject where
  arbitrary = sized genRunStepDetailsToolCallsFileSearchObject

genRunStepDetailsToolCallsFileSearchObject :: Int -> Gen RunStepDetailsToolCallsFileSearchObject
genRunStepDetailsToolCallsFileSearchObject n =
  RunStepDetailsToolCallsFileSearchObject
    <$> arbitrary -- runStepDetailsToolCallsFileSearchObjectId :: Text
    <*> arbitrary -- runStepDetailsToolCallsFileSearchObjectType :: E'Type2
    <*> arbitraryReduced n -- runStepDetailsToolCallsFileSearchObjectFileSearch :: RunStepDetailsToolCallsFileSearchObjectFileSearch
  
instance Arbitrary RunStepDetailsToolCallsFileSearchObjectFileSearch where
  arbitrary = sized genRunStepDetailsToolCallsFileSearchObjectFileSearch

genRunStepDetailsToolCallsFileSearchObjectFileSearch :: Int -> Gen RunStepDetailsToolCallsFileSearchObjectFileSearch
genRunStepDetailsToolCallsFileSearchObjectFileSearch n =
  RunStepDetailsToolCallsFileSearchObjectFileSearch
    <$> arbitraryReducedMaybe n -- runStepDetailsToolCallsFileSearchObjectFileSearchRankingOptions :: Maybe RunStepDetailsToolCallsFileSearchRankingOptionsObject
    <*> arbitraryReducedMaybe n -- runStepDetailsToolCallsFileSearchObjectFileSearchResults :: Maybe [RunStepDetailsToolCallsFileSearchResultObject]
  
instance Arbitrary RunStepDetailsToolCallsFileSearchRankingOptionsObject where
  arbitrary = sized genRunStepDetailsToolCallsFileSearchRankingOptionsObject

genRunStepDetailsToolCallsFileSearchRankingOptionsObject :: Int -> Gen RunStepDetailsToolCallsFileSearchRankingOptionsObject
genRunStepDetailsToolCallsFileSearchRankingOptionsObject n =
  RunStepDetailsToolCallsFileSearchRankingOptionsObject
    <$> arbitrary -- runStepDetailsToolCallsFileSearchRankingOptionsObjectRanker :: E'Ranker2
    <*> arbitrary -- runStepDetailsToolCallsFileSearchRankingOptionsObjectScoreThreshold :: Double
  
instance Arbitrary RunStepDetailsToolCallsFileSearchResultObject where
  arbitrary = sized genRunStepDetailsToolCallsFileSearchResultObject

genRunStepDetailsToolCallsFileSearchResultObject :: Int -> Gen RunStepDetailsToolCallsFileSearchResultObject
genRunStepDetailsToolCallsFileSearchResultObject n =
  RunStepDetailsToolCallsFileSearchResultObject
    <$> arbitrary -- runStepDetailsToolCallsFileSearchResultObjectFileId :: Text
    <*> arbitrary -- runStepDetailsToolCallsFileSearchResultObjectFileName :: Text
    <*> arbitrary -- runStepDetailsToolCallsFileSearchResultObjectScore :: Double
    <*> arbitraryReducedMaybe n -- runStepDetailsToolCallsFileSearchResultObjectContent :: Maybe [RunStepDetailsToolCallsFileSearchResultObjectContentInner]
  
instance Arbitrary RunStepDetailsToolCallsFileSearchResultObjectContentInner where
  arbitrary = sized genRunStepDetailsToolCallsFileSearchResultObjectContentInner

genRunStepDetailsToolCallsFileSearchResultObjectContentInner :: Int -> Gen RunStepDetailsToolCallsFileSearchResultObjectContentInner
genRunStepDetailsToolCallsFileSearchResultObjectContentInner n =
  RunStepDetailsToolCallsFileSearchResultObjectContentInner
    <$> arbitraryReducedMaybe n -- runStepDetailsToolCallsFileSearchResultObjectContentInnerType :: Maybe E'Type12
    <*> arbitraryReducedMaybe n -- runStepDetailsToolCallsFileSearchResultObjectContentInnerText :: Maybe Text
  
instance Arbitrary RunStepDetailsToolCallsFunctionObject where
  arbitrary = sized genRunStepDetailsToolCallsFunctionObject

genRunStepDetailsToolCallsFunctionObject :: Int -> Gen RunStepDetailsToolCallsFunctionObject
genRunStepDetailsToolCallsFunctionObject n =
  RunStepDetailsToolCallsFunctionObject
    <$> arbitrary -- runStepDetailsToolCallsFunctionObjectId :: Text
    <*> arbitrary -- runStepDetailsToolCallsFunctionObjectType :: E'Type3
    <*> arbitraryReduced n -- runStepDetailsToolCallsFunctionObjectFunction :: RunStepDetailsToolCallsFunctionObjectFunction
  
instance Arbitrary RunStepDetailsToolCallsFunctionObjectFunction where
  arbitrary = sized genRunStepDetailsToolCallsFunctionObjectFunction

genRunStepDetailsToolCallsFunctionObjectFunction :: Int -> Gen RunStepDetailsToolCallsFunctionObjectFunction
genRunStepDetailsToolCallsFunctionObjectFunction n =
  RunStepDetailsToolCallsFunctionObjectFunction
    <$> arbitrary -- runStepDetailsToolCallsFunctionObjectFunctionName :: Text
    <*> arbitrary -- runStepDetailsToolCallsFunctionObjectFunctionArguments :: Text
    <*> arbitrary -- runStepDetailsToolCallsFunctionObjectFunctionOutput :: Text
  
instance Arbitrary RunStepDetailsToolCallsObject where
  arbitrary = sized genRunStepDetailsToolCallsObject

genRunStepDetailsToolCallsObject :: Int -> Gen RunStepDetailsToolCallsObject
genRunStepDetailsToolCallsObject n =
  RunStepDetailsToolCallsObject
    <$> arbitrary -- runStepDetailsToolCallsObjectType :: E'Type65
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCalls :: [RunStepDetailsToolCallsObjectToolCallsInner]
  
instance Arbitrary RunStepDetailsToolCallsObjectToolCallsInner where
  arbitrary = sized genRunStepDetailsToolCallsObjectToolCallsInner

genRunStepDetailsToolCallsObjectToolCallsInner :: Int -> Gen RunStepDetailsToolCallsObjectToolCallsInner
genRunStepDetailsToolCallsObjectToolCallsInner n =
  RunStepDetailsToolCallsObjectToolCallsInner
    <$> arbitrary -- runStepDetailsToolCallsObjectToolCallsInnerId :: Text
    <*> arbitrary -- runStepDetailsToolCallsObjectToolCallsInnerType :: E'Type69
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCallsInnerCodeInterpreter :: RunStepDetailsToolCallsCodeObjectCodeInterpreter
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCallsInnerFileSearch :: RunStepDetailsToolCallsFileSearchObjectFileSearch
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCallsInnerFunction :: RunStepDetailsToolCallsFunctionObjectFunction
  
instance Arbitrary RunStepObject where
  arbitrary = sized genRunStepObject

genRunStepObject :: Int -> Gen RunStepObject
genRunStepObject n =
  RunStepObject
    <$> arbitrary -- runStepObjectId :: Text
    <*> arbitrary -- runStepObjectObject :: E'Object36
    <*> arbitrary -- runStepObjectCreatedAt :: Int
    <*> arbitrary -- runStepObjectAssistantId :: Text
    <*> arbitrary -- runStepObjectThreadId :: Text
    <*> arbitrary -- runStepObjectRunId :: Text
    <*> arbitrary -- runStepObjectType :: E'Type66
    <*> arbitrary -- runStepObjectStatus :: E'Status10
    <*> arbitraryReduced n -- runStepObjectStepDetails :: RunStepObjectStepDetails
    <*> arbitraryReduced n -- runStepObjectLastError :: RunStepObjectLastError
    <*> arbitrary -- runStepObjectExpiredAt :: Int
    <*> arbitrary -- runStepObjectCancelledAt :: Int
    <*> arbitrary -- runStepObjectFailedAt :: Int
    <*> arbitrary -- runStepObjectCompletedAt :: Int
    <*> arbitraryReduced n -- runStepObjectMetadata :: A.Value
    <*> arbitraryReduced n -- runStepObjectUsage :: RunStepCompletionUsage
  
instance Arbitrary RunStepObjectLastError where
  arbitrary = sized genRunStepObjectLastError

genRunStepObjectLastError :: Int -> Gen RunStepObjectLastError
genRunStepObjectLastError n =
  RunStepObjectLastError
    <$> arbitrary -- runStepObjectLastErrorCode :: E'Code2
    <*> arbitrary -- runStepObjectLastErrorMessage :: Text
  
instance Arbitrary RunStepObjectStepDetails where
  arbitrary = sized genRunStepObjectStepDetails

genRunStepObjectStepDetails :: Int -> Gen RunStepObjectStepDetails
genRunStepObjectStepDetails n =
  RunStepObjectStepDetails
    <$> arbitrary -- runStepObjectStepDetailsType :: E'Type66
    <*> arbitraryReduced n -- runStepObjectStepDetailsMessageCreation :: RunStepDetailsMessageCreationObjectMessageCreation
    <*> arbitraryReduced n -- runStepObjectStepDetailsToolCalls :: [RunStepDetailsToolCallsObjectToolCallsInner]
  
instance Arbitrary RunStepStreamEvent where
  arbitrary = sized genRunStepStreamEvent

genRunStepStreamEvent :: Int -> Gen RunStepStreamEvent
genRunStepStreamEvent n =
  RunStepStreamEvent
    <$> arbitrary -- runStepStreamEventEvent :: E'Event4
    <*> arbitraryReduced n -- runStepStreamEventData :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf where
  arbitrary = sized genRunStepStreamEventOneOf

genRunStepStreamEventOneOf :: Int -> Gen RunStepStreamEventOneOf
genRunStepStreamEventOneOf n =
  RunStepStreamEventOneOf
    <$> arbitrary -- runStepStreamEventOneOfEvent :: E'Event10
    <*> arbitraryReduced n -- runStepStreamEventOneOfData :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf1 where
  arbitrary = sized genRunStepStreamEventOneOf1

genRunStepStreamEventOneOf1 :: Int -> Gen RunStepStreamEventOneOf1
genRunStepStreamEventOneOf1 n =
  RunStepStreamEventOneOf1
    <$> arbitrary -- runStepStreamEventOneOf1Event :: E'Event11
    <*> arbitraryReduced n -- runStepStreamEventOneOf1Data :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf2 where
  arbitrary = sized genRunStepStreamEventOneOf2

genRunStepStreamEventOneOf2 :: Int -> Gen RunStepStreamEventOneOf2
genRunStepStreamEventOneOf2 n =
  RunStepStreamEventOneOf2
    <$> arbitrary -- runStepStreamEventOneOf2Event :: E'Object35
    <*> arbitraryReduced n -- runStepStreamEventOneOf2Data :: RunStepDeltaObject
  
instance Arbitrary RunStepStreamEventOneOf3 where
  arbitrary = sized genRunStepStreamEventOneOf3

genRunStepStreamEventOneOf3 :: Int -> Gen RunStepStreamEventOneOf3
genRunStepStreamEventOneOf3 n =
  RunStepStreamEventOneOf3
    <$> arbitrary -- runStepStreamEventOneOf3Event :: E'Event12
    <*> arbitraryReduced n -- runStepStreamEventOneOf3Data :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf4 where
  arbitrary = sized genRunStepStreamEventOneOf4

genRunStepStreamEventOneOf4 :: Int -> Gen RunStepStreamEventOneOf4
genRunStepStreamEventOneOf4 n =
  RunStepStreamEventOneOf4
    <$> arbitrary -- runStepStreamEventOneOf4Event :: E'Event13
    <*> arbitraryReduced n -- runStepStreamEventOneOf4Data :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf5 where
  arbitrary = sized genRunStepStreamEventOneOf5

genRunStepStreamEventOneOf5 :: Int -> Gen RunStepStreamEventOneOf5
genRunStepStreamEventOneOf5 n =
  RunStepStreamEventOneOf5
    <$> arbitrary -- runStepStreamEventOneOf5Event :: E'Event14
    <*> arbitraryReduced n -- runStepStreamEventOneOf5Data :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf6 where
  arbitrary = sized genRunStepStreamEventOneOf6

genRunStepStreamEventOneOf6 :: Int -> Gen RunStepStreamEventOneOf6
genRunStepStreamEventOneOf6 n =
  RunStepStreamEventOneOf6
    <$> arbitrary -- runStepStreamEventOneOf6Event :: E'Event4
    <*> arbitraryReduced n -- runStepStreamEventOneOf6Data :: RunStepObject
  
instance Arbitrary RunStreamEvent where
  arbitrary = sized genRunStreamEvent

genRunStreamEvent :: Int -> Gen RunStreamEvent
genRunStreamEvent n =
  RunStreamEvent
    <$> arbitrary -- runStreamEventEvent :: E'Event5
    <*> arbitraryReduced n -- runStreamEventData :: RunObject
  
instance Arbitrary RunStreamEventOneOf where
  arbitrary = sized genRunStreamEventOneOf

genRunStreamEventOneOf :: Int -> Gen RunStreamEventOneOf
genRunStreamEventOneOf n =
  RunStreamEventOneOf
    <$> arbitrary -- runStreamEventOneOfEvent :: E'Event15
    <*> arbitraryReduced n -- runStreamEventOneOfData :: RunObject
  
instance Arbitrary RunStreamEventOneOf1 where
  arbitrary = sized genRunStreamEventOneOf1

genRunStreamEventOneOf1 :: Int -> Gen RunStreamEventOneOf1
genRunStreamEventOneOf1 n =
  RunStreamEventOneOf1
    <$> arbitrary -- runStreamEventOneOf1Event :: E'Event16
    <*> arbitraryReduced n -- runStreamEventOneOf1Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf2 where
  arbitrary = sized genRunStreamEventOneOf2

genRunStreamEventOneOf2 :: Int -> Gen RunStreamEventOneOf2
genRunStreamEventOneOf2 n =
  RunStreamEventOneOf2
    <$> arbitrary -- runStreamEventOneOf2Event :: E'Event17
    <*> arbitraryReduced n -- runStreamEventOneOf2Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf3 where
  arbitrary = sized genRunStreamEventOneOf3

genRunStreamEventOneOf3 :: Int -> Gen RunStreamEventOneOf3
genRunStreamEventOneOf3 n =
  RunStreamEventOneOf3
    <$> arbitrary -- runStreamEventOneOf3Event :: E'Event18
    <*> arbitraryReduced n -- runStreamEventOneOf3Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf4 where
  arbitrary = sized genRunStreamEventOneOf4

genRunStreamEventOneOf4 :: Int -> Gen RunStreamEventOneOf4
genRunStreamEventOneOf4 n =
  RunStreamEventOneOf4
    <$> arbitrary -- runStreamEventOneOf4Event :: E'Event19
    <*> arbitraryReduced n -- runStreamEventOneOf4Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf5 where
  arbitrary = sized genRunStreamEventOneOf5

genRunStreamEventOneOf5 :: Int -> Gen RunStreamEventOneOf5
genRunStreamEventOneOf5 n =
  RunStreamEventOneOf5
    <$> arbitrary -- runStreamEventOneOf5Event :: E'Event20
    <*> arbitraryReduced n -- runStreamEventOneOf5Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf6 where
  arbitrary = sized genRunStreamEventOneOf6

genRunStreamEventOneOf6 :: Int -> Gen RunStreamEventOneOf6
genRunStreamEventOneOf6 n =
  RunStreamEventOneOf6
    <$> arbitrary -- runStreamEventOneOf6Event :: E'Event21
    <*> arbitraryReduced n -- runStreamEventOneOf6Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf7 where
  arbitrary = sized genRunStreamEventOneOf7

genRunStreamEventOneOf7 :: Int -> Gen RunStreamEventOneOf7
genRunStreamEventOneOf7 n =
  RunStreamEventOneOf7
    <$> arbitrary -- runStreamEventOneOf7Event :: E'Event22
    <*> arbitraryReduced n -- runStreamEventOneOf7Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf8 where
  arbitrary = sized genRunStreamEventOneOf8

genRunStreamEventOneOf8 :: Int -> Gen RunStreamEventOneOf8
genRunStreamEventOneOf8 n =
  RunStreamEventOneOf8
    <$> arbitrary -- runStreamEventOneOf8Event :: E'Event23
    <*> arbitraryReduced n -- runStreamEventOneOf8Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf9 where
  arbitrary = sized genRunStreamEventOneOf9

genRunStreamEventOneOf9 :: Int -> Gen RunStreamEventOneOf9
genRunStreamEventOneOf9 n =
  RunStreamEventOneOf9
    <$> arbitrary -- runStreamEventOneOf9Event :: E'Event5
    <*> arbitraryReduced n -- runStreamEventOneOf9Data :: RunObject
  
instance Arbitrary RunToolCallObject where
  arbitrary = sized genRunToolCallObject

genRunToolCallObject :: Int -> Gen RunToolCallObject
genRunToolCallObject n =
  RunToolCallObject
    <$> arbitrary -- runToolCallObjectId :: Text
    <*> arbitrary -- runToolCallObjectType :: E'Type3
    <*> arbitraryReduced n -- runToolCallObjectFunction :: RunToolCallObjectFunction
  
instance Arbitrary RunToolCallObjectFunction where
  arbitrary = sized genRunToolCallObjectFunction

genRunToolCallObjectFunction :: Int -> Gen RunToolCallObjectFunction
genRunToolCallObjectFunction n =
  RunToolCallObjectFunction
    <$> arbitrary -- runToolCallObjectFunctionName :: Text
    <*> arbitrary -- runToolCallObjectFunctionArguments :: Text
  
instance Arbitrary StaticChunkingStrategy where
  arbitrary = sized genStaticChunkingStrategy

genStaticChunkingStrategy :: Int -> Gen StaticChunkingStrategy
genStaticChunkingStrategy n =
  StaticChunkingStrategy
    <$> arbitrary -- staticChunkingStrategyType :: E'Type67
    <*> arbitraryReduced n -- staticChunkingStrategyStatic :: StaticChunkingStrategyStatic
  
instance Arbitrary StaticChunkingStrategyRequestParam where
  arbitrary = sized genStaticChunkingStrategyRequestParam

genStaticChunkingStrategyRequestParam :: Int -> Gen StaticChunkingStrategyRequestParam
genStaticChunkingStrategyRequestParam n =
  StaticChunkingStrategyRequestParam
    <$> arbitrary -- staticChunkingStrategyRequestParamType :: E'Type67
    <*> arbitraryReduced n -- staticChunkingStrategyRequestParamStatic :: StaticChunkingStrategy
  
instance Arbitrary StaticChunkingStrategyResponseParam where
  arbitrary = sized genStaticChunkingStrategyResponseParam

genStaticChunkingStrategyResponseParam :: Int -> Gen StaticChunkingStrategyResponseParam
genStaticChunkingStrategyResponseParam n =
  StaticChunkingStrategyResponseParam
    <$> arbitrary -- staticChunkingStrategyResponseParamType :: E'Type67
    <*> arbitraryReduced n -- staticChunkingStrategyResponseParamStatic :: StaticChunkingStrategy
  
instance Arbitrary StaticChunkingStrategyStatic where
  arbitrary = sized genStaticChunkingStrategyStatic

genStaticChunkingStrategyStatic :: Int -> Gen StaticChunkingStrategyStatic
genStaticChunkingStrategyStatic n =
  StaticChunkingStrategyStatic
    <$> arbitrary -- staticChunkingStrategyStaticMaxChunkSizeTokens :: Int
    <*> arbitrary -- staticChunkingStrategyStaticChunkOverlapTokens :: Int
  
instance Arbitrary SubmitToolOutputsRunRequest where
  arbitrary = sized genSubmitToolOutputsRunRequest

genSubmitToolOutputsRunRequest :: Int -> Gen SubmitToolOutputsRunRequest
genSubmitToolOutputsRunRequest n =
  SubmitToolOutputsRunRequest
    <$> arbitraryReduced n -- submitToolOutputsRunRequestToolOutputs :: [SubmitToolOutputsRunRequestToolOutputsInner]
    <*> arbitraryReducedMaybe n -- submitToolOutputsRunRequestStream :: Maybe Bool
  
instance Arbitrary SubmitToolOutputsRunRequestToolOutputsInner where
  arbitrary = sized genSubmitToolOutputsRunRequestToolOutputsInner

genSubmitToolOutputsRunRequestToolOutputsInner :: Int -> Gen SubmitToolOutputsRunRequestToolOutputsInner
genSubmitToolOutputsRunRequestToolOutputsInner n =
  SubmitToolOutputsRunRequestToolOutputsInner
    <$> arbitraryReducedMaybe n -- submitToolOutputsRunRequestToolOutputsInnerToolCallId :: Maybe Text
    <*> arbitraryReducedMaybe n -- submitToolOutputsRunRequestToolOutputsInnerOutput :: Maybe Text
  
instance Arbitrary ThreadObject where
  arbitrary = sized genThreadObject

genThreadObject :: Int -> Gen ThreadObject
genThreadObject n =
  ThreadObject
    <$> arbitrary -- threadObjectId :: Text
    <*> arbitrary -- threadObjectObject :: E'Object37
    <*> arbitrary -- threadObjectCreatedAt :: Int
    <*> arbitraryReduced n -- threadObjectToolResources :: ModifyThreadRequestToolResources
    <*> arbitraryReduced n -- threadObjectMetadata :: A.Value
  
instance Arbitrary ThreadStreamEvent where
  arbitrary = sized genThreadStreamEvent

genThreadStreamEvent :: Int -> Gen ThreadStreamEvent
genThreadStreamEvent n =
  ThreadStreamEvent
    <$> arbitraryReducedMaybe n -- threadStreamEventEnabled :: Maybe Bool
    <*> arbitrary -- threadStreamEventEvent :: E'Event6
    <*> arbitraryReduced n -- threadStreamEventData :: ThreadObject
  
instance Arbitrary TranscriptionSegment where
  arbitrary = sized genTranscriptionSegment

genTranscriptionSegment :: Int -> Gen TranscriptionSegment
genTranscriptionSegment n =
  TranscriptionSegment
    <$> arbitrary -- transcriptionSegmentId :: Int
    <*> arbitrary -- transcriptionSegmentSeek :: Int
    <*> arbitrary -- transcriptionSegmentStart :: Float
    <*> arbitrary -- transcriptionSegmentEnd :: Float
    <*> arbitrary -- transcriptionSegmentText :: Text
    <*> arbitrary -- transcriptionSegmentTokens :: [Int]
    <*> arbitrary -- transcriptionSegmentTemperature :: Float
    <*> arbitrary -- transcriptionSegmentAvgLogprob :: Float
    <*> arbitrary -- transcriptionSegmentCompressionRatio :: Float
    <*> arbitrary -- transcriptionSegmentNoSpeechProb :: Float
  
instance Arbitrary TranscriptionWord where
  arbitrary = sized genTranscriptionWord

genTranscriptionWord :: Int -> Gen TranscriptionWord
genTranscriptionWord n =
  TranscriptionWord
    <$> arbitrary -- transcriptionWordWord :: Text
    <*> arbitrary -- transcriptionWordStart :: Float
    <*> arbitrary -- transcriptionWordEnd :: Float
  
instance Arbitrary TruncationObject where
  arbitrary = sized genTruncationObject

genTruncationObject :: Int -> Gen TruncationObject
genTruncationObject n =
  TruncationObject
    <$> arbitrary -- truncationObjectType :: E'Type68
    <*> arbitraryReducedMaybe n -- truncationObjectLastMessages :: Maybe Int
  
instance Arbitrary UpdateVectorStoreRequest where
  arbitrary = sized genUpdateVectorStoreRequest

genUpdateVectorStoreRequest :: Int -> Gen UpdateVectorStoreRequest
genUpdateVectorStoreRequest n =
  UpdateVectorStoreRequest
    <$> arbitraryReducedMaybe n -- updateVectorStoreRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateVectorStoreRequestExpiresAfter :: Maybe VectorStoreExpirationAfter
    <*> arbitraryReducedMaybeValue n -- updateVectorStoreRequestMetadata :: Maybe A.Value
  
instance Arbitrary Upload where
  arbitrary = sized genUpload

genUpload :: Int -> Gen Upload
genUpload n =
  Upload
    <$> arbitrary -- uploadId :: Text
    <*> arbitrary -- uploadCreatedAt :: Int
    <*> arbitrary -- uploadFilename :: Text
    <*> arbitrary -- uploadBytes :: Int
    <*> arbitrary -- uploadPurpose :: Text
    <*> arbitrary -- uploadStatus :: E'Status11
    <*> arbitrary -- uploadExpiresAt :: Int
    <*> arbitraryReducedMaybe n -- uploadObject :: Maybe E'Object38
    <*> arbitraryReducedMaybe n -- uploadFile :: Maybe OpenAIFile
  
instance Arbitrary UploadPart where
  arbitrary = sized genUploadPart

genUploadPart :: Int -> Gen UploadPart
genUploadPart n =
  UploadPart
    <$> arbitrary -- uploadPartId :: Text
    <*> arbitrary -- uploadPartCreatedAt :: Int
    <*> arbitrary -- uploadPartUploadId :: Text
    <*> arbitrary -- uploadPartObject :: E'Object39
  
instance Arbitrary UsageAudioSpeechesResult where
  arbitrary = sized genUsageAudioSpeechesResult

genUsageAudioSpeechesResult :: Int -> Gen UsageAudioSpeechesResult
genUsageAudioSpeechesResult n =
  UsageAudioSpeechesResult
    <$> arbitrary -- usageAudioSpeechesResultObject :: E'Object40
    <*> arbitrary -- usageAudioSpeechesResultCharacters :: Int
    <*> arbitrary -- usageAudioSpeechesResultNumModelRequests :: Int
    <*> arbitraryReducedMaybe n -- usageAudioSpeechesResultProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageAudioSpeechesResultUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageAudioSpeechesResultApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageAudioSpeechesResultModel :: Maybe Text
  
instance Arbitrary UsageAudioTranscriptionsResult where
  arbitrary = sized genUsageAudioTranscriptionsResult

genUsageAudioTranscriptionsResult :: Int -> Gen UsageAudioTranscriptionsResult
genUsageAudioTranscriptionsResult n =
  UsageAudioTranscriptionsResult
    <$> arbitrary -- usageAudioTranscriptionsResultObject :: E'Object41
    <*> arbitrary -- usageAudioTranscriptionsResultSeconds :: Int
    <*> arbitrary -- usageAudioTranscriptionsResultNumModelRequests :: Int
    <*> arbitraryReducedMaybe n -- usageAudioTranscriptionsResultProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageAudioTranscriptionsResultUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageAudioTranscriptionsResultApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageAudioTranscriptionsResultModel :: Maybe Text
  
instance Arbitrary UsageCodeInterpreterSessionsResult where
  arbitrary = sized genUsageCodeInterpreterSessionsResult

genUsageCodeInterpreterSessionsResult :: Int -> Gen UsageCodeInterpreterSessionsResult
genUsageCodeInterpreterSessionsResult n =
  UsageCodeInterpreterSessionsResult
    <$> arbitrary -- usageCodeInterpreterSessionsResultObject :: E'Object42
    <*> arbitrary -- usageCodeInterpreterSessionsResultSessions :: Int
    <*> arbitraryReducedMaybe n -- usageCodeInterpreterSessionsResultProjectId :: Maybe Text
  
instance Arbitrary UsageCompletionsResult where
  arbitrary = sized genUsageCompletionsResult

genUsageCompletionsResult :: Int -> Gen UsageCompletionsResult
genUsageCompletionsResult n =
  UsageCompletionsResult
    <$> arbitrary -- usageCompletionsResultObject :: E'Object43
    <*> arbitrary -- usageCompletionsResultInputTokens :: Int
    <*> arbitraryReducedMaybe n -- usageCompletionsResultInputCachedTokens :: Maybe Int
    <*> arbitrary -- usageCompletionsResultOutputTokens :: Int
    <*> arbitraryReducedMaybe n -- usageCompletionsResultInputAudioTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- usageCompletionsResultOutputAudioTokens :: Maybe Int
    <*> arbitrary -- usageCompletionsResultNumModelRequests :: Int
    <*> arbitraryReducedMaybe n -- usageCompletionsResultProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageCompletionsResultUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageCompletionsResultApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageCompletionsResultModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageCompletionsResultBatch :: Maybe Bool
  
instance Arbitrary UsageEmbeddingsResult where
  arbitrary = sized genUsageEmbeddingsResult

genUsageEmbeddingsResult :: Int -> Gen UsageEmbeddingsResult
genUsageEmbeddingsResult n =
  UsageEmbeddingsResult
    <$> arbitrary -- usageEmbeddingsResultObject :: E'Object44
    <*> arbitrary -- usageEmbeddingsResultInputTokens :: Int
    <*> arbitrary -- usageEmbeddingsResultNumModelRequests :: Int
    <*> arbitraryReducedMaybe n -- usageEmbeddingsResultProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageEmbeddingsResultUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageEmbeddingsResultApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageEmbeddingsResultModel :: Maybe Text
  
instance Arbitrary UsageImagesResult where
  arbitrary = sized genUsageImagesResult

genUsageImagesResult :: Int -> Gen UsageImagesResult
genUsageImagesResult n =
  UsageImagesResult
    <$> arbitrary -- usageImagesResultObject :: E'Object45
    <*> arbitrary -- usageImagesResultImages :: Int
    <*> arbitrary -- usageImagesResultNumModelRequests :: Int
    <*> arbitraryReducedMaybe n -- usageImagesResultSource :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageImagesResultSize :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageImagesResultProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageImagesResultUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageImagesResultApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageImagesResultModel :: Maybe Text
  
instance Arbitrary UsageModerationsResult where
  arbitrary = sized genUsageModerationsResult

genUsageModerationsResult :: Int -> Gen UsageModerationsResult
genUsageModerationsResult n =
  UsageModerationsResult
    <$> arbitrary -- usageModerationsResultObject :: E'Object46
    <*> arbitrary -- usageModerationsResultInputTokens :: Int
    <*> arbitrary -- usageModerationsResultNumModelRequests :: Int
    <*> arbitraryReducedMaybe n -- usageModerationsResultProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageModerationsResultUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageModerationsResultApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageModerationsResultModel :: Maybe Text
  
instance Arbitrary UsageResponse where
  arbitrary = sized genUsageResponse

genUsageResponse :: Int -> Gen UsageResponse
genUsageResponse n =
  UsageResponse
    <$> arbitrary -- usageResponseObject :: E'Object47
    <*> arbitraryReduced n -- usageResponseData :: [UsageTimeBucket]
    <*> arbitrary -- usageResponseHasMore :: Bool
    <*> arbitrary -- usageResponseNextPage :: Text
  
instance Arbitrary UsageTimeBucket where
  arbitrary = sized genUsageTimeBucket

genUsageTimeBucket :: Int -> Gen UsageTimeBucket
genUsageTimeBucket n =
  UsageTimeBucket
    <$> arbitrary -- usageTimeBucketObject :: E'Object48
    <*> arbitrary -- usageTimeBucketStartTime :: Int
    <*> arbitrary -- usageTimeBucketEndTime :: Int
    <*> arbitraryReduced n -- usageTimeBucketResult :: [UsageTimeBucketResultInner]
  
instance Arbitrary UsageTimeBucketResultInner where
  arbitrary = sized genUsageTimeBucketResultInner

genUsageTimeBucketResultInner :: Int -> Gen UsageTimeBucketResultInner
genUsageTimeBucketResultInner n =
  UsageTimeBucketResultInner
    <$> arbitrary -- usageTimeBucketResultInnerObject :: E'Object3
    <*> arbitrary -- usageTimeBucketResultInnerInputTokens :: Int
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerInputCachedTokens :: Maybe Int
    <*> arbitrary -- usageTimeBucketResultInnerOutputTokens :: Int
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerInputAudioTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerOutputAudioTokens :: Maybe Int
    <*> arbitrary -- usageTimeBucketResultInnerNumModelRequests :: Int
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerProjectId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerApiKeyId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerBatch :: Maybe Bool
    <*> arbitrary -- usageTimeBucketResultInnerImages :: Int
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerSource :: Maybe Text
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerSize :: Maybe Text
    <*> arbitrary -- usageTimeBucketResultInnerCharacters :: Int
    <*> arbitrary -- usageTimeBucketResultInnerSeconds :: Int
    <*> arbitrary -- usageTimeBucketResultInnerUsageBytes :: Int
    <*> arbitrary -- usageTimeBucketResultInnerSessions :: Int
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerAmount :: Maybe CostsResultAmount
    <*> arbitraryReducedMaybe n -- usageTimeBucketResultInnerLineItem :: Maybe Text
  
instance Arbitrary UsageVectorStoresResult where
  arbitrary = sized genUsageVectorStoresResult

genUsageVectorStoresResult :: Int -> Gen UsageVectorStoresResult
genUsageVectorStoresResult n =
  UsageVectorStoresResult
    <$> arbitrary -- usageVectorStoresResultObject :: E'Object49
    <*> arbitrary -- usageVectorStoresResultUsageBytes :: Int
    <*> arbitraryReducedMaybe n -- usageVectorStoresResultProjectId :: Maybe Text
  
instance Arbitrary User where
  arbitrary = sized genUser

genUser :: Int -> Gen User
genUser n =
  User
    <$> arbitrary -- userObject :: E'Object50
    <*> arbitrary -- userId :: Text
    <*> arbitrary -- userName :: Text
    <*> arbitrary -- userEmail :: Text
    <*> arbitrary -- userRole :: E'Role7
    <*> arbitrary -- userAddedAt :: Int
  
instance Arbitrary UserDeleteResponse where
  arbitrary = sized genUserDeleteResponse

genUserDeleteResponse :: Int -> Gen UserDeleteResponse
genUserDeleteResponse n =
  UserDeleteResponse
    <$> arbitrary -- userDeleteResponseObject :: E'Object51
    <*> arbitrary -- userDeleteResponseId :: Text
    <*> arbitrary -- userDeleteResponseDeleted :: Bool
  
instance Arbitrary UserListResponse where
  arbitrary = sized genUserListResponse

genUserListResponse :: Int -> Gen UserListResponse
genUserListResponse n =
  UserListResponse
    <$> arbitrary -- userListResponseObject :: E'Object7
    <*> arbitraryReduced n -- userListResponseData :: [User]
    <*> arbitrary -- userListResponseFirstId :: Text
    <*> arbitrary -- userListResponseLastId :: Text
    <*> arbitrary -- userListResponseHasMore :: Bool
  
instance Arbitrary UserRoleUpdateRequest where
  arbitrary = sized genUserRoleUpdateRequest

genUserRoleUpdateRequest :: Int -> Gen UserRoleUpdateRequest
genUserRoleUpdateRequest n =
  UserRoleUpdateRequest
    <$> arbitrary -- userRoleUpdateRequestRole :: E'Role7
  
instance Arbitrary VectorStoreExpirationAfter where
  arbitrary = sized genVectorStoreExpirationAfter

genVectorStoreExpirationAfter :: Int -> Gen VectorStoreExpirationAfter
genVectorStoreExpirationAfter n =
  VectorStoreExpirationAfter
    <$> arbitrary -- vectorStoreExpirationAfterAnchor :: E'Anchor
    <*> arbitrary -- vectorStoreExpirationAfterDays :: Int
  
instance Arbitrary VectorStoreFileBatchObject where
  arbitrary = sized genVectorStoreFileBatchObject

genVectorStoreFileBatchObject :: Int -> Gen VectorStoreFileBatchObject
genVectorStoreFileBatchObject n =
  VectorStoreFileBatchObject
    <$> arbitrary -- vectorStoreFileBatchObjectId :: Text
    <*> arbitrary -- vectorStoreFileBatchObjectObject :: E'Object52
    <*> arbitrary -- vectorStoreFileBatchObjectCreatedAt :: Int
    <*> arbitrary -- vectorStoreFileBatchObjectVectorStoreId :: Text
    <*> arbitrary -- vectorStoreFileBatchObjectStatus :: E'Status12
    <*> arbitraryReduced n -- vectorStoreFileBatchObjectFileCounts :: VectorStoreFileBatchObjectFileCounts
  
instance Arbitrary VectorStoreFileBatchObjectFileCounts where
  arbitrary = sized genVectorStoreFileBatchObjectFileCounts

genVectorStoreFileBatchObjectFileCounts :: Int -> Gen VectorStoreFileBatchObjectFileCounts
genVectorStoreFileBatchObjectFileCounts n =
  VectorStoreFileBatchObjectFileCounts
    <$> arbitrary -- vectorStoreFileBatchObjectFileCountsInProgress :: Int
    <*> arbitrary -- vectorStoreFileBatchObjectFileCountsCompleted :: Int
    <*> arbitrary -- vectorStoreFileBatchObjectFileCountsFailed :: Int
    <*> arbitrary -- vectorStoreFileBatchObjectFileCountsCancelled :: Int
    <*> arbitrary -- vectorStoreFileBatchObjectFileCountsTotal :: Int
  
instance Arbitrary VectorStoreFileObject where
  arbitrary = sized genVectorStoreFileObject

genVectorStoreFileObject :: Int -> Gen VectorStoreFileObject
genVectorStoreFileObject n =
  VectorStoreFileObject
    <$> arbitrary -- vectorStoreFileObjectId :: Text
    <*> arbitrary -- vectorStoreFileObjectObject :: E'Object53
    <*> arbitrary -- vectorStoreFileObjectUsageBytes :: Int
    <*> arbitrary -- vectorStoreFileObjectCreatedAt :: Int
    <*> arbitrary -- vectorStoreFileObjectVectorStoreId :: Text
    <*> arbitrary -- vectorStoreFileObjectStatus :: E'Status12
    <*> arbitraryReduced n -- vectorStoreFileObjectLastError :: VectorStoreFileObjectLastError
    <*> arbitraryReducedMaybe n -- vectorStoreFileObjectChunkingStrategy :: Maybe VectorStoreFileObjectChunkingStrategy
  
instance Arbitrary VectorStoreFileObjectChunkingStrategy where
  arbitrary = sized genVectorStoreFileObjectChunkingStrategy

genVectorStoreFileObjectChunkingStrategy :: Int -> Gen VectorStoreFileObjectChunkingStrategy
genVectorStoreFileObjectChunkingStrategy n =
  VectorStoreFileObjectChunkingStrategy
    <$> arbitrary -- vectorStoreFileObjectChunkingStrategyType :: E'Type81
    <*> arbitraryReduced n -- vectorStoreFileObjectChunkingStrategyStatic :: StaticChunkingStrategy
  
instance Arbitrary VectorStoreFileObjectLastError where
  arbitrary = sized genVectorStoreFileObjectLastError

genVectorStoreFileObjectLastError :: Int -> Gen VectorStoreFileObjectLastError
genVectorStoreFileObjectLastError n =
  VectorStoreFileObjectLastError
    <$> arbitrary -- vectorStoreFileObjectLastErrorCode :: E'Code3
    <*> arbitrary -- vectorStoreFileObjectLastErrorMessage :: Text
  
instance Arbitrary VectorStoreObject where
  arbitrary = sized genVectorStoreObject

genVectorStoreObject :: Int -> Gen VectorStoreObject
genVectorStoreObject n =
  VectorStoreObject
    <$> arbitrary -- vectorStoreObjectId :: Text
    <*> arbitrary -- vectorStoreObjectObject :: E'Object54
    <*> arbitrary -- vectorStoreObjectCreatedAt :: Int
    <*> arbitrary -- vectorStoreObjectName :: Text
    <*> arbitrary -- vectorStoreObjectUsageBytes :: Int
    <*> arbitraryReduced n -- vectorStoreObjectFileCounts :: VectorStoreObjectFileCounts
    <*> arbitrary -- vectorStoreObjectStatus :: E'Status13
    <*> arbitraryReducedMaybe n -- vectorStoreObjectExpiresAfter :: Maybe VectorStoreExpirationAfter
    <*> arbitraryReducedMaybe n -- vectorStoreObjectExpiresAt :: Maybe Int
    <*> arbitrary -- vectorStoreObjectLastActiveAt :: Int
    <*> arbitraryReduced n -- vectorStoreObjectMetadata :: A.Value
  
instance Arbitrary VectorStoreObjectFileCounts where
  arbitrary = sized genVectorStoreObjectFileCounts

genVectorStoreObjectFileCounts :: Int -> Gen VectorStoreObjectFileCounts
genVectorStoreObjectFileCounts n =
  VectorStoreObjectFileCounts
    <$> arbitrary -- vectorStoreObjectFileCountsInProgress :: Int
    <*> arbitrary -- vectorStoreObjectFileCountsCompleted :: Int
    <*> arbitrary -- vectorStoreObjectFileCountsFailed :: Int
    <*> arbitrary -- vectorStoreObjectFileCountsCancelled :: Int
    <*> arbitrary -- vectorStoreObjectFileCountsTotal :: Int
  



instance Arbitrary AudioResponseFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AuditLogEventType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ChatCompletionRole where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Anchor where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf1 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf10 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AnyOf9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BucketWidth where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BucketWidth2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Code where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Code2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Code3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CompletionWindow where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Data where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Detail where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EncodingFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Endpoint where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event10 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event11 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event12 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event13 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event14 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event15 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event16 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event17 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event18 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event19 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event20 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event21 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event22 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event23 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Event9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Filter where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FinishReason where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FinishReason2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FinishReason3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Format where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Format2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GroupBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GroupBy2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GroupBy3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GroupBy4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GroupBy5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Include where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Level where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Method where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Modalities where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Model where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Name where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object10 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object11 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object12 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object13 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object14 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object15 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object16 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object17 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object18 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object19 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object20 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object21 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object22 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object23 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object24 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object25 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object26 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object27 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object28 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object29 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object30 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object31 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object32 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object33 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object34 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object35 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object36 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object37 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object38 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object39 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object40 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object41 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object42 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object43 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object44 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object45 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object46 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object47 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object48 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object49 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object50 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object51 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object52 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object53 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object54 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OneOf0 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OneOf1 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OneOf2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OneOf3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OneOf4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Order where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OutputAudioFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Purpose where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Purpose2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Quality where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Ranker where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Ranker2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Reason where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Reason2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Reason3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReasoningEffort where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ResponseFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ResponseFormat2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role10 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role11 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role12 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SelfHarm where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ServiceTier where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ServiceTier2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Size where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Size2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Sizes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Sources where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status10 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status11 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status12 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status13 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Style where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TimestampGranularities where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type10 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type11 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type12 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type13 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type14 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type15 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type16 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type17 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type18 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type19 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type20 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type21 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type22 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type23 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type24 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type25 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type26 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type27 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type28 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type29 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type30 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type31 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type32 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type33 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type34 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type35 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type36 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type37 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type38 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type39 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type40 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type41 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type42 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type43 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type44 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type45 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type46 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type47 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type48 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type49 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type50 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type51 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type52 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type53 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type54 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type55 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type56 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type57 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type58 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type59 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type60 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type61 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type62 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type63 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type64 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type65 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type66 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type67 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type68 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type69 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type70 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type71 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type72 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type73 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type74 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type75 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type76 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type77 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type78 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type79 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type80 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type81 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Voice where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Voice2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Weight where
  arbitrary = arbitraryBoundedEnum

