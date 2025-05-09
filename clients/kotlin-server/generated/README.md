# org.openapitools.server - Kotlin Server library for OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

Generated by OpenAPI Generator 7.9.0.

## Requires

* Kotlin 1.7.20
* Gradle 7.4.2

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Running

The server builds as a fat jar with a main entrypoint. To start the service, run `java -jar ./build/libs/kotlin-server.jar`.

You may also run in docker:

```
docker build -t kotlin-server .
docker run -p 8080:8080 kotlin-server
```

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs (see ktor documentation for more info).
* ~Supports collection formats for query parameters: csv, tsv, ssv, pipes.~
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssistantsApi* | [**cancelRun**](docs/AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`.
*AssistantsApi* | [**createAssistant**](docs/AssistantsApi.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions.
*AssistantsApi* | [**createAssistantFile**](docs/AssistantsApi.md#createassistantfile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
*AssistantsApi* | [**createMessage**](docs/AssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.
*AssistantsApi* | [**createRun**](docs/AssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run.
*AssistantsApi* | [**createThread**](docs/AssistantsApi.md#createthread) | **POST** /threads | Create a thread.
*AssistantsApi* | [**createThreadAndRun**](docs/AssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.
*AssistantsApi* | [**deleteAssistant**](docs/AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AssistantsApi* | [**deleteAssistantFile**](docs/AssistantsApi.md#deleteassistantfile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
*AssistantsApi* | [**deleteThread**](docs/AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.
*AssistantsApi* | [**getAssistant**](docs/AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AssistantsApi* | [**getAssistantFile**](docs/AssistantsApi.md#getassistantfile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
*AssistantsApi* | [**getMessage**](docs/AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AssistantsApi* | [**getMessageFile**](docs/AssistantsApi.md#getmessagefile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
*AssistantsApi* | [**getRun**](docs/AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AssistantsApi* | [**getRunStep**](docs/AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AssistantsApi* | [**getThread**](docs/AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.
*AssistantsApi* | [**listAssistantFiles**](docs/AssistantsApi.md#listassistantfiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files.
*AssistantsApi* | [**listAssistants**](docs/AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants.
*AssistantsApi* | [**listMessageFiles**](docs/AssistantsApi.md#listmessagefiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
*AssistantsApi* | [**listMessages**](docs/AssistantsApi.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
*AssistantsApi* | [**listRunSteps**](docs/AssistantsApi.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
*AssistantsApi* | [**listRuns**](docs/AssistantsApi.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
*AssistantsApi* | [**modifyAssistant**](docs/AssistantsApi.md#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
*AssistantsApi* | [**modifyMessage**](docs/AssistantsApi.md#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
*AssistantsApi* | [**modifyRun**](docs/AssistantsApi.md#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
*AssistantsApi* | [**modifyThread**](docs/AssistantsApi.md#modifythread) | **POST** /threads/{thread_id} | Modifies a thread.
*AssistantsApi* | [**submitToolOuputsToRun**](docs/AssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
*AudioApi* | [**createSpeech**](docs/AudioApi.md#createspeech) | **POST** /audio/speech | Generates audio from the input text.
*AudioApi* | [**createTranscription**](docs/AudioApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AudioApi* | [**createTranslation**](docs/AudioApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
*ChatApi* | [**createChatCompletion**](docs/ChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*CompletionsApi* | [**createCompletion**](docs/CompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*EmbeddingsApi* | [**createEmbedding**](docs/EmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*FilesApi* | [**createFile**](docs/FilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*FilesApi* | [**listFiles**](docs/FilesApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user's organization.
*FilesApi* | [**retrieveFile**](docs/FilesApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*FineTuningApi* | [**cancelFineTuningJob**](docs/FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
*FineTuningApi* | [**createFineTuningJob**](docs/FineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*FineTuningApi* | [**listFineTuningEvents**](docs/FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
*FineTuningApi* | [**listFineTuningJobCheckpoints**](docs/FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
*FineTuningApi* | [**listPaginatedFineTuningJobs**](docs/FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization's fine-tuning jobs 
*FineTuningApi* | [**retrieveFineTuningJob**](docs/FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*ImagesApi* | [**createImage**](docs/ImagesApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*ImagesApi* | [**createImageEdit**](docs/ImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*ImagesApi* | [**createImageVariation**](docs/ImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*ModelsApi* | [**deleteModel**](docs/ModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*ModelsApi* | [**listModels**](docs/ModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*ModelsApi* | [**retrieveModel**](docs/ModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*ModerationsApi* | [**createModeration**](docs/ModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text is potentially harmful.


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.models.AssistantFileObject](docs/AssistantFileObject.md)
 - [org.openapitools.server.models.AssistantObject](docs/AssistantObject.md)
 - [org.openapitools.server.models.AssistantObjectToolsInner](docs/AssistantObjectToolsInner.md)
 - [org.openapitools.server.models.AssistantStreamEvent](docs/AssistantStreamEvent.md)
 - [org.openapitools.server.models.AssistantToolsCode](docs/AssistantToolsCode.md)
 - [org.openapitools.server.models.AssistantToolsFunction](docs/AssistantToolsFunction.md)
 - [org.openapitools.server.models.AssistantToolsRetrieval](docs/AssistantToolsRetrieval.md)
 - [org.openapitools.server.models.AssistantsApiNamedToolChoice](docs/AssistantsApiNamedToolChoice.md)
 - [org.openapitools.server.models.AssistantsApiResponseFormat](docs/AssistantsApiResponseFormat.md)
 - [org.openapitools.server.models.AssistantsApiResponseFormatOption](docs/AssistantsApiResponseFormatOption.md)
 - [org.openapitools.server.models.AssistantsApiToolChoiceOption](docs/AssistantsApiToolChoiceOption.md)
 - [org.openapitools.server.models.ChatCompletionFunctionCallOption](docs/ChatCompletionFunctionCallOption.md)
 - [org.openapitools.server.models.ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [org.openapitools.server.models.ChatCompletionMessageToolCall](docs/ChatCompletionMessageToolCall.md)
 - [org.openapitools.server.models.ChatCompletionMessageToolCallChunk](docs/ChatCompletionMessageToolCallChunk.md)
 - [org.openapitools.server.models.ChatCompletionMessageToolCallChunkFunction](docs/ChatCompletionMessageToolCallChunkFunction.md)
 - [org.openapitools.server.models.ChatCompletionMessageToolCallFunction](docs/ChatCompletionMessageToolCallFunction.md)
 - [org.openapitools.server.models.ChatCompletionNamedToolChoice](docs/ChatCompletionNamedToolChoice.md)
 - [org.openapitools.server.models.ChatCompletionNamedToolChoiceFunction](docs/ChatCompletionNamedToolChoiceFunction.md)
 - [org.openapitools.server.models.ChatCompletionRequestAssistantMessage](docs/ChatCompletionRequestAssistantMessage.md)
 - [org.openapitools.server.models.ChatCompletionRequestAssistantMessageFunctionCall](docs/ChatCompletionRequestAssistantMessageFunctionCall.md)
 - [org.openapitools.server.models.ChatCompletionRequestFunctionMessage](docs/ChatCompletionRequestFunctionMessage.md)
 - [org.openapitools.server.models.ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [org.openapitools.server.models.ChatCompletionRequestMessageContentPart](docs/ChatCompletionRequestMessageContentPart.md)
 - [org.openapitools.server.models.ChatCompletionRequestMessageContentPartImage](docs/ChatCompletionRequestMessageContentPartImage.md)
 - [org.openapitools.server.models.ChatCompletionRequestMessageContentPartImageImageUrl](docs/ChatCompletionRequestMessageContentPartImageImageUrl.md)
 - [org.openapitools.server.models.ChatCompletionRequestMessageContentPartText](docs/ChatCompletionRequestMessageContentPartText.md)
 - [org.openapitools.server.models.ChatCompletionRequestSystemMessage](docs/ChatCompletionRequestSystemMessage.md)
 - [org.openapitools.server.models.ChatCompletionRequestToolMessage](docs/ChatCompletionRequestToolMessage.md)
 - [org.openapitools.server.models.ChatCompletionRequestUserMessage](docs/ChatCompletionRequestUserMessage.md)
 - [org.openapitools.server.models.ChatCompletionRequestUserMessageContent](docs/ChatCompletionRequestUserMessageContent.md)
 - [org.openapitools.server.models.ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [org.openapitools.server.models.ChatCompletionRole](docs/ChatCompletionRole.md)
 - [org.openapitools.server.models.ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [org.openapitools.server.models.ChatCompletionStreamResponseDeltaFunctionCall](docs/ChatCompletionStreamResponseDeltaFunctionCall.md)
 - [org.openapitools.server.models.ChatCompletionTokenLogprob](docs/ChatCompletionTokenLogprob.md)
 - [org.openapitools.server.models.ChatCompletionTokenLogprobTopLogprobsInner](docs/ChatCompletionTokenLogprobTopLogprobsInner.md)
 - [org.openapitools.server.models.ChatCompletionTool](docs/ChatCompletionTool.md)
 - [org.openapitools.server.models.ChatCompletionToolChoiceOption](docs/ChatCompletionToolChoiceOption.md)
 - [org.openapitools.server.models.CompletionUsage](docs/CompletionUsage.md)
 - [org.openapitools.server.models.CreateAssistantFileRequest](docs/CreateAssistantFileRequest.md)
 - [org.openapitools.server.models.CreateAssistantRequest](docs/CreateAssistantRequest.md)
 - [org.openapitools.server.models.CreateAssistantRequestModel](docs/CreateAssistantRequestModel.md)
 - [org.openapitools.server.models.CreateChatCompletionFunctionResponse](docs/CreateChatCompletionFunctionResponse.md)
 - [org.openapitools.server.models.CreateChatCompletionFunctionResponseChoicesInner](docs/CreateChatCompletionFunctionResponseChoicesInner.md)
 - [org.openapitools.server.models.CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [org.openapitools.server.models.CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [org.openapitools.server.models.CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [org.openapitools.server.models.CreateChatCompletionRequestResponseFormat](docs/CreateChatCompletionRequestResponseFormat.md)
 - [org.openapitools.server.models.CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [org.openapitools.server.models.CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [org.openapitools.server.models.CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [org.openapitools.server.models.CreateChatCompletionResponseChoicesInnerLogprobs](docs/CreateChatCompletionResponseChoicesInnerLogprobs.md)
 - [org.openapitools.server.models.CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [org.openapitools.server.models.CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [org.openapitools.server.models.CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [org.openapitools.server.models.CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [org.openapitools.server.models.CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [org.openapitools.server.models.CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [org.openapitools.server.models.CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [org.openapitools.server.models.CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [org.openapitools.server.models.CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [org.openapitools.server.models.CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [org.openapitools.server.models.CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [org.openapitools.server.models.CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [org.openapitools.server.models.CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [org.openapitools.server.models.CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequest](docs/CreateFineTuningJobRequest.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestHyperparameters](docs/CreateFineTuningJobRequestHyperparameters.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestHyperparametersBatchSize](docs/CreateFineTuningJobRequestHyperparametersBatchSize.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier](docs/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestHyperparametersNEpochs](docs/CreateFineTuningJobRequestHyperparametersNEpochs.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestIntegrationsInner](docs/CreateFineTuningJobRequestIntegrationsInner.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestIntegrationsInnerType](docs/CreateFineTuningJobRequestIntegrationsInnerType.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestIntegrationsInnerWandb](docs/CreateFineTuningJobRequestIntegrationsInnerWandb.md)
 - [org.openapitools.server.models.CreateFineTuningJobRequestModel](docs/CreateFineTuningJobRequestModel.md)
 - [org.openapitools.server.models.CreateImageEditRequestModel](docs/CreateImageEditRequestModel.md)
 - [org.openapitools.server.models.CreateImageRequest](docs/CreateImageRequest.md)
 - [org.openapitools.server.models.CreateImageRequestModel](docs/CreateImageRequestModel.md)
 - [org.openapitools.server.models.CreateMessageRequest](docs/CreateMessageRequest.md)
 - [org.openapitools.server.models.CreateModerationRequest](docs/CreateModerationRequest.md)
 - [org.openapitools.server.models.CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [org.openapitools.server.models.CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [org.openapitools.server.models.CreateModerationResponse](docs/CreateModerationResponse.md)
 - [org.openapitools.server.models.CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [org.openapitools.server.models.CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [org.openapitools.server.models.CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [org.openapitools.server.models.CreateRunRequest](docs/CreateRunRequest.md)
 - [org.openapitools.server.models.CreateRunRequestModel](docs/CreateRunRequestModel.md)
 - [org.openapitools.server.models.CreateSpeechRequest](docs/CreateSpeechRequest.md)
 - [org.openapitools.server.models.CreateSpeechRequestModel](docs/CreateSpeechRequestModel.md)
 - [org.openapitools.server.models.CreateThreadAndRunRequest](docs/CreateThreadAndRunRequest.md)
 - [org.openapitools.server.models.CreateThreadAndRunRequestToolsInner](docs/CreateThreadAndRunRequestToolsInner.md)
 - [org.openapitools.server.models.CreateThreadRequest](docs/CreateThreadRequest.md)
 - [org.openapitools.server.models.CreateTranscription200Response](docs/CreateTranscription200Response.md)
 - [org.openapitools.server.models.CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [org.openapitools.server.models.CreateTranscriptionResponseJson](docs/CreateTranscriptionResponseJson.md)
 - [org.openapitools.server.models.CreateTranscriptionResponseVerboseJson](docs/CreateTranscriptionResponseVerboseJson.md)
 - [org.openapitools.server.models.CreateTranslation200Response](docs/CreateTranslation200Response.md)
 - [org.openapitools.server.models.CreateTranslationResponseJson](docs/CreateTranslationResponseJson.md)
 - [org.openapitools.server.models.CreateTranslationResponseVerboseJson](docs/CreateTranslationResponseVerboseJson.md)
 - [org.openapitools.server.models.DeleteAssistantFileResponse](docs/DeleteAssistantFileResponse.md)
 - [org.openapitools.server.models.DeleteAssistantResponse](docs/DeleteAssistantResponse.md)
 - [org.openapitools.server.models.DeleteFileResponse](docs/DeleteFileResponse.md)
 - [org.openapitools.server.models.DeleteMessageResponse](docs/DeleteMessageResponse.md)
 - [org.openapitools.server.models.DeleteModelResponse](docs/DeleteModelResponse.md)
 - [org.openapitools.server.models.DeleteThreadResponse](docs/DeleteThreadResponse.md)
 - [org.openapitools.server.models.DoneEvent](docs/DoneEvent.md)
 - [org.openapitools.server.models.Embedding](docs/Embedding.md)
 - [org.openapitools.server.models.Error](docs/Error.md)
 - [org.openapitools.server.models.ErrorEvent](docs/ErrorEvent.md)
 - [org.openapitools.server.models.ErrorResponse](docs/ErrorResponse.md)
 - [org.openapitools.server.models.FineTuningIntegration](docs/FineTuningIntegration.md)
 - [org.openapitools.server.models.FineTuningJob](docs/FineTuningJob.md)
 - [org.openapitools.server.models.FineTuningJobCheckpoint](docs/FineTuningJobCheckpoint.md)
 - [org.openapitools.server.models.FineTuningJobCheckpointMetrics](docs/FineTuningJobCheckpointMetrics.md)
 - [org.openapitools.server.models.FineTuningJobError](docs/FineTuningJobError.md)
 - [org.openapitools.server.models.FineTuningJobEvent](docs/FineTuningJobEvent.md)
 - [org.openapitools.server.models.FineTuningJobHyperparameters](docs/FineTuningJobHyperparameters.md)
 - [org.openapitools.server.models.FineTuningJobHyperparametersNEpochs](docs/FineTuningJobHyperparametersNEpochs.md)
 - [org.openapitools.server.models.FineTuningJobIntegrationsInner](docs/FineTuningJobIntegrationsInner.md)
 - [org.openapitools.server.models.FunctionObject](docs/FunctionObject.md)
 - [org.openapitools.server.models.Image](docs/Image.md)
 - [org.openapitools.server.models.ImagesResponse](docs/ImagesResponse.md)
 - [org.openapitools.server.models.ListAssistantFilesResponse](docs/ListAssistantFilesResponse.md)
 - [org.openapitools.server.models.ListAssistantsResponse](docs/ListAssistantsResponse.md)
 - [org.openapitools.server.models.ListFilesResponse](docs/ListFilesResponse.md)
 - [org.openapitools.server.models.ListFineTuningJobCheckpointsResponse](docs/ListFineTuningJobCheckpointsResponse.md)
 - [org.openapitools.server.models.ListFineTuningJobEventsResponse](docs/ListFineTuningJobEventsResponse.md)
 - [org.openapitools.server.models.ListMessageFilesResponse](docs/ListMessageFilesResponse.md)
 - [org.openapitools.server.models.ListMessagesResponse](docs/ListMessagesResponse.md)
 - [org.openapitools.server.models.ListModelsResponse](docs/ListModelsResponse.md)
 - [org.openapitools.server.models.ListPaginatedFineTuningJobsResponse](docs/ListPaginatedFineTuningJobsResponse.md)
 - [org.openapitools.server.models.ListRunStepsResponse](docs/ListRunStepsResponse.md)
 - [org.openapitools.server.models.ListRunsResponse](docs/ListRunsResponse.md)
 - [org.openapitools.server.models.ListThreadsResponse](docs/ListThreadsResponse.md)
 - [org.openapitools.server.models.MessageContentImageFileObject](docs/MessageContentImageFileObject.md)
 - [org.openapitools.server.models.MessageContentImageFileObjectImageFile](docs/MessageContentImageFileObjectImageFile.md)
 - [org.openapitools.server.models.MessageContentTextAnnotationsFileCitationObject](docs/MessageContentTextAnnotationsFileCitationObject.md)
 - [org.openapitools.server.models.MessageContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [org.openapitools.server.models.MessageContentTextAnnotationsFilePathObject](docs/MessageContentTextAnnotationsFilePathObject.md)
 - [org.openapitools.server.models.MessageContentTextAnnotationsFilePathObjectFilePath](docs/MessageContentTextAnnotationsFilePathObjectFilePath.md)
 - [org.openapitools.server.models.MessageContentTextObject](docs/MessageContentTextObject.md)
 - [org.openapitools.server.models.MessageContentTextObjectText](docs/MessageContentTextObjectText.md)
 - [org.openapitools.server.models.MessageContentTextObjectTextAnnotationsInner](docs/MessageContentTextObjectTextAnnotationsInner.md)
 - [org.openapitools.server.models.MessageDeltaContentImageFileObject](docs/MessageDeltaContentImageFileObject.md)
 - [org.openapitools.server.models.MessageDeltaContentImageFileObjectImageFile](docs/MessageDeltaContentImageFileObjectImageFile.md)
 - [org.openapitools.server.models.MessageDeltaContentTextAnnotationsFileCitationObject](docs/MessageDeltaContentTextAnnotationsFileCitationObject.md)
 - [org.openapitools.server.models.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [org.openapitools.server.models.MessageDeltaContentTextAnnotationsFilePathObject](docs/MessageDeltaContentTextAnnotationsFilePathObject.md)
 - [org.openapitools.server.models.MessageDeltaContentTextAnnotationsFilePathObjectFilePath](docs/MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)
 - [org.openapitools.server.models.MessageDeltaContentTextObject](docs/MessageDeltaContentTextObject.md)
 - [org.openapitools.server.models.MessageDeltaContentTextObjectText](docs/MessageDeltaContentTextObjectText.md)
 - [org.openapitools.server.models.MessageDeltaContentTextObjectTextAnnotationsInner](docs/MessageDeltaContentTextObjectTextAnnotationsInner.md)
 - [org.openapitools.server.models.MessageDeltaObject](docs/MessageDeltaObject.md)
 - [org.openapitools.server.models.MessageDeltaObjectDelta](docs/MessageDeltaObjectDelta.md)
 - [org.openapitools.server.models.MessageDeltaObjectDeltaContentInner](docs/MessageDeltaObjectDeltaContentInner.md)
 - [org.openapitools.server.models.MessageFileObject](docs/MessageFileObject.md)
 - [org.openapitools.server.models.MessageObject](docs/MessageObject.md)
 - [org.openapitools.server.models.MessageObjectContentInner](docs/MessageObjectContentInner.md)
 - [org.openapitools.server.models.MessageObjectIncompleteDetails](docs/MessageObjectIncompleteDetails.md)
 - [org.openapitools.server.models.MessageStreamEvent](docs/MessageStreamEvent.md)
 - [org.openapitools.server.models.MessageStreamEventOneOf](docs/MessageStreamEventOneOf.md)
 - [org.openapitools.server.models.MessageStreamEventOneOf1](docs/MessageStreamEventOneOf1.md)
 - [org.openapitools.server.models.MessageStreamEventOneOf2](docs/MessageStreamEventOneOf2.md)
 - [org.openapitools.server.models.MessageStreamEventOneOf3](docs/MessageStreamEventOneOf3.md)
 - [org.openapitools.server.models.MessageStreamEventOneOf4](docs/MessageStreamEventOneOf4.md)
 - [org.openapitools.server.models.Model](docs/Model.md)
 - [org.openapitools.server.models.ModifyAssistantRequest](docs/ModifyAssistantRequest.md)
 - [org.openapitools.server.models.ModifyMessageRequest](docs/ModifyMessageRequest.md)
 - [org.openapitools.server.models.ModifyRunRequest](docs/ModifyRunRequest.md)
 - [org.openapitools.server.models.ModifyThreadRequest](docs/ModifyThreadRequest.md)
 - [org.openapitools.server.models.OpenAIFile](docs/OpenAIFile.md)
 - [org.openapitools.server.models.RunCompletionUsage](docs/RunCompletionUsage.md)
 - [org.openapitools.server.models.RunObject](docs/RunObject.md)
 - [org.openapitools.server.models.RunObjectIncompleteDetails](docs/RunObjectIncompleteDetails.md)
 - [org.openapitools.server.models.RunObjectLastError](docs/RunObjectLastError.md)
 - [org.openapitools.server.models.RunObjectRequiredAction](docs/RunObjectRequiredAction.md)
 - [org.openapitools.server.models.RunObjectRequiredActionSubmitToolOutputs](docs/RunObjectRequiredActionSubmitToolOutputs.md)
 - [org.openapitools.server.models.RunStepCompletionUsage](docs/RunStepCompletionUsage.md)
 - [org.openapitools.server.models.RunStepDeltaObject](docs/RunStepDeltaObject.md)
 - [org.openapitools.server.models.RunStepDeltaObjectDelta](docs/RunStepDeltaObjectDelta.md)
 - [org.openapitools.server.models.RunStepDeltaObjectDeltaStepDetails](docs/RunStepDeltaObjectDeltaStepDetails.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsMessageCreationObject](docs/RunStepDeltaStepDetailsMessageCreationObject.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsCodeObject](docs/RunStepDeltaStepDetailsToolCallsCodeObject.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsFunctionObject](docs/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsObject](docs/RunStepDeltaStepDetailsToolCallsObject.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)
 - [org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsRetrievalObject](docs/RunStepDeltaStepDetailsToolCallsRetrievalObject.md)
 - [org.openapitools.server.models.RunStepDetailsMessageCreationObject](docs/RunStepDetailsMessageCreationObject.md)
 - [org.openapitools.server.models.RunStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDetailsMessageCreationObjectMessageCreation.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsCodeObject](docs/RunStepDetailsToolCallsCodeObject.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDetailsToolCallsCodeOutputImageObject.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDetailsToolCallsCodeOutputLogsObject.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsFunctionObject](docs/RunStepDetailsToolCallsFunctionObject.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDetailsToolCallsFunctionObjectFunction.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsObject](docs/RunStepDetailsToolCallsObject.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDetailsToolCallsObjectToolCallsInner.md)
 - [org.openapitools.server.models.RunStepDetailsToolCallsRetrievalObject](docs/RunStepDetailsToolCallsRetrievalObject.md)
 - [org.openapitools.server.models.RunStepObject](docs/RunStepObject.md)
 - [org.openapitools.server.models.RunStepObjectLastError](docs/RunStepObjectLastError.md)
 - [org.openapitools.server.models.RunStepObjectStepDetails](docs/RunStepObjectStepDetails.md)
 - [org.openapitools.server.models.RunStepStreamEvent](docs/RunStepStreamEvent.md)
 - [org.openapitools.server.models.RunStepStreamEventOneOf](docs/RunStepStreamEventOneOf.md)
 - [org.openapitools.server.models.RunStepStreamEventOneOf1](docs/RunStepStreamEventOneOf1.md)
 - [org.openapitools.server.models.RunStepStreamEventOneOf2](docs/RunStepStreamEventOneOf2.md)
 - [org.openapitools.server.models.RunStepStreamEventOneOf3](docs/RunStepStreamEventOneOf3.md)
 - [org.openapitools.server.models.RunStepStreamEventOneOf4](docs/RunStepStreamEventOneOf4.md)
 - [org.openapitools.server.models.RunStepStreamEventOneOf5](docs/RunStepStreamEventOneOf5.md)
 - [org.openapitools.server.models.RunStepStreamEventOneOf6](docs/RunStepStreamEventOneOf6.md)
 - [org.openapitools.server.models.RunStreamEvent](docs/RunStreamEvent.md)
 - [org.openapitools.server.models.RunStreamEventOneOf](docs/RunStreamEventOneOf.md)
 - [org.openapitools.server.models.RunStreamEventOneOf1](docs/RunStreamEventOneOf1.md)
 - [org.openapitools.server.models.RunStreamEventOneOf2](docs/RunStreamEventOneOf2.md)
 - [org.openapitools.server.models.RunStreamEventOneOf3](docs/RunStreamEventOneOf3.md)
 - [org.openapitools.server.models.RunStreamEventOneOf4](docs/RunStreamEventOneOf4.md)
 - [org.openapitools.server.models.RunStreamEventOneOf5](docs/RunStreamEventOneOf5.md)
 - [org.openapitools.server.models.RunStreamEventOneOf6](docs/RunStreamEventOneOf6.md)
 - [org.openapitools.server.models.RunStreamEventOneOf7](docs/RunStreamEventOneOf7.md)
 - [org.openapitools.server.models.RunStreamEventOneOf8](docs/RunStreamEventOneOf8.md)
 - [org.openapitools.server.models.RunToolCallObject](docs/RunToolCallObject.md)
 - [org.openapitools.server.models.RunToolCallObjectFunction](docs/RunToolCallObjectFunction.md)
 - [org.openapitools.server.models.SubmitToolOutputsRunRequest](docs/SubmitToolOutputsRunRequest.md)
 - [org.openapitools.server.models.SubmitToolOutputsRunRequestToolOutputsInner](docs/SubmitToolOutputsRunRequestToolOutputsInner.md)
 - [org.openapitools.server.models.ThreadObject](docs/ThreadObject.md)
 - [org.openapitools.server.models.ThreadStreamEvent](docs/ThreadStreamEvent.md)
 - [org.openapitools.server.models.ThreadStreamEventOneOf](docs/ThreadStreamEventOneOf.md)
 - [org.openapitools.server.models.TranscriptionSegment](docs/TranscriptionSegment.md)
 - [org.openapitools.server.models.TranscriptionWord](docs/TranscriptionWord.md)
 - [org.openapitools.server.models.TruncationObject](docs/TruncationObject.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: HTTP Bearer Token authentication

