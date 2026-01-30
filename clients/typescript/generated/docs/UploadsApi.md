# .UploadsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUploadPart**](UploadsApi.md#addUploadPart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
[**cancelUpload**](UploadsApi.md#cancelUpload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
[**completeUpload**](UploadsApi.md#completeUpload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
[**createUpload**](UploadsApi.md#createUpload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 


# **addUploadPart**
> UploadPart addUploadPart()


### Example


```typescript
import { createConfiguration, UploadsApi } from '';
import type { UploadsApiAddUploadPartRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UploadsApi(configuration);

const request: UploadsApiAddUploadPartRequest = {
    // The ID of the Upload. 
  uploadId: "upload_abc123",
    // The chunk of bytes for this Part. 
  data: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

const data = await apiInstance.addUploadPart(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | [**string**] | The ID of the Upload.  | defaults to undefined
 **data** | [**HttpFile**] | The chunk of bytes for this Part.  | defaults to undefined


### Return type

**UploadPart**

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

# **cancelUpload**
> Upload cancelUpload()


### Example


```typescript
import { createConfiguration, UploadsApi } from '';
import type { UploadsApiCancelUploadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UploadsApi(configuration);

const request: UploadsApiCancelUploadRequest = {
    // The ID of the Upload. 
  uploadId: "upload_abc123",
};

const data = await apiInstance.cancelUpload(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | [**string**] | The ID of the Upload.  | defaults to undefined


### Return type

**Upload**

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

# **completeUpload**
> Upload completeUpload(completeUploadRequest)


### Example


```typescript
import { createConfiguration, UploadsApi } from '';
import type { UploadsApiCompleteUploadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UploadsApi(configuration);

const request: UploadsApiCompleteUploadRequest = {
    // The ID of the Upload. 
  uploadId: "upload_abc123",
  
  completeUploadRequest: {
    partIds: [
      "partIds_example",
    ],
    md5: "md5_example",
  },
};

const data = await apiInstance.completeUpload(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **completeUploadRequest** | **CompleteUploadRequest**|  |
 **uploadId** | [**string**] | The ID of the Upload.  | defaults to undefined


### Return type

**Upload**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createUpload**
> Upload createUpload(createUploadRequest)


### Example


```typescript
import { createConfiguration, UploadsApi } from '';
import type { UploadsApiCreateUploadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UploadsApi(configuration);

const request: UploadsApiCreateUploadRequest = {
  
  createUploadRequest: {
    filename: "filename_example",
    purpose: "assistants",
    bytes: 1,
    mimeType: "mimeType_example",
  },
};

const data = await apiInstance.createUpload(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUploadRequest** | **CreateUploadRequest**|  |


### Return type

**Upload**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


