# FineTuneMethod

The method used for fine-tuning.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. | [optional] [default to undefined]
**supervised** | [**FineTuneSupervisedMethod**](.md) |  | [optional] [default to undefined]
**dpo** | [**FineTuneDPOMethod**](.md) |  | [optional] [default to undefined]

## Example

```typescript
import { FineTuneMethod } from './api';

const instance: FineTuneMethod = {
    type,
    supervised,
    dpo,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
