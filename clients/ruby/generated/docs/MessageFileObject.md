# OpenApiOpenAIClient::MessageFileObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier, which can be referenced in API endpoints. |  |
| **object** | **String** | The object type, which is always &#x60;thread.message.file&#x60;. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the message file was created. |  |
| **message_id** | **String** | The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageFileObject.new(
  id: null,
  object: null,
  created_at: null,
  message_id: null
)
```

