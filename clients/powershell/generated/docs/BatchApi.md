# PSOpenAPITools.PSOpenAPITools\Api.BatchApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Stop-Batch**](BatchApi.md#Stop-Batch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**New-Batch**](BatchApi.md#New-Batch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**Invoke-ListBatches**](BatchApi.md#Invoke-ListBatches) | **GET** /batches | List your organization&#39;s batches.
[**Invoke-RetrieveBatch**](BatchApi.md#Invoke-RetrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.


<a id="Stop-Batch"></a>
# **Stop-Batch**
> Batch Stop-Batch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$BatchId = "MyBatchId" # String | The ID of the batch to cancel.

# Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
try {
    $Result = Stop-Batch -BatchId $BatchId
} catch {
    Write-Host ("Exception occurred when calling Stop-Batch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BatchId** | **String**| The ID of the batch to cancel. | 

### Return type

[**Batch**](Batch.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Batch"></a>
# **New-Batch**
> Batch New-Batch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateBatchRequest] <PSCustomObject><br>

Creates and executes a batch from an uploaded file of requests

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateBatchRequest = Initialize-CreateBatchRequest -InputFileId "MyInputFileId" -Endpoint "/v1/chat/completions" -CompletionWindow "24h" -Metadata @{ key_example = "MyInner" } # CreateBatchRequest | 

# Creates and executes a batch from an uploaded file of requests
try {
    $Result = New-Batch -CreateBatchRequest $CreateBatchRequest
} catch {
    Write-Host ("Exception occurred when calling New-Batch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateBatchRequest** | [**CreateBatchRequest**](CreateBatchRequest.md)|  | 

### Return type

[**Batch**](Batch.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListBatches"></a>
# **Invoke-ListBatches**
> ListBatchesResponse Invoke-ListBatches<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

List your organization's batches.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)

# List your organization's batches.
try {
    $Result = Invoke-ListBatches -After $After -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListBatches: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]

### Return type

[**ListBatchesResponse**](ListBatchesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveBatch"></a>
# **Invoke-RetrieveBatch**
> Batch Invoke-RetrieveBatch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>

Retrieves a batch.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$BatchId = "MyBatchId" # String | The ID of the batch to retrieve.

# Retrieves a batch.
try {
    $Result = Invoke-RetrieveBatch -BatchId $BatchId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveBatch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BatchId** | **String**| The ID of the batch to retrieve. | 

### Return type

[**Batch**](Batch.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

