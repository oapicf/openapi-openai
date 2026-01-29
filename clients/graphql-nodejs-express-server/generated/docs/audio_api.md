# audio_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateSpeech**](audio_api.md#CreateSpeech) | **POST** /audio/speech | Generates audio from the input text.
[**CreateTranscription**](audio_api.md#CreateTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**CreateTranslation**](audio_api.md#CreateTranslation) | **POST** /audio/translations | Translates audio into English.


<a name="CreateSpeech"></a>
# **CreateSpeech**
> String! CreateSpeech(createSpeechRequest)

Generates audio from the input text.
<a name="CreateTranscription"></a>
# **CreateTranscription**
> CreateTranscription200Response CreateTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities)

Transcribes audio into the input language.
<a name="CreateTranslation"></a>
# **CreateTranslation**
> CreateTranslation200Response CreateTranslation(file, model, prompt, responseFormat, temperature)

Translates audio into English.
