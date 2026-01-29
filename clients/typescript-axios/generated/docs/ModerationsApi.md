# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createModeration**](#createmoderation) | **POST** /moderations | Classifies if text is potentially harmful.|

# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)


### Example

```typescript
import {
    ModerationsApi,
    Configuration,
    CreateModerationRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ModerationsApi(configuration);

let createModerationRequest: CreateModerationRequest; //

const { status, data } = await apiInstance.createModeration(
    createModerationRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createModerationRequest** | **CreateModerationRequest**|  | |


### Return type

**CreateModerationResponse**

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

