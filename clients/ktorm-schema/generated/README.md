# org.openapitools.database - Kotlin database library for OpenAI API

## Requires


## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Supports Mapper using API model classes.
* Supports SQLite types.

<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.database.models.ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [org.openapitools.database.models.ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [org.openapitools.database.models.ChatCompletionRequestMessageFunctionCall](docs/ChatCompletionRequestMessageFunctionCall.md)
 - [org.openapitools.database.models.ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [org.openapitools.database.models.ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [org.openapitools.database.models.CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [org.openapitools.database.models.CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [org.openapitools.database.models.CreateChatCompletionRequestFunctionCallOneOf](docs/CreateChatCompletionRequestFunctionCallOneOf.md)
 - [org.openapitools.database.models.CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [org.openapitools.database.models.CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [org.openapitools.database.models.CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [org.openapitools.database.models.CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [org.openapitools.database.models.CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [org.openapitools.database.models.CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [org.openapitools.database.models.CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [org.openapitools.database.models.CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [org.openapitools.database.models.CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [org.openapitools.database.models.CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [org.openapitools.database.models.CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [org.openapitools.database.models.CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [org.openapitools.database.models.CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [org.openapitools.database.models.CreateCompletionResponseUsage](docs/CreateCompletionResponseUsage.md)
 - [org.openapitools.database.models.CreateEditRequest](docs/CreateEditRequest.md)
 - [org.openapitools.database.models.CreateEditRequestModel](docs/CreateEditRequestModel.md)
 - [org.openapitools.database.models.CreateEditResponse](docs/CreateEditResponse.md)
 - [org.openapitools.database.models.CreateEditResponseChoicesInner](docs/CreateEditResponseChoicesInner.md)
 - [org.openapitools.database.models.CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [org.openapitools.database.models.CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [org.openapitools.database.models.CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [org.openapitools.database.models.CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [org.openapitools.database.models.CreateEmbeddingResponseDataInner](docs/CreateEmbeddingResponseDataInner.md)
 - [org.openapitools.database.models.CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [org.openapitools.database.models.CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [org.openapitools.database.models.CreateFineTuneRequestModel](docs/CreateFineTuneRequestModel.md)
 - [org.openapitools.database.models.CreateImageRequest](docs/CreateImageRequest.md)
 - [org.openapitools.database.models.CreateModerationRequest](docs/CreateModerationRequest.md)
 - [org.openapitools.database.models.CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [org.openapitools.database.models.CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [org.openapitools.database.models.CreateModerationResponse](docs/CreateModerationResponse.md)
 - [org.openapitools.database.models.CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [org.openapitools.database.models.CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [org.openapitools.database.models.CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [org.openapitools.database.models.CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [org.openapitools.database.models.CreateTranscriptionResponse](docs/CreateTranscriptionResponse.md)
 - [org.openapitools.database.models.CreateTranslationResponse](docs/CreateTranslationResponse.md)
 - [org.openapitools.database.models.DeleteFileResponse](docs/DeleteFileResponse.md)
 - [org.openapitools.database.models.DeleteModelResponse](docs/DeleteModelResponse.md)
 - [org.openapitools.database.models.Error](docs/Error.md)
 - [org.openapitools.database.models.ErrorResponse](docs/ErrorResponse.md)
 - [org.openapitools.database.models.FineTune](docs/FineTune.md)
 - [org.openapitools.database.models.FineTuneEvent](docs/FineTuneEvent.md)
 - [org.openapitools.database.models.ImagesResponse](docs/ImagesResponse.md)
 - [org.openapitools.database.models.ImagesResponseDataInner](docs/ImagesResponseDataInner.md)
 - [org.openapitools.database.models.ListFilesResponse](docs/ListFilesResponse.md)
 - [org.openapitools.database.models.ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [org.openapitools.database.models.ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [org.openapitools.database.models.ListModelsResponse](docs/ListModelsResponse.md)
 - [org.openapitools.database.models.Model](docs/Model.md)
 - [org.openapitools.database.models.OpenAIFile](docs/OpenAIFile.md)

