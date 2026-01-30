# OpenapiOpenai.MessageDeltaObjectDeltaContentInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Number** | The index of the content part in the message. | 
**type** | **String** | Always &#x60;image_file&#x60;. | 
**imageFile** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] 
**text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] 
**refusal** | **String** |  | [optional] 
**imageUrl** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] 



## Enum: TypeEnum


* `image_file` (value: `"image_file"`)

* `text` (value: `"text"`)

* `refusal` (value: `"refusal"`)

* `image_url` (value: `"image_url"`)




