# files_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateFile**](files_api.md#CreateFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**DeleteFile**](files_api.md#DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**DownloadFile**](files_api.md#DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**ListFiles**](files_api.md#ListFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**RetrieveFile**](files_api.md#RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


<a name="CreateFile"></a>
# **CreateFile**
> OpenAiFile CreateFile(file, purpose)

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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
> ListFilesResponse ListFiles(purpose)

Returns a list of files that belong to the user&#39;s organization.
<a name="RetrieveFile"></a>
# **RetrieveFile**
> OpenAiFile RetrieveFile(fileId)

Returns information about a specific file.
