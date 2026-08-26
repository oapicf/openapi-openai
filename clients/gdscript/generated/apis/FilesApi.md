<a name="__pageTop"></a>
# FilesApi   { #FilesApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_file**](#create_file) | **POST** `/files` | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**delete_file**](#delete_file) | **DELETE** `/files/{file_id}` | Delete a file.
[**download_file**](#download_file) | **GET** `/files/{file_id}/content` | Returns the contents of the specified file.
[**list_files**](#list_files) | **GET** `/files` | Returns a list of files.
[**retrieve_file**](#retrieve_file) | **GET** `/files/{file_id}` | Returns information about a specific file.

# **create_file**   { #create_file }
<a name="create_file"></a>

> `create_file(file: String,purpose: String, on_success: Callable, on_failure: Callable)`

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 



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
var api = FilesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FilesApi.new(config, client)


# Invoke an endpoint
api.create_file(
	# file: String   Eg: BINARY_DATA_HERE
	# The File object (not file name) to be uploaded. 
	file,
	# purpose: String = ""   Eg: purpose_example
	# The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 
	purpose,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_file", response)
		assert(response.data is OpenAIFile)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_file**   { #delete_file }
<a name="delete_file"></a>

> `delete_file(fileId: String, on_success: Callable, on_failure: Callable)`

Delete a file.



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
var api = FilesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FilesApi.new(config, client)


# Invoke an endpoint
api.delete_file(
	# fileId: String = ""   Eg: fileId_example
	# The ID of the file to use for this request.
	fileId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_file", response)
		assert(response.data is DeleteFileResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **download_file**   { #download_file }
<a name="download_file"></a>

> `download_file(fileId: String, on_success: Callable, on_failure: Callable)`

Returns the contents of the specified file.



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
var api = FilesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FilesApi.new(config, client)


# Invoke an endpoint
api.download_file(
	# fileId: String = ""   Eg: fileId_example
	# The ID of the file to use for this request.
	fileId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "download_file", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_files**   { #list_files }
<a name="list_files"></a>

> `list_files(purpose = "",limit = 10000,order = "desc",after = "", on_success: Callable, on_failure: Callable)`

Returns a list of files.



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
var api = FilesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FilesApi.new(config, client)


# Invoke an endpoint
api.list_files(
	# purpose: String = ""   Eg: purpose_example
	# Only return files with the given purpose.
	purpose,
	# limit: int = 10000   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
	limit,
	# order: String = "desc"   Eg: order_example
	# Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
	order,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_files", response)
		assert(response.data is ListFilesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_file**   { #retrieve_file }
<a name="retrieve_file"></a>

> `retrieve_file(fileId: String, on_success: Callable, on_failure: Callable)`

Returns information about a specific file.



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
var api = FilesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = FilesApi.new(config, client)


# Invoke an endpoint
api.retrieve_file(
	# fileId: String = ""   Eg: fileId_example
	# The ID of the file to use for this request.
	fileId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_file", response)
		assert(response.data is OpenAIFile)
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

