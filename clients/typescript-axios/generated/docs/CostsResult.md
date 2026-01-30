# CostsResult

The aggregated costs details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | [default to undefined]
**amount** | [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] [default to undefined]
**line_item** | **string** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] [default to undefined]
**project_id** | **string** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] [default to undefined]

## Example

```typescript
import { CostsResult } from './api';

const instance: CostsResult = {
    object,
    amount,
    line_item,
    project_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
