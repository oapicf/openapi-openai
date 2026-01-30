# PSOpenAPITools.PSOpenAPITools\Api.FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-File**](FilesApi.md#New-File) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**Invoke-DeleteFile**](FilesApi.md#Invoke-DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**Invoke-DownloadFile**](FilesApi.md#Invoke-DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**Invoke-ListFiles**](FilesApi.md#Invoke-ListFiles) | **GET** /files | Returns a list of files.
[**Invoke-RetrieveFile**](FilesApi.md#Invoke-RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


<a id="New-File"></a>
# **New-File**
> OpenAIFile New-File<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-File] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Purpose] <String><br>

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$File =  # System.IO.FileInfo | The File object (not file name) to be uploaded. 
$Purpose = "assistants" # String | The intended purpose of the uploaded file.  Use """"assistants"""" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, """"vision"""" for Assistants image file inputs, """"batch"""" for [Batch API](/docs/guides/batch), and """"fine-tune"""" for [Fine-tuning](/docs/api-reference/fine-tuning). 

# Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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
 **Purpose** | **String**| The intended purpose of the uploaded file.  Use &quot;&quot;&quot;&quot;assistants&quot;&quot;&quot;&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, &quot;&quot;&quot;&quot;vision&quot;&quot;&quot;&quot; for Assistants image file inputs, &quot;&quot;&quot;&quot;batch&quot;&quot;&quot;&quot; for [Batch API](/docs/guides/batch), and &quot;&quot;&quot;&quot;fine-tune&quot;&quot;&quot;&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | 

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>

Returns a list of files.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Purpose = "MyPurpose" # String | Only return files with the given purpose. (optional)
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (optional) (default to 10000)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

# Returns a list of files.
try {
    $Result = Invoke-ListFiles -Purpose $Purpose -Limit $Limit -Order $Order -After $After
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFiles: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Purpose** | **String**| Only return files with the given purpose. | [optional] 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional] [default to 10000]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

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

