# OpenApiOpenAIClient::ListMessageFilesResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;MessageFileObject&gt;**](MessageFileObject.md) |  |  |
| **first_id** | **String** |  |  |
| **last_id** | **String** |  |  |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListMessageFilesResponse.new(
  object: list,
  data: null,
  first_id: file-abc123,
  last_id: file-abc456,
  has_more: false
)
```

