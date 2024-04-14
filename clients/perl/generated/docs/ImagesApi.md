# WWW::OpenAPIClient::ImagesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ImagesApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_image**](ImagesApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt.
[**create_image_edit**](ImagesApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](ImagesApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image.


# **create_image**
> ImagesResponse create_image(create_image_request => $create_image_request)

Creates an image given a prompt.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ImagesApi;
my $api_instance = WWW::OpenAPIClient::ImagesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_image_request = WWW::OpenAPIClient::Object::CreateImageRequest->new(); # CreateImageRequest | 

eval {
    my $result = $api_instance->create_image(create_image_request => $create_image_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ImagesApi->create_image: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_edit**
> ImagesResponse create_image_edit(image => $image, prompt => $prompt, mask => $mask, model => $model, n => $n, size => $size, response_format => $response_format, user => $user)

Creates an edited or extended image given an original image and a prompt.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ImagesApi;
my $api_instance = WWW::OpenAPIClient::ImagesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $image = "/path/to/file"; # string | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
my $prompt = "prompt_example"; # string | A text description of the desired image(s). The maximum length is 1000 characters.
my $mask = "/path/to/file"; # string | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
my $model = new WWW::OpenAPIClient.CreateImageEditRequestModel(); # CreateImageEditRequestModel | 
my $n = 1; # int | The number of images to generate. Must be between 1 and 10.
my $size = '1024x1024'; # string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
my $response_format = 'url'; # string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
my $user = "user_example"; # string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

eval {
    my $result = $api_instance->create_image_edit(image => $image, prompt => $prompt, mask => $mask, model => $model, n => $n, size => $size, response_format => $response_format, user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ImagesApi->create_image_edit: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **string****string**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **string**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **string****string**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional] 
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_variation**
> ImagesResponse create_image_variation(image => $image, model => $model, n => $n, response_format => $response_format, size => $size, user => $user)

Creates a variation of a given image.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ImagesApi;
my $api_instance = WWW::OpenAPIClient::ImagesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $image = "/path/to/file"; # string | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
my $model = new WWW::OpenAPIClient.CreateImageEditRequestModel(); # CreateImageEditRequestModel | 
my $n = 1; # int | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
my $response_format = 'url'; # string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
my $size = '1024x1024'; # string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
my $user = "user_example"; # string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

eval {
    my $result = $api_instance->create_image_variation(image => $image, model => $model, n => $n, response_format => $response_format, size => $size, user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ImagesApi->create_image_variation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **string****string**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional] 
 **n** | **int**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
 **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

