# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteInvite**](InvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted. |
| [**inviteUser**](InvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. |
| [**listInvites**](InvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization. |
| [**retrieveInvite**](InvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite. |


## Creating InvitesApi

To initiate an instance of `InvitesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.InvitesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(InvitesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    InvitesApi invitesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="deleteInvite"></a>
# **deleteInvite**
```java
Mono<InviteDeleteResponse> InvitesApi.deleteInvite(inviteId)
```

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteId** | `String`| The ID of the invite to delete. | |


### Return type
[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="inviteUser"></a>
# **inviteUser**
```java
Mono<Invite> InvitesApi.inviteUser(inviteRequest)
```

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteRequest** | [**InviteRequest**](InviteRequest.md)| The invite request payload. | |


### Return type
[**Invite**](Invite.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="listInvites"></a>
# **listInvites**
```java
Mono<InviteListResponse> InvitesApi.listInvites(limitafter)
```

Returns a list of invites in the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |


### Return type
[**InviteListResponse**](InviteListResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveInvite"></a>
# **retrieveInvite**
```java
Mono<Invite> InvitesApi.retrieveInvite(inviteId)
```

Retrieves an invite.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteId** | `String`| The ID of the invite to retrieve. | |


### Return type
[**Invite**](Invite.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

