# ChatCompletionRequestUserMessageContentPart


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of the content part. | [default to undefined]
**text** | **string** | The text content. | [default to undefined]
**image_url** | [**ChatCompletionRequestMessageContentPartImageImageUrl**](ChatCompletionRequestMessageContentPartImageImageUrl.md) |  | [default to undefined]
**input_audio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | [default to undefined]

## Example

```typescript
import { ChatCompletionRequestUserMessageContentPart } from './api';

const instance: ChatCompletionRequestUserMessageContentPart = {
    type,
    text,
    image_url,
    input_audio,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
