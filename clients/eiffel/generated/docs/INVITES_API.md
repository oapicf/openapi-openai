# INVITES_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**delete_invite**](INVITES_API.md#delete_invite) | **Delete** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**invite_user**](INVITES_API.md#invite_user) | **Post** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**list_invites**](INVITES_API.md#list_invites) | **Get** /organization/invites | Returns a list of invites in the organization.
[**retrieve_invite**](INVITES_API.md#retrieve_invite) | **Get** /organization/invites/{invite_id} | Retrieves an invite.


# **delete_invite**
> delete_invite (invite_id: STRING_32 ): detachable INVITE_DELETE_RESPONSE


Delete an invite. If the invite has already been accepted, it cannot be deleted.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **STRING_32**| The ID of the invite to delete. | [default to null]

### Return type

[**INVITE_DELETE_RESPONSE**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invite_user**
> invite_user (invite_request: INVITE_REQUEST ): detachable INVITE


Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_request** | [**INVITE_REQUEST**](INVITE_REQUEST.md)| The invite request payload. | 

### Return type

[**INVITE**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_invites**
> list_invites (limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ): detachable INVITE_LIST_RESPONSE


Returns a list of invites in the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]

### Return type

[**INVITE_LIST_RESPONSE**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_invite**
> retrieve_invite (invite_id: STRING_32 ): detachable INVITE


Retrieves an invite.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **STRING_32**| The ID of the invite to retrieve. | [default to null]

### Return type

[**INVITE**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

