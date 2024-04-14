# openapi::MessageDeltaObjectDelta

The delta containing the fields that have changed on the Message.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **character** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] [Enum: [user, assistant]] 
**content** | [**array[MessageDeltaObjectDeltaContentInner]**](MessageDeltaObject_delta_content_inner.md) | The content of the message in array of text and/or images. | [optional] 
**file_ids** | **array[character]** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] [default to []] [Max. items: 10] 


