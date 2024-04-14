# \AssistantsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelRun**](AssistantsAPI.md#CancelRun) | **Post** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**CreateAssistant**](AssistantsAPI.md#CreateAssistant) | **Post** /assistants | Create an assistant with a model and instructions.
[**CreateAssistantFile**](AssistantsAPI.md#CreateAssistantFile) | **Post** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
[**CreateMessage**](AssistantsAPI.md#CreateMessage) | **Post** /threads/{thread_id}/messages | Create a message.
[**CreateRun**](AssistantsAPI.md#CreateRun) | **Post** /threads/{thread_id}/runs | Create a run.
[**CreateThread**](AssistantsAPI.md#CreateThread) | **Post** /threads | Create a thread.
[**CreateThreadAndRun**](AssistantsAPI.md#CreateThreadAndRun) | **Post** /threads/runs | Create a thread and run it in one request.
[**DeleteAssistant**](AssistantsAPI.md#DeleteAssistant) | **Delete** /assistants/{assistant_id} | Delete an assistant.
[**DeleteAssistantFile**](AssistantsAPI.md#DeleteAssistantFile) | **Delete** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
[**DeleteThread**](AssistantsAPI.md#DeleteThread) | **Delete** /threads/{thread_id} | Delete a thread.
[**GetAssistant**](AssistantsAPI.md#GetAssistant) | **Get** /assistants/{assistant_id} | Retrieves an assistant.
[**GetAssistantFile**](AssistantsAPI.md#GetAssistantFile) | **Get** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
[**GetMessage**](AssistantsAPI.md#GetMessage) | **Get** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**GetMessageFile**](AssistantsAPI.md#GetMessageFile) | **Get** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
[**GetRun**](AssistantsAPI.md#GetRun) | **Get** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**GetRunStep**](AssistantsAPI.md#GetRunStep) | **Get** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**GetThread**](AssistantsAPI.md#GetThread) | **Get** /threads/{thread_id} | Retrieves a thread.
[**ListAssistantFiles**](AssistantsAPI.md#ListAssistantFiles) | **Get** /assistants/{assistant_id}/files | Returns a list of assistant files.
[**ListAssistants**](AssistantsAPI.md#ListAssistants) | **Get** /assistants | Returns a list of assistants.
[**ListMessageFiles**](AssistantsAPI.md#ListMessageFiles) | **Get** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
[**ListMessages**](AssistantsAPI.md#ListMessages) | **Get** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**ListRunSteps**](AssistantsAPI.md#ListRunSteps) | **Get** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**ListRuns**](AssistantsAPI.md#ListRuns) | **Get** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**ModifyAssistant**](AssistantsAPI.md#ModifyAssistant) | **Post** /assistants/{assistant_id} | Modifies an assistant.
[**ModifyMessage**](AssistantsAPI.md#ModifyMessage) | **Post** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**ModifyRun**](AssistantsAPI.md#ModifyRun) | **Post** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**ModifyThread**](AssistantsAPI.md#ModifyThread) | **Post** /threads/{thread_id} | Modifies a thread.
[**SubmitToolOuputsToRun**](AssistantsAPI.md#SubmitToolOuputsToRun) | **Post** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 



## CancelRun

> RunObject CancelRun(ctx, threadId, runId).Execute()

Cancels a run that is `in_progress`.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread to which this run belongs.
	runId := "runId_example" // string | The ID of the run to cancel.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.CancelRun(context.Background(), threadId, runId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.CancelRun``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CancelRun`: RunObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.CancelRun`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to which this run belongs. | 
**runId** | **string** | The ID of the run to cancel. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelRunRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateAssistant

> AssistantObject CreateAssistant(ctx).CreateAssistantRequest(createAssistantRequest).Execute()

Create an assistant with a model and instructions.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	createAssistantRequest := *openapiclient.NewCreateAssistantRequest(*openapiclient.NewCreateAssistantRequestModel()) // CreateAssistantRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.CreateAssistant(context.Background()).CreateAssistantRequest(createAssistantRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.CreateAssistant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateAssistant`: AssistantObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.CreateAssistant`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateAssistantRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateAssistantFile

> AssistantFileObject CreateAssistantFile(ctx, assistantId).CreateAssistantFileRequest(createAssistantFileRequest).Execute()

Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	assistantId := "file-abc123" // string | The ID of the assistant for which to create a File. 
	createAssistantFileRequest := *openapiclient.NewCreateAssistantFileRequest("FileId_example") // CreateAssistantFileRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.CreateAssistantFile(context.Background(), assistantId).CreateAssistantFileRequest(createAssistantFileRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.CreateAssistantFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateAssistantFile`: AssistantFileObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.CreateAssistantFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**assistantId** | **string** | The ID of the assistant for which to create a File.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateAssistantFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createAssistantFileRequest** | [**CreateAssistantFileRequest**](CreateAssistantFileRequest.md) |  | 

### Return type

[**AssistantFileObject**](AssistantFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateMessage

> MessageObject CreateMessage(ctx, threadId).CreateMessageRequest(createMessageRequest).Execute()

Create a message.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the [thread](/docs/api-reference/threads) to create a message for.
	createMessageRequest := *openapiclient.NewCreateMessageRequest("Role_example", "Content_example") // CreateMessageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.CreateMessage(context.Background(), threadId).CreateMessageRequest(createMessageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.CreateMessage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateMessage`: MessageObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.CreateMessage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to create a message for. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md) |  | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateRun

> RunObject CreateRun(ctx, threadId).CreateRunRequest(createRunRequest).Execute()

Create a run.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread to run.
	createRunRequest := *openapiclient.NewCreateRunRequest("AssistantId_example") // CreateRunRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.CreateRun(context.Background(), threadId).CreateRunRequest(createRunRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.CreateRun``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateRun`: RunObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.CreateRun`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to run. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateRunRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createRunRequest** | [**CreateRunRequest**](CreateRunRequest.md) |  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateThread

> ThreadObject CreateThread(ctx).CreateThreadRequest(createThreadRequest).Execute()

Create a thread.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	createThreadRequest := *openapiclient.NewCreateThreadRequest() // CreateThreadRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.CreateThread(context.Background()).CreateThreadRequest(createThreadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.CreateThread``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateThread`: ThreadObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.CreateThread`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateThreadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadRequest** | [**CreateThreadRequest**](CreateThreadRequest.md) |  | 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateThreadAndRun

> RunObject CreateThreadAndRun(ctx).CreateThreadAndRunRequest(createThreadAndRunRequest).Execute()

Create a thread and run it in one request.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	createThreadAndRunRequest := *openapiclient.NewCreateThreadAndRunRequest("AssistantId_example") // CreateThreadAndRunRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.CreateThreadAndRun(context.Background()).CreateThreadAndRunRequest(createThreadAndRunRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.CreateThreadAndRun``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateThreadAndRun`: RunObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.CreateThreadAndRun`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateThreadAndRunRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteAssistant

> DeleteAssistantResponse DeleteAssistant(ctx, assistantId).Execute()

Delete an assistant.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	assistantId := "assistantId_example" // string | The ID of the assistant to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.DeleteAssistant(context.Background(), assistantId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.DeleteAssistant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteAssistant`: DeleteAssistantResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.DeleteAssistant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**assistantId** | **string** | The ID of the assistant to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteAssistantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteAssistantFile

> DeleteAssistantFileResponse DeleteAssistantFile(ctx, assistantId, fileId).Execute()

Delete an assistant file.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	assistantId := "assistantId_example" // string | The ID of the assistant that the file belongs to.
	fileId := "fileId_example" // string | The ID of the file to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.DeleteAssistantFile(context.Background(), assistantId, fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.DeleteAssistantFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteAssistantFile`: DeleteAssistantFileResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.DeleteAssistantFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**assistantId** | **string** | The ID of the assistant that the file belongs to. | 
**fileId** | **string** | The ID of the file to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteAssistantFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**DeleteAssistantFileResponse**](DeleteAssistantFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteThread

> DeleteThreadResponse DeleteThread(ctx, threadId).Execute()

Delete a thread.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.DeleteThread(context.Background(), threadId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.DeleteThread``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteThread`: DeleteThreadResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.DeleteThread`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteThreadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAssistant

> AssistantObject GetAssistant(ctx, assistantId).Execute()

Retrieves an assistant.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	assistantId := "assistantId_example" // string | The ID of the assistant to retrieve.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.GetAssistant(context.Background(), assistantId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.GetAssistant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAssistant`: AssistantObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.GetAssistant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**assistantId** | **string** | The ID of the assistant to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAssistantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAssistantFile

> AssistantFileObject GetAssistantFile(ctx, assistantId, fileId).Execute()

Retrieves an AssistantFile.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	assistantId := "assistantId_example" // string | The ID of the assistant who the file belongs to.
	fileId := "fileId_example" // string | The ID of the file we're getting.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.GetAssistantFile(context.Background(), assistantId, fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.GetAssistantFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAssistantFile`: AssistantFileObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.GetAssistantFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**assistantId** | **string** | The ID of the assistant who the file belongs to. | 
**fileId** | **string** | The ID of the file we&#39;re getting. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAssistantFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**AssistantFileObject**](AssistantFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMessage

> MessageObject GetMessage(ctx, threadId, messageId).Execute()

Retrieve a message.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
	messageId := "messageId_example" // string | The ID of the message to retrieve.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.GetMessage(context.Background(), threadId, messageId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.GetMessage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetMessage`: MessageObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.GetMessage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
**messageId** | **string** | The ID of the message to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMessageFile

> MessageFileObject GetMessageFile(ctx, threadId, messageId, fileId).Execute()

Retrieves a message file.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "thread_abc123" // string | The ID of the thread to which the message and File belong.
	messageId := "msg_abc123" // string | The ID of the message the file belongs to.
	fileId := "file-abc123" // string | The ID of the file being retrieved.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.GetMessageFile(context.Background(), threadId, messageId, fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.GetMessageFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetMessageFile`: MessageFileObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.GetMessageFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to which the message and File belong. | 
**messageId** | **string** | The ID of the message the file belongs to. | 
**fileId** | **string** | The ID of the file being retrieved. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetMessageFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[**MessageFileObject**](MessageFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetRun

> RunObject GetRun(ctx, threadId, runId).Execute()

Retrieves a run.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the [thread](/docs/api-reference/threads) that was run.
	runId := "runId_example" // string | The ID of the run to retrieve.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.GetRun(context.Background(), threadId, runId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.GetRun``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetRun`: RunObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.GetRun`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**runId** | **string** | The ID of the run to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetRunRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetRunStep

> RunStepObject GetRunStep(ctx, threadId, runId, stepId).Execute()

Retrieves a run step.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread to which the run and run step belongs.
	runId := "runId_example" // string | The ID of the run to which the run step belongs.
	stepId := "stepId_example" // string | The ID of the run step to retrieve.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.GetRunStep(context.Background(), threadId, runId, stepId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.GetRunStep``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetRunStep`: RunStepObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.GetRunStep`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to which the run and run step belongs. | 
**runId** | **string** | The ID of the run to which the run step belongs. | 
**stepId** | **string** | The ID of the run step to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetRunStepRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[**RunStepObject**](RunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetThread

> ThreadObject GetThread(ctx, threadId).Execute()

Retrieves a thread.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread to retrieve.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.GetThread(context.Background(), threadId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.GetThread``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetThread`: ThreadObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.GetThread`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetThreadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAssistantFiles

> ListAssistantFilesResponse ListAssistantFiles(ctx, assistantId).Limit(limit).Order(order).After(after).Before(before).Execute()

Returns a list of assistant files.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	assistantId := "assistantId_example" // string | The ID of the assistant the file belongs to.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ListAssistantFiles(context.Background(), assistantId).Limit(limit).Order(order).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ListAssistantFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListAssistantFiles`: ListAssistantFilesResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ListAssistantFiles`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**assistantId** | **string** | The ID of the assistant the file belongs to. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListAssistantFilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ListAssistantFilesResponse**](ListAssistantFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAssistants

> ListAssistantsResponse ListAssistants(ctx).Limit(limit).Order(order).After(after).Before(before).Execute()

Returns a list of assistants.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ListAssistants(context.Background()).Limit(limit).Order(order).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ListAssistants``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListAssistants`: ListAssistantsResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ListAssistants`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListAssistantsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMessageFiles

> ListMessageFilesResponse ListMessageFiles(ctx, threadId, messageId).Limit(limit).Order(order).After(after).Before(before).Execute()

Returns a list of message files.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread that the message and files belong to.
	messageId := "messageId_example" // string | The ID of the message that the files belongs to.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ListMessageFiles(context.Background(), threadId, messageId).Limit(limit).Order(order).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ListMessageFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListMessageFiles`: ListMessageFilesResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ListMessageFiles`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread that the message and files belong to. | 
**messageId** | **string** | The ID of the message that the files belongs to. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListMessageFilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ListMessageFilesResponse**](ListMessageFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMessages

> ListMessagesResponse ListMessages(ctx, threadId).Limit(limit).Order(order).After(after).Before(before).RunId(runId).Execute()

Returns a list of messages for a given thread.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
	runId := "runId_example" // string | Filter messages by the run ID that generated them.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ListMessages(context.Background(), threadId).Limit(limit).Order(order).After(after).Before(before).RunId(runId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ListMessages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListMessages`: ListMessagesResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ListMessages`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 
 **runId** | **string** | Filter messages by the run ID that generated them.  | 

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListRunSteps

> ListRunStepsResponse ListRunSteps(ctx, threadId, runId).Limit(limit).Order(order).After(after).Before(before).Execute()

Returns a list of run steps belonging to a run.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread the run and run steps belong to.
	runId := "runId_example" // string | The ID of the run the run steps belong to.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ListRunSteps(context.Background(), threadId, runId).Limit(limit).Order(order).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ListRunSteps``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListRunSteps`: ListRunStepsResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ListRunSteps`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread the run and run steps belong to. | 
**runId** | **string** | The ID of the run the run steps belong to. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListRunStepsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListRuns

> ListRunsResponse ListRuns(ctx, threadId).Limit(limit).Order(order).After(after).Before(before).Execute()

Returns a list of runs belonging to a thread.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread the run belongs to.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ListRuns(context.Background(), threadId).Limit(limit).Order(order).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ListRuns``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListRuns`: ListRunsResponse
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ListRuns`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread the run belongs to. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListRunsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ListRunsResponse**](ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModifyAssistant

> AssistantObject ModifyAssistant(ctx, assistantId).ModifyAssistantRequest(modifyAssistantRequest).Execute()

Modifies an assistant.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	assistantId := "assistantId_example" // string | The ID of the assistant to modify.
	modifyAssistantRequest := *openapiclient.NewModifyAssistantRequest() // ModifyAssistantRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ModifyAssistant(context.Background(), assistantId).ModifyAssistantRequest(modifyAssistantRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ModifyAssistant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModifyAssistant`: AssistantObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ModifyAssistant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**assistantId** | **string** | The ID of the assistant to modify. | 

### Other Parameters

Other parameters are passed through a pointer to a apiModifyAssistantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md) |  | 

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModifyMessage

> MessageObject ModifyMessage(ctx, threadId, messageId).ModifyMessageRequest(modifyMessageRequest).Execute()

Modifies a message.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread to which this message belongs.
	messageId := "messageId_example" // string | The ID of the message to modify.
	modifyMessageRequest := *openapiclient.NewModifyMessageRequest() // ModifyMessageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ModifyMessage(context.Background(), threadId, messageId).ModifyMessageRequest(modifyMessageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ModifyMessage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModifyMessage`: MessageObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ModifyMessage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to which this message belongs. | 
**messageId** | **string** | The ID of the message to modify. | 

### Other Parameters

Other parameters are passed through a pointer to a apiModifyMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **modifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md) |  | 

### Return type

[**MessageObject**](MessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModifyRun

> RunObject ModifyRun(ctx, threadId, runId).ModifyRunRequest(modifyRunRequest).Execute()

Modifies a run.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the [thread](/docs/api-reference/threads) that was run.
	runId := "runId_example" // string | The ID of the run to modify.
	modifyRunRequest := *openapiclient.NewModifyRunRequest() // ModifyRunRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ModifyRun(context.Background(), threadId, runId).ModifyRunRequest(modifyRunRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ModifyRun``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModifyRun`: RunObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ModifyRun`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**runId** | **string** | The ID of the run to modify. | 

### Other Parameters

Other parameters are passed through a pointer to a apiModifyRunRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **modifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md) |  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModifyThread

> ThreadObject ModifyThread(ctx, threadId).ModifyThreadRequest(modifyThreadRequest).Execute()

Modifies a thread.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the thread to modify. Only the `metadata` can be modified.
	modifyThreadRequest := *openapiclient.NewModifyThreadRequest() // ModifyThreadRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.ModifyThread(context.Background(), threadId).ModifyThreadRequest(modifyThreadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.ModifyThread``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModifyThread`: ThreadObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.ModifyThread`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | 

### Other Parameters

Other parameters are passed through a pointer to a apiModifyThreadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **modifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md) |  | 

### Return type

[**ThreadObject**](ThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SubmitToolOuputsToRun

> RunObject SubmitToolOuputsToRun(ctx, threadId, runId).SubmitToolOutputsRunRequest(submitToolOutputsRunRequest).Execute()

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	threadId := "threadId_example" // string | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
	runId := "runId_example" // string | The ID of the run that requires the tool output submission.
	submitToolOutputsRunRequest := *openapiclient.NewSubmitToolOutputsRunRequest([]openapiclient.SubmitToolOutputsRunRequestToolOutputsInner{*openapiclient.NewSubmitToolOutputsRunRequestToolOutputsInner()}) // SubmitToolOutputsRunRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssistantsAPI.SubmitToolOuputsToRun(context.Background(), threadId, runId).SubmitToolOutputsRunRequest(submitToolOutputsRunRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssistantsAPI.SubmitToolOuputsToRun``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SubmitToolOuputsToRun`: RunObject
	fmt.Fprintf(os.Stdout, "Response from `AssistantsAPI.SubmitToolOuputsToRun`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
**runId** | **string** | The ID of the run that requires the tool output submission. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSubmitToolOuputsToRunRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **submitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md) |  | 

### Return type

[**RunObject**](RunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

