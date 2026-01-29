# CreateTranslation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **string** | The translated text. | [default to undefined]
**language** | **string** | The language of the output translation (always &#x60;english&#x60;). | [default to undefined]
**duration** | **string** | The duration of the input audio. | [default to undefined]
**segments** | [**Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] [default to undefined]

## Example

```typescript
import { CreateTranslation200Response } from './api';

const instance: CreateTranslation200Response = {
    text,
    language,
    duration,
    segments,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
