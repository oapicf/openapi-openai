# Documentation for OpenAI API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *AssistantsApi* | [**cancelRun**](Apis/AssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`. |
*AssistantsApi* | [**createAssistant**](Apis/AssistantsApi.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions. |
*AssistantsApi* | [**createMessage**](Apis/AssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message. |
*AssistantsApi* | [**createRun**](Apis/AssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run. |
*AssistantsApi* | [**createThread**](Apis/AssistantsApi.md#createThread) | **POST** /threads | Create a thread. |
*AssistantsApi* | [**createThreadAndRun**](Apis/AssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request. |
*AssistantsApi* | [**deleteAssistant**](Apis/AssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant. |
*AssistantsApi* | [**deleteMessage**](Apis/AssistantsApi.md#deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message. |
*AssistantsApi* | [**deleteThread**](Apis/AssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread. |
*AssistantsApi* | [**getAssistant**](Apis/AssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant. |
*AssistantsApi* | [**getMessage**](Apis/AssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message. |
*AssistantsApi* | [**getRun**](Apis/AssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run. |
*AssistantsApi* | [**getRunStep**](Apis/AssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step. |
*AssistantsApi* | [**getThread**](Apis/AssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread. |
*AssistantsApi* | [**listAssistants**](Apis/AssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants. |
*AssistantsApi* | [**listMessages**](Apis/AssistantsApi.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread. |
*AssistantsApi* | [**listRunSteps**](Apis/AssistantsApi.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run. |
*AssistantsApi* | [**listRuns**](Apis/AssistantsApi.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread. |
*AssistantsApi* | [**modifyAssistant**](Apis/AssistantsApi.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant. |
*AssistantsApi* | [**modifyMessage**](Apis/AssistantsApi.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message. |
*AssistantsApi* | [**modifyRun**](Apis/AssistantsApi.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run. |
*AssistantsApi* | [**modifyThread**](Apis/AssistantsApi.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread. |
*AssistantsApi* | [**submitToolOuputsToRun**](Apis/AssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.  |
| *AudioApi* | [**createSpeech**](Apis/AudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text. |
*AudioApi* | [**createTranscription**](Apis/AudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
*AudioApi* | [**createTranslation**](Apis/AudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English. |
| *AuditLogsApi* | [**listAuditLogs**](Apis/AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization. |
| *BatchApi* | [**cancelBatch**](Apis/BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file. |
*BatchApi* | [**createBatch**](Apis/BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
*BatchApi* | [**listBatches**](Apis/BatchApi.md#listBatches) | **GET** /batches | List your organization's batches. |
*BatchApi* | [**retrieveBatch**](Apis/BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch. |
| *ChatApi* | [**createChatCompletion**](Apis/ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).  |
| *CompletionsApi* | [**createCompletion**](Apis/CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
| *DefaultApi* | [**adminApiKeysCreate**](Apis/DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key |
*DefaultApi* | [**adminApiKeysDelete**](Apis/DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
*DefaultApi* | [**adminApiKeysGet**](Apis/DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
*DefaultApi* | [**adminApiKeysList**](Apis/DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys |
| *EmbeddingsApi* | [**createEmbedding**](Apis/EmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
| *FilesApi* | [**createFile**](Apis/FilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.  |
*FilesApi* | [**deleteFile**](Apis/FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file. |
*FilesApi* | [**downloadFile**](Apis/FilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file. |
*FilesApi* | [**listFiles**](Apis/FilesApi.md#listFiles) | **GET** /files | Returns a list of files. |
*FilesApi* | [**retrieveFile**](Apis/FilesApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file. |
| *FineTuningApi* | [**cancelFineTuningJob**](Apis/FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
*FineTuningApi* | [**createFineTuningJob**](Apis/FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
*FineTuningApi* | [**listFineTuningEvents**](Apis/FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
*FineTuningApi* | [**listFineTuningJobCheckpoints**](Apis/FineTuningApi.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
*FineTuningApi* | [**listPaginatedFineTuningJobs**](Apis/FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization's fine-tuning jobs  |
*FineTuningApi* | [**retrieveFineTuningJob**](Apis/FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| *ImagesApi* | [**createImage**](Apis/ImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt. |
*ImagesApi* | [**createImageEdit**](Apis/ImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
*ImagesApi* | [**createImageVariation**](Apis/ImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image. |
| *InvitesApi* | [**deleteInvite**](Apis/InvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted. |
*InvitesApi* | [**inviteUser**](Apis/InvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. |
*InvitesApi* | [**listInvites**](Apis/InvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization. |
*InvitesApi* | [**retrieveInvite**](Apis/InvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite. |
| *ModelsApi* | [**deleteModel**](Apis/ModelsApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. |
*ModelsApi* | [**listModels**](Apis/ModelsApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
*ModelsApi* | [**retrieveModel**](Apis/ModelsApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |
| *ModerationsApi* | [**createModeration**](Apis/ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).  |
| *ProjectsApi* | [**archiveProject**](Apis/ProjectsApi.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated. |
*ProjectsApi* | [**createProject**](Apis/ProjectsApi.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted. |
*ProjectsApi* | [**createProjectServiceAccount**](Apis/ProjectsApi.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account. |
*ProjectsApi* | [**createProjectUser**](Apis/ProjectsApi.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project. |
*ProjectsApi* | [**deleteProjectApiKey**](Apis/ProjectsApi.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project. |
*ProjectsApi* | [**deleteProjectServiceAccount**](Apis/ProjectsApi.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project. |
*ProjectsApi* | [**deleteProjectUser**](Apis/ProjectsApi.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project. |
*ProjectsApi* | [**listProjectApiKeys**](Apis/ProjectsApi.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project. |
*ProjectsApi* | [**listProjectRateLimits**](Apis/ProjectsApi.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project. |
*ProjectsApi* | [**listProjectServiceAccounts**](Apis/ProjectsApi.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project. |
*ProjectsApi* | [**listProjectUsers**](Apis/ProjectsApi.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project. |
*ProjectsApi* | [**listProjects**](Apis/ProjectsApi.md#listProjects) | **GET** /organization/projects | Returns a list of projects. |
*ProjectsApi* | [**modifyProject**](Apis/ProjectsApi.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization. |
*ProjectsApi* | [**modifyProjectUser**](Apis/ProjectsApi.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user's role in the project. |
*ProjectsApi* | [**retrieveProject**](Apis/ProjectsApi.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project. |
*ProjectsApi* | [**retrieveProjectApiKey**](Apis/ProjectsApi.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project. |
*ProjectsApi* | [**retrieveProjectServiceAccount**](Apis/ProjectsApi.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project. |
*ProjectsApi* | [**retrieveProjectUser**](Apis/ProjectsApi.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project. |
*ProjectsApi* | [**updateProjectRateLimits**](Apis/ProjectsApi.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit. |
| *RealtimeApi* | [**createRealtimeSession**](Apis/RealtimeApi.md#createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.  |
| *UploadsApi* | [**addUploadPart**](Apis/UploadsApi.md#addUploadPart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).  |
*UploadsApi* | [**cancelUpload**](Apis/UploadsApi.md#cancelUpload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.  |
*UploadsApi* | [**completeUpload**](Apis/UploadsApi.md#completeUpload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.  |
*UploadsApi* | [**createUpload**](Apis/UploadsApi.md#createUpload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).  |
| *UsageApi* | [**usageAudioSpeeches**](Apis/UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
*UsageApi* | [**usageAudioTranscriptions**](Apis/UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
*UsageApi* | [**usageCodeInterpreterSessions**](Apis/UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
*UsageApi* | [**usageCompletions**](Apis/UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
*UsageApi* | [**usageCosts**](Apis/UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization. |
*UsageApi* | [**usageEmbeddings**](Apis/UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
*UsageApi* | [**usageImages**](Apis/UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization. |
*UsageApi* | [**usageModerations**](Apis/UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
*UsageApi* | [**usageVectorStores**](Apis/UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |
| *UsersApi* | [**deleteUser**](Apis/UsersApi.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization. |
*UsersApi* | [**listUsers**](Apis/UsersApi.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization. |
*UsersApi* | [**modifyUser**](Apis/UsersApi.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user's role in the organization. |
*UsersApi* | [**retrieveUser**](Apis/UsersApi.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier. |
| *VectorStoresApi* | [**cancelVectorStoreFileBatch**](Apis/VectorStoresApi.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. |
*VectorStoresApi* | [**createVectorStore**](Apis/VectorStoresApi.md#createVectorStore) | **POST** /vector_stores | Create a vector store. |
*VectorStoresApi* | [**createVectorStoreFile**](Apis/VectorStoresApi.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). |
*VectorStoresApi* | [**createVectorStoreFileBatch**](Apis/VectorStoresApi.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch. |
*VectorStoresApi* | [**deleteVectorStore**](Apis/VectorStoresApi.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store. |
*VectorStoresApi* | [**deleteVectorStoreFile**](Apis/VectorStoresApi.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. |
*VectorStoresApi* | [**getVectorStore**](Apis/VectorStoresApi.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store. |
*VectorStoresApi* | [**getVectorStoreFile**](Apis/VectorStoresApi.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file. |
*VectorStoresApi* | [**getVectorStoreFileBatch**](Apis/VectorStoresApi.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch. |
*VectorStoresApi* | [**listFilesInVectorStoreBatch**](Apis/VectorStoresApi.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch. |
*VectorStoresApi* | [**listVectorStoreFiles**](Apis/VectorStoresApi.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files. |
*VectorStoresApi* | [**listVectorStores**](Apis/VectorStoresApi.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores. |
*VectorStoresApi* | [**modifyVectorStore**](Apis/VectorStoresApi.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store. |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [AdminApiKey](./Models/AdminApiKey.md)
 - [AdminApiKey_owner](./Models/AdminApiKey_owner.md)
 - [ApiKeyList](./Models/ApiKeyList.md)
 - [Array_of_content_parts_inner](./Models/Array_of_content_parts_inner.md)
 - [AssistantObject](./Models/AssistantObject.md)
 - [AssistantObject_tool_resources](./Models/AssistantObject_tool_resources.md)
 - [AssistantObject_tool_resources_code_interpreter](./Models/AssistantObject_tool_resources_code_interpreter.md)
 - [AssistantObject_tool_resources_file_search](./Models/AssistantObject_tool_resources_file_search.md)
 - [AssistantObject_tools_inner](./Models/AssistantObject_tools_inner.md)
 - [AssistantStreamEvent](./Models/AssistantStreamEvent.md)
 - [AssistantToolsCode](./Models/AssistantToolsCode.md)
 - [AssistantToolsFileSearch](./Models/AssistantToolsFileSearch.md)
 - [AssistantToolsFileSearchTypeOnly](./Models/AssistantToolsFileSearchTypeOnly.md)
 - [AssistantToolsFileSearch_file_search](./Models/AssistantToolsFileSearch_file_search.md)
 - [AssistantToolsFunction](./Models/AssistantToolsFunction.md)
 - [AssistantsApiResponseFormatOption](./Models/AssistantsApiResponseFormatOption.md)
 - [AssistantsApiToolChoiceOption](./Models/AssistantsApiToolChoiceOption.md)
 - [AssistantsNamedToolChoice](./Models/AssistantsNamedToolChoice.md)
 - [AssistantsNamedToolChoice_function](./Models/AssistantsNamedToolChoice_function.md)
 - [AudioResponseFormat](./Models/AudioResponseFormat.md)
 - [AuditLog](./Models/AuditLog.md)
 - [AuditLogActor](./Models/AuditLogActor.md)
 - [AuditLogActorApiKey](./Models/AuditLogActorApiKey.md)
 - [AuditLogActorServiceAccount](./Models/AuditLogActorServiceAccount.md)
 - [AuditLogActorSession](./Models/AuditLogActorSession.md)
 - [AuditLogActorUser](./Models/AuditLogActorUser.md)
 - [AuditLogEventType](./Models/AuditLogEventType.md)
 - [AuditLog_api_key_created](./Models/AuditLog_api_key_created.md)
 - [AuditLog_api_key_created_data](./Models/AuditLog_api_key_created_data.md)
 - [AuditLog_api_key_deleted](./Models/AuditLog_api_key_deleted.md)
 - [AuditLog_api_key_updated](./Models/AuditLog_api_key_updated.md)
 - [AuditLog_api_key_updated_changes_requested](./Models/AuditLog_api_key_updated_changes_requested.md)
 - [AuditLog_invite_accepted](./Models/AuditLog_invite_accepted.md)
 - [AuditLog_invite_sent](./Models/AuditLog_invite_sent.md)
 - [AuditLog_invite_sent_data](./Models/AuditLog_invite_sent_data.md)
 - [AuditLog_login_failed](./Models/AuditLog_login_failed.md)
 - [AuditLog_organization_updated](./Models/AuditLog_organization_updated.md)
 - [AuditLog_organization_updated_changes_requested](./Models/AuditLog_organization_updated_changes_requested.md)
 - [AuditLog_organization_updated_changes_requested_settings](./Models/AuditLog_organization_updated_changes_requested_settings.md)
 - [AuditLog_project](./Models/AuditLog_project.md)
 - [AuditLog_project_archived](./Models/AuditLog_project_archived.md)
 - [AuditLog_project_created](./Models/AuditLog_project_created.md)
 - [AuditLog_project_created_data](./Models/AuditLog_project_created_data.md)
 - [AuditLog_project_updated](./Models/AuditLog_project_updated.md)
 - [AuditLog_project_updated_changes_requested](./Models/AuditLog_project_updated_changes_requested.md)
 - [AuditLog_rate_limit_deleted](./Models/AuditLog_rate_limit_deleted.md)
 - [AuditLog_rate_limit_updated](./Models/AuditLog_rate_limit_updated.md)
 - [AuditLog_rate_limit_updated_changes_requested](./Models/AuditLog_rate_limit_updated_changes_requested.md)
 - [AuditLog_service_account_created](./Models/AuditLog_service_account_created.md)
 - [AuditLog_service_account_created_data](./Models/AuditLog_service_account_created_data.md)
 - [AuditLog_service_account_deleted](./Models/AuditLog_service_account_deleted.md)
 - [AuditLog_service_account_updated](./Models/AuditLog_service_account_updated.md)
 - [AuditLog_service_account_updated_changes_requested](./Models/AuditLog_service_account_updated_changes_requested.md)
 - [AuditLog_user_added](./Models/AuditLog_user_added.md)
 - [AuditLog_user_added_data](./Models/AuditLog_user_added_data.md)
 - [AuditLog_user_deleted](./Models/AuditLog_user_deleted.md)
 - [AuditLog_user_updated](./Models/AuditLog_user_updated.md)
 - [AuditLog_user_updated_changes_requested](./Models/AuditLog_user_updated_changes_requested.md)
 - [AutoChunkingStrategyRequestParam](./Models/AutoChunkingStrategyRequestParam.md)
 - [Auto_Chunking_Strategy](./Models/Auto_Chunking_Strategy.md)
 - [Batch](./Models/Batch.md)
 - [BatchRequestInput](./Models/BatchRequestInput.md)
 - [BatchRequestOutput](./Models/BatchRequestOutput.md)
 - [BatchRequestOutput_error](./Models/BatchRequestOutput_error.md)
 - [BatchRequestOutput_response](./Models/BatchRequestOutput_response.md)
 - [Batch_errors](./Models/Batch_errors.md)
 - [Batch_errors_data_inner](./Models/Batch_errors_data_inner.md)
 - [Batch_request_counts](./Models/Batch_request_counts.md)
 - [ChatCompletionFunctionCallOption](./Models/ChatCompletionFunctionCallOption.md)
 - [ChatCompletionFunctions](./Models/ChatCompletionFunctions.md)
 - [ChatCompletionMessageToolCall](./Models/ChatCompletionMessageToolCall.md)
 - [ChatCompletionMessageToolCallChunk](./Models/ChatCompletionMessageToolCallChunk.md)
 - [ChatCompletionMessageToolCallChunk_function](./Models/ChatCompletionMessageToolCallChunk_function.md)
 - [ChatCompletionMessageToolCall_function](./Models/ChatCompletionMessageToolCall_function.md)
 - [ChatCompletionNamedToolChoice](./Models/ChatCompletionNamedToolChoice.md)
 - [ChatCompletionRequestAssistantMessage](./Models/ChatCompletionRequestAssistantMessage.md)
 - [ChatCompletionRequestAssistantMessageContentPart](./Models/ChatCompletionRequestAssistantMessageContentPart.md)
 - [ChatCompletionRequestAssistantMessage_audio](./Models/ChatCompletionRequestAssistantMessage_audio.md)
 - [ChatCompletionRequestAssistantMessage_content](./Models/ChatCompletionRequestAssistantMessage_content.md)
 - [ChatCompletionRequestAssistantMessage_function_call](./Models/ChatCompletionRequestAssistantMessage_function_call.md)
 - [ChatCompletionRequestDeveloperMessage](./Models/ChatCompletionRequestDeveloperMessage.md)
 - [ChatCompletionRequestDeveloperMessage_content](./Models/ChatCompletionRequestDeveloperMessage_content.md)
 - [ChatCompletionRequestFunctionMessage](./Models/ChatCompletionRequestFunctionMessage.md)
 - [ChatCompletionRequestMessage](./Models/ChatCompletionRequestMessage.md)
 - [ChatCompletionRequestMessageContentPartAudio](./Models/ChatCompletionRequestMessageContentPartAudio.md)
 - [ChatCompletionRequestMessageContentPartAudio_input_audio](./Models/ChatCompletionRequestMessageContentPartAudio_input_audio.md)
 - [ChatCompletionRequestMessageContentPartImage](./Models/ChatCompletionRequestMessageContentPartImage.md)
 - [ChatCompletionRequestMessageContentPartImage_image_url](./Models/ChatCompletionRequestMessageContentPartImage_image_url.md)
 - [ChatCompletionRequestMessageContentPartRefusal](./Models/ChatCompletionRequestMessageContentPartRefusal.md)
 - [ChatCompletionRequestMessageContentPartText](./Models/ChatCompletionRequestMessageContentPartText.md)
 - [ChatCompletionRequestSystemMessage](./Models/ChatCompletionRequestSystemMessage.md)
 - [ChatCompletionRequestSystemMessage_content](./Models/ChatCompletionRequestSystemMessage_content.md)
 - [ChatCompletionRequestToolMessage](./Models/ChatCompletionRequestToolMessage.md)
 - [ChatCompletionRequestToolMessage_content](./Models/ChatCompletionRequestToolMessage_content.md)
 - [ChatCompletionRequestUserMessage](./Models/ChatCompletionRequestUserMessage.md)
 - [ChatCompletionRequestUserMessageContentPart](./Models/ChatCompletionRequestUserMessageContentPart.md)
 - [ChatCompletionRequestUserMessage_content](./Models/ChatCompletionRequestUserMessage_content.md)
 - [ChatCompletionResponseMessage](./Models/ChatCompletionResponseMessage.md)
 - [ChatCompletionResponseMessage_audio](./Models/ChatCompletionResponseMessage_audio.md)
 - [ChatCompletionResponseMessage_function_call](./Models/ChatCompletionResponseMessage_function_call.md)
 - [ChatCompletionRole](./Models/ChatCompletionRole.md)
 - [ChatCompletionStreamOptions](./Models/ChatCompletionStreamOptions.md)
 - [ChatCompletionStreamResponseDelta](./Models/ChatCompletionStreamResponseDelta.md)
 - [ChatCompletionStreamResponseDelta_function_call](./Models/ChatCompletionStreamResponseDelta_function_call.md)
 - [ChatCompletionTokenLogprob](./Models/ChatCompletionTokenLogprob.md)
 - [ChatCompletionTokenLogprob_top_logprobs_inner](./Models/ChatCompletionTokenLogprob_top_logprobs_inner.md)
 - [ChatCompletionTool](./Models/ChatCompletionTool.md)
 - [ChatCompletionToolChoiceOption](./Models/ChatCompletionToolChoiceOption.md)
 - [ChunkingStrategyRequestParam](./Models/ChunkingStrategyRequestParam.md)
 - [CompleteUploadRequest](./Models/CompleteUploadRequest.md)
 - [CompletionUsage](./Models/CompletionUsage.md)
 - [CompletionUsage_completion_tokens_details](./Models/CompletionUsage_completion_tokens_details.md)
 - [CompletionUsage_prompt_tokens_details](./Models/CompletionUsage_prompt_tokens_details.md)
 - [CostsResult](./Models/CostsResult.md)
 - [CostsResult_amount](./Models/CostsResult_amount.md)
 - [CreateAssistantRequest](./Models/CreateAssistantRequest.md)
 - [CreateAssistantRequest_model](./Models/CreateAssistantRequest_model.md)
 - [CreateAssistantRequest_tool_resources](./Models/CreateAssistantRequest_tool_resources.md)
 - [CreateAssistantRequest_tool_resources_code_interpreter](./Models/CreateAssistantRequest_tool_resources_code_interpreter.md)
 - [CreateAssistantRequest_tool_resources_file_search](./Models/CreateAssistantRequest_tool_resources_file_search.md)
 - [CreateAssistantRequest_tool_resources_file_search_vector_stores_inner](./Models/CreateAssistantRequest_tool_resources_file_search_vector_stores_inner.md)
 - [CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy](./Models/CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.md)
 - [CreateChatCompletionFunctionResponse](./Models/CreateChatCompletionFunctionResponse.md)
 - [CreateChatCompletionFunctionResponse_choices_inner](./Models/CreateChatCompletionFunctionResponse_choices_inner.md)
 - [CreateChatCompletionRequest](./Models/CreateChatCompletionRequest.md)
 - [CreateChatCompletionRequest_audio](./Models/CreateChatCompletionRequest_audio.md)
 - [CreateChatCompletionRequest_function_call](./Models/CreateChatCompletionRequest_function_call.md)
 - [CreateChatCompletionRequest_model](./Models/CreateChatCompletionRequest_model.md)
 - [CreateChatCompletionRequest_response_format](./Models/CreateChatCompletionRequest_response_format.md)
 - [CreateChatCompletionRequest_stop](./Models/CreateChatCompletionRequest_stop.md)
 - [CreateChatCompletionResponse](./Models/CreateChatCompletionResponse.md)
 - [CreateChatCompletionResponse_choices_inner](./Models/CreateChatCompletionResponse_choices_inner.md)
 - [CreateChatCompletionResponse_choices_inner_logprobs](./Models/CreateChatCompletionResponse_choices_inner_logprobs.md)
 - [CreateChatCompletionStreamResponse](./Models/CreateChatCompletionStreamResponse.md)
 - [CreateChatCompletionStreamResponse_choices_inner](./Models/CreateChatCompletionStreamResponse_choices_inner.md)
 - [CreateChatCompletionStreamResponse_usage](./Models/CreateChatCompletionStreamResponse_usage.md)
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
 - [CreateFineTuningJobRequest_integrations_inner_wandb](./Models/CreateFineTuningJobRequest_integrations_inner_wandb.md)
 - [CreateFineTuningJobRequest_model](./Models/CreateFineTuningJobRequest_model.md)
 - [CreateImageEditRequest_model](./Models/CreateImageEditRequest_model.md)
 - [CreateImageRequest](./Models/CreateImageRequest.md)
 - [CreateImageRequest_model](./Models/CreateImageRequest_model.md)
 - [CreateMessageRequest](./Models/CreateMessageRequest.md)
 - [CreateMessageRequest_attachments_inner](./Models/CreateMessageRequest_attachments_inner.md)
 - [CreateMessageRequest_attachments_inner_tools_inner](./Models/CreateMessageRequest_attachments_inner_tools_inner.md)
 - [CreateMessageRequest_content](./Models/CreateMessageRequest_content.md)
 - [CreateModerationRequest](./Models/CreateModerationRequest.md)
 - [CreateModerationRequest_input](./Models/CreateModerationRequest_input.md)
 - [CreateModerationRequest_input_oneOf_inner](./Models/CreateModerationRequest_input_oneOf_inner.md)
 - [CreateModerationRequest_input_oneOf_inner_oneOf](./Models/CreateModerationRequest_input_oneOf_inner_oneOf.md)
 - [CreateModerationRequest_input_oneOf_inner_oneOf_1](./Models/CreateModerationRequest_input_oneOf_inner_oneOf_1.md)
 - [CreateModerationRequest_input_oneOf_inner_oneOf_image_url](./Models/CreateModerationRequest_input_oneOf_inner_oneOf_image_url.md)
 - [CreateModerationRequest_model](./Models/CreateModerationRequest_model.md)
 - [CreateModerationResponse](./Models/CreateModerationResponse.md)
 - [CreateModerationResponse_results_inner](./Models/CreateModerationResponse_results_inner.md)
 - [CreateModerationResponse_results_inner_categories](./Models/CreateModerationResponse_results_inner_categories.md)
 - [CreateModerationResponse_results_inner_category_applied_input_types](./Models/CreateModerationResponse_results_inner_category_applied_input_types.md)
 - [CreateModerationResponse_results_inner_category_scores](./Models/CreateModerationResponse_results_inner_category_scores.md)
 - [CreateRunRequest](./Models/CreateRunRequest.md)
 - [CreateRunRequest_model](./Models/CreateRunRequest_model.md)
 - [CreateSpeechRequest](./Models/CreateSpeechRequest.md)
 - [CreateSpeechRequest_model](./Models/CreateSpeechRequest_model.md)
 - [CreateThreadAndRunRequest](./Models/CreateThreadAndRunRequest.md)
 - [CreateThreadAndRunRequest_tool_resources](./Models/CreateThreadAndRunRequest_tool_resources.md)
 - [CreateThreadAndRunRequest_tools_inner](./Models/CreateThreadAndRunRequest_tools_inner.md)
 - [CreateThreadRequest](./Models/CreateThreadRequest.md)
 - [CreateThreadRequest_tool_resources](./Models/CreateThreadRequest_tool_resources.md)
 - [CreateThreadRequest_tool_resources_file_search](./Models/CreateThreadRequest_tool_resources_file_search.md)
 - [CreateThreadRequest_tool_resources_file_search_vector_stores_inner](./Models/CreateThreadRequest_tool_resources_file_search_vector_stores_inner.md)
 - [CreateTranscriptionRequest_model](./Models/CreateTranscriptionRequest_model.md)
 - [CreateTranscriptionResponseJson](./Models/CreateTranscriptionResponseJson.md)
 - [CreateTranscriptionResponseVerboseJson](./Models/CreateTranscriptionResponseVerboseJson.md)
 - [CreateTranslationResponseJson](./Models/CreateTranslationResponseJson.md)
 - [CreateTranslationResponseVerboseJson](./Models/CreateTranslationResponseVerboseJson.md)
 - [CreateUploadRequest](./Models/CreateUploadRequest.md)
 - [CreateVectorStoreFileBatchRequest](./Models/CreateVectorStoreFileBatchRequest.md)
 - [CreateVectorStoreFileRequest](./Models/CreateVectorStoreFileRequest.md)
 - [CreateVectorStoreRequest](./Models/CreateVectorStoreRequest.md)
 - [CreateVectorStoreRequest_chunking_strategy](./Models/CreateVectorStoreRequest_chunking_strategy.md)
 - [DefaultProjectErrorResponse](./Models/DefaultProjectErrorResponse.md)
 - [DeleteAssistantResponse](./Models/DeleteAssistantResponse.md)
 - [DeleteFileResponse](./Models/DeleteFileResponse.md)
 - [DeleteMessageResponse](./Models/DeleteMessageResponse.md)
 - [DeleteModelResponse](./Models/DeleteModelResponse.md)
 - [DeleteThreadResponse](./Models/DeleteThreadResponse.md)
 - [DeleteVectorStoreFileResponse](./Models/DeleteVectorStoreFileResponse.md)
 - [DeleteVectorStoreResponse](./Models/DeleteVectorStoreResponse.md)
 - [DoneEvent](./Models/DoneEvent.md)
 - [Embedding](./Models/Embedding.md)
 - [Error](./Models/Error.md)
 - [ErrorEvent](./Models/ErrorEvent.md)
 - [ErrorResponse](./Models/ErrorResponse.md)
 - [FileSearchRankingOptions](./Models/FileSearchRankingOptions.md)
 - [FineTuneChatCompletionRequestAssistantMessage](./Models/FineTuneChatCompletionRequestAssistantMessage.md)
 - [FineTuneChatRequestInput](./Models/FineTuneChatRequestInput.md)
 - [FineTuneChatRequestInput_messages_inner](./Models/FineTuneChatRequestInput_messages_inner.md)
 - [FineTuneCompletionRequestInput](./Models/FineTuneCompletionRequestInput.md)
 - [FineTuneDPOMethod](./Models/FineTuneDPOMethod.md)
 - [FineTuneDPOMethod_hyperparameters](./Models/FineTuneDPOMethod_hyperparameters.md)
 - [FineTuneDPOMethod_hyperparameters_batch_size](./Models/FineTuneDPOMethod_hyperparameters_batch_size.md)
 - [FineTuneDPOMethod_hyperparameters_beta](./Models/FineTuneDPOMethod_hyperparameters_beta.md)
 - [FineTuneDPOMethod_hyperparameters_learning_rate_multiplier](./Models/FineTuneDPOMethod_hyperparameters_learning_rate_multiplier.md)
 - [FineTuneDPOMethod_hyperparameters_n_epochs](./Models/FineTuneDPOMethod_hyperparameters_n_epochs.md)
 - [FineTuneMethod](./Models/FineTuneMethod.md)
 - [FineTunePreferenceRequestInput](./Models/FineTunePreferenceRequestInput.md)
 - [FineTunePreferenceRequestInput_input](./Models/FineTunePreferenceRequestInput_input.md)
 - [FineTunePreferenceRequestInput_preferred_completion_inner](./Models/FineTunePreferenceRequestInput_preferred_completion_inner.md)
 - [FineTuneSupervisedMethod](./Models/FineTuneSupervisedMethod.md)
 - [FineTuneSupervisedMethod_hyperparameters](./Models/FineTuneSupervisedMethod_hyperparameters.md)
 - [FineTuningIntegration](./Models/FineTuningIntegration.md)
 - [FineTuningJob](./Models/FineTuningJob.md)
 - [FineTuningJobCheckpoint](./Models/FineTuningJobCheckpoint.md)
 - [FineTuningJobCheckpoint_metrics](./Models/FineTuningJobCheckpoint_metrics.md)
 - [FineTuningJobEvent](./Models/FineTuningJobEvent.md)
 - [FineTuningJob_error](./Models/FineTuningJob_error.md)
 - [FineTuningJob_hyperparameters](./Models/FineTuningJob_hyperparameters.md)
 - [FineTuningJob_integrations_inner](./Models/FineTuningJob_integrations_inner.md)
 - [FunctionObject](./Models/FunctionObject.md)
 - [Image](./Models/Image.md)
 - [ImagesResponse](./Models/ImagesResponse.md)
 - [Invite](./Models/Invite.md)
 - [InviteDeleteResponse](./Models/InviteDeleteResponse.md)
 - [InviteListResponse](./Models/InviteListResponse.md)
 - [InviteRequest](./Models/InviteRequest.md)
 - [InviteRequest_projects_inner](./Models/InviteRequest_projects_inner.md)
 - [Invite_projects_inner](./Models/Invite_projects_inner.md)
 - [ListAssistantsResponse](./Models/ListAssistantsResponse.md)
 - [ListAuditLogsResponse](./Models/ListAuditLogsResponse.md)
 - [ListBatchesResponse](./Models/ListBatchesResponse.md)
 - [ListFilesResponse](./Models/ListFilesResponse.md)
 - [ListFineTuningJobCheckpointsResponse](./Models/ListFineTuningJobCheckpointsResponse.md)
 - [ListFineTuningJobEventsResponse](./Models/ListFineTuningJobEventsResponse.md)
 - [ListMessagesResponse](./Models/ListMessagesResponse.md)
 - [ListModelsResponse](./Models/ListModelsResponse.md)
 - [ListPaginatedFineTuningJobsResponse](./Models/ListPaginatedFineTuningJobsResponse.md)
 - [ListRunStepsResponse](./Models/ListRunStepsResponse.md)
 - [ListRunsResponse](./Models/ListRunsResponse.md)
 - [ListThreadsResponse](./Models/ListThreadsResponse.md)
 - [ListVectorStoreFilesResponse](./Models/ListVectorStoreFilesResponse.md)
 - [ListVectorStoresResponse](./Models/ListVectorStoresResponse.md)
 - [MessageContentImageFileObject](./Models/MessageContentImageFileObject.md)
 - [MessageContentImageFileObject_image_file](./Models/MessageContentImageFileObject_image_file.md)
 - [MessageContentImageUrlObject](./Models/MessageContentImageUrlObject.md)
 - [MessageContentImageUrlObject_image_url](./Models/MessageContentImageUrlObject_image_url.md)
 - [MessageContentRefusalObject](./Models/MessageContentRefusalObject.md)
 - [MessageContentTextAnnotationsFileCitationObject](./Models/MessageContentTextAnnotationsFileCitationObject.md)
 - [MessageContentTextAnnotationsFileCitationObject_file_citation](./Models/MessageContentTextAnnotationsFileCitationObject_file_citation.md)
 - [MessageContentTextAnnotationsFilePathObject](./Models/MessageContentTextAnnotationsFilePathObject.md)
 - [MessageContentTextAnnotationsFilePathObject_file_path](./Models/MessageContentTextAnnotationsFilePathObject_file_path.md)
 - [MessageContentTextObject](./Models/MessageContentTextObject.md)
 - [MessageContentTextObject_text](./Models/MessageContentTextObject_text.md)
 - [MessageContentTextObject_text_annotations_inner](./Models/MessageContentTextObject_text_annotations_inner.md)
 - [MessageDeltaContentImageFileObject](./Models/MessageDeltaContentImageFileObject.md)
 - [MessageDeltaContentImageFileObject_image_file](./Models/MessageDeltaContentImageFileObject_image_file.md)
 - [MessageDeltaContentImageUrlObject](./Models/MessageDeltaContentImageUrlObject.md)
 - [MessageDeltaContentImageUrlObject_image_url](./Models/MessageDeltaContentImageUrlObject_image_url.md)
 - [MessageDeltaContentRefusalObject](./Models/MessageDeltaContentRefusalObject.md)
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
 - [MessageObject](./Models/MessageObject.md)
 - [MessageObject_content_inner](./Models/MessageObject_content_inner.md)
 - [MessageObject_incomplete_details](./Models/MessageObject_incomplete_details.md)
 - [MessageRequestContentTextObject](./Models/MessageRequestContentTextObject.md)
 - [MessageStreamEvent](./Models/MessageStreamEvent.md)
 - [MessageStreamEvent_oneOf](./Models/MessageStreamEvent_oneOf.md)
 - [MessageStreamEvent_oneOf_1](./Models/MessageStreamEvent_oneOf_1.md)
 - [MessageStreamEvent_oneOf_2](./Models/MessageStreamEvent_oneOf_2.md)
 - [MessageStreamEvent_oneOf_3](./Models/MessageStreamEvent_oneOf_3.md)
 - [MessageStreamEvent_oneOf_4](./Models/MessageStreamEvent_oneOf_4.md)
 - [Model](./Models/Model.md)
 - [ModifyAssistantRequest](./Models/ModifyAssistantRequest.md)
 - [ModifyAssistantRequest_tool_resources](./Models/ModifyAssistantRequest_tool_resources.md)
 - [ModifyAssistantRequest_tool_resources_code_interpreter](./Models/ModifyAssistantRequest_tool_resources_code_interpreter.md)
 - [ModifyAssistantRequest_tool_resources_file_search](./Models/ModifyAssistantRequest_tool_resources_file_search.md)
 - [ModifyMessageRequest](./Models/ModifyMessageRequest.md)
 - [ModifyRunRequest](./Models/ModifyRunRequest.md)
 - [ModifyThreadRequest](./Models/ModifyThreadRequest.md)
 - [ModifyThreadRequest_tool_resources](./Models/ModifyThreadRequest_tool_resources.md)
 - [ModifyThreadRequest_tool_resources_file_search](./Models/ModifyThreadRequest_tool_resources_file_search.md)
 - [OpenAIFile](./Models/OpenAIFile.md)
 - [OtherChunkingStrategyResponseParam](./Models/OtherChunkingStrategyResponseParam.md)
 - [PredictionContent](./Models/PredictionContent.md)
 - [PredictionContent_content](./Models/PredictionContent_content.md)
 - [Project](./Models/Project.md)
 - [ProjectApiKey](./Models/ProjectApiKey.md)
 - [ProjectApiKeyDeleteResponse](./Models/ProjectApiKeyDeleteResponse.md)
 - [ProjectApiKeyListResponse](./Models/ProjectApiKeyListResponse.md)
 - [ProjectApiKey_owner](./Models/ProjectApiKey_owner.md)
 - [ProjectCreateRequest](./Models/ProjectCreateRequest.md)
 - [ProjectListResponse](./Models/ProjectListResponse.md)
 - [ProjectRateLimit](./Models/ProjectRateLimit.md)
 - [ProjectRateLimitListResponse](./Models/ProjectRateLimitListResponse.md)
 - [ProjectRateLimitUpdateRequest](./Models/ProjectRateLimitUpdateRequest.md)
 - [ProjectServiceAccount](./Models/ProjectServiceAccount.md)
 - [ProjectServiceAccountApiKey](./Models/ProjectServiceAccountApiKey.md)
 - [ProjectServiceAccountCreateRequest](./Models/ProjectServiceAccountCreateRequest.md)
 - [ProjectServiceAccountCreateResponse](./Models/ProjectServiceAccountCreateResponse.md)
 - [ProjectServiceAccountDeleteResponse](./Models/ProjectServiceAccountDeleteResponse.md)
 - [ProjectServiceAccountListResponse](./Models/ProjectServiceAccountListResponse.md)
 - [ProjectUpdateRequest](./Models/ProjectUpdateRequest.md)
 - [ProjectUser](./Models/ProjectUser.md)
 - [ProjectUserCreateRequest](./Models/ProjectUserCreateRequest.md)
 - [ProjectUserDeleteResponse](./Models/ProjectUserDeleteResponse.md)
 - [ProjectUserListResponse](./Models/ProjectUserListResponse.md)
 - [ProjectUserUpdateRequest](./Models/ProjectUserUpdateRequest.md)
 - [RealtimeClientEventConversationItemCreate](./Models/RealtimeClientEventConversationItemCreate.md)
 - [RealtimeClientEventConversationItemDelete](./Models/RealtimeClientEventConversationItemDelete.md)
 - [RealtimeClientEventConversationItemTruncate](./Models/RealtimeClientEventConversationItemTruncate.md)
 - [RealtimeClientEventInputAudioBufferAppend](./Models/RealtimeClientEventInputAudioBufferAppend.md)
 - [RealtimeClientEventInputAudioBufferClear](./Models/RealtimeClientEventInputAudioBufferClear.md)
 - [RealtimeClientEventInputAudioBufferCommit](./Models/RealtimeClientEventInputAudioBufferCommit.md)
 - [RealtimeClientEventResponseCancel](./Models/RealtimeClientEventResponseCancel.md)
 - [RealtimeClientEventResponseCreate](./Models/RealtimeClientEventResponseCreate.md)
 - [RealtimeClientEventSessionUpdate](./Models/RealtimeClientEventSessionUpdate.md)
 - [RealtimeConversationItem](./Models/RealtimeConversationItem.md)
 - [RealtimeConversationItem_content_inner](./Models/RealtimeConversationItem_content_inner.md)
 - [RealtimeResponse](./Models/RealtimeResponse.md)
 - [RealtimeResponseCreateParams](./Models/RealtimeResponseCreateParams.md)
 - [RealtimeResponseCreateParams_conversation](./Models/RealtimeResponseCreateParams_conversation.md)
 - [RealtimeResponseCreateParams_max_response_output_tokens](./Models/RealtimeResponseCreateParams_max_response_output_tokens.md)
 - [RealtimeResponseCreateParams_tools_inner](./Models/RealtimeResponseCreateParams_tools_inner.md)
 - [RealtimeResponse_status_details](./Models/RealtimeResponse_status_details.md)
 - [RealtimeResponse_status_details_error](./Models/RealtimeResponse_status_details_error.md)
 - [RealtimeResponse_usage](./Models/RealtimeResponse_usage.md)
 - [RealtimeResponse_usage_input_token_details](./Models/RealtimeResponse_usage_input_token_details.md)
 - [RealtimeResponse_usage_output_token_details](./Models/RealtimeResponse_usage_output_token_details.md)
 - [RealtimeServerEventConversationCreated](./Models/RealtimeServerEventConversationCreated.md)
 - [RealtimeServerEventConversationCreated_conversation](./Models/RealtimeServerEventConversationCreated_conversation.md)
 - [RealtimeServerEventConversationItemCreated](./Models/RealtimeServerEventConversationItemCreated.md)
 - [RealtimeServerEventConversationItemDeleted](./Models/RealtimeServerEventConversationItemDeleted.md)
 - [RealtimeServerEventConversationItemInputAudioTranscriptionCompleted](./Models/RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.md)
 - [RealtimeServerEventConversationItemInputAudioTranscriptionFailed](./Models/RealtimeServerEventConversationItemInputAudioTranscriptionFailed.md)
 - [RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error](./Models/RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.md)
 - [RealtimeServerEventConversationItemTruncated](./Models/RealtimeServerEventConversationItemTruncated.md)
 - [RealtimeServerEventError](./Models/RealtimeServerEventError.md)
 - [RealtimeServerEventError_error](./Models/RealtimeServerEventError_error.md)
 - [RealtimeServerEventInputAudioBufferCleared](./Models/RealtimeServerEventInputAudioBufferCleared.md)
 - [RealtimeServerEventInputAudioBufferCommitted](./Models/RealtimeServerEventInputAudioBufferCommitted.md)
 - [RealtimeServerEventInputAudioBufferSpeechStarted](./Models/RealtimeServerEventInputAudioBufferSpeechStarted.md)
 - [RealtimeServerEventInputAudioBufferSpeechStopped](./Models/RealtimeServerEventInputAudioBufferSpeechStopped.md)
 - [RealtimeServerEventRateLimitsUpdated](./Models/RealtimeServerEventRateLimitsUpdated.md)
 - [RealtimeServerEventRateLimitsUpdated_rate_limits_inner](./Models/RealtimeServerEventRateLimitsUpdated_rate_limits_inner.md)
 - [RealtimeServerEventResponseAudioDelta](./Models/RealtimeServerEventResponseAudioDelta.md)
 - [RealtimeServerEventResponseAudioDone](./Models/RealtimeServerEventResponseAudioDone.md)
 - [RealtimeServerEventResponseAudioTranscriptDelta](./Models/RealtimeServerEventResponseAudioTranscriptDelta.md)
 - [RealtimeServerEventResponseAudioTranscriptDone](./Models/RealtimeServerEventResponseAudioTranscriptDone.md)
 - [RealtimeServerEventResponseContentPartAdded](./Models/RealtimeServerEventResponseContentPartAdded.md)
 - [RealtimeServerEventResponseContentPartAdded_part](./Models/RealtimeServerEventResponseContentPartAdded_part.md)
 - [RealtimeServerEventResponseContentPartDone](./Models/RealtimeServerEventResponseContentPartDone.md)
 - [RealtimeServerEventResponseContentPartDone_part](./Models/RealtimeServerEventResponseContentPartDone_part.md)
 - [RealtimeServerEventResponseCreated](./Models/RealtimeServerEventResponseCreated.md)
 - [RealtimeServerEventResponseDone](./Models/RealtimeServerEventResponseDone.md)
 - [RealtimeServerEventResponseFunctionCallArgumentsDelta](./Models/RealtimeServerEventResponseFunctionCallArgumentsDelta.md)
 - [RealtimeServerEventResponseFunctionCallArgumentsDone](./Models/RealtimeServerEventResponseFunctionCallArgumentsDone.md)
 - [RealtimeServerEventResponseOutputItemAdded](./Models/RealtimeServerEventResponseOutputItemAdded.md)
 - [RealtimeServerEventResponseOutputItemDone](./Models/RealtimeServerEventResponseOutputItemDone.md)
 - [RealtimeServerEventResponseTextDelta](./Models/RealtimeServerEventResponseTextDelta.md)
 - [RealtimeServerEventResponseTextDone](./Models/RealtimeServerEventResponseTextDone.md)
 - [RealtimeServerEventSessionCreated](./Models/RealtimeServerEventSessionCreated.md)
 - [RealtimeServerEventSessionUpdated](./Models/RealtimeServerEventSessionUpdated.md)
 - [RealtimeSession](./Models/RealtimeSession.md)
 - [RealtimeSessionCreateRequest](./Models/RealtimeSessionCreateRequest.md)
 - [RealtimeSessionCreateRequest_turn_detection](./Models/RealtimeSessionCreateRequest_turn_detection.md)
 - [RealtimeSessionCreateResponse](./Models/RealtimeSessionCreateResponse.md)
 - [RealtimeSessionCreateResponse_client_secret](./Models/RealtimeSessionCreateResponse_client_secret.md)
 - [RealtimeSessionCreateResponse_turn_detection](./Models/RealtimeSessionCreateResponse_turn_detection.md)
 - [RealtimeSession_input_audio_transcription](./Models/RealtimeSession_input_audio_transcription.md)
 - [RealtimeSession_model](./Models/RealtimeSession_model.md)
 - [RealtimeSession_turn_detection](./Models/RealtimeSession_turn_detection.md)
 - [ResponseFormatJsonObject](./Models/ResponseFormatJsonObject.md)
 - [ResponseFormatJsonSchema](./Models/ResponseFormatJsonSchema.md)
 - [ResponseFormatJsonSchema_json_schema](./Models/ResponseFormatJsonSchema_json_schema.md)
 - [ResponseFormatText](./Models/ResponseFormatText.md)
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
 - [RunStepDeltaStepDetailsToolCallsFileSearchObject](./Models/RunStepDeltaStepDetailsToolCallsFileSearchObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObject](./Models/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObject_function](./Models/RunStepDeltaStepDetailsToolCallsFunctionObject_function.md)
 - [RunStepDeltaStepDetailsToolCallsObject](./Models/RunStepDeltaStepDetailsToolCallsObject.md)
 - [RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner](./Models/RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.md)
 - [RunStepDetailsMessageCreationObject](./Models/RunStepDetailsMessageCreationObject.md)
 - [RunStepDetailsMessageCreationObject_message_creation](./Models/RunStepDetailsMessageCreationObject_message_creation.md)
 - [RunStepDetailsToolCallsCodeObject](./Models/RunStepDetailsToolCallsCodeObject.md)
 - [RunStepDetailsToolCallsCodeObject_code_interpreter](./Models/RunStepDetailsToolCallsCodeObject_code_interpreter.md)
 - [RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner](./Models/RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.md)
 - [RunStepDetailsToolCallsCodeOutputImageObject](./Models/RunStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDetailsToolCallsCodeOutputImageObject_image](./Models/RunStepDetailsToolCallsCodeOutputImageObject_image.md)
 - [RunStepDetailsToolCallsCodeOutputLogsObject](./Models/RunStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDetailsToolCallsFileSearchObject](./Models/RunStepDetailsToolCallsFileSearchObject.md)
 - [RunStepDetailsToolCallsFileSearchObject_file_search](./Models/RunStepDetailsToolCallsFileSearchObject_file_search.md)
 - [RunStepDetailsToolCallsFileSearchRankingOptionsObject](./Models/RunStepDetailsToolCallsFileSearchRankingOptionsObject.md)
 - [RunStepDetailsToolCallsFileSearchResultObject](./Models/RunStepDetailsToolCallsFileSearchResultObject.md)
 - [RunStepDetailsToolCallsFileSearchResultObject_content_inner](./Models/RunStepDetailsToolCallsFileSearchResultObject_content_inner.md)
 - [RunStepDetailsToolCallsFunctionObject](./Models/RunStepDetailsToolCallsFunctionObject.md)
 - [RunStepDetailsToolCallsFunctionObject_function](./Models/RunStepDetailsToolCallsFunctionObject_function.md)
 - [RunStepDetailsToolCallsObject](./Models/RunStepDetailsToolCallsObject.md)
 - [RunStepDetailsToolCallsObject_tool_calls_inner](./Models/RunStepDetailsToolCallsObject_tool_calls_inner.md)
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
 - [RunStreamEvent_oneOf_9](./Models/RunStreamEvent_oneOf_9.md)
 - [RunToolCallObject](./Models/RunToolCallObject.md)
 - [RunToolCallObject_function](./Models/RunToolCallObject_function.md)
 - [StaticChunkingStrategy](./Models/StaticChunkingStrategy.md)
 - [StaticChunkingStrategyRequestParam](./Models/StaticChunkingStrategyRequestParam.md)
 - [StaticChunkingStrategyResponseParam](./Models/StaticChunkingStrategyResponseParam.md)
 - [Static_Chunking_Strategy](./Models/Static_Chunking_Strategy.md)
 - [Static_Chunking_Strategy_static](./Models/Static_Chunking_Strategy_static.md)
 - [SubmitToolOutputsRunRequest](./Models/SubmitToolOutputsRunRequest.md)
 - [SubmitToolOutputsRunRequest_tool_outputs_inner](./Models/SubmitToolOutputsRunRequest_tool_outputs_inner.md)
 - [ThreadObject](./Models/ThreadObject.md)
 - [ThreadStreamEvent](./Models/ThreadStreamEvent.md)
 - [TranscriptionSegment](./Models/TranscriptionSegment.md)
 - [TranscriptionWord](./Models/TranscriptionWord.md)
 - [TruncationObject](./Models/TruncationObject.md)
 - [UpdateVectorStoreRequest](./Models/UpdateVectorStoreRequest.md)
 - [Upload](./Models/Upload.md)
 - [UploadPart](./Models/UploadPart.md)
 - [UsageAudioSpeechesResult](./Models/UsageAudioSpeechesResult.md)
 - [UsageAudioTranscriptionsResult](./Models/UsageAudioTranscriptionsResult.md)
 - [UsageCodeInterpreterSessionsResult](./Models/UsageCodeInterpreterSessionsResult.md)
 - [UsageCompletionsResult](./Models/UsageCompletionsResult.md)
 - [UsageEmbeddingsResult](./Models/UsageEmbeddingsResult.md)
 - [UsageImagesResult](./Models/UsageImagesResult.md)
 - [UsageModerationsResult](./Models/UsageModerationsResult.md)
 - [UsageResponse](./Models/UsageResponse.md)
 - [UsageTimeBucket](./Models/UsageTimeBucket.md)
 - [UsageTimeBucket_result_inner](./Models/UsageTimeBucket_result_inner.md)
 - [UsageVectorStoresResult](./Models/UsageVectorStoresResult.md)
 - [User](./Models/User.md)
 - [UserDeleteResponse](./Models/UserDeleteResponse.md)
 - [UserListResponse](./Models/UserListResponse.md)
 - [UserRoleUpdateRequest](./Models/UserRoleUpdateRequest.md)
 - [VectorStoreExpirationAfter](./Models/VectorStoreExpirationAfter.md)
 - [VectorStoreFileBatchObject](./Models/VectorStoreFileBatchObject.md)
 - [VectorStoreFileBatchObject_file_counts](./Models/VectorStoreFileBatchObject_file_counts.md)
 - [VectorStoreFileObject](./Models/VectorStoreFileObject.md)
 - [VectorStoreFileObject_chunking_strategy](./Models/VectorStoreFileObject_chunking_strategy.md)
 - [VectorStoreFileObject_last_error](./Models/VectorStoreFileObject_last_error.md)
 - [VectorStoreObject](./Models/VectorStoreObject.md)
 - [VectorStoreObject_file_counts](./Models/VectorStoreObject_file_counts.md)
 - [admin_api_keys_create_request](./Models/admin_api_keys_create_request.md)
 - [admin_api_keys_delete_200_response](./Models/admin_api_keys_delete_200_response.md)
 - [createBatch_request](./Models/createBatch_request.md)
 - [createTranscription_200_response](./Models/createTranscription_200_response.md)
 - [createTranslation_200_response](./Models/createTranslation_200_response.md)
 - [list_audit_logs_effective_at_parameter](./Models/list_audit_logs_effective_at_parameter.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: HTTP Bearer Token authentication

