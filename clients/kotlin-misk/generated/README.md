# Documentation for OpenAI API

    <a id="documentation-for-api-endpoints"></a>
    ## Documentation for API Endpoints

    All URIs are relative to *https://api.openai.com/v1*

    Class | Method | HTTP request | Description
    ------------ | ------------- | ------------- | -------------
    *AssistantsApi* | [**cancelRun**](Apis/docs/AssistantsApi.md#cancelrun) | **Post** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`.
    *AssistantsApi* | [**createAssistant**](Apis/docs/AssistantsApi.md#createassistant) | **Post** /assistants | Create an assistant with a model and instructions.
    *AssistantsApi* | [**createMessage**](Apis/docs/AssistantsApi.md#createmessage) | **Post** /threads/{thread_id}/messages | Create a message.
    *AssistantsApi* | [**createRun**](Apis/docs/AssistantsApi.md#createrun) | **Post** /threads/{thread_id}/runs | Create a run.
    *AssistantsApi* | [**createThread**](Apis/docs/AssistantsApi.md#createthread) | **Post** /threads | Create a thread.
    *AssistantsApi* | [**createThreadAndRun**](Apis/docs/AssistantsApi.md#createthreadandrun) | **Post** /threads/runs | Create a thread and run it in one request.
    *AssistantsApi* | [**deleteAssistant**](Apis/docs/AssistantsApi.md#deleteassistant) | **Delete** /assistants/{assistant_id} | Delete an assistant.
    *AssistantsApi* | [**deleteMessage**](Apis/docs/AssistantsApi.md#deletemessage) | **Delete** /threads/{thread_id}/messages/{message_id} | Deletes a message.
    *AssistantsApi* | [**deleteThread**](Apis/docs/AssistantsApi.md#deletethread) | **Delete** /threads/{thread_id} | Delete a thread.
    *AssistantsApi* | [**getAssistant**](Apis/docs/AssistantsApi.md#getassistant) | **Get** /assistants/{assistant_id} | Retrieves an assistant.
    *AssistantsApi* | [**getMessage**](Apis/docs/AssistantsApi.md#getmessage) | **Get** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
    *AssistantsApi* | [**getRun**](Apis/docs/AssistantsApi.md#getrun) | **Get** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
    *AssistantsApi* | [**getRunStep**](Apis/docs/AssistantsApi.md#getrunstep) | **Get** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
    *AssistantsApi* | [**getThread**](Apis/docs/AssistantsApi.md#getthread) | **Get** /threads/{thread_id} | Retrieves a thread.
    *AssistantsApi* | [**listAssistants**](Apis/docs/AssistantsApi.md#listassistants) | **Get** /assistants | Returns a list of assistants.
    *AssistantsApi* | [**listMessages**](Apis/docs/AssistantsApi.md#listmessages) | **Get** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
    *AssistantsApi* | [**listRunSteps**](Apis/docs/AssistantsApi.md#listrunsteps) | **Get** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
    *AssistantsApi* | [**listRuns**](Apis/docs/AssistantsApi.md#listruns) | **Get** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
    *AssistantsApi* | [**modifyAssistant**](Apis/docs/AssistantsApi.md#modifyassistant) | **Post** /assistants/{assistant_id} | Modifies an assistant.
    *AssistantsApi* | [**modifyMessage**](Apis/docs/AssistantsApi.md#modifymessage) | **Post** /threads/{thread_id}/messages/{message_id} | Modifies a message.
    *AssistantsApi* | [**modifyRun**](Apis/docs/AssistantsApi.md#modifyrun) | **Post** /threads/{thread_id}/runs/{run_id} | Modifies a run.
    *AssistantsApi* | [**modifyThread**](Apis/docs/AssistantsApi.md#modifythread) | **Post** /threads/{thread_id} | Modifies a thread.
    *AssistantsApi* | [**submitToolOuputsToRun**](Apis/docs/AssistantsApi.md#submittoolouputstorun) | **Post** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    *AudioApi* | [**createSpeech**](Apis/docs/AudioApi.md#createspeech) | **Post** /audio/speech | Generates audio from the input text.
    *AudioApi* | [**createTranscription**](Apis/docs/AudioApi.md#createtranscription) | **Post** /audio/transcriptions | Transcribes audio into the input language.
    *AudioApi* | [**createTranslation**](Apis/docs/AudioApi.md#createtranslation) | **Post** /audio/translations | Translates audio into English.
    *AuditLogsApi* | [**listAuditLogs**](Apis/docs/AuditLogsApi.md#listauditlogs) | **Get** /organization/audit_logs | List user actions and configuration changes within this organization.
    *BatchApi* | [**cancelBatch**](Apis/docs/BatchApi.md#cancelbatch) | **Post** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    *BatchApi* | [**createBatch**](Apis/docs/BatchApi.md#createbatch) | **Post** /batches | Creates and executes a batch from an uploaded file of requests
    *BatchApi* | [**listBatches**](Apis/docs/BatchApi.md#listbatches) | **Get** /batches | List your organization's batches.
    *BatchApi* | [**retrieveBatch**](Apis/docs/BatchApi.md#retrievebatch) | **Get** /batches/{batch_id} | Retrieves a batch.
    *ChatApi* | [**createChatCompletion**](Apis/docs/ChatApi.md#createchatcompletion) | **Post** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    *CompletionsApi* | [**createCompletion**](Apis/docs/CompletionsApi.md#createcompletion) | **Post** /completions | Creates a completion for the provided prompt and parameters.
    *DefaultApi* | [**adminApiKeysCreate**](Apis/docs/DefaultApi.md#adminapikeyscreate) | **Post** /organization/admin_api_keys | Create an organization admin API key
    *DefaultApi* | [**adminApiKeysDelete**](Apis/docs/DefaultApi.md#adminapikeysdelete) | **Delete** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
    *DefaultApi* | [**adminApiKeysGet**](Apis/docs/DefaultApi.md#adminapikeysget) | **Get** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
    *DefaultApi* | [**adminApiKeysList**](Apis/docs/DefaultApi.md#adminapikeyslist) | **Get** /organization/admin_api_keys | List organization API keys
    *EmbeddingsApi* | [**createEmbedding**](Apis/docs/EmbeddingsApi.md#createembedding) | **Post** /embeddings | Creates an embedding vector representing the input text.
    *FilesApi* | [**createFile**](Apis/docs/FilesApi.md#createfile) | **Post** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    *FilesApi* | [**deleteFile**](Apis/docs/FilesApi.md#deletefile) | **Delete** /files/{file_id} | Delete a file.
    *FilesApi* | [**downloadFile**](Apis/docs/FilesApi.md#downloadfile) | **Get** /files/{file_id}/content | Returns the contents of the specified file.
    *FilesApi* | [**listFiles**](Apis/docs/FilesApi.md#listfiles) | **Get** /files | Returns a list of files.
    *FilesApi* | [**retrieveFile**](Apis/docs/FilesApi.md#retrievefile) | **Get** /files/{file_id} | Returns information about a specific file.
    *FineTuningApi* | [**cancelFineTuningJob**](Apis/docs/FineTuningApi.md#cancelfinetuningjob) | **Post** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
    *FineTuningApi* | [**createFineTuningJob**](Apis/docs/FineTuningApi.md#createfinetuningjob) | **Post** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    *FineTuningApi* | [**listFineTuningEvents**](Apis/docs/FineTuningApi.md#listfinetuningevents) | **Get** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
    *FineTuningApi* | [**listFineTuningJobCheckpoints**](Apis/docs/FineTuningApi.md#listfinetuningjobcheckpoints) | **Get** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
    *FineTuningApi* | [**listPaginatedFineTuningJobs**](Apis/docs/FineTuningApi.md#listpaginatedfinetuningjobs) | **Get** /fine_tuning/jobs | List your organization's fine-tuning jobs 
    *FineTuningApi* | [**retrieveFineTuningJob**](Apis/docs/FineTuningApi.md#retrievefinetuningjob) | **Get** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    *ImagesApi* | [**createImage**](Apis/docs/ImagesApi.md#createimage) | **Post** /images/generations | Creates an image given a prompt.
    *ImagesApi* | [**createImageEdit**](Apis/docs/ImagesApi.md#createimageedit) | **Post** /images/edits | Creates an edited or extended image given an original image and a prompt.
    *ImagesApi* | [**createImageVariation**](Apis/docs/ImagesApi.md#createimagevariation) | **Post** /images/variations | Creates a variation of a given image.
    *InvitesApi* | [**deleteInvite**](Apis/docs/InvitesApi.md#deleteinvite) | **Delete** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
    *InvitesApi* | [**inviteUser**](Apis/docs/InvitesApi.md#inviteuser) | **Post** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    *InvitesApi* | [**listInvites**](Apis/docs/InvitesApi.md#listinvites) | **Get** /organization/invites | Returns a list of invites in the organization.
    *InvitesApi* | [**retrieveInvite**](Apis/docs/InvitesApi.md#retrieveinvite) | **Get** /organization/invites/{invite_id} | Retrieves an invite.
    *ModelsApi* | [**deleteModel**](Apis/docs/ModelsApi.md#deletemodel) | **Delete** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    *ModelsApi* | [**listModels**](Apis/docs/ModelsApi.md#listmodels) | **Get** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
    *ModelsApi* | [**retrieveModel**](Apis/docs/ModelsApi.md#retrievemodel) | **Get** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    *ModerationsApi* | [**createModeration**](Apis/docs/ModerationsApi.md#createmoderation) | **Post** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    *ProjectsApi* | [**archiveProject**](Apis/docs/ProjectsApi.md#archiveproject) | **Post** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
    *ProjectsApi* | [**createProject**](Apis/docs/ProjectsApi.md#createproject) | **Post** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    *ProjectsApi* | [**createProjectServiceAccount**](Apis/docs/ProjectsApi.md#createprojectserviceaccount) | **Post** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
    *ProjectsApi* | [**createProjectUser**](Apis/docs/ProjectsApi.md#createprojectuser) | **Post** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
    *ProjectsApi* | [**deleteProjectApiKey**](Apis/docs/ProjectsApi.md#deleteprojectapikey) | **Delete** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
    *ProjectsApi* | [**deleteProjectServiceAccount**](Apis/docs/ProjectsApi.md#deleteprojectserviceaccount) | **Delete** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
    *ProjectsApi* | [**deleteProjectUser**](Apis/docs/ProjectsApi.md#deleteprojectuser) | **Delete** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
    *ProjectsApi* | [**listProjectApiKeys**](Apis/docs/ProjectsApi.md#listprojectapikeys) | **Get** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
    *ProjectsApi* | [**listProjectRateLimits**](Apis/docs/ProjectsApi.md#listprojectratelimits) | **Get** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
    *ProjectsApi* | [**listProjectServiceAccounts**](Apis/docs/ProjectsApi.md#listprojectserviceaccounts) | **Get** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
    *ProjectsApi* | [**listProjectUsers**](Apis/docs/ProjectsApi.md#listprojectusers) | **Get** /organization/projects/{project_id}/users | Returns a list of users in the project.
    *ProjectsApi* | [**listProjects**](Apis/docs/ProjectsApi.md#listprojects) | **Get** /organization/projects | Returns a list of projects.
    *ProjectsApi* | [**modifyProject**](Apis/docs/ProjectsApi.md#modifyproject) | **Post** /organization/projects/{project_id} | Modifies a project in the organization.
    *ProjectsApi* | [**modifyProjectUser**](Apis/docs/ProjectsApi.md#modifyprojectuser) | **Post** /organization/projects/{project_id}/users/{user_id} | Modifies a user's role in the project.
    *ProjectsApi* | [**retrieveProject**](Apis/docs/ProjectsApi.md#retrieveproject) | **Get** /organization/projects/{project_id} | Retrieves a project.
    *ProjectsApi* | [**retrieveProjectApiKey**](Apis/docs/ProjectsApi.md#retrieveprojectapikey) | **Get** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
    *ProjectsApi* | [**retrieveProjectServiceAccount**](Apis/docs/ProjectsApi.md#retrieveprojectserviceaccount) | **Get** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
    *ProjectsApi* | [**retrieveProjectUser**](Apis/docs/ProjectsApi.md#retrieveprojectuser) | **Get** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
    *ProjectsApi* | [**updateProjectRateLimits**](Apis/docs/ProjectsApi.md#updateprojectratelimits) | **Post** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.
    *RealtimeApi* | [**createRealtimeSession**](Apis/docs/RealtimeApi.md#createrealtimesession) | **Post** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    *UploadsApi* | [**addUploadPart**](Apis/docs/UploadsApi.md#adduploadpart) | **Post** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    *UploadsApi* | [**cancelUpload**](Apis/docs/UploadsApi.md#cancelupload) | **Post** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    *UploadsApi* | [**completeUpload**](Apis/docs/UploadsApi.md#completeupload) | **Post** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    *UploadsApi* | [**createUpload**](Apis/docs/UploadsApi.md#createupload) | **Post** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    *UsageApi* | [**usageAudioSpeeches**](Apis/docs/UsageApi.md#usageaudiospeeches) | **Get** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
    *UsageApi* | [**usageAudioTranscriptions**](Apis/docs/UsageApi.md#usageaudiotranscriptions) | **Get** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
    *UsageApi* | [**usageCodeInterpreterSessions**](Apis/docs/UsageApi.md#usagecodeinterpretersessions) | **Get** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
    *UsageApi* | [**usageCompletions**](Apis/docs/UsageApi.md#usagecompletions) | **Get** /organization/usage/completions | Get completions usage details for the organization.
    *UsageApi* | [**usageCosts**](Apis/docs/UsageApi.md#usagecosts) | **Get** /organization/costs | Get costs details for the organization.
    *UsageApi* | [**usageEmbeddings**](Apis/docs/UsageApi.md#usageembeddings) | **Get** /organization/usage/embeddings | Get embeddings usage details for the organization.
    *UsageApi* | [**usageImages**](Apis/docs/UsageApi.md#usageimages) | **Get** /organization/usage/images | Get images usage details for the organization.
    *UsageApi* | [**usageModerations**](Apis/docs/UsageApi.md#usagemoderations) | **Get** /organization/usage/moderations | Get moderations usage details for the organization.
    *UsageApi* | [**usageVectorStores**](Apis/docs/UsageApi.md#usagevectorstores) | **Get** /organization/usage/vector_stores | Get vector stores usage details for the organization.
    *UsersApi* | [**deleteUser**](Apis/docs/UsersApi.md#deleteuser) | **Delete** /organization/users/{user_id} | Deletes a user from the organization.
    *UsersApi* | [**listUsers**](Apis/docs/UsersApi.md#listusers) | **Get** /organization/users | Lists all of the users in the organization.
    *UsersApi* | [**modifyUser**](Apis/docs/UsersApi.md#modifyuser) | **Post** /organization/users/{user_id} | Modifies a user's role in the organization.
    *UsersApi* | [**retrieveUser**](Apis/docs/UsersApi.md#retrieveuser) | **Get** /organization/users/{user_id} | Retrieves a user by their identifier.
    *VectorStoresApi* | [**cancelVectorStoreFileBatch**](Apis/docs/VectorStoresApi.md#cancelvectorstorefilebatch) | **Post** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    *VectorStoresApi* | [**createVectorStore**](Apis/docs/VectorStoresApi.md#createvectorstore) | **Post** /vector_stores | Create a vector store.
    *VectorStoresApi* | [**createVectorStoreFile**](Apis/docs/VectorStoresApi.md#createvectorstorefile) | **Post** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    *VectorStoresApi* | [**createVectorStoreFileBatch**](Apis/docs/VectorStoresApi.md#createvectorstorefilebatch) | **Post** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
    *VectorStoresApi* | [**deleteVectorStore**](Apis/docs/VectorStoresApi.md#deletevectorstore) | **Delete** /vector_stores/{vector_store_id} | Delete a vector store.
    *VectorStoresApi* | [**deleteVectorStoreFile**](Apis/docs/VectorStoresApi.md#deletevectorstorefile) | **Delete** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    *VectorStoresApi* | [**getVectorStore**](Apis/docs/VectorStoresApi.md#getvectorstore) | **Get** /vector_stores/{vector_store_id} | Retrieves a vector store.
    *VectorStoresApi* | [**getVectorStoreFile**](Apis/docs/VectorStoresApi.md#getvectorstorefile) | **Get** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
    *VectorStoresApi* | [**getVectorStoreFileBatch**](Apis/docs/VectorStoresApi.md#getvectorstorefilebatch) | **Get** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
    *VectorStoresApi* | [**listFilesInVectorStoreBatch**](Apis/docs/VectorStoresApi.md#listfilesinvectorstorebatch) | **Get** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
    *VectorStoresApi* | [**listVectorStoreFiles**](Apis/docs/VectorStoresApi.md#listvectorstorefiles) | **Get** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
    *VectorStoresApi* | [**listVectorStores**](Apis/docs/VectorStoresApi.md#listvectorstores) | **Get** /vector_stores | Returns a list of vector stores.
    *VectorStoresApi* | [**modifyVectorStore**](Apis/docs/VectorStoresApi.md#modifyvectorstore) | **Post** /vector_stores/{vector_store_id} | Modifies a vector store.
    

    <a id="documentation-for-models"></a>
    ## Documentation for Models

         - [org.openapitools.server.api.model.AdminApiKey](Models/docs/AdminApiKey.md)
         - [org.openapitools.server.api.model.AdminApiKeyOwner](Models/docs/AdminApiKeyOwner.md)
         - [org.openapitools.server.api.model.AdminApiKeysCreateRequest](Models/docs/AdminApiKeysCreateRequest.md)
         - [org.openapitools.server.api.model.AdminApiKeysDelete200Response](Models/docs/AdminApiKeysDelete200Response.md)
         - [org.openapitools.server.api.model.ApiKeyList](Models/docs/ApiKeyList.md)
         - [org.openapitools.server.api.model.ArrayOfContentPartsInner](Models/docs/ArrayOfContentPartsInner.md)
         - [org.openapitools.server.api.model.AssistantObject](Models/docs/AssistantObject.md)
         - [org.openapitools.server.api.model.AssistantObjectToolResources](Models/docs/AssistantObjectToolResources.md)
         - [org.openapitools.server.api.model.AssistantObjectToolResourcesCodeInterpreter](Models/docs/AssistantObjectToolResourcesCodeInterpreter.md)
         - [org.openapitools.server.api.model.AssistantObjectToolResourcesFileSearch](Models/docs/AssistantObjectToolResourcesFileSearch.md)
         - [org.openapitools.server.api.model.AssistantObjectToolsInner](Models/docs/AssistantObjectToolsInner.md)
         - [org.openapitools.server.api.model.AssistantStreamEvent](Models/docs/AssistantStreamEvent.md)
         - [org.openapitools.server.api.model.AssistantToolsCode](Models/docs/AssistantToolsCode.md)
         - [org.openapitools.server.api.model.AssistantToolsFileSearch](Models/docs/AssistantToolsFileSearch.md)
         - [org.openapitools.server.api.model.AssistantToolsFileSearchFileSearch](Models/docs/AssistantToolsFileSearchFileSearch.md)
         - [org.openapitools.server.api.model.AssistantToolsFileSearchTypeOnly](Models/docs/AssistantToolsFileSearchTypeOnly.md)
         - [org.openapitools.server.api.model.AssistantToolsFunction](Models/docs/AssistantToolsFunction.md)
         - [org.openapitools.server.api.model.AssistantsApiResponseFormatOption](Models/docs/AssistantsApiResponseFormatOption.md)
         - [org.openapitools.server.api.model.AssistantsApiToolChoiceOption](Models/docs/AssistantsApiToolChoiceOption.md)
         - [org.openapitools.server.api.model.AssistantsNamedToolChoice](Models/docs/AssistantsNamedToolChoice.md)
         - [org.openapitools.server.api.model.AssistantsNamedToolChoiceFunction](Models/docs/AssistantsNamedToolChoiceFunction.md)
         - [org.openapitools.server.api.model.AudioResponseFormat](Models/docs/AudioResponseFormat.md)
         - [org.openapitools.server.api.model.AuditLog](Models/docs/AuditLog.md)
         - [org.openapitools.server.api.model.AuditLogActor](Models/docs/AuditLogActor.md)
         - [org.openapitools.server.api.model.AuditLogActorApiKey](Models/docs/AuditLogActorApiKey.md)
         - [org.openapitools.server.api.model.AuditLogActorServiceAccount](Models/docs/AuditLogActorServiceAccount.md)
         - [org.openapitools.server.api.model.AuditLogActorSession](Models/docs/AuditLogActorSession.md)
         - [org.openapitools.server.api.model.AuditLogActorUser](Models/docs/AuditLogActorUser.md)
         - [org.openapitools.server.api.model.AuditLogApiKeyCreated](Models/docs/AuditLogApiKeyCreated.md)
         - [org.openapitools.server.api.model.AuditLogApiKeyCreatedData](Models/docs/AuditLogApiKeyCreatedData.md)
         - [org.openapitools.server.api.model.AuditLogApiKeyDeleted](Models/docs/AuditLogApiKeyDeleted.md)
         - [org.openapitools.server.api.model.AuditLogApiKeyUpdated](Models/docs/AuditLogApiKeyUpdated.md)
         - [org.openapitools.server.api.model.AuditLogApiKeyUpdatedChangesRequested](Models/docs/AuditLogApiKeyUpdatedChangesRequested.md)
         - [org.openapitools.server.api.model.AuditLogEventType](Models/docs/AuditLogEventType.md)
         - [org.openapitools.server.api.model.AuditLogInviteAccepted](Models/docs/AuditLogInviteAccepted.md)
         - [org.openapitools.server.api.model.AuditLogInviteSent](Models/docs/AuditLogInviteSent.md)
         - [org.openapitools.server.api.model.AuditLogInviteSentData](Models/docs/AuditLogInviteSentData.md)
         - [org.openapitools.server.api.model.AuditLogLoginFailed](Models/docs/AuditLogLoginFailed.md)
         - [org.openapitools.server.api.model.AuditLogOrganizationUpdated](Models/docs/AuditLogOrganizationUpdated.md)
         - [org.openapitools.server.api.model.AuditLogOrganizationUpdatedChangesRequested](Models/docs/AuditLogOrganizationUpdatedChangesRequested.md)
         - [org.openapitools.server.api.model.AuditLogOrganizationUpdatedChangesRequestedSettings](Models/docs/AuditLogOrganizationUpdatedChangesRequestedSettings.md)
         - [org.openapitools.server.api.model.AuditLogProject](Models/docs/AuditLogProject.md)
         - [org.openapitools.server.api.model.AuditLogProjectArchived](Models/docs/AuditLogProjectArchived.md)
         - [org.openapitools.server.api.model.AuditLogProjectCreated](Models/docs/AuditLogProjectCreated.md)
         - [org.openapitools.server.api.model.AuditLogProjectCreatedData](Models/docs/AuditLogProjectCreatedData.md)
         - [org.openapitools.server.api.model.AuditLogProjectUpdated](Models/docs/AuditLogProjectUpdated.md)
         - [org.openapitools.server.api.model.AuditLogProjectUpdatedChangesRequested](Models/docs/AuditLogProjectUpdatedChangesRequested.md)
         - [org.openapitools.server.api.model.AuditLogRateLimitDeleted](Models/docs/AuditLogRateLimitDeleted.md)
         - [org.openapitools.server.api.model.AuditLogRateLimitUpdated](Models/docs/AuditLogRateLimitUpdated.md)
         - [org.openapitools.server.api.model.AuditLogRateLimitUpdatedChangesRequested](Models/docs/AuditLogRateLimitUpdatedChangesRequested.md)
         - [org.openapitools.server.api.model.AuditLogServiceAccountCreated](Models/docs/AuditLogServiceAccountCreated.md)
         - [org.openapitools.server.api.model.AuditLogServiceAccountCreatedData](Models/docs/AuditLogServiceAccountCreatedData.md)
         - [org.openapitools.server.api.model.AuditLogServiceAccountDeleted](Models/docs/AuditLogServiceAccountDeleted.md)
         - [org.openapitools.server.api.model.AuditLogServiceAccountUpdated](Models/docs/AuditLogServiceAccountUpdated.md)
         - [org.openapitools.server.api.model.AuditLogServiceAccountUpdatedChangesRequested](Models/docs/AuditLogServiceAccountUpdatedChangesRequested.md)
         - [org.openapitools.server.api.model.AuditLogUserAdded](Models/docs/AuditLogUserAdded.md)
         - [org.openapitools.server.api.model.AuditLogUserAddedData](Models/docs/AuditLogUserAddedData.md)
         - [org.openapitools.server.api.model.AuditLogUserDeleted](Models/docs/AuditLogUserDeleted.md)
         - [org.openapitools.server.api.model.AuditLogUserUpdated](Models/docs/AuditLogUserUpdated.md)
         - [org.openapitools.server.api.model.AuditLogUserUpdatedChangesRequested](Models/docs/AuditLogUserUpdatedChangesRequested.md)
         - [org.openapitools.server.api.model.AutoChunkingStrategyRequestParam](Models/docs/AutoChunkingStrategyRequestParam.md)
         - [org.openapitools.server.api.model.Batch](Models/docs/Batch.md)
         - [org.openapitools.server.api.model.BatchErrors](Models/docs/BatchErrors.md)
         - [org.openapitools.server.api.model.BatchErrorsDataInner](Models/docs/BatchErrorsDataInner.md)
         - [org.openapitools.server.api.model.BatchRequestCounts](Models/docs/BatchRequestCounts.md)
         - [org.openapitools.server.api.model.BatchRequestInput](Models/docs/BatchRequestInput.md)
         - [org.openapitools.server.api.model.BatchRequestOutput](Models/docs/BatchRequestOutput.md)
         - [org.openapitools.server.api.model.BatchRequestOutputError](Models/docs/BatchRequestOutputError.md)
         - [org.openapitools.server.api.model.BatchRequestOutputResponse](Models/docs/BatchRequestOutputResponse.md)
         - [org.openapitools.server.api.model.ChatCompletionFunctionCallOption](Models/docs/ChatCompletionFunctionCallOption.md)
         - [org.openapitools.server.api.model.ChatCompletionFunctions](Models/docs/ChatCompletionFunctions.md)
         - [org.openapitools.server.api.model.ChatCompletionMessageToolCall](Models/docs/ChatCompletionMessageToolCall.md)
         - [org.openapitools.server.api.model.ChatCompletionMessageToolCallChunk](Models/docs/ChatCompletionMessageToolCallChunk.md)
         - [org.openapitools.server.api.model.ChatCompletionMessageToolCallChunkFunction](Models/docs/ChatCompletionMessageToolCallChunkFunction.md)
         - [org.openapitools.server.api.model.ChatCompletionMessageToolCallFunction](Models/docs/ChatCompletionMessageToolCallFunction.md)
         - [org.openapitools.server.api.model.ChatCompletionNamedToolChoice](Models/docs/ChatCompletionNamedToolChoice.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestAssistantMessage](Models/docs/ChatCompletionRequestAssistantMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestAssistantMessageAudio](Models/docs/ChatCompletionRequestAssistantMessageAudio.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestAssistantMessageContent](Models/docs/ChatCompletionRequestAssistantMessageContent.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestAssistantMessageContentPart](Models/docs/ChatCompletionRequestAssistantMessageContentPart.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestAssistantMessageFunctionCall](Models/docs/ChatCompletionRequestAssistantMessageFunctionCall.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestDeveloperMessage](Models/docs/ChatCompletionRequestDeveloperMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestDeveloperMessageContent](Models/docs/ChatCompletionRequestDeveloperMessageContent.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestFunctionMessage](Models/docs/ChatCompletionRequestFunctionMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestMessage](Models/docs/ChatCompletionRequestMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartAudio](Models/docs/ChatCompletionRequestMessageContentPartAudio.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartAudioInputAudio](Models/docs/ChatCompletionRequestMessageContentPartAudioInputAudio.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImage](Models/docs/ChatCompletionRequestMessageContentPartImage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImageImageUrl](Models/docs/ChatCompletionRequestMessageContentPartImageImageUrl.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartRefusal](Models/docs/ChatCompletionRequestMessageContentPartRefusal.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartText](Models/docs/ChatCompletionRequestMessageContentPartText.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestSystemMessage](Models/docs/ChatCompletionRequestSystemMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestSystemMessageContent](Models/docs/ChatCompletionRequestSystemMessageContent.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestToolMessage](Models/docs/ChatCompletionRequestToolMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestToolMessageContent](Models/docs/ChatCompletionRequestToolMessageContent.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestUserMessage](Models/docs/ChatCompletionRequestUserMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestUserMessageContent](Models/docs/ChatCompletionRequestUserMessageContent.md)
         - [org.openapitools.server.api.model.ChatCompletionRequestUserMessageContentPart](Models/docs/ChatCompletionRequestUserMessageContentPart.md)
         - [org.openapitools.server.api.model.ChatCompletionResponseMessage](Models/docs/ChatCompletionResponseMessage.md)
         - [org.openapitools.server.api.model.ChatCompletionResponseMessageAudio](Models/docs/ChatCompletionResponseMessageAudio.md)
         - [org.openapitools.server.api.model.ChatCompletionResponseMessageFunctionCall](Models/docs/ChatCompletionResponseMessageFunctionCall.md)
         - [org.openapitools.server.api.model.ChatCompletionRole](Models/docs/ChatCompletionRole.md)
         - [org.openapitools.server.api.model.ChatCompletionStreamOptions](Models/docs/ChatCompletionStreamOptions.md)
         - [org.openapitools.server.api.model.ChatCompletionStreamResponseDelta](Models/docs/ChatCompletionStreamResponseDelta.md)
         - [org.openapitools.server.api.model.ChatCompletionStreamResponseDeltaFunctionCall](Models/docs/ChatCompletionStreamResponseDeltaFunctionCall.md)
         - [org.openapitools.server.api.model.ChatCompletionTokenLogprob](Models/docs/ChatCompletionTokenLogprob.md)
         - [org.openapitools.server.api.model.ChatCompletionTokenLogprobTopLogprobsInner](Models/docs/ChatCompletionTokenLogprobTopLogprobsInner.md)
         - [org.openapitools.server.api.model.ChatCompletionTool](Models/docs/ChatCompletionTool.md)
         - [org.openapitools.server.api.model.ChatCompletionToolChoiceOption](Models/docs/ChatCompletionToolChoiceOption.md)
         - [org.openapitools.server.api.model.ChunkingStrategyRequestParam](Models/docs/ChunkingStrategyRequestParam.md)
         - [org.openapitools.server.api.model.CompleteUploadRequest](Models/docs/CompleteUploadRequest.md)
         - [org.openapitools.server.api.model.CompletionUsage](Models/docs/CompletionUsage.md)
         - [org.openapitools.server.api.model.CompletionUsageCompletionTokensDetails](Models/docs/CompletionUsageCompletionTokensDetails.md)
         - [org.openapitools.server.api.model.CompletionUsagePromptTokensDetails](Models/docs/CompletionUsagePromptTokensDetails.md)
         - [org.openapitools.server.api.model.CostsResult](Models/docs/CostsResult.md)
         - [org.openapitools.server.api.model.CostsResultAmount](Models/docs/CostsResultAmount.md)
         - [org.openapitools.server.api.model.CreateAssistantRequest](Models/docs/CreateAssistantRequest.md)
         - [org.openapitools.server.api.model.CreateAssistantRequestModel](Models/docs/CreateAssistantRequestModel.md)
         - [org.openapitools.server.api.model.CreateAssistantRequestToolResources](Models/docs/CreateAssistantRequestToolResources.md)
         - [org.openapitools.server.api.model.CreateAssistantRequestToolResourcesCodeInterpreter](Models/docs/CreateAssistantRequestToolResourcesCodeInterpreter.md)
         - [org.openapitools.server.api.model.CreateAssistantRequestToolResourcesFileSearch](Models/docs/CreateAssistantRequestToolResourcesFileSearch.md)
         - [org.openapitools.server.api.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner](Models/docs/CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md)
         - [org.openapitools.server.api.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy](Models/docs/CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.md)
         - [org.openapitools.server.api.model.CreateBatchRequest](Models/docs/CreateBatchRequest.md)
         - [org.openapitools.server.api.model.CreateChatCompletionFunctionResponse](Models/docs/CreateChatCompletionFunctionResponse.md)
         - [org.openapitools.server.api.model.CreateChatCompletionFunctionResponseChoicesInner](Models/docs/CreateChatCompletionFunctionResponseChoicesInner.md)
         - [org.openapitools.server.api.model.CreateChatCompletionRequest](Models/docs/CreateChatCompletionRequest.md)
         - [org.openapitools.server.api.model.CreateChatCompletionRequestAudio](Models/docs/CreateChatCompletionRequestAudio.md)
         - [org.openapitools.server.api.model.CreateChatCompletionRequestFunctionCall](Models/docs/CreateChatCompletionRequestFunctionCall.md)
         - [org.openapitools.server.api.model.CreateChatCompletionRequestModel](Models/docs/CreateChatCompletionRequestModel.md)
         - [org.openapitools.server.api.model.CreateChatCompletionRequestResponseFormat](Models/docs/CreateChatCompletionRequestResponseFormat.md)
         - [org.openapitools.server.api.model.CreateChatCompletionRequestStop](Models/docs/CreateChatCompletionRequestStop.md)
         - [org.openapitools.server.api.model.CreateChatCompletionResponse](Models/docs/CreateChatCompletionResponse.md)
         - [org.openapitools.server.api.model.CreateChatCompletionResponseChoicesInner](Models/docs/CreateChatCompletionResponseChoicesInner.md)
         - [org.openapitools.server.api.model.CreateChatCompletionResponseChoicesInnerLogprobs](Models/docs/CreateChatCompletionResponseChoicesInnerLogprobs.md)
         - [org.openapitools.server.api.model.CreateChatCompletionStreamResponse](Models/docs/CreateChatCompletionStreamResponse.md)
         - [org.openapitools.server.api.model.CreateChatCompletionStreamResponseChoicesInner](Models/docs/CreateChatCompletionStreamResponseChoicesInner.md)
         - [org.openapitools.server.api.model.CreateChatCompletionStreamResponseUsage](Models/docs/CreateChatCompletionStreamResponseUsage.md)
         - [org.openapitools.server.api.model.CreateCompletionRequest](Models/docs/CreateCompletionRequest.md)
         - [org.openapitools.server.api.model.CreateCompletionRequestModel](Models/docs/CreateCompletionRequestModel.md)
         - [org.openapitools.server.api.model.CreateCompletionRequestPrompt](Models/docs/CreateCompletionRequestPrompt.md)
         - [org.openapitools.server.api.model.CreateCompletionRequestStop](Models/docs/CreateCompletionRequestStop.md)
         - [org.openapitools.server.api.model.CreateCompletionResponse](Models/docs/CreateCompletionResponse.md)
         - [org.openapitools.server.api.model.CreateCompletionResponseChoicesInner](Models/docs/CreateCompletionResponseChoicesInner.md)
         - [org.openapitools.server.api.model.CreateCompletionResponseChoicesInnerLogprobs](Models/docs/CreateCompletionResponseChoicesInnerLogprobs.md)
         - [org.openapitools.server.api.model.CreateEmbeddingRequest](Models/docs/CreateEmbeddingRequest.md)
         - [org.openapitools.server.api.model.CreateEmbeddingRequestInput](Models/docs/CreateEmbeddingRequestInput.md)
         - [org.openapitools.server.api.model.CreateEmbeddingRequestModel](Models/docs/CreateEmbeddingRequestModel.md)
         - [org.openapitools.server.api.model.CreateEmbeddingResponse](Models/docs/CreateEmbeddingResponse.md)
         - [org.openapitools.server.api.model.CreateEmbeddingResponseUsage](Models/docs/CreateEmbeddingResponseUsage.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequest](Models/docs/CreateFineTuningJobRequest.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparameters](Models/docs/CreateFineTuningJobRequestHyperparameters.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersBatchSize](Models/docs/CreateFineTuningJobRequestHyperparametersBatchSize.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier](Models/docs/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersNEpochs](Models/docs/CreateFineTuningJobRequestHyperparametersNEpochs.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInner](Models/docs/CreateFineTuningJobRequestIntegrationsInner.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerWandb](Models/docs/CreateFineTuningJobRequestIntegrationsInnerWandb.md)
         - [org.openapitools.server.api.model.CreateFineTuningJobRequestModel](Models/docs/CreateFineTuningJobRequestModel.md)
         - [org.openapitools.server.api.model.CreateImageEditRequestModel](Models/docs/CreateImageEditRequestModel.md)
         - [org.openapitools.server.api.model.CreateImageRequest](Models/docs/CreateImageRequest.md)
         - [org.openapitools.server.api.model.CreateImageRequestModel](Models/docs/CreateImageRequestModel.md)
         - [org.openapitools.server.api.model.CreateMessageRequest](Models/docs/CreateMessageRequest.md)
         - [org.openapitools.server.api.model.CreateMessageRequestAttachmentsInner](Models/docs/CreateMessageRequestAttachmentsInner.md)
         - [org.openapitools.server.api.model.CreateMessageRequestAttachmentsInnerToolsInner](Models/docs/CreateMessageRequestAttachmentsInnerToolsInner.md)
         - [org.openapitools.server.api.model.CreateMessageRequestContent](Models/docs/CreateMessageRequestContent.md)
         - [org.openapitools.server.api.model.CreateModerationRequest](Models/docs/CreateModerationRequest.md)
         - [org.openapitools.server.api.model.CreateModerationRequestInput](Models/docs/CreateModerationRequestInput.md)
         - [org.openapitools.server.api.model.CreateModerationRequestInputOneOfInner](Models/docs/CreateModerationRequestInputOneOfInner.md)
         - [org.openapitools.server.api.model.CreateModerationRequestInputOneOfInnerOneOf](Models/docs/CreateModerationRequestInputOneOfInnerOneOf.md)
         - [org.openapitools.server.api.model.CreateModerationRequestInputOneOfInnerOneOf1](Models/docs/CreateModerationRequestInputOneOfInnerOneOf1.md)
         - [org.openapitools.server.api.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl](Models/docs/CreateModerationRequestInputOneOfInnerOneOfImageUrl.md)
         - [org.openapitools.server.api.model.CreateModerationRequestModel](Models/docs/CreateModerationRequestModel.md)
         - [org.openapitools.server.api.model.CreateModerationResponse](Models/docs/CreateModerationResponse.md)
         - [org.openapitools.server.api.model.CreateModerationResponseResultsInner](Models/docs/CreateModerationResponseResultsInner.md)
         - [org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategories](Models/docs/CreateModerationResponseResultsInnerCategories.md)
         - [org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes](Models/docs/CreateModerationResponseResultsInnerCategoryAppliedInputTypes.md)
         - [org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategoryScores](Models/docs/CreateModerationResponseResultsInnerCategoryScores.md)
         - [org.openapitools.server.api.model.CreateRunRequest](Models/docs/CreateRunRequest.md)
         - [org.openapitools.server.api.model.CreateRunRequestModel](Models/docs/CreateRunRequestModel.md)
         - [org.openapitools.server.api.model.CreateSpeechRequest](Models/docs/CreateSpeechRequest.md)
         - [org.openapitools.server.api.model.CreateSpeechRequestModel](Models/docs/CreateSpeechRequestModel.md)
         - [org.openapitools.server.api.model.CreateThreadAndRunRequest](Models/docs/CreateThreadAndRunRequest.md)
         - [org.openapitools.server.api.model.CreateThreadAndRunRequestToolResources](Models/docs/CreateThreadAndRunRequestToolResources.md)
         - [org.openapitools.server.api.model.CreateThreadAndRunRequestToolsInner](Models/docs/CreateThreadAndRunRequestToolsInner.md)
         - [org.openapitools.server.api.model.CreateThreadRequest](Models/docs/CreateThreadRequest.md)
         - [org.openapitools.server.api.model.CreateThreadRequestToolResources](Models/docs/CreateThreadRequestToolResources.md)
         - [org.openapitools.server.api.model.CreateThreadRequestToolResourcesFileSearch](Models/docs/CreateThreadRequestToolResourcesFileSearch.md)
         - [org.openapitools.server.api.model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner](Models/docs/CreateThreadRequestToolResourcesFileSearchVectorStoresInner.md)
         - [org.openapitools.server.api.model.CreateTranscription200Response](Models/docs/CreateTranscription200Response.md)
         - [org.openapitools.server.api.model.CreateTranscriptionRequestModel](Models/docs/CreateTranscriptionRequestModel.md)
         - [org.openapitools.server.api.model.CreateTranscriptionResponseJson](Models/docs/CreateTranscriptionResponseJson.md)
         - [org.openapitools.server.api.model.CreateTranscriptionResponseVerboseJson](Models/docs/CreateTranscriptionResponseVerboseJson.md)
         - [org.openapitools.server.api.model.CreateTranslation200Response](Models/docs/CreateTranslation200Response.md)
         - [org.openapitools.server.api.model.CreateTranslationResponseJson](Models/docs/CreateTranslationResponseJson.md)
         - [org.openapitools.server.api.model.CreateTranslationResponseVerboseJson](Models/docs/CreateTranslationResponseVerboseJson.md)
         - [org.openapitools.server.api.model.CreateUploadRequest](Models/docs/CreateUploadRequest.md)
         - [org.openapitools.server.api.model.CreateVectorStoreFileBatchRequest](Models/docs/CreateVectorStoreFileBatchRequest.md)
         - [org.openapitools.server.api.model.CreateVectorStoreFileRequest](Models/docs/CreateVectorStoreFileRequest.md)
         - [org.openapitools.server.api.model.CreateVectorStoreRequest](Models/docs/CreateVectorStoreRequest.md)
         - [org.openapitools.server.api.model.CreateVectorStoreRequestChunkingStrategy](Models/docs/CreateVectorStoreRequestChunkingStrategy.md)
         - [org.openapitools.server.api.model.DefaultProjectErrorResponse](Models/docs/DefaultProjectErrorResponse.md)
         - [org.openapitools.server.api.model.DeleteAssistantResponse](Models/docs/DeleteAssistantResponse.md)
         - [org.openapitools.server.api.model.DeleteFileResponse](Models/docs/DeleteFileResponse.md)
         - [org.openapitools.server.api.model.DeleteMessageResponse](Models/docs/DeleteMessageResponse.md)
         - [org.openapitools.server.api.model.DeleteModelResponse](Models/docs/DeleteModelResponse.md)
         - [org.openapitools.server.api.model.DeleteThreadResponse](Models/docs/DeleteThreadResponse.md)
         - [org.openapitools.server.api.model.DeleteVectorStoreFileResponse](Models/docs/DeleteVectorStoreFileResponse.md)
         - [org.openapitools.server.api.model.DeleteVectorStoreResponse](Models/docs/DeleteVectorStoreResponse.md)
         - [org.openapitools.server.api.model.DoneEvent](Models/docs/DoneEvent.md)
         - [org.openapitools.server.api.model.Embedding](Models/docs/Embedding.md)
         - [org.openapitools.server.api.model.Error](Models/docs/Error.md)
         - [org.openapitools.server.api.model.ErrorEvent](Models/docs/ErrorEvent.md)
         - [org.openapitools.server.api.model.ErrorResponse](Models/docs/ErrorResponse.md)
         - [org.openapitools.server.api.model.FileSearchRankingOptions](Models/docs/FileSearchRankingOptions.md)
         - [org.openapitools.server.api.model.FineTuneChatCompletionRequestAssistantMessage](Models/docs/FineTuneChatCompletionRequestAssistantMessage.md)
         - [org.openapitools.server.api.model.FineTuneChatRequestInput](Models/docs/FineTuneChatRequestInput.md)
         - [org.openapitools.server.api.model.FineTuneChatRequestInputMessagesInner](Models/docs/FineTuneChatRequestInputMessagesInner.md)
         - [org.openapitools.server.api.model.FineTuneCompletionRequestInput](Models/docs/FineTuneCompletionRequestInput.md)
         - [org.openapitools.server.api.model.FineTuneDPOMethod](Models/docs/FineTuneDPOMethod.md)
         - [org.openapitools.server.api.model.FineTuneDPOMethodHyperparameters](Models/docs/FineTuneDPOMethodHyperparameters.md)
         - [org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersBatchSize](Models/docs/FineTuneDPOMethodHyperparametersBatchSize.md)
         - [org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersBeta](Models/docs/FineTuneDPOMethodHyperparametersBeta.md)
         - [org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier](Models/docs/FineTuneDPOMethodHyperparametersLearningRateMultiplier.md)
         - [org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersNEpochs](Models/docs/FineTuneDPOMethodHyperparametersNEpochs.md)
         - [org.openapitools.server.api.model.FineTuneMethod](Models/docs/FineTuneMethod.md)
         - [org.openapitools.server.api.model.FineTunePreferenceRequestInput](Models/docs/FineTunePreferenceRequestInput.md)
         - [org.openapitools.server.api.model.FineTunePreferenceRequestInputInput](Models/docs/FineTunePreferenceRequestInputInput.md)
         - [org.openapitools.server.api.model.FineTunePreferenceRequestInputPreferredCompletionInner](Models/docs/FineTunePreferenceRequestInputPreferredCompletionInner.md)
         - [org.openapitools.server.api.model.FineTuneSupervisedMethod](Models/docs/FineTuneSupervisedMethod.md)
         - [org.openapitools.server.api.model.FineTuneSupervisedMethodHyperparameters](Models/docs/FineTuneSupervisedMethodHyperparameters.md)
         - [org.openapitools.server.api.model.FineTuningIntegration](Models/docs/FineTuningIntegration.md)
         - [org.openapitools.server.api.model.FineTuningJob](Models/docs/FineTuningJob.md)
         - [org.openapitools.server.api.model.FineTuningJobCheckpoint](Models/docs/FineTuningJobCheckpoint.md)
         - [org.openapitools.server.api.model.FineTuningJobCheckpointMetrics](Models/docs/FineTuningJobCheckpointMetrics.md)
         - [org.openapitools.server.api.model.FineTuningJobError](Models/docs/FineTuningJobError.md)
         - [org.openapitools.server.api.model.FineTuningJobEvent](Models/docs/FineTuningJobEvent.md)
         - [org.openapitools.server.api.model.FineTuningJobHyperparameters](Models/docs/FineTuningJobHyperparameters.md)
         - [org.openapitools.server.api.model.FineTuningJobIntegrationsInner](Models/docs/FineTuningJobIntegrationsInner.md)
         - [org.openapitools.server.api.model.FunctionObject](Models/docs/FunctionObject.md)
         - [org.openapitools.server.api.model.Image](Models/docs/Image.md)
         - [org.openapitools.server.api.model.ImagesResponse](Models/docs/ImagesResponse.md)
         - [org.openapitools.server.api.model.Invite](Models/docs/Invite.md)
         - [org.openapitools.server.api.model.InviteDeleteResponse](Models/docs/InviteDeleteResponse.md)
         - [org.openapitools.server.api.model.InviteListResponse](Models/docs/InviteListResponse.md)
         - [org.openapitools.server.api.model.InviteProjectsInner](Models/docs/InviteProjectsInner.md)
         - [org.openapitools.server.api.model.InviteRequest](Models/docs/InviteRequest.md)
         - [org.openapitools.server.api.model.InviteRequestProjectsInner](Models/docs/InviteRequestProjectsInner.md)
         - [org.openapitools.server.api.model.ListAssistantsResponse](Models/docs/ListAssistantsResponse.md)
         - [org.openapitools.server.api.model.ListAuditLogsEffectiveAtParameter](Models/docs/ListAuditLogsEffectiveAtParameter.md)
         - [org.openapitools.server.api.model.ListAuditLogsResponse](Models/docs/ListAuditLogsResponse.md)
         - [org.openapitools.server.api.model.ListBatchesResponse](Models/docs/ListBatchesResponse.md)
         - [org.openapitools.server.api.model.ListFilesResponse](Models/docs/ListFilesResponse.md)
         - [org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse](Models/docs/ListFineTuningJobCheckpointsResponse.md)
         - [org.openapitools.server.api.model.ListFineTuningJobEventsResponse](Models/docs/ListFineTuningJobEventsResponse.md)
         - [org.openapitools.server.api.model.ListMessagesResponse](Models/docs/ListMessagesResponse.md)
         - [org.openapitools.server.api.model.ListModelsResponse](Models/docs/ListModelsResponse.md)
         - [org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse](Models/docs/ListPaginatedFineTuningJobsResponse.md)
         - [org.openapitools.server.api.model.ListRunStepsResponse](Models/docs/ListRunStepsResponse.md)
         - [org.openapitools.server.api.model.ListRunsResponse](Models/docs/ListRunsResponse.md)
         - [org.openapitools.server.api.model.ListThreadsResponse](Models/docs/ListThreadsResponse.md)
         - [org.openapitools.server.api.model.ListVectorStoreFilesResponse](Models/docs/ListVectorStoreFilesResponse.md)
         - [org.openapitools.server.api.model.ListVectorStoresResponse](Models/docs/ListVectorStoresResponse.md)
         - [org.openapitools.server.api.model.MessageContentImageFileObject](Models/docs/MessageContentImageFileObject.md)
         - [org.openapitools.server.api.model.MessageContentImageFileObjectImageFile](Models/docs/MessageContentImageFileObjectImageFile.md)
         - [org.openapitools.server.api.model.MessageContentImageUrlObject](Models/docs/MessageContentImageUrlObject.md)
         - [org.openapitools.server.api.model.MessageContentImageUrlObjectImageUrl](Models/docs/MessageContentImageUrlObjectImageUrl.md)
         - [org.openapitools.server.api.model.MessageContentRefusalObject](Models/docs/MessageContentRefusalObject.md)
         - [org.openapitools.server.api.model.MessageContentTextAnnotationsFileCitationObject](Models/docs/MessageContentTextAnnotationsFileCitationObject.md)
         - [org.openapitools.server.api.model.MessageContentTextAnnotationsFileCitationObjectFileCitation](Models/docs/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
         - [org.openapitools.server.api.model.MessageContentTextAnnotationsFilePathObject](Models/docs/MessageContentTextAnnotationsFilePathObject.md)
         - [org.openapitools.server.api.model.MessageContentTextAnnotationsFilePathObjectFilePath](Models/docs/MessageContentTextAnnotationsFilePathObjectFilePath.md)
         - [org.openapitools.server.api.model.MessageContentTextObject](Models/docs/MessageContentTextObject.md)
         - [org.openapitools.server.api.model.MessageContentTextObjectText](Models/docs/MessageContentTextObjectText.md)
         - [org.openapitools.server.api.model.MessageContentTextObjectTextAnnotationsInner](Models/docs/MessageContentTextObjectTextAnnotationsInner.md)
         - [org.openapitools.server.api.model.MessageDeltaContentImageFileObject](Models/docs/MessageDeltaContentImageFileObject.md)
         - [org.openapitools.server.api.model.MessageDeltaContentImageFileObjectImageFile](Models/docs/MessageDeltaContentImageFileObjectImageFile.md)
         - [org.openapitools.server.api.model.MessageDeltaContentImageUrlObject](Models/docs/MessageDeltaContentImageUrlObject.md)
         - [org.openapitools.server.api.model.MessageDeltaContentImageUrlObjectImageUrl](Models/docs/MessageDeltaContentImageUrlObjectImageUrl.md)
         - [org.openapitools.server.api.model.MessageDeltaContentRefusalObject](Models/docs/MessageDeltaContentRefusalObject.md)
         - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFileCitationObject](Models/docs/MessageDeltaContentTextAnnotationsFileCitationObject.md)
         - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation](Models/docs/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md)
         - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFilePathObject](Models/docs/MessageDeltaContentTextAnnotationsFilePathObject.md)
         - [org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath](Models/docs/MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)
         - [org.openapitools.server.api.model.MessageDeltaContentTextObject](Models/docs/MessageDeltaContentTextObject.md)
         - [org.openapitools.server.api.model.MessageDeltaContentTextObjectText](Models/docs/MessageDeltaContentTextObjectText.md)
         - [org.openapitools.server.api.model.MessageDeltaContentTextObjectTextAnnotationsInner](Models/docs/MessageDeltaContentTextObjectTextAnnotationsInner.md)
         - [org.openapitools.server.api.model.MessageDeltaObject](Models/docs/MessageDeltaObject.md)
         - [org.openapitools.server.api.model.MessageDeltaObjectDelta](Models/docs/MessageDeltaObjectDelta.md)
         - [org.openapitools.server.api.model.MessageDeltaObjectDeltaContentInner](Models/docs/MessageDeltaObjectDeltaContentInner.md)
         - [org.openapitools.server.api.model.MessageObject](Models/docs/MessageObject.md)
         - [org.openapitools.server.api.model.MessageObjectContentInner](Models/docs/MessageObjectContentInner.md)
         - [org.openapitools.server.api.model.MessageObjectIncompleteDetails](Models/docs/MessageObjectIncompleteDetails.md)
         - [org.openapitools.server.api.model.MessageRequestContentTextObject](Models/docs/MessageRequestContentTextObject.md)
         - [org.openapitools.server.api.model.MessageStreamEvent](Models/docs/MessageStreamEvent.md)
         - [org.openapitools.server.api.model.MessageStreamEventOneOf](Models/docs/MessageStreamEventOneOf.md)
         - [org.openapitools.server.api.model.MessageStreamEventOneOf1](Models/docs/MessageStreamEventOneOf1.md)
         - [org.openapitools.server.api.model.MessageStreamEventOneOf2](Models/docs/MessageStreamEventOneOf2.md)
         - [org.openapitools.server.api.model.MessageStreamEventOneOf3](Models/docs/MessageStreamEventOneOf3.md)
         - [org.openapitools.server.api.model.MessageStreamEventOneOf4](Models/docs/MessageStreamEventOneOf4.md)
         - [org.openapitools.server.api.model.Model](Models/docs/Model.md)
         - [org.openapitools.server.api.model.ModifyAssistantRequest](Models/docs/ModifyAssistantRequest.md)
         - [org.openapitools.server.api.model.ModifyAssistantRequestToolResources](Models/docs/ModifyAssistantRequestToolResources.md)
         - [org.openapitools.server.api.model.ModifyAssistantRequestToolResourcesCodeInterpreter](Models/docs/ModifyAssistantRequestToolResourcesCodeInterpreter.md)
         - [org.openapitools.server.api.model.ModifyAssistantRequestToolResourcesFileSearch](Models/docs/ModifyAssistantRequestToolResourcesFileSearch.md)
         - [org.openapitools.server.api.model.ModifyMessageRequest](Models/docs/ModifyMessageRequest.md)
         - [org.openapitools.server.api.model.ModifyRunRequest](Models/docs/ModifyRunRequest.md)
         - [org.openapitools.server.api.model.ModifyThreadRequest](Models/docs/ModifyThreadRequest.md)
         - [org.openapitools.server.api.model.ModifyThreadRequestToolResources](Models/docs/ModifyThreadRequestToolResources.md)
         - [org.openapitools.server.api.model.ModifyThreadRequestToolResourcesFileSearch](Models/docs/ModifyThreadRequestToolResourcesFileSearch.md)
         - [org.openapitools.server.api.model.OpenAIFile](Models/docs/OpenAIFile.md)
         - [org.openapitools.server.api.model.OtherChunkingStrategyResponseParam](Models/docs/OtherChunkingStrategyResponseParam.md)
         - [org.openapitools.server.api.model.PredictionContent](Models/docs/PredictionContent.md)
         - [org.openapitools.server.api.model.PredictionContentContent](Models/docs/PredictionContentContent.md)
         - [org.openapitools.server.api.model.Project](Models/docs/Project.md)
         - [org.openapitools.server.api.model.ProjectApiKey](Models/docs/ProjectApiKey.md)
         - [org.openapitools.server.api.model.ProjectApiKeyDeleteResponse](Models/docs/ProjectApiKeyDeleteResponse.md)
         - [org.openapitools.server.api.model.ProjectApiKeyListResponse](Models/docs/ProjectApiKeyListResponse.md)
         - [org.openapitools.server.api.model.ProjectApiKeyOwner](Models/docs/ProjectApiKeyOwner.md)
         - [org.openapitools.server.api.model.ProjectCreateRequest](Models/docs/ProjectCreateRequest.md)
         - [org.openapitools.server.api.model.ProjectListResponse](Models/docs/ProjectListResponse.md)
         - [org.openapitools.server.api.model.ProjectRateLimit](Models/docs/ProjectRateLimit.md)
         - [org.openapitools.server.api.model.ProjectRateLimitListResponse](Models/docs/ProjectRateLimitListResponse.md)
         - [org.openapitools.server.api.model.ProjectRateLimitUpdateRequest](Models/docs/ProjectRateLimitUpdateRequest.md)
         - [org.openapitools.server.api.model.ProjectServiceAccount](Models/docs/ProjectServiceAccount.md)
         - [org.openapitools.server.api.model.ProjectServiceAccountApiKey](Models/docs/ProjectServiceAccountApiKey.md)
         - [org.openapitools.server.api.model.ProjectServiceAccountCreateRequest](Models/docs/ProjectServiceAccountCreateRequest.md)
         - [org.openapitools.server.api.model.ProjectServiceAccountCreateResponse](Models/docs/ProjectServiceAccountCreateResponse.md)
         - [org.openapitools.server.api.model.ProjectServiceAccountDeleteResponse](Models/docs/ProjectServiceAccountDeleteResponse.md)
         - [org.openapitools.server.api.model.ProjectServiceAccountListResponse](Models/docs/ProjectServiceAccountListResponse.md)
         - [org.openapitools.server.api.model.ProjectUpdateRequest](Models/docs/ProjectUpdateRequest.md)
         - [org.openapitools.server.api.model.ProjectUser](Models/docs/ProjectUser.md)
         - [org.openapitools.server.api.model.ProjectUserCreateRequest](Models/docs/ProjectUserCreateRequest.md)
         - [org.openapitools.server.api.model.ProjectUserDeleteResponse](Models/docs/ProjectUserDeleteResponse.md)
         - [org.openapitools.server.api.model.ProjectUserListResponse](Models/docs/ProjectUserListResponse.md)
         - [org.openapitools.server.api.model.ProjectUserUpdateRequest](Models/docs/ProjectUserUpdateRequest.md)
         - [org.openapitools.server.api.model.RealtimeClientEventConversationItemCreate](Models/docs/RealtimeClientEventConversationItemCreate.md)
         - [org.openapitools.server.api.model.RealtimeClientEventConversationItemDelete](Models/docs/RealtimeClientEventConversationItemDelete.md)
         - [org.openapitools.server.api.model.RealtimeClientEventConversationItemTruncate](Models/docs/RealtimeClientEventConversationItemTruncate.md)
         - [org.openapitools.server.api.model.RealtimeClientEventInputAudioBufferAppend](Models/docs/RealtimeClientEventInputAudioBufferAppend.md)
         - [org.openapitools.server.api.model.RealtimeClientEventInputAudioBufferClear](Models/docs/RealtimeClientEventInputAudioBufferClear.md)
         - [org.openapitools.server.api.model.RealtimeClientEventInputAudioBufferCommit](Models/docs/RealtimeClientEventInputAudioBufferCommit.md)
         - [org.openapitools.server.api.model.RealtimeClientEventResponseCancel](Models/docs/RealtimeClientEventResponseCancel.md)
         - [org.openapitools.server.api.model.RealtimeClientEventResponseCreate](Models/docs/RealtimeClientEventResponseCreate.md)
         - [org.openapitools.server.api.model.RealtimeClientEventSessionUpdate](Models/docs/RealtimeClientEventSessionUpdate.md)
         - [org.openapitools.server.api.model.RealtimeConversationItem](Models/docs/RealtimeConversationItem.md)
         - [org.openapitools.server.api.model.RealtimeConversationItemContentInner](Models/docs/RealtimeConversationItemContentInner.md)
         - [org.openapitools.server.api.model.RealtimeResponse](Models/docs/RealtimeResponse.md)
         - [org.openapitools.server.api.model.RealtimeResponseCreateParams](Models/docs/RealtimeResponseCreateParams.md)
         - [org.openapitools.server.api.model.RealtimeResponseCreateParamsConversation](Models/docs/RealtimeResponseCreateParamsConversation.md)
         - [org.openapitools.server.api.model.RealtimeResponseCreateParamsMaxResponseOutputTokens](Models/docs/RealtimeResponseCreateParamsMaxResponseOutputTokens.md)
         - [org.openapitools.server.api.model.RealtimeResponseCreateParamsToolsInner](Models/docs/RealtimeResponseCreateParamsToolsInner.md)
         - [org.openapitools.server.api.model.RealtimeResponseStatusDetails](Models/docs/RealtimeResponseStatusDetails.md)
         - [org.openapitools.server.api.model.RealtimeResponseStatusDetailsError](Models/docs/RealtimeResponseStatusDetailsError.md)
         - [org.openapitools.server.api.model.RealtimeResponseUsage](Models/docs/RealtimeResponseUsage.md)
         - [org.openapitools.server.api.model.RealtimeResponseUsageInputTokenDetails](Models/docs/RealtimeResponseUsageInputTokenDetails.md)
         - [org.openapitools.server.api.model.RealtimeResponseUsageOutputTokenDetails](Models/docs/RealtimeResponseUsageOutputTokenDetails.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationCreated](Models/docs/RealtimeServerEventConversationCreated.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationCreatedConversation](Models/docs/RealtimeServerEventConversationCreatedConversation.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationItemCreated](Models/docs/RealtimeServerEventConversationItemCreated.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationItemDeleted](Models/docs/RealtimeServerEventConversationItemDeleted.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted](Models/docs/RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailed](Models/docs/RealtimeServerEventConversationItemInputAudioTranscriptionFailed.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError](Models/docs/RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md)
         - [org.openapitools.server.api.model.RealtimeServerEventConversationItemTruncated](Models/docs/RealtimeServerEventConversationItemTruncated.md)
         - [org.openapitools.server.api.model.RealtimeServerEventError](Models/docs/RealtimeServerEventError.md)
         - [org.openapitools.server.api.model.RealtimeServerEventErrorError](Models/docs/RealtimeServerEventErrorError.md)
         - [org.openapitools.server.api.model.RealtimeServerEventInputAudioBufferCleared](Models/docs/RealtimeServerEventInputAudioBufferCleared.md)
         - [org.openapitools.server.api.model.RealtimeServerEventInputAudioBufferCommitted](Models/docs/RealtimeServerEventInputAudioBufferCommitted.md)
         - [org.openapitools.server.api.model.RealtimeServerEventInputAudioBufferSpeechStarted](Models/docs/RealtimeServerEventInputAudioBufferSpeechStarted.md)
         - [org.openapitools.server.api.model.RealtimeServerEventInputAudioBufferSpeechStopped](Models/docs/RealtimeServerEventInputAudioBufferSpeechStopped.md)
         - [org.openapitools.server.api.model.RealtimeServerEventRateLimitsUpdated](Models/docs/RealtimeServerEventRateLimitsUpdated.md)
         - [org.openapitools.server.api.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner](Models/docs/RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseAudioDelta](Models/docs/RealtimeServerEventResponseAudioDelta.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseAudioDone](Models/docs/RealtimeServerEventResponseAudioDone.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseAudioTranscriptDelta](Models/docs/RealtimeServerEventResponseAudioTranscriptDelta.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseAudioTranscriptDone](Models/docs/RealtimeServerEventResponseAudioTranscriptDone.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseContentPartAdded](Models/docs/RealtimeServerEventResponseContentPartAdded.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseContentPartAddedPart](Models/docs/RealtimeServerEventResponseContentPartAddedPart.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseContentPartDone](Models/docs/RealtimeServerEventResponseContentPartDone.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseContentPartDonePart](Models/docs/RealtimeServerEventResponseContentPartDonePart.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseCreated](Models/docs/RealtimeServerEventResponseCreated.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseDone](Models/docs/RealtimeServerEventResponseDone.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseFunctionCallArgumentsDelta](Models/docs/RealtimeServerEventResponseFunctionCallArgumentsDelta.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseFunctionCallArgumentsDone](Models/docs/RealtimeServerEventResponseFunctionCallArgumentsDone.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseOutputItemAdded](Models/docs/RealtimeServerEventResponseOutputItemAdded.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseOutputItemDone](Models/docs/RealtimeServerEventResponseOutputItemDone.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseTextDelta](Models/docs/RealtimeServerEventResponseTextDelta.md)
         - [org.openapitools.server.api.model.RealtimeServerEventResponseTextDone](Models/docs/RealtimeServerEventResponseTextDone.md)
         - [org.openapitools.server.api.model.RealtimeServerEventSessionCreated](Models/docs/RealtimeServerEventSessionCreated.md)
         - [org.openapitools.server.api.model.RealtimeServerEventSessionUpdated](Models/docs/RealtimeServerEventSessionUpdated.md)
         - [org.openapitools.server.api.model.RealtimeSession](Models/docs/RealtimeSession.md)
         - [org.openapitools.server.api.model.RealtimeSessionCreateRequest](Models/docs/RealtimeSessionCreateRequest.md)
         - [org.openapitools.server.api.model.RealtimeSessionCreateRequestTurnDetection](Models/docs/RealtimeSessionCreateRequestTurnDetection.md)
         - [org.openapitools.server.api.model.RealtimeSessionCreateResponse](Models/docs/RealtimeSessionCreateResponse.md)
         - [org.openapitools.server.api.model.RealtimeSessionCreateResponseClientSecret](Models/docs/RealtimeSessionCreateResponseClientSecret.md)
         - [org.openapitools.server.api.model.RealtimeSessionCreateResponseTurnDetection](Models/docs/RealtimeSessionCreateResponseTurnDetection.md)
         - [org.openapitools.server.api.model.RealtimeSessionInputAudioTranscription](Models/docs/RealtimeSessionInputAudioTranscription.md)
         - [org.openapitools.server.api.model.RealtimeSessionModel](Models/docs/RealtimeSessionModel.md)
         - [org.openapitools.server.api.model.RealtimeSessionTurnDetection](Models/docs/RealtimeSessionTurnDetection.md)
         - [org.openapitools.server.api.model.ResponseFormatJsonObject](Models/docs/ResponseFormatJsonObject.md)
         - [org.openapitools.server.api.model.ResponseFormatJsonSchema](Models/docs/ResponseFormatJsonSchema.md)
         - [org.openapitools.server.api.model.ResponseFormatJsonSchemaJsonSchema](Models/docs/ResponseFormatJsonSchemaJsonSchema.md)
         - [org.openapitools.server.api.model.ResponseFormatText](Models/docs/ResponseFormatText.md)
         - [org.openapitools.server.api.model.RunCompletionUsage](Models/docs/RunCompletionUsage.md)
         - [org.openapitools.server.api.model.RunObject](Models/docs/RunObject.md)
         - [org.openapitools.server.api.model.RunObjectIncompleteDetails](Models/docs/RunObjectIncompleteDetails.md)
         - [org.openapitools.server.api.model.RunObjectLastError](Models/docs/RunObjectLastError.md)
         - [org.openapitools.server.api.model.RunObjectRequiredAction](Models/docs/RunObjectRequiredAction.md)
         - [org.openapitools.server.api.model.RunObjectRequiredActionSubmitToolOutputs](Models/docs/RunObjectRequiredActionSubmitToolOutputs.md)
         - [org.openapitools.server.api.model.RunStepCompletionUsage](Models/docs/RunStepCompletionUsage.md)
         - [org.openapitools.server.api.model.RunStepDeltaObject](Models/docs/RunStepDeltaObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaObjectDelta](Models/docs/RunStepDeltaObjectDelta.md)
         - [org.openapitools.server.api.model.RunStepDeltaObjectDeltaStepDetails](Models/docs/RunStepDeltaObjectDeltaStepDetails.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsMessageCreationObject](Models/docs/RunStepDeltaStepDetailsMessageCreationObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation](Models/docs/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObject](Models/docs/RunStepDeltaStepDetailsToolCallsCodeObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter](Models/docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](Models/docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject](Models/docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage](Models/docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject](Models/docs/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFileSearchObject](Models/docs/RunStepDeltaStepDetailsToolCallsFileSearchObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFunctionObject](Models/docs/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction](Models/docs/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsObject](Models/docs/RunStepDeltaStepDetailsToolCallsObject.md)
         - [org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner](Models/docs/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)
         - [org.openapitools.server.api.model.RunStepDetailsMessageCreationObject](Models/docs/RunStepDetailsMessageCreationObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsMessageCreationObjectMessageCreation](Models/docs/RunStepDetailsMessageCreationObjectMessageCreation.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObject](Models/docs/RunStepDetailsToolCallsCodeObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter](Models/docs/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](Models/docs/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputImageObject](Models/docs/RunStepDetailsToolCallsCodeOutputImageObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputImageObjectImage](Models/docs/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputLogsObject](Models/docs/RunStepDetailsToolCallsCodeOutputLogsObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchObject](Models/docs/RunStepDetailsToolCallsFileSearchObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchObjectFileSearch](Models/docs/RunStepDetailsToolCallsFileSearchObjectFileSearch.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject](Models/docs/RunStepDetailsToolCallsFileSearchRankingOptionsObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchResultObject](Models/docs/RunStepDetailsToolCallsFileSearchResultObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner](Models/docs/RunStepDetailsToolCallsFileSearchResultObjectContentInner.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsFunctionObject](Models/docs/RunStepDetailsToolCallsFunctionObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsFunctionObjectFunction](Models/docs/RunStepDetailsToolCallsFunctionObjectFunction.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsObject](Models/docs/RunStepDetailsToolCallsObject.md)
         - [org.openapitools.server.api.model.RunStepDetailsToolCallsObjectToolCallsInner](Models/docs/RunStepDetailsToolCallsObjectToolCallsInner.md)
         - [org.openapitools.server.api.model.RunStepObject](Models/docs/RunStepObject.md)
         - [org.openapitools.server.api.model.RunStepObjectLastError](Models/docs/RunStepObjectLastError.md)
         - [org.openapitools.server.api.model.RunStepObjectStepDetails](Models/docs/RunStepObjectStepDetails.md)
         - [org.openapitools.server.api.model.RunStepStreamEvent](Models/docs/RunStepStreamEvent.md)
         - [org.openapitools.server.api.model.RunStepStreamEventOneOf](Models/docs/RunStepStreamEventOneOf.md)
         - [org.openapitools.server.api.model.RunStepStreamEventOneOf1](Models/docs/RunStepStreamEventOneOf1.md)
         - [org.openapitools.server.api.model.RunStepStreamEventOneOf2](Models/docs/RunStepStreamEventOneOf2.md)
         - [org.openapitools.server.api.model.RunStepStreamEventOneOf3](Models/docs/RunStepStreamEventOneOf3.md)
         - [org.openapitools.server.api.model.RunStepStreamEventOneOf4](Models/docs/RunStepStreamEventOneOf4.md)
         - [org.openapitools.server.api.model.RunStepStreamEventOneOf5](Models/docs/RunStepStreamEventOneOf5.md)
         - [org.openapitools.server.api.model.RunStepStreamEventOneOf6](Models/docs/RunStepStreamEventOneOf6.md)
         - [org.openapitools.server.api.model.RunStreamEvent](Models/docs/RunStreamEvent.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf](Models/docs/RunStreamEventOneOf.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf1](Models/docs/RunStreamEventOneOf1.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf2](Models/docs/RunStreamEventOneOf2.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf3](Models/docs/RunStreamEventOneOf3.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf4](Models/docs/RunStreamEventOneOf4.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf5](Models/docs/RunStreamEventOneOf5.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf6](Models/docs/RunStreamEventOneOf6.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf7](Models/docs/RunStreamEventOneOf7.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf8](Models/docs/RunStreamEventOneOf8.md)
         - [org.openapitools.server.api.model.RunStreamEventOneOf9](Models/docs/RunStreamEventOneOf9.md)
         - [org.openapitools.server.api.model.RunToolCallObject](Models/docs/RunToolCallObject.md)
         - [org.openapitools.server.api.model.RunToolCallObjectFunction](Models/docs/RunToolCallObjectFunction.md)
         - [org.openapitools.server.api.model.StaticChunkingStrategy](Models/docs/StaticChunkingStrategy.md)
         - [org.openapitools.server.api.model.StaticChunkingStrategyRequestParam](Models/docs/StaticChunkingStrategyRequestParam.md)
         - [org.openapitools.server.api.model.StaticChunkingStrategyStatic](Models/docs/StaticChunkingStrategyStatic.md)
         - [org.openapitools.server.api.model.SubmitToolOutputsRunRequest](Models/docs/SubmitToolOutputsRunRequest.md)
         - [org.openapitools.server.api.model.SubmitToolOutputsRunRequestToolOutputsInner](Models/docs/SubmitToolOutputsRunRequestToolOutputsInner.md)
         - [org.openapitools.server.api.model.ThreadObject](Models/docs/ThreadObject.md)
         - [org.openapitools.server.api.model.ThreadStreamEvent](Models/docs/ThreadStreamEvent.md)
         - [org.openapitools.server.api.model.TranscriptionSegment](Models/docs/TranscriptionSegment.md)
         - [org.openapitools.server.api.model.TranscriptionWord](Models/docs/TranscriptionWord.md)
         - [org.openapitools.server.api.model.TruncationObject](Models/docs/TruncationObject.md)
         - [org.openapitools.server.api.model.UpdateVectorStoreRequest](Models/docs/UpdateVectorStoreRequest.md)
         - [org.openapitools.server.api.model.Upload](Models/docs/Upload.md)
         - [org.openapitools.server.api.model.UploadPart](Models/docs/UploadPart.md)
         - [org.openapitools.server.api.model.UsageAudioSpeechesResult](Models/docs/UsageAudioSpeechesResult.md)
         - [org.openapitools.server.api.model.UsageAudioTranscriptionsResult](Models/docs/UsageAudioTranscriptionsResult.md)
         - [org.openapitools.server.api.model.UsageCodeInterpreterSessionsResult](Models/docs/UsageCodeInterpreterSessionsResult.md)
         - [org.openapitools.server.api.model.UsageCompletionsResult](Models/docs/UsageCompletionsResult.md)
         - [org.openapitools.server.api.model.UsageEmbeddingsResult](Models/docs/UsageEmbeddingsResult.md)
         - [org.openapitools.server.api.model.UsageImagesResult](Models/docs/UsageImagesResult.md)
         - [org.openapitools.server.api.model.UsageModerationsResult](Models/docs/UsageModerationsResult.md)
         - [org.openapitools.server.api.model.UsageResponse](Models/docs/UsageResponse.md)
         - [org.openapitools.server.api.model.UsageTimeBucket](Models/docs/UsageTimeBucket.md)
         - [org.openapitools.server.api.model.UsageTimeBucketResultInner](Models/docs/UsageTimeBucketResultInner.md)
         - [org.openapitools.server.api.model.UsageVectorStoresResult](Models/docs/UsageVectorStoresResult.md)
         - [org.openapitools.server.api.model.User](Models/docs/User.md)
         - [org.openapitools.server.api.model.UserDeleteResponse](Models/docs/UserDeleteResponse.md)
         - [org.openapitools.server.api.model.UserListResponse](Models/docs/UserListResponse.md)
         - [org.openapitools.server.api.model.UserRoleUpdateRequest](Models/docs/UserRoleUpdateRequest.md)
         - [org.openapitools.server.api.model.VectorStoreExpirationAfter](Models/docs/VectorStoreExpirationAfter.md)
         - [org.openapitools.server.api.model.VectorStoreFileBatchObject](Models/docs/VectorStoreFileBatchObject.md)
         - [org.openapitools.server.api.model.VectorStoreFileBatchObjectFileCounts](Models/docs/VectorStoreFileBatchObjectFileCounts.md)
         - [org.openapitools.server.api.model.VectorStoreFileObject](Models/docs/VectorStoreFileObject.md)
         - [org.openapitools.server.api.model.VectorStoreFileObjectChunkingStrategy](Models/docs/VectorStoreFileObjectChunkingStrategy.md)
         - [org.openapitools.server.api.model.VectorStoreFileObjectLastError](Models/docs/VectorStoreFileObjectLastError.md)
         - [org.openapitools.server.api.model.VectorStoreObject](Models/docs/VectorStoreObject.md)
         - [org.openapitools.server.api.model.VectorStoreObjectFileCounts](Models/docs/VectorStoreObjectFileCounts.md)
        

<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
    <a id="ApiKeyAuth"></a>
    ### ApiKeyAuth

            - **Type**: HTTP Bearer Token authentication
            
