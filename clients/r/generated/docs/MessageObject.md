# openapi::MessageObject

Represents a message within a [thread](/docs/api-reference/threads).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;thread.message&#x60;. | [Enum: [thread.message]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the message was created. | 
**thread_id** | **character** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**status** | **character** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | [Enum: [in_progress, incomplete, completed]] 
**incomplete_details** | [**MessageObjectIncompleteDetails**](MessageObject_incomplete_details.md) |  | 
**completed_at** | **integer** | The Unix timestamp (in seconds) for when the message was completed. | 
**incomplete_at** | **integer** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**role** | **character** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [Enum: [user, assistant]] 
**content** | [**array[MessageObjectContentInner]**](MessageObject_content_inner.md) | The content of the message in array of text and/or images. | 
**assistant_id** | **character** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**run_id** | **character** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**file_ids** | **array[character]** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [default to []] [Max. items: 10] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 


