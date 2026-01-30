
# CreateChatCompletionResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | A unique identifier for the chat completion. |  |
| **choices** | [**kotlin.collections.List&lt;CreateChatCompletionResponseChoicesInner&gt;**](CreateChatCompletionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. |  |
| **created** | **kotlin.Int** | The Unix timestamp (in seconds) of when the chat completion was created. |  |
| **model** | **kotlin.String** | The model used for the chat completion. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;chat.completion&#x60;. |  |
| **serviceTier** | [**inline**](#ServiceTier) | The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. |  [optional] |
| **systemFingerprint** | **kotlin.String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional] |
| **usage** | [**CompletionUsage**](CompletionUsage.md) |  |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | chat.completion |


<a id="ServiceTier"></a>
## Enum: service_tier
| Name | Value |
| ---- | ----- |
| serviceTier | scale, default |



