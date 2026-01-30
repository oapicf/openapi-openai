
# CreateImageRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **prompt** | **kotlin.String** | A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;. |  |
| **model** | [**CreateImageRequestModel**](CreateImageRequestModel.md) |  |  [optional] |
| **n** | **kotlin.Int** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. |  [optional] |
| **quality** | [**inline**](#Quality) | The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;. |  [optional] |
| **responseFormat** | [**inline**](#ResponseFormat) | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. |  [optional] |
| **propertySize** | [**inline**](#PropertySize) | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models. |  [optional] |
| **style** | [**inline**](#Style) | The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;. |  [optional] |
| **user** | **kotlin.String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  |  [optional] |


<a id="Quality"></a>
## Enum: quality
| Name | Value |
| ---- | ----- |
| quality | standard, hd |


<a id="ResponseFormat"></a>
## Enum: response_format
| Name | Value |
| ---- | ----- |
| responseFormat | url, b64_json |


<a id="PropertySize"></a>
## Enum: size
| Name | Value |
| ---- | ----- |
| propertySize | 256x256, 512x512, 1024x1024, 1792x1024, 1024x1792 |


<a id="Style"></a>
## Enum: style
| Name | Value |
| ---- | ----- |
| style | vivid, natural |



