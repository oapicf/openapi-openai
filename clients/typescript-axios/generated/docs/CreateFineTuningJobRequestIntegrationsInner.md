# CreateFineTuningJobRequestIntegrationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported.  | [default to undefined]
**wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  | [default to undefined]

## Example

```typescript
import { CreateFineTuningJobRequestIntegrationsInner } from './api';

const instance: CreateFineTuningJobRequestIntegrationsInner = {
    type,
    wandb,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
