<a name="__pageTop"></a>
# UploadsApi   { #UploadsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_upload_part**](#add_upload_part) | **POST** `/uploads/{upload_id}/parts` | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
[**cancel_upload**](#cancel_upload) | **POST** `/uploads/{upload_id}/cancel` | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
[**complete_upload**](#complete_upload) | **POST** `/uploads/{upload_id}/complete` | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
[**create_upload**](#create_upload) | **POST** `/uploads` | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

# **add_upload_part**   { #add_upload_part }
<a name="add_upload_part"></a>

> `add_upload_part(uploadId: String,data: String, on_success: Callable, on_failure: Callable)`

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 



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
var api = UploadsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UploadsApi.new(config, client)


# Invoke an endpoint
api.add_upload_part(
	# uploadId: String = ""   Eg: upload_abc123
	# The ID of the Upload. 
	uploadId,
	# data: String   Eg: BINARY_DATA_HERE
	# The chunk of bytes for this Part. 
	data,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "add_upload_part", response)
		assert(response.data is UploadPart)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **cancel_upload**   { #cancel_upload }
<a name="cancel_upload"></a>

> `cancel_upload(uploadId: String, on_success: Callable, on_failure: Callable)`

Cancels the Upload. No Parts may be added after an Upload is cancelled. 



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
var api = UploadsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UploadsApi.new(config, client)


# Invoke an endpoint
api.cancel_upload(
	# uploadId: String = ""   Eg: upload_abc123
	# The ID of the Upload. 
	uploadId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "cancel_upload", response)
		assert(response.data is Upload)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **complete_upload**   { #complete_upload }
<a name="complete_upload"></a>

> `complete_upload(uploadId: String,completeUploadRequest: CompleteUploadRequest, on_success: Callable, on_failure: Callable)`

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 



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
var api = UploadsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UploadsApi.new(config, client)

var completeUploadRequest = CompleteUploadRequest.new()
# … fill model completeUploadRequest with data

# Invoke an endpoint
api.complete_upload(
	# uploadId: String = ""   Eg: upload_abc123
	# The ID of the Upload. 
	uploadId,
	# completeUploadRequest: CompleteUploadRequest
	completeUploadRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "complete_upload", response)
		assert(response.data is Upload)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_upload**   { #create_upload }
<a name="create_upload"></a>

> `create_upload(createUploadRequest: CreateUploadRequest, on_success: Callable, on_failure: Callable)`

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 



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
var api = UploadsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UploadsApi.new(config, client)

var createUploadRequest = CreateUploadRequest.new()
# … fill model createUploadRequest with data

# Invoke an endpoint
api.create_upload(
	# createUploadRequest: CreateUploadRequest
	createUploadRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_upload", response)
		assert(response.data is Upload)
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

