# UploadsController

All URIs are relative to `"/v1"`

The controller class is defined in **[UploadsController.java](../../src/main/java/org/openapitools/controller/UploadsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUploadPart**](#addUploadPart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
[**cancelUpload**](#cancelUpload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
[**completeUpload**](#completeUpload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
[**createUpload**](#createUpload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

<a id="addUploadPart"></a>
# **addUploadPart**
```java
Mono<UploadPart> UploadsController.addUploadPart(uploadIddata)
```

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**uploadId** | `String` | The ID of the Upload.  |
**data** | `CompletedFileUpload` | The chunk of bytes for this Part.  |

### Return type
[**UploadPart**](../../docs/models/UploadPart.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

<a id="cancelUpload"></a>
# **cancelUpload**
```java
Mono<Upload> UploadsController.cancelUpload(uploadId)
```

Cancels the Upload. No Parts may be added after an Upload is cancelled. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**uploadId** | `String` | The ID of the Upload.  |

### Return type
[**Upload**](../../docs/models/Upload.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="completeUpload"></a>
# **completeUpload**
```java
Mono<Upload> UploadsController.completeUpload(uploadIdcompleteUploadRequest)
```

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**uploadId** | `String` | The ID of the Upload.  |
**completeUploadRequest** | [**CompleteUploadRequest**](../../docs/models/CompleteUploadRequest.md) |  |

### Return type
[**Upload**](../../docs/models/Upload.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createUpload"></a>
# **createUpload**
```java
Mono<Upload> UploadsController.createUpload(createUploadRequest)
```

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createUploadRequest** | [**CreateUploadRequest**](../../docs/models/CreateUploadRequest.md) |  |

### Return type
[**Upload**](../../docs/models/Upload.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

