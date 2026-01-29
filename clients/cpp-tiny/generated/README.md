# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for OpenAI API 2.0.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://api.openai.comhttps://api.openai.com/v1

### AssistantsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*cancelRun* | *POST* /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`..|
|*createAssistant* | *POST* /assistants | Create an assistant with a model and instructions..|
|*createAssistantFile* | *POST* /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants)..|
|*createMessage* | *POST* /threads/{thread_id}/messages | Create a message..|
|*createRun* | *POST* /threads/{thread_id}/runs | Create a run..|
|*createThread* | *POST* /threads | Create a thread..|
|*createThreadAndRun* | *POST* /threads/runs | Create a thread and run it in one request..|
|*deleteAssistant* | *DELETE* /assistants/{assistant_id} | Delete an assistant..|
|*deleteAssistantFile* | *DELETE* /assistants/{assistant_id}/files/{file_id} | Delete an assistant file..|
|*deleteThread* | *DELETE* /threads/{thread_id} | Delete a thread..|
|*getAssistant* | *GET* /assistants/{assistant_id} | Retrieves an assistant..|
|*getAssistantFile* | *GET* /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile..|
|*getMessage* | *GET* /threads/{thread_id}/messages/{message_id} | Retrieve a message..|
|*getMessageFile* | *GET* /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file..|
|*getRun* | *GET* /threads/{thread_id}/runs/{run_id} | Retrieves a run..|
|*getRunStep* | *GET* /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step..|
|*getThread* | *GET* /threads/{thread_id} | Retrieves a thread..|
|*listAssistantFiles* | *GET* /assistants/{assistant_id}/files | Returns a list of assistant files..|
|*listAssistants* | *GET* /assistants | Returns a list of assistants..|
|*listMessageFiles* | *GET* /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files..|
|*listMessages* | *GET* /threads/{thread_id}/messages | Returns a list of messages for a given thread..|
|*listRunSteps* | *GET* /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run..|
|*listRuns* | *GET* /threads/{thread_id}/runs | Returns a list of runs belonging to a thread..|
|*modifyAssistant* | *POST* /assistants/{assistant_id} | Modifies an assistant..|
|*modifyMessage* | *POST* /threads/{thread_id}/messages/{message_id} | Modifies a message..|
|*modifyRun* | *POST* /threads/{thread_id}/runs/{run_id} | Modifies a run..|
|*modifyThread* | *POST* /threads/{thread_id} | Modifies a thread..|
|*submitToolOuputsToRun* | *POST* /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. .|

### AudioApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createSpeech* | *POST* /audio/speech | Generates audio from the input text..|
|*createTranscription* | *POST* /audio/transcriptions | Transcribes audio into the input language..|
|*createTranslation* | *POST* /audio/translations | Translates audio into English..|

### ChatApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createChatCompletion* | *POST* /chat/completions | Creates a model response for the given chat conversation..|

### CompletionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createCompletion* | *POST* /completions | Creates a completion for the provided prompt and parameters..|

### EmbeddingsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createEmbedding* | *POST* /embeddings | Creates an embedding vector representing the input text..|

### FilesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createFile* | *POST* /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. .|
|*deleteFile* | *DELETE* /files/{file_id} | Delete a file..|
|*downloadFile* | *GET* /files/{file_id}/content | Returns the contents of the specified file..|
|*listFiles* | *GET* /files | Returns a list of files that belong to the user's organization..|
|*retrieveFile* | *GET* /files/{file_id} | Returns information about a specific file..|

### FineTuningApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*cancelFineTuningJob* | *POST* /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. .|
|*createFineTuningJob* | *POST* /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .|
|*listFineTuningEvents* | *GET* /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. .|
|*listFineTuningJobCheckpoints* | *GET* /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. .|
|*listPaginatedFineTuningJobs* | *GET* /fine_tuning/jobs | List your organization's fine-tuning jobs .|
|*retrieveFineTuningJob* | *GET* /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .|

### ImagesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createImage* | *POST* /images/generations | Creates an image given a prompt..|
|*createImageEdit* | *POST* /images/edits | Creates an edited or extended image given an original image and a prompt..|
|*createImageVariation* | *POST* /images/variations | Creates a variation of a given image..|

### ModelsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteModel* | *DELETE* /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model..|
|*listModels* | *GET* /models | Lists the currently available models, and provides basic information about each one such as the owner and availability..|
|*retrieveModel* | *GET* /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning..|

### ModerationsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createModeration* | *POST* /moderations | Classifies if text is potentially harmful..|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*AssistantFileObject* | A list of [Files](/docs/api-reference/files) attached to an `assistant`.|
|*AssistantObject* | Represents an `assistant` that can call the model and use tools.|
|*AssistantObject_tools_inner* | |
|*AssistantStreamEvent* | Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. |
|*AssistantToolsCode* | |
|*AssistantToolsFunction* | |
|*AssistantToolsRetrieval* | |
|*AssistantsApiNamedToolChoice* | Specifies a tool the model should use. Use to force the model to call a specific tool.|
|*AssistantsApiResponseFormat* | An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. |
|*AssistantsApiResponseFormatOption* | Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. |
|*AssistantsApiToolChoiceOption* | Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. |
|*ChatCompletionFunctionCallOption* | Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. |
|*ChatCompletionFunctions* | |
|*ChatCompletionMessageToolCall* | |
|*ChatCompletionMessageToolCallChunk* | |
|*ChatCompletionMessageToolCallChunk_function* | |
|*ChatCompletionMessageToolCall_function* | The function that the model called.|
|*ChatCompletionNamedToolChoice* | Specifies a tool the model should use. Use to force the model to call a specific function.|
|*ChatCompletionNamedToolChoice_function* | |
|*ChatCompletionRequestAssistantMessage* | |
|*ChatCompletionRequestAssistantMessage_function_call* | Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.|
|*ChatCompletionRequestFunctionMessage* | |
|*ChatCompletionRequestMessage* | |
|*ChatCompletionRequestMessageContentPart* | |
|*ChatCompletionRequestMessageContentPartImage* | |
|*ChatCompletionRequestMessageContentPartImage_image_url* | |
|*ChatCompletionRequestMessageContentPartText* | |
|*ChatCompletionRequestSystemMessage* | |
|*ChatCompletionRequestToolMessage* | |
|*ChatCompletionRequestUserMessage* | |
|*ChatCompletionRequestUserMessage_content* | The contents of the user message. |
|*ChatCompletionResponseMessage* | A chat completion message generated by the model.|
|*ChatCompletionRole* | The role of the author of a message|
|*ChatCompletionStreamResponseDelta* | A chat completion delta generated by streamed model responses.|
|*ChatCompletionStreamResponseDelta_function_call* | Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.|
|*ChatCompletionTokenLogprob* | |
|*ChatCompletionTokenLogprob_top_logprobs_inner* | |
|*ChatCompletionTool* | |
|*ChatCompletionToolChoiceOption* | Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. |
|*CompletionUsage* | Usage statistics for the completion request.|
|*CreateAssistantFileRequest* | |
|*CreateAssistantRequest* | |
|*CreateAssistantRequest_model* | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. |
|*CreateChatCompletionFunctionResponse* | Represents a chat completion response returned by model, based on the provided input.|
|*CreateChatCompletionFunctionResponse_choices_inner* | |
|*CreateChatCompletionRequest* | |
|*CreateChatCompletionRequest_function_call* | Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. |
|*CreateChatCompletionRequest_model* | ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.|
|*CreateChatCompletionRequest_response_format* | An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. |
|*CreateChatCompletionRequest_stop* | Up to 4 sequences where the API will stop generating further tokens. |
|*CreateChatCompletionResponse* | Represents a chat completion response returned by model, based on the provided input.|
|*CreateChatCompletionResponse_choices_inner* | |
|*CreateChatCompletionResponse_choices_inner_logprobs* | Log probability information for the choice.|
|*CreateChatCompletionStreamResponse* | Represents a streamed chunk of a chat completion response returned by model, based on the provided input.|
|*CreateChatCompletionStreamResponse_choices_inner* | |
|*CreateCompletionRequest* | |
|*CreateCompletionRequest_model* | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. |
|*CreateCompletionRequest_prompt* | The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. |
|*CreateCompletionRequest_stop* | Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. |
|*CreateCompletionResponse* | Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). |
|*CreateCompletionResponse_choices_inner* | |
|*CreateCompletionResponse_choices_inner_logprobs* | |
|*CreateEmbeddingRequest* | |
|*CreateEmbeddingRequest_input* | Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. |
|*CreateEmbeddingRequest_model* | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. |
|*CreateEmbeddingResponse* | |
|*CreateEmbeddingResponse_usage* | The usage information for the request.|
|*CreateFineTuningJobRequest* | |
|*CreateFineTuningJobRequest_hyperparameters* | The hyperparameters used for the fine-tuning job.|
|*CreateFineTuningJobRequest_hyperparameters_batch_size* | Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. |
|*CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier* | Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. |
|*CreateFineTuningJobRequest_hyperparameters_n_epochs* | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. |
|*CreateFineTuningJobRequest_integrations_inner* | |
|*CreateFineTuningJobRequest_integrations_inner_wandb* | The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. |
|*CreateFineTuningJobRequest_model* | The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). |
|*CreateImageEditRequest_model* | The model to use for image generation. Only `dall-e-2` is supported at this time.|
|*CreateImageRequest* | |
|*CreateImageRequest_model* | The model to use for image generation.|
|*CreateMessageRequest* | |
|*CreateModerationRequest* | |
|*CreateModerationRequest_input* | The input text to classify|
|*CreateModerationRequest_model* | Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.  The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`. |
|*CreateModerationResponse* | Represents if a given text input is potentially harmful.|
|*CreateModerationResponse_results_inner* | |
|*CreateModerationResponse_results_inner_categories* | A list of the categories, and whether they are flagged or not.|
|*CreateModerationResponse_results_inner_category_scores* | A list of the categories along with their scores as predicted by model.|
|*CreateRunRequest* | |
|*CreateRunRequest_model* | The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.|
|*CreateSpeechRequest* | |
|*CreateSpeechRequest_model* | One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` |
|*CreateThreadAndRunRequest* | |
|*CreateThreadAndRunRequest_tools_inner* | |
|*CreateThreadRequest* | |
|*CreateTranscriptionRequest_model* | ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. |
|*CreateTranscriptionResponseJson* | Represents a transcription response returned by model, based on the provided input.|
|*CreateTranscriptionResponseVerboseJson* | Represents a verbose json transcription response returned by model, based on the provided input.|
|*CreateTranscription_200_response* | |
|*CreateTranslationResponseJson* | |
|*CreateTranslationResponseVerboseJson* | |
|*CreateTranslation_200_response* | |
|*DeleteAssistantFileResponse* | Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.|
|*DeleteAssistantResponse* | |
|*DeleteFileResponse* | |
|*DeleteMessageResponse* | |
|*DeleteModelResponse* | |
|*DeleteThreadResponse* | |
|*DoneEvent* | Occurs when a stream ends.|
|*Embedding* | Represents an embedding vector returned by embedding endpoint. |
|*Error* | |
|*ErrorEvent* | Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.|
|*ErrorResponse* | |
|*FineTuningIntegration* | |
|*FineTuningJob* | The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. |
|*FineTuningJobCheckpoint* | The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. |
|*FineTuningJobCheckpoint_metrics* | Metrics at the step number during the fine-tuning job.|
|*FineTuningJobEvent* | Fine-tuning job event object|
|*FineTuningJob_error* | For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.|
|*FineTuningJob_hyperparameters* | The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.|
|*FineTuningJob_hyperparameters_n_epochs* | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \"auto\" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.|
|*FineTuningJob_integrations_inner* | |
|*FunctionObject* | |
|*Image* | Represents the url or the content of an image generated by the OpenAI API.|
|*ImagesResponse* | |
|*ListAssistantFilesResponse* | |
|*ListAssistantsResponse* | |
|*ListFilesResponse* | |
|*ListFineTuningJobCheckpointsResponse* | |
|*ListFineTuningJobEventsResponse* | |
|*ListMessageFilesResponse* | |
|*ListMessagesResponse* | |
|*ListModelsResponse* | |
|*ListPaginatedFineTuningJobsResponse* | |
|*ListRunStepsResponse* | |
|*ListRunsResponse* | |
|*ListThreadsResponse* | |
|*MessageContentImageFileObject* | References an image [File](/docs/api-reference/files) in the content of a message.|
|*MessageContentImageFileObject_image_file* | |
|*MessageContentTextAnnotationsFileCitationObject* | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.|
|*MessageContentTextAnnotationsFileCitationObject_file_citation* | |
|*MessageContentTextAnnotationsFilePathObject* | A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.|
|*MessageContentTextAnnotationsFilePathObject_file_path* | |
|*MessageContentTextObject* | The text content that is part of a message.|
|*MessageContentTextObject_text* | |
|*MessageContentTextObject_text_annotations_inner* | |
|*MessageDeltaContentImageFileObject* | References an image [File](/docs/api-reference/files) in the content of a message.|
|*MessageDeltaContentImageFileObject_image_file* | |
|*MessageDeltaContentTextAnnotationsFileCitationObject* | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.|
|*MessageDeltaContentTextAnnotationsFileCitationObject_file_citation* | |
|*MessageDeltaContentTextAnnotationsFilePathObject* | A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.|
|*MessageDeltaContentTextAnnotationsFilePathObject_file_path* | |
|*MessageDeltaContentTextObject* | The text content that is part of a message.|
|*MessageDeltaContentTextObject_text* | |
|*MessageDeltaContentTextObject_text_annotations_inner* | |
|*MessageDeltaObject* | Represents a message delta i.e. any changed fields on a message during streaming. |
|*MessageDeltaObject_delta* | The delta containing the fields that have changed on the Message.|
|*MessageDeltaObject_delta_content_inner* | |
|*MessageFileObject* | A list of files attached to a `message`.|
|*MessageObject* | Represents a message within a [thread](/docs/api-reference/threads).|
|*MessageObject_content_inner* | |
|*MessageObject_incomplete_details* | On an incomplete message, details about why the message is incomplete.|
|*MessageStreamEvent* | |
|*MessageStreamEvent_oneOf* | Occurs when a [message](/docs/api-reference/messages/object) is created.|
|*MessageStreamEvent_oneOf_1* | Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.|
|*MessageStreamEvent_oneOf_2* | Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.|
|*MessageStreamEvent_oneOf_3* | Occurs when a [message](/docs/api-reference/messages/object) is completed.|
|*MessageStreamEvent_oneOf_4* | Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.|
|*Model* | Describes an OpenAI model offering that can be used with the API.|
|*ModifyAssistantRequest* | |
|*ModifyMessageRequest* | |
|*ModifyRunRequest* | |
|*ModifyThreadRequest* | |
|*OpenAIFile* | The `File` object represents a document that has been uploaded to OpenAI.|
|*RunCompletionUsage* | Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).|
|*RunObject* | Represents an execution run on a [thread](/docs/api-reference/threads).|
|*RunObject_incomplete_details* | Details on why the run is incomplete. Will be `null` if the run is not incomplete.|
|*RunObject_last_error* | The last error associated with this run. Will be `null` if there are no errors.|
|*RunObject_required_action* | Details on the action required to continue the run. Will be `null` if no action is required.|
|*RunObject_required_action_submit_tool_outputs* | Details on the tool outputs needed for this run to continue.|
|*RunStepCompletionUsage* | Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.|
|*RunStepDeltaObject* | Represents a run step delta i.e. any changed fields on a run step during streaming. |
|*RunStepDeltaObject_delta* | The delta containing the fields that have changed on the run step.|
|*RunStepDeltaObject_delta_step_details* | The details of the run step.|
|*RunStepDeltaStepDetailsMessageCreationObject* | Details of the message creation by the run step.|
|*RunStepDeltaStepDetailsMessageCreationObject_message_creation* | |
|*RunStepDeltaStepDetailsToolCallsCodeObject* | Details of the Code Interpreter tool call the run step was involved in.|
|*RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter* | The Code Interpreter tool call definition.|
|*RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner* | |
|*RunStepDeltaStepDetailsToolCallsCodeOutputImageObject* | |
|*RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image* | |
|*RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject* | Text output from the Code Interpreter tool call as part of a run step.|
|*RunStepDeltaStepDetailsToolCallsFunctionObject* | |
|*RunStepDeltaStepDetailsToolCallsFunctionObject_function* | The definition of the function that was called.|
|*RunStepDeltaStepDetailsToolCallsObject* | Details of the tool call.|
|*RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner* | |
|*RunStepDeltaStepDetailsToolCallsRetrievalObject* | |
|*RunStepDetailsMessageCreationObject* | Details of the message creation by the run step.|
|*RunStepDetailsMessageCreationObject_message_creation* | |
|*RunStepDetailsToolCallsCodeObject* | Details of the Code Interpreter tool call the run step was involved in.|
|*RunStepDetailsToolCallsCodeObject_code_interpreter* | The Code Interpreter tool call definition.|
|*RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner* | |
|*RunStepDetailsToolCallsCodeOutputImageObject* | |
|*RunStepDetailsToolCallsCodeOutputImageObject_image* | |
|*RunStepDetailsToolCallsCodeOutputLogsObject* | Text output from the Code Interpreter tool call as part of a run step.|
|*RunStepDetailsToolCallsFunctionObject* | |
|*RunStepDetailsToolCallsFunctionObject_function* | The definition of the function that was called.|
|*RunStepDetailsToolCallsObject* | Details of the tool call.|
|*RunStepDetailsToolCallsObject_tool_calls_inner* | |
|*RunStepDetailsToolCallsRetrievalObject* | |
|*RunStepObject* | Represents a step in execution of a run. |
|*RunStepObject_last_error* | The last error associated with this run step. Will be `null` if there are no errors.|
|*RunStepObject_step_details* | The details of the run step.|
|*RunStepStreamEvent* | |
|*RunStepStreamEvent_oneOf* | Occurs when a [run step](/docs/api-reference/runs/step-object) is created.|
|*RunStepStreamEvent_oneOf_1* | Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.|
|*RunStepStreamEvent_oneOf_2* | Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.|
|*RunStepStreamEvent_oneOf_3* | Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.|
|*RunStepStreamEvent_oneOf_4* | Occurs when a [run step](/docs/api-reference/runs/step-object) fails.|
|*RunStepStreamEvent_oneOf_5* | Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.|
|*RunStepStreamEvent_oneOf_6* | Occurs when a [run step](/docs/api-reference/runs/step-object) expires.|
|*RunStreamEvent* | |
|*RunStreamEvent_oneOf* | Occurs when a new [run](/docs/api-reference/runs/object) is created.|
|*RunStreamEvent_oneOf_1* | Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.|
|*RunStreamEvent_oneOf_2* | Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.|
|*RunStreamEvent_oneOf_3* | Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.|
|*RunStreamEvent_oneOf_4* | Occurs when a [run](/docs/api-reference/runs/object) is completed.|
|*RunStreamEvent_oneOf_5* | Occurs when a [run](/docs/api-reference/runs/object) fails.|
|*RunStreamEvent_oneOf_6* | Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.|
|*RunStreamEvent_oneOf_7* | Occurs when a [run](/docs/api-reference/runs/object) is cancelled.|
|*RunStreamEvent_oneOf_8* | Occurs when a [run](/docs/api-reference/runs/object) expires.|
|*RunToolCallObject* | Tool call objects|
|*RunToolCallObject_function* | The function definition.|
|*SubmitToolOutputsRunRequest* | |
|*SubmitToolOutputsRunRequest_tool_outputs_inner* | |
|*ThreadObject* | Represents a thread that contains [messages](/docs/api-reference/messages).|
|*ThreadStreamEvent* | Occurs when a new [thread](/docs/api-reference/threads/object) is created.|
|*TranscriptionSegment* | |
|*TranscriptionWord* | |
|*TruncationObject* | |

