

# MessageContentImageUrlObjectImageUrl

The class is defined in **[MessageContentImageUrlObjectImageUrl.java](../../src/main/java/org/openapitools/model/MessageContentImageUrlObjectImageUrl.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | `URI` | The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. | 
**detail** | [**DetailEnum**](#DetailEnum) | Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. Default value is &#x60;auto&#x60; |  [optional property]


## DetailEnum

Name | Value
---- | -----
AUTO | `"auto"`
LOW | `"low"`
HIGH | `"high"`


