# UsageAudioTranscriptionsResult

The aggregated audio transcriptions usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | [default to undefined]
**seconds** | **number** | The number of seconds processed. | [default to undefined]
**num_model_requests** | **number** | The count of requests made to the model. | [default to undefined]
**project_id** | **string** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] [default to undefined]
**user_id** | **string** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] [default to undefined]
**api_key_id** | **string** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] [default to undefined]
**model** | **string** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] [default to undefined]

## Example

```typescript
import { UsageAudioTranscriptionsResult } from './api';

const instance: UsageAudioTranscriptionsResult = {
    object,
    seconds,
    num_model_requests,
    project_id,
    user_id,
    api_key_id,
    model,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
