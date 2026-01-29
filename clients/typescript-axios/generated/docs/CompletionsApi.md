# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createCompletion**](#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.|

# **createCompletion**
> CreateCompletionResponse createCompletion(createCompletionRequest)


### Example

```typescript
import {
    CompletionsApi,
    Configuration,
    CreateCompletionRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CompletionsApi(configuration);

let createCompletionRequest: CreateCompletionRequest; //

const { status, data } = await apiInstance.createCompletion(
    createCompletionRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createCompletionRequest** | **CreateCompletionRequest**|  | |


### Return type

**CreateCompletionResponse**

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

