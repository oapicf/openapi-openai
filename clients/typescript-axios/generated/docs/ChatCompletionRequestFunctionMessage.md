# ChatCompletionRequestFunctionMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **string** | The role of the messages author, in this case &#x60;function&#x60;. | [default to undefined]
**content** | **string** | The contents of the function message. | [default to undefined]
**name** | **string** | The name of the function to call. | [default to undefined]

## Example

```typescript
import { ChatCompletionRequestFunctionMessage } from './api';

const instance: ChatCompletionRequestFunctionMessage = {
    role,
    content,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
