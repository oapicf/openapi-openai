# php-base - PHP Slim 4 Server library for OpenAI API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.
[PHP-DI](https://php-di.org/doc/frameworks/slim.html) package used as dependency container.

## Requirements

* Web server with URL rewriting
* PHP 8.1 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Add configs

[PHP-DI package](https://php-di.org/doc/getting-started.html) helps to decouple configuration from implementation. App loads configuration files in straight order(`$env` can be `prod` or `dev`):
1. `config/$env/default.inc.php` (contains safe values, can be committed to vcs)
2. `config/$env/config.inc.php` (user config, excluded from vcs, can contain sensitive values, passwords etc.)
3. `lib/App/RegisterDependencies.php`

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/public/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server/public
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 8 or 9(depends from your PHP version) for unit testing.
[Test folder](tests) contains templates which you can fill with real test assertions.
How to write tests read at [2. Writing Tests for PHPUnit - PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch your app environment to development
- When using with some webserver => in `public/.htaccess` file:
```ini
## .htaccess
<IfModule mod_env.c>
    SetEnv APP_ENV 'development'
</IfModule>
```

- Or when using whatever else, set `APP_ENV` environment variable like this:
```bash
export APP_ENV=development
```
or simply
```bash
export APP_ENV=dev
```

## Mock Server
Since this feature should be used for development only, change environment to `development` and send additional HTTP header `X-OpenAPIServer-Mock: ping` with any request to get mocked response.
CURL example:
```console
curl --request GET \
    --url 'http://localhost:8888/v2/pet/findByStatus?status=available' \
    --header 'accept: application/json' \
    --header 'X-OpenAPIServer-Mock: ping'
[{"id":-8738629417578509312,"category":{"id":-4162503862215270400,"name":"Lorem ipsum dol"},"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem i","photoUrls":["Lor"],"tags":[{"id":-3506202845849391104,"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectet"}],"status":"pending"}]
```

Used packages:
* [Openapi Data Mocker](https://github.com/ybelenko/openapi-data-mocker) - first implementation of OAS3 fake data generator.
* [Openapi Data Mocker Server Middleware](https://github.com/ybelenko/openapi-data-mocker-server-middleware) - PSR-15 HTTP server middleware.
* [Openapi Data Mocker Interfaces](https://github.com/ybelenko/openapi-data-mocker-interfaces) - package with mocking interfaces.

## Logging

Build contains pre-configured [`monolog/monolog`](https://github.com/Seldaek/monolog) package. Make sure that `logs` folder is writable.
Add required log handlers/processors/formatters in `lib/App/RegisterDependencies.php`.

## API Endpoints

All URIs are relative to *https://api.openai.com/v1*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;

class PetApi extends AbstractPetApi
{
    public function addPet(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        // your implementation of addPet method here
    }
}
```

When you need to inject dependencies into API controller check [PHP-DI - Controllers as services](https://github.com/PHP-DI/Slim-Bridge#controllers-as-services) guide.

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractAssistantsApi* | **createAssistant** | **POST** /assistants | Create an assistant with a model and instructions.
*AbstractAssistantsApi* | **createThread** | **POST** /threads | Create a thread.
*AbstractAssistantsApi* | **createThreadAndRun** | **POST** /threads/runs | Create a thread and run it in one request.
*AbstractAssistantsApi* | **listAssistants** | **GET** /assistants | Returns a list of assistants.
*AbstractAssistantsApi* | **cancelRun** | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is `in_progress`.
*AbstractAssistantsApi* | **createMessage** | **POST** /threads/{thread_id}/messages | Create a message.
*AbstractAssistantsApi* | **createRun** | **POST** /threads/{thread_id}/runs | Create a run.
*AbstractAssistantsApi* | **deleteAssistant** | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AbstractAssistantsApi* | **deleteMessage** | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
*AbstractAssistantsApi* | **deleteThread** | **DELETE** /threads/{thread_id} | Delete a thread.
*AbstractAssistantsApi* | **getAssistant** | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AbstractAssistantsApi* | **getMessage** | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AbstractAssistantsApi* | **getRun** | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AbstractAssistantsApi* | **getRunStep** | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AbstractAssistantsApi* | **getThread** | **GET** /threads/{thread_id} | Retrieves a thread.
*AbstractAssistantsApi* | **listMessages** | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
*AbstractAssistantsApi* | **listRunSteps** | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
*AbstractAssistantsApi* | **listRuns** | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
*AbstractAssistantsApi* | **modifyAssistant** | **POST** /assistants/{assistant_id} | Modifies an assistant.
*AbstractAssistantsApi* | **modifyMessage** | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
*AbstractAssistantsApi* | **modifyRun** | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
*AbstractAssistantsApi* | **modifyThread** | **POST** /threads/{thread_id} | Modifies a thread.
*AbstractAssistantsApi* | **submitToolOuputsToRun** | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.
*AbstractAudioApi* | **createSpeech** | **POST** /audio/speech | Generates audio from the input text.
*AbstractAudioApi* | **createTranscription** | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AbstractAudioApi* | **createTranslation** | **POST** /audio/translations | Translates audio into English.
*AbstractAuditLogsApi* | **listAuditLogs** | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.
*AbstractBatchApi* | **createBatch** | **POST** /batches | Creates and executes a batch from an uploaded file of requests
*AbstractBatchApi* | **listBatches** | **GET** /batches | List your organization's batches.
*AbstractBatchApi* | **cancelBatch** | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
*AbstractBatchApi* | **retrieveBatch** | **GET** /batches/{batch_id} | Retrieves a batch.
*AbstractChatApi* | **createChatCompletion** | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).
*AbstractCompletionsApi* | **createCompletion** | **POST** /completions | Creates a completion for the provided prompt and parameters.
*AbstractDefaultApi* | **adminApiKeysCreate** | **POST** /organization/admin_api_keys | Create an organization admin API key
*AbstractDefaultApi* | **adminApiKeysList** | **GET** /organization/admin_api_keys | List organization API keys
*AbstractDefaultApi* | **adminApiKeysDelete** | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
*AbstractDefaultApi* | **adminApiKeysGet** | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
*AbstractEmbeddingsApi* | **createEmbedding** | **POST** /embeddings | Creates an embedding vector representing the input text.
*AbstractFilesApi* | **createFile** | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
*AbstractFilesApi* | **listFiles** | **GET** /files | Returns a list of files.
*AbstractFilesApi* | **deleteFile** | **DELETE** /files/{file_id} | Delete a file.
*AbstractFilesApi* | **downloadFile** | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*AbstractFilesApi* | **retrieveFile** | **GET** /files/{file_id} | Returns information about a specific file.
*AbstractFineTuningApi* | **createFineTuningJob** | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
*AbstractFineTuningApi* | **listPaginatedFineTuningJobs** | **GET** /fine_tuning/jobs | List your organization's fine-tuning jobs
*AbstractFineTuningApi* | **cancelFineTuningJob** | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.
*AbstractFineTuningApi* | **listFineTuningEvents** | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.
*AbstractFineTuningApi* | **listFineTuningJobCheckpoints** | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.
*AbstractFineTuningApi* | **retrieveFineTuningJob** | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
*AbstractImagesApi* | **createImage** | **POST** /images/generations | Creates an image given a prompt.
*AbstractImagesApi* | **createImageEdit** | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*AbstractImagesApi* | **createImageVariation** | **POST** /images/variations | Creates a variation of a given image.
*AbstractInvitesApi* | **inviteUser** | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
*AbstractInvitesApi* | **listInvites** | **GET** /organization/invites | Returns a list of invites in the organization.
*AbstractInvitesApi* | **deleteInvite** | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
*AbstractInvitesApi* | **retrieveInvite** | **GET** /organization/invites/{invite_id} | Retrieves an invite.
*AbstractModelsApi* | **listModels** | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*AbstractModelsApi* | **deleteModel** | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*AbstractModelsApi* | **retrieveModel** | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*AbstractModerationsApi* | **createModeration** | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).
*AbstractProjectsApi* | **createProject** | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
*AbstractProjectsApi* | **listProjects** | **GET** /organization/projects | Returns a list of projects.
*AbstractProjectsApi* | **archiveProject** | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
*AbstractProjectsApi* | **createProjectServiceAccount** | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
*AbstractProjectsApi* | **createProjectUser** | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
*AbstractProjectsApi* | **deleteProjectApiKey** | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
*AbstractProjectsApi* | **deleteProjectServiceAccount** | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
*AbstractProjectsApi* | **deleteProjectUser** | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
*AbstractProjectsApi* | **listProjectApiKeys** | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
*AbstractProjectsApi* | **listProjectRateLimits** | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
*AbstractProjectsApi* | **listProjectServiceAccounts** | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
*AbstractProjectsApi* | **listProjectUsers** | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
*AbstractProjectsApi* | **modifyProject** | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
*AbstractProjectsApi* | **modifyProjectUser** | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user's role in the project.
*AbstractProjectsApi* | **retrieveProject** | **GET** /organization/projects/{project_id} | Retrieves a project.
*AbstractProjectsApi* | **retrieveProjectApiKey** | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
*AbstractProjectsApi* | **retrieveProjectServiceAccount** | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
*AbstractProjectsApi* | **retrieveProjectUser** | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
*AbstractProjectsApi* | **updateProjectRateLimits** | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.
*AbstractRealtimeApi* | **createRealtimeSession** | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.
*AbstractUploadsApi* | **createUpload** | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).
*AbstractUploadsApi* | **addUploadPart** | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).
*AbstractUploadsApi* | **cancelUpload** | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.
*AbstractUploadsApi* | **completeUpload** | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
*AbstractUsageApi* | **usageAudioSpeeches** | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
*AbstractUsageApi* | **usageAudioTranscriptions** | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
*AbstractUsageApi* | **usageCodeInterpreterSessions** | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
*AbstractUsageApi* | **usageCompletions** | **GET** /organization/usage/completions | Get completions usage details for the organization.
*AbstractUsageApi* | **usageCosts** | **GET** /organization/costs | Get costs details for the organization.
*AbstractUsageApi* | **usageEmbeddings** | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
*AbstractUsageApi* | **usageImages** | **GET** /organization/usage/images | Get images usage details for the organization.
*AbstractUsageApi* | **usageModerations** | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
*AbstractUsageApi* | **usageVectorStores** | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.
*AbstractUsersApi* | **listUsers** | **GET** /organization/users | Lists all of the users in the organization.
*AbstractUsersApi* | **deleteUser** | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
*AbstractUsersApi* | **modifyUser** | **POST** /organization/users/{user_id} | Modifies a user's role in the organization.
*AbstractUsersApi* | **retrieveUser** | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.
*AbstractVectorStoresApi* | **createVectorStore** | **POST** /vector_stores | Create a vector store.
*AbstractVectorStoresApi* | **listVectorStores** | **GET** /vector_stores | Returns a list of vector stores.
*AbstractVectorStoresApi* | **cancelVectorStoreFileBatch** | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
*AbstractVectorStoresApi* | **createVectorStoreFile** | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
*AbstractVectorStoresApi* | **createVectorStoreFileBatch** | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
*AbstractVectorStoresApi* | **deleteVectorStore** | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
*AbstractVectorStoresApi* | **deleteVectorStoreFile** | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
*AbstractVectorStoresApi* | **getVectorStore** | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
*AbstractVectorStoresApi* | **getVectorStoreFile** | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
*AbstractVectorStoresApi* | **getVectorStoreFileBatch** | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
*AbstractVectorStoresApi* | **listFilesInVectorStoreBatch** | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
*AbstractVectorStoresApi* | **listVectorStoreFiles** | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
*AbstractVectorStoresApi* | **modifyVectorStore** | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


## Models

* OpenAPIServer\Model\AdminApiKey
* OpenAPIServer\Model\AdminApiKeyOwner
* OpenAPIServer\Model\AdminApiKeysCreateRequest
* OpenAPIServer\Model\AdminApiKeysDelete200Response
* OpenAPIServer\Model\ApiKeyList
* OpenAPIServer\Model\ArrayOfContentPartsInner
* OpenAPIServer\Model\AssistantObject
* OpenAPIServer\Model\AssistantObjectToolResources
* OpenAPIServer\Model\AssistantObjectToolResourcesCodeInterpreter
* OpenAPIServer\Model\AssistantObjectToolResourcesFileSearch
* OpenAPIServer\Model\AssistantObjectToolsInner
* OpenAPIServer\Model\AssistantStreamEvent
* OpenAPIServer\Model\AssistantToolsCode
* OpenAPIServer\Model\AssistantToolsFileSearch
* OpenAPIServer\Model\AssistantToolsFileSearchFileSearch
* OpenAPIServer\Model\AssistantToolsFileSearchTypeOnly
* OpenAPIServer\Model\AssistantToolsFunction
* OpenAPIServer\Model\AssistantsApiResponseFormatOption
* OpenAPIServer\Model\AssistantsApiToolChoiceOption
* OpenAPIServer\Model\AssistantsNamedToolChoice
* OpenAPIServer\Model\AssistantsNamedToolChoiceFunction
* OpenAPIServer\Model\AudioResponseFormat
* OpenAPIServer\Model\AuditLog
* OpenAPIServer\Model\AuditLogActor
* OpenAPIServer\Model\AuditLogActorApiKey
* OpenAPIServer\Model\AuditLogActorServiceAccount
* OpenAPIServer\Model\AuditLogActorSession
* OpenAPIServer\Model\AuditLogActorUser
* OpenAPIServer\Model\AuditLogApiKeyCreated
* OpenAPIServer\Model\AuditLogApiKeyCreatedData
* OpenAPIServer\Model\AuditLogApiKeyDeleted
* OpenAPIServer\Model\AuditLogApiKeyUpdated
* OpenAPIServer\Model\AuditLogApiKeyUpdatedChangesRequested
* OpenAPIServer\Model\AuditLogEventType
* OpenAPIServer\Model\AuditLogInviteAccepted
* OpenAPIServer\Model\AuditLogInviteSent
* OpenAPIServer\Model\AuditLogInviteSentData
* OpenAPIServer\Model\AuditLogLoginFailed
* OpenAPIServer\Model\AuditLogOrganizationUpdated
* OpenAPIServer\Model\AuditLogOrganizationUpdatedChangesRequested
* OpenAPIServer\Model\AuditLogOrganizationUpdatedChangesRequestedSettings
* OpenAPIServer\Model\AuditLogProject
* OpenAPIServer\Model\AuditLogProjectArchived
* OpenAPIServer\Model\AuditLogProjectCreated
* OpenAPIServer\Model\AuditLogProjectCreatedData
* OpenAPIServer\Model\AuditLogProjectUpdated
* OpenAPIServer\Model\AuditLogProjectUpdatedChangesRequested
* OpenAPIServer\Model\AuditLogRateLimitDeleted
* OpenAPIServer\Model\AuditLogRateLimitUpdated
* OpenAPIServer\Model\AuditLogRateLimitUpdatedChangesRequested
* OpenAPIServer\Model\AuditLogServiceAccountCreated
* OpenAPIServer\Model\AuditLogServiceAccountCreatedData
* OpenAPIServer\Model\AuditLogServiceAccountDeleted
* OpenAPIServer\Model\AuditLogServiceAccountUpdated
* OpenAPIServer\Model\AuditLogServiceAccountUpdatedChangesRequested
* OpenAPIServer\Model\AuditLogUserAdded
* OpenAPIServer\Model\AuditLogUserAddedData
* OpenAPIServer\Model\AuditLogUserDeleted
* OpenAPIServer\Model\AuditLogUserUpdated
* OpenAPIServer\Model\AuditLogUserUpdatedChangesRequested
* OpenAPIServer\Model\AutoChunkingStrategy
* OpenAPIServer\Model\AutoChunkingStrategyRequestParam
* OpenAPIServer\Model\Batch
* OpenAPIServer\Model\BatchErrors
* OpenAPIServer\Model\BatchErrorsDataInner
* OpenAPIServer\Model\BatchRequestCounts
* OpenAPIServer\Model\BatchRequestInput
* OpenAPIServer\Model\BatchRequestOutput
* OpenAPIServer\Model\BatchRequestOutputError
* OpenAPIServer\Model\BatchRequestOutputResponse
* OpenAPIServer\Model\ChatCompletionFunctionCallOption
* OpenAPIServer\Model\ChatCompletionFunctions
* OpenAPIServer\Model\ChatCompletionMessageToolCall
* OpenAPIServer\Model\ChatCompletionMessageToolCallChunk
* OpenAPIServer\Model\ChatCompletionMessageToolCallChunkFunction
* OpenAPIServer\Model\ChatCompletionMessageToolCallFunction
* OpenAPIServer\Model\ChatCompletionNamedToolChoice
* OpenAPIServer\Model\ChatCompletionRequestAssistantMessage
* OpenAPIServer\Model\ChatCompletionRequestAssistantMessageAudio
* OpenAPIServer\Model\ChatCompletionRequestAssistantMessageContent
* OpenAPIServer\Model\ChatCompletionRequestAssistantMessageContentPart
* OpenAPIServer\Model\ChatCompletionRequestAssistantMessageFunctionCall
* OpenAPIServer\Model\ChatCompletionRequestDeveloperMessage
* OpenAPIServer\Model\ChatCompletionRequestDeveloperMessageContent
* OpenAPIServer\Model\ChatCompletionRequestFunctionMessage
* OpenAPIServer\Model\ChatCompletionRequestMessage
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartAudio
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartAudioInputAudio
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartImage
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartImageImageUrl
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartRefusal
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartText
* OpenAPIServer\Model\ChatCompletionRequestSystemMessage
* OpenAPIServer\Model\ChatCompletionRequestSystemMessageContent
* OpenAPIServer\Model\ChatCompletionRequestToolMessage
* OpenAPIServer\Model\ChatCompletionRequestToolMessageContent
* OpenAPIServer\Model\ChatCompletionRequestUserMessage
* OpenAPIServer\Model\ChatCompletionRequestUserMessageContent
* OpenAPIServer\Model\ChatCompletionRequestUserMessageContentPart
* OpenAPIServer\Model\ChatCompletionResponseMessage
* OpenAPIServer\Model\ChatCompletionResponseMessageAudio
* OpenAPIServer\Model\ChatCompletionResponseMessageFunctionCall
* OpenAPIServer\Model\ChatCompletionRole
* OpenAPIServer\Model\ChatCompletionStreamOptions
* OpenAPIServer\Model\ChatCompletionStreamResponseDelta
* OpenAPIServer\Model\ChatCompletionStreamResponseDeltaFunctionCall
* OpenAPIServer\Model\ChatCompletionTokenLogprob
* OpenAPIServer\Model\ChatCompletionTokenLogprobTopLogprobsInner
* OpenAPIServer\Model\ChatCompletionTool
* OpenAPIServer\Model\ChatCompletionToolChoiceOption
* OpenAPIServer\Model\ChunkingStrategyRequestParam
* OpenAPIServer\Model\CompleteUploadRequest
* OpenAPIServer\Model\CompletionUsage
* OpenAPIServer\Model\CompletionUsageCompletionTokensDetails
* OpenAPIServer\Model\CompletionUsagePromptTokensDetails
* OpenAPIServer\Model\CostsResult
* OpenAPIServer\Model\CostsResultAmount
* OpenAPIServer\Model\CreateAssistantRequest
* OpenAPIServer\Model\CreateAssistantRequestModel
* OpenAPIServer\Model\CreateAssistantRequestToolResources
* OpenAPIServer\Model\CreateAssistantRequestToolResourcesCodeInterpreter
* OpenAPIServer\Model\CreateAssistantRequestToolResourcesFileSearch
* OpenAPIServer\Model\CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
* OpenAPIServer\Model\CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
* OpenAPIServer\Model\CreateBatchRequest
* OpenAPIServer\Model\CreateChatCompletionFunctionResponse
* OpenAPIServer\Model\CreateChatCompletionFunctionResponseChoicesInner
* OpenAPIServer\Model\CreateChatCompletionRequest
* OpenAPIServer\Model\CreateChatCompletionRequestAudio
* OpenAPIServer\Model\CreateChatCompletionRequestFunctionCall
* OpenAPIServer\Model\CreateChatCompletionRequestModel
* OpenAPIServer\Model\CreateChatCompletionRequestResponseFormat
* OpenAPIServer\Model\CreateChatCompletionRequestStop
* OpenAPIServer\Model\CreateChatCompletionResponse
* OpenAPIServer\Model\CreateChatCompletionResponseChoicesInner
* OpenAPIServer\Model\CreateChatCompletionResponseChoicesInnerLogprobs
* OpenAPIServer\Model\CreateChatCompletionStreamResponse
* OpenAPIServer\Model\CreateChatCompletionStreamResponseChoicesInner
* OpenAPIServer\Model\CreateChatCompletionStreamResponseUsage
* OpenAPIServer\Model\CreateCompletionRequest
* OpenAPIServer\Model\CreateCompletionRequestModel
* OpenAPIServer\Model\CreateCompletionRequestPrompt
* OpenAPIServer\Model\CreateCompletionRequestStop
* OpenAPIServer\Model\CreateCompletionResponse
* OpenAPIServer\Model\CreateCompletionResponseChoicesInner
* OpenAPIServer\Model\CreateCompletionResponseChoicesInnerLogprobs
* OpenAPIServer\Model\CreateEmbeddingRequest
* OpenAPIServer\Model\CreateEmbeddingRequestInput
* OpenAPIServer\Model\CreateEmbeddingRequestModel
* OpenAPIServer\Model\CreateEmbeddingResponse
* OpenAPIServer\Model\CreateEmbeddingResponseUsage
* OpenAPIServer\Model\CreateFineTuningJobRequest
* OpenAPIServer\Model\CreateFineTuningJobRequestHyperparameters
* OpenAPIServer\Model\CreateFineTuningJobRequestHyperparametersBatchSize
* OpenAPIServer\Model\CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
* OpenAPIServer\Model\CreateFineTuningJobRequestHyperparametersNEpochs
* OpenAPIServer\Model\CreateFineTuningJobRequestIntegrationsInner
* OpenAPIServer\Model\CreateFineTuningJobRequestIntegrationsInnerWandb
* OpenAPIServer\Model\CreateFineTuningJobRequestModel
* OpenAPIServer\Model\CreateImageEditRequestModel
* OpenAPIServer\Model\CreateImageRequest
* OpenAPIServer\Model\CreateImageRequestModel
* OpenAPIServer\Model\CreateMessageRequest
* OpenAPIServer\Model\CreateMessageRequestAttachmentsInner
* OpenAPIServer\Model\CreateMessageRequestAttachmentsInnerToolsInner
* OpenAPIServer\Model\CreateMessageRequestContent
* OpenAPIServer\Model\CreateModerationRequest
* OpenAPIServer\Model\CreateModerationRequestInput
* OpenAPIServer\Model\CreateModerationRequestInputOneOfInner
* OpenAPIServer\Model\CreateModerationRequestInputOneOfInnerOneOf
* OpenAPIServer\Model\CreateModerationRequestInputOneOfInnerOneOf1
* OpenAPIServer\Model\CreateModerationRequestInputOneOfInnerOneOfImageUrl
* OpenAPIServer\Model\CreateModerationRequestModel
* OpenAPIServer\Model\CreateModerationResponse
* OpenAPIServer\Model\CreateModerationResponseResultsInner
* OpenAPIServer\Model\CreateModerationResponseResultsInnerCategories
* OpenAPIServer\Model\CreateModerationResponseResultsInnerCategoryAppliedInputTypes
* OpenAPIServer\Model\CreateModerationResponseResultsInnerCategoryScores
* OpenAPIServer\Model\CreateRunRequest
* OpenAPIServer\Model\CreateRunRequestModel
* OpenAPIServer\Model\CreateSpeechRequest
* OpenAPIServer\Model\CreateSpeechRequestModel
* OpenAPIServer\Model\CreateThreadAndRunRequest
* OpenAPIServer\Model\CreateThreadAndRunRequestToolResources
* OpenAPIServer\Model\CreateThreadAndRunRequestToolsInner
* OpenAPIServer\Model\CreateThreadRequest
* OpenAPIServer\Model\CreateThreadRequestToolResources
* OpenAPIServer\Model\CreateThreadRequestToolResourcesFileSearch
* OpenAPIServer\Model\CreateThreadRequestToolResourcesFileSearchVectorStoresInner
* OpenAPIServer\Model\CreateTranscription200Response
* OpenAPIServer\Model\CreateTranscriptionRequestModel
* OpenAPIServer\Model\CreateTranscriptionResponseJson
* OpenAPIServer\Model\CreateTranscriptionResponseVerboseJson
* OpenAPIServer\Model\CreateTranslation200Response
* OpenAPIServer\Model\CreateTranslationResponseJson
* OpenAPIServer\Model\CreateTranslationResponseVerboseJson
* OpenAPIServer\Model\CreateUploadRequest
* OpenAPIServer\Model\CreateVectorStoreFileBatchRequest
* OpenAPIServer\Model\CreateVectorStoreFileRequest
* OpenAPIServer\Model\CreateVectorStoreRequest
* OpenAPIServer\Model\CreateVectorStoreRequestChunkingStrategy
* OpenAPIServer\Model\DefaultProjectErrorResponse
* OpenAPIServer\Model\DeleteAssistantResponse
* OpenAPIServer\Model\DeleteFileResponse
* OpenAPIServer\Model\DeleteMessageResponse
* OpenAPIServer\Model\DeleteModelResponse
* OpenAPIServer\Model\DeleteThreadResponse
* OpenAPIServer\Model\DeleteVectorStoreFileResponse
* OpenAPIServer\Model\DeleteVectorStoreResponse
* OpenAPIServer\Model\DoneEvent
* OpenAPIServer\Model\Embedding
* OpenAPIServer\Model\Error
* OpenAPIServer\Model\ErrorEvent
* OpenAPIServer\Model\ErrorResponse
* OpenAPIServer\Model\FileSearchRankingOptions
* OpenAPIServer\Model\FineTuneChatCompletionRequestAssistantMessage
* OpenAPIServer\Model\FineTuneChatRequestInput
* OpenAPIServer\Model\FineTuneChatRequestInputMessagesInner
* OpenAPIServer\Model\FineTuneCompletionRequestInput
* OpenAPIServer\Model\FineTuneDPOMethod
* OpenAPIServer\Model\FineTuneDPOMethodHyperparameters
* OpenAPIServer\Model\FineTuneDPOMethodHyperparametersBatchSize
* OpenAPIServer\Model\FineTuneDPOMethodHyperparametersBeta
* OpenAPIServer\Model\FineTuneDPOMethodHyperparametersLearningRateMultiplier
* OpenAPIServer\Model\FineTuneDPOMethodHyperparametersNEpochs
* OpenAPIServer\Model\FineTuneMethod
* OpenAPIServer\Model\FineTunePreferenceRequestInput
* OpenAPIServer\Model\FineTunePreferenceRequestInputInput
* OpenAPIServer\Model\FineTunePreferenceRequestInputPreferredCompletionInner
* OpenAPIServer\Model\FineTuneSupervisedMethod
* OpenAPIServer\Model\FineTuneSupervisedMethodHyperparameters
* OpenAPIServer\Model\FineTuningIntegration
* OpenAPIServer\Model\FineTuningJob
* OpenAPIServer\Model\FineTuningJobCheckpoint
* OpenAPIServer\Model\FineTuningJobCheckpointMetrics
* OpenAPIServer\Model\FineTuningJobError
* OpenAPIServer\Model\FineTuningJobEvent
* OpenAPIServer\Model\FineTuningJobHyperparameters
* OpenAPIServer\Model\FineTuningJobIntegrationsInner
* OpenAPIServer\Model\FunctionObject
* OpenAPIServer\Model\Image
* OpenAPIServer\Model\ImagesResponse
* OpenAPIServer\Model\Invite
* OpenAPIServer\Model\InviteDeleteResponse
* OpenAPIServer\Model\InviteListResponse
* OpenAPIServer\Model\InviteProjectsInner
* OpenAPIServer\Model\InviteRequest
* OpenAPIServer\Model\InviteRequestProjectsInner
* OpenAPIServer\Model\ListAssistantsResponse
* OpenAPIServer\Model\ListAuditLogsEffectiveAtParameter
* OpenAPIServer\Model\ListAuditLogsResponse
* OpenAPIServer\Model\ListBatchesResponse
* OpenAPIServer\Model\ListFilesResponse
* OpenAPIServer\Model\ListFineTuningJobCheckpointsResponse
* OpenAPIServer\Model\ListFineTuningJobEventsResponse
* OpenAPIServer\Model\ListMessagesResponse
* OpenAPIServer\Model\ListModelsResponse
* OpenAPIServer\Model\ListPaginatedFineTuningJobsResponse
* OpenAPIServer\Model\ListRunStepsResponse
* OpenAPIServer\Model\ListRunsResponse
* OpenAPIServer\Model\ListThreadsResponse
* OpenAPIServer\Model\ListVectorStoreFilesResponse
* OpenAPIServer\Model\ListVectorStoresResponse
* OpenAPIServer\Model\MessageContentImageFileObject
* OpenAPIServer\Model\MessageContentImageFileObjectImageFile
* OpenAPIServer\Model\MessageContentImageUrlObject
* OpenAPIServer\Model\MessageContentImageUrlObjectImageUrl
* OpenAPIServer\Model\MessageContentRefusalObject
* OpenAPIServer\Model\MessageContentTextAnnotationsFileCitationObject
* OpenAPIServer\Model\MessageContentTextAnnotationsFileCitationObjectFileCitation
* OpenAPIServer\Model\MessageContentTextAnnotationsFilePathObject
* OpenAPIServer\Model\MessageContentTextAnnotationsFilePathObjectFilePath
* OpenAPIServer\Model\MessageContentTextObject
* OpenAPIServer\Model\MessageContentTextObjectText
* OpenAPIServer\Model\MessageContentTextObjectTextAnnotationsInner
* OpenAPIServer\Model\MessageDeltaContentImageFileObject
* OpenAPIServer\Model\MessageDeltaContentImageFileObjectImageFile
* OpenAPIServer\Model\MessageDeltaContentImageUrlObject
* OpenAPIServer\Model\MessageDeltaContentImageUrlObjectImageUrl
* OpenAPIServer\Model\MessageDeltaContentRefusalObject
* OpenAPIServer\Model\MessageDeltaContentTextAnnotationsFileCitationObject
* OpenAPIServer\Model\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
* OpenAPIServer\Model\MessageDeltaContentTextAnnotationsFilePathObject
* OpenAPIServer\Model\MessageDeltaContentTextAnnotationsFilePathObjectFilePath
* OpenAPIServer\Model\MessageDeltaContentTextObject
* OpenAPIServer\Model\MessageDeltaContentTextObjectText
* OpenAPIServer\Model\MessageDeltaContentTextObjectTextAnnotationsInner
* OpenAPIServer\Model\MessageDeltaObject
* OpenAPIServer\Model\MessageDeltaObjectDelta
* OpenAPIServer\Model\MessageDeltaObjectDeltaContentInner
* OpenAPIServer\Model\MessageObject
* OpenAPIServer\Model\MessageObjectContentInner
* OpenAPIServer\Model\MessageObjectIncompleteDetails
* OpenAPIServer\Model\MessageRequestContentTextObject
* OpenAPIServer\Model\MessageStreamEvent
* OpenAPIServer\Model\MessageStreamEventOneOf
* OpenAPIServer\Model\MessageStreamEventOneOf1
* OpenAPIServer\Model\MessageStreamEventOneOf2
* OpenAPIServer\Model\MessageStreamEventOneOf3
* OpenAPIServer\Model\MessageStreamEventOneOf4
* OpenAPIServer\Model\Model
* OpenAPIServer\Model\ModifyAssistantRequest
* OpenAPIServer\Model\ModifyAssistantRequestToolResources
* OpenAPIServer\Model\ModifyAssistantRequestToolResourcesCodeInterpreter
* OpenAPIServer\Model\ModifyAssistantRequestToolResourcesFileSearch
* OpenAPIServer\Model\ModifyMessageRequest
* OpenAPIServer\Model\ModifyRunRequest
* OpenAPIServer\Model\ModifyThreadRequest
* OpenAPIServer\Model\ModifyThreadRequestToolResources
* OpenAPIServer\Model\ModifyThreadRequestToolResourcesFileSearch
* OpenAPIServer\Model\OpenAIFile
* OpenAPIServer\Model\OtherChunkingStrategyResponseParam
* OpenAPIServer\Model\PredictionContent
* OpenAPIServer\Model\PredictionContentContent
* OpenAPIServer\Model\Project
* OpenAPIServer\Model\ProjectApiKey
* OpenAPIServer\Model\ProjectApiKeyDeleteResponse
* OpenAPIServer\Model\ProjectApiKeyListResponse
* OpenAPIServer\Model\ProjectApiKeyOwner
* OpenAPIServer\Model\ProjectCreateRequest
* OpenAPIServer\Model\ProjectListResponse
* OpenAPIServer\Model\ProjectRateLimit
* OpenAPIServer\Model\ProjectRateLimitListResponse
* OpenAPIServer\Model\ProjectRateLimitUpdateRequest
* OpenAPIServer\Model\ProjectServiceAccount
* OpenAPIServer\Model\ProjectServiceAccountApiKey
* OpenAPIServer\Model\ProjectServiceAccountCreateRequest
* OpenAPIServer\Model\ProjectServiceAccountCreateResponse
* OpenAPIServer\Model\ProjectServiceAccountDeleteResponse
* OpenAPIServer\Model\ProjectServiceAccountListResponse
* OpenAPIServer\Model\ProjectUpdateRequest
* OpenAPIServer\Model\ProjectUser
* OpenAPIServer\Model\ProjectUserCreateRequest
* OpenAPIServer\Model\ProjectUserDeleteResponse
* OpenAPIServer\Model\ProjectUserListResponse
* OpenAPIServer\Model\ProjectUserUpdateRequest
* OpenAPIServer\Model\RealtimeClientEventConversationItemCreate
* OpenAPIServer\Model\RealtimeClientEventConversationItemDelete
* OpenAPIServer\Model\RealtimeClientEventConversationItemTruncate
* OpenAPIServer\Model\RealtimeClientEventInputAudioBufferAppend
* OpenAPIServer\Model\RealtimeClientEventInputAudioBufferClear
* OpenAPIServer\Model\RealtimeClientEventInputAudioBufferCommit
* OpenAPIServer\Model\RealtimeClientEventResponseCancel
* OpenAPIServer\Model\RealtimeClientEventResponseCreate
* OpenAPIServer\Model\RealtimeClientEventSessionUpdate
* OpenAPIServer\Model\RealtimeConversationItem
* OpenAPIServer\Model\RealtimeConversationItemContentInner
* OpenAPIServer\Model\RealtimeResponse
* OpenAPIServer\Model\RealtimeResponseCreateParams
* OpenAPIServer\Model\RealtimeResponseCreateParamsConversation
* OpenAPIServer\Model\RealtimeResponseCreateParamsMaxResponseOutputTokens
* OpenAPIServer\Model\RealtimeResponseCreateParamsToolsInner
* OpenAPIServer\Model\RealtimeResponseStatusDetails
* OpenAPIServer\Model\RealtimeResponseStatusDetailsError
* OpenAPIServer\Model\RealtimeResponseUsage
* OpenAPIServer\Model\RealtimeResponseUsageInputTokenDetails
* OpenAPIServer\Model\RealtimeResponseUsageOutputTokenDetails
* OpenAPIServer\Model\RealtimeServerEventConversationCreated
* OpenAPIServer\Model\RealtimeServerEventConversationCreatedConversation
* OpenAPIServer\Model\RealtimeServerEventConversationItemCreated
* OpenAPIServer\Model\RealtimeServerEventConversationItemDeleted
* OpenAPIServer\Model\RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
* OpenAPIServer\Model\RealtimeServerEventConversationItemInputAudioTranscriptionFailed
* OpenAPIServer\Model\RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
* OpenAPIServer\Model\RealtimeServerEventConversationItemTruncated
* OpenAPIServer\Model\RealtimeServerEventError
* OpenAPIServer\Model\RealtimeServerEventErrorError
* OpenAPIServer\Model\RealtimeServerEventInputAudioBufferCleared
* OpenAPIServer\Model\RealtimeServerEventInputAudioBufferCommitted
* OpenAPIServer\Model\RealtimeServerEventInputAudioBufferSpeechStarted
* OpenAPIServer\Model\RealtimeServerEventInputAudioBufferSpeechStopped
* OpenAPIServer\Model\RealtimeServerEventRateLimitsUpdated
* OpenAPIServer\Model\RealtimeServerEventRateLimitsUpdatedRateLimitsInner
* OpenAPIServer\Model\RealtimeServerEventResponseAudioDelta
* OpenAPIServer\Model\RealtimeServerEventResponseAudioDone
* OpenAPIServer\Model\RealtimeServerEventResponseAudioTranscriptDelta
* OpenAPIServer\Model\RealtimeServerEventResponseAudioTranscriptDone
* OpenAPIServer\Model\RealtimeServerEventResponseContentPartAdded
* OpenAPIServer\Model\RealtimeServerEventResponseContentPartAddedPart
* OpenAPIServer\Model\RealtimeServerEventResponseContentPartDone
* OpenAPIServer\Model\RealtimeServerEventResponseContentPartDonePart
* OpenAPIServer\Model\RealtimeServerEventResponseCreated
* OpenAPIServer\Model\RealtimeServerEventResponseDone
* OpenAPIServer\Model\RealtimeServerEventResponseFunctionCallArgumentsDelta
* OpenAPIServer\Model\RealtimeServerEventResponseFunctionCallArgumentsDone
* OpenAPIServer\Model\RealtimeServerEventResponseOutputItemAdded
* OpenAPIServer\Model\RealtimeServerEventResponseOutputItemDone
* OpenAPIServer\Model\RealtimeServerEventResponseTextDelta
* OpenAPIServer\Model\RealtimeServerEventResponseTextDone
* OpenAPIServer\Model\RealtimeServerEventSessionCreated
* OpenAPIServer\Model\RealtimeServerEventSessionUpdated
* OpenAPIServer\Model\RealtimeSession
* OpenAPIServer\Model\RealtimeSessionCreateRequest
* OpenAPIServer\Model\RealtimeSessionCreateRequestTurnDetection
* OpenAPIServer\Model\RealtimeSessionCreateResponse
* OpenAPIServer\Model\RealtimeSessionCreateResponseClientSecret
* OpenAPIServer\Model\RealtimeSessionCreateResponseTurnDetection
* OpenAPIServer\Model\RealtimeSessionInputAudioTranscription
* OpenAPIServer\Model\RealtimeSessionModel
* OpenAPIServer\Model\RealtimeSessionTurnDetection
* OpenAPIServer\Model\ResponseFormatJsonObject
* OpenAPIServer\Model\ResponseFormatJsonSchema
* OpenAPIServer\Model\ResponseFormatJsonSchemaJsonSchema
* OpenAPIServer\Model\ResponseFormatText
* OpenAPIServer\Model\RunCompletionUsage
* OpenAPIServer\Model\RunObject
* OpenAPIServer\Model\RunObjectIncompleteDetails
* OpenAPIServer\Model\RunObjectLastError
* OpenAPIServer\Model\RunObjectRequiredAction
* OpenAPIServer\Model\RunObjectRequiredActionSubmitToolOutputs
* OpenAPIServer\Model\RunStepCompletionUsage
* OpenAPIServer\Model\RunStepDeltaObject
* OpenAPIServer\Model\RunStepDeltaObjectDelta
* OpenAPIServer\Model\RunStepDeltaObjectDeltaStepDetails
* OpenAPIServer\Model\RunStepDeltaStepDetailsMessageCreationObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsFileSearchObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsFunctionObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
* OpenAPIServer\Model\RunStepDetailsMessageCreationObject
* OpenAPIServer\Model\RunStepDetailsMessageCreationObjectMessageCreation
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeObject
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeObjectCodeInterpreter
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeOutputImageObject
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeOutputImageObjectImage
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeOutputLogsObject
* OpenAPIServer\Model\RunStepDetailsToolCallsFileSearchObject
* OpenAPIServer\Model\RunStepDetailsToolCallsFileSearchObjectFileSearch
* OpenAPIServer\Model\RunStepDetailsToolCallsFileSearchRankingOptionsObject
* OpenAPIServer\Model\RunStepDetailsToolCallsFileSearchResultObject
* OpenAPIServer\Model\RunStepDetailsToolCallsFileSearchResultObjectContentInner
* OpenAPIServer\Model\RunStepDetailsToolCallsFunctionObject
* OpenAPIServer\Model\RunStepDetailsToolCallsFunctionObjectFunction
* OpenAPIServer\Model\RunStepDetailsToolCallsObject
* OpenAPIServer\Model\RunStepDetailsToolCallsObjectToolCallsInner
* OpenAPIServer\Model\RunStepObject
* OpenAPIServer\Model\RunStepObjectLastError
* OpenAPIServer\Model\RunStepObjectStepDetails
* OpenAPIServer\Model\RunStepStreamEvent
* OpenAPIServer\Model\RunStepStreamEventOneOf
* OpenAPIServer\Model\RunStepStreamEventOneOf1
* OpenAPIServer\Model\RunStepStreamEventOneOf2
* OpenAPIServer\Model\RunStepStreamEventOneOf3
* OpenAPIServer\Model\RunStepStreamEventOneOf4
* OpenAPIServer\Model\RunStepStreamEventOneOf5
* OpenAPIServer\Model\RunStepStreamEventOneOf6
* OpenAPIServer\Model\RunStreamEvent
* OpenAPIServer\Model\RunStreamEventOneOf
* OpenAPIServer\Model\RunStreamEventOneOf1
* OpenAPIServer\Model\RunStreamEventOneOf2
* OpenAPIServer\Model\RunStreamEventOneOf3
* OpenAPIServer\Model\RunStreamEventOneOf4
* OpenAPIServer\Model\RunStreamEventOneOf5
* OpenAPIServer\Model\RunStreamEventOneOf6
* OpenAPIServer\Model\RunStreamEventOneOf7
* OpenAPIServer\Model\RunStreamEventOneOf8
* OpenAPIServer\Model\RunStreamEventOneOf9
* OpenAPIServer\Model\RunToolCallObject
* OpenAPIServer\Model\RunToolCallObjectFunction
* OpenAPIServer\Model\StaticChunkingStrategy
* OpenAPIServer\Model\StaticChunkingStrategyRequestParam
* OpenAPIServer\Model\StaticChunkingStrategyResponseParam
* OpenAPIServer\Model\StaticChunkingStrategyStatic
* OpenAPIServer\Model\SubmitToolOutputsRunRequest
* OpenAPIServer\Model\SubmitToolOutputsRunRequestToolOutputsInner
* OpenAPIServer\Model\ThreadObject
* OpenAPIServer\Model\ThreadStreamEvent
* OpenAPIServer\Model\TranscriptionSegment
* OpenAPIServer\Model\TranscriptionWord
* OpenAPIServer\Model\TruncationObject
* OpenAPIServer\Model\UpdateVectorStoreRequest
* OpenAPIServer\Model\Upload
* OpenAPIServer\Model\UploadPart
* OpenAPIServer\Model\UsageAudioSpeechesResult
* OpenAPIServer\Model\UsageAudioTranscriptionsResult
* OpenAPIServer\Model\UsageCodeInterpreterSessionsResult
* OpenAPIServer\Model\UsageCompletionsResult
* OpenAPIServer\Model\UsageEmbeddingsResult
* OpenAPIServer\Model\UsageImagesResult
* OpenAPIServer\Model\UsageModerationsResult
* OpenAPIServer\Model\UsageResponse
* OpenAPIServer\Model\UsageTimeBucket
* OpenAPIServer\Model\UsageTimeBucketResultInner
* OpenAPIServer\Model\UsageVectorStoresResult
* OpenAPIServer\Model\User
* OpenAPIServer\Model\UserDeleteResponse
* OpenAPIServer\Model\UserListResponse
* OpenAPIServer\Model\UserRoleUpdateRequest
* OpenAPIServer\Model\VectorStoreExpirationAfter
* OpenAPIServer\Model\VectorStoreFileBatchObject
* OpenAPIServer\Model\VectorStoreFileBatchObjectFileCounts
* OpenAPIServer\Model\VectorStoreFileObject
* OpenAPIServer\Model\VectorStoreFileObjectChunkingStrategy
* OpenAPIServer\Model\VectorStoreFileObjectLastError
* OpenAPIServer\Model\VectorStoreObject
* OpenAPIServer\Model\VectorStoreObjectFileCounts


## Authentication

### Security schema `ApiKeyAuth`
> Important! To make Bearer authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BearerAuthenticator](./src/Auth/BearerAuthenticator.php) class.

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
