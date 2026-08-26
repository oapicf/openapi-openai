<a name="__pageTop"></a>
# CompletionsApi   { #CompletionsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_completion**](#create_completion) | **POST** `/completions` | Creates a completion for the provided prompt and parameters.

# **create_completion**   { #create_completion }
<a name="create_completion"></a>

> `create_completion(createCompletionRequest: CreateCompletionRequest, on_success: Callable, on_failure: Callable)`

Creates a completion for the provided prompt and parameters.



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
var api = CompletionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CompletionsApi.new(config, client)

var createCompletionRequest = CreateCompletionRequest.new()
# … fill model createCompletionRequest with data

# Invoke an endpoint
api.create_completion(
	# createCompletionRequest: CreateCompletionRequest
	createCompletionRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_completion", response)
		assert(response.data is CreateCompletionResponse)
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

