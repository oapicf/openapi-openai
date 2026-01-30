# OpenApiOpenAIClient::DefaultApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_api_keys_create**](DefaultApi.md#admin_api_keys_create) | **POST** /organization/admin_api_keys | Create an organization admin API key |
| [**admin_api_keys_delete**](DefaultApi.md#admin_api_keys_delete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
| [**admin_api_keys_get**](DefaultApi.md#admin_api_keys_get) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
| [**admin_api_keys_list**](DefaultApi.md#admin_api_keys_list) | **GET** /organization/admin_api_keys | List organization API keys |


## admin_api_keys_create

> <AdminApiKey> admin_api_keys_create(admin_api_keys_create_request)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::DefaultApi.new
admin_api_keys_create_request = OpenApiOpenAIClient::AdminApiKeysCreateRequest.new({name: 'New Admin Key'}) # AdminApiKeysCreateRequest | 

begin
  # Create an organization admin API key
  result = api_instance.admin_api_keys_create(admin_api_keys_create_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_create: #{e}"
end
```

#### Using the admin_api_keys_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminApiKey>, Integer, Hash)> admin_api_keys_create_with_http_info(admin_api_keys_create_request)

```ruby
begin
  # Create an organization admin API key
  data, status_code, headers = api_instance.admin_api_keys_create_with_http_info(admin_api_keys_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminApiKey>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **admin_api_keys_create_request** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md) |  |  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## admin_api_keys_delete

> <AdminApiKeysDelete200Response> admin_api_keys_delete(key_id)

Delete an organization admin API key

Delete the specified admin API key.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::DefaultApi.new
key_id = 'key_id_example' # String | 

begin
  # Delete an organization admin API key
  result = api_instance.admin_api_keys_delete(key_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_delete: #{e}"
end
```

#### Using the admin_api_keys_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminApiKeysDelete200Response>, Integer, Hash)> admin_api_keys_delete_with_http_info(key_id)

```ruby
begin
  # Delete an organization admin API key
  data, status_code, headers = api_instance.admin_api_keys_delete_with_http_info(key_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminApiKeysDelete200Response>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key_id** | **String** |  |  |

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_api_keys_get

> <AdminApiKey> admin_api_keys_get(key_id)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::DefaultApi.new
key_id = 'key_id_example' # String | 

begin
  # Retrieve a single organization API key
  result = api_instance.admin_api_keys_get(key_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_get: #{e}"
end
```

#### Using the admin_api_keys_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminApiKey>, Integer, Hash)> admin_api_keys_get_with_http_info(key_id)

```ruby
begin
  # Retrieve a single organization API key
  data, status_code, headers = api_instance.admin_api_keys_get_with_http_info(key_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminApiKey>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key_id** | **String** |  |  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_api_keys_list

> <ApiKeyList> admin_api_keys_list(opts)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::DefaultApi.new
opts = {
  after: 'after_example', # String | 
  order: 'asc', # String | 
  limit: 56 # Integer | 
}

begin
  # List organization API keys
  result = api_instance.admin_api_keys_list(opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_list: #{e}"
end
```

#### Using the admin_api_keys_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApiKeyList>, Integer, Hash)> admin_api_keys_list_with_http_info(opts)

```ruby
begin
  # List organization API keys
  data, status_code, headers = api_instance.admin_api_keys_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApiKeyList>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling DefaultApi->admin_api_keys_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **after** | **String** |  | [optional] |
| **order** | **String** |  | [optional][default to &#39;asc&#39;] |
| **limit** | **Integer** |  | [optional][default to 20] |

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

