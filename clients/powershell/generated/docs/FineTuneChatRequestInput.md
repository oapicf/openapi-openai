# FineTuneChatRequestInput
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | [**FineTuneChatRequestInputMessagesInner[]**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**Tools** | [**ChatCompletionTool[]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**ParallelToolCalls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to $true]
**Functions** | [**ChatCompletionFunctions[]**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuneChatRequestInput = Initialize-PSOpenAPIToolsFineTuneChatRequestInput  -Messages null `
 -Tools null `
 -ParallelToolCalls null `
 -Functions null
```

- Convert the resource to JSON
```powershell
$FineTuneChatRequestInput | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

