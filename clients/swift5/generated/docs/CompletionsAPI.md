# CompletionsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](CompletionsAPI.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **createCompletion**
```swift
    open class func createCompletion(createCompletionRequest: CreateCompletionRequest, completion: @escaping (_ data: CreateCompletionResponse?, _ error: Error?) -> Void)
```

Creates a completion for the provided prompt and parameters.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createCompletionRequest = CreateCompletionRequest(model: CreateCompletionRequest_model(), prompt: CreateCompletionRequest_prompt(), bestOf: 123, echo: false, frequencyPenalty: 123, logitBias: "TODO", logprobs: 123, maxTokens: 123, n: 123, presencePenalty: 123, seed: 123, stop: CreateCompletionRequest_stop(), stream: false, streamOptions: ChatCompletionStreamOptions(includeUsage: false), suffix: "suffix_example", temperature: 123, topP: 123, user: "user_example") // CreateCompletionRequest | 

// Creates a completion for the provided prompt and parameters.
CompletionsAPI.createCompletion(createCompletionRequest: createCompletionRequest) { (response, error) in
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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

