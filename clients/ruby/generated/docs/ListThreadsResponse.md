# OpenApiOpenAIClient::ListThreadsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;ThreadObject&gt;**](ThreadObject.md) |  |  |
| **first_id** | **String** |  |  |
| **last_id** | **String** |  |  |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListThreadsResponse.new(
  object: list,
  data: null,
  first_id: asst_abc123,
  last_id: asst_abc456,
  has_more: false
)
```

