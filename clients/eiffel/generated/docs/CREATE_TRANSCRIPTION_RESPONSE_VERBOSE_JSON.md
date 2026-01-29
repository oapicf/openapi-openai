# CREATE_TRANSCRIPTION_RESPONSE_VERBOSE_JSON

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | [**STRING_32**](STRING_32.md) | The language of the input audio. | [default to null]
**duration** | [**STRING_32**](STRING_32.md) | The duration of the input audio. | [default to null]
**text** | [**STRING_32**](STRING_32.md) | The transcribed text. | [default to null]
**words** | [**LIST [TRANSCRIPTION_WORD]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] [default to null]
**segments** | [**LIST [TRANSCRIPTION_SEGMENT]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


