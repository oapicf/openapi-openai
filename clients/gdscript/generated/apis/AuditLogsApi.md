<a name="__pageTop"></a>
# AuditLogsApi   { #AuditLogsApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_audit_logs**](#list_audit_logs) | **GET** `/organization/audit_logs` | List user actions and configuration changes within this organization.

# **list_audit_logs**   { #list_audit_logs }
<a name="list_audit_logs"></a>

> `list_audit_logs(effectiveAt = null,projectIdsLeft_Square_BracketRight_Square_Bracket = null,eventTypesLeft_Square_BracketRight_Square_Bracket = null,actorIdsLeft_Square_BracketRight_Square_Bracket = null,actorEmailsLeft_Square_BracketRight_Square_Bracket = null,resourceIdsLeft_Square_BracketRight_Square_Bracket = null,limit = 20,after = "",before = "", on_success: Callable, on_failure: Callable)`

List user actions and configuration changes within this organization.



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
var api = AuditLogsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AuditLogsApi.new(config, client)


# Invoke an endpoint
api.list_audit_logs(
	# effectiveAt: ListAuditLogsEffectiveAtParameter
	# Return only events whose `effective_at` (Unix seconds) is in this range.
	effectiveAt,
	# projectIdsLeft_Square_BracketRight_Square_Bracket: Array
	# Return only events for these projects.
	projectIdsLeft_Square_BracketRight_Square_Bracket,
	# eventTypesLeft_Square_BracketRight_Square_Bracket: Array
	# Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
	eventTypesLeft_Square_BracketRight_Square_Bracket,
	# actorIdsLeft_Square_BracketRight_Square_Bracket: Array
	# Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
	actorIdsLeft_Square_BracketRight_Square_Bracket,
	# actorEmailsLeft_Square_BracketRight_Square_Bracket: Array
	# Return only events performed by users with these emails.
	actorEmailsLeft_Square_BracketRight_Square_Bracket,
	# resourceIdsLeft_Square_BracketRight_Square_Bracket: Array
	# Return only events performed on these targets. For example, a project ID updated.
	resourceIdsLeft_Square_BracketRight_Square_Bracket,
	# limit: int = 20   Eg: 56
	# A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
	limit,
	# after: String = ""   Eg: after_example
	# A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
	after,
	# before: String = ""   Eg: before_example
	# A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
	before,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "list_audit_logs", response)
		assert(response.data is ListAuditLogsResponse)
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

