# openapi::UploadPart

The upload Part represents a chunk of bytes we can add to an Upload object. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The upload Part unique identifier, which can be referenced in API endpoints. | 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the Part was created. | 
**upload_id** | **character** | The ID of the Upload object that this Part was added to. | 
**object** | **character** | The object type, which is always &#x60;upload.part&#x60;. | [Enum: [upload.part]] 


