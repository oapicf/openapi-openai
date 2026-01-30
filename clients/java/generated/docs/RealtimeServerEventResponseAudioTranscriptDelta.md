

# RealtimeServerEventResponseAudioTranscriptDelta

Returned when the model-generated transcription of audio output is updated. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.audio_transcript.delta&#x60;. |  |
|**responseId** | **String** | The ID of the response. |  |
|**itemId** | **String** | The ID of the item. |  |
|**outputIndex** | **Integer** | The index of the output item in the response. |  |
|**contentIndex** | **Integer** | The index of the content part in the item&#39;s content array. |  |
|**delta** | **String** | The transcript delta. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESPONSE_AUDIO_TRANSCRIPT_DELTA | &quot;response.audio_transcript.delta&quot; |



