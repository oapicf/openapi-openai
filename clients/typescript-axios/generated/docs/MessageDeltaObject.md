# MessageDeltaObject

Represents a message delta i.e. any changed fields on a message during streaming. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier of the message, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;thread.message.delta&#x60;. | [default to undefined]
**delta** | [**MessageDeltaObjectDelta**](MessageDeltaObjectDelta.md) |  | [default to undefined]

## Example

```typescript
import { MessageDeltaObject } from './api';

const instance: MessageDeltaObject = {
    id,
    object,
    delta,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
