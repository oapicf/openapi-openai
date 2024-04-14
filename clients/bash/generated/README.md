# OpenAI API Bash client

## Overview

This is a Bash client script for accessing OpenAI API service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Make POST request with form data
$  --host <hostname> <operationId> key1:=value1 key2:=value2 key3:=23

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to */v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssistantsApi* | [**cancelRun**](docs/AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#39;in_progress&#39;.
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
*AssistantsApi* | [**submitToolOuputsToRun**](docs/AssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#39;status: \&quot;requires_action\&quot;&#39; and &#39;required_action.type&#39; is &#39;submit_tool_outputs&#39;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.
*AudioApi* | [**createSpeech**](docs/AudioApi.md#createspeech) | **POST** /audio/speech | Generates audio from the input text.
*AudioApi* | [**createTranscription**](docs/AudioApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AudioApi* | [**createTranslation**](docs/AudioApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
*ChatApi* | [**createChatCompletion**](docs/ChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*CompletionsApi* | [**createCompletion**](docs/CompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*EmbeddingsApi* | [**createEmbedding**](docs/EmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*FilesApi* | [**createFile**](docs/FilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.

The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#39;.jsonl&#39; files.

Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*FilesApi* | [**listFiles**](docs/FilesApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
*FilesApi* | [**retrieveFile**](docs/FilesApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*FineTuningApi* | [**cancelFineTuningJob**](docs/FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.
*FineTuningApi* | [**createFineTuningJob**](docs/FineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about fine-tuning](/docs/guides/fine-tuning)
*FineTuningApi* | [**listFineTuningEvents**](docs/FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.
*FineTuningApi* | [**listFineTuningJobCheckpoints**](docs/FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.
*FineTuningApi* | [**listPaginatedFineTuningJobs**](docs/FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs
*FineTuningApi* | [**retrieveFineTuningJob**](docs/FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.

[Learn more about fine-tuning](/docs/guides/fine-tuning)
*ImagesApi* | [**createImage**](docs/ImagesApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*ImagesApi* | [**createImageEdit**](docs/ImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*ImagesApi* | [**createImageVariation**](docs/ImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*ModelsApi* | [**deleteModel**](docs/ModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*ModelsApi* | [**listModels**](docs/ModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*ModelsApi* | [**retrieveModel**](docs/ModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*ModerationsApi* | [**createModeration**](docs/ModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text is potentially harmful.


## Documentation For Models

 - [AssistantFileObject](docs/AssistantFileObject.md)
 - [AssistantObject](docs/AssistantObject.md)
 - [AssistantObjectToolsInner](docs/AssistantObjectToolsInner.md)
 - [AssistantStreamEvent](docs/AssistantStreamEvent.md)
 - [AssistantToolsCode](docs/AssistantToolsCode.md)
 - [AssistantToolsFunction](docs/AssistantToolsFunction.md)
 - [AssistantToolsRetrieval](docs/AssistantToolsRetrieval.md)
 - [AssistantsApiNamedToolChoice](docs/AssistantsApiNamedToolChoice.md)
 - [AssistantsApiResponseFormat](docs/AssistantsApiResponseFormat.md)
 - [AssistantsApiResponseFormatOption](docs/AssistantsApiResponseFormatOption.md)
 - [AssistantsApiToolChoiceOption](docs/AssistantsApiToolChoiceOption.md)
 - [ChatCompletionFunctionCallOption](docs/ChatCompletionFunctionCallOption.md)
 - [ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [ChatCompletionMessageToolCall](docs/ChatCompletionMessageToolCall.md)
 - [ChatCompletionMessageToolCallChunk](docs/ChatCompletionMessageToolCallChunk.md)
 - [ChatCompletionMessageToolCallChunkFunction](docs/ChatCompletionMessageToolCallChunkFunction.md)
 - [ChatCompletionMessageToolCallFunction](docs/ChatCompletionMessageToolCallFunction.md)
 - [ChatCompletionNamedToolChoice](docs/ChatCompletionNamedToolChoice.md)
 - [ChatCompletionNamedToolChoiceFunction](docs/ChatCompletionNamedToolChoiceFunction.md)
 - [ChatCompletionRequestAssistantMessage](docs/ChatCompletionRequestAssistantMessage.md)
 - [ChatCompletionRequestAssistantMessageFunctionCall](docs/ChatCompletionRequestAssistantMessageFunctionCall.md)
 - [ChatCompletionRequestFunctionMessage](docs/ChatCompletionRequestFunctionMessage.md)
 - [ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [ChatCompletionRequestMessageContentPart](docs/ChatCompletionRequestMessageContentPart.md)
 - [ChatCompletionRequestMessageContentPartImage](docs/ChatCompletionRequestMessageContentPartImage.md)
 - [ChatCompletionRequestMessageContentPartImageImageUrl](docs/ChatCompletionRequestMessageContentPartImageImageUrl.md)
 - [ChatCompletionRequestMessageContentPartText](docs/ChatCompletionRequestMessageContentPartText.md)
 - [ChatCompletionRequestSystemMessage](docs/ChatCompletionRequestSystemMessage.md)
 - [ChatCompletionRequestToolMessage](docs/ChatCompletionRequestToolMessage.md)
 - [ChatCompletionRequestUserMessage](docs/ChatCompletionRequestUserMessage.md)
 - [ChatCompletionRequestUserMessageContent](docs/ChatCompletionRequestUserMessageContent.md)
 - [ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [ChatCompletionRole](docs/ChatCompletionRole.md)
 - [ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [ChatCompletionStreamResponseDeltaFunctionCall](docs/ChatCompletionStreamResponseDeltaFunctionCall.md)
 - [ChatCompletionTokenLogprob](docs/ChatCompletionTokenLogprob.md)
 - [ChatCompletionTokenLogprobTopLogprobsInner](docs/ChatCompletionTokenLogprobTopLogprobsInner.md)
 - [ChatCompletionTool](docs/ChatCompletionTool.md)
 - [ChatCompletionToolChoiceOption](docs/ChatCompletionToolChoiceOption.md)
 - [CompletionUsage](docs/CompletionUsage.md)
 - [CreateAssistantFileRequest](docs/CreateAssistantFileRequest.md)
 - [CreateAssistantRequest](docs/CreateAssistantRequest.md)
 - [CreateAssistantRequestModel](docs/CreateAssistantRequestModel.md)
 - [CreateChatCompletionFunctionResponse](docs/CreateChatCompletionFunctionResponse.md)
 - [CreateChatCompletionFunctionResponseChoicesInner](docs/CreateChatCompletionFunctionResponseChoicesInner.md)
 - [CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [CreateChatCompletionRequestResponseFormat](docs/CreateChatCompletionRequestResponseFormat.md)
 - [CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [CreateChatCompletionResponseChoicesInnerLogprobs](docs/CreateChatCompletionResponseChoicesInnerLogprobs.md)
 - [CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [CreateFineTuningJobRequest](docs/CreateFineTuningJobRequest.md)
 - [CreateFineTuningJobRequestHyperparameters](docs/CreateFineTuningJobRequestHyperparameters.md)
 - [CreateFineTuningJobRequestHyperparametersBatchSize](docs/CreateFineTuningJobRequestHyperparametersBatchSize.md)
 - [CreateFineTuningJobRequestHyperparametersLearningRateMultiplier](docs/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md)
 - [CreateFineTuningJobRequestHyperparametersNEpochs](docs/CreateFineTuningJobRequestHyperparametersNEpochs.md)
 - [CreateFineTuningJobRequestIntegrationsInner](docs/CreateFineTuningJobRequestIntegrationsInner.md)
 - [CreateFineTuningJobRequestIntegrationsInnerType](docs/CreateFineTuningJobRequestIntegrationsInnerType.md)
 - [CreateFineTuningJobRequestIntegrationsInnerWandb](docs/CreateFineTuningJobRequestIntegrationsInnerWandb.md)
 - [CreateFineTuningJobRequestModel](docs/CreateFineTuningJobRequestModel.md)
 - [CreateImageEditRequestModel](docs/CreateImageEditRequestModel.md)
 - [CreateImageRequest](docs/CreateImageRequest.md)
 - [CreateImageRequestModel](docs/CreateImageRequestModel.md)
 - [CreateMessageRequest](docs/CreateMessageRequest.md)
 - [CreateModerationRequest](docs/CreateModerationRequest.md)
 - [CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [CreateModerationResponse](docs/CreateModerationResponse.md)
 - [CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [CreateRunRequest](docs/CreateRunRequest.md)
 - [CreateRunRequestModel](docs/CreateRunRequestModel.md)
 - [CreateSpeechRequest](docs/CreateSpeechRequest.md)
 - [CreateSpeechRequestModel](docs/CreateSpeechRequestModel.md)
 - [CreateThreadAndRunRequest](docs/CreateThreadAndRunRequest.md)
 - [CreateThreadAndRunRequestToolsInner](docs/CreateThreadAndRunRequestToolsInner.md)
 - [CreateThreadRequest](docs/CreateThreadRequest.md)
 - [CreateTranscription200Response](docs/CreateTranscription200Response.md)
 - [CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [CreateTranscriptionResponseJson](docs/CreateTranscriptionResponseJson.md)
 - [CreateTranscriptionResponseVerboseJson](docs/CreateTranscriptionResponseVerboseJson.md)
 - [CreateTranslation200Response](docs/CreateTranslation200Response.md)
 - [CreateTranslationResponseJson](docs/CreateTranslationResponseJson.md)
 - [CreateTranslationResponseVerboseJson](docs/CreateTranslationResponseVerboseJson.md)
 - [DeleteAssistantFileResponse](docs/DeleteAssistantFileResponse.md)
 - [DeleteAssistantResponse](docs/DeleteAssistantResponse.md)
 - [DeleteFileResponse](docs/DeleteFileResponse.md)
 - [DeleteMessageResponse](docs/DeleteMessageResponse.md)
 - [DeleteModelResponse](docs/DeleteModelResponse.md)
 - [DeleteThreadResponse](docs/DeleteThreadResponse.md)
 - [DoneEvent](docs/DoneEvent.md)
 - [Embedding](docs/Embedding.md)
 - [Error](docs/Error.md)
 - [ErrorEvent](docs/ErrorEvent.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FineTuningIntegration](docs/FineTuningIntegration.md)
 - [FineTuningJob](docs/FineTuningJob.md)
 - [FineTuningJobCheckpoint](docs/FineTuningJobCheckpoint.md)
 - [FineTuningJobCheckpointMetrics](docs/FineTuningJobCheckpointMetrics.md)
 - [FineTuningJobError](docs/FineTuningJobError.md)
 - [FineTuningJobEvent](docs/FineTuningJobEvent.md)
 - [FineTuningJobHyperparameters](docs/FineTuningJobHyperparameters.md)
 - [FineTuningJobHyperparametersNEpochs](docs/FineTuningJobHyperparametersNEpochs.md)
 - [FineTuningJobIntegrationsInner](docs/FineTuningJobIntegrationsInner.md)
 - [FunctionObject](docs/FunctionObject.md)
 - [Image](docs/Image.md)
 - [ImagesResponse](docs/ImagesResponse.md)
 - [ListAssistantFilesResponse](docs/ListAssistantFilesResponse.md)
 - [ListAssistantsResponse](docs/ListAssistantsResponse.md)
 - [ListFilesResponse](docs/ListFilesResponse.md)
 - [ListFineTuningJobCheckpointsResponse](docs/ListFineTuningJobCheckpointsResponse.md)
 - [ListFineTuningJobEventsResponse](docs/ListFineTuningJobEventsResponse.md)
 - [ListMessageFilesResponse](docs/ListMessageFilesResponse.md)
 - [ListMessagesResponse](docs/ListMessagesResponse.md)
 - [ListModelsResponse](docs/ListModelsResponse.md)
 - [ListPaginatedFineTuningJobsResponse](docs/ListPaginatedFineTuningJobsResponse.md)
 - [ListRunStepsResponse](docs/ListRunStepsResponse.md)
 - [ListRunsResponse](docs/ListRunsResponse.md)
 - [ListThreadsResponse](docs/ListThreadsResponse.md)
 - [MessageContentImageFileObject](docs/MessageContentImageFileObject.md)
 - [MessageContentImageFileObjectImageFile](docs/MessageContentImageFileObjectImageFile.md)
 - [MessageContentTextAnnotationsFileCitationObject](docs/MessageContentTextAnnotationsFileCitationObject.md)
 - [MessageContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [MessageContentTextAnnotationsFilePathObject](docs/MessageContentTextAnnotationsFilePathObject.md)
 - [MessageContentTextAnnotationsFilePathObjectFilePath](docs/MessageContentTextAnnotationsFilePathObjectFilePath.md)
 - [MessageContentTextObject](docs/MessageContentTextObject.md)
 - [MessageContentTextObjectText](docs/MessageContentTextObjectText.md)
 - [MessageContentTextObjectTextAnnotationsInner](docs/MessageContentTextObjectTextAnnotationsInner.md)
 - [MessageDeltaContentImageFileObject](docs/MessageDeltaContentImageFileObject.md)
 - [MessageDeltaContentImageFileObjectImageFile](docs/MessageDeltaContentImageFileObjectImageFile.md)
 - [MessageDeltaContentTextAnnotationsFileCitationObject](docs/MessageDeltaContentTextAnnotationsFileCitationObject.md)
 - [MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [MessageDeltaContentTextAnnotationsFilePathObject](docs/MessageDeltaContentTextAnnotationsFilePathObject.md)
 - [MessageDeltaContentTextAnnotationsFilePathObjectFilePath](docs/MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)
 - [MessageDeltaContentTextObject](docs/MessageDeltaContentTextObject.md)
 - [MessageDeltaContentTextObjectText](docs/MessageDeltaContentTextObjectText.md)
 - [MessageDeltaContentTextObjectTextAnnotationsInner](docs/MessageDeltaContentTextObjectTextAnnotationsInner.md)
 - [MessageDeltaObject](docs/MessageDeltaObject.md)
 - [MessageDeltaObjectDelta](docs/MessageDeltaObjectDelta.md)
 - [MessageDeltaObjectDeltaContentInner](docs/MessageDeltaObjectDeltaContentInner.md)
 - [MessageFileObject](docs/MessageFileObject.md)
 - [MessageObject](docs/MessageObject.md)
 - [MessageObjectContentInner](docs/MessageObjectContentInner.md)
 - [MessageObjectIncompleteDetails](docs/MessageObjectIncompleteDetails.md)
 - [MessageStreamEvent](docs/MessageStreamEvent.md)
 - [MessageStreamEventOneOf](docs/MessageStreamEventOneOf.md)
 - [MessageStreamEventOneOf1](docs/MessageStreamEventOneOf1.md)
 - [MessageStreamEventOneOf2](docs/MessageStreamEventOneOf2.md)
 - [MessageStreamEventOneOf3](docs/MessageStreamEventOneOf3.md)
 - [MessageStreamEventOneOf4](docs/MessageStreamEventOneOf4.md)
 - [Model](docs/Model.md)
 - [ModifyAssistantRequest](docs/ModifyAssistantRequest.md)
 - [ModifyMessageRequest](docs/ModifyMessageRequest.md)
 - [ModifyRunRequest](docs/ModifyRunRequest.md)
 - [ModifyThreadRequest](docs/ModifyThreadRequest.md)
 - [OpenAIFile](docs/OpenAIFile.md)
 - [RunCompletionUsage](docs/RunCompletionUsage.md)
 - [RunObject](docs/RunObject.md)
 - [RunObjectIncompleteDetails](docs/RunObjectIncompleteDetails.md)
 - [RunObjectLastError](docs/RunObjectLastError.md)
 - [RunObjectRequiredAction](docs/RunObjectRequiredAction.md)
 - [RunObjectRequiredActionSubmitToolOutputs](docs/RunObjectRequiredActionSubmitToolOutputs.md)
 - [RunStepCompletionUsage](docs/RunStepCompletionUsage.md)
 - [RunStepDeltaObject](docs/RunStepDeltaObject.md)
 - [RunStepDeltaObjectDelta](docs/RunStepDeltaObjectDelta.md)
 - [RunStepDeltaObjectDeltaStepDetails](docs/RunStepDeltaObjectDeltaStepDetails.md)
 - [RunStepDeltaStepDetailsMessageCreationObject](docs/RunStepDeltaStepDetailsMessageCreationObject.md)
 - [RunStepDeltaStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObject](docs/RunStepDeltaStepDetailsToolCallsCodeObject.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObject](docs/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md)
 - [RunStepDeltaStepDetailsToolCallsObject](docs/RunStepDeltaStepDetailsToolCallsObject.md)
 - [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)
 - [RunStepDeltaStepDetailsToolCallsRetrievalObject](docs/RunStepDeltaStepDetailsToolCallsRetrievalObject.md)
 - [RunStepDetailsMessageCreationObject](docs/RunStepDetailsMessageCreationObject.md)
 - [RunStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDetailsMessageCreationObjectMessageCreation.md)
 - [RunStepDetailsToolCallsCodeObject](docs/RunStepDetailsToolCallsCodeObject.md)
 - [RunStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [RunStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [RunStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDetailsToolCallsFunctionObject](docs/RunStepDetailsToolCallsFunctionObject.md)
 - [RunStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDetailsToolCallsFunctionObjectFunction.md)
 - [RunStepDetailsToolCallsObject](docs/RunStepDetailsToolCallsObject.md)
 - [RunStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDetailsToolCallsObjectToolCallsInner.md)
 - [RunStepDetailsToolCallsRetrievalObject](docs/RunStepDetailsToolCallsRetrievalObject.md)
 - [RunStepObject](docs/RunStepObject.md)
 - [RunStepObjectLastError](docs/RunStepObjectLastError.md)
 - [RunStepObjectStepDetails](docs/RunStepObjectStepDetails.md)
 - [RunStepStreamEvent](docs/RunStepStreamEvent.md)
 - [RunStepStreamEventOneOf](docs/RunStepStreamEventOneOf.md)
 - [RunStepStreamEventOneOf1](docs/RunStepStreamEventOneOf1.md)
 - [RunStepStreamEventOneOf2](docs/RunStepStreamEventOneOf2.md)
 - [RunStepStreamEventOneOf3](docs/RunStepStreamEventOneOf3.md)
 - [RunStepStreamEventOneOf4](docs/RunStepStreamEventOneOf4.md)
 - [RunStepStreamEventOneOf5](docs/RunStepStreamEventOneOf5.md)
 - [RunStepStreamEventOneOf6](docs/RunStepStreamEventOneOf6.md)
 - [RunStreamEvent](docs/RunStreamEvent.md)
 - [RunStreamEventOneOf](docs/RunStreamEventOneOf.md)
 - [RunStreamEventOneOf1](docs/RunStreamEventOneOf1.md)
 - [RunStreamEventOneOf2](docs/RunStreamEventOneOf2.md)
 - [RunStreamEventOneOf3](docs/RunStreamEventOneOf3.md)
 - [RunStreamEventOneOf4](docs/RunStreamEventOneOf4.md)
 - [RunStreamEventOneOf5](docs/RunStreamEventOneOf5.md)
 - [RunStreamEventOneOf6](docs/RunStreamEventOneOf6.md)
 - [RunStreamEventOneOf7](docs/RunStreamEventOneOf7.md)
 - [RunStreamEventOneOf8](docs/RunStreamEventOneOf8.md)
 - [RunToolCallObject](docs/RunToolCallObject.md)
 - [RunToolCallObjectFunction](docs/RunToolCallObjectFunction.md)
 - [SubmitToolOutputsRunRequest](docs/SubmitToolOutputsRunRequest.md)
 - [SubmitToolOutputsRunRequestToolOutputsInner](docs/SubmitToolOutputsRunRequestToolOutputsInner.md)
 - [ThreadObject](docs/ThreadObject.md)
 - [ThreadStreamEvent](docs/ThreadStreamEvent.md)
 - [ThreadStreamEventOneOf](docs/ThreadStreamEventOneOf.md)
 - [TranscriptionSegment](docs/TranscriptionSegment.md)
 - [TranscriptionWord](docs/TranscriptionWord.md)
 - [TruncationObject](docs/TruncationObject.md)


## Documentation For Authorization


## ApiKeyAuth


- **Type**: HTTP Bearer Token authentication

