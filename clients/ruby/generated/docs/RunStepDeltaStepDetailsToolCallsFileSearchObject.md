# OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsFileSearchObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the tool call in the tool calls array. |  |
| **id** | **String** | The ID of the tool call object. | [optional] |
| **type** | **String** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. |  |
| **file_search** | **Object** | For now, this is always going to be an empty object. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDeltaStepDetailsToolCallsFileSearchObject.new(
  index: null,
  id: null,
  type: null,
  file_search: null
)
```

