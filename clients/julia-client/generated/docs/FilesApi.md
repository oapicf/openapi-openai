# FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_file**](FilesApi.md#create_file) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**delete_file**](FilesApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file.
[**download_file**](FilesApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**list_files**](FilesApi.md#list_files) | **GET** /files | Returns a list of files.
[**retrieve_file**](FilesApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file.


# **create_file**
> `create_file`(_api::`FilesApi`, `file`::`String`, `purpose`::`String`; _mediaType=nothing) -> `OpenAIFile`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_file`(_api::`FilesApi`, response_stream::`Channel`, `file`::`String`, `purpose`::`String`; _mediaType=nothing) -> `Channel`{ `OpenAIFile` }, `OpenAPI.Clients.ApiResponse`

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FilesApi`** | API context | 
**`file`** | **`String`** | The File object (not file name) to be uploaded.  |
**`purpose`** | **`String`** | The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  |

### Return type

[**`OpenAIFile`**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_file**
> `delete_file`(_api::`FilesApi`, `file_id`::`String`; _mediaType=nothing) -> `DeleteFileResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_file`(_api::`FilesApi`, response_stream::`Channel`, `file_id`::`String`; _mediaType=nothing) -> `Channel`{ `DeleteFileResponse` }, `OpenAPI.Clients.ApiResponse`

Delete a file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FilesApi`** | API context | 
**`file_id`** | **`String`** | The ID of the file to use for this request. |

### Return type

[**`DeleteFileResponse`**](DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **download_file**
> `download_file`(_api::`FilesApi`, `file_id`::`String`; _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `download_file`(_api::`FilesApi`, response_stream::`Channel`, `file_id`::`String`; _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`

Returns the contents of the specified file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FilesApi`** | API context | 
**`file_id`** | **`String`** | The ID of the file to use for this request. |

### Return type

**`String`**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_files**
> `list_files`(_api::`FilesApi`; `purpose`=nothing, `limit`=nothing, `order`=nothing, `after`=nothing, _mediaType=nothing) -> `ListFilesResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_files`(_api::`FilesApi`, response_stream::`Channel`; `purpose`=nothing, `limit`=nothing, `order`=nothing, `after`=nothing, _mediaType=nothing) -> `Channel`{ `ListFilesResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of files.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FilesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`purpose`** | **`String`** | Only return files with the given purpose. | [default to nothing]
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [default to 10000]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]

### Return type

[**`ListFilesResponse`**](ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_file**
> `retrieve_file`(_api::`FilesApi`, `file_id`::`String`; _mediaType=nothing) -> `OpenAIFile`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_file`(_api::`FilesApi`, response_stream::`Channel`, `file_id`::`String`; _mediaType=nothing) -> `Channel`{ `OpenAIFile` }, `OpenAPI.Clients.ApiResponse`

Returns information about a specific file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FilesApi`** | API context | 
**`file_id`** | **`String`** | The ID of the file to use for this request. |

### Return type

[**`OpenAIFile`**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

