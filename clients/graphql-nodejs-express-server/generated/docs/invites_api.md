# invites_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteInvite**](invites_api.md#DeleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**InviteUser**](invites_api.md#InviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**ListInvites**](invites_api.md#ListInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**RetrieveInvite**](invites_api.md#RetrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


<a name="DeleteInvite"></a>
# **DeleteInvite**
> InviteDeleteResponse DeleteInvite(inviteId)

Delete an invite. If the invite has already been accepted, it cannot be deleted.
<a name="InviteUser"></a>
# **InviteUser**
> Invite InviteUser(inviteRequest)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
<a name="ListInvites"></a>
# **ListInvites**
> InviteListResponse ListInvites(limit, after)

Returns a list of invites in the organization.
<a name="RetrieveInvite"></a>
# **RetrieveInvite**
> Invite RetrieveInvite(inviteId)

Retrieves an invite.
