# PSOpenAPITools.PSOpenAPITools\Api.ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-ChatCompletion**](ChatApi.md#New-ChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


<a id="New-ChatCompletion"></a>
# **New-ChatCompletion**
> CreateChatCompletionResponse New-ChatCompletion<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateChatCompletionRequest] <PSCustomObject><br>

Creates a model response for the given chat conversation.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ChatCompletionMessageToolCallFunction = Initialize-ChatCompletionMessageToolCallFunction -Name "MyName" -Arguments "MyArguments"
$ChatCompletionMessageToolCall = Initialize-ChatCompletionMessageToolCall -Id "MyId" -Type "function" -VarFunction $ChatCompletionMessageToolCallFunction

$ChatCompletionRequestAssistantMessageFunctionCall = Initialize-ChatCompletionRequestAssistantMessageFunctionCall -Arguments "MyArguments" -Name "MyName"
$ChatCompletionRequestMessage = Initialize-ChatCompletionRequestMessage -Content "MyContent" -Role "function" -Name "MyName" -ToolCalls $ChatCompletionMessageToolCall -FunctionCall $ChatCompletionRequestAssistantMessageFunctionCall -ToolCallId "MyToolCallId"

$CreateChatCompletionRequestModel = Initialize-CreateChatCompletionRequestModel 
$CreateChatCompletionRequestResponseFormat = Initialize-CreateChatCompletionRequestResponseFormat -Type "text"
$CreateChatCompletionRequestStop = Initialize-CreateChatCompletionRequestStop 

$FunctionObject = Initialize-FunctionObject -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  }
$ChatCompletionTool = Initialize-ChatCompletionTool -Type "function" -VarFunction $FunctionObject

$ChatCompletionNamedToolChoiceFunction = Initialize-ChatCompletionNamedToolChoiceFunction -Name "MyName"
$ChatCompletionToolChoiceOption = Initialize-ChatCompletionToolChoiceOption -Type "function" -VarFunction $ChatCompletionNamedToolChoiceFunction

$CreateChatCompletionRequestFunctionCall = Initialize-CreateChatCompletionRequestFunctionCall -Name "MyName"
$ChatCompletionFunctions = Initialize-ChatCompletionFunctions -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  }
$CreateChatCompletionRequest = Initialize-CreateChatCompletionRequest -Messages $ChatCompletionRequestMessage -Model $CreateChatCompletionRequestModel -FrequencyPenalty 0 -LogitBias @{ key_example = 0 } -Logprobs $false -TopLogprobs 0 -MaxTokens 0 -N 1 -PresencePenalty 0 -ResponseFormat $CreateChatCompletionRequestResponseFormat -Seed 0 -Stop $CreateChatCompletionRequestStop -Stream $false -Temperature 1 -TopP 1 -Tools $ChatCompletionTool -ToolChoice $ChatCompletionToolChoiceOption -User "user-1234" -FunctionCall $CreateChatCompletionRequestFunctionCall -Functions $ChatCompletionFunctions # CreateChatCompletionRequest | 

# Creates a model response for the given chat conversation.
try {
    $Result = New-ChatCompletion -CreateChatCompletionRequest $CreateChatCompletionRequest
} catch {
    Write-Host ("Exception occurred when calling New-ChatCompletion: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

