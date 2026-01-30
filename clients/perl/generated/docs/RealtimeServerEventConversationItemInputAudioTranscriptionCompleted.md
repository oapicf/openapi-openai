# WWW::OpenAPIClient::Object::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | 
**type** | **string** | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  | 
**item_id** | **string** | The ID of the user message item containing the audio. | 
**content_index** | **int** | The index of the content part containing the audio. | 
**transcript** | **string** | The transcribed text. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


