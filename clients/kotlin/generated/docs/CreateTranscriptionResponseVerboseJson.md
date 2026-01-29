
# CreateTranscriptionResponseVerboseJson

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **language** | **kotlin.String** | The language of the input audio. |  |
| **duration** | **kotlin.String** | The duration of the input audio. |  |
| **text** | **kotlin.String** | The transcribed text. |  |
| **words** | [**kotlin.collections.List&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. |  [optional] |
| **segments** | [**kotlin.collections.List&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. |  [optional] |



