<a name="__pageTop"></a>
# ChatApi   { #ChatApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat_completion**](#create_chat_completion) | **POST** `/chat/completions` | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

# **create_chat_completion**   { #create_chat_completion }
<a name="create_chat_completion"></a>

> `create_chat_completion(createChatCompletionRequest: CreateChatCompletionRequest, on_success: Callable, on_failure: Callable)`

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 



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
var api = ChatApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ChatApi.new(config, client)

var createChatCompletionRequest = CreateChatCompletionRequest.new()
# … fill model createChatCompletionRequest with data

# Invoke an endpoint
api.create_chat_completion(
	# createChatCompletionRequest: CreateChatCompletionRequest
	createChatCompletionRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_chat_completion", response)
		assert(response.data is CreateChatCompletionResponse)
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

