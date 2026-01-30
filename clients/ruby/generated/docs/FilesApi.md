# OpenApiOpenAIClient::FilesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_file**](FilesApi.md#create_file) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.  |
| [**delete_file**](FilesApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file. |
| [**download_file**](FilesApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file. |
| [**list_files**](FilesApi.md#list_files) | **GET** /files | Returns a list of files. |
| [**retrieve_file**](FilesApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file. |


## create_file

> <OpenAIFile> create_file(file, purpose)

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FilesApi.new
file = File.new('/path/to/some/file') # File | The File object (not file name) to be uploaded. 
purpose = 'assistants' # String | The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 

begin
  # Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
  result = api_instance.create_file(file, purpose)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->create_file: #{e}"
end
```

#### Using the create_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OpenAIFile>, Integer, Hash)> create_file_with_http_info(file, purpose)

```ruby
begin
  # Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
  data, status_code, headers = api_instance.create_file_with_http_info(file, purpose)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OpenAIFile>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->create_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file** | **File** | The File object (not file name) to be uploaded.  |  |
| **purpose** | **String** | The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  |  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## delete_file

> <DeleteFileResponse> delete_file(file_id)

Delete a file.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FilesApi.new
file_id = 'file_id_example' # String | The ID of the file to use for this request.

begin
  # Delete a file.
  result = api_instance.delete_file(file_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->delete_file: #{e}"
end
```

#### Using the delete_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteFileResponse>, Integer, Hash)> delete_file_with_http_info(file_id)

```ruby
begin
  # Delete a file.
  data, status_code, headers = api_instance.delete_file_with_http_info(file_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteFileResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->delete_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file to use for this request. |  |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## download_file

> String download_file(file_id)

Returns the contents of the specified file.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FilesApi.new
file_id = 'file_id_example' # String | The ID of the file to use for this request.

begin
  # Returns the contents of the specified file.
  result = api_instance.download_file(file_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->download_file: #{e}"
end
```

#### Using the download_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> download_file_with_http_info(file_id)

```ruby
begin
  # Returns the contents of the specified file.
  data, status_code, headers = api_instance.download_file_with_http_info(file_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->download_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file to use for this request. |  |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_files

> <ListFilesResponse> list_files(opts)

Returns a list of files.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FilesApi.new
opts = {
  purpose: 'purpose_example', # String | Only return files with the given purpose.
  limit: 56, # Integer | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
  order: 'asc', # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  after: 'after_example' # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
}

begin
  # Returns a list of files.
  result = api_instance.list_files(opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->list_files: #{e}"
end
```

#### Using the list_files_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListFilesResponse>, Integer, Hash)> list_files_with_http_info(opts)

```ruby
begin
  # Returns a list of files.
  data, status_code, headers = api_instance.list_files_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListFilesResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->list_files_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **purpose** | **String** | Only return files with the given purpose. | [optional] |
| **limit** | **Integer** | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional][default to 10000] |
| **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional][default to &#39;desc&#39;] |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_file

> <OpenAIFile> retrieve_file(file_id)

Returns information about a specific file.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FilesApi.new
file_id = 'file_id_example' # String | The ID of the file to use for this request.

begin
  # Returns information about a specific file.
  result = api_instance.retrieve_file(file_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->retrieve_file: #{e}"
end
```

#### Using the retrieve_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OpenAIFile>, Integer, Hash)> retrieve_file_with_http_info(file_id)

```ruby
begin
  # Returns information about a specific file.
  data, status_code, headers = api_instance.retrieve_file_with_http_info(file_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OpenAIFile>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FilesApi->retrieve_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file to use for this request. |  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

