# OAIOpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OAIOpenAIApi.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**createChatCompletion**](OAIOpenAIApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**createCompletion**](OAIOpenAIApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**createEdit**](OAIOpenAIApi.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEmbedding**](OAIOpenAIApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createFile**](OAIOpenAIApi.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFineTune**](OAIOpenAIApi.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createImage**](OAIOpenAIApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OAIOpenAIApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OAIOpenAIApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
[**createModeration**](OAIOpenAIApi.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createTranscription**](OAIOpenAIApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OAIOpenAIApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
[**deleteFile**](OAIOpenAIApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OAIOpenAIApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OAIOpenAIApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listFiles**](OAIOpenAIApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**listFineTuneEvents**](OAIOpenAIApi.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OAIOpenAIApi.md#listfinetunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**listModels**](OAIOpenAIApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveFile**](OAIOpenAIApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OAIOpenAIApi.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OAIOpenAIApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **cancelFineTune**
```objc
-(NSURLSessionTask*) cancelFineTuneWithFineTuneId: (NSString*) fineTuneId
        completionHandler: (void (^)(OAIFineTune* output, NSError* error)) handler;
```

Immediately cancel a fine-tune job. 

### Example
```objc

NSString* fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // The ID of the fine-tune job to cancel 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Immediately cancel a fine-tune job. 
[apiInstance cancelFineTuneWithFineTuneId:fineTuneId
          completionHandler: ^(OAIFineTune* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->cancelFineTune: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **NSString***| The ID of the fine-tune job to cancel  | 

### Return type

[**OAIFineTune***](OAIFineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createChatCompletion**
```objc
-(NSURLSessionTask*) createChatCompletionWithCreateChatCompletionRequest: (OAICreateChatCompletionRequest*) createChatCompletionRequest
        completionHandler: (void (^)(OAICreateChatCompletionResponse* output, NSError* error)) handler;
```

Creates a model response for the given chat conversation.

### Example
```objc

OAICreateChatCompletionRequest* createChatCompletionRequest = [[OAICreateChatCompletionRequest alloc] init]; // 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates a model response for the given chat conversation.
[apiInstance createChatCompletionWithCreateChatCompletionRequest:createChatCompletionRequest
          completionHandler: ^(OAICreateChatCompletionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createChatCompletion: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**OAICreateChatCompletionRequest***](OAICreateChatCompletionRequest.md)|  | 

### Return type

[**OAICreateChatCompletionResponse***](OAICreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCompletion**
```objc
-(NSURLSessionTask*) createCompletionWithCreateCompletionRequest: (OAICreateCompletionRequest*) createCompletionRequest
        completionHandler: (void (^)(OAICreateCompletionResponse* output, NSError* error)) handler;
```

Creates a completion for the provided prompt and parameters.

### Example
```objc

OAICreateCompletionRequest* createCompletionRequest = [[OAICreateCompletionRequest alloc] init]; // 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates a completion for the provided prompt and parameters.
[apiInstance createCompletionWithCreateCompletionRequest:createCompletionRequest
          completionHandler: ^(OAICreateCompletionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createCompletion: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**OAICreateCompletionRequest***](OAICreateCompletionRequest.md)|  | 

### Return type

[**OAICreateCompletionResponse***](OAICreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createEdit**
```objc
-(NSURLSessionTask*) createEditWithCreateEditRequest: (OAICreateEditRequest*) createEditRequest
        completionHandler: (void (^)(OAICreateEditResponse* output, NSError* error)) handler;
```

Creates a new edit for the provided input, instruction, and parameters.

### Example
```objc

OAICreateEditRequest* createEditRequest = [[OAICreateEditRequest alloc] init]; // 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates a new edit for the provided input, instruction, and parameters.
[apiInstance createEditWithCreateEditRequest:createEditRequest
          completionHandler: ^(OAICreateEditResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createEdit: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**OAICreateEditRequest***](OAICreateEditRequest.md)|  | 

### Return type

[**OAICreateEditResponse***](OAICreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createEmbedding**
```objc
-(NSURLSessionTask*) createEmbeddingWithCreateEmbeddingRequest: (OAICreateEmbeddingRequest*) createEmbeddingRequest
        completionHandler: (void (^)(OAICreateEmbeddingResponse* output, NSError* error)) handler;
```

Creates an embedding vector representing the input text.

### Example
```objc

OAICreateEmbeddingRequest* createEmbeddingRequest = [[OAICreateEmbeddingRequest alloc] init]; // 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates an embedding vector representing the input text.
[apiInstance createEmbeddingWithCreateEmbeddingRequest:createEmbeddingRequest
          completionHandler: ^(OAICreateEmbeddingResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createEmbedding: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**OAICreateEmbeddingRequest***](OAICreateEmbeddingRequest.md)|  | 

### Return type

[**OAICreateEmbeddingResponse***](OAICreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFile**
```objc
-(NSURLSessionTask*) createFileWithFile: (NSURL*) file
    purpose: (NSString*) purpose
        completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler;
```

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```objc

NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
NSString* purpose = @"purpose_example"; // The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[apiInstance createFileWithFile:file
              purpose:purpose
          completionHandler: ^(OAIOpenAIFile* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **NSURL*****NSURL***| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **purpose** | **NSString***| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[**OAIOpenAIFile***](OAIOpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFineTune**
```objc
-(NSURLSessionTask*) createFineTuneWithCreateFineTuneRequest: (OAICreateFineTuneRequest*) createFineTuneRequest
        completionHandler: (void (^)(OAIFineTune* output, NSError* error)) handler;
```

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```objc

OAICreateFineTuneRequest* createFineTuneRequest = [[OAICreateFineTuneRequest alloc] init]; // 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[apiInstance createFineTuneWithCreateFineTuneRequest:createFineTuneRequest
          completionHandler: ^(OAIFineTune* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createFineTune: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**OAICreateFineTuneRequest***](OAICreateFineTuneRequest.md)|  | 

### Return type

[**OAIFineTune***](OAIFineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImage**
```objc
-(NSURLSessionTask*) createImageWithCreateImageRequest: (OAICreateImageRequest*) createImageRequest
        completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler;
```

Creates an image given a prompt.

### Example
```objc

OAICreateImageRequest* createImageRequest = [[OAICreateImageRequest alloc] init]; // 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates an image given a prompt.
[apiInstance createImageWithCreateImageRequest:createImageRequest
          completionHandler: ^(OAIImagesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createImage: %@", error);
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageEdit**
```objc
-(NSURLSessionTask*) createImageEditWithImage: (NSURL*) image
    prompt: (NSString*) prompt
    mask: (NSURL*) mask
    n: (NSNumber*) n
    size: (NSString*) size
    responseFormat: (NSString*) responseFormat
    user: (NSString*) user
        completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler;
```

Creates an edited or extended image given an original image and a prompt.

### Example
```objc

NSURL* image = [NSURL fileURLWithPath:@"/path/to/file"]; // The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
NSString* prompt = @"prompt_example"; // A text description of the desired image(s). The maximum length is 1000 characters.
NSURL* mask = [NSURL fileURLWithPath:@"/path/to/file"]; // An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
NSNumber* n = @1; // The number of images to generate. Must be between 1 and 10. (optional) (default to @1)
NSString* size = @"1024x1024"; // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to @"1024x1024")
NSString* responseFormat = @"url"; // The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to @"url")
NSString* user = @"user_example"; // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates an edited or extended image given an original image and a prompt.
[apiInstance createImageEditWithImage:image
              prompt:prompt
              mask:mask
              n:n
              size:size
              responseFormat:responseFormat
              user:user
          completionHandler: ^(OAIImagesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createImageEdit: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **NSURL*****NSURL***| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **NSString***| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **NSURL*****NSURL***| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **n** | **NSNumber***| The number of images to generate. Must be between 1 and 10. | [optional] [default to @1]
 **size** | **NSString***| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to @&quot;1024x1024&quot;]
 **responseFormat** | **NSString***| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to @&quot;url&quot;]
 **user** | **NSString***| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**OAIImagesResponse***](OAIImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageVariation**
```objc
-(NSURLSessionTask*) createImageVariationWithImage: (NSURL*) image
    n: (NSNumber*) n
    size: (NSString*) size
    responseFormat: (NSString*) responseFormat
    user: (NSString*) user
        completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler;
```

Creates a variation of a given image.

### Example
```objc

NSURL* image = [NSURL fileURLWithPath:@"/path/to/file"]; // The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
NSNumber* n = @1; // The number of images to generate. Must be between 1 and 10. (optional) (default to @1)
NSString* size = @"1024x1024"; // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to @"1024x1024")
NSString* responseFormat = @"url"; // The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to @"url")
NSString* user = @"user_example"; // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Creates a variation of a given image.
[apiInstance createImageVariationWithImage:image
              n:n
              size:size
              responseFormat:responseFormat
              user:user
          completionHandler: ^(OAIImagesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createImageVariation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **NSURL*****NSURL***| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **NSNumber***| The number of images to generate. Must be between 1 and 10. | [optional] [default to @1]
 **size** | **NSString***| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to @&quot;1024x1024&quot;]
 **responseFormat** | **NSString***| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to @&quot;url&quot;]
 **user** | **NSString***| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**OAIImagesResponse***](OAIImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createModeration**
```objc
-(NSURLSessionTask*) createModerationWithCreateModerationRequest: (OAICreateModerationRequest*) createModerationRequest
        completionHandler: (void (^)(OAICreateModerationResponse* output, NSError* error)) handler;
```

Classifies if text violates OpenAI's Content Policy

### Example
```objc

OAICreateModerationRequest* createModerationRequest = [[OAICreateModerationRequest alloc] init]; // 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Classifies if text violates OpenAI's Content Policy
[apiInstance createModerationWithCreateModerationRequest:createModerationRequest
          completionHandler: ^(OAICreateModerationResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createModeration: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**OAICreateModerationRequest***](OAICreateModerationRequest.md)|  | 

### Return type

[**OAICreateModerationResponse***](OAICreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranscription**
```objc
-(NSURLSessionTask*) createTranscriptionWithFile: (NSURL*) file
    model: (OAICreateTranscriptionRequestModel*) model
    prompt: (NSString*) prompt
    responseFormat: (NSString*) responseFormat
    temperature: (NSNumber*) temperature
    language: (NSString*) language
        completionHandler: (void (^)(OAICreateTranscriptionResponse* output, NSError* error)) handler;
```

Transcribes audio into the input language.

### Example
```objc

NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
OAICreateTranscriptionRequestModel* model = [[OAICreateTranscriptionRequestModel alloc] init]; // 
NSString* prompt = @"prompt_example"; // An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
NSString* responseFormat = @"json"; // The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to @"json")
NSNumber* temperature = @0; // The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to @0)
NSString* language = @"language_example"; // The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Transcribes audio into the input language.
[apiInstance createTranscriptionWithFile:file
              model:model
              prompt:prompt
              responseFormat:responseFormat
              temperature:temperature
              language:language
          completionHandler: ^(OAICreateTranscriptionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createTranscription: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **NSURL*****NSURL***| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**OAICreateTranscriptionRequestModel***](OAICreateTranscriptionRequestModel.md)|  | 
 **prompt** | **NSString***| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **responseFormat** | **NSString***| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to @&quot;json&quot;]
 **temperature** | **NSNumber***| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to @0]
 **language** | **NSString***| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

### Return type

[**OAICreateTranscriptionResponse***](OAICreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranslation**
```objc
-(NSURLSessionTask*) createTranslationWithFile: (NSURL*) file
    model: (OAICreateTranscriptionRequestModel*) model
    prompt: (NSString*) prompt
    responseFormat: (NSString*) responseFormat
    temperature: (NSNumber*) temperature
        completionHandler: (void (^)(OAICreateTranslationResponse* output, NSError* error)) handler;
```

Translates audio into English.

### Example
```objc

NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
OAICreateTranscriptionRequestModel* model = [[OAICreateTranscriptionRequestModel alloc] init]; // 
NSString* prompt = @"prompt_example"; // An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
NSString* responseFormat = @"json"; // The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to @"json")
NSNumber* temperature = @0; // The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to @0)

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Translates audio into English.
[apiInstance createTranslationWithFile:file
              model:model
              prompt:prompt
              responseFormat:responseFormat
              temperature:temperature
          completionHandler: ^(OAICreateTranslationResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->createTranslation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **NSURL*****NSURL***| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**OAICreateTranscriptionRequestModel***](OAICreateTranscriptionRequestModel.md)|  | 
 **prompt** | **NSString***| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **responseFormat** | **NSString***| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to @&quot;json&quot;]
 **temperature** | **NSNumber***| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to @0]

### Return type

[**OAICreateTranslationResponse***](OAICreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteFile**
```objc
-(NSURLSessionTask*) deleteFileWithFileId: (NSString*) fileId
        completionHandler: (void (^)(OAIDeleteFileResponse* output, NSError* error)) handler;
```

Delete a file.

### Example
```objc

NSString* fileId = @"fileId_example"; // The ID of the file to use for this request

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Delete a file.
[apiInstance deleteFileWithFileId:fileId
          completionHandler: ^(OAIDeleteFileResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->deleteFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **NSString***| The ID of the file to use for this request | 

### Return type

[**OAIDeleteFileResponse***](OAIDeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteModel**
```objc
-(NSURLSessionTask*) deleteModelWithModel: (NSString*) model
        completionHandler: (void (^)(OAIDeleteModelResponse* output, NSError* error)) handler;
```

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```objc

NSString* model = curie:ft-acmeco-2021-03-03-21-44-20; // The model to delete

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Delete a fine-tuned model. You must have the Owner role in your organization.
[apiInstance deleteModelWithModel:model
          completionHandler: ^(OAIDeleteModelResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->deleteModel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **NSString***| The model to delete | 

### Return type

[**OAIDeleteModelResponse***](OAIDeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **downloadFile**
```objc
-(NSURLSessionTask*) downloadFileWithFileId: (NSString*) fileId
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Returns the contents of the specified file

### Example
```objc

NSString* fileId = @"fileId_example"; // The ID of the file to use for this request

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Returns the contents of the specified file
[apiInstance downloadFileWithFileId:fileId
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->downloadFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **NSString***| The ID of the file to use for this request | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFiles**
```objc
-(NSURLSessionTask*) listFilesWithCompletionHandler: 
        (void (^)(OAIListFilesResponse* output, NSError* error)) handler;
```

Returns a list of files that belong to the user's organization.

### Example
```objc


OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Returns a list of files that belong to the user's organization.
[apiInstance listFilesWithCompletionHandler: 
          ^(OAIListFilesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->listFiles: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIListFilesResponse***](OAIListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuneEvents**
```objc
-(NSURLSessionTask*) listFineTuneEventsWithFineTuneId: (NSString*) fineTuneId
    stream: (NSNumber*) stream
        completionHandler: (void (^)(OAIListFineTuneEventsResponse* output, NSError* error)) handler;
```

Get fine-grained status updates for a fine-tune job. 

### Example
```objc

NSString* fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // The ID of the fine-tune job to get events for. 
NSNumber* stream = @(NO); // Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional) (default to @(NO))

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Get fine-grained status updates for a fine-tune job. 
[apiInstance listFineTuneEventsWithFineTuneId:fineTuneId
              stream:stream
          completionHandler: ^(OAIListFineTuneEventsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->listFineTuneEvents: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **NSString***| The ID of the fine-tune job to get events for.  | 
 **stream** | **NSNumber***| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to @(NO)]

### Return type

[**OAIListFineTuneEventsResponse***](OAIListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTunes**
```objc
-(NSURLSessionTask*) listFineTunesWithCompletionHandler: 
        (void (^)(OAIListFineTunesResponse* output, NSError* error)) handler;
```

List your organization's fine-tuning jobs 

### Example
```objc


OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// List your organization's fine-tuning jobs 
[apiInstance listFineTunesWithCompletionHandler: 
          ^(OAIListFineTunesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->listFineTunes: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIListFineTunesResponse***](OAIListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listModels**
```objc
-(NSURLSessionTask*) listModelsWithCompletionHandler: 
        (void (^)(OAIListModelsResponse* output, NSError* error)) handler;
```

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```objc


OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Lists the currently available models, and provides basic information about each one such as the owner and availability.
[apiInstance listModelsWithCompletionHandler: 
          ^(OAIListModelsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->listModels: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIListModelsResponse***](OAIListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFile**
```objc
-(NSURLSessionTask*) retrieveFileWithFileId: (NSString*) fileId
        completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler;
```

Returns information about a specific file.

### Example
```objc

NSString* fileId = @"fileId_example"; // The ID of the file to use for this request

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Returns information about a specific file.
[apiInstance retrieveFileWithFileId:fileId
          completionHandler: ^(OAIOpenAIFile* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->retrieveFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **NSString***| The ID of the file to use for this request | 

### Return type

[**OAIOpenAIFile***](OAIOpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFineTune**
```objc
-(NSURLSessionTask*) retrieveFineTuneWithFineTuneId: (NSString*) fineTuneId
        completionHandler: (void (^)(OAIFineTune* output, NSError* error)) handler;
```

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```objc

NSString* fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // The ID of the fine-tune job 

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[apiInstance retrieveFineTuneWithFineTuneId:fineTuneId
          completionHandler: ^(OAIFineTune* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->retrieveFineTune: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **NSString***| The ID of the fine-tune job  | 

### Return type

[**OAIFineTune***](OAIFineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveModel**
```objc
-(NSURLSessionTask*) retrieveModelWithModel: (NSString*) model
        completionHandler: (void (^)(OAIModel* output, NSError* error)) handler;
```

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```objc

NSString* model = text-davinci-001; // The ID of the model to use for this request

OAIOpenAIApi*apiInstance = [[OAIOpenAIApi alloc] init];

// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
[apiInstance retrieveModelWithModel:model
          completionHandler: ^(OAIModel* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOpenAIApi->retrieveModel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **NSString***| The ID of the model to use for this request | 

### Return type

[**OAIModel***](OAIModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

