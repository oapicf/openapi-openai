# UsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteUser**](UsersApi.md#DeleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**ListUsers**](UsersApi.md#ListUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**ModifyUser**](UsersApi.md#ModifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**RetrieveUser**](UsersApi.md#RetrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


# **DeleteUser**
> UserDeleteResponse DeleteUser(user_id)

Deletes a user from the organization.

### Example
```R
library(openapi)

# Deletes a user from the organization.
#
# prepare function argument(s)
var_user_id <- "user_id_example" # character | The ID of the user.

api_instance <- UsersApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteUser(var_user_iddata_file = "result.txt")
result <- api_instance$DeleteUser(var_user_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **character**| The ID of the user. | 

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User deleted successfully. |  -  |

# **ListUsers**
> UserListResponse ListUsers(limit = 20, after = var.after)

Lists all of the users in the organization.

### Example
```R
library(openapi)

# Lists all of the users in the organization.
#
# prepare function argument(s)
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)

api_instance <- UsersApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListUsers(limit = var_limit, after = var_afterdata_file = "result.txt")
result <- api_instance$ListUsers(limit = var_limit, after = var_after)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Users listed successfully. |  -  |

# **ModifyUser**
> User ModifyUser(user_id, user_role_update_request)

Modifies a user's role in the organization.

### Example
```R
library(openapi)

# Modifies a user's role in the organization.
#
# prepare function argument(s)
var_user_id <- "user_id_example" # character | The ID of the user.
var_user_role_update_request <- UserRoleUpdateRequest$new("owner") # UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.

api_instance <- UsersApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyUser(var_user_id, var_user_role_update_requestdata_file = "result.txt")
result <- api_instance$ModifyUser(var_user_id, var_user_role_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **character**| The ID of the user. | 
 **user_role_update_request** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | 

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role updated successfully. |  -  |

# **RetrieveUser**
> User RetrieveUser(user_id)

Retrieves a user by their identifier.

### Example
```R
library(openapi)

# Retrieves a user by their identifier.
#
# prepare function argument(s)
var_user_id <- "user_id_example" # character | The ID of the user.

api_instance <- UsersApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveUser(var_user_iddata_file = "result.txt")
result <- api_instance$RetrieveUser(var_user_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **character**| The ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User retrieved successfully. |  -  |

