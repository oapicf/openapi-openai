# OpenApiOpenAIClient::ListMessagesResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;MessageObject&gt;**](MessageObject.md) |  |  |
| **first_id** | **String** |  |  |
| **last_id** | **String** |  |  |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListMessagesResponse.new(
  object: list,
  data: null,
  first_id: msg_abc123,
  last_id: msg_abc123,
  has_more: false
)
```

