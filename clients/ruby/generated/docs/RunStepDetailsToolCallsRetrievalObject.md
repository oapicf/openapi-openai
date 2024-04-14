# OpenApiOpenAIClient::RunStepDetailsToolCallsRetrievalObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The ID of the tool call object. |  |
| **type** | **String** | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. |  |
| **retrieval** | **Object** | For now, this is always going to be an empty object. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDetailsToolCallsRetrievalObject.new(
  id: null,
  type: null,
  retrieval: null
)
```

