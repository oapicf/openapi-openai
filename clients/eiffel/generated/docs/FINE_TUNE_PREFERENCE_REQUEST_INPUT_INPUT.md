# FINE_TUNE_PREFERENCE_REQUEST_INPUT_INPUT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**LIST [FINE_TUNE_CHAT_REQUEST_INPUT_MESSAGES_INNER]**](FineTuneChatRequestInput_messages_inner.md) |  | [optional] [default to null]
**tools** | [**LIST [CHAT_COMPLETION_TOOL]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] [default to null]
**parallel_tool_calls** | **BOOLEAN** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


