# UsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**listUsers**](UsersApi.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**modifyUser**](UsersApi.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieveUser**](UsersApi.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.



## deleteUser

> UserDeleteResponse deleteUser(userId)

Deletes a user from the organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String userId = null; // String | The ID of the user.
try {
    UserDeleteResponse result = apiInstance.deleteUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The ID of the user. | [default to null]

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listUsers

> UserListResponse listUsers(limit, after)

Lists all of the users in the organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    UserListResponse result = apiInstance.listUsers(limit, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listUsers");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## modifyUser

> User modifyUser(userId, userRoleUpdateRequest)

Modifies a user&#39;s role in the organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String userId = null; // String | The ID of the user.
UserRoleUpdateRequest userRoleUpdateRequest = new UserRoleUpdateRequest(); // UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.
try {
    User result = apiInstance.modifyUser(userId, userRoleUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#modifyUser");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The ID of the user. | [default to null]
 **userRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## retrieveUser

> User retrieveUser(userId)

Retrieves a user by their identifier.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String userId = null; // String | The ID of the user.
try {
    User result = apiInstance.retrieveUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#retrieveUser");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The ID of the user. | [default to null]

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

