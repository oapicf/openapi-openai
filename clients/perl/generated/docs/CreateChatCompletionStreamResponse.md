# WWW::OpenAPIClient::Object::CreateChatCompletionStreamResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CreateChatCompletionStreamResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | A unique identifier for the chat completion. Each chunk has the same ID. | 
**choices** | [**ARRAY[CreateChatCompletionStreamResponseChoicesInner]**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can contain more than one elements if &#x60;n&#x60; is greater than 1. Can also be empty for the last chunk if you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60;.  | 
**created** | **int** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | 
**model** | **string** | The model to generate the completion. | 
**service_tier** | **string** | The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. | [optional] 
**system_fingerprint** | **string** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **string** | The object type, which is always &#x60;chat.completion.chunk&#x60;. | 
**usage** | [**CreateChatCompletionStreamResponseUsage**](CreateChatCompletionStreamResponseUsage.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


