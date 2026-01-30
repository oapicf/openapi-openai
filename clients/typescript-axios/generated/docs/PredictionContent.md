# PredictionContent

Static predicted output content, such as the content of a text file that is being regenerated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.  | [default to undefined]
**content** | [**PredictionContentContent**](PredictionContentContent.md) |  | [default to undefined]

## Example

```typescript
import { PredictionContent } from './api';

const instance: PredictionContent = {
    type,
    content,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
