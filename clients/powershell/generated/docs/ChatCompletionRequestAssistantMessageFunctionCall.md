# ChatCompletionRequestAssistantMessageFunctionCall
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Arguments** | **String** | The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. | 
**Name** | **String** | The name of the function to call. | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestAssistantMessageFunctionCall = Initialize-PSOpenAPIToolsChatCompletionRequestAssistantMessageFunctionCall  -Arguments null `
 -Name null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestAssistantMessageFunctionCall | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

