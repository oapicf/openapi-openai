# .ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)


### Example


```typescript
import { createConfiguration, ChatApi } from '';
import type { ChatApiCreateChatCompletionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ChatApi(configuration);

const request: ChatApiCreateChatCompletionRequest = {
  
  createChatCompletionRequest: {
    messages: [
      null,
    ],
    model: null,
    frequencyPenalty: 0,
    logitBias: {
      "key": 1,
    },
    logprobs: false,
    topLogprobs: 0,
    maxTokens: 1,
    n: 1,
    presencePenalty: 0,
    responseFormat: {
      type: "json_object",
    },
    seed: -9223372036854775808,
    stop: null,
    stream: false,
    temperature: 1,
    topP: 1,
    tools: [
      {
        type: "function",
        _function: {
          description: "description_example",
          name: "name_example",
          parameters: {},
        },
      },
    ],
    toolChoice: null,
    user: "user-1234",
    functionCall: null,
    functions: [
      {
        description: "description_example",
        name: "name_example",
        parameters: {},
      },
    ],
  },
};

const data = await apiInstance.createChatCompletion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | **CreateChatCompletionRequest**|  |


### Return type

**CreateChatCompletionResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


