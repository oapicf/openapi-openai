# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteInvite**](InvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted. |
| [**inviteUser**](InvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. |
| [**listInvites**](InvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization. |
| [**retrieveInvite**](InvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite. |


<a id="deleteInvite"></a>
# **deleteInvite**
> InviteDeleteResponse deleteInvite(inviteId)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitesApi()
val inviteId : kotlin.String = inviteId_example // kotlin.String | The ID of the invite to delete.
try {
    val result : InviteDeleteResponse = apiInstance.deleteInvite(inviteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitesApi#deleteInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitesApi#deleteInvite")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inviteId** | **kotlin.String**| The ID of the invite to delete. | |

### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inviteUser"></a>
# **inviteUser**
> Invite inviteUser(inviteRequest)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitesApi()
val inviteRequest : InviteRequest =  // InviteRequest | The invite request payload.
try {
    val result : Invite = apiInstance.inviteUser(inviteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitesApi#inviteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitesApi#inviteUser")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inviteRequest** | [**InviteRequest**](InviteRequest.md)| The invite request payload. | |

### Return type

[**Invite**](Invite.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="listInvites"></a>
# **listInvites**
> InviteListResponse listInvites(limit, after)

Returns a list of invites in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitesApi()
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    val result : InviteListResponse = apiInstance.listInvites(limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitesApi#listInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitesApi#listInvites")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**InviteListResponse**](InviteListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveInvite"></a>
# **retrieveInvite**
> Invite retrieveInvite(inviteId)

Retrieves an invite.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitesApi()
val inviteId : kotlin.String = inviteId_example // kotlin.String | The ID of the invite to retrieve.
try {
    val result : Invite = apiInstance.retrieveInvite(inviteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitesApi#retrieveInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitesApi#retrieveInvite")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inviteId** | **kotlin.String**| The ID of the invite to retrieve. | |

### Return type

[**Invite**](Invite.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

