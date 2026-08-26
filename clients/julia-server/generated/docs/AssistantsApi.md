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
> `cancel_run`(req::`HTTP.Request`, `thread_id`::`String`, `run_id`::`String`;) -> `RunObject`

Cancels a run that is `in_progress`.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to which this run belongs. |
**`run_id`** | **`String`**| The ID of the run to cancel. |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_assistant**
> `create_assistant`(req::`HTTP.Request`, `create_assistant_request`::`CreateAssistantRequest`;) -> `AssistantObject`

Create an assistant with a model and instructions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`create_assistant_request`** | [**`CreateAssistantRequest`**](CreateAssistantRequest.md)|  |

### Return type

[**`AssistantObject`**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_message**
> `create_message`(req::`HTTP.Request`, `thread_id`::`String`, `create_message_request`::`CreateMessageRequest`;) -> `MessageObject`

Create a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the [thread](/docs/api-reference/threads) to create a message for. |
**`create_message_request`** | [**`CreateMessageRequest`**](CreateMessageRequest.md)|  |

### Return type

[**`MessageObject`**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_run**
> `create_run`(req::`HTTP.Request`, `thread_id`::`String`, `create_run_request`::`CreateRunRequest`; `include`=nothing,) -> `RunObject`

Create a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to run. |
**`create_run_request`** | [**`CreateRunRequest`**](CreateRunRequest.md)|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`include`** | [**`Vector{String}`**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [default to nothing]

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_thread**
> `create_thread`(req::`HTTP.Request`; `create_thread_request`=nothing,) -> `ThreadObject`

Create a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`create_thread_request`** | [**`CreateThreadRequest`**](CreateThreadRequest.md)|  | 

### Return type

[**`ThreadObject`**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_thread_and_run**
> `create_thread_and_run`(req::`HTTP.Request`, `create_thread_and_run_request`::`CreateThreadAndRunRequest`;) -> `RunObject`

Create a thread and run it in one request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`create_thread_and_run_request`** | [**`CreateThreadAndRunRequest`**](CreateThreadAndRunRequest.md)|  |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assistant**
> `delete_assistant`(req::`HTTP.Request`, `assistant_id`::`String`;) -> `DeleteAssistantResponse`

Delete an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`assistant_id`** | **`String`**| The ID of the assistant to delete. |

### Return type

[**`DeleteAssistantResponse`**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_message**
> `delete_message`(req::`HTTP.Request`, `thread_id`::`String`, `message_id`::`String`;) -> `DeleteMessageResponse`

Deletes a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to which this message belongs. |
**`message_id`** | **`String`**| The ID of the message to delete. |

### Return type

[**`DeleteMessageResponse`**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_thread**
> `delete_thread`(req::`HTTP.Request`, `thread_id`::`String`;) -> `DeleteThreadResponse`

Delete a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to delete. |

### Return type

[**`DeleteThreadResponse`**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_assistant**
> `get_assistant`(req::`HTTP.Request`, `assistant_id`::`String`;) -> `AssistantObject`

Retrieves an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`assistant_id`** | **`String`**| The ID of the assistant to retrieve. |

### Return type

[**`AssistantObject`**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_message**
> `get_message`(req::`HTTP.Request`, `thread_id`::`String`, `message_id`::`String`;) -> `MessageObject`

Retrieve a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. |
**`message_id`** | **`String`**| The ID of the message to retrieve. |

### Return type

[**`MessageObject`**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_run**
> `get_run`(req::`HTTP.Request`, `thread_id`::`String`, `run_id`::`String`;) -> `RunObject`

Retrieves a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the [thread](/docs/api-reference/threads) that was run. |
**`run_id`** | **`String`**| The ID of the run to retrieve. |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_run_step**
> `get_run_step`(req::`HTTP.Request`, `thread_id`::`String`, `run_id`::`String`, `step_id`::`String`; `include`=nothing,) -> `RunStepObject`

Retrieves a run step.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to which the run and run step belongs. |
**`run_id`** | **`String`**| The ID of the run to which the run step belongs. |
**`step_id`** | **`String`**| The ID of the run step to retrieve. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`include`** | [**`Vector{String}`**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [default to nothing]

### Return type

[**`RunStepObject`**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_thread**
> `get_thread`(req::`HTTP.Request`, `thread_id`::`String`;) -> `ThreadObject`

Retrieves a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to retrieve. |

### Return type

[**`ThreadObject`**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_assistants**
> `list_assistants`(req::`HTTP.Request`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing,) -> `ListAssistantsResponse`

Returns a list of assistants.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]

### Return type

[**`ListAssistantsResponse`**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_messages**
> `list_messages`(req::`HTTP.Request`, `thread_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `run_id`=nothing,) -> `ListMessagesResponse`

Returns a list of messages for a given thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]
 **`run_id`** | **`String`**| Filter messages by the run ID that generated them.  | [default to nothing]

### Return type

[**`ListMessagesResponse`**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_run_steps**
> `list_run_steps`(req::`HTTP.Request`, `thread_id`::`String`, `run_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `include`=nothing,) -> `ListRunStepsResponse`

Returns a list of run steps belonging to a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread the run and run steps belong to. |
**`run_id`** | **`String`**| The ID of the run the run steps belong to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]
 **`include`** | [**`Vector{String}`**](String.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [default to nothing]

### Return type

[**`ListRunStepsResponse`**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_runs**
> `list_runs`(req::`HTTP.Request`, `thread_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing,) -> `ListRunsResponse`

Returns a list of runs belonging to a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread the run belongs to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]

### Return type

[**`ListRunsResponse`**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_assistant**
> `modify_assistant`(req::`HTTP.Request`, `assistant_id`::`String`, `modify_assistant_request`::`ModifyAssistantRequest`;) -> `AssistantObject`

Modifies an assistant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`assistant_id`** | **`String`**| The ID of the assistant to modify. |
**`modify_assistant_request`** | [**`ModifyAssistantRequest`**](ModifyAssistantRequest.md)|  |

### Return type

[**`AssistantObject`**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_message**
> `modify_message`(req::`HTTP.Request`, `thread_id`::`String`, `message_id`::`String`, `modify_message_request`::`ModifyMessageRequest`;) -> `MessageObject`

Modifies a message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to which this message belongs. |
**`message_id`** | **`String`**| The ID of the message to modify. |
**`modify_message_request`** | [**`ModifyMessageRequest`**](ModifyMessageRequest.md)|  |

### Return type

[**`MessageObject`**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_run**
> `modify_run`(req::`HTTP.Request`, `thread_id`::`String`, `run_id`::`String`, `modify_run_request`::`ModifyRunRequest`;) -> `RunObject`

Modifies a run.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the [thread](/docs/api-reference/threads) that was run. |
**`run_id`** | **`String`**| The ID of the run to modify. |
**`modify_run_request`** | [**`ModifyRunRequest`**](ModifyRunRequest.md)|  |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_thread**
> `modify_thread`(req::`HTTP.Request`, `thread_id`::`String`, `modify_thread_request`::`ModifyThreadRequest`;) -> `ThreadObject`

Modifies a thread.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. |
**`modify_thread_request`** | [**`ModifyThreadRequest`**](ModifyThreadRequest.md)|  |

### Return type

[**`ThreadObject`**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_tool_ouputs_to_run**
> `submit_tool_ouputs_to_run`(req::`HTTP.Request`, `thread_id`::`String`, `run_id`::`String`, `submit_tool_outputs_run_request`::`SubmitToolOutputsRunRequest`;) -> `RunObject`

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`thread_id`** | **`String`**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. |
**`run_id`** | **`String`**| The ID of the run that requires the tool output submission. |
**`submit_tool_outputs_run_request`** | [**`SubmitToolOutputsRunRequest`**](SubmitToolOutputsRunRequest.md)|  |

### Return type

[**`RunObject`**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

