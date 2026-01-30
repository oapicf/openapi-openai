# UsersApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization. |
| [**listUsers**](UsersApi.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization. |
| [**modifyUser**](UsersApi.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization. |
| [**retrieveUser**](UsersApi.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier. |


<a id="deleteUser"></a>
# **deleteUser**
> UserDeleteResponse deleteUser(userId)

Deletes a user from the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
try {
    val result : UserDeleteResponse = apiInstance.deleteUser(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**| The ID of the user. | |

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listUsers"></a>
# **listUsers**
> UserListResponse listUsers(limit, after)

Lists all of the users in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    val result : UserListResponse = apiInstance.listUsers(limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listUsers")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="modifyUser"></a>
# **modifyUser**
> User modifyUser(userId, userRoleUpdateRequest)

Modifies a user&#39;s role in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
val userRoleUpdateRequest : UserRoleUpdateRequest =  // UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.
try {
    val result : User = apiInstance.modifyUser(userId, userRoleUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#modifyUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#modifyUser")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**| The ID of the user. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | |

### Return type

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="retrieveUser"></a>
# **retrieveUser**
> User retrieveUser(userId)

Retrieves a user by their identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
try {
    val result : User = apiInstance.retrieveUser(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#retrieveUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#retrieveUser")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**| The ID of the user. | |

### Return type

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

