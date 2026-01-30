# Org.OpenAPITools.Api.AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelRun**](AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;. |
| [**CreateAssistant**](AssistantsApi.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions. |
| [**CreateMessage**](AssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message. |
| [**CreateRun**](AssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run. |
| [**CreateThread**](AssistantsApi.md#createthread) | **POST** /threads | Create a thread. |
| [**CreateThreadAndRun**](AssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request. |
| [**DeleteAssistant**](AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant. |
| [**DeleteMessage**](AssistantsApi.md#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message. |
| [**DeleteThread**](AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread. |
| [**GetAssistant**](AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant. |
| [**GetMessage**](AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message. |
| [**GetRun**](AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run. |
| [**GetRunStep**](AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step. |
| [**GetThread**](AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread. |
| [**ListAssistants**](AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants. |
| [**ListMessages**](AssistantsApi.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread. |
| [**ListRunSteps**](AssistantsApi.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run. |
| [**ListRuns**](AssistantsApi.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread. |
| [**ModifyAssistant**](AssistantsApi.md#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant. |
| [**ModifyMessage**](AssistantsApi.md#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message. |
| [**ModifyRun**](AssistantsApi.md#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run. |
| [**ModifyThread**](AssistantsApi.md#modifythread) | **POST** /threads/{thread_id} | Modifies a thread. |
| [**SubmitToolOuputsToRun**](AssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.  |

<a id="cancelrun"></a>
# **CancelRun**
> RunObject CancelRun (string threadId, string runId)

Cancels a run that is `in_progress`.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to which this run belongs. |  |
| **runId** | **string** | The ID of the run to cancel. |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createassistant"></a>
# **CreateAssistant**
> AssistantObject CreateAssistant (CreateAssistantRequest createAssistantRequest)

Create an assistant with a model and instructions.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createAssistantRequest** | [**CreateAssistantRequest**](CreateAssistantRequest.md) |  |  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createmessage"></a>
# **CreateMessage**
> MessageObject CreateMessage (string threadId, CreateMessageRequest createMessageRequest)

Create a message.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to create a message for. |  |
| **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md) |  |  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createrun"></a>
# **CreateRun**
> RunObject CreateRun (string threadId, CreateRunRequest createRunRequest, List<string> include = null)

Create a run.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to run. |  |
| **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md) |  |  |
| **include** | [**List&lt;string&gt;**](string.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional]  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createthread"></a>
# **CreateThread**
> ThreadObject CreateThread (CreateThreadRequest createThreadRequest = null)

Create a thread.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createThreadRequest** | [**CreateThreadRequest**](CreateThreadRequest.md) |  | [optional]  |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createthreadandrun"></a>
# **CreateThreadAndRun**
> RunObject CreateThreadAndRun (CreateThreadAndRunRequest createThreadAndRunRequest)

Create a thread and run it in one request.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createThreadAndRunRequest** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md) |  |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deleteassistant"></a>
# **DeleteAssistant**
> DeleteAssistantResponse DeleteAssistant (string assistantId)

Delete an assistant.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assistantId** | **string** | The ID of the assistant to delete. |  |

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deletemessage"></a>
# **DeleteMessage**
> DeleteMessageResponse DeleteMessage (string threadId, string messageId)

Deletes a message.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to which this message belongs. |  |
| **messageId** | **string** | The ID of the message to delete. |  |

### Return type

[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deletethread"></a>
# **DeleteThread**
> DeleteThreadResponse DeleteThread (string threadId)

Delete a thread.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to delete. |  |

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getassistant"></a>
# **GetAssistant**
> AssistantObject GetAssistant (string assistantId)

Retrieves an assistant.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assistantId** | **string** | The ID of the assistant to retrieve. |  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getmessage"></a>
# **GetMessage**
> MessageObject GetMessage (string threadId, string messageId)

Retrieve a message.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. |  |
| **messageId** | **string** | The ID of the message to retrieve. |  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getrun"></a>
# **GetRun**
> RunObject GetRun (string threadId, string runId)

Retrieves a run.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. |  |
| **runId** | **string** | The ID of the run to retrieve. |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getrunstep"></a>
# **GetRunStep**
> RunStepObject GetRunStep (string threadId, string runId, string stepId, List<string> include = null)

Retrieves a run step.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to which the run and run step belongs. |  |
| **runId** | **string** | The ID of the run to which the run step belongs. |  |
| **stepId** | **string** | The ID of the run step to retrieve. |  |
| **include** | [**List&lt;string&gt;**](string.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional]  |

### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getthread"></a>
# **GetThread**
> ThreadObject GetThread (string threadId)

Retrieves a thread.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to retrieve. |  |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listassistants"></a>
# **ListAssistants**
> ListAssistantsResponse ListAssistants (int limit = null, string order = null, string after = null, string before = null)

Returns a list of assistants.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listmessages"></a>
# **ListMessages**
> ListMessagesResponse ListMessages (string threadId, int limit = null, string order = null, string after = null, string before = null, string runId = null)

Returns a list of messages for a given thread.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) the messages belong to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |
| **runId** | **string** | Filter messages by the run ID that generated them.  | [optional]  |

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listrunsteps"></a>
# **ListRunSteps**
> ListRunStepsResponse ListRunSteps (string threadId, string runId, int limit = null, string order = null, string after = null, string before = null, List<string> include = null)

Returns a list of run steps belonging to a run.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread the run and run steps belong to. |  |
| **runId** | **string** | The ID of the run the run steps belong to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |
| **include** | [**List&lt;string&gt;**](string.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional]  |

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listruns"></a>
# **ListRuns**
> ListRunsResponse ListRuns (string threadId, int limit = null, string order = null, string after = null, string before = null)

Returns a list of runs belonging to a thread.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread the run belongs to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifyassistant"></a>
# **ModifyAssistant**
> AssistantObject ModifyAssistant (string assistantId, ModifyAssistantRequest modifyAssistantRequest)

Modifies an assistant.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assistantId** | **string** | The ID of the assistant to modify. |  |
| **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md) |  |  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifymessage"></a>
# **ModifyMessage**
> MessageObject ModifyMessage (string threadId, string messageId, ModifyMessageRequest modifyMessageRequest)

Modifies a message.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to which this message belongs. |  |
| **messageId** | **string** | The ID of the message to modify. |  |
| **modifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md) |  |  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifyrun"></a>
# **ModifyRun**
> RunObject ModifyRun (string threadId, string runId, ModifyRunRequest modifyRunRequest)

Modifies a run.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. |  |
| **runId** | **string** | The ID of the run to modify. |  |
| **modifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md) |  |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifythread"></a>
# **ModifyThread**
> ThreadObject ModifyThread (string threadId, ModifyThreadRequest modifyThreadRequest)

Modifies a thread.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. |  |
| **modifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md) |  |  |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="submittoolouputstorun"></a>
# **SubmitToolOuputsToRun**
> RunObject SubmitToolOuputsToRun (string threadId, string runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest)

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. |  |
| **runId** | **string** | The ID of the run that requires the tool output submission. |  |
| **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md) |  |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

