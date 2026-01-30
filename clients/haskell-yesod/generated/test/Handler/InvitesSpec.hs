{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.InvitesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteOrganizationInvitesByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ OrganizationInvitesByTextR "inviteId_example"
            statusIs 501

    describe "postOrganizationInvitesR" $
        it "returns 501 Not Implemented" $ do
            post OrganizationInvitesR
            statusIs 501

    describe "getOrganizationInvitesR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationInvitesR
            statusIs 501

    describe "getOrganizationInvitesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ OrganizationInvitesByTextR "inviteId_example"
            statusIs 501
