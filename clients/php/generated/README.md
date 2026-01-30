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
*AssistantsApi* | [**createMessage**](docs/Api/AssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.
*AssistantsApi* | [**createRun**](docs/Api/AssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run.
*AssistantsApi* | [**createThread**](docs/Api/AssistantsApi.md#createthread) | **POST** /threads | Create a thread.
*AssistantsApi* | [**createThreadAndRun**](docs/Api/AssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.
*AssistantsApi* | [**deleteAssistant**](docs/Api/AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AssistantsApi* | [**deleteMessage**](docs/Api/AssistantsApi.md#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
*AssistantsApi* | [**deleteThread**](docs/Api/AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.
*AssistantsApi* | [**getAssistant**](docs/Api/AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AssistantsApi* | [**getMessage**](docs/Api/AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AssistantsApi* | [**getRun**](docs/Api/AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AssistantsApi* | [**getRunStep**](docs/Api/AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AssistantsApi* | [**getThread**](docs/Api/AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.
*AssistantsApi* | [**listAssistants**](docs/Api/AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants.
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
*AuditLogsApi* | [**listAuditLogs**](docs/Api/AuditLogsApi.md#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.
*BatchApi* | [**cancelBatch**](docs/Api/BatchApi.md#cancelbatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
*BatchApi* | [**createBatch**](docs/Api/BatchApi.md#createbatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
*BatchApi* | [**listBatches**](docs/Api/BatchApi.md#listbatches) | **GET** /batches | List your organization&#39;s batches.
*BatchApi* | [**retrieveBatch**](docs/Api/BatchApi.md#retrievebatch) | **GET** /batches/{batch_id} | Retrieves a batch.
*ChatApi* | [**createChatCompletion**](docs/Api/ChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).
*CompletionsApi* | [**createCompletion**](docs/Api/CompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*DefaultApi* | [**adminApiKeysCreate**](docs/Api/DefaultApi.md#adminapikeyscreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
*DefaultApi* | [**adminApiKeysDelete**](docs/Api/DefaultApi.md#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
*DefaultApi* | [**adminApiKeysGet**](docs/Api/DefaultApi.md#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
*DefaultApi* | [**adminApiKeysList**](docs/Api/DefaultApi.md#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys
*EmbeddingsApi* | [**createEmbedding**](docs/Api/EmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*FilesApi* | [**createFile**](docs/Api/FilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
*FilesApi* | [**deleteFile**](docs/Api/FilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*FilesApi* | [**downloadFile**](docs/Api/FilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*FilesApi* | [**listFiles**](docs/Api/FilesApi.md#listfiles) | **GET** /files | Returns a list of files.
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
*InvitesApi* | [**deleteInvite**](docs/Api/InvitesApi.md#deleteinvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
*InvitesApi* | [**inviteUser**](docs/Api/InvitesApi.md#inviteuser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
*InvitesApi* | [**listInvites**](docs/Api/InvitesApi.md#listinvites) | **GET** /organization/invites | Returns a list of invites in the organization.
*InvitesApi* | [**retrieveInvite**](docs/Api/InvitesApi.md#retrieveinvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.
*ModelsApi* | [**deleteModel**](docs/Api/ModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*ModelsApi* | [**listModels**](docs/Api/ModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*ModelsApi* | [**retrieveModel**](docs/Api/ModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*ModerationsApi* | [**createModeration**](docs/Api/ModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).
*ProjectsApi* | [**archiveProject**](docs/Api/ProjectsApi.md#archiveproject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
*ProjectsApi* | [**createProject**](docs/Api/ProjectsApi.md#createproject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
*ProjectsApi* | [**createProjectServiceAccount**](docs/Api/ProjectsApi.md#createprojectserviceaccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
*ProjectsApi* | [**createProjectUser**](docs/Api/ProjectsApi.md#createprojectuser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
*ProjectsApi* | [**deleteProjectApiKey**](docs/Api/ProjectsApi.md#deleteprojectapikey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
*ProjectsApi* | [**deleteProjectServiceAccount**](docs/Api/ProjectsApi.md#deleteprojectserviceaccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
*ProjectsApi* | [**deleteProjectUser**](docs/Api/ProjectsApi.md#deleteprojectuser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
*ProjectsApi* | [**listProjectApiKeys**](docs/Api/ProjectsApi.md#listprojectapikeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
*ProjectsApi* | [**listProjectRateLimits**](docs/Api/ProjectsApi.md#listprojectratelimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
*ProjectsApi* | [**listProjectServiceAccounts**](docs/Api/ProjectsApi.md#listprojectserviceaccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
*ProjectsApi* | [**listProjectUsers**](docs/Api/ProjectsApi.md#listprojectusers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
*ProjectsApi* | [**listProjects**](docs/Api/ProjectsApi.md#listprojects) | **GET** /organization/projects | Returns a list of projects.
*ProjectsApi* | [**modifyProject**](docs/Api/ProjectsApi.md#modifyproject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
*ProjectsApi* | [**modifyProjectUser**](docs/Api/ProjectsApi.md#modifyprojectuser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
*ProjectsApi* | [**retrieveProject**](docs/Api/ProjectsApi.md#retrieveproject) | **GET** /organization/projects/{project_id} | Retrieves a project.
*ProjectsApi* | [**retrieveProjectApiKey**](docs/Api/ProjectsApi.md#retrieveprojectapikey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
*ProjectsApi* | [**retrieveProjectServiceAccount**](docs/Api/ProjectsApi.md#retrieveprojectserviceaccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
*ProjectsApi* | [**retrieveProjectUser**](docs/Api/ProjectsApi.md#retrieveprojectuser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
*ProjectsApi* | [**updateProjectRateLimits**](docs/Api/ProjectsApi.md#updateprojectratelimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.
*RealtimeApi* | [**createRealtimeSession**](docs/Api/RealtimeApi.md#createrealtimesession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.
*UploadsApi* | [**addUploadPart**](docs/Api/UploadsApi.md#adduploadpart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).
*UploadsApi* | [**cancelUpload**](docs/Api/UploadsApi.md#cancelupload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.
*UploadsApi* | [**completeUpload**](docs/Api/UploadsApi.md#completeupload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
*UploadsApi* | [**createUpload**](docs/Api/UploadsApi.md#createupload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).
*UsageApi* | [**usageAudioSpeeches**](docs/Api/UsageApi.md#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
*UsageApi* | [**usageAudioTranscriptions**](docs/Api/UsageApi.md#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
*UsageApi* | [**usageCodeInterpreterSessions**](docs/Api/UsageApi.md#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
*UsageApi* | [**usageCompletions**](docs/Api/UsageApi.md#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
*UsageApi* | [**usageCosts**](docs/Api/UsageApi.md#usagecosts) | **GET** /organization/costs | Get costs details for the organization.
*UsageApi* | [**usageEmbeddings**](docs/Api/UsageApi.md#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
*UsageApi* | [**usageImages**](docs/Api/UsageApi.md#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization.
*UsageApi* | [**usageModerations**](docs/Api/UsageApi.md#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
*UsageApi* | [**usageVectorStores**](docs/Api/UsageApi.md#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.
*UsersApi* | [**deleteUser**](docs/Api/UsersApi.md#deleteuser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
*UsersApi* | [**listUsers**](docs/Api/UsersApi.md#listusers) | **GET** /organization/users | Lists all of the users in the organization.
*UsersApi* | [**modifyUser**](docs/Api/UsersApi.md#modifyuser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
*UsersApi* | [**retrieveUser**](docs/Api/UsersApi.md#retrieveuser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.
*VectorStoresApi* | [**cancelVectorStoreFileBatch**](docs/Api/VectorStoresApi.md#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
*VectorStoresApi* | [**createVectorStore**](docs/Api/VectorStoresApi.md#createvectorstore) | **POST** /vector_stores | Create a vector store.
*VectorStoresApi* | [**createVectorStoreFile**](docs/Api/VectorStoresApi.md#createvectorstorefile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
*VectorStoresApi* | [**createVectorStoreFileBatch**](docs/Api/VectorStoresApi.md#createvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
*VectorStoresApi* | [**deleteVectorStore**](docs/Api/VectorStoresApi.md#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
*VectorStoresApi* | [**deleteVectorStoreFile**](docs/Api/VectorStoresApi.md#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
*VectorStoresApi* | [**getVectorStore**](docs/Api/VectorStoresApi.md#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
*VectorStoresApi* | [**getVectorStoreFile**](docs/Api/VectorStoresApi.md#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
*VectorStoresApi* | [**getVectorStoreFileBatch**](docs/Api/VectorStoresApi.md#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
*VectorStoresApi* | [**listFilesInVectorStoreBatch**](docs/Api/VectorStoresApi.md#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
*VectorStoresApi* | [**listVectorStoreFiles**](docs/Api/VectorStoresApi.md#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
*VectorStoresApi* | [**listVectorStores**](docs/Api/VectorStoresApi.md#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores.
*VectorStoresApi* | [**modifyVectorStore**](docs/Api/VectorStoresApi.md#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.

## Models

- [AdminApiKey](docs/Model/AdminApiKey.md)
- [AdminApiKeyOwner](docs/Model/AdminApiKeyOwner.md)
- [AdminApiKeysCreateRequest](docs/Model/AdminApiKeysCreateRequest.md)
- [AdminApiKeysDelete200Response](docs/Model/AdminApiKeysDelete200Response.md)
- [ApiKeyList](docs/Model/ApiKeyList.md)
- [ArrayOfContentPartsInner](docs/Model/ArrayOfContentPartsInner.md)
- [AssistantObject](docs/Model/AssistantObject.md)
- [AssistantObjectToolResources](docs/Model/AssistantObjectToolResources.md)
- [AssistantObjectToolResourcesCodeInterpreter](docs/Model/AssistantObjectToolResourcesCodeInterpreter.md)
- [AssistantObjectToolResourcesFileSearch](docs/Model/AssistantObjectToolResourcesFileSearch.md)
- [AssistantObjectToolsInner](docs/Model/AssistantObjectToolsInner.md)
- [AssistantStreamEvent](docs/Model/AssistantStreamEvent.md)
- [AssistantToolsCode](docs/Model/AssistantToolsCode.md)
- [AssistantToolsFileSearch](docs/Model/AssistantToolsFileSearch.md)
- [AssistantToolsFileSearchFileSearch](docs/Model/AssistantToolsFileSearchFileSearch.md)
- [AssistantToolsFileSearchTypeOnly](docs/Model/AssistantToolsFileSearchTypeOnly.md)
- [AssistantToolsFunction](docs/Model/AssistantToolsFunction.md)
- [AssistantsApiResponseFormatOption](docs/Model/AssistantsApiResponseFormatOption.md)
- [AssistantsApiToolChoiceOption](docs/Model/AssistantsApiToolChoiceOption.md)
- [AssistantsNamedToolChoice](docs/Model/AssistantsNamedToolChoice.md)
- [AssistantsNamedToolChoiceFunction](docs/Model/AssistantsNamedToolChoiceFunction.md)
- [AudioResponseFormat](docs/Model/AudioResponseFormat.md)
- [AuditLog](docs/Model/AuditLog.md)
- [AuditLogActor](docs/Model/AuditLogActor.md)
- [AuditLogActorApiKey](docs/Model/AuditLogActorApiKey.md)
- [AuditLogActorServiceAccount](docs/Model/AuditLogActorServiceAccount.md)
- [AuditLogActorSession](docs/Model/AuditLogActorSession.md)
- [AuditLogActorUser](docs/Model/AuditLogActorUser.md)
- [AuditLogApiKeyCreated](docs/Model/AuditLogApiKeyCreated.md)
- [AuditLogApiKeyCreatedData](docs/Model/AuditLogApiKeyCreatedData.md)
- [AuditLogApiKeyDeleted](docs/Model/AuditLogApiKeyDeleted.md)
- [AuditLogApiKeyUpdated](docs/Model/AuditLogApiKeyUpdated.md)
- [AuditLogApiKeyUpdatedChangesRequested](docs/Model/AuditLogApiKeyUpdatedChangesRequested.md)
- [AuditLogEventType](docs/Model/AuditLogEventType.md)
- [AuditLogInviteAccepted](docs/Model/AuditLogInviteAccepted.md)
- [AuditLogInviteSent](docs/Model/AuditLogInviteSent.md)
- [AuditLogInviteSentData](docs/Model/AuditLogInviteSentData.md)
- [AuditLogLoginFailed](docs/Model/AuditLogLoginFailed.md)
- [AuditLogOrganizationUpdated](docs/Model/AuditLogOrganizationUpdated.md)
- [AuditLogOrganizationUpdatedChangesRequested](docs/Model/AuditLogOrganizationUpdatedChangesRequested.md)
- [AuditLogOrganizationUpdatedChangesRequestedSettings](docs/Model/AuditLogOrganizationUpdatedChangesRequestedSettings.md)
- [AuditLogProject](docs/Model/AuditLogProject.md)
- [AuditLogProjectArchived](docs/Model/AuditLogProjectArchived.md)
- [AuditLogProjectCreated](docs/Model/AuditLogProjectCreated.md)
- [AuditLogProjectCreatedData](docs/Model/AuditLogProjectCreatedData.md)
- [AuditLogProjectUpdated](docs/Model/AuditLogProjectUpdated.md)
- [AuditLogProjectUpdatedChangesRequested](docs/Model/AuditLogProjectUpdatedChangesRequested.md)
- [AuditLogRateLimitDeleted](docs/Model/AuditLogRateLimitDeleted.md)
- [AuditLogRateLimitUpdated](docs/Model/AuditLogRateLimitUpdated.md)
- [AuditLogRateLimitUpdatedChangesRequested](docs/Model/AuditLogRateLimitUpdatedChangesRequested.md)
- [AuditLogServiceAccountCreated](docs/Model/AuditLogServiceAccountCreated.md)
- [AuditLogServiceAccountCreatedData](docs/Model/AuditLogServiceAccountCreatedData.md)
- [AuditLogServiceAccountDeleted](docs/Model/AuditLogServiceAccountDeleted.md)
- [AuditLogServiceAccountUpdated](docs/Model/AuditLogServiceAccountUpdated.md)
- [AuditLogServiceAccountUpdatedChangesRequested](docs/Model/AuditLogServiceAccountUpdatedChangesRequested.md)
- [AuditLogUserAdded](docs/Model/AuditLogUserAdded.md)
- [AuditLogUserAddedData](docs/Model/AuditLogUserAddedData.md)
- [AuditLogUserDeleted](docs/Model/AuditLogUserDeleted.md)
- [AuditLogUserUpdated](docs/Model/AuditLogUserUpdated.md)
- [AuditLogUserUpdatedChangesRequested](docs/Model/AuditLogUserUpdatedChangesRequested.md)
- [AutoChunkingStrategy](docs/Model/AutoChunkingStrategy.md)
- [AutoChunkingStrategyRequestParam](docs/Model/AutoChunkingStrategyRequestParam.md)
- [Batch](docs/Model/Batch.md)
- [BatchErrors](docs/Model/BatchErrors.md)
- [BatchErrorsDataInner](docs/Model/BatchErrorsDataInner.md)
- [BatchRequestCounts](docs/Model/BatchRequestCounts.md)
- [BatchRequestInput](docs/Model/BatchRequestInput.md)
- [BatchRequestOutput](docs/Model/BatchRequestOutput.md)
- [BatchRequestOutputError](docs/Model/BatchRequestOutputError.md)
- [BatchRequestOutputResponse](docs/Model/BatchRequestOutputResponse.md)
- [ChatCompletionFunctionCallOption](docs/Model/ChatCompletionFunctionCallOption.md)
- [ChatCompletionFunctions](docs/Model/ChatCompletionFunctions.md)
- [ChatCompletionMessageToolCall](docs/Model/ChatCompletionMessageToolCall.md)
- [ChatCompletionMessageToolCallChunk](docs/Model/ChatCompletionMessageToolCallChunk.md)
- [ChatCompletionMessageToolCallChunkFunction](docs/Model/ChatCompletionMessageToolCallChunkFunction.md)
- [ChatCompletionMessageToolCallFunction](docs/Model/ChatCompletionMessageToolCallFunction.md)
- [ChatCompletionNamedToolChoice](docs/Model/ChatCompletionNamedToolChoice.md)
- [ChatCompletionRequestAssistantMessage](docs/Model/ChatCompletionRequestAssistantMessage.md)
- [ChatCompletionRequestAssistantMessageAudio](docs/Model/ChatCompletionRequestAssistantMessageAudio.md)
- [ChatCompletionRequestAssistantMessageContent](docs/Model/ChatCompletionRequestAssistantMessageContent.md)
- [ChatCompletionRequestAssistantMessageContentPart](docs/Model/ChatCompletionRequestAssistantMessageContentPart.md)
- [ChatCompletionRequestAssistantMessageFunctionCall](docs/Model/ChatCompletionRequestAssistantMessageFunctionCall.md)
- [ChatCompletionRequestDeveloperMessage](docs/Model/ChatCompletionRequestDeveloperMessage.md)
- [ChatCompletionRequestDeveloperMessageContent](docs/Model/ChatCompletionRequestDeveloperMessageContent.md)
- [ChatCompletionRequestFunctionMessage](docs/Model/ChatCompletionRequestFunctionMessage.md)
- [ChatCompletionRequestMessage](docs/Model/ChatCompletionRequestMessage.md)
- [ChatCompletionRequestMessageContentPartAudio](docs/Model/ChatCompletionRequestMessageContentPartAudio.md)
- [ChatCompletionRequestMessageContentPartAudioInputAudio](docs/Model/ChatCompletionRequestMessageContentPartAudioInputAudio.md)
- [ChatCompletionRequestMessageContentPartImage](docs/Model/ChatCompletionRequestMessageContentPartImage.md)
- [ChatCompletionRequestMessageContentPartImageImageUrl](docs/Model/ChatCompletionRequestMessageContentPartImageImageUrl.md)
- [ChatCompletionRequestMessageContentPartRefusal](docs/Model/ChatCompletionRequestMessageContentPartRefusal.md)
- [ChatCompletionRequestMessageContentPartText](docs/Model/ChatCompletionRequestMessageContentPartText.md)
- [ChatCompletionRequestSystemMessage](docs/Model/ChatCompletionRequestSystemMessage.md)
- [ChatCompletionRequestSystemMessageContent](docs/Model/ChatCompletionRequestSystemMessageContent.md)
- [ChatCompletionRequestToolMessage](docs/Model/ChatCompletionRequestToolMessage.md)
- [ChatCompletionRequestToolMessageContent](docs/Model/ChatCompletionRequestToolMessageContent.md)
- [ChatCompletionRequestUserMessage](docs/Model/ChatCompletionRequestUserMessage.md)
- [ChatCompletionRequestUserMessageContent](docs/Model/ChatCompletionRequestUserMessageContent.md)
- [ChatCompletionRequestUserMessageContentPart](docs/Model/ChatCompletionRequestUserMessageContentPart.md)
- [ChatCompletionResponseMessage](docs/Model/ChatCompletionResponseMessage.md)
- [ChatCompletionResponseMessageAudio](docs/Model/ChatCompletionResponseMessageAudio.md)
- [ChatCompletionResponseMessageFunctionCall](docs/Model/ChatCompletionResponseMessageFunctionCall.md)
- [ChatCompletionRole](docs/Model/ChatCompletionRole.md)
- [ChatCompletionStreamOptions](docs/Model/ChatCompletionStreamOptions.md)
- [ChatCompletionStreamResponseDelta](docs/Model/ChatCompletionStreamResponseDelta.md)
- [ChatCompletionStreamResponseDeltaFunctionCall](docs/Model/ChatCompletionStreamResponseDeltaFunctionCall.md)
- [ChatCompletionTokenLogprob](docs/Model/ChatCompletionTokenLogprob.md)
- [ChatCompletionTokenLogprobTopLogprobsInner](docs/Model/ChatCompletionTokenLogprobTopLogprobsInner.md)
- [ChatCompletionTool](docs/Model/ChatCompletionTool.md)
- [ChatCompletionToolChoiceOption](docs/Model/ChatCompletionToolChoiceOption.md)
- [ChunkingStrategyRequestParam](docs/Model/ChunkingStrategyRequestParam.md)
- [CompleteUploadRequest](docs/Model/CompleteUploadRequest.md)
- [CompletionUsage](docs/Model/CompletionUsage.md)
- [CompletionUsageCompletionTokensDetails](docs/Model/CompletionUsageCompletionTokensDetails.md)
- [CompletionUsagePromptTokensDetails](docs/Model/CompletionUsagePromptTokensDetails.md)
- [CostsResult](docs/Model/CostsResult.md)
- [CostsResultAmount](docs/Model/CostsResultAmount.md)
- [CreateAssistantRequest](docs/Model/CreateAssistantRequest.md)
- [CreateAssistantRequestModel](docs/Model/CreateAssistantRequestModel.md)
- [CreateAssistantRequestToolResources](docs/Model/CreateAssistantRequestToolResources.md)
- [CreateAssistantRequestToolResourcesCodeInterpreter](docs/Model/CreateAssistantRequestToolResourcesCodeInterpreter.md)
- [CreateAssistantRequestToolResourcesFileSearch](docs/Model/CreateAssistantRequestToolResourcesFileSearch.md)
- [CreateAssistantRequestToolResourcesFileSearchVectorStoresInner](docs/Model/CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md)
- [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy](docs/Model/CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.md)
- [CreateBatchRequest](docs/Model/CreateBatchRequest.md)
- [CreateChatCompletionFunctionResponse](docs/Model/CreateChatCompletionFunctionResponse.md)
- [CreateChatCompletionFunctionResponseChoicesInner](docs/Model/CreateChatCompletionFunctionResponseChoicesInner.md)
- [CreateChatCompletionRequest](docs/Model/CreateChatCompletionRequest.md)
- [CreateChatCompletionRequestAudio](docs/Model/CreateChatCompletionRequestAudio.md)
- [CreateChatCompletionRequestFunctionCall](docs/Model/CreateChatCompletionRequestFunctionCall.md)
- [CreateChatCompletionRequestModel](docs/Model/CreateChatCompletionRequestModel.md)
- [CreateChatCompletionRequestResponseFormat](docs/Model/CreateChatCompletionRequestResponseFormat.md)
- [CreateChatCompletionRequestStop](docs/Model/CreateChatCompletionRequestStop.md)
- [CreateChatCompletionResponse](docs/Model/CreateChatCompletionResponse.md)
- [CreateChatCompletionResponseChoicesInner](docs/Model/CreateChatCompletionResponseChoicesInner.md)
- [CreateChatCompletionResponseChoicesInnerLogprobs](docs/Model/CreateChatCompletionResponseChoicesInnerLogprobs.md)
- [CreateChatCompletionStreamResponse](docs/Model/CreateChatCompletionStreamResponse.md)
- [CreateChatCompletionStreamResponseChoicesInner](docs/Model/CreateChatCompletionStreamResponseChoicesInner.md)
- [CreateChatCompletionStreamResponseUsage](docs/Model/CreateChatCompletionStreamResponseUsage.md)
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
- [CreateMessageRequestAttachmentsInner](docs/Model/CreateMessageRequestAttachmentsInner.md)
- [CreateMessageRequestAttachmentsInnerToolsInner](docs/Model/CreateMessageRequestAttachmentsInnerToolsInner.md)
- [CreateMessageRequestContent](docs/Model/CreateMessageRequestContent.md)
- [CreateModerationRequest](docs/Model/CreateModerationRequest.md)
- [CreateModerationRequestInput](docs/Model/CreateModerationRequestInput.md)
- [CreateModerationRequestInputOneOfInner](docs/Model/CreateModerationRequestInputOneOfInner.md)
- [CreateModerationRequestInputOneOfInnerOneOf](docs/Model/CreateModerationRequestInputOneOfInnerOneOf.md)
- [CreateModerationRequestInputOneOfInnerOneOf1](docs/Model/CreateModerationRequestInputOneOfInnerOneOf1.md)
- [CreateModerationRequestInputOneOfInnerOneOfImageUrl](docs/Model/CreateModerationRequestInputOneOfInnerOneOfImageUrl.md)
- [CreateModerationRequestModel](docs/Model/CreateModerationRequestModel.md)
- [CreateModerationResponse](docs/Model/CreateModerationResponse.md)
- [CreateModerationResponseResultsInner](docs/Model/CreateModerationResponseResultsInner.md)
- [CreateModerationResponseResultsInnerCategories](docs/Model/CreateModerationResponseResultsInnerCategories.md)
- [CreateModerationResponseResultsInnerCategoryAppliedInputTypes](docs/Model/CreateModerationResponseResultsInnerCategoryAppliedInputTypes.md)
- [CreateModerationResponseResultsInnerCategoryScores](docs/Model/CreateModerationResponseResultsInnerCategoryScores.md)
- [CreateRunRequest](docs/Model/CreateRunRequest.md)
- [CreateRunRequestModel](docs/Model/CreateRunRequestModel.md)
- [CreateSpeechRequest](docs/Model/CreateSpeechRequest.md)
- [CreateSpeechRequestModel](docs/Model/CreateSpeechRequestModel.md)
- [CreateThreadAndRunRequest](docs/Model/CreateThreadAndRunRequest.md)
- [CreateThreadAndRunRequestToolResources](docs/Model/CreateThreadAndRunRequestToolResources.md)
- [CreateThreadAndRunRequestToolsInner](docs/Model/CreateThreadAndRunRequestToolsInner.md)
- [CreateThreadRequest](docs/Model/CreateThreadRequest.md)
- [CreateThreadRequestToolResources](docs/Model/CreateThreadRequestToolResources.md)
- [CreateThreadRequestToolResourcesFileSearch](docs/Model/CreateThreadRequestToolResourcesFileSearch.md)
- [CreateThreadRequestToolResourcesFileSearchVectorStoresInner](docs/Model/CreateThreadRequestToolResourcesFileSearchVectorStoresInner.md)
- [CreateTranscription200Response](docs/Model/CreateTranscription200Response.md)
- [CreateTranscriptionRequestModel](docs/Model/CreateTranscriptionRequestModel.md)
- [CreateTranscriptionResponseJson](docs/Model/CreateTranscriptionResponseJson.md)
- [CreateTranscriptionResponseVerboseJson](docs/Model/CreateTranscriptionResponseVerboseJson.md)
- [CreateTranslation200Response](docs/Model/CreateTranslation200Response.md)
- [CreateTranslationResponseJson](docs/Model/CreateTranslationResponseJson.md)
- [CreateTranslationResponseVerboseJson](docs/Model/CreateTranslationResponseVerboseJson.md)
- [CreateUploadRequest](docs/Model/CreateUploadRequest.md)
- [CreateVectorStoreFileBatchRequest](docs/Model/CreateVectorStoreFileBatchRequest.md)
- [CreateVectorStoreFileRequest](docs/Model/CreateVectorStoreFileRequest.md)
- [CreateVectorStoreRequest](docs/Model/CreateVectorStoreRequest.md)
- [CreateVectorStoreRequestChunkingStrategy](docs/Model/CreateVectorStoreRequestChunkingStrategy.md)
- [DefaultProjectErrorResponse](docs/Model/DefaultProjectErrorResponse.md)
- [DeleteAssistantResponse](docs/Model/DeleteAssistantResponse.md)
- [DeleteFileResponse](docs/Model/DeleteFileResponse.md)
- [DeleteMessageResponse](docs/Model/DeleteMessageResponse.md)
- [DeleteModelResponse](docs/Model/DeleteModelResponse.md)
- [DeleteThreadResponse](docs/Model/DeleteThreadResponse.md)
- [DeleteVectorStoreFileResponse](docs/Model/DeleteVectorStoreFileResponse.md)
- [DeleteVectorStoreResponse](docs/Model/DeleteVectorStoreResponse.md)
- [DoneEvent](docs/Model/DoneEvent.md)
- [Embedding](docs/Model/Embedding.md)
- [Error](docs/Model/Error.md)
- [ErrorEvent](docs/Model/ErrorEvent.md)
- [ErrorResponse](docs/Model/ErrorResponse.md)
- [FileSearchRankingOptions](docs/Model/FileSearchRankingOptions.md)
- [FineTuneChatCompletionRequestAssistantMessage](docs/Model/FineTuneChatCompletionRequestAssistantMessage.md)
- [FineTuneChatRequestInput](docs/Model/FineTuneChatRequestInput.md)
- [FineTuneChatRequestInputMessagesInner](docs/Model/FineTuneChatRequestInputMessagesInner.md)
- [FineTuneCompletionRequestInput](docs/Model/FineTuneCompletionRequestInput.md)
- [FineTuneDPOMethod](docs/Model/FineTuneDPOMethod.md)
- [FineTuneDPOMethodHyperparameters](docs/Model/FineTuneDPOMethodHyperparameters.md)
- [FineTuneDPOMethodHyperparametersBatchSize](docs/Model/FineTuneDPOMethodHyperparametersBatchSize.md)
- [FineTuneDPOMethodHyperparametersBeta](docs/Model/FineTuneDPOMethodHyperparametersBeta.md)
- [FineTuneDPOMethodHyperparametersLearningRateMultiplier](docs/Model/FineTuneDPOMethodHyperparametersLearningRateMultiplier.md)
- [FineTuneDPOMethodHyperparametersNEpochs](docs/Model/FineTuneDPOMethodHyperparametersNEpochs.md)
- [FineTuneMethod](docs/Model/FineTuneMethod.md)
- [FineTunePreferenceRequestInput](docs/Model/FineTunePreferenceRequestInput.md)
- [FineTunePreferenceRequestInputInput](docs/Model/FineTunePreferenceRequestInputInput.md)
- [FineTunePreferenceRequestInputPreferredCompletionInner](docs/Model/FineTunePreferenceRequestInputPreferredCompletionInner.md)
- [FineTuneSupervisedMethod](docs/Model/FineTuneSupervisedMethod.md)
- [FineTuneSupervisedMethodHyperparameters](docs/Model/FineTuneSupervisedMethodHyperparameters.md)
- [FineTuningIntegration](docs/Model/FineTuningIntegration.md)
- [FineTuningJob](docs/Model/FineTuningJob.md)
- [FineTuningJobCheckpoint](docs/Model/FineTuningJobCheckpoint.md)
- [FineTuningJobCheckpointMetrics](docs/Model/FineTuningJobCheckpointMetrics.md)
- [FineTuningJobError](docs/Model/FineTuningJobError.md)
- [FineTuningJobEvent](docs/Model/FineTuningJobEvent.md)
- [FineTuningJobHyperparameters](docs/Model/FineTuningJobHyperparameters.md)
- [FineTuningJobIntegrationsInner](docs/Model/FineTuningJobIntegrationsInner.md)
- [FunctionObject](docs/Model/FunctionObject.md)
- [Image](docs/Model/Image.md)
- [ImagesResponse](docs/Model/ImagesResponse.md)
- [Invite](docs/Model/Invite.md)
- [InviteDeleteResponse](docs/Model/InviteDeleteResponse.md)
- [InviteListResponse](docs/Model/InviteListResponse.md)
- [InviteProjectsInner](docs/Model/InviteProjectsInner.md)
- [InviteRequest](docs/Model/InviteRequest.md)
- [InviteRequestProjectsInner](docs/Model/InviteRequestProjectsInner.md)
- [ListAssistantsResponse](docs/Model/ListAssistantsResponse.md)
- [ListAuditLogsEffectiveAtParameter](docs/Model/ListAuditLogsEffectiveAtParameter.md)
- [ListAuditLogsResponse](docs/Model/ListAuditLogsResponse.md)
- [ListBatchesResponse](docs/Model/ListBatchesResponse.md)
- [ListFilesResponse](docs/Model/ListFilesResponse.md)
- [ListFineTuningJobCheckpointsResponse](docs/Model/ListFineTuningJobCheckpointsResponse.md)
- [ListFineTuningJobEventsResponse](docs/Model/ListFineTuningJobEventsResponse.md)
- [ListMessagesResponse](docs/Model/ListMessagesResponse.md)
- [ListModelsResponse](docs/Model/ListModelsResponse.md)
- [ListPaginatedFineTuningJobsResponse](docs/Model/ListPaginatedFineTuningJobsResponse.md)
- [ListRunStepsResponse](docs/Model/ListRunStepsResponse.md)
- [ListRunsResponse](docs/Model/ListRunsResponse.md)
- [ListThreadsResponse](docs/Model/ListThreadsResponse.md)
- [ListVectorStoreFilesResponse](docs/Model/ListVectorStoreFilesResponse.md)
- [ListVectorStoresResponse](docs/Model/ListVectorStoresResponse.md)
- [MessageContentImageFileObject](docs/Model/MessageContentImageFileObject.md)
- [MessageContentImageFileObjectImageFile](docs/Model/MessageContentImageFileObjectImageFile.md)
- [MessageContentImageUrlObject](docs/Model/MessageContentImageUrlObject.md)
- [MessageContentImageUrlObjectImageUrl](docs/Model/MessageContentImageUrlObjectImageUrl.md)
- [MessageContentRefusalObject](docs/Model/MessageContentRefusalObject.md)
- [MessageContentTextAnnotationsFileCitationObject](docs/Model/MessageContentTextAnnotationsFileCitationObject.md)
- [MessageContentTextAnnotationsFileCitationObjectFileCitation](docs/Model/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
- [MessageContentTextAnnotationsFilePathObject](docs/Model/MessageContentTextAnnotationsFilePathObject.md)
- [MessageContentTextAnnotationsFilePathObjectFilePath](docs/Model/MessageContentTextAnnotationsFilePathObjectFilePath.md)
- [MessageContentTextObject](docs/Model/MessageContentTextObject.md)
- [MessageContentTextObjectText](docs/Model/MessageContentTextObjectText.md)
- [MessageContentTextObjectTextAnnotationsInner](docs/Model/MessageContentTextObjectTextAnnotationsInner.md)
- [MessageDeltaContentImageFileObject](docs/Model/MessageDeltaContentImageFileObject.md)
- [MessageDeltaContentImageFileObjectImageFile](docs/Model/MessageDeltaContentImageFileObjectImageFile.md)
- [MessageDeltaContentImageUrlObject](docs/Model/MessageDeltaContentImageUrlObject.md)
- [MessageDeltaContentImageUrlObjectImageUrl](docs/Model/MessageDeltaContentImageUrlObjectImageUrl.md)
- [MessageDeltaContentRefusalObject](docs/Model/MessageDeltaContentRefusalObject.md)
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
- [MessageObject](docs/Model/MessageObject.md)
- [MessageObjectContentInner](docs/Model/MessageObjectContentInner.md)
- [MessageObjectIncompleteDetails](docs/Model/MessageObjectIncompleteDetails.md)
- [MessageRequestContentTextObject](docs/Model/MessageRequestContentTextObject.md)
- [MessageStreamEvent](docs/Model/MessageStreamEvent.md)
- [MessageStreamEventOneOf](docs/Model/MessageStreamEventOneOf.md)
- [MessageStreamEventOneOf1](docs/Model/MessageStreamEventOneOf1.md)
- [MessageStreamEventOneOf2](docs/Model/MessageStreamEventOneOf2.md)
- [MessageStreamEventOneOf3](docs/Model/MessageStreamEventOneOf3.md)
- [MessageStreamEventOneOf4](docs/Model/MessageStreamEventOneOf4.md)
- [Model](docs/Model/Model.md)
- [ModifyAssistantRequest](docs/Model/ModifyAssistantRequest.md)
- [ModifyAssistantRequestToolResources](docs/Model/ModifyAssistantRequestToolResources.md)
- [ModifyAssistantRequestToolResourcesCodeInterpreter](docs/Model/ModifyAssistantRequestToolResourcesCodeInterpreter.md)
- [ModifyAssistantRequestToolResourcesFileSearch](docs/Model/ModifyAssistantRequestToolResourcesFileSearch.md)
- [ModifyMessageRequest](docs/Model/ModifyMessageRequest.md)
- [ModifyRunRequest](docs/Model/ModifyRunRequest.md)
- [ModifyThreadRequest](docs/Model/ModifyThreadRequest.md)
- [ModifyThreadRequestToolResources](docs/Model/ModifyThreadRequestToolResources.md)
- [ModifyThreadRequestToolResourcesFileSearch](docs/Model/ModifyThreadRequestToolResourcesFileSearch.md)
- [OpenAIFile](docs/Model/OpenAIFile.md)
- [OtherChunkingStrategyResponseParam](docs/Model/OtherChunkingStrategyResponseParam.md)
- [PredictionContent](docs/Model/PredictionContent.md)
- [PredictionContentContent](docs/Model/PredictionContentContent.md)
- [Project](docs/Model/Project.md)
- [ProjectApiKey](docs/Model/ProjectApiKey.md)
- [ProjectApiKeyDeleteResponse](docs/Model/ProjectApiKeyDeleteResponse.md)
- [ProjectApiKeyListResponse](docs/Model/ProjectApiKeyListResponse.md)
- [ProjectApiKeyOwner](docs/Model/ProjectApiKeyOwner.md)
- [ProjectCreateRequest](docs/Model/ProjectCreateRequest.md)
- [ProjectListResponse](docs/Model/ProjectListResponse.md)
- [ProjectRateLimit](docs/Model/ProjectRateLimit.md)
- [ProjectRateLimitListResponse](docs/Model/ProjectRateLimitListResponse.md)
- [ProjectRateLimitUpdateRequest](docs/Model/ProjectRateLimitUpdateRequest.md)
- [ProjectServiceAccount](docs/Model/ProjectServiceAccount.md)
- [ProjectServiceAccountApiKey](docs/Model/ProjectServiceAccountApiKey.md)
- [ProjectServiceAccountCreateRequest](docs/Model/ProjectServiceAccountCreateRequest.md)
- [ProjectServiceAccountCreateResponse](docs/Model/ProjectServiceAccountCreateResponse.md)
- [ProjectServiceAccountDeleteResponse](docs/Model/ProjectServiceAccountDeleteResponse.md)
- [ProjectServiceAccountListResponse](docs/Model/ProjectServiceAccountListResponse.md)
- [ProjectUpdateRequest](docs/Model/ProjectUpdateRequest.md)
- [ProjectUser](docs/Model/ProjectUser.md)
- [ProjectUserCreateRequest](docs/Model/ProjectUserCreateRequest.md)
- [ProjectUserDeleteResponse](docs/Model/ProjectUserDeleteResponse.md)
- [ProjectUserListResponse](docs/Model/ProjectUserListResponse.md)
- [ProjectUserUpdateRequest](docs/Model/ProjectUserUpdateRequest.md)
- [RealtimeClientEventConversationItemCreate](docs/Model/RealtimeClientEventConversationItemCreate.md)
- [RealtimeClientEventConversationItemDelete](docs/Model/RealtimeClientEventConversationItemDelete.md)
- [RealtimeClientEventConversationItemTruncate](docs/Model/RealtimeClientEventConversationItemTruncate.md)
- [RealtimeClientEventInputAudioBufferAppend](docs/Model/RealtimeClientEventInputAudioBufferAppend.md)
- [RealtimeClientEventInputAudioBufferClear](docs/Model/RealtimeClientEventInputAudioBufferClear.md)
- [RealtimeClientEventInputAudioBufferCommit](docs/Model/RealtimeClientEventInputAudioBufferCommit.md)
- [RealtimeClientEventResponseCancel](docs/Model/RealtimeClientEventResponseCancel.md)
- [RealtimeClientEventResponseCreate](docs/Model/RealtimeClientEventResponseCreate.md)
- [RealtimeClientEventSessionUpdate](docs/Model/RealtimeClientEventSessionUpdate.md)
- [RealtimeConversationItem](docs/Model/RealtimeConversationItem.md)
- [RealtimeConversationItemContentInner](docs/Model/RealtimeConversationItemContentInner.md)
- [RealtimeResponse](docs/Model/RealtimeResponse.md)
- [RealtimeResponseCreateParams](docs/Model/RealtimeResponseCreateParams.md)
- [RealtimeResponseCreateParamsConversation](docs/Model/RealtimeResponseCreateParamsConversation.md)
- [RealtimeResponseCreateParamsMaxResponseOutputTokens](docs/Model/RealtimeResponseCreateParamsMaxResponseOutputTokens.md)
- [RealtimeResponseCreateParamsToolsInner](docs/Model/RealtimeResponseCreateParamsToolsInner.md)
- [RealtimeResponseStatusDetails](docs/Model/RealtimeResponseStatusDetails.md)
- [RealtimeResponseStatusDetailsError](docs/Model/RealtimeResponseStatusDetailsError.md)
- [RealtimeResponseUsage](docs/Model/RealtimeResponseUsage.md)
- [RealtimeResponseUsageInputTokenDetails](docs/Model/RealtimeResponseUsageInputTokenDetails.md)
- [RealtimeResponseUsageOutputTokenDetails](docs/Model/RealtimeResponseUsageOutputTokenDetails.md)
- [RealtimeServerEventConversationCreated](docs/Model/RealtimeServerEventConversationCreated.md)
- [RealtimeServerEventConversationCreatedConversation](docs/Model/RealtimeServerEventConversationCreatedConversation.md)
- [RealtimeServerEventConversationItemCreated](docs/Model/RealtimeServerEventConversationItemCreated.md)
- [RealtimeServerEventConversationItemDeleted](docs/Model/RealtimeServerEventConversationItemDeleted.md)
- [RealtimeServerEventConversationItemInputAudioTranscriptionCompleted](docs/Model/RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.md)
- [RealtimeServerEventConversationItemInputAudioTranscriptionFailed](docs/Model/RealtimeServerEventConversationItemInputAudioTranscriptionFailed.md)
- [RealtimeServerEventConversationItemInputAudioTranscriptionFailedError](docs/Model/RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md)
- [RealtimeServerEventConversationItemTruncated](docs/Model/RealtimeServerEventConversationItemTruncated.md)
- [RealtimeServerEventError](docs/Model/RealtimeServerEventError.md)
- [RealtimeServerEventErrorError](docs/Model/RealtimeServerEventErrorError.md)
- [RealtimeServerEventInputAudioBufferCleared](docs/Model/RealtimeServerEventInputAudioBufferCleared.md)
- [RealtimeServerEventInputAudioBufferCommitted](docs/Model/RealtimeServerEventInputAudioBufferCommitted.md)
- [RealtimeServerEventInputAudioBufferSpeechStarted](docs/Model/RealtimeServerEventInputAudioBufferSpeechStarted.md)
- [RealtimeServerEventInputAudioBufferSpeechStopped](docs/Model/RealtimeServerEventInputAudioBufferSpeechStopped.md)
- [RealtimeServerEventRateLimitsUpdated](docs/Model/RealtimeServerEventRateLimitsUpdated.md)
- [RealtimeServerEventRateLimitsUpdatedRateLimitsInner](docs/Model/RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md)
- [RealtimeServerEventResponseAudioDelta](docs/Model/RealtimeServerEventResponseAudioDelta.md)
- [RealtimeServerEventResponseAudioDone](docs/Model/RealtimeServerEventResponseAudioDone.md)
- [RealtimeServerEventResponseAudioTranscriptDelta](docs/Model/RealtimeServerEventResponseAudioTranscriptDelta.md)
- [RealtimeServerEventResponseAudioTranscriptDone](docs/Model/RealtimeServerEventResponseAudioTranscriptDone.md)
- [RealtimeServerEventResponseContentPartAdded](docs/Model/RealtimeServerEventResponseContentPartAdded.md)
- [RealtimeServerEventResponseContentPartAddedPart](docs/Model/RealtimeServerEventResponseContentPartAddedPart.md)
- [RealtimeServerEventResponseContentPartDone](docs/Model/RealtimeServerEventResponseContentPartDone.md)
- [RealtimeServerEventResponseContentPartDonePart](docs/Model/RealtimeServerEventResponseContentPartDonePart.md)
- [RealtimeServerEventResponseCreated](docs/Model/RealtimeServerEventResponseCreated.md)
- [RealtimeServerEventResponseDone](docs/Model/RealtimeServerEventResponseDone.md)
- [RealtimeServerEventResponseFunctionCallArgumentsDelta](docs/Model/RealtimeServerEventResponseFunctionCallArgumentsDelta.md)
- [RealtimeServerEventResponseFunctionCallArgumentsDone](docs/Model/RealtimeServerEventResponseFunctionCallArgumentsDone.md)
- [RealtimeServerEventResponseOutputItemAdded](docs/Model/RealtimeServerEventResponseOutputItemAdded.md)
- [RealtimeServerEventResponseOutputItemDone](docs/Model/RealtimeServerEventResponseOutputItemDone.md)
- [RealtimeServerEventResponseTextDelta](docs/Model/RealtimeServerEventResponseTextDelta.md)
- [RealtimeServerEventResponseTextDone](docs/Model/RealtimeServerEventResponseTextDone.md)
- [RealtimeServerEventSessionCreated](docs/Model/RealtimeServerEventSessionCreated.md)
- [RealtimeServerEventSessionUpdated](docs/Model/RealtimeServerEventSessionUpdated.md)
- [RealtimeSession](docs/Model/RealtimeSession.md)
- [RealtimeSessionCreateRequest](docs/Model/RealtimeSessionCreateRequest.md)
- [RealtimeSessionCreateRequestTurnDetection](docs/Model/RealtimeSessionCreateRequestTurnDetection.md)
- [RealtimeSessionCreateResponse](docs/Model/RealtimeSessionCreateResponse.md)
- [RealtimeSessionCreateResponseClientSecret](docs/Model/RealtimeSessionCreateResponseClientSecret.md)
- [RealtimeSessionCreateResponseTurnDetection](docs/Model/RealtimeSessionCreateResponseTurnDetection.md)
- [RealtimeSessionInputAudioTranscription](docs/Model/RealtimeSessionInputAudioTranscription.md)
- [RealtimeSessionModel](docs/Model/RealtimeSessionModel.md)
- [RealtimeSessionTurnDetection](docs/Model/RealtimeSessionTurnDetection.md)
- [ResponseFormatJsonObject](docs/Model/ResponseFormatJsonObject.md)
- [ResponseFormatJsonSchema](docs/Model/ResponseFormatJsonSchema.md)
- [ResponseFormatJsonSchemaJsonSchema](docs/Model/ResponseFormatJsonSchemaJsonSchema.md)
- [ResponseFormatText](docs/Model/ResponseFormatText.md)
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
- [RunStepDeltaStepDetailsToolCallsFileSearchObject](docs/Model/RunStepDeltaStepDetailsToolCallsFileSearchObject.md)
- [RunStepDeltaStepDetailsToolCallsFunctionObject](docs/Model/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
- [RunStepDeltaStepDetailsToolCallsFunctionObjectFunction](docs/Model/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md)
- [RunStepDeltaStepDetailsToolCallsObject](docs/Model/RunStepDeltaStepDetailsToolCallsObject.md)
- [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner](docs/Model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)
- [RunStepDetailsMessageCreationObject](docs/Model/RunStepDetailsMessageCreationObject.md)
- [RunStepDetailsMessageCreationObjectMessageCreation](docs/Model/RunStepDetailsMessageCreationObjectMessageCreation.md)
- [RunStepDetailsToolCallsCodeObject](docs/Model/RunStepDetailsToolCallsCodeObject.md)
- [RunStepDetailsToolCallsCodeObjectCodeInterpreter](docs/Model/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
- [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/Model/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
- [RunStepDetailsToolCallsCodeOutputImageObject](docs/Model/RunStepDetailsToolCallsCodeOutputImageObject.md)
- [RunStepDetailsToolCallsCodeOutputImageObjectImage](docs/Model/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
- [RunStepDetailsToolCallsCodeOutputLogsObject](docs/Model/RunStepDetailsToolCallsCodeOutputLogsObject.md)
- [RunStepDetailsToolCallsFileSearchObject](docs/Model/RunStepDetailsToolCallsFileSearchObject.md)
- [RunStepDetailsToolCallsFileSearchObjectFileSearch](docs/Model/RunStepDetailsToolCallsFileSearchObjectFileSearch.md)
- [RunStepDetailsToolCallsFileSearchRankingOptionsObject](docs/Model/RunStepDetailsToolCallsFileSearchRankingOptionsObject.md)
- [RunStepDetailsToolCallsFileSearchResultObject](docs/Model/RunStepDetailsToolCallsFileSearchResultObject.md)
- [RunStepDetailsToolCallsFileSearchResultObjectContentInner](docs/Model/RunStepDetailsToolCallsFileSearchResultObjectContentInner.md)
- [RunStepDetailsToolCallsFunctionObject](docs/Model/RunStepDetailsToolCallsFunctionObject.md)
- [RunStepDetailsToolCallsFunctionObjectFunction](docs/Model/RunStepDetailsToolCallsFunctionObjectFunction.md)
- [RunStepDetailsToolCallsObject](docs/Model/RunStepDetailsToolCallsObject.md)
- [RunStepDetailsToolCallsObjectToolCallsInner](docs/Model/RunStepDetailsToolCallsObjectToolCallsInner.md)
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
- [RunStreamEventOneOf9](docs/Model/RunStreamEventOneOf9.md)
- [RunToolCallObject](docs/Model/RunToolCallObject.md)
- [RunToolCallObjectFunction](docs/Model/RunToolCallObjectFunction.md)
- [StaticChunkingStrategy](docs/Model/StaticChunkingStrategy.md)
- [StaticChunkingStrategyRequestParam](docs/Model/StaticChunkingStrategyRequestParam.md)
- [StaticChunkingStrategyResponseParam](docs/Model/StaticChunkingStrategyResponseParam.md)
- [StaticChunkingStrategyStatic](docs/Model/StaticChunkingStrategyStatic.md)
- [SubmitToolOutputsRunRequest](docs/Model/SubmitToolOutputsRunRequest.md)
- [SubmitToolOutputsRunRequestToolOutputsInner](docs/Model/SubmitToolOutputsRunRequestToolOutputsInner.md)
- [ThreadObject](docs/Model/ThreadObject.md)
- [ThreadStreamEvent](docs/Model/ThreadStreamEvent.md)
- [TranscriptionSegment](docs/Model/TranscriptionSegment.md)
- [TranscriptionWord](docs/Model/TranscriptionWord.md)
- [TruncationObject](docs/Model/TruncationObject.md)
- [UpdateVectorStoreRequest](docs/Model/UpdateVectorStoreRequest.md)
- [Upload](docs/Model/Upload.md)
- [UploadPart](docs/Model/UploadPart.md)
- [UsageAudioSpeechesResult](docs/Model/UsageAudioSpeechesResult.md)
- [UsageAudioTranscriptionsResult](docs/Model/UsageAudioTranscriptionsResult.md)
- [UsageCodeInterpreterSessionsResult](docs/Model/UsageCodeInterpreterSessionsResult.md)
- [UsageCompletionsResult](docs/Model/UsageCompletionsResult.md)
- [UsageEmbeddingsResult](docs/Model/UsageEmbeddingsResult.md)
- [UsageImagesResult](docs/Model/UsageImagesResult.md)
- [UsageModerationsResult](docs/Model/UsageModerationsResult.md)
- [UsageResponse](docs/Model/UsageResponse.md)
- [UsageTimeBucket](docs/Model/UsageTimeBucket.md)
- [UsageTimeBucketResultInner](docs/Model/UsageTimeBucketResultInner.md)
- [UsageVectorStoresResult](docs/Model/UsageVectorStoresResult.md)
- [User](docs/Model/User.md)
- [UserDeleteResponse](docs/Model/UserDeleteResponse.md)
- [UserListResponse](docs/Model/UserListResponse.md)
- [UserRoleUpdateRequest](docs/Model/UserRoleUpdateRequest.md)
- [VectorStoreExpirationAfter](docs/Model/VectorStoreExpirationAfter.md)
- [VectorStoreFileBatchObject](docs/Model/VectorStoreFileBatchObject.md)
- [VectorStoreFileBatchObjectFileCounts](docs/Model/VectorStoreFileBatchObjectFileCounts.md)
- [VectorStoreFileObject](docs/Model/VectorStoreFileObject.md)
- [VectorStoreFileObjectChunkingStrategy](docs/Model/VectorStoreFileObjectChunkingStrategy.md)
- [VectorStoreFileObjectLastError](docs/Model/VectorStoreFileObjectLastError.md)
- [VectorStoreObject](docs/Model/VectorStoreObject.md)
- [VectorStoreObjectFileCounts](docs/Model/VectorStoreObjectFileCounts.md)

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

- API version: `2.3.0`
    - Generator version: `7.18.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
