# FilesController

All URIs are relative to `"/v1"`

The controller class is defined in **[FilesController.java](../../src/main/java/org/openapitools/controller/FilesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](#createFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**retrieveFile**](#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.

<a id="createFile"></a>
# **createFile**
```java
Mono<OpenAIFile> FilesController.createFile(_filepurpose)
```

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_file** | `CompletedFileUpload` | The File object (not file name) to be uploaded.  |
**purpose** | `String` | The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  | [enum: `fine-tune`, `assistants`]

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
Mono<ListFilesResponse> FilesController.listFiles(purpose)
```

Returns a list of files that belong to the user&#39;s organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**purpose** | `String` | Only return files with the given purpose. | [optional parameter]

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

