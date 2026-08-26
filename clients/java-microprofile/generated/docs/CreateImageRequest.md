

# CreateImageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;. |  |
|**model** | [**CreateImageRequestModel**](CreateImageRequestModel.md) |  |  [optional] |
|**n** | **Integer** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. |  [optional] |
|**quality** | [**QualityEnum**](#QualityEnum) | The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;. |  [optional] |
|**responseFormat** | [**ResponseFormatEnum**](#ResponseFormatEnum) | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models. |  [optional] |
|**style** | [**StyleEnum**](#StyleEnum) | The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;. |  [optional] |
|**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  |  [optional] |



## Enum: QualityEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| HD | &quot;hd&quot; |



## Enum: ResponseFormatEnum

| Name | Value |
|---- | -----|
| URL | &quot;url&quot; |
| B64_JSON | &quot;b64_json&quot; |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| _256X256 | &quot;256x256&quot; |
| _512X512 | &quot;512x512&quot; |
| _1024X1024 | &quot;1024x1024&quot; |
| _1792X1024 | &quot;1792x1024&quot; |
| _1024X1792 | &quot;1024x1792&quot; |



## Enum: StyleEnum

| Name | Value |
|---- | -----|
| VIVID | &quot;vivid&quot; |
| NATURAL | &quot;natural&quot; |



