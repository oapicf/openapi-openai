# files_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateFile**](files_api.md#CreateFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**DeleteFile**](files_api.md#DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**DownloadFile**](files_api.md#DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**ListFiles**](files_api.md#ListFiles) | **GET** /files | Returns a list of files.
[**RetrieveFile**](files_api.md#RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


<a name="CreateFile"></a>
# **CreateFile**
> OpenAiFile CreateFile(file, purpose)

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
<a name="DeleteFile"></a>
# **DeleteFile**
> DeleteFileResponse DeleteFile(fileId)

Delete a file.
<a name="DownloadFile"></a>
# **DownloadFile**
> String! DownloadFile(fileId)

Returns the contents of the specified file.
<a name="ListFiles"></a>
# **ListFiles**
> ListFilesResponse ListFiles(purpose, limit, order, after)

Returns a list of files.
<a name="RetrieveFile"></a>
# **RetrieveFile**
> OpenAiFile RetrieveFile(fileId)

Returns information about a specific file.
