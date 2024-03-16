# \OpenAIAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelFineTune**](OpenAIAPI.md#CancelFineTune) | **Post** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**CreateChatCompletion**](OpenAIAPI.md#CreateChatCompletion) | **Post** /chat/completions | Creates a model response for the given chat conversation.
[**CreateCompletion**](OpenAIAPI.md#CreateCompletion) | **Post** /completions | Creates a completion for the provided prompt and parameters.
[**CreateEdit**](OpenAIAPI.md#CreateEdit) | **Post** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**CreateEmbedding**](OpenAIAPI.md#CreateEmbedding) | **Post** /embeddings | Creates an embedding vector representing the input text.
[**CreateFile**](OpenAIAPI.md#CreateFile) | **Post** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**CreateFineTune**](OpenAIAPI.md#CreateFineTune) | **Post** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**CreateImage**](OpenAIAPI.md#CreateImage) | **Post** /images/generations | Creates an image given a prompt.
[**CreateImageEdit**](OpenAIAPI.md#CreateImageEdit) | **Post** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**CreateImageVariation**](OpenAIAPI.md#CreateImageVariation) | **Post** /images/variations | Creates a variation of a given image.
[**CreateModeration**](OpenAIAPI.md#CreateModeration) | **Post** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**CreateTranscription**](OpenAIAPI.md#CreateTranscription) | **Post** /audio/transcriptions | Transcribes audio into the input language.
[**CreateTranslation**](OpenAIAPI.md#CreateTranslation) | **Post** /audio/translations | Translates audio into English.
[**DeleteFile**](OpenAIAPI.md#DeleteFile) | **Delete** /files/{file_id} | Delete a file.
[**DeleteModel**](OpenAIAPI.md#DeleteModel) | **Delete** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**DownloadFile**](OpenAIAPI.md#DownloadFile) | **Get** /files/{file_id}/content | Returns the contents of the specified file
[**ListFiles**](OpenAIAPI.md#ListFiles) | **Get** /files | Returns a list of files that belong to the user&#39;s organization.
[**ListFineTuneEvents**](OpenAIAPI.md#ListFineTuneEvents) | **Get** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**ListFineTunes**](OpenAIAPI.md#ListFineTunes) | **Get** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**ListModels**](OpenAIAPI.md#ListModels) | **Get** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**RetrieveFile**](OpenAIAPI.md#RetrieveFile) | **Get** /files/{file_id} | Returns information about a specific file.
[**RetrieveFineTune**](OpenAIAPI.md#RetrieveFineTune) | **Get** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**RetrieveModel**](OpenAIAPI.md#RetrieveModel) | **Get** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.



## CancelFineTune

> FineTune CancelFineTune(ctx, fineTuneId).Execute()

Immediately cancel a fine-tune job. 

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
	fineTuneId := "ft-AF1WoRqd3aJAHsqc9NY7iL8F" // string | The ID of the fine-tune job to cancel 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CancelFineTune(context.Background(), fineTuneId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CancelFineTune``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CancelFineTune`: FineTune
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CancelFineTune`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fineTuneId** | **string** | The ID of the fine-tune job to cancel  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelFineTuneRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateChatCompletion

> CreateChatCompletionResponse CreateChatCompletion(ctx).CreateChatCompletionRequest(createChatCompletionRequest).Execute()

Creates a model response for the given chat conversation.

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
	createChatCompletionRequest := *openapiclient.NewCreateChatCompletionRequest(openapiclient.CreateChatCompletionRequest_model{String: new(string)}, []openapiclient.ChatCompletionRequestMessage{*openapiclient.NewChatCompletionRequestMessage("Role_example")}) // CreateChatCompletionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateChatCompletion(context.Background()).CreateChatCompletionRequest(createChatCompletionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateChatCompletion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateChatCompletion`: CreateChatCompletionResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateChatCompletion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateChatCompletionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateCompletion

> CreateCompletionResponse CreateCompletion(ctx).CreateCompletionRequest(createCompletionRequest).Execute()

Creates a completion for the provided prompt and parameters.

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
	createCompletionRequest := *openapiclient.NewCreateCompletionRequest(openapiclient.CreateCompletionRequest_model{String: new(string)}, "TODO") // CreateCompletionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateCompletion(context.Background()).CreateCompletionRequest(createCompletionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateCompletion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateCompletion`: CreateCompletionResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateCompletion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateCompletionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateEdit

> CreateEditResponse CreateEdit(ctx).CreateEditRequest(createEditRequest).Execute()

Creates a new edit for the provided input, instruction, and parameters.

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
	createEditRequest := *openapiclient.NewCreateEditRequest(openapiclient.CreateEditRequest_model{String: new(string)}, "Fix the spelling mistakes.") // CreateEditRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateEdit(context.Background()).CreateEditRequest(createEditRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateEdit``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateEdit`: CreateEditResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateEdit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateEditRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md) |  | 

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateEmbedding

> CreateEmbeddingResponse CreateEmbedding(ctx).CreateEmbeddingRequest(createEmbeddingRequest).Execute()

Creates an embedding vector representing the input text.

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
	createEmbeddingRequest := *openapiclient.NewCreateEmbeddingRequest(openapiclient.CreateEmbeddingRequest_model{String: new(string)}, openapiclient.CreateEmbeddingRequest_input{ArrayOfArrayOfInt32: new([][]int32)}) // CreateEmbeddingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateEmbedding(context.Background()).CreateEmbeddingRequest(createEmbeddingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateEmbedding``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateEmbedding`: CreateEmbeddingResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateEmbedding`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateEmbeddingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateFile

> OpenAIFile CreateFile(ctx).File(file).Purpose(purpose).Execute()

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

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
	file := os.NewFile(1234, "some_file") // *os.File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
	purpose := "purpose_example" // string | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateFile(context.Background()).File(file).Purpose(purpose).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateFile`: OpenAIFile
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateFile`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | ***os.File** | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **purpose** | **string** | The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateFineTune

> FineTune CreateFineTune(ctx).CreateFineTuneRequest(createFineTuneRequest).Execute()

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

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
	createFineTuneRequest := *openapiclient.NewCreateFineTuneRequest("file-ajSREls59WBbvgSzJSVWxMCB") // CreateFineTuneRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateFineTune(context.Background()).CreateFineTuneRequest(createFineTuneRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateFineTune``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateFineTune`: FineTune
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateFineTune`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateFineTuneRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md) |  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateImage

> ImagesResponse CreateImage(ctx).CreateImageRequest(createImageRequest).Execute()

Creates an image given a prompt.

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
	createImageRequest := *openapiclient.NewCreateImageRequest("A cute baby sea otter") // CreateImageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateImage(context.Background()).CreateImageRequest(createImageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateImage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateImage`: ImagesResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateImage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateImageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md) |  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateImageEdit

> ImagesResponse CreateImageEdit(ctx).Image(image).Prompt(prompt).Mask(mask).N(n).Size(size).ResponseFormat(responseFormat).User(user).Execute()

Creates an edited or extended image given an original image and a prompt.

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
	image := os.NewFile(1234, "some_file") // *os.File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
	prompt := "prompt_example" // string | A text description of the desired image(s). The maximum length is 1000 characters.
	mask := os.NewFile(1234, "some_file") // *os.File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
	n := int32(56) // int32 | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
	size := "size_example" // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
	responseFormat := "responseFormat_example" // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to "url")
	user := "user_example" // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateImageEdit(context.Background()).Image(image).Prompt(prompt).Mask(mask).N(n).Size(size).ResponseFormat(responseFormat).User(user).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateImageEdit``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateImageEdit`: ImagesResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateImageEdit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateImageEditRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | ***os.File** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | ***os.File** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | 
 **n** | **int32** | The number of images to generate. Must be between 1 and 10. | [default to 1]
 **size** | **string** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [default to &quot;1024x1024&quot;]
 **responseFormat** | **string** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [default to &quot;url&quot;]
 **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateImageVariation

> ImagesResponse CreateImageVariation(ctx).Image(image).N(n).Size(size).ResponseFormat(responseFormat).User(user).Execute()

Creates a variation of a given image.

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
	image := os.NewFile(1234, "some_file") // *os.File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
	n := int32(56) // int32 | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
	size := "size_example" // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
	responseFormat := "responseFormat_example" // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to "url")
	user := "user_example" // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateImageVariation(context.Background()).Image(image).N(n).Size(size).ResponseFormat(responseFormat).User(user).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateImageVariation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateImageVariation`: ImagesResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateImageVariation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateImageVariationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | ***os.File** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **int32** | The number of images to generate. Must be between 1 and 10. | [default to 1]
 **size** | **string** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [default to &quot;1024x1024&quot;]
 **responseFormat** | **string** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [default to &quot;url&quot;]
 **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateModeration

> CreateModerationResponse CreateModeration(ctx).CreateModerationRequest(createModerationRequest).Execute()

Classifies if text violates OpenAI's Content Policy

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
	createModerationRequest := *openapiclient.NewCreateModerationRequest(openapiclient.CreateModerationRequest_input{ArrayOfString: new([]string)}) // CreateModerationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateModeration(context.Background()).CreateModerationRequest(createModerationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateModeration``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateModeration`: CreateModerationResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateModeration`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateModerationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md) |  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateTranscription

> CreateTranscriptionResponse CreateTranscription(ctx).File(file).Model(model).Prompt(prompt).ResponseFormat(responseFormat).Temperature(temperature).Language(language).Execute()

Transcribes audio into the input language.

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
	file := os.NewFile(1234, "some_file") // *os.File | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
	model := openapiclient.CreateTranscriptionRequest_model{String: new(string)} // CreateTranscriptionRequestModel | 
	prompt := "prompt_example" // string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
	responseFormat := "responseFormat_example" // string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to "json")
	temperature := float32(8.14) // float32 | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)
	language := "language_example" // string | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateTranscription(context.Background()).File(file).Model(model).Prompt(prompt).ResponseFormat(responseFormat).Temperature(temperature).Language(language).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateTranscription``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateTranscription`: CreateTranscriptionResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateTranscription`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateTranscriptionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | ***os.File** | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | 
 **prompt** | **string** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | 
 **responseFormat** | **string** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [default to &quot;json&quot;]
 **temperature** | **float32** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [default to 0]
 **language** | **string** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | 

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateTranslation

> CreateTranslationResponse CreateTranslation(ctx).File(file).Model(model).Prompt(prompt).ResponseFormat(responseFormat).Temperature(temperature).Execute()

Translates audio into English.

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
	file := os.NewFile(1234, "some_file") // *os.File | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
	model := openapiclient.CreateTranscriptionRequest_model{String: new(string)} // CreateTranscriptionRequestModel | 
	prompt := "prompt_example" // string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
	responseFormat := "responseFormat_example" // string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to "json")
	temperature := float32(8.14) // float32 | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.CreateTranslation(context.Background()).File(file).Model(model).Prompt(prompt).ResponseFormat(responseFormat).Temperature(temperature).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.CreateTranslation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateTranslation`: CreateTranslationResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.CreateTranslation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateTranslationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | ***os.File** | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | 
 **prompt** | **string** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | 
 **responseFormat** | **string** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [default to &quot;json&quot;]
 **temperature** | **float32** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteFile

> DeleteFileResponse DeleteFile(ctx, fileId).Execute()

Delete a file.

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
	fileId := "fileId_example" // string | The ID of the file to use for this request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.DeleteFile(context.Background(), fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.DeleteFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteFile`: DeleteFileResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.DeleteFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fileId** | **string** | The ID of the file to use for this request | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteModel

> DeleteModelResponse DeleteModel(ctx, model).Execute()

Delete a fine-tuned model. You must have the Owner role in your organization.

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
	model := "curie:ft-acmeco-2021-03-03-21-44-20" // string | The model to delete

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.DeleteModel(context.Background(), model).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.DeleteModel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteModel`: DeleteModelResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.DeleteModel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**model** | **string** | The model to delete | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteModelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DownloadFile

> string DownloadFile(ctx, fileId).Execute()

Returns the contents of the specified file

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
	fileId := "fileId_example" // string | The ID of the file to use for this request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.DownloadFile(context.Background(), fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.DownloadFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadFile`: string
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.DownloadFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fileId** | **string** | The ID of the file to use for this request | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListFiles

> ListFilesResponse ListFiles(ctx).Execute()

Returns a list of files that belong to the user's organization.

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.ListFiles(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.ListFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListFiles`: ListFilesResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.ListFiles`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListFilesRequest struct via the builder pattern


### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListFineTuneEvents

> ListFineTuneEventsResponse ListFineTuneEvents(ctx, fineTuneId).Stream(stream).Execute()

Get fine-grained status updates for a fine-tune job. 

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
	fineTuneId := "ft-AF1WoRqd3aJAHsqc9NY7iL8F" // string | The ID of the fine-tune job to get events for. 
	stream := true // bool | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.ListFineTuneEvents(context.Background(), fineTuneId).Stream(stream).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.ListFineTuneEvents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListFineTuneEvents`: ListFineTuneEventsResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.ListFineTuneEvents`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fineTuneId** | **string** | The ID of the fine-tune job to get events for.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListFineTuneEventsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **stream** | **bool** | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListFineTunes

> ListFineTunesResponse ListFineTunes(ctx).Execute()

List your organization's fine-tuning jobs 

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.ListFineTunes(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.ListFineTunes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListFineTunes`: ListFineTunesResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.ListFineTunes`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListFineTunesRequest struct via the builder pattern


### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListModels

> ListModelsResponse ListModels(ctx).Execute()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.ListModels(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.ListModels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListModels`: ListModelsResponse
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.ListModels`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListModelsRequest struct via the builder pattern


### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveFile

> OpenAIFile RetrieveFile(ctx, fileId).Execute()

Returns information about a specific file.

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
	fileId := "fileId_example" // string | The ID of the file to use for this request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.RetrieveFile(context.Background(), fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.RetrieveFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveFile`: OpenAIFile
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.RetrieveFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fileId** | **string** | The ID of the file to use for this request | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveFineTune

> FineTune RetrieveFineTune(ctx, fineTuneId).Execute()

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

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
	fineTuneId := "ft-AF1WoRqd3aJAHsqc9NY7iL8F" // string | The ID of the fine-tune job 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.RetrieveFineTune(context.Background(), fineTuneId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.RetrieveFineTune``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveFineTune`: FineTune
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.RetrieveFineTune`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fineTuneId** | **string** | The ID of the fine-tune job  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveFineTuneRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveModel

> Model RetrieveModel(ctx, model).Execute()

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

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
	model := "text-davinci-001" // string | The ID of the model to use for this request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OpenAIAPI.RetrieveModel(context.Background(), model).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OpenAIAPI.RetrieveModel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveModel`: Model
	fmt.Fprintf(os.Stdout, "Response from `OpenAIAPI.RetrieveModel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**model** | **string** | The ID of the model to use for this request | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveModelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

