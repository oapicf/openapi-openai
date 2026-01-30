# RunStepDetailsToolCallsFileSearchResultObject

A result instance of the file search.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **string** | The ID of the file that result was found in. | [default to undefined]
**file_name** | **string** | The name of the file that result was found in. | [default to undefined]
**score** | **number** | The score of the result. All values must be a floating point number between 0 and 1. | [default to undefined]
**content** | [**Array&lt;RunStepDetailsToolCallsFileSearchResultObjectContentInner&gt;**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] [default to undefined]

## Example

```typescript
import { RunStepDetailsToolCallsFileSearchResultObject } from './api';

const instance: RunStepDetailsToolCallsFileSearchResultObject = {
    file_id,
    file_name,
    score,
    content,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
