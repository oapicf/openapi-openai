# Org.OpenAPITools.Api.AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelRun**](AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;. |
| [**CreateAssistant**](AssistantsApi.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions. |
| [**CreateAssistantFile**](AssistantsApi.md#createassistantfile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants). |
| [**CreateMessage**](AssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message. |
| [**CreateRun**](AssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run. |
| [**CreateThread**](AssistantsApi.md#createthread) | **POST** /threads | Create a thread. |
| [**CreateThreadAndRun**](AssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request. |
| [**DeleteAssistant**](AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant. |
| [**DeleteAssistantFile**](AssistantsApi.md#deleteassistantfile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file. |
| [**DeleteThread**](AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread. |
| [**GetAssistant**](AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant. |
| [**GetAssistantFile**](AssistantsApi.md#getassistantfile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile. |
| [**GetMessage**](AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message. |
| [**GetMessageFile**](AssistantsApi.md#getmessagefile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file. |
| [**GetRun**](AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run. |
| [**GetRunStep**](AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step. |
| [**GetThread**](AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread. |
| [**ListAssistantFiles**](AssistantsApi.md#listassistantfiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files. |
| [**ListAssistants**](AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants. |
| [**ListMessageFiles**](AssistantsApi.md#listmessagefiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files. |
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

<a id="createassistantfile"></a>
# **CreateAssistantFile**
> AssistantFileObject CreateAssistantFile (string assistantId, CreateAssistantFileRequest createAssistantFileRequest)

Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assistantId** | **string** | The ID of the assistant for which to create a File.  |  |
| **createAssistantFileRequest** | [**CreateAssistantFileRequest**](CreateAssistantFileRequest.md) |  |  |

### Return type

[**AssistantFileObject**](AssistantFileObject.md)

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
> RunObject CreateRun (string threadId, CreateRunRequest createRunRequest)

Create a run.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to run. |  |
| **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md) |  |  |

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

<a id="deleteassistantfile"></a>
# **DeleteAssistantFile**
> DeleteAssistantFileResponse DeleteAssistantFile (string assistantId, string fileId)

Delete an assistant file.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assistantId** | **string** | The ID of the assistant that the file belongs to. |  |
| **fileId** | **string** | The ID of the file to delete. |  |

### Return type

[**DeleteAssistantFileResponse**](DeleteAssistantFileResponse.md)

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

<a id="getassistantfile"></a>
# **GetAssistantFile**
> AssistantFileObject GetAssistantFile (string assistantId, string fileId)

Retrieves an AssistantFile.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assistantId** | **string** | The ID of the assistant who the file belongs to. |  |
| **fileId** | **string** | The ID of the file we&#39;re getting. |  |

### Return type

[**AssistantFileObject**](AssistantFileObject.md)

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

<a id="getmessagefile"></a>
# **GetMessageFile**
> MessageFileObject GetMessageFile (string threadId, string messageId, string fileId)

Retrieves a message file.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to which the message and File belong. |  |
| **messageId** | **string** | The ID of the message the file belongs to. |  |
| **fileId** | **string** | The ID of the file being retrieved. |  |

### Return type

[**MessageFileObject**](MessageFileObject.md)

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
> RunStepObject GetRunStep (string threadId, string runId, string stepId)

Retrieves a run step.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread to which the run and run step belongs. |  |
| **runId** | **string** | The ID of the run to which the run step belongs. |  |
| **stepId** | **string** | The ID of the run step to retrieve. |  |

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

<a id="listassistantfiles"></a>
# **ListAssistantFiles**
> ListAssistantFilesResponse ListAssistantFiles (string assistantId, int limit = null, string order = null, string after = null, string before = null)

Returns a list of assistant files.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assistantId** | **string** | The ID of the assistant the file belongs to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

### Return type

[**ListAssistantFilesResponse**](ListAssistantFilesResponse.md)

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
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

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

<a id="listmessagefiles"></a>
# **ListMessageFiles**
> ListMessageFilesResponse ListMessageFiles (string threadId, string messageId, int limit = null, string order = null, string after = null, string before = null)

Returns a list of message files.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread that the message and files belong to. |  |
| **messageId** | **string** | The ID of the message that the files belongs to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

### Return type

[**ListMessageFilesResponse**](ListMessageFilesResponse.md)

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
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |
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
> ListRunStepsResponse ListRunSteps (string threadId, string runId, int limit = null, string order = null, string after = null, string before = null)

Returns a list of run steps belonging to a run.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **threadId** | **string** | The ID of the thread the run and run steps belong to. |  |
| **runId** | **string** | The ID of the run the run steps belong to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

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
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

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

