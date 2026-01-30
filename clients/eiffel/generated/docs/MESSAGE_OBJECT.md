# MESSAGE_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;thread.message&#x60;. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the message was created. | [default to null]
**thread_id** | [**STRING_32**](STRING_32.md) | The [thread](/docs/api-reference/threads) ID that this message belongs to. | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | [default to null]
**incomplete_details** | [**MESSAGE_OBJECT_INCOMPLETE_DETAILS**](MessageObject_incomplete_details.md) |  | [default to null]
**completed_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the message was completed. | [default to null]
**incomplete_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | [default to null]
**role** | [**STRING_32**](STRING_32.md) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [default to null]
**content** | [**LIST [MESSAGE_OBJECT_CONTENT_INNER]**](MessageObject_content_inner.md) | The content of the message in array of text and/or images. | [default to null]
**assistant_id** | [**STRING_32**](STRING_32.md) | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | [default to null]
**run_id** | [**STRING_32**](STRING_32.md) | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | [default to null]
**attachments** | [**LIST [CREATE_MESSAGE_REQUEST_ATTACHMENTS_INNER]**](CreateMessageRequest_attachments_inner.md) | A list of files attached to the message, and the tools they were added to. | [default to null]
**metadata** | [**ANY**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


