# Model

Describes an OpenAI model offering that can be used with the API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The model identifier, which can be referenced in the API endpoints. | [default to undefined]
**created** | **number** | The Unix timestamp (in seconds) when the model was created. | [default to undefined]
**object** | **string** | The object type, which is always \&quot;model\&quot;. | [default to undefined]
**owned_by** | **string** | The organization that owns the model. | [default to undefined]

## Example

```typescript
import { Model } from './api';

const instance: Model = {
    id,
    created,
    object,
    owned_by,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
