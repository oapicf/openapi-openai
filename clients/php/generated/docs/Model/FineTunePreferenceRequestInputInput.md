# # FineTunePreferenceRequestInputInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**\OpenAPI\Client\Model\FineTuneChatRequestInputMessagesInner[]**](FineTuneChatRequestInputMessagesInner.md) |  | [optional]
**tools** | [**\OpenAPI\Client\Model\ChatCompletionTool[]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional]
**parallel_tool_calls** | **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
