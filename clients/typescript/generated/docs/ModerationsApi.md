# .ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 


# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)


### Example


```typescript
import { createConfiguration, ModerationsApi } from '';
import type { ModerationsApiCreateModerationRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ModerationsApi(configuration);

const request: ModerationsApiCreateModerationRequest = {
  
  createModerationRequest: {
    input: null,
    model: null,
  },
};

const data = await apiInstance.createModeration(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | **CreateModerationRequest**|  |


### Return type

**CreateModerationResponse**

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


