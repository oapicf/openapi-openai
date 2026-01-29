# ChatApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createChatCompletion**](#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.|

# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)


### Example

```typescript
import {
    ChatApi,
    Configuration,
    CreateChatCompletionRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ChatApi(configuration);

let createChatCompletionRequest: CreateChatCompletionRequest; //

const { status, data } = await apiInstance.createChatCompletion(
    createChatCompletionRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createChatCompletionRequest** | **CreateChatCompletionRequest**|  | |


### Return type

**CreateChatCompletionResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

