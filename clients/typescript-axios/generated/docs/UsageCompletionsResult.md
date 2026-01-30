# UsageCompletionsResult

The aggregated completions usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | [default to undefined]
**input_tokens** | **number** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | [default to undefined]
**input_cached_tokens** | **number** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] [default to undefined]
**output_tokens** | **number** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | [default to undefined]
**input_audio_tokens** | **number** | The aggregated number of audio input tokens used, including cached tokens. | [optional] [default to undefined]
**output_audio_tokens** | **number** | The aggregated number of audio output tokens used. | [optional] [default to undefined]
**num_model_requests** | **number** | The count of requests made to the model. | [default to undefined]
**project_id** | **string** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] [default to undefined]
**user_id** | **string** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] [default to undefined]
**api_key_id** | **string** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] [default to undefined]
**model** | **string** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] [default to undefined]
**batch** | **boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] [default to undefined]

## Example

```typescript
import { UsageCompletionsResult } from './api';

const instance: UsageCompletionsResult = {
    object,
    input_tokens,
    input_cached_tokens,
    output_tokens,
    input_audio_tokens,
    output_audio_tokens,
    num_model_requests,
    project_id,
    user_id,
    api_key_id,
    model,
    batch,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
