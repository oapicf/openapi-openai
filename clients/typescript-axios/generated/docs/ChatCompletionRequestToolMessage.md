# ChatCompletionRequestToolMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **string** | The role of the messages author, in this case &#x60;tool&#x60;. | [default to undefined]
**content** | [**ChatCompletionRequestToolMessageContent**](ChatCompletionRequestToolMessageContent.md) |  | [default to undefined]
**tool_call_id** | **string** | Tool call that this message is responding to. | [default to undefined]

## Example

```typescript
import { ChatCompletionRequestToolMessage } from './api';

const instance: ChatCompletionRequestToolMessage = {
    role,
    content,
    tool_call_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
