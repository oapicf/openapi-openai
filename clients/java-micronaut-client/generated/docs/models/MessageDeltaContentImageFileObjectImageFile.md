

# MessageDeltaContentImageFileObjectImageFile

The class is defined in **[MessageDeltaContentImageFileObjectImageFile.java](../../src/main/java/org/openapitools/model/MessageDeltaContentImageFileObjectImageFile.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | `String` | The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content. |  [optional property]
**detail** | [**DetailEnum**](#DetailEnum) | Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. |  [optional property]


## DetailEnum

Name | Value
---- | -----
AUTO | `"auto"`
LOW | `"low"`
HIGH | `"high"`


