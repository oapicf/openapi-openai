# AUDIO_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_speech**](AUDIO_API.md#create_speech) | **Post** /audio/speech | Generates audio from the input text.
[**create_transcription**](AUDIO_API.md#create_transcription) | **Post** /audio/transcriptions | Transcribes audio into the input language.
[**create_translation**](AUDIO_API.md#create_translation) | **Post** /audio/translations | Translates audio into English.


# **create_speech**
> create_speech (create_speech_request: CREATE_SPEECH_REQUEST ): detachable FILE


Generates audio from the input text.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_speech_request** | [**CREATE_SPEECH_REQUEST**](CREATE_SPEECH_REQUEST.md)|  | 

### Return type

[**FILE**](FILE.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transcription**
> create_transcription (file: FILE ; model: CREATE_TRANSCRIPTION_REQUEST_MODEL ; language:  detachable STRING_32 ; prompt:  detachable STRING_32 ; response_format:  detachable STRING_32 ; temperature:  detachable REAL_32 ; timestamp_granularities:  detachable LIST [STRING_32] ): detachable CREATE_TRANSCRIPTION_200_RESPONSE


Transcribes audio into the input language.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **FILE**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [default to null]
 **model** | [**CREATE_TRANSCRIPTION_REQUEST_MODEL**](CreateTranscriptionRequest_model.md)|  | [default to null]
 **language** | **STRING_32**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] [default to null]
 **prompt** | **STRING_32**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] [default to null]
 **response_format** | **STRING_32**| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [optional] [default to json]
 **temperature** | **REAL_32**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **timestamp_granularities** | [**LIST [STRING_32]**](STRING_32.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] [default to null]

### Return type

[**CREATE_TRANSCRIPTION_200_RESPONSE**](createTranscription_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_translation**
> create_translation (file: FILE ; model: CREATE_TRANSCRIPTION_REQUEST_MODEL ; prompt:  detachable STRING_32 ; response_format:  detachable STRING_32 ; temperature:  detachable REAL_32 ): detachable CREATE_TRANSLATION_200_RESPONSE


Translates audio into English.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **FILE**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [default to null]
 **model** | [**CREATE_TRANSCRIPTION_REQUEST_MODEL**](CreateTranscriptionRequest_model.md)|  | [default to null]
 **prompt** | **STRING_32**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] [default to null]
 **response_format** | **STRING_32**| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [optional] [default to json]
 **temperature** | **REAL_32**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CREATE_TRANSLATION_200_RESPONSE**](createTranslation_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

