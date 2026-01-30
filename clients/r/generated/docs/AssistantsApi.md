# AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelRun**](AssistantsApi.md#CancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**CreateAssistant**](AssistantsApi.md#CreateAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**CreateMessage**](AssistantsApi.md#CreateMessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**CreateRun**](AssistantsApi.md#CreateRun) | **POST** /threads/{thread_id}/runs | Create a run.
[**CreateThread**](AssistantsApi.md#CreateThread) | **POST** /threads | Create a thread.
[**CreateThreadAndRun**](AssistantsApi.md#CreateThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**DeleteAssistant**](AssistantsApi.md#DeleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**DeleteMessage**](AssistantsApi.md#DeleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**DeleteThread**](AssistantsApi.md#DeleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**GetAssistant**](AssistantsApi.md#GetAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**GetMessage**](AssistantsApi.md#GetMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**GetRun**](AssistantsApi.md#GetRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**GetRunStep**](AssistantsApi.md#GetRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**GetThread**](AssistantsApi.md#GetThread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**ListAssistants**](AssistantsApi.md#ListAssistants) | **GET** /assistants | Returns a list of assistants.
[**ListMessages**](AssistantsApi.md#ListMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**ListRunSteps**](AssistantsApi.md#ListRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**ListRuns**](AssistantsApi.md#ListRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**ModifyAssistant**](AssistantsApi.md#ModifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**ModifyMessage**](AssistantsApi.md#ModifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**ModifyRun**](AssistantsApi.md#ModifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**ModifyThread**](AssistantsApi.md#ModifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
[**SubmitToolOuputsToRun**](AssistantsApi.md#SubmitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


# **CancelRun**
> RunObject CancelRun(thread_id, run_id)

Cancels a run that is `in_progress`.

### Example
```R
library(openapi)

# Cancels a run that is `in_progress`.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to which this run belongs.
var_run_id <- "run_id_example" # character | The ID of the run to cancel.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CancelRun(var_thread_id, var_run_iddata_file = "result.txt")
result <- api_instance$CancelRun(var_thread_id, var_run_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to which this run belongs. | 
 **run_id** | **character**| The ID of the run to cancel. | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateAssistant**
> AssistantObject CreateAssistant(create_assistant_request)

Create an assistant with a model and instructions.

### Example
```R
library(openapi)

# Create an assistant with a model and instructions.
#
# prepare function argument(s)
var_create_assistant_request <- CreateAssistantRequest$new(CreateAssistantRequest_model$new(), "name_example", "description_example", "instructions_example", c(AssistantObject_tools_inner$new("code_interpreter", FunctionObject$new("name_example", "description_example", c(key = TODO), "strict_example"), AssistantToolsFileSearch_file_search$new(123, FileSearchRankingOptions$new(123, "auto")))), CreateAssistantRequest_tool_resources$new(CreateAssistantRequest_tool_resources_code_interpreter$new(c("file_ids_example")), CreateAssistantRequest_tool_resources_file_search$new(c("vector_store_ids_example"), c(CreateAssistantRequest_tool_resources_file_search_vector_stores_inner$new(c("file_ids_example"), CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy$new("auto", ...), 123)))), 123, 123, 123, AssistantsApiResponseFormatOption$new("text", ResponseFormatJsonSchema_json_schema$new("name_example", "description_example", c(key = TODO), "strict_example"))) # CreateAssistantRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateAssistant(var_create_assistant_requestdata_file = "result.txt")
result <- api_instance$CreateAssistant(var_create_assistant_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_assistant_request** | [**CreateAssistantRequest**](CreateAssistantRequest.md)|  | 

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateMessage**
> MessageObject CreateMessage(thread_id, create_message_request)

Create a message.

### Example
```R
library(openapi)

# Create a message.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the [thread](/docs/api-reference/threads) to create a message for.
var_create_message_request <- CreateMessageRequest$new("user", CreateMessageRequest_content$new(), c(CreateMessageRequest_attachments_inner$new("file_id_example", c(CreateMessageRequest_attachments_inner_tools_inner$new("code_interpreter")))), 123) # CreateMessageRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateMessage(var_thread_id, var_create_message_requestdata_file = "result.txt")
result <- api_instance$CreateMessage(var_thread_id, var_create_message_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | 
 **create_message_request** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateRun**
> RunObject CreateRun(thread_id, create_run_request, include = var.include)

Create a run.

### Example
```R
library(openapi)

# Create a run.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to run.
var_create_run_request <- CreateRunRequest$new("assistant_id_example", CreateRunRequest_model$new(), "instructions_example", "additional_instructions_example", c(CreateMessageRequest$new("user", CreateMessageRequest_content$new(), c(CreateMessageRequest_attachments_inner$new("file_id_example", c(CreateMessageRequest_attachments_inner_tools_inner$new("code_interpreter")))), 123)), c(AssistantObject_tools_inner$new("code_interpreter", FunctionObject$new("name_example", "description_example", c(key = TODO), "strict_example"), AssistantToolsFileSearch_file_search$new(123, FileSearchRankingOptions$new(123, "auto")))), 123, 123, 123, "stream_example", 123, 123, TruncationObject$new("auto", 123), AssistantsApiToolChoiceOption$new("function", AssistantsNamedToolChoice_function$new("name_example")), "parallel_tool_calls_example", AssistantsApiResponseFormatOption$new("text", ResponseFormatJsonSchema_json_schema$new("name_example", "description_example", c(key = TODO), "strict_example"))) # CreateRunRequest | 
var_include <- c("step_details.tool_calls[*].file_search.results[*].content") # array[character] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (Optional)

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateRun(var_thread_id, var_create_run_request, include = var_includedata_file = "result.txt")
result <- api_instance$CreateRun(var_thread_id, var_create_run_request, include = var_include)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to run. | 
 **create_run_request** | [**CreateRunRequest**](CreateRunRequest.md)|  | 
 **include** | Enum [step_details.tool_calls[*].file_search.results[*].content] | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateThread**
> ThreadObject CreateThread(create_thread_request = var.create_thread_request)

Create a thread.

### Example
```R
library(openapi)

# Create a thread.
#
# prepare function argument(s)
var_create_thread_request <- CreateThreadRequest$new(c(CreateMessageRequest$new("user", CreateMessageRequest_content$new(), c(CreateMessageRequest_attachments_inner$new("file_id_example", c(CreateMessageRequest_attachments_inner_tools_inner$new("code_interpreter")))), 123)), CreateThreadRequest_tool_resources$new(CreateAssistantRequest_tool_resources_code_interpreter$new(c("file_ids_example")), CreateThreadRequest_tool_resources_file_search$new(c("vector_store_ids_example"), c(CreateThreadRequest_tool_resources_file_search_vector_stores_inner$new(c("file_ids_example"), CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy$new("auto", ...), 123)))), 123) # CreateThreadRequest |  (Optional)

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateThread(create_thread_request = var_create_thread_requestdata_file = "result.txt")
result <- api_instance$CreateThread(create_thread_request = var_create_thread_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_thread_request** | [**CreateThreadRequest**](CreateThreadRequest.md)|  | [optional] 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateThreadAndRun**
> RunObject CreateThreadAndRun(create_thread_and_run_request)

Create a thread and run it in one request.

### Example
```R
library(openapi)

# Create a thread and run it in one request.
#
# prepare function argument(s)
var_create_thread_and_run_request <- CreateThreadAndRunRequest$new("assistant_id_example", CreateThreadRequest$new(c(CreateMessageRequest$new("user", CreateMessageRequest_content$new(), c(CreateMessageRequest_attachments_inner$new("file_id_example", c(...))), 123)), CreateThreadRequest_tool_resources$new(CreateAssistantRequest_tool_resources_code_interpreter$new(c("file_ids_example")), CreateThreadRequest_tool_resources_file_search$new(c("vector_store_ids_example"), c(CreateThreadRequest_tool_resources_file_search_vector_stores_inner$new(c(...), ..., 123)))), 123), CreateRunRequest_model$new(), "instructions_example", c(CreateThreadAndRunRequest_tools_inner$new("code_interpreter", FunctionObject$new("name_example", "description_example", c(key = TODO), "strict_example"), AssistantToolsFileSearch_file_search$new(123, FileSearchRankingOptions$new(123, "auto")))), CreateThreadAndRunRequest_tool_resources$new(CreateAssistantRequest_tool_resources_code_interpreter$new(c("file_ids_example")), AssistantObject_tool_resources_file_search$new(c("vector_store_ids_example"))), 123, 123, 123, "stream_example", 123, 123, TruncationObject$new("auto", 123), AssistantsApiToolChoiceOption$new("function", AssistantsNamedToolChoice_function$new("name_example")), "parallel_tool_calls_example", AssistantsApiResponseFormatOption$new("text", ResponseFormatJsonSchema_json_schema$new("name_example", "description_example", c(key = TODO), "strict_example"))) # CreateThreadAndRunRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateThreadAndRun(var_create_thread_and_run_requestdata_file = "result.txt")
result <- api_instance$CreateThreadAndRun(var_create_thread_and_run_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_thread_and_run_request** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DeleteAssistant**
> DeleteAssistantResponse DeleteAssistant(assistant_id)

Delete an assistant.

### Example
```R
library(openapi)

# Delete an assistant.
#
# prepare function argument(s)
var_assistant_id <- "assistant_id_example" # character | The ID of the assistant to delete.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteAssistant(var_assistant_iddata_file = "result.txt")
result <- api_instance$DeleteAssistant(var_assistant_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistant_id** | **character**| The ID of the assistant to delete. | 

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DeleteMessage**
> DeleteMessageResponse DeleteMessage(thread_id, message_id)

Deletes a message.

### Example
```R
library(openapi)

# Deletes a message.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to which this message belongs.
var_message_id <- "message_id_example" # character | The ID of the message to delete.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteMessage(var_thread_id, var_message_iddata_file = "result.txt")
result <- api_instance$DeleteMessage(var_thread_id, var_message_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to which this message belongs. | 
 **message_id** | **character**| The ID of the message to delete. | 

### Return type

[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DeleteThread**
> DeleteThreadResponse DeleteThread(thread_id)

Delete a thread.

### Example
```R
library(openapi)

# Delete a thread.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to delete.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteThread(var_thread_iddata_file = "result.txt")
result <- api_instance$DeleteThread(var_thread_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to delete. | 

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **GetAssistant**
> AssistantObject GetAssistant(assistant_id)

Retrieves an assistant.

### Example
```R
library(openapi)

# Retrieves an assistant.
#
# prepare function argument(s)
var_assistant_id <- "assistant_id_example" # character | The ID of the assistant to retrieve.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetAssistant(var_assistant_iddata_file = "result.txt")
result <- api_instance$GetAssistant(var_assistant_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistant_id** | **character**| The ID of the assistant to retrieve. | 

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **GetMessage**
> MessageObject GetMessage(thread_id, message_id)

Retrieve a message.

### Example
```R
library(openapi)

# Retrieve a message.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
var_message_id <- "message_id_example" # character | The ID of the message to retrieve.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetMessage(var_thread_id, var_message_iddata_file = "result.txt")
result <- api_instance$GetMessage(var_thread_id, var_message_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
 **message_id** | **character**| The ID of the message to retrieve. | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **GetRun**
> RunObject GetRun(thread_id, run_id)

Retrieves a run.

### Example
```R
library(openapi)

# Retrieves a run.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the [thread](/docs/api-reference/threads) that was run.
var_run_id <- "run_id_example" # character | The ID of the run to retrieve.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetRun(var_thread_id, var_run_iddata_file = "result.txt")
result <- api_instance$GetRun(var_thread_id, var_run_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **run_id** | **character**| The ID of the run to retrieve. | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **GetRunStep**
> RunStepObject GetRunStep(thread_id, run_id, step_id, include = var.include)

Retrieves a run step.

### Example
```R
library(openapi)

# Retrieves a run step.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to which the run and run step belongs.
var_run_id <- "run_id_example" # character | The ID of the run to which the run step belongs.
var_step_id <- "step_id_example" # character | The ID of the run step to retrieve.
var_include <- c("step_details.tool_calls[*].file_search.results[*].content") # array[character] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (Optional)

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetRunStep(var_thread_id, var_run_id, var_step_id, include = var_includedata_file = "result.txt")
result <- api_instance$GetRunStep(var_thread_id, var_run_id, var_step_id, include = var_include)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to which the run and run step belongs. | 
 **run_id** | **character**| The ID of the run to which the run step belongs. | 
 **step_id** | **character**| The ID of the run step to retrieve. | 
 **include** | Enum [step_details.tool_calls[*].file_search.results[*].content] | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **GetThread**
> ThreadObject GetThread(thread_id)

Retrieves a thread.

### Example
```R
library(openapi)

# Retrieves a thread.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to retrieve.

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetThread(var_thread_iddata_file = "result.txt")
result <- api_instance$GetThread(var_thread_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to retrieve. | 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListAssistants**
> ListAssistantsResponse ListAssistants(limit = 20, order = "desc", after = var.after, before = var.before)

Returns a list of assistants.

### Example
```R
library(openapi)

# Returns a list of assistants.
#
# prepare function argument(s)
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListAssistants(limit = var_limit, order = var_order, after = var_after, before = var_beforedata_file = "result.txt")
result <- api_instance$ListAssistants(limit = var_limit, order = var_order, after = var_after, before = var_before)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListMessages**
> ListMessagesResponse ListMessages(thread_id, limit = 20, order = "desc", after = var.after, before = var.before, run_id = var.run_id)

Returns a list of messages for a given thread.

### Example
```R
library(openapi)

# Returns a list of messages for a given thread.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)
var_run_id <- "run_id_example" # character | Filter messages by the run ID that generated them.  (Optional)

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListMessages(var_thread_id, limit = var_limit, order = var_order, after = var_after, before = var_before, run_id = var_run_iddata_file = "result.txt")
result <- api_instance$ListMessages(var_thread_id, limit = var_limit, order = var_order, after = var_after, before = var_before, run_id = var_run_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **run_id** | **character**| Filter messages by the run ID that generated them.  | [optional] 

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListRunSteps**
> ListRunStepsResponse ListRunSteps(thread_id, run_id, limit = 20, order = "desc", after = var.after, before = var.before, include = var.include)

Returns a list of run steps belonging to a run.

### Example
```R
library(openapi)

# Returns a list of run steps belonging to a run.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread the run and run steps belong to.
var_run_id <- "run_id_example" # character | The ID of the run the run steps belong to.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)
var_include <- c("step_details.tool_calls[*].file_search.results[*].content") # array[character] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (Optional)

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListRunSteps(var_thread_id, var_run_id, limit = var_limit, order = var_order, after = var_after, before = var_before, include = var_includedata_file = "result.txt")
result <- api_instance$ListRunSteps(var_thread_id, var_run_id, limit = var_limit, order = var_order, after = var_after, before = var_before, include = var_include)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread the run and run steps belong to. | 
 **run_id** | **character**| The ID of the run the run steps belong to. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **include** | Enum [step_details.tool_calls[*].file_search.results[*].content] | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListRuns**
> ListRunsResponse ListRuns(thread_id, limit = 20, order = "desc", after = var.after, before = var.before)

Returns a list of runs belonging to a thread.

### Example
```R
library(openapi)

# Returns a list of runs belonging to a thread.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread the run belongs to.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListRuns(var_thread_id, limit = var_limit, order = var_order, after = var_after, before = var_beforedata_file = "result.txt")
result <- api_instance$ListRuns(var_thread_id, limit = var_limit, order = var_order, after = var_after, before = var_before)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread the run belongs to. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ModifyAssistant**
> AssistantObject ModifyAssistant(assistant_id, modify_assistant_request)

Modifies an assistant.

### Example
```R
library(openapi)

# Modifies an assistant.
#
# prepare function argument(s)
var_assistant_id <- "assistant_id_example" # character | The ID of the assistant to modify.
var_modify_assistant_request <- ModifyAssistantRequest$new("model_example", "name_example", "description_example", "instructions_example", c(AssistantObject_tools_inner$new("code_interpreter", FunctionObject$new("name_example", "description_example", c(key = TODO), "strict_example"), AssistantToolsFileSearch_file_search$new(123, FileSearchRankingOptions$new(123, "auto")))), ModifyAssistantRequest_tool_resources$new(ModifyAssistantRequest_tool_resources_code_interpreter$new(c("file_ids_example")), ModifyAssistantRequest_tool_resources_file_search$new(c("vector_store_ids_example"))), 123, 123, 123, AssistantsApiResponseFormatOption$new("text", ResponseFormatJsonSchema_json_schema$new("name_example", "description_example", c(key = TODO), "strict_example"))) # ModifyAssistantRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyAssistant(var_assistant_id, var_modify_assistant_requestdata_file = "result.txt")
result <- api_instance$ModifyAssistant(var_assistant_id, var_modify_assistant_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistant_id** | **character**| The ID of the assistant to modify. | 
 **modify_assistant_request** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md)|  | 

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ModifyMessage**
> MessageObject ModifyMessage(thread_id, message_id, modify_message_request)

Modifies a message.

### Example
```R
library(openapi)

# Modifies a message.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to which this message belongs.
var_message_id <- "message_id_example" # character | The ID of the message to modify.
var_modify_message_request <- ModifyMessageRequest$new(123) # ModifyMessageRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyMessage(var_thread_id, var_message_id, var_modify_message_requestdata_file = "result.txt")
result <- api_instance$ModifyMessage(var_thread_id, var_message_id, var_modify_message_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to which this message belongs. | 
 **message_id** | **character**| The ID of the message to modify. | 
 **modify_message_request** | [**ModifyMessageRequest**](ModifyMessageRequest.md)|  | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ModifyRun**
> RunObject ModifyRun(thread_id, run_id, modify_run_request)

Modifies a run.

### Example
```R
library(openapi)

# Modifies a run.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the [thread](/docs/api-reference/threads) that was run.
var_run_id <- "run_id_example" # character | The ID of the run to modify.
var_modify_run_request <- ModifyRunRequest$new(123) # ModifyRunRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyRun(var_thread_id, var_run_id, var_modify_run_requestdata_file = "result.txt")
result <- api_instance$ModifyRun(var_thread_id, var_run_id, var_modify_run_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **run_id** | **character**| The ID of the run to modify. | 
 **modify_run_request** | [**ModifyRunRequest**](ModifyRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ModifyThread**
> ThreadObject ModifyThread(thread_id, modify_thread_request)

Modifies a thread.

### Example
```R
library(openapi)

# Modifies a thread.
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the thread to modify. Only the `metadata` can be modified.
var_modify_thread_request <- ModifyThreadRequest$new(ModifyThreadRequest_tool_resources$new(CreateAssistantRequest_tool_resources_code_interpreter$new(c("file_ids_example")), ModifyThreadRequest_tool_resources_file_search$new(c("vector_store_ids_example"))), 123) # ModifyThreadRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyThread(var_thread_id, var_modify_thread_requestdata_file = "result.txt")
result <- api_instance$ModifyThread(var_thread_id, var_modify_thread_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | 
 **modify_thread_request** | [**ModifyThreadRequest**](ModifyThreadRequest.md)|  | 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **SubmitToolOuputsToRun**
> RunObject SubmitToolOuputsToRun(thread_id, run_id, submit_tool_outputs_run_request)

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Example
```R
library(openapi)

# When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
#
# prepare function argument(s)
var_thread_id <- "thread_id_example" # character | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
var_run_id <- "run_id_example" # character | The ID of the run that requires the tool output submission.
var_submit_tool_outputs_run_request <- SubmitToolOutputsRunRequest$new(c(SubmitToolOutputsRunRequest_tool_outputs_inner$new("tool_call_id_example", "output_example")), "stream_example") # SubmitToolOutputsRunRequest | 

api_instance <- AssistantsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SubmitToolOuputsToRun(var_thread_id, var_run_id, var_submit_tool_outputs_run_requestdata_file = "result.txt")
result <- api_instance$SubmitToolOuputsToRun(var_thread_id, var_run_id, var_submit_tool_outputs_run_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **character**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
 **run_id** | **character**| The ID of the run that requires the tool output submission. | 
 **submit_tool_outputs_run_request** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

