

# Upload

The Upload object can accept byte chunks in the form of Parts. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Upload unique identifier, which can be referenced in API endpoints. | 
**createdAt** | **Int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | **String** | The name of the file to be uploaded. | 
**bytes** | **Int** | The intended number of bytes to be uploaded. | 
**purpose** | **String** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | [**Status**](#Status) | The status of the Upload. | 
**expiresAt** | **Int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**`object`** | [**`Object`**](#`Object`) | The object type, which is always \&quot;upload\&quot;. |  [optional]
**file** | [**OpenAIFile**](OpenAIFile.md) |  |  [optional]


## Enum: Status
Allowed values: [pending, completed, cancelled, expired]



## Enum: `Object`
Allowed values: [upload]




