# MessageObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | [***models::MessageObjectObject**](MessageObject_object.md) |  | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the message was created. | 
**thread_id** | **String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**status** | [***models::MessageObjectStatus**](MessageObject_status.md) |  | 
**incomplete_details** | [***swagger::Nullable<models::MessageObjectIncompleteDetails>**](MessageObject_incomplete_details.md) |  | 
**completed_at** | **i32** | The Unix timestamp (in seconds) for when the message was completed. | 
**incomplete_at** | **i32** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**role** | [***models::MessageObjectRole**](MessageObject_role.md) |  | 
**content** | [**Vec<models::MessageObjectContentInner>**](MessageObject_content_inner.md) | The content of the message in array of text and/or images. | 
**assistant_id** | **swagger::Nullable<String>** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**run_id** | **swagger::Nullable<String>** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. | 
**file_ids** | **Vec<String>** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | 
**metadata** | [***serde_json::Value**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


