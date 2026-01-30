# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for OpenAI API 2.3.0 Tiny client cpp (Arduino) 

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
|*createMessage* | *POST* /threads/{thread_id}/messages | Create a message..|
|*createRun* | *POST* /threads/{thread_id}/runs | Create a run..|
|*createThread* | *POST* /threads | Create a thread..|
|*createThreadAndRun* | *POST* /threads/runs | Create a thread and run it in one request..|
|*deleteAssistant* | *DELETE* /assistants/{assistant_id} | Delete an assistant..|
|*deleteMessage* | *DELETE* /threads/{thread_id}/messages/{message_id} | Deletes a message..|
|*deleteThread* | *DELETE* /threads/{thread_id} | Delete a thread..|
|*getAssistant* | *GET* /assistants/{assistant_id} | Retrieves an assistant..|
|*getMessage* | *GET* /threads/{thread_id}/messages/{message_id} | Retrieve a message..|
|*getRun* | *GET* /threads/{thread_id}/runs/{run_id} | Retrieves a run..|
|*getRunStep* | *GET* /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step..|
|*getThread* | *GET* /threads/{thread_id} | Retrieves a thread..|
|*listAssistants* | *GET* /assistants | Returns a list of assistants..|
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

### AuditLogsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*listAuditLogs* | *GET* /organization/audit_logs | List user actions and configuration changes within this organization..|

### BatchApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*cancelBatch* | *POST* /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file..|
|*createBatch* | *POST* /batches | Creates and executes a batch from an uploaded file of requests.|
|*listBatches* | *GET* /batches | List your organization's batches..|
|*retrieveBatch* | *GET* /batches/{batch_id} | Retrieves a batch..|

### ChatApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createChatCompletion* | *POST* /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). .|

### CompletionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createCompletion* | *POST* /completions | Creates a completion for the provided prompt and parameters..|

### DefaultApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adminApiKeysCreate* | *POST* /organization/admin_api_keys | Create an organization admin API key.|
|*adminApiKeysDelete* | *DELETE* /organization/admin_api_keys/{key_id} | Delete an organization admin API key.|
|*adminApiKeysGet* | *GET* /organization/admin_api_keys/{key_id} | Retrieve a single organization API key.|
|*adminApiKeysList* | *GET* /organization/admin_api_keys | List organization API keys.|

### EmbeddingsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createEmbedding* | *POST* /embeddings | Creates an embedding vector representing the input text..|

### FilesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createFile* | *POST* /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. .|
|*deleteFile* | *DELETE* /files/{file_id} | Delete a file..|
|*downloadFile* | *GET* /files/{file_id}/content | Returns the contents of the specified file..|
|*listFiles* | *GET* /files | Returns a list of files..|
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

### InvitesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteInvite* | *DELETE* /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted..|
|*inviteUser* | *POST* /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization..|
|*listInvites* | *GET* /organization/invites | Returns a list of invites in the organization..|
|*retrieveInvite* | *GET* /organization/invites/{invite_id} | Retrieves an invite..|

### ModelsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteModel* | *DELETE* /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model..|
|*listModels* | *GET* /models | Lists the currently available models, and provides basic information about each one such as the owner and availability..|
|*retrieveModel* | *GET* /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning..|

### ModerationsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createModeration* | *POST* /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). .|

### ProjectsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*archiveProject* | *POST* /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated..|
|*createProject* | *POST* /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted..|
|*createProjectServiceAccount* | *POST* /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account..|
|*createProjectUser* | *POST* /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project..|
|*deleteProjectApiKey* | *DELETE* /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project..|
|*deleteProjectServiceAccount* | *DELETE* /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project..|
|*deleteProjectUser* | *DELETE* /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project..|
|*listProjectApiKeys* | *GET* /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project..|
|*listProjectRateLimits* | *GET* /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project..|
|*listProjectServiceAccounts* | *GET* /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project..|
|*listProjectUsers* | *GET* /organization/projects/{project_id}/users | Returns a list of users in the project..|
|*listProjects* | *GET* /organization/projects | Returns a list of projects..|
|*modifyProject* | *POST* /organization/projects/{project_id} | Modifies a project in the organization..|
|*modifyProjectUser* | *POST* /organization/projects/{project_id}/users/{user_id} | Modifies a user's role in the project..|
|*retrieveProject* | *GET* /organization/projects/{project_id} | Retrieves a project..|
|*retrieveProjectApiKey* | *GET* /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project..|
|*retrieveProjectServiceAccount* | *GET* /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project..|
|*retrieveProjectUser* | *GET* /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project..|
|*updateProjectRateLimits* | *POST* /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit..|

### RealtimeApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createRealtimeSession* | *POST* /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. .|

### UploadsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addUploadPart* | *POST* /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). .|
|*cancelUpload* | *POST* /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. .|
|*completeUpload* | *POST* /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. .|
|*createUpload* | *POST* /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). .|

### UsageApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*usageAudioSpeeches* | *GET* /organization/usage/audio_speeches | Get audio speeches usage details for the organization..|
|*usageAudioTranscriptions* | *GET* /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization..|
|*usageCodeInterpreterSessions* | *GET* /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization..|
|*usageCompletions* | *GET* /organization/usage/completions | Get completions usage details for the organization..|
|*usageCosts* | *GET* /organization/costs | Get costs details for the organization..|
|*usageEmbeddings* | *GET* /organization/usage/embeddings | Get embeddings usage details for the organization..|
|*usageImages* | *GET* /organization/usage/images | Get images usage details for the organization..|
|*usageModerations* | *GET* /organization/usage/moderations | Get moderations usage details for the organization..|
|*usageVectorStores* | *GET* /organization/usage/vector_stores | Get vector stores usage details for the organization..|

### UsersApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteUser* | *DELETE* /organization/users/{user_id} | Deletes a user from the organization..|
|*listUsers* | *GET* /organization/users | Lists all of the users in the organization..|
|*modifyUser* | *POST* /organization/users/{user_id} | Modifies a user's role in the organization..|
|*retrieveUser* | *GET* /organization/users/{user_id} | Retrieves a user by their identifier..|

### VectorStoresApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*cancelVectorStoreFileBatch* | *POST* /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible..|
|*createVectorStore* | *POST* /vector_stores | Create a vector store..|
|*createVectorStoreFile* | *POST* /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object)..|
|*createVectorStoreFileBatch* | *POST* /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch..|
|*deleteVectorStore* | *DELETE* /vector_stores/{vector_store_id} | Delete a vector store..|
|*deleteVectorStoreFile* | *DELETE* /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint..|
|*getVectorStore* | *GET* /vector_stores/{vector_store_id} | Retrieves a vector store..|
|*getVectorStoreFile* | *GET* /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file..|
|*getVectorStoreFileBatch* | *GET* /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch..|
|*listFilesInVectorStoreBatch* | *GET* /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch..|
|*listVectorStoreFiles* | *GET* /vector_stores/{vector_store_id}/files | Returns a list of vector store files..|
|*listVectorStores* | *GET* /vector_stores | Returns a list of vector stores..|
|*modifyVectorStore* | *POST* /vector_stores/{vector_store_id} | Modifies a vector store..|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*AdminApiKey* | |
|*AdminApiKey_owner* | |
|*Admin_api_keys_create_request* | |
|*Admin_api_keys_delete_200_response* | |
|*ApiKeyList* | |
|*Array_of_content_parts_inner* | |
|*AssistantObject* | Represents an `assistant` that can call the model and use tools.|
|*AssistantObject_tool_resources* | A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. |
|*AssistantObject_tool_resources_code_interpreter* | |
|*AssistantObject_tool_resources_file_search* | |
|*AssistantObject_tools_inner* | |
|*AssistantStreamEvent* | Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. |
|*AssistantToolsCode* | |
|*AssistantToolsFileSearch* | |
|*AssistantToolsFileSearchTypeOnly* | |
|*AssistantToolsFileSearch_file_search* | Overrides for the file search tool.|
|*AssistantToolsFunction* | |
|*AssistantsApiResponseFormatOption* | Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. |
|*AssistantsApiToolChoiceOption* | Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. |
|*AssistantsNamedToolChoice* | Specifies a tool the model should use. Use to force the model to call a specific tool.|
|*AssistantsNamedToolChoice_function* | |
|*AudioResponseFormat* | The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. |
|*AuditLog* | A log of a user action or configuration change within this organization.|
|*AuditLogActor* | The actor who performed the audit logged action.|
|*AuditLogActorApiKey* | The API Key used to perform the audit logged action.|
|*AuditLogActorServiceAccount* | The service account that performed the audit logged action.|
|*AuditLogActorSession* | The session in which the audit logged action was performed.|
|*AuditLogActorUser* | The user who performed the audit logged action.|
|*AuditLogEventType* | The event type.|
|*AuditLog_api_key_created* | The details for events with this `type`.|
|*AuditLog_api_key_created_data* | The payload used to create the API key.|
|*AuditLog_api_key_deleted* | The details for events with this `type`.|
|*AuditLog_api_key_updated* | The details for events with this `type`.|
|*AuditLog_api_key_updated_changes_requested* | The payload used to update the API key.|
|*AuditLog_invite_accepted* | The details for events with this `type`.|
|*AuditLog_invite_sent* | The details for events with this `type`.|
|*AuditLog_invite_sent_data* | The payload used to create the invite.|
|*AuditLog_login_failed* | The details for events with this `type`.|
|*AuditLog_organization_updated* | The details for events with this `type`.|
|*AuditLog_organization_updated_changes_requested* | The payload used to update the organization settings.|
|*AuditLog_organization_updated_changes_requested_settings* | |
|*AuditLog_project* | The project that the action was scoped to. Absent for actions not scoped to projects.|
|*AuditLog_project_archived* | The details for events with this `type`.|
|*AuditLog_project_created* | The details for events with this `type`.|
|*AuditLog_project_created_data* | The payload used to create the project.|
|*AuditLog_project_updated* | The details for events with this `type`.|
|*AuditLog_project_updated_changes_requested* | The payload used to update the project.|
|*AuditLog_rate_limit_deleted* | The details for events with this `type`.|
|*AuditLog_rate_limit_updated* | The details for events with this `type`.|
|*AuditLog_rate_limit_updated_changes_requested* | The payload used to update the rate limits.|
|*AuditLog_service_account_created* | The details for events with this `type`.|
|*AuditLog_service_account_created_data* | The payload used to create the service account.|
|*AuditLog_service_account_deleted* | The details for events with this `type`.|
|*AuditLog_service_account_updated* | The details for events with this `type`.|
|*AuditLog_service_account_updated_changes_requested* | The payload used to updated the service account.|
|*AuditLog_user_added* | The details for events with this `type`.|
|*AuditLog_user_added_data* | The payload used to add the user to the project.|
|*AuditLog_user_deleted* | The details for events with this `type`.|
|*AuditLog_user_updated* | The details for events with this `type`.|
|*AuditLog_user_updated_changes_requested* | The payload used to update the user.|
|*AutoChunkingStrategyRequestParam* | The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.|
|*Auto_Chunking_Strategy* | The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.|
|*Batch* | |
|*BatchRequestInput* | The per-line object of the batch input file|
|*BatchRequestOutput* | The per-line object of the batch output and error files|
|*BatchRequestOutput_error* | For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.|
|*BatchRequestOutput_response* | |
|*Batch_errors* | |
|*Batch_errors_data_inner* | |
|*Batch_request_counts* | The request counts for different statuses within the batch.|
|*ChatCompletionFunctionCallOption* | Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. |
|*ChatCompletionFunctions* | |
|*ChatCompletionMessageToolCall* | |
|*ChatCompletionMessageToolCallChunk* | |
|*ChatCompletionMessageToolCallChunk_function* | |
|*ChatCompletionMessageToolCall_function* | The function that the model called.|
|*ChatCompletionNamedToolChoice* | Specifies a tool the model should use. Use to force the model to call a specific function.|
|*ChatCompletionRequestAssistantMessage* | Messages sent by the model in response to user messages. |
|*ChatCompletionRequestAssistantMessageContentPart* | |
|*ChatCompletionRequestAssistantMessage_audio* | Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). |
|*ChatCompletionRequestAssistantMessage_content* | The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. |
|*ChatCompletionRequestAssistantMessage_function_call* | Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.|
|*ChatCompletionRequestDeveloperMessage* | Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. |
|*ChatCompletionRequestDeveloperMessage_content* | The contents of the developer message.|
|*ChatCompletionRequestFunctionMessage* | |
|*ChatCompletionRequestMessage* | |
|*ChatCompletionRequestMessageContentPartAudio* | Learn about [audio inputs](/docs/guides/audio). |
|*ChatCompletionRequestMessageContentPartAudio_input_audio* | |
|*ChatCompletionRequestMessageContentPartImage* | Learn about [image inputs](/docs/guides/vision). |
|*ChatCompletionRequestMessageContentPartImage_image_url* | |
|*ChatCompletionRequestMessageContentPartRefusal* | |
|*ChatCompletionRequestMessageContentPartText* | Learn about [text inputs](/docs/guides/text-generation). |
|*ChatCompletionRequestSystemMessage* | Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. |
|*ChatCompletionRequestSystemMessage_content* | The contents of the system message.|
|*ChatCompletionRequestToolMessage* | |
|*ChatCompletionRequestToolMessage_content* | The contents of the tool message.|
|*ChatCompletionRequestUserMessage* | Messages sent by an end user, containing prompts or additional context information. |
|*ChatCompletionRequestUserMessageContentPart* | |
|*ChatCompletionRequestUserMessage_content* | The contents of the user message. |
|*ChatCompletionResponseMessage* | A chat completion message generated by the model.|
|*ChatCompletionResponseMessage_audio* | If the audio output modality is requested, this object contains data about the audio response from the model. [Learn more](/docs/guides/audio). |
|*ChatCompletionResponseMessage_function_call* | Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.|
|*ChatCompletionRole* | The role of the author of a message|
|*ChatCompletionStreamOptions* | Options for streaming response. Only set this when you set `stream: true`. |
|*ChatCompletionStreamResponseDelta* | A chat completion delta generated by streamed model responses.|
|*ChatCompletionStreamResponseDelta_function_call* | Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.|
|*ChatCompletionTokenLogprob* | |
|*ChatCompletionTokenLogprob_top_logprobs_inner* | |
|*ChatCompletionTool* | |
|*ChatCompletionToolChoiceOption* | Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. |
|*ChunkingStrategyRequestParam* | The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.|
|*CompleteUploadRequest* | |
|*CompletionUsage* | Usage statistics for the completion request.|
|*CompletionUsage_completion_tokens_details* | Breakdown of tokens used in a completion.|
|*CompletionUsage_prompt_tokens_details* | Breakdown of tokens used in the prompt.|
|*CostsResult* | The aggregated costs details of the specific time bucket.|
|*CostsResult_amount* | The monetary value in its associated currency.|
|*CreateAssistantRequest* | |
|*CreateAssistantRequest_model* | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. |
|*CreateAssistantRequest_tool_resources* | A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. |
|*CreateAssistantRequest_tool_resources_code_interpreter* | |
|*CreateAssistantRequest_tool_resources_file_search* | |
|*CreateAssistantRequest_tool_resources_file_search_vector_stores_inner* | |
|*CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy* | The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.|
|*CreateBatch_request* | |
|*CreateChatCompletionFunctionResponse* | Represents a chat completion response returned by model, based on the provided input.|
|*CreateChatCompletionFunctionResponse_choices_inner* | |
|*CreateChatCompletionRequest* | |
|*CreateChatCompletionRequest_audio* | Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). |
|*CreateChatCompletionRequest_function_call* | Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model.  `none` means the model will not call a function and instead generates a message.  `auto` means the model can pick between generating a message or calling a function.  Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. |
|*CreateChatCompletionRequest_model* | ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.|
|*CreateChatCompletionRequest_response_format* | An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. |
|*CreateChatCompletionRequest_stop* | Up to 4 sequences where the API will stop generating further tokens. |
|*CreateChatCompletionResponse* | Represents a chat completion response returned by model, based on the provided input.|
|*CreateChatCompletionResponse_choices_inner* | |
|*CreateChatCompletionResponse_choices_inner_logprobs* | Log probability information for the choice.|
|*CreateChatCompletionStreamResponse* | Represents a streamed chunk of a chat completion response returned by model, based on the provided input.|
|*CreateChatCompletionStreamResponse_choices_inner* | |
|*CreateChatCompletionStreamResponse_usage* | An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. |
|*CreateCompletionRequest* | |
|*CreateCompletionRequest_model* | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. |
|*CreateCompletionRequest_prompt* | The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. |
|*CreateCompletionRequest_stop* | Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. |
|*CreateCompletionResponse* | Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). |
|*CreateCompletionResponse_choices_inner* | |
|*CreateCompletionResponse_choices_inner_logprobs* | |
|*CreateEmbeddingRequest* | |
|*CreateEmbeddingRequest_input* | Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. |
|*CreateEmbeddingRequest_model* | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. |
|*CreateEmbeddingResponse* | |
|*CreateEmbeddingResponse_usage* | The usage information for the request.|
|*CreateFineTuningJobRequest* | |
|*CreateFineTuningJobRequest_hyperparameters* | The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. |
|*CreateFineTuningJobRequest_hyperparameters_batch_size* | Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. |
|*CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier* | Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. |
|*CreateFineTuningJobRequest_hyperparameters_n_epochs* | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. |
|*CreateFineTuningJobRequest_integrations_inner* | |
|*CreateFineTuningJobRequest_integrations_inner_wandb* | The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. |
|*CreateFineTuningJobRequest_model* | The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). |
|*CreateImageEditRequest_model* | The model to use for image generation. Only `dall-e-2` is supported at this time.|
|*CreateImageRequest* | |
|*CreateImageRequest_model* | The model to use for image generation.|
|*CreateMessageRequest* | |
|*CreateMessageRequest_attachments_inner* | |
|*CreateMessageRequest_attachments_inner_tools_inner* | |
|*CreateMessageRequest_content* | |
|*CreateModerationRequest* | |
|*CreateModerationRequest_input* | Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. |
|*CreateModerationRequest_input_oneOf_inner* | |
|*CreateModerationRequest_input_oneOf_inner_oneOf* | An object describing an image to classify.|
|*CreateModerationRequest_input_oneOf_inner_oneOf_1* | An object describing text to classify.|
|*CreateModerationRequest_input_oneOf_inner_oneOf_image_url* | Contains either an image URL or a data URL for a base64 encoded image.|
|*CreateModerationRequest_model* | The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). |
|*CreateModerationResponse* | Represents if a given text input is potentially harmful.|
|*CreateModerationResponse_results_inner* | |
|*CreateModerationResponse_results_inner_categories* | A list of the categories, and whether they are flagged or not.|
|*CreateModerationResponse_results_inner_category_applied_input_types* | A list of the categories along with the input type(s) that the score applies to.|
|*CreateModerationResponse_results_inner_category_scores* | A list of the categories along with their scores as predicted by model.|
|*CreateRunRequest* | |
|*CreateRunRequest_model* | The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.|
|*CreateSpeechRequest* | |
|*CreateSpeechRequest_model* | One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` |
|*CreateThreadAndRunRequest* | |
|*CreateThreadAndRunRequest_tool_resources* | A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. |
|*CreateThreadAndRunRequest_tools_inner* | |
|*CreateThreadRequest* | |
|*CreateThreadRequest_tool_resources* | A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. |
|*CreateThreadRequest_tool_resources_file_search* | |
|*CreateThreadRequest_tool_resources_file_search_vector_stores_inner* | |
|*CreateTranscriptionRequest_model* | ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. |
|*CreateTranscriptionResponseJson* | Represents a transcription response returned by model, based on the provided input.|
|*CreateTranscriptionResponseVerboseJson* | Represents a verbose json transcription response returned by model, based on the provided input.|
|*CreateTranscription_200_response* | |
|*CreateTranslationResponseJson* | |
|*CreateTranslationResponseVerboseJson* | |
|*CreateTranslation_200_response* | |
|*CreateUploadRequest* | |
|*CreateVectorStoreFileBatchRequest* | |
|*CreateVectorStoreFileRequest* | |
|*CreateVectorStoreRequest* | |
|*CreateVectorStoreRequest_chunking_strategy* | The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.|
|*DefaultProjectErrorResponse* | |
|*DeleteAssistantResponse* | |
|*DeleteFileResponse* | |
|*DeleteMessageResponse* | |
|*DeleteModelResponse* | |
|*DeleteThreadResponse* | |
|*DeleteVectorStoreFileResponse* | |
|*DeleteVectorStoreResponse* | |
|*DoneEvent* | Occurs when a stream ends.|
|*Embedding* | Represents an embedding vector returned by embedding endpoint. |
|*Error* | |
|*ErrorEvent* | Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.|
|*ErrorResponse* | |
|*FileSearchRankingOptions* | The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. |
|*FineTuneChatCompletionRequestAssistantMessage* | |
|*FineTuneChatRequestInput* | The per-line training example of a fine-tuning input file for chat models using the supervised method.|
|*FineTuneChatRequestInput_messages_inner* | |
|*FineTuneCompletionRequestInput* | The per-line training example of a fine-tuning input file for completions models|
|*FineTuneDPOMethod* | Configuration for the DPO fine-tuning method.|
|*FineTuneDPOMethod_hyperparameters* | The hyperparameters used for the fine-tuning job.|
|*FineTuneDPOMethod_hyperparameters_batch_size* | Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. |
|*FineTuneDPOMethod_hyperparameters_beta* | The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. |
|*FineTuneDPOMethod_hyperparameters_learning_rate_multiplier* | Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. |
|*FineTuneDPOMethod_hyperparameters_n_epochs* | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. |
|*FineTuneMethod* | The method used for fine-tuning.|
|*FineTunePreferenceRequestInput* | The per-line training example of a fine-tuning input file for chat models using the dpo method.|
|*FineTunePreferenceRequestInput_input* | |
|*FineTunePreferenceRequestInput_preferred_completion_inner* | |
|*FineTuneSupervisedMethod* | Configuration for the supervised fine-tuning method.|
|*FineTuneSupervisedMethod_hyperparameters* | The hyperparameters used for the fine-tuning job.|
|*FineTuningIntegration* | |
|*FineTuningJob* | The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. |
|*FineTuningJobCheckpoint* | The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. |
|*FineTuningJobCheckpoint_metrics* | Metrics at the step number during the fine-tuning job.|
|*FineTuningJobEvent* | Fine-tuning job event object|
|*FineTuningJob_error* | For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.|
|*FineTuningJob_hyperparameters* | The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.|
|*FineTuningJob_integrations_inner* | |
|*FunctionObject* | |
|*Image* | Represents the url or the content of an image generated by the OpenAI API.|
|*ImagesResponse* | |
|*Invite* | Represents an individual `invite` to the organization.|
|*InviteDeleteResponse* | |
|*InviteListResponse* | |
|*InviteRequest* | |
|*InviteRequest_projects_inner* | |
|*Invite_projects_inner* | |
|*ListAssistantsResponse* | |
|*ListAuditLogsResponse* | |
|*ListBatchesResponse* | |
|*ListFilesResponse* | |
|*ListFineTuningJobCheckpointsResponse* | |
|*ListFineTuningJobEventsResponse* | |
|*ListMessagesResponse* | |
|*ListModelsResponse* | |
|*ListPaginatedFineTuningJobsResponse* | |
|*ListRunStepsResponse* | |
|*ListRunsResponse* | |
|*ListThreadsResponse* | |
|*ListVectorStoreFilesResponse* | |
|*ListVectorStoresResponse* | |
|*List_audit_logs_effective_at_parameter* | |
|*MessageContentImageFileObject* | References an image [File](/docs/api-reference/files) in the content of a message.|
|*MessageContentImageFileObject_image_file* | |
|*MessageContentImageUrlObject* | References an image URL in the content of a message.|
|*MessageContentImageUrlObject_image_url* | |
|*MessageContentRefusalObject* | The refusal content generated by the assistant.|
|*MessageContentTextAnnotationsFileCitationObject* | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.|
|*MessageContentTextAnnotationsFileCitationObject_file_citation* | |
|*MessageContentTextAnnotationsFilePathObject* | A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.|
|*MessageContentTextAnnotationsFilePathObject_file_path* | |
|*MessageContentTextObject* | The text content that is part of a message.|
|*MessageContentTextObject_text* | |
|*MessageContentTextObject_text_annotations_inner* | |
|*MessageDeltaContentImageFileObject* | References an image [File](/docs/api-reference/files) in the content of a message.|
|*MessageDeltaContentImageFileObject_image_file* | |
|*MessageDeltaContentImageUrlObject* | References an image URL in the content of a message.|
|*MessageDeltaContentImageUrlObject_image_url* | |
|*MessageDeltaContentRefusalObject* | The refusal content that is part of a message.|
|*MessageDeltaContentTextAnnotationsFileCitationObject* | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.|
|*MessageDeltaContentTextAnnotationsFileCitationObject_file_citation* | |
|*MessageDeltaContentTextAnnotationsFilePathObject* | A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.|
|*MessageDeltaContentTextAnnotationsFilePathObject_file_path* | |
|*MessageDeltaContentTextObject* | The text content that is part of a message.|
|*MessageDeltaContentTextObject_text* | |
|*MessageDeltaContentTextObject_text_annotations_inner* | |
|*MessageDeltaObject* | Represents a message delta i.e. any changed fields on a message during streaming. |
|*MessageDeltaObject_delta* | The delta containing the fields that have changed on the Message.|
|*MessageDeltaObject_delta_content_inner* | |
|*MessageObject* | Represents a message within a [thread](/docs/api-reference/threads).|
|*MessageObject_content_inner* | |
|*MessageObject_incomplete_details* | On an incomplete message, details about why the message is incomplete.|
|*MessageRequestContentTextObject* | The text content that is part of a message.|
|*MessageStreamEvent* | |
|*MessageStreamEvent_oneOf* | Occurs when a [message](/docs/api-reference/messages/object) is created.|
|*MessageStreamEvent_oneOf_1* | Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.|
|*MessageStreamEvent_oneOf_2* | Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.|
|*MessageStreamEvent_oneOf_3* | Occurs when a [message](/docs/api-reference/messages/object) is completed.|
|*MessageStreamEvent_oneOf_4* | Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.|
|*Model* | Describes an OpenAI model offering that can be used with the API.|
|*ModifyAssistantRequest* | |
|*ModifyAssistantRequest_tool_resources* | A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. |
|*ModifyAssistantRequest_tool_resources_code_interpreter* | |
|*ModifyAssistantRequest_tool_resources_file_search* | |
|*ModifyMessageRequest* | |
|*ModifyRunRequest* | |
|*ModifyThreadRequest* | |
|*ModifyThreadRequest_tool_resources* | A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. |
|*ModifyThreadRequest_tool_resources_file_search* | |
|*OpenAIFile* | The `File` object represents a document that has been uploaded to OpenAI.|
|*OtherChunkingStrategyResponseParam* | This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.|
|*PredictionContent* | Static predicted output content, such as the content of a text file that is being regenerated. |
|*PredictionContent_content* | The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. |
|*Project* | Represents an individual project.|
|*ProjectApiKey* | Represents an individual API key in a project.|
|*ProjectApiKeyDeleteResponse* | |
|*ProjectApiKeyListResponse* | |
|*ProjectApiKey_owner* | |
|*ProjectCreateRequest* | |
|*ProjectListResponse* | |
|*ProjectRateLimit* | Represents a project rate limit config.|
|*ProjectRateLimitListResponse* | |
|*ProjectRateLimitUpdateRequest* | |
|*ProjectServiceAccount* | Represents an individual service account in a project.|
|*ProjectServiceAccountApiKey* | |
|*ProjectServiceAccountCreateRequest* | |
|*ProjectServiceAccountCreateResponse* | |
|*ProjectServiceAccountDeleteResponse* | |
|*ProjectServiceAccountListResponse* | |
|*ProjectUpdateRequest* | |
|*ProjectUser* | Represents an individual user in a project.|
|*ProjectUserCreateRequest* | |
|*ProjectUserDeleteResponse* | |
|*ProjectUserListResponse* | |
|*ProjectUserUpdateRequest* | |
|*RealtimeClientEventConversationItemCreate* | Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. |
|*RealtimeClientEventConversationItemDelete* | Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. |
|*RealtimeClientEventConversationItemTruncate* | Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  |
|*RealtimeClientEventInputAudioBufferAppend* | Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. |
|*RealtimeClientEventInputAudioBufferClear* | Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. |
|*RealtimeClientEventInputAudioBufferCommit* | Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. |
|*RealtimeClientEventResponseCancel* | Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. |
|*RealtimeClientEventResponseCreate* | This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. |
|*RealtimeClientEventSessionUpdate* | Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. |
|*RealtimeConversationItem* | The item to add to the conversation.|
|*RealtimeConversationItem_content_inner* | |
|*RealtimeResponse* | The response resource.|
|*RealtimeResponseCreateParams* | Create a new Realtime response with these parameters|
|*RealtimeResponseCreateParams_conversation* | Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. |
|*RealtimeResponseCreateParams_max_response_output_tokens* | Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. |
|*RealtimeResponseCreateParams_tools_inner* | |
|*RealtimeResponse_status_details* | Additional details about the status.|
|*RealtimeResponse_status_details_error* | A description of the error that caused the response to fail,  populated when the `status` is `failed`. |
|*RealtimeResponse_usage* | Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. |
|*RealtimeResponse_usage_input_token_details* | Details about the input tokens used in the Response.|
|*RealtimeResponse_usage_output_token_details* | Details about the output tokens used in the Response.|
|*RealtimeServerEventConversationCreated* | Returned when a conversation is created. Emitted right after session creation. |
|*RealtimeServerEventConversationCreated_conversation* | The conversation resource.|
|*RealtimeServerEventConversationItemCreated* | Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. |
|*RealtimeServerEventConversationItemDeleted* | Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. |
|*RealtimeServerEventConversationItemInputAudioTranscriptionCompleted* | This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. |
|*RealtimeServerEventConversationItemInputAudioTranscriptionFailed* | Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. |
|*RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error* | Details of the transcription error.|
|*RealtimeServerEventConversationItemTruncated* | Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. |
|*RealtimeServerEventError* | Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. |
|*RealtimeServerEventError_error* | Details of the error.|
|*RealtimeServerEventInputAudioBufferCleared* | Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. |
|*RealtimeServerEventInputAudioBufferCommitted* | Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. |
|*RealtimeServerEventInputAudioBufferSpeechStarted* | Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). |
|*RealtimeServerEventInputAudioBufferSpeechStopped* | Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. |
|*RealtimeServerEventRateLimitsUpdated* | Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. |
|*RealtimeServerEventRateLimitsUpdated_rate_limits_inner* | |
|*RealtimeServerEventResponseAudioDelta* | Returned when the model-generated audio is updated.|
|*RealtimeServerEventResponseAudioDone* | Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. |
|*RealtimeServerEventResponseAudioTranscriptDelta* | Returned when the model-generated transcription of audio output is updated. |
|*RealtimeServerEventResponseAudioTranscriptDone* | Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. |
|*RealtimeServerEventResponseContentPartAdded* | Returned when a new content part is added to an assistant message item during response generation. |
|*RealtimeServerEventResponseContentPartAdded_part* | The content part that was added.|
|*RealtimeServerEventResponseContentPartDone* | Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. |
|*RealtimeServerEventResponseContentPartDone_part* | The content part that is done.|
|*RealtimeServerEventResponseCreated* | Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. |
|*RealtimeServerEventResponseDone* | Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. |
|*RealtimeServerEventResponseFunctionCallArgumentsDelta* | Returned when the model-generated function call arguments are updated. |
|*RealtimeServerEventResponseFunctionCallArgumentsDone* | Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. |
|*RealtimeServerEventResponseOutputItemAdded* | Returned when a new Item is created during Response generation.|
|*RealtimeServerEventResponseOutputItemDone* | Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. |
|*RealtimeServerEventResponseTextDelta* | Returned when the text value of a \"text\" content part is updated.|
|*RealtimeServerEventResponseTextDone* | Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. |
|*RealtimeServerEventSessionCreated* | Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. |
|*RealtimeServerEventSessionUpdated* | Returned when a session is updated with a `session.update` event, unless  there is an error. |
|*RealtimeSession* | Realtime session object configuration.|
|*RealtimeSessionCreateRequest* | Realtime session object configuration.|
|*RealtimeSessionCreateRequest_turn_detection* | Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. |
|*RealtimeSessionCreateResponse* | A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. |
|*RealtimeSessionCreateResponse_client_secret* | Ephemeral key returned by the API.|
|*RealtimeSessionCreateResponse_turn_detection* | Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. |
|*RealtimeSession_input_audio_transcription* | Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. |
|*RealtimeSession_model* | The Realtime model used for this session. |
|*RealtimeSession_turn_detection* | Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. |
|*ResponseFormatJsonObject* | |
|*ResponseFormatJsonSchema* | |
|*ResponseFormatJsonSchema_json_schema* | |
|*ResponseFormatText* | |
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
|*RunStepDeltaStepDetailsToolCallsFileSearchObject* | |
|*RunStepDeltaStepDetailsToolCallsFunctionObject* | |
|*RunStepDeltaStepDetailsToolCallsFunctionObject_function* | The definition of the function that was called.|
|*RunStepDeltaStepDetailsToolCallsObject* | Details of the tool call.|
|*RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner* | |
|*RunStepDetailsMessageCreationObject* | Details of the message creation by the run step.|
|*RunStepDetailsMessageCreationObject_message_creation* | |
|*RunStepDetailsToolCallsCodeObject* | Details of the Code Interpreter tool call the run step was involved in.|
|*RunStepDetailsToolCallsCodeObject_code_interpreter* | The Code Interpreter tool call definition.|
|*RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner* | |
|*RunStepDetailsToolCallsCodeOutputImageObject* | |
|*RunStepDetailsToolCallsCodeOutputImageObject_image* | |
|*RunStepDetailsToolCallsCodeOutputLogsObject* | Text output from the Code Interpreter tool call as part of a run step.|
|*RunStepDetailsToolCallsFileSearchObject* | |
|*RunStepDetailsToolCallsFileSearchObject_file_search* | For now, this is always going to be an empty object.|
|*RunStepDetailsToolCallsFileSearchRankingOptionsObject* | The ranking options for the file search.|
|*RunStepDetailsToolCallsFileSearchResultObject* | A result instance of the file search.|
|*RunStepDetailsToolCallsFileSearchResultObject_content_inner* | |
|*RunStepDetailsToolCallsFunctionObject* | |
|*RunStepDetailsToolCallsFunctionObject_function* | The definition of the function that was called.|
|*RunStepDetailsToolCallsObject* | Details of the tool call.|
|*RunStepDetailsToolCallsObject_tool_calls_inner* | |
|*RunStepObject* | Represents a step in execution of a run. |
|*RunStepObject_last_error* | The last error associated with this run step. Will be `null` if there are no errors.|
|*RunStepObject_step_details* | The details of the run step.|
|*RunStepStreamEvent* | |
|*RunStepStreamEvent_oneOf* | Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.|
|*RunStepStreamEvent_oneOf_1* | Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an `in_progress` state.|
|*RunStepStreamEvent_oneOf_2* | Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.|
|*RunStepStreamEvent_oneOf_3* | Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.|
|*RunStepStreamEvent_oneOf_4* | Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.|
|*RunStepStreamEvent_oneOf_5* | Occurs when a [run step](/docs/api-reference/run-steps/step-object) is cancelled.|
|*RunStepStreamEvent_oneOf_6* | Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.|
|*RunStreamEvent* | |
|*RunStreamEvent_oneOf* | Occurs when a new [run](/docs/api-reference/runs/object) is created.|
|*RunStreamEvent_oneOf_1* | Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.|
|*RunStreamEvent_oneOf_2* | Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.|
|*RunStreamEvent_oneOf_3* | Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.|
|*RunStreamEvent_oneOf_4* | Occurs when a [run](/docs/api-reference/runs/object) is completed.|
|*RunStreamEvent_oneOf_5* | Occurs when a [run](/docs/api-reference/runs/object) ends with status `incomplete`.|
|*RunStreamEvent_oneOf_6* | Occurs when a [run](/docs/api-reference/runs/object) fails.|
|*RunStreamEvent_oneOf_7* | Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.|
|*RunStreamEvent_oneOf_8* | Occurs when a [run](/docs/api-reference/runs/object) is cancelled.|
|*RunStreamEvent_oneOf_9* | Occurs when a [run](/docs/api-reference/runs/object) expires.|
|*RunToolCallObject* | Tool call objects|
|*RunToolCallObject_function* | The function definition.|
|*StaticChunkingStrategy* | |
|*StaticChunkingStrategyRequestParam* | |
|*StaticChunkingStrategyResponseParam* | |
|*Static_Chunking_Strategy* | |
|*Static_Chunking_Strategy_static* | |
|*SubmitToolOutputsRunRequest* | |
|*SubmitToolOutputsRunRequest_tool_outputs_inner* | |
|*ThreadObject* | Represents a thread that contains [messages](/docs/api-reference/messages).|
|*ThreadStreamEvent* | Occurs when a new [thread](/docs/api-reference/threads/object) is created.|
|*TranscriptionSegment* | |
|*TranscriptionWord* | |
|*TruncationObject* | Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.|
|*UpdateVectorStoreRequest* | |
|*Upload* | The Upload object can accept byte chunks in the form of Parts. |
|*UploadPart* | The upload Part represents a chunk of bytes we can add to an Upload object. |
|*UsageAudioSpeechesResult* | The aggregated audio speeches usage details of the specific time bucket.|
|*UsageAudioTranscriptionsResult* | The aggregated audio transcriptions usage details of the specific time bucket.|
|*UsageCodeInterpreterSessionsResult* | The aggregated code interpreter sessions usage details of the specific time bucket.|
|*UsageCompletionsResult* | The aggregated completions usage details of the specific time bucket.|
|*UsageEmbeddingsResult* | The aggregated embeddings usage details of the specific time bucket.|
|*UsageImagesResult* | The aggregated images usage details of the specific time bucket.|
|*UsageModerationsResult* | The aggregated moderations usage details of the specific time bucket.|
|*UsageResponse* | |
|*UsageTimeBucket* | |
|*UsageTimeBucket_result_inner* | |
|*UsageVectorStoresResult* | The aggregated vector stores usage details of the specific time bucket.|
|*User* | Represents an individual `user` within an organization.|
|*UserDeleteResponse* | |
|*UserListResponse* | |
|*UserRoleUpdateRequest* | |
|*VectorStoreExpirationAfter* | The expiration policy for a vector store.|
|*VectorStoreFileBatchObject* | A batch of files attached to a vector store.|
|*VectorStoreFileBatchObject_file_counts* | |
|*VectorStoreFileObject* | A list of files attached to a vector store.|
|*VectorStoreFileObject_chunking_strategy* | The strategy used to chunk the file.|
|*VectorStoreFileObject_last_error* | The last error associated with this vector store file. Will be `null` if there are no errors.|
|*VectorStoreObject* | A vector store is a collection of processed files can be used by the `file_search` tool.|
|*VectorStoreObject_file_counts* | |

