# OpenApiOpenAIClient::UsersApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_user**](UsersApi.md#delete_user) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization. |
| [**list_users**](UsersApi.md#list_users) | **GET** /organization/users | Lists all of the users in the organization. |
| [**modify_user**](UsersApi.md#modify_user) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization. |
| [**retrieve_user**](UsersApi.md#retrieve_user) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier. |


## delete_user

> <UserDeleteResponse> delete_user(user_id)

Deletes a user from the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsersApi.new
user_id = 'user_id_example' # String | The ID of the user.

begin
  # Deletes a user from the organization.
  result = api_instance.delete_user(user_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->delete_user: #{e}"
end
```

#### Using the delete_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserDeleteResponse>, Integer, Hash)> delete_user_with_http_info(user_id)

```ruby
begin
  # Deletes a user from the organization.
  data, status_code, headers = api_instance.delete_user_with_http_info(user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserDeleteResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->delete_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **String** | The ID of the user. |  |

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_users

> <UserListResponse> list_users(opts)

Lists all of the users in the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsersApi.new
opts = {
  limit: 56, # Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  after: 'after_example' # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
}

begin
  # Lists all of the users in the organization.
  result = api_instance.list_users(opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->list_users: #{e}"
end
```

#### Using the list_users_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserListResponse>, Integer, Hash)> list_users_with_http_info(opts)

```ruby
begin
  # Lists all of the users in the organization.
  data, status_code, headers = api_instance.list_users_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserListResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->list_users_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional][default to 20] |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## modify_user

> <User> modify_user(user_id, user_role_update_request)

Modifies a user's role in the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsersApi.new
user_id = 'user_id_example' # String | The ID of the user.
user_role_update_request = OpenApiOpenAIClient::UserRoleUpdateRequest.new({role: 'owner'}) # UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.

begin
  # Modifies a user's role in the organization.
  result = api_instance.modify_user(user_id, user_role_update_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->modify_user: #{e}"
end
```

#### Using the modify_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<User>, Integer, Hash)> modify_user_with_http_info(user_id, user_role_update_request)

```ruby
begin
  # Modifies a user's role in the organization.
  data, status_code, headers = api_instance.modify_user_with_http_info(user_id, user_role_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <User>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->modify_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **String** | The ID of the user. |  |
| **user_role_update_request** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md) | The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |  |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## retrieve_user

> <User> retrieve_user(user_id)

Retrieves a user by their identifier.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsersApi.new
user_id = 'user_id_example' # String | The ID of the user.

begin
  # Retrieves a user by their identifier.
  result = api_instance.retrieve_user(user_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->retrieve_user: #{e}"
end
```

#### Using the retrieve_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<User>, Integer, Hash)> retrieve_user_with_http_info(user_id)

```ruby
begin
  # Retrieves a user by their identifier.
  data, status_code, headers = api_instance.retrieve_user_with_http_info(user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <User>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsersApi->retrieve_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **String** | The ID of the user. |  |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

