# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_run**](AssistantsApi.md#cancel_run) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
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
[**submit_tool_ouputs_to_run**](AssistantsApi.md#submit_tool_ouputs_to_run) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


# **cancel_run**
> `cancel_run`(_api::`AssistantsApi`, `thread_id`::`String`, `run_id`::`String`; _mediaType=nothing) -> `RunObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `cancel_run`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `run_id`::`String`; _mediaType=nothing) -> `Channel`{ `RunObject` }, `OpenAPI.Clients.ApiResponse`

Cancels a run that is `in_progress`.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to which this run belongs. |
**`run_id`** | **`String`** | The ID of the run to cancel. |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_assistant**
> `create_assistant`(_api::`AssistantsApi`, `create_assistant_request`::`CreateAssistantRequest`; _mediaType=nothing) -> `AssistantObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_assistant`(_api::`AssistantsApi`, response_stream::`Channel`, `create_assistant_request`::`CreateAssistantRequest`; _mediaType=nothing) -> `Channel`{ `AssistantObject` }, `OpenAPI.Clients.ApiResponse`

Create an assistant with a model and instructions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`create_assistant_request`** | [**`CreateAssistantRequest`**](CreateAssistantRequest.md) |  |

### Return type

[**`AssistantObject`**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_message**
> `create_message`(_api::`AssistantsApi`, `thread_id`::`String`, `create_message_request`::`CreateMessageRequest`; _mediaType=nothing) -> `MessageObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_message`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `create_message_request`::`CreateMessageRequest`; _mediaType=nothing) -> `Channel`{ `MessageObject` }, `OpenAPI.Clients.ApiResponse`

Create a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the [thread](/docs/api-reference/threads) to create a message for. |
**`create_message_request`** | [**`CreateMessageRequest`**](CreateMessageRequest.md) |  |

### Return type

[**`MessageObject`**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_run**
> `create_run`(_api::`AssistantsApi`, `thread_id`::`String`, `create_run_request`::`CreateRunRequest`; `include`=nothing, _mediaType=nothing) -> `RunObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_run`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `create_run_request`::`CreateRunRequest`; `include`=nothing, _mediaType=nothing) -> `Channel`{ `RunObject` }, `OpenAPI.Clients.ApiResponse`

Create a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to run. |
**`create_run_request`** | [**`CreateRunRequest`**](CreateRunRequest.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`include`** | [**`Vector{String}`**](String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [default to nothing]

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_thread**
> `create_thread`(_api::`AssistantsApi`; `create_thread_request`=nothing, _mediaType=nothing) -> `ThreadObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_thread`(_api::`AssistantsApi`, response_stream::`Channel`; `create_thread_request`=nothing, _mediaType=nothing) -> `Channel`{ `ThreadObject` }, `OpenAPI.Clients.ApiResponse`

Create a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`create_thread_request`** | [**`CreateThreadRequest`**](CreateThreadRequest.md) |  | 

### Return type

[**`ThreadObject`**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_thread_and_run**
> `create_thread_and_run`(_api::`AssistantsApi`, `create_thread_and_run_request`::`CreateThreadAndRunRequest`; _mediaType=nothing) -> `RunObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_thread_and_run`(_api::`AssistantsApi`, response_stream::`Channel`, `create_thread_and_run_request`::`CreateThreadAndRunRequest`; _mediaType=nothing) -> `Channel`{ `RunObject` }, `OpenAPI.Clients.ApiResponse`

Create a thread and run it in one request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`create_thread_and_run_request`** | [**`CreateThreadAndRunRequest`**](CreateThreadAndRunRequest.md) |  |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_assistant**
> `delete_assistant`(_api::`AssistantsApi`, `assistant_id`::`String`; _mediaType=nothing) -> `DeleteAssistantResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_assistant`(_api::`AssistantsApi`, response_stream::`Channel`, `assistant_id`::`String`; _mediaType=nothing) -> `Channel`{ `DeleteAssistantResponse` }, `OpenAPI.Clients.ApiResponse`

Delete an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`assistant_id`** | **`String`** | The ID of the assistant to delete. |

### Return type

[**`DeleteAssistantResponse`**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_message**
> `delete_message`(_api::`AssistantsApi`, `thread_id`::`String`, `message_id`::`String`; _mediaType=nothing) -> `DeleteMessageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_message`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `message_id`::`String`; _mediaType=nothing) -> `Channel`{ `DeleteMessageResponse` }, `OpenAPI.Clients.ApiResponse`

Deletes a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to which this message belongs. |
**`message_id`** | **`String`** | The ID of the message to delete. |

### Return type

[**`DeleteMessageResponse`**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_thread**
> `delete_thread`(_api::`AssistantsApi`, `thread_id`::`String`; _mediaType=nothing) -> `DeleteThreadResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_thread`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`; _mediaType=nothing) -> `Channel`{ `DeleteThreadResponse` }, `OpenAPI.Clients.ApiResponse`

Delete a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to delete. |

### Return type

[**`DeleteThreadResponse`**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_assistant**
> `get_assistant`(_api::`AssistantsApi`, `assistant_id`::`String`; _mediaType=nothing) -> `AssistantObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_assistant`(_api::`AssistantsApi`, response_stream::`Channel`, `assistant_id`::`String`; _mediaType=nothing) -> `Channel`{ `AssistantObject` }, `OpenAPI.Clients.ApiResponse`

Retrieves an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`assistant_id`** | **`String`** | The ID of the assistant to retrieve. |

### Return type

[**`AssistantObject`**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_message**
> `get_message`(_api::`AssistantsApi`, `thread_id`::`String`, `message_id`::`String`; _mediaType=nothing) -> `MessageObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_message`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `message_id`::`String`; _mediaType=nothing) -> `Channel`{ `MessageObject` }, `OpenAPI.Clients.ApiResponse`

Retrieve a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. |
**`message_id`** | **`String`** | The ID of the message to retrieve. |

### Return type

[**`MessageObject`**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_run**
> `get_run`(_api::`AssistantsApi`, `thread_id`::`String`, `run_id`::`String`; _mediaType=nothing) -> `RunObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_run`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `run_id`::`String`; _mediaType=nothing) -> `Channel`{ `RunObject` }, `OpenAPI.Clients.ApiResponse`

Retrieves a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the [thread](/docs/api-reference/threads) that was run. |
**`run_id`** | **`String`** | The ID of the run to retrieve. |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_run_step**
> `get_run_step`(_api::`AssistantsApi`, `thread_id`::`String`, `run_id`::`String`, `step_id`::`String`; `include`=nothing, _mediaType=nothing) -> `RunStepObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_run_step`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `run_id`::`String`, `step_id`::`String`; `include`=nothing, _mediaType=nothing) -> `Channel`{ `RunStepObject` }, `OpenAPI.Clients.ApiResponse`

Retrieves a run step.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to which the run and run step belongs. |
**`run_id`** | **`String`** | The ID of the run to which the run step belongs. |
**`step_id`** | **`String`** | The ID of the run step to retrieve. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`include`** | [**`Vector{String}`**](String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [default to nothing]

### Return type

[**`RunStepObject`**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_thread**
> `get_thread`(_api::`AssistantsApi`, `thread_id`::`String`; _mediaType=nothing) -> `ThreadObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_thread`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`; _mediaType=nothing) -> `Channel`{ `ThreadObject` }, `OpenAPI.Clients.ApiResponse`

Retrieves a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to retrieve. |

### Return type

[**`ThreadObject`**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_assistants**
> `list_assistants`(_api::`AssistantsApi`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `ListAssistantsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_assistants`(_api::`AssistantsApi`, response_stream::`Channel`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `Channel`{ `ListAssistantsResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of assistants.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]

### Return type

[**`ListAssistantsResponse`**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_messages**
> `list_messages`(_api::`AssistantsApi`, `thread_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `run_id`=nothing, _mediaType=nothing) -> `ListMessagesResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_messages`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `run_id`=nothing, _mediaType=nothing) -> `Channel`{ `ListMessagesResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of messages for a given thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the [thread](/docs/api-reference/threads) the messages belong to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]
 **`run_id`** | **`String`** | Filter messages by the run ID that generated them.  | [default to nothing]

### Return type

[**`ListMessagesResponse`**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_run_steps**
> `list_run_steps`(_api::`AssistantsApi`, `thread_id`::`String`, `run_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `include`=nothing, _mediaType=nothing) -> `ListRunStepsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_run_steps`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `run_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `include`=nothing, _mediaType=nothing) -> `Channel`{ `ListRunStepsResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of run steps belonging to a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread the run and run steps belong to. |
**`run_id`** | **`String`** | The ID of the run the run steps belong to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]
 **`include`** | [**`Vector{String}`**](String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [default to nothing]

### Return type

[**`ListRunStepsResponse`**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_runs**
> `list_runs`(_api::`AssistantsApi`, `thread_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `ListRunsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_runs`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `Channel`{ `ListRunsResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of runs belonging to a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread the run belongs to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]

### Return type

[**`ListRunsResponse`**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_assistant**
> `modify_assistant`(_api::`AssistantsApi`, `assistant_id`::`String`, `modify_assistant_request`::`ModifyAssistantRequest`; _mediaType=nothing) -> `AssistantObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_assistant`(_api::`AssistantsApi`, response_stream::`Channel`, `assistant_id`::`String`, `modify_assistant_request`::`ModifyAssistantRequest`; _mediaType=nothing) -> `Channel`{ `AssistantObject` }, `OpenAPI.Clients.ApiResponse`

Modifies an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`assistant_id`** | **`String`** | The ID of the assistant to modify. |
**`modify_assistant_request`** | [**`ModifyAssistantRequest`**](ModifyAssistantRequest.md) |  |

### Return type

[**`AssistantObject`**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_message**
> `modify_message`(_api::`AssistantsApi`, `thread_id`::`String`, `message_id`::`String`, `modify_message_request`::`ModifyMessageRequest`; _mediaType=nothing) -> `MessageObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_message`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `message_id`::`String`, `modify_message_request`::`ModifyMessageRequest`; _mediaType=nothing) -> `Channel`{ `MessageObject` }, `OpenAPI.Clients.ApiResponse`

Modifies a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to which this message belongs. |
**`message_id`** | **`String`** | The ID of the message to modify. |
**`modify_message_request`** | [**`ModifyMessageRequest`**](ModifyMessageRequest.md) |  |

### Return type

[**`MessageObject`**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_run**
> `modify_run`(_api::`AssistantsApi`, `thread_id`::`String`, `run_id`::`String`, `modify_run_request`::`ModifyRunRequest`; _mediaType=nothing) -> `RunObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_run`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `run_id`::`String`, `modify_run_request`::`ModifyRunRequest`; _mediaType=nothing) -> `Channel`{ `RunObject` }, `OpenAPI.Clients.ApiResponse`

Modifies a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the [thread](/docs/api-reference/threads) that was run. |
**`run_id`** | **`String`** | The ID of the run to modify. |
**`modify_run_request`** | [**`ModifyRunRequest`**](ModifyRunRequest.md) |  |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_thread**
> `modify_thread`(_api::`AssistantsApi`, `thread_id`::`String`, `modify_thread_request`::`ModifyThreadRequest`; _mediaType=nothing) -> `ThreadObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_thread`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `modify_thread_request`::`ModifyThreadRequest`; _mediaType=nothing) -> `Channel`{ `ThreadObject` }, `OpenAPI.Clients.ApiResponse`

Modifies a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. |
**`modify_thread_request`** | [**`ModifyThreadRequest`**](ModifyThreadRequest.md) |  |

### Return type

[**`ThreadObject`**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **submit_tool_ouputs_to_run**
> `submit_tool_ouputs_to_run`(_api::`AssistantsApi`, `thread_id`::`String`, `run_id`::`String`, `submit_tool_outputs_run_request`::`SubmitToolOutputsRunRequest`; _mediaType=nothing) -> `RunObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `submit_tool_ouputs_to_run`(_api::`AssistantsApi`, response_stream::`Channel`, `thread_id`::`String`, `run_id`::`String`, `submit_tool_outputs_run_request`::`SubmitToolOutputsRunRequest`; _mediaType=nothing) -> `Channel`{ `RunObject` }, `OpenAPI.Clients.ApiResponse`

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AssistantsApi`** | API context | 
**`thread_id`** | **`String`** | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. |
**`run_id`** | **`String`** | The ID of the run that requires the tool output submission. |
**`submit_tool_outputs_run_request`** | [**`SubmitToolOutputsRunRequest`**](SubmitToolOutputsRunRequest.md) |  |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

