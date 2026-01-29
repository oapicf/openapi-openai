# Org.OpenAPITools.Model.CreateChatCompletionFunctionResponse
Represents a chat completion response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | A unique identifier for the chat completion. | 
**Choices** | [**List&lt;CreateChatCompletionFunctionResponseChoicesInner&gt;**](CreateChatCompletionFunctionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**Created** | **int** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**Model** | **string** | The model used for the chat completion. | 
**Object** | **string** | The object type, which is always &#x60;chat.completion&#x60;. | 
**SystemFingerprint** | **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**Usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

