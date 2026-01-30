# CreateThreadAndRunRequestToolResources

A set of resources that are used by the assistant\'s tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] [default to undefined]
**file_search** | [**AssistantObjectToolResourcesFileSearch**](AssistantObjectToolResourcesFileSearch.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateThreadAndRunRequestToolResources } from './api';

const instance: CreateThreadAndRunRequestToolResources = {
    code_interpreter,
    file_search,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
