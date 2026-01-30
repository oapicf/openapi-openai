# Org.OpenAPITools.Api.InvitesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteInvite**](InvitesApi.md#deleteinvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted. |
| [**InviteUser**](InvitesApi.md#inviteuser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. |
| [**ListInvites**](InvitesApi.md#listinvites) | **GET** /organization/invites | Returns a list of invites in the organization. |
| [**RetrieveInvite**](InvitesApi.md#retrieveinvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite. |

<a id="deleteinvite"></a>
# **DeleteInvite**
> InviteDeleteResponse DeleteInvite (string inviteId)

Delete an invite. If the invite has already been accepted, it cannot be deleted.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inviteId** | **string** | The ID of the invite to delete. |  |

### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invite deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="inviteuser"></a>
# **InviteUser**
> Invite InviteUser (InviteRequest inviteRequest)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inviteRequest** | [**InviteRequest**](InviteRequest.md) | The invite request payload. |  |

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User invited successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listinvites"></a>
# **ListInvites**
> InviteListResponse ListInvites (int limit = null, string after = null)

Returns a list of invites in the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |

### Return type

[**InviteListResponse**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invites listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrieveinvite"></a>
# **RetrieveInvite**
> Invite RetrieveInvite (string inviteId)

Retrieves an invite.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inviteId** | **string** | The ID of the invite to retrieve. |  |

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invite retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

