# Org.OpenAPITools.Model.CreateImageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**N** | **int?** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
**Size** | **string** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to SizeEnum._1024x1024]
**ResponseFormat** | **string** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to ResponseFormatEnum.Url]
**User** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

