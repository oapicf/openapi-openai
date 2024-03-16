# org.openapitools - Kotlin Server library for OpenAI API

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenAIApi* | [**cancelFineTune**](docs/OpenAIApi.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
*OpenAIApi* | [**createChatCompletion**](docs/OpenAIApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OpenAIApi* | [**createCompletion**](docs/OpenAIApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OpenAIApi* | [**createEdit**](docs/OpenAIApi.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OpenAIApi* | [**createEmbedding**](docs/OpenAIApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OpenAIApi* | [**createFile**](docs/OpenAIApi.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
*OpenAIApi* | [**createFineTune**](docs/OpenAIApi.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**createImage**](docs/OpenAIApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*OpenAIApi* | [**createImageEdit**](docs/OpenAIApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenAIApi* | [**createImageVariation**](docs/OpenAIApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*OpenAIApi* | [**createModeration**](docs/OpenAIApi.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI's Content Policy
*OpenAIApi* | [**createTranscription**](docs/OpenAIApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OpenAIApi* | [**createTranslation**](docs/OpenAIApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
*OpenAIApi* | [**deleteFile**](docs/OpenAIApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*OpenAIApi* | [**deleteModel**](docs/OpenAIApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenAIApi* | [**downloadFile**](docs/OpenAIApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OpenAIApi* | [**listFiles**](docs/OpenAIApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user's organization.
*OpenAIApi* | [**listFineTuneEvents**](docs/OpenAIApi.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
*OpenAIApi* | [**listFineTunes**](docs/OpenAIApi.md#listfinetunes) | **GET** /fine-tunes | List your organization's fine-tuning jobs 
*OpenAIApi* | [**listModels**](docs/OpenAIApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**retrieveFile**](docs/OpenAIApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*OpenAIApi* | [**retrieveFineTune**](docs/OpenAIApi.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**retrieveModel**](docs/OpenAIApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestMessageFunctionCall](docs/ChatCompletionRequestMessageFunctionCall.md)
 - [org.openapitools.server.api.model.ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestFunctionCallOneOf](docs/CreateChatCompletionRequestFunctionCallOneOf.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [org.openapitools.server.api.model.CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [org.openapitools.server.api.model.CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [org.openapitools.server.api.model.CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [org.openapitools.server.api.model.CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [org.openapitools.server.api.model.CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [org.openapitools.server.api.model.CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [org.openapitools.server.api.model.CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [org.openapitools.server.api.model.CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [org.openapitools.server.api.model.CreateCompletionResponseUsage](docs/CreateCompletionResponseUsage.md)
 - [org.openapitools.server.api.model.CreateEditRequest](docs/CreateEditRequest.md)
 - [org.openapitools.server.api.model.CreateEditRequestModel](docs/CreateEditRequestModel.md)
 - [org.openapitools.server.api.model.CreateEditResponse](docs/CreateEditResponse.md)
 - [org.openapitools.server.api.model.CreateEditResponseChoicesInner](docs/CreateEditResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [org.openapitools.server.api.model.CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [org.openapitools.server.api.model.CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [org.openapitools.server.api.model.CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [org.openapitools.server.api.model.CreateEmbeddingResponseDataInner](docs/CreateEmbeddingResponseDataInner.md)
 - [org.openapitools.server.api.model.CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [org.openapitools.server.api.model.CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [org.openapitools.server.api.model.CreateFineTuneRequestModel](docs/CreateFineTuneRequestModel.md)
 - [org.openapitools.server.api.model.CreateImageRequest](docs/CreateImageRequest.md)
 - [org.openapitools.server.api.model.CreateModerationRequest](docs/CreateModerationRequest.md)
 - [org.openapitools.server.api.model.CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [org.openapitools.server.api.model.CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [org.openapitools.server.api.model.CreateModerationResponse](docs/CreateModerationResponse.md)
 - [org.openapitools.server.api.model.CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [org.openapitools.server.api.model.CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [org.openapitools.server.api.model.CreateTranscriptionResponse](docs/CreateTranscriptionResponse.md)
 - [org.openapitools.server.api.model.CreateTranslationResponse](docs/CreateTranslationResponse.md)
 - [org.openapitools.server.api.model.DeleteFileResponse](docs/DeleteFileResponse.md)
 - [org.openapitools.server.api.model.DeleteModelResponse](docs/DeleteModelResponse.md)
 - [org.openapitools.server.api.model.Error](docs/Error.md)
 - [org.openapitools.server.api.model.ErrorResponse](docs/ErrorResponse.md)
 - [org.openapitools.server.api.model.FineTune](docs/FineTune.md)
 - [org.openapitools.server.api.model.FineTuneEvent](docs/FineTuneEvent.md)
 - [org.openapitools.server.api.model.ImagesResponse](docs/ImagesResponse.md)
 - [org.openapitools.server.api.model.ImagesResponseDataInner](docs/ImagesResponseDataInner.md)
 - [org.openapitools.server.api.model.ListFilesResponse](docs/ListFilesResponse.md)
 - [org.openapitools.server.api.model.ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [org.openapitools.server.api.model.ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [org.openapitools.server.api.model.ListModelsResponse](docs/ListModelsResponse.md)
 - [org.openapitools.server.api.model.Model](docs/Model.md)
 - [org.openapitools.server.api.model.OpenAIFile](docs/OpenAIFile.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

