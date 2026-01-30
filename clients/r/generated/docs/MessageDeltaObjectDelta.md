# openapi::MessageDeltaObjectDelta

The delta containing the fields that have changed on the Message.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **character** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] [Enum: [user, assistant]] 
**content** | [**array[MessageDeltaObjectDeltaContentInner]**](MessageDeltaObject_delta_content_inner.md) | The content of the message in array of text and/or images. | [optional] 


