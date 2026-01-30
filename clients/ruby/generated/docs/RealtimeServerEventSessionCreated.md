# OpenApiOpenAIClient::RealtimeServerEventSessionCreated

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;session.created&#x60;. |  |
| **session** | [**RealtimeSession**](RealtimeSession.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventSessionCreated.new(
  event_id: null,
  type: null,
  session: null
)
```

