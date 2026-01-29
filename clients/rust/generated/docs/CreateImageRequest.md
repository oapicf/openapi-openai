# CreateImageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. | 
**model** | Option<[**models::CreateImageRequestModel**](CreateImageRequest_model.md)> |  | [optional]
**n** | Option<**i32**> | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. | [optional][default to 1]
**quality** | Option<**String**> | The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. | [optional][default to Standard]
**response_format** | Option<**String**> | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. | [optional][default to Url]
**size** | Option<**String**> | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. | [optional][default to Variant1024x1024]
**style** | Option<**String**> | The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. | [optional][default to Vivid]
**user** | Option<**String**> | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


