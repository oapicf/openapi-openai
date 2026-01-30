

# MessageDeltaContentImageFileObjectImageFile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **String** | The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content. |  [optional] |
|**detail** | [**DetailEnum**](#DetailEnum) | Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. |  [optional] |



## Enum: DetailEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| LOW | &quot;low&quot; |
| HIGH | &quot;high&quot; |



