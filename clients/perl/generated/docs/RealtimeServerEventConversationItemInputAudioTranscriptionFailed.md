# WWW::OpenAPIClient::Object::RealtimeServerEventConversationItemInputAudioTranscriptionFailed

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RealtimeServerEventConversationItemInputAudioTranscriptionFailed;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | 
**type** | **string** | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | 
**item_id** | **string** | The ID of the user message item. | 
**content_index** | **int** | The index of the content part containing the audio. | 
**error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


