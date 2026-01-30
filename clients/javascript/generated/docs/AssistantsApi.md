# OpenapiOpenai.AssistantsApi

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to which this run belongs.
let runId = "runId_example"; // String | The ID of the run to cancel.
apiInstance.cancelRun(threadId, runId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which this run belongs. | 
 **runId** | **String**| The ID of the run to cancel. | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let createAssistantRequest = new OpenapiOpenai.CreateAssistantRequest(); // CreateAssistantRequest | 
apiInstance.createAssistant(createAssistantRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the [thread](/docs/api-reference/threads) to create a message for.
let createMessageRequest = new OpenapiOpenai.CreateMessageRequest(); // CreateMessageRequest | 
apiInstance.createMessage(threadId, createMessageRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | 
 **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createRun

> RunObject createRun(threadId, createRunRequest, opts)

Create a run.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to run.
let createRunRequest = new OpenapiOpenai.CreateRunRequest(); // CreateRunRequest | 
let opts = {
  'include': ["null"] // [String] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
};
apiInstance.createRun(threadId, createRunRequest, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to run. | 
 **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md)|  | 
 **include** | [**[String]**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createThread

> ThreadObject createThread(opts)

Create a thread.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let opts = {
  'createThreadRequest': new OpenapiOpenai.CreateThreadRequest() // CreateThreadRequest | 
};
apiInstance.createThread(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let createThreadAndRunRequest = new OpenapiOpenai.CreateThreadAndRunRequest(); // CreateThreadAndRunRequest | 
apiInstance.createThreadAndRun(createThreadAndRunRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let assistantId = "assistantId_example"; // String | The ID of the assistant to delete.
apiInstance.deleteAssistant(assistantId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant to delete. | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to which this message belongs.
let messageId = "messageId_example"; // String | The ID of the message to delete.
apiInstance.deleteMessage(threadId, messageId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which this message belongs. | 
 **messageId** | **String**| The ID of the message to delete. | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to delete.
apiInstance.deleteThread(threadId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to delete. | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let assistantId = "assistantId_example"; // String | The ID of the assistant to retrieve.
apiInstance.getAssistant(assistantId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant to retrieve. | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
let messageId = "messageId_example"; // String | The ID of the message to retrieve.
apiInstance.getMessage(threadId, messageId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
 **messageId** | **String**| The ID of the message to retrieve. | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the [thread](/docs/api-reference/threads) that was run.
let runId = "runId_example"; // String | The ID of the run to retrieve.
apiInstance.getRun(threadId, runId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **runId** | **String**| The ID of the run to retrieve. | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRunStep

> RunStepObject getRunStep(threadId, runId, stepId, opts)

Retrieves a run step.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to which the run and run step belongs.
let runId = "runId_example"; // String | The ID of the run to which the run step belongs.
let stepId = "stepId_example"; // String | The ID of the run step to retrieve.
let opts = {
  'include': ["null"] // [String] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
};
apiInstance.getRunStep(threadId, runId, stepId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which the run and run step belongs. | 
 **runId** | **String**| The ID of the run to which the run step belongs. | 
 **stepId** | **String**| The ID of the run step to retrieve. | 
 **include** | [**[String]**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to retrieve.
apiInstance.getThread(threadId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to retrieve. | 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listAssistants

> ListAssistantsResponse listAssistants(opts)

Returns a list of assistants.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'order': "'desc'", // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  'after': "after_example", // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  'before': "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
};
apiInstance.listAssistants(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listMessages

> ListMessagesResponse listMessages(threadId, opts)

Returns a list of messages for a given thread.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'order': "'desc'", // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  'after': "after_example", // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  'before': "before_example", // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  'runId': "runId_example" // String | Filter messages by the run ID that generated them. 
};
apiInstance.listMessages(threadId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **runId** | **String**| Filter messages by the run ID that generated them.  | [optional] 

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listRunSteps

> ListRunStepsResponse listRunSteps(threadId, runId, opts)

Returns a list of run steps belonging to a run.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread the run and run steps belong to.
let runId = "runId_example"; // String | The ID of the run the run steps belong to.
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'order': "'desc'", // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  'after': "after_example", // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  'before': "before_example", // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  'include': ["null"] // [String] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
};
apiInstance.listRunSteps(threadId, runId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread the run and run steps belong to. | 
 **runId** | **String**| The ID of the run the run steps belong to. | 
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **include** | [**[String]**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listRuns

> ListRunsResponse listRuns(threadId, opts)

Returns a list of runs belonging to a thread.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread the run belongs to.
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'order': "'desc'", // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  'after': "after_example", // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  'before': "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
};
apiInstance.listRuns(threadId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread the run belongs to. | 
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let assistantId = "assistantId_example"; // String | The ID of the assistant to modify.
let modifyAssistantRequest = new OpenapiOpenai.ModifyAssistantRequest(); // ModifyAssistantRequest | 
apiInstance.modifyAssistant(assistantId, modifyAssistantRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String**| The ID of the assistant to modify. | 
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to which this message belongs.
let messageId = "messageId_example"; // String | The ID of the message to modify.
let modifyMessageRequest = new OpenapiOpenai.ModifyMessageRequest(); // ModifyMessageRequest | 
apiInstance.modifyMessage(threadId, messageId, modifyMessageRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to which this message belongs. | 
 **messageId** | **String**| The ID of the message to modify. | 
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the [thread](/docs/api-reference/threads) that was run.
let runId = "runId_example"; // String | The ID of the run to modify.
let modifyRunRequest = new OpenapiOpenai.ModifyRunRequest(); // ModifyRunRequest | 
apiInstance.modifyRun(threadId, runId, modifyRunRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **runId** | **String**| The ID of the run to modify. | 
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the thread to modify. Only the `metadata` can be modified.
let modifyThreadRequest = new OpenapiOpenai.ModifyThreadRequest(); // ModifyThreadRequest | 
apiInstance.modifyThread(threadId, modifyThreadRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | 
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.AssistantsApi();
let threadId = "threadId_example"; // String | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
let runId = "runId_example"; // String | The ID of the run that requires the tool output submission.
let submitToolOutputsRunRequest = new OpenapiOpenai.SubmitToolOutputsRunRequest(); // SubmitToolOutputsRunRequest | 
apiInstance.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
 **runId** | **String**| The ID of the run that requires the tool output submission. | 
 **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

