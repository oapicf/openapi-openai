{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Projects where

import           Import


-- | Archives a project in the organization. Archived projects cannot be used or updated.
--
-- operationId: archiveProject
postOrganizationProjectsByTextArchiveR :: Text -- ^ The ID of the project.
                                       -> Handler Value
postOrganizationProjectsByTextArchiveR projectId = notImplemented

-- | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
--
-- operationId: createProject
postOrganizationProjectsR :: Handler Value
postOrganizationProjectsR = notImplemented

-- | Creates a new service account in the project. This also returns an unredacted API key for the service account.
--
-- operationId: createProjectServiceAccount
postOrganizationProjectsByTextServiceAccountsR :: Text -- ^ The ID of the project.
                                               -> Handler Value
postOrganizationProjectsByTextServiceAccountsR projectId = notImplemented

-- | Adds a user to the project. Users must already be members of the organization to be added to a project.
--
-- operationId: createProjectUser
postOrganizationProjectsByTextUsersR :: Text -- ^ The ID of the project.
                                     -> Handler Value
postOrganizationProjectsByTextUsersR projectId = notImplemented

-- | Deletes an API key from the project.
--
-- operationId: deleteProjectApiKey
deleteOrganizationProjectsByTextApiKeysByTextR :: Text -- ^ The ID of the project.
                                               -> Text -- ^ The ID of the API key.
                                               -> Handler Value
deleteOrganizationProjectsByTextApiKeysByTextR projectId keyId = notImplemented

-- | Deletes a service account from the project.
--
-- operationId: deleteProjectServiceAccount
deleteOrganizationProjectsByTextServiceAccountsByTextR :: Text -- ^ The ID of the project.
                                                       -> Text -- ^ The ID of the service account.
                                                       -> Handler Value
deleteOrganizationProjectsByTextServiceAccountsByTextR projectId serviceAccountId = notImplemented

-- | Deletes a user from the project.
--
-- operationId: deleteProjectUser
deleteOrganizationProjectsByTextUsersByTextR :: Text -- ^ The ID of the project.
                                             -> Text -- ^ The ID of the user.
                                             -> Handler Value
deleteOrganizationProjectsByTextUsersByTextR projectId userId = notImplemented

-- | Returns a list of API keys in the project.
--
-- operationId: listProjectApiKeys
getOrganizationProjectsByTextApiKeysR :: Text -- ^ The ID of the project.
                                      -> Handler Value
getOrganizationProjectsByTextApiKeysR projectId = notImplemented

-- | Returns the rate limits per model for a project.
--
-- operationId: listProjectRateLimits
getOrganizationProjectsByTextRateLimitsR :: Text -- ^ The ID of the project.
                                         -> Handler Value
getOrganizationProjectsByTextRateLimitsR projectId = notImplemented

-- | Returns a list of service accounts in the project.
--
-- operationId: listProjectServiceAccounts
getOrganizationProjectsByTextServiceAccountsR :: Text -- ^ The ID of the project.
                                              -> Handler Value
getOrganizationProjectsByTextServiceAccountsR projectId = notImplemented

-- | Returns a list of users in the project.
--
-- operationId: listProjectUsers
getOrganizationProjectsByTextUsersR :: Text -- ^ The ID of the project.
                                    -> Handler Value
getOrganizationProjectsByTextUsersR projectId = notImplemented

-- | Returns a list of projects.
--
-- operationId: listProjects
getOrganizationProjectsR :: Handler Value
getOrganizationProjectsR = notImplemented

-- | Modifies a project in the organization.
--
-- operationId: modifyProject
postOrganizationProjectsByTextR :: Text -- ^ The ID of the project.
                                -> Handler Value
postOrganizationProjectsByTextR projectId = notImplemented

-- | Modifies a user&#39;s role in the project.
--
-- operationId: modifyProjectUser
postOrganizationProjectsByTextUsersByTextR :: Text -- ^ The ID of the project.
                                           -> Text -- ^ The ID of the user.
                                           -> Handler Value
postOrganizationProjectsByTextUsersByTextR projectId userId = notImplemented

-- | Retrieves a project.
--
-- operationId: retrieveProject
getOrganizationProjectsByTextR :: Text -- ^ The ID of the project.
                               -> Handler Value
getOrganizationProjectsByTextR projectId = notImplemented

-- | Retrieves an API key in the project.
--
-- operationId: retrieveProjectApiKey
getOrganizationProjectsByTextApiKeysByTextR :: Text -- ^ The ID of the project.
                                            -> Text -- ^ The ID of the API key.
                                            -> Handler Value
getOrganizationProjectsByTextApiKeysByTextR projectId keyId = notImplemented

-- | Retrieves a service account in the project.
--
-- operationId: retrieveProjectServiceAccount
getOrganizationProjectsByTextServiceAccountsByTextR :: Text -- ^ The ID of the project.
                                                    -> Text -- ^ The ID of the service account.
                                                    -> Handler Value
getOrganizationProjectsByTextServiceAccountsByTextR projectId serviceAccountId = notImplemented

-- | Retrieves a user in the project.
--
-- operationId: retrieveProjectUser
getOrganizationProjectsByTextUsersByTextR :: Text -- ^ The ID of the project.
                                          -> Text -- ^ The ID of the user.
                                          -> Handler Value
getOrganizationProjectsByTextUsersByTextR projectId userId = notImplemented

-- | Updates a project rate limit.
--
-- operationId: updateProjectRateLimits
postOrganizationProjectsByTextRateLimitsByTextR :: Text -- ^ The ID of the project.
                                                -> Text -- ^ The ID of the rate limit.
                                                -> Handler Value
postOrganizationProjectsByTextRateLimitsByTextR projectId rateLimitId = notImplemented
