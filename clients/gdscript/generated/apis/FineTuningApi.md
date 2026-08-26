<a name="__pageTop"></a>
# FineTuningApi   { #FineTuningApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tuning_job**](#cancel_fine_tuning_job) | **POST** `/fine_tuning/jobs/{fine_tuning_job_id}/cancel` | Immediately cancel a fine-tune job. 
[**create_fine_tuning_job**](#create_fine_tuning_job) | **POST** `/fine_tuning/jobs` | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**list_fine_tuning_events**](#list_fine_tuning_events) | **GET** `/fine_tuning/jobs/{fine_tuning_job_id}/events` | Get status updates for a fine-tuning job. 
[**list_fine_tuning_job_checkpoints**](#list_fine_tuning_job_checkpoints) | **GET** `/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints` | List checkpoints for a fine-tuning job. 
[**list_paginated_fine_tuning_jobs**](#list_paginated_fine_tuning_jobs) | **GET** `/fine_tuning/jobs` | List your organization&#x27;s fine-tuning jobs 
[**retrieve_fine_tuning_job**](#retrieve_fine_tuning_job) | **GET** `/fine_tuning/jobs/{fine_tuning_job_id}` | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

# **cancel_fine_tuning_job**   { #cancel_fine_tuning_job }
<a name="cancel_fine_tuning_job"></a>

> `cancel_fine_tuning_job(fineTuningJobId: String, on_success: Callable, on_failure: Callable)`

Immediately cancel a fine-tune job. 



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
var api = FineTuningApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FineTuningApi.new(config, client)


# Invoke an endpoint
api.cancel_fine_tuning_job(
	# fineTuningJobId: String = ""   Eg: ft-AF1WoRqd3aJAHsqc9NY7iL8F
	# The ID of the fine-tuning job to cancel. 
	fineTuningJobId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "cancel_fine_tuning_job", response)
		assert(response.data is FineTuningJob)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_fine_tuning_job**   { #create_fine_tuning_job }
<a name="create_fine_tuning_job"></a>

> `create_fine_tuning_job(createFineTuningJobRequest: CreateFineTuningJobRequest, on_success: Callable, on_failure: Callable)`

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 



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
var api = FineTuningApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FineTuningApi.new(config, client)

var createFineTuningJobRequest = CreateFineTuningJobRequest.new()
# … fill model createFineTuningJobRequest with data

# Invoke an endpoint
api.create_fine_tuning_job(
	# createFineTuningJobRequest: CreateFineTuningJobRequest
	createFineTuningJobRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_fine_tuning_job", response)
		assert(response.data is FineTuningJob)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_fine_tuning_events**   { #list_fine_tuning_events }
<a name="list_fine_tuning_events"></a>

> `list_fine_tuning_events(fineTuningJobId: String,after = "",limit = 20, on_success: Callable, on_failure: Callable)`

Get status updates for a fine-tuning job. 



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
var api = FineTuningApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FineTuningApi.new(config, client)


# Invoke an endpoint
api.list_fine_tuning_events(
	# fineTuningJobId: String = ""   Eg: ft-AF1WoRqd3aJAHsqc9NY7iL8F
	# The ID of the fine-tuning job to get events for. 
	fineTuningJobId,
	# after: String = ""   Eg: after_example
	# Identifier for the last event from the previous pagination request.
	after,
	# limit: int = 20   Eg: 56
	# Number of events to retrieve.
	limit,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_fine_tuning_events", response)
		assert(response.data is ListFineTuningJobEventsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_fine_tuning_job_checkpoints**   { #list_fine_tuning_job_checkpoints }
<a name="list_fine_tuning_job_checkpoints"></a>

> `list_fine_tuning_job_checkpoints(fineTuningJobId: String,after = "",limit = 10, on_success: Callable, on_failure: Callable)`

List checkpoints for a fine-tuning job. 



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
var api = FineTuningApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FineTuningApi.new(config, client)


# Invoke an endpoint
api.list_fine_tuning_job_checkpoints(
	# fineTuningJobId: String = ""   Eg: ft-AF1WoRqd3aJAHsqc9NY7iL8F
	# The ID of the fine-tuning job to get checkpoints for. 
	fineTuningJobId,
	# after: String = ""   Eg: after_example
	# Identifier for the last checkpoint ID from the previous pagination request.
	after,
	# limit: int = 10   Eg: 56
	# Number of checkpoints to retrieve.
	limit,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_fine_tuning_job_checkpoints", response)
		assert(response.data is ListFineTuningJobCheckpointsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_paginated_fine_tuning_jobs**   { #list_paginated_fine_tuning_jobs }
<a name="list_paginated_fine_tuning_jobs"></a>

> `list_paginated_fine_tuning_jobs(after = "",limit = 20, on_success: Callable, on_failure: Callable)`

List your organization's fine-tuning jobs 



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
var api = FineTuningApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FineTuningApi.new(config, client)


# Invoke an endpoint
api.list_paginated_fine_tuning_jobs(
	# after: String = ""   Eg: after_example
	# Identifier for the last job from the previous pagination request.
	after,
	# limit: int = 20   Eg: 56
	# Number of fine-tuning jobs to retrieve.
	limit,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_paginated_fine_tuning_jobs", response)
		assert(response.data is ListPaginatedFineTuningJobsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_fine_tuning_job**   { #retrieve_fine_tuning_job }
<a name="retrieve_fine_tuning_job"></a>

> `retrieve_fine_tuning_job(fineTuningJobId: String, on_success: Callable, on_failure: Callable)`

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 



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
var api = FineTuningApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FineTuningApi.new(config, client)


# Invoke an endpoint
api.retrieve_fine_tuning_job(
	# fineTuningJobId: String = ""   Eg: ft-AF1WoRqd3aJAHsqc9NY7iL8F
	# The ID of the fine-tuning job. 
	fineTuningJobId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_fine_tuning_job", response)
		assert(response.data is FineTuningJob)
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

