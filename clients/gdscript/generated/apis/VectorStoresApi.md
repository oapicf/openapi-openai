<a name="__pageTop"></a>
# VectorStoresApi   { #VectorStoresApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_vector_store_file_batch**](#cancel_vector_store_file_batch) | **POST** `/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel` | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**create_vector_store**](#create_vector_store) | **POST** `/vector_stores` | Create a vector store.
[**create_vector_store_file**](#create_vector_store_file) | **POST** `/vector_stores/{vector_store_id}/files` | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**create_vector_store_file_batch**](#create_vector_store_file_batch) | **POST** `/vector_stores/{vector_store_id}/file_batches` | Create a vector store file batch.
[**delete_vector_store**](#delete_vector_store) | **DELETE** `/vector_stores/{vector_store_id}` | Delete a vector store.
[**delete_vector_store_file**](#delete_vector_store_file) | **DELETE** `/vector_stores/{vector_store_id}/files/{file_id}` | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**get_vector_store**](#get_vector_store) | **GET** `/vector_stores/{vector_store_id}` | Retrieves a vector store.
[**get_vector_store_file**](#get_vector_store_file) | **GET** `/vector_stores/{vector_store_id}/files/{file_id}` | Retrieves a vector store file.
[**get_vector_store_file_batch**](#get_vector_store_file_batch) | **GET** `/vector_stores/{vector_store_id}/file_batches/{batch_id}` | Retrieves a vector store file batch.
[**list_files_in_vector_store_batch**](#list_files_in_vector_store_batch) | **GET** `/vector_stores/{vector_store_id}/file_batches/{batch_id}/files` | Returns a list of vector store files in a batch.
[**list_vector_store_files**](#list_vector_store_files) | **GET** `/vector_stores/{vector_store_id}/files` | Returns a list of vector store files.
[**list_vector_stores**](#list_vector_stores) | **GET** `/vector_stores` | Returns a list of vector stores.
[**modify_vector_store**](#modify_vector_store) | **POST** `/vector_stores/{vector_store_id}` | Modifies a vector store.

# **cancel_vector_store_file_batch**   { #cancel_vector_store_file_batch }
<a name="cancel_vector_store_file_batch"></a>

> `cancel_vector_store_file_batch(vectorStoreId: String,batchId: String, on_success: Callable, on_failure: Callable)`

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.cancel_vector_store_file_batch(
	# vectorStoreId: String = ""   Eg: vectorStoreId_example
	# The ID of the vector store that the file batch belongs to.
	vectorStoreId,
	# batchId: String = ""   Eg: batchId_example
	# The ID of the file batch to cancel.
	batchId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "cancel_vector_store_file_batch", response)
		assert(response.data is VectorStoreFileBatchObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_vector_store**   { #create_vector_store }
<a name="create_vector_store"></a>

> `create_vector_store(createVectorStoreRequest: CreateVectorStoreRequest, on_success: Callable, on_failure: Callable)`

Create a vector store.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)

var createVectorStoreRequest = CreateVectorStoreRequest.new()
# … fill model createVectorStoreRequest with data

# Invoke an endpoint
api.create_vector_store(
	# createVectorStoreRequest: CreateVectorStoreRequest
	createVectorStoreRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_vector_store", response)
		assert(response.data is VectorStoreObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_vector_store_file**   { #create_vector_store_file }
<a name="create_vector_store_file"></a>

> `create_vector_store_file(vectorStoreId: String,createVectorStoreFileRequest: CreateVectorStoreFileRequest, on_success: Callable, on_failure: Callable)`

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)

var createVectorStoreFileRequest = CreateVectorStoreFileRequest.new()
# … fill model createVectorStoreFileRequest with data

# Invoke an endpoint
api.create_vector_store_file(
	# vectorStoreId: String = ""   Eg: vs_abc123
	# The ID of the vector store for which to create a File. 
	vectorStoreId,
	# createVectorStoreFileRequest: CreateVectorStoreFileRequest
	createVectorStoreFileRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_vector_store_file", response)
		assert(response.data is VectorStoreFileObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_vector_store_file_batch**   { #create_vector_store_file_batch }
<a name="create_vector_store_file_batch"></a>

> `create_vector_store_file_batch(vectorStoreId: String,createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest, on_success: Callable, on_failure: Callable)`

Create a vector store file batch.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)

var createVectorStoreFileBatchRequest = CreateVectorStoreFileBatchRequest.new()
# … fill model createVectorStoreFileBatchRequest with data

# Invoke an endpoint
api.create_vector_store_file_batch(
	# vectorStoreId: String = ""   Eg: vs_abc123
	# The ID of the vector store for which to create a File Batch. 
	vectorStoreId,
	# createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest
	createVectorStoreFileBatchRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_vector_store_file_batch", response)
		assert(response.data is VectorStoreFileBatchObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_vector_store**   { #delete_vector_store }
<a name="delete_vector_store"></a>

> `delete_vector_store(vectorStoreId: String, on_success: Callable, on_failure: Callable)`

Delete a vector store.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.delete_vector_store(
	# vectorStoreId: String = ""   Eg: vectorStoreId_example
	# The ID of the vector store to delete.
	vectorStoreId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_vector_store", response)
		assert(response.data is DeleteVectorStoreResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_vector_store_file**   { #delete_vector_store_file }
<a name="delete_vector_store_file"></a>

> `delete_vector_store_file(vectorStoreId: String,fileId: String, on_success: Callable, on_failure: Callable)`

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.delete_vector_store_file(
	# vectorStoreId: String = ""   Eg: vectorStoreId_example
	# The ID of the vector store that the file belongs to.
	vectorStoreId,
	# fileId: String = ""   Eg: fileId_example
	# The ID of the file to delete.
	fileId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_vector_store_file", response)
		assert(response.data is DeleteVectorStoreFileResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_vector_store**   { #get_vector_store }
<a name="get_vector_store"></a>

> `get_vector_store(vectorStoreId: String, on_success: Callable, on_failure: Callable)`

Retrieves a vector store.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.get_vector_store(
	# vectorStoreId: String = ""   Eg: vectorStoreId_example
	# The ID of the vector store to retrieve.
	vectorStoreId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_vector_store", response)
		assert(response.data is VectorStoreObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_vector_store_file**   { #get_vector_store_file }
<a name="get_vector_store_file"></a>

> `get_vector_store_file(vectorStoreId: String,fileId: String, on_success: Callable, on_failure: Callable)`

Retrieves a vector store file.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.get_vector_store_file(
	# vectorStoreId: String = ""   Eg: vs_abc123
	# The ID of the vector store that the file belongs to.
	vectorStoreId,
	# fileId: String = ""   Eg: file-abc123
	# The ID of the file being retrieved.
	fileId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_vector_store_file", response)
		assert(response.data is VectorStoreFileObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_vector_store_file_batch**   { #get_vector_store_file_batch }
<a name="get_vector_store_file_batch"></a>

> `get_vector_store_file_batch(vectorStoreId: String,batchId: String, on_success: Callable, on_failure: Callable)`

Retrieves a vector store file batch.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.get_vector_store_file_batch(
	# vectorStoreId: String = ""   Eg: vs_abc123
	# The ID of the vector store that the file batch belongs to.
	vectorStoreId,
	# batchId: String = ""   Eg: vsfb_abc123
	# The ID of the file batch being retrieved.
	batchId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_vector_store_file_batch", response)
		assert(response.data is VectorStoreFileBatchObject)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_files_in_vector_store_batch**   { #list_files_in_vector_store_batch }
<a name="list_files_in_vector_store_batch"></a>

> `list_files_in_vector_store_batch(vectorStoreId: String,batchId: String,limit = 20,order = "desc",after = "",before = "",filter = "", on_success: Callable, on_failure: Callable)`

Returns a list of vector store files in a batch.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.list_files_in_vector_store_batch(
	# vectorStoreId: String = ""   Eg: vectorStoreId_example
	# The ID of the vector store that the files belong to.
	vectorStoreId,
	# batchId: String = ""   Eg: batchId_example
	# The ID of the file batch that the files belong to.
	batchId,
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
	# filter: String = ""   Eg: filter_example
	# Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
	filter,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_files_in_vector_store_batch", response)
		assert(response.data is ListVectorStoreFilesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_vector_store_files**   { #list_vector_store_files }
<a name="list_vector_store_files"></a>

> `list_vector_store_files(vectorStoreId: String,limit = 20,order = "desc",after = "",before = "",filter = "", on_success: Callable, on_failure: Callable)`

Returns a list of vector store files.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.list_vector_store_files(
	# vectorStoreId: String = ""   Eg: vectorStoreId_example
	# The ID of the vector store that the files belong to.
	vectorStoreId,
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
	# filter: String = ""   Eg: filter_example
	# Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
	filter,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_vector_store_files", response)
		assert(response.data is ListVectorStoreFilesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_vector_stores**   { #list_vector_stores }
<a name="list_vector_stores"></a>

> `list_vector_stores(limit = 20,order = "desc",after = "",before = "", on_success: Callable, on_failure: Callable)`

Returns a list of vector stores.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)


# Invoke an endpoint
api.list_vector_stores(
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
		prints("Success!", "list_vector_stores", response)
		assert(response.data is ListVectorStoresResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_vector_store**   { #modify_vector_store }
<a name="modify_vector_store"></a>

> `modify_vector_store(vectorStoreId: String,updateVectorStoreRequest: UpdateVectorStoreRequest, on_success: Callable, on_failure: Callable)`

Modifies a vector store.



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
var api = VectorStoresApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = VectorStoresApi.new(config, client)

var updateVectorStoreRequest = UpdateVectorStoreRequest.new()
# … fill model updateVectorStoreRequest with data

# Invoke an endpoint
api.modify_vector_store(
	# vectorStoreId: String = ""   Eg: vectorStoreId_example
	# The ID of the vector store to modify.
	vectorStoreId,
	# updateVectorStoreRequest: UpdateVectorStoreRequest
	updateVectorStoreRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_vector_store", response)
		assert(response.data is VectorStoreObject)
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

