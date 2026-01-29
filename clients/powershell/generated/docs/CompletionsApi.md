# PSOpenAPITools.PSOpenAPITools\Api.CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-Completion**](CompletionsApi.md#New-Completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


<a id="New-Completion"></a>
# **New-Completion**
> CreateCompletionResponse New-Completion<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateCompletionRequest] <PSCustomObject><br>

Creates a completion for the provided prompt and parameters.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateCompletionRequestModel = Initialize-CreateCompletionRequestModel 
$CreateCompletionRequestPrompt = Initialize-CreateCompletionRequestPrompt 
$CreateCompletionRequestStop = Initialize-CreateCompletionRequestStop 
$CreateCompletionRequest = Initialize-CreateCompletionRequest -Model $CreateCompletionRequestModel -Prompt $CreateCompletionRequestPrompt -BestOf 0 -Echo $false -FrequencyPenalty 0 -LogitBias @{ key_example = 0 } -Logprobs 0 -MaxTokens 16 -N 1 -PresencePenalty 0 -Seed 0 -Stop $CreateCompletionRequestStop -Stream $false -Suffix "test." -Temperature 1 -TopP 1 -User "user-1234" # CreateCompletionRequest | 

# Creates a completion for the provided prompt and parameters.
try {
    $Result = New-Completion -CreateCompletionRequest $CreateCompletionRequest
} catch {
    Write-Host ("Exception occurred when calling New-Completion: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

