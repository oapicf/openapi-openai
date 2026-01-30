# \AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_run**](AssistantsApi.md#cancel_run) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`.
[**create_assistant**](AssistantsApi.md#create_assistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**create_message**](AssistantsApi.md#create_message) | **POST** /threads/{thread_id}/messages | Create a message.
[**create_run**](AssistantsApi.md#create_run) | **POST** /threads/{thread_id}/runs | Create a run.
[**create_thread**](AssistantsApi.md#create_thread) | **POST** /threads | Create a thread.
[**create_thread_and_run**](AssistantsApi.md#create_thread_and_run) | **POST** /threads/runs | Create a thread and run it in one request.
[**delete_assistant**](AssistantsApi.md#delete_assistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**delete_message**](AssistantsApi.md#delete_message) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**delete_thread**](AssistantsApi.md#delete_thread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**get_assistant**](AssistantsApi.md#get_assistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**get_message**](AssistantsApi.md#get_message) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**get_run**](AssistantsApi.md#get_run) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**get_run_step**](AssistantsApi.md#get_run_step) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**get_thread**](AssistantsApi.md#get_thread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**list_assistants**](AssistantsApi.md#list_assistants) | **GET** /assistants | Returns a list of assistants.
[**list_messages**](AssistantsApi.md#list_messages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**list_run_steps**](AssistantsApi.md#list_run_steps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**list_runs**](AssistantsApi.md#list_runs) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**modify_assistant**](AssistantsApi.md#modify_assistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**modify_message**](AssistantsApi.md#modify_message) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modify_run**](AssistantsApi.md#modify_run) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modify_thread**](AssistantsApi.md#modify_thread) | **POST** /threads/{thread_id} | Modifies a thread.
[**submit_tool_ouputs_to_run**](AssistantsApi.md#submit_tool_ouputs_to_run) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 



## cancel_run

> models::RunObject cancel_run(thread_id, run_id)
Cancels a run that is `in_progress`.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to which this run belongs. | [required] |
**run_id** | **String** | The ID of the run to cancel. | [required] |

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_assistant

> models::AssistantObject create_assistant(create_assistant_request)
Create an assistant with a model and instructions.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_assistant_request** | [**CreateAssistantRequest**](CreateAssistantRequest.md) |  | [required] |

### Return type

[**models::AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_message

> models::MessageObject create_message(thread_id, create_message_request)
Create a message.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) to create a message for. | [required] |
**create_message_request** | [**CreateMessageRequest**](CreateMessageRequest.md) |  | [required] |

### Return type

[**models::MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_run

> models::RunObject create_run(thread_id, create_run_request, include_left_square_bracket_right_square_bracket)
Create a run.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to run. | [required] |
**create_run_request** | [**CreateRunRequest**](CreateRunRequest.md) |  | [required] |
**include_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  |  |

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_thread

> models::ThreadObject create_thread(create_thread_request)
Create a thread.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_thread_request** | Option<[**CreateThreadRequest**](CreateThreadRequest.md)> |  |  |

### Return type

[**models::ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_thread_and_run

> models::RunObject create_thread_and_run(create_thread_and_run_request)
Create a thread and run it in one request.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_thread_and_run_request** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md) |  | [required] |

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_assistant

> models::DeleteAssistantResponse delete_assistant(assistant_id)
Delete an assistant.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**assistant_id** | **String** | The ID of the assistant to delete. | [required] |

### Return type

[**models::DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_message

> models::DeleteMessageResponse delete_message(thread_id, message_id)
Deletes a message.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to which this message belongs. | [required] |
**message_id** | **String** | The ID of the message to delete. | [required] |

### Return type

[**models::DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_thread

> models::DeleteThreadResponse delete_thread(thread_id)
Delete a thread.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to delete. | [required] |

### Return type

[**models::DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_assistant

> models::AssistantObject get_assistant(assistant_id)
Retrieves an assistant.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**assistant_id** | **String** | The ID of the assistant to retrieve. | [required] |

### Return type

[**models::AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_message

> models::MessageObject get_message(thread_id, message_id)
Retrieve a message.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | [required] |
**message_id** | **String** | The ID of the message to retrieve. | [required] |

### Return type

[**models::MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_run

> models::RunObject get_run(thread_id, run_id)
Retrieves a run.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. | [required] |
**run_id** | **String** | The ID of the run to retrieve. | [required] |

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_run_step

> models::RunStepObject get_run_step(thread_id, run_id, step_id, include_left_square_bracket_right_square_bracket)
Retrieves a run step.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to which the run and run step belongs. | [required] |
**run_id** | **String** | The ID of the run to which the run step belongs. | [required] |
**step_id** | **String** | The ID of the run step to retrieve. | [required] |
**include_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  |  |

### Return type

[**models::RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_thread

> models::ThreadObject get_thread(thread_id)
Retrieves a thread.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to retrieve. | [required] |

### Return type

[**models::ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_assistants

> models::ListAssistantsResponse list_assistants(limit, order, after, before)
Returns a list of assistants.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  |  |[default to 20]
**order** | Option<**String**> | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  |  |[default to desc]
**after** | Option<**String**> | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  |  |
**before** | Option<**String**> | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  |  |

### Return type

[**models::ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_messages

> models::ListMessagesResponse list_messages(thread_id, limit, order, after, before, run_id)
Returns a list of messages for a given thread.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | [required] |
**limit** | Option<**i32**> | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  |  |[default to 20]
**order** | Option<**String**> | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  |  |[default to desc]
**after** | Option<**String**> | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  |  |
**before** | Option<**String**> | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  |  |
**run_id** | Option<**String**> | Filter messages by the run ID that generated them.  |  |

### Return type

[**models::ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_run_steps

> models::ListRunStepsResponse list_run_steps(thread_id, run_id, limit, order, after, before, include_left_square_bracket_right_square_bracket)
Returns a list of run steps belonging to a run.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread the run and run steps belong to. | [required] |
**run_id** | **String** | The ID of the run the run steps belong to. | [required] |
**limit** | Option<**i32**> | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  |  |[default to 20]
**order** | Option<**String**> | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  |  |[default to desc]
**after** | Option<**String**> | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  |  |
**before** | Option<**String**> | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  |  |
**include_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  |  |

### Return type

[**models::ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_runs

> models::ListRunsResponse list_runs(thread_id, limit, order, after, before)
Returns a list of runs belonging to a thread.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread the run belongs to. | [required] |
**limit** | Option<**i32**> | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  |  |[default to 20]
**order** | Option<**String**> | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  |  |[default to desc]
**after** | Option<**String**> | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  |  |
**before** | Option<**String**> | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  |  |

### Return type

[**models::ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modify_assistant

> models::AssistantObject modify_assistant(assistant_id, modify_assistant_request)
Modifies an assistant.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**assistant_id** | **String** | The ID of the assistant to modify. | [required] |
**modify_assistant_request** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md) |  | [required] |

### Return type

[**models::AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modify_message

> models::MessageObject modify_message(thread_id, message_id, modify_message_request)
Modifies a message.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to which this message belongs. | [required] |
**message_id** | **String** | The ID of the message to modify. | [required] |
**modify_message_request** | [**ModifyMessageRequest**](ModifyMessageRequest.md) |  | [required] |

### Return type

[**models::MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modify_run

> models::RunObject modify_run(thread_id, run_id, modify_run_request)
Modifies a run.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. | [required] |
**run_id** | **String** | The ID of the run to modify. | [required] |
**modify_run_request** | [**ModifyRunRequest**](ModifyRunRequest.md) |  | [required] |

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modify_thread

> models::ThreadObject modify_thread(thread_id, modify_thread_request)
Modifies a thread.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the thread to modify. Only the `metadata` can be modified. | [required] |
**modify_thread_request** | [**ModifyThreadRequest**](ModifyThreadRequest.md) |  | [required] |

### Return type

[**models::ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## submit_tool_ouputs_to_run

> models::RunObject submit_tool_ouputs_to_run(thread_id, run_id, submit_tool_outputs_run_request)
When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | [required] |
**run_id** | **String** | The ID of the run that requires the tool output submission. | [required] |
**submit_tool_outputs_run_request** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md) |  | [required] |

### Return type

[**models::RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

