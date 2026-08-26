# FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **Post** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](FilesApi.md#deleteFile) | **Delete** /files/{file_id} | Delete a file.
[**downloadFile**](FilesApi.md#downloadFile) | **Get** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](FilesApi.md#listFiles) | **Get** /files | Returns a list of files.
[**retrieveFile**](FilesApi.md#retrieveFile) | **Get** /files/{file_id} | Returns information about a specific file.


<a name="createFile"></a>
# **createFile**
> OpenAIFile createFile(file, purpose)

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = FilesApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The File object (not file name) to be uploaded. 
val purpose : kotlin.String = purpose_example // kotlin.String | The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 
try {
    val result : OpenAIFile = apiInstance.createFile(file, purpose)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#createFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#createFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The File object (not file name) to be uploaded.  |
 **purpose** | **kotlin.String**| The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | [enum: assistants, batch, fine-tune, vision]

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: FORM_DATA
 - **Accept**: APPLICATION_JSON

<a name="deleteFile"></a>
# **deleteFile**
> DeleteFileResponse deleteFile(fileId)

Delete a file.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request.
try {
    val result : DeleteFileResponse = apiInstance.deleteFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#deleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#deleteFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request. |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="downloadFile"></a>
# **downloadFile**
> kotlin.String downloadFile(fileId)

Returns the contents of the specified file.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request.
try {
    val result : kotlin.String = apiInstance.downloadFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#downloadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#downloadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request. |

### Return type

**kotlin.String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="listFiles"></a>
# **listFiles**
> ListFilesResponse listFiles(purpose, limit, order, after)

Returns a list of files.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = FilesApi()
val purpose : kotlin.String = purpose_example // kotlin.String | Only return files with the given purpose.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    val result : ListFilesResponse = apiInstance.listFiles(purpose, limit, order, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#listFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#listFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | **kotlin.String**| Only return files with the given purpose. | [optional]
 **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional] [default to 10000]
 **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="retrieveFile"></a>
# **retrieveFile**
> OpenAIFile retrieveFile(fileId)

Returns information about a specific file.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request.
try {
    val result : OpenAIFile = apiInstance.retrieveFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#retrieveFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#retrieveFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request. |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

