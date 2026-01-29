# CreateTranscription200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **string** | The transcribed text. | [default to undefined]
**language** | **string** | The language of the input audio. | [default to undefined]
**duration** | **string** | The duration of the input audio. | [default to undefined]
**words** | [**Array&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] [default to undefined]
**segments** | [**Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] [default to undefined]

## Example

```typescript
import { CreateTranscription200Response } from './api';

const instance: CreateTranscription200Response = {
    text,
    language,
    duration,
    words,
    segments,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
