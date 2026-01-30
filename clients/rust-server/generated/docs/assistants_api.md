# assistants_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**createAssistant**](assistants_api.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
**createThread**](assistants_api.md#createThread) | **POST** /threads | Create a thread.
**createThreadAndRun**](assistants_api.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
**listAssistants**](assistants_api.md#listAssistants) | **GET** /assistants | Returns a list of assistants.
**createMessage**](assistants_api.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
**createRun**](assistants_api.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
**deleteAssistant**](assistants_api.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
**deleteThread**](assistants_api.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
**getAssistant**](assistants_api.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
**getThread**](assistants_api.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
**listMessages**](assistants_api.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
**listRuns**](assistants_api.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
**modifyAssistant**](assistants_api.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
**modifyThread**](assistants_api.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
**cancelRun**](assistants_api.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`.
**deleteMessage**](assistants_api.md#deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
**getMessage**](assistants_api.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
**getRun**](assistants_api.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
**listRunSteps**](assistants_api.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
**modifyMessage**](assistants_api.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
**modifyRun**](assistants_api.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
**submitToolOuputsToRun**](assistants_api.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
**getRunStep**](assistants_api.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.


# **createAssistant**
> models::AssistantObject createAssistant(ctx, create_assistant_request)
Create an assistant with a model and instructions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **create_assistant_request** | [**CreateAssistantRequest**](CreateAssistantRequest.md)|  | 

### Return type

[**models::AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createThread**
> models::ThreadObject createThread(ctx, optional)
Create a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_thread_request** | [**CreateThreadRequest**](CreateThreadRequest.md)|  | 

### Return type

[**models::ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createThreadAndRun**
> models::RunObject createThreadAndRun(ctx, create_thread_and_run_request)
Create a thread and run it in one request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **create_thread_and_run_request** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md)|  | 

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listAssistants**
> models::ListAssistantsResponse listAssistants(ctx, optional)
Returns a list of assistants.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | [****](.md)| Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  | 
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**models::ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createMessage**
> models::MessageObject createMessage(ctx, thread_id, create_message_request)
Create a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | 
  **create_message_request** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | 

### Return type

[**models::MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createRun**
> models::RunObject createRun(ctx, thread_id, create_run_request, optional)
Create a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to run. | 
  **create_run_request** | [**CreateRunRequest**](CreateRunRequest.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **String**| The ID of the thread to run. | 
 **create_run_request** | [**CreateRunRequest**](CreateRunRequest.md)|  | 
 **include_left_square_bracket_right_square_bracket** | [**models::CreateRunIncludeParameterInner**](models::CreateRunIncludeParameterInner.md)| A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | 

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAssistant**
> models::DeleteAssistantResponse deleteAssistant(ctx, assistant_id)
Delete an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **assistant_id** | **String**| The ID of the assistant to delete. | 

### Return type

[**models::DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteThread**
> models::DeleteThreadResponse deleteThread(ctx, thread_id)
Delete a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to delete. | 

### Return type

[**models::DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssistant**
> models::AssistantObject getAssistant(ctx, assistant_id)
Retrieves an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **assistant_id** | **String**| The ID of the assistant to retrieve. | 

### Return type

[**models::AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getThread**
> models::ThreadObject getThread(ctx, thread_id)
Retrieves a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to retrieve. | 

### Return type

[**models::ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listMessages**
> models::ListMessagesResponse listMessages(ctx, thread_id, optional)
Returns a list of messages for a given thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **String**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | [****](.md)| Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  | 
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 
 **run_id** | **String**| Filter messages by the run ID that generated them.  | 

### Return type

[**models::ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRuns**
> models::ListRunsResponse listRuns(ctx, thread_id, optional)
Returns a list of runs belonging to a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread the run belongs to. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **String**| The ID of the thread the run belongs to. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | [****](.md)| Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  | 
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**models::ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyAssistant**
> models::AssistantObject modifyAssistant(ctx, assistant_id, modify_assistant_request)
Modifies an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **assistant_id** | **String**| The ID of the assistant to modify. | 
  **modify_assistant_request** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md)|  | 

### Return type

[**models::AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyThread**
> models::ThreadObject modifyThread(ctx, thread_id, modify_thread_request)
Modifies a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to modify. Only the `metadata` can be modified. | 
  **modify_thread_request** | [**ModifyThreadRequest**](ModifyThreadRequest.md)|  | 

### Return type

[**models::ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelRun**
> models::RunObject cancelRun(ctx, thread_id, run_id)
Cancels a run that is `in_progress`.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to which this run belongs. | 
  **run_id** | **String**| The ID of the run to cancel. | 

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteMessage**
> models::DeleteMessageResponse deleteMessage(ctx, thread_id, message_id)
Deletes a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to which this message belongs. | 
  **message_id** | **String**| The ID of the message to delete. | 

### Return type

[**models::DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMessage**
> models::MessageObject getMessage(ctx, thread_id, message_id)
Retrieve a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
  **message_id** | **String**| The ID of the message to retrieve. | 

### Return type

[**models::MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRun**
> models::RunObject getRun(ctx, thread_id, run_id)
Retrieves a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
  **run_id** | **String**| The ID of the run to retrieve. | 

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRunSteps**
> models::ListRunStepsResponse listRunSteps(ctx, thread_id, run_id, optional)
Returns a list of run steps belonging to a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread the run and run steps belong to. | 
  **run_id** | **String**| The ID of the run the run steps belong to. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **String**| The ID of the thread the run and run steps belong to. | 
 **run_id** | **String**| The ID of the run the run steps belong to. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | [****](.md)| Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  | 
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 
 **include_left_square_bracket_right_square_bracket** | [**models::CreateRunIncludeParameterInner**](models::CreateRunIncludeParameterInner.md)| A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | 

### Return type

[**models::ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyMessage**
> models::MessageObject modifyMessage(ctx, thread_id, message_id, modify_message_request)
Modifies a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to which this message belongs. | 
  **message_id** | **String**| The ID of the message to modify. | 
  **modify_message_request** | [**ModifyMessageRequest**](ModifyMessageRequest.md)|  | 

### Return type

[**models::MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyRun**
> models::RunObject modifyRun(ctx, thread_id, run_id, modify_run_request)
Modifies a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
  **run_id** | **String**| The ID of the run to modify. | 
  **modify_run_request** | [**ModifyRunRequest**](ModifyRunRequest.md)|  | 

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submitToolOuputsToRun**
> models::RunObject submitToolOuputsToRun(ctx, thread_id, run_id, submit_tool_outputs_run_request)
When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
  **run_id** | **String**| The ID of the run that requires the tool output submission. | 
  **submit_tool_outputs_run_request** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md)|  | 

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRunStep**
> models::RunStepObject getRunStep(ctx, thread_id, run_id, step_id, optional)
Retrieves a run step.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **thread_id** | **String**| The ID of the thread to which the run and run step belongs. | 
  **run_id** | **String**| The ID of the run to which the run step belongs. | 
  **step_id** | **String**| The ID of the run step to retrieve. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **String**| The ID of the thread to which the run and run step belongs. | 
 **run_id** | **String**| The ID of the run to which the run step belongs. | 
 **step_id** | **String**| The ID of the run step to retrieve. | 
 **include_left_square_bracket_right_square_bracket** | [**models::CreateRunIncludeParameterInner**](models::CreateRunIncludeParameterInner.md)| A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | 

### Return type

[**models::RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

