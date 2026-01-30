# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRun**](AssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;. |
| [**createAssistant**](AssistantsApi.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions. |
| [**createMessage**](AssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message. |
| [**createRun**](AssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run. |
| [**createThread**](AssistantsApi.md#createThread) | **POST** /threads | Create a thread. |
| [**createThreadAndRun**](AssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request. |
| [**deleteAssistant**](AssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant. |
| [**deleteMessage**](AssistantsApi.md#deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message. |
| [**deleteThread**](AssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread. |
| [**getAssistant**](AssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant. |
| [**getMessage**](AssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message. |
| [**getRun**](AssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run. |
| [**getRunStep**](AssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step. |
| [**getThread**](AssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread. |
| [**listAssistants**](AssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants. |
| [**listMessages**](AssistantsApi.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread. |
| [**listRunSteps**](AssistantsApi.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run. |
| [**listRuns**](AssistantsApi.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread. |
| [**modifyAssistant**](AssistantsApi.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant. |
| [**modifyMessage**](AssistantsApi.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message. |
| [**modifyRun**](AssistantsApi.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run. |
| [**modifyThread**](AssistantsApi.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread. |
| [**submitToolOuputsToRun**](AssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.  |


<a name="cancelRun"></a>
# **cancelRun**
> RunObject cancelRun(thread\_id, run\_id)

Cancels a run that is &#x60;in_progress&#x60;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to which this run belongs. | [default to null] |
| **run\_id** | **String**| The ID of the run to cancel. | [default to null] |

### Return type

[**RunObject**](../Models/RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createAssistant"></a>
# **createAssistant**
> AssistantObject createAssistant(CreateAssistantRequest)

Create an assistant with a model and instructions.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateAssistantRequest** | [**CreateAssistantRequest**](../Models/CreateAssistantRequest.md)|  | |

### Return type

[**AssistantObject**](../Models/AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createMessage"></a>
# **createMessage**
> MessageObject createMessage(thread\_id, CreateMessageRequest)

Create a message.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | [default to null] |
| **CreateMessageRequest** | [**CreateMessageRequest**](../Models/CreateMessageRequest.md)|  | |

### Return type

[**MessageObject**](../Models/MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createRun"></a>
# **createRun**
> RunObject createRun(thread\_id, CreateRunRequest, include\[\])

Create a run.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to run. | [default to null] |
| **CreateRunRequest** | [**CreateRunRequest**](../Models/CreateRunRequest.md)|  | |
| **include\[\]** | [**List**](../Models/String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null] [enum: step_details.tool_calls[*].file_search.results[*].content] |

### Return type

[**RunObject**](../Models/RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createThread"></a>
# **createThread**
> ThreadObject createThread(CreateThreadRequest)

Create a thread.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateThreadRequest** | [**CreateThreadRequest**](../Models/CreateThreadRequest.md)|  | [optional] |

### Return type

[**ThreadObject**](../Models/ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createThreadAndRun"></a>
# **createThreadAndRun**
> RunObject createThreadAndRun(CreateThreadAndRunRequest)

Create a thread and run it in one request.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateThreadAndRunRequest** | [**CreateThreadAndRunRequest**](../Models/CreateThreadAndRunRequest.md)|  | |

### Return type

[**RunObject**](../Models/RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteAssistant"></a>
# **deleteAssistant**
> DeleteAssistantResponse deleteAssistant(assistant\_id)

Delete an assistant.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistant\_id** | **String**| The ID of the assistant to delete. | [default to null] |

### Return type

[**DeleteAssistantResponse**](../Models/DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteMessage"></a>
# **deleteMessage**
> DeleteMessageResponse deleteMessage(thread\_id, message\_id)

Deletes a message.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to which this message belongs. | [default to null] |
| **message\_id** | **String**| The ID of the message to delete. | [default to null] |

### Return type

[**DeleteMessageResponse**](../Models/DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteThread"></a>
# **deleteThread**
> DeleteThreadResponse deleteThread(thread\_id)

Delete a thread.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to delete. | [default to null] |

### Return type

[**DeleteThreadResponse**](../Models/DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getAssistant"></a>
# **getAssistant**
> AssistantObject getAssistant(assistant\_id)

Retrieves an assistant.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistant\_id** | **String**| The ID of the assistant to retrieve. | [default to null] |

### Return type

[**AssistantObject**](../Models/AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMessage"></a>
# **getMessage**
> MessageObject getMessage(thread\_id, message\_id)

Retrieve a message.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | [default to null] |
| **message\_id** | **String**| The ID of the message to retrieve. | [default to null] |

### Return type

[**MessageObject**](../Models/MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getRun"></a>
# **getRun**
> RunObject getRun(thread\_id, run\_id)

Retrieves a run.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null] |
| **run\_id** | **String**| The ID of the run to retrieve. | [default to null] |

### Return type

[**RunObject**](../Models/RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getRunStep"></a>
# **getRunStep**
> RunStepObject getRunStep(thread\_id, run\_id, step\_id, include\[\])

Retrieves a run step.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to which the run and run step belongs. | [default to null] |
| **run\_id** | **String**| The ID of the run to which the run step belongs. | [default to null] |
| **step\_id** | **String**| The ID of the run step to retrieve. | [default to null] |
| **include\[\]** | [**List**](../Models/String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null] [enum: step_details.tool_calls[*].file_search.results[*].content] |

### Return type

[**RunStepObject**](../Models/RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getThread"></a>
# **getThread**
> ThreadObject getThread(thread\_id)

Retrieves a thread.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to retrieve. | [default to null] |

### Return type

[**ThreadObject**](../Models/ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listAssistants"></a>
# **listAssistants**
> ListAssistantsResponse listAssistants(limit, order, after, before)

Returns a list of assistants.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |

### Return type

[**ListAssistantsResponse**](../Models/ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listMessages"></a>
# **listMessages**
> ListMessagesResponse listMessages(thread\_id, limit, order, after, before, run\_id)

Returns a list of messages for a given thread.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |
| **run\_id** | **String**| Filter messages by the run ID that generated them.  | [optional] [default to null] |

### Return type

[**ListMessagesResponse**](../Models/ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listRunSteps"></a>
# **listRunSteps**
> ListRunStepsResponse listRunSteps(thread\_id, run\_id, limit, order, after, before, include\[\])

Returns a list of run steps belonging to a run.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread the run and run steps belong to. | [default to null] |
| **run\_id** | **String**| The ID of the run the run steps belong to. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |
| **include\[\]** | [**List**](../Models/String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null] [enum: step_details.tool_calls[*].file_search.results[*].content] |

### Return type

[**ListRunStepsResponse**](../Models/ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listRuns"></a>
# **listRuns**
> ListRunsResponse listRuns(thread\_id, limit, order, after, before)

Returns a list of runs belonging to a thread.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread the run belongs to. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |

### Return type

[**ListRunsResponse**](../Models/ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="modifyAssistant"></a>
# **modifyAssistant**
> AssistantObject modifyAssistant(assistant\_id, ModifyAssistantRequest)

Modifies an assistant.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistant\_id** | **String**| The ID of the assistant to modify. | [default to null] |
| **ModifyAssistantRequest** | [**ModifyAssistantRequest**](../Models/ModifyAssistantRequest.md)|  | |

### Return type

[**AssistantObject**](../Models/AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="modifyMessage"></a>
# **modifyMessage**
> MessageObject modifyMessage(thread\_id, message\_id, ModifyMessageRequest)

Modifies a message.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to which this message belongs. | [default to null] |
| **message\_id** | **String**| The ID of the message to modify. | [default to null] |
| **ModifyMessageRequest** | [**ModifyMessageRequest**](../Models/ModifyMessageRequest.md)|  | |

### Return type

[**MessageObject**](../Models/MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="modifyRun"></a>
# **modifyRun**
> RunObject modifyRun(thread\_id, run\_id, ModifyRunRequest)

Modifies a run.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null] |
| **run\_id** | **String**| The ID of the run to modify. | [default to null] |
| **ModifyRunRequest** | [**ModifyRunRequest**](../Models/ModifyRunRequest.md)|  | |

### Return type

[**RunObject**](../Models/RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="modifyThread"></a>
# **modifyThread**
> ThreadObject modifyThread(thread\_id, ModifyThreadRequest)

Modifies a thread.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | [default to null] |
| **ModifyThreadRequest** | [**ModifyThreadRequest**](../Models/ModifyThreadRequest.md)|  | |

### Return type

[**ThreadObject**](../Models/ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="submitToolOuputsToRun"></a>
# **submitToolOuputsToRun**
> RunObject submitToolOuputsToRun(thread\_id, run\_id, SubmitToolOutputsRunRequest)

When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thread\_id** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | [default to null] |
| **run\_id** | **String**| The ID of the run that requires the tool output submission. | [default to null] |
| **SubmitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](../Models/SubmitToolOutputsRunRequest.md)|  | |

### Return type

[**RunObject**](../Models/RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

