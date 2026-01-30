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
*OASAssistantsApi* | [**createMessage**](OASAssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
*OASAssistantsApi* | [**createRun**](OASAssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
*OASAssistantsApi* | [**createThread**](OASAssistantsApi.md#createThread) | **POST** /threads | Create a thread.
*OASAssistantsApi* | [**createThreadAndRun**](OASAssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
*OASAssistantsApi* | [**deleteAssistant**](OASAssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*OASAssistantsApi* | [**deleteMessage**](OASAssistantsApi.md#deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
*OASAssistantsApi* | [**deleteThread**](OASAssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
*OASAssistantsApi* | [**getAssistant**](OASAssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*OASAssistantsApi* | [**getMessage**](OASAssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*OASAssistantsApi* | [**getRun**](OASAssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*OASAssistantsApi* | [**getRunStep**](OASAssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*OASAssistantsApi* | [**getThread**](OASAssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
*OASAssistantsApi* | [**listAssistants**](OASAssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants.
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
*OASAuditLogsApi* | [**listAuditLogs**](OASAuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.
*OASBatchApi* | [**cancelBatch**](OASBatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
*OASBatchApi* | [**createBatch**](OASBatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
*OASBatchApi* | [**listBatches**](OASBatchApi.md#listBatches) | **GET** /batches | List your organization\&#39;s batches.
*OASBatchApi* | [**retrieveBatch**](OASBatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.
*OASChatApi* | [**createChatCompletion**](OASChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the\n[text generation](/docs/guides/text-generation), [vision](/docs/guides/vision),\nand [audio](/docs/guides/audio) guides.\n\nParameter support can differ depending on the model used to generate the\nresponse, particularly for newer reasoning models. Parameters that are only\nsupported for reasoning models are noted below. For the current state of \nunsupported parameters in reasoning models, \n[refer to the reasoning guide](/docs/guides/reasoning).\n
*OASCompletionsApi* | [**createCompletion**](OASCompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OASDefaultApi* | [**adminApiKeysCreate**](OASDefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
*OASDefaultApi* | [**adminApiKeysDelete**](OASDefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
*OASDefaultApi* | [**adminApiKeysGet**](OASDefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
*OASDefaultApi* | [**adminApiKeysList**](OASDefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys
*OASEmbeddingsApi* | [**createEmbedding**](OASEmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OASFilesApi* | [**createFile**](OASFilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.\n\nThe Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.\n\nThe Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.\n\nThe Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).\n\nPlease [contact us](https://help.openai.com/) if you need to increase these storage limits.\n
*OASFilesApi* | [**deleteFile**](OASFilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
*OASFilesApi* | [**downloadFile**](OASFilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*OASFilesApi* | [**listFiles**](OASFilesApi.md#listFiles) | **GET** /files | Returns a list of files.
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
*OASInvitesApi* | [**deleteInvite**](OASInvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
*OASInvitesApi* | [**inviteUser**](OASInvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
*OASInvitesApi* | [**listInvites**](OASInvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
*OASInvitesApi* | [**retrieveInvite**](OASInvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.
*OASModelsApi* | [**deleteModel**](OASModelsApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*OASModelsApi* | [**listModels**](OASModelsApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OASModelsApi* | [**retrieveModel**](OASModelsApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*OASModerationsApi* | [**createModeration**](OASModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn\nmore in the [moderation guide](/docs/guides/moderation).\n
*OASProjectsApi* | [**archiveProject**](OASProjectsApi.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
*OASProjectsApi* | [**createProject**](OASProjectsApi.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
*OASProjectsApi* | [**createProjectServiceAccount**](OASProjectsApi.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
*OASProjectsApi* | [**createProjectUser**](OASProjectsApi.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
*OASProjectsApi* | [**deleteProjectApiKey**](OASProjectsApi.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
*OASProjectsApi* | [**deleteProjectServiceAccount**](OASProjectsApi.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
*OASProjectsApi* | [**deleteProjectUser**](OASProjectsApi.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
*OASProjectsApi* | [**listProjectApiKeys**](OASProjectsApi.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
*OASProjectsApi* | [**listProjectRateLimits**](OASProjectsApi.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
*OASProjectsApi* | [**listProjectServiceAccounts**](OASProjectsApi.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
*OASProjectsApi* | [**listProjectUsers**](OASProjectsApi.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
*OASProjectsApi* | [**listProjects**](OASProjectsApi.md#listProjects) | **GET** /organization/projects | Returns a list of projects.
*OASProjectsApi* | [**modifyProject**](OASProjectsApi.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
*OASProjectsApi* | [**modifyProjectUser**](OASProjectsApi.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user\&#39;s role in the project.
*OASProjectsApi* | [**retrieveProject**](OASProjectsApi.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
*OASProjectsApi* | [**retrieveProjectApiKey**](OASProjectsApi.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
*OASProjectsApi* | [**retrieveProjectServiceAccount**](OASProjectsApi.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
*OASProjectsApi* | [**retrieveProjectUser**](OASProjectsApi.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
*OASProjectsApi* | [**updateProjectRateLimits**](OASProjectsApi.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.
*OASRealtimeApi* | [**createRealtimeSession**](OASRealtimeApi.md#createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the\nRealtime API. Can be configured with the same session parameters as the\n&#x60;session.update&#x60; client event.\n\nIt responds with a session object, plus a &#x60;client_secret&#x60; key which contains\na usable ephemeral API token that can be used to authenticate browser clients\nfor the Realtime API.\n
*OASUploadsApi* | [**addUploadPart**](OASUploadsApi.md#addUploadPart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload. \n\nEach Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.\n\nIt is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).\n
*OASUploadsApi* | [**cancelUpload**](OASUploadsApi.md#cancelUpload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.\n
*OASUploadsApi* | [**completeUpload**](OASUploadsApi.md#completeUpload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object). \n\nWithin the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.\n\nYou can specify the order of the Parts by passing in an ordered list of the Part IDs.\n\nThe number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.\n
*OASUploadsApi* | [**createUpload**](OASUploadsApi.md#createUpload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.\n\nOnce you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.\n\nFor certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case:\n- [Assistants](/docs/assistants/tools/file-search#supported-files)\n\nFor guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).\n
*OASUsageApi* | [**usageAudioSpeeches**](OASUsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
*OASUsageApi* | [**usageAudioTranscriptions**](OASUsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
*OASUsageApi* | [**usageCodeInterpreterSessions**](OASUsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
*OASUsageApi* | [**usageCompletions**](OASUsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
*OASUsageApi* | [**usageCosts**](OASUsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization.
*OASUsageApi* | [**usageEmbeddings**](OASUsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
*OASUsageApi* | [**usageImages**](OASUsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
*OASUsageApi* | [**usageModerations**](OASUsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
*OASUsageApi* | [**usageVectorStores**](OASUsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.
*OASUsersApi* | [**deleteUser**](OASUsersApi.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
*OASUsersApi* | [**listUsers**](OASUsersApi.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization.
*OASUsersApi* | [**modifyUser**](OASUsersApi.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user\&#39;s role in the organization.
*OASUsersApi* | [**retrieveUser**](OASUsersApi.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.
*OASVectorStoresApi* | [**cancelVectorStoreFileBatch**](OASVectorStoresApi.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
*OASVectorStoresApi* | [**createVectorStore**](OASVectorStoresApi.md#createVectorStore) | **POST** /vector_stores | Create a vector store.
*OASVectorStoresApi* | [**createVectorStoreFile**](OASVectorStoresApi.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
*OASVectorStoresApi* | [**createVectorStoreFileBatch**](OASVectorStoresApi.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
*OASVectorStoresApi* | [**deleteVectorStore**](OASVectorStoresApi.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
*OASVectorStoresApi* | [**deleteVectorStoreFile**](OASVectorStoresApi.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
*OASVectorStoresApi* | [**getVectorStore**](OASVectorStoresApi.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
*OASVectorStoresApi* | [**getVectorStoreFile**](OASVectorStoresApi.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
*OASVectorStoresApi* | [**getVectorStoreFileBatch**](OASVectorStoresApi.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
*OASVectorStoresApi* | [**listFilesInVectorStoreBatch**](OASVectorStoresApi.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
*OASVectorStoresApi* | [**listVectorStoreFiles**](OASVectorStoresApi.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
*OASVectorStoresApi* | [**listVectorStores**](OASVectorStoresApi.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
*OASVectorStoresApi* | [**modifyVectorStore**](OASVectorStoresApi.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


## Documentation for Models

 - [OASAdminApiKey](OASAdminApiKey.md)
 - [OASAdminApiKeyOwner](OASAdminApiKeyOwner.md)
 - [OASAdminApiKeysCreateRequest](OASAdminApiKeysCreateRequest.md)
 - [OASAdminApiKeysDelete200Response](OASAdminApiKeysDelete200Response.md)
 - [OASApiKeyList](OASApiKeyList.md)
 - [OASArrayOfContentPartsInner](OASArrayOfContentPartsInner.md)
 - [OASAssistantObject](OASAssistantObject.md)
 - [OASAssistantObjectToolResources](OASAssistantObjectToolResources.md)
 - [OASAssistantObjectToolResourcesCodeI](OASAssistantObjectToolResourcesCodeI.md)
 - [OASAssistantObjectToolResourcesFileS](OASAssistantObjectToolResourcesFileS.md)
 - [OASAssistantObjectToolsInner](OASAssistantObjectToolsInner.md)
 - [OASAssistantStreamEvent](OASAssistantStreamEvent.md)
 - [OASAssistantToolsCode](OASAssistantToolsCode.md)
 - [OASAssistantToolsFileSearch](OASAssistantToolsFileSearch.md)
 - [OASAssistantToolsFileSearchFileSearc](OASAssistantToolsFileSearchFileSearc.md)
 - [OASAssistantToolsFileSearchTypeOnly](OASAssistantToolsFileSearchTypeOnly.md)
 - [OASAssistantToolsFunction](OASAssistantToolsFunction.md)
 - [OASAssistantsApiResponseFormatOption](OASAssistantsApiResponseFormatOption.md)
 - [OASAssistantsApiToolChoiceOption](OASAssistantsApiToolChoiceOption.md)
 - [OASAssistantsNamedToolChoice](OASAssistantsNamedToolChoice.md)
 - [OASAssistantsNamedToolChoiceFunction](OASAssistantsNamedToolChoiceFunction.md)
 - [OASAudioResponseFormat](OASAudioResponseFormat.md)
 - [OASAuditLog](OASAuditLog.md)
 - [OASAuditLogActor](OASAuditLogActor.md)
 - [OASAuditLogActorApiKey](OASAuditLogActorApiKey.md)
 - [OASAuditLogActorServiceAccount](OASAuditLogActorServiceAccount.md)
 - [OASAuditLogActorSession](OASAuditLogActorSession.md)
 - [OASAuditLogActorUser](OASAuditLogActorUser.md)
 - [OASAuditLogApiKeyCreated](OASAuditLogApiKeyCreated.md)
 - [OASAuditLogApiKeyCreatedData](OASAuditLogApiKeyCreatedData.md)
 - [OASAuditLogApiKeyDeleted](OASAuditLogApiKeyDeleted.md)
 - [OASAuditLogApiKeyUpdated](OASAuditLogApiKeyUpdated.md)
 - [OASAuditLogApiKeyUpdatedChangesReque](OASAuditLogApiKeyUpdatedChangesReque.md)
 - [OASAuditLogEventType](OASAuditLogEventType.md)
 - [OASAuditLogInviteAccepted](OASAuditLogInviteAccepted.md)
 - [OASAuditLogInviteSent](OASAuditLogInviteSent.md)
 - [OASAuditLogInviteSentData](OASAuditLogInviteSentData.md)
 - [OASAuditLogLoginFailed](OASAuditLogLoginFailed.md)
 - [OASAuditLogOrganizationUpdated](OASAuditLogOrganizationUpdated.md)
 - [OASAuditLogOrganizationUpdatedChange](OASAuditLogOrganizationUpdatedChange.md)
 - [OASAuditLogProject](OASAuditLogProject.md)
 - [OASAuditLogProjectArchived](OASAuditLogProjectArchived.md)
 - [OASAuditLogProjectCreated](OASAuditLogProjectCreated.md)
 - [OASAuditLogProjectCreatedData](OASAuditLogProjectCreatedData.md)
 - [OASAuditLogProjectUpdated](OASAuditLogProjectUpdated.md)
 - [OASAuditLogProjectUpdatedChangesRequ](OASAuditLogProjectUpdatedChangesRequ.md)
 - [OASAuditLogRateLimitDeleted](OASAuditLogRateLimitDeleted.md)
 - [OASAuditLogRateLimitUpdated](OASAuditLogRateLimitUpdated.md)
 - [OASAuditLogRateLimitUpdatedChangesRe](OASAuditLogRateLimitUpdatedChangesRe.md)
 - [OASAuditLogServiceAccountCreated](OASAuditLogServiceAccountCreated.md)
 - [OASAuditLogServiceAccountCreatedData](OASAuditLogServiceAccountCreatedData.md)
 - [OASAuditLogServiceAccountDeleted](OASAuditLogServiceAccountDeleted.md)
 - [OASAuditLogServiceAccountUpdated](OASAuditLogServiceAccountUpdated.md)
 - [OASAuditLogServiceAccountUpdatedChan](OASAuditLogServiceAccountUpdatedChan.md)
 - [OASAuditLogUserAdded](OASAuditLogUserAdded.md)
 - [OASAuditLogUserAddedData](OASAuditLogUserAddedData.md)
 - [OASAuditLogUserDeleted](OASAuditLogUserDeleted.md)
 - [OASAuditLogUserUpdated](OASAuditLogUserUpdated.md)
 - [OASAuditLogUserUpdatedChangesRequest](OASAuditLogUserUpdatedChangesRequest.md)
 - [OASAutoChunkingStrategy](OASAutoChunkingStrategy.md)
 - [OASAutoChunkingStrategyRequestParam](OASAutoChunkingStrategyRequestParam.md)
 - [OASBatch](OASBatch.md)
 - [OASBatchErrors](OASBatchErrors.md)
 - [OASBatchErrorsDataInner](OASBatchErrorsDataInner.md)
 - [OASBatchRequestCounts](OASBatchRequestCounts.md)
 - [OASBatchRequestInput](OASBatchRequestInput.md)
 - [OASBatchRequestOutput](OASBatchRequestOutput.md)
 - [OASBatchRequestOutputError](OASBatchRequestOutputError.md)
 - [OASBatchRequestOutputResponse](OASBatchRequestOutputResponse.md)
 - [OASChatCompletionFunctionCallOption](OASChatCompletionFunctionCallOption.md)
 - [OASChatCompletionFunctions](OASChatCompletionFunctions.md)
 - [OASChatCompletionMessageToolCall](OASChatCompletionMessageToolCall.md)
 - [OASChatCompletionMessageToolCallChun](OASChatCompletionMessageToolCallChun.md)
 - [OASChatCompletionMessageToolCallFunc](OASChatCompletionMessageToolCallFunc.md)
 - [OASChatCompletionNamedToolChoice](OASChatCompletionNamedToolChoice.md)
 - [OASChatCompletionRequestAssistantMes](OASChatCompletionRequestAssistantMes.md)
 - [OASChatCompletionRequestDeveloperMes](OASChatCompletionRequestDeveloperMes.md)
 - [OASChatCompletionRequestFunctionMess](OASChatCompletionRequestFunctionMess.md)
 - [OASChatCompletionRequestMessage](OASChatCompletionRequestMessage.md)
 - [OASChatCompletionRequestMessageConte](OASChatCompletionRequestMessageConte.md)
 - [OASChatCompletionRequestSystemMessag](OASChatCompletionRequestSystemMessag.md)
 - [OASChatCompletionRequestToolMessage](OASChatCompletionRequestToolMessage.md)
 - [OASChatCompletionRequestToolMessageC](OASChatCompletionRequestToolMessageC.md)
 - [OASChatCompletionRequestUserMessage](OASChatCompletionRequestUserMessage.md)
 - [OASChatCompletionRequestUserMessageC](OASChatCompletionRequestUserMessageC.md)
 - [OASChatCompletionResponseMessage](OASChatCompletionResponseMessage.md)
 - [OASChatCompletionResponseMessageAudi](OASChatCompletionResponseMessageAudi.md)
 - [OASChatCompletionResponseMessageFunc](OASChatCompletionResponseMessageFunc.md)
 - [OASChatCompletionRole](OASChatCompletionRole.md)
 - [OASChatCompletionStreamOptions](OASChatCompletionStreamOptions.md)
 - [OASChatCompletionStreamResponseDelta](OASChatCompletionStreamResponseDelta.md)
 - [OASChatCompletionTokenLogprob](OASChatCompletionTokenLogprob.md)
 - [OASChatCompletionTokenLogprobTopLogp](OASChatCompletionTokenLogprobTopLogp.md)
 - [OASChatCompletionTool](OASChatCompletionTool.md)
 - [OASChatCompletionToolChoiceOption](OASChatCompletionToolChoiceOption.md)
 - [OASChunkingStrategyRequestParam](OASChunkingStrategyRequestParam.md)
 - [OASCompleteUploadRequest](OASCompleteUploadRequest.md)
 - [OASCompletionUsage](OASCompletionUsage.md)
 - [OASCompletionUsageCompletionTokensDe](OASCompletionUsageCompletionTokensDe.md)
 - [OASCompletionUsagePromptTokensDetail](OASCompletionUsagePromptTokensDetail.md)
 - [OASCostsResult](OASCostsResult.md)
 - [OASCostsResultAmount](OASCostsResultAmount.md)
 - [OASCreateAssistantRequest](OASCreateAssistantRequest.md)
 - [OASCreateAssistantRequestModel](OASCreateAssistantRequestModel.md)
 - [OASCreateAssistantRequestToolResourc](OASCreateAssistantRequestToolResourc.md)
 - [OASCreateBatchRequest](OASCreateBatchRequest.md)
 - [OASCreateChatCompletionFunctionRespo](OASCreateChatCompletionFunctionRespo.md)
 - [OASCreateChatCompletionRequest](OASCreateChatCompletionRequest.md)
 - [OASCreateChatCompletionRequestAudio](OASCreateChatCompletionRequestAudio.md)
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
 - [OASCreateMessageRequestAttachmentsIn](OASCreateMessageRequestAttachmentsIn.md)
 - [OASCreateMessageRequestContent](OASCreateMessageRequestContent.md)
 - [OASCreateModerationRequest](OASCreateModerationRequest.md)
 - [OASCreateModerationRequestInput](OASCreateModerationRequestInput.md)
 - [OASCreateModerationRequestInputOneOf](OASCreateModerationRequestInputOneOf.md)
 - [OASCreateModerationRequestModel](OASCreateModerationRequestModel.md)
 - [OASCreateModerationResponse](OASCreateModerationResponse.md)
 - [OASCreateModerationResponseResultsIn](OASCreateModerationResponseResultsIn.md)
 - [OASCreateRunRequest](OASCreateRunRequest.md)
 - [OASCreateRunRequestModel](OASCreateRunRequestModel.md)
 - [OASCreateSpeechRequest](OASCreateSpeechRequest.md)
 - [OASCreateSpeechRequestModel](OASCreateSpeechRequestModel.md)
 - [OASCreateThreadAndRunRequest](OASCreateThreadAndRunRequest.md)
 - [OASCreateThreadAndRunRequestToolReso](OASCreateThreadAndRunRequestToolReso.md)
 - [OASCreateThreadAndRunRequestToolsInn](OASCreateThreadAndRunRequestToolsInn.md)
 - [OASCreateThreadRequest](OASCreateThreadRequest.md)
 - [OASCreateThreadRequestToolResources](OASCreateThreadRequestToolResources.md)
 - [OASCreateThreadRequestToolResourcesF](OASCreateThreadRequestToolResourcesF.md)
 - [OASCreateTranscription200Response](OASCreateTranscription200Response.md)
 - [OASCreateTranscriptionRequestModel](OASCreateTranscriptionRequestModel.md)
 - [OASCreateTranscriptionResponseJson](OASCreateTranscriptionResponseJson.md)
 - [OASCreateTranscriptionResponseVerbos](OASCreateTranscriptionResponseVerbos.md)
 - [OASCreateTranslation200Response](OASCreateTranslation200Response.md)
 - [OASCreateTranslationResponseJson](OASCreateTranslationResponseJson.md)
 - [OASCreateTranslationResponseVerboseJ](OASCreateTranslationResponseVerboseJ.md)
 - [OASCreateUploadRequest](OASCreateUploadRequest.md)
 - [OASCreateVectorStoreFileBatchRequest](OASCreateVectorStoreFileBatchRequest.md)
 - [OASCreateVectorStoreFileRequest](OASCreateVectorStoreFileRequest.md)
 - [OASCreateVectorStoreRequest](OASCreateVectorStoreRequest.md)
 - [OASCreateVectorStoreRequestChunkingS](OASCreateVectorStoreRequestChunkingS.md)
 - [OASDefaultProjectErrorResponse](OASDefaultProjectErrorResponse.md)
 - [OASDeleteAssistantResponse](OASDeleteAssistantResponse.md)
 - [OASDeleteFileResponse](OASDeleteFileResponse.md)
 - [OASDeleteMessageResponse](OASDeleteMessageResponse.md)
 - [OASDeleteModelResponse](OASDeleteModelResponse.md)
 - [OASDeleteThreadResponse](OASDeleteThreadResponse.md)
 - [OASDeleteVectorStoreFileResponse](OASDeleteVectorStoreFileResponse.md)
 - [OASDeleteVectorStoreResponse](OASDeleteVectorStoreResponse.md)
 - [OASDoneEvent](OASDoneEvent.md)
 - [OASEmbedding](OASEmbedding.md)
 - [OASError](OASError.md)
 - [OASErrorEvent](OASErrorEvent.md)
 - [OASErrorResponse](OASErrorResponse.md)
 - [OASFileSearchRankingOptions](OASFileSearchRankingOptions.md)
 - [OASFineTuneChatCompletionRequestAssi](OASFineTuneChatCompletionRequestAssi.md)
 - [OASFineTuneChatRequestInput](OASFineTuneChatRequestInput.md)
 - [OASFineTuneChatRequestInputMessagesI](OASFineTuneChatRequestInputMessagesI.md)
 - [OASFineTuneCompletionRequestInput](OASFineTuneCompletionRequestInput.md)
 - [OASFineTuneDPOMethod](OASFineTuneDPOMethod.md)
 - [OASFineTuneDPOMethodHyperparameters](OASFineTuneDPOMethodHyperparameters.md)
 - [OASFineTuneDPOMethodHyperparametersB](OASFineTuneDPOMethodHyperparametersB.md)
 - [OASFineTuneDPOMethodHyperparametersL](OASFineTuneDPOMethodHyperparametersL.md)
 - [OASFineTuneDPOMethodHyperparametersN](OASFineTuneDPOMethodHyperparametersN.md)
 - [OASFineTuneMethod](OASFineTuneMethod.md)
 - [OASFineTunePreferenceRequestInput](OASFineTunePreferenceRequestInput.md)
 - [OASFineTunePreferenceRequestInputInp](OASFineTunePreferenceRequestInputInp.md)
 - [OASFineTunePreferenceRequestInputPre](OASFineTunePreferenceRequestInputPre.md)
 - [OASFineTuneSupervisedMethod](OASFineTuneSupervisedMethod.md)
 - [OASFineTuneSupervisedMethodHyperpara](OASFineTuneSupervisedMethodHyperpara.md)
 - [OASFineTuningIntegration](OASFineTuningIntegration.md)
 - [OASFineTuningJob](OASFineTuningJob.md)
 - [OASFineTuningJobCheckpoint](OASFineTuningJobCheckpoint.md)
 - [OASFineTuningJobCheckpointMetrics](OASFineTuningJobCheckpointMetrics.md)
 - [OASFineTuningJobError](OASFineTuningJobError.md)
 - [OASFineTuningJobEvent](OASFineTuningJobEvent.md)
 - [OASFineTuningJobHyperparameters](OASFineTuningJobHyperparameters.md)
 - [OASFineTuningJobIntegrationsInner](OASFineTuningJobIntegrationsInner.md)
 - [OASFunctionObject](OASFunctionObject.md)
 - [OASImage](OASImage.md)
 - [OASImagesResponse](OASImagesResponse.md)
 - [OASInvite](OASInvite.md)
 - [OASInviteDeleteResponse](OASInviteDeleteResponse.md)
 - [OASInviteListResponse](OASInviteListResponse.md)
 - [OASInviteProjectsInner](OASInviteProjectsInner.md)
 - [OASInviteRequest](OASInviteRequest.md)
 - [OASInviteRequestProjectsInner](OASInviteRequestProjectsInner.md)
 - [OASListAssistantsResponse](OASListAssistantsResponse.md)
 - [OASListAuditLogsEffectiveAtParameter](OASListAuditLogsEffectiveAtParameter.md)
 - [OASListAuditLogsResponse](OASListAuditLogsResponse.md)
 - [OASListBatchesResponse](OASListBatchesResponse.md)
 - [OASListFilesResponse](OASListFilesResponse.md)
 - [OASListFineTuningJobCheckpointsRespo](OASListFineTuningJobCheckpointsRespo.md)
 - [OASListFineTuningJobEventsResponse](OASListFineTuningJobEventsResponse.md)
 - [OASListMessagesResponse](OASListMessagesResponse.md)
 - [OASListModelsResponse](OASListModelsResponse.md)
 - [OASListPaginatedFineTuningJobsRespon](OASListPaginatedFineTuningJobsRespon.md)
 - [OASListRunStepsResponse](OASListRunStepsResponse.md)
 - [OASListRunsResponse](OASListRunsResponse.md)
 - [OASListThreadsResponse](OASListThreadsResponse.md)
 - [OASListVectorStoreFilesResponse](OASListVectorStoreFilesResponse.md)
 - [OASListVectorStoresResponse](OASListVectorStoresResponse.md)
 - [OASMessageContentImageFileObject](OASMessageContentImageFileObject.md)
 - [OASMessageContentImageFileObjectImag](OASMessageContentImageFileObjectImag.md)
 - [OASMessageContentImageUrlObject](OASMessageContentImageUrlObject.md)
 - [OASMessageContentImageUrlObjectImage](OASMessageContentImageUrlObjectImage.md)
 - [OASMessageContentRefusalObject](OASMessageContentRefusalObject.md)
 - [OASMessageContentTextAnnotationsFile](OASMessageContentTextAnnotationsFile.md)
 - [OASMessageContentTextObject](OASMessageContentTextObject.md)
 - [OASMessageContentTextObjectText](OASMessageContentTextObjectText.md)
 - [OASMessageContentTextObjectTextAnnot](OASMessageContentTextObjectTextAnnot.md)
 - [OASMessageDeltaContentImageFileObjec](OASMessageDeltaContentImageFileObjec.md)
 - [OASMessageDeltaContentImageUrlObject](OASMessageDeltaContentImageUrlObject.md)
 - [OASMessageDeltaContentRefusalObject](OASMessageDeltaContentRefusalObject.md)
 - [OASMessageDeltaContentTextAnnotation](OASMessageDeltaContentTextAnnotation.md)
 - [OASMessageDeltaContentTextObject](OASMessageDeltaContentTextObject.md)
 - [OASMessageDeltaContentTextObjectText](OASMessageDeltaContentTextObjectText.md)
 - [OASMessageDeltaObject](OASMessageDeltaObject.md)
 - [OASMessageDeltaObjectDelta](OASMessageDeltaObjectDelta.md)
 - [OASMessageDeltaObjectDeltaContentInn](OASMessageDeltaObjectDeltaContentInn.md)
 - [OASMessageObject](OASMessageObject.md)
 - [OASMessageObjectContentInner](OASMessageObjectContentInner.md)
 - [OASMessageObjectIncompleteDetails](OASMessageObjectIncompleteDetails.md)
 - [OASMessageRequestContentTextObject](OASMessageRequestContentTextObject.md)
 - [OASMessageStreamEvent](OASMessageStreamEvent.md)
 - [OASMessageStreamEventOneOf](OASMessageStreamEventOneOf.md)
 - [OASMessageStreamEventOneOf1](OASMessageStreamEventOneOf1.md)
 - [OASMessageStreamEventOneOf2](OASMessageStreamEventOneOf2.md)
 - [OASMessageStreamEventOneOf3](OASMessageStreamEventOneOf3.md)
 - [OASMessageStreamEventOneOf4](OASMessageStreamEventOneOf4.md)
 - [OASModel](OASModel.md)
 - [OASModifyAssistantRequest](OASModifyAssistantRequest.md)
 - [OASModifyAssistantRequestToolResourc](OASModifyAssistantRequestToolResourc.md)
 - [OASModifyMessageRequest](OASModifyMessageRequest.md)
 - [OASModifyRunRequest](OASModifyRunRequest.md)
 - [OASModifyThreadRequest](OASModifyThreadRequest.md)
 - [OASModifyThreadRequestToolResources](OASModifyThreadRequestToolResources.md)
 - [OASModifyThreadRequestToolResourcesF](OASModifyThreadRequestToolResourcesF.md)
 - [OASOpenAIFile](OASOpenAIFile.md)
 - [OASOtherChunkingStrategyResponsePara](OASOtherChunkingStrategyResponsePara.md)
 - [OASPredictionContent](OASPredictionContent.md)
 - [OASPredictionContentContent](OASPredictionContentContent.md)
 - [OASProject](OASProject.md)
 - [OASProjectApiKey](OASProjectApiKey.md)
 - [OASProjectApiKeyDeleteResponse](OASProjectApiKeyDeleteResponse.md)
 - [OASProjectApiKeyListResponse](OASProjectApiKeyListResponse.md)
 - [OASProjectApiKeyOwner](OASProjectApiKeyOwner.md)
 - [OASProjectCreateRequest](OASProjectCreateRequest.md)
 - [OASProjectListResponse](OASProjectListResponse.md)
 - [OASProjectRateLimit](OASProjectRateLimit.md)
 - [OASProjectRateLimitListResponse](OASProjectRateLimitListResponse.md)
 - [OASProjectRateLimitUpdateRequest](OASProjectRateLimitUpdateRequest.md)
 - [OASProjectServiceAccount](OASProjectServiceAccount.md)
 - [OASProjectServiceAccountApiKey](OASProjectServiceAccountApiKey.md)
 - [OASProjectServiceAccountCreateReques](OASProjectServiceAccountCreateReques.md)
 - [OASProjectServiceAccountCreateRespon](OASProjectServiceAccountCreateRespon.md)
 - [OASProjectServiceAccountDeleteRespon](OASProjectServiceAccountDeleteRespon.md)
 - [OASProjectServiceAccountListResponse](OASProjectServiceAccountListResponse.md)
 - [OASProjectUpdateRequest](OASProjectUpdateRequest.md)
 - [OASProjectUser](OASProjectUser.md)
 - [OASProjectUserCreateRequest](OASProjectUserCreateRequest.md)
 - [OASProjectUserDeleteResponse](OASProjectUserDeleteResponse.md)
 - [OASProjectUserListResponse](OASProjectUserListResponse.md)
 - [OASProjectUserUpdateRequest](OASProjectUserUpdateRequest.md)
 - [OASRealtimeClientEventConversationIt](OASRealtimeClientEventConversationIt.md)
 - [OASRealtimeClientEventInputAudioBuff](OASRealtimeClientEventInputAudioBuff.md)
 - [OASRealtimeClientEventResponseCancel](OASRealtimeClientEventResponseCancel.md)
 - [OASRealtimeClientEventResponseCreate](OASRealtimeClientEventResponseCreate.md)
 - [OASRealtimeClientEventSessionUpdate](OASRealtimeClientEventSessionUpdate.md)
 - [OASRealtimeConversationItem](OASRealtimeConversationItem.md)
 - [OASRealtimeConversationItemContentIn](OASRealtimeConversationItemContentIn.md)
 - [OASRealtimeResponse](OASRealtimeResponse.md)
 - [OASRealtimeResponseCreateParams](OASRealtimeResponseCreateParams.md)
 - [OASRealtimeResponseCreateParamsConve](OASRealtimeResponseCreateParamsConve.md)
 - [OASRealtimeResponseCreateParamsMaxRe](OASRealtimeResponseCreateParamsMaxRe.md)
 - [OASRealtimeResponseCreateParamsTools](OASRealtimeResponseCreateParamsTools.md)
 - [OASRealtimeResponseStatusDetails](OASRealtimeResponseStatusDetails.md)
 - [OASRealtimeResponseStatusDetailsErro](OASRealtimeResponseStatusDetailsErro.md)
 - [OASRealtimeResponseUsage](OASRealtimeResponseUsage.md)
 - [OASRealtimeResponseUsageInputTokenDe](OASRealtimeResponseUsageInputTokenDe.md)
 - [OASRealtimeResponseUsageOutputTokenD](OASRealtimeResponseUsageOutputTokenD.md)
 - [OASRealtimeServerEventConversationCr](OASRealtimeServerEventConversationCr.md)
 - [OASRealtimeServerEventConversationIt](OASRealtimeServerEventConversationIt.md)
 - [OASRealtimeServerEventError](OASRealtimeServerEventError.md)
 - [OASRealtimeServerEventErrorError](OASRealtimeServerEventErrorError.md)
 - [OASRealtimeServerEventInputAudioBuff](OASRealtimeServerEventInputAudioBuff.md)
 - [OASRealtimeServerEventRateLimitsUpda](OASRealtimeServerEventRateLimitsUpda.md)
 - [OASRealtimeServerEventResponseAudioD](OASRealtimeServerEventResponseAudioD.md)
 - [OASRealtimeServerEventResponseAudioT](OASRealtimeServerEventResponseAudioT.md)
 - [OASRealtimeServerEventResponseConten](OASRealtimeServerEventResponseConten.md)
 - [OASRealtimeServerEventResponseCreate](OASRealtimeServerEventResponseCreate.md)
 - [OASRealtimeServerEventResponseDone](OASRealtimeServerEventResponseDone.md)
 - [OASRealtimeServerEventResponseFuncti](OASRealtimeServerEventResponseFuncti.md)
 - [OASRealtimeServerEventResponseOutput](OASRealtimeServerEventResponseOutput.md)
 - [OASRealtimeServerEventResponseTextDe](OASRealtimeServerEventResponseTextDe.md)
 - [OASRealtimeServerEventResponseTextDo](OASRealtimeServerEventResponseTextDo.md)
 - [OASRealtimeServerEventSessionCreated](OASRealtimeServerEventSessionCreated.md)
 - [OASRealtimeServerEventSessionUpdated](OASRealtimeServerEventSessionUpdated.md)
 - [OASRealtimeSession](OASRealtimeSession.md)
 - [OASRealtimeSessionCreateRequest](OASRealtimeSessionCreateRequest.md)
 - [OASRealtimeSessionCreateRequestTurnD](OASRealtimeSessionCreateRequestTurnD.md)
 - [OASRealtimeSessionCreateResponse](OASRealtimeSessionCreateResponse.md)
 - [OASRealtimeSessionCreateResponseClie](OASRealtimeSessionCreateResponseClie.md)
 - [OASRealtimeSessionCreateResponseTurn](OASRealtimeSessionCreateResponseTurn.md)
 - [OASRealtimeSessionInputAudioTranscri](OASRealtimeSessionInputAudioTranscri.md)
 - [OASRealtimeSessionModel](OASRealtimeSessionModel.md)
 - [OASRealtimeSessionTurnDetection](OASRealtimeSessionTurnDetection.md)
 - [OASResponseFormatJsonObject](OASResponseFormatJsonObject.md)
 - [OASResponseFormatJsonSchema](OASResponseFormatJsonSchema.md)
 - [OASResponseFormatJsonSchemaJsonSchem](OASResponseFormatJsonSchemaJsonSchem.md)
 - [OASResponseFormatText](OASResponseFormatText.md)
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
 - [OASRunStepDetailsMessageCreationObje](OASRunStepDetailsMessageCreationObje.md)
 - [OASRunStepDetailsToolCallsCodeObject](OASRunStepDetailsToolCallsCodeObject.md)
 - [OASRunStepDetailsToolCallsCodeOutput](OASRunStepDetailsToolCallsCodeOutput.md)
 - [OASRunStepDetailsToolCallsFileSearch](OASRunStepDetailsToolCallsFileSearch.md)
 - [OASRunStepDetailsToolCallsFunctionOb](OASRunStepDetailsToolCallsFunctionOb.md)
 - [OASRunStepDetailsToolCallsObject](OASRunStepDetailsToolCallsObject.md)
 - [OASRunStepDetailsToolCallsObjectTool](OASRunStepDetailsToolCallsObjectTool.md)
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
 - [OASRunStreamEventOneOf9](OASRunStreamEventOneOf9.md)
 - [OASRunToolCallObject](OASRunToolCallObject.md)
 - [OASRunToolCallObjectFunction](OASRunToolCallObjectFunction.md)
 - [OASStaticChunkingStrategy](OASStaticChunkingStrategy.md)
 - [OASStaticChunkingStrategyRequestPara](OASStaticChunkingStrategyRequestPara.md)
 - [OASStaticChunkingStrategyResponsePar](OASStaticChunkingStrategyResponsePar.md)
 - [OASStaticChunkingStrategyStatic](OASStaticChunkingStrategyStatic.md)
 - [OASSubmitToolOutputsRunRequest](OASSubmitToolOutputsRunRequest.md)
 - [OASSubmitToolOutputsRunRequestToolOu](OASSubmitToolOutputsRunRequestToolOu.md)
 - [OASThreadObject](OASThreadObject.md)
 - [OASThreadStreamEvent](OASThreadStreamEvent.md)
 - [OASTranscriptionSegment](OASTranscriptionSegment.md)
 - [OASTranscriptionWord](OASTranscriptionWord.md)
 - [OASTruncationObject](OASTruncationObject.md)
 - [OASUpdateVectorStoreRequest](OASUpdateVectorStoreRequest.md)
 - [OASUpload](OASUpload.md)
 - [OASUploadPart](OASUploadPart.md)
 - [OASUsageAudioSpeechesResult](OASUsageAudioSpeechesResult.md)
 - [OASUsageAudioTranscriptionsResult](OASUsageAudioTranscriptionsResult.md)
 - [OASUsageCodeInterpreterSessionsResul](OASUsageCodeInterpreterSessionsResul.md)
 - [OASUsageCompletionsResult](OASUsageCompletionsResult.md)
 - [OASUsageEmbeddingsResult](OASUsageEmbeddingsResult.md)
 - [OASUsageImagesResult](OASUsageImagesResult.md)
 - [OASUsageModerationsResult](OASUsageModerationsResult.md)
 - [OASUsageResponse](OASUsageResponse.md)
 - [OASUsageTimeBucket](OASUsageTimeBucket.md)
 - [OASUsageTimeBucketResultInner](OASUsageTimeBucketResultInner.md)
 - [OASUsageVectorStoresResult](OASUsageVectorStoresResult.md)
 - [OASUser](OASUser.md)
 - [OASUserDeleteResponse](OASUserDeleteResponse.md)
 - [OASUserListResponse](OASUserListResponse.md)
 - [OASUserRoleUpdateRequest](OASUserRoleUpdateRequest.md)
 - [OASVectorStoreExpirationAfter](OASVectorStoreExpirationAfter.md)
 - [OASVectorStoreFileBatchObject](OASVectorStoreFileBatchObject.md)
 - [OASVectorStoreFileBatchObjectFileCou](OASVectorStoreFileBatchObjectFileCou.md)
 - [OASVectorStoreFileObject](OASVectorStoreFileObject.md)
 - [OASVectorStoreFileObjectChunkingStra](OASVectorStoreFileObjectChunkingStra.md)
 - [OASVectorStoreFileObjectLastError](OASVectorStoreFileObjectLastError.md)
 - [OASVectorStoreObject](OASVectorStoreObject.md)
 - [OASVectorStoreObjectFileCounts](OASVectorStoreObjectFileCounts.md)


## Documentation for Authorization


Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: HTTP Bearer Token authentication


## Author

blah+oapicf@cliffano.com

