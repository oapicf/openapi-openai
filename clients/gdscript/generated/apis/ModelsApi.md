<a name="__pageTop"></a>
# ModelsApi   { #ModelsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_model**](#delete_model) | **DELETE** `/models/{model}` | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**list_models**](#list_models) | **GET** `/models` | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_model**](#retrieve_model) | **GET** `/models/{model}` | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

# **delete_model**   { #delete_model }
<a name="delete_model"></a>

> `delete_model(model: String, on_success: Callable, on_failure: Callable)`

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.



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
var api = ModelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ModelsApi.new(config, client)


# Invoke an endpoint
api.delete_model(
	# model: String = ""   Eg: ft:gpt-4o-mini:acemeco:suffix:abc123
	# The model to delete
	model,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_model", response)
		assert(response.data is DeleteModelResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_models**   { #list_models }
<a name="list_models"></a>

> `list_models( on_success: Callable, on_failure: Callable)`

Lists the currently available models, and provides basic information about each one such as the owner and availability.



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
var api = ModelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ModelsApi.new(config, client)


# Invoke an endpoint
api.list_models(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_models", response)
		assert(response.data is ListModelsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_model**   { #retrieve_model }
<a name="retrieve_model"></a>

> `retrieve_model(model: String, on_success: Callable, on_failure: Callable)`

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.



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
var api = ModelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ModelsApi.new(config, client)


# Invoke an endpoint
api.retrieve_model(
	# model: String = ""   Eg: gpt-4o-mini
	# The ID of the model to use for this request
	model,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_model", response)
		assert(response.data is Model)
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

