# OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **input** | **String** | The input to the Code Interpreter tool call. | [optional] |
| **outputs** | [**Array&lt;RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&gt;**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.new(
  input: null,
  outputs: null
)
```

