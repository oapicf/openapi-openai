# OpenAIAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OpenAIAPI.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**createChatCompletion**](OpenAIAPI.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**createCompletion**](OpenAIAPI.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**createEdit**](OpenAIAPI.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEmbedding**](OpenAIAPI.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createFile**](OpenAIAPI.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFineTune**](OpenAIAPI.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createImage**](OpenAIAPI.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OpenAIAPI.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OpenAIAPI.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
[**createModeration**](OpenAIAPI.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createTranscription**](OpenAIAPI.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OpenAIAPI.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
[**deleteFile**](OpenAIAPI.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OpenAIAPI.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAIAPI.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listFiles**](OpenAIAPI.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**listFineTuneEvents**](OpenAIAPI.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OpenAIAPI.md#listfinetunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**listModels**](OpenAIAPI.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveFile**](OpenAIAPI.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAIAPI.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OpenAIAPI.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **cancelFineTune**
```swift
    open class func cancelFineTune(fineTuneId: String, completion: @escaping (_ data: FineTune?, _ error: Error?) -> Void)
```

Immediately cancel a fine-tune job. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fineTuneId = "fineTuneId_example" // String | The ID of the fine-tune job to cancel 

// Immediately cancel a fine-tune job. 
OpenAIAPI.cancelFineTune(fineTuneId: fineTuneId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String** | The ID of the fine-tune job to cancel  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createChatCompletion**
```swift
    open class func createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, completion: @escaping (_ data: CreateChatCompletionResponse?, _ error: Error?) -> Void)
```

Creates a model response for the given chat conversation.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createChatCompletionRequest = CreateChatCompletionRequest(model: CreateChatCompletionRequest_model(), messages: [ChatCompletionRequestMessage(role: "role_example", content: "content_example", name: "name_example", functionCall: ChatCompletionRequestMessage_function_call(name: "name_example", arguments: "arguments_example"))], functions: [ChatCompletionFunctions(name: "name_example", description: "description_example", parameters: "TODO")], functionCall: CreateChatCompletionRequest_function_call(name: "name_example"), temperature: 123, topP: 123, n: 123, stream: false, stop: CreateChatCompletionRequest_stop(), maxTokens: 123, presencePenalty: 123, frequencyPenalty: 123, logitBias: 123, user: "user_example") // CreateChatCompletionRequest | 

// Creates a model response for the given chat conversation.
OpenAIAPI.createChatCompletion(createChatCompletionRequest: createChatCompletionRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCompletion**
```swift
    open class func createCompletion(createCompletionRequest: CreateCompletionRequest, completion: @escaping (_ data: CreateCompletionResponse?, _ error: Error?) -> Void)
```

Creates a completion for the provided prompt and parameters.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createCompletionRequest = CreateCompletionRequest(model: CreateCompletionRequest_model(), prompt: CreateCompletionRequest_prompt(), suffix: "suffix_example", maxTokens: 123, temperature: 123, topP: 123, n: 123, stream: false, logprobs: 123, echo: false, stop: CreateCompletionRequest_stop(), presencePenalty: 123, frequencyPenalty: 123, bestOf: 123, logitBias: 123, user: "user_example") // CreateCompletionRequest | 

// Creates a completion for the provided prompt and parameters.
OpenAIAPI.createCompletion(createCompletionRequest: createCompletionRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createEdit**
```swift
    open class func createEdit(createEditRequest: CreateEditRequest, completion: @escaping (_ data: CreateEditResponse?, _ error: Error?) -> Void)
```

Creates a new edit for the provided input, instruction, and parameters.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createEditRequest = CreateEditRequest(model: CreateEditRequest_model(), input: "input_example", instruction: "instruction_example", n: 123, temperature: 123, topP: 123) // CreateEditRequest | 

// Creates a new edit for the provided input, instruction, and parameters.
OpenAIAPI.createEdit(createEditRequest: createEditRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md) |  | 

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createEmbedding**
```swift
    open class func createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest, completion: @escaping (_ data: CreateEmbeddingResponse?, _ error: Error?) -> Void)
```

Creates an embedding vector representing the input text.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createEmbeddingRequest = CreateEmbeddingRequest(model: CreateEmbeddingRequest_model(), input: CreateEmbeddingRequest_input(), user: "user_example") // CreateEmbeddingRequest | 

// Creates an embedding vector representing the input text.
OpenAIAPI.createEmbedding(createEmbeddingRequest: createEmbeddingRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFile**
```swift
    open class func createFile(file: URL, purpose: String, completion: @escaping (_ data: OpenAIFile?, _ error: Error?) -> Void)
```

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let file = URL(string: "https://example.com")! // URL | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
let purpose = "purpose_example" // String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
OpenAIAPI.createFile(file: file, purpose: purpose) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **URL** | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **purpose** | **String** | The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFineTune**
```swift
    open class func createFineTune(createFineTuneRequest: CreateFineTuneRequest, completion: @escaping (_ data: FineTune?, _ error: Error?) -> Void)
```

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createFineTuneRequest = CreateFineTuneRequest(trainingFile: "trainingFile_example", validationFile: "validationFile_example", model: CreateFineTuneRequest_model(), nEpochs: 123, batchSize: 123, learningRateMultiplier: 123, promptLossWeight: 123, computeClassificationMetrics: false, classificationNClasses: 123, classificationPositiveClass: "classificationPositiveClass_example", classificationBetas: [123], suffix: "suffix_example") // CreateFineTuneRequest | 

// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
OpenAIAPI.createFineTune(createFineTuneRequest: createFineTuneRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md) |  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImage**
```swift
    open class func createImage(createImageRequest: CreateImageRequest, completion: @escaping (_ data: ImagesResponse?, _ error: Error?) -> Void)
```

Creates an image given a prompt.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createImageRequest = CreateImageRequest(prompt: "prompt_example", n: 123, size: "size_example", responseFormat: "responseFormat_example", user: "user_example") // CreateImageRequest | 

// Creates an image given a prompt.
OpenAIAPI.createImage(createImageRequest: createImageRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md) |  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageEdit**
```swift
    open class func createImageEdit(image: URL, prompt: String, mask: URL? = nil, n: Int? = nil, size: Size_createImageEdit? = nil, responseFormat: ResponseFormat_createImageEdit? = nil, user: String? = nil, completion: @escaping (_ data: ImagesResponse?, _ error: Error?) -> Void)
```

Creates an edited or extended image given an original image and a prompt.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let image = URL(string: "https://example.com")! // URL | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
let prompt = "prompt_example" // String | A text description of the desired image(s). The maximum length is 1000 characters.
let mask = URL(string: "https://example.com")! // URL | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
let n = 987 // Int | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
let size = "size_example" // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to ._1024x1024)
let responseFormat = "responseFormat_example" // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to .url)
let user = "user_example" // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

// Creates an edited or extended image given an original image and a prompt.
OpenAIAPI.createImageEdit(image: image, prompt: prompt, mask: mask, n: n, size: size, responseFormat: responseFormat, user: user) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **URL** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **URL** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **n** | **Int** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to ._1024x1024]
 **responseFormat** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to .url]
 **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageVariation**
```swift
    open class func createImageVariation(image: URL, n: Int? = nil, size: Size_createImageVariation? = nil, responseFormat: ResponseFormat_createImageVariation? = nil, user: String? = nil, completion: @escaping (_ data: ImagesResponse?, _ error: Error?) -> Void)
```

Creates a variation of a given image.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let image = URL(string: "https://example.com")! // URL | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
let n = 987 // Int | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
let size = "size_example" // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to ._1024x1024)
let responseFormat = "responseFormat_example" // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to .url)
let user = "user_example" // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

// Creates a variation of a given image.
OpenAIAPI.createImageVariation(image: image, n: n, size: size, responseFormat: responseFormat, user: user) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **URL** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **Int** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to ._1024x1024]
 **responseFormat** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to .url]
 **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createModeration**
```swift
    open class func createModeration(createModerationRequest: CreateModerationRequest, completion: @escaping (_ data: CreateModerationResponse?, _ error: Error?) -> Void)
```

Classifies if text violates OpenAI's Content Policy

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createModerationRequest = CreateModerationRequest(input: CreateModerationRequest_input(), model: CreateModerationRequest_model()) // CreateModerationRequest | 

// Classifies if text violates OpenAI's Content Policy
OpenAIAPI.createModeration(createModerationRequest: createModerationRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md) |  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranscription**
```swift
    open class func createTranscription(file: URL, model: CreateTranscriptionRequestModel, prompt: String? = nil, responseFormat: String? = nil, temperature: Double? = nil, language: String? = nil, completion: @escaping (_ data: CreateTranscriptionResponse?, _ error: Error?) -> Void)
```

Transcribes audio into the input language.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let file = URL(string: "https://example.com")! // URL | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
let model = CreateTranscriptionRequest_model() // CreateTranscriptionRequestModel | 
let prompt = "prompt_example" // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
let responseFormat = "responseFormat_example" // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to "json")
let temperature = 987 // Double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)
let language = "language_example" // String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)

// Transcribes audio into the input language.
OpenAIAPI.createTranscription(file: file, model: model, prompt: prompt, responseFormat: responseFormat, temperature: temperature, language: language) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **URL** | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | 
 **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **responseFormat** | **String** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **Double** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **String** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranslation**
```swift
    open class func createTranslation(file: URL, model: CreateTranscriptionRequestModel, prompt: String? = nil, responseFormat: String? = nil, temperature: Double? = nil, completion: @escaping (_ data: CreateTranslationResponse?, _ error: Error?) -> Void)
```

Translates audio into English.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let file = URL(string: "https://example.com")! // URL | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
let model = CreateTranscriptionRequest_model() // CreateTranscriptionRequestModel | 
let prompt = "prompt_example" // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
let responseFormat = "responseFormat_example" // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to "json")
let temperature = 987 // Double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)

// Translates audio into English.
OpenAIAPI.createTranslation(file: file, model: model, prompt: prompt, responseFormat: responseFormat, temperature: temperature) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **URL** | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | 
 **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **responseFormat** | **String** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **Double** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteFile**
```swift
    open class func deleteFile(fileId: String, completion: @escaping (_ data: DeleteFileResponse?, _ error: Error?) -> Void)
```

Delete a file.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fileId = "fileId_example" // String | The ID of the file to use for this request

// Delete a file.
OpenAIAPI.deleteFile(fileId: fileId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String** | The ID of the file to use for this request | 

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteModel**
```swift
    open class func deleteModel(model: String, completion: @escaping (_ data: DeleteModelResponse?, _ error: Error?) -> Void)
```

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let model = "model_example" // String | The model to delete

// Delete a fine-tuned model. You must have the Owner role in your organization.
OpenAIAPI.deleteModel(model: model) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String** | The model to delete | 

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **downloadFile**
```swift
    open class func downloadFile(fileId: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```

Returns the contents of the specified file

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fileId = "fileId_example" // String | The ID of the file to use for this request

// Returns the contents of the specified file
OpenAIAPI.downloadFile(fileId: fileId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String** | The ID of the file to use for this request | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFiles**
```swift
    open class func listFiles(completion: @escaping (_ data: ListFilesResponse?, _ error: Error?) -> Void)
```

Returns a list of files that belong to the user's organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Returns a list of files that belong to the user's organization.
OpenAIAPI.listFiles() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuneEvents**
```swift
    open class func listFineTuneEvents(fineTuneId: String, stream: Bool? = nil, completion: @escaping (_ data: ListFineTuneEventsResponse?, _ error: Error?) -> Void)
```

Get fine-grained status updates for a fine-tune job. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fineTuneId = "fineTuneId_example" // String | The ID of the fine-tune job to get events for. 
let stream = true // Bool | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional) (default to false)

// Get fine-grained status updates for a fine-tune job. 
OpenAIAPI.listFineTuneEvents(fineTuneId: fineTuneId, stream: stream) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String** | The ID of the fine-tune job to get events for.  | 
 **stream** | **Bool** | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTunes**
```swift
    open class func listFineTunes(completion: @escaping (_ data: ListFineTunesResponse?, _ error: Error?) -> Void)
```

List your organization's fine-tuning jobs 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// List your organization's fine-tuning jobs 
OpenAIAPI.listFineTunes() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listModels**
```swift
    open class func listModels(completion: @escaping (_ data: ListModelsResponse?, _ error: Error?) -> Void)
```

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Lists the currently available models, and provides basic information about each one such as the owner and availability.
OpenAIAPI.listModels() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFile**
```swift
    open class func retrieveFile(fileId: String, completion: @escaping (_ data: OpenAIFile?, _ error: Error?) -> Void)
```

Returns information about a specific file.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fileId = "fileId_example" // String | The ID of the file to use for this request

// Returns information about a specific file.
OpenAIAPI.retrieveFile(fileId: fileId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String** | The ID of the file to use for this request | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFineTune**
```swift
    open class func retrieveFineTune(fineTuneId: String, completion: @escaping (_ data: FineTune?, _ error: Error?) -> Void)
```

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fineTuneId = "fineTuneId_example" // String | The ID of the fine-tune job 

// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
OpenAIAPI.retrieveFineTune(fineTuneId: fineTuneId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String** | The ID of the fine-tune job  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveModel**
```swift
    open class func retrieveModel(model: String, completion: @escaping (_ data: Model?, _ error: Error?) -> Void)
```

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let model = "model_example" // String | The ID of the model to use for this request

// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
OpenAIAPI.retrieveModel(model: model) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String** | The ID of the model to use for this request | 

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

