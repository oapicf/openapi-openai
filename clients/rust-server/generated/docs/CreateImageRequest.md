# CreateImageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**n** | **u8** | The number of images to generate. Must be between 1 and 10. | [optional] [default to Some(swagger::Nullable::Present(1))]
**size** | **String** | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. | [optional] [default to Some(swagger::Nullable::Present("1024x1024".to_string()))]
**response_format** | **String** | The format in which the generated images are returned. Must be one of `url` or `b64_json`. | [optional] [default to Some(swagger::Nullable::Present("url".to_string()))]
**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


