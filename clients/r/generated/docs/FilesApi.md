# FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateFile**](FilesApi.md#CreateFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**DeleteFile**](FilesApi.md#DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**DownloadFile**](FilesApi.md#DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**ListFiles**](FilesApi.md#ListFiles) | **GET** /files | Returns a list of files.
[**RetrieveFile**](FilesApi.md#RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


# **CreateFile**
> OpenAIFile CreateFile(file, purpose)

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```R
library(openapi)

# Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
#
# prepare function argument(s)
var_file <- File.new('/path/to/file') # data.frame | The File object (not file name) to be uploaded. 
var_purpose <- "purpose_example" # character | The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 

api_instance <- FilesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateFile(var_file, var_purposedata_file = "result.txt")
result <- api_instance$CreateFile(var_file, var_purpose)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **data.frame**| The File object (not file name) to be uploaded.  | 
 **purpose** | Enum [assistants, batch, fine-tune, vision] | The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DeleteFile**
> DeleteFileResponse DeleteFile(file_id)

Delete a file.

### Example
```R
library(openapi)

# Delete a file.
#
# prepare function argument(s)
var_file_id <- "file_id_example" # character | The ID of the file to use for this request.

api_instance <- FilesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteFile(var_file_iddata_file = "result.txt")
result <- api_instance$DeleteFile(var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **character**| The ID of the file to use for this request. | 

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DownloadFile**
> character DownloadFile(file_id)

Returns the contents of the specified file.

### Example
```R
library(openapi)

# Returns the contents of the specified file.
#
# prepare function argument(s)
var_file_id <- "file_id_example" # character | The ID of the file to use for this request.

api_instance <- FilesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DownloadFile(var_file_iddata_file = "result.txt")
result <- api_instance$DownloadFile(var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **character**| The ID of the file to use for this request. | 

### Return type

**character**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListFiles**
> ListFilesResponse ListFiles(purpose = var.purpose, limit = 10000, order = "desc", after = var.after)

Returns a list of files.

### Example
```R
library(openapi)

# Returns a list of files.
#
# prepare function argument(s)
var_purpose <- "purpose_example" # character | Only return files with the given purpose. (Optional)
var_limit <- 10000 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)

api_instance <- FilesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFiles(purpose = var_purpose, limit = var_limit, order = var_order, after = var_afterdata_file = "result.txt")
result <- api_instance$ListFiles(purpose = var_purpose, limit = var_limit, order = var_order, after = var_after)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | **character**| Only return files with the given purpose. | [optional] 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional] [default to 10000]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **RetrieveFile**
> OpenAIFile RetrieveFile(file_id)

Returns information about a specific file.

### Example
```R
library(openapi)

# Returns information about a specific file.
#
# prepare function argument(s)
var_file_id <- "file_id_example" # character | The ID of the file to use for this request.

api_instance <- FilesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveFile(var_file_iddata_file = "result.txt")
result <- api_instance$RetrieveFile(var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **character**| The ID of the file to use for this request. | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

