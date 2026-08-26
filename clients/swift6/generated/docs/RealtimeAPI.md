# RealtimeAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRealtimeSession**](RealtimeAPI.md#createrealtimesession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **createRealtimeSession**
```swift
    open class func createRealtimeSession(realtimeSessionCreateRequest: RealtimeSessionCreateRequest, completion: @escaping (_ data: RealtimeSessionCreateResponse?, _ error: Error?) -> Void)
```

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let realtimeSessionCreateRequest = RealtimeSessionCreateRequest(modalities: ["modalities_example"], model: "model_example", instructions: "instructions_example", voice: "voice_example", inputAudioFormat: "inputAudioFormat_example", outputAudioFormat: "outputAudioFormat_example", inputAudioTranscription: RealtimeSession_input_audio_transcription(model: "model_example"), turnDetection: RealtimeSessionCreateRequest_turn_detection(type: "type_example", threshold: 123, prefixPaddingMs: 123, silenceDurationMs: 123, createResponse: false), tools: [RealtimeResponseCreateParams_tools_inner(type: "type_example", name: "name_example", description: "description_example", parameters: 123)], toolChoice: "toolChoice_example", temperature: 123, maxResponseOutputTokens: RealtimeResponseCreateParams_max_response_output_tokens()) // RealtimeSessionCreateRequest | Create an ephemeral API key with the given session configuration.

// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
RealtimeAPI.createRealtimeSession(realtimeSessionCreateRequest: realtimeSessionCreateRequest) { (response, error) in
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
 **realtimeSessionCreateRequest** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) | Create an ephemeral API key with the given session configuration. | 

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

