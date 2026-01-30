# OpenApiOpenAIClient::RealtimeServerEventInputAudioBufferSpeechStarted

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. |  |
| **audio_start_ms** | **Integer** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  |  |
| **item_id** | **String** | The ID of the user message item that will be created when speech stops.  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventInputAudioBufferSpeechStarted.new(
  event_id: null,
  type: null,
  audio_start_ms: null,
  item_id: null
)
```

