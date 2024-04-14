# OAICreateCompletionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | A unique identifier for the completion. | 
**choices** | [**NSArray&lt;OAICreateCompletionResponseChoicesInner&gt;***](OAICreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | **NSNumber*** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **NSString*** | The model used for completion. | 
**systemFingerprint** | **NSString*** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **NSString*** | The object type, which is always \&quot;text_completion\&quot; | 
**usage** | [**OAICompletionUsage***](OAICompletionUsage.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


