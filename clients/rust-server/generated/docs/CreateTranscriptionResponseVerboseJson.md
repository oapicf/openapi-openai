# CreateTranscriptionResponseVerboseJson

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **String** | The language of the input audio. | 
**duration** | **String** | The duration of the input audio. | 
**text** | **String** | The transcribed text. | 
**words** | [**Vec<models::TranscriptionWord>**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] [default to None]
**segments** | [**Vec<models::TranscriptionSegment>**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


