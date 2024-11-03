# CreateTranscriptionResponseVerboseJson

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **String!** | The language of the input audio. | [default to null]
**duration** | **String!** | The duration of the input audio. | [default to null]
**text** | **String!** | The transcribed text. | [default to null]
**words** | [**TranscriptionWord**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] [default to null]
**segments** | [**TranscriptionSegment**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


