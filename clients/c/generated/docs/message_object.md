# message_object_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The identifier, which can be referenced in API endpoints. | 
**object** | **openai_api_message_object_OBJECT_e** | The object type, which is always &#x60;thread.message&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the message was created. | 
**thread_id** | **char \*** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**status** | **openai_api_message_object_STATUS_e** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | 
**incomplete_details** | [**message_object_incomplete_details_t**](message_object_incomplete_details.md) \* |  | 
**completed_at** | **int** | The Unix timestamp (in seconds) for when the message was completed. | 
**incomplete_at** | **int** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**role** | **openai_api_message_object_ROLE_e** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | 
**content** | [**list_t**](message_object_content_inner.md) \* | The content of the message in array of text and/or images. | 
**assistant_id** | **char \*** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**run_id** | **char \*** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**file_ids** | **list_t \*** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | 
**metadata** | [**object_t**](.md) \* | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


