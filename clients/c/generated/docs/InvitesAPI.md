# InvitesAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvitesAPI_deleteInvite**](InvitesAPI.md#InvitesAPI_deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**InvitesAPI_inviteUser**](InvitesAPI.md#InvitesAPI_inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**InvitesAPI_listInvites**](InvitesAPI.md#InvitesAPI_listInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**InvitesAPI_retrieveInvite**](InvitesAPI.md#InvitesAPI_retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


# **InvitesAPI_deleteInvite**
```c
// Delete an invite. If the invite has already been accepted, it cannot be deleted.
//
invite_delete_response_t* InvitesAPI_deleteInvite(apiClient_t *apiClient, char *invite_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**invite_id** | **char \*** | The ID of the invite to delete. | 

### Return type

[invite_delete_response_t](invite_delete_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvitesAPI_inviteUser**
```c
// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
//
invite_t* InvitesAPI_inviteUser(apiClient_t *apiClient, invite_request_t *invite_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**invite_request** | **[invite_request_t](invite_request.md) \*** | The invite request payload. | 

### Return type

[invite_t](invite.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvitesAPI_listInvites**
```c
// Returns a list of invites in the organization.
//
invite_list_response_t* InvitesAPI_listInvites(apiClient_t *apiClient, int *limit, char *after);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[invite_list_response_t](invite_list_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvitesAPI_retrieveInvite**
```c
// Retrieves an invite.
//
invite_t* InvitesAPI_retrieveInvite(apiClient_t *apiClient, char *invite_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**invite_id** | **char \*** | The ID of the invite to retrieve. | 

### Return type

[invite_t](invite.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

