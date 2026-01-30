# ASSISTANTS_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**assistant**](ASSISTANTS_API.md#assistant) | **Get** /assistants/{assistant_id} | Retrieves an assistant.
[**cancel_run**](ASSISTANTS_API.md#cancel_run) | **Post** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**create_assistant**](ASSISTANTS_API.md#create_assistant) | **Post** /assistants | Create an assistant with a model and instructions.
[**create_message**](ASSISTANTS_API.md#create_message) | **Post** /threads/{thread_id}/messages | Create a message.
[**create_run**](ASSISTANTS_API.md#create_run) | **Post** /threads/{thread_id}/runs | Create a run.
[**create_thread**](ASSISTANTS_API.md#create_thread) | **Post** /threads | Create a thread.
[**create_thread_and_run**](ASSISTANTS_API.md#create_thread_and_run) | **Post** /threads/runs | Create a thread and run it in one request.
[**delete_assistant**](ASSISTANTS_API.md#delete_assistant) | **Delete** /assistants/{assistant_id} | Delete an assistant.
[**delete_message**](ASSISTANTS_API.md#delete_message) | **Delete** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**delete_thread**](ASSISTANTS_API.md#delete_thread) | **Delete** /threads/{thread_id} | Delete a thread.
[**list_assistants**](ASSISTANTS_API.md#list_assistants) | **Get** /assistants | Returns a list of assistants.
[**list_messages**](ASSISTANTS_API.md#list_messages) | **Get** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**list_run_steps**](ASSISTANTS_API.md#list_run_steps) | **Get** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**list_runs**](ASSISTANTS_API.md#list_runs) | **Get** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**message**](ASSISTANTS_API.md#message) | **Get** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**modify_assistant**](ASSISTANTS_API.md#modify_assistant) | **Post** /assistants/{assistant_id} | Modifies an assistant.
[**modify_message**](ASSISTANTS_API.md#modify_message) | **Post** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modify_run**](ASSISTANTS_API.md#modify_run) | **Post** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modify_thread**](ASSISTANTS_API.md#modify_thread) | **Post** /threads/{thread_id} | Modifies a thread.
[**run**](ASSISTANTS_API.md#run) | **Get** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**run_step**](ASSISTANTS_API.md#run_step) | **Get** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**submit_tool_ouputs_to_run**](ASSISTANTS_API.md#submit_tool_ouputs_to_run) | **Post** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
[**thread**](ASSISTANTS_API.md#thread) | **Get** /threads/{thread_id} | Retrieves a thread.


# **assistant**
> assistant (assistant_id: STRING_32 ): detachable ASSISTANT_OBJECT


Retrieves an assistant.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistant_id** | **STRING_32**| The ID of the assistant to retrieve. | [default to null]

### Return type

[**ASSISTANT_OBJECT**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_run**
> cancel_run (thread_id: STRING_32 ; run_id: STRING_32 ): detachable RUN_OBJECT


Cancels a run that is `in_progress`.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to which this run belongs. | [default to null]
 **run_id** | **STRING_32**| The ID of the run to cancel. | [default to null]

### Return type

[**RUN_OBJECT**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_assistant**
> create_assistant (create_assistant_request: CREATE_ASSISTANT_REQUEST ): detachable ASSISTANT_OBJECT


Create an assistant with a model and instructions.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_assistant_request** | [**CREATE_ASSISTANT_REQUEST**](CREATE_ASSISTANT_REQUEST.md)|  | 

### Return type

[**ASSISTANT_OBJECT**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_message**
> create_message (thread_id: STRING_32 ; create_message_request: CREATE_MESSAGE_REQUEST ): detachable MESSAGE_OBJECT


Create a message.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | [default to null]
 **create_message_request** | [**CREATE_MESSAGE_REQUEST**](CREATE_MESSAGE_REQUEST.md)|  | 

### Return type

[**MESSAGE_OBJECT**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_run**
> create_run (thread_id: STRING_32 ; create_run_request: CREATE_RUN_REQUEST ; include:  detachable LIST [STRING_32] ): detachable RUN_OBJECT


Create a run.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to run. | [default to null]
 **create_run_request** | [**CREATE_RUN_REQUEST**](CREATE_RUN_REQUEST.md)|  | 
 **include** | [**LIST [STRING_32]**](STRING_32.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null]

### Return type

[**RUN_OBJECT**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_thread**
> create_thread (create_thread_request:  detachable CREATE_THREAD_REQUEST ): detachable THREAD_OBJECT


Create a thread.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_thread_request** | [**CREATE_THREAD_REQUEST**](CREATE_THREAD_REQUEST.md)|  | [optional] 

### Return type

[**THREAD_OBJECT**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_thread_and_run**
> create_thread_and_run (create_thread_and_run_request: CREATE_THREAD_AND_RUN_REQUEST ): detachable RUN_OBJECT


Create a thread and run it in one request.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_thread_and_run_request** | [**CREATE_THREAD_AND_RUN_REQUEST**](CREATE_THREAD_AND_RUN_REQUEST.md)|  | 

### Return type

[**RUN_OBJECT**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assistant**
> delete_assistant (assistant_id: STRING_32 ): detachable DELETE_ASSISTANT_RESPONSE


Delete an assistant.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistant_id** | **STRING_32**| The ID of the assistant to delete. | [default to null]

### Return type

[**DELETE_ASSISTANT_RESPONSE**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_message**
> delete_message (thread_id: STRING_32 ; message_id: STRING_32 ): detachable DELETE_MESSAGE_RESPONSE


Deletes a message.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to which this message belongs. | [default to null]
 **message_id** | **STRING_32**| The ID of the message to delete. | [default to null]

### Return type

[**DELETE_MESSAGE_RESPONSE**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_thread**
> delete_thread (thread_id: STRING_32 ): detachable DELETE_THREAD_RESPONSE


Delete a thread.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to delete. | [default to null]

### Return type

[**DELETE_THREAD_RESPONSE**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_assistants**
> list_assistants (limit:  detachable INTEGER_32 ; order:  detachable STRING_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ): detachable LIST_ASSISTANTS_RESPONSE


Returns a list of assistants.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **STRING_32**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**LIST_ASSISTANTS_RESPONSE**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_messages**
> list_messages (thread_id: STRING_32 ; limit:  detachable INTEGER_32 ; order:  detachable STRING_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ; run_id:  detachable STRING_32 ): detachable LIST_MESSAGES_RESPONSE


Returns a list of messages for a given thread.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **STRING_32**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **run_id** | **STRING_32**| Filter messages by the run ID that generated them.  | [optional] [default to null]

### Return type

[**LIST_MESSAGES_RESPONSE**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_run_steps**
> list_run_steps (thread_id: STRING_32 ; run_id: STRING_32 ; limit:  detachable INTEGER_32 ; order:  detachable STRING_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ; include:  detachable LIST [STRING_32] ): detachable LIST_RUN_STEPS_RESPONSE


Returns a list of run steps belonging to a run.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread the run and run steps belong to. | [default to null]
 **run_id** | **STRING_32**| The ID of the run the run steps belong to. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **STRING_32**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **include** | [**LIST [STRING_32]**](STRING_32.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null]

### Return type

[**LIST_RUN_STEPS_RESPONSE**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_runs**
> list_runs (thread_id: STRING_32 ; limit:  detachable INTEGER_32 ; order:  detachable STRING_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ): detachable LIST_RUNS_RESPONSE


Returns a list of runs belonging to a thread.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread the run belongs to. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **STRING_32**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**LIST_RUNS_RESPONSE**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **message**
> message (thread_id: STRING_32 ; message_id: STRING_32 ): detachable MESSAGE_OBJECT


Retrieve a message.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | [default to null]
 **message_id** | **STRING_32**| The ID of the message to retrieve. | [default to null]

### Return type

[**MESSAGE_OBJECT**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_assistant**
> modify_assistant (assistant_id: STRING_32 ; modify_assistant_request: MODIFY_ASSISTANT_REQUEST ): detachable ASSISTANT_OBJECT


Modifies an assistant.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistant_id** | **STRING_32**| The ID of the assistant to modify. | [default to null]
 **modify_assistant_request** | [**MODIFY_ASSISTANT_REQUEST**](MODIFY_ASSISTANT_REQUEST.md)|  | 

### Return type

[**ASSISTANT_OBJECT**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_message**
> modify_message (thread_id: STRING_32 ; message_id: STRING_32 ; modify_message_request: MODIFY_MESSAGE_REQUEST ): detachable MESSAGE_OBJECT


Modifies a message.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to which this message belongs. | [default to null]
 **message_id** | **STRING_32**| The ID of the message to modify. | [default to null]
 **modify_message_request** | [**MODIFY_MESSAGE_REQUEST**](MODIFY_MESSAGE_REQUEST.md)|  | 

### Return type

[**MESSAGE_OBJECT**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_run**
> modify_run (thread_id: STRING_32 ; run_id: STRING_32 ; modify_run_request: MODIFY_RUN_REQUEST ): detachable RUN_OBJECT


Modifies a run.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
 **run_id** | **STRING_32**| The ID of the run to modify. | [default to null]
 **modify_run_request** | [**MODIFY_RUN_REQUEST**](MODIFY_RUN_REQUEST.md)|  | 

### Return type

[**RUN_OBJECT**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_thread**
> modify_thread (thread_id: STRING_32 ; modify_thread_request: MODIFY_THREAD_REQUEST ): detachable THREAD_OBJECT


Modifies a thread.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | [default to null]
 **modify_thread_request** | [**MODIFY_THREAD_REQUEST**](MODIFY_THREAD_REQUEST.md)|  | 

### Return type

[**THREAD_OBJECT**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **run**
> run (thread_id: STRING_32 ; run_id: STRING_32 ): detachable RUN_OBJECT


Retrieves a run.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
 **run_id** | **STRING_32**| The ID of the run to retrieve. | [default to null]

### Return type

[**RUN_OBJECT**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **run_step**
> run_step (thread_id: STRING_32 ; run_id: STRING_32 ; step_id: STRING_32 ; include:  detachable LIST [STRING_32] ): detachable RUN_STEP_OBJECT


Retrieves a run step.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to which the run and run step belongs. | [default to null]
 **run_id** | **STRING_32**| The ID of the run to which the run step belongs. | [default to null]
 **step_id** | **STRING_32**| The ID of the run step to retrieve. | [default to null]
 **include** | [**LIST [STRING_32]**](STRING_32.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null]

### Return type

[**RUN_STEP_OBJECT**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_tool_ouputs_to_run**
> submit_tool_ouputs_to_run (thread_id: STRING_32 ; run_id: STRING_32 ; submit_tool_outputs_run_request: SUBMIT_TOOL_OUTPUTS_RUN_REQUEST ): detachable RUN_OBJECT


When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | [default to null]
 **run_id** | **STRING_32**| The ID of the run that requires the tool output submission. | [default to null]
 **submit_tool_outputs_run_request** | [**SUBMIT_TOOL_OUTPUTS_RUN_REQUEST**](SUBMIT_TOOL_OUTPUTS_RUN_REQUEST.md)|  | 

### Return type

[**RUN_OBJECT**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **thread**
> thread (thread_id: STRING_32 ): detachable THREAD_OBJECT


Retrieves a thread.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **STRING_32**| The ID of the thread to retrieve. | [default to null]

### Return type

[**THREAD_OBJECT**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

