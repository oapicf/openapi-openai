# OpenAI API - Jetbrains API Client

## General API description

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

* API basepath : [https://api.openai.com/v1](https://api.openai.com/v1)
* Version : 2.3.0

## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*, but will link to the `.http` file that contains the endpoint definition.
There may be multiple requests for a single endpoint, one for each example described in the OpenAPI specification.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssistantsApi* | [**cancelRun**](Apis/AssistantsApi.http#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`.
*AssistantsApi* | [**createAssistant**](Apis/AssistantsApi.http#createassistant) | **POST** /assistants | Create an assistant with a model and instructions.
*AssistantsApi* | [**createMessage**](Apis/AssistantsApi.http#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.
*AssistantsApi* | [**createRun**](Apis/AssistantsApi.http#createrun) | **POST** /threads/{thread_id}/runs | Create a run.
*AssistantsApi* | [**createThread**](Apis/AssistantsApi.http#createthread) | **POST** /threads | Create a thread.
*AssistantsApi* | [**createThreadAndRun**](Apis/AssistantsApi.http#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.
*AssistantsApi* | [**deleteAssistant**](Apis/AssistantsApi.http#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AssistantsApi* | [**deleteMessage**](Apis/AssistantsApi.http#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
*AssistantsApi* | [**deleteThread**](Apis/AssistantsApi.http#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.
*AssistantsApi* | [**getAssistant**](Apis/AssistantsApi.http#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AssistantsApi* | [**getMessage**](Apis/AssistantsApi.http#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AssistantsApi* | [**getRun**](Apis/AssistantsApi.http#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AssistantsApi* | [**getRunStep**](Apis/AssistantsApi.http#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AssistantsApi* | [**getThread**](Apis/AssistantsApi.http#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.
*AssistantsApi* | [**listAssistants**](Apis/AssistantsApi.http#listassistants) | **GET** /assistants | Returns a list of assistants.
*AssistantsApi* | [**listMessages**](Apis/AssistantsApi.http#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
*AssistantsApi* | [**listRunSteps**](Apis/AssistantsApi.http#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
*AssistantsApi* | [**listRuns**](Apis/AssistantsApi.http#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
*AssistantsApi* | [**modifyAssistant**](Apis/AssistantsApi.http#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
*AssistantsApi* | [**modifyMessage**](Apis/AssistantsApi.http#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
*AssistantsApi* | [**modifyRun**](Apis/AssistantsApi.http#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
*AssistantsApi* | [**modifyThread**](Apis/AssistantsApi.http#modifythread) | **POST** /threads/{thread_id} | Modifies a thread.
*AssistantsApi* | [**submitToolOuputsToRun**](Apis/AssistantsApi.http#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
*AudioApi* | [**createSpeech**](Apis/AudioApi.http#createspeech) | **POST** /audio/speech | Generates audio from the input text.
*AudioApi* | [**createTranscription**](Apis/AudioApi.http#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AudioApi* | [**createTranslation**](Apis/AudioApi.http#createtranslation) | **POST** /audio/translations | Translates audio into English.
*AuditLogsApi* | [**listAuditLogs**](Apis/AuditLogsApi.http#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.
*BatchApi* | [**cancelBatch**](Apis/BatchApi.http#cancelbatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
*BatchApi* | [**createBatch**](Apis/BatchApi.http#createbatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
*BatchApi* | [**listBatches**](Apis/BatchApi.http#listbatches) | **GET** /batches | List your organization's batches.
*BatchApi* | [**retrieveBatch**](Apis/BatchApi.http#retrievebatch) | **GET** /batches/{batch_id} | Retrieves a batch.
*ChatApi* | [**createChatCompletion**](Apis/ChatApi.http#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
*CompletionsApi* | [**createCompletion**](Apis/CompletionsApi.http#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*DefaultApi* | [**adminApiKeysCreate**](Apis/DefaultApi.http#adminapikeyscreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
*DefaultApi* | [**adminApiKeysDelete**](Apis/DefaultApi.http#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
*DefaultApi* | [**adminApiKeysGet**](Apis/DefaultApi.http#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
*DefaultApi* | [**adminApiKeysList**](Apis/DefaultApi.http#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys
*EmbeddingsApi* | [**createEmbedding**](Apis/EmbeddingsApi.http#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*FilesApi* | [**createFile**](Apis/FilesApi.http#createfile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
*FilesApi* | [**deleteFile**](Apis/FilesApi.http#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*FilesApi* | [**downloadFile**](Apis/FilesApi.http#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*FilesApi* | [**listFiles**](Apis/FilesApi.http#listfiles) | **GET** /files | Returns a list of files.
*FilesApi* | [**retrieveFile**](Apis/FilesApi.http#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*FineTuningApi* | [**cancelFineTuningJob**](Apis/FineTuningApi.http#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
*FineTuningApi* | [**createFineTuningJob**](Apis/FineTuningApi.http#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*FineTuningApi* | [**listFineTuningEvents**](Apis/FineTuningApi.http#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
*FineTuningApi* | [**listFineTuningJobCheckpoints**](Apis/FineTuningApi.http#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
*FineTuningApi* | [**listPaginatedFineTuningJobs**](Apis/FineTuningApi.http#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization's fine-tuning jobs 
*FineTuningApi* | [**retrieveFineTuningJob**](Apis/FineTuningApi.http#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*ImagesApi* | [**createImage**](Apis/ImagesApi.http#createimage) | **POST** /images/generations | Creates an image given a prompt.
*ImagesApi* | [**createImageEdit**](Apis/ImagesApi.http#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*ImagesApi* | [**createImageVariation**](Apis/ImagesApi.http#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*InvitesApi* | [**deleteInvite**](Apis/InvitesApi.http#deleteinvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
*InvitesApi* | [**inviteUser**](Apis/InvitesApi.http#inviteuser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
*InvitesApi* | [**listInvites**](Apis/InvitesApi.http#listinvites) | **GET** /organization/invites | Returns a list of invites in the organization.
*InvitesApi* | [**retrieveInvite**](Apis/InvitesApi.http#retrieveinvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.
*ModelsApi* | [**deleteModel**](Apis/ModelsApi.http#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*ModelsApi* | [**listModels**](Apis/ModelsApi.http#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*ModelsApi* | [**retrieveModel**](Apis/ModelsApi.http#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*ModerationsApi* | [**createModeration**](Apis/ModerationsApi.http#createmoderation) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
*ProjectsApi* | [**archiveProject**](Apis/ProjectsApi.http#archiveproject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
*ProjectsApi* | [**createProject**](Apis/ProjectsApi.http#createproject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
*ProjectsApi* | [**createProjectServiceAccount**](Apis/ProjectsApi.http#createprojectserviceaccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
*ProjectsApi* | [**createProjectUser**](Apis/ProjectsApi.http#createprojectuser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
*ProjectsApi* | [**deleteProjectApiKey**](Apis/ProjectsApi.http#deleteprojectapikey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
*ProjectsApi* | [**deleteProjectServiceAccount**](Apis/ProjectsApi.http#deleteprojectserviceaccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
*ProjectsApi* | [**deleteProjectUser**](Apis/ProjectsApi.http#deleteprojectuser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
*ProjectsApi* | [**listProjectApiKeys**](Apis/ProjectsApi.http#listprojectapikeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
*ProjectsApi* | [**listProjectRateLimits**](Apis/ProjectsApi.http#listprojectratelimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
*ProjectsApi* | [**listProjectServiceAccounts**](Apis/ProjectsApi.http#listprojectserviceaccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
*ProjectsApi* | [**listProjectUsers**](Apis/ProjectsApi.http#listprojectusers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
*ProjectsApi* | [**listProjects**](Apis/ProjectsApi.http#listprojects) | **GET** /organization/projects | Returns a list of projects.
*ProjectsApi* | [**modifyProject**](Apis/ProjectsApi.http#modifyproject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
*ProjectsApi* | [**modifyProjectUser**](Apis/ProjectsApi.http#modifyprojectuser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user's role in the project.
*ProjectsApi* | [**retrieveProject**](Apis/ProjectsApi.http#retrieveproject) | **GET** /organization/projects/{project_id} | Retrieves a project.
*ProjectsApi* | [**retrieveProjectApiKey**](Apis/ProjectsApi.http#retrieveprojectapikey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
*ProjectsApi* | [**retrieveProjectServiceAccount**](Apis/ProjectsApi.http#retrieveprojectserviceaccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
*ProjectsApi* | [**retrieveProjectUser**](Apis/ProjectsApi.http#retrieveprojectuser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
*ProjectsApi* | [**updateProjectRateLimits**](Apis/ProjectsApi.http#updateprojectratelimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.
*RealtimeApi* | [**createRealtimeSession**](Apis/RealtimeApi.http#createrealtimesession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
*UploadsApi* | [**addUploadPart**](Apis/UploadsApi.http#adduploadpart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
*UploadsApi* | [**cancelUpload**](Apis/UploadsApi.http#cancelupload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
*UploadsApi* | [**completeUpload**](Apis/UploadsApi.http#completeupload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
*UploadsApi* | [**createUpload**](Apis/UploadsApi.http#createupload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
*UsageApi* | [**usageAudioSpeeches**](Apis/UsageApi.http#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
*UsageApi* | [**usageAudioTranscriptions**](Apis/UsageApi.http#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
*UsageApi* | [**usageCodeInterpreterSessions**](Apis/UsageApi.http#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
*UsageApi* | [**usageCompletions**](Apis/UsageApi.http#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
*UsageApi* | [**usageCosts**](Apis/UsageApi.http#usagecosts) | **GET** /organization/costs | Get costs details for the organization.
*UsageApi* | [**usageEmbeddings**](Apis/UsageApi.http#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
*UsageApi* | [**usageImages**](Apis/UsageApi.http#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization.
*UsageApi* | [**usageModerations**](Apis/UsageApi.http#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
*UsageApi* | [**usageVectorStores**](Apis/UsageApi.http#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.
*UsersApi* | [**deleteUser**](Apis/UsersApi.http#deleteuser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
*UsersApi* | [**listUsers**](Apis/UsersApi.http#listusers) | **GET** /organization/users | Lists all of the users in the organization.
*UsersApi* | [**modifyUser**](Apis/UsersApi.http#modifyuser) | **POST** /organization/users/{user_id} | Modifies a user's role in the organization.
*UsersApi* | [**retrieveUser**](Apis/UsersApi.http#retrieveuser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.
*VectorStoresApi* | [**cancelVectorStoreFileBatch**](Apis/VectorStoresApi.http#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
*VectorStoresApi* | [**createVectorStore**](Apis/VectorStoresApi.http#createvectorstore) | **POST** /vector_stores | Create a vector store.
*VectorStoresApi* | [**createVectorStoreFile**](Apis/VectorStoresApi.http#createvectorstorefile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
*VectorStoresApi* | [**createVectorStoreFileBatch**](Apis/VectorStoresApi.http#createvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
*VectorStoresApi* | [**deleteVectorStore**](Apis/VectorStoresApi.http#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
*VectorStoresApi* | [**deleteVectorStoreFile**](Apis/VectorStoresApi.http#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
*VectorStoresApi* | [**getVectorStore**](Apis/VectorStoresApi.http#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
*VectorStoresApi* | [**getVectorStoreFile**](Apis/VectorStoresApi.http#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
*VectorStoresApi* | [**getVectorStoreFileBatch**](Apis/VectorStoresApi.http#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
*VectorStoresApi* | [**listFilesInVectorStoreBatch**](Apis/VectorStoresApi.http#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
*VectorStoresApi* | [**listVectorStoreFiles**](Apis/VectorStoresApi.http#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
*VectorStoresApi* | [**listVectorStores**](Apis/VectorStoresApi.http#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores.
*VectorStoresApi* | [**modifyVectorStore**](Apis/VectorStoresApi.http#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


## Usage

### Prerequisites

You need [IntelliJ](https://www.jetbrains.com/idea/) to be able to run those queries. More information can be found [here](https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html).
You may have some luck running queries using the [Code REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) as well, but your mileage may vary.

### Variables and Environment files

* Generally speaking, you want queries to be specific using custom variables. All variables in the `.http` files have the `` format.
* You can create [public or private environment files](https://www.jetbrains.com/help/idea/exploring-http-syntax.html#environment-variables) to dynamically replace the variables at runtime.

_Note: don't commit private environment files! They typically will contain sensitive information like API Keys._

### Customizations

If you have control over the generation of the files here, there are two main things you can do

* Select elements to replace as variables during generation. The process is case-sensitive. For example, API_KEY -> 
    * For this, run the generation with the `bodyVariables` property, followed by a "-" separated list of variables
    * Example: `--additional-properties bodyVariables=YOUR_MERCHANT_ACCOUNT-YOUR_COMPANY_ACCOUNT-YOUR_BALANCE_PLATFORM`
* Add custom headers to _all_ requests. This can be useful for example if your specifications are missing [security schemes](https://github.com/github/rest-api-description/issues/237).
    * For this, run the generation with the `customHeaders` property, followed by a "&" separated list of variables
    * Example : `--additional-properties=customHeaders="Cookie:X-API-KEY="&"Accept-Encoding=gzip"`

_This client was generated by the [jetbrains-http-client](https://openapi-generator.tech/docs/generators/jetbrains-http-client) generator of OpenAPI Generator_