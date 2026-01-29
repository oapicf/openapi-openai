

# MessageDeltaObject

Represents a message delta i.e. any changed fields on a message during streaming. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of the message, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.message.delta&#x60;. |  |
|**delta** | [**MessageDeltaObjectDelta**](MessageDeltaObjectDelta.md) |  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| THREAD_MESSAGE_DELTA | &quot;thread.message.delta&quot; |



