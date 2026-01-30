# AssistantsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssistantsAPI_cancelRun**](AssistantsAPI.md#AssistantsAPI_cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**AssistantsAPI_createAssistant**](AssistantsAPI.md#AssistantsAPI_createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**AssistantsAPI_createMessage**](AssistantsAPI.md#AssistantsAPI_createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**AssistantsAPI_createRun**](AssistantsAPI.md#AssistantsAPI_createRun) | **POST** /threads/{thread_id}/runs | Create a run.
[**AssistantsAPI_createThread**](AssistantsAPI.md#AssistantsAPI_createThread) | **POST** /threads | Create a thread.
[**AssistantsAPI_createThreadAndRun**](AssistantsAPI.md#AssistantsAPI_createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**AssistantsAPI_deleteAssistant**](AssistantsAPI.md#AssistantsAPI_deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**AssistantsAPI_deleteMessage**](AssistantsAPI.md#AssistantsAPI_deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**AssistantsAPI_deleteThread**](AssistantsAPI.md#AssistantsAPI_deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**AssistantsAPI_getAssistant**](AssistantsAPI.md#AssistantsAPI_getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**AssistantsAPI_getMessage**](AssistantsAPI.md#AssistantsAPI_getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**AssistantsAPI_getRun**](AssistantsAPI.md#AssistantsAPI_getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**AssistantsAPI_getRunStep**](AssistantsAPI.md#AssistantsAPI_getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**AssistantsAPI_getThread**](AssistantsAPI.md#AssistantsAPI_getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**AssistantsAPI_listAssistants**](AssistantsAPI.md#AssistantsAPI_listAssistants) | **GET** /assistants | Returns a list of assistants.
[**AssistantsAPI_listMessages**](AssistantsAPI.md#AssistantsAPI_listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**AssistantsAPI_listRunSteps**](AssistantsAPI.md#AssistantsAPI_listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**AssistantsAPI_listRuns**](AssistantsAPI.md#AssistantsAPI_listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**AssistantsAPI_modifyAssistant**](AssistantsAPI.md#AssistantsAPI_modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**AssistantsAPI_modifyMessage**](AssistantsAPI.md#AssistantsAPI_modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**AssistantsAPI_modifyRun**](AssistantsAPI.md#AssistantsAPI_modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**AssistantsAPI_modifyThread**](AssistantsAPI.md#AssistantsAPI_modifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
[**AssistantsAPI_submitToolOuputsToRun**](AssistantsAPI.md#AssistantsAPI_submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


# **AssistantsAPI_cancelRun**
```c
// Cancels a run that is `in_progress`.
//
run_object_t* AssistantsAPI_cancelRun(apiClient_t *apiClient, char *thread_id, char *run_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to which this run belongs. | 
**run_id** | **char \*** | The ID of the run to cancel. | 

### Return type

[run_object_t](run_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_createAssistant**
```c
// Create an assistant with a model and instructions.
//
assistant_object_t* AssistantsAPI_createAssistant(apiClient_t *apiClient, create_assistant_request_t *create_assistant_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_assistant_request** | **[create_assistant_request_t](create_assistant_request.md) \*** |  | 

### Return type

[assistant_object_t](assistant_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_createMessage**
```c
// Create a message.
//
message_object_t* AssistantsAPI_createMessage(apiClient_t *apiClient, char *thread_id, create_message_request_t *create_message_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) to create a message for. | 
**create_message_request** | **[create_message_request_t](create_message_request.md) \*** |  | 

### Return type

[message_object_t](message_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_createRun**
```c
// Create a run.
//
run_object_t* AssistantsAPI_createRun(apiClient_t *apiClient, char *thread_id, create_run_request_t *create_run_request, list_t *include[]);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to run. | 
**create_run_request** | **[create_run_request_t](create_run_request.md) \*** |  | 
**include[]** | **[list_t](char.md) \*** | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[run_object_t](run_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_createThread**
```c
// Create a thread.
//
thread_object_t* AssistantsAPI_createThread(apiClient_t *apiClient, create_thread_request_t *create_thread_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_thread_request** | **[create_thread_request_t](create_thread_request.md) \*** |  | [optional] 

### Return type

[thread_object_t](thread_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_createThreadAndRun**
```c
// Create a thread and run it in one request.
//
run_object_t* AssistantsAPI_createThreadAndRun(apiClient_t *apiClient, create_thread_and_run_request_t *create_thread_and_run_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_thread_and_run_request** | **[create_thread_and_run_request_t](create_thread_and_run_request.md) \*** |  | 

### Return type

[run_object_t](run_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_deleteAssistant**
```c
// Delete an assistant.
//
delete_assistant_response_t* AssistantsAPI_deleteAssistant(apiClient_t *apiClient, char *assistant_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**assistant_id** | **char \*** | The ID of the assistant to delete. | 

### Return type

[delete_assistant_response_t](delete_assistant_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_deleteMessage**
```c
// Deletes a message.
//
delete_message_response_t* AssistantsAPI_deleteMessage(apiClient_t *apiClient, char *thread_id, char *message_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to which this message belongs. | 
**message_id** | **char \*** | The ID of the message to delete. | 

### Return type

[delete_message_response_t](delete_message_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_deleteThread**
```c
// Delete a thread.
//
delete_thread_response_t* AssistantsAPI_deleteThread(apiClient_t *apiClient, char *thread_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to delete. | 

### Return type

[delete_thread_response_t](delete_thread_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_getAssistant**
```c
// Retrieves an assistant.
//
assistant_object_t* AssistantsAPI_getAssistant(apiClient_t *apiClient, char *assistant_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**assistant_id** | **char \*** | The ID of the assistant to retrieve. | 

### Return type

[assistant_object_t](assistant_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_getMessage**
```c
// Retrieve a message.
//
message_object_t* AssistantsAPI_getMessage(apiClient_t *apiClient, char *thread_id, char *message_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
**message_id** | **char \*** | The ID of the message to retrieve. | 

### Return type

[message_object_t](message_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_getRun**
```c
// Retrieves a run.
//
run_object_t* AssistantsAPI_getRun(apiClient_t *apiClient, char *thread_id, char *run_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**run_id** | **char \*** | The ID of the run to retrieve. | 

### Return type

[run_object_t](run_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_getRunStep**
```c
// Retrieves a run step.
//
run_step_object_t* AssistantsAPI_getRunStep(apiClient_t *apiClient, char *thread_id, char *run_id, char *step_id, list_t *include[]);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to which the run and run step belongs. | 
**run_id** | **char \*** | The ID of the run to which the run step belongs. | 
**step_id** | **char \*** | The ID of the run step to retrieve. | 
**include[]** | **[list_t](char.md) \*** | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[run_step_object_t](run_step_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_getThread**
```c
// Retrieves a thread.
//
thread_object_t* AssistantsAPI_getThread(apiClient_t *apiClient, char *thread_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to retrieve. | 

### Return type

[thread_object_t](thread_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_listAssistants**
```c
// Returns a list of assistants.
//
list_assistants_response_t* AssistantsAPI_listAssistants(apiClient_t *apiClient, int *limit, openai_api_listAssistants_order_e order, char *after, char *before);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**order** | **openai_api_listAssistants_order_e** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[list_assistants_response_t](list_assistants_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_listMessages**
```c
// Returns a list of messages for a given thread.
//
list_messages_response_t* AssistantsAPI_listMessages(apiClient_t *apiClient, char *thread_id, int *limit, openai_api_listMessages_order_e order, char *after, char *before, char *run_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**order** | **openai_api_listMessages_order_e** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
**run_id** | **char \*** | Filter messages by the run ID that generated them.  | [optional] 

### Return type

[list_messages_response_t](list_messages_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_listRunSteps**
```c
// Returns a list of run steps belonging to a run.
//
list_run_steps_response_t* AssistantsAPI_listRunSteps(apiClient_t *apiClient, char *thread_id, char *run_id, int *limit, openai_api_listRunSteps_order_e order, char *after, char *before, list_t *include[]);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread the run and run steps belong to. | 
**run_id** | **char \*** | The ID of the run the run steps belong to. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**order** | **openai_api_listRunSteps_order_e** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
**include[]** | **[list_t](char.md) \*** | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[list_run_steps_response_t](list_run_steps_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_listRuns**
```c
// Returns a list of runs belonging to a thread.
//
list_runs_response_t* AssistantsAPI_listRuns(apiClient_t *apiClient, char *thread_id, int *limit, openai_api_listRuns_order_e order, char *after, char *before);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread the run belongs to. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**order** | **openai_api_listRuns_order_e** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[list_runs_response_t](list_runs_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_modifyAssistant**
```c
// Modifies an assistant.
//
assistant_object_t* AssistantsAPI_modifyAssistant(apiClient_t *apiClient, char *assistant_id, modify_assistant_request_t *modify_assistant_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**assistant_id** | **char \*** | The ID of the assistant to modify. | 
**modify_assistant_request** | **[modify_assistant_request_t](modify_assistant_request.md) \*** |  | 

### Return type

[assistant_object_t](assistant_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_modifyMessage**
```c
// Modifies a message.
//
message_object_t* AssistantsAPI_modifyMessage(apiClient_t *apiClient, char *thread_id, char *message_id, modify_message_request_t *modify_message_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to which this message belongs. | 
**message_id** | **char \*** | The ID of the message to modify. | 
**modify_message_request** | **[modify_message_request_t](modify_message_request.md) \*** |  | 

### Return type

[message_object_t](message_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_modifyRun**
```c
// Modifies a run.
//
run_object_t* AssistantsAPI_modifyRun(apiClient_t *apiClient, char *thread_id, char *run_id, modify_run_request_t *modify_run_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**run_id** | **char \*** | The ID of the run to modify. | 
**modify_run_request** | **[modify_run_request_t](modify_run_request.md) \*** |  | 

### Return type

[run_object_t](run_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_modifyThread**
```c
// Modifies a thread.
//
thread_object_t* AssistantsAPI_modifyThread(apiClient_t *apiClient, char *thread_id, modify_thread_request_t *modify_thread_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | 
**modify_thread_request** | **[modify_thread_request_t](modify_thread_request.md) \*** |  | 

### Return type

[thread_object_t](thread_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssistantsAPI_submitToolOuputsToRun**
```c
// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
//
run_object_t* AssistantsAPI_submitToolOuputsToRun(apiClient_t *apiClient, char *thread_id, char *run_id, submit_tool_outputs_run_request_t *submit_tool_outputs_run_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
**run_id** | **char \*** | The ID of the run that requires the tool output submission. | 
**submit_tool_outputs_run_request** | **[submit_tool_outputs_run_request_t](submit_tool_outputs_run_request.md) \*** |  | 

### Return type

[run_object_t](run_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

