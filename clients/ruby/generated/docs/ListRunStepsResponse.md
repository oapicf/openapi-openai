# OpenApiOpenAIClient::ListRunStepsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;RunStepObject&gt;**](RunStepObject.md) |  |  |
| **first_id** | **String** |  |  |
| **last_id** | **String** |  |  |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListRunStepsResponse.new(
  object: list,
  data: null,
  first_id: step_abc123,
  last_id: step_abc456,
  has_more: false
)
```

