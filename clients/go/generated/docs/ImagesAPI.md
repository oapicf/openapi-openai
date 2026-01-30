# \ImagesAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateImage**](ImagesAPI.md#CreateImage) | **Post** /images/generations | Creates an image given a prompt.
[**CreateImageEdit**](ImagesAPI.md#CreateImageEdit) | **Post** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**CreateImageVariation**](ImagesAPI.md#CreateImageVariation) | **Post** /images/variations | Creates a variation of a given image.



## CreateImage

> ImagesResponse CreateImage(ctx).CreateImageRequest(createImageRequest).Execute()

Creates an image given a prompt.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	createImageRequest := *openapiclient.NewCreateImageRequest("A cute baby sea otter") // CreateImageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ImagesAPI.CreateImage(context.Background()).CreateImageRequest(createImageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ImagesAPI.CreateImage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateImage`: ImagesResponse
	fmt.Fprintf(os.Stdout, "Response from `ImagesAPI.CreateImage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateImageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md) |  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateImageEdit

> ImagesResponse CreateImageEdit(ctx).Image(image).Prompt(prompt).Mask(mask).Model(model).N(n).Size(size).ResponseFormat(responseFormat).User(user).Execute()

Creates an edited or extended image given an original image and a prompt.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	image := os.NewFile(1234, "some_file") // *os.File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
	prompt := "prompt_example" // string | A text description of the desired image(s). The maximum length is 1000 characters.
	mask := os.NewFile(1234, "some_file") // *os.File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
	model := *openapiclient.NewCreateImageEditRequestModel() // CreateImageEditRequestModel |  (optional) (default to dall-e-2)
	n := int32(56) // int32 | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
	size := "size_example" // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
	responseFormat := "responseFormat_example" // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to "url")
	user := "user_example" // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ImagesAPI.CreateImageEdit(context.Background()).Image(image).Prompt(prompt).Mask(mask).Model(model).N(n).Size(size).ResponseFormat(responseFormat).User(user).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ImagesAPI.CreateImageEdit``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateImageEdit`: ImagesResponse
	fmt.Fprintf(os.Stdout, "Response from `ImagesAPI.CreateImageEdit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateImageEditRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | ***os.File** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | ***os.File** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [default to dall-e-2]
 **n** | **int32** | The number of images to generate. Must be between 1 and 10. | [default to 1]
 **size** | **string** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [default to &quot;1024x1024&quot;]
 **responseFormat** | **string** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [default to &quot;url&quot;]
 **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateImageVariation

> ImagesResponse CreateImageVariation(ctx).Image(image).Model(model).N(n).ResponseFormat(responseFormat).Size(size).User(user).Execute()

Creates a variation of a given image.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	image := os.NewFile(1234, "some_file") // *os.File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
	model := *openapiclient.NewCreateImageEditRequestModel() // CreateImageEditRequestModel |  (optional) (default to dall-e-2)
	n := int32(56) // int32 | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional) (default to 1)
	responseFormat := "responseFormat_example" // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to "url")
	size := "size_example" // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
	user := "user_example" // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ImagesAPI.CreateImageVariation(context.Background()).Image(image).Model(model).N(n).ResponseFormat(responseFormat).Size(size).User(user).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ImagesAPI.CreateImageVariation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateImageVariation`: ImagesResponse
	fmt.Fprintf(os.Stdout, "Response from `ImagesAPI.CreateImageVariation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateImageVariationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | ***os.File** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [default to dall-e-2]
 **n** | **int32** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [default to 1]
 **responseFormat** | **string** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [default to &quot;url&quot;]
 **size** | **string** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [default to &quot;1024x1024&quot;]
 **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

