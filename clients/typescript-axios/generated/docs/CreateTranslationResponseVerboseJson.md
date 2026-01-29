# CreateTranslationResponseVerboseJson


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **string** | The language of the output translation (always &#x60;english&#x60;). | [default to undefined]
**duration** | **string** | The duration of the input audio. | [default to undefined]
**text** | **string** | The translated text. | [default to undefined]
**segments** | [**Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] [default to undefined]

## Example

```typescript
import { CreateTranslationResponseVerboseJson } from './api';

const instance: CreateTranslationResponseVerboseJson = {
    language,
    duration,
    text,
    segments,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
