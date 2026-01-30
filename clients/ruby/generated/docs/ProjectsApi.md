# OpenApiOpenAIClient::ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**archive_project**](ProjectsApi.md#archive_project) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated. |
| [**create_project**](ProjectsApi.md#create_project) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted. |
| [**create_project_service_account**](ProjectsApi.md#create_project_service_account) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account. |
| [**create_project_user**](ProjectsApi.md#create_project_user) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project. |
| [**delete_project_api_key**](ProjectsApi.md#delete_project_api_key) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project. |
| [**delete_project_service_account**](ProjectsApi.md#delete_project_service_account) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project. |
| [**delete_project_user**](ProjectsApi.md#delete_project_user) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project. |
| [**list_project_api_keys**](ProjectsApi.md#list_project_api_keys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project. |
| [**list_project_rate_limits**](ProjectsApi.md#list_project_rate_limits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project. |
| [**list_project_service_accounts**](ProjectsApi.md#list_project_service_accounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project. |
| [**list_project_users**](ProjectsApi.md#list_project_users) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project. |
| [**list_projects**](ProjectsApi.md#list_projects) | **GET** /organization/projects | Returns a list of projects. |
| [**modify_project**](ProjectsApi.md#modify_project) | **POST** /organization/projects/{project_id} | Modifies a project in the organization. |
| [**modify_project_user**](ProjectsApi.md#modify_project_user) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project. |
| [**retrieve_project**](ProjectsApi.md#retrieve_project) | **GET** /organization/projects/{project_id} | Retrieves a project. |
| [**retrieve_project_api_key**](ProjectsApi.md#retrieve_project_api_key) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project. |
| [**retrieve_project_service_account**](ProjectsApi.md#retrieve_project_service_account) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project. |
| [**retrieve_project_user**](ProjectsApi.md#retrieve_project_user) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project. |
| [**update_project_rate_limits**](ProjectsApi.md#update_project_rate_limits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit. |


## archive_project

> <Project> archive_project(project_id)

Archives a project in the organization. Archived projects cannot be used or updated.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.

begin
  # Archives a project in the organization. Archived projects cannot be used or updated.
  result = api_instance.archive_project(project_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->archive_project: #{e}"
end
```

#### Using the archive_project_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Project>, Integer, Hash)> archive_project_with_http_info(project_id)

```ruby
begin
  # Archives a project in the organization. Archived projects cannot be used or updated.
  data, status_code, headers = api_instance.archive_project_with_http_info(project_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Project>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->archive_project_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## create_project

> <Project> create_project(project_create_request)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_create_request = OpenApiOpenAIClient::ProjectCreateRequest.new({name: 'name_example'}) # ProjectCreateRequest | The project create request payload.

begin
  # Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
  result = api_instance.create_project(project_create_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->create_project: #{e}"
end
```

#### Using the create_project_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Project>, Integer, Hash)> create_project_with_http_info(project_create_request)

```ruby
begin
  # Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
  data, status_code, headers = api_instance.create_project_with_http_info(project_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Project>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->create_project_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_create_request** | [**ProjectCreateRequest**](ProjectCreateRequest.md) | The project create request payload. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_project_service_account

> <ProjectServiceAccountCreateResponse> create_project_service_account(project_id, project_service_account_create_request)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
project_service_account_create_request = OpenApiOpenAIClient::ProjectServiceAccountCreateRequest.new({name: 'name_example'}) # ProjectServiceAccountCreateRequest | The project service account create request payload.

begin
  # Creates a new service account in the project. This also returns an unredacted API key for the service account.
  result = api_instance.create_project_service_account(project_id, project_service_account_create_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->create_project_service_account: #{e}"
end
```

#### Using the create_project_service_account_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectServiceAccountCreateResponse>, Integer, Hash)> create_project_service_account_with_http_info(project_id, project_service_account_create_request)

```ruby
begin
  # Creates a new service account in the project. This also returns an unredacted API key for the service account.
  data, status_code, headers = api_instance.create_project_service_account_with_http_info(project_id, project_service_account_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectServiceAccountCreateResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->create_project_service_account_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **project_service_account_create_request** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md) | The project service account create request payload. |  |

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_project_user

> <ProjectUser> create_project_user(project_id, project_user_create_request)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
project_user_create_request = OpenApiOpenAIClient::ProjectUserCreateRequest.new({user_id: 'user_id_example', role: 'owner'}) # ProjectUserCreateRequest | The project user create request payload.

begin
  # Adds a user to the project. Users must already be members of the organization to be added to a project.
  result = api_instance.create_project_user(project_id, project_user_create_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->create_project_user: #{e}"
end
```

#### Using the create_project_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectUser>, Integer, Hash)> create_project_user_with_http_info(project_id, project_user_create_request)

```ruby
begin
  # Adds a user to the project. Users must already be members of the organization to be added to a project.
  data, status_code, headers = api_instance.create_project_user_with_http_info(project_id, project_user_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectUser>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->create_project_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **project_user_create_request** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md) | The project user create request payload. |  |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_project_api_key

> <ProjectApiKeyDeleteResponse> delete_project_api_key(project_id, key_id)

Deletes an API key from the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
key_id = 'key_id_example' # String | The ID of the API key.

begin
  # Deletes an API key from the project.
  result = api_instance.delete_project_api_key(project_id, key_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->delete_project_api_key: #{e}"
end
```

#### Using the delete_project_api_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectApiKeyDeleteResponse>, Integer, Hash)> delete_project_api_key_with_http_info(project_id, key_id)

```ruby
begin
  # Deletes an API key from the project.
  data, status_code, headers = api_instance.delete_project_api_key_with_http_info(project_id, key_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectApiKeyDeleteResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->delete_project_api_key_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **key_id** | **String** | The ID of the API key. |  |

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_project_service_account

> <ProjectServiceAccountDeleteResponse> delete_project_service_account(project_id, service_account_id)

Deletes a service account from the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
service_account_id = 'service_account_id_example' # String | The ID of the service account.

begin
  # Deletes a service account from the project.
  result = api_instance.delete_project_service_account(project_id, service_account_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->delete_project_service_account: #{e}"
end
```

#### Using the delete_project_service_account_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectServiceAccountDeleteResponse>, Integer, Hash)> delete_project_service_account_with_http_info(project_id, service_account_id)

```ruby
begin
  # Deletes a service account from the project.
  data, status_code, headers = api_instance.delete_project_service_account_with_http_info(project_id, service_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectServiceAccountDeleteResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->delete_project_service_account_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **service_account_id** | **String** | The ID of the service account. |  |

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_project_user

> <ProjectUserDeleteResponse> delete_project_user(project_id, user_id)

Deletes a user from the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
user_id = 'user_id_example' # String | The ID of the user.

begin
  # Deletes a user from the project.
  result = api_instance.delete_project_user(project_id, user_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->delete_project_user: #{e}"
end
```

#### Using the delete_project_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectUserDeleteResponse>, Integer, Hash)> delete_project_user_with_http_info(project_id, user_id)

```ruby
begin
  # Deletes a user from the project.
  data, status_code, headers = api_instance.delete_project_user_with_http_info(project_id, user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectUserDeleteResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->delete_project_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **user_id** | **String** | The ID of the user. |  |

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_project_api_keys

> <ProjectApiKeyListResponse> list_project_api_keys(project_id, opts)

Returns a list of API keys in the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
opts = {
  limit: 56, # Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  after: 'after_example' # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
}

begin
  # Returns a list of API keys in the project.
  result = api_instance.list_project_api_keys(project_id, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_api_keys: #{e}"
end
```

#### Using the list_project_api_keys_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectApiKeyListResponse>, Integer, Hash)> list_project_api_keys_with_http_info(project_id, opts)

```ruby
begin
  # Returns a list of API keys in the project.
  data, status_code, headers = api_instance.list_project_api_keys_with_http_info(project_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectApiKeyListResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_api_keys_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **limit** | **Integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional][default to 20] |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_project_rate_limits

> <ProjectRateLimitListResponse> list_project_rate_limits(project_id, opts)

Returns the rate limits per model for a project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
opts = {
  limit: 56, # Integer | A limit on the number of objects to be returned. The default is 100. 
  after: 'after_example', # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  before: 'before_example' # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
}

begin
  # Returns the rate limits per model for a project.
  result = api_instance.list_project_rate_limits(project_id, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_rate_limits: #{e}"
end
```

#### Using the list_project_rate_limits_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectRateLimitListResponse>, Integer, Hash)> list_project_rate_limits_with_http_info(project_id, opts)

```ruby
begin
  # Returns the rate limits per model for a project.
  data, status_code, headers = api_instance.list_project_rate_limits_with_http_info(project_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectRateLimitListResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_rate_limits_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **limit** | **Integer** | A limit on the number of objects to be returned. The default is 100.  | [optional][default to 100] |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_project_service_accounts

> <ProjectServiceAccountListResponse> list_project_service_accounts(project_id, opts)

Returns a list of service accounts in the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
opts = {
  limit: 56, # Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  after: 'after_example' # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
}

begin
  # Returns a list of service accounts in the project.
  result = api_instance.list_project_service_accounts(project_id, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_service_accounts: #{e}"
end
```

#### Using the list_project_service_accounts_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectServiceAccountListResponse>, Integer, Hash)> list_project_service_accounts_with_http_info(project_id, opts)

```ruby
begin
  # Returns a list of service accounts in the project.
  data, status_code, headers = api_instance.list_project_service_accounts_with_http_info(project_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectServiceAccountListResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_service_accounts_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **limit** | **Integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional][default to 20] |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_project_users

> <ProjectUserListResponse> list_project_users(project_id, opts)

Returns a list of users in the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
opts = {
  limit: 56, # Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  after: 'after_example' # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
}

begin
  # Returns a list of users in the project.
  result = api_instance.list_project_users(project_id, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_users: #{e}"
end
```

#### Using the list_project_users_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectUserListResponse>, Integer, Hash)> list_project_users_with_http_info(project_id, opts)

```ruby
begin
  # Returns a list of users in the project.
  data, status_code, headers = api_instance.list_project_users_with_http_info(project_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectUserListResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_project_users_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **limit** | **Integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional][default to 20] |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_projects

> <ProjectListResponse> list_projects(opts)

Returns a list of projects.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
opts = {
  limit: 56, # Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  after: 'after_example', # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  include_archived: true # Boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
}

begin
  # Returns a list of projects.
  result = api_instance.list_projects(opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_projects: #{e}"
end
```

#### Using the list_projects_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectListResponse>, Integer, Hash)> list_projects_with_http_info(opts)

```ruby
begin
  # Returns a list of projects.
  data, status_code, headers = api_instance.list_projects_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectListResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->list_projects_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional][default to 20] |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **include_archived** | **Boolean** | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional][default to false] |

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## modify_project

> <Project> modify_project(project_id, project_update_request)

Modifies a project in the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
project_update_request = OpenApiOpenAIClient::ProjectUpdateRequest.new({name: 'name_example'}) # ProjectUpdateRequest | The project update request payload.

begin
  # Modifies a project in the organization.
  result = api_instance.modify_project(project_id, project_update_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->modify_project: #{e}"
end
```

#### Using the modify_project_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Project>, Integer, Hash)> modify_project_with_http_info(project_id, project_update_request)

```ruby
begin
  # Modifies a project in the organization.
  data, status_code, headers = api_instance.modify_project_with_http_info(project_id, project_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Project>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->modify_project_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **project_update_request** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md) | The project update request payload. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## modify_project_user

> <ProjectUser> modify_project_user(project_id, user_id, project_user_update_request)

Modifies a user's role in the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
user_id = 'user_id_example' # String | The ID of the user.
project_user_update_request = OpenApiOpenAIClient::ProjectUserUpdateRequest.new({role: 'owner'}) # ProjectUserUpdateRequest | The project user update request payload.

begin
  # Modifies a user's role in the project.
  result = api_instance.modify_project_user(project_id, user_id, project_user_update_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->modify_project_user: #{e}"
end
```

#### Using the modify_project_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectUser>, Integer, Hash)> modify_project_user_with_http_info(project_id, user_id, project_user_update_request)

```ruby
begin
  # Modifies a user's role in the project.
  data, status_code, headers = api_instance.modify_project_user_with_http_info(project_id, user_id, project_user_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectUser>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->modify_project_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **user_id** | **String** | The ID of the user. |  |
| **project_user_update_request** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md) | The project user update request payload. |  |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## retrieve_project

> <Project> retrieve_project(project_id)

Retrieves a project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.

begin
  # Retrieves a project.
  result = api_instance.retrieve_project(project_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project: #{e}"
end
```

#### Using the retrieve_project_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Project>, Integer, Hash)> retrieve_project_with_http_info(project_id)

```ruby
begin
  # Retrieves a project.
  data, status_code, headers = api_instance.retrieve_project_with_http_info(project_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Project>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_project_api_key

> <ProjectApiKey> retrieve_project_api_key(project_id, key_id)

Retrieves an API key in the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
key_id = 'key_id_example' # String | The ID of the API key.

begin
  # Retrieves an API key in the project.
  result = api_instance.retrieve_project_api_key(project_id, key_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project_api_key: #{e}"
end
```

#### Using the retrieve_project_api_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectApiKey>, Integer, Hash)> retrieve_project_api_key_with_http_info(project_id, key_id)

```ruby
begin
  # Retrieves an API key in the project.
  data, status_code, headers = api_instance.retrieve_project_api_key_with_http_info(project_id, key_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectApiKey>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project_api_key_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **key_id** | **String** | The ID of the API key. |  |

### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_project_service_account

> <ProjectServiceAccount> retrieve_project_service_account(project_id, service_account_id)

Retrieves a service account in the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
service_account_id = 'service_account_id_example' # String | The ID of the service account.

begin
  # Retrieves a service account in the project.
  result = api_instance.retrieve_project_service_account(project_id, service_account_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project_service_account: #{e}"
end
```

#### Using the retrieve_project_service_account_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectServiceAccount>, Integer, Hash)> retrieve_project_service_account_with_http_info(project_id, service_account_id)

```ruby
begin
  # Retrieves a service account in the project.
  data, status_code, headers = api_instance.retrieve_project_service_account_with_http_info(project_id, service_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectServiceAccount>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project_service_account_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **service_account_id** | **String** | The ID of the service account. |  |

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_project_user

> <ProjectUser> retrieve_project_user(project_id, user_id)

Retrieves a user in the project.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
user_id = 'user_id_example' # String | The ID of the user.

begin
  # Retrieves a user in the project.
  result = api_instance.retrieve_project_user(project_id, user_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project_user: #{e}"
end
```

#### Using the retrieve_project_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectUser>, Integer, Hash)> retrieve_project_user_with_http_info(project_id, user_id)

```ruby
begin
  # Retrieves a user in the project.
  data, status_code, headers = api_instance.retrieve_project_user_with_http_info(project_id, user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectUser>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->retrieve_project_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **user_id** | **String** | The ID of the user. |  |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_project_rate_limits

> <ProjectRateLimit> update_project_rate_limits(project_id, rate_limit_id, project_rate_limit_update_request)

Updates a project rate limit.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ProjectsApi.new
project_id = 'project_id_example' # String | The ID of the project.
rate_limit_id = 'rate_limit_id_example' # String | The ID of the rate limit.
project_rate_limit_update_request = OpenApiOpenAIClient::ProjectRateLimitUpdateRequest.new # ProjectRateLimitUpdateRequest | The project rate limit update request payload.

begin
  # Updates a project rate limit.
  result = api_instance.update_project_rate_limits(project_id, rate_limit_id, project_rate_limit_update_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->update_project_rate_limits: #{e}"
end
```

#### Using the update_project_rate_limits_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProjectRateLimit>, Integer, Hash)> update_project_rate_limits_with_http_info(project_id, rate_limit_id, project_rate_limit_update_request)

```ruby
begin
  # Updates a project rate limit.
  data, status_code, headers = api_instance.update_project_rate_limits_with_http_info(project_id, rate_limit_id, project_rate_limit_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProjectRateLimit>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ProjectsApi->update_project_rate_limits_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | The ID of the project. |  |
| **rate_limit_id** | **String** | The ID of the rate limit. |  |
| **project_rate_limit_update_request** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md) | The project rate limit update request payload. |  |

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

