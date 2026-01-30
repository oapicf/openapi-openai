{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Invites where

import           Import


-- | Delete an invite. If the invite has already been accepted, it cannot be deleted.
--
-- operationId: deleteInvite
deleteOrganizationInvitesByTextR :: Text -- ^ The ID of the invite to delete.
                                 -> Handler Value
deleteOrganizationInvitesByTextR inviteId = notImplemented

-- | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
--
-- operationId: inviteUser
postOrganizationInvitesR :: Handler Value
postOrganizationInvitesR = notImplemented

-- | Returns a list of invites in the organization.
--
-- operationId: listInvites
getOrganizationInvitesR :: Handler Value
getOrganizationInvitesR = notImplemented

-- | Retrieves an invite.
--
-- operationId: retrieveInvite
getOrganizationInvitesByTextR :: Text -- ^ The ID of the invite to retrieve.
                              -> Handler Value
getOrganizationInvitesByTextR inviteId = notImplemented
