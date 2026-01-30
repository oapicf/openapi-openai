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


## Creating AssistantsApi

To initiate an instance of `AssistantsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AssistantsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AssistantsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AssistantsApi assistantsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="cancelRun"></a>
# **cancelRun**
```java
Mono<RunObject> AssistantsApi.cancelRun(threadIdrunId)
```

Cancels a run that is &#x60;in_progress&#x60;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to which this run belongs. | |
| **runId** | `String`| The ID of the run to cancel. | |


### Return type
[**RunObject**](RunObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="createAssistant"></a>
# **createAssistant**
```java
Mono<AssistantObject> AssistantsApi.createAssistant(createAssistantRequest)
```

Create an assistant with a model and instructions.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAssistantRequest** | [**CreateAssistantRequest**](CreateAssistantRequest.md)|  | |


### Return type
[**AssistantObject**](AssistantObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createMessage"></a>
# **createMessage**
```java
Mono<MessageObject> AssistantsApi.createMessage(threadIdcreateMessageRequest)
```

Create a message.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the [thread](/docs/api-reference/threads) to create a message for. | |
| **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | |


### Return type
[**MessageObject**](MessageObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createRun"></a>
# **createRun**
```java
Mono<RunObject> AssistantsApi.createRun(threadIdcreateRunRequestinclude)
```

Create a run.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to run. | |
| **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md)|  | |
| **include** | [**List&lt;String&gt;**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional parameter] [enum: `step_details.tool_calls[*].file_search.results[*].content`] |


### Return type
[**RunObject**](RunObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createThread"></a>
# **createThread**
```java
Mono<ThreadObject> AssistantsApi.createThread(createThreadRequest)
```

Create a thread.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createThreadRequest** | [**CreateThreadRequest**](CreateThreadRequest.md)|  | [optional parameter] |


### Return type
[**ThreadObject**](ThreadObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createThreadAndRun"></a>
# **createThreadAndRun**
```java
Mono<RunObject> AssistantsApi.createThreadAndRun(createThreadAndRunRequest)
```

Create a thread and run it in one request.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createThreadAndRunRequest** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md)|  | |


### Return type
[**RunObject**](RunObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteAssistant"></a>
# **deleteAssistant**
```java
Mono<DeleteAssistantResponse> AssistantsApi.deleteAssistant(assistantId)
```

Delete an assistant.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistantId** | `String`| The ID of the assistant to delete. | |


### Return type
[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="deleteMessage"></a>
# **deleteMessage**
```java
Mono<DeleteMessageResponse> AssistantsApi.deleteMessage(threadIdmessageId)
```

Deletes a message.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to which this message belongs. | |
| **messageId** | `String`| The ID of the message to delete. | |


### Return type
[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="deleteThread"></a>
# **deleteThread**
```java
Mono<DeleteThreadResponse> AssistantsApi.deleteThread(threadId)
```

Delete a thread.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to delete. | |


### Return type
[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getAssistant"></a>
# **getAssistant**
```java
Mono<AssistantObject> AssistantsApi.getAssistant(assistantId)
```

Retrieves an assistant.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistantId** | `String`| The ID of the assistant to retrieve. | |


### Return type
[**AssistantObject**](AssistantObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getMessage"></a>
# **getMessage**
```java
Mono<MessageObject> AssistantsApi.getMessage(threadIdmessageId)
```

Retrieve a message.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | |
| **messageId** | `String`| The ID of the message to retrieve. | |


### Return type
[**MessageObject**](MessageObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getRun"></a>
# **getRun**
```java
Mono<RunObject> AssistantsApi.getRun(threadIdrunId)
```

Retrieves a run.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the [thread](/docs/api-reference/threads) that was run. | |
| **runId** | `String`| The ID of the run to retrieve. | |


### Return type
[**RunObject**](RunObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getRunStep"></a>
# **getRunStep**
```java
Mono<RunStepObject> AssistantsApi.getRunStep(threadIdrunIdstepIdinclude)
```

Retrieves a run step.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to which the run and run step belongs. | |
| **runId** | `String`| The ID of the run to which the run step belongs. | |
| **stepId** | `String`| The ID of the run step to retrieve. | |
| **include** | [**List&lt;String&gt;**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional parameter] [enum: `step_details.tool_calls[*].file_search.results[*].content`] |


### Return type
[**RunStepObject**](RunStepObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getThread"></a>
# **getThread**
```java
Mono<ThreadObject> AssistantsApi.getThread(threadId)
```

Retrieves a thread.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to retrieve. | |


### Return type
[**ThreadObject**](ThreadObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listAssistants"></a>
# **listAssistants**
```java
Mono<ListAssistantsResponse> AssistantsApi.listAssistants(limitorderafterbefore)
```

Returns a list of assistants.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **order** | `String`| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **before** | `String`| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter] |


### Return type
[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listMessages"></a>
# **listMessages**
```java
Mono<ListMessagesResponse> AssistantsApi.listMessages(threadIdlimitorderafterbeforerunId)
```

Returns a list of messages for a given thread.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **order** | `String`| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **before** | `String`| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter] |
| **runId** | `String`| Filter messages by the run ID that generated them.  | [optional parameter] |


### Return type
[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listRunSteps"></a>
# **listRunSteps**
```java
Mono<ListRunStepsResponse> AssistantsApi.listRunSteps(threadIdrunIdlimitorderafterbeforeinclude)
```

Returns a list of run steps belonging to a run.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread the run and run steps belong to. | |
| **runId** | `String`| The ID of the run the run steps belong to. | |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **order** | `String`| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **before** | `String`| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter] |
| **include** | [**List&lt;String&gt;**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional parameter] [enum: `step_details.tool_calls[*].file_search.results[*].content`] |


### Return type
[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listRuns"></a>
# **listRuns**
```java
Mono<ListRunsResponse> AssistantsApi.listRuns(threadIdlimitorderafterbefore)
```

Returns a list of runs belonging to a thread.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread the run belongs to. | |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **order** | `String`| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **before** | `String`| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter] |


### Return type
[**ListRunsResponse**](ListRunsResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="modifyAssistant"></a>
# **modifyAssistant**
```java
Mono<AssistantObject> AssistantsApi.modifyAssistant(assistantIdmodifyAssistantRequest)
```

Modifies an assistant.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistantId** | `String`| The ID of the assistant to modify. | |
| **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md)|  | |


### Return type
[**AssistantObject**](AssistantObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="modifyMessage"></a>
# **modifyMessage**
```java
Mono<MessageObject> AssistantsApi.modifyMessage(threadIdmessageIdmodifyMessageRequest)
```

Modifies a message.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to which this message belongs. | |
| **messageId** | `String`| The ID of the message to modify. | |
| **modifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md)|  | |


### Return type
[**MessageObject**](MessageObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="modifyRun"></a>
# **modifyRun**
```java
Mono<RunObject> AssistantsApi.modifyRun(threadIdrunIdmodifyRunRequest)
```

Modifies a run.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the [thread](/docs/api-reference/threads) that was run. | |
| **runId** | `String`| The ID of the run to modify. | |
| **modifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md)|  | |


### Return type
[**RunObject**](RunObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="modifyThread"></a>
# **modifyThread**
```java
Mono<ThreadObject> AssistantsApi.modifyThread(threadIdmodifyThreadRequest)
```

Modifies a thread.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | |
| **modifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md)|  | |


### Return type
[**ThreadObject**](ThreadObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="submitToolOuputsToRun"></a>
# **submitToolOuputsToRun**
```java
Mono<RunObject> AssistantsApi.submitToolOuputsToRun(threadIdrunIdsubmitToolOutputsRunRequest)
```

When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `String`| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | |
| **runId** | `String`| The ID of the run that requires the tool output submission. | |
| **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md)|  | |


### Return type
[**RunObject**](RunObject.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

