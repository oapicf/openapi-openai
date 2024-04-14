# CreateCompletionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | A unique identifier for the completion. | 
**choices** | [**OpenAPI\Server\Model\CreateCompletionResponseChoicesInner**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | **int** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **string** | The model used for completion. | 
**systemFingerprint** | **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. | [optional] 
**object** | **string** | The object type, which is always \&quot;text_completion\&quot; | 
**usage** | [**OpenAPI\Server\Model\CompletionUsage**](CompletionUsage.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


