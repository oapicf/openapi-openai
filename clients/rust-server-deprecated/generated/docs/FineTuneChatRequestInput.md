# FineTuneChatRequestInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**Vec<models::FineTuneChatRequestInputMessagesInner>**](FineTuneChatRequestInput_messages_inner.md) |  | [optional] [default to None]
**tools** | [**Vec<models::ChatCompletionTool>**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] [default to None]
**parallel_tool_calls** | **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to Some(true)]
**functions** | [**Vec<models::ChatCompletionFunctions>**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


