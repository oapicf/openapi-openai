# openapi::AssistantFileObject

A list of [Files](/docs/api-reference/files) attached to an `assistant`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;assistant.file&#x60;. | [Enum: [assistant.file]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the assistant file was created. | 
**assistant_id** | **character** | The assistant ID that the file is attached to. | 


