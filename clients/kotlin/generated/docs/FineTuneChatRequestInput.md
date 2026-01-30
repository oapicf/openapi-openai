
# FineTuneChatRequestInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messages** | [**kotlin.collections.List&lt;FineTuneChatRequestInputMessagesInner&gt;**](FineTuneChatRequestInputMessagesInner.md) |  |  [optional] |
| **tools** | [**kotlin.collections.List&lt;ChatCompletionTool&gt;**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. |  [optional] |
| **parallelToolCalls** | **kotlin.Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. |  [optional] |
| **functions** | [**kotlin.collections.List&lt;ChatCompletionFunctions&gt;**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. |  [optional] |



