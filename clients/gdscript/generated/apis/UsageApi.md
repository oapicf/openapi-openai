<a name="__pageTop"></a>
# UsageApi   { #UsageApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usage_audio_speeches**](#usage_audio_speeches) | **GET** `/organization/usage/audio_speeches` | Get audio speeches usage details for the organization.
[**usage_audio_transcriptions**](#usage_audio_transcriptions) | **GET** `/organization/usage/audio_transcriptions` | Get audio transcriptions usage details for the organization.
[**usage_code_interpreter_sessions**](#usage_code_interpreter_sessions) | **GET** `/organization/usage/code_interpreter_sessions` | Get code interpreter sessions usage details for the organization.
[**usage_completions**](#usage_completions) | **GET** `/organization/usage/completions` | Get completions usage details for the organization.
[**usage_costs**](#usage_costs) | **GET** `/organization/costs` | Get costs details for the organization.
[**usage_embeddings**](#usage_embeddings) | **GET** `/organization/usage/embeddings` | Get embeddings usage details for the organization.
[**usage_images**](#usage_images) | **GET** `/organization/usage/images` | Get images usage details for the organization.
[**usage_moderations**](#usage_moderations) | **GET** `/organization/usage/moderations` | Get moderations usage details for the organization.
[**usage_vector_stores**](#usage_vector_stores) | **GET** `/organization/usage/vector_stores` | Get vector stores usage details for the organization.

# **usage_audio_speeches**   { #usage_audio_speeches }
<a name="usage_audio_speeches"></a>

> `usage_audio_speeches(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,userIds = null,apiKeyIds = null,models = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get audio speeches usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_audio_speeches(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# userIds: Array
	# Return only usage for these users.
	userIds,
	# apiKeyIds: Array
	# Return only usage for these API keys.
	apiKeyIds,
	# models: Array
	# Return only usage for these models.
	models,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_audio_speeches", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_audio_transcriptions**   { #usage_audio_transcriptions }
<a name="usage_audio_transcriptions"></a>

> `usage_audio_transcriptions(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,userIds = null,apiKeyIds = null,models = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get audio transcriptions usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_audio_transcriptions(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# userIds: Array
	# Return only usage for these users.
	userIds,
	# apiKeyIds: Array
	# Return only usage for these API keys.
	apiKeyIds,
	# models: Array
	# Return only usage for these models.
	models,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_audio_transcriptions", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_code_interpreter_sessions**   { #usage_code_interpreter_sessions }
<a name="usage_code_interpreter_sessions"></a>

> `usage_code_interpreter_sessions(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get code interpreter sessions usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_code_interpreter_sessions(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_code_interpreter_sessions", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_completions**   { #usage_completions }
<a name="usage_completions"></a>

> `usage_completions(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,userIds = null,apiKeyIds = null,models = null,batch = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get completions usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_completions(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# userIds: Array
	# Return only usage for these users.
	userIds,
	# apiKeyIds: Array
	# Return only usage for these API keys.
	apiKeyIds,
	# models: Array
	# Return only usage for these models.
	models,
	# batch: bool   Eg: true
	# If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
	batch,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_completions", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_costs**   { #usage_costs }
<a name="usage_costs"></a>

> `usage_costs(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,groupBy = null,limit = 7,page = "", on_success: Callable, on_failure: Callable)`

Get costs details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_costs(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only costs for these projects.
	projectIds,
	# groupBy: Array
	# Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
	groupBy,
	# limit: int = 7   Eg: 56
	# A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_costs", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_embeddings**   { #usage_embeddings }
<a name="usage_embeddings"></a>

> `usage_embeddings(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,userIds = null,apiKeyIds = null,models = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get embeddings usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_embeddings(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# userIds: Array
	# Return only usage for these users.
	userIds,
	# apiKeyIds: Array
	# Return only usage for these API keys.
	apiKeyIds,
	# models: Array
	# Return only usage for these models.
	models,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_embeddings", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_images**   { #usage_images }
<a name="usage_images"></a>

> `usage_images(startTime: int,endTime = null,bucketWidth = "1d",sources = null,sizes = null,projectIds = null,userIds = null,apiKeyIds = null,models = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get images usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_images(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# sources: Array
	# Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
	sources,
	# sizes: Array
	# Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
	sizes,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# userIds: Array
	# Return only usage for these users.
	userIds,
	# apiKeyIds: Array
	# Return only usage for these API keys.
	apiKeyIds,
	# models: Array
	# Return only usage for these models.
	models,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_images", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_moderations**   { #usage_moderations }
<a name="usage_moderations"></a>

> `usage_moderations(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,userIds = null,apiKeyIds = null,models = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get moderations usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_moderations(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# userIds: Array
	# Return only usage for these users.
	userIds,
	# apiKeyIds: Array
	# Return only usage for these API keys.
	apiKeyIds,
	# models: Array
	# Return only usage for these models.
	models,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_moderations", response)
		assert(response.data is UsageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **usage_vector_stores**   { #usage_vector_stores }
<a name="usage_vector_stores"></a>

> `usage_vector_stores(startTime: int,endTime = null,bucketWidth = "1d",projectIds = null,groupBy = null,limit = null,page = "", on_success: Callable, on_failure: Callable)`

Get vector stores usage details for the organization.



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
var api = UsageApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsageApi.new(config, client)


# Invoke an endpoint
api.usage_vector_stores(
	# startTime: int   Eg: 56
	# Start time (Unix seconds) of the query time range, inclusive.
	startTime,
	# endTime: int   Eg: 56
	# End time (Unix seconds) of the query time range, exclusive.
	endTime,
	# bucketWidth: String = "1d"   Eg: bucketWidth_example
	# Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
	bucketWidth,
	# projectIds: Array
	# Return only usage for these projects.
	projectIds,
	# groupBy: Array
	# Group the usage data by the specified fields. Support fields include `project_id`.
	groupBy,
	# limit: int   Eg: 56
	# Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
	limit,
	# page: String = ""   Eg: page_example
	# A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
	page,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "usage_vector_stores", response)
		assert(response.data is UsageResponse)
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

