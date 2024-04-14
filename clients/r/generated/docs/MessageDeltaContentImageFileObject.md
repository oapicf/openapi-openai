# openapi::MessageDeltaContentImageFileObject

References an image [File](/docs/api-reference/files) in the content of a message.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the content part in the message. | 
**type** | **character** | Always &#x60;image_file&#x60;. | [Enum: [image_file]] 
**image_file** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObject_image_file.md) |  | [optional] 


