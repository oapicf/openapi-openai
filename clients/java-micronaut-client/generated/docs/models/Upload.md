

# Upload

The Upload object can accept byte chunks in the form of Parts. 

The class is defined in **[Upload.java](../../src/main/java/org/openapitools/model/Upload.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The Upload unique identifier, which can be referenced in API endpoints. | 
**createdAt** | `Integer` | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | `String` | The name of the file to be uploaded. | 
**bytes** | `Integer` | The intended number of bytes to be uploaded. | 
**purpose** | `String` | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the Upload. | 
**expiresAt** | `Integer` | The Unix timestamp (in seconds) for when the Upload was created. | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always \&quot;upload\&quot;. |  [optional property]
**_file** | [`OpenAIFile`](OpenAIFile.md) |  |  [optional property]






## StatusEnum

Name | Value
---- | -----
PENDING | `"pending"`
COMPLETED | `"completed"`
CANCELLED | `"cancelled"`
EXPIRED | `"expired"`


## ObjectEnum

Name | Value
---- | -----
UPLOAD | `"upload"`



