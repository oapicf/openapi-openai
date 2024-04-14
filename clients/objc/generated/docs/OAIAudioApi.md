# OAIAudioApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpeech**](OAIAudioApi.md#createspeech) | **POST** /audio/speech | Generates audio from the input text.
[**createTranscription**](OAIAudioApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OAIAudioApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.


# **createSpeech**
```objc
-(NSURLSessionTask*) createSpeechWithCreateSpeechRequest: (OAICreateSpeechRequest*) createSpeechRequest
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Generates audio from the input text.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateSpeechRequest* createSpeechRequest = [[OAICreateSpeechRequest alloc] init]; // 

OAIAudioApi*apiInstance = [[OAIAudioApi alloc] init];

// Generates audio from the input text.
[apiInstance createSpeechWithCreateSpeechRequest:createSpeechRequest
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudioApi->createSpeech: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpeechRequest** | [**OAICreateSpeechRequest***](OAICreateSpeechRequest.md)|  | 

### Return type

**NSURL***

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranscription**
```objc
-(NSURLSessionTask*) createTranscriptionWithFile: (NSURL*) file
    model: (OAICreateTranscriptionRequestModel*) model
    language: (NSString*) language
    prompt: (NSString*) prompt
    responseFormat: (NSString*) responseFormat
    temperature: (NSNumber*) temperature
    timestampGranularities: (NSArray<NSString*>*) timestampGranularities
        completionHandler: (void (^)(OAICreateTranscription200Response* output, NSError* error)) handler;
```

Transcribes audio into the input language.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
OAICreateTranscriptionRequestModel* model = [[OAICreateTranscriptionRequestModel alloc] init]; // 
NSString* language = @"language_example"; // The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
NSString* prompt = @"prompt_example"; // An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
NSString* responseFormat = @"json"; // The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional) (default to @"json")
NSNumber* temperature = @0; // The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to @0)
NSArray<NSString*>* timestampGranularities = @[@"timestampGranularities_example"]; // The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)

OAIAudioApi*apiInstance = [[OAIAudioApi alloc] init];

// Transcribes audio into the input language.
[apiInstance createTranscriptionWithFile:file
              model:model
              language:language
              prompt:prompt
              responseFormat:responseFormat
              temperature:temperature
              timestampGranularities:timestampGranularities
          completionHandler: ^(OAICreateTranscription200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudioApi->createTranscription: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **NSURL*****NSURL***| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**OAICreateTranscriptionRequestModel***](OAICreateTranscriptionRequestModel.md)|  | 
 **language** | **NSString***| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 
 **prompt** | **NSString***| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **responseFormat** | **NSString***| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [optional] [default to @&quot;json&quot;]
 **temperature** | **NSNumber***| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to @0]
 **timestampGranularities** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] 

### Return type

[**OAICreateTranscription200Response***](OAICreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranslation**
```objc
-(NSURLSessionTask*) createTranslationWithFile: (NSURL*) file
    model: (OAICreateTranscriptionRequestModel*) model
    prompt: (NSString*) prompt
    responseFormat: (NSString*) responseFormat
    temperature: (NSNumber*) temperature
        completionHandler: (void (^)(OAICreateTranslation200Response* output, NSError* error)) handler;
```

Translates audio into English.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
OAICreateTranscriptionRequestModel* model = [[OAICreateTranscriptionRequestModel alloc] init]; // 
NSString* prompt = @"prompt_example"; // An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
NSString* responseFormat = @"json"; // The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional) (default to @"json")
NSNumber* temperature = @0; // The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to @0)

OAIAudioApi*apiInstance = [[OAIAudioApi alloc] init];

// Translates audio into English.
[apiInstance createTranslationWithFile:file
              model:model
              prompt:prompt
              responseFormat:responseFormat
              temperature:temperature
          completionHandler: ^(OAICreateTranslation200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudioApi->createTranslation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **NSURL*****NSURL***| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**OAICreateTranscriptionRequestModel***](OAICreateTranscriptionRequestModel.md)|  | 
 **prompt** | **NSString***| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **responseFormat** | **NSString***| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [optional] [default to @&quot;json&quot;]
 **temperature** | **NSNumber***| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to @0]

### Return type

[**OAICreateTranslation200Response***](OAICreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

