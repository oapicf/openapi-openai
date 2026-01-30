# openapi::MessageDeltaObjectDeltaContentInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the content part in the message. | 
**type** | **character** | Always &#x60;image_file&#x60;. | [Enum: [image_file, text, refusal, image_url]] 
**image_file** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObject_image_file.md) |  | [optional] 
**text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObject_text.md) |  | [optional] 
**refusal** | **character** |  | [optional] 
**image_url** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObject_image_url.md) |  | [optional] 


