# ChatCompletionRequestUserMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**ChatCompletionRequestUserMessageContent**](ChatCompletionRequestUserMessageContent.md) |  | [default to undefined]
**role** | **string** | The role of the messages author, in this case &#x60;user&#x60;. | [default to undefined]
**name** | **string** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] [default to undefined]

## Example

```typescript
import { ChatCompletionRequestUserMessage } from './api';

const instance: ChatCompletionRequestUserMessage = {
    content,
    role,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
