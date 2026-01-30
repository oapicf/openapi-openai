# .CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **createCompletion**
> CreateCompletionResponse createCompletion(createCompletionRequest)


### Example


```typescript
import { createConfiguration, CompletionsApi } from '';
import type { CompletionsApiCreateCompletionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CompletionsApi(configuration);

const request: CompletionsApiCreateCompletionRequest = {
  
  createCompletionRequest: {
    model: null,
    prompt: null,
    bestOf: 1,
    echo: false,
    frequencyPenalty: 0,
    logitBias: {
      "key": 1,
    },
    logprobs: 0,
    maxTokens: 16,
    n: 1,
    presencePenalty: 0,
    seed: -9223372036854776000,
    stop: null,
    stream: false,
    streamOptions: {
      includeUsage: true,
    },
    suffix: "test.",
    temperature: 1,
    topP: 1,
    user: "user-1234",
  },
};

const data = await apiInstance.createCompletion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | **CreateCompletionRequest**|  |


### Return type

**CreateCompletionResponse**

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


