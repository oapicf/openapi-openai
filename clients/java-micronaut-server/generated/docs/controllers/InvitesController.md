# InvitesController

All URIs are relative to `"/v1"`

The controller class is defined in **[InvitesController.java](../../src/main/java/org/openapitools/controller/InvitesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInvite**](#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**inviteUser**](#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**listInvites**](#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieveInvite**](#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.

<a id="deleteInvite"></a>
# **deleteInvite**
```java
Mono<InviteDeleteResponse> InvitesController.deleteInvite(inviteId)
```

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**inviteId** | `String` | The ID of the invite to delete. |

### Return type
[**InviteDeleteResponse**](../../docs/models/InviteDeleteResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="inviteUser"></a>
# **inviteUser**
```java
Mono<Invite> InvitesController.inviteUser(inviteRequest)
```

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**inviteRequest** | [**InviteRequest**](../../docs/models/InviteRequest.md) | The invite request payload. |

### Return type
[**Invite**](../../docs/models/Invite.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="listInvites"></a>
# **listInvites**
```java
Mono<InviteListResponse> InvitesController.listInvites(limitafter)
```

Returns a list of invites in the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]

### Return type
[**InviteListResponse**](../../docs/models/InviteListResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveInvite"></a>
# **retrieveInvite**
```java
Mono<Invite> InvitesController.retrieveInvite(inviteId)
```

Retrieves an invite.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**inviteId** | `String` | The ID of the invite to retrieve. |

### Return type
[**Invite**](../../docs/models/Invite.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

