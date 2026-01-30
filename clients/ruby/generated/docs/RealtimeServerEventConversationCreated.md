# OpenApiOpenAIClient::RealtimeServerEventConversationCreated

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;conversation.created&#x60;. |  |
| **conversation** | [**RealtimeServerEventConversationCreatedConversation**](RealtimeServerEventConversationCreatedConversation.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventConversationCreated.new(
  event_id: null,
  type: null,
  conversation: null
)
```

