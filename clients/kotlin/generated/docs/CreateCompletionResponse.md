
# CreateCompletionResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | A unique identifier for the completion. |  |
| **choices** | [**kotlin.collections.List&lt;CreateCompletionResponseChoicesInner&gt;**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. |  |
| **created** | **kotlin.Int** | The Unix timestamp (in seconds) of when the completion was created. |  |
| **model** | **kotlin.String** | The model used for completion. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always \&quot;text_completion\&quot; |  |
| **systemFingerprint** | **kotlin.String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional] |
| **usage** | [**CompletionUsage**](CompletionUsage.md) |  |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | text_completion |



