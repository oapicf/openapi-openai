# PSOpenAPITools.PSOpenAPITools\Api.EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-Embedding**](EmbeddingsApi.md#New-Embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


<a id="New-Embedding"></a>
# **New-Embedding**
> CreateEmbeddingResponse New-Embedding<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateEmbeddingRequest] <PSCustomObject><br>

Creates an embedding vector representing the input text.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateEmbeddingRequestInput = Initialize-CreateEmbeddingRequestInput 
$CreateEmbeddingRequestModel = Initialize-CreateEmbeddingRequestModel 
$CreateEmbeddingRequest = Initialize-CreateEmbeddingRequest -VarInput $CreateEmbeddingRequestInput -Model $CreateEmbeddingRequestModel -EncodingFormat "float" -Dimensions 0 -User "user-1234" # CreateEmbeddingRequest | 

# Creates an embedding vector representing the input text.
try {
    $Result = New-Embedding -CreateEmbeddingRequest $CreateEmbeddingRequest
} catch {
    Write-Host ("Exception occurred when calling New-Embedding: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

