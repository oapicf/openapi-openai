

# MessageDeltaObjectDeltaContentInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index of the content part in the message. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;image_file&#x60;. |  |
|**imageFile** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  |  [optional] |
|**text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  |  [optional] |
|**refusal** | **String** |  |  [optional] |
|**imageUrl** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMAGE_FILE | &quot;image_file&quot; |
| TEXT | &quot;text&quot; |
| REFUSAL | &quot;refusal&quot; |
| IMAGE_URL | &quot;image_url&quot; |



