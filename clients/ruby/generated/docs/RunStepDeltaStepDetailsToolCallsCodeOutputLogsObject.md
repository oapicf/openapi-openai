# OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the output in the outputs array. |  |
| **type** | **String** | Always &#x60;logs&#x60;. |  |
| **logs** | **String** | The text output from the Code Interpreter tool call. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.new(
  index: null,
  type: null,
  logs: null
)
```

