# ModifyAssistantRequestToolResources

A set of resources that are used by the assistant\'s tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**ModifyAssistantRequestToolResourcesCodeInterpreter**](ModifyAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] [default to undefined]
**file_search** | [**ModifyAssistantRequestToolResourcesFileSearch**](ModifyAssistantRequestToolResourcesFileSearch.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ModifyAssistantRequestToolResources } from './api';

const instance: ModifyAssistantRequestToolResources = {
    code_interpreter,
    file_search,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
