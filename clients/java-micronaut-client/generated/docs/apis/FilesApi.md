# FilesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFile**](FilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.  |
| [**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file. |
| [**downloadFile**](FilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file. |
| [**listFiles**](FilesApi.md#listFiles) | **GET** /files | Returns a list of files. |
| [**retrieveFile**](FilesApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file. |


## Creating FilesApi

To initiate an instance of `FilesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.FilesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(FilesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    FilesApi filesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="createFile"></a>
# **createFile**
```java
Mono<OpenAIFile> FilesApi.createFile(_filepurpose)
```

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | `File`| The File object (not file name) to be uploaded.  | |
| **purpose** | `String`| The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | [enum: `assistants`, `batch`, `fine-tune`, `vision`] |


### Return type
[**OpenAIFile**](OpenAIFile.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="deleteFile"></a>
# **deleteFile**
```java
Mono<DeleteFileResponse> FilesApi.deleteFile(fileId)
```

Delete a file.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | `String`| The ID of the file to use for this request. | |


### Return type
[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="downloadFile"></a>
# **downloadFile**
```java
Mono<String> FilesApi.downloadFile(fileId)
```

Returns the contents of the specified file.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | `String`| The ID of the file to use for this request. | |


### Return type
`String`

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listFiles"></a>
# **listFiles**
```java
Mono<ListFilesResponse> FilesApi.listFiles(purposelimitorderafter)
```

Returns a list of files.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **purpose** | `String`| Only return files with the given purpose. | [optional parameter] |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional parameter] [default to `10000`] |
| **order** | `String`| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |


### Return type
[**ListFilesResponse**](ListFilesResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveFile"></a>
# **retrieveFile**
```java
Mono<OpenAIFile> FilesApi.retrieveFile(fileId)
```

Returns information about a specific file.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | `String`| The ID of the file to use for this request. | |


### Return type
[**OpenAIFile**](OpenAIFile.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

