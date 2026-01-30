# OpenApiOpenAIClient::RealtimeServerEventInputAudioBufferCleared

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;input_audio_buffer.cleared&#x60;. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventInputAudioBufferCleared.new(
  event_id: null,
  type: null
)
```

