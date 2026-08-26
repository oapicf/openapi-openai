<a name="__pageTop"></a>
# ModerationsApi   { #ModerationsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_moderation**](#create_moderation) | **POST** `/moderations` | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

# **create_moderation**   { #create_moderation }
<a name="create_moderation"></a>

> `create_moderation(createModerationRequest: CreateModerationRequest, on_success: Callable, on_failure: Callable)`

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 



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
var api = ModerationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ModerationsApi.new(config, client)

var createModerationRequest = CreateModerationRequest.new()
# … fill model createModerationRequest with data

# Invoke an endpoint
api.create_moderation(
	# createModerationRequest: CreateModerationRequest
	createModerationRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_moderation", response)
		assert(response.data is CreateModerationResponse)
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

