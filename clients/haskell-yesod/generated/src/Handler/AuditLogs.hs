{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.AuditLogs where

import           Import


-- | List user actions and configuration changes within this organization.
--
-- operationId: listAuditLogs
getOrganizationAuditLogsR :: Handler Value
getOrganizationAuditLogsR = notImplemented
