# openapi::ThreadObject

Represents a thread that contains [messages](/docs/api-reference/messages).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;thread&#x60;. | [Enum: [thread]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the thread was created. | 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 


