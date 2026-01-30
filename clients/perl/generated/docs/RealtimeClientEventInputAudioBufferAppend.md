# WWW::OpenAPIClient::Object::RealtimeClientEventInputAudioBufferAppend

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RealtimeClientEventInputAudioBufferAppend;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **string** | The event type, must be &#x60;input_audio_buffer.append&#x60;. | 
**audio** | **string** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


