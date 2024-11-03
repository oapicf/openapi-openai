# # CreateTranscription200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **string** | The transcribed text. |
**language** | **string** | The language of the input audio. |
**duration** | **string** | The duration of the input audio. |
**words** | [**\OpenAPI\Client\Model\TranscriptionWord[]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional]
**segments** | [**\OpenAPI\Client\Model\TranscriptionSegment[]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
