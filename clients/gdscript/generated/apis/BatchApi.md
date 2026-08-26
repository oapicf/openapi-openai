<a name="__pageTop"></a>
# BatchApi   { #BatchApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_batch**](#cancel_batch) | **POST** `/batches/{batch_id}/cancel` | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**create_batch**](#create_batch) | **POST** `/batches` | Creates and executes a batch from an uploaded file of requests
[**list_batches**](#list_batches) | **GET** `/batches` | List your organization&#x27;s batches.
[**retrieve_batch**](#retrieve_batch) | **GET** `/batches/{batch_id}` | Retrieves a batch.

# **cancel_batch**   { #cancel_batch }
<a name="cancel_batch"></a>

> `cancel_batch(batchId: String, on_success: Callable, on_failure: Callable)`

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.



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
var api = BatchApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BatchApi.new(config, client)


# Invoke an endpoint
api.cancel_batch(
	# batchId: String = ""   Eg: batchId_example
	# The ID of the batch to cancel.
	batchId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "cancel_batch", response)
		assert(response.data is Batch)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_batch**   { #create_batch }
<a name="create_batch"></a>

> `create_batch(createBatchRequest: CreateBatchRequest, on_success: Callable, on_failure: Callable)`

Creates and executes a batch from an uploaded file of requests



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
var api = BatchApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BatchApi.new(config, client)

var createBatchRequest = CreateBatchRequest.new()
# … fill model createBatchRequest with data

# Invoke an endpoint
api.create_batch(
	# createBatchRequest: CreateBatchRequest
	createBatchRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_batch", response)
		assert(response.data is Batch)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_batches**   { #list_batches }
<a name="list_batches"></a>

> `list_batches(after = "",limit = 20, on_success: Callable, on_failure: Callable)`

List your organization's batches.



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
var api = BatchApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BatchApi.new(config, client)


# Invoke an endpoint
api.list_batches(
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_batches", response)
		assert(response.data is ListBatchesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_batch**   { #retrieve_batch }
<a name="retrieve_batch"></a>

> `retrieve_batch(batchId: String, on_success: Callable, on_failure: Callable)`

Retrieves a batch.



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
var api = BatchApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BatchApi.new(config, client)


# Invoke an endpoint
api.retrieve_batch(
	# batchId: String = ""   Eg: batchId_example
	# The ID of the batch to retrieve.
	batchId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_batch", response)
		assert(response.data is Batch)
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

