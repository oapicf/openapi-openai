# php-base - PHP Slim 4 Server library for OpenAI API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.
[PHP-DI](https://php-di.org/doc/frameworks/slim.html) package used as dependency container.

## Requirements

* Web server with URL rewriting
* PHP 7.4 or newer

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

Switch your app environment to development in `public/.htaccess` file:
```ini
## .htaccess
<IfModule mod_env.c>
    SetEnv APP_ENV 'development'
</IfModule>
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
*AbstractOpenAIApi* | **createChatCompletion** | **POST** /chat/completions | Creates a model response for the given chat conversation.
*AbstractOpenAIApi* | **createCompletion** | **POST** /completions | Creates a completion for the provided prompt and parameters.
*AbstractOpenAIApi* | **createEdit** | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*AbstractOpenAIApi* | **createEmbedding** | **POST** /embeddings | Creates an embedding vector representing the input text.
*AbstractOpenAIApi* | **createFile** | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
*AbstractOpenAIApi* | **createFineTune** | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
*AbstractOpenAIApi* | **createImage** | **POST** /images/generations | Creates an image given a prompt.
*AbstractOpenAIApi* | **createImageEdit** | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*AbstractOpenAIApi* | **createImageVariation** | **POST** /images/variations | Creates a variation of a given image.
*AbstractOpenAIApi* | **createModeration** | **POST** /moderations | Classifies if text violates OpenAI's Content Policy
*AbstractOpenAIApi* | **createTranscription** | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AbstractOpenAIApi* | **createTranslation** | **POST** /audio/translations | Translates audio into English.
*AbstractOpenAIApi* | **listFiles** | **GET** /files | Returns a list of files that belong to the user's organization.
*AbstractOpenAIApi* | **listFineTunes** | **GET** /fine-tunes | List your organization's fine-tuning jobs
*AbstractOpenAIApi* | **listModels** | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*AbstractOpenAIApi* | **cancelFineTune** | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.
*AbstractOpenAIApi* | **deleteFile** | **DELETE** /files/{file_id} | Delete a file.
*AbstractOpenAIApi* | **deleteModel** | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*AbstractOpenAIApi* | **downloadFile** | **GET** /files/{file_id}/content | Returns the contents of the specified file
*AbstractOpenAIApi* | **listFineTuneEvents** | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.
*AbstractOpenAIApi* | **retrieveFile** | **GET** /files/{file_id} | Returns information about a specific file.
*AbstractOpenAIApi* | **retrieveFineTune** | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
*AbstractOpenAIApi* | **retrieveModel** | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Models

* OpenAPIServer\Model\ChatCompletionFunctions
* OpenAPIServer\Model\ChatCompletionRequestMessage
* OpenAPIServer\Model\ChatCompletionRequestMessageFunctionCall
* OpenAPIServer\Model\ChatCompletionResponseMessage
* OpenAPIServer\Model\ChatCompletionStreamResponseDelta
* OpenAPIServer\Model\CreateChatCompletionRequest
* OpenAPIServer\Model\CreateChatCompletionRequestFunctionCall
* OpenAPIServer\Model\CreateChatCompletionRequestFunctionCallOneOf
* OpenAPIServer\Model\CreateChatCompletionRequestModel
* OpenAPIServer\Model\CreateChatCompletionRequestStop
* OpenAPIServer\Model\CreateChatCompletionResponse
* OpenAPIServer\Model\CreateChatCompletionResponseChoicesInner
* OpenAPIServer\Model\CreateChatCompletionStreamResponse
* OpenAPIServer\Model\CreateChatCompletionStreamResponseChoicesInner
* OpenAPIServer\Model\CreateCompletionRequest
* OpenAPIServer\Model\CreateCompletionRequestModel
* OpenAPIServer\Model\CreateCompletionRequestPrompt
* OpenAPIServer\Model\CreateCompletionRequestStop
* OpenAPIServer\Model\CreateCompletionResponse
* OpenAPIServer\Model\CreateCompletionResponseChoicesInner
* OpenAPIServer\Model\CreateCompletionResponseChoicesInnerLogprobs
* OpenAPIServer\Model\CreateCompletionResponseUsage
* OpenAPIServer\Model\CreateEditRequest
* OpenAPIServer\Model\CreateEditRequestModel
* OpenAPIServer\Model\CreateEditResponse
* OpenAPIServer\Model\CreateEditResponseChoicesInner
* OpenAPIServer\Model\CreateEmbeddingRequest
* OpenAPIServer\Model\CreateEmbeddingRequestInput
* OpenAPIServer\Model\CreateEmbeddingRequestModel
* OpenAPIServer\Model\CreateEmbeddingResponse
* OpenAPIServer\Model\CreateEmbeddingResponseDataInner
* OpenAPIServer\Model\CreateEmbeddingResponseUsage
* OpenAPIServer\Model\CreateFineTuneRequest
* OpenAPIServer\Model\CreateFineTuneRequestModel
* OpenAPIServer\Model\CreateImageRequest
* OpenAPIServer\Model\CreateModerationRequest
* OpenAPIServer\Model\CreateModerationRequestInput
* OpenAPIServer\Model\CreateModerationRequestModel
* OpenAPIServer\Model\CreateModerationResponse
* OpenAPIServer\Model\CreateModerationResponseResultsInner
* OpenAPIServer\Model\CreateModerationResponseResultsInnerCategories
* OpenAPIServer\Model\CreateModerationResponseResultsInnerCategoryScores
* OpenAPIServer\Model\CreateTranscriptionRequestModel
* OpenAPIServer\Model\CreateTranscriptionResponse
* OpenAPIServer\Model\CreateTranslationResponse
* OpenAPIServer\Model\DeleteFileResponse
* OpenAPIServer\Model\DeleteModelResponse
* OpenAPIServer\Model\Error
* OpenAPIServer\Model\ErrorResponse
* OpenAPIServer\Model\FineTune
* OpenAPIServer\Model\FineTuneEvent
* OpenAPIServer\Model\ImagesResponse
* OpenAPIServer\Model\ImagesResponseDataInner
* OpenAPIServer\Model\ListFilesResponse
* OpenAPIServer\Model\ListFineTuneEventsResponse
* OpenAPIServer\Model\ListFineTunesResponse
* OpenAPIServer\Model\ListModelsResponse
* OpenAPIServer\Model\Model
* OpenAPIServer\Model\OpenAIFile


