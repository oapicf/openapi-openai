# OpenApiOpenAIClient::RealtimeClientEventConversationItemDelete

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | Optional client-generated ID used to identify this event. | [optional] |
| **type** | **String** | The event type, must be &#x60;conversation.item.delete&#x60;. |  |
| **item_id** | **String** | The ID of the item to delete. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeClientEventConversationItemDelete.new(
  event_id: null,
  type: null,
  item_id: null
)
```

