{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AuditLogsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getOrganizationAuditLogsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationAuditLogsR
            statusIs 501
