# OpenApiOpenAIClient::RealtimeServerEventConversationItemCreated

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;conversation.item.created&#x60;. |  |
| **previous_item_id** | **String** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  |  |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventConversationItemCreated.new(
  event_id: null,
  type: null,
  previous_item_id: null,
  item: null
)
```

