<a name="__pageTop"></a>
# EmbeddingsApi   { #EmbeddingsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_embedding**](#create_embedding) | **POST** `/embeddings` | Creates an embedding vector representing the input text.

# **create_embedding**   { #create_embedding }
<a name="create_embedding"></a>

> `create_embedding(createEmbeddingRequest: CreateEmbeddingRequest, on_success: Callable, on_failure: Callable)`

Creates an embedding vector representing the input text.



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
var api = EmbeddingsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EmbeddingsApi.new(config, client)

var createEmbeddingRequest = CreateEmbeddingRequest.new()
# … fill model createEmbeddingRequest with data

# Invoke an endpoint
api.create_embedding(
	# createEmbeddingRequest: CreateEmbeddingRequest
	createEmbeddingRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_embedding", response)
		assert(response.data is CreateEmbeddingResponse)
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

