{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Default where

import           Import


-- | Create an organization admin API key
--
-- Create a new admin-level API key for the organization.
-- operationId: adminApiKeysCreate
postOrganizationAdminApiKeysR :: Handler Value
postOrganizationAdminApiKeysR = notImplemented

-- | Delete an organization admin API key
--
-- Delete the specified admin API key.
-- operationId: adminApiKeysDelete
deleteOrganizationAdminApiKeysByTextR :: Text -- ^ 
                                      -> Handler Value
deleteOrganizationAdminApiKeysByTextR keyId = notImplemented

-- | Retrieve a single organization API key
--
-- Get details for a specific organization API key by its ID.
-- operationId: adminApiKeysGet
getOrganizationAdminApiKeysByTextR :: Text -- ^ 
                                   -> Handler Value
getOrganizationAdminApiKeysByTextR keyId = notImplemented

-- | List organization API keys
--
-- Retrieve a paginated list of organization admin API keys.
-- operationId: adminApiKeysList
getOrganizationAdminApiKeysR :: Handler Value
getOrganizationAdminApiKeysR = notImplemented
