# ChatCompletionRequestDeveloperMessage

Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**ChatCompletionRequestDeveloperMessageContent**](ChatCompletionRequestDeveloperMessageContent.md) |  | [default to undefined]
**role** | **string** | The role of the messages author, in this case &#x60;developer&#x60;. | [default to undefined]
**name** | **string** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] [default to undefined]

## Example

```typescript
import { ChatCompletionRequestDeveloperMessage } from './api';

const instance: ChatCompletionRequestDeveloperMessage = {
    content,
    role,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
