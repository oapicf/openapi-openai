# CreateThreadAndRunRequestToolsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of tool being defined: &#x60;code_interpreter&#x60; | [default to undefined]
**file_search** | [**AssistantToolsFileSearchFileSearch**](AssistantToolsFileSearchFileSearch.md) |  | [optional] [default to undefined]
**_function** | [**FunctionObject**](FunctionObject.md) |  | [default to undefined]

## Example

```typescript
import { CreateThreadAndRunRequestToolsInner } from './api';

const instance: CreateThreadAndRunRequestToolsInner = {
    type,
    file_search,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
