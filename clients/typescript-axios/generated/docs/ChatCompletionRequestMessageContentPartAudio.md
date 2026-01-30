# ChatCompletionRequestMessageContentPartAudio

Learn about [audio inputs](/docs/guides/audio). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of the content part. Always &#x60;input_audio&#x60;. | [default to undefined]
**input_audio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | [default to undefined]

## Example

```typescript
import { ChatCompletionRequestMessageContentPartAudio } from './api';

const instance: ChatCompletionRequestMessageContentPartAudio = {
    type,
    input_audio,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
