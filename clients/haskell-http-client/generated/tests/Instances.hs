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

instance Arbitrary AssistantFileObject where
  arbitrary = sized genAssistantFileObject

genAssistantFileObject :: Int -> Gen AssistantFileObject
genAssistantFileObject n =
  AssistantFileObject
    <$> arbitrary -- assistantFileObjectId :: Text
    <*> arbitrary -- assistantFileObjectObject :: E'Object20
    <*> arbitrary -- assistantFileObjectCreatedAt :: Int
    <*> arbitrary -- assistantFileObjectAssistantId :: Text
  
instance Arbitrary AssistantObject where
  arbitrary = sized genAssistantObject

genAssistantObject :: Int -> Gen AssistantObject
genAssistantObject n =
  AssistantObject
    <$> arbitrary -- assistantObjectId :: Text
    <*> arbitrary -- assistantObjectObject :: E'Role4
    <*> arbitrary -- assistantObjectCreatedAt :: Int
    <*> arbitrary -- assistantObjectName :: Text
    <*> arbitrary -- assistantObjectDescription :: Text
    <*> arbitrary -- assistantObjectModel :: Text
    <*> arbitrary -- assistantObjectInstructions :: Text
    <*> arbitraryReduced n -- assistantObjectTools :: [AssistantObjectToolsInner]
    <*> arbitrary -- assistantObjectFileIds :: [Text]
    <*> arbitraryReduced n -- assistantObjectMetadata :: A.Value
  
instance Arbitrary AssistantObjectToolsInner where
  arbitrary = sized genAssistantObjectToolsInner

genAssistantObjectToolsInner :: Int -> Gen AssistantObjectToolsInner
genAssistantObjectToolsInner n =
  AssistantObjectToolsInner
    <$> arbitrary -- assistantObjectToolsInnerType :: E'Type18
    <*> arbitraryReduced n -- assistantObjectToolsInnerFunction :: FunctionObject
  
instance Arbitrary AssistantStreamEvent where
  arbitrary = sized genAssistantStreamEvent

genAssistantStreamEvent :: Int -> Gen AssistantStreamEvent
genAssistantStreamEvent n =
  AssistantStreamEvent
    <$> arbitrary -- assistantStreamEventEvent :: E'Event
    <*> arbitrary -- assistantStreamEventData :: E'Data
  
instance Arbitrary AssistantToolsCode where
  arbitrary = sized genAssistantToolsCode

genAssistantToolsCode :: Int -> Gen AssistantToolsCode
genAssistantToolsCode n =
  AssistantToolsCode
    <$> arbitrary -- assistantToolsCodeType :: E'Type5
  
instance Arbitrary AssistantToolsFunction where
  arbitrary = sized genAssistantToolsFunction

genAssistantToolsFunction :: Int -> Gen AssistantToolsFunction
genAssistantToolsFunction n =
  AssistantToolsFunction
    <$> arbitrary -- assistantToolsFunctionType :: E'Role
    <*> arbitraryReduced n -- assistantToolsFunctionFunction :: FunctionObject
  
instance Arbitrary AssistantToolsRetrieval where
  arbitrary = sized genAssistantToolsRetrieval

genAssistantToolsRetrieval :: Int -> Gen AssistantToolsRetrieval
genAssistantToolsRetrieval n =
  AssistantToolsRetrieval
    <$> arbitrary -- assistantToolsRetrievalType :: E'Type6
  
instance Arbitrary AssistantsApiNamedToolChoice where
  arbitrary = sized genAssistantsApiNamedToolChoice

genAssistantsApiNamedToolChoice :: Int -> Gen AssistantsApiNamedToolChoice
genAssistantsApiNamedToolChoice n =
  AssistantsApiNamedToolChoice
    <$> arbitrary -- assistantsApiNamedToolChoiceType :: E'Type8
    <*> arbitraryReducedMaybe n -- assistantsApiNamedToolChoiceFunction :: Maybe ChatCompletionNamedToolChoiceFunction
  
instance Arbitrary AssistantsApiResponseFormat where
  arbitrary = sized genAssistantsApiResponseFormat

genAssistantsApiResponseFormat :: Int -> Gen AssistantsApiResponseFormat
genAssistantsApiResponseFormat n =
  AssistantsApiResponseFormat
    <$> arbitraryReducedMaybe n -- assistantsApiResponseFormatType :: Maybe E'Type9
  
instance Arbitrary AssistantsApiResponseFormatOption where
  arbitrary = sized genAssistantsApiResponseFormatOption

genAssistantsApiResponseFormatOption :: Int -> Gen AssistantsApiResponseFormatOption
genAssistantsApiResponseFormatOption n =
  AssistantsApiResponseFormatOption
    <$> arbitraryReducedMaybe n -- assistantsApiResponseFormatOptionType :: Maybe E'Type9
  
instance Arbitrary AssistantsApiToolChoiceOption where
  arbitrary = sized genAssistantsApiToolChoiceOption

genAssistantsApiToolChoiceOption :: Int -> Gen AssistantsApiToolChoiceOption
genAssistantsApiToolChoiceOption n =
  AssistantsApiToolChoiceOption
    <$> arbitrary -- assistantsApiToolChoiceOptionType :: E'Type8
    <*> arbitraryReducedMaybe n -- assistantsApiToolChoiceOptionFunction :: Maybe ChatCompletionNamedToolChoiceFunction
  
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
    <*> arbitrary -- chatCompletionMessageToolCallType :: E'Role
    <*> arbitraryReduced n -- chatCompletionMessageToolCallFunction :: ChatCompletionMessageToolCallFunction
  
instance Arbitrary ChatCompletionMessageToolCallChunk where
  arbitrary = sized genChatCompletionMessageToolCallChunk

genChatCompletionMessageToolCallChunk :: Int -> Gen ChatCompletionMessageToolCallChunk
genChatCompletionMessageToolCallChunk n =
  ChatCompletionMessageToolCallChunk
    <$> arbitrary -- chatCompletionMessageToolCallChunkIndex :: Int
    <*> arbitraryReducedMaybe n -- chatCompletionMessageToolCallChunkId :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionMessageToolCallChunkType :: Maybe E'Role
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
    <$> arbitrary -- chatCompletionNamedToolChoiceType :: E'Role
    <*> arbitraryReduced n -- chatCompletionNamedToolChoiceFunction :: ChatCompletionNamedToolChoiceFunction
  
instance Arbitrary ChatCompletionNamedToolChoiceFunction where
  arbitrary = sized genChatCompletionNamedToolChoiceFunction

genChatCompletionNamedToolChoiceFunction :: Int -> Gen ChatCompletionNamedToolChoiceFunction
genChatCompletionNamedToolChoiceFunction n =
  ChatCompletionNamedToolChoiceFunction
    <$> arbitrary -- chatCompletionNamedToolChoiceFunctionName :: Text
  
instance Arbitrary ChatCompletionRequestAssistantMessage where
  arbitrary = sized genChatCompletionRequestAssistantMessage

genChatCompletionRequestAssistantMessage :: Int -> Gen ChatCompletionRequestAssistantMessage
genChatCompletionRequestAssistantMessage n =
  ChatCompletionRequestAssistantMessage
    <$> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageContent :: Maybe Text
    <*> arbitrary -- chatCompletionRequestAssistantMessageRole :: E'Role4
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageName :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitraryReducedMaybe n -- chatCompletionRequestAssistantMessageFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
  
instance Arbitrary ChatCompletionRequestAssistantMessageFunctionCall where
  arbitrary = sized genChatCompletionRequestAssistantMessageFunctionCall

genChatCompletionRequestAssistantMessageFunctionCall :: Int -> Gen ChatCompletionRequestAssistantMessageFunctionCall
genChatCompletionRequestAssistantMessageFunctionCall n =
  ChatCompletionRequestAssistantMessageFunctionCall
    <$> arbitrary -- chatCompletionRequestAssistantMessageFunctionCallArguments :: Text
    <*> arbitrary -- chatCompletionRequestAssistantMessageFunctionCallName :: Text
  
instance Arbitrary ChatCompletionRequestFunctionMessage where
  arbitrary = sized genChatCompletionRequestFunctionMessage

genChatCompletionRequestFunctionMessage :: Int -> Gen ChatCompletionRequestFunctionMessage
genChatCompletionRequestFunctionMessage n =
  ChatCompletionRequestFunctionMessage
    <$> arbitrary -- chatCompletionRequestFunctionMessageRole :: E'Role
    <*> arbitrary -- chatCompletionRequestFunctionMessageContent :: Text
    <*> arbitrary -- chatCompletionRequestFunctionMessageName :: Text
  
instance Arbitrary ChatCompletionRequestMessage where
  arbitrary = sized genChatCompletionRequestMessage

genChatCompletionRequestMessage :: Int -> Gen ChatCompletionRequestMessage
genChatCompletionRequestMessage n =
  ChatCompletionRequestMessage
    <$> arbitrary -- chatCompletionRequestMessageContent :: Text
    <*> arbitrary -- chatCompletionRequestMessageRole :: E'Role
    <*> arbitrary -- chatCompletionRequestMessageName :: Text
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
    <*> arbitrary -- chatCompletionRequestMessageToolCallId :: Text
  
instance Arbitrary ChatCompletionRequestMessageContentPart where
  arbitrary = sized genChatCompletionRequestMessageContentPart

genChatCompletionRequestMessageContentPart :: Int -> Gen ChatCompletionRequestMessageContentPart
genChatCompletionRequestMessageContentPart n =
  ChatCompletionRequestMessageContentPart
    <$> arbitrary -- chatCompletionRequestMessageContentPartType :: E'Type
    <*> arbitrary -- chatCompletionRequestMessageContentPartText :: Text
    <*> arbitraryReduced n -- chatCompletionRequestMessageContentPartImageUrl :: ChatCompletionRequestMessageContentPartImageImageUrl
  
instance Arbitrary ChatCompletionRequestMessageContentPartImage where
  arbitrary = sized genChatCompletionRequestMessageContentPartImage

genChatCompletionRequestMessageContentPartImage :: Int -> Gen ChatCompletionRequestMessageContentPartImage
genChatCompletionRequestMessageContentPartImage n =
  ChatCompletionRequestMessageContentPartImage
    <$> arbitrary -- chatCompletionRequestMessageContentPartImageType :: E'Type2
    <*> arbitraryReduced n -- chatCompletionRequestMessageContentPartImageImageUrl :: ChatCompletionRequestMessageContentPartImageImageUrl
  
instance Arbitrary ChatCompletionRequestMessageContentPartImageImageUrl where
  arbitrary = sized genChatCompletionRequestMessageContentPartImageImageUrl

genChatCompletionRequestMessageContentPartImageImageUrl :: Int -> Gen ChatCompletionRequestMessageContentPartImageImageUrl
genChatCompletionRequestMessageContentPartImageImageUrl n =
  ChatCompletionRequestMessageContentPartImageImageUrl
    <$> arbitrary -- chatCompletionRequestMessageContentPartImageImageUrlUrl :: Text
    <*> arbitraryReducedMaybe n -- chatCompletionRequestMessageContentPartImageImageUrlDetail :: Maybe E'Detail
  
instance Arbitrary ChatCompletionRequestMessageContentPartText where
  arbitrary = sized genChatCompletionRequestMessageContentPartText

genChatCompletionRequestMessageContentPartText :: Int -> Gen ChatCompletionRequestMessageContentPartText
genChatCompletionRequestMessageContentPartText n =
  ChatCompletionRequestMessageContentPartText
    <$> arbitrary -- chatCompletionRequestMessageContentPartTextType :: E'Type3
    <*> arbitrary -- chatCompletionRequestMessageContentPartTextText :: Text
  
instance Arbitrary ChatCompletionRequestSystemMessage where
  arbitrary = sized genChatCompletionRequestSystemMessage

genChatCompletionRequestSystemMessage :: Int -> Gen ChatCompletionRequestSystemMessage
genChatCompletionRequestSystemMessage n =
  ChatCompletionRequestSystemMessage
    <$> arbitrary -- chatCompletionRequestSystemMessageContent :: Text
    <*> arbitrary -- chatCompletionRequestSystemMessageRole :: E'Role2
    <*> arbitraryReducedMaybe n -- chatCompletionRequestSystemMessageName :: Maybe Text
  
instance Arbitrary ChatCompletionRequestToolMessage where
  arbitrary = sized genChatCompletionRequestToolMessage

genChatCompletionRequestToolMessage :: Int -> Gen ChatCompletionRequestToolMessage
genChatCompletionRequestToolMessage n =
  ChatCompletionRequestToolMessage
    <$> arbitrary -- chatCompletionRequestToolMessageRole :: E'Role5
    <*> arbitrary -- chatCompletionRequestToolMessageContent :: Text
    <*> arbitrary -- chatCompletionRequestToolMessageToolCallId :: Text
  
instance Arbitrary ChatCompletionRequestUserMessage where
  arbitrary = sized genChatCompletionRequestUserMessage

genChatCompletionRequestUserMessage :: Int -> Gen ChatCompletionRequestUserMessage
genChatCompletionRequestUserMessage n =
  ChatCompletionRequestUserMessage
    <$> arbitraryReduced n -- chatCompletionRequestUserMessageContent :: ChatCompletionRequestUserMessageContent
    <*> arbitrary -- chatCompletionRequestUserMessageRole :: E'Role3
    <*> arbitraryReducedMaybe n -- chatCompletionRequestUserMessageName :: Maybe Text
  
instance Arbitrary ChatCompletionRequestUserMessageContent where
  arbitrary = sized genChatCompletionRequestUserMessageContent

genChatCompletionRequestUserMessageContent :: Int -> Gen ChatCompletionRequestUserMessageContent
genChatCompletionRequestUserMessageContent n =
  
  pure ChatCompletionRequestUserMessageContent
   
instance Arbitrary ChatCompletionResponseMessage where
  arbitrary = sized genChatCompletionResponseMessage

genChatCompletionResponseMessage :: Int -> Gen ChatCompletionResponseMessage
genChatCompletionResponseMessage n =
  ChatCompletionResponseMessage
    <$> arbitrary -- chatCompletionResponseMessageContent :: Text
    <*> arbitraryReducedMaybe n -- chatCompletionResponseMessageToolCalls :: Maybe [ChatCompletionMessageToolCall]
    <*> arbitrary -- chatCompletionResponseMessageRole :: E'Role4
    <*> arbitraryReducedMaybe n -- chatCompletionResponseMessageFunctionCall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall
  
instance Arbitrary ChatCompletionStreamResponseDelta where
  arbitrary = sized genChatCompletionStreamResponseDelta

genChatCompletionStreamResponseDelta :: Int -> Gen ChatCompletionStreamResponseDelta
genChatCompletionStreamResponseDelta n =
  ChatCompletionStreamResponseDelta
    <$> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaContent :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaFunctionCall :: Maybe ChatCompletionStreamResponseDeltaFunctionCall
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaToolCalls :: Maybe [ChatCompletionMessageToolCallChunk]
    <*> arbitraryReducedMaybe n -- chatCompletionStreamResponseDeltaRole :: Maybe E'Role6
  
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
    <$> arbitrary -- chatCompletionToolType :: E'Role
    <*> arbitraryReduced n -- chatCompletionToolFunction :: FunctionObject
  
instance Arbitrary ChatCompletionToolChoiceOption where
  arbitrary = sized genChatCompletionToolChoiceOption

genChatCompletionToolChoiceOption :: Int -> Gen ChatCompletionToolChoiceOption
genChatCompletionToolChoiceOption n =
  ChatCompletionToolChoiceOption
    <$> arbitrary -- chatCompletionToolChoiceOptionType :: E'Role
    <*> arbitraryReduced n -- chatCompletionToolChoiceOptionFunction :: ChatCompletionNamedToolChoiceFunction
  
instance Arbitrary CompletionUsage where
  arbitrary = sized genCompletionUsage

genCompletionUsage :: Int -> Gen CompletionUsage
genCompletionUsage n =
  CompletionUsage
    <$> arbitrary -- completionUsageCompletionTokens :: Int
    <*> arbitrary -- completionUsagePromptTokens :: Int
    <*> arbitrary -- completionUsageTotalTokens :: Int
  
instance Arbitrary CreateAssistantFileRequest where
  arbitrary = sized genCreateAssistantFileRequest

genCreateAssistantFileRequest :: Int -> Gen CreateAssistantFileRequest
genCreateAssistantFileRequest n =
  CreateAssistantFileRequest
    <$> arbitrary -- createAssistantFileRequestFileId :: Text
  
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
    <*> arbitraryReducedMaybe n -- createAssistantRequestFileIds :: Maybe [Text]
    <*> arbitraryReducedMaybeValue n -- createAssistantRequestMetadata :: Maybe A.Value
  
instance Arbitrary CreateAssistantRequestModel where
  arbitrary = sized genCreateAssistantRequestModel

genCreateAssistantRequestModel :: Int -> Gen CreateAssistantRequestModel
genCreateAssistantRequestModel n =
  
  pure CreateAssistantRequestModel
   
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
    <*> arbitrary -- createChatCompletionFunctionResponseObject :: E'Object3
    <*> arbitraryReducedMaybe n -- createChatCompletionFunctionResponseUsage :: Maybe CompletionUsage
  
instance Arbitrary CreateChatCompletionFunctionResponseChoicesInner where
  arbitrary = sized genCreateChatCompletionFunctionResponseChoicesInner

genCreateChatCompletionFunctionResponseChoicesInner :: Int -> Gen CreateChatCompletionFunctionResponseChoicesInner
genCreateChatCompletionFunctionResponseChoicesInner n =
  CreateChatCompletionFunctionResponseChoicesInner
    <$> arbitrary -- createChatCompletionFunctionResponseChoicesInnerFinishReason :: E'FinishReason3
    <*> arbitrary -- createChatCompletionFunctionResponseChoicesInnerIndex :: Int
    <*> arbitraryReduced n -- createChatCompletionFunctionResponseChoicesInnerMessage :: ChatCompletionResponseMessage
  
instance Arbitrary CreateChatCompletionRequest where
  arbitrary = sized genCreateChatCompletionRequest

genCreateChatCompletionRequest :: Int -> Gen CreateChatCompletionRequest
genCreateChatCompletionRequest n =
  CreateChatCompletionRequest
    <$> arbitraryReduced n -- createChatCompletionRequestMessages :: [ChatCompletionRequestMessage]
    <*> arbitraryReduced n -- createChatCompletionRequestModel :: CreateChatCompletionRequestModel
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestFrequencyPenalty :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestLogitBias :: Maybe (Map.Map String Int)
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestLogprobs :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTopLogprobs :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestMaxTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestN :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestPresencePenalty :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestResponseFormat :: Maybe CreateChatCompletionRequestResponseFormat
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestSeed :: Maybe Int
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestStop :: Maybe CreateChatCompletionRequestStop
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestStream :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTopP :: Maybe Double
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestTools :: Maybe [ChatCompletionTool]
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestToolChoice :: Maybe ChatCompletionToolChoiceOption
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestUser :: Maybe Text
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestFunctionCall :: Maybe CreateChatCompletionRequestFunctionCall
    <*> arbitraryReducedMaybe n -- createChatCompletionRequestFunctions :: Maybe [ChatCompletionFunctions]
  
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
    <$> arbitraryReducedMaybe n -- createChatCompletionRequestResponseFormatType :: Maybe E'Type9
  
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
    <*> arbitraryReducedMaybe n -- createChatCompletionResponseSystemFingerprint :: Maybe Text
    <*> arbitrary -- createChatCompletionResponseObject :: E'Object3
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
  
instance Arbitrary CreateChatCompletionStreamResponse where
  arbitrary = sized genCreateChatCompletionStreamResponse

genCreateChatCompletionStreamResponse :: Int -> Gen CreateChatCompletionStreamResponse
genCreateChatCompletionStreamResponse n =
  CreateChatCompletionStreamResponse
    <$> arbitrary -- createChatCompletionStreamResponseId :: Text
    <*> arbitraryReduced n -- createChatCompletionStreamResponseChoices :: [CreateChatCompletionStreamResponseChoicesInner]
    <*> arbitrary -- createChatCompletionStreamResponseCreated :: Int
    <*> arbitrary -- createChatCompletionStreamResponseModel :: Text
    <*> arbitraryReducedMaybe n -- createChatCompletionStreamResponseSystemFingerprint :: Maybe Text
    <*> arbitrary -- createChatCompletionStreamResponseObject :: E'Object4
  
instance Arbitrary CreateChatCompletionStreamResponseChoicesInner where
  arbitrary = sized genCreateChatCompletionStreamResponseChoicesInner

genCreateChatCompletionStreamResponseChoicesInner :: Int -> Gen CreateChatCompletionStreamResponseChoicesInner
genCreateChatCompletionStreamResponseChoicesInner n =
  CreateChatCompletionStreamResponseChoicesInner
    <$> arbitraryReduced n -- createChatCompletionStreamResponseChoicesInnerDelta :: ChatCompletionStreamResponseDelta
    <*> arbitraryReducedMaybe n -- createChatCompletionStreamResponseChoicesInnerLogprobs :: Maybe CreateChatCompletionResponseChoicesInnerLogprobs
    <*> arbitrary -- createChatCompletionStreamResponseChoicesInnerFinishReason :: E'FinishReason2
    <*> arbitrary -- createChatCompletionStreamResponseChoicesInnerIndex :: Int
  
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
    <*> arbitrary -- createCompletionResponseObject :: E'Object2
    <*> arbitraryReducedMaybe n -- createCompletionResponseUsage :: Maybe CompletionUsage
  
instance Arbitrary CreateCompletionResponseChoicesInner where
  arbitrary = sized genCreateCompletionResponseChoicesInner

genCreateCompletionResponseChoicesInner :: Int -> Gen CreateCompletionResponseChoicesInner
genCreateCompletionResponseChoicesInner n =
  CreateCompletionResponseChoicesInner
    <$> arbitrary -- createCompletionResponseChoicesInnerFinishReason :: E'FinishReason
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
    <*> arbitrary -- createEmbeddingResponseObject :: E'Object
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
    <$> arbitraryReduced n -- createFineTuningJobRequestIntegrationsInnerType :: CreateFineTuningJobRequestIntegrationsInnerType
    <*> arbitraryReduced n -- createFineTuningJobRequestIntegrationsInnerWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb
  
instance Arbitrary CreateFineTuningJobRequestIntegrationsInnerType where
  arbitrary = sized genCreateFineTuningJobRequestIntegrationsInnerType

genCreateFineTuningJobRequestIntegrationsInnerType :: Int -> Gen CreateFineTuningJobRequestIntegrationsInnerType
genCreateFineTuningJobRequestIntegrationsInnerType n =
  
  pure CreateFineTuningJobRequestIntegrationsInnerType
   
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
    <$> arbitrary -- createMessageRequestRole :: E'Role7
    <*> arbitrary -- createMessageRequestContent :: Text
    <*> arbitraryReducedMaybe n -- createMessageRequestFileIds :: Maybe [Text]
    <*> arbitraryReducedMaybeValue n -- createMessageRequestMetadata :: Maybe A.Value
  
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
  
instance Arbitrary CreateModerationResponseResultsInnerCategories where
  arbitrary = sized genCreateModerationResponseResultsInnerCategories

genCreateModerationResponseResultsInnerCategories :: Int -> Gen CreateModerationResponseResultsInnerCategories
genCreateModerationResponseResultsInnerCategories n =
  CreateModerationResponseResultsInnerCategories
    <$> arbitrary -- createModerationResponseResultsInnerCategoriesHate :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesHateThreatening :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesHarassment :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesHarassmentThreatening :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSelfHarm :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSelfHarmIntent :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSelfHarmInstructions :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSexual :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesSexualMinors :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesViolence :: Bool
    <*> arbitrary -- createModerationResponseResultsInnerCategoriesViolenceGraphic :: Bool
  
instance Arbitrary CreateModerationResponseResultsInnerCategoryScores where
  arbitrary = sized genCreateModerationResponseResultsInnerCategoryScores

genCreateModerationResponseResultsInnerCategoryScores :: Int -> Gen CreateModerationResponseResultsInnerCategoryScores
genCreateModerationResponseResultsInnerCategoryScores n =
  CreateModerationResponseResultsInnerCategoryScores
    <$> arbitrary -- createModerationResponseResultsInnerCategoryScoresHate :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresHateThreatening :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresHarassment :: Double
    <*> arbitrary -- createModerationResponseResultsInnerCategoryScoresHarassmentThreatening :: Double
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
    <*> arbitraryReducedMaybe n -- createRunRequestStream :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createRunRequestMaxPromptTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createRunRequestMaxCompletionTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createRunRequestTruncationStrategy :: Maybe TruncationObject
    <*> arbitraryReducedMaybe n -- createRunRequestToolChoice :: Maybe AssistantsApiToolChoiceOption
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
    <*> arbitraryReducedMaybeValue n -- createThreadAndRunRequestMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestTemperature :: Maybe Double
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestStream :: Maybe Bool
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestMaxPromptTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestMaxCompletionTokens :: Maybe Int
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestTruncationStrategy :: Maybe TruncationObject
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestToolChoice :: Maybe AssistantsApiToolChoiceOption
    <*> arbitraryReducedMaybe n -- createThreadAndRunRequestResponseFormat :: Maybe AssistantsApiResponseFormatOption
  
instance Arbitrary CreateThreadAndRunRequestToolsInner where
  arbitrary = sized genCreateThreadAndRunRequestToolsInner

genCreateThreadAndRunRequestToolsInner :: Int -> Gen CreateThreadAndRunRequestToolsInner
genCreateThreadAndRunRequestToolsInner n =
  CreateThreadAndRunRequestToolsInner
    <$> arbitrary -- createThreadAndRunRequestToolsInnerType :: E'Type18
    <*> arbitraryReduced n -- createThreadAndRunRequestToolsInnerFunction :: FunctionObject
  
instance Arbitrary CreateThreadRequest where
  arbitrary = sized genCreateThreadRequest

genCreateThreadRequest :: Int -> Gen CreateThreadRequest
genCreateThreadRequest n =
  CreateThreadRequest
    <$> arbitraryReducedMaybe n -- createThreadRequestMessages :: Maybe [CreateMessageRequest]
    <*> arbitraryReducedMaybeValue n -- createThreadRequestMetadata :: Maybe A.Value
  
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
  
instance Arbitrary DeleteAssistantFileResponse where
  arbitrary = sized genDeleteAssistantFileResponse

genDeleteAssistantFileResponse :: Int -> Gen DeleteAssistantFileResponse
genDeleteAssistantFileResponse n =
  DeleteAssistantFileResponse
    <$> arbitrary -- deleteAssistantFileResponseId :: Text
    <*> arbitrary -- deleteAssistantFileResponseDeleted :: Bool
    <*> arbitrary -- deleteAssistantFileResponseObject :: E'Object21
  
instance Arbitrary DeleteAssistantResponse where
  arbitrary = sized genDeleteAssistantResponse

genDeleteAssistantResponse :: Int -> Gen DeleteAssistantResponse
genDeleteAssistantResponse n =
  DeleteAssistantResponse
    <$> arbitrary -- deleteAssistantResponseId :: Text
    <*> arbitrary -- deleteAssistantResponseDeleted :: Bool
    <*> arbitrary -- deleteAssistantResponseObject :: E'Object11
  
instance Arbitrary DeleteFileResponse where
  arbitrary = sized genDeleteFileResponse

genDeleteFileResponse :: Int -> Gen DeleteFileResponse
genDeleteFileResponse n =
  DeleteFileResponse
    <$> arbitrary -- deleteFileResponseId :: Text
    <*> arbitrary -- deleteFileResponseObject :: E'Object5
    <*> arbitrary -- deleteFileResponseDeleted :: Bool
  
instance Arbitrary DeleteMessageResponse where
  arbitrary = sized genDeleteMessageResponse

genDeleteMessageResponse :: Int -> Gen DeleteMessageResponse
genDeleteMessageResponse n =
  DeleteMessageResponse
    <$> arbitrary -- deleteMessageResponseId :: Text
    <*> arbitrary -- deleteMessageResponseDeleted :: Bool
    <*> arbitrary -- deleteMessageResponseObject :: E'Object17
  
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
    <*> arbitrary -- deleteThreadResponseObject :: E'Object14
  
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
    <*> arbitrary -- embeddingObject :: E'Object7
  
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
    <$> arbitrary -- errorEventEvent :: E'Event6
    <*> arbitraryReduced n -- errorEventData :: Error
  
instance Arbitrary ErrorResponse where
  arbitrary = sized genErrorResponse

genErrorResponse :: Int -> Gen ErrorResponse
genErrorResponse n =
  ErrorResponse
    <$> arbitraryReduced n -- errorResponseError :: Error
  
instance Arbitrary FineTuningIntegration where
  arbitrary = sized genFineTuningIntegration

genFineTuningIntegration :: Int -> Gen FineTuningIntegration
genFineTuningIntegration n =
  FineTuningIntegration
    <$> arbitrary -- fineTuningIntegrationType :: E'Type4
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
    <*> arbitrary -- fineTuningJobObject :: E'Object8
    <*> arbitrary -- fineTuningJobOrganizationId :: Text
    <*> arbitrary -- fineTuningJobResultFiles :: [Text]
    <*> arbitrary -- fineTuningJobStatus :: E'Status2
    <*> arbitrary -- fineTuningJobTrainedTokens :: Int
    <*> arbitrary -- fineTuningJobTrainingFile :: Text
    <*> arbitrary -- fineTuningJobValidationFile :: Text
    <*> arbitraryReducedMaybe n -- fineTuningJobIntegrations :: Maybe [FineTuningJobIntegrationsInner]
    <*> arbitrary -- fineTuningJobSeed :: Int
  
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
    <*> arbitrary -- fineTuningJobCheckpointObject :: E'Object10
  
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
    <$> arbitrary -- fineTuningJobEventId :: Text
    <*> arbitrary -- fineTuningJobEventCreatedAt :: Int
    <*> arbitrary -- fineTuningJobEventLevel :: E'Level
    <*> arbitrary -- fineTuningJobEventMessage :: Text
    <*> arbitrary -- fineTuningJobEventObject :: E'Object9
  
instance Arbitrary FineTuningJobHyperparameters where
  arbitrary = sized genFineTuningJobHyperparameters

genFineTuningJobHyperparameters :: Int -> Gen FineTuningJobHyperparameters
genFineTuningJobHyperparameters n =
  FineTuningJobHyperparameters
    <$> arbitraryReduced n -- fineTuningJobHyperparametersNEpochs :: FineTuningJobHyperparametersNEpochs
  
instance Arbitrary FineTuningJobHyperparametersNEpochs where
  arbitrary = sized genFineTuningJobHyperparametersNEpochs

genFineTuningJobHyperparametersNEpochs :: Int -> Gen FineTuningJobHyperparametersNEpochs
genFineTuningJobHyperparametersNEpochs n =
  
  pure FineTuningJobHyperparametersNEpochs
   
instance Arbitrary FineTuningJobIntegrationsInner where
  arbitrary = sized genFineTuningJobIntegrationsInner

genFineTuningJobIntegrationsInner :: Int -> Gen FineTuningJobIntegrationsInner
genFineTuningJobIntegrationsInner n =
  FineTuningJobIntegrationsInner
    <$> arbitrary -- fineTuningJobIntegrationsInnerType :: E'Type4
    <*> arbitraryReduced n -- fineTuningJobIntegrationsInnerWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb
  
instance Arbitrary FunctionObject where
  arbitrary = sized genFunctionObject

genFunctionObject :: Int -> Gen FunctionObject
genFunctionObject n =
  FunctionObject
    <$> arbitraryReducedMaybe n -- functionObjectDescription :: Maybe Text
    <*> arbitrary -- functionObjectName :: Text
    <*> arbitraryReducedMaybe n -- functionObjectParameters :: Maybe (Map.Map String AnyType)
  
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
  
instance Arbitrary ListAssistantFilesResponse where
  arbitrary = sized genListAssistantFilesResponse

genListAssistantFilesResponse :: Int -> Gen ListAssistantFilesResponse
genListAssistantFilesResponse n =
  ListAssistantFilesResponse
    <$> arbitrary -- listAssistantFilesResponseObject :: Text
    <*> arbitraryReduced n -- listAssistantFilesResponseData :: [AssistantFileObject]
    <*> arbitrary -- listAssistantFilesResponseFirstId :: Text
    <*> arbitrary -- listAssistantFilesResponseLastId :: Text
    <*> arbitrary -- listAssistantFilesResponseHasMore :: Bool
  
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
  
instance Arbitrary ListFilesResponse where
  arbitrary = sized genListFilesResponse

genListFilesResponse :: Int -> Gen ListFilesResponse
genListFilesResponse n =
  ListFilesResponse
    <$> arbitraryReduced n -- listFilesResponseData :: [OpenAIFile]
    <*> arbitrary -- listFilesResponseObject :: E'Object
  
instance Arbitrary ListFineTuningJobCheckpointsResponse where
  arbitrary = sized genListFineTuningJobCheckpointsResponse

genListFineTuningJobCheckpointsResponse :: Int -> Gen ListFineTuningJobCheckpointsResponse
genListFineTuningJobCheckpointsResponse n =
  ListFineTuningJobCheckpointsResponse
    <$> arbitraryReduced n -- listFineTuningJobCheckpointsResponseData :: [FineTuningJobCheckpoint]
    <*> arbitrary -- listFineTuningJobCheckpointsResponseObject :: E'Object
    <*> arbitraryReducedMaybe n -- listFineTuningJobCheckpointsResponseFirstId :: Maybe Text
    <*> arbitraryReducedMaybe n -- listFineTuningJobCheckpointsResponseLastId :: Maybe Text
    <*> arbitrary -- listFineTuningJobCheckpointsResponseHasMore :: Bool
  
instance Arbitrary ListFineTuningJobEventsResponse where
  arbitrary = sized genListFineTuningJobEventsResponse

genListFineTuningJobEventsResponse :: Int -> Gen ListFineTuningJobEventsResponse
genListFineTuningJobEventsResponse n =
  ListFineTuningJobEventsResponse
    <$> arbitraryReduced n -- listFineTuningJobEventsResponseData :: [FineTuningJobEvent]
    <*> arbitrary -- listFineTuningJobEventsResponseObject :: E'Object
  
instance Arbitrary ListMessageFilesResponse where
  arbitrary = sized genListMessageFilesResponse

genListMessageFilesResponse :: Int -> Gen ListMessageFilesResponse
genListMessageFilesResponse n =
  ListMessageFilesResponse
    <$> arbitrary -- listMessageFilesResponseObject :: Text
    <*> arbitraryReduced n -- listMessageFilesResponseData :: [MessageFileObject]
    <*> arbitrary -- listMessageFilesResponseFirstId :: Text
    <*> arbitrary -- listMessageFilesResponseLastId :: Text
    <*> arbitrary -- listMessageFilesResponseHasMore :: Bool
  
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
    <$> arbitrary -- listModelsResponseObject :: E'Object
    <*> arbitraryReduced n -- listModelsResponseData :: [Model]
  
instance Arbitrary ListPaginatedFineTuningJobsResponse where
  arbitrary = sized genListPaginatedFineTuningJobsResponse

genListPaginatedFineTuningJobsResponse :: Int -> Gen ListPaginatedFineTuningJobsResponse
genListPaginatedFineTuningJobsResponse n =
  ListPaginatedFineTuningJobsResponse
    <$> arbitraryReduced n -- listPaginatedFineTuningJobsResponseData :: [FineTuningJob]
    <*> arbitrary -- listPaginatedFineTuningJobsResponseHasMore :: Bool
    <*> arbitrary -- listPaginatedFineTuningJobsResponseObject :: E'Object
  
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
  
instance Arbitrary MessageContentImageFileObject where
  arbitrary = sized genMessageContentImageFileObject

genMessageContentImageFileObject :: Int -> Gen MessageContentImageFileObject
genMessageContentImageFileObject n =
  MessageContentImageFileObject
    <$> arbitrary -- messageContentImageFileObjectType :: E'Type10
    <*> arbitraryReduced n -- messageContentImageFileObjectImageFile :: MessageContentImageFileObjectImageFile
  
instance Arbitrary MessageContentImageFileObjectImageFile where
  arbitrary = sized genMessageContentImageFileObjectImageFile

genMessageContentImageFileObjectImageFile :: Int -> Gen MessageContentImageFileObjectImageFile
genMessageContentImageFileObjectImageFile n =
  MessageContentImageFileObjectImageFile
    <$> arbitrary -- messageContentImageFileObjectImageFileFileId :: Text
  
instance Arbitrary MessageContentTextAnnotationsFileCitationObject where
  arbitrary = sized genMessageContentTextAnnotationsFileCitationObject

genMessageContentTextAnnotationsFileCitationObject :: Int -> Gen MessageContentTextAnnotationsFileCitationObject
genMessageContentTextAnnotationsFileCitationObject n =
  MessageContentTextAnnotationsFileCitationObject
    <$> arbitrary -- messageContentTextAnnotationsFileCitationObjectType :: E'Type11
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
    <*> arbitrary -- messageContentTextAnnotationsFileCitationObjectFileCitationQuote :: Text
  
instance Arbitrary MessageContentTextAnnotationsFilePathObject where
  arbitrary = sized genMessageContentTextAnnotationsFilePathObject

genMessageContentTextAnnotationsFilePathObject :: Int -> Gen MessageContentTextAnnotationsFilePathObject
genMessageContentTextAnnotationsFilePathObject n =
  MessageContentTextAnnotationsFilePathObject
    <$> arbitrary -- messageContentTextAnnotationsFilePathObjectType :: E'Type12
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
    <$> arbitrary -- messageContentTextObjectType :: E'Type3
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
    <$> arbitrary -- messageContentTextObjectTextAnnotationsInnerType :: E'Type21
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
    <*> arbitrary -- messageDeltaContentImageFileObjectType :: E'Type10
    <*> arbitraryReducedMaybe n -- messageDeltaContentImageFileObjectImageFile :: Maybe MessageDeltaContentImageFileObjectImageFile
  
instance Arbitrary MessageDeltaContentImageFileObjectImageFile where
  arbitrary = sized genMessageDeltaContentImageFileObjectImageFile

genMessageDeltaContentImageFileObjectImageFile :: Int -> Gen MessageDeltaContentImageFileObjectImageFile
genMessageDeltaContentImageFileObjectImageFile n =
  MessageDeltaContentImageFileObjectImageFile
    <$> arbitraryReducedMaybe n -- messageDeltaContentImageFileObjectImageFileFileId :: Maybe Text
  
instance Arbitrary MessageDeltaContentTextAnnotationsFileCitationObject where
  arbitrary = sized genMessageDeltaContentTextAnnotationsFileCitationObject

genMessageDeltaContentTextAnnotationsFileCitationObject :: Int -> Gen MessageDeltaContentTextAnnotationsFileCitationObject
genMessageDeltaContentTextAnnotationsFileCitationObject n =
  MessageDeltaContentTextAnnotationsFileCitationObject
    <$> arbitrary -- messageDeltaContentTextAnnotationsFileCitationObjectIndex :: Int
    <*> arbitrary -- messageDeltaContentTextAnnotationsFileCitationObjectType :: E'Type11
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
    <*> arbitrary -- messageDeltaContentTextAnnotationsFilePathObjectType :: E'Type12
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
    <*> arbitrary -- messageDeltaContentTextObjectType :: E'Type3
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
    <*> arbitrary -- messageDeltaContentTextObjectTextAnnotationsInnerType :: E'Type21
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
    <*> arbitrary -- messageDeltaObjectObject :: E'Object16
    <*> arbitraryReduced n -- messageDeltaObjectDelta :: MessageDeltaObjectDelta
  
instance Arbitrary MessageDeltaObjectDelta where
  arbitrary = sized genMessageDeltaObjectDelta

genMessageDeltaObjectDelta :: Int -> Gen MessageDeltaObjectDelta
genMessageDeltaObjectDelta n =
  MessageDeltaObjectDelta
    <$> arbitraryReducedMaybe n -- messageDeltaObjectDeltaRole :: Maybe E'Role7
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContent :: Maybe [MessageDeltaObjectDeltaContentInner]
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaFileIds :: Maybe [Text]
  
instance Arbitrary MessageDeltaObjectDeltaContentInner where
  arbitrary = sized genMessageDeltaObjectDeltaContentInner

genMessageDeltaObjectDeltaContentInner :: Int -> Gen MessageDeltaObjectDeltaContentInner
genMessageDeltaObjectDeltaContentInner n =
  MessageDeltaObjectDeltaContentInner
    <$> arbitrary -- messageDeltaObjectDeltaContentInnerIndex :: Int
    <*> arbitrary -- messageDeltaObjectDeltaContentInnerType :: E'Type20
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContentInnerImageFile :: Maybe MessageDeltaContentImageFileObjectImageFile
    <*> arbitraryReducedMaybe n -- messageDeltaObjectDeltaContentInnerText :: Maybe MessageDeltaContentTextObjectText
  
instance Arbitrary MessageFileObject where
  arbitrary = sized genMessageFileObject

genMessageFileObject :: Int -> Gen MessageFileObject
genMessageFileObject n =
  MessageFileObject
    <$> arbitrary -- messageFileObjectId :: Text
    <*> arbitrary -- messageFileObjectObject :: E'Object22
    <*> arbitrary -- messageFileObjectCreatedAt :: Int
    <*> arbitrary -- messageFileObjectMessageId :: Text
  
instance Arbitrary MessageObject where
  arbitrary = sized genMessageObject

genMessageObject :: Int -> Gen MessageObject
genMessageObject n =
  MessageObject
    <$> arbitrary -- messageObjectId :: Text
    <*> arbitrary -- messageObjectObject :: E'Object15
    <*> arbitrary -- messageObjectCreatedAt :: Int
    <*> arbitrary -- messageObjectThreadId :: Text
    <*> arbitrary -- messageObjectStatus :: E'Status4
    <*> arbitraryReduced n -- messageObjectIncompleteDetails :: MessageObjectIncompleteDetails
    <*> arbitrary -- messageObjectCompletedAt :: Int
    <*> arbitrary -- messageObjectIncompleteAt :: Int
    <*> arbitrary -- messageObjectRole :: E'Role7
    <*> arbitraryReduced n -- messageObjectContent :: [MessageObjectContentInner]
    <*> arbitrary -- messageObjectAssistantId :: Text
    <*> arbitrary -- messageObjectRunId :: Text
    <*> arbitrary -- messageObjectFileIds :: [Text]
    <*> arbitraryReduced n -- messageObjectMetadata :: A.Value
  
instance Arbitrary MessageObjectContentInner where
  arbitrary = sized genMessageObjectContentInner

genMessageObjectContentInner :: Int -> Gen MessageObjectContentInner
genMessageObjectContentInner n =
  MessageObjectContentInner
    <$> arbitrary -- messageObjectContentInnerType :: E'Type20
    <*> arbitraryReduced n -- messageObjectContentInnerImageFile :: MessageContentImageFileObjectImageFile
    <*> arbitraryReduced n -- messageObjectContentInnerText :: MessageContentTextObjectText
  
instance Arbitrary MessageObjectIncompleteDetails where
  arbitrary = sized genMessageObjectIncompleteDetails

genMessageObjectIncompleteDetails :: Int -> Gen MessageObjectIncompleteDetails
genMessageObjectIncompleteDetails n =
  MessageObjectIncompleteDetails
    <$> arbitrary -- messageObjectIncompleteDetailsReason :: E'Reason2
  
instance Arbitrary MessageStreamEvent where
  arbitrary = sized genMessageStreamEvent

genMessageStreamEvent :: Int -> Gen MessageStreamEvent
genMessageStreamEvent n =
  MessageStreamEvent
    <$> arbitrary -- messageStreamEventEvent :: E'Event5
    <*> arbitraryReduced n -- messageStreamEventData :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf where
  arbitrary = sized genMessageStreamEventOneOf

genMessageStreamEventOneOf :: Int -> Gen MessageStreamEventOneOf
genMessageStreamEventOneOf n =
  MessageStreamEventOneOf
    <$> arbitrary -- messageStreamEventOneOfEvent :: E'Event20
    <*> arbitraryReduced n -- messageStreamEventOneOfData :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf1 where
  arbitrary = sized genMessageStreamEventOneOf1

genMessageStreamEventOneOf1 :: Int -> Gen MessageStreamEventOneOf1
genMessageStreamEventOneOf1 n =
  MessageStreamEventOneOf1
    <$> arbitrary -- messageStreamEventOneOf1Event :: E'Event21
    <*> arbitraryReduced n -- messageStreamEventOneOf1Data :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf2 where
  arbitrary = sized genMessageStreamEventOneOf2

genMessageStreamEventOneOf2 :: Int -> Gen MessageStreamEventOneOf2
genMessageStreamEventOneOf2 n =
  MessageStreamEventOneOf2
    <$> arbitrary -- messageStreamEventOneOf2Event :: E'Object16
    <*> arbitraryReduced n -- messageStreamEventOneOf2Data :: MessageDeltaObject
  
instance Arbitrary MessageStreamEventOneOf3 where
  arbitrary = sized genMessageStreamEventOneOf3

genMessageStreamEventOneOf3 :: Int -> Gen MessageStreamEventOneOf3
genMessageStreamEventOneOf3 n =
  MessageStreamEventOneOf3
    <$> arbitrary -- messageStreamEventOneOf3Event :: E'Event22
    <*> arbitraryReduced n -- messageStreamEventOneOf3Data :: MessageObject
  
instance Arbitrary MessageStreamEventOneOf4 where
  arbitrary = sized genMessageStreamEventOneOf4

genMessageStreamEventOneOf4 :: Int -> Gen MessageStreamEventOneOf4
genMessageStreamEventOneOf4 n =
  MessageStreamEventOneOf4
    <$> arbitrary -- messageStreamEventOneOf4Event :: E'Event5
    <*> arbitraryReduced n -- messageStreamEventOneOf4Data :: MessageObject
  
instance Arbitrary Model where
  arbitrary = sized genModel

genModel :: Int -> Gen Model
genModel n =
  Model
    <$> arbitrary -- modelId :: Text
    <*> arbitrary -- modelCreated :: Int
    <*> arbitrary -- modelObject :: E'Object6
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
    <*> arbitraryReducedMaybe n -- modifyAssistantRequestFileIds :: Maybe [Text]
    <*> arbitraryReducedMaybeValue n -- modifyAssistantRequestMetadata :: Maybe A.Value
  
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
    <$> arbitraryReducedMaybeValue n -- modifyThreadRequestMetadata :: Maybe A.Value
  
instance Arbitrary OpenAIFile where
  arbitrary = sized genOpenAIFile

genOpenAIFile :: Int -> Gen OpenAIFile
genOpenAIFile n =
  OpenAIFile
    <$> arbitrary -- openAIFileId :: Text
    <*> arbitrary -- openAIFileBytes :: Int
    <*> arbitrary -- openAIFileCreatedAt :: Int
    <*> arbitrary -- openAIFileFilename :: Text
    <*> arbitrary -- openAIFileObject :: E'Object5
    <*> arbitrary -- openAIFilePurpose :: E'Purpose
    <*> arbitrary -- openAIFileStatus :: E'Status
    <*> arbitraryReducedMaybe n -- openAIFileStatusDetails :: Maybe Text
  
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
    <*> arbitrary -- runObjectObject :: E'Object12
    <*> arbitrary -- runObjectCreatedAt :: Int
    <*> arbitrary -- runObjectThreadId :: Text
    <*> arbitrary -- runObjectAssistantId :: Text
    <*> arbitrary -- runObjectStatus :: E'Status3
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
    <*> arbitrary -- runObjectFileIds :: [Text]
    <*> arbitraryReduced n -- runObjectMetadata :: A.Value
    <*> arbitraryReduced n -- runObjectUsage :: RunCompletionUsage
    <*> arbitraryReducedMaybe n -- runObjectTemperature :: Maybe Double
    <*> arbitrary -- runObjectMaxPromptTokens :: Int
    <*> arbitrary -- runObjectMaxCompletionTokens :: Int
    <*> arbitraryReduced n -- runObjectTruncationStrategy :: TruncationObject
    <*> arbitraryReduced n -- runObjectToolChoice :: AssistantsApiToolChoiceOption
    <*> arbitraryReduced n -- runObjectResponseFormat :: AssistantsApiResponseFormatOption
  
instance Arbitrary RunObjectIncompleteDetails where
  arbitrary = sized genRunObjectIncompleteDetails

genRunObjectIncompleteDetails :: Int -> Gen RunObjectIncompleteDetails
genRunObjectIncompleteDetails n =
  RunObjectIncompleteDetails
    <$> arbitraryReducedMaybe n -- runObjectIncompleteDetailsReason :: Maybe E'Reason
  
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
    <$> arbitrary -- runObjectRequiredActionType :: E'Type19
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
    <*> arbitrary -- runStepDeltaObjectObject :: E'Object19
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
    <$> arbitrary -- runStepDeltaObjectDeltaStepDetailsType :: E'Type13
    <*> arbitraryReducedMaybe n -- runStepDeltaObjectDeltaStepDetailsMessageCreation :: Maybe RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    <*> arbitraryReducedMaybe n -- runStepDeltaObjectDeltaStepDetailsToolCalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
  
instance Arbitrary RunStepDeltaStepDetailsMessageCreationObject where
  arbitrary = sized genRunStepDeltaStepDetailsMessageCreationObject

genRunStepDeltaStepDetailsMessageCreationObject :: Int -> Gen RunStepDeltaStepDetailsMessageCreationObject
genRunStepDeltaStepDetailsMessageCreationObject n =
  RunStepDeltaStepDetailsMessageCreationObject
    <$> arbitrary -- runStepDeltaStepDetailsMessageCreationObjectType :: E'Type14
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
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeObjectType :: E'Type5
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
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType :: E'Type22
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs :: Maybe Text
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage :: Maybe RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsCodeOutputImageObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsCodeOutputImageObject

genRunStepDeltaStepDetailsToolCallsCodeOutputImageObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
genRunStepDeltaStepDetailsToolCallsCodeOutputImageObject n =
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsCodeOutputImageObjectIndex :: Int
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeOutputImageObjectType :: E'Type17
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
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectType :: E'Type16
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectLogs :: Maybe Text
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsFunctionObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsFunctionObject

genRunStepDeltaStepDetailsToolCallsFunctionObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsFunctionObject
genRunStepDeltaStepDetailsToolCallsFunctionObject n =
  RunStepDeltaStepDetailsToolCallsFunctionObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsFunctionObjectIndex :: Int
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsFunctionObjectId :: Maybe Text
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsFunctionObjectType :: E'Role
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
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsObjectType :: E'Type15
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsObjectToolCallsInner where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsObjectToolCallsInner

genRunStepDeltaStepDetailsToolCallsObjectToolCallsInner :: Int -> Gen RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
genRunStepDeltaStepDetailsToolCallsObjectToolCallsInner n =
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerIndex :: Int
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerId :: Maybe Text
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerType :: E'Type18
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerCodeInterpreter :: Maybe RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
    <*> arbitraryReducedMaybeValue n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerRetrieval :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFunction :: Maybe RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
  
instance Arbitrary RunStepDeltaStepDetailsToolCallsRetrievalObject where
  arbitrary = sized genRunStepDeltaStepDetailsToolCallsRetrievalObject

genRunStepDeltaStepDetailsToolCallsRetrievalObject :: Int -> Gen RunStepDeltaStepDetailsToolCallsRetrievalObject
genRunStepDeltaStepDetailsToolCallsRetrievalObject n =
  RunStepDeltaStepDetailsToolCallsRetrievalObject
    <$> arbitrary -- runStepDeltaStepDetailsToolCallsRetrievalObjectIndex :: Int
    <*> arbitraryReducedMaybe n -- runStepDeltaStepDetailsToolCallsRetrievalObjectId :: Maybe Text
    <*> arbitrary -- runStepDeltaStepDetailsToolCallsRetrievalObjectType :: E'Type6
    <*> arbitraryReducedMaybeValue n -- runStepDeltaStepDetailsToolCallsRetrievalObjectRetrieval :: Maybe A.Value
  
instance Arbitrary RunStepDetailsMessageCreationObject where
  arbitrary = sized genRunStepDetailsMessageCreationObject

genRunStepDetailsMessageCreationObject :: Int -> Gen RunStepDetailsMessageCreationObject
genRunStepDetailsMessageCreationObject n =
  RunStepDetailsMessageCreationObject
    <$> arbitrary -- runStepDetailsMessageCreationObjectType :: E'Type14
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
    <*> arbitrary -- runStepDetailsToolCallsCodeObjectType :: E'Type5
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
    <$> arbitrary -- runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType :: E'Type22
    <*> arbitrary -- runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs :: Text
    <*> arbitraryReduced n -- runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage :: RunStepDetailsToolCallsCodeOutputImageObjectImage
  
instance Arbitrary RunStepDetailsToolCallsCodeOutputImageObject where
  arbitrary = sized genRunStepDetailsToolCallsCodeOutputImageObject

genRunStepDetailsToolCallsCodeOutputImageObject :: Int -> Gen RunStepDetailsToolCallsCodeOutputImageObject
genRunStepDetailsToolCallsCodeOutputImageObject n =
  RunStepDetailsToolCallsCodeOutputImageObject
    <$> arbitrary -- runStepDetailsToolCallsCodeOutputImageObjectType :: E'Type17
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
    <$> arbitrary -- runStepDetailsToolCallsCodeOutputLogsObjectType :: E'Type16
    <*> arbitrary -- runStepDetailsToolCallsCodeOutputLogsObjectLogs :: Text
  
instance Arbitrary RunStepDetailsToolCallsFunctionObject where
  arbitrary = sized genRunStepDetailsToolCallsFunctionObject

genRunStepDetailsToolCallsFunctionObject :: Int -> Gen RunStepDetailsToolCallsFunctionObject
genRunStepDetailsToolCallsFunctionObject n =
  RunStepDetailsToolCallsFunctionObject
    <$> arbitrary -- runStepDetailsToolCallsFunctionObjectId :: Text
    <*> arbitrary -- runStepDetailsToolCallsFunctionObjectType :: E'Role
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
    <$> arbitrary -- runStepDetailsToolCallsObjectType :: E'Type15
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCalls :: [RunStepDetailsToolCallsObjectToolCallsInner]
  
instance Arbitrary RunStepDetailsToolCallsObjectToolCallsInner where
  arbitrary = sized genRunStepDetailsToolCallsObjectToolCallsInner

genRunStepDetailsToolCallsObjectToolCallsInner :: Int -> Gen RunStepDetailsToolCallsObjectToolCallsInner
genRunStepDetailsToolCallsObjectToolCallsInner n =
  RunStepDetailsToolCallsObjectToolCallsInner
    <$> arbitrary -- runStepDetailsToolCallsObjectToolCallsInnerId :: Text
    <*> arbitrary -- runStepDetailsToolCallsObjectToolCallsInnerType :: E'Type18
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCallsInnerCodeInterpreter :: RunStepDetailsToolCallsCodeObjectCodeInterpreter
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCallsInnerRetrieval :: A.Value
    <*> arbitraryReduced n -- runStepDetailsToolCallsObjectToolCallsInnerFunction :: RunStepDetailsToolCallsFunctionObjectFunction
  
instance Arbitrary RunStepDetailsToolCallsRetrievalObject where
  arbitrary = sized genRunStepDetailsToolCallsRetrievalObject

genRunStepDetailsToolCallsRetrievalObject :: Int -> Gen RunStepDetailsToolCallsRetrievalObject
genRunStepDetailsToolCallsRetrievalObject n =
  RunStepDetailsToolCallsRetrievalObject
    <$> arbitrary -- runStepDetailsToolCallsRetrievalObjectId :: Text
    <*> arbitrary -- runStepDetailsToolCallsRetrievalObjectType :: E'Type6
    <*> arbitraryReduced n -- runStepDetailsToolCallsRetrievalObjectRetrieval :: A.Value
  
instance Arbitrary RunStepObject where
  arbitrary = sized genRunStepObject

genRunStepObject :: Int -> Gen RunStepObject
genRunStepObject n =
  RunStepObject
    <$> arbitrary -- runStepObjectId :: Text
    <*> arbitrary -- runStepObjectObject :: E'Object18
    <*> arbitrary -- runStepObjectCreatedAt :: Int
    <*> arbitrary -- runStepObjectAssistantId :: Text
    <*> arbitrary -- runStepObjectThreadId :: Text
    <*> arbitrary -- runStepObjectRunId :: Text
    <*> arbitrary -- runStepObjectType :: E'Type13
    <*> arbitrary -- runStepObjectStatus :: E'Status5
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
    <$> arbitrary -- runStepObjectStepDetailsType :: E'Type13
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
    <$> arbitrary -- runStepStreamEventOneOfEvent :: E'Event15
    <*> arbitraryReduced n -- runStepStreamEventOneOfData :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf1 where
  arbitrary = sized genRunStepStreamEventOneOf1

genRunStepStreamEventOneOf1 :: Int -> Gen RunStepStreamEventOneOf1
genRunStepStreamEventOneOf1 n =
  RunStepStreamEventOneOf1
    <$> arbitrary -- runStepStreamEventOneOf1Event :: E'Event16
    <*> arbitraryReduced n -- runStepStreamEventOneOf1Data :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf2 where
  arbitrary = sized genRunStepStreamEventOneOf2

genRunStepStreamEventOneOf2 :: Int -> Gen RunStepStreamEventOneOf2
genRunStepStreamEventOneOf2 n =
  RunStepStreamEventOneOf2
    <$> arbitrary -- runStepStreamEventOneOf2Event :: E'Object19
    <*> arbitraryReduced n -- runStepStreamEventOneOf2Data :: RunStepDeltaObject
  
instance Arbitrary RunStepStreamEventOneOf3 where
  arbitrary = sized genRunStepStreamEventOneOf3

genRunStepStreamEventOneOf3 :: Int -> Gen RunStepStreamEventOneOf3
genRunStepStreamEventOneOf3 n =
  RunStepStreamEventOneOf3
    <$> arbitrary -- runStepStreamEventOneOf3Event :: E'Event17
    <*> arbitraryReduced n -- runStepStreamEventOneOf3Data :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf4 where
  arbitrary = sized genRunStepStreamEventOneOf4

genRunStepStreamEventOneOf4 :: Int -> Gen RunStepStreamEventOneOf4
genRunStepStreamEventOneOf4 n =
  RunStepStreamEventOneOf4
    <$> arbitrary -- runStepStreamEventOneOf4Event :: E'Event18
    <*> arbitraryReduced n -- runStepStreamEventOneOf4Data :: RunStepObject
  
instance Arbitrary RunStepStreamEventOneOf5 where
  arbitrary = sized genRunStepStreamEventOneOf5

genRunStepStreamEventOneOf5 :: Int -> Gen RunStepStreamEventOneOf5
genRunStepStreamEventOneOf5 n =
  RunStepStreamEventOneOf5
    <$> arbitrary -- runStepStreamEventOneOf5Event :: E'Event19
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
    <$> arbitrary -- runStreamEventEvent :: E'Event3
    <*> arbitraryReduced n -- runStreamEventData :: RunObject
  
instance Arbitrary RunStreamEventOneOf where
  arbitrary = sized genRunStreamEventOneOf

genRunStreamEventOneOf :: Int -> Gen RunStreamEventOneOf
genRunStreamEventOneOf n =
  RunStreamEventOneOf
    <$> arbitrary -- runStreamEventOneOfEvent :: E'Event7
    <*> arbitraryReduced n -- runStreamEventOneOfData :: RunObject
  
instance Arbitrary RunStreamEventOneOf1 where
  arbitrary = sized genRunStreamEventOneOf1

genRunStreamEventOneOf1 :: Int -> Gen RunStreamEventOneOf1
genRunStreamEventOneOf1 n =
  RunStreamEventOneOf1
    <$> arbitrary -- runStreamEventOneOf1Event :: E'Event8
    <*> arbitraryReduced n -- runStreamEventOneOf1Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf2 where
  arbitrary = sized genRunStreamEventOneOf2

genRunStreamEventOneOf2 :: Int -> Gen RunStreamEventOneOf2
genRunStreamEventOneOf2 n =
  RunStreamEventOneOf2
    <$> arbitrary -- runStreamEventOneOf2Event :: E'Event9
    <*> arbitraryReduced n -- runStreamEventOneOf2Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf3 where
  arbitrary = sized genRunStreamEventOneOf3

genRunStreamEventOneOf3 :: Int -> Gen RunStreamEventOneOf3
genRunStreamEventOneOf3 n =
  RunStreamEventOneOf3
    <$> arbitrary -- runStreamEventOneOf3Event :: E'Event10
    <*> arbitraryReduced n -- runStreamEventOneOf3Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf4 where
  arbitrary = sized genRunStreamEventOneOf4

genRunStreamEventOneOf4 :: Int -> Gen RunStreamEventOneOf4
genRunStreamEventOneOf4 n =
  RunStreamEventOneOf4
    <$> arbitrary -- runStreamEventOneOf4Event :: E'Event11
    <*> arbitraryReduced n -- runStreamEventOneOf4Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf5 where
  arbitrary = sized genRunStreamEventOneOf5

genRunStreamEventOneOf5 :: Int -> Gen RunStreamEventOneOf5
genRunStreamEventOneOf5 n =
  RunStreamEventOneOf5
    <$> arbitrary -- runStreamEventOneOf5Event :: E'Event12
    <*> arbitraryReduced n -- runStreamEventOneOf5Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf6 where
  arbitrary = sized genRunStreamEventOneOf6

genRunStreamEventOneOf6 :: Int -> Gen RunStreamEventOneOf6
genRunStreamEventOneOf6 n =
  RunStreamEventOneOf6
    <$> arbitrary -- runStreamEventOneOf6Event :: E'Event13
    <*> arbitraryReduced n -- runStreamEventOneOf6Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf7 where
  arbitrary = sized genRunStreamEventOneOf7

genRunStreamEventOneOf7 :: Int -> Gen RunStreamEventOneOf7
genRunStreamEventOneOf7 n =
  RunStreamEventOneOf7
    <$> arbitrary -- runStreamEventOneOf7Event :: E'Event14
    <*> arbitraryReduced n -- runStreamEventOneOf7Data :: RunObject
  
instance Arbitrary RunStreamEventOneOf8 where
  arbitrary = sized genRunStreamEventOneOf8

genRunStreamEventOneOf8 :: Int -> Gen RunStreamEventOneOf8
genRunStreamEventOneOf8 n =
  RunStreamEventOneOf8
    <$> arbitrary -- runStreamEventOneOf8Event :: E'Event3
    <*> arbitraryReduced n -- runStreamEventOneOf8Data :: RunObject
  
instance Arbitrary RunToolCallObject where
  arbitrary = sized genRunToolCallObject

genRunToolCallObject :: Int -> Gen RunToolCallObject
genRunToolCallObject n =
  RunToolCallObject
    <$> arbitrary -- runToolCallObjectId :: Text
    <*> arbitrary -- runToolCallObjectType :: E'Role
    <*> arbitraryReduced n -- runToolCallObjectFunction :: RunToolCallObjectFunction
  
instance Arbitrary RunToolCallObjectFunction where
  arbitrary = sized genRunToolCallObjectFunction

genRunToolCallObjectFunction :: Int -> Gen RunToolCallObjectFunction
genRunToolCallObjectFunction n =
  RunToolCallObjectFunction
    <$> arbitrary -- runToolCallObjectFunctionName :: Text
    <*> arbitrary -- runToolCallObjectFunctionArguments :: Text
  
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
    <*> arbitrary -- threadObjectObject :: E'Object13
    <*> arbitrary -- threadObjectCreatedAt :: Int
    <*> arbitraryReduced n -- threadObjectMetadata :: A.Value
  
instance Arbitrary ThreadStreamEvent where
  arbitrary = sized genThreadStreamEvent

genThreadStreamEvent :: Int -> Gen ThreadStreamEvent
genThreadStreamEvent n =
  ThreadStreamEvent
    <$> arbitrary -- threadStreamEventEvent :: E'Event2
    <*> arbitraryReduced n -- threadStreamEventData :: ThreadObject
  
instance Arbitrary ThreadStreamEventOneOf where
  arbitrary = sized genThreadStreamEventOneOf

genThreadStreamEventOneOf :: Int -> Gen ThreadStreamEventOneOf
genThreadStreamEventOneOf n =
  ThreadStreamEventOneOf
    <$> arbitrary -- threadStreamEventOneOfEvent :: E'Event2
    <*> arbitraryReduced n -- threadStreamEventOneOfData :: ThreadObject
  
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
    <$> arbitraryReducedMaybe n -- truncationObjectType :: Maybe E'Type7
    <*> arbitraryReducedMaybe n -- truncationObjectLastMessages :: Maybe Int
  



instance Arbitrary ChatCompletionRole where
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

instance Arbitrary E'Code where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Code2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Data where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Detail where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EncodingFormat where
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

instance Arbitrary E'FinishReason where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FinishReason2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FinishReason3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Level where
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

instance Arbitrary E'Object3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Object5 where
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

instance Arbitrary E'Order where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Purpose where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Purpose2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Quality where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Reason where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Reason2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ResponseFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ResponseFormat2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ResponseFormat3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role where
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

instance Arbitrary E'Size where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Size2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status5 where
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

instance Arbitrary E'Type3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Voice where
  arbitrary = arbitraryBoundedEnum

