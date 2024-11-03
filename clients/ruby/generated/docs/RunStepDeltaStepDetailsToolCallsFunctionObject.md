# OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsFunctionObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the tool call in the tool calls array. |  |
| **id** | **String** | The ID of the tool call object. | [optional] |
| **type** | **String** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. |  |
| **function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsFunctionObject.new(
  index: null,
  id: null,
  type: null,
  function: null
)
```

