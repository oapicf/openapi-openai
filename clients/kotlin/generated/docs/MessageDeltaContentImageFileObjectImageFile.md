
# MessageDeltaContentImageFileObjectImageFile

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String** | The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content. |  [optional] |
| **detail** | [**inline**](#Detail) | Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. |  [optional] |


<a id="Detail"></a>
## Enum: detail
| Name | Value |
| ---- | ----- |
| detail | auto, low, high |



