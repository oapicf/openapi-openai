# CreateThreadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**Array&lt;CreateMessageRequest&gt;**](CreateMessageRequest.md) | A list of [messages](/docs/api-reference/messages) to start the thread with. | [optional] [default to undefined]
**tool_resources** | [**CreateThreadRequestToolResources**](CreateThreadRequestToolResources.md) |  | [optional] [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to undefined]

## Example

```typescript
import { CreateThreadRequest } from './api';

const instance: CreateThreadRequest = {
    messages,
    tool_resources,
    metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
