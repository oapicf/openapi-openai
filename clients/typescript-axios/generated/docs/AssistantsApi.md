# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**cancelRun**](#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.|
|[**createAssistant**](#createassistant) | **POST** /assistants | Create an assistant with a model and instructions.|
|[**createMessage**](#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.|
|[**createRun**](#createrun) | **POST** /threads/{thread_id}/runs | Create a run.|
|[**createThread**](#createthread) | **POST** /threads | Create a thread.|
|[**createThreadAndRun**](#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.|
|[**deleteAssistant**](#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.|
|[**deleteMessage**](#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.|
|[**deleteThread**](#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.|
|[**getAssistant**](#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.|
|[**getMessage**](#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.|
|[**getRun**](#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.|
|[**getRunStep**](#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.|
|[**getThread**](#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.|
|[**listAssistants**](#listassistants) | **GET** /assistants | Returns a list of assistants.|
|[**listMessages**](#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.|
|[**listRunSteps**](#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.|
|[**listRuns**](#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.|
|[**modifyAssistant**](#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.|
|[**modifyMessage**](#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.|
|[**modifyRun**](#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.|
|[**modifyThread**](#modifythread) | **POST** /threads/{thread_id} | Modifies a thread.|
|[**submitToolOuputsToRun**](#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they\&#39;re all completed. All outputs must be submitted in a single request. |

# **cancelRun**
> RunObject cancelRun()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to which this run belongs. (default to undefined)
let runId: string; //The ID of the run to cancel. (default to undefined)

const { status, data } = await apiInstance.cancelRun(
    threadId,
    runId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the thread to which this run belongs. | defaults to undefined|
| **runId** | [**string**] | The ID of the run to cancel. | defaults to undefined|


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createAssistant**
> AssistantObject createAssistant(createAssistantRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    CreateAssistantRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let createAssistantRequest: CreateAssistantRequest; //

const { status, data } = await apiInstance.createAssistant(
    createAssistantRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createAssistantRequest** | **CreateAssistantRequest**|  | |


### Return type

**AssistantObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createMessage**
> MessageObject createMessage(createMessageRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    CreateMessageRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the [thread](/docs/api-reference/threads) to create a message for. (default to undefined)
let createMessageRequest: CreateMessageRequest; //

const { status, data } = await apiInstance.createMessage(
    threadId,
    createMessageRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createMessageRequest** | **CreateMessageRequest**|  | |
| **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) to create a message for. | defaults to undefined|


### Return type

**MessageObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createRun**
> RunObject createRun(createRunRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    CreateRunRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to run. (default to undefined)
let createRunRequest: CreateRunRequest; //
let include: Array<'step_details.tool_calls[*].file_search.results[*].content'>; //A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional) (default to undefined)

const { status, data } = await apiInstance.createRun(
    threadId,
    createRunRequest,
    include
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createRunRequest** | **CreateRunRequest**|  | |
| **threadId** | [**string**] | The ID of the thread to run. | defaults to undefined|
| **include** | **Array<&#39;step_details.tool_calls[*].file_search.results[*].content&#39;>** | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | (optional) defaults to undefined|


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createThread**
> ThreadObject createThread()


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    CreateThreadRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let createThreadRequest: CreateThreadRequest; // (optional)

const { status, data } = await apiInstance.createThread(
    createThreadRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createThreadRequest** | **CreateThreadRequest**|  | |


### Return type

**ThreadObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createThreadAndRun**
> RunObject createThreadAndRun(createThreadAndRunRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    CreateThreadAndRunRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let createThreadAndRunRequest: CreateThreadAndRunRequest; //

const { status, data } = await apiInstance.createThreadAndRun(
    createThreadAndRunRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createThreadAndRunRequest** | **CreateThreadAndRunRequest**|  | |


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAssistant**
> DeleteAssistantResponse deleteAssistant()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let assistantId: string; //The ID of the assistant to delete. (default to undefined)

const { status, data } = await apiInstance.deleteAssistant(
    assistantId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **assistantId** | [**string**] | The ID of the assistant to delete. | defaults to undefined|


### Return type

**DeleteAssistantResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteMessage**
> DeleteMessageResponse deleteMessage()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to which this message belongs. (default to undefined)
let messageId: string; //The ID of the message to delete. (default to undefined)

const { status, data } = await apiInstance.deleteMessage(
    threadId,
    messageId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the thread to which this message belongs. | defaults to undefined|
| **messageId** | [**string**] | The ID of the message to delete. | defaults to undefined|


### Return type

**DeleteMessageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteThread**
> DeleteThreadResponse deleteThread()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to delete. (default to undefined)

const { status, data } = await apiInstance.deleteThread(
    threadId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the thread to delete. | defaults to undefined|


### Return type

**DeleteThreadResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssistant**
> AssistantObject getAssistant()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let assistantId: string; //The ID of the assistant to retrieve. (default to undefined)

const { status, data } = await apiInstance.getAssistant(
    assistantId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **assistantId** | [**string**] | The ID of the assistant to retrieve. | defaults to undefined|


### Return type

**AssistantObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMessage**
> MessageObject getMessage()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the [thread](/docs/api-reference/threads) to which this message belongs. (default to undefined)
let messageId: string; //The ID of the message to retrieve. (default to undefined)

const { status, data } = await apiInstance.getMessage(
    threadId,
    messageId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | defaults to undefined|
| **messageId** | [**string**] | The ID of the message to retrieve. | defaults to undefined|


### Return type

**MessageObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRun**
> RunObject getRun()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the [thread](/docs/api-reference/threads) that was run. (default to undefined)
let runId: string; //The ID of the run to retrieve. (default to undefined)

const { status, data } = await apiInstance.getRun(
    threadId,
    runId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) that was run. | defaults to undefined|
| **runId** | [**string**] | The ID of the run to retrieve. | defaults to undefined|


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRunStep**
> RunStepObject getRunStep()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to which the run and run step belongs. (default to undefined)
let runId: string; //The ID of the run to which the run step belongs. (default to undefined)
let stepId: string; //The ID of the run step to retrieve. (default to undefined)
let include: Array<'step_details.tool_calls[*].file_search.results[*].content'>; //A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional) (default to undefined)

const { status, data } = await apiInstance.getRunStep(
    threadId,
    runId,
    stepId,
    include
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the thread to which the run and run step belongs. | defaults to undefined|
| **runId** | [**string**] | The ID of the run to which the run step belongs. | defaults to undefined|
| **stepId** | [**string**] | The ID of the run step to retrieve. | defaults to undefined|
| **include** | **Array<&#39;step_details.tool_calls[*].file_search.results[*].content&#39;>** | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | (optional) defaults to undefined|


### Return type

**RunStepObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getThread**
> ThreadObject getThread()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to retrieve. (default to undefined)

const { status, data } = await apiInstance.getThread(
    threadId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the thread to retrieve. | defaults to undefined|


### Return type

**ThreadObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listAssistants**
> ListAssistantsResponse listAssistants()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order: 'asc' | 'desc'; //Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to 'desc')
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listAssistants(
    limit,
    order,
    after,
    before
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|


### Return type

**ListAssistantsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listMessages**
> ListMessagesResponse listMessages()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the [thread](/docs/api-reference/threads) the messages belong to. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order: 'asc' | 'desc'; //Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to 'desc')
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)
let runId: string; //Filter messages by the run ID that generated them.  (optional) (default to undefined)

const { status, data } = await apiInstance.listMessages(
    threadId,
    limit,
    order,
    after,
    before,
    runId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|
| **runId** | [**string**] | Filter messages by the run ID that generated them.  | (optional) defaults to undefined|


### Return type

**ListMessagesResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRunSteps**
> ListRunStepsResponse listRunSteps()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread the run and run steps belong to. (default to undefined)
let runId: string; //The ID of the run the run steps belong to. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order: 'asc' | 'desc'; //Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to 'desc')
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)
let include: Array<'step_details.tool_calls[*].file_search.results[*].content'>; //A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional) (default to undefined)

const { status, data } = await apiInstance.listRunSteps(
    threadId,
    runId,
    limit,
    order,
    after,
    before,
    include
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the thread the run and run steps belong to. | defaults to undefined|
| **runId** | [**string**] | The ID of the run the run steps belong to. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|
| **include** | **Array<&#39;step_details.tool_calls[*].file_search.results[*].content&#39;>** | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | (optional) defaults to undefined|


### Return type

**ListRunStepsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRuns**
> ListRunsResponse listRuns()


### Example

```typescript
import {
    AssistantsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread the run belongs to. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order: 'asc' | 'desc'; //Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to 'desc')
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listRuns(
    threadId,
    limit,
    order,
    after,
    before
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **threadId** | [**string**] | The ID of the thread the run belongs to. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|


### Return type

**ListRunsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyAssistant**
> AssistantObject modifyAssistant(modifyAssistantRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    ModifyAssistantRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let assistantId: string; //The ID of the assistant to modify. (default to undefined)
let modifyAssistantRequest: ModifyAssistantRequest; //

const { status, data } = await apiInstance.modifyAssistant(
    assistantId,
    modifyAssistantRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **modifyAssistantRequest** | **ModifyAssistantRequest**|  | |
| **assistantId** | [**string**] | The ID of the assistant to modify. | defaults to undefined|


### Return type

**AssistantObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyMessage**
> MessageObject modifyMessage(modifyMessageRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    ModifyMessageRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to which this message belongs. (default to undefined)
let messageId: string; //The ID of the message to modify. (default to undefined)
let modifyMessageRequest: ModifyMessageRequest; //

const { status, data } = await apiInstance.modifyMessage(
    threadId,
    messageId,
    modifyMessageRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **modifyMessageRequest** | **ModifyMessageRequest**|  | |
| **threadId** | [**string**] | The ID of the thread to which this message belongs. | defaults to undefined|
| **messageId** | [**string**] | The ID of the message to modify. | defaults to undefined|


### Return type

**MessageObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyRun**
> RunObject modifyRun(modifyRunRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    ModifyRunRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the [thread](/docs/api-reference/threads) that was run. (default to undefined)
let runId: string; //The ID of the run to modify. (default to undefined)
let modifyRunRequest: ModifyRunRequest; //

const { status, data } = await apiInstance.modifyRun(
    threadId,
    runId,
    modifyRunRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **modifyRunRequest** | **ModifyRunRequest**|  | |
| **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) that was run. | defaults to undefined|
| **runId** | [**string**] | The ID of the run to modify. | defaults to undefined|


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyThread**
> ThreadObject modifyThread(modifyThreadRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    ModifyThreadRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the thread to modify. Only the `metadata` can be modified. (default to undefined)
let modifyThreadRequest: ModifyThreadRequest; //

const { status, data } = await apiInstance.modifyThread(
    threadId,
    modifyThreadRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **modifyThreadRequest** | **ModifyThreadRequest**|  | |
| **threadId** | [**string**] | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | defaults to undefined|


### Return type

**ThreadObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submitToolOuputsToRun**
> RunObject submitToolOuputsToRun(submitToolOutputsRunRequest)


### Example

```typescript
import {
    AssistantsApi,
    Configuration,
    SubmitToolOutputsRunRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AssistantsApi(configuration);

let threadId: string; //The ID of the [thread](/docs/api-reference/threads) to which this run belongs. (default to undefined)
let runId: string; //The ID of the run that requires the tool output submission. (default to undefined)
let submitToolOutputsRunRequest: SubmitToolOutputsRunRequest; //

const { status, data } = await apiInstance.submitToolOuputsToRun(
    threadId,
    runId,
    submitToolOutputsRunRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **submitToolOutputsRunRequest** | **SubmitToolOutputsRunRequest**|  | |
| **threadId** | [**string**] | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | defaults to undefined|
| **runId** | [**string**] | The ID of the run that requires the tool output submission. | defaults to undefined|


### Return type

**RunObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

