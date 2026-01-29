# WWW::OpenAPIClient::Object::CreateTranscription200Response

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CreateTranscription200Response;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **string** | The transcribed text. | 
**language** | **string** | The language of the input audio. | 
**duration** | **string** | The duration of the input audio. | 
**words** | [**ARRAY[TranscriptionWord]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**segments** | [**ARRAY[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


