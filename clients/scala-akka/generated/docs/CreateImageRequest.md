

# CreateImageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**n** | **Int** | The number of images to generate. Must be between 1 and 10. |  [optional]
**size** | [**Size**](#Size) | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. |  [optional]
**responseFormat** | [**ResponseFormat**](#ResponseFormat) | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. |  [optional]
**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  [optional]


## Enum: Size
Allowed values: [256x256, 512x512, 1024x1024]



## Enum: ResponseFormat
Allowed values: [url, b64_json]




