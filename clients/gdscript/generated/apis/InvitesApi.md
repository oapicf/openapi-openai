<a name="__pageTop"></a>
# InvitesApi   { #InvitesApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_invite**](#delete_invite) | **DELETE** `/organization/invites/{invite_id}` | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**invite_user**](#invite_user) | **POST** `/organization/invites` | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**list_invites**](#list_invites) | **GET** `/organization/invites` | Returns a list of invites in the organization.
[**retrieve_invite**](#retrieve_invite) | **GET** `/organization/invites/{invite_id}` | Retrieves an invite.

# **delete_invite**   { #delete_invite }
<a name="delete_invite"></a>

> `delete_invite(inviteId: String, on_success: Callable, on_failure: Callable)`

Delete an invite. If the invite has already been accepted, it cannot be deleted.



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
var api = InvitesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = InvitesApi.new(config, client)


# Invoke an endpoint
api.delete_invite(
	# inviteId: String = ""   Eg: inviteId_example
	# The ID of the invite to delete.
	inviteId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_invite", response)
		assert(response.data is InviteDeleteResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **invite_user**   { #invite_user }
<a name="invite_user"></a>

> `invite_user(inviteRequest: InviteRequest, on_success: Callable, on_failure: Callable)`

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.



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
var api = InvitesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = InvitesApi.new(config, client)

var inviteRequest = InviteRequest.new()
# … fill model inviteRequest with data

# Invoke an endpoint
api.invite_user(
	# inviteRequest: InviteRequest
	# The invite request payload.
	inviteRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "invite_user", response)
		assert(response.data is Invite)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **list_invites**   { #list_invites }
<a name="list_invites"></a>

> `list_invites(limit = 20,after = "", on_success: Callable, on_failure: Callable)`

Returns a list of invites in the organization.



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
var api = InvitesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = InvitesApi.new(config, client)


# Invoke an endpoint
api.list_invites(
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_invites", response)
		assert(response.data is InviteListResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **retrieve_invite**   { #retrieve_invite }
<a name="retrieve_invite"></a>

> `retrieve_invite(inviteId: String, on_success: Callable, on_failure: Callable)`

Retrieves an invite.



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
var api = InvitesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = InvitesApi.new(config, client)


# Invoke an endpoint
api.retrieve_invite(
	# inviteId: String = ""   Eg: inviteId_example
	# The ID of the invite to retrieve.
	inviteId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "retrieve_invite", response)
		assert(response.data is Invite)
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

