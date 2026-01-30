# OAIImagesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](OAIImagesApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OAIImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OAIImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.


# **createImage**
```objc
-(NSURLSessionTask*) createImageWithCreateImageRequest: (OAICreateImageRequest*) createImageRequest
        completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler;
```

Creates an image given a prompt.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateImageRequest* createImageRequest = [[OAICreateImageRequest alloc] init]; // 

OAIImagesApi*apiInstance = [[OAIImagesApi alloc] init];

// Creates an image given a prompt.
[apiInstance createImageWithCreateImageRequest:createImageRequest
          completionHandler: ^(OAIImagesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIImagesApi->createImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**OAICreateImageRequest***](OAICreateImageRequest.md)|  | 

### Return type

[**OAIImagesResponse***](OAIImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageEdit**
```objc
-(NSURLSessionTask*) createImageEditWithImage: (NSURL*) image
    prompt: (NSString*) prompt
    mask: (NSURL*) mask
    model: (OAICreateImageEditRequestModel*) model
    n: (NSNumber*) n
    size: (NSString*) size
    responseFormat: (NSString*) responseFormat
    user: (NSString*) user
        completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler;
```

Creates an edited or extended image given an original image and a prompt.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSURL* image = [NSURL fileURLWithPath:@"/path/to/file"]; // The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
NSString* prompt = @"prompt_example"; // A text description of the desired image(s). The maximum length is 1000 characters.
NSURL* mask = [NSURL fileURLWithPath:@"/path/to/file"]; // An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
OAICreateImageEditRequestModel* model = [[OAICreateImageEditRequestModel alloc] init]; //  (optional)
NSNumber* n = @1; // The number of images to generate. Must be between 1 and 10. (optional) (default to @1)
NSString* size = @"1024x1024"; // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to @"1024x1024")
NSString* responseFormat = @"url"; // The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to @"url")
NSString* user = @"user_example"; // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

OAIImagesApi*apiInstance = [[OAIImagesApi alloc] init];

// Creates an edited or extended image given an original image and a prompt.
[apiInstance createImageEditWithImage:image
              prompt:prompt
              mask:mask
              model:model
              n:n
              size:size
              responseFormat:responseFormat
              user:user
          completionHandler: ^(OAIImagesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIImagesApi->createImageEdit: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **NSURL*****NSURL***| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **NSString***| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **NSURL*****NSURL***| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **model** | [**OAICreateImageEditRequestModel***](OAICreateImageEditRequestModel.md)|  | [optional] 
 **n** | **NSNumber***| The number of images to generate. Must be between 1 and 10. | [optional] [default to @1]
 **size** | **NSString***| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to @&quot;1024x1024&quot;]
 **responseFormat** | **NSString***| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to @&quot;url&quot;]
 **user** | **NSString***| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 

### Return type

[**OAIImagesResponse***](OAIImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageVariation**
```objc
-(NSURLSessionTask*) createImageVariationWithImage: (NSURL*) image
    model: (OAICreateImageEditRequestModel*) model
    n: (NSNumber*) n
    responseFormat: (NSString*) responseFormat
    size: (NSString*) size
    user: (NSString*) user
        completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler;
```

Creates a variation of a given image.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSURL* image = [NSURL fileURLWithPath:@"/path/to/file"]; // The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
OAICreateImageEditRequestModel* model = [[OAICreateImageEditRequestModel alloc] init]; //  (optional)
NSNumber* n = @1; // The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional) (default to @1)
NSString* responseFormat = @"url"; // The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to @"url")
NSString* size = @"1024x1024"; // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to @"1024x1024")
NSString* user = @"user_example"; // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

OAIImagesApi*apiInstance = [[OAIImagesApi alloc] init];

// Creates a variation of a given image.
[apiInstance createImageVariationWithImage:image
              model:model
              n:n
              responseFormat:responseFormat
              size:size
              user:user
          completionHandler: ^(OAIImagesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIImagesApi->createImageVariation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **NSURL*****NSURL***| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **model** | [**OAICreateImageEditRequestModel***](OAICreateImageEditRequestModel.md)|  | [optional] 
 **n** | **NSNumber***| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to @1]
 **responseFormat** | **NSString***| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to @&quot;url&quot;]
 **size** | **NSString***| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to @&quot;1024x1024&quot;]
 **user** | **NSString***| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 

### Return type

[**OAIImagesResponse***](OAIImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

