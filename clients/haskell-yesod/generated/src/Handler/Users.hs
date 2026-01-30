{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Users where

import           Import


-- | Deletes a user from the organization.
--
-- operationId: deleteUser
deleteOrganizationUsersByTextR :: Text -- ^ The ID of the user.
                               -> Handler Value
deleteOrganizationUsersByTextR userId = notImplemented

-- | Lists all of the users in the organization.
--
-- operationId: listUsers
getOrganizationUsersR :: Handler Value
getOrganizationUsersR = notImplemented

-- | Modifies a user&#39;s role in the organization.
--
-- operationId: modifyUser
postOrganizationUsersByTextR :: Text -- ^ The ID of the user.
                             -> Handler Value
postOrganizationUsersByTextR userId = notImplemented

-- | Retrieves a user by their identifier.
--
-- operationId: retrieveUser
getOrganizationUsersByTextR :: Text -- ^ The ID of the user.
                            -> Handler Value
getOrganizationUsersByTextR userId = notImplemented
