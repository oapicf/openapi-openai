# ChatAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatAPI.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


# **createChatCompletion**
```swift
    open class func createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, completion: @escaping (_ data: CreateChatCompletionResponse?, _ error: Error?) -> Void)
```

Creates a model response for the given chat conversation.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createChatCompletionRequest = CreateChatCompletionRequest(messages: [ChatCompletionRequestMessage(content: "content_example", role: "role_example", name: "name_example", toolCalls: [ChatCompletionMessageToolCall(id: "id_example", type: "type_example", function: ChatCompletionMessageToolCall_function(name: "name_example", arguments: "arguments_example"))], functionCall: ChatCompletionRequestAssistantMessage_function_call(arguments: "arguments_example", name: "name_example"), toolCallId: "toolCallId_example")], model: CreateChatCompletionRequest_model(), frequencyPenalty: 123, logitBias: "TODO", logprobs: false, topLogprobs: 123, maxTokens: 123, n: 123, presencePenalty: 123, responseFormat: CreateChatCompletionRequest_response_format(type: "type_example"), seed: 123, stop: CreateChatCompletionRequest_stop(), stream: false, temperature: 123, topP: 123, tools: [ChatCompletionTool(type: "type_example", function: FunctionObject(description: "description_example", name: "name_example", parameters: "TODO"))], toolChoice: ChatCompletionToolChoiceOption(type: "type_example", function: ChatCompletionNamedToolChoice_function(name: "name_example")), user: "user_example", functionCall: CreateChatCompletionRequest_function_call(name: "name_example"), functions: [ChatCompletionFunctions(description: "description_example", name: "name_example", parameters: "TODO")]) // CreateChatCompletionRequest | 

// Creates a model response for the given chat conversation.
ChatAPI.createChatCompletion(createChatCompletionRequest: createChatCompletionRequest) { (response, error) in
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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

