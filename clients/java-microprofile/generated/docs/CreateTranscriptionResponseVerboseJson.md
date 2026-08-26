

# CreateTranscriptionResponseVerboseJson

Represents a verbose json transcription response returned by model, based on the provided input.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | The language of the input audio. |  |
|**duration** | **String** | The duration of the input audio. |  |
|**text** | **String** | The transcribed text. |  |
|**words** | [**List&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. |  [optional] |
|**segments** | [**List&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. |  [optional] |



