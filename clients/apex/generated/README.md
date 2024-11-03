# OpenAI API API Client


The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASAssistantsApi api = new OASAssistantsApi();
OASClient client = api.getClient();


Map<String, Object> params = new Map<String, Object>{
    'threadId' => 'null',
    'runId' => 'null'
};

try {
    // cross your fingers
    OASRunObject result = api.cancelRun(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASAssistantsApi* | [**cancelRun**](OASAssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
*OASAssistantsApi* | [**createAssistant**](OASAssistantsApi.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
*OASAssistantsApi* | [**createAssistantFile**](OASAssistantsApi.md#createAssistantFile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
*OASAssistantsApi* | [**createMessage**](OASAssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
*OASAssistantsApi* | [**createRun**](OASAssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
*OASAssistantsApi* | [**createThread**](OASAssistantsApi.md#createThread) | **POST** /threads | Create a thread.
*OASAssistantsApi* | [**createThreadAndRun**](OASAssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
*OASAssistantsApi* | [**deleteAssistant**](OASAssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*OASAssistantsApi* | [**deleteAssistantFile**](OASAssistantsApi.md#deleteAssistantFile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
*OASAssistantsApi* | [**deleteThread**](OASAssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
*OASAssistantsApi* | [**getAssistant**](OASAssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*OASAssistantsApi* | [**getAssistantFile**](OASAssistantsApi.md#getAssistantFile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
*OASAssistantsApi* | [**getMessage**](OASAssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*OASAssistantsApi* | [**getMessageFile**](OASAssistantsApi.md#getMessageFile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
*OASAssistantsApi* | [**getRun**](OASAssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*OASAssistantsApi* | [**getRunStep**](OASAssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*OASAssistantsApi* | [**getThread**](OASAssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
*OASAssistantsApi* | [**listAssistantFiles**](OASAssistantsApi.md#listAssistantFiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files.
*OASAssistantsApi* | [**listAssistants**](OASAssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants.
*OASAssistantsApi* | [**listMessageFiles**](OASAssistantsApi.md#listMessageFiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
*OASAssistantsApi* | [**listMessages**](OASAssistantsApi.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
*OASAssistantsApi* | [**listRunSteps**](OASAssistantsApi.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
*OASAssistantsApi* | [**listRuns**](OASAssistantsApi.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
*OASAssistantsApi* | [**modifyAssistant**](OASAssistantsApi.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
*OASAssistantsApi* | [**modifyMessage**](OASAssistantsApi.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
*OASAssistantsApi* | [**modifyRun**](OASAssistantsApi.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
*OASAssistantsApi* | [**modifyThread**](OASAssistantsApi.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
*OASAssistantsApi* | [**submitToolOuputsToRun**](OASAssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: &quot;requires_action&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they\&#39;re all completed. All outputs must be submitted in a single request.\n
*OASAudioApi* | [**createSpeech**](OASAudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text.
*OASAudioApi* | [**createTranscription**](OASAudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OASAudioApi* | [**createTranslation**](OASAudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
*OASChatApi* | [**createChatCompletion**](OASChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OASCompletionsApi* | [**createCompletion**](OASCompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OASEmbeddingsApi* | [**createEmbedding**](OASEmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OASFilesApi* | [**createFile**](OASFilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.\n\nThe size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.\n\nPlease [contact us](https://help.openai.com/) if you need to increase these storage limits.\n
*OASFilesApi* | [**deleteFile**](OASFilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
*OASFilesApi* | [**downloadFile**](OASFilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*OASFilesApi* | [**listFiles**](OASFilesApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user\&#39;s organization.
*OASFilesApi* | [**retrieveFile**](OASFilesApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
*OASFineTuningApi* | [**cancelFineTuningJob**](OASFineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.\n
*OASFineTuningApi* | [**createFineTuningJob**](OASFineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.\n\nResponse includes details of the enqueued job including job status and the name of the fine-tuned models once complete.\n\n[Learn more about fine-tuning](/docs/guides/fine-tuning)\n
*OASFineTuningApi* | [**listFineTuningEvents**](OASFineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.\n
*OASFineTuningApi* | [**listFineTuningJobCheckpoints**](OASFineTuningApi.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.\n
*OASFineTuningApi* | [**listPaginatedFineTuningJobs**](OASFineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization\&#39;s fine-tuning jobs\n
*OASFineTuningApi* | [**retrieveFineTuningJob**](OASFineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.\n\n[Learn more about fine-tuning](/docs/guides/fine-tuning)\n
*OASImagesApi* | [**createImage**](OASImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
*OASImagesApi* | [**createImageEdit**](OASImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OASImagesApi* | [**createImageVariation**](OASImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
*OASModelsApi* | [**deleteModel**](OASModelsApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*OASModelsApi* | [**listModels**](OASModelsApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OASModelsApi* | [**retrieveModel**](OASModelsApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*OASModerationsApi* | [**createModeration**](OASModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text is potentially harmful.


## Documentation for Models

 - [OASAssistantFileObject](OASAssistantFileObject.md)
 - [OASAssistantObject](OASAssistantObject.md)
 - [OASAssistantObjectToolsInner](OASAssistantObjectToolsInner.md)
 - [OASAssistantStreamEvent](OASAssistantStreamEvent.md)
 - [OASAssistantToolsCode](OASAssistantToolsCode.md)
 - [OASAssistantToolsFunction](OASAssistantToolsFunction.md)
 - [OASAssistantToolsRetrieval](OASAssistantToolsRetrieval.md)
 - [OASAssistantsApiNamedToolChoice](OASAssistantsApiNamedToolChoice.md)
 - [OASAssistantsApiResponseFormat](OASAssistantsApiResponseFormat.md)
 - [OASAssistantsApiResponseFormatOption](OASAssistantsApiResponseFormatOption.md)
 - [OASAssistantsApiToolChoiceOption](OASAssistantsApiToolChoiceOption.md)
 - [OASChatCompletionFunctionCallOption](OASChatCompletionFunctionCallOption.md)
 - [OASChatCompletionFunctions](OASChatCompletionFunctions.md)
 - [OASChatCompletionMessageToolCall](OASChatCompletionMessageToolCall.md)
 - [OASChatCompletionMessageToolCallChun](OASChatCompletionMessageToolCallChun.md)
 - [OASChatCompletionMessageToolCallFunc](OASChatCompletionMessageToolCallFunc.md)
 - [OASChatCompletionNamedToolChoice](OASChatCompletionNamedToolChoice.md)
 - [OASChatCompletionNamedToolChoiceFunc](OASChatCompletionNamedToolChoiceFunc.md)
 - [OASChatCompletionRequestAssistantMes](OASChatCompletionRequestAssistantMes.md)
 - [OASChatCompletionRequestFunctionMess](OASChatCompletionRequestFunctionMess.md)
 - [OASChatCompletionRequestMessage](OASChatCompletionRequestMessage.md)
 - [OASChatCompletionRequestMessageConte](OASChatCompletionRequestMessageConte.md)
 - [OASChatCompletionRequestSystemMessag](OASChatCompletionRequestSystemMessag.md)
 - [OASChatCompletionRequestToolMessage](OASChatCompletionRequestToolMessage.md)
 - [OASChatCompletionRequestUserMessage](OASChatCompletionRequestUserMessage.md)
 - [OASChatCompletionRequestUserMessageC](OASChatCompletionRequestUserMessageC.md)
 - [OASChatCompletionResponseMessage](OASChatCompletionResponseMessage.md)
 - [OASChatCompletionRole](OASChatCompletionRole.md)
 - [OASChatCompletionStreamResponseDelta](OASChatCompletionStreamResponseDelta.md)
 - [OASChatCompletionTokenLogprob](OASChatCompletionTokenLogprob.md)
 - [OASChatCompletionTokenLogprobTopLogp](OASChatCompletionTokenLogprobTopLogp.md)
 - [OASChatCompletionTool](OASChatCompletionTool.md)
 - [OASChatCompletionToolChoiceOption](OASChatCompletionToolChoiceOption.md)
 - [OASCompletionUsage](OASCompletionUsage.md)
 - [OASCreateAssistantFileRequest](OASCreateAssistantFileRequest.md)
 - [OASCreateAssistantRequest](OASCreateAssistantRequest.md)
 - [OASCreateAssistantRequestModel](OASCreateAssistantRequestModel.md)
 - [OASCreateChatCompletionFunctionRespo](OASCreateChatCompletionFunctionRespo.md)
 - [OASCreateChatCompletionRequest](OASCreateChatCompletionRequest.md)
 - [OASCreateChatCompletionRequestFuncti](OASCreateChatCompletionRequestFuncti.md)
 - [OASCreateChatCompletionRequestModel](OASCreateChatCompletionRequestModel.md)
 - [OASCreateChatCompletionRequestRespon](OASCreateChatCompletionRequestRespon.md)
 - [OASCreateChatCompletionRequestStop](OASCreateChatCompletionRequestStop.md)
 - [OASCreateChatCompletionResponse](OASCreateChatCompletionResponse.md)
 - [OASCreateChatCompletionResponseChoic](OASCreateChatCompletionResponseChoic.md)
 - [OASCreateChatCompletionStreamRespons](OASCreateChatCompletionStreamRespons.md)
 - [OASCreateCompletionRequest](OASCreateCompletionRequest.md)
 - [OASCreateCompletionRequestModel](OASCreateCompletionRequestModel.md)
 - [OASCreateCompletionRequestPrompt](OASCreateCompletionRequestPrompt.md)
 - [OASCreateCompletionRequestStop](OASCreateCompletionRequestStop.md)
 - [OASCreateCompletionResponse](OASCreateCompletionResponse.md)
 - [OASCreateCompletionResponseChoicesIn](OASCreateCompletionResponseChoicesIn.md)
 - [OASCreateEmbeddingRequest](OASCreateEmbeddingRequest.md)
 - [OASCreateEmbeddingRequestInput](OASCreateEmbeddingRequestInput.md)
 - [OASCreateEmbeddingRequestModel](OASCreateEmbeddingRequestModel.md)
 - [OASCreateEmbeddingResponse](OASCreateEmbeddingResponse.md)
 - [OASCreateEmbeddingResponseUsage](OASCreateEmbeddingResponseUsage.md)
 - [OASCreateFineTuningJobRequest](OASCreateFineTuningJobRequest.md)
 - [OASCreateFineTuningJobRequestHyperpa](OASCreateFineTuningJobRequestHyperpa.md)
 - [OASCreateFineTuningJobRequestIntegra](OASCreateFineTuningJobRequestIntegra.md)
 - [OASCreateFineTuningJobRequestModel](OASCreateFineTuningJobRequestModel.md)
 - [OASCreateImageEditRequestModel](OASCreateImageEditRequestModel.md)
 - [OASCreateImageRequest](OASCreateImageRequest.md)
 - [OASCreateImageRequestModel](OASCreateImageRequestModel.md)
 - [OASCreateMessageRequest](OASCreateMessageRequest.md)
 - [OASCreateModerationRequest](OASCreateModerationRequest.md)
 - [OASCreateModerationRequestInput](OASCreateModerationRequestInput.md)
 - [OASCreateModerationRequestModel](OASCreateModerationRequestModel.md)
 - [OASCreateModerationResponse](OASCreateModerationResponse.md)
 - [OASCreateModerationResponseResultsIn](OASCreateModerationResponseResultsIn.md)
 - [OASCreateRunRequest](OASCreateRunRequest.md)
 - [OASCreateRunRequestModel](OASCreateRunRequestModel.md)
 - [OASCreateSpeechRequest](OASCreateSpeechRequest.md)
 - [OASCreateSpeechRequestModel](OASCreateSpeechRequestModel.md)
 - [OASCreateThreadAndRunRequest](OASCreateThreadAndRunRequest.md)
 - [OASCreateThreadAndRunRequestToolsInn](OASCreateThreadAndRunRequestToolsInn.md)
 - [OASCreateThreadRequest](OASCreateThreadRequest.md)
 - [OASCreateTranscription200Response](OASCreateTranscription200Response.md)
 - [OASCreateTranscriptionRequestModel](OASCreateTranscriptionRequestModel.md)
 - [OASCreateTranscriptionResponseJson](OASCreateTranscriptionResponseJson.md)
 - [OASCreateTranscriptionResponseVerbos](OASCreateTranscriptionResponseVerbos.md)
 - [OASCreateTranslation200Response](OASCreateTranslation200Response.md)
 - [OASCreateTranslationResponseJson](OASCreateTranslationResponseJson.md)
 - [OASCreateTranslationResponseVerboseJ](OASCreateTranslationResponseVerboseJ.md)
 - [OASDeleteAssistantFileResponse](OASDeleteAssistantFileResponse.md)
 - [OASDeleteAssistantResponse](OASDeleteAssistantResponse.md)
 - [OASDeleteFileResponse](OASDeleteFileResponse.md)
 - [OASDeleteMessageResponse](OASDeleteMessageResponse.md)
 - [OASDeleteModelResponse](OASDeleteModelResponse.md)
 - [OASDeleteThreadResponse](OASDeleteThreadResponse.md)
 - [OASDoneEvent](OASDoneEvent.md)
 - [OASEmbedding](OASEmbedding.md)
 - [OASError](OASError.md)
 - [OASErrorEvent](OASErrorEvent.md)
 - [OASErrorResponse](OASErrorResponse.md)
 - [OASFineTuningIntegration](OASFineTuningIntegration.md)
 - [OASFineTuningJob](OASFineTuningJob.md)
 - [OASFineTuningJobCheckpoint](OASFineTuningJobCheckpoint.md)
 - [OASFineTuningJobCheckpointMetrics](OASFineTuningJobCheckpointMetrics.md)
 - [OASFineTuningJobError](OASFineTuningJobError.md)
 - [OASFineTuningJobEvent](OASFineTuningJobEvent.md)
 - [OASFineTuningJobHyperparameters](OASFineTuningJobHyperparameters.md)
 - [OASFineTuningJobHyperparametersNEpoc](OASFineTuningJobHyperparametersNEpoc.md)
 - [OASFineTuningJobIntegrationsInner](OASFineTuningJobIntegrationsInner.md)
 - [OASFunctionObject](OASFunctionObject.md)
 - [OASImage](OASImage.md)
 - [OASImagesResponse](OASImagesResponse.md)
 - [OASListAssistantFilesResponse](OASListAssistantFilesResponse.md)
 - [OASListAssistantsResponse](OASListAssistantsResponse.md)
 - [OASListFilesResponse](OASListFilesResponse.md)
 - [OASListFineTuningJobCheckpointsRespo](OASListFineTuningJobCheckpointsRespo.md)
 - [OASListFineTuningJobEventsResponse](OASListFineTuningJobEventsResponse.md)
 - [OASListMessageFilesResponse](OASListMessageFilesResponse.md)
 - [OASListMessagesResponse](OASListMessagesResponse.md)
 - [OASListModelsResponse](OASListModelsResponse.md)
 - [OASListPaginatedFineTuningJobsRespon](OASListPaginatedFineTuningJobsRespon.md)
 - [OASListRunStepsResponse](OASListRunStepsResponse.md)
 - [OASListRunsResponse](OASListRunsResponse.md)
 - [OASListThreadsResponse](OASListThreadsResponse.md)
 - [OASMessageContentImageFileObject](OASMessageContentImageFileObject.md)
 - [OASMessageContentImageFileObjectImag](OASMessageContentImageFileObjectImag.md)
 - [OASMessageContentTextAnnotationsFile](OASMessageContentTextAnnotationsFile.md)
 - [OASMessageContentTextObject](OASMessageContentTextObject.md)
 - [OASMessageContentTextObjectText](OASMessageContentTextObjectText.md)
 - [OASMessageContentTextObjectTextAnnot](OASMessageContentTextObjectTextAnnot.md)
 - [OASMessageDeltaContentImageFileObjec](OASMessageDeltaContentImageFileObjec.md)
 - [OASMessageDeltaContentTextAnnotation](OASMessageDeltaContentTextAnnotation.md)
 - [OASMessageDeltaContentTextObject](OASMessageDeltaContentTextObject.md)
 - [OASMessageDeltaContentTextObjectText](OASMessageDeltaContentTextObjectText.md)
 - [OASMessageDeltaObject](OASMessageDeltaObject.md)
 - [OASMessageDeltaObjectDelta](OASMessageDeltaObjectDelta.md)
 - [OASMessageDeltaObjectDeltaContentInn](OASMessageDeltaObjectDeltaContentInn.md)
 - [OASMessageFileObject](OASMessageFileObject.md)
 - [OASMessageObject](OASMessageObject.md)
 - [OASMessageObjectContentInner](OASMessageObjectContentInner.md)
 - [OASMessageObjectIncompleteDetails](OASMessageObjectIncompleteDetails.md)
 - [OASMessageStreamEvent](OASMessageStreamEvent.md)
 - [OASMessageStreamEventOneOf](OASMessageStreamEventOneOf.md)
 - [OASMessageStreamEventOneOf1](OASMessageStreamEventOneOf1.md)
 - [OASMessageStreamEventOneOf2](OASMessageStreamEventOneOf2.md)
 - [OASMessageStreamEventOneOf3](OASMessageStreamEventOneOf3.md)
 - [OASMessageStreamEventOneOf4](OASMessageStreamEventOneOf4.md)
 - [OASModel](OASModel.md)
 - [OASModifyAssistantRequest](OASModifyAssistantRequest.md)
 - [OASModifyMessageRequest](OASModifyMessageRequest.md)
 - [OASModifyRunRequest](OASModifyRunRequest.md)
 - [OASModifyThreadRequest](OASModifyThreadRequest.md)
 - [OASOpenAIFile](OASOpenAIFile.md)
 - [OASRunCompletionUsage](OASRunCompletionUsage.md)
 - [OASRunObject](OASRunObject.md)
 - [OASRunObjectIncompleteDetails](OASRunObjectIncompleteDetails.md)
 - [OASRunObjectLastError](OASRunObjectLastError.md)
 - [OASRunObjectRequiredAction](OASRunObjectRequiredAction.md)
 - [OASRunObjectRequiredActionSubmitTool](OASRunObjectRequiredActionSubmitTool.md)
 - [OASRunStepCompletionUsage](OASRunStepCompletionUsage.md)
 - [OASRunStepDeltaObject](OASRunStepDeltaObject.md)
 - [OASRunStepDeltaObjectDelta](OASRunStepDeltaObjectDelta.md)
 - [OASRunStepDeltaObjectDeltaStepDetail](OASRunStepDeltaObjectDeltaStepDetail.md)
 - [OASRunStepDeltaStepDetailsMessageCre](OASRunStepDeltaStepDetailsMessageCre.md)
 - [OASRunStepDeltaStepDetailsToolCallsC](OASRunStepDeltaStepDetailsToolCallsC.md)
 - [OASRunStepDeltaStepDetailsToolCallsF](OASRunStepDeltaStepDetailsToolCallsF.md)
 - [OASRunStepDeltaStepDetailsToolCallsO](OASRunStepDeltaStepDetailsToolCallsO.md)
 - [OASRunStepDeltaStepDetailsToolCallsR](OASRunStepDeltaStepDetailsToolCallsR.md)
 - [OASRunStepDetailsMessageCreationObje](OASRunStepDetailsMessageCreationObje.md)
 - [OASRunStepDetailsToolCallsCodeObject](OASRunStepDetailsToolCallsCodeObject.md)
 - [OASRunStepDetailsToolCallsCodeOutput](OASRunStepDetailsToolCallsCodeOutput.md)
 - [OASRunStepDetailsToolCallsFunctionOb](OASRunStepDetailsToolCallsFunctionOb.md)
 - [OASRunStepDetailsToolCallsObject](OASRunStepDetailsToolCallsObject.md)
 - [OASRunStepDetailsToolCallsObjectTool](OASRunStepDetailsToolCallsObjectTool.md)
 - [OASRunStepDetailsToolCallsRetrievalO](OASRunStepDetailsToolCallsRetrievalO.md)
 - [OASRunStepObject](OASRunStepObject.md)
 - [OASRunStepObjectLastError](OASRunStepObjectLastError.md)
 - [OASRunStepObjectStepDetails](OASRunStepObjectStepDetails.md)
 - [OASRunStepStreamEvent](OASRunStepStreamEvent.md)
 - [OASRunStepStreamEventOneOf](OASRunStepStreamEventOneOf.md)
 - [OASRunStepStreamEventOneOf1](OASRunStepStreamEventOneOf1.md)
 - [OASRunStepStreamEventOneOf2](OASRunStepStreamEventOneOf2.md)
 - [OASRunStepStreamEventOneOf3](OASRunStepStreamEventOneOf3.md)
 - [OASRunStepStreamEventOneOf4](OASRunStepStreamEventOneOf4.md)
 - [OASRunStepStreamEventOneOf5](OASRunStepStreamEventOneOf5.md)
 - [OASRunStepStreamEventOneOf6](OASRunStepStreamEventOneOf6.md)
 - [OASRunStreamEvent](OASRunStreamEvent.md)
 - [OASRunStreamEventOneOf](OASRunStreamEventOneOf.md)
 - [OASRunStreamEventOneOf1](OASRunStreamEventOneOf1.md)
 - [OASRunStreamEventOneOf2](OASRunStreamEventOneOf2.md)
 - [OASRunStreamEventOneOf3](OASRunStreamEventOneOf3.md)
 - [OASRunStreamEventOneOf4](OASRunStreamEventOneOf4.md)
 - [OASRunStreamEventOneOf5](OASRunStreamEventOneOf5.md)
 - [OASRunStreamEventOneOf6](OASRunStreamEventOneOf6.md)
 - [OASRunStreamEventOneOf7](OASRunStreamEventOneOf7.md)
 - [OASRunStreamEventOneOf8](OASRunStreamEventOneOf8.md)
 - [OASRunToolCallObject](OASRunToolCallObject.md)
 - [OASRunToolCallObjectFunction](OASRunToolCallObjectFunction.md)
 - [OASSubmitToolOutputsRunRequest](OASSubmitToolOutputsRunRequest.md)
 - [OASSubmitToolOutputsRunRequestToolOu](OASSubmitToolOutputsRunRequestToolOu.md)
 - [OASThreadObject](OASThreadObject.md)
 - [OASThreadStreamEvent](OASThreadStreamEvent.md)
 - [OASThreadStreamEventOneOf](OASThreadStreamEventOneOf.md)
 - [OASTranscriptionSegment](OASTranscriptionSegment.md)
 - [OASTranscriptionWord](OASTranscriptionWord.md)
 - [OASTruncationObject](OASTruncationObject.md)


## Documentation for Authorization


Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: HTTP Bearer Token authentication


## Author

blah+oapicf@cliffano.com

