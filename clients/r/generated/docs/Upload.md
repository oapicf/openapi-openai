# openapi::Upload

The Upload object can accept byte chunks in the form of Parts. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The Upload unique identifier, which can be referenced in API endpoints. | 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | **character** | The name of the file to be uploaded. | 
**bytes** | **integer** | The intended number of bytes to be uploaded. | 
**purpose** | **character** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | **character** | The status of the Upload. | [Enum: [pending, completed, cancelled, expired]] 
**expires_at** | **integer** | The Unix timestamp (in seconds) for when the Upload was created. | 
**object** | **character** | The object type, which is always \&quot;upload\&quot;. | [optional] [Enum: [upload]] 
**file** | [**OpenAIFile**](OpenAIFile.md) |  | [optional] 


