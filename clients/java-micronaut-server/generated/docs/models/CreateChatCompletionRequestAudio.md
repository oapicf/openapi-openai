

# CreateChatCompletionRequestAudio

Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 

The class is defined in **[CreateChatCompletionRequestAudio.java](../../src/main/java/org/openapitools/model/CreateChatCompletionRequestAudio.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice** | [**VoiceEnum**](#VoiceEnum) | The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive).  | 
**_format** | [**FormatEnum**](#FormatEnum) | Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;.  | 

## VoiceEnum

Name | Value
---- | -----
ALLOY | `"alloy"`
ASH | `"ash"`
BALLAD | `"ballad"`
CORAL | `"coral"`
ECHO | `"echo"`
SAGE | `"sage"`
SHIMMER | `"shimmer"`
VERSE | `"verse"`

## FormatEnum

Name | Value
---- | -----
WAV | `"wav"`
MP3 | `"mp3"`
FLAC | `"flac"`
OPUS | `"opus"`
PCM16 | `"pcm16"`


