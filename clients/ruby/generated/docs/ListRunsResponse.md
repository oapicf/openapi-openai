# OpenApiOpenAIClient::ListRunsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;RunObject&gt;**](RunObject.md) |  |  |
| **first_id** | **String** |  |  |
| **last_id** | **String** |  |  |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListRunsResponse.new(
  object: list,
  data: null,
  first_id: run_abc123,
  last_id: run_abc456,
  has_more: false
)
```

