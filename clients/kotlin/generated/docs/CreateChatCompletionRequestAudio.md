
# CreateChatCompletionRequestAudio

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **voice** | [**inline**](#Voice) | The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive).  |  |
| **format** | [**inline**](#Format) | Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;.  |  |


<a id="Voice"></a>
## Enum: voice
| Name | Value |
| ---- | ----- |
| voice | alloy, ash, ballad, coral, echo, sage, shimmer, verse |


<a id="Format"></a>
## Enum: format
| Name | Value |
| ---- | ----- |
| format | wav, mp3, flac, opus, pcm16 |



