# FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateFile**](FilesApi.md#CreateFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**DeleteFile**](FilesApi.md#DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**DownloadFile**](FilesApi.md#DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**ListFiles**](FilesApi.md#ListFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**RetrieveFile**](FilesApi.md#RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


# **CreateFile**
> OpenAIFile CreateFile(file, purpose)

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```R
library(openapi)

# Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
#
# prepare function argument(s)
var_file <- File.new('/path/to/file') # data.frame | The File object (not file name) to be uploaded. 
var_purpose <- "purpose_example" # character | The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 

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
 **purpose** | Enum [fine-tune, assistants] | The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  | 

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
> ListFilesResponse ListFiles(purpose = var.purpose)

Returns a list of files that belong to the user's organization.

### Example
```R
library(openapi)

# Returns a list of files that belong to the user's organization.
#
# prepare function argument(s)
var_purpose <- "purpose_example" # character | Only return files with the given purpose. (Optional)

api_instance <- FilesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFiles(purpose = var_purposedata_file = "result.txt")
result <- api_instance$ListFiles(purpose = var_purpose)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | **character**| Only return files with the given purpose. | [optional] 

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

