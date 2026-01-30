# PSOpenAPITools.PSOpenAPITools\Api.ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-ChatCompletion**](ChatApi.md#New-ChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 


<a id="New-ChatCompletion"></a>
# **New-ChatCompletion**
> CreateChatCompletionResponse New-ChatCompletion<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateChatCompletionRequest] <PSCustomObject><br>

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ChatCompletionRequestAssistantMessageAudio = Initialize-ChatCompletionRequestAssistantMessageAudio -Id "MyId"

$ChatCompletionMessageToolCallFunction = Initialize-ChatCompletionMessageToolCallFunction -Name "MyName" -Arguments "MyArguments"
$ChatCompletionMessageToolCall = Initialize-ChatCompletionMessageToolCall -Id "MyId" -Type "function" -VarFunction $ChatCompletionMessageToolCallFunction

$ChatCompletionRequestAssistantMessageFunctionCall = Initialize-ChatCompletionRequestAssistantMessageFunctionCall -Arguments "MyArguments" -Name "MyName"
$ChatCompletionRequestMessage = Initialize-ChatCompletionRequestMessage -Content "MyContent" -Role "function" -Name "MyName" -Refusal "MyRefusal" -Audio $ChatCompletionRequestAssistantMessageAudio -ToolCalls $ChatCompletionMessageToolCall -FunctionCall $ChatCompletionRequestAssistantMessageFunctionCall -ToolCallId "MyToolCallId"

$CreateChatCompletionRequestModel = Initialize-CreateChatCompletionRequestModel 
"text"
$PredictionContentContent = Initialize-PredictionContentContent 
$PredictionContent = Initialize-PredictionContent -Type "content" -Content $PredictionContentContent

$CreateChatCompletionRequestAudio = Initialize-CreateChatCompletionRequestAudio -Voice "alloy" -Format "wav"

$ResponseFormatJsonSchemaJsonSchema = Initialize-ResponseFormatJsonSchemaJsonSchema -Description "MyDescription" -Name "MyName" -Schema @{ key_example =  } -Strict $false
$CreateChatCompletionRequestResponseFormat = Initialize-CreateChatCompletionRequestResponseFormat -Type "text" -JsonSchema $ResponseFormatJsonSchemaJsonSchema

$CreateChatCompletionRequestStop = Initialize-CreateChatCompletionRequestStop 
$ChatCompletionStreamOptions = Initialize-ChatCompletionStreamOptions -IncludeUsage $false

$FunctionObject = Initialize-FunctionObject -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  } -Strict $false
$ChatCompletionTool = Initialize-ChatCompletionTool -Type "function" -VarFunction $FunctionObject

$AssistantsNamedToolChoiceFunction = Initialize-AssistantsNamedToolChoiceFunction -Name "MyName"
$ChatCompletionToolChoiceOption = Initialize-ChatCompletionToolChoiceOption -Type "function" -VarFunction $AssistantsNamedToolChoiceFunction

$CreateChatCompletionRequestFunctionCall = Initialize-CreateChatCompletionRequestFunctionCall -Name "MyName"
$ChatCompletionFunctions = Initialize-ChatCompletionFunctions -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  }
$CreateChatCompletionRequest = Initialize-CreateChatCompletionRequest -Messages $ChatCompletionRequestMessage -Model $CreateChatCompletionRequestModel -Store $false -ReasoningEffort "low" -Metadata @{ key_example = "MyInner" } -FrequencyPenalty 0 -LogitBias @{ key_example = 0 } -Logprobs $false -TopLogprobs 0 -MaxTokens 0 -MaxCompletionTokens 0 -N 1 -Modalities 

$ChatCompletionRequestAssistantMessageAudio = Initialize-ChatCompletionRequestAssistantMessageAudio -Id "MyId"

$ChatCompletionMessageToolCallFunction = Initialize-ChatCompletionMessageToolCallFunction -Name "MyName" -Arguments "MyArguments"
$ChatCompletionMessageToolCall = Initialize-ChatCompletionMessageToolCall -Id "MyId" -Type "function" -VarFunction $ChatCompletionMessageToolCallFunction

$ChatCompletionRequestAssistantMessageFunctionCall = Initialize-ChatCompletionRequestAssistantMessageFunctionCall -Arguments "MyArguments" -Name "MyName"
$ChatCompletionRequestMessage = Initialize-ChatCompletionRequestMessage -Content "MyContent" -Role "function" -Name "MyName" -Refusal "MyRefusal" -Audio $ChatCompletionRequestAssistantMessageAudio -ToolCalls $ChatCompletionMessageToolCall -FunctionCall $ChatCompletionRequestAssistantMessageFunctionCall -ToolCallId "MyToolCallId"

$CreateChatCompletionRequestModel = Initialize-CreateChatCompletionRequestModel 
"text" -Prediction $PredictionContent -Audio $CreateChatCompletionRequestAudio -PresencePenalty 0 -ResponseFormat $CreateChatCompletionRequestResponseFormat -Seed 0 -ServiceTier "auto" -Stop $CreateChatCompletionRequestStop -Stream $false -StreamOptions $ChatCompletionStreamOptions -Temperature 1 -TopP 1 -Tools $ChatCompletionTool -ToolChoice $ChatCompletionToolChoiceOption -ParallelToolCalls $false -User "user-1234" -FunctionCall $CreateChatCompletionRequestFunctionCall -Functions $ChatCompletionFunctions # CreateChatCompletionRequest | 

# Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
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

