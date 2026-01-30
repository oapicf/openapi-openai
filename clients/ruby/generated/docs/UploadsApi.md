# OpenApiOpenAIClient::UploadsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**add_upload_part**](UploadsApi.md#add_upload_part) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).  |
| [**cancel_upload**](UploadsApi.md#cancel_upload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.  |
| [**complete_upload**](UploadsApi.md#complete_upload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.  |
| [**create_upload**](UploadsApi.md#create_upload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).  |


## add_upload_part

> <UploadPart> add_upload_part(upload_id, data)

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UploadsApi.new
upload_id = 'upload_abc123' # String | The ID of the Upload. 
data = File.new('/path/to/some/file') # File | The chunk of bytes for this Part. 

begin
  # Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
  result = api_instance.add_upload_part(upload_id, data)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->add_upload_part: #{e}"
end
```

#### Using the add_upload_part_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UploadPart>, Integer, Hash)> add_upload_part_with_http_info(upload_id, data)

```ruby
begin
  # Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
  data, status_code, headers = api_instance.add_upload_part_with_http_info(upload_id, data)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UploadPart>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->add_upload_part_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **upload_id** | **String** | The ID of the Upload.  |  |
| **data** | **File** | The chunk of bytes for this Part.  |  |

### Return type

[**UploadPart**](UploadPart.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## cancel_upload

> <Upload> cancel_upload(upload_id)

Cancels the Upload. No Parts may be added after an Upload is cancelled. 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UploadsApi.new
upload_id = 'upload_abc123' # String | The ID of the Upload. 

begin
  # Cancels the Upload. No Parts may be added after an Upload is cancelled. 
  result = api_instance.cancel_upload(upload_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->cancel_upload: #{e}"
end
```

#### Using the cancel_upload_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Upload>, Integer, Hash)> cancel_upload_with_http_info(upload_id)

```ruby
begin
  # Cancels the Upload. No Parts may be added after an Upload is cancelled. 
  data, status_code, headers = api_instance.cancel_upload_with_http_info(upload_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Upload>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->cancel_upload_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **upload_id** | **String** | The ID of the Upload.  |  |

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## complete_upload

> <Upload> complete_upload(upload_id, complete_upload_request)

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UploadsApi.new
upload_id = 'upload_abc123' # String | The ID of the Upload. 
complete_upload_request = OpenApiOpenAIClient::CompleteUploadRequest.new({part_ids: ['part_ids_example']}) # CompleteUploadRequest | 

begin
  # Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
  result = api_instance.complete_upload(upload_id, complete_upload_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->complete_upload: #{e}"
end
```

#### Using the complete_upload_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Upload>, Integer, Hash)> complete_upload_with_http_info(upload_id, complete_upload_request)

```ruby
begin
  # Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
  data, status_code, headers = api_instance.complete_upload_with_http_info(upload_id, complete_upload_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Upload>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->complete_upload_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **upload_id** | **String** | The ID of the Upload.  |  |
| **complete_upload_request** | [**CompleteUploadRequest**](CompleteUploadRequest.md) |  |  |

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_upload

> <Upload> create_upload(create_upload_request)

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UploadsApi.new
create_upload_request = OpenApiOpenAIClient::CreateUploadRequest.new({filename: 'filename_example', purpose: 'assistants', bytes: 37, mime_type: 'mime_type_example'}) # CreateUploadRequest | 

begin
  # Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
  result = api_instance.create_upload(create_upload_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->create_upload: #{e}"
end
```

#### Using the create_upload_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Upload>, Integer, Hash)> create_upload_with_http_info(create_upload_request)

```ruby
begin
  # Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
  data, status_code, headers = api_instance.create_upload_with_http_info(create_upload_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Upload>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UploadsApi->create_upload_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_upload_request** | [**CreateUploadRequest**](CreateUploadRequest.md) |  |  |

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

