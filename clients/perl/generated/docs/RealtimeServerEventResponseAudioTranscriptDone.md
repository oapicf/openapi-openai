# WWW::OpenAPIClient::Object::RealtimeServerEventResponseAudioTranscriptDone

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RealtimeServerEventResponseAudioTranscriptDone;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | 
**type** | **string** | The event type, must be &#x60;response.audio_transcript.done&#x60;. | 
**response_id** | **string** | The ID of the response. | 
**item_id** | **string** | The ID of the item. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**transcript** | **string** | The final transcript of the audio. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


