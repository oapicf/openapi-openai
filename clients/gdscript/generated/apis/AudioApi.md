<a name="__pageTop"></a>
# AudioApi   { #AudioApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_speech**](#create_speech) | **POST** `/audio/speech` | Generates audio from the input text.
[**create_transcription**](#create_transcription) | **POST** `/audio/transcriptions` | Transcribes audio into the input language.
[**create_translation**](#create_translation) | **POST** `/audio/translations` | Translates audio into English.

# **create_speech**   { #create_speech }
<a name="create_speech"></a>

> `create_speech(createSpeechRequest: CreateSpeechRequest, on_success: Callable, on_failure: Callable)`

Generates audio from the input text.



### Example

* Bearer Authentication (`ApiKeyAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = AudioApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudioApi.new(config, client)

var createSpeechRequest = CreateSpeechRequest.new()
# … fill model createSpeechRequest with data

# Invoke an endpoint
api.create_speech(
	# createSpeechRequest: CreateSpeechRequest
	createSpeechRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_speech", response)
		assert(response.data is file)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_transcription**   { #create_transcription }
<a name="create_transcription"></a>

> `create_transcription(file: String,model: CreateTranscriptionRequestModel,language = "",prompt = "",responseFormat = null,temperature = 0,timestampGranularitiesLeft_Square_BracketRight_Square_Bracket = "", on_success: Callable, on_failure: Callable)`

Transcribes audio into the input language.



### Example

* Bearer Authentication (`ApiKeyAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = AudioApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudioApi.new(config, client)


# Invoke an endpoint
api.create_transcription(
	# file: String   Eg: BINARY_DATA_HERE
	# The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
	file,
	# model: CreateTranscriptionRequestModel
	model,
	# language: String = ""   Eg: language_example
	# The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
	language,
	# prompt: String = ""   Eg: prompt_example
	# An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
	prompt,
	# responseFormat: AudioResponseFormat
	responseFormat,
	# temperature: float = 0   Eg: 8.14
	# The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
	temperature,
	# timestampGranularitiesLeft_Square_BracketRight_Square_Bracket: Array = ""
	# The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
	timestampGranularitiesLeft_Square_BracketRight_Square_Bracket,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_transcription", response)
		assert(response.data is createTranscription_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_translation**   { #create_translation }
<a name="create_translation"></a>

> `create_translation(file: String,model: CreateTranscriptionRequestModel,prompt = "",responseFormat = null,temperature = 0, on_success: Callable, on_failure: Callable)`

Translates audio into English.



### Example

* Bearer Authentication (`ApiKeyAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = AudioApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudioApi.new(config, client)


# Invoke an endpoint
api.create_translation(
	# file: String   Eg: BINARY_DATA_HERE
	# The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
	file,
	# model: CreateTranscriptionRequestModel
	model,
	# prompt: String = ""   Eg: prompt_example
	# An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
	prompt,
	# responseFormat: AudioResponseFormat
	responseFormat,
	# temperature: float = 0   Eg: 8.14
	# The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
	temperature,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_translation", response)
		assert(response.data is createTranslation_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

