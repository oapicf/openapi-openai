# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRun**](AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;. |
| [**createAssistant**](AssistantsApi.md#createassistantoperation) | **POST** /assistants | Create an assistant with a model and instructions. |
| [**createMessage**](AssistantsApi.md#createmessageoperation) | **POST** /threads/{thread_id}/messages | Create a message. |
| [**createRun**](AssistantsApi.md#createrunoperation) | **POST** /threads/{thread_id}/runs | Create a run. |
| [**createThread**](AssistantsApi.md#createthreadoperation) | **POST** /threads | Create a thread. |
| [**createThreadAndRun**](AssistantsApi.md#createthreadandrunoperation) | **POST** /threads/runs | Create a thread and run it in one request. |
| [**deleteAssistant**](AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant. |
| [**deleteMessage**](AssistantsApi.md#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message. |
| [**deleteThread**](AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread. |
| [**getAssistant**](AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant. |
| [**getMessage**](AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message. |
| [**getRun**](AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run. |
| [**getRunStep**](AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step. |
| [**getThread**](AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread. |
| [**listAssistants**](AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants. |
| [**listMessages**](AssistantsApi.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread. |
| [**listRunSteps**](AssistantsApi.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run. |
| [**listRuns**](AssistantsApi.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread. |
| [**modifyAssistant**](AssistantsApi.md#modifyassistantoperation) | **POST** /assistants/{assistant_id} | Modifies an assistant. |
| [**modifyMessage**](AssistantsApi.md#modifymessageoperation) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message. |
| [**modifyRun**](AssistantsApi.md#modifyrunoperation) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run. |
| [**modifyThread**](AssistantsApi.md#modifythreadoperation) | **POST** /threads/{thread_id} | Modifies a thread. |
| [**submitToolOuputsToRun**](AssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they\&#39;re all completed. All outputs must be submitted in a single request.  |



## cancelRun

> RunObject cancelRun(threadId, runId)

Cancels a run that is &#x60;in_progress&#x60;.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { CancelRunRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to which this run belongs.
    threadId: threadId_example,
    // string | The ID of the run to cancel.
    runId: runId_example,
  } satisfies CancelRunRequest;

  try {
    const data = await api.cancelRun(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to which this run belongs. | [Defaults to `undefined`] |
| **runId** | `string` | The ID of the run to cancel. | [Defaults to `undefined`] |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createAssistant

> AssistantObject createAssistant(createAssistantRequest)

Create an assistant with a model and instructions.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { CreateAssistantOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // CreateAssistantRequest
    createAssistantRequest: ...,
  } satisfies CreateAssistantOperationRequest;

  try {
    const data = await api.createAssistant(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAssistantRequest** | [CreateAssistantRequest](CreateAssistantRequest.md) |  | |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createMessage

> MessageObject createMessage(threadId, createMessageRequest)

Create a message.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { CreateMessageOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the [thread](/docs/api-reference/threads) to create a message for.
    threadId: threadId_example,
    // CreateMessageRequest
    createMessageRequest: ...,
  } satisfies CreateMessageOperationRequest;

  try {
    const data = await api.createMessage(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the [thread](/docs/api-reference/threads) to create a message for. | [Defaults to `undefined`] |
| **createMessageRequest** | [CreateMessageRequest](CreateMessageRequest.md) |  | |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createRun

> RunObject createRun(threadId, createRunRequest, include)

Create a run.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { CreateRunOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to run.
    threadId: threadId_example,
    // CreateRunRequest
    createRunRequest: ...,
    // Array<'step_details.tool_calls[*].file_search.results[*].content'> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
    include: ...,
  } satisfies CreateRunOperationRequest;

  try {
    const data = await api.createRun(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to run. | [Defaults to `undefined`] |
| **createRunRequest** | [CreateRunRequest](CreateRunRequest.md) |  | |
| **include** | `step_details.tool_calls[*].file_search.results[*].content` | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [Optional] [Enum: step_details.tool_calls[*].file_search.results[*].content] |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createThread

> ThreadObject createThread(createThreadRequest)

Create a thread.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { CreateThreadOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // CreateThreadRequest (optional)
    createThreadRequest: ...,
  } satisfies CreateThreadOperationRequest;

  try {
    const data = await api.createThread(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createThreadRequest** | [CreateThreadRequest](CreateThreadRequest.md) |  | [Optional] |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createThreadAndRun

> RunObject createThreadAndRun(createThreadAndRunRequest)

Create a thread and run it in one request.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { CreateThreadAndRunOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // CreateThreadAndRunRequest
    createThreadAndRunRequest: ...,
  } satisfies CreateThreadAndRunOperationRequest;

  try {
    const data = await api.createThreadAndRun(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createThreadAndRunRequest** | [CreateThreadAndRunRequest](CreateThreadAndRunRequest.md) |  | |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteAssistant

> DeleteAssistantResponse deleteAssistant(assistantId)

Delete an assistant.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { DeleteAssistantRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the assistant to delete.
    assistantId: assistantId_example,
  } satisfies DeleteAssistantRequest;

  try {
    const data = await api.deleteAssistant(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistantId** | `string` | The ID of the assistant to delete. | [Defaults to `undefined`] |

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteMessage

> DeleteMessageResponse deleteMessage(threadId, messageId)

Deletes a message.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { DeleteMessageRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to which this message belongs.
    threadId: threadId_example,
    // string | The ID of the message to delete.
    messageId: messageId_example,
  } satisfies DeleteMessageRequest;

  try {
    const data = await api.deleteMessage(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to which this message belongs. | [Defaults to `undefined`] |
| **messageId** | `string` | The ID of the message to delete. | [Defaults to `undefined`] |

### Return type

[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteThread

> DeleteThreadResponse deleteThread(threadId)

Delete a thread.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { DeleteThreadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to delete.
    threadId: threadId_example,
  } satisfies DeleteThreadRequest;

  try {
    const data = await api.deleteThread(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to delete. | [Defaults to `undefined`] |

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getAssistant

> AssistantObject getAssistant(assistantId)

Retrieves an assistant.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { GetAssistantRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the assistant to retrieve.
    assistantId: assistantId_example,
  } satisfies GetAssistantRequest;

  try {
    const data = await api.getAssistant(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistantId** | `string` | The ID of the assistant to retrieve. | [Defaults to `undefined`] |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getMessage

> MessageObject getMessage(threadId, messageId)

Retrieve a message.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { GetMessageRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
    threadId: threadId_example,
    // string | The ID of the message to retrieve.
    messageId: messageId_example,
  } satisfies GetMessageRequest;

  try {
    const data = await api.getMessage(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | [Defaults to `undefined`] |
| **messageId** | `string` | The ID of the message to retrieve. | [Defaults to `undefined`] |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getRun

> RunObject getRun(threadId, runId)

Retrieves a run.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { GetRunRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the [thread](/docs/api-reference/threads) that was run.
    threadId: threadId_example,
    // string | The ID of the run to retrieve.
    runId: runId_example,
  } satisfies GetRunRequest;

  try {
    const data = await api.getRun(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the [thread](/docs/api-reference/threads) that was run. | [Defaults to `undefined`] |
| **runId** | `string` | The ID of the run to retrieve. | [Defaults to `undefined`] |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getRunStep

> RunStepObject getRunStep(threadId, runId, stepId, include)

Retrieves a run step.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { GetRunStepRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to which the run and run step belongs.
    threadId: threadId_example,
    // string | The ID of the run to which the run step belongs.
    runId: runId_example,
    // string | The ID of the run step to retrieve.
    stepId: stepId_example,
    // Array<'step_details.tool_calls[*].file_search.results[*].content'> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
    include: ...,
  } satisfies GetRunStepRequest;

  try {
    const data = await api.getRunStep(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to which the run and run step belongs. | [Defaults to `undefined`] |
| **runId** | `string` | The ID of the run to which the run step belongs. | [Defaults to `undefined`] |
| **stepId** | `string` | The ID of the run step to retrieve. | [Defaults to `undefined`] |
| **include** | `step_details.tool_calls[*].file_search.results[*].content` | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [Optional] [Enum: step_details.tool_calls[*].file_search.results[*].content] |

### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getThread

> ThreadObject getThread(threadId)

Retrieves a thread.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { GetThreadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to retrieve.
    threadId: threadId_example,
  } satisfies GetThreadRequest;

  try {
    const data = await api.getThread(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to retrieve. | [Defaults to `undefined`] |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listAssistants

> ListAssistantsResponse listAssistants(limit, order, after, before)

Returns a list of assistants.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ListAssistantsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // 'asc' | 'desc' | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
    order: order_example,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
  } satisfies ListAssistantsRequest;

  try {
    const data = await api.listAssistants(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **order** | `asc`, `desc` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [Optional] [Defaults to `&#39;desc&#39;`] [Enum: asc, desc] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listMessages

> ListMessagesResponse listMessages(threadId, limit, order, after, before, runId)

Returns a list of messages for a given thread.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ListMessagesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
    threadId: threadId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // 'asc' | 'desc' | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
    order: order_example,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
    // string | Filter messages by the run ID that generated them.  (optional)
    runId: runId_example,
  } satisfies ListMessagesRequest;

  try {
    const data = await api.listMessages(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **order** | `asc`, `desc` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [Optional] [Defaults to `&#39;desc&#39;`] [Enum: asc, desc] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |
| **runId** | `string` | Filter messages by the run ID that generated them.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listRunSteps

> ListRunStepsResponse listRunSteps(threadId, runId, limit, order, after, before, include)

Returns a list of run steps belonging to a run.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ListRunStepsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread the run and run steps belong to.
    threadId: threadId_example,
    // string | The ID of the run the run steps belong to.
    runId: runId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // 'asc' | 'desc' | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
    order: order_example,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
    // Array<'step_details.tool_calls[*].file_search.results[*].content'> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
    include: ...,
  } satisfies ListRunStepsRequest;

  try {
    const data = await api.listRunSteps(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread the run and run steps belong to. | [Defaults to `undefined`] |
| **runId** | `string` | The ID of the run the run steps belong to. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **order** | `asc`, `desc` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [Optional] [Defaults to `&#39;desc&#39;`] [Enum: asc, desc] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |
| **include** | `step_details.tool_calls[*].file_search.results[*].content` | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [Optional] [Enum: step_details.tool_calls[*].file_search.results[*].content] |

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listRuns

> ListRunsResponse listRuns(threadId, limit, order, after, before)

Returns a list of runs belonging to a thread.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ListRunsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread the run belongs to.
    threadId: threadId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // 'asc' | 'desc' | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
    order: order_example,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
  } satisfies ListRunsRequest;

  try {
    const data = await api.listRuns(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread the run belongs to. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **order** | `asc`, `desc` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [Optional] [Defaults to `&#39;desc&#39;`] [Enum: asc, desc] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyAssistant

> AssistantObject modifyAssistant(assistantId, modifyAssistantRequest)

Modifies an assistant.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ModifyAssistantOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the assistant to modify.
    assistantId: assistantId_example,
    // ModifyAssistantRequest
    modifyAssistantRequest: ...,
  } satisfies ModifyAssistantOperationRequest;

  try {
    const data = await api.modifyAssistant(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assistantId** | `string` | The ID of the assistant to modify. | [Defaults to `undefined`] |
| **modifyAssistantRequest** | [ModifyAssistantRequest](ModifyAssistantRequest.md) |  | |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyMessage

> MessageObject modifyMessage(threadId, messageId, modifyMessageRequest)

Modifies a message.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ModifyMessageOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to which this message belongs.
    threadId: threadId_example,
    // string | The ID of the message to modify.
    messageId: messageId_example,
    // ModifyMessageRequest
    modifyMessageRequest: ...,
  } satisfies ModifyMessageOperationRequest;

  try {
    const data = await api.modifyMessage(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to which this message belongs. | [Defaults to `undefined`] |
| **messageId** | `string` | The ID of the message to modify. | [Defaults to `undefined`] |
| **modifyMessageRequest** | [ModifyMessageRequest](ModifyMessageRequest.md) |  | |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyRun

> RunObject modifyRun(threadId, runId, modifyRunRequest)

Modifies a run.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ModifyRunOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the [thread](/docs/api-reference/threads) that was run.
    threadId: threadId_example,
    // string | The ID of the run to modify.
    runId: runId_example,
    // ModifyRunRequest
    modifyRunRequest: ...,
  } satisfies ModifyRunOperationRequest;

  try {
    const data = await api.modifyRun(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the [thread](/docs/api-reference/threads) that was run. | [Defaults to `undefined`] |
| **runId** | `string` | The ID of the run to modify. | [Defaults to `undefined`] |
| **modifyRunRequest** | [ModifyRunRequest](ModifyRunRequest.md) |  | |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyThread

> ThreadObject modifyThread(threadId, modifyThreadRequest)

Modifies a thread.

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { ModifyThreadOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the thread to modify. Only the `metadata` can be modified.
    threadId: threadId_example,
    // ModifyThreadRequest
    modifyThreadRequest: ...,
  } satisfies ModifyThreadOperationRequest;

  try {
    const data = await api.modifyThread(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | [Defaults to `undefined`] |
| **modifyThreadRequest** | [ModifyThreadRequest](ModifyThreadRequest.md) |  | |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## submitToolOuputsToRun

> RunObject submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)

When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they\&#39;re all completed. All outputs must be submitted in a single request. 

### Example

```ts
import {
  Configuration,
  AssistantsApi,
} from '';
import type { SubmitToolOuputsToRunRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AssistantsApi(config);

  const body = {
    // string | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
    threadId: threadId_example,
    // string | The ID of the run that requires the tool output submission.
    runId: runId_example,
    // SubmitToolOutputsRunRequest
    submitToolOutputsRunRequest: ...,
  } satisfies SubmitToolOuputsToRunRequest;

  try {
    const data = await api.submitToolOuputsToRun(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | `string` | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | [Defaults to `undefined`] |
| **runId** | `string` | The ID of the run that requires the tool output submission. | [Defaults to `undefined`] |
| **submitToolOutputsRunRequest** | [SubmitToolOutputsRunRequest](SubmitToolOutputsRunRequest.md) |  | |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

