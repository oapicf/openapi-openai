# FilesController

All URIs are relative to `"/v1"`

The controller class is defined in **[FilesController.java](../../src/main/java/org/openapitools/controller/FilesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](#createFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](#listFiles) | **GET** /files | Returns a list of files.
[**retrieveFile**](#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.

<a id="createFile"></a>
# **createFile**
```java
Mono<OpenAIFile> FilesController.createFile(_filepurpose)
```

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_file** | `CompletedFileUpload` | The File object (not file name) to be uploaded.  |
**purpose** | `String` | The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | [enum: `assistants`, `batch`, `fine-tune`, `vision`]

### Return type
[**OpenAIFile**](../../docs/models/OpenAIFile.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

<a id="deleteFile"></a>
# **deleteFile**
```java
Mono<DeleteFileResponse> FilesController.deleteFile(fileId)
```

Delete a file.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**fileId** | `String` | The ID of the file to use for this request. |

### Return type
[**DeleteFileResponse**](../../docs/models/DeleteFileResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="downloadFile"></a>
# **downloadFile**
```java
Mono<String> FilesController.downloadFile(fileId)
```

Returns the contents of the specified file.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**fileId** | `String` | The ID of the file to use for this request. |

### Return type
`String`

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listFiles"></a>
# **listFiles**
```java
Mono<ListFilesResponse> FilesController.listFiles(purposelimitorderafter)
```

Returns a list of files.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**purpose** | `String` | Only return files with the given purpose. | [optional parameter]
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional parameter] [default to `10000`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]

### Return type
[**ListFilesResponse**](../../docs/models/ListFilesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveFile"></a>
# **retrieveFile**
```java
Mono<OpenAIFile> FilesController.retrieveFile(fileId)
```

Returns information about a specific file.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**fileId** | `String` | The ID of the file to use for this request. |

### Return type
[**OpenAIFile**](../../docs/models/OpenAIFile.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

