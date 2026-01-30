

# RealtimeServerEventResponseAudioTranscriptDelta

Returned when the model-generated transcription of audio output is updated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;response.audio_transcript.delta&#x60;. | 
**responseId** | **String** | The ID of the response. | 
**itemId** | **String** | The ID of the item. | 
**outputIndex** | **Int** | The index of the output item in the response. | 
**contentIndex** | **Int** | The index of the content part in the item&#39;s content array. | 
**delta** | **String** | The transcript delta. | 


## Enum: `Type`
Allowed values: [response.audio_transcript.delta]




