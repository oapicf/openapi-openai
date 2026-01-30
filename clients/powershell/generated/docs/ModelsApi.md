# PSOpenAPITools.PSOpenAPITools\Api.ModelsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-DeleteModel**](ModelsApi.md#Invoke-DeleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**Invoke-ListModels**](ModelsApi.md#Invoke-ListModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**Invoke-RetrieveModel**](ModelsApi.md#Invoke-RetrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a id="Invoke-DeleteModel"></a>
# **Invoke-DeleteModel**
> DeleteModelResponse Invoke-DeleteModel<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <String><br>

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Model = "ft:gpt-4o-mini:acemeco:suffix:abc123" # String | The model to delete

# Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
try {
    $Result = Invoke-DeleteModel -Model $Model
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteModel: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Model** | **String**| The model to delete | 

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListModels"></a>
# **Invoke-ListModels**
> ListModelsResponse Invoke-ListModels<br>

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration


# Lists the currently available models, and provides basic information about each one such as the owner and availability.
try {
    $Result = Invoke-ListModels
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListModels: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveModel"></a>
# **Invoke-RetrieveModel**
> Model Invoke-RetrieveModel<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <String><br>

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Model = "gpt-4o-mini" # String | The ID of the model to use for this request

# Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
try {
    $Result = Invoke-RetrieveModel -Model $Model
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveModel: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Model** | **String**| The ID of the model to use for this request | 

### Return type

[**Model**](Model.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

