# OpenAPIClient-php

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

For more information, please visit [https://github.com/oapicf/openapi-openai](https://github.com/oapicf/openapi-openai).

## Installation & Usage

### Requirements

PHP 8.1 and later.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/oapicf/openapi-openai.git"
    }
  ],
  "require": {
    "oapicf/openapi-openai": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to which this run belongs.
$run_id = 'run_id_example'; // string | The ID of the run to cancel.

try {
    $result = $apiInstance->cancelRun($thread_id, $run_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->cancelRun: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssistantsApi* | [**cancelRun**](docs/Api/AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
*AssistantsApi* | [**createAssistant**](docs/Api/AssistantsApi.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions.
*AssistantsApi* | [**createAssistantFile**](docs/Api/AssistantsApi.md#createassistantfile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
*AssistantsApi* | [**createMessage**](docs/Api/AssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.
*AssistantsApi* | [**createRun**](docs/Api/AssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run.
*AssistantsApi* | [**createThread**](docs/Api/AssistantsApi.md#createthread) | **POST** /threads | Create a thread.
*AssistantsApi* | [**createThreadAndRun**](docs/Api/AssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.
*AssistantsApi* | [**deleteAssistant**](docs/Api/AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AssistantsApi* | [**deleteAssistantFile**](docs/Api/AssistantsApi.md#deleteassistantfile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
*AssistantsApi* | [**deleteThread**](docs/Api/AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.
*AssistantsApi* | [**getAssistant**](docs/Api/AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AssistantsApi* | [**getAssistantFile**](docs/Api/AssistantsApi.md#getassistantfile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
*AssistantsApi* | [**getMessage**](docs/Api/AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AssistantsApi* | [**getMessageFile**](docs/Api/AssistantsApi.md#getmessagefile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
*AssistantsApi* | [**getRun**](docs/Api/AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AssistantsApi* | [**getRunStep**](docs/Api/AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AssistantsApi* | [**getThread**](docs/Api/AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.
*AssistantsApi* | [**listAssistantFiles**](docs/Api/AssistantsApi.md#listassistantfiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files.
*AssistantsApi* | [**listAssistants**](docs/Api/AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants.
*AssistantsApi* | [**listMessageFiles**](docs/Api/AssistantsApi.md#listmessagefiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
*AssistantsApi* | [**listMessages**](docs/Api/AssistantsApi.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
*AssistantsApi* | [**listRunSteps**](docs/Api/AssistantsApi.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
*AssistantsApi* | [**listRuns**](docs/Api/AssistantsApi.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
*AssistantsApi* | [**modifyAssistant**](docs/Api/AssistantsApi.md#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
*AssistantsApi* | [**modifyMessage**](docs/Api/AssistantsApi.md#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
*AssistantsApi* | [**modifyRun**](docs/Api/AssistantsApi.md#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
*AssistantsApi* | [**modifyThread**](docs/Api/AssistantsApi.md#modifythread) | **POST** /threads/{thread_id} | Modifies a thread.
*AssistantsApi* | [**submitToolOuputsToRun**](docs/Api/AssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.
*AudioApi* | [**createSpeech**](docs/Api/AudioApi.md#createspeech) | **POST** /audio/speech | Generates audio from the input text.
*AudioApi* | [**createTranscription**](docs/Api/AudioApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AudioApi* | [**createTranslation**](docs/Api/AudioApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
*ChatApi* | [**createChatCompletion**](docs/Api/ChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*CompletionsApi* | [**createCompletion**](docs/Api/CompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*EmbeddingsApi* | [**createEmbedding**](docs/Api/EmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*FilesApi* | [**createFile**](docs/Api/FilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
*FilesApi* | [**deleteFile**](docs/Api/FilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*FilesApi* | [**downloadFile**](docs/Api/FilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*FilesApi* | [**listFiles**](docs/Api/FilesApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
*FilesApi* | [**retrieveFile**](docs/Api/FilesApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*FineTuningApi* | [**cancelFineTuningJob**](docs/Api/FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.
*FineTuningApi* | [**createFineTuningJob**](docs/Api/FineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
*FineTuningApi* | [**listFineTuningEvents**](docs/Api/FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.
*FineTuningApi* | [**listFineTuningJobCheckpoints**](docs/Api/FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.
*FineTuningApi* | [**listPaginatedFineTuningJobs**](docs/Api/FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs
*FineTuningApi* | [**retrieveFineTuningJob**](docs/Api/FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
*ImagesApi* | [**createImage**](docs/Api/ImagesApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*ImagesApi* | [**createImageEdit**](docs/Api/ImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*ImagesApi* | [**createImageVariation**](docs/Api/ImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*ModelsApi* | [**deleteModel**](docs/Api/ModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*ModelsApi* | [**listModels**](docs/Api/ModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*ModelsApi* | [**retrieveModel**](docs/Api/ModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*ModerationsApi* | [**createModeration**](docs/Api/ModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text is potentially harmful.

## Models

- [AssistantFileObject](docs/Model/AssistantFileObject.md)
- [AssistantObject](docs/Model/AssistantObject.md)
- [AssistantObjectToolsInner](docs/Model/AssistantObjectToolsInner.md)
- [AssistantStreamEvent](docs/Model/AssistantStreamEvent.md)
- [AssistantToolsCode](docs/Model/AssistantToolsCode.md)
- [AssistantToolsFunction](docs/Model/AssistantToolsFunction.md)
- [AssistantToolsRetrieval](docs/Model/AssistantToolsRetrieval.md)
- [AssistantsApiNamedToolChoice](docs/Model/AssistantsApiNamedToolChoice.md)
- [AssistantsApiResponseFormat](docs/Model/AssistantsApiResponseFormat.md)
- [AssistantsApiResponseFormatOption](docs/Model/AssistantsApiResponseFormatOption.md)
- [AssistantsApiToolChoiceOption](docs/Model/AssistantsApiToolChoiceOption.md)
- [ChatCompletionFunctionCallOption](docs/Model/ChatCompletionFunctionCallOption.md)
- [ChatCompletionFunctions](docs/Model/ChatCompletionFunctions.md)
- [ChatCompletionMessageToolCall](docs/Model/ChatCompletionMessageToolCall.md)
- [ChatCompletionMessageToolCallChunk](docs/Model/ChatCompletionMessageToolCallChunk.md)
- [ChatCompletionMessageToolCallChunkFunction](docs/Model/ChatCompletionMessageToolCallChunkFunction.md)
- [ChatCompletionMessageToolCallFunction](docs/Model/ChatCompletionMessageToolCallFunction.md)
- [ChatCompletionNamedToolChoice](docs/Model/ChatCompletionNamedToolChoice.md)
- [ChatCompletionNamedToolChoiceFunction](docs/Model/ChatCompletionNamedToolChoiceFunction.md)
- [ChatCompletionRequestAssistantMessage](docs/Model/ChatCompletionRequestAssistantMessage.md)
- [ChatCompletionRequestAssistantMessageFunctionCall](docs/Model/ChatCompletionRequestAssistantMessageFunctionCall.md)
- [ChatCompletionRequestFunctionMessage](docs/Model/ChatCompletionRequestFunctionMessage.md)
- [ChatCompletionRequestMessage](docs/Model/ChatCompletionRequestMessage.md)
- [ChatCompletionRequestMessageContentPart](docs/Model/ChatCompletionRequestMessageContentPart.md)
- [ChatCompletionRequestMessageContentPartImage](docs/Model/ChatCompletionRequestMessageContentPartImage.md)
- [ChatCompletionRequestMessageContentPartImageImageUrl](docs/Model/ChatCompletionRequestMessageContentPartImageImageUrl.md)
- [ChatCompletionRequestMessageContentPartText](docs/Model/ChatCompletionRequestMessageContentPartText.md)
- [ChatCompletionRequestSystemMessage](docs/Model/ChatCompletionRequestSystemMessage.md)
- [ChatCompletionRequestToolMessage](docs/Model/ChatCompletionRequestToolMessage.md)
- [ChatCompletionRequestUserMessage](docs/Model/ChatCompletionRequestUserMessage.md)
- [ChatCompletionRequestUserMessageContent](docs/Model/ChatCompletionRequestUserMessageContent.md)
- [ChatCompletionResponseMessage](docs/Model/ChatCompletionResponseMessage.md)
- [ChatCompletionRole](docs/Model/ChatCompletionRole.md)
- [ChatCompletionStreamResponseDelta](docs/Model/ChatCompletionStreamResponseDelta.md)
- [ChatCompletionStreamResponseDeltaFunctionCall](docs/Model/ChatCompletionStreamResponseDeltaFunctionCall.md)
- [ChatCompletionTokenLogprob](docs/Model/ChatCompletionTokenLogprob.md)
- [ChatCompletionTokenLogprobTopLogprobsInner](docs/Model/ChatCompletionTokenLogprobTopLogprobsInner.md)
- [ChatCompletionTool](docs/Model/ChatCompletionTool.md)
- [ChatCompletionToolChoiceOption](docs/Model/ChatCompletionToolChoiceOption.md)
- [CompletionUsage](docs/Model/CompletionUsage.md)
- [CreateAssistantFileRequest](docs/Model/CreateAssistantFileRequest.md)
- [CreateAssistantRequest](docs/Model/CreateAssistantRequest.md)
- [CreateAssistantRequestModel](docs/Model/CreateAssistantRequestModel.md)
- [CreateChatCompletionFunctionResponse](docs/Model/CreateChatCompletionFunctionResponse.md)
- [CreateChatCompletionFunctionResponseChoicesInner](docs/Model/CreateChatCompletionFunctionResponseChoicesInner.md)
- [CreateChatCompletionRequest](docs/Model/CreateChatCompletionRequest.md)
- [CreateChatCompletionRequestFunctionCall](docs/Model/CreateChatCompletionRequestFunctionCall.md)
- [CreateChatCompletionRequestModel](docs/Model/CreateChatCompletionRequestModel.md)
- [CreateChatCompletionRequestResponseFormat](docs/Model/CreateChatCompletionRequestResponseFormat.md)
- [CreateChatCompletionRequestStop](docs/Model/CreateChatCompletionRequestStop.md)
- [CreateChatCompletionResponse](docs/Model/CreateChatCompletionResponse.md)
- [CreateChatCompletionResponseChoicesInner](docs/Model/CreateChatCompletionResponseChoicesInner.md)
- [CreateChatCompletionResponseChoicesInnerLogprobs](docs/Model/CreateChatCompletionResponseChoicesInnerLogprobs.md)
- [CreateChatCompletionStreamResponse](docs/Model/CreateChatCompletionStreamResponse.md)
- [CreateChatCompletionStreamResponseChoicesInner](docs/Model/CreateChatCompletionStreamResponseChoicesInner.md)
- [CreateCompletionRequest](docs/Model/CreateCompletionRequest.md)
- [CreateCompletionRequestModel](docs/Model/CreateCompletionRequestModel.md)
- [CreateCompletionRequestPrompt](docs/Model/CreateCompletionRequestPrompt.md)
- [CreateCompletionRequestStop](docs/Model/CreateCompletionRequestStop.md)
- [CreateCompletionResponse](docs/Model/CreateCompletionResponse.md)
- [CreateCompletionResponseChoicesInner](docs/Model/CreateCompletionResponseChoicesInner.md)
- [CreateCompletionResponseChoicesInnerLogprobs](docs/Model/CreateCompletionResponseChoicesInnerLogprobs.md)
- [CreateEmbeddingRequest](docs/Model/CreateEmbeddingRequest.md)
- [CreateEmbeddingRequestInput](docs/Model/CreateEmbeddingRequestInput.md)
- [CreateEmbeddingRequestModel](docs/Model/CreateEmbeddingRequestModel.md)
- [CreateEmbeddingResponse](docs/Model/CreateEmbeddingResponse.md)
- [CreateEmbeddingResponseUsage](docs/Model/CreateEmbeddingResponseUsage.md)
- [CreateFineTuningJobRequest](docs/Model/CreateFineTuningJobRequest.md)
- [CreateFineTuningJobRequestHyperparameters](docs/Model/CreateFineTuningJobRequestHyperparameters.md)
- [CreateFineTuningJobRequestHyperparametersBatchSize](docs/Model/CreateFineTuningJobRequestHyperparametersBatchSize.md)
- [CreateFineTuningJobRequestHyperparametersLearningRateMultiplier](docs/Model/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md)
- [CreateFineTuningJobRequestHyperparametersNEpochs](docs/Model/CreateFineTuningJobRequestHyperparametersNEpochs.md)
- [CreateFineTuningJobRequestIntegrationsInner](docs/Model/CreateFineTuningJobRequestIntegrationsInner.md)
- [CreateFineTuningJobRequestIntegrationsInnerWandb](docs/Model/CreateFineTuningJobRequestIntegrationsInnerWandb.md)
- [CreateFineTuningJobRequestModel](docs/Model/CreateFineTuningJobRequestModel.md)
- [CreateImageEditRequestModel](docs/Model/CreateImageEditRequestModel.md)
- [CreateImageRequest](docs/Model/CreateImageRequest.md)
- [CreateImageRequestModel](docs/Model/CreateImageRequestModel.md)
- [CreateMessageRequest](docs/Model/CreateMessageRequest.md)
- [CreateModerationRequest](docs/Model/CreateModerationRequest.md)
- [CreateModerationRequestInput](docs/Model/CreateModerationRequestInput.md)
- [CreateModerationRequestModel](docs/Model/CreateModerationRequestModel.md)
- [CreateModerationResponse](docs/Model/CreateModerationResponse.md)
- [CreateModerationResponseResultsInner](docs/Model/CreateModerationResponseResultsInner.md)
- [CreateModerationResponseResultsInnerCategories](docs/Model/CreateModerationResponseResultsInnerCategories.md)
- [CreateModerationResponseResultsInnerCategoryScores](docs/Model/CreateModerationResponseResultsInnerCategoryScores.md)
- [CreateRunRequest](docs/Model/CreateRunRequest.md)
- [CreateRunRequestModel](docs/Model/CreateRunRequestModel.md)
- [CreateSpeechRequest](docs/Model/CreateSpeechRequest.md)
- [CreateSpeechRequestModel](docs/Model/CreateSpeechRequestModel.md)
- [CreateThreadAndRunRequest](docs/Model/CreateThreadAndRunRequest.md)
- [CreateThreadAndRunRequestToolsInner](docs/Model/CreateThreadAndRunRequestToolsInner.md)
- [CreateThreadRequest](docs/Model/CreateThreadRequest.md)
- [CreateTranscription200Response](docs/Model/CreateTranscription200Response.md)
- [CreateTranscriptionRequestModel](docs/Model/CreateTranscriptionRequestModel.md)
- [CreateTranscriptionResponseJson](docs/Model/CreateTranscriptionResponseJson.md)
- [CreateTranscriptionResponseVerboseJson](docs/Model/CreateTranscriptionResponseVerboseJson.md)
- [CreateTranslation200Response](docs/Model/CreateTranslation200Response.md)
- [CreateTranslationResponseJson](docs/Model/CreateTranslationResponseJson.md)
- [CreateTranslationResponseVerboseJson](docs/Model/CreateTranslationResponseVerboseJson.md)
- [DeleteAssistantFileResponse](docs/Model/DeleteAssistantFileResponse.md)
- [DeleteAssistantResponse](docs/Model/DeleteAssistantResponse.md)
- [DeleteFileResponse](docs/Model/DeleteFileResponse.md)
- [DeleteMessageResponse](docs/Model/DeleteMessageResponse.md)
- [DeleteModelResponse](docs/Model/DeleteModelResponse.md)
- [DeleteThreadResponse](docs/Model/DeleteThreadResponse.md)
- [DoneEvent](docs/Model/DoneEvent.md)
- [Embedding](docs/Model/Embedding.md)
- [Error](docs/Model/Error.md)
- [ErrorEvent](docs/Model/ErrorEvent.md)
- [ErrorResponse](docs/Model/ErrorResponse.md)
- [FineTuningIntegration](docs/Model/FineTuningIntegration.md)
- [FineTuningJob](docs/Model/FineTuningJob.md)
- [FineTuningJobCheckpoint](docs/Model/FineTuningJobCheckpoint.md)
- [FineTuningJobCheckpointMetrics](docs/Model/FineTuningJobCheckpointMetrics.md)
- [FineTuningJobError](docs/Model/FineTuningJobError.md)
- [FineTuningJobEvent](docs/Model/FineTuningJobEvent.md)
- [FineTuningJobHyperparameters](docs/Model/FineTuningJobHyperparameters.md)
- [FineTuningJobHyperparametersNEpochs](docs/Model/FineTuningJobHyperparametersNEpochs.md)
- [FineTuningJobIntegrationsInner](docs/Model/FineTuningJobIntegrationsInner.md)
- [FunctionObject](docs/Model/FunctionObject.md)
- [Image](docs/Model/Image.md)
- [ImagesResponse](docs/Model/ImagesResponse.md)
- [ListAssistantFilesResponse](docs/Model/ListAssistantFilesResponse.md)
- [ListAssistantsResponse](docs/Model/ListAssistantsResponse.md)
- [ListFilesResponse](docs/Model/ListFilesResponse.md)
- [ListFineTuningJobCheckpointsResponse](docs/Model/ListFineTuningJobCheckpointsResponse.md)
- [ListFineTuningJobEventsResponse](docs/Model/ListFineTuningJobEventsResponse.md)
- [ListMessageFilesResponse](docs/Model/ListMessageFilesResponse.md)
- [ListMessagesResponse](docs/Model/ListMessagesResponse.md)
- [ListModelsResponse](docs/Model/ListModelsResponse.md)
- [ListPaginatedFineTuningJobsResponse](docs/Model/ListPaginatedFineTuningJobsResponse.md)
- [ListRunStepsResponse](docs/Model/ListRunStepsResponse.md)
- [ListRunsResponse](docs/Model/ListRunsResponse.md)
- [ListThreadsResponse](docs/Model/ListThreadsResponse.md)
- [MessageContentImageFileObject](docs/Model/MessageContentImageFileObject.md)
- [MessageContentImageFileObjectImageFile](docs/Model/MessageContentImageFileObjectImageFile.md)
- [MessageContentTextAnnotationsFileCitationObject](docs/Model/MessageContentTextAnnotationsFileCitationObject.md)
- [MessageContentTextAnnotationsFileCitationObjectFileCitation](docs/Model/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
- [MessageContentTextAnnotationsFilePathObject](docs/Model/MessageContentTextAnnotationsFilePathObject.md)
- [MessageContentTextAnnotationsFilePathObjectFilePath](docs/Model/MessageContentTextAnnotationsFilePathObjectFilePath.md)
- [MessageContentTextObject](docs/Model/MessageContentTextObject.md)
- [MessageContentTextObjectText](docs/Model/MessageContentTextObjectText.md)
- [MessageContentTextObjectTextAnnotationsInner](docs/Model/MessageContentTextObjectTextAnnotationsInner.md)
- [MessageDeltaContentImageFileObject](docs/Model/MessageDeltaContentImageFileObject.md)
- [MessageDeltaContentImageFileObjectImageFile](docs/Model/MessageDeltaContentImageFileObjectImageFile.md)
- [MessageDeltaContentTextAnnotationsFileCitationObject](docs/Model/MessageDeltaContentTextAnnotationsFileCitationObject.md)
- [MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation](docs/Model/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md)
- [MessageDeltaContentTextAnnotationsFilePathObject](docs/Model/MessageDeltaContentTextAnnotationsFilePathObject.md)
- [MessageDeltaContentTextAnnotationsFilePathObjectFilePath](docs/Model/MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)
- [MessageDeltaContentTextObject](docs/Model/MessageDeltaContentTextObject.md)
- [MessageDeltaContentTextObjectText](docs/Model/MessageDeltaContentTextObjectText.md)
- [MessageDeltaContentTextObjectTextAnnotationsInner](docs/Model/MessageDeltaContentTextObjectTextAnnotationsInner.md)
- [MessageDeltaObject](docs/Model/MessageDeltaObject.md)
- [MessageDeltaObjectDelta](docs/Model/MessageDeltaObjectDelta.md)
- [MessageDeltaObjectDeltaContentInner](docs/Model/MessageDeltaObjectDeltaContentInner.md)
- [MessageFileObject](docs/Model/MessageFileObject.md)
- [MessageObject](docs/Model/MessageObject.md)
- [MessageObjectContentInner](docs/Model/MessageObjectContentInner.md)
- [MessageObjectIncompleteDetails](docs/Model/MessageObjectIncompleteDetails.md)
- [MessageStreamEvent](docs/Model/MessageStreamEvent.md)
- [MessageStreamEventOneOf](docs/Model/MessageStreamEventOneOf.md)
- [MessageStreamEventOneOf1](docs/Model/MessageStreamEventOneOf1.md)
- [MessageStreamEventOneOf2](docs/Model/MessageStreamEventOneOf2.md)
- [MessageStreamEventOneOf3](docs/Model/MessageStreamEventOneOf3.md)
- [MessageStreamEventOneOf4](docs/Model/MessageStreamEventOneOf4.md)
- [Model](docs/Model/Model.md)
- [ModifyAssistantRequest](docs/Model/ModifyAssistantRequest.md)
- [ModifyMessageRequest](docs/Model/ModifyMessageRequest.md)
- [ModifyRunRequest](docs/Model/ModifyRunRequest.md)
- [ModifyThreadRequest](docs/Model/ModifyThreadRequest.md)
- [OpenAIFile](docs/Model/OpenAIFile.md)
- [RunCompletionUsage](docs/Model/RunCompletionUsage.md)
- [RunObject](docs/Model/RunObject.md)
- [RunObjectIncompleteDetails](docs/Model/RunObjectIncompleteDetails.md)
- [RunObjectLastError](docs/Model/RunObjectLastError.md)
- [RunObjectRequiredAction](docs/Model/RunObjectRequiredAction.md)
- [RunObjectRequiredActionSubmitToolOutputs](docs/Model/RunObjectRequiredActionSubmitToolOutputs.md)
- [RunStepCompletionUsage](docs/Model/RunStepCompletionUsage.md)
- [RunStepDeltaObject](docs/Model/RunStepDeltaObject.md)
- [RunStepDeltaObjectDelta](docs/Model/RunStepDeltaObjectDelta.md)
- [RunStepDeltaObjectDeltaStepDetails](docs/Model/RunStepDeltaObjectDeltaStepDetails.md)
- [RunStepDeltaStepDetailsMessageCreationObject](docs/Model/RunStepDeltaStepDetailsMessageCreationObject.md)
- [RunStepDeltaStepDetailsMessageCreationObjectMessageCreation](docs/Model/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md)
- [RunStepDeltaStepDetailsToolCallsCodeObject](docs/Model/RunStepDeltaStepDetailsToolCallsCodeObject.md)
- [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter](docs/Model/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md)
- [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/Model/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
- [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject](docs/Model/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.md)
- [RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage](docs/Model/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md)
- [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject](docs/Model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.md)
- [RunStepDeltaStepDetailsToolCallsFunctionObject](docs/Model/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
- [RunStepDeltaStepDetailsToolCallsFunctionObjectFunction](docs/Model/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md)
- [RunStepDeltaStepDetailsToolCallsObject](docs/Model/RunStepDeltaStepDetailsToolCallsObject.md)
- [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner](docs/Model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)
- [RunStepDeltaStepDetailsToolCallsRetrievalObject](docs/Model/RunStepDeltaStepDetailsToolCallsRetrievalObject.md)
- [RunStepDetailsMessageCreationObject](docs/Model/RunStepDetailsMessageCreationObject.md)
- [RunStepDetailsMessageCreationObjectMessageCreation](docs/Model/RunStepDetailsMessageCreationObjectMessageCreation.md)
- [RunStepDetailsToolCallsCodeObject](docs/Model/RunStepDetailsToolCallsCodeObject.md)
- [RunStepDetailsToolCallsCodeObjectCodeInterpreter](docs/Model/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
- [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/Model/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
- [RunStepDetailsToolCallsCodeOutputImageObject](docs/Model/RunStepDetailsToolCallsCodeOutputImageObject.md)
- [RunStepDetailsToolCallsCodeOutputImageObjectImage](docs/Model/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
- [RunStepDetailsToolCallsCodeOutputLogsObject](docs/Model/RunStepDetailsToolCallsCodeOutputLogsObject.md)
- [RunStepDetailsToolCallsFunctionObject](docs/Model/RunStepDetailsToolCallsFunctionObject.md)
- [RunStepDetailsToolCallsFunctionObjectFunction](docs/Model/RunStepDetailsToolCallsFunctionObjectFunction.md)
- [RunStepDetailsToolCallsObject](docs/Model/RunStepDetailsToolCallsObject.md)
- [RunStepDetailsToolCallsObjectToolCallsInner](docs/Model/RunStepDetailsToolCallsObjectToolCallsInner.md)
- [RunStepDetailsToolCallsRetrievalObject](docs/Model/RunStepDetailsToolCallsRetrievalObject.md)
- [RunStepObject](docs/Model/RunStepObject.md)
- [RunStepObjectLastError](docs/Model/RunStepObjectLastError.md)
- [RunStepObjectStepDetails](docs/Model/RunStepObjectStepDetails.md)
- [RunStepStreamEvent](docs/Model/RunStepStreamEvent.md)
- [RunStepStreamEventOneOf](docs/Model/RunStepStreamEventOneOf.md)
- [RunStepStreamEventOneOf1](docs/Model/RunStepStreamEventOneOf1.md)
- [RunStepStreamEventOneOf2](docs/Model/RunStepStreamEventOneOf2.md)
- [RunStepStreamEventOneOf3](docs/Model/RunStepStreamEventOneOf3.md)
- [RunStepStreamEventOneOf4](docs/Model/RunStepStreamEventOneOf4.md)
- [RunStepStreamEventOneOf5](docs/Model/RunStepStreamEventOneOf5.md)
- [RunStepStreamEventOneOf6](docs/Model/RunStepStreamEventOneOf6.md)
- [RunStreamEvent](docs/Model/RunStreamEvent.md)
- [RunStreamEventOneOf](docs/Model/RunStreamEventOneOf.md)
- [RunStreamEventOneOf1](docs/Model/RunStreamEventOneOf1.md)
- [RunStreamEventOneOf2](docs/Model/RunStreamEventOneOf2.md)
- [RunStreamEventOneOf3](docs/Model/RunStreamEventOneOf3.md)
- [RunStreamEventOneOf4](docs/Model/RunStreamEventOneOf4.md)
- [RunStreamEventOneOf5](docs/Model/RunStreamEventOneOf5.md)
- [RunStreamEventOneOf6](docs/Model/RunStreamEventOneOf6.md)
- [RunStreamEventOneOf7](docs/Model/RunStreamEventOneOf7.md)
- [RunStreamEventOneOf8](docs/Model/RunStreamEventOneOf8.md)
- [RunToolCallObject](docs/Model/RunToolCallObject.md)
- [RunToolCallObjectFunction](docs/Model/RunToolCallObjectFunction.md)
- [SubmitToolOutputsRunRequest](docs/Model/SubmitToolOutputsRunRequest.md)
- [SubmitToolOutputsRunRequestToolOutputsInner](docs/Model/SubmitToolOutputsRunRequestToolOutputsInner.md)
- [ThreadObject](docs/Model/ThreadObject.md)
- [ThreadStreamEvent](docs/Model/ThreadStreamEvent.md)
- [TranscriptionSegment](docs/Model/TranscriptionSegment.md)
- [TranscriptionWord](docs/Model/TranscriptionWord.md)
- [TruncationObject](docs/Model/TruncationObject.md)

## Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: Bearer authentication

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

blah+oapicf@cliffano.com

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `2.0.0`
    - Generator version: `7.18.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
