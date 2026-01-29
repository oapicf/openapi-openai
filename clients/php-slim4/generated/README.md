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
*AbstractAssistantsApi* | **createAssistantFile** | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
*AbstractAssistantsApi* | **createMessage** | **POST** /threads/{thread_id}/messages | Create a message.
*AbstractAssistantsApi* | **createRun** | **POST** /threads/{thread_id}/runs | Create a run.
*AbstractAssistantsApi* | **deleteAssistant** | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AbstractAssistantsApi* | **deleteAssistantFile** | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
*AbstractAssistantsApi* | **deleteThread** | **DELETE** /threads/{thread_id} | Delete a thread.
*AbstractAssistantsApi* | **getAssistant** | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AbstractAssistantsApi* | **getAssistantFile** | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
*AbstractAssistantsApi* | **getMessage** | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AbstractAssistantsApi* | **getMessageFile** | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
*AbstractAssistantsApi* | **getRun** | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AbstractAssistantsApi* | **getRunStep** | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AbstractAssistantsApi* | **getThread** | **GET** /threads/{thread_id} | Retrieves a thread.
*AbstractAssistantsApi* | **listAssistantFiles** | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files.
*AbstractAssistantsApi* | **listMessageFiles** | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
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
*AbstractChatApi* | **createChatCompletion** | **POST** /chat/completions | Creates a model response for the given chat conversation.
*AbstractCompletionsApi* | **createCompletion** | **POST** /completions | Creates a completion for the provided prompt and parameters.
*AbstractEmbeddingsApi* | **createEmbedding** | **POST** /embeddings | Creates an embedding vector representing the input text.
*AbstractFilesApi* | **createFile** | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
*AbstractFilesApi* | **listFiles** | **GET** /files | Returns a list of files that belong to the user's organization.
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
*AbstractModelsApi* | **listModels** | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*AbstractModelsApi* | **deleteModel** | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*AbstractModelsApi* | **retrieveModel** | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*AbstractModerationsApi* | **createModeration** | **POST** /moderations | Classifies if text is potentially harmful.


## Models

* OpenAPIServer\Model\AssistantFileObject
* OpenAPIServer\Model\AssistantObject
* OpenAPIServer\Model\AssistantObjectToolsInner
* OpenAPIServer\Model\AssistantStreamEvent
* OpenAPIServer\Model\AssistantToolsCode
* OpenAPIServer\Model\AssistantToolsFunction
* OpenAPIServer\Model\AssistantToolsRetrieval
* OpenAPIServer\Model\AssistantsApiNamedToolChoice
* OpenAPIServer\Model\AssistantsApiResponseFormat
* OpenAPIServer\Model\AssistantsApiResponseFormatOption
* OpenAPIServer\Model\AssistantsApiToolChoiceOption
* OpenAPIServer\Model\ChatCompletionFunctionCallOption
* OpenAPIServer\Model\ChatCompletionFunctions
* OpenAPIServer\Model\ChatCompletionMessageToolCall
* OpenAPIServer\Model\ChatCompletionMessageToolCallChunk
* OpenAPIServer\Model\ChatCompletionMessageToolCallChunkFunction
* OpenAPIServer\Model\ChatCompletionMessageToolCallFunction
* OpenAPIServer\Model\ChatCompletionNamedToolChoice
* OpenAPIServer\Model\ChatCompletionNamedToolChoiceFunction
* OpenAPIServer\Model\ChatCompletionRequestAssistantMessage
* OpenAPIServer\Model\ChatCompletionRequestAssistantMessageFunctionCall
* OpenAPIServer\Model\ChatCompletionRequestFunctionMessage
* OpenAPIServer\Model\ChatCompletionRequestMessage
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPart
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartImage
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartImageImageUrl
* OpenAPIServer\Model\ChatCompletionRequestMessageContentPartText
* OpenAPIServer\Model\ChatCompletionRequestSystemMessage
* OpenAPIServer\Model\ChatCompletionRequestToolMessage
* OpenAPIServer\Model\ChatCompletionRequestUserMessage
* OpenAPIServer\Model\ChatCompletionRequestUserMessageContent
* OpenAPIServer\Model\ChatCompletionResponseMessage
* OpenAPIServer\Model\ChatCompletionRole
* OpenAPIServer\Model\ChatCompletionStreamResponseDelta
* OpenAPIServer\Model\ChatCompletionStreamResponseDeltaFunctionCall
* OpenAPIServer\Model\ChatCompletionTokenLogprob
* OpenAPIServer\Model\ChatCompletionTokenLogprobTopLogprobsInner
* OpenAPIServer\Model\ChatCompletionTool
* OpenAPIServer\Model\ChatCompletionToolChoiceOption
* OpenAPIServer\Model\CompletionUsage
* OpenAPIServer\Model\CreateAssistantFileRequest
* OpenAPIServer\Model\CreateAssistantRequest
* OpenAPIServer\Model\CreateAssistantRequestModel
* OpenAPIServer\Model\CreateChatCompletionFunctionResponse
* OpenAPIServer\Model\CreateChatCompletionFunctionResponseChoicesInner
* OpenAPIServer\Model\CreateChatCompletionRequest
* OpenAPIServer\Model\CreateChatCompletionRequestFunctionCall
* OpenAPIServer\Model\CreateChatCompletionRequestModel
* OpenAPIServer\Model\CreateChatCompletionRequestResponseFormat
* OpenAPIServer\Model\CreateChatCompletionRequestStop
* OpenAPIServer\Model\CreateChatCompletionResponse
* OpenAPIServer\Model\CreateChatCompletionResponseChoicesInner
* OpenAPIServer\Model\CreateChatCompletionResponseChoicesInnerLogprobs
* OpenAPIServer\Model\CreateChatCompletionStreamResponse
* OpenAPIServer\Model\CreateChatCompletionStreamResponseChoicesInner
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
* OpenAPIServer\Model\CreateModerationRequest
* OpenAPIServer\Model\CreateModerationRequestInput
* OpenAPIServer\Model\CreateModerationRequestModel
* OpenAPIServer\Model\CreateModerationResponse
* OpenAPIServer\Model\CreateModerationResponseResultsInner
* OpenAPIServer\Model\CreateModerationResponseResultsInnerCategories
* OpenAPIServer\Model\CreateModerationResponseResultsInnerCategoryScores
* OpenAPIServer\Model\CreateRunRequest
* OpenAPIServer\Model\CreateRunRequestModel
* OpenAPIServer\Model\CreateSpeechRequest
* OpenAPIServer\Model\CreateSpeechRequestModel
* OpenAPIServer\Model\CreateThreadAndRunRequest
* OpenAPIServer\Model\CreateThreadAndRunRequestToolsInner
* OpenAPIServer\Model\CreateThreadRequest
* OpenAPIServer\Model\CreateTranscription200Response
* OpenAPIServer\Model\CreateTranscriptionRequestModel
* OpenAPIServer\Model\CreateTranscriptionResponseJson
* OpenAPIServer\Model\CreateTranscriptionResponseVerboseJson
* OpenAPIServer\Model\CreateTranslation200Response
* OpenAPIServer\Model\CreateTranslationResponseJson
* OpenAPIServer\Model\CreateTranslationResponseVerboseJson
* OpenAPIServer\Model\DeleteAssistantFileResponse
* OpenAPIServer\Model\DeleteAssistantResponse
* OpenAPIServer\Model\DeleteFileResponse
* OpenAPIServer\Model\DeleteMessageResponse
* OpenAPIServer\Model\DeleteModelResponse
* OpenAPIServer\Model\DeleteThreadResponse
* OpenAPIServer\Model\DoneEvent
* OpenAPIServer\Model\Embedding
* OpenAPIServer\Model\Error
* OpenAPIServer\Model\ErrorEvent
* OpenAPIServer\Model\ErrorResponse
* OpenAPIServer\Model\FineTuningIntegration
* OpenAPIServer\Model\FineTuningJob
* OpenAPIServer\Model\FineTuningJobCheckpoint
* OpenAPIServer\Model\FineTuningJobCheckpointMetrics
* OpenAPIServer\Model\FineTuningJobError
* OpenAPIServer\Model\FineTuningJobEvent
* OpenAPIServer\Model\FineTuningJobHyperparameters
* OpenAPIServer\Model\FineTuningJobHyperparametersNEpochs
* OpenAPIServer\Model\FineTuningJobIntegrationsInner
* OpenAPIServer\Model\FunctionObject
* OpenAPIServer\Model\Image
* OpenAPIServer\Model\ImagesResponse
* OpenAPIServer\Model\ListAssistantFilesResponse
* OpenAPIServer\Model\ListAssistantsResponse
* OpenAPIServer\Model\ListFilesResponse
* OpenAPIServer\Model\ListFineTuningJobCheckpointsResponse
* OpenAPIServer\Model\ListFineTuningJobEventsResponse
* OpenAPIServer\Model\ListMessageFilesResponse
* OpenAPIServer\Model\ListMessagesResponse
* OpenAPIServer\Model\ListModelsResponse
* OpenAPIServer\Model\ListPaginatedFineTuningJobsResponse
* OpenAPIServer\Model\ListRunStepsResponse
* OpenAPIServer\Model\ListRunsResponse
* OpenAPIServer\Model\ListThreadsResponse
* OpenAPIServer\Model\MessageContentImageFileObject
* OpenAPIServer\Model\MessageContentImageFileObjectImageFile
* OpenAPIServer\Model\MessageContentTextAnnotationsFileCitationObject
* OpenAPIServer\Model\MessageContentTextAnnotationsFileCitationObjectFileCitation
* OpenAPIServer\Model\MessageContentTextAnnotationsFilePathObject
* OpenAPIServer\Model\MessageContentTextAnnotationsFilePathObjectFilePath
* OpenAPIServer\Model\MessageContentTextObject
* OpenAPIServer\Model\MessageContentTextObjectText
* OpenAPIServer\Model\MessageContentTextObjectTextAnnotationsInner
* OpenAPIServer\Model\MessageDeltaContentImageFileObject
* OpenAPIServer\Model\MessageDeltaContentImageFileObjectImageFile
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
* OpenAPIServer\Model\MessageFileObject
* OpenAPIServer\Model\MessageObject
* OpenAPIServer\Model\MessageObjectContentInner
* OpenAPIServer\Model\MessageObjectIncompleteDetails
* OpenAPIServer\Model\MessageStreamEvent
* OpenAPIServer\Model\MessageStreamEventOneOf
* OpenAPIServer\Model\MessageStreamEventOneOf1
* OpenAPIServer\Model\MessageStreamEventOneOf2
* OpenAPIServer\Model\MessageStreamEventOneOf3
* OpenAPIServer\Model\MessageStreamEventOneOf4
* OpenAPIServer\Model\Model
* OpenAPIServer\Model\ModifyAssistantRequest
* OpenAPIServer\Model\ModifyMessageRequest
* OpenAPIServer\Model\ModifyRunRequest
* OpenAPIServer\Model\ModifyThreadRequest
* OpenAPIServer\Model\OpenAIFile
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
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsFunctionObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsObject
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
* OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsRetrievalObject
* OpenAPIServer\Model\RunStepDetailsMessageCreationObject
* OpenAPIServer\Model\RunStepDetailsMessageCreationObjectMessageCreation
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeObject
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeObjectCodeInterpreter
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeOutputImageObject
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeOutputImageObjectImage
* OpenAPIServer\Model\RunStepDetailsToolCallsCodeOutputLogsObject
* OpenAPIServer\Model\RunStepDetailsToolCallsFunctionObject
* OpenAPIServer\Model\RunStepDetailsToolCallsFunctionObjectFunction
* OpenAPIServer\Model\RunStepDetailsToolCallsObject
* OpenAPIServer\Model\RunStepDetailsToolCallsObjectToolCallsInner
* OpenAPIServer\Model\RunStepDetailsToolCallsRetrievalObject
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
* OpenAPIServer\Model\RunToolCallObject
* OpenAPIServer\Model\RunToolCallObjectFunction
* OpenAPIServer\Model\SubmitToolOutputsRunRequest
* OpenAPIServer\Model\SubmitToolOutputsRunRequestToolOutputsInner
* OpenAPIServer\Model\ThreadObject
* OpenAPIServer\Model\ThreadStreamEvent
* OpenAPIServer\Model\TranscriptionSegment
* OpenAPIServer\Model\TranscriptionWord
* OpenAPIServer\Model\TruncationObject


## Authentication

### Security schema `ApiKeyAuth`
> Important! To make Bearer authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BearerAuthenticator](./src/Auth/BearerAuthenticator.php) class.

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
