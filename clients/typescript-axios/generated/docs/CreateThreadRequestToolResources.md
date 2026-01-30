# CreateThreadRequestToolResources

A set of resources that are made available to the assistant\'s tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] [default to undefined]
**file_search** | [**CreateThreadRequestToolResourcesFileSearch**](CreateThreadRequestToolResourcesFileSearch.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateThreadRequestToolResources } from './api';

const instance: CreateThreadRequestToolResources = {
    code_interpreter,
    file_search,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
