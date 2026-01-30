

# UploadPart

The upload Part represents a chunk of bytes we can add to an Upload object. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The upload Part unique identifier, which can be referenced in API endpoints. | 
**createdAt** | **Int** | The Unix timestamp (in seconds) for when the Part was created. | 
**uploadId** | **String** | The ID of the Upload object that this Part was added to. | 
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;upload.part&#x60;. | 


## Enum: `Object`
Allowed values: [upload.part]




