# UsageTimeBucketResultInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | [default to undefined]
**input_tokens** | **number** | The aggregated number of input tokens used. | [default to undefined]
**input_cached_tokens** | **number** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] [default to undefined]
**output_tokens** | **number** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | [default to undefined]
**input_audio_tokens** | **number** | The aggregated number of audio input tokens used, including cached tokens. | [optional] [default to undefined]
**output_audio_tokens** | **number** | The aggregated number of audio output tokens used. | [optional] [default to undefined]
**num_model_requests** | **number** | The count of requests made to the model. | [default to undefined]
**project_id** | **string** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] [default to undefined]
**user_id** | **string** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] [default to undefined]
**api_key_id** | **string** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] [default to undefined]
**model** | **string** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] [default to undefined]
**batch** | **boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] [default to undefined]
**images** | **number** | The number of images processed. | [default to undefined]
**source** | **string** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] [default to undefined]
**size** | **string** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] [default to undefined]
**characters** | **number** | The number of characters processed. | [default to undefined]
**seconds** | **number** | The number of seconds processed. | [default to undefined]
**usage_bytes** | **number** | The vector stores usage in bytes. | [default to undefined]
**sessions** | **number** | The number of code interpreter sessions. | [default to undefined]
**amount** | [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] [default to undefined]
**line_item** | **string** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] [default to undefined]

## Example

```typescript
import { UsageTimeBucketResultInner } from './api';

const instance: UsageTimeBucketResultInner = {
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
    images,
    source,
    size,
    characters,
    seconds,
    usage_bytes,
    sessions,
    amount,
    line_item,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
