{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.UsersSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteOrganizationUsersByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ OrganizationUsersByTextR "userId_example"
            statusIs 501

    describe "getOrganizationUsersR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsersR
            statusIs 501

    describe "postOrganizationUsersByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ OrganizationUsersByTextR "userId_example"
            statusIs 501

    describe "getOrganizationUsersByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationUsersByTextR "userId_example"
            statusIs 501
