# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](AssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**createAssistant**](AssistantsApi.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**createMessage**](AssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**createRun**](AssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
[**createThread**](AssistantsApi.md#createThread) | **POST** /threads | Create a thread.
[**createThreadAndRun**](AssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**deleteAssistant**](AssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**deleteMessage**](AssistantsApi.md#deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**deleteThread**](AssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**getAssistant**](AssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**getMessage**](AssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**getRun**](AssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**getRunStep**](AssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**getThread**](AssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**listAssistants**](AssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants.
[**listMessages**](AssistantsApi.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**listRunSteps**](AssistantsApi.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**listRuns**](AssistantsApi.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**modifyAssistant**](AssistantsApi.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**modifyMessage**](AssistantsApi.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modifyRun**](AssistantsApi.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modifyThread**](AssistantsApi.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
[**submitToolOuputsToRun**](AssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 



## cancelRun

> RunObject cancelRun(threadId, runId)

Cancels a run that is &#x60;in_progress&#x60;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to which this run belongs.
String runId = null; // String | The ID of the run to cancel.
try {
    RunObject result = apiInstance.cancelRun(threadId, runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#cancelRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which this run belongs. | [default to null]
 **runId** | **String**| The ID of the run to cancel. | [default to null]

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createAssistant

> AssistantObject createAssistant(createAssistantRequest)

Create an assistant with a model and instructions.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
CreateAssistantRequest createAssistantRequest = new CreateAssistantRequest(); // CreateAssistantRequest | 
try {
    AssistantObject result = apiInstance.createAssistant(createAssistantRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#createAssistant");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAssistantRequest** | [**CreateAssistantRequest**](CreateAssistantRequest.md)|  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createMessage

> MessageObject createMessage(threadId, createMessageRequest)

Create a message.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the [thread](/docs/api-reference/threads) to create a message for.
CreateMessageRequest createMessageRequest = new CreateMessageRequest(); // CreateMessageRequest | 
try {
    MessageObject result = apiInstance.createMessage(threadId, createMessageRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#createMessage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | [default to null]
 **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createRun

> RunObject createRun(threadId, createRunRequest, include)

Create a run.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to run.
CreateRunRequest createRunRequest = new CreateRunRequest(); // CreateRunRequest | 
List<String> include = null; // List<String> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
try {
    RunObject result = apiInstance.createRun(threadId, createRunRequest, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#createRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to run. | [default to null]
 **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md)|  |
 **include** | [**List&lt;String&gt;**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null] [enum: step_details.tool_calls[*].file_search.results[*].content]

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createThread

> ThreadObject createThread(createThreadRequest)

Create a thread.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
CreateThreadRequest createThreadRequest = new CreateThreadRequest(); // CreateThreadRequest | 
try {
    ThreadObject result = apiInstance.createThread(createThreadRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#createThread");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadRequest** | [**CreateThreadRequest**](CreateThreadRequest.md)|  | [optional]

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createThreadAndRun

> RunObject createThreadAndRun(createThreadAndRunRequest)

Create a thread and run it in one request.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
CreateThreadAndRunRequest createThreadAndRunRequest = new CreateThreadAndRunRequest(); // CreateThreadAndRunRequest | 
try {
    RunObject result = apiInstance.createThreadAndRun(createThreadAndRunRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#createThreadAndRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadAndRunRequest** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md)|  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteAssistant

> DeleteAssistantResponse deleteAssistant(assistantId)

Delete an assistant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String assistantId = null; // String | The ID of the assistant to delete.
try {
    DeleteAssistantResponse result = apiInstance.deleteAssistant(assistantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#deleteAssistant");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant to delete. | [default to null]

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteMessage

> DeleteMessageResponse deleteMessage(threadId, messageId)

Deletes a message.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to which this message belongs.
String messageId = null; // String | The ID of the message to delete.
try {
    DeleteMessageResponse result = apiInstance.deleteMessage(threadId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#deleteMessage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which this message belongs. | [default to null]
 **messageId** | **String**| The ID of the message to delete. | [default to null]

### Return type

[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteThread

> DeleteThreadResponse deleteThread(threadId)

Delete a thread.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to delete.
try {
    DeleteThreadResponse result = apiInstance.deleteThread(threadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#deleteThread");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to delete. | [default to null]

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAssistant

> AssistantObject getAssistant(assistantId)

Retrieves an assistant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String assistantId = null; // String | The ID of the assistant to retrieve.
try {
    AssistantObject result = apiInstance.getAssistant(assistantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#getAssistant");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant to retrieve. | [default to null]

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMessage

> MessageObject getMessage(threadId, messageId)

Retrieve a message.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
String messageId = null; // String | The ID of the message to retrieve.
try {
    MessageObject result = apiInstance.getMessage(threadId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#getMessage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | [default to null]
 **messageId** | **String**| The ID of the message to retrieve. | [default to null]

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRun

> RunObject getRun(threadId, runId)

Retrieves a run.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the [thread](/docs/api-reference/threads) that was run.
String runId = null; // String | The ID of the run to retrieve.
try {
    RunObject result = apiInstance.getRun(threadId, runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#getRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
 **runId** | **String**| The ID of the run to retrieve. | [default to null]

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRunStep

> RunStepObject getRunStep(threadId, runId, stepId, include)

Retrieves a run step.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to which the run and run step belongs.
String runId = null; // String | The ID of the run to which the run step belongs.
String stepId = null; // String | The ID of the run step to retrieve.
List<String> include = null; // List<String> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
try {
    RunStepObject result = apiInstance.getRunStep(threadId, runId, stepId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#getRunStep");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which the run and run step belongs. | [default to null]
 **runId** | **String**| The ID of the run to which the run step belongs. | [default to null]
 **stepId** | **String**| The ID of the run step to retrieve. | [default to null]
 **include** | [**List&lt;String&gt;**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null] [enum: step_details.tool_calls[*].file_search.results[*].content]

### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getThread

> ThreadObject getThread(threadId)

Retrieves a thread.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to retrieve.
try {
    ThreadObject result = apiInstance.getThread(threadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#getThread");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to retrieve. | [default to null]

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listAssistants

> ListAssistantsResponse listAssistants(limit, order, after, before)

Returns a list of assistants.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    ListAssistantsResponse result = apiInstance.listAssistants(limit, order, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#listAssistants");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listMessages

> ListMessagesResponse listMessages(threadId, limit, order, after, before, runId)

Returns a list of messages for a given thread.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
String runId = null; // String | Filter messages by the run ID that generated them. 
try {
    ListMessagesResponse result = apiInstance.listMessages(threadId, limit, order, after, before, runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#listMessages");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **runId** | **String**| Filter messages by the run ID that generated them.  | [optional] [default to null]

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listRunSteps

> ListRunStepsResponse listRunSteps(threadId, runId, limit, order, after, before, include)

Returns a list of run steps belonging to a run.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread the run and run steps belong to.
String runId = null; // String | The ID of the run the run steps belong to.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
List<String> include = null; // List<String> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
try {
    ListRunStepsResponse result = apiInstance.listRunSteps(threadId, runId, limit, order, after, before, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#listRunSteps");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread the run and run steps belong to. | [default to null]
 **runId** | **String**| The ID of the run the run steps belong to. | [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **include** | [**List&lt;String&gt;**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null] [enum: step_details.tool_calls[*].file_search.results[*].content]

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listRuns

> ListRunsResponse listRuns(threadId, limit, order, after, before)

Returns a list of runs belonging to a thread.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread the run belongs to.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    ListRunsResponse result = apiInstance.listRuns(threadId, limit, order, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#listRuns");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread the run belongs to. | [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## modifyAssistant

> AssistantObject modifyAssistant(assistantId, modifyAssistantRequest)

Modifies an assistant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String assistantId = null; // String | The ID of the assistant to modify.
ModifyAssistantRequest modifyAssistantRequest = new ModifyAssistantRequest(); // ModifyAssistantRequest | 
try {
    AssistantObject result = apiInstance.modifyAssistant(assistantId, modifyAssistantRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#modifyAssistant");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant to modify. | [default to null]
 **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md)|  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## modifyMessage

> MessageObject modifyMessage(threadId, messageId, modifyMessageRequest)

Modifies a message.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to which this message belongs.
String messageId = null; // String | The ID of the message to modify.
ModifyMessageRequest modifyMessageRequest = new ModifyMessageRequest(); // ModifyMessageRequest | 
try {
    MessageObject result = apiInstance.modifyMessage(threadId, messageId, modifyMessageRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#modifyMessage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which this message belongs. | [default to null]
 **messageId** | **String**| The ID of the message to modify. | [default to null]
 **modifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md)|  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## modifyRun

> RunObject modifyRun(threadId, runId, modifyRunRequest)

Modifies a run.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the [thread](/docs/api-reference/threads) that was run.
String runId = null; // String | The ID of the run to modify.
ModifyRunRequest modifyRunRequest = new ModifyRunRequest(); // ModifyRunRequest | 
try {
    RunObject result = apiInstance.modifyRun(threadId, runId, modifyRunRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#modifyRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
 **runId** | **String**| The ID of the run to modify. | [default to null]
 **modifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md)|  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## modifyThread

> ThreadObject modifyThread(threadId, modifyThreadRequest)

Modifies a thread.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to modify. Only the `metadata` can be modified.
ModifyThreadRequest modifyThreadRequest = new ModifyThreadRequest(); // ModifyThreadRequest | 
try {
    ThreadObject result = apiInstance.modifyThread(threadId, modifyThreadRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#modifyThread");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | [default to null]
 **modifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md)|  |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## submitToolOuputsToRun

> RunObject submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)

When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
String runId = null; // String | The ID of the run that requires the tool output submission.
SubmitToolOutputsRunRequest submitToolOutputsRunRequest = new SubmitToolOutputsRunRequest(); // SubmitToolOutputsRunRequest | 
try {
    RunObject result = apiInstance.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#submitToolOuputsToRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | [default to null]
 **runId** | **String**| The ID of the run that requires the tool output submission. | [default to null]
 **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md)|  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

