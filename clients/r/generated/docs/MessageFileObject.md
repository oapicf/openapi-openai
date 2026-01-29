# openapi::MessageFileObject

A list of files attached to a `message`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;thread.message.file&#x60;. | [Enum: [thread.message.file]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the message file was created. | 
**message_id** | **character** | The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. | 


