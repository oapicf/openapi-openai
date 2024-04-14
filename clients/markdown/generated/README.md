# Documentation for OpenAI API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *AssistantsApi* | [**cancelRun**](Apis/AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`. |
*AssistantsApi* | [**createAssistant**](Apis/AssistantsApi.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions. |
*AssistantsApi* | [**createAssistantFile**](Apis/AssistantsApi.md#createassistantfile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants). |
*AssistantsApi* | [**createMessage**](Apis/AssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message. |
*AssistantsApi* | [**createRun**](Apis/AssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run. |
*AssistantsApi* | [**createThread**](Apis/AssistantsApi.md#createthread) | **POST** /threads | Create a thread. |
*AssistantsApi* | [**createThreadAndRun**](Apis/AssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request. |
*AssistantsApi* | [**deleteAssistant**](Apis/AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant. |
*AssistantsApi* | [**deleteAssistantFile**](Apis/AssistantsApi.md#deleteassistantfile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file. |
*AssistantsApi* | [**deleteThread**](Apis/AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread. |
*AssistantsApi* | [**getAssistant**](Apis/AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant. |
*AssistantsApi* | [**getAssistantFile**](Apis/AssistantsApi.md#getassistantfile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile. |
*AssistantsApi* | [**getMessage**](Apis/AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message. |
*AssistantsApi* | [**getMessageFile**](Apis/AssistantsApi.md#getmessagefile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file. |
*AssistantsApi* | [**getRun**](Apis/AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run. |
*AssistantsApi* | [**getRunStep**](Apis/AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step. |
*AssistantsApi* | [**getThread**](Apis/AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread. |
*AssistantsApi* | [**listAssistantFiles**](Apis/AssistantsApi.md#listassistantfiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files. |
*AssistantsApi* | [**listAssistants**](Apis/AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants. |
*AssistantsApi* | [**listMessageFiles**](Apis/AssistantsApi.md#listmessagefiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files. |
*AssistantsApi* | [**listMessages**](Apis/AssistantsApi.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread. |
*AssistantsApi* | [**listRunSteps**](Apis/AssistantsApi.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run. |
*AssistantsApi* | [**listRuns**](Apis/AssistantsApi.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread. |
*AssistantsApi* | [**modifyAssistant**](Apis/AssistantsApi.md#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant. |
*AssistantsApi* | [**modifyMessage**](Apis/AssistantsApi.md#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message. |
*AssistantsApi* | [**modifyRun**](Apis/AssistantsApi.md#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run. |
*AssistantsApi* | [**modifyThread**](Apis/AssistantsApi.md#modifythread) | **POST** /threads/{thread_id} | Modifies a thread. |
*AssistantsApi* | [**submitToolOuputsToRun**](Apis/AssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.  |
| *AudioApi* | [**createSpeech**](Apis/AudioApi.md#createspeech) | **POST** /audio/speech | Generates audio from the input text. |
*AudioApi* | [**createTranscription**](Apis/AudioApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
*AudioApi* | [**createTranslation**](Apis/AudioApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English. |
| *ChatApi* | [**createChatCompletion**](Apis/ChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |
| *CompletionsApi* | [**createCompletion**](Apis/CompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
| *EmbeddingsApi* | [**createEmbedding**](Apis/EmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
| *FilesApi* | [**createFile**](Apis/FilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.  |
*FilesApi* | [**deleteFile**](Apis/FilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file. |
*FilesApi* | [**downloadFile**](Apis/FilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file. |
*FilesApi* | [**listFiles**](Apis/FilesApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user's organization. |
*FilesApi* | [**retrieveFile**](Apis/FilesApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file. |
| *FineTuningApi* | [**cancelFineTuningJob**](Apis/FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
*FineTuningApi* | [**createFineTuningJob**](Apis/FineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
*FineTuningApi* | [**listFineTuningEvents**](Apis/FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
*FineTuningApi* | [**listFineTuningJobCheckpoints**](Apis/FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
*FineTuningApi* | [**listPaginatedFineTuningJobs**](Apis/FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization's fine-tuning jobs  |
*FineTuningApi* | [**retrieveFineTuningJob**](Apis/FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| *ImagesApi* | [**createImage**](Apis/ImagesApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt. |
*ImagesApi* | [**createImageEdit**](Apis/ImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
*ImagesApi* | [**createImageVariation**](Apis/ImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image. |
| *ModelsApi* | [**deleteModel**](Apis/ModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. |
*ModelsApi* | [**listModels**](Apis/ModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
*ModelsApi* | [**retrieveModel**](Apis/ModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |
| *ModerationsApi* | [**createModeration**](Apis/ModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text is potentially harmful. |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [AssistantFileObject](./Models/AssistantFileObject.md)
 - [AssistantObject](./Models/AssistantObject.md)
 - [AssistantObject_tools_inner](./Models/AssistantObject_tools_inner.md)
 - [AssistantStreamEvent](./Models/AssistantStreamEvent.md)
 - [AssistantToolsCode](./Models/AssistantToolsCode.md)
 - [AssistantToolsFunction](./Models/AssistantToolsFunction.md)
 - [AssistantToolsRetrieval](./Models/AssistantToolsRetrieval.md)
 - [AssistantsApiNamedToolChoice](./Models/AssistantsApiNamedToolChoice.md)
 - [AssistantsApiResponseFormat](./Models/AssistantsApiResponseFormat.md)
 - [AssistantsApiResponseFormatOption](./Models/AssistantsApiResponseFormatOption.md)
 - [AssistantsApiToolChoiceOption](./Models/AssistantsApiToolChoiceOption.md)
 - [ChatCompletionFunctionCallOption](./Models/ChatCompletionFunctionCallOption.md)
 - [ChatCompletionFunctions](./Models/ChatCompletionFunctions.md)
 - [ChatCompletionMessageToolCall](./Models/ChatCompletionMessageToolCall.md)
 - [ChatCompletionMessageToolCallChunk](./Models/ChatCompletionMessageToolCallChunk.md)
 - [ChatCompletionMessageToolCallChunk_function](./Models/ChatCompletionMessageToolCallChunk_function.md)
 - [ChatCompletionMessageToolCall_function](./Models/ChatCompletionMessageToolCall_function.md)
 - [ChatCompletionNamedToolChoice](./Models/ChatCompletionNamedToolChoice.md)
 - [ChatCompletionNamedToolChoice_function](./Models/ChatCompletionNamedToolChoice_function.md)
 - [ChatCompletionRequestAssistantMessage](./Models/ChatCompletionRequestAssistantMessage.md)
 - [ChatCompletionRequestAssistantMessage_function_call](./Models/ChatCompletionRequestAssistantMessage_function_call.md)
 - [ChatCompletionRequestFunctionMessage](./Models/ChatCompletionRequestFunctionMessage.md)
 - [ChatCompletionRequestMessage](./Models/ChatCompletionRequestMessage.md)
 - [ChatCompletionRequestMessageContentPart](./Models/ChatCompletionRequestMessageContentPart.md)
 - [ChatCompletionRequestMessageContentPartImage](./Models/ChatCompletionRequestMessageContentPartImage.md)
 - [ChatCompletionRequestMessageContentPartImage_image_url](./Models/ChatCompletionRequestMessageContentPartImage_image_url.md)
 - [ChatCompletionRequestMessageContentPartText](./Models/ChatCompletionRequestMessageContentPartText.md)
 - [ChatCompletionRequestSystemMessage](./Models/ChatCompletionRequestSystemMessage.md)
 - [ChatCompletionRequestToolMessage](./Models/ChatCompletionRequestToolMessage.md)
 - [ChatCompletionRequestUserMessage](./Models/ChatCompletionRequestUserMessage.md)
 - [ChatCompletionRequestUserMessage_content](./Models/ChatCompletionRequestUserMessage_content.md)
 - [ChatCompletionResponseMessage](./Models/ChatCompletionResponseMessage.md)
 - [ChatCompletionRole](./Models/ChatCompletionRole.md)
 - [ChatCompletionStreamResponseDelta](./Models/ChatCompletionStreamResponseDelta.md)
 - [ChatCompletionStreamResponseDelta_function_call](./Models/ChatCompletionStreamResponseDelta_function_call.md)
 - [ChatCompletionTokenLogprob](./Models/ChatCompletionTokenLogprob.md)
 - [ChatCompletionTokenLogprob_top_logprobs_inner](./Models/ChatCompletionTokenLogprob_top_logprobs_inner.md)
 - [ChatCompletionTool](./Models/ChatCompletionTool.md)
 - [ChatCompletionToolChoiceOption](./Models/ChatCompletionToolChoiceOption.md)
 - [CompletionUsage](./Models/CompletionUsage.md)
 - [CreateAssistantFileRequest](./Models/CreateAssistantFileRequest.md)
 - [CreateAssistantRequest](./Models/CreateAssistantRequest.md)
 - [CreateAssistantRequest_model](./Models/CreateAssistantRequest_model.md)
 - [CreateChatCompletionFunctionResponse](./Models/CreateChatCompletionFunctionResponse.md)
 - [CreateChatCompletionFunctionResponse_choices_inner](./Models/CreateChatCompletionFunctionResponse_choices_inner.md)
 - [CreateChatCompletionRequest](./Models/CreateChatCompletionRequest.md)
 - [CreateChatCompletionRequest_function_call](./Models/CreateChatCompletionRequest_function_call.md)
 - [CreateChatCompletionRequest_model](./Models/CreateChatCompletionRequest_model.md)
 - [CreateChatCompletionRequest_response_format](./Models/CreateChatCompletionRequest_response_format.md)
 - [CreateChatCompletionRequest_stop](./Models/CreateChatCompletionRequest_stop.md)
 - [CreateChatCompletionResponse](./Models/CreateChatCompletionResponse.md)
 - [CreateChatCompletionResponse_choices_inner](./Models/CreateChatCompletionResponse_choices_inner.md)
 - [CreateChatCompletionResponse_choices_inner_logprobs](./Models/CreateChatCompletionResponse_choices_inner_logprobs.md)
 - [CreateChatCompletionStreamResponse](./Models/CreateChatCompletionStreamResponse.md)
 - [CreateChatCompletionStreamResponse_choices_inner](./Models/CreateChatCompletionStreamResponse_choices_inner.md)
 - [CreateCompletionRequest](./Models/CreateCompletionRequest.md)
 - [CreateCompletionRequest_model](./Models/CreateCompletionRequest_model.md)
 - [CreateCompletionRequest_prompt](./Models/CreateCompletionRequest_prompt.md)
 - [CreateCompletionRequest_stop](./Models/CreateCompletionRequest_stop.md)
 - [CreateCompletionResponse](./Models/CreateCompletionResponse.md)
 - [CreateCompletionResponse_choices_inner](./Models/CreateCompletionResponse_choices_inner.md)
 - [CreateCompletionResponse_choices_inner_logprobs](./Models/CreateCompletionResponse_choices_inner_logprobs.md)
 - [CreateEmbeddingRequest](./Models/CreateEmbeddingRequest.md)
 - [CreateEmbeddingRequest_input](./Models/CreateEmbeddingRequest_input.md)
 - [CreateEmbeddingRequest_model](./Models/CreateEmbeddingRequest_model.md)
 - [CreateEmbeddingResponse](./Models/CreateEmbeddingResponse.md)
 - [CreateEmbeddingResponse_usage](./Models/CreateEmbeddingResponse_usage.md)
 - [CreateFineTuningJobRequest](./Models/CreateFineTuningJobRequest.md)
 - [CreateFineTuningJobRequest_hyperparameters](./Models/CreateFineTuningJobRequest_hyperparameters.md)
 - [CreateFineTuningJobRequest_hyperparameters_batch_size](./Models/CreateFineTuningJobRequest_hyperparameters_batch_size.md)
 - [CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier](./Models/CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.md)
 - [CreateFineTuningJobRequest_hyperparameters_n_epochs](./Models/CreateFineTuningJobRequest_hyperparameters_n_epochs.md)
 - [CreateFineTuningJobRequest_integrations_inner](./Models/CreateFineTuningJobRequest_integrations_inner.md)
 - [CreateFineTuningJobRequest_integrations_inner_type](./Models/CreateFineTuningJobRequest_integrations_inner_type.md)
 - [CreateFineTuningJobRequest_integrations_inner_wandb](./Models/CreateFineTuningJobRequest_integrations_inner_wandb.md)
 - [CreateFineTuningJobRequest_model](./Models/CreateFineTuningJobRequest_model.md)
 - [CreateImageEditRequest_model](./Models/CreateImageEditRequest_model.md)
 - [CreateImageRequest](./Models/CreateImageRequest.md)
 - [CreateImageRequest_model](./Models/CreateImageRequest_model.md)
 - [CreateMessageRequest](./Models/CreateMessageRequest.md)
 - [CreateModerationRequest](./Models/CreateModerationRequest.md)
 - [CreateModerationRequest_input](./Models/CreateModerationRequest_input.md)
 - [CreateModerationRequest_model](./Models/CreateModerationRequest_model.md)
 - [CreateModerationResponse](./Models/CreateModerationResponse.md)
 - [CreateModerationResponse_results_inner](./Models/CreateModerationResponse_results_inner.md)
 - [CreateModerationResponse_results_inner_categories](./Models/CreateModerationResponse_results_inner_categories.md)
 - [CreateModerationResponse_results_inner_category_scores](./Models/CreateModerationResponse_results_inner_category_scores.md)
 - [CreateRunRequest](./Models/CreateRunRequest.md)
 - [CreateRunRequest_model](./Models/CreateRunRequest_model.md)
 - [CreateSpeechRequest](./Models/CreateSpeechRequest.md)
 - [CreateSpeechRequest_model](./Models/CreateSpeechRequest_model.md)
 - [CreateThreadAndRunRequest](./Models/CreateThreadAndRunRequest.md)
 - [CreateThreadAndRunRequest_tools_inner](./Models/CreateThreadAndRunRequest_tools_inner.md)
 - [CreateThreadRequest](./Models/CreateThreadRequest.md)
 - [CreateTranscriptionRequest_model](./Models/CreateTranscriptionRequest_model.md)
 - [CreateTranscriptionResponseJson](./Models/CreateTranscriptionResponseJson.md)
 - [CreateTranscriptionResponseVerboseJson](./Models/CreateTranscriptionResponseVerboseJson.md)
 - [CreateTranslationResponseJson](./Models/CreateTranslationResponseJson.md)
 - [CreateTranslationResponseVerboseJson](./Models/CreateTranslationResponseVerboseJson.md)
 - [DeleteAssistantFileResponse](./Models/DeleteAssistantFileResponse.md)
 - [DeleteAssistantResponse](./Models/DeleteAssistantResponse.md)
 - [DeleteFileResponse](./Models/DeleteFileResponse.md)
 - [DeleteMessageResponse](./Models/DeleteMessageResponse.md)
 - [DeleteModelResponse](./Models/DeleteModelResponse.md)
 - [DeleteThreadResponse](./Models/DeleteThreadResponse.md)
 - [DoneEvent](./Models/DoneEvent.md)
 - [Embedding](./Models/Embedding.md)
 - [Error](./Models/Error.md)
 - [ErrorEvent](./Models/ErrorEvent.md)
 - [ErrorResponse](./Models/ErrorResponse.md)
 - [FineTuningIntegration](./Models/FineTuningIntegration.md)
 - [FineTuningJob](./Models/FineTuningJob.md)
 - [FineTuningJobCheckpoint](./Models/FineTuningJobCheckpoint.md)
 - [FineTuningJobCheckpoint_metrics](./Models/FineTuningJobCheckpoint_metrics.md)
 - [FineTuningJobEvent](./Models/FineTuningJobEvent.md)
 - [FineTuningJob_error](./Models/FineTuningJob_error.md)
 - [FineTuningJob_hyperparameters](./Models/FineTuningJob_hyperparameters.md)
 - [FineTuningJob_hyperparameters_n_epochs](./Models/FineTuningJob_hyperparameters_n_epochs.md)
 - [FineTuningJob_integrations_inner](./Models/FineTuningJob_integrations_inner.md)
 - [FunctionObject](./Models/FunctionObject.md)
 - [Image](./Models/Image.md)
 - [ImagesResponse](./Models/ImagesResponse.md)
 - [ListAssistantFilesResponse](./Models/ListAssistantFilesResponse.md)
 - [ListAssistantsResponse](./Models/ListAssistantsResponse.md)
 - [ListFilesResponse](./Models/ListFilesResponse.md)
 - [ListFineTuningJobCheckpointsResponse](./Models/ListFineTuningJobCheckpointsResponse.md)
 - [ListFineTuningJobEventsResponse](./Models/ListFineTuningJobEventsResponse.md)
 - [ListMessageFilesResponse](./Models/ListMessageFilesResponse.md)
 - [ListMessagesResponse](./Models/ListMessagesResponse.md)
 - [ListModelsResponse](./Models/ListModelsResponse.md)
 - [ListPaginatedFineTuningJobsResponse](./Models/ListPaginatedFineTuningJobsResponse.md)
 - [ListRunStepsResponse](./Models/ListRunStepsResponse.md)
 - [ListRunsResponse](./Models/ListRunsResponse.md)
 - [ListThreadsResponse](./Models/ListThreadsResponse.md)
 - [MessageContentImageFileObject](./Models/MessageContentImageFileObject.md)
 - [MessageContentImageFileObject_image_file](./Models/MessageContentImageFileObject_image_file.md)
 - [MessageContentTextAnnotationsFileCitationObject](./Models/MessageContentTextAnnotationsFileCitationObject.md)
 - [MessageContentTextAnnotationsFileCitationObject_file_citation](./Models/MessageContentTextAnnotationsFileCitationObject_file_citation.md)
 - [MessageContentTextAnnotationsFilePathObject](./Models/MessageContentTextAnnotationsFilePathObject.md)
 - [MessageContentTextAnnotationsFilePathObject_file_path](./Models/MessageContentTextAnnotationsFilePathObject_file_path.md)
 - [MessageContentTextObject](./Models/MessageContentTextObject.md)
 - [MessageContentTextObject_text](./Models/MessageContentTextObject_text.md)
 - [MessageContentTextObject_text_annotations_inner](./Models/MessageContentTextObject_text_annotations_inner.md)
 - [MessageDeltaContentImageFileObject](./Models/MessageDeltaContentImageFileObject.md)
 - [MessageDeltaContentImageFileObject_image_file](./Models/MessageDeltaContentImageFileObject_image_file.md)
 - [MessageDeltaContentTextAnnotationsFileCitationObject](./Models/MessageDeltaContentTextAnnotationsFileCitationObject.md)
 - [MessageDeltaContentTextAnnotationsFileCitationObject_file_citation](./Models/MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.md)
 - [MessageDeltaContentTextAnnotationsFilePathObject](./Models/MessageDeltaContentTextAnnotationsFilePathObject.md)
 - [MessageDeltaContentTextAnnotationsFilePathObject_file_path](./Models/MessageDeltaContentTextAnnotationsFilePathObject_file_path.md)
 - [MessageDeltaContentTextObject](./Models/MessageDeltaContentTextObject.md)
 - [MessageDeltaContentTextObject_text](./Models/MessageDeltaContentTextObject_text.md)
 - [MessageDeltaContentTextObject_text_annotations_inner](./Models/MessageDeltaContentTextObject_text_annotations_inner.md)
 - [MessageDeltaObject](./Models/MessageDeltaObject.md)
 - [MessageDeltaObject_delta](./Models/MessageDeltaObject_delta.md)
 - [MessageDeltaObject_delta_content_inner](./Models/MessageDeltaObject_delta_content_inner.md)
 - [MessageFileObject](./Models/MessageFileObject.md)
 - [MessageObject](./Models/MessageObject.md)
 - [MessageObject_content_inner](./Models/MessageObject_content_inner.md)
 - [MessageObject_incomplete_details](./Models/MessageObject_incomplete_details.md)
 - [MessageStreamEvent](./Models/MessageStreamEvent.md)
 - [MessageStreamEvent_oneOf](./Models/MessageStreamEvent_oneOf.md)
 - [MessageStreamEvent_oneOf_1](./Models/MessageStreamEvent_oneOf_1.md)
 - [MessageStreamEvent_oneOf_2](./Models/MessageStreamEvent_oneOf_2.md)
 - [MessageStreamEvent_oneOf_3](./Models/MessageStreamEvent_oneOf_3.md)
 - [MessageStreamEvent_oneOf_4](./Models/MessageStreamEvent_oneOf_4.md)
 - [Model](./Models/Model.md)
 - [ModifyAssistantRequest](./Models/ModifyAssistantRequest.md)
 - [ModifyMessageRequest](./Models/ModifyMessageRequest.md)
 - [ModifyRunRequest](./Models/ModifyRunRequest.md)
 - [ModifyThreadRequest](./Models/ModifyThreadRequest.md)
 - [OpenAIFile](./Models/OpenAIFile.md)
 - [RunCompletionUsage](./Models/RunCompletionUsage.md)
 - [RunObject](./Models/RunObject.md)
 - [RunObject_incomplete_details](./Models/RunObject_incomplete_details.md)
 - [RunObject_last_error](./Models/RunObject_last_error.md)
 - [RunObject_required_action](./Models/RunObject_required_action.md)
 - [RunObject_required_action_submit_tool_outputs](./Models/RunObject_required_action_submit_tool_outputs.md)
 - [RunStepCompletionUsage](./Models/RunStepCompletionUsage.md)
 - [RunStepDeltaObject](./Models/RunStepDeltaObject.md)
 - [RunStepDeltaObject_delta](./Models/RunStepDeltaObject_delta.md)
 - [RunStepDeltaObject_delta_step_details](./Models/RunStepDeltaObject_delta_step_details.md)
 - [RunStepDeltaStepDetailsMessageCreationObject](./Models/RunStepDeltaStepDetailsMessageCreationObject.md)
 - [RunStepDeltaStepDetailsMessageCreationObject_message_creation](./Models/RunStepDeltaStepDetailsMessageCreationObject_message_creation.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObject](./Models/RunStepDeltaStepDetailsToolCallsCodeObject.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter](./Models/RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner](./Models/RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject](./Models/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image](./Models/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject](./Models/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObject](./Models/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObject_function](./Models/RunStepDeltaStepDetailsToolCallsFunctionObject_function.md)
 - [RunStepDeltaStepDetailsToolCallsObject](./Models/RunStepDeltaStepDetailsToolCallsObject.md)
 - [RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner](./Models/RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.md)
 - [RunStepDeltaStepDetailsToolCallsRetrievalObject](./Models/RunStepDeltaStepDetailsToolCallsRetrievalObject.md)
 - [RunStepDetailsMessageCreationObject](./Models/RunStepDetailsMessageCreationObject.md)
 - [RunStepDetailsMessageCreationObject_message_creation](./Models/RunStepDetailsMessageCreationObject_message_creation.md)
 - [RunStepDetailsToolCallsCodeObject](./Models/RunStepDetailsToolCallsCodeObject.md)
 - [RunStepDetailsToolCallsCodeObject_code_interpreter](./Models/RunStepDetailsToolCallsCodeObject_code_interpreter.md)
 - [RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner](./Models/RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.md)
 - [RunStepDetailsToolCallsCodeOutputImageObject](./Models/RunStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDetailsToolCallsCodeOutputImageObject_image](./Models/RunStepDetailsToolCallsCodeOutputImageObject_image.md)
 - [RunStepDetailsToolCallsCodeOutputLogsObject](./Models/RunStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDetailsToolCallsFunctionObject](./Models/RunStepDetailsToolCallsFunctionObject.md)
 - [RunStepDetailsToolCallsFunctionObject_function](./Models/RunStepDetailsToolCallsFunctionObject_function.md)
 - [RunStepDetailsToolCallsObject](./Models/RunStepDetailsToolCallsObject.md)
 - [RunStepDetailsToolCallsObject_tool_calls_inner](./Models/RunStepDetailsToolCallsObject_tool_calls_inner.md)
 - [RunStepDetailsToolCallsRetrievalObject](./Models/RunStepDetailsToolCallsRetrievalObject.md)
 - [RunStepObject](./Models/RunStepObject.md)
 - [RunStepObject_last_error](./Models/RunStepObject_last_error.md)
 - [RunStepObject_step_details](./Models/RunStepObject_step_details.md)
 - [RunStepStreamEvent](./Models/RunStepStreamEvent.md)
 - [RunStepStreamEvent_oneOf](./Models/RunStepStreamEvent_oneOf.md)
 - [RunStepStreamEvent_oneOf_1](./Models/RunStepStreamEvent_oneOf_1.md)
 - [RunStepStreamEvent_oneOf_2](./Models/RunStepStreamEvent_oneOf_2.md)
 - [RunStepStreamEvent_oneOf_3](./Models/RunStepStreamEvent_oneOf_3.md)
 - [RunStepStreamEvent_oneOf_4](./Models/RunStepStreamEvent_oneOf_4.md)
 - [RunStepStreamEvent_oneOf_5](./Models/RunStepStreamEvent_oneOf_5.md)
 - [RunStepStreamEvent_oneOf_6](./Models/RunStepStreamEvent_oneOf_6.md)
 - [RunStreamEvent](./Models/RunStreamEvent.md)
 - [RunStreamEvent_oneOf](./Models/RunStreamEvent_oneOf.md)
 - [RunStreamEvent_oneOf_1](./Models/RunStreamEvent_oneOf_1.md)
 - [RunStreamEvent_oneOf_2](./Models/RunStreamEvent_oneOf_2.md)
 - [RunStreamEvent_oneOf_3](./Models/RunStreamEvent_oneOf_3.md)
 - [RunStreamEvent_oneOf_4](./Models/RunStreamEvent_oneOf_4.md)
 - [RunStreamEvent_oneOf_5](./Models/RunStreamEvent_oneOf_5.md)
 - [RunStreamEvent_oneOf_6](./Models/RunStreamEvent_oneOf_6.md)
 - [RunStreamEvent_oneOf_7](./Models/RunStreamEvent_oneOf_7.md)
 - [RunStreamEvent_oneOf_8](./Models/RunStreamEvent_oneOf_8.md)
 - [RunToolCallObject](./Models/RunToolCallObject.md)
 - [RunToolCallObject_function](./Models/RunToolCallObject_function.md)
 - [SubmitToolOutputsRunRequest](./Models/SubmitToolOutputsRunRequest.md)
 - [SubmitToolOutputsRunRequest_tool_outputs_inner](./Models/SubmitToolOutputsRunRequest_tool_outputs_inner.md)
 - [ThreadObject](./Models/ThreadObject.md)
 - [ThreadStreamEvent](./Models/ThreadStreamEvent.md)
 - [ThreadStreamEvent_oneOf](./Models/ThreadStreamEvent_oneOf.md)
 - [TranscriptionSegment](./Models/TranscriptionSegment.md)
 - [TranscriptionWord](./Models/TranscriptionWord.md)
 - [TruncationObject](./Models/TruncationObject.md)
 - [createTranscription_200_response](./Models/createTranscription_200_response.md)
 - [createTranslation_200_response](./Models/createTranslation_200_response.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: HTTP Bearer Token authentication

