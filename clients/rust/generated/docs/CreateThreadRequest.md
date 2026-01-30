# CreateThreadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | Option<[**Vec<models::CreateMessageRequest>**](CreateMessageRequest.md)> | A list of [messages](/docs/api-reference/messages) to start the thread with. | [optional]
**tool_resources** | Option<[**models::CreateThreadRequestToolResources**](CreateThreadRequest_tool_resources.md)> |  | [optional]
**metadata** | Option<[**serde_json::Value**](.md)> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


