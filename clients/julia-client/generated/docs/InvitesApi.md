# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_invite**](InvitesApi.md#delete_invite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**invite_user**](InvitesApi.md#invite_user) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**list_invites**](InvitesApi.md#list_invites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieve_invite**](InvitesApi.md#retrieve_invite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


# **delete_invite**
> `delete_invite`(_api::`InvitesApi`, `invite_id`::`String`; _mediaType=nothing) -> `InviteDeleteResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_invite`(_api::`InvitesApi`, response_stream::`Channel`, `invite_id`::`String`; _mediaType=nothing) -> `Channel`{ `InviteDeleteResponse` }, `OpenAPI.Clients.ApiResponse`

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`InvitesApi`** | API context | 
**`invite_id`** | **`String`** | The ID of the invite to delete. |

### Return type

[**`InviteDeleteResponse`**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **invite_user**
> `invite_user`(_api::`InvitesApi`, `invite_request`::`InviteRequest`; _mediaType=nothing) -> `Invite`, `OpenAPI.Clients.ApiResponse` <br/>
> `invite_user`(_api::`InvitesApi`, response_stream::`Channel`, `invite_request`::`InviteRequest`; _mediaType=nothing) -> `Channel`{ `Invite` }, `OpenAPI.Clients.ApiResponse`

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`InvitesApi`** | API context | 
**`invite_request`** | [**`InviteRequest`**](InviteRequest.md) | The invite request payload. |

### Return type

[**`Invite`**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_invites**
> `list_invites`(_api::`InvitesApi`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `InviteListResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_invites`(_api::`InvitesApi`, response_stream::`Channel`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `Channel`{ `InviteListResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of invites in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`InvitesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]

### Return type

[**`InviteListResponse`**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_invite**
> `retrieve_invite`(_api::`InvitesApi`, `invite_id`::`String`; _mediaType=nothing) -> `Invite`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_invite`(_api::`InvitesApi`, response_stream::`Channel`, `invite_id`::`String`; _mediaType=nothing) -> `Channel`{ `Invite` }, `OpenAPI.Clients.ApiResponse`

Retrieves an invite.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`InvitesApi`** | API context | 
**`invite_id`** | **`String`** | The ID of the invite to retrieve. |

### Return type

[**`Invite`**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

