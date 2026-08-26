<a name="__pageTop"></a>
# ProjectsApi   { #ProjectsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archive_project**](#archive_project) | **POST** `/organization/projects/{project_id}/archive` | Archives a project in the organization. Archived projects cannot be used or updated.
[**create_project**](#create_project) | **POST** `/organization/projects` | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**create_project_service_account**](#create_project_service_account) | **POST** `/organization/projects/{project_id}/service_accounts` | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**create_project_user**](#create_project_user) | **POST** `/organization/projects/{project_id}/users` | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**delete_project_api_key**](#delete_project_api_key) | **DELETE** `/organization/projects/{project_id}/api_keys/{key_id}` | Deletes an API key from the project.
[**delete_project_service_account**](#delete_project_service_account) | **DELETE** `/organization/projects/{project_id}/service_accounts/{service_account_id}` | Deletes a service account from the project.
[**delete_project_user**](#delete_project_user) | **DELETE** `/organization/projects/{project_id}/users/{user_id}` | Deletes a user from the project.
[**list_project_api_keys**](#list_project_api_keys) | **GET** `/organization/projects/{project_id}/api_keys` | Returns a list of API keys in the project.
[**list_project_rate_limits**](#list_project_rate_limits) | **GET** `/organization/projects/{project_id}/rate_limits` | Returns the rate limits per model for a project.
[**list_project_service_accounts**](#list_project_service_accounts) | **GET** `/organization/projects/{project_id}/service_accounts` | Returns a list of service accounts in the project.
[**list_project_users**](#list_project_users) | **GET** `/organization/projects/{project_id}/users` | Returns a list of users in the project.
[**list_projects**](#list_projects) | **GET** `/organization/projects` | Returns a list of projects.
[**modify_project**](#modify_project) | **POST** `/organization/projects/{project_id}` | Modifies a project in the organization.
[**modify_project_user**](#modify_project_user) | **POST** `/organization/projects/{project_id}/users/{user_id}` | Modifies a user&#x27;s role in the project.
[**retrieve_project**](#retrieve_project) | **GET** `/organization/projects/{project_id}` | Retrieves a project.
[**retrieve_project_api_key**](#retrieve_project_api_key) | **GET** `/organization/projects/{project_id}/api_keys/{key_id}` | Retrieves an API key in the project.
[**retrieve_project_service_account**](#retrieve_project_service_account) | **GET** `/organization/projects/{project_id}/service_accounts/{service_account_id}` | Retrieves a service account in the project.
[**retrieve_project_user**](#retrieve_project_user) | **GET** `/organization/projects/{project_id}/users/{user_id}` | Retrieves a user in the project.
[**update_project_rate_limits**](#update_project_rate_limits) | **POST** `/organization/projects/{project_id}/rate_limits/{rate_limit_id}` | Updates a project rate limit.

# **archive_project**   { #archive_project }
<a name="archive_project"></a>

> `archive_project(projectId: String, on_success: Callable, on_failure: Callable)`

Archives a project in the organization. Archived projects cannot be used or updated.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.archive_project(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "archive_project", response)
		assert(response.data is Project)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_project**   { #create_project }
<a name="create_project"></a>

> `create_project(projectCreateRequest: ProjectCreateRequest, on_success: Callable, on_failure: Callable)`

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)

var projectCreateRequest = ProjectCreateRequest.new()
# … fill model projectCreateRequest with data

# Invoke an endpoint
api.create_project(
	# projectCreateRequest: ProjectCreateRequest
	# The project create request payload.
	projectCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_project", response)
		assert(response.data is Project)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_project_service_account**   { #create_project_service_account }
<a name="create_project_service_account"></a>

> `create_project_service_account(projectId: String,projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest, on_success: Callable, on_failure: Callable)`

Creates a new service account in the project. This also returns an unredacted API key for the service account.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)

var projectServiceAccountCreateRequest = ProjectServiceAccountCreateRequest.new()
# … fill model projectServiceAccountCreateRequest with data

# Invoke an endpoint
api.create_project_service_account(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest
	# The project service account create request payload.
	projectServiceAccountCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_project_service_account", response)
		assert(response.data is ProjectServiceAccountCreateResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_project_user**   { #create_project_user }
<a name="create_project_user"></a>

> `create_project_user(projectId: String,projectUserCreateRequest: ProjectUserCreateRequest, on_success: Callable, on_failure: Callable)`

Adds a user to the project. Users must already be members of the organization to be added to a project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)

var projectUserCreateRequest = ProjectUserCreateRequest.new()
# … fill model projectUserCreateRequest with data

# Invoke an endpoint
api.create_project_user(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# projectUserCreateRequest: ProjectUserCreateRequest
	# The project user create request payload.
	projectUserCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_project_user", response)
		assert(response.data is ProjectUser)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_project_api_key**   { #delete_project_api_key }
<a name="delete_project_api_key"></a>

> `delete_project_api_key(projectId: String,keyId: String, on_success: Callable, on_failure: Callable)`

Deletes an API key from the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.delete_project_api_key(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# keyId: String = ""   Eg: keyId_example
	# The ID of the API key.
	keyId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_project_api_key", response)
		assert(response.data is ProjectApiKeyDeleteResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_project_service_account**   { #delete_project_service_account }
<a name="delete_project_service_account"></a>

> `delete_project_service_account(projectId: String,serviceAccountId: String, on_success: Callable, on_failure: Callable)`

Deletes a service account from the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.delete_project_service_account(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# serviceAccountId: String = ""   Eg: serviceAccountId_example
	# The ID of the service account.
	serviceAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_project_service_account", response)
		assert(response.data is ProjectServiceAccountDeleteResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_project_user**   { #delete_project_user }
<a name="delete_project_user"></a>

> `delete_project_user(projectId: String,userId: String, on_success: Callable, on_failure: Callable)`

Deletes a user from the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.delete_project_user(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# userId: String = ""   Eg: userId_example
	# The ID of the user.
	userId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_project_user", response)
		assert(response.data is ProjectUserDeleteResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_project_api_keys**   { #list_project_api_keys }
<a name="list_project_api_keys"></a>

> `list_project_api_keys(projectId: String,limit = 20,after = "", on_success: Callable, on_failure: Callable)`

Returns a list of API keys in the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.list_project_api_keys(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_project_api_keys", response)
		assert(response.data is ProjectApiKeyListResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_project_rate_limits**   { #list_project_rate_limits }
<a name="list_project_rate_limits"></a>

> `list_project_rate_limits(projectId: String,limit = 100,after = "",before = "", on_success: Callable, on_failure: Callable)`

Returns the rate limits per model for a project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.list_project_rate_limits(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# limit: int = 100   Eg: 56
	# A limit on the number of objects to be returned. The default is 100. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# before: String = ""   Eg: before_example
	# A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
	before,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_project_rate_limits", response)
		assert(response.data is ProjectRateLimitListResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_project_service_accounts**   { #list_project_service_accounts }
<a name="list_project_service_accounts"></a>

> `list_project_service_accounts(projectId: String,limit = 20,after = "", on_success: Callable, on_failure: Callable)`

Returns a list of service accounts in the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.list_project_service_accounts(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_project_service_accounts", response)
		assert(response.data is ProjectServiceAccountListResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_project_users**   { #list_project_users }
<a name="list_project_users"></a>

> `list_project_users(projectId: String,limit = 20,after = "", on_success: Callable, on_failure: Callable)`

Returns a list of users in the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.list_project_users(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_project_users", response)
		assert(response.data is ProjectUserListResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_projects**   { #list_projects }
<a name="list_projects"></a>

> `list_projects(limit = 20,after = "",includeArchived = false, on_success: Callable, on_failure: Callable)`

Returns a list of projects.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.list_projects(
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# includeArchived: bool = false   Eg: true
	# If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
	includeArchived,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_projects", response)
		assert(response.data is ProjectListResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_project**   { #modify_project }
<a name="modify_project"></a>

> `modify_project(projectId: String,projectUpdateRequest: ProjectUpdateRequest, on_success: Callable, on_failure: Callable)`

Modifies a project in the organization.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)

var projectUpdateRequest = ProjectUpdateRequest.new()
# … fill model projectUpdateRequest with data

# Invoke an endpoint
api.modify_project(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# projectUpdateRequest: ProjectUpdateRequest
	# The project update request payload.
	projectUpdateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_project", response)
		assert(response.data is Project)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **modify_project_user**   { #modify_project_user }
<a name="modify_project_user"></a>

> `modify_project_user(projectId: String,userId: String,projectUserUpdateRequest: ProjectUserUpdateRequest, on_success: Callable, on_failure: Callable)`

Modifies a user's role in the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)

var projectUserUpdateRequest = ProjectUserUpdateRequest.new()
# … fill model projectUserUpdateRequest with data

# Invoke an endpoint
api.modify_project_user(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# userId: String = ""   Eg: userId_example
	# The ID of the user.
	userId,
	# projectUserUpdateRequest: ProjectUserUpdateRequest
	# The project user update request payload.
	projectUserUpdateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "modify_project_user", response)
		assert(response.data is ProjectUser)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_project**   { #retrieve_project }
<a name="retrieve_project"></a>

> `retrieve_project(projectId: String, on_success: Callable, on_failure: Callable)`

Retrieves a project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.retrieve_project(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_project", response)
		assert(response.data is Project)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_project_api_key**   { #retrieve_project_api_key }
<a name="retrieve_project_api_key"></a>

> `retrieve_project_api_key(projectId: String,keyId: String, on_success: Callable, on_failure: Callable)`

Retrieves an API key in the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.retrieve_project_api_key(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# keyId: String = ""   Eg: keyId_example
	# The ID of the API key.
	keyId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_project_api_key", response)
		assert(response.data is ProjectApiKey)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_project_service_account**   { #retrieve_project_service_account }
<a name="retrieve_project_service_account"></a>

> `retrieve_project_service_account(projectId: String,serviceAccountId: String, on_success: Callable, on_failure: Callable)`

Retrieves a service account in the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.retrieve_project_service_account(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# serviceAccountId: String = ""   Eg: serviceAccountId_example
	# The ID of the service account.
	serviceAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_project_service_account", response)
		assert(response.data is ProjectServiceAccount)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_project_user**   { #retrieve_project_user }
<a name="retrieve_project_user"></a>

> `retrieve_project_user(projectId: String,userId: String, on_success: Callable, on_failure: Callable)`

Retrieves a user in the project.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)


# Invoke an endpoint
api.retrieve_project_user(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# userId: String = ""   Eg: userId_example
	# The ID of the user.
	userId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_project_user", response)
		assert(response.data is ProjectUser)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **update_project_rate_limits**   { #update_project_rate_limits }
<a name="update_project_rate_limits"></a>

> `update_project_rate_limits(projectId: String,rateLimitId: String,projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest, on_success: Callable, on_failure: Callable)`

Updates a project rate limit.



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
var api = ProjectsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProjectsApi.new(config, client)

var projectRateLimitUpdateRequest = ProjectRateLimitUpdateRequest.new()
# … fill model projectRateLimitUpdateRequest with data

# Invoke an endpoint
api.update_project_rate_limits(
	# projectId: String = ""   Eg: projectId_example
	# The ID of the project.
	projectId,
	# rateLimitId: String = ""   Eg: rateLimitId_example
	# The ID of the rate limit.
	rateLimitId,
	# projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest
	# The project rate limit update request payload.
	projectRateLimitUpdateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "update_project_rate_limits", response)
		assert(response.data is ProjectRateLimit)
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

