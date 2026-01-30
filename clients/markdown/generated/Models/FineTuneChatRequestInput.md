# FineTuneChatRequestInput
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **messages** | [**List**](FineTuneChatRequestInput_messages_inner.md) |  | [optional] [default to null] |
| **tools** | [**List**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] [default to null] |
| **parallel\_tool\_calls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true] |
| **functions** | [**List**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

