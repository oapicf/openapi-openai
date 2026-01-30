# ChatAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatAPI.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 


# **createChatCompletion**
```swift
    open class func createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, completion: @escaping (_ data: CreateChatCompletionResponse?, _ error: Error?) -> Void)
```

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createChatCompletionRequest = CreateChatCompletionRequest(messages: [ChatCompletionRequestMessage(content: "content_example", role: "role_example", name: "name_example", refusal: "refusal_example", audio: ChatCompletionRequestAssistantMessage_audio(id: "id_example"), toolCalls: [ChatCompletionMessageToolCall(id: "id_example", type: "type_example", function: ChatCompletionMessageToolCall_function(name: "name_example", arguments: "arguments_example"))], functionCall: ChatCompletionRequestAssistantMessage_function_call(arguments: "arguments_example", name: "name_example"), toolCallId: "toolCallId_example")], model: CreateChatCompletionRequest_model(), store: false, reasoningEffort: "reasoningEffort_example", metadata: "TODO", frequencyPenalty: 123, logitBias: "TODO", logprobs: false, topLogprobs: 123, maxTokens: 123, maxCompletionTokens: 123, n: 123, modalities: ["modalities_example"], prediction: PredictionContent(type: "type_example", content: PredictionContent_content()), audio: CreateChatCompletionRequest_audio(voice: "voice_example", format: "format_example"), presencePenalty: 123, responseFormat: CreateChatCompletionRequest_response_format(type: "type_example", jsonSchema: ResponseFormatJsonSchema_json_schema(description: "description_example", name: "name_example", schema: "TODO", strict: false)), seed: 123, serviceTier: "serviceTier_example", stop: CreateChatCompletionRequest_stop(), stream: false, streamOptions: ChatCompletionStreamOptions(includeUsage: false), temperature: 123, topP: 123, tools: [ChatCompletionTool(type: "type_example", function: FunctionObject(description: "description_example", name: "name_example", parameters: "TODO", strict: false))], toolChoice: ChatCompletionToolChoiceOption(type: "type_example", function: AssistantsNamedToolChoice_function(name: "name_example")), parallelToolCalls: false, user: "user_example", functionCall: CreateChatCompletionRequest_function_call(name: "name_example"), functions: [ChatCompletionFunctions(description: "description_example", name: "name_example", parameters: "TODO")]) // CreateChatCompletionRequest | 

// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
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

