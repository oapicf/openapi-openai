# OpenApiOpenAIClient::RealtimeClientEventInputAudioBufferCommit

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | Optional client-generated ID used to identify this event. | [optional] |
| **type** | **String** | The event type, must be &#x60;input_audio_buffer.commit&#x60;. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeClientEventInputAudioBufferCommit.new(
  event_id: null,
  type: null
)
```

