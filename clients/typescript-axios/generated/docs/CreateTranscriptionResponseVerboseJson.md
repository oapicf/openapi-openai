# CreateTranscriptionResponseVerboseJson

Represents a verbose json transcription response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **string** | The language of the input audio. | [default to undefined]
**duration** | **string** | The duration of the input audio. | [default to undefined]
**text** | **string** | The transcribed text. | [default to undefined]
**words** | [**Array&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] [default to undefined]
**segments** | [**Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] [default to undefined]

## Example

```typescript
import { CreateTranscriptionResponseVerboseJson } from './api';

const instance: CreateTranscriptionResponseVerboseJson = {
    language,
    duration,
    text,
    words,
    segments,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
