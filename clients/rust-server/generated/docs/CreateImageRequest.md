# CreateImageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. | 
**model** | [***swagger::Nullable<models::CreateImageRequestModel>**](CreateImageRequest_model.md) |  | [optional] [default to None]
**n** | **u8** | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. | [optional] [default to Some(swagger::Nullable::Present(1))]
**quality** | [***models::CreateImageRequestQuality**](CreateImageRequest_quality.md) |  | [optional] [default to None]
**response_format** | [***swagger::Nullable<models::CreateImageEditRequestResponseFormat>**](CreateImageEditRequest_response_format.md) |  | [optional] [default to None]
**size** | [***swagger::Nullable<models::CreateImageRequestSize>**](CreateImageRequest_size.md) |  | [optional] [default to None]
**style** | [***swagger::Nullable<models::CreateImageRequestStyle>**](CreateImageRequest_style.md) |  | [optional] [default to None]
**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


