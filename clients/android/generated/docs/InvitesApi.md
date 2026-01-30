# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInvite**](InvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**inviteUser**](InvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**listInvites**](InvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieveInvite**](InvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.



## deleteInvite

> InviteDeleteResponse deleteInvite(inviteId)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example

```java
// Import classes:
//import org.openapitools.client.api.InvitesApi;

InvitesApi apiInstance = new InvitesApi();
String inviteId = null; // String | The ID of the invite to delete.
try {
    InviteDeleteResponse result = apiInstance.deleteInvite(inviteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvitesApi#deleteInvite");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **String**| The ID of the invite to delete. | [default to null]

### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inviteUser

> Invite inviteUser(inviteRequest)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.InvitesApi;

InvitesApi apiInstance = new InvitesApi();
InviteRequest inviteRequest = new InviteRequest(); // InviteRequest | The invite request payload.
try {
    Invite result = apiInstance.inviteUser(inviteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvitesApi#inviteUser");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteRequest** | [**InviteRequest**](InviteRequest.md)| The invite request payload. |

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## listInvites

> InviteListResponse listInvites(limit, after)

Returns a list of invites in the organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.InvitesApi;

InvitesApi apiInstance = new InvitesApi();
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    InviteListResponse result = apiInstance.listInvites(limit, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvitesApi#listInvites");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]

### Return type

[**InviteListResponse**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveInvite

> Invite retrieveInvite(inviteId)

Retrieves an invite.

### Example

```java
// Import classes:
//import org.openapitools.client.api.InvitesApi;

InvitesApi apiInstance = new InvitesApi();
String inviteId = null; // String | The ID of the invite to retrieve.
try {
    Invite result = apiInstance.retrieveInvite(inviteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvitesApi#retrieveInvite");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **String**| The ID of the invite to retrieve. | [default to null]

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

