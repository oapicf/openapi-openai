# PSOpenAPITools.PSOpenAPITools\Api.FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-File**](FilesApi.md#New-File) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**Invoke-DeleteFile**](FilesApi.md#Invoke-DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**Invoke-DownloadFile**](FilesApi.md#Invoke-DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**Invoke-ListFiles**](FilesApi.md#Invoke-ListFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**Invoke-RetrieveFile**](FilesApi.md#Invoke-RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


<a id="New-File"></a>
# **New-File**
> OpenAIFile New-File<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-File] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Purpose] <String><br>

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$File =  # System.IO.FileInfo | The File object (not file name) to be uploaded. 
$Purpose = "fine-tune" # String | The intended purpose of the uploaded file.  Use """"fine-tune"""" for [Fine-tuning](/docs/api-reference/fine-tuning) and """"assistants"""" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 

# Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
try {
    $Result = New-File -File $File -Purpose $Purpose
} catch {
    Write-Host ("Exception occurred when calling New-File: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **File** | **System.IO.FileInfo****System.IO.FileInfo**| The File object (not file name) to be uploaded.  | 
 **Purpose** | **String**| The intended purpose of the uploaded file.  Use &quot;&quot;&quot;&quot;fine-tune&quot;&quot;&quot;&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and &quot;&quot;&quot;&quot;assistants&quot;&quot;&quot;&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  | 

### Return type

[**OpenAIFile**](OpenAIFile.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteFile"></a>
# **Invoke-DeleteFile**
> DeleteFileResponse Invoke-DeleteFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Delete a file.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$FileId = "MyFileId" # String | The ID of the file to use for this request.

# Delete a file.
try {
    $Result = Invoke-DeleteFile -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FileId** | **String**| The ID of the file to use for this request. | 

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DownloadFile"></a>
# **Invoke-DownloadFile**
> String Invoke-DownloadFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Returns the contents of the specified file.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$FileId = "MyFileId" # String | The ID of the file to use for this request.

# Returns the contents of the specified file.
try {
    $Result = Invoke-DownloadFile -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DownloadFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FileId** | **String**| The ID of the file to use for this request. | 

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListFiles"></a>
# **Invoke-ListFiles**
> ListFilesResponse Invoke-ListFiles<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Purpose] <String><br>

Returns a list of files that belong to the user's organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Purpose = "MyPurpose" # String | Only return files with the given purpose. (optional)

# Returns a list of files that belong to the user's organization.
try {
    $Result = Invoke-ListFiles -Purpose $Purpose
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFiles: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Purpose** | **String**| Only return files with the given purpose. | [optional] 

### Return type

[**ListFilesResponse**](ListFilesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveFile"></a>
# **Invoke-RetrieveFile**
> OpenAIFile Invoke-RetrieveFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Returns information about a specific file.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$FileId = "MyFileId" # String | The ID of the file to use for this request.

# Returns information about a specific file.
try {
    $Result = Invoke-RetrieveFile -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FileId** | **String**| The ID of the file to use for this request. | 

### Return type

[**OpenAIFile**](OpenAIFile.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

