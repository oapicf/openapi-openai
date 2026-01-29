# FilesAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FilesAPI_createFile**](FilesAPI.md#FilesAPI_createFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**FilesAPI_deleteFile**](FilesAPI.md#FilesAPI_deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**FilesAPI_downloadFile**](FilesAPI.md#FilesAPI_downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**FilesAPI_listFiles**](FilesAPI.md#FilesAPI_listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**FilesAPI_retrieveFile**](FilesAPI.md#FilesAPI_retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


# **FilesAPI_createFile**
```c
// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
//
open_ai_file_t* FilesAPI_createFile(apiClient_t *apiClient, binary_t* file, openai_api_createFile_purpose_e purpose);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file** | **binary_t*** | The File object (not file name) to be uploaded.  | 
**purpose** | **openai_api_createFile_purpose_e** | The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  | 

### Return type

[open_ai_file_t](open_ai_file.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesAPI_deleteFile**
```c
// Delete a file.
//
delete_file_response_t* FilesAPI_deleteFile(apiClient_t *apiClient, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file_id** | **char \*** | The ID of the file to use for this request. | 

### Return type

[delete_file_response_t](delete_file_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesAPI_downloadFile**
```c
// Returns the contents of the specified file.
//
char* FilesAPI_downloadFile(apiClient_t *apiClient, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file_id** | **char \*** | The ID of the file to use for this request. | 

### Return type

char*



### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesAPI_listFiles**
```c
// Returns a list of files that belong to the user's organization.
//
list_files_response_t* FilesAPI_listFiles(apiClient_t *apiClient, char *purpose);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**purpose** | **char \*** | Only return files with the given purpose. | [optional] 

### Return type

[list_files_response_t](list_files_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesAPI_retrieveFile**
```c
// Returns information about a specific file.
//
open_ai_file_t* FilesAPI_retrieveFile(apiClient_t *apiClient, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file_id** | **char \*** | The ID of the file to use for this request. | 

### Return type

[open_ai_file_t](open_ai_file.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

