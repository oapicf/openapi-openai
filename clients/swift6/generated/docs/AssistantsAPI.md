# AssistantsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](AssistantsAPI.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**createAssistant**](AssistantsAPI.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**createMessage**](AssistantsAPI.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**createRun**](AssistantsAPI.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run.
[**createThread**](AssistantsAPI.md#createthread) | **POST** /threads | Create a thread.
[**createThreadAndRun**](AssistantsAPI.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.
[**deleteAssistant**](AssistantsAPI.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**deleteMessage**](AssistantsAPI.md#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**deleteThread**](AssistantsAPI.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**getAssistant**](AssistantsAPI.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**getMessage**](AssistantsAPI.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**getRun**](AssistantsAPI.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**getRunStep**](AssistantsAPI.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**getThread**](AssistantsAPI.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**listAssistants**](AssistantsAPI.md#listassistants) | **GET** /assistants | Returns a list of assistants.
[**listMessages**](AssistantsAPI.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**listRunSteps**](AssistantsAPI.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**listRuns**](AssistantsAPI.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**modifyAssistant**](AssistantsAPI.md#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**modifyMessage**](AssistantsAPI.md#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modifyRun**](AssistantsAPI.md#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modifyThread**](AssistantsAPI.md#modifythread) | **POST** /threads/{thread_id} | Modifies a thread.
[**submitToolOuputsToRun**](AssistantsAPI.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


# **cancelRun**
```swift
    open class func cancelRun(threadId: String, runId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RunObject
```

Cancels a run that is `in_progress`.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to which this run belongs.
let runId = "runId_example" // String | The ID of the run to cancel.

// Cancels a run that is `in_progress`.
do {
    let response = try await AssistantsAPI.cancelRun(threadId: threadId, runId: runId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to which this run belongs. | 
 **runId** | **String** | The ID of the run to cancel. | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createAssistant**
```swift
    open class func createAssistant(createAssistantRequest: CreateAssistantRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AssistantObject
```

Create an assistant with a model and instructions.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createAssistantRequest = CreateAssistantRequest(model: CreateAssistantRequest_model(), name: "name_example", description: "description_example", instructions: "instructions_example", tools: [AssistantObject_tools_inner(type: "type_example", fileSearch: AssistantToolsFileSearch_file_search(maxNumResults: 123, rankingOptions: FileSearchRankingOptions(ranker: "ranker_example", scoreThreshold: 123)), function: FunctionObject(description: "description_example", name: "name_example", parameters: "TODO", strict: false))], toolResources: CreateAssistantRequest_tool_resources(codeInterpreter: CreateAssistantRequest_tool_resources_code_interpreter(fileIds: ["fileIds_example"]), fileSearch: CreateAssistantRequest_tool_resources_file_search(vectorStoreIds: ["vectorStoreIds_example"], vectorStores: [CreateAssistantRequest_tool_resources_file_search_vector_stores_inner(fileIds: ["fileIds_example"], chunkingStrategy: CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy(type: "type_example", _static: Static_Chunking_Strategy_static(maxChunkSizeTokens: 123, chunkOverlapTokens: 123)), metadata: 123)])), metadata: 123, temperature: 123, topP: 123, responseFormat: AssistantsApiResponseFormatOption(type: "type_example", jsonSchema: ResponseFormatJsonSchema_json_schema(description: "description_example", name: "name_example", schema: "TODO", strict: false))) // CreateAssistantRequest | 

// Create an assistant with a model and instructions.
do {
    let response = try await AssistantsAPI.createAssistant(createAssistantRequest: createAssistantRequest)
    dump(response)
} catch {
    print(error)
}
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

# **createMessage**
```swift
    open class func createMessage(threadId: String, createMessageRequest: CreateMessageRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> MessageObject
```

Create a message.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the [thread](/docs/api-reference/threads) to create a message for.
let createMessageRequest = CreateMessageRequest(role: "role_example", content: CreateMessageRequest_content(), attachments: [CreateMessageRequest_attachments_inner(fileId: "fileId_example", tools: [CreateMessageRequest_attachments_inner_tools_inner(type: "type_example")])], metadata: 123) // CreateMessageRequest | 

// Create a message.
do {
    let response = try await AssistantsAPI.createMessage(threadId: threadId, createMessageRequest: createMessageRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) to create a message for. | 
 **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md) |  | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createRun**
```swift
    open class func createRun(threadId: String, createRunRequest: CreateRunRequest, include: [Include_createRun]? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RunObject
```

Create a run.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to run.
let createRunRequest = CreateRunRequest(assistantId: "assistantId_example", model: CreateRunRequest_model(), instructions: "instructions_example", additionalInstructions: "additionalInstructions_example", additionalMessages: [CreateMessageRequest(role: "role_example", content: CreateMessageRequest_content(), attachments: [CreateMessageRequest_attachments_inner(fileId: "fileId_example", tools: [CreateMessageRequest_attachments_inner_tools_inner(type: "type_example")])], metadata: 123)], tools: [AssistantObject_tools_inner(type: "type_example", fileSearch: AssistantToolsFileSearch_file_search(maxNumResults: 123, rankingOptions: FileSearchRankingOptions(ranker: "ranker_example", scoreThreshold: 123)), function: FunctionObject(description: "description_example", name: "name_example", parameters: "TODO", strict: false))], metadata: 123, temperature: 123, topP: 123, stream: false, maxPromptTokens: 123, maxCompletionTokens: 123, truncationStrategy: TruncationObject(type: "type_example", lastMessages: 123), toolChoice: AssistantsApiToolChoiceOption(type: "type_example", function: AssistantsNamedToolChoice_function(name: "name_example")), parallelToolCalls: false, responseFormat: AssistantsApiResponseFormatOption(type: "type_example", jsonSchema: ResponseFormatJsonSchema_json_schema(description: "description_example", name: "name_example", schema: "TODO", strict: false))) // CreateRunRequest | 
let include = ["include_example"] // [String] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)

// Create a run.
do {
    let response = try await AssistantsAPI.createRun(threadId: threadId, createRunRequest: createRunRequest, include: include)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to run. | 
 **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md) |  | 
 **include** | [**[String]**](String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createThread**
```swift
    open class func createThread(createThreadRequest: CreateThreadRequest? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ThreadObject
```

Create a thread.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createThreadRequest = CreateThreadRequest(messages: [CreateMessageRequest(role: "role_example", content: CreateMessageRequest_content(), attachments: [CreateMessageRequest_attachments_inner(fileId: "fileId_example", tools: [CreateMessageRequest_attachments_inner_tools_inner(type: "type_example")])], metadata: 123)], toolResources: CreateThreadRequest_tool_resources(codeInterpreter: CreateAssistantRequest_tool_resources_code_interpreter(fileIds: ["fileIds_example"]), fileSearch: CreateThreadRequest_tool_resources_file_search(vectorStoreIds: ["vectorStoreIds_example"], vectorStores: [CreateThreadRequest_tool_resources_file_search_vector_stores_inner(fileIds: ["fileIds_example"], chunkingStrategy: CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy(type: "type_example", _static: Static_Chunking_Strategy_static(maxChunkSizeTokens: 123, chunkOverlapTokens: 123)), metadata: 123)])), metadata: 123) // CreateThreadRequest |  (optional)

// Create a thread.
do {
    let response = try await AssistantsAPI.createThread(createThreadRequest: createThreadRequest)
    dump(response)
} catch {
    print(error)
}
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

# **createThreadAndRun**
```swift
    open class func createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RunObject
```

Create a thread and run it in one request.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createThreadAndRunRequest = CreateThreadAndRunRequest(assistantId: "assistantId_example", thread: CreateThreadRequest(messages: [CreateMessageRequest(role: "role_example", content: CreateMessageRequest_content(), attachments: [CreateMessageRequest_attachments_inner(fileId: "fileId_example", tools: [CreateMessageRequest_attachments_inner_tools_inner(type: "type_example")])], metadata: 123)], toolResources: CreateThreadRequest_tool_resources(codeInterpreter: CreateAssistantRequest_tool_resources_code_interpreter(fileIds: ["fileIds_example"]), fileSearch: CreateThreadRequest_tool_resources_file_search(vectorStoreIds: ["vectorStoreIds_example"], vectorStores: [CreateThreadRequest_tool_resources_file_search_vector_stores_inner(fileIds: ["fileIds_example"], chunkingStrategy: CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy(type: "type_example", _static: Static_Chunking_Strategy_static(maxChunkSizeTokens: 123, chunkOverlapTokens: 123)), metadata: 123)])), metadata: 123), model: CreateRunRequest_model(), instructions: "instructions_example", tools: [CreateThreadAndRunRequest_tools_inner(type: "type_example", fileSearch: AssistantToolsFileSearch_file_search(maxNumResults: 123, rankingOptions: FileSearchRankingOptions(ranker: "ranker_example", scoreThreshold: 123)), function: FunctionObject(description: "description_example", name: "name_example", parameters: "TODO", strict: false))], toolResources: CreateThreadAndRunRequest_tool_resources(codeInterpreter: nil, fileSearch: AssistantObject_tool_resources_file_search(vectorStoreIds: ["vectorStoreIds_example"])), metadata: 123, temperature: 123, topP: 123, stream: false, maxPromptTokens: 123, maxCompletionTokens: 123, truncationStrategy: TruncationObject(type: "type_example", lastMessages: 123), toolChoice: AssistantsApiToolChoiceOption(type: "type_example", function: AssistantsNamedToolChoice_function(name: "name_example")), parallelToolCalls: false, responseFormat: AssistantsApiResponseFormatOption(type: "type_example", jsonSchema: ResponseFormatJsonSchema_json_schema(description: "description_example", name: "name_example", schema: "TODO", strict: false))) // CreateThreadAndRunRequest | 

// Create a thread and run it in one request.
do {
    let response = try await AssistantsAPI.createThreadAndRun(createThreadAndRunRequest: createThreadAndRunRequest)
    dump(response)
} catch {
    print(error)
}
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

# **deleteAssistant**
```swift
    open class func deleteAssistant(assistantId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> DeleteAssistantResponse
```

Delete an assistant.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let assistantId = "assistantId_example" // String | The ID of the assistant to delete.

// Delete an assistant.
do {
    let response = try await AssistantsAPI.deleteAssistant(assistantId: assistantId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String** | The ID of the assistant to delete. | 

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteMessage**
```swift
    open class func deleteMessage(threadId: String, messageId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> DeleteMessageResponse
```

Deletes a message.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to which this message belongs.
let messageId = "messageId_example" // String | The ID of the message to delete.

// Deletes a message.
do {
    let response = try await AssistantsAPI.deleteMessage(threadId: threadId, messageId: messageId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to which this message belongs. | 
 **messageId** | **String** | The ID of the message to delete. | 

### Return type

[**DeleteMessageResponse**](DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteThread**
```swift
    open class func deleteThread(threadId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> DeleteThreadResponse
```

Delete a thread.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to delete.

// Delete a thread.
do {
    let response = try await AssistantsAPI.deleteThread(threadId: threadId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to delete. | 

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssistant**
```swift
    open class func getAssistant(assistantId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AssistantObject
```

Retrieves an assistant.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let assistantId = "assistantId_example" // String | The ID of the assistant to retrieve.

// Retrieves an assistant.
do {
    let response = try await AssistantsAPI.getAssistant(assistantId: assistantId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String** | The ID of the assistant to retrieve. | 

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMessage**
```swift
    open class func getMessage(threadId: String, messageId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> MessageObject
```

Retrieve a message.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
let messageId = "messageId_example" // String | The ID of the message to retrieve.

// Retrieve a message.
do {
    let response = try await AssistantsAPI.getMessage(threadId: threadId, messageId: messageId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
 **messageId** | **String** | The ID of the message to retrieve. | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRun**
```swift
    open class func getRun(threadId: String, runId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RunObject
```

Retrieves a run.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the [thread](/docs/api-reference/threads) that was run.
let runId = "runId_example" // String | The ID of the run to retrieve.

// Retrieves a run.
do {
    let response = try await AssistantsAPI.getRun(threadId: threadId, runId: runId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **runId** | **String** | The ID of the run to retrieve. | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRunStep**
```swift
    open class func getRunStep(threadId: String, runId: String, stepId: String, include: [Include_getRunStep]? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RunStepObject
```

Retrieves a run step.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to which the run and run step belongs.
let runId = "runId_example" // String | The ID of the run to which the run step belongs.
let stepId = "stepId_example" // String | The ID of the run step to retrieve.
let include = ["include_example"] // [String] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)

// Retrieves a run step.
do {
    let response = try await AssistantsAPI.getRunStep(threadId: threadId, runId: runId, stepId: stepId, include: include)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to which the run and run step belongs. | 
 **runId** | **String** | The ID of the run to which the run step belongs. | 
 **stepId** | **String** | The ID of the run step to retrieve. | 
 **include** | [**[String]**](String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getThread**
```swift
    open class func getThread(threadId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ThreadObject
```

Retrieves a thread.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to retrieve.

// Retrieves a thread.
do {
    let response = try await AssistantsAPI.getThread(threadId: threadId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to retrieve. | 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listAssistants**
```swift
    open class func listAssistants(limit: Int? = nil, order: Order_listAssistants? = nil, after: String? = nil, before: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ListAssistantsResponse
```

Returns a list of assistants.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order = "order_example" // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to .desc)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

// Returns a list of assistants.
do {
    let response = try await AssistantsAPI.listAssistants(limit: limit, order: order, after: after, before: before)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to .desc]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listMessages**
```swift
    open class func listMessages(threadId: String, limit: Int? = nil, order: Order_listMessages? = nil, after: String? = nil, before: String? = nil, runId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ListMessagesResponse
```

Returns a list of messages for a given thread.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order = "order_example" // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to .desc)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
let runId = "runId_example" // String | Filter messages by the run ID that generated them.  (optional)

// Returns a list of messages for a given thread.
do {
    let response = try await AssistantsAPI.listMessages(threadId: threadId, limit: limit, order: order, after: after, before: before, runId: runId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to .desc]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **runId** | **String** | Filter messages by the run ID that generated them.  | [optional] 

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRunSteps**
```swift
    open class func listRunSteps(threadId: String, runId: String, limit: Int? = nil, order: Order_listRunSteps? = nil, after: String? = nil, before: String? = nil, include: [Include_listRunSteps]? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ListRunStepsResponse
```

Returns a list of run steps belonging to a run.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread the run and run steps belong to.
let runId = "runId_example" // String | The ID of the run the run steps belong to.
let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order = "order_example" // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to .desc)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
let include = ["include_example"] // [String] | A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)

// Returns a list of run steps belonging to a run.
do {
    let response = try await AssistantsAPI.listRunSteps(threadId: threadId, runId: runId, limit: limit, order: order, after: after, before: before, include: include)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread the run and run steps belong to. | 
 **runId** | **String** | The ID of the run the run steps belong to. | 
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to .desc]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **include** | [**[String]**](String.md) | A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRuns**
```swift
    open class func listRuns(threadId: String, limit: Int? = nil, order: Order_listRuns? = nil, after: String? = nil, before: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ListRunsResponse
```

Returns a list of runs belonging to a thread.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread the run belongs to.
let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order = "order_example" // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to .desc)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

// Returns a list of runs belonging to a thread.
do {
    let response = try await AssistantsAPI.listRuns(threadId: threadId, limit: limit, order: order, after: after, before: before)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread the run belongs to. | 
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to .desc]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyAssistant**
```swift
    open class func modifyAssistant(assistantId: String, modifyAssistantRequest: ModifyAssistantRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AssistantObject
```

Modifies an assistant.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let assistantId = "assistantId_example" // String | The ID of the assistant to modify.
let modifyAssistantRequest = ModifyAssistantRequest(model: "model_example", name: "name_example", description: "description_example", instructions: "instructions_example", tools: [AssistantObject_tools_inner(type: "type_example", fileSearch: AssistantToolsFileSearch_file_search(maxNumResults: 123, rankingOptions: FileSearchRankingOptions(ranker: "ranker_example", scoreThreshold: 123)), function: FunctionObject(description: "description_example", name: "name_example", parameters: "TODO", strict: false))], toolResources: ModifyAssistantRequest_tool_resources(codeInterpreter: ModifyAssistantRequest_tool_resources_code_interpreter(fileIds: ["fileIds_example"]), fileSearch: ModifyAssistantRequest_tool_resources_file_search(vectorStoreIds: ["vectorStoreIds_example"])), metadata: 123, temperature: 123, topP: 123, responseFormat: AssistantsApiResponseFormatOption(type: "type_example", jsonSchema: ResponseFormatJsonSchema_json_schema(description: "description_example", name: "name_example", schema: "TODO", strict: false))) // ModifyAssistantRequest | 

// Modifies an assistant.
do {
    let response = try await AssistantsAPI.modifyAssistant(assistantId: assistantId, modifyAssistantRequest: modifyAssistantRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **String** | The ID of the assistant to modify. | 
 **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md) |  | 

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyMessage**
```swift
    open class func modifyMessage(threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> MessageObject
```

Modifies a message.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to which this message belongs.
let messageId = "messageId_example" // String | The ID of the message to modify.
let modifyMessageRequest = ModifyMessageRequest(metadata: 123) // ModifyMessageRequest | 

// Modifies a message.
do {
    let response = try await AssistantsAPI.modifyMessage(threadId: threadId, messageId: messageId, modifyMessageRequest: modifyMessageRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to which this message belongs. | 
 **messageId** | **String** | The ID of the message to modify. | 
 **modifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md) |  | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyRun**
```swift
    open class func modifyRun(threadId: String, runId: String, modifyRunRequest: ModifyRunRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RunObject
```

Modifies a run.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the [thread](/docs/api-reference/threads) that was run.
let runId = "runId_example" // String | The ID of the run to modify.
let modifyRunRequest = ModifyRunRequest(metadata: 123) // ModifyRunRequest | 

// Modifies a run.
do {
    let response = try await AssistantsAPI.modifyRun(threadId: threadId, runId: runId, modifyRunRequest: modifyRunRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **runId** | **String** | The ID of the run to modify. | 
 **modifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md) |  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyThread**
```swift
    open class func modifyThread(threadId: String, modifyThreadRequest: ModifyThreadRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ThreadObject
```

Modifies a thread.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the thread to modify. Only the `metadata` can be modified.
let modifyThreadRequest = ModifyThreadRequest(toolResources: ModifyThreadRequest_tool_resources(codeInterpreter: CreateAssistantRequest_tool_resources_code_interpreter(fileIds: ["fileIds_example"]), fileSearch: ModifyThreadRequest_tool_resources_file_search(vectorStoreIds: ["vectorStoreIds_example"])), metadata: 123) // ModifyThreadRequest | 

// Modifies a thread.
do {
    let response = try await AssistantsAPI.modifyThread(threadId: threadId, modifyThreadRequest: modifyThreadRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | 
 **modifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md) |  | 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submitToolOuputsToRun**
```swift
    open class func submitToolOuputsToRun(threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RunObject
```

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let threadId = "threadId_example" // String | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
let runId = "runId_example" // String | The ID of the run that requires the tool output submission.
let submitToolOutputsRunRequest = SubmitToolOutputsRunRequest(toolOutputs: [SubmitToolOutputsRunRequest_tool_outputs_inner(toolCallId: "toolCallId_example", output: "output_example")], stream: false) // SubmitToolOutputsRunRequest | 

// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
do {
    let response = try await AssistantsAPI.submitToolOuputsToRun(threadId: threadId, runId: runId, submitToolOutputsRunRequest: submitToolOutputsRunRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
 **runId** | **String** | The ID of the run that requires the tool output submission. | 
 **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md) |  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

