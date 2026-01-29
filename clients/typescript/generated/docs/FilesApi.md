# .FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](FilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](FilesApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user\&#39;s organization.
[**retrieveFile**](FilesApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


# **createFile**
> OpenAIFile createFile()


### Example


```typescript
import { createConfiguration, FilesApi } from '';
import type { FilesApiCreateFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FilesApi(configuration);

const request: FilesApiCreateFileRequest = {
    // The File object (not file name) to be uploaded. 
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
    // The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
  purpose: "fine-tune",
};

const data = await apiInstance.createFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**HttpFile**] | The File object (not file name) to be uploaded.  | defaults to undefined
 **purpose** | [**string**]**Array<&#39;fine-tune&#39; &#124; &#39;assistants&#39;>** | The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  | defaults to undefined


### Return type

**OpenAIFile**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteFile**
> DeleteFileResponse deleteFile()


### Example


```typescript
import { createConfiguration, FilesApi } from '';
import type { FilesApiDeleteFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FilesApi(configuration);

const request: FilesApiDeleteFileRequest = {
    // The ID of the file to use for this request.
  fileId: "file_id_example",
};

const data = await apiInstance.deleteFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**string**] | The ID of the file to use for this request. | defaults to undefined


### Return type

**DeleteFileResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **downloadFile**
> string downloadFile()


### Example


```typescript
import { createConfiguration, FilesApi } from '';
import type { FilesApiDownloadFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FilesApi(configuration);

const request: FilesApiDownloadFileRequest = {
    // The ID of the file to use for this request.
  fileId: "file_id_example",
};

const data = await apiInstance.downloadFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**string**] | The ID of the file to use for this request. | defaults to undefined


### Return type

**string**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listFiles**
> ListFilesResponse listFiles()


### Example


```typescript
import { createConfiguration, FilesApi } from '';
import type { FilesApiListFilesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FilesApi(configuration);

const request: FilesApiListFilesRequest = {
    // Only return files with the given purpose. (optional)
  purpose: "purpose_example",
};

const data = await apiInstance.listFiles(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | [**string**] | Only return files with the given purpose. | (optional) defaults to undefined


### Return type

**ListFilesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveFile**
> OpenAIFile retrieveFile()


### Example


```typescript
import { createConfiguration, FilesApi } from '';
import type { FilesApiRetrieveFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FilesApi(configuration);

const request: FilesApiRetrieveFileRequest = {
    // The ID of the file to use for this request.
  fileId: "file_id_example",
};

const data = await apiInstance.retrieveFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**string**] | The ID of the file to use for this request. | defaults to undefined


### Return type

**OpenAIFile**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


