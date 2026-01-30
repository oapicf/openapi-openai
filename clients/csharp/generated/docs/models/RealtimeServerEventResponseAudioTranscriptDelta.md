# Org.OpenAPITools.Model.RealtimeServerEventResponseAudioTranscriptDelta
Returned when the model-generated transcription of audio output is updated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.audio_transcript.delta&#x60;. | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the item. | 
**OutputIndex** | **int** | The index of the output item in the response. | 
**ContentIndex** | **int** | The index of the content part in the item&#39;s content array. | 
**Delta** | **string** | The transcript delta. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

