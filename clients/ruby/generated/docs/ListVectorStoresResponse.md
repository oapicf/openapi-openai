# OpenApiOpenAIClient::ListVectorStoresResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;VectorStoreObject&gt;**](VectorStoreObject.md) |  |  |
| **first_id** | **String** |  |  |
| **last_id** | **String** |  |  |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListVectorStoresResponse.new(
  object: list,
  data: null,
  first_id: vs_abc123,
  last_id: vs_abc456,
  has_more: false
)
```

