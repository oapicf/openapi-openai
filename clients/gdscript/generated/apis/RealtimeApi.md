<a name="__pageTop"></a>
# RealtimeApi   { #RealtimeApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_realtime_session**](#create_realtime_session) | **POST** `/realtime/sessions` | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

# **create_realtime_session**   { #create_realtime_session }
<a name="create_realtime_session"></a>

> `create_realtime_session(realtimeSessionCreateRequest: RealtimeSessionCreateRequest, on_success: Callable, on_failure: Callable)`

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 



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
var api = RealtimeApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = RealtimeApi.new(config, client)

var realtimeSessionCreateRequest = RealtimeSessionCreateRequest.new()
# … fill model realtimeSessionCreateRequest with data

# Invoke an endpoint
api.create_realtime_session(
	# realtimeSessionCreateRequest: RealtimeSessionCreateRequest
	# Create an ephemeral API key with the given session configuration.
	realtimeSessionCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_realtime_session", response)
		assert(response.data is RealtimeSessionCreateResponse)
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

