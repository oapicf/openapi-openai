# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](AssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**createAssistant**](AssistantsApi.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**createAssistantFile**](AssistantsApi.md#createAssistantFile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
[**createMessage**](AssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**createRun**](AssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
[**createThread**](AssistantsApi.md#createThread) | **POST** /threads | Create a thread.
[**createThreadAndRun**](AssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**deleteAssistant**](AssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**deleteAssistantFile**](AssistantsApi.md#deleteAssistantFile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
[**deleteThread**](AssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**getAssistant**](AssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**getAssistantFile**](AssistantsApi.md#getAssistantFile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
[**getMessage**](AssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**getMessageFile**](AssistantsApi.md#getMessageFile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
[**getRun**](AssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**getRunStep**](AssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**getThread**](AssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**listAssistantFiles**](AssistantsApi.md#listAssistantFiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files.
[**listAssistants**](AssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants.
[**listMessageFiles**](AssistantsApi.md#listMessageFiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
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


## createAssistantFile

> AssistantFileObject createAssistantFile(assistantId, createAssistantFileRequest)

Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String assistantId = file-abc123; // String | The ID of the assistant for which to create a File. 
CreateAssistantFileRequest createAssistantFileRequest = new CreateAssistantFileRequest(); // CreateAssistantFileRequest | 
try {
    AssistantFileObject result = apiInstance.createAssistantFile(assistantId, createAssistantFileRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#createAssistantFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant for which to create a File.  | [default to null]
 **createAssistantFileRequest** | [**CreateAssistantFileRequest**](CreateAssistantFileRequest.md)|  |

### Return type

[**AssistantFileObject**](AssistantFileObject.md)

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

> RunObject createRun(threadId, createRunRequest)

Create a run.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to run.
CreateRunRequest createRunRequest = new CreateRunRequest(); // CreateRunRequest | 
try {
    RunObject result = apiInstance.createRun(threadId, createRunRequest);
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


## deleteAssistantFile

> DeleteAssistantFileResponse deleteAssistantFile(assistantId, fileId)

Delete an assistant file.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String assistantId = null; // String | The ID of the assistant that the file belongs to.
String fileId = null; // String | The ID of the file to delete.
try {
    DeleteAssistantFileResponse result = apiInstance.deleteAssistantFile(assistantId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#deleteAssistantFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant that the file belongs to. | [default to null]
 **fileId** | **String**| The ID of the file to delete. | [default to null]

### Return type

[**DeleteAssistantFileResponse**](DeleteAssistantFileResponse.md)

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


## getAssistantFile

> AssistantFileObject getAssistantFile(assistantId, fileId)

Retrieves an AssistantFile.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String assistantId = null; // String | The ID of the assistant who the file belongs to.
String fileId = null; // String | The ID of the file we're getting.
try {
    AssistantFileObject result = apiInstance.getAssistantFile(assistantId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#getAssistantFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant who the file belongs to. | [default to null]
 **fileId** | **String**| The ID of the file we&#39;re getting. | [default to null]

### Return type

[**AssistantFileObject**](AssistantFileObject.md)

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


## getMessageFile

> MessageFileObject getMessageFile(threadId, messageId, fileId)

Retrieves a message file.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = thread_abc123; // String | The ID of the thread to which the message and File belong.
String messageId = msg_abc123; // String | The ID of the message the file belongs to.
String fileId = file-abc123; // String | The ID of the file being retrieved.
try {
    MessageFileObject result = apiInstance.getMessageFile(threadId, messageId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#getMessageFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which the message and File belong. | [default to null]
 **messageId** | **String**| The ID of the message the file belongs to. | [default to null]
 **fileId** | **String**| The ID of the file being retrieved. | [default to null]

### Return type

[**MessageFileObject**](MessageFileObject.md)

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

> RunStepObject getRunStep(threadId, runId, stepId)

Retrieves a run step.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread to which the run and run step belongs.
String runId = null; // String | The ID of the run to which the run step belongs.
String stepId = null; // String | The ID of the run step to retrieve.
try {
    RunStepObject result = apiInstance.getRunStep(threadId, runId, stepId);
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


## listAssistantFiles

> ListAssistantFilesResponse listAssistantFiles(assistantId, limit, order, after, before)

Returns a list of assistant files.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String assistantId = null; // String | The ID of the assistant the file belongs to.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    ListAssistantFilesResponse result = apiInstance.listAssistantFiles(assistantId, limit, order, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#listAssistantFiles");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant the file belongs to. | [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**ListAssistantFilesResponse**](ListAssistantFilesResponse.md)

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
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
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
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listMessageFiles

> ListMessageFilesResponse listMessageFiles(threadId, messageId, limit, order, after, before)

Returns a list of message files.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AssistantsApi;

AssistantsApi apiInstance = new AssistantsApi();
String threadId = null; // String | The ID of the thread that the message and files belong to.
String messageId = null; // String | The ID of the message that the files belongs to.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    ListMessageFilesResponse result = apiInstance.listMessageFiles(threadId, messageId, limit, order, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantsApi#listMessageFiles");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread that the message and files belong to. | [default to null]
 **messageId** | **String**| The ID of the message that the files belongs to. | [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**ListMessageFilesResponse**](ListMessageFilesResponse.md)

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
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
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
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **runId** | **String**| Filter messages by the run ID that generated them.  | [optional] [default to null]

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listRunSteps

> ListRunStepsResponse listRunSteps(threadId, runId, limit, order, after, before)

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
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    ListRunStepsResponse result = apiInstance.listRunSteps(threadId, runId, limit, order, after, before);
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
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

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
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
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
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

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

