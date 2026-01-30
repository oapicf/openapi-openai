# CreateMessageRequestAttachmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **string** | The ID of the file to attach to the message. | [optional] [default to undefined]
**tools** | [**Array&lt;CreateMessageRequestAttachmentsInnerToolsInner&gt;**](CreateMessageRequestAttachmentsInnerToolsInner.md) | The tools to add this file to. | [optional] [default to undefined]

## Example

```typescript
import { CreateMessageRequestAttachmentsInner } from './api';

const instance: CreateMessageRequestAttachmentsInner = {
    file_id,
    tools,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
