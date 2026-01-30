
# MessageDeltaObjectDeltaContentInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **index** | **kotlin.Int** | The index of the content part in the message. |  |
| **type** | [**inline**](#Type) | Always &#x60;image_file&#x60;. |  |
| **imageFile** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  |  [optional] |
| **text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  |  [optional] |
| **refusal** | **kotlin.String** |  |  [optional] |
| **imageUrl** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | image_file, text, refusal, image_url |



