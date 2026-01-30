# AssistantsController

All URIs are relative to `"/v1"`

The controller class is defined in **[AssistantsController.java](../../src/main/java/org/openapitools/controller/AssistantsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**createAssistant**](#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**createMessage**](#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**createRun**](#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
[**createThread**](#createThread) | **POST** /threads | Create a thread.
[**createThreadAndRun**](#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**deleteAssistant**](#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**deleteMessage**](#deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**deleteThread**](#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**getAssistant**](#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**getMessage**](#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**getRun**](#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**getRunStep**](#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**getThread**](#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**listAssistants**](#listAssistants) | **GET** /assistants | Returns a list of assistants.
[**listMessages**](#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**listRunSteps**](#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**listRuns**](#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**modifyAssistant**](#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**modifyMessage**](#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modifyRun**](#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modifyThread**](#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
[**submitToolOuputsToRun**](#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

<a id="cancelRun"></a>
# **cancelRun**
```java
Mono<RunObject> AssistantsController.cancelRun(threadIdrunId)
```

Cancels a run that is &#x60;in_progress&#x60;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to which this run belongs. |
**runId** | `String` | The ID of the run to cancel. |

### Return type
[**RunObject**](../../docs/models/RunObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="createAssistant"></a>
# **createAssistant**
```java
Mono<AssistantObject> AssistantsController.createAssistant(createAssistantRequest)
```

Create an assistant with a model and instructions.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createAssistantRequest** | [**CreateAssistantRequest**](../../docs/models/CreateAssistantRequest.md) |  |

### Return type
[**AssistantObject**](../../docs/models/AssistantObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createMessage"></a>
# **createMessage**
```java
Mono<MessageObject> AssistantsController.createMessage(threadIdcreateMessageRequest)
```

Create a message.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the [thread](/docs/api-reference/threads) to create a message for. |
**createMessageRequest** | [**CreateMessageRequest**](../../docs/models/CreateMessageRequest.md) |  |

### Return type
[**MessageObject**](../../docs/models/MessageObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createRun"></a>
# **createRun**
```java
Mono<RunObject> AssistantsController.createRun(threadIdcreateRunRequestinclude)
```

Create a run.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to run. |
**createRunRequest** | [**CreateRunRequest**](../../docs/models/CreateRunRequest.md) |  |
**include** | [**List&lt;String&gt;**](../../docs/models/String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional parameter] [enum: `step_details.tool_calls[*].file_search.results[*].content`]

### Return type
[**RunObject**](../../docs/models/RunObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createThread"></a>
# **createThread**
```java
Mono<ThreadObject> AssistantsController.createThread(createThreadRequest)
```

Create a thread.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createThreadRequest** | [**CreateThreadRequest**](../../docs/models/CreateThreadRequest.md) |  | [optional parameter]

### Return type
[**ThreadObject**](../../docs/models/ThreadObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createThreadAndRun"></a>
# **createThreadAndRun**
```java
Mono<RunObject> AssistantsController.createThreadAndRun(createThreadAndRunRequest)
```

Create a thread and run it in one request.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createThreadAndRunRequest** | [**CreateThreadAndRunRequest**](../../docs/models/CreateThreadAndRunRequest.md) |  |

### Return type
[**RunObject**](../../docs/models/RunObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="deleteAssistant"></a>
# **deleteAssistant**
```java
Mono<DeleteAssistantResponse> AssistantsController.deleteAssistant(assistantId)
```

Delete an assistant.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**assistantId** | `String` | The ID of the assistant to delete. |

### Return type
[**DeleteAssistantResponse**](../../docs/models/DeleteAssistantResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="deleteMessage"></a>
# **deleteMessage**
```java
Mono<DeleteMessageResponse> AssistantsController.deleteMessage(threadIdmessageId)
```

Deletes a message.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to which this message belongs. |
**messageId** | `String` | The ID of the message to delete. |

### Return type
[**DeleteMessageResponse**](../../docs/models/DeleteMessageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="deleteThread"></a>
# **deleteThread**
```java
Mono<DeleteThreadResponse> AssistantsController.deleteThread(threadId)
```

Delete a thread.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to delete. |

### Return type
[**DeleteThreadResponse**](../../docs/models/DeleteThreadResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getAssistant"></a>
# **getAssistant**
```java
Mono<AssistantObject> AssistantsController.getAssistant(assistantId)
```

Retrieves an assistant.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**assistantId** | `String` | The ID of the assistant to retrieve. |

### Return type
[**AssistantObject**](../../docs/models/AssistantObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getMessage"></a>
# **getMessage**
```java
Mono<MessageObject> AssistantsController.getMessage(threadIdmessageId)
```

Retrieve a message.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. |
**messageId** | `String` | The ID of the message to retrieve. |

### Return type
[**MessageObject**](../../docs/models/MessageObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getRun"></a>
# **getRun**
```java
Mono<RunObject> AssistantsController.getRun(threadIdrunId)
```

Retrieves a run.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the [thread](/docs/api-reference/threads) that was run. |
**runId** | `String` | The ID of the run to retrieve. |

### Return type
[**RunObject**](../../docs/models/RunObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getRunStep"></a>
# **getRunStep**
```java
Mono<RunStepObject> AssistantsController.getRunStep(threadIdrunIdstepIdinclude)
```

Retrieves a run step.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to which the run and run step belongs. |
**runId** | `String` | The ID of the run to which the run step belongs. |
**stepId** | `String` | The ID of the run step to retrieve. |
**include** | [**List&lt;String&gt;**](../../docs/models/String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional parameter] [enum: `step_details.tool_calls[*].file_search.results[*].content`]

### Return type
[**RunStepObject**](../../docs/models/RunStepObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getThread"></a>
# **getThread**
```java
Mono<ThreadObject> AssistantsController.getThread(threadId)
```

Retrieves a thread.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to retrieve. |

### Return type
[**ThreadObject**](../../docs/models/ThreadObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listAssistants"></a>
# **listAssistants**
```java
Mono<ListAssistantsResponse> AssistantsController.listAssistants(limitorderafterbefore)
```

Returns a list of assistants.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]

### Return type
[**ListAssistantsResponse**](../../docs/models/ListAssistantsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listMessages"></a>
# **listMessages**
```java
Mono<ListMessagesResponse> AssistantsController.listMessages(threadIdlimitorderafterbeforerunId)
```

Returns a list of messages for a given thread.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the [thread](/docs/api-reference/threads) the messages belong to. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]
**runId** | `String` | Filter messages by the run ID that generated them.  | [optional parameter]

### Return type
[**ListMessagesResponse**](../../docs/models/ListMessagesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listRunSteps"></a>
# **listRunSteps**
```java
Mono<ListRunStepsResponse> AssistantsController.listRunSteps(threadIdrunIdlimitorderafterbeforeinclude)
```

Returns a list of run steps belonging to a run.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread the run and run steps belong to. |
**runId** | `String` | The ID of the run the run steps belong to. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]
**include** | [**List&lt;String&gt;**](../../docs/models/String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional parameter] [enum: `step_details.tool_calls[*].file_search.results[*].content`]

### Return type
[**ListRunStepsResponse**](../../docs/models/ListRunStepsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listRuns"></a>
# **listRuns**
```java
Mono<ListRunsResponse> AssistantsController.listRuns(threadIdlimitorderafterbefore)
```

Returns a list of runs belonging to a thread.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread the run belongs to. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]

### Return type
[**ListRunsResponse**](../../docs/models/ListRunsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="modifyAssistant"></a>
# **modifyAssistant**
```java
Mono<AssistantObject> AssistantsController.modifyAssistant(assistantIdmodifyAssistantRequest)
```

Modifies an assistant.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**assistantId** | `String` | The ID of the assistant to modify. |
**modifyAssistantRequest** | [**ModifyAssistantRequest**](../../docs/models/ModifyAssistantRequest.md) |  |

### Return type
[**AssistantObject**](../../docs/models/AssistantObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="modifyMessage"></a>
# **modifyMessage**
```java
Mono<MessageObject> AssistantsController.modifyMessage(threadIdmessageIdmodifyMessageRequest)
```

Modifies a message.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to which this message belongs. |
**messageId** | `String` | The ID of the message to modify. |
**modifyMessageRequest** | [**ModifyMessageRequest**](../../docs/models/ModifyMessageRequest.md) |  |

### Return type
[**MessageObject**](../../docs/models/MessageObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="modifyRun"></a>
# **modifyRun**
```java
Mono<RunObject> AssistantsController.modifyRun(threadIdrunIdmodifyRunRequest)
```

Modifies a run.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the [thread](/docs/api-reference/threads) that was run. |
**runId** | `String` | The ID of the run to modify. |
**modifyRunRequest** | [**ModifyRunRequest**](../../docs/models/ModifyRunRequest.md) |  |

### Return type
[**RunObject**](../../docs/models/RunObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="modifyThread"></a>
# **modifyThread**
```java
Mono<ThreadObject> AssistantsController.modifyThread(threadIdmodifyThreadRequest)
```

Modifies a thread.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. |
**modifyThreadRequest** | [**ModifyThreadRequest**](../../docs/models/ModifyThreadRequest.md) |  |

### Return type
[**ThreadObject**](../../docs/models/ThreadObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="submitToolOuputsToRun"></a>
# **submitToolOuputsToRun**
```java
Mono<RunObject> AssistantsController.submitToolOuputsToRun(threadIdrunIdsubmitToolOutputsRunRequest)
```

When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**threadId** | `String` | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. |
**runId** | `String` | The ID of the run that requires the tool output submission. |
**submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](../../docs/models/SubmitToolOutputsRunRequest.md) |  |

### Return type
[**RunObject**](../../docs/models/RunObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

