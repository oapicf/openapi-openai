{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ProjectsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postOrganizationProjectsByTextArchiveR" $
        it "returns 501 Not Implemented" $ do
            post $ OrganizationProjectsByTextArchiveR "projectId_example"
            statusIs 501

    describe "postOrganizationProjectsR" $
        it "returns 501 Not Implemented" $ do
            post OrganizationProjectsR
            statusIs 501

    describe "postOrganizationProjectsByTextServiceAccountsR" $
        it "returns 501 Not Implemented" $ do
            post $ OrganizationProjectsByTextServiceAccountsR "projectId_example"
            statusIs 501

    describe "postOrganizationProjectsByTextUsersR" $
        it "returns 501 Not Implemented" $ do
            post $ OrganizationProjectsByTextUsersR "projectId_example"
            statusIs 501

    describe "deleteOrganizationProjectsByTextApiKeysByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ OrganizationProjectsByTextApiKeysByTextR "projectId_example" "keyId_example"
            statusIs 501

    describe "deleteOrganizationProjectsByTextServiceAccountsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ OrganizationProjectsByTextServiceAccountsByTextR "projectId_example" "serviceAccountId_example"
            statusIs 501

    describe "deleteOrganizationProjectsByTextUsersByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ OrganizationProjectsByTextUsersByTextR "projectId_example" "userId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextApiKeysR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextApiKeysR "projectId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextRateLimitsR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextRateLimitsR "projectId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextServiceAccountsR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextServiceAccountsR "projectId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextUsersR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextUsersR "projectId_example"
            statusIs 501

    describe "getOrganizationProjectsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationProjectsR
            statusIs 501

    describe "postOrganizationProjectsByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ OrganizationProjectsByTextR "projectId_example"
            statusIs 501

    describe "postOrganizationProjectsByTextUsersByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ OrganizationProjectsByTextUsersByTextR "projectId_example" "userId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextR "projectId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextApiKeysByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextApiKeysByTextR "projectId_example" "keyId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextServiceAccountsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextServiceAccountsByTextR "projectId_example" "serviceAccountId_example"
            statusIs 501

    describe "getOrganizationProjectsByTextUsersByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationProjectsByTextUsersByTextR "projectId_example" "userId_example"
            statusIs 501

    describe "postOrganizationProjectsByTextRateLimitsByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ OrganizationProjectsByTextRateLimitsByTextR "projectId_example" "rateLimitId_example"
            statusIs 501
