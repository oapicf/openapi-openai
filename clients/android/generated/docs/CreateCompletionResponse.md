

# CreateCompletionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the completion. | 
**choices** | [**List&lt;CreateCompletionResponseChoicesInner&gt;**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | **Integer** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **String** | The model used for completion. | 
**systemFingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional]
**_object** | [**_objectEnum**](#_objectEnum) | The object type, which is always \&quot;text_completion\&quot; | 
**usage** | [**CompletionUsage**](CompletionUsage.md) |  |  [optional]


## Enum: _objectEnum

Name | Value
---- | -----




