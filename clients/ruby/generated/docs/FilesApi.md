# OpenApiOpenAIClient::FilesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_file**](FilesApi.md#create_file) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.  |
| [**delete_file**](FilesApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file. |
| [**download_file**](FilesApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file. |
| [**list_files**](FilesApi.md#list_files) | **GET** /files | Returns a list of files that belong to the user&#39;s organization. |
| [**retrieve_file**](FilesApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file. |


## create_file

> <OpenAIFile> create_file(file, purpose)

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

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
purpose = 'fine-tune' # String | The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 

begin
  # Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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
  # Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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
| **purpose** | **String** | The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  |  |

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

Returns a list of files that belong to the user's organization.

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
  purpose: 'purpose_example' # String | Only return files with the given purpose.
}

begin
  # Returns a list of files that belong to the user's organization.
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
  # Returns a list of files that belong to the user's organization.
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

