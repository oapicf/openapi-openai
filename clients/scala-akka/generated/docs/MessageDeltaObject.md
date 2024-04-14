

# MessageDeltaObject

Represents a message delta i.e. any changed fields on a message during streaming. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the message, which can be referenced in API endpoints. | 
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;thread.message.delta&#x60;. | 
**delta** | [**MessageDeltaObjectDelta**](MessageDeltaObjectDelta.md) |  | 


## Enum: `Object`
Allowed values: [thread.message.delta]




