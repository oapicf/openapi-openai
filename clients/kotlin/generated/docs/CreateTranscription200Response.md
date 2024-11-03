
# CreateTranscription200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | **kotlin.String** | The transcribed text. |  |
| **language** | **kotlin.String** | The language of the input audio. |  |
| **duration** | **kotlin.String** | The duration of the input audio. |  |
| **words** | [**kotlin.collections.List&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. |  [optional] |
| **segments** | [**kotlin.collections.List&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. |  [optional] |



