# OpenAI API API Client


APIs for sampling from and fine-tuning language models

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
OASOpenAIApi api = new OASOpenAIApi();

Map<String, Object> params = new Map<String, Object>{
    'fineTuneId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F
};

try {
    // cross your fingers
    OASFineTune result = api.cancelFineTune(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASOpenAIApi* | [**cancelFineTune**](OASOpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.\n
*OASOpenAIApi* | [**createChatCompletion**](OASOpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OASOpenAIApi* | [**createCompletion**](OASOpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OASOpenAIApi* | [**createEdit**](OASOpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OASOpenAIApi* | [**createEmbedding**](OASOpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OASOpenAIApi* | [**createFile**](OASOpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.\n
*OASOpenAIApi* | [**createFineTune**](OASOpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.\n\nResponse includes details of the enqueued job including job status and the name of the fine-tuned models once complete.\n\n[Learn more about Fine-tuning](/docs/guides/fine-tuning)\n
*OASOpenAIApi* | [**createImage**](OASOpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
*OASOpenAIApi* | [**createImageEdit**](OASOpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OASOpenAIApi* | [**createImageVariation**](OASOpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
*OASOpenAIApi* | [**createModeration**](OASOpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI\&#39;s Content Policy
*OASOpenAIApi* | [**createTranscription**](OASOpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OASOpenAIApi* | [**createTranslation**](OASOpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
*OASOpenAIApi* | [**deleteFile**](OASOpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
*OASOpenAIApi* | [**deleteModel**](OASOpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OASOpenAIApi* | [**downloadFile**](OASOpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OASOpenAIApi* | [**listFiles**](OASOpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user\&#39;s organization.
*OASOpenAIApi* | [**listFineTuneEvents**](OASOpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.\n
*OASOpenAIApi* | [**listFineTunes**](OASOpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization\&#39;s fine-tuning jobs\n
*OASOpenAIApi* | [**listModels**](OASOpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OASOpenAIApi* | [**retrieveFile**](OASOpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
*OASOpenAIApi* | [**retrieveFineTune**](OASOpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.\n\n[Learn more about Fine-tuning](/docs/guides/fine-tuning)\n
*OASOpenAIApi* | [**retrieveModel**](OASOpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Documentation for Models

 - [OASChatCompletionFunctions](OASChatCompletionFunctions.md)
 - [OASChatCompletionRequestMessage](OASChatCompletionRequestMessage.md)
 - [OASChatCompletionRequestMessageFunct](OASChatCompletionRequestMessageFunct.md)
 - [OASChatCompletionResponseMessage](OASChatCompletionResponseMessage.md)
 - [OASChatCompletionStreamResponseDelta](OASChatCompletionStreamResponseDelta.md)
 - [OASCreateChatCompletionRequest](OASCreateChatCompletionRequest.md)
 - [OASCreateChatCompletionRequestFuncti](OASCreateChatCompletionRequestFuncti.md)
 - [OASCreateChatCompletionRequestModel](OASCreateChatCompletionRequestModel.md)
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
 - [OASCreateCompletionResponseUsage](OASCreateCompletionResponseUsage.md)
 - [OASCreateEditRequest](OASCreateEditRequest.md)
 - [OASCreateEditRequestModel](OASCreateEditRequestModel.md)
 - [OASCreateEditResponse](OASCreateEditResponse.md)
 - [OASCreateEditResponseChoicesInner](OASCreateEditResponseChoicesInner.md)
 - [OASCreateEmbeddingRequest](OASCreateEmbeddingRequest.md)
 - [OASCreateEmbeddingRequestInput](OASCreateEmbeddingRequestInput.md)
 - [OASCreateEmbeddingRequestModel](OASCreateEmbeddingRequestModel.md)
 - [OASCreateEmbeddingResponse](OASCreateEmbeddingResponse.md)
 - [OASCreateEmbeddingResponseDataInner](OASCreateEmbeddingResponseDataInner.md)
 - [OASCreateEmbeddingResponseUsage](OASCreateEmbeddingResponseUsage.md)
 - [OASCreateFineTuneRequest](OASCreateFineTuneRequest.md)
 - [OASCreateFineTuneRequestModel](OASCreateFineTuneRequestModel.md)
 - [OASCreateImageRequest](OASCreateImageRequest.md)
 - [OASCreateModerationRequest](OASCreateModerationRequest.md)
 - [OASCreateModerationRequestInput](OASCreateModerationRequestInput.md)
 - [OASCreateModerationRequestModel](OASCreateModerationRequestModel.md)
 - [OASCreateModerationResponse](OASCreateModerationResponse.md)
 - [OASCreateModerationResponseResultsIn](OASCreateModerationResponseResultsIn.md)
 - [OASCreateTranscriptionRequestModel](OASCreateTranscriptionRequestModel.md)
 - [OASCreateTranscriptionResponse](OASCreateTranscriptionResponse.md)
 - [OASCreateTranslationResponse](OASCreateTranslationResponse.md)
 - [OASDeleteFileResponse](OASDeleteFileResponse.md)
 - [OASDeleteModelResponse](OASDeleteModelResponse.md)
 - [OASError](OASError.md)
 - [OASErrorResponse](OASErrorResponse.md)
 - [OASFineTune](OASFineTune.md)
 - [OASFineTuneEvent](OASFineTuneEvent.md)
 - [OASImagesResponse](OASImagesResponse.md)
 - [OASImagesResponseDataInner](OASImagesResponseDataInner.md)
 - [OASListFilesResponse](OASListFilesResponse.md)
 - [OASListFineTuneEventsResponse](OASListFineTuneEventsResponse.md)
 - [OASListFineTunesResponse](OASListFineTunesResponse.md)
 - [OASListModelsResponse](OASListModelsResponse.md)
 - [OASModel](OASModel.md)
 - [OASOpenAIFile](OASOpenAIFile.md)


## Documentation for Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com

