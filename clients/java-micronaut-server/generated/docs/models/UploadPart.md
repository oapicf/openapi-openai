

# UploadPart

The upload Part represents a chunk of bytes we can add to an Upload object. 

The class is defined in **[UploadPart.java](../../src/main/java/org/openapitools/model/UploadPart.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The upload Part unique identifier, which can be referenced in API endpoints. | 
**createdAt** | `Integer` | The Unix timestamp (in seconds) for when the Part was created. | 
**uploadId** | `String` | The ID of the Upload object that this Part was added to. | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;upload.part&#x60;. | 




## ObjectEnum

Name | Value
---- | -----
UPLOAD_PART | `"upload.part"`


