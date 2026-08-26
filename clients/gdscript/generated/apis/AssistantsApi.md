<a name="__pageTop"></a>
# AssistantsApi   { #AssistantsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_run**](#cancel_run) | **POST** `/threads/{thread_id}/runs/{run_id}/cancel` | Cancels a run that is &#x60;in_progress&#x60;.
[**create_assistant**](#create_assistant) | **POST** `/assistants` | Create an assistant with a model and instructions.
[**create_message**](#create_message) | **POST** `/threads/{thread_id}/messages` | Create a message.
[**create_run**](#create_run) | **POST** `/threads/{thread_id}/runs` | Create a run.
[**create_thread**](#create_thread) | **POST** `/threads` | Create a thread.
[**create_thread_and_run**](#create_thread_and_run) | **POST** `/threads/runs` | Create a thread and run it in one request.
[**delete_assistant**](#delete_assistant) | **DELETE** `/assistants/{assistant_id}` | Delete an assistant.
[**delete_message**](#delete_message) | **DELETE** `/threads/{thread_id}/messages/{message_id}` | Deletes a message.
[**delete_thread**](#delete_thread) | **DELETE** `/threads/{thread_id}` | Delete a thread.
[**get_assistant**](#get_assistant) | **GET** `/assistants/{assistant_id}` | Retrieves an assistant.
[**get_message**](#get_message) | **GET** `/threads/{thread_id}/messages/{message_id}` | Retrieve a message.
[**get_run**](#get_run) | **GET** `/threads/{thread_id}/runs/{run_id}` | Retrieves a run.
[**get_run_step**](#get_run_step) | **GET** `/threads/{thread_id}/runs/{run_id}/steps/{step_id}` | Retrieves a run step.
[**get_thread**](#get_thread) | **GET** `/threads/{thread_id}` | Retrieves a thread.
[**list_assistants**](#list_assistants) | **GET** `/assistants` | Returns a list of assistants.
[**list_messages**](#list_messages) | **GET** `/threads/{thread_id}/messages` | Returns a list of messages for a given thread.
[**list_run_steps**](#list_run_steps) | **GET** `/threads/{thread_id}/runs/{run_id}/steps` | Returns a list of run steps belonging to a run.
[**list_runs**](#list_runs) | **GET** `/threads/{thread_id}/runs` | Returns a list of runs belonging to a thread.
[**modify_assistant**](#modify_assistant) | **POST** `/assistants/{assistant_id}` | Modifies an assistant.
[**modify_message**](#modify_message) | **POST** `/threads/{thread_id}/messages/{message_id}` | Modifies a message.
[**modify_run**](#modify_run) | **POST** `/threads/{thread_id}/runs/{run_id}` | Modifies a run.
[**modify_thread**](#modify_thread) | **POST** `/threads/{thread_id}` | Modifies a thread.
[**submit_tool_ouputs_to_run**](#submit_tool_ouputs_to_run) | **POST** `/threads/{thread_id}/runs/{run_id}/submit_tool_outputs` | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#x27;re all completed. All outputs must be submitted in a single request. 

# **cancel_run**   { #cancel_run }
<a name="cancel_run"></a>

> `cancel_run(threadId: String,runId: String, on_success: Callable, on_failure: Callable)`

Cancels a run that is `in_progress`.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.cancel_run(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to which this run belongs.
	threadId,
	# runId: String = ""   Eg: runId_example
	# The ID of the run to cancel.
	runId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "cancel_run", response)
		assert(response.data is RunObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_assistant**   { #create_assistant }
<a name="create_assistant"></a>

> `create_assistant(createAssistantRequest: CreateAssistantRequest, on_success: Callable, on_failure: Callable)`

Create an assistant with a model and instructions.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var createAssistantRequest = CreateAssistantRequest.new()
# … fill model createAssistantRequest with data

# Invoke an endpoint
api.create_assistant(
	# createAssistantRequest: CreateAssistantRequest
	createAssistantRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_assistant", response)
		assert(response.data is AssistantObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_message**   { #create_message }
<a name="create_message"></a>

> `create_message(threadId: String,createMessageRequest: CreateMessageRequest, on_success: Callable, on_failure: Callable)`

Create a message.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var createMessageRequest = CreateMessageRequest.new()
# … fill model createMessageRequest with data

# Invoke an endpoint
api.create_message(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the [thread](/docs/api-reference/threads) to create a message for.
	threadId,
	# createMessageRequest: CreateMessageRequest
	createMessageRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_message", response)
		assert(response.data is MessageObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_run**   { #create_run }
<a name="create_run"></a>

> `create_run(threadId: String,createRunRequest: CreateRunRequest,includeLeft_Square_BracketRight_Square_Bracket = null, on_success: Callable, on_failure: Callable)`

Create a run.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var createRunRequest = CreateRunRequest.new()
# … fill model createRunRequest with data

# Invoke an endpoint
api.create_run(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to run.
	threadId,
	# createRunRequest: CreateRunRequest
	createRunRequest,
	# includeLeft_Square_BracketRight_Square_Bracket: Array
	# A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
	includeLeft_Square_BracketRight_Square_Bracket,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_run", response)
		assert(response.data is RunObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_thread**   { #create_thread }
<a name="create_thread"></a>

> `create_thread(createThreadRequest = null, on_success: Callable, on_failure: Callable)`

Create a thread.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var createThreadRequest = CreateThreadRequest.new()
# … fill model createThreadRequest with data

# Invoke an endpoint
api.create_thread(
	# createThreadRequest: CreateThreadRequest
	createThreadRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_thread", response)
		assert(response.data is ThreadObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_thread_and_run**   { #create_thread_and_run }
<a name="create_thread_and_run"></a>

> `create_thread_and_run(createThreadAndRunRequest: CreateThreadAndRunRequest, on_success: Callable, on_failure: Callable)`

Create a thread and run it in one request.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var createThreadAndRunRequest = CreateThreadAndRunRequest.new()
# … fill model createThreadAndRunRequest with data

# Invoke an endpoint
api.create_thread_and_run(
	# createThreadAndRunRequest: CreateThreadAndRunRequest
	createThreadAndRunRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_thread_and_run", response)
		assert(response.data is RunObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_assistant**   { #delete_assistant }
<a name="delete_assistant"></a>

> `delete_assistant(assistantId: String, on_success: Callable, on_failure: Callable)`

Delete an assistant.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.delete_assistant(
	# assistantId: String = ""   Eg: assistantId_example
	# The ID of the assistant to delete.
	assistantId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_assistant", response)
		assert(response.data is DeleteAssistantResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_message**   { #delete_message }
<a name="delete_message"></a>

> `delete_message(threadId: String,messageId: String, on_success: Callable, on_failure: Callable)`

Deletes a message.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.delete_message(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to which this message belongs.
	threadId,
	# messageId: String = ""   Eg: messageId_example
	# The ID of the message to delete.
	messageId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_message", response)
		assert(response.data is DeleteMessageResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_thread**   { #delete_thread }
<a name="delete_thread"></a>

> `delete_thread(threadId: String, on_success: Callable, on_failure: Callable)`

Delete a thread.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.delete_thread(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to delete.
	threadId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_thread", response)
		assert(response.data is DeleteThreadResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_assistant**   { #get_assistant }
<a name="get_assistant"></a>

> `get_assistant(assistantId: String, on_success: Callable, on_failure: Callable)`

Retrieves an assistant.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.get_assistant(
	# assistantId: String = ""   Eg: assistantId_example
	# The ID of the assistant to retrieve.
	assistantId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_assistant", response)
		assert(response.data is AssistantObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_message**   { #get_message }
<a name="get_message"></a>

> `get_message(threadId: String,messageId: String, on_success: Callable, on_failure: Callable)`

Retrieve a message.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.get_message(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
	threadId,
	# messageId: String = ""   Eg: messageId_example
	# The ID of the message to retrieve.
	messageId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_message", response)
		assert(response.data is MessageObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_run**   { #get_run }
<a name="get_run"></a>

> `get_run(threadId: String,runId: String, on_success: Callable, on_failure: Callable)`

Retrieves a run.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.get_run(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the [thread](/docs/api-reference/threads) that was run.
	threadId,
	# runId: String = ""   Eg: runId_example
	# The ID of the run to retrieve.
	runId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_run", response)
		assert(response.data is RunObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_run_step**   { #get_run_step }
<a name="get_run_step"></a>

> `get_run_step(threadId: String,runId: String,stepId: String,includeLeft_Square_BracketRight_Square_Bracket = null, on_success: Callable, on_failure: Callable)`

Retrieves a run step.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.get_run_step(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to which the run and run step belongs.
	threadId,
	# runId: String = ""   Eg: runId_example
	# The ID of the run to which the run step belongs.
	runId,
	# stepId: String = ""   Eg: stepId_example
	# The ID of the run step to retrieve.
	stepId,
	# includeLeft_Square_BracketRight_Square_Bracket: Array
	# A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
	includeLeft_Square_BracketRight_Square_Bracket,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_run_step", response)
		assert(response.data is RunStepObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_thread**   { #get_thread }
<a name="get_thread"></a>

> `get_thread(threadId: String, on_success: Callable, on_failure: Callable)`

Retrieves a thread.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.get_thread(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to retrieve.
	threadId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_thread", response)
		assert(response.data is ThreadObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_assistants**   { #list_assistants }
<a name="list_assistants"></a>

> `list_assistants(limit = 20,order = "desc",after = "",before = "", on_success: Callable, on_failure: Callable)`

Returns a list of assistants.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.list_assistants(
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# order: String = "desc"   Eg: order_example
	# Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
	order,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# before: String = ""   Eg: before_example
	# A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
	before,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_assistants", response)
		assert(response.data is ListAssistantsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_messages**   { #list_messages }
<a name="list_messages"></a>

> `list_messages(threadId: String,limit = 20,order = "desc",after = "",before = "",runId = "", on_success: Callable, on_failure: Callable)`

Returns a list of messages for a given thread.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.list_messages(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the [thread](/docs/api-reference/threads) the messages belong to.
	threadId,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# order: String = "desc"   Eg: order_example
	# Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
	order,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# before: String = ""   Eg: before_example
	# A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
	before,
	# runId: String = ""   Eg: runId_example
	# Filter messages by the run ID that generated them. 
	runId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_messages", response)
		assert(response.data is ListMessagesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_run_steps**   { #list_run_steps }
<a name="list_run_steps"></a>

> `list_run_steps(threadId: String,runId: String,limit = 20,order = "desc",after = "",before = "",includeLeft_Square_BracketRight_Square_Bracket = null, on_success: Callable, on_failure: Callable)`

Returns a list of run steps belonging to a run.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.list_run_steps(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread the run and run steps belong to.
	threadId,
	# runId: String = ""   Eg: runId_example
	# The ID of the run the run steps belong to.
	runId,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# order: String = "desc"   Eg: order_example
	# Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
	order,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# before: String = ""   Eg: before_example
	# A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
	before,
	# includeLeft_Square_BracketRight_Square_Bracket: Array
	# A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
	includeLeft_Square_BracketRight_Square_Bracket,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_run_steps", response)
		assert(response.data is ListRunStepsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_runs**   { #list_runs }
<a name="list_runs"></a>

> `list_runs(threadId: String,limit = 20,order = "desc",after = "",before = "", on_success: Callable, on_failure: Callable)`

Returns a list of runs belonging to a thread.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)


# Invoke an endpoint
api.list_runs(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread the run belongs to.
	threadId,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# order: String = "desc"   Eg: order_example
	# Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
	order,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# before: String = ""   Eg: before_example
	# A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
	before,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_runs", response)
		assert(response.data is ListRunsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_assistant**   { #modify_assistant }
<a name="modify_assistant"></a>

> `modify_assistant(assistantId: String,modifyAssistantRequest: ModifyAssistantRequest, on_success: Callable, on_failure: Callable)`

Modifies an assistant.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var modifyAssistantRequest = ModifyAssistantRequest.new()
# … fill model modifyAssistantRequest with data

# Invoke an endpoint
api.modify_assistant(
	# assistantId: String = ""   Eg: assistantId_example
	# The ID of the assistant to modify.
	assistantId,
	# modifyAssistantRequest: ModifyAssistantRequest
	modifyAssistantRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_assistant", response)
		assert(response.data is AssistantObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_message**   { #modify_message }
<a name="modify_message"></a>

> `modify_message(threadId: String,messageId: String,modifyMessageRequest: ModifyMessageRequest, on_success: Callable, on_failure: Callable)`

Modifies a message.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var modifyMessageRequest = ModifyMessageRequest.new()
# … fill model modifyMessageRequest with data

# Invoke an endpoint
api.modify_message(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to which this message belongs.
	threadId,
	# messageId: String = ""   Eg: messageId_example
	# The ID of the message to modify.
	messageId,
	# modifyMessageRequest: ModifyMessageRequest
	modifyMessageRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_message", response)
		assert(response.data is MessageObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_run**   { #modify_run }
<a name="modify_run"></a>

> `modify_run(threadId: String,runId: String,modifyRunRequest: ModifyRunRequest, on_success: Callable, on_failure: Callable)`

Modifies a run.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var modifyRunRequest = ModifyRunRequest.new()
# … fill model modifyRunRequest with data

# Invoke an endpoint
api.modify_run(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the [thread](/docs/api-reference/threads) that was run.
	threadId,
	# runId: String = ""   Eg: runId_example
	# The ID of the run to modify.
	runId,
	# modifyRunRequest: ModifyRunRequest
	modifyRunRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_run", response)
		assert(response.data is RunObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_thread**   { #modify_thread }
<a name="modify_thread"></a>

> `modify_thread(threadId: String,modifyThreadRequest: ModifyThreadRequest, on_success: Callable, on_failure: Callable)`

Modifies a thread.



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var modifyThreadRequest = ModifyThreadRequest.new()
# … fill model modifyThreadRequest with data

# Invoke an endpoint
api.modify_thread(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the thread to modify. Only the `metadata` can be modified.
	threadId,
	# modifyThreadRequest: ModifyThreadRequest
	modifyThreadRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_thread", response)
		assert(response.data is ThreadObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **submit_tool_ouputs_to_run**   { #submit_tool_ouputs_to_run }
<a name="submit_tool_ouputs_to_run"></a>

> `submit_tool_ouputs_to_run(threadId: String,runId: String,submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, on_success: Callable, on_failure: Callable)`

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 



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
var api = AssistantsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AssistantsApi.new(config, client)

var submitToolOutputsRunRequest = SubmitToolOutputsRunRequest.new()
# … fill model submitToolOutputsRunRequest with data

# Invoke an endpoint
api.submit_tool_ouputs_to_run(
	# threadId: String = ""   Eg: threadId_example
	# The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
	threadId,
	# runId: String = ""   Eg: runId_example
	# The ID of the run that requires the tool output submission.
	runId,
	# submitToolOutputsRunRequest: SubmitToolOutputsRunRequest
	submitToolOutputsRunRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "submit_tool_ouputs_to_run", response)
		assert(response.data is RunObject)
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

