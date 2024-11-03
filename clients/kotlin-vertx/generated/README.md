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

 - [org.openapitools.server.api.model.AssistantFileObject](docs/AssistantFileObject.md)
 - [org.openapitools.server.api.model.AssistantObject](docs/AssistantObject.md)
 - [org.openapitools.server.api.model.AssistantObjectToolsInner](docs/AssistantObjectToolsInner.md)
 - [org.openapitools.server.api.model.AssistantStreamEvent](docs/AssistantStreamEvent.md)
 - [org.openapitools.server.api.model.AssistantToolsCode](docs/AssistantToolsCode.md)
 - [org.openapitools.server.api.model.AssistantToolsFunction](docs/AssistantToolsFunction.md)
 - [org.openapitools.server.api.model.AssistantToolsRetrieval](docs/AssistantToolsRetrieval.md)
 - [org.openapitools.server.api.model.AssistantsApiNamedToolChoice](docs/AssistantsApiNamedToolChoice.md)
 - [org.openapitools.server.api.model.AssistantsApiResponseFormat](docs/AssistantsApiResponseFormat.md)
 - [org.openapitools.server.api.model.AssistantsApiResponseFormatOption](docs/AssistantsApiResponseFormatOption.md)
 - [org.openapitools.server.api.model.AssistantsApiToolChoiceOption](docs/AssistantsApiToolChoiceOption.md)
 - [org.openapitools.server.api.model.ChatCompletionFunctionCallOption](docs/ChatCompletionFunctionCallOption.md)
 - [org.openapitools.server.api.model.ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [org.openapitools.server.api.model.ChatCompletionMessageToolCall](docs/ChatCompletionMessageToolCall.md)
 - [org.openapitools.server.api.model.ChatCompletionMessageToolCallChunk](docs/ChatCompletionMessageToolCallChunk.md)
 - [org.openapitools.server.api.model.ChatCompletionMessageToolCallChunkFunction](docs/ChatCompletionMessageToolCallChunkFunction.md)
 - [org.openapitools.server.api.model.ChatCompletionMessageToolCallFunction](docs/ChatCompletionMessageToolCallFunction.md)
 - [org.openapitools.server.api.model.ChatCompletionNamedToolChoice](docs/ChatCompletionNamedToolChoice.md)
 - [org.openapitools.server.api.model.ChatCompletionNamedToolChoiceFunction](docs/ChatCompletionNamedToolChoiceFunction.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestAssistantMessage](docs/ChatCompletionRequestAssistantMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestAssistantMessageFunctionCall](docs/ChatCompletionRequestAssistantMessageFunctionCall.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestFunctionMessage](docs/ChatCompletionRequestFunctionMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPart](docs/ChatCompletionRequestMessageContentPart.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImage](docs/ChatCompletionRequestMessageContentPartImage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImageImageUrl](docs/ChatCompletionRequestMessageContentPartImageImageUrl.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartText](docs/ChatCompletionRequestMessageContentPartText.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestSystemMessage](docs/ChatCompletionRequestSystemMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestToolMessage](docs/ChatCompletionRequestToolMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestUserMessage](docs/ChatCompletionRequestUserMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRequestUserMessageContent](docs/ChatCompletionRequestUserMessageContent.md)
 - [org.openapitools.server.api.model.ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [org.openapitools.server.api.model.ChatCompletionRole](docs/ChatCompletionRole.md)
 - [org.openapitools.server.api.model.ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [org.openapitools.server.api.model.ChatCompletionStreamResponseDeltaFunctionCall](docs/ChatCompletionStreamResponseDeltaFunctionCall.md)
 - [org.openapitools.server.api.model.ChatCompletionTokenLogprob](docs/ChatCompletionTokenLogprob.md)
 - [org.openapitools.server.api.model.ChatCompletionTokenLogprobTopLogprobsInner](docs/ChatCompletionTokenLogprobTopLogprobsInner.md)
 - [org.openapitools.server.api.model.ChatCompletionTool](docs/ChatCompletionTool.md)
 - [org.openapitools.server.api.model.ChatCompletionToolChoiceOption](docs/ChatCompletionToolChoiceOption.md)
 - [org.openapitools.server.api.model.CompletionUsage](docs/CompletionUsage.md)
 - [org.openapitools.server.api.model.CreateAssistantFileRequest](docs/CreateAssistantFileRequest.md)
 - [org.openapitools.server.api.model.CreateAssistantRequest](docs/CreateAssistantRequest.md)
 - [org.openapitools.server.api.model.CreateAssistantRequestModel](docs/CreateAssistantRequestModel.md)
 - [org.openapitools.server.api.model.CreateChatCompletionFunctionResponse](docs/CreateChatCompletionFunctionResponse.md)
 - [org.openapitools.server.api.model.CreateChatCompletionFunctionResponseChoicesInner](docs/CreateChatCompletionFunctionResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestResponseFormat](docs/CreateChatCompletionRequestResponseFormat.md)
 - [org.openapitools.server.api.model.CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [org.openapitools.server.api.model.CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [org.openapitools.server.api.model.CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateChatCompletionResponseChoicesInnerLogprobs](docs/CreateChatCompletionResponseChoicesInnerLogprobs.md)
 - [org.openapitools.server.api.model.CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [org.openapitools.server.api.model.CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [org.openapitools.server.api.model.CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [org.openapitools.server.api.model.CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [org.openapitools.server.api.model.CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [org.openapitools.server.api.model.CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [org.openapitools.server.api.model.CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [org.openapitools.server.api.model.CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [org.openapitools.server.api.model.CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [org.openapitools.server.api.model.CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [org.openapitools.server.api.model.CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [org.openapitools.server.api.model.CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [org.openapitools.server.api.model.CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequest](docs/CreateFineTuningJobRequest.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparameters](docs/CreateFineTuningJobRequestHyperparameters.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersBatchSize](docs/CreateFineTuningJobRequestHyperparametersBatchSize.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier](docs/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersNEpochs](docs/CreateFineTuningJobRequestHyperparametersNEpochs.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInner](docs/CreateFineTuningJobRequestIntegrationsInner.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerType](docs/CreateFineTuningJobRequestIntegrationsInnerType.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerWandb](docs/CreateFineTuningJobRequestIntegrationsInnerWandb.md)
 - [org.openapitools.server.api.model.CreateFineTuningJobRequestModel](docs/CreateFineTuningJobRequestModel.md)
 - [org.openapitools.server.api.model.CreateImageEditRequestModel](docs/CreateImageEditRequestModel.md)
 - [org.openapitools.server.api.model.CreateImageRequest](docs/CreateImageRequest.md)
 - [org.openapitools.server.api.model.CreateImageRequestModel](docs/CreateImageRequestModel.md)
 - [org.openapitools.server.api.model.CreateMessageRequest](docs/CreateMessageRequest.md)
 - [org.openapitools.server.api.model.CreateModerationRequest](docs/CreateModerationRequest.md)
 - [org.openapitools.server.api.model.CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [org.openapitools.server.api.model.CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [org.openapitools.server.api.model.CreateModerationResponse](docs/CreateModerationResponse.md)
 - [org.openapitools.server.api.model.CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [org.openapitools.server.api.model.CreateRunRequest](docs/CreateRunRequest.md)
 - [org.openapitools.server.api.model.CreateRunRequestModel](docs/CreateRunRequestModel.md)
 - [org.openapitools.server.api.model.CreateSpeechRequest](docs/CreateSpeechRequest.md)
 - [org.openapitools.server.api.model.CreateSpeechRequestModel](docs/CreateSpeechRequestModel.md)
 - [org.openapitools.server.api.model.CreateThreadAndRunRequest](docs/CreateThreadAndRunRequest.md)
 - [org.openapitools.server.api.model.CreateThreadAndRunRequestToolsInner](docs/CreateThreadAndRunRequestToolsInner.md)
 - [org.openapitools.server.api.model.CreateThreadRequest](docs/CreateThreadRequest.md)
 - [org.openapitools.server.api.model.CreateTranscription200Response](docs/CreateTranscription200Response.md)
 - [org.openapitools.server.api.model.CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [org.openapitools.server.api.model.CreateTranscriptionResponseJson](docs/CreateTranscriptionResponseJson.md)
 - [org.openapitools.server.api.model.CreateTranscriptionResponseVerboseJson](docs/CreateTranscriptionResponseVerboseJson.md)
 - [org.openapitools.server.api.model.CreateTranslation200Response](docs/CreateTranslation200Response.md)
 - [org.openapitools.server.api.model.CreateTranslationResponseJson](docs/CreateTranslationResponseJson.md)
 - [org.openapitools.server.api.model.CreateTranslationResponseVerboseJson](docs/CreateTranslationResponseVerboseJson.md)
 - [org.openapitools.server.api.model.DeleteAssistantFileResponse](docs/DeleteAssistantFileResponse.md)
 - [org.openapitools.server.api.model.DeleteAssistantResponse](docs/DeleteAssistantResponse.md)
 - [org.openapitools.server.api.model.DeleteFileResponse](docs/DeleteFileResponse.md)
 - [org.openapitools.server.api.model.DeleteMessageResponse](docs/DeleteMessageResponse.md)
 - [org.openapitools.server.api.model.DeleteModelResponse](docs/DeleteModelResponse.md)
 - [org.openapitools.server.api.model.DeleteThreadResponse](docs/DeleteThreadResponse.md)
 - [org.openapitools.server.api.model.DoneEvent](docs/DoneEvent.md)
 - [org.openapitools.server.api.model.Embedding](docs/Embedding.md)
 - [org.openapitools.server.api.model.Error](docs/Error.md)
 - [org.openapitools.server.api.model.ErrorEvent](docs/ErrorEvent.md)
 - [org.openapitools.server.api.model.ErrorResponse](docs/ErrorResponse.md)
 - [org.openapitools.server.api.model.FineTuningIntegration](docs/FineTuningIntegration.md)
 - [org.openapitools.server.api.model.FineTuningJob](docs/FineTuningJob.md)
 - [org.openapitools.server.api.model.FineTuningJobCheckpoint](docs/FineTuningJobCheckpoint.md)
 - [org.openapitools.server.api.model.FineTuningJobCheckpointMetrics](docs/FineTuningJobCheckpointMetrics.md)
 - [org.openapitools.server.api.model.FineTuningJobError](docs/FineTuningJobError.md)
 - [org.openapitools.server.api.model.FineTuningJobEvent](docs/FineTuningJobEvent.md)
 - [org.openapitools.server.api.model.FineTuningJobHyperparameters](docs/FineTuningJobHyperparameters.md)
 - [org.openapitools.server.api.model.FineTuningJobHyperparametersNEpochs](docs/FineTuningJobHyperparametersNEpochs.md)
 - [org.openapitools.server.api.model.FineTuningJobIntegrationsInner](docs/FineTuningJobIntegrationsInner.md)
 - [org.openapitools.server.api.model.FunctionObject](docs/FunctionObject.md)
 - [org.openapitools.server.api.model.Image](docs/Image.md)
 - [org.openapitools.server.api.model.ImagesResponse](docs/ImagesResponse.md)
 - [org.openapitools.server.api.model.ListAssistantFilesResponse](docs/ListAssistantFilesResponse.md)
 - [org.openapitools.server.api.model.ListAssistantsResponse](docs/ListAssistantsResponse.md)
 - [org.openapitools.server.api.model.ListFilesResponse](docs/ListFilesResponse.md)
 - [org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse](docs/ListFineTuningJobCheckpointsResponse.md)
 - [org.openapitools.server.api.model.ListFineTuningJobEventsResponse](docs/ListFineTuningJobEventsResponse.md)
 - [org.openapitools.server.api.model.ListMessageFilesResponse](docs/ListMessageFilesResponse.md)
 - [org.openapitools.server.api.model.ListMessagesResponse](docs/ListMessagesResponse.md)
 - [org.openapitools.server.api.model.ListModelsResponse](docs/ListModelsResponse.md)
 - [org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse](docs/ListPaginatedFineTuningJobsResponse.md)
 - [org.openapitools.server.api.model.ListRunStepsResponse](docs/ListRunStepsResponse.md)
 - [org.openapitools.server.api.model.ListRunsResponse](docs/ListRunsResponse.md)
 - [org.openapitools.server.api.model.ListThreadsResponse](docs/ListThreadsResponse.md)
 - [org.openapitools.server.api.model.MessageContentImageFileObject](docs/MessageContentImageFileObject.md)
 - [org.openapitools.server.api.model.MessageContentImageFileObjectImageFile](docs/MessageContentImageFileObjectImageFile.md)
 - [org.openapitools.server.api.model.MessageContentTextAnnotationsFileCitationObject](docs/MessageContentTextAnnotationsFileCitationObject.md)
 - [org.openapitools.server.api.model.MessageContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [org.openapitools.server.api.model.MessageContentTextAnnotationsFilePathObject](docs/MessageContentTextAnnotationsFilePathObject.md)
 - [org.openapitools.server.api.model.MessageContentTextAnnotationsFilePathObjectFilePath](docs/MessageContentTextAnnotationsFilePathObjectFilePath.md)
 - [org.openapitools.server.api.model.MessageContentTextObject](docs/MessageContentTextObject.md)
 - [org.openapitools.server.api.model.MessageContentTextObjectText](docs/MessageContentTextObjectText.md)
 - [org.openapitools.server.api.model.MessageContentTextObjectTextAnnotationsInner](docs/MessageContentTextObjectTextAnnotationsInner.md)
 - [org.openapitools.server.api.model.MessageDeltaContentImageFileObject](docs/MessageDeltaContentImageFileObject.md)
 - [org.openapitools.server.api.model.MessageDeltaContentImageFileObjectImageFile](docs/MessageDeltaContentImageFileObjectImageFile.md)
 - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFileCitationObject](docs/MessageDeltaContentTextAnnotationsFileCitationObject.md)
 - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFilePathObject](docs/MessageDeltaContentTextAnnotationsFilePathObject.md)
 - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath](docs/MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)
 - [org.openapitools.server.api.model.MessageDeltaContentTextObject](docs/MessageDeltaContentTextObject.md)
 - [org.openapitools.server.api.model.MessageDeltaContentTextObjectText](docs/MessageDeltaContentTextObjectText.md)
 - [org.openapitools.server.api.model.MessageDeltaContentTextObjectTextAnnotationsInner](docs/MessageDeltaContentTextObjectTextAnnotationsInner.md)
 - [org.openapitools.server.api.model.MessageDeltaObject](docs/MessageDeltaObject.md)
 - [org.openapitools.server.api.model.MessageDeltaObjectDelta](docs/MessageDeltaObjectDelta.md)
 - [org.openapitools.server.api.model.MessageDeltaObjectDeltaContentInner](docs/MessageDeltaObjectDeltaContentInner.md)
 - [org.openapitools.server.api.model.MessageFileObject](docs/MessageFileObject.md)
 - [org.openapitools.server.api.model.MessageObject](docs/MessageObject.md)
 - [org.openapitools.server.api.model.MessageObjectContentInner](docs/MessageObjectContentInner.md)
 - [org.openapitools.server.api.model.MessageObjectIncompleteDetails](docs/MessageObjectIncompleteDetails.md)
 - [org.openapitools.server.api.model.MessageStreamEvent](docs/MessageStreamEvent.md)
 - [org.openapitools.server.api.model.MessageStreamEventOneOf](docs/MessageStreamEventOneOf.md)
 - [org.openapitools.server.api.model.MessageStreamEventOneOf1](docs/MessageStreamEventOneOf1.md)
 - [org.openapitools.server.api.model.MessageStreamEventOneOf2](docs/MessageStreamEventOneOf2.md)
 - [org.openapitools.server.api.model.MessageStreamEventOneOf3](docs/MessageStreamEventOneOf3.md)
 - [org.openapitools.server.api.model.MessageStreamEventOneOf4](docs/MessageStreamEventOneOf4.md)
 - [org.openapitools.server.api.model.Model](docs/Model.md)
 - [org.openapitools.server.api.model.ModifyAssistantRequest](docs/ModifyAssistantRequest.md)
 - [org.openapitools.server.api.model.ModifyMessageRequest](docs/ModifyMessageRequest.md)
 - [org.openapitools.server.api.model.ModifyRunRequest](docs/ModifyRunRequest.md)
 - [org.openapitools.server.api.model.ModifyThreadRequest](docs/ModifyThreadRequest.md)
 - [org.openapitools.server.api.model.OpenAIFile](docs/OpenAIFile.md)
 - [org.openapitools.server.api.model.RunCompletionUsage](docs/RunCompletionUsage.md)
 - [org.openapitools.server.api.model.RunObject](docs/RunObject.md)
 - [org.openapitools.server.api.model.RunObjectIncompleteDetails](docs/RunObjectIncompleteDetails.md)
 - [org.openapitools.server.api.model.RunObjectLastError](docs/RunObjectLastError.md)
 - [org.openapitools.server.api.model.RunObjectRequiredAction](docs/RunObjectRequiredAction.md)
 - [org.openapitools.server.api.model.RunObjectRequiredActionSubmitToolOutputs](docs/RunObjectRequiredActionSubmitToolOutputs.md)
 - [org.openapitools.server.api.model.RunStepCompletionUsage](docs/RunStepCompletionUsage.md)
 - [org.openapitools.server.api.model.RunStepDeltaObject](docs/RunStepDeltaObject.md)
 - [org.openapitools.server.api.model.RunStepDeltaObjectDelta](docs/RunStepDeltaObjectDelta.md)
 - [org.openapitools.server.api.model.RunStepDeltaObjectDeltaStepDetails](docs/RunStepDeltaObjectDeltaStepDetails.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsMessageCreationObject](docs/RunStepDeltaStepDetailsMessageCreationObject.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObject](docs/RunStepDeltaStepDetailsToolCallsCodeObject.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFunctionObject](docs/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsObject](docs/RunStepDeltaStepDetailsToolCallsObject.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)
 - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsRetrievalObject](docs/RunStepDeltaStepDetailsToolCallsRetrievalObject.md)
 - [org.openapitools.server.api.model.RunStepDetailsMessageCreationObject](docs/RunStepDetailsMessageCreationObject.md)
 - [org.openapitools.server.api.model.RunStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDetailsMessageCreationObjectMessageCreation.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObject](docs/RunStepDetailsToolCallsCodeObject.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDetailsToolCallsCodeOutputImageObject.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDetailsToolCallsCodeOutputLogsObject.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsFunctionObject](docs/RunStepDetailsToolCallsFunctionObject.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDetailsToolCallsFunctionObjectFunction.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsObject](docs/RunStepDetailsToolCallsObject.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDetailsToolCallsObjectToolCallsInner.md)
 - [org.openapitools.server.api.model.RunStepDetailsToolCallsRetrievalObject](docs/RunStepDetailsToolCallsRetrievalObject.md)
 - [org.openapitools.server.api.model.RunStepObject](docs/RunStepObject.md)
 - [org.openapitools.server.api.model.RunStepObjectLastError](docs/RunStepObjectLastError.md)
 - [org.openapitools.server.api.model.RunStepObjectStepDetails](docs/RunStepObjectStepDetails.md)
 - [org.openapitools.server.api.model.RunStepStreamEvent](docs/RunStepStreamEvent.md)
 - [org.openapitools.server.api.model.RunStepStreamEventOneOf](docs/RunStepStreamEventOneOf.md)
 - [org.openapitools.server.api.model.RunStepStreamEventOneOf1](docs/RunStepStreamEventOneOf1.md)
 - [org.openapitools.server.api.model.RunStepStreamEventOneOf2](docs/RunStepStreamEventOneOf2.md)
 - [org.openapitools.server.api.model.RunStepStreamEventOneOf3](docs/RunStepStreamEventOneOf3.md)
 - [org.openapitools.server.api.model.RunStepStreamEventOneOf4](docs/RunStepStreamEventOneOf4.md)
 - [org.openapitools.server.api.model.RunStepStreamEventOneOf5](docs/RunStepStreamEventOneOf5.md)
 - [org.openapitools.server.api.model.RunStepStreamEventOneOf6](docs/RunStepStreamEventOneOf6.md)
 - [org.openapitools.server.api.model.RunStreamEvent](docs/RunStreamEvent.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf](docs/RunStreamEventOneOf.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf1](docs/RunStreamEventOneOf1.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf2](docs/RunStreamEventOneOf2.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf3](docs/RunStreamEventOneOf3.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf4](docs/RunStreamEventOneOf4.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf5](docs/RunStreamEventOneOf5.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf6](docs/RunStreamEventOneOf6.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf7](docs/RunStreamEventOneOf7.md)
 - [org.openapitools.server.api.model.RunStreamEventOneOf8](docs/RunStreamEventOneOf8.md)
 - [org.openapitools.server.api.model.RunToolCallObject](docs/RunToolCallObject.md)
 - [org.openapitools.server.api.model.RunToolCallObjectFunction](docs/RunToolCallObjectFunction.md)
 - [org.openapitools.server.api.model.SubmitToolOutputsRunRequest](docs/SubmitToolOutputsRunRequest.md)
 - [org.openapitools.server.api.model.SubmitToolOutputsRunRequestToolOutputsInner](docs/SubmitToolOutputsRunRequestToolOutputsInner.md)
 - [org.openapitools.server.api.model.ThreadObject](docs/ThreadObject.md)
 - [org.openapitools.server.api.model.ThreadStreamEvent](docs/ThreadStreamEvent.md)
 - [org.openapitools.server.api.model.ThreadStreamEventOneOf](docs/ThreadStreamEventOneOf.md)
 - [org.openapitools.server.api.model.TranscriptionSegment](docs/TranscriptionSegment.md)
 - [org.openapitools.server.api.model.TranscriptionWord](docs/TranscriptionWord.md)
 - [org.openapitools.server.api.model.TruncationObject](docs/TruncationObject.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: HTTP Bearer Token authentication

