# .ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 


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
    store: false,
    reasoningEffort: "medium",
    metadata: {
      "key": "key_example",
    },
    frequencyPenalty: 0,
    logitBias: {
      "key": 1,
    },
    logprobs: false,
    topLogprobs: 0,
    maxTokens: 1,
    maxCompletionTokens: 1,
    n: 1,
    modalities: [
      "text",
    ],
    prediction: null,
    audio: {
      voice: "alloy",
      format: "wav",
    },
    presencePenalty: 0,
    responseFormat: null,
    seed: -9223372036854776000,
    serviceTier: "auto",
    stop: null,
    stream: false,
    streamOptions: {
      includeUsage: true,
    },
    temperature: 1,
    topP: 1,
    tools: [
      {
        type: "function",
        _function: {
          description: "description_example",
          name: "name_example",
          parameters: {},
          strict: false,
        },
      },
    ],
    toolChoice: null,
    parallelToolCalls: true,
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


