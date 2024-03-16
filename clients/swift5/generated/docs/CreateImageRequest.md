# CreateImageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**n** | **Int** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
**size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to ._1024x1024]
**responseFormat** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to .url]
**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


