# Org.OpenAPITools.Model.RealtimeServerEventResponseAudioTranscriptDone
Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.audio_transcript.done&#x60;. | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the item. | 
**OutputIndex** | **int** | The index of the output item in the response. | 
**ContentIndex** | **int** | The index of the content part in the item&#39;s content array. | 
**Transcript** | **string** | The final transcript of the audio. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

