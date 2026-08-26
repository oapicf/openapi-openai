<a name="__pageTop"></a>
# UsersApi   { #UsersApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user**](#delete_user) | **DELETE** `/organization/users/{user_id}` | Deletes a user from the organization.
[**list_users**](#list_users) | **GET** `/organization/users` | Lists all of the users in the organization.
[**modify_user**](#modify_user) | **POST** `/organization/users/{user_id}` | Modifies a user&#x27;s role in the organization.
[**retrieve_user**](#retrieve_user) | **GET** `/organization/users/{user_id}` | Retrieves a user by their identifier.

# **delete_user**   { #delete_user }
<a name="delete_user"></a>

> `delete_user(userId: String, on_success: Callable, on_failure: Callable)`

Deletes a user from the organization.



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
var api = UsersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsersApi.new(config, client)


# Invoke an endpoint
api.delete_user(
	# userId: String = ""   Eg: userId_example
	# The ID of the user.
	userId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_user", response)
		assert(response.data is UserDeleteResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_users**   { #list_users }
<a name="list_users"></a>

> `list_users(limit = 20,after = "", on_success: Callable, on_failure: Callable)`

Lists all of the users in the organization.



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
var api = UsersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsersApi.new(config, client)


# Invoke an endpoint
api.list_users(
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_users", response)
		assert(response.data is UserListResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_user**   { #modify_user }
<a name="modify_user"></a>

> `modify_user(userId: String,userRoleUpdateRequest: UserRoleUpdateRequest, on_success: Callable, on_failure: Callable)`

Modifies a user's role in the organization.



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
var api = UsersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsersApi.new(config, client)

var userRoleUpdateRequest = UserRoleUpdateRequest.new()
# … fill model userRoleUpdateRequest with data

# Invoke an endpoint
api.modify_user(
	# userId: String = ""   Eg: userId_example
	# The ID of the user.
	userId,
	# userRoleUpdateRequest: UserRoleUpdateRequest
	# The new user role to modify. This must be one of `owner` or `member`.
	userRoleUpdateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_user", response)
		assert(response.data is User)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_user**   { #retrieve_user }
<a name="retrieve_user"></a>

> `retrieve_user(userId: String, on_success: Callable, on_failure: Callable)`

Retrieves a user by their identifier.



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
var api = UsersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UsersApi.new(config, client)


# Invoke an endpoint
api.retrieve_user(
	# userId: String = ""   Eg: userId_example
	# The ID of the user.
	userId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_user", response)
		assert(response.data is User)
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

