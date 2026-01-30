# PSOpenAPITools.PSOpenAPITools\Api.VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Stop-VectorStoreFileBatch**](VectorStoresApi.md#Stop-VectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**New-VectorStore**](VectorStoresApi.md#New-VectorStore) | **POST** /vector_stores | Create a vector store.
[**New-VectorStoreFile**](VectorStoresApi.md#New-VectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**New-VectorStoreFileBatch**](VectorStoresApi.md#New-VectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**Invoke-DeleteVectorStore**](VectorStoresApi.md#Invoke-DeleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**Invoke-DeleteVectorStoreFile**](VectorStoresApi.md#Invoke-DeleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**Get-VectorStore**](VectorStoresApi.md#Get-VectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**Get-VectorStoreFile**](VectorStoresApi.md#Get-VectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**Get-VectorStoreFileBatch**](VectorStoresApi.md#Get-VectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**Invoke-ListFilesInVectorStoreBatch**](VectorStoresApi.md#Invoke-ListFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**Invoke-ListVectorStoreFiles**](VectorStoresApi.md#Invoke-ListVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**Invoke-ListVectorStores**](VectorStoresApi.md#Invoke-ListVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**Edit-VectorStore**](VectorStoresApi.md#Edit-VectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


<a id="Stop-VectorStoreFileBatch"></a>
# **Stop-VectorStoreFileBatch**
> VectorStoreFileBatchObject Stop-VectorStoreFileBatch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "MyVectorStoreId" # String | The ID of the vector store that the file batch belongs to.
$BatchId = "MyBatchId" # String | The ID of the file batch to cancel.

# Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
try {
    $Result = Stop-VectorStoreFileBatch -VectorStoreId $VectorStoreId -BatchId $BatchId
} catch {
    Write-Host ("Exception occurred when calling Stop-VectorStoreFileBatch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. | 
 **BatchId** | **String**| The ID of the file batch to cancel. | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-VectorStore"></a>
# **New-VectorStore**
> VectorStoreObject New-VectorStore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateVectorStoreRequest] <PSCustomObject><br>

Create a vector store.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreExpirationAfter = Initialize-VectorStoreExpirationAfter -Anchor "last_active_at" -Days 0

$StaticChunkingStrategyStatic = Initialize-StaticChunkingStrategyStatic -MaxChunkSizeTokens 0 -ChunkOverlapTokens 0
$StaticChunkingStrategy = Initialize-StaticChunkingStrategy -Type "static" -Static $StaticChunkingStrategyStatic

$CreateVectorStoreRequestChunkingStrategy = Initialize-CreateVectorStoreRequestChunkingStrategy -Type "auto" -Static $StaticChunkingStrategy

$CreateVectorStoreRequest = Initialize-CreateVectorStoreRequest -FileIds "MyFileIds" -Name "MyName" -ExpiresAfter $VectorStoreExpirationAfter -ChunkingStrategy $CreateVectorStoreRequestChunkingStrategy -Metadata # CreateVectorStoreRequest | 

# Create a vector store.
try {
    $Result = New-VectorStore -CreateVectorStoreRequest $CreateVectorStoreRequest
} catch {
    Write-Host ("Exception occurred when calling New-VectorStore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-VectorStoreFile"></a>
# **New-VectorStoreFile**
> VectorStoreFileObject New-VectorStoreFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateVectorStoreFileRequest] <PSCustomObject><br>

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "vs_abc123" # String | The ID of the vector store for which to create a File. 
$StaticChunkingStrategyStatic = Initialize-StaticChunkingStrategyStatic -MaxChunkSizeTokens 0 -ChunkOverlapTokens 0
$StaticChunkingStrategy = Initialize-StaticChunkingStrategy -Type "static" -Static $StaticChunkingStrategyStatic

$ChunkingStrategyRequestParam = Initialize-ChunkingStrategyRequestParam -Type "auto" -Static $StaticChunkingStrategy

$CreateVectorStoreFileRequest = Initialize-CreateVectorStoreFileRequest -FileId "MyFileId" -ChunkingStrategy $ChunkingStrategyRequestParam # CreateVectorStoreFileRequest | 

# Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
try {
    $Result = New-VectorStoreFile -VectorStoreId $VectorStoreId -CreateVectorStoreFileRequest $CreateVectorStoreFileRequest
} catch {
    Write-Host ("Exception occurred when calling New-VectorStoreFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store for which to create a File.  | 
 **CreateVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  | 

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-VectorStoreFileBatch"></a>
# **New-VectorStoreFileBatch**
> VectorStoreFileBatchObject New-VectorStoreFileBatch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateVectorStoreFileBatchRequest] <PSCustomObject><br>

Create a vector store file batch.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "vs_abc123" # String | The ID of the vector store for which to create a File Batch. 
$StaticChunkingStrategyStatic = Initialize-StaticChunkingStrategyStatic -MaxChunkSizeTokens 0 -ChunkOverlapTokens 0
$StaticChunkingStrategy = Initialize-StaticChunkingStrategy -Type "static" -Static $StaticChunkingStrategyStatic

$ChunkingStrategyRequestParam = Initialize-ChunkingStrategyRequestParam -Type "auto" -Static $StaticChunkingStrategy

$CreateVectorStoreFileBatchRequest = Initialize-CreateVectorStoreFileBatchRequest -FileIds "MyFileIds" -ChunkingStrategy $ChunkingStrategyRequestParam # CreateVectorStoreFileBatchRequest | 

# Create a vector store file batch.
try {
    $Result = New-VectorStoreFileBatch -VectorStoreId $VectorStoreId -CreateVectorStoreFileBatchRequest $CreateVectorStoreFileBatchRequest
} catch {
    Write-Host ("Exception occurred when calling New-VectorStoreFileBatch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store for which to create a File Batch.  | 
 **CreateVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteVectorStore"></a>
# **Invoke-DeleteVectorStore**
> DeleteVectorStoreResponse Invoke-DeleteVectorStore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>

Delete a vector store.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "MyVectorStoreId" # String | The ID of the vector store to delete.

# Delete a vector store.
try {
    $Result = Invoke-DeleteVectorStore -VectorStoreId $VectorStoreId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteVectorStore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store to delete. | 

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteVectorStoreFile"></a>
# **Invoke-DeleteVectorStoreFile**
> DeleteVectorStoreFileResponse Invoke-DeleteVectorStoreFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "MyVectorStoreId" # String | The ID of the vector store that the file belongs to.
$FileId = "MyFileId" # String | The ID of the file to delete.

# Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
try {
    $Result = Invoke-DeleteVectorStoreFile -VectorStoreId $VectorStoreId -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteVectorStoreFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store that the file belongs to. | 
 **FileId** | **String**| The ID of the file to delete. | 

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-VectorStore"></a>
# **Get-VectorStore**
> VectorStoreObject Get-VectorStore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>

Retrieves a vector store.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "MyVectorStoreId" # String | The ID of the vector store to retrieve.

# Retrieves a vector store.
try {
    $Result = Get-VectorStore -VectorStoreId $VectorStoreId
} catch {
    Write-Host ("Exception occurred when calling Get-VectorStore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store to retrieve. | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-VectorStoreFile"></a>
# **Get-VectorStoreFile**
> VectorStoreFileObject Get-VectorStoreFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Retrieves a vector store file.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "vs_abc123" # String | The ID of the vector store that the file belongs to.
$FileId = "file-abc123" # String | The ID of the file being retrieved.

# Retrieves a vector store file.
try {
    $Result = Get-VectorStoreFile -VectorStoreId $VectorStoreId -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Get-VectorStoreFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store that the file belongs to. | 
 **FileId** | **String**| The ID of the file being retrieved. | 

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-VectorStoreFileBatch"></a>
# **Get-VectorStoreFileBatch**
> VectorStoreFileBatchObject Get-VectorStoreFileBatch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>

Retrieves a vector store file batch.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "vs_abc123" # String | The ID of the vector store that the file batch belongs to.
$BatchId = "vsfb_abc123" # String | The ID of the file batch being retrieved.

# Retrieves a vector store file batch.
try {
    $Result = Get-VectorStoreFileBatch -VectorStoreId $VectorStoreId -BatchId $BatchId
} catch {
    Write-Host ("Exception occurred when calling Get-VectorStoreFileBatch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. | 
 **BatchId** | **String**| The ID of the file batch being retrieved. | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListFilesInVectorStoreBatch"></a>
# **Invoke-ListFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse Invoke-ListFilesInVectorStoreBatch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Filter] <String><br>

Returns a list of vector store files in a batch.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "MyVectorStoreId" # String | The ID of the vector store that the files belong to.
$BatchId = "MyBatchId" # String | The ID of the file batch that the files belong to.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
$Filter = "in_progress" # String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

# Returns a list of vector store files in a batch.
try {
    $Result = Invoke-ListFilesInVectorStoreBatch -VectorStoreId $VectorStoreId -BatchId $BatchId -Limit $Limit -Order $Order -After $After -Before $Before -Filter $Filter
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFilesInVectorStoreBatch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store that the files belong to. | 
 **BatchId** | **String**| The ID of the file batch that the files belong to. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **Filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListVectorStoreFiles"></a>
# **Invoke-ListVectorStoreFiles**
> ListVectorStoreFilesResponse Invoke-ListVectorStoreFiles<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Filter] <String><br>

Returns a list of vector store files.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "MyVectorStoreId" # String | The ID of the vector store that the files belong to.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
$Filter = "in_progress" # String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

# Returns a list of vector store files.
try {
    $Result = Invoke-ListVectorStoreFiles -VectorStoreId $VectorStoreId -Limit $Limit -Order $Order -After $After -Before $Before -Filter $Filter
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListVectorStoreFiles: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store that the files belong to. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **Filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListVectorStores"></a>
# **Invoke-ListVectorStores**
> ListVectorStoresResponse Invoke-ListVectorStores<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

Returns a list of vector stores.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# Returns a list of vector stores.
try {
    $Result = Invoke-ListVectorStores -Limit $Limit -Order $Order -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListVectorStores: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-VectorStore"></a>
# **Edit-VectorStore**
> VectorStoreObject Edit-VectorStore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VectorStoreId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UpdateVectorStoreRequest] <PSCustomObject><br>

Modifies a vector store.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$VectorStoreId = "MyVectorStoreId" # String | The ID of the vector store to modify.
$VectorStoreExpirationAfter = Initialize-VectorStoreExpirationAfter -Anchor "last_active_at" -Days 0
$UpdateVectorStoreRequest = Initialize-UpdateVectorStoreRequest -Name "MyName" -ExpiresAfter $VectorStoreExpirationAfter -Metadata # UpdateVectorStoreRequest | 

# Modifies a vector store.
try {
    $Result = Edit-VectorStore -VectorStoreId $VectorStoreId -UpdateVectorStoreRequest $UpdateVectorStoreRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-VectorStore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **VectorStoreId** | **String**| The ID of the vector store to modify. | 
 **UpdateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

