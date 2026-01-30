
# CreateChatCompletionStreamResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | A unique identifier for the chat completion. Each chunk has the same ID. |  |
| **choices** | [**kotlin.collections.List&lt;CreateChatCompletionStreamResponseChoicesInner&gt;**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can contain more than one elements if &#x60;n&#x60; is greater than 1. Can also be empty for the last chunk if you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60;.  |  |
| **created** | **kotlin.Int** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. |  |
| **model** | **kotlin.String** | The model to generate the completion. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;chat.completion.chunk&#x60;. |  |
| **serviceTier** | [**inline**](#ServiceTier) | The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. |  [optional] |
| **systemFingerprint** | **kotlin.String** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional] |
| **usage** | [**CreateChatCompletionStreamResponseUsage**](CreateChatCompletionStreamResponseUsage.md) |  |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | chat.completion.chunk |


<a id="ServiceTier"></a>
## Enum: service_tier
| Name | Value |
| ---- | ----- |
| serviceTier | scale, default |



