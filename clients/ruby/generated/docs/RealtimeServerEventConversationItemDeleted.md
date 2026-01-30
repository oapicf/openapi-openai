# OpenApiOpenAIClient::RealtimeServerEventConversationItemDeleted

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;conversation.item.deleted&#x60;. |  |
| **item_id** | **String** | The ID of the item that was deleted. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventConversationItemDeleted.new(
  event_id: null,
  type: null,
  item_id: null
)
```

