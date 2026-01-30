# UploadsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addUploadPart**](UploadsApi.md#addUploadPart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).  |
| [**cancelUpload**](UploadsApi.md#cancelUpload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.  |
| [**completeUpload**](UploadsApi.md#completeUpload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.  |
| [**createUpload**](UploadsApi.md#createUpload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).  |


<a id="addUploadPart"></a>
# **addUploadPart**
> UploadPart addUploadPart(uploadId, `data`)

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UploadsApi()
val uploadId : kotlin.String = upload_abc123 // kotlin.String | The ID of the Upload. 
val `data` : java.io.File = BINARY_DATA_HERE // java.io.File | The chunk of bytes for this Part. 
try {
    val result : UploadPart = apiInstance.addUploadPart(uploadId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#addUploadPart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#addUploadPart")
    e.printStackTrace()
}
```

### Parameters
| **uploadId** | **kotlin.String**| The ID of the Upload.  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **&#x60;data&#x60;** | **java.io.File**| The chunk of bytes for this Part.  | |

### Return type

[**UploadPart**](UploadPart.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="cancelUpload"></a>
# **cancelUpload**
> Upload cancelUpload(uploadId)

Cancels the Upload. No Parts may be added after an Upload is cancelled. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UploadsApi()
val uploadId : kotlin.String = upload_abc123 // kotlin.String | The ID of the Upload. 
try {
    val result : Upload = apiInstance.cancelUpload(uploadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#cancelUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#cancelUpload")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadId** | **kotlin.String**| The ID of the Upload.  | |

### Return type

[**Upload**](Upload.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="completeUpload"></a>
# **completeUpload**
> Upload completeUpload(uploadId, completeUploadRequest)

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UploadsApi()
val uploadId : kotlin.String = upload_abc123 // kotlin.String | The ID of the Upload. 
val completeUploadRequest : CompleteUploadRequest =  // CompleteUploadRequest | 
try {
    val result : Upload = apiInstance.completeUpload(uploadId, completeUploadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#completeUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#completeUpload")
    e.printStackTrace()
}
```

### Parameters
| **uploadId** | **kotlin.String**| The ID of the Upload.  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **completeUploadRequest** | [**CompleteUploadRequest**](CompleteUploadRequest.md)|  | |

### Return type

[**Upload**](Upload.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createUpload"></a>
# **createUpload**
> Upload createUpload(createUploadRequest)

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UploadsApi()
val createUploadRequest : CreateUploadRequest =  // CreateUploadRequest | 
try {
    val result : Upload = apiInstance.createUpload(createUploadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#createUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#createUpload")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createUploadRequest** | [**CreateUploadRequest**](CreateUploadRequest.md)|  | |

### Return type

[**Upload**](Upload.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

