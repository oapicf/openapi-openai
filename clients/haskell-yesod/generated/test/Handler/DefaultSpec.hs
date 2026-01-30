{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postOrganizationAdminApiKeysR" $
        it "returns 501 Not Implemented" $ do
            post OrganizationAdminApiKeysR
            statusIs 501

    describe "deleteOrganizationAdminApiKeysByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ OrganizationAdminApiKeysByTextR "keyId_example"
            statusIs 501

    describe "getOrganizationAdminApiKeysByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationAdminApiKeysByTextR "keyId_example"
            statusIs 501

    describe "getOrganizationAdminApiKeysR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationAdminApiKeysR
            statusIs 501
