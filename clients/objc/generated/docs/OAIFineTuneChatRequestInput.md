# OAIFineTuneChatRequestInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**NSArray&lt;OAIFineTuneChatRequestInputMessagesInner&gt;***](OAIFineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**tools** | [**NSArray&lt;OAIChatCompletionTool&gt;***](OAIChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**parallelToolCalls** | **NSNumber*** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to @(YES)]
**functions** | [**NSArray&lt;OAIChatCompletionFunctions&gt;***](OAIChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


