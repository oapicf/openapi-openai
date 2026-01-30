# AssistantsApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](AssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#39;in_progress&#39;.
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
[**submitToolOuputsToRun**](AssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#39;status: \&quot;requires_action\&quot;&#39; and &#39;required_action.type&#39; is &#39;submit_tool_outputs&#39;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.



## cancelRun

Cancels a run that is 'in_progress'.

### Example

```bash
 cancelRun thread_id=value run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to which this run belongs. | [default to null]
 **runId** | **string** | The ID of the run to cancel. | [default to null]

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createAssistant

Create an assistant with a model and instructions.

### Example

```bash
 createAssistant
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAssistantRequest** | [**CreateAssistantRequest**](CreateAssistantRequest.md) |  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createMessage

Create a message.

### Example

```bash
 createMessage thread_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to create a message for. | [default to null]
 **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md) |  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createRun

Create a run.

### Example

```bash
 createRun thread_id=value  Specify as:  include[]=value1 include[]=value2 include[]=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to run. | [default to null]
 **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md) |  |
 **includeLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | A list of additional fields to include in the response. Currently the only supported value is 'step_details.tool_calls[*].file_search.results[*].content' to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. | [optional] [default to null]

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createThread

Create a thread.

### Example

```bash
 createThread
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadRequest** | [**CreateThreadRequest**](CreateThreadRequest.md) |  | [optional]

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createThreadAndRun

Create a thread and run it in one request.

### Example

```bash
 createThreadAndRun
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadAndRunRequest** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md) |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteAssistant

Delete an assistant.

### Example

```bash
 deleteAssistant assistant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **string** | The ID of the assistant to delete. | [default to null]

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteMessage

Deletes a message.

### Example

```bash
 deleteMessage thread_id=value message_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to which this message belongs. | [default to null]
 **messageId** | **string** | The ID of the message to delete. | [default to null]

### Return type

[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteThread

Delete a thread.

### Example

```bash
 deleteThread thread_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to delete. | [default to null]

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAssistant

Retrieves an assistant.

### Example

```bash
 getAssistant assistant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **string** | The ID of the assistant to retrieve. | [default to null]

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getMessage

Retrieve a message.

### Example

```bash
 getMessage thread_id=value message_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | [default to null]
 **messageId** | **string** | The ID of the message to retrieve. | [default to null]

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getRun

Retrieves a run.

### Example

```bash
 getRun thread_id=value run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
 **runId** | **string** | The ID of the run to retrieve. | [default to null]

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getRunStep

Retrieves a run step.

### Example

```bash
 getRunStep thread_id=value run_id=value step_id=value  Specify as:  include[]=value1 include[]=value2 include[]=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to which the run and run step belongs. | [default to null]
 **runId** | **string** | The ID of the run to which the run step belongs. | [default to null]
 **stepId** | **string** | The ID of the run step to retrieve. | [default to null]
 **includeLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | A list of additional fields to include in the response. Currently the only supported value is 'step_details.tool_calls[*].file_search.results[*].content' to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. | [optional] [default to null]

### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getThread

Retrieves a thread.

### Example

```bash
 getThread thread_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to retrieve. | [default to null]

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listAssistants

Returns a list of assistants.

### Example

```bash
 listAssistants  limit=value  order=value  after=value  before=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string** | Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order. | [optional] [default to desc]
 **after** | **string** | A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. | [optional] [default to null]
 **before** | **string** | A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. | [optional] [default to null]

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listMessages

Returns a list of messages for a given thread.

### Example

```bash
 listMessages thread_id=value  limit=value  order=value  after=value  before=value  run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | [default to null]
 **limit** | **integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string** | Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order. | [optional] [default to desc]
 **after** | **string** | A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. | [optional] [default to null]
 **before** | **string** | A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. | [optional] [default to null]
 **runId** | **string** | Filter messages by the run ID that generated them. | [optional] [default to null]

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listRunSteps

Returns a list of run steps belonging to a run.

### Example

```bash
 listRunSteps thread_id=value run_id=value  limit=value  order=value  after=value  before=value  Specify as:  include[]=value1 include[]=value2 include[]=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread the run and run steps belong to. | [default to null]
 **runId** | **string** | The ID of the run the run steps belong to. | [default to null]
 **limit** | **integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string** | Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order. | [optional] [default to desc]
 **after** | **string** | A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. | [optional] [default to null]
 **before** | **string** | A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. | [optional] [default to null]
 **includeLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | A list of additional fields to include in the response. Currently the only supported value is 'step_details.tool_calls[*].file_search.results[*].content' to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. | [optional] [default to null]

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listRuns

Returns a list of runs belonging to a thread.

### Example

```bash
 listRuns thread_id=value  limit=value  order=value  after=value  before=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread the run belongs to. | [default to null]
 **limit** | **integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string** | Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order. | [optional] [default to desc]
 **after** | **string** | A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. | [optional] [default to null]
 **before** | **string** | A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. | [optional] [default to null]

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modifyAssistant

Modifies an assistant.

### Example

```bash
 modifyAssistant assistant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **string** | The ID of the assistant to modify. | [default to null]
 **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md) |  |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modifyMessage

Modifies a message.

### Example

```bash
 modifyMessage thread_id=value message_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to which this message belongs. | [default to null]
 **messageId** | **string** | The ID of the message to modify. | [default to null]
 **modifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md) |  |

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modifyRun

Modifies a run.

### Example

```bash
 modifyRun thread_id=value run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
 **runId** | **string** | The ID of the run to modify. | [default to null]
 **modifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md) |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modifyThread

Modifies a thread.

### Example

```bash
 modifyThread thread_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the thread to modify. Only the 'metadata' can be modified. | [default to null]
 **modifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md) |  |

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## submitToolOuputsToRun

When a run has the 'status: \"requires_action\"' and 'required_action.type' is 'submit_tool_outputs', this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.

### Example

```bash
 submitToolOuputsToRun thread_id=value run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | [default to null]
 **runId** | **string** | The ID of the run that requires the tool output submission. | [default to null]
 **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md) |  |

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

