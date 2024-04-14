# openapi_openai

OpenapiOpenai - JavaScript client for openapi_openai
APIs for sampling from and fine-tuning language models
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- Package version: 0.9.0-pre.0
- Generator version: 7.4.0
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-openai](https://github.com/oapicf/openapi-openai)

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/), please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install openapi_openai --save
```

Finally, you need to build the module:

```shell
npm run build
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

To use the link you just defined in your project, switch to the directory you want to use your openapi_openai from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

Finally, you need to build the module:

```shell
npm run build
```

#### git

If the library is hosted at a git repository, e.g.https://github.com/oapicf/openapi-openai
then install it via:

```shell
    npm install oapicf/openapi-openai --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var OpenapiOpenai = require('openapi_openai');


var api = new OpenapiOpenai.OpenAIApi()
var fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // {String} The ID of the fine-tune job to cancel 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.cancelFineTune(fineTuneId, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenapiOpenai.OpenAIApi* | [**cancelFineTune**](docs/OpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
*OpenapiOpenai.OpenAIApi* | [**createChatCompletion**](docs/OpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OpenapiOpenai.OpenAIApi* | [**createCompletion**](docs/OpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OpenapiOpenai.OpenAIApi* | [**createEdit**](docs/OpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OpenapiOpenai.OpenAIApi* | [**createEmbedding**](docs/OpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OpenapiOpenai.OpenAIApi* | [**createFile**](docs/OpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
*OpenapiOpenai.OpenAIApi* | [**createFineTune**](docs/OpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenapiOpenai.OpenAIApi* | [**createImage**](docs/OpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
*OpenapiOpenai.OpenAIApi* | [**createImageEdit**](docs/OpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenapiOpenai.OpenAIApi* | [**createImageVariation**](docs/OpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
*OpenapiOpenai.OpenAIApi* | [**createModeration**](docs/OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
*OpenapiOpenai.OpenAIApi* | [**createTranscription**](docs/OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OpenapiOpenai.OpenAIApi* | [**createTranslation**](docs/OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
*OpenapiOpenai.OpenAIApi* | [**deleteFile**](docs/OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
*OpenapiOpenai.OpenAIApi* | [**deleteModel**](docs/OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenapiOpenai.OpenAIApi* | [**downloadFile**](docs/OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OpenapiOpenai.OpenAIApi* | [**listFiles**](docs/OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
*OpenapiOpenai.OpenAIApi* | [**listFineTuneEvents**](docs/OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
*OpenapiOpenai.OpenAIApi* | [**listFineTunes**](docs/OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
*OpenapiOpenai.OpenAIApi* | [**listModels**](docs/OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenapiOpenai.OpenAIApi* | [**retrieveFile**](docs/OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
*OpenapiOpenai.OpenAIApi* | [**retrieveFineTune**](docs/OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenapiOpenai.OpenAIApi* | [**retrieveModel**](docs/OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Documentation for Models

 - [OpenapiOpenai.ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [OpenapiOpenai.ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [OpenapiOpenai.ChatCompletionRequestMessageFunctionCall](docs/ChatCompletionRequestMessageFunctionCall.md)
 - [OpenapiOpenai.ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [OpenapiOpenai.ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [OpenapiOpenai.CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [OpenapiOpenai.CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [OpenapiOpenai.CreateChatCompletionRequestFunctionCallOneOf](docs/CreateChatCompletionRequestFunctionCallOneOf.md)
 - [OpenapiOpenai.CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [OpenapiOpenai.CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [OpenapiOpenai.CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [OpenapiOpenai.CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [OpenapiOpenai.CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [OpenapiOpenai.CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [OpenapiOpenai.CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [OpenapiOpenai.CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [OpenapiOpenai.CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [OpenapiOpenai.CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [OpenapiOpenai.CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [OpenapiOpenai.CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [OpenapiOpenai.CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [OpenapiOpenai.CreateCompletionResponseUsage](docs/CreateCompletionResponseUsage.md)
 - [OpenapiOpenai.CreateEditRequest](docs/CreateEditRequest.md)
 - [OpenapiOpenai.CreateEditRequestModel](docs/CreateEditRequestModel.md)
 - [OpenapiOpenai.CreateEditResponse](docs/CreateEditResponse.md)
 - [OpenapiOpenai.CreateEditResponseChoicesInner](docs/CreateEditResponseChoicesInner.md)
 - [OpenapiOpenai.CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [OpenapiOpenai.CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [OpenapiOpenai.CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [OpenapiOpenai.CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [OpenapiOpenai.CreateEmbeddingResponseDataInner](docs/CreateEmbeddingResponseDataInner.md)
 - [OpenapiOpenai.CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [OpenapiOpenai.CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [OpenapiOpenai.CreateFineTuneRequestModel](docs/CreateFineTuneRequestModel.md)
 - [OpenapiOpenai.CreateImageRequest](docs/CreateImageRequest.md)
 - [OpenapiOpenai.CreateModerationRequest](docs/CreateModerationRequest.md)
 - [OpenapiOpenai.CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [OpenapiOpenai.CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [OpenapiOpenai.CreateModerationResponse](docs/CreateModerationResponse.md)
 - [OpenapiOpenai.CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [OpenapiOpenai.CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [OpenapiOpenai.CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [OpenapiOpenai.CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [OpenapiOpenai.CreateTranscriptionResponse](docs/CreateTranscriptionResponse.md)
 - [OpenapiOpenai.CreateTranslationResponse](docs/CreateTranslationResponse.md)
 - [OpenapiOpenai.DeleteFileResponse](docs/DeleteFileResponse.md)
 - [OpenapiOpenai.DeleteModelResponse](docs/DeleteModelResponse.md)
 - [OpenapiOpenai.Error](docs/Error.md)
 - [OpenapiOpenai.ErrorResponse](docs/ErrorResponse.md)
 - [OpenapiOpenai.FineTune](docs/FineTune.md)
 - [OpenapiOpenai.FineTuneEvent](docs/FineTuneEvent.md)
 - [OpenapiOpenai.ImagesResponse](docs/ImagesResponse.md)
 - [OpenapiOpenai.ImagesResponseDataInner](docs/ImagesResponseDataInner.md)
 - [OpenapiOpenai.ListFilesResponse](docs/ListFilesResponse.md)
 - [OpenapiOpenai.ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [OpenapiOpenai.ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [OpenapiOpenai.ListModelsResponse](docs/ListModelsResponse.md)
 - [OpenapiOpenai.Model](docs/Model.md)
 - [OpenapiOpenai.OpenAIFile](docs/OpenAIFile.md)


## Documentation for Authorization

Endpoints do not require authorization.
