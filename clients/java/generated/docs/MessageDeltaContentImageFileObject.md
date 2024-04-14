

# MessageDeltaContentImageFileObject

References an image [File](/docs/api-reference/files) in the content of a message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index of the content part in the message. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;image_file&#x60;. |  |
|**imageFile** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMAGE_FILE | &quot;image_file&quot; |



