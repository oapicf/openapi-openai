# OpenApiOpenAIClient::RealtimeClientEventConversationItemTruncate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | Optional client-generated ID used to identify this event. | [optional] |
| **type** | **String** | The event type, must be &#x60;conversation.item.truncate&#x60;. |  |
| **item_id** | **String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  |  |
| **content_index** | **Integer** | The index of the content part to truncate. Set this to 0. |  |
| **audio_end_ms** | **Integer** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeClientEventConversationItemTruncate.new(
  event_id: null,
  type: null,
  item_id: null,
  content_index: null,
  audio_end_ms: null
)
```

