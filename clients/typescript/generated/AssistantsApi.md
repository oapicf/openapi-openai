# .AssistantsApi

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
[**submitToolOuputsToRun**](AssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they\&#39;re all completed. All outputs must be submitted in a single request. 


# **cancelRun**
> RunObject cancelRun()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiCancelRunRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiCancelRunRequest = {
    // The ID of the thread to which this run belongs.
  threadId: "thread_id_example",
    // The ID of the run to cancel.
  runId: "run_id_example",
};

const data = await apiInstance.cancelRun(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread to which this run belongs. | defaults to undefined
 **runId** | [**string**] | The ID of the run to cancel. | defaults to undefined


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createAssistant**
> AssistantObject createAssistant(createAssistantRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiCreateAssistantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiCreateAssistantRequest = {
  
  createAssistantRequest: {
    model: null,
    name: "name_example",
    description: "description_example",
    instructions: "instructions_example",
    tools: [
      null,
    ],
    fileIds: [],
    metadata: {},
  },
};

const data = await apiInstance.createAssistant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAssistantRequest** | **CreateAssistantRequest**|  |


### Return type

**AssistantObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createAssistantFile**
> AssistantFileObject createAssistantFile(createAssistantFileRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiCreateAssistantFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiCreateAssistantFileRequest = {
    // The ID of the assistant for which to create a File. 
  assistantId: "file-abc123",
  
  createAssistantFileRequest: {
    fileId: "fileId_example",
  },
};

const data = await apiInstance.createAssistantFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAssistantFileRequest** | **CreateAssistantFileRequest**|  |
 **assistantId** | [**string**] | The ID of the assistant for which to create a File.  | defaults to undefined


### Return type

**AssistantFileObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createMessage**
> MessageObject createMessage(createMessageRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiCreateMessageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiCreateMessageRequest = {
    // The ID of the [thread](/docs/api-reference/threads) to create a message for.
  threadId: "thread_id_example",
  
  createMessageRequest: {
    role: "user",
    content: "content_example",
    fileIds: [],
    metadata: {},
  },
};

const data = await apiInstance.createMessage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMessageRequest** | **CreateMessageRequest**|  |
 **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) to create a message for. | defaults to undefined


### Return type

**MessageObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createRun**
> RunObject createRun(createRunRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiCreateRunRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiCreateRunRequest = {
    // The ID of the thread to run.
  threadId: "thread_id_example",
  
  createRunRequest: {
    assistantId: "assistantId_example",
    model: null,
    instructions: "instructions_example",
    additionalInstructions: "additionalInstructions_example",
    additionalMessages: [
      {
        role: "user",
        content: "content_example",
        fileIds: [],
        metadata: {},
      },
    ],
    tools: [
      null,
    ],
    metadata: {},
    temperature: 1,
    stream: true,
    maxPromptTokens: 256,
    maxCompletionTokens: 256,
    truncationStrategy: {
      type: "auto",
      lastMessages: 1,
    },
    toolChoice: null,
    responseFormat: null,
  },
};

const data = await apiInstance.createRun(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRunRequest** | **CreateRunRequest**|  |
 **threadId** | [**string**] | The ID of the thread to run. | defaults to undefined


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createThread**
> ThreadObject createThread()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiCreateThreadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiCreateThreadRequest = {
  
  createThreadRequest: {
    messages: [
      {
        role: "user",
        content: "content_example",
        fileIds: [],
        metadata: {},
      },
    ],
    metadata: {},
  },
};

const data = await apiInstance.createThread(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadRequest** | **CreateThreadRequest**|  |


### Return type

**ThreadObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createThreadAndRun**
> RunObject createThreadAndRun(createThreadAndRunRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiCreateThreadAndRunRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiCreateThreadAndRunRequest = {
  
  createThreadAndRunRequest: {
    assistantId: "assistantId_example",
    thread: {
      messages: [
        {
          role: "user",
          content: "content_example",
          fileIds: [],
          metadata: {},
        },
      ],
      metadata: {},
    },
    model: null,
    instructions: "instructions_example",
    tools: [
      null,
    ],
    metadata: {},
    temperature: 1,
    stream: true,
    maxPromptTokens: 256,
    maxCompletionTokens: 256,
    truncationStrategy: {
      type: "auto",
      lastMessages: 1,
    },
    toolChoice: null,
    responseFormat: null,
  },
};

const data = await apiInstance.createThreadAndRun(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadAndRunRequest** | **CreateThreadAndRunRequest**|  |


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteAssistant**
> DeleteAssistantResponse deleteAssistant()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiDeleteAssistantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiDeleteAssistantRequest = {
    // The ID of the assistant to delete.
  assistantId: "assistant_id_example",
};

const data = await apiInstance.deleteAssistant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | [**string**] | The ID of the assistant to delete. | defaults to undefined


### Return type

**DeleteAssistantResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteAssistantFile**
> DeleteAssistantFileResponse deleteAssistantFile()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiDeleteAssistantFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiDeleteAssistantFileRequest = {
    // The ID of the assistant that the file belongs to.
  assistantId: "assistant_id_example",
    // The ID of the file to delete.
  fileId: "file_id_example",
};

const data = await apiInstance.deleteAssistantFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | [**string**] | The ID of the assistant that the file belongs to. | defaults to undefined
 **fileId** | [**string**] | The ID of the file to delete. | defaults to undefined


### Return type

**DeleteAssistantFileResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteThread**
> DeleteThreadResponse deleteThread()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiDeleteThreadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiDeleteThreadRequest = {
    // The ID of the thread to delete.
  threadId: "thread_id_example",
};

const data = await apiInstance.deleteThread(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread to delete. | defaults to undefined


### Return type

**DeleteThreadResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getAssistant**
> AssistantObject getAssistant()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiGetAssistantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiGetAssistantRequest = {
    // The ID of the assistant to retrieve.
  assistantId: "assistant_id_example",
};

const data = await apiInstance.getAssistant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | [**string**] | The ID of the assistant to retrieve. | defaults to undefined


### Return type

**AssistantObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getAssistantFile**
> AssistantFileObject getAssistantFile()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiGetAssistantFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiGetAssistantFileRequest = {
    // The ID of the assistant who the file belongs to.
  assistantId: "assistant_id_example",
    // The ID of the file we\'re getting.
  fileId: "file_id_example",
};

const data = await apiInstance.getAssistantFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | [**string**] | The ID of the assistant who the file belongs to. | defaults to undefined
 **fileId** | [**string**] | The ID of the file we\&#39;re getting. | defaults to undefined


### Return type

**AssistantFileObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getMessage**
> MessageObject getMessage()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiGetMessageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiGetMessageRequest = {
    // The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
  threadId: "thread_id_example",
    // The ID of the message to retrieve.
  messageId: "message_id_example",
};

const data = await apiInstance.getMessage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | defaults to undefined
 **messageId** | [**string**] | The ID of the message to retrieve. | defaults to undefined


### Return type

**MessageObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getMessageFile**
> MessageFileObject getMessageFile()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiGetMessageFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiGetMessageFileRequest = {
    // The ID of the thread to which the message and File belong.
  threadId: "thread_abc123",
    // The ID of the message the file belongs to.
  messageId: "msg_abc123",
    // The ID of the file being retrieved.
  fileId: "file-abc123",
};

const data = await apiInstance.getMessageFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread to which the message and File belong. | defaults to undefined
 **messageId** | [**string**] | The ID of the message the file belongs to. | defaults to undefined
 **fileId** | [**string**] | The ID of the file being retrieved. | defaults to undefined


### Return type

**MessageFileObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getRun**
> RunObject getRun()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiGetRunRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiGetRunRequest = {
    // The ID of the [thread](/docs/api-reference/threads) that was run.
  threadId: "thread_id_example",
    // The ID of the run to retrieve.
  runId: "run_id_example",
};

const data = await apiInstance.getRun(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) that was run. | defaults to undefined
 **runId** | [**string**] | The ID of the run to retrieve. | defaults to undefined


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getRunStep**
> RunStepObject getRunStep()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiGetRunStepRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiGetRunStepRequest = {
    // The ID of the thread to which the run and run step belongs.
  threadId: "thread_id_example",
    // The ID of the run to which the run step belongs.
  runId: "run_id_example",
    // The ID of the run step to retrieve.
  stepId: "step_id_example",
};

const data = await apiInstance.getRunStep(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread to which the run and run step belongs. | defaults to undefined
 **runId** | [**string**] | The ID of the run to which the run step belongs. | defaults to undefined
 **stepId** | [**string**] | The ID of the run step to retrieve. | defaults to undefined


### Return type

**RunStepObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getThread**
> ThreadObject getThread()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiGetThreadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiGetThreadRequest = {
    // The ID of the thread to retrieve.
  threadId: "thread_id_example",
};

const data = await apiInstance.getThread(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread to retrieve. | defaults to undefined


### Return type

**ThreadObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listAssistantFiles**
> ListAssistantFilesResponse listAssistantFiles()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiListAssistantFilesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiListAssistantFilesRequest = {
    // The ID of the assistant the file belongs to.
  assistantId: "assistant_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listAssistantFiles(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | [**string**] | The ID of the assistant the file belongs to. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ListAssistantFilesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listAssistants**
> ListAssistantsResponse listAssistants()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiListAssistantsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiListAssistantsRequest = {
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listAssistants(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ListAssistantsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listMessageFiles**
> ListMessageFilesResponse listMessageFiles()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiListMessageFilesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiListMessageFilesRequest = {
    // The ID of the thread that the message and files belong to.
  threadId: "thread_id_example",
    // The ID of the message that the files belongs to.
  messageId: "message_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listMessageFiles(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread that the message and files belong to. | defaults to undefined
 **messageId** | [**string**] | The ID of the message that the files belongs to. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ListMessageFilesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listMessages**
> ListMessagesResponse listMessages()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiListMessagesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiListMessagesRequest = {
    // The ID of the [thread](/docs/api-reference/threads) the messages belong to.
  threadId: "thread_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
    // Filter messages by the run ID that generated them.  (optional)
  runId: "run_id_example",
};

const data = await apiInstance.listMessages(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined
 **runId** | [**string**] | Filter messages by the run ID that generated them.  | (optional) defaults to undefined


### Return type

**ListMessagesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listRunSteps**
> ListRunStepsResponse listRunSteps()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiListRunStepsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiListRunStepsRequest = {
    // The ID of the thread the run and run steps belong to.
  threadId: "thread_id_example",
    // The ID of the run the run steps belong to.
  runId: "run_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listRunSteps(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread the run and run steps belong to. | defaults to undefined
 **runId** | [**string**] | The ID of the run the run steps belong to. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ListRunStepsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listRuns**
> ListRunsResponse listRuns()


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiListRunsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiListRunsRequest = {
    // The ID of the thread the run belongs to.
  threadId: "thread_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listRuns(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | [**string**] | The ID of the thread the run belongs to. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ListRunsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyAssistant**
> AssistantObject modifyAssistant(modifyAssistantRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiModifyAssistantRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiModifyAssistantRequest = {
    // The ID of the assistant to modify.
  assistantId: "assistant_id_example",
  
  modifyAssistantRequest: {
    model: "model_example",
    name: "name_example",
    description: "description_example",
    instructions: "instructions_example",
    tools: [
      null,
    ],
    fileIds: [],
    metadata: {},
  },
};

const data = await apiInstance.modifyAssistant(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyAssistantRequest** | **ModifyAssistantRequest**|  |
 **assistantId** | [**string**] | The ID of the assistant to modify. | defaults to undefined


### Return type

**AssistantObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyMessage**
> MessageObject modifyMessage(modifyMessageRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiModifyMessageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiModifyMessageRequest = {
    // The ID of the thread to which this message belongs.
  threadId: "thread_id_example",
    // The ID of the message to modify.
  messageId: "message_id_example",
  
  modifyMessageRequest: {
    metadata: {},
  },
};

const data = await apiInstance.modifyMessage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyMessageRequest** | **ModifyMessageRequest**|  |
 **threadId** | [**string**] | The ID of the thread to which this message belongs. | defaults to undefined
 **messageId** | [**string**] | The ID of the message to modify. | defaults to undefined


### Return type

**MessageObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyRun**
> RunObject modifyRun(modifyRunRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiModifyRunRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiModifyRunRequest = {
    // The ID of the [thread](/docs/api-reference/threads) that was run.
  threadId: "thread_id_example",
    // The ID of the run to modify.
  runId: "run_id_example",
  
  modifyRunRequest: {
    metadata: {},
  },
};

const data = await apiInstance.modifyRun(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyRunRequest** | **ModifyRunRequest**|  |
 **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) that was run. | defaults to undefined
 **runId** | [**string**] | The ID of the run to modify. | defaults to undefined


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyThread**
> ThreadObject modifyThread(modifyThreadRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiModifyThreadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiModifyThreadRequest = {
    // The ID of the thread to modify. Only the `metadata` can be modified.
  threadId: "thread_id_example",
  
  modifyThreadRequest: {
    metadata: {},
  },
};

const data = await apiInstance.modifyThread(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyThreadRequest** | **ModifyThreadRequest**|  |
 **threadId** | [**string**] | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | defaults to undefined


### Return type

**ThreadObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitToolOuputsToRun**
> RunObject submitToolOuputsToRun(submitToolOutputsRunRequest)


### Example


```typescript
import { createConfiguration, AssistantsApi } from '';
import type { AssistantsApiSubmitToolOuputsToRunRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AssistantsApi(configuration);

const request: AssistantsApiSubmitToolOuputsToRunRequest = {
    // The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
  threadId: "thread_id_example",
    // The ID of the run that requires the tool output submission.
  runId: "run_id_example",
  
  submitToolOutputsRunRequest: {
    toolOutputs: [
      {
        toolCallId: "toolCallId_example",
        output: "output_example",
      },
    ],
    stream: true,
  },
};

const data = await apiInstance.submitToolOuputsToRun(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitToolOutputsRunRequest** | **SubmitToolOutputsRunRequest**|  |
 **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | defaults to undefined
 **runId** | [**string**] | The ID of the run that requires the tool output submission. | defaults to undefined


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


