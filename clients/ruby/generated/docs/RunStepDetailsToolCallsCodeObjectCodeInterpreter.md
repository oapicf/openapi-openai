# OpenApiOpenAIClient::RunStepDetailsToolCallsCodeObjectCodeInterpreter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **input** | **String** | The input to the Code Interpreter tool call. |  |
| **outputs** | [**Array&lt;RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&gt;**](RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDetailsToolCallsCodeObjectCodeInterpreter.new(
  input: null,
  outputs: null
)
```

