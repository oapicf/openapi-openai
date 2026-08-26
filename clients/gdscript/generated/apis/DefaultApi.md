<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_api_keys_create**](#admin_api_keys_create) | **POST** `/organization/admin_api_keys` | Create an organization admin API key
[**admin_api_keys_delete**](#admin_api_keys_delete) | **DELETE** `/organization/admin_api_keys/{key_id}` | Delete an organization admin API key
[**admin_api_keys_get**](#admin_api_keys_get) | **GET** `/organization/admin_api_keys/{key_id}` | Retrieve a single organization API key
[**admin_api_keys_list**](#admin_api_keys_list) | **GET** `/organization/admin_api_keys` | List organization API keys

# **admin_api_keys_create**   { #admin_api_keys_create }
<a name="admin_api_keys_create"></a>

> `admin_api_keys_create(adminApiKeysCreateRequest: AdminApiKeysCreateRequest, on_success: Callable, on_failure: Callable)`

Create an organization admin API key

Create a new admin-level API key for the organization.

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
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)

var adminApiKeysCreateRequest = AdminApiKeysCreateRequest.new()
# … fill model adminApiKeysCreateRequest with data

# Invoke an endpoint
api.admin_api_keys_create(
	# adminApiKeysCreateRequest: AdminApiKeysCreateRequest
	adminApiKeysCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "admin_api_keys_create", response)
		assert(response.data is AdminApiKey)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **admin_api_keys_delete**   { #admin_api_keys_delete }
<a name="admin_api_keys_delete"></a>

> `admin_api_keys_delete(keyId: String, on_success: Callable, on_failure: Callable)`

Delete an organization admin API key

Delete the specified admin API key.

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
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.admin_api_keys_delete(
	# keyId: String = ""   Eg: keyId_example
	keyId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "admin_api_keys_delete", response)
		assert(response.data is admin_api_keys_delete_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **admin_api_keys_get**   { #admin_api_keys_get }
<a name="admin_api_keys_get"></a>

> `admin_api_keys_get(keyId: String, on_success: Callable, on_failure: Callable)`

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

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
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.admin_api_keys_get(
	# keyId: String = ""   Eg: keyId_example
	keyId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "admin_api_keys_get", response)
		assert(response.data is AdminApiKey)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **admin_api_keys_list**   { #admin_api_keys_list }
<a name="admin_api_keys_list"></a>

> `admin_api_keys_list(after = "",order = "asc",limit = 20, on_success: Callable, on_failure: Callable)`

List organization API keys

Retrieve a paginated list of organization admin API keys.

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
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.admin_api_keys_list(
	# after: String = ""   Eg: after_example
	after,
	# order: String = "asc"   Eg: order_example
	order,
	# limit: int = 20   Eg: 56
	limit,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "admin_api_keys_list", response)
		assert(response.data is ApiKeyList)
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

