# OpenAI API Bash client

## Overview

This is a Bash client script for accessing OpenAI API service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Make POST request with form data
$  --host <hostname> <operationId> key1:=value1 key2:=value2 key3:=23

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to */v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssistantsApi* | [**cancelRun**](docs/AssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#39;in_progress&#39;.
*AssistantsApi* | [**createAssistant**](docs/AssistantsApi.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions.
*AssistantsApi* | [**createMessage**](docs/AssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.
*AssistantsApi* | [**createRun**](docs/AssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run.
*AssistantsApi* | [**createThread**](docs/AssistantsApi.md#createthread) | **POST** /threads | Create a thread.
*AssistantsApi* | [**createThreadAndRun**](docs/AssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.
*AssistantsApi* | [**deleteAssistant**](docs/AssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AssistantsApi* | [**deleteMessage**](docs/AssistantsApi.md#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
*AssistantsApi* | [**deleteThread**](docs/AssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.
*AssistantsApi* | [**getAssistant**](docs/AssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AssistantsApi* | [**getMessage**](docs/AssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AssistantsApi* | [**getRun**](docs/AssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AssistantsApi* | [**getRunStep**](docs/AssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AssistantsApi* | [**getThread**](docs/AssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.
*AssistantsApi* | [**listAssistants**](docs/AssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants.
*AssistantsApi* | [**listMessages**](docs/AssistantsApi.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
*AssistantsApi* | [**listRunSteps**](docs/AssistantsApi.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
*AssistantsApi* | [**listRuns**](docs/AssistantsApi.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
*AssistantsApi* | [**modifyAssistant**](docs/AssistantsApi.md#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
*AssistantsApi* | [**modifyMessage**](docs/AssistantsApi.md#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
*AssistantsApi* | [**modifyRun**](docs/AssistantsApi.md#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
*AssistantsApi* | [**modifyThread**](docs/AssistantsApi.md#modifythread) | **POST** /threads/{thread_id} | Modifies a thread.
*AssistantsApi* | [**submitToolOuputsToRun**](docs/AssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#39;status: \&quot;requires_action\&quot;&#39; and &#39;required_action.type&#39; is &#39;submit_tool_outputs&#39;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.
*AudioApi* | [**createSpeech**](docs/AudioApi.md#createspeech) | **POST** /audio/speech | Generates audio from the input text.
*AudioApi* | [**createTranscription**](docs/AudioApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AudioApi* | [**createTranslation**](docs/AudioApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
*AuditLogsApi* | [**listAuditLogs**](docs/AuditLogsApi.md#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.
*BatchApi* | [**cancelBatch**](docs/BatchApi.md#cancelbatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#39;cancelling&#39; for up to 10 minutes, before changing to &#39;cancelled&#39;, where it will have partial results (if any) available in the output file.
*BatchApi* | [**createBatch**](docs/BatchApi.md#createbatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
*BatchApi* | [**listBatches**](docs/BatchApi.md#listbatches) | **GET** /batches | List your organization&#39;s batches.
*BatchApi* | [**retrieveBatch**](docs/BatchApi.md#retrievebatch) | **GET** /batches/{batch_id} | Retrieves a batch.
*ChatApi* | [**createChatCompletion**](docs/ChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the
[text generation](/docs/guides/text-generation), [vision](/docs/guides/vision),
and [audio](/docs/guides/audio) guides.

Parameter support can differ depending on the model used to generate the
response, particularly for newer reasoning models. Parameters that are only
supported for reasoning models are noted below. For the current state of 
unsupported parameters in reasoning models, 
[refer to the reasoning guide](/docs/guides/reasoning).
*CompletionsApi* | [**createCompletion**](docs/CompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*DefaultApi* | [**adminApiKeysCreate**](docs/DefaultApi.md#adminapikeyscreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
*DefaultApi* | [**adminApiKeysDelete**](docs/DefaultApi.md#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
*DefaultApi* | [**adminApiKeysGet**](docs/DefaultApi.md#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
*DefaultApi* | [**adminApiKeysList**](docs/DefaultApi.md#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys
*EmbeddingsApi* | [**createEmbedding**](docs/EmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*FilesApi* | [**createFile**](docs/FilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.

The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.

The Fine-tuning API only supports &#39;.jsonl&#39; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.

The Batch API only supports &#39;.jsonl&#39; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).

Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*FilesApi* | [**listFiles**](docs/FilesApi.md#listfiles) | **GET** /files | Returns a list of files.
*FilesApi* | [**retrieveFile**](docs/FilesApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*FineTuningApi* | [**cancelFineTuningJob**](docs/FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.
*FineTuningApi* | [**createFineTuningJob**](docs/FineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about fine-tuning](/docs/guides/fine-tuning)
*FineTuningApi* | [**listFineTuningEvents**](docs/FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.
*FineTuningApi* | [**listFineTuningJobCheckpoints**](docs/FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.
*FineTuningApi* | [**listPaginatedFineTuningJobs**](docs/FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs
*FineTuningApi* | [**retrieveFineTuningJob**](docs/FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.

[Learn more about fine-tuning](/docs/guides/fine-tuning)
*ImagesApi* | [**createImage**](docs/ImagesApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*ImagesApi* | [**createImageEdit**](docs/ImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*ImagesApi* | [**createImageVariation**](docs/ImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*InvitesApi* | [**deleteInvite**](docs/InvitesApi.md#deleteinvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
*InvitesApi* | [**inviteUser**](docs/InvitesApi.md#inviteuser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
*InvitesApi* | [**listInvites**](docs/InvitesApi.md#listinvites) | **GET** /organization/invites | Returns a list of invites in the organization.
*InvitesApi* | [**retrieveInvite**](docs/InvitesApi.md#retrieveinvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.
*ModelsApi* | [**deleteModel**](docs/ModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*ModelsApi* | [**listModels**](docs/ModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*ModelsApi* | [**retrieveModel**](docs/ModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*ModerationsApi* | [**createModeration**](docs/ModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn
more in the [moderation guide](/docs/guides/moderation).
*ProjectsApi* | [**archiveProject**](docs/ProjectsApi.md#archiveproject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createproject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
*ProjectsApi* | [**createProjectServiceAccount**](docs/ProjectsApi.md#createprojectserviceaccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
*ProjectsApi* | [**createProjectUser**](docs/ProjectsApi.md#createprojectuser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
*ProjectsApi* | [**deleteProjectApiKey**](docs/ProjectsApi.md#deleteprojectapikey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
*ProjectsApi* | [**deleteProjectServiceAccount**](docs/ProjectsApi.md#deleteprojectserviceaccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
*ProjectsApi* | [**deleteProjectUser**](docs/ProjectsApi.md#deleteprojectuser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
*ProjectsApi* | [**listProjectApiKeys**](docs/ProjectsApi.md#listprojectapikeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
*ProjectsApi* | [**listProjectRateLimits**](docs/ProjectsApi.md#listprojectratelimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
*ProjectsApi* | [**listProjectServiceAccounts**](docs/ProjectsApi.md#listprojectserviceaccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
*ProjectsApi* | [**listProjectUsers**](docs/ProjectsApi.md#listprojectusers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
*ProjectsApi* | [**listProjects**](docs/ProjectsApi.md#listprojects) | **GET** /organization/projects | Returns a list of projects.
*ProjectsApi* | [**modifyProject**](docs/ProjectsApi.md#modifyproject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
*ProjectsApi* | [**modifyProjectUser**](docs/ProjectsApi.md#modifyprojectuser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
*ProjectsApi* | [**retrieveProject**](docs/ProjectsApi.md#retrieveproject) | **GET** /organization/projects/{project_id} | Retrieves a project.
*ProjectsApi* | [**retrieveProjectApiKey**](docs/ProjectsApi.md#retrieveprojectapikey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
*ProjectsApi* | [**retrieveProjectServiceAccount**](docs/ProjectsApi.md#retrieveprojectserviceaccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
*ProjectsApi* | [**retrieveProjectUser**](docs/ProjectsApi.md#retrieveprojectuser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
*ProjectsApi* | [**updateProjectRateLimits**](docs/ProjectsApi.md#updateprojectratelimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.
*RealtimeApi* | [**createRealtimeSession**](docs/RealtimeApi.md#createrealtimesession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the
Realtime API. Can be configured with the same session parameters as the
&#39;session.update&#39; client event.

It responds with a session object, plus a &#39;client_secret&#39; key which contains
a usable ephemeral API token that can be used to authenticate browser clients
for the Realtime API.
*UploadsApi* | [**addUploadPart**](docs/UploadsApi.md#adduploadpart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload. 

Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.

It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).
*UploadsApi* | [**cancelUpload**](docs/UploadsApi.md#cancelupload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.
*UploadsApi* | [**completeUpload**](docs/UploadsApi.md#completeupload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object). 

Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.

You can specify the order of the Parts by passing in an ordered list of the Part IDs.

The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
*UploadsApi* | [**createUpload**](docs/UploadsApi.md#createupload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.

Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.

For certain &#39;purpose&#39;s, the correct &#39;mime_type&#39; must be specified. Please refer to documentation for the supported MIME types for your use case:
- [Assistants](/docs/assistants/tools/file-search#supported-files)

For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).
*UsageApi* | [**usageAudioSpeeches**](docs/UsageApi.md#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
*UsageApi* | [**usageAudioTranscriptions**](docs/UsageApi.md#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
*UsageApi* | [**usageCodeInterpreterSessions**](docs/UsageApi.md#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
*UsageApi* | [**usageCompletions**](docs/UsageApi.md#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
*UsageApi* | [**usageCosts**](docs/UsageApi.md#usagecosts) | **GET** /organization/costs | Get costs details for the organization.
*UsageApi* | [**usageEmbeddings**](docs/UsageApi.md#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
*UsageApi* | [**usageImages**](docs/UsageApi.md#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization.
*UsageApi* | [**usageModerations**](docs/UsageApi.md#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
*UsageApi* | [**usageVectorStores**](docs/UsageApi.md#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteuser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
*UsersApi* | [**listUsers**](docs/UsersApi.md#listusers) | **GET** /organization/users | Lists all of the users in the organization.
*UsersApi* | [**modifyUser**](docs/UsersApi.md#modifyuser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
*UsersApi* | [**retrieveUser**](docs/UsersApi.md#retrieveuser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.
*VectorStoresApi* | [**cancelVectorStoreFileBatch**](docs/VectorStoresApi.md#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
*VectorStoresApi* | [**createVectorStore**](docs/VectorStoresApi.md#createvectorstore) | **POST** /vector_stores | Create a vector store.
*VectorStoresApi* | [**createVectorStoreFile**](docs/VectorStoresApi.md#createvectorstorefile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
*VectorStoresApi* | [**createVectorStoreFileBatch**](docs/VectorStoresApi.md#createvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
*VectorStoresApi* | [**deleteVectorStore**](docs/VectorStoresApi.md#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
*VectorStoresApi* | [**deleteVectorStoreFile**](docs/VectorStoresApi.md#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
*VectorStoresApi* | [**getVectorStore**](docs/VectorStoresApi.md#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
*VectorStoresApi* | [**getVectorStoreFile**](docs/VectorStoresApi.md#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
*VectorStoresApi* | [**getVectorStoreFileBatch**](docs/VectorStoresApi.md#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
*VectorStoresApi* | [**listFilesInVectorStoreBatch**](docs/VectorStoresApi.md#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
*VectorStoresApi* | [**listVectorStoreFiles**](docs/VectorStoresApi.md#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
*VectorStoresApi* | [**listVectorStores**](docs/VectorStoresApi.md#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores.
*VectorStoresApi* | [**modifyVectorStore**](docs/VectorStoresApi.md#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


## Documentation For Models

 - [AdminApiKey](docs/AdminApiKey.md)
 - [AdminApiKeyOwner](docs/AdminApiKeyOwner.md)
 - [AdminApiKeysCreateRequest](docs/AdminApiKeysCreateRequest.md)
 - [AdminApiKeysDelete200Response](docs/AdminApiKeysDelete200Response.md)
 - [ApiKeyList](docs/ApiKeyList.md)
 - [ArrayOfContentPartsInner](docs/ArrayOfContentPartsInner.md)
 - [AssistantObject](docs/AssistantObject.md)
 - [AssistantObjectToolResources](docs/AssistantObjectToolResources.md)
 - [AssistantObjectToolResourcesCodeInterpreter](docs/AssistantObjectToolResourcesCodeInterpreter.md)
 - [AssistantObjectToolResourcesFileSearch](docs/AssistantObjectToolResourcesFileSearch.md)
 - [AssistantObjectToolsInner](docs/AssistantObjectToolsInner.md)
 - [AssistantStreamEvent](docs/AssistantStreamEvent.md)
 - [AssistantToolsCode](docs/AssistantToolsCode.md)
 - [AssistantToolsFileSearch](docs/AssistantToolsFileSearch.md)
 - [AssistantToolsFileSearchFileSearch](docs/AssistantToolsFileSearchFileSearch.md)
 - [AssistantToolsFileSearchTypeOnly](docs/AssistantToolsFileSearchTypeOnly.md)
 - [AssistantToolsFunction](docs/AssistantToolsFunction.md)
 - [AssistantsApiResponseFormatOption](docs/AssistantsApiResponseFormatOption.md)
 - [AssistantsApiToolChoiceOption](docs/AssistantsApiToolChoiceOption.md)
 - [AssistantsNamedToolChoice](docs/AssistantsNamedToolChoice.md)
 - [AssistantsNamedToolChoiceFunction](docs/AssistantsNamedToolChoiceFunction.md)
 - [AudioResponseFormat](docs/AudioResponseFormat.md)
 - [AuditLog](docs/AuditLog.md)
 - [AuditLogActor](docs/AuditLogActor.md)
 - [AuditLogActorApiKey](docs/AuditLogActorApiKey.md)
 - [AuditLogActorServiceAccount](docs/AuditLogActorServiceAccount.md)
 - [AuditLogActorSession](docs/AuditLogActorSession.md)
 - [AuditLogActorUser](docs/AuditLogActorUser.md)
 - [AuditLogApiKeyCreated](docs/AuditLogApiKeyCreated.md)
 - [AuditLogApiKeyCreatedData](docs/AuditLogApiKeyCreatedData.md)
 - [AuditLogApiKeyDeleted](docs/AuditLogApiKeyDeleted.md)
 - [AuditLogApiKeyUpdated](docs/AuditLogApiKeyUpdated.md)
 - [AuditLogApiKeyUpdatedChangesRequested](docs/AuditLogApiKeyUpdatedChangesRequested.md)
 - [AuditLogEventType](docs/AuditLogEventType.md)
 - [AuditLogInviteAccepted](docs/AuditLogInviteAccepted.md)
 - [AuditLogInviteSent](docs/AuditLogInviteSent.md)
 - [AuditLogInviteSentData](docs/AuditLogInviteSentData.md)
 - [AuditLogLoginFailed](docs/AuditLogLoginFailed.md)
 - [AuditLogOrganizationUpdated](docs/AuditLogOrganizationUpdated.md)
 - [AuditLogOrganizationUpdatedChangesRequested](docs/AuditLogOrganizationUpdatedChangesRequested.md)
 - [AuditLogOrganizationUpdatedChangesRequestedSettings](docs/AuditLogOrganizationUpdatedChangesRequestedSettings.md)
 - [AuditLogProject](docs/AuditLogProject.md)
 - [AuditLogProjectArchived](docs/AuditLogProjectArchived.md)
 - [AuditLogProjectCreated](docs/AuditLogProjectCreated.md)
 - [AuditLogProjectCreatedData](docs/AuditLogProjectCreatedData.md)
 - [AuditLogProjectUpdated](docs/AuditLogProjectUpdated.md)
 - [AuditLogProjectUpdatedChangesRequested](docs/AuditLogProjectUpdatedChangesRequested.md)
 - [AuditLogRateLimitDeleted](docs/AuditLogRateLimitDeleted.md)
 - [AuditLogRateLimitUpdated](docs/AuditLogRateLimitUpdated.md)
 - [AuditLogRateLimitUpdatedChangesRequested](docs/AuditLogRateLimitUpdatedChangesRequested.md)
 - [AuditLogServiceAccountCreated](docs/AuditLogServiceAccountCreated.md)
 - [AuditLogServiceAccountCreatedData](docs/AuditLogServiceAccountCreatedData.md)
 - [AuditLogServiceAccountDeleted](docs/AuditLogServiceAccountDeleted.md)
 - [AuditLogServiceAccountUpdated](docs/AuditLogServiceAccountUpdated.md)
 - [AuditLogServiceAccountUpdatedChangesRequested](docs/AuditLogServiceAccountUpdatedChangesRequested.md)
 - [AuditLogUserAdded](docs/AuditLogUserAdded.md)
 - [AuditLogUserAddedData](docs/AuditLogUserAddedData.md)
 - [AuditLogUserDeleted](docs/AuditLogUserDeleted.md)
 - [AuditLogUserUpdated](docs/AuditLogUserUpdated.md)
 - [AuditLogUserUpdatedChangesRequested](docs/AuditLogUserUpdatedChangesRequested.md)
 - [AutoChunkingStrategy](docs/AutoChunkingStrategy.md)
 - [AutoChunkingStrategyRequestParam](docs/AutoChunkingStrategyRequestParam.md)
 - [Batch](docs/Batch.md)
 - [BatchErrors](docs/BatchErrors.md)
 - [BatchErrorsDataInner](docs/BatchErrorsDataInner.md)
 - [BatchRequestCounts](docs/BatchRequestCounts.md)
 - [BatchRequestInput](docs/BatchRequestInput.md)
 - [BatchRequestOutput](docs/BatchRequestOutput.md)
 - [BatchRequestOutputError](docs/BatchRequestOutputError.md)
 - [BatchRequestOutputResponse](docs/BatchRequestOutputResponse.md)
 - [ChatCompletionFunctionCallOption](docs/ChatCompletionFunctionCallOption.md)
 - [ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [ChatCompletionMessageToolCall](docs/ChatCompletionMessageToolCall.md)
 - [ChatCompletionMessageToolCallChunk](docs/ChatCompletionMessageToolCallChunk.md)
 - [ChatCompletionMessageToolCallChunkFunction](docs/ChatCompletionMessageToolCallChunkFunction.md)
 - [ChatCompletionMessageToolCallFunction](docs/ChatCompletionMessageToolCallFunction.md)
 - [ChatCompletionNamedToolChoice](docs/ChatCompletionNamedToolChoice.md)
 - [ChatCompletionRequestAssistantMessage](docs/ChatCompletionRequestAssistantMessage.md)
 - [ChatCompletionRequestAssistantMessageAudio](docs/ChatCompletionRequestAssistantMessageAudio.md)
 - [ChatCompletionRequestAssistantMessageContent](docs/ChatCompletionRequestAssistantMessageContent.md)
 - [ChatCompletionRequestAssistantMessageContentPart](docs/ChatCompletionRequestAssistantMessageContentPart.md)
 - [ChatCompletionRequestAssistantMessageFunctionCall](docs/ChatCompletionRequestAssistantMessageFunctionCall.md)
 - [ChatCompletionRequestDeveloperMessage](docs/ChatCompletionRequestDeveloperMessage.md)
 - [ChatCompletionRequestDeveloperMessageContent](docs/ChatCompletionRequestDeveloperMessageContent.md)
 - [ChatCompletionRequestFunctionMessage](docs/ChatCompletionRequestFunctionMessage.md)
 - [ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [ChatCompletionRequestMessageContentPartAudio](docs/ChatCompletionRequestMessageContentPartAudio.md)
 - [ChatCompletionRequestMessageContentPartAudioInputAudio](docs/ChatCompletionRequestMessageContentPartAudioInputAudio.md)
 - [ChatCompletionRequestMessageContentPartImage](docs/ChatCompletionRequestMessageContentPartImage.md)
 - [ChatCompletionRequestMessageContentPartImageImageUrl](docs/ChatCompletionRequestMessageContentPartImageImageUrl.md)
 - [ChatCompletionRequestMessageContentPartRefusal](docs/ChatCompletionRequestMessageContentPartRefusal.md)
 - [ChatCompletionRequestMessageContentPartText](docs/ChatCompletionRequestMessageContentPartText.md)
 - [ChatCompletionRequestSystemMessage](docs/ChatCompletionRequestSystemMessage.md)
 - [ChatCompletionRequestSystemMessageContent](docs/ChatCompletionRequestSystemMessageContent.md)
 - [ChatCompletionRequestToolMessage](docs/ChatCompletionRequestToolMessage.md)
 - [ChatCompletionRequestToolMessageContent](docs/ChatCompletionRequestToolMessageContent.md)
 - [ChatCompletionRequestUserMessage](docs/ChatCompletionRequestUserMessage.md)
 - [ChatCompletionRequestUserMessageContent](docs/ChatCompletionRequestUserMessageContent.md)
 - [ChatCompletionRequestUserMessageContentPart](docs/ChatCompletionRequestUserMessageContentPart.md)
 - [ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [ChatCompletionResponseMessageAudio](docs/ChatCompletionResponseMessageAudio.md)
 - [ChatCompletionResponseMessageFunctionCall](docs/ChatCompletionResponseMessageFunctionCall.md)
 - [ChatCompletionRole](docs/ChatCompletionRole.md)
 - [ChatCompletionStreamOptions](docs/ChatCompletionStreamOptions.md)
 - [ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [ChatCompletionStreamResponseDeltaFunctionCall](docs/ChatCompletionStreamResponseDeltaFunctionCall.md)
 - [ChatCompletionTokenLogprob](docs/ChatCompletionTokenLogprob.md)
 - [ChatCompletionTokenLogprobTopLogprobsInner](docs/ChatCompletionTokenLogprobTopLogprobsInner.md)
 - [ChatCompletionTool](docs/ChatCompletionTool.md)
 - [ChatCompletionToolChoiceOption](docs/ChatCompletionToolChoiceOption.md)
 - [ChunkingStrategyRequestParam](docs/ChunkingStrategyRequestParam.md)
 - [CompleteUploadRequest](docs/CompleteUploadRequest.md)
 - [CompletionUsage](docs/CompletionUsage.md)
 - [CompletionUsageCompletionTokensDetails](docs/CompletionUsageCompletionTokensDetails.md)
 - [CompletionUsagePromptTokensDetails](docs/CompletionUsagePromptTokensDetails.md)
 - [CostsResult](docs/CostsResult.md)
 - [CostsResultAmount](docs/CostsResultAmount.md)
 - [CreateAssistantRequest](docs/CreateAssistantRequest.md)
 - [CreateAssistantRequestModel](docs/CreateAssistantRequestModel.md)
 - [CreateAssistantRequestToolResources](docs/CreateAssistantRequestToolResources.md)
 - [CreateAssistantRequestToolResourcesCodeInterpreter](docs/CreateAssistantRequestToolResourcesCodeInterpreter.md)
 - [CreateAssistantRequestToolResourcesFileSearch](docs/CreateAssistantRequestToolResourcesFileSearch.md)
 - [CreateAssistantRequestToolResourcesFileSearchVectorStoresInner](docs/CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md)
 - [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy](docs/CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.md)
 - [CreateBatchRequest](docs/CreateBatchRequest.md)
 - [CreateChatCompletionFunctionResponse](docs/CreateChatCompletionFunctionResponse.md)
 - [CreateChatCompletionFunctionResponseChoicesInner](docs/CreateChatCompletionFunctionResponseChoicesInner.md)
 - [CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [CreateChatCompletionRequestAudio](docs/CreateChatCompletionRequestAudio.md)
 - [CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [CreateChatCompletionRequestResponseFormat](docs/CreateChatCompletionRequestResponseFormat.md)
 - [CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [CreateChatCompletionResponseChoicesInnerLogprobs](docs/CreateChatCompletionResponseChoicesInnerLogprobs.md)
 - [CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [CreateChatCompletionStreamResponseUsage](docs/CreateChatCompletionStreamResponseUsage.md)
 - [CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [CreateFineTuningJobRequest](docs/CreateFineTuningJobRequest.md)
 - [CreateFineTuningJobRequestHyperparameters](docs/CreateFineTuningJobRequestHyperparameters.md)
 - [CreateFineTuningJobRequestHyperparametersBatchSize](docs/CreateFineTuningJobRequestHyperparametersBatchSize.md)
 - [CreateFineTuningJobRequestHyperparametersLearningRateMultiplier](docs/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md)
 - [CreateFineTuningJobRequestHyperparametersNEpochs](docs/CreateFineTuningJobRequestHyperparametersNEpochs.md)
 - [CreateFineTuningJobRequestIntegrationsInner](docs/CreateFineTuningJobRequestIntegrationsInner.md)
 - [CreateFineTuningJobRequestIntegrationsInnerWandb](docs/CreateFineTuningJobRequestIntegrationsInnerWandb.md)
 - [CreateFineTuningJobRequestModel](docs/CreateFineTuningJobRequestModel.md)
 - [CreateImageEditRequestModel](docs/CreateImageEditRequestModel.md)
 - [CreateImageRequest](docs/CreateImageRequest.md)
 - [CreateImageRequestModel](docs/CreateImageRequestModel.md)
 - [CreateMessageRequest](docs/CreateMessageRequest.md)
 - [CreateMessageRequestAttachmentsInner](docs/CreateMessageRequestAttachmentsInner.md)
 - [CreateMessageRequestAttachmentsInnerToolsInner](docs/CreateMessageRequestAttachmentsInnerToolsInner.md)
 - [CreateMessageRequestContent](docs/CreateMessageRequestContent.md)
 - [CreateModerationRequest](docs/CreateModerationRequest.md)
 - [CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [CreateModerationRequestInputOneOfInner](docs/CreateModerationRequestInputOneOfInner.md)
 - [CreateModerationRequestInputOneOfInnerOneOf](docs/CreateModerationRequestInputOneOfInnerOneOf.md)
 - [CreateModerationRequestInputOneOfInnerOneOf1](docs/CreateModerationRequestInputOneOfInnerOneOf1.md)
 - [CreateModerationRequestInputOneOfInnerOneOfImageUrl](docs/CreateModerationRequestInputOneOfInnerOneOfImageUrl.md)
 - [CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [CreateModerationResponse](docs/CreateModerationResponse.md)
 - [CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [CreateModerationResponseResultsInnerCategoryAppliedInputTypes](docs/CreateModerationResponseResultsInnerCategoryAppliedInputTypes.md)
 - [CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [CreateRunRequest](docs/CreateRunRequest.md)
 - [CreateRunRequestModel](docs/CreateRunRequestModel.md)
 - [CreateSpeechRequest](docs/CreateSpeechRequest.md)
 - [CreateSpeechRequestModel](docs/CreateSpeechRequestModel.md)
 - [CreateThreadAndRunRequest](docs/CreateThreadAndRunRequest.md)
 - [CreateThreadAndRunRequestToolResources](docs/CreateThreadAndRunRequestToolResources.md)
 - [CreateThreadAndRunRequestToolsInner](docs/CreateThreadAndRunRequestToolsInner.md)
 - [CreateThreadRequest](docs/CreateThreadRequest.md)
 - [CreateThreadRequestToolResources](docs/CreateThreadRequestToolResources.md)
 - [CreateThreadRequestToolResourcesFileSearch](docs/CreateThreadRequestToolResourcesFileSearch.md)
 - [CreateThreadRequestToolResourcesFileSearchVectorStoresInner](docs/CreateThreadRequestToolResourcesFileSearchVectorStoresInner.md)
 - [CreateTranscription200Response](docs/CreateTranscription200Response.md)
 - [CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [CreateTranscriptionResponseJson](docs/CreateTranscriptionResponseJson.md)
 - [CreateTranscriptionResponseVerboseJson](docs/CreateTranscriptionResponseVerboseJson.md)
 - [CreateTranslation200Response](docs/CreateTranslation200Response.md)
 - [CreateTranslationResponseJson](docs/CreateTranslationResponseJson.md)
 - [CreateTranslationResponseVerboseJson](docs/CreateTranslationResponseVerboseJson.md)
 - [CreateUploadRequest](docs/CreateUploadRequest.md)
 - [CreateVectorStoreFileBatchRequest](docs/CreateVectorStoreFileBatchRequest.md)
 - [CreateVectorStoreFileRequest](docs/CreateVectorStoreFileRequest.md)
 - [CreateVectorStoreRequest](docs/CreateVectorStoreRequest.md)
 - [CreateVectorStoreRequestChunkingStrategy](docs/CreateVectorStoreRequestChunkingStrategy.md)
 - [DefaultProjectErrorResponse](docs/DefaultProjectErrorResponse.md)
 - [DeleteAssistantResponse](docs/DeleteAssistantResponse.md)
 - [DeleteFileResponse](docs/DeleteFileResponse.md)
 - [DeleteMessageResponse](docs/DeleteMessageResponse.md)
 - [DeleteModelResponse](docs/DeleteModelResponse.md)
 - [DeleteThreadResponse](docs/DeleteThreadResponse.md)
 - [DeleteVectorStoreFileResponse](docs/DeleteVectorStoreFileResponse.md)
 - [DeleteVectorStoreResponse](docs/DeleteVectorStoreResponse.md)
 - [DoneEvent](docs/DoneEvent.md)
 - [Embedding](docs/Embedding.md)
 - [Error](docs/Error.md)
 - [ErrorEvent](docs/ErrorEvent.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FileSearchRankingOptions](docs/FileSearchRankingOptions.md)
 - [FineTuneChatCompletionRequestAssistantMessage](docs/FineTuneChatCompletionRequestAssistantMessage.md)
 - [FineTuneChatRequestInput](docs/FineTuneChatRequestInput.md)
 - [FineTuneChatRequestInputMessagesInner](docs/FineTuneChatRequestInputMessagesInner.md)
 - [FineTuneCompletionRequestInput](docs/FineTuneCompletionRequestInput.md)
 - [FineTuneDPOMethod](docs/FineTuneDPOMethod.md)
 - [FineTuneDPOMethodHyperparameters](docs/FineTuneDPOMethodHyperparameters.md)
 - [FineTuneDPOMethodHyperparametersBatchSize](docs/FineTuneDPOMethodHyperparametersBatchSize.md)
 - [FineTuneDPOMethodHyperparametersBeta](docs/FineTuneDPOMethodHyperparametersBeta.md)
 - [FineTuneDPOMethodHyperparametersLearningRateMultiplier](docs/FineTuneDPOMethodHyperparametersLearningRateMultiplier.md)
 - [FineTuneDPOMethodHyperparametersNEpochs](docs/FineTuneDPOMethodHyperparametersNEpochs.md)
 - [FineTuneMethod](docs/FineTuneMethod.md)
 - [FineTunePreferenceRequestInput](docs/FineTunePreferenceRequestInput.md)
 - [FineTunePreferenceRequestInputInput](docs/FineTunePreferenceRequestInputInput.md)
 - [FineTunePreferenceRequestInputPreferredCompletionInner](docs/FineTunePreferenceRequestInputPreferredCompletionInner.md)
 - [FineTuneSupervisedMethod](docs/FineTuneSupervisedMethod.md)
 - [FineTuneSupervisedMethodHyperparameters](docs/FineTuneSupervisedMethodHyperparameters.md)
 - [FineTuningIntegration](docs/FineTuningIntegration.md)
 - [FineTuningJob](docs/FineTuningJob.md)
 - [FineTuningJobCheckpoint](docs/FineTuningJobCheckpoint.md)
 - [FineTuningJobCheckpointMetrics](docs/FineTuningJobCheckpointMetrics.md)
 - [FineTuningJobError](docs/FineTuningJobError.md)
 - [FineTuningJobEvent](docs/FineTuningJobEvent.md)
 - [FineTuningJobHyperparameters](docs/FineTuningJobHyperparameters.md)
 - [FineTuningJobIntegrationsInner](docs/FineTuningJobIntegrationsInner.md)
 - [FunctionObject](docs/FunctionObject.md)
 - [Image](docs/Image.md)
 - [ImagesResponse](docs/ImagesResponse.md)
 - [Invite](docs/Invite.md)
 - [InviteDeleteResponse](docs/InviteDeleteResponse.md)
 - [InviteListResponse](docs/InviteListResponse.md)
 - [InviteProjectsInner](docs/InviteProjectsInner.md)
 - [InviteRequest](docs/InviteRequest.md)
 - [InviteRequestProjectsInner](docs/InviteRequestProjectsInner.md)
 - [ListAssistantsResponse](docs/ListAssistantsResponse.md)
 - [ListAuditLogsEffectiveAtParameter](docs/ListAuditLogsEffectiveAtParameter.md)
 - [ListAuditLogsResponse](docs/ListAuditLogsResponse.md)
 - [ListBatchesResponse](docs/ListBatchesResponse.md)
 - [ListFilesResponse](docs/ListFilesResponse.md)
 - [ListFineTuningJobCheckpointsResponse](docs/ListFineTuningJobCheckpointsResponse.md)
 - [ListFineTuningJobEventsResponse](docs/ListFineTuningJobEventsResponse.md)
 - [ListMessagesResponse](docs/ListMessagesResponse.md)
 - [ListModelsResponse](docs/ListModelsResponse.md)
 - [ListPaginatedFineTuningJobsResponse](docs/ListPaginatedFineTuningJobsResponse.md)
 - [ListRunStepsResponse](docs/ListRunStepsResponse.md)
 - [ListRunsResponse](docs/ListRunsResponse.md)
 - [ListThreadsResponse](docs/ListThreadsResponse.md)
 - [ListVectorStoreFilesResponse](docs/ListVectorStoreFilesResponse.md)
 - [ListVectorStoresResponse](docs/ListVectorStoresResponse.md)
 - [MessageContentImageFileObject](docs/MessageContentImageFileObject.md)
 - [MessageContentImageFileObjectImageFile](docs/MessageContentImageFileObjectImageFile.md)
 - [MessageContentImageUrlObject](docs/MessageContentImageUrlObject.md)
 - [MessageContentImageUrlObjectImageUrl](docs/MessageContentImageUrlObjectImageUrl.md)
 - [MessageContentRefusalObject](docs/MessageContentRefusalObject.md)
 - [MessageContentTextAnnotationsFileCitationObject](docs/MessageContentTextAnnotationsFileCitationObject.md)
 - [MessageContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [MessageContentTextAnnotationsFilePathObject](docs/MessageContentTextAnnotationsFilePathObject.md)
 - [MessageContentTextAnnotationsFilePathObjectFilePath](docs/MessageContentTextAnnotationsFilePathObjectFilePath.md)
 - [MessageContentTextObject](docs/MessageContentTextObject.md)
 - [MessageContentTextObjectText](docs/MessageContentTextObjectText.md)
 - [MessageContentTextObjectTextAnnotationsInner](docs/MessageContentTextObjectTextAnnotationsInner.md)
 - [MessageDeltaContentImageFileObject](docs/MessageDeltaContentImageFileObject.md)
 - [MessageDeltaContentImageFileObjectImageFile](docs/MessageDeltaContentImageFileObjectImageFile.md)
 - [MessageDeltaContentImageUrlObject](docs/MessageDeltaContentImageUrlObject.md)
 - [MessageDeltaContentImageUrlObjectImageUrl](docs/MessageDeltaContentImageUrlObjectImageUrl.md)
 - [MessageDeltaContentRefusalObject](docs/MessageDeltaContentRefusalObject.md)
 - [MessageDeltaContentTextAnnotationsFileCitationObject](docs/MessageDeltaContentTextAnnotationsFileCitationObject.md)
 - [MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [MessageDeltaContentTextAnnotationsFilePathObject](docs/MessageDeltaContentTextAnnotationsFilePathObject.md)
 - [MessageDeltaContentTextAnnotationsFilePathObjectFilePath](docs/MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)
 - [MessageDeltaContentTextObject](docs/MessageDeltaContentTextObject.md)
 - [MessageDeltaContentTextObjectText](docs/MessageDeltaContentTextObjectText.md)
 - [MessageDeltaContentTextObjectTextAnnotationsInner](docs/MessageDeltaContentTextObjectTextAnnotationsInner.md)
 - [MessageDeltaObject](docs/MessageDeltaObject.md)
 - [MessageDeltaObjectDelta](docs/MessageDeltaObjectDelta.md)
 - [MessageDeltaObjectDeltaContentInner](docs/MessageDeltaObjectDeltaContentInner.md)
 - [MessageObject](docs/MessageObject.md)
 - [MessageObjectContentInner](docs/MessageObjectContentInner.md)
 - [MessageObjectIncompleteDetails](docs/MessageObjectIncompleteDetails.md)
 - [MessageRequestContentTextObject](docs/MessageRequestContentTextObject.md)
 - [MessageStreamEvent](docs/MessageStreamEvent.md)
 - [MessageStreamEventOneOf](docs/MessageStreamEventOneOf.md)
 - [MessageStreamEventOneOf1](docs/MessageStreamEventOneOf1.md)
 - [MessageStreamEventOneOf2](docs/MessageStreamEventOneOf2.md)
 - [MessageStreamEventOneOf3](docs/MessageStreamEventOneOf3.md)
 - [MessageStreamEventOneOf4](docs/MessageStreamEventOneOf4.md)
 - [Model](docs/Model.md)
 - [ModifyAssistantRequest](docs/ModifyAssistantRequest.md)
 - [ModifyAssistantRequestToolResources](docs/ModifyAssistantRequestToolResources.md)
 - [ModifyAssistantRequestToolResourcesCodeInterpreter](docs/ModifyAssistantRequestToolResourcesCodeInterpreter.md)
 - [ModifyAssistantRequestToolResourcesFileSearch](docs/ModifyAssistantRequestToolResourcesFileSearch.md)
 - [ModifyMessageRequest](docs/ModifyMessageRequest.md)
 - [ModifyRunRequest](docs/ModifyRunRequest.md)
 - [ModifyThreadRequest](docs/ModifyThreadRequest.md)
 - [ModifyThreadRequestToolResources](docs/ModifyThreadRequestToolResources.md)
 - [ModifyThreadRequestToolResourcesFileSearch](docs/ModifyThreadRequestToolResourcesFileSearch.md)
 - [OpenAIFile](docs/OpenAIFile.md)
 - [OtherChunkingStrategyResponseParam](docs/OtherChunkingStrategyResponseParam.md)
 - [PredictionContent](docs/PredictionContent.md)
 - [PredictionContentContent](docs/PredictionContentContent.md)
 - [Project](docs/Project.md)
 - [ProjectApiKey](docs/ProjectApiKey.md)
 - [ProjectApiKeyDeleteResponse](docs/ProjectApiKeyDeleteResponse.md)
 - [ProjectApiKeyListResponse](docs/ProjectApiKeyListResponse.md)
 - [ProjectApiKeyOwner](docs/ProjectApiKeyOwner.md)
 - [ProjectCreateRequest](docs/ProjectCreateRequest.md)
 - [ProjectListResponse](docs/ProjectListResponse.md)
 - [ProjectRateLimit](docs/ProjectRateLimit.md)
 - [ProjectRateLimitListResponse](docs/ProjectRateLimitListResponse.md)
 - [ProjectRateLimitUpdateRequest](docs/ProjectRateLimitUpdateRequest.md)
 - [ProjectServiceAccount](docs/ProjectServiceAccount.md)
 - [ProjectServiceAccountApiKey](docs/ProjectServiceAccountApiKey.md)
 - [ProjectServiceAccountCreateRequest](docs/ProjectServiceAccountCreateRequest.md)
 - [ProjectServiceAccountCreateResponse](docs/ProjectServiceAccountCreateResponse.md)
 - [ProjectServiceAccountDeleteResponse](docs/ProjectServiceAccountDeleteResponse.md)
 - [ProjectServiceAccountListResponse](docs/ProjectServiceAccountListResponse.md)
 - [ProjectUpdateRequest](docs/ProjectUpdateRequest.md)
 - [ProjectUser](docs/ProjectUser.md)
 - [ProjectUserCreateRequest](docs/ProjectUserCreateRequest.md)
 - [ProjectUserDeleteResponse](docs/ProjectUserDeleteResponse.md)
 - [ProjectUserListResponse](docs/ProjectUserListResponse.md)
 - [ProjectUserUpdateRequest](docs/ProjectUserUpdateRequest.md)
 - [RealtimeClientEventConversationItemCreate](docs/RealtimeClientEventConversationItemCreate.md)
 - [RealtimeClientEventConversationItemDelete](docs/RealtimeClientEventConversationItemDelete.md)
 - [RealtimeClientEventConversationItemTruncate](docs/RealtimeClientEventConversationItemTruncate.md)
 - [RealtimeClientEventInputAudioBufferAppend](docs/RealtimeClientEventInputAudioBufferAppend.md)
 - [RealtimeClientEventInputAudioBufferClear](docs/RealtimeClientEventInputAudioBufferClear.md)
 - [RealtimeClientEventInputAudioBufferCommit](docs/RealtimeClientEventInputAudioBufferCommit.md)
 - [RealtimeClientEventResponseCancel](docs/RealtimeClientEventResponseCancel.md)
 - [RealtimeClientEventResponseCreate](docs/RealtimeClientEventResponseCreate.md)
 - [RealtimeClientEventSessionUpdate](docs/RealtimeClientEventSessionUpdate.md)
 - [RealtimeConversationItem](docs/RealtimeConversationItem.md)
 - [RealtimeConversationItemContentInner](docs/RealtimeConversationItemContentInner.md)
 - [RealtimeResponse](docs/RealtimeResponse.md)
 - [RealtimeResponseCreateParams](docs/RealtimeResponseCreateParams.md)
 - [RealtimeResponseCreateParamsConversation](docs/RealtimeResponseCreateParamsConversation.md)
 - [RealtimeResponseCreateParamsMaxResponseOutputTokens](docs/RealtimeResponseCreateParamsMaxResponseOutputTokens.md)
 - [RealtimeResponseCreateParamsToolsInner](docs/RealtimeResponseCreateParamsToolsInner.md)
 - [RealtimeResponseStatusDetails](docs/RealtimeResponseStatusDetails.md)
 - [RealtimeResponseStatusDetailsError](docs/RealtimeResponseStatusDetailsError.md)
 - [RealtimeResponseUsage](docs/RealtimeResponseUsage.md)
 - [RealtimeResponseUsageInputTokenDetails](docs/RealtimeResponseUsageInputTokenDetails.md)
 - [RealtimeResponseUsageOutputTokenDetails](docs/RealtimeResponseUsageOutputTokenDetails.md)
 - [RealtimeServerEventConversationCreated](docs/RealtimeServerEventConversationCreated.md)
 - [RealtimeServerEventConversationCreatedConversation](docs/RealtimeServerEventConversationCreatedConversation.md)
 - [RealtimeServerEventConversationItemCreated](docs/RealtimeServerEventConversationItemCreated.md)
 - [RealtimeServerEventConversationItemDeleted](docs/RealtimeServerEventConversationItemDeleted.md)
 - [RealtimeServerEventConversationItemInputAudioTranscriptionCompleted](docs/RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.md)
 - [RealtimeServerEventConversationItemInputAudioTranscriptionFailed](docs/RealtimeServerEventConversationItemInputAudioTranscriptionFailed.md)
 - [RealtimeServerEventConversationItemInputAudioTranscriptionFailedError](docs/RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md)
 - [RealtimeServerEventConversationItemTruncated](docs/RealtimeServerEventConversationItemTruncated.md)
 - [RealtimeServerEventError](docs/RealtimeServerEventError.md)
 - [RealtimeServerEventErrorError](docs/RealtimeServerEventErrorError.md)
 - [RealtimeServerEventInputAudioBufferCleared](docs/RealtimeServerEventInputAudioBufferCleared.md)
 - [RealtimeServerEventInputAudioBufferCommitted](docs/RealtimeServerEventInputAudioBufferCommitted.md)
 - [RealtimeServerEventInputAudioBufferSpeechStarted](docs/RealtimeServerEventInputAudioBufferSpeechStarted.md)
 - [RealtimeServerEventInputAudioBufferSpeechStopped](docs/RealtimeServerEventInputAudioBufferSpeechStopped.md)
 - [RealtimeServerEventRateLimitsUpdated](docs/RealtimeServerEventRateLimitsUpdated.md)
 - [RealtimeServerEventRateLimitsUpdatedRateLimitsInner](docs/RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md)
 - [RealtimeServerEventResponseAudioDelta](docs/RealtimeServerEventResponseAudioDelta.md)
 - [RealtimeServerEventResponseAudioDone](docs/RealtimeServerEventResponseAudioDone.md)
 - [RealtimeServerEventResponseAudioTranscriptDelta](docs/RealtimeServerEventResponseAudioTranscriptDelta.md)
 - [RealtimeServerEventResponseAudioTranscriptDone](docs/RealtimeServerEventResponseAudioTranscriptDone.md)
 - [RealtimeServerEventResponseContentPartAdded](docs/RealtimeServerEventResponseContentPartAdded.md)
 - [RealtimeServerEventResponseContentPartAddedPart](docs/RealtimeServerEventResponseContentPartAddedPart.md)
 - [RealtimeServerEventResponseContentPartDone](docs/RealtimeServerEventResponseContentPartDone.md)
 - [RealtimeServerEventResponseContentPartDonePart](docs/RealtimeServerEventResponseContentPartDonePart.md)
 - [RealtimeServerEventResponseCreated](docs/RealtimeServerEventResponseCreated.md)
 - [RealtimeServerEventResponseDone](docs/RealtimeServerEventResponseDone.md)
 - [RealtimeServerEventResponseFunctionCallArgumentsDelta](docs/RealtimeServerEventResponseFunctionCallArgumentsDelta.md)
 - [RealtimeServerEventResponseFunctionCallArgumentsDone](docs/RealtimeServerEventResponseFunctionCallArgumentsDone.md)
 - [RealtimeServerEventResponseOutputItemAdded](docs/RealtimeServerEventResponseOutputItemAdded.md)
 - [RealtimeServerEventResponseOutputItemDone](docs/RealtimeServerEventResponseOutputItemDone.md)
 - [RealtimeServerEventResponseTextDelta](docs/RealtimeServerEventResponseTextDelta.md)
 - [RealtimeServerEventResponseTextDone](docs/RealtimeServerEventResponseTextDone.md)
 - [RealtimeServerEventSessionCreated](docs/RealtimeServerEventSessionCreated.md)
 - [RealtimeServerEventSessionUpdated](docs/RealtimeServerEventSessionUpdated.md)
 - [RealtimeSession](docs/RealtimeSession.md)
 - [RealtimeSessionCreateRequest](docs/RealtimeSessionCreateRequest.md)
 - [RealtimeSessionCreateRequestTurnDetection](docs/RealtimeSessionCreateRequestTurnDetection.md)
 - [RealtimeSessionCreateResponse](docs/RealtimeSessionCreateResponse.md)
 - [RealtimeSessionCreateResponseClientSecret](docs/RealtimeSessionCreateResponseClientSecret.md)
 - [RealtimeSessionCreateResponseTurnDetection](docs/RealtimeSessionCreateResponseTurnDetection.md)
 - [RealtimeSessionInputAudioTranscription](docs/RealtimeSessionInputAudioTranscription.md)
 - [RealtimeSessionModel](docs/RealtimeSessionModel.md)
 - [RealtimeSessionTurnDetection](docs/RealtimeSessionTurnDetection.md)
 - [ResponseFormatJsonObject](docs/ResponseFormatJsonObject.md)
 - [ResponseFormatJsonSchema](docs/ResponseFormatJsonSchema.md)
 - [ResponseFormatJsonSchemaJsonSchema](docs/ResponseFormatJsonSchemaJsonSchema.md)
 - [ResponseFormatText](docs/ResponseFormatText.md)
 - [RunCompletionUsage](docs/RunCompletionUsage.md)
 - [RunObject](docs/RunObject.md)
 - [RunObjectIncompleteDetails](docs/RunObjectIncompleteDetails.md)
 - [RunObjectLastError](docs/RunObjectLastError.md)
 - [RunObjectRequiredAction](docs/RunObjectRequiredAction.md)
 - [RunObjectRequiredActionSubmitToolOutputs](docs/RunObjectRequiredActionSubmitToolOutputs.md)
 - [RunStepCompletionUsage](docs/RunStepCompletionUsage.md)
 - [RunStepDeltaObject](docs/RunStepDeltaObject.md)
 - [RunStepDeltaObjectDelta](docs/RunStepDeltaObjectDelta.md)
 - [RunStepDeltaObjectDeltaStepDetails](docs/RunStepDeltaObjectDeltaStepDetails.md)
 - [RunStepDeltaStepDetailsMessageCreationObject](docs/RunStepDeltaStepDetailsMessageCreationObject.md)
 - [RunStepDeltaStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObject](docs/RunStepDeltaStepDetailsToolCallsCodeObject.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDeltaStepDetailsToolCallsFileSearchObject](docs/RunStepDeltaStepDetailsToolCallsFileSearchObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObject](docs/RunStepDeltaStepDetailsToolCallsFunctionObject.md)
 - [RunStepDeltaStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md)
 - [RunStepDeltaStepDetailsToolCallsObject](docs/RunStepDeltaStepDetailsToolCallsObject.md)
 - [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)
 - [RunStepDetailsMessageCreationObject](docs/RunStepDetailsMessageCreationObject.md)
 - [RunStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDetailsMessageCreationObjectMessageCreation.md)
 - [RunStepDetailsToolCallsCodeObject](docs/RunStepDetailsToolCallsCodeObject.md)
 - [RunStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [RunStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [RunStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDetailsToolCallsFileSearchObject](docs/RunStepDetailsToolCallsFileSearchObject.md)
 - [RunStepDetailsToolCallsFileSearchObjectFileSearch](docs/RunStepDetailsToolCallsFileSearchObjectFileSearch.md)
 - [RunStepDetailsToolCallsFileSearchRankingOptionsObject](docs/RunStepDetailsToolCallsFileSearchRankingOptionsObject.md)
 - [RunStepDetailsToolCallsFileSearchResultObject](docs/RunStepDetailsToolCallsFileSearchResultObject.md)
 - [RunStepDetailsToolCallsFileSearchResultObjectContentInner](docs/RunStepDetailsToolCallsFileSearchResultObjectContentInner.md)
 - [RunStepDetailsToolCallsFunctionObject](docs/RunStepDetailsToolCallsFunctionObject.md)
 - [RunStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDetailsToolCallsFunctionObjectFunction.md)
 - [RunStepDetailsToolCallsObject](docs/RunStepDetailsToolCallsObject.md)
 - [RunStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDetailsToolCallsObjectToolCallsInner.md)
 - [RunStepObject](docs/RunStepObject.md)
 - [RunStepObjectLastError](docs/RunStepObjectLastError.md)
 - [RunStepObjectStepDetails](docs/RunStepObjectStepDetails.md)
 - [RunStepStreamEvent](docs/RunStepStreamEvent.md)
 - [RunStepStreamEventOneOf](docs/RunStepStreamEventOneOf.md)
 - [RunStepStreamEventOneOf1](docs/RunStepStreamEventOneOf1.md)
 - [RunStepStreamEventOneOf2](docs/RunStepStreamEventOneOf2.md)
 - [RunStepStreamEventOneOf3](docs/RunStepStreamEventOneOf3.md)
 - [RunStepStreamEventOneOf4](docs/RunStepStreamEventOneOf4.md)
 - [RunStepStreamEventOneOf5](docs/RunStepStreamEventOneOf5.md)
 - [RunStepStreamEventOneOf6](docs/RunStepStreamEventOneOf6.md)
 - [RunStreamEvent](docs/RunStreamEvent.md)
 - [RunStreamEventOneOf](docs/RunStreamEventOneOf.md)
 - [RunStreamEventOneOf1](docs/RunStreamEventOneOf1.md)
 - [RunStreamEventOneOf2](docs/RunStreamEventOneOf2.md)
 - [RunStreamEventOneOf3](docs/RunStreamEventOneOf3.md)
 - [RunStreamEventOneOf4](docs/RunStreamEventOneOf4.md)
 - [RunStreamEventOneOf5](docs/RunStreamEventOneOf5.md)
 - [RunStreamEventOneOf6](docs/RunStreamEventOneOf6.md)
 - [RunStreamEventOneOf7](docs/RunStreamEventOneOf7.md)
 - [RunStreamEventOneOf8](docs/RunStreamEventOneOf8.md)
 - [RunStreamEventOneOf9](docs/RunStreamEventOneOf9.md)
 - [RunToolCallObject](docs/RunToolCallObject.md)
 - [RunToolCallObjectFunction](docs/RunToolCallObjectFunction.md)
 - [StaticChunkingStrategy](docs/StaticChunkingStrategy.md)
 - [StaticChunkingStrategyRequestParam](docs/StaticChunkingStrategyRequestParam.md)
 - [StaticChunkingStrategyResponseParam](docs/StaticChunkingStrategyResponseParam.md)
 - [StaticChunkingStrategyStatic](docs/StaticChunkingStrategyStatic.md)
 - [SubmitToolOutputsRunRequest](docs/SubmitToolOutputsRunRequest.md)
 - [SubmitToolOutputsRunRequestToolOutputsInner](docs/SubmitToolOutputsRunRequestToolOutputsInner.md)
 - [ThreadObject](docs/ThreadObject.md)
 - [ThreadStreamEvent](docs/ThreadStreamEvent.md)
 - [TranscriptionSegment](docs/TranscriptionSegment.md)
 - [TranscriptionWord](docs/TranscriptionWord.md)
 - [TruncationObject](docs/TruncationObject.md)
 - [UpdateVectorStoreRequest](docs/UpdateVectorStoreRequest.md)
 - [Upload](docs/Upload.md)
 - [UploadPart](docs/UploadPart.md)
 - [UsageAudioSpeechesResult](docs/UsageAudioSpeechesResult.md)
 - [UsageAudioTranscriptionsResult](docs/UsageAudioTranscriptionsResult.md)
 - [UsageCodeInterpreterSessionsResult](docs/UsageCodeInterpreterSessionsResult.md)
 - [UsageCompletionsResult](docs/UsageCompletionsResult.md)
 - [UsageEmbeddingsResult](docs/UsageEmbeddingsResult.md)
 - [UsageImagesResult](docs/UsageImagesResult.md)
 - [UsageModerationsResult](docs/UsageModerationsResult.md)
 - [UsageResponse](docs/UsageResponse.md)
 - [UsageTimeBucket](docs/UsageTimeBucket.md)
 - [UsageTimeBucketResultInner](docs/UsageTimeBucketResultInner.md)
 - [UsageVectorStoresResult](docs/UsageVectorStoresResult.md)
 - [User](docs/User.md)
 - [UserDeleteResponse](docs/UserDeleteResponse.md)
 - [UserListResponse](docs/UserListResponse.md)
 - [UserRoleUpdateRequest](docs/UserRoleUpdateRequest.md)
 - [VectorStoreExpirationAfter](docs/VectorStoreExpirationAfter.md)
 - [VectorStoreFileBatchObject](docs/VectorStoreFileBatchObject.md)
 - [VectorStoreFileBatchObjectFileCounts](docs/VectorStoreFileBatchObjectFileCounts.md)
 - [VectorStoreFileObject](docs/VectorStoreFileObject.md)
 - [VectorStoreFileObjectChunkingStrategy](docs/VectorStoreFileObjectChunkingStrategy.md)
 - [VectorStoreFileObjectLastError](docs/VectorStoreFileObjectLastError.md)
 - [VectorStoreObject](docs/VectorStoreObject.md)
 - [VectorStoreObjectFileCounts](docs/VectorStoreObjectFileCounts.md)


## Documentation For Authorization


## ApiKeyAuth


- **Type**: HTTP Bearer Token authentication

