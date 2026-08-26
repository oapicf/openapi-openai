# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](AssistantsApi.md#cancelRun) | **Post** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**createAssistant**](AssistantsApi.md#createAssistant) | **Post** /assistants | Create an assistant with a model and instructions.
[**createMessage**](AssistantsApi.md#createMessage) | **Post** /threads/{thread_id}/messages | Create a message.
[**createRun**](AssistantsApi.md#createRun) | **Post** /threads/{thread_id}/runs | Create a run.
[**createThread**](AssistantsApi.md#createThread) | **Post** /threads | Create a thread.
[**createThreadAndRun**](AssistantsApi.md#createThreadAndRun) | **Post** /threads/runs | Create a thread and run it in one request.
[**deleteAssistant**](AssistantsApi.md#deleteAssistant) | **Delete** /assistants/{assistant_id} | Delete an assistant.
[**deleteMessage**](AssistantsApi.md#deleteMessage) | **Delete** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**deleteThread**](AssistantsApi.md#deleteThread) | **Delete** /threads/{thread_id} | Delete a thread.
[**getAssistant**](AssistantsApi.md#getAssistant) | **Get** /assistants/{assistant_id} | Retrieves an assistant.
[**getMessage**](AssistantsApi.md#getMessage) | **Get** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**getRun**](AssistantsApi.md#getRun) | **Get** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**getRunStep**](AssistantsApi.md#getRunStep) | **Get** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**getThread**](AssistantsApi.md#getThread) | **Get** /threads/{thread_id} | Retrieves a thread.
[**listAssistants**](AssistantsApi.md#listAssistants) | **Get** /assistants | Returns a list of assistants.
[**listMessages**](AssistantsApi.md#listMessages) | **Get** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**listRunSteps**](AssistantsApi.md#listRunSteps) | **Get** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**listRuns**](AssistantsApi.md#listRuns) | **Get** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**modifyAssistant**](AssistantsApi.md#modifyAssistant) | **Post** /assistants/{assistant_id} | Modifies an assistant.
[**modifyMessage**](AssistantsApi.md#modifyMessage) | **Post** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modifyRun**](AssistantsApi.md#modifyRun) | **Post** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modifyThread**](AssistantsApi.md#modifyThread) | **Post** /threads/{thread_id} | Modifies a thread.
[**submitToolOuputsToRun**](AssistantsApi.md#submitToolOuputsToRun) | **Post** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


<a name="cancelRun"></a>
# **cancelRun**
> RunObject cancelRun(threadId, runId)

Cancels a run that is &#x60;in_progress&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to which this run belongs.
val runId : kotlin.String = runId_example // kotlin.String | The ID of the run to cancel.
try {
    val result : RunObject = apiInstance.cancelRun(threadId, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#cancelRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#cancelRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to which this run belongs. |
 **runId** | **kotlin.String**| The ID of the run to cancel. |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="createAssistant"></a>
# **createAssistant**
> AssistantObject createAssistant(createAssistantRequest)

Create an assistant with a model and instructions.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val createAssistantRequest : CreateAssistantRequest =  // CreateAssistantRequest | 
try {
    val result : AssistantObject = apiInstance.createAssistant(createAssistantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#createAssistant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#createAssistant")
    e.printStackTrace()
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

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="createMessage"></a>
# **createMessage**
> MessageObject createMessage(threadId, createMessageRequest)

Create a message.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the [thread](/docs/api-reference/threads) to create a message for.
val createMessageRequest : CreateMessageRequest =  // CreateMessageRequest | 
try {
    val result : MessageObject = apiInstance.createMessage(threadId, createMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#createMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#createMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the [thread](/docs/api-reference/threads) to create a message for. |
 **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="createRun"></a>
# **createRun**
> RunObject createRun(threadId, createRunRequest, include)

Create a run.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to run.
val createRunRequest : CreateRunRequest =  // CreateRunRequest | 
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
try {
    val result : RunObject = apiInstance.createRun(threadId, createRunRequest, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#createRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#createRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to run. |
 **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md)|  |
 **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [enum: step_details.tool_calls[*].file_search.results[*].content]

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="createThread"></a>
# **createThread**
> ThreadObject createThread(createThreadRequest)

Create a thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val createThreadRequest : CreateThreadRequest =  // CreateThreadRequest | 
try {
    val result : ThreadObject = apiInstance.createThread(createThreadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#createThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#createThread")
    e.printStackTrace()
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

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="createThreadAndRun"></a>
# **createThreadAndRun**
> RunObject createThreadAndRun(createThreadAndRunRequest)

Create a thread and run it in one request.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val createThreadAndRunRequest : CreateThreadAndRunRequest =  // CreateThreadAndRunRequest | 
try {
    val result : RunObject = apiInstance.createThreadAndRun(createThreadAndRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#createThreadAndRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#createThreadAndRun")
    e.printStackTrace()
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

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="deleteAssistant"></a>
# **deleteAssistant**
> DeleteAssistantResponse deleteAssistant(assistantId)

Delete an assistant.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val assistantId : kotlin.String = assistantId_example // kotlin.String | The ID of the assistant to delete.
try {
    val result : DeleteAssistantResponse = apiInstance.deleteAssistant(assistantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#deleteAssistant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#deleteAssistant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **kotlin.String**| The ID of the assistant to delete. |

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="deleteMessage"></a>
# **deleteMessage**
> DeleteMessageResponse deleteMessage(threadId, messageId)

Deletes a message.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to which this message belongs.
val messageId : kotlin.String = messageId_example // kotlin.String | The ID of the message to delete.
try {
    val result : DeleteMessageResponse = apiInstance.deleteMessage(threadId, messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#deleteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#deleteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to which this message belongs. |
 **messageId** | **kotlin.String**| The ID of the message to delete. |

### Return type

[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="deleteThread"></a>
# **deleteThread**
> DeleteThreadResponse deleteThread(threadId)

Delete a thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to delete.
try {
    val result : DeleteThreadResponse = apiInstance.deleteThread(threadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#deleteThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#deleteThread")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to delete. |

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getAssistant"></a>
# **getAssistant**
> AssistantObject getAssistant(assistantId)

Retrieves an assistant.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val assistantId : kotlin.String = assistantId_example // kotlin.String | The ID of the assistant to retrieve.
try {
    val result : AssistantObject = apiInstance.getAssistant(assistantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#getAssistant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#getAssistant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **kotlin.String**| The ID of the assistant to retrieve. |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getMessage"></a>
# **getMessage**
> MessageObject getMessage(threadId, messageId)

Retrieve a message.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
val messageId : kotlin.String = messageId_example // kotlin.String | The ID of the message to retrieve.
try {
    val result : MessageObject = apiInstance.getMessage(threadId, messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#getMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#getMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. |
 **messageId** | **kotlin.String**| The ID of the message to retrieve. |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getRun"></a>
# **getRun**
> RunObject getRun(threadId, runId)

Retrieves a run.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the [thread](/docs/api-reference/threads) that was run.
val runId : kotlin.String = runId_example // kotlin.String | The ID of the run to retrieve.
try {
    val result : RunObject = apiInstance.getRun(threadId, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#getRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#getRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the [thread](/docs/api-reference/threads) that was run. |
 **runId** | **kotlin.String**| The ID of the run to retrieve. |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getRunStep"></a>
# **getRunStep**
> RunStepObject getRunStep(threadId, runId, stepId, include)

Retrieves a run step.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to which the run and run step belongs.
val runId : kotlin.String = runId_example // kotlin.String | The ID of the run to which the run step belongs.
val stepId : kotlin.String = stepId_example // kotlin.String | The ID of the run step to retrieve.
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
try {
    val result : RunStepObject = apiInstance.getRunStep(threadId, runId, stepId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#getRunStep")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#getRunStep")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to which the run and run step belongs. |
 **runId** | **kotlin.String**| The ID of the run to which the run step belongs. |
 **stepId** | **kotlin.String**| The ID of the run step to retrieve. |
 **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [enum: step_details.tool_calls[*].file_search.results[*].content]

### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getThread"></a>
# **getThread**
> ThreadObject getThread(threadId)

Retrieves a thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to retrieve.
try {
    val result : ThreadObject = apiInstance.getThread(threadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#getThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#getThread")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to retrieve. |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="listAssistants"></a>
# **listAssistants**
> ListAssistantsResponse listAssistants(limit, order, after, before)

Returns a list of assistants.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    val result : ListAssistantsResponse = apiInstance.listAssistants(limit, order, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#listAssistants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#listAssistants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="listMessages"></a>
# **listMessages**
> ListMessagesResponse listMessages(threadId, limit, order, after, before, runId)

Returns a list of messages for a given thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
val runId : kotlin.String = runId_example // kotlin.String | Filter messages by the run ID that generated them. 
try {
    val result : ListMessagesResponse = apiInstance.listMessages(threadId, limit, order, after, before, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#listMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#listMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. |
 **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]
 **runId** | **kotlin.String**| Filter messages by the run ID that generated them.  | [optional]

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="listRunSteps"></a>
# **listRunSteps**
> ListRunStepsResponse listRunSteps(threadId, runId, limit, order, after, before, include)

Returns a list of run steps belonging to a run.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread the run and run steps belong to.
val runId : kotlin.String = runId_example // kotlin.String | The ID of the run the run steps belong to.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
try {
    val result : ListRunStepsResponse = apiInstance.listRunSteps(threadId, runId, limit, order, after, before, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#listRunSteps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#listRunSteps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread the run and run steps belong to. |
 **runId** | **kotlin.String**| The ID of the run the run steps belong to. |
 **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]
 **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [enum: step_details.tool_calls[*].file_search.results[*].content]

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="listRuns"></a>
# **listRuns**
> ListRunsResponse listRuns(threadId, limit, order, after, before)

Returns a list of runs belonging to a thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread the run belongs to.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    val result : ListRunsResponse = apiInstance.listRuns(threadId, limit, order, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#listRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#listRuns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread the run belongs to. |
 **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="modifyAssistant"></a>
# **modifyAssistant**
> AssistantObject modifyAssistant(assistantId, modifyAssistantRequest)

Modifies an assistant.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val assistantId : kotlin.String = assistantId_example // kotlin.String | The ID of the assistant to modify.
val modifyAssistantRequest : ModifyAssistantRequest =  // ModifyAssistantRequest | 
try {
    val result : AssistantObject = apiInstance.modifyAssistant(assistantId, modifyAssistantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#modifyAssistant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#modifyAssistant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **kotlin.String**| The ID of the assistant to modify. |
 **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md)|  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="modifyMessage"></a>
# **modifyMessage**
> MessageObject modifyMessage(threadId, messageId, modifyMessageRequest)

Modifies a message.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to which this message belongs.
val messageId : kotlin.String = messageId_example // kotlin.String | The ID of the message to modify.
val modifyMessageRequest : ModifyMessageRequest =  // ModifyMessageRequest | 
try {
    val result : MessageObject = apiInstance.modifyMessage(threadId, messageId, modifyMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#modifyMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#modifyMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to which this message belongs. |
 **messageId** | **kotlin.String**| The ID of the message to modify. |
 **modifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md)|  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="modifyRun"></a>
# **modifyRun**
> RunObject modifyRun(threadId, runId, modifyRunRequest)

Modifies a run.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the [thread](/docs/api-reference/threads) that was run.
val runId : kotlin.String = runId_example // kotlin.String | The ID of the run to modify.
val modifyRunRequest : ModifyRunRequest =  // ModifyRunRequest | 
try {
    val result : RunObject = apiInstance.modifyRun(threadId, runId, modifyRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#modifyRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#modifyRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the [thread](/docs/api-reference/threads) that was run. |
 **runId** | **kotlin.String**| The ID of the run to modify. |
 **modifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md)|  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="modifyThread"></a>
# **modifyThread**
> ThreadObject modifyThread(threadId, modifyThreadRequest)

Modifies a thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the thread to modify. Only the `metadata` can be modified.
val modifyThreadRequest : ModifyThreadRequest =  // ModifyThreadRequest | 
try {
    val result : ThreadObject = apiInstance.modifyThread(threadId, modifyThreadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#modifyThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#modifyThread")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. |
 **modifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md)|  |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="submitToolOuputsToRun"></a>
# **submitToolOuputsToRun**
> RunObject submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)

When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AssistantsApi()
val threadId : kotlin.String = threadId_example // kotlin.String | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
val runId : kotlin.String = runId_example // kotlin.String | The ID of the run that requires the tool output submission.
val submitToolOutputsRunRequest : SubmitToolOutputsRunRequest =  // SubmitToolOutputsRunRequest | 
try {
    val result : RunObject = apiInstance.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssistantsApi#submitToolOuputsToRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssistantsApi#submitToolOuputsToRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.String**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. |
 **runId** | **kotlin.String**| The ID of the run that requires the tool output submission. |
 **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md)|  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

