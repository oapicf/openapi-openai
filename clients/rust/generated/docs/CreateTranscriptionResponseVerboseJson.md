# CreateTranscriptionResponseVerboseJson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **String** | The language of the input audio. | 
**duration** | **String** | The duration of the input audio. | 
**text** | **String** | The transcribed text. | 
**words** | Option<[**Vec<models::TranscriptionWord>**](TranscriptionWord.md)> | Extracted words and their corresponding timestamps. | [optional]
**segments** | Option<[**Vec<models::TranscriptionSegment>**](TranscriptionSegment.md)> | Segments of the transcribed text and their corresponding details. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


