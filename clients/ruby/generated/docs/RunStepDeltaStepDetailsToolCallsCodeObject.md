# OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsCodeObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the tool call in the tool calls array. |  |
| **id** | **String** | The ID of the tool call. | [optional] |
| **type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. |  |
| **code_interpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsCodeObject.new(
  index: null,
  id: null,
  type: null,
  code_interpreter: null
)
```

