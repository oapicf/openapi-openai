# OpenApiOpenAIClient::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  |  |
| **item_id** | **String** | The ID of the user message item containing the audio. |  |
| **content_index** | **Integer** | The index of the content part containing the audio. |  |
| **transcript** | **String** | The transcribed text. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.new(
  event_id: null,
  type: null,
  item_id: null,
  content_index: null,
  transcript: null
)
```

