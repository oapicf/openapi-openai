# .RealtimeApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRealtimeSession**](RealtimeApi.md#createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **createRealtimeSession**
> RealtimeSessionCreateResponse createRealtimeSession(realtimeSessionCreateRequest)


### Example


```typescript
import { createConfiguration, RealtimeApi } from '';
import type { RealtimeApiCreateRealtimeSessionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new RealtimeApi(configuration);

const request: RealtimeApiCreateRealtimeSessionRequest = {
    // Create an ephemeral API key with the given session configuration.
  realtimeSessionCreateRequest: {
    modalities: [
      "text",
    ],
    model: "gpt-4o-realtime-preview",
    instructions: "instructions_example",
    voice: "alloy",
    inputAudioFormat: "pcm16",
    outputAudioFormat: "pcm16",
    inputAudioTranscription: {
      model: "model_example",
    },
    turnDetection: {
      type: "type_example",
      threshold: 3.14,
      prefixPaddingMs: 1,
      silenceDurationMs: 1,
      createResponse: true,
    },
    tools: [
      {
        type: "function",
        name: "name_example",
        description: "description_example",
        parameters: {},
      },
    ],
    toolChoice: "toolChoice_example",
    temperature: 3.14,
    maxResponseOutputTokens: null,
  },
};

const data = await apiInstance.createRealtimeSession(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtimeSessionCreateRequest** | **RealtimeSessionCreateRequest**| Create an ephemeral API key with the given session configuration. |


### Return type

**RealtimeSessionCreateResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Session created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


