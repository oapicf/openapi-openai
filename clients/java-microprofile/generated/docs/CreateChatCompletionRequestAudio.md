

# CreateChatCompletionRequestAudio

Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voice** | [**VoiceEnum**](#VoiceEnum) | The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive).  |  |
|**format** | [**FormatEnum**](#FormatEnum) | Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;.  |  |



## Enum: VoiceEnum

| Name | Value |
|---- | -----|
| ALLOY | &quot;alloy&quot; |
| ASH | &quot;ash&quot; |
| BALLAD | &quot;ballad&quot; |
| CORAL | &quot;coral&quot; |
| ECHO | &quot;echo&quot; |
| SAGE | &quot;sage&quot; |
| SHIMMER | &quot;shimmer&quot; |
| VERSE | &quot;verse&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |
| FLAC | &quot;flac&quot; |
| OPUS | &quot;opus&quot; |
| PCM16 | &quot;pcm16&quot; |



