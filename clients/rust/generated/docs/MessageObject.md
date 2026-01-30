# MessageObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | **String** | The object type, which is always `thread.message`. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the message was created. | 
**thread_id** | **String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**status** | **String** | The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. | 
**incomplete_details** | Option<[**models::MessageObjectIncompleteDetails**](MessageObject_incomplete_details.md)> |  | 
**completed_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the message was completed. | 
**incomplete_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**role** | **String** | The entity that produced the message. One of `user` or `assistant`. | 
**content** | [**Vec<models::MessageObjectContentInner>**](MessageObject_content_inner.md) | The content of the message in array of text and/or images. | 
**assistant_id** | Option<**String**> | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**run_id** | Option<**String**> | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. | 
**attachments** | Option<[**Vec<models::CreateMessageRequestAttachmentsInner>**](CreateMessageRequest_attachments_inner.md)> | A list of files attached to the message, and the tools they were added to. | 
**metadata** | Option<[**serde_json::Value**](.md)> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


