# .FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](FilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](FilesApi.md#listFiles) | **GET** /files | Returns a list of files.
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
    // The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 
  purpose: "assistants",
};

const data = await apiInstance.createFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**HttpFile**] | The File object (not file name) to be uploaded.  | defaults to undefined
 **purpose** | [**string**]**Array<&#39;assistants&#39; &#124; &#39;batch&#39; &#124; &#39;fine-tune&#39; &#124; &#39;vision&#39;>** | The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | defaults to undefined


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
    // A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (optional)
  limit: 10000,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
};

const data = await apiInstance.listFiles(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | [**string**] | Only return files with the given purpose. | (optional) defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | (optional) defaults to 10000
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined


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


