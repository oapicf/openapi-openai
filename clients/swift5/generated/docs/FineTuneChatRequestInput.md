# FineTuneChatRequestInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [FineTuneChatRequestInputMessagesInner] |  | [optional] 
**tools** | [ChatCompletionTool] | A list of tools the model may generate JSON inputs for. | [optional] 
**parallelToolCalls** | **Bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**functions** | [ChatCompletionFunctions] | A list of functions the model may generate JSON inputs for. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


