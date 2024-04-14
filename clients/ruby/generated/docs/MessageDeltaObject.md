# OpenApiOpenAIClient::MessageDeltaObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier of the message, which can be referenced in API endpoints. |  |
| **object** | **String** | The object type, which is always &#x60;thread.message.delta&#x60;. |  |
| **delta** | [**MessageDeltaObjectDelta**](MessageDeltaObjectDelta.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageDeltaObject.new(
  id: null,
  object: null,
  delta: null
)
```

