# OpenApiOpenAIClient::RealtimeServerEventInputAudioBufferCommitted

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;input_audio_buffer.committed&#x60;. |  |
| **previous_item_id** | **String** | The ID of the preceding item after which the new item will be inserted.  |  |
| **item_id** | **String** | The ID of the user message item that will be created. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventInputAudioBufferCommitted.new(
  event_id: null,
  type: null,
  previous_item_id: null,
  item_id: null
)
```

