# OpenAPIClient-php

APIs for sampling from and fine-tuning language models

For more information, please visit [https://github.com/oapicf/openapi-openai](https://github.com/oapicf/openapi-openai).

## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

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




$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$fine_tune_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tune job to cancel

try {
    $result = $apiInstance->cancelFineTune($fine_tune_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->cancelFineTune: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenAIApi* | [**cancelFineTune**](docs/Api/OpenAIApi.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.
*OpenAIApi* | [**createChatCompletion**](docs/Api/OpenAIApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OpenAIApi* | [**createCompletion**](docs/Api/OpenAIApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OpenAIApi* | [**createEdit**](docs/Api/OpenAIApi.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OpenAIApi* | [**createEmbedding**](docs/Api/OpenAIApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OpenAIApi* | [**createFile**](docs/Api/OpenAIApi.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
*OpenAIApi* | [**createFineTune**](docs/Api/OpenAIApi.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
*OpenAIApi* | [**createImage**](docs/Api/OpenAIApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*OpenAIApi* | [**createImageEdit**](docs/Api/OpenAIApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenAIApi* | [**createImageVariation**](docs/Api/OpenAIApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*OpenAIApi* | [**createModeration**](docs/Api/OpenAIApi.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
*OpenAIApi* | [**createTranscription**](docs/Api/OpenAIApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OpenAIApi* | [**createTranslation**](docs/Api/OpenAIApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
*OpenAIApi* | [**deleteFile**](docs/Api/OpenAIApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*OpenAIApi* | [**deleteModel**](docs/Api/OpenAIApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenAIApi* | [**downloadFile**](docs/Api/OpenAIApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OpenAIApi* | [**listFiles**](docs/Api/OpenAIApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
*OpenAIApi* | [**listFineTuneEvents**](docs/Api/OpenAIApi.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.
*OpenAIApi* | [**listFineTunes**](docs/Api/OpenAIApi.md#listfinetunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs
*OpenAIApi* | [**listModels**](docs/Api/OpenAIApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**retrieveFile**](docs/Api/OpenAIApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*OpenAIApi* | [**retrieveFineTune**](docs/Api/OpenAIApi.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
*OpenAIApi* | [**retrieveModel**](docs/Api/OpenAIApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

## Models

- [ChatCompletionFunctions](docs/Model/ChatCompletionFunctions.md)
- [ChatCompletionRequestMessage](docs/Model/ChatCompletionRequestMessage.md)
- [ChatCompletionRequestMessageFunctionCall](docs/Model/ChatCompletionRequestMessageFunctionCall.md)
- [ChatCompletionResponseMessage](docs/Model/ChatCompletionResponseMessage.md)
- [ChatCompletionStreamResponseDelta](docs/Model/ChatCompletionStreamResponseDelta.md)
- [CreateChatCompletionRequest](docs/Model/CreateChatCompletionRequest.md)
- [CreateChatCompletionRequestFunctionCall](docs/Model/CreateChatCompletionRequestFunctionCall.md)
- [CreateChatCompletionRequestFunctionCallOneOf](docs/Model/CreateChatCompletionRequestFunctionCallOneOf.md)
- [CreateChatCompletionRequestModel](docs/Model/CreateChatCompletionRequestModel.md)
- [CreateChatCompletionRequestStop](docs/Model/CreateChatCompletionRequestStop.md)
- [CreateChatCompletionResponse](docs/Model/CreateChatCompletionResponse.md)
- [CreateChatCompletionResponseChoicesInner](docs/Model/CreateChatCompletionResponseChoicesInner.md)
- [CreateChatCompletionStreamResponse](docs/Model/CreateChatCompletionStreamResponse.md)
- [CreateChatCompletionStreamResponseChoicesInner](docs/Model/CreateChatCompletionStreamResponseChoicesInner.md)
- [CreateCompletionRequest](docs/Model/CreateCompletionRequest.md)
- [CreateCompletionRequestModel](docs/Model/CreateCompletionRequestModel.md)
- [CreateCompletionRequestPrompt](docs/Model/CreateCompletionRequestPrompt.md)
- [CreateCompletionRequestStop](docs/Model/CreateCompletionRequestStop.md)
- [CreateCompletionResponse](docs/Model/CreateCompletionResponse.md)
- [CreateCompletionResponseChoicesInner](docs/Model/CreateCompletionResponseChoicesInner.md)
- [CreateCompletionResponseChoicesInnerLogprobs](docs/Model/CreateCompletionResponseChoicesInnerLogprobs.md)
- [CreateCompletionResponseUsage](docs/Model/CreateCompletionResponseUsage.md)
- [CreateEditRequest](docs/Model/CreateEditRequest.md)
- [CreateEditRequestModel](docs/Model/CreateEditRequestModel.md)
- [CreateEditResponse](docs/Model/CreateEditResponse.md)
- [CreateEditResponseChoicesInner](docs/Model/CreateEditResponseChoicesInner.md)
- [CreateEmbeddingRequest](docs/Model/CreateEmbeddingRequest.md)
- [CreateEmbeddingRequestInput](docs/Model/CreateEmbeddingRequestInput.md)
- [CreateEmbeddingRequestModel](docs/Model/CreateEmbeddingRequestModel.md)
- [CreateEmbeddingResponse](docs/Model/CreateEmbeddingResponse.md)
- [CreateEmbeddingResponseDataInner](docs/Model/CreateEmbeddingResponseDataInner.md)
- [CreateEmbeddingResponseUsage](docs/Model/CreateEmbeddingResponseUsage.md)
- [CreateFineTuneRequest](docs/Model/CreateFineTuneRequest.md)
- [CreateFineTuneRequestModel](docs/Model/CreateFineTuneRequestModel.md)
- [CreateImageRequest](docs/Model/CreateImageRequest.md)
- [CreateModerationRequest](docs/Model/CreateModerationRequest.md)
- [CreateModerationRequestInput](docs/Model/CreateModerationRequestInput.md)
- [CreateModerationRequestModel](docs/Model/CreateModerationRequestModel.md)
- [CreateModerationResponse](docs/Model/CreateModerationResponse.md)
- [CreateModerationResponseResultsInner](docs/Model/CreateModerationResponseResultsInner.md)
- [CreateModerationResponseResultsInnerCategories](docs/Model/CreateModerationResponseResultsInnerCategories.md)
- [CreateModerationResponseResultsInnerCategoryScores](docs/Model/CreateModerationResponseResultsInnerCategoryScores.md)
- [CreateTranscriptionRequestModel](docs/Model/CreateTranscriptionRequestModel.md)
- [CreateTranscriptionResponse](docs/Model/CreateTranscriptionResponse.md)
- [CreateTranslationResponse](docs/Model/CreateTranslationResponse.md)
- [DeleteFileResponse](docs/Model/DeleteFileResponse.md)
- [DeleteModelResponse](docs/Model/DeleteModelResponse.md)
- [Error](docs/Model/Error.md)
- [ErrorResponse](docs/Model/ErrorResponse.md)
- [FineTune](docs/Model/FineTune.md)
- [FineTuneEvent](docs/Model/FineTuneEvent.md)
- [ImagesResponse](docs/Model/ImagesResponse.md)
- [ImagesResponseDataInner](docs/Model/ImagesResponseDataInner.md)
- [ListFilesResponse](docs/Model/ListFilesResponse.md)
- [ListFineTuneEventsResponse](docs/Model/ListFineTuneEventsResponse.md)
- [ListFineTunesResponse](docs/Model/ListFineTunesResponse.md)
- [ListModelsResponse](docs/Model/ListModelsResponse.md)
- [Model](docs/Model/Model.md)
- [OpenAIFile](docs/Model/OpenAIFile.md)

## Authorization
Endpoints do not require authorization.

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

- API version: `2.0.0`
    - Generator version: `7.4.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
