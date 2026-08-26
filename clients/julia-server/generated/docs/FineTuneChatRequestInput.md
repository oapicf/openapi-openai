# FineTuneChatRequestInput


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`messages`** | [**`Vector{FineTuneChatRequestInputMessagesInner}`**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] [default to nothing]
**`tools`** | [**`Vector{ChatCompletionTool}`**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] [default to nothing]
**`parallel_tool_calls`** | **`Bool`** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**`functions`** | [**`Vector{ChatCompletionFunctions}`**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


