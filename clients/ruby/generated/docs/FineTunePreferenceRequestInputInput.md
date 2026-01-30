# OpenApiOpenAIClient::FineTunePreferenceRequestInputInput

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **messages** | [**Array&lt;FineTuneChatRequestInputMessagesInner&gt;**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] |
| **tools** | [**Array&lt;ChatCompletionTool&gt;**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] |
| **parallel_tool_calls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional][default to true] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTunePreferenceRequestInputInput.new(
  messages: null,
  tools: null,
  parallel_tool_calls: null
)
```

