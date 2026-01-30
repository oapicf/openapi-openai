# UsersController

All URIs are relative to `"/v1"`

The controller class is defined in **[UsersController.java](../../src/main/java/org/openapitools/controller/UsersController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**listUsers**](#listUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**modifyUser**](#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieveUser**](#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.

<a id="deleteUser"></a>
# **deleteUser**
```java
Mono<UserDeleteResponse> UsersController.deleteUser(userId)
```

Deletes a user from the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**userId** | `String` | The ID of the user. |

### Return type
[**UserDeleteResponse**](../../docs/models/UserDeleteResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listUsers"></a>
# **listUsers**
```java
Mono<UserListResponse> UsersController.listUsers(limitafter)
```

Lists all of the users in the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]

### Return type
[**UserListResponse**](../../docs/models/UserListResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="modifyUser"></a>
# **modifyUser**
```java
Mono<User> UsersController.modifyUser(userIduserRoleUpdateRequest)
```

Modifies a user&#39;s role in the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**userId** | `String` | The ID of the user. |
**userRoleUpdateRequest** | [**UserRoleUpdateRequest**](../../docs/models/UserRoleUpdateRequest.md) | The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |

### Return type
[**User**](../../docs/models/User.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="retrieveUser"></a>
# **retrieveUser**
```java
Mono<User> UsersController.retrieveUser(userId)
```

Retrieves a user by their identifier.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**userId** | `String` | The ID of the user. |

### Return type
[**User**](../../docs/models/User.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

