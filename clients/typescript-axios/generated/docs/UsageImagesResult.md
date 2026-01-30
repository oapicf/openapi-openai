# UsageImagesResult

The aggregated images usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | [default to undefined]
**images** | **number** | The number of images processed. | [default to undefined]
**num_model_requests** | **number** | The count of requests made to the model. | [default to undefined]
**source** | **string** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] [default to undefined]
**size** | **string** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] [default to undefined]
**project_id** | **string** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] [default to undefined]
**user_id** | **string** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] [default to undefined]
**api_key_id** | **string** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] [default to undefined]
**model** | **string** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] [default to undefined]

## Example

```typescript
import { UsageImagesResult } from './api';

const instance: UsageImagesResult = {
    object,
    images,
    num_model_requests,
    source,
    size,
    project_id,
    user_id,
    api_key_id,
    model,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
