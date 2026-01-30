# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteInvite**](InvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted. |
| [**inviteUser**](InvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. |
| [**listInvites**](InvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization. |
| [**retrieveInvite**](InvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite. |


<a name="deleteInvite"></a>
# **deleteInvite**
> InviteDeleteResponse deleteInvite(invite\_id)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invite\_id** | **String**| The ID of the invite to delete. | [default to null] |

### Return type

[**InviteDeleteResponse**](../Models/InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="inviteUser"></a>
# **inviteUser**
> Invite inviteUser(InviteRequest)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **InviteRequest** | [**InviteRequest**](../Models/InviteRequest.md)| The invite request payload. | |

### Return type

[**Invite**](../Models/Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="listInvites"></a>
# **listInvites**
> InviteListResponse listInvites(limit, after)

Returns a list of invites in the organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |

### Return type

[**InviteListResponse**](../Models/InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveInvite"></a>
# **retrieveInvite**
> Invite retrieveInvite(invite\_id)

Retrieves an invite.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invite\_id** | **String**| The ID of the invite to retrieve. | [default to null] |

### Return type

[**Invite**](../Models/Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

