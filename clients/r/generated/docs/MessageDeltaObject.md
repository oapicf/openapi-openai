# openapi::MessageDeltaObject

Represents a message delta i.e. any changed fields on a message during streaming. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier of the message, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;thread.message.delta&#x60;. | [Enum: [thread.message.delta]] 
**delta** | [**MessageDeltaObjectDelta**](MessageDeltaObject_delta.md) |  | 


