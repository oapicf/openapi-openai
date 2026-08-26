# CreateMessageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [***models::CreateMessageRequestRole**](CreateMessageRequest_role.md) |  | 
**content** | [***models::CreateMessageRequestContent**](CreateMessageRequest_content.md) |  | 
**attachments** | [**swagger::Nullable<Vec<models::CreateMessageRequestAttachmentsInner>>**](CreateMessageRequest_attachments_inner.md) | A list of files attached to the message, and the tools they should be added to. | [optional] [default to None]
**metadata** | [***serde_json::Value**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


