# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.OpenAIApi;

public class OpenAIApiExample {

    public static void main(String[] args) {
        OpenAIApi apiInstance = new OpenAIApi();
        String fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // String | The ID of the fine-tune job to cancel 
        try {
            FineTune result = apiInstance.cancelFineTune(fineTuneId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenAIApi#cancelFineTune");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenAIApi* | [**cancelFineTune**](docs/OpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
*OpenAIApi* | [**createChatCompletion**](docs/OpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OpenAIApi* | [**createCompletion**](docs/OpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OpenAIApi* | [**createEdit**](docs/OpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OpenAIApi* | [**createEmbedding**](docs/OpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OpenAIApi* | [**createFile**](docs/OpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
*OpenAIApi* | [**createFineTune**](docs/OpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**createImage**](docs/OpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
*OpenAIApi* | [**createImageEdit**](docs/OpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenAIApi* | [**createImageVariation**](docs/OpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
*OpenAIApi* | [**createModeration**](docs/OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
*OpenAIApi* | [**createTranscription**](docs/OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OpenAIApi* | [**createTranslation**](docs/OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
*OpenAIApi* | [**deleteFile**](docs/OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
*OpenAIApi* | [**deleteModel**](docs/OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenAIApi* | [**downloadFile**](docs/OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OpenAIApi* | [**listFiles**](docs/OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
*OpenAIApi* | [**listFineTuneEvents**](docs/OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
*OpenAIApi* | [**listFineTunes**](docs/OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
*OpenAIApi* | [**listModels**](docs/OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**retrieveFile**](docs/OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
*OpenAIApi* | [**retrieveFineTune**](docs/OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**retrieveModel**](docs/OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Documentation for Models

 - [ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [ChatCompletionRequestMessageFunctionCall](docs/ChatCompletionRequestMessageFunctionCall.md)
 - [ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [CreateChatCompletionRequestFunctionCallOneOf](docs/CreateChatCompletionRequestFunctionCallOneOf.md)
 - [CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [CreateCompletionResponseUsage](docs/CreateCompletionResponseUsage.md)
 - [CreateEditRequest](docs/CreateEditRequest.md)
 - [CreateEditRequestModel](docs/CreateEditRequestModel.md)
 - [CreateEditResponse](docs/CreateEditResponse.md)
 - [CreateEditResponseChoicesInner](docs/CreateEditResponseChoicesInner.md)
 - [CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [CreateEmbeddingResponseDataInner](docs/CreateEmbeddingResponseDataInner.md)
 - [CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [CreateFineTuneRequestModel](docs/CreateFineTuneRequestModel.md)
 - [CreateImageRequest](docs/CreateImageRequest.md)
 - [CreateModerationRequest](docs/CreateModerationRequest.md)
 - [CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [CreateModerationResponse](docs/CreateModerationResponse.md)
 - [CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [CreateTranscriptionResponse](docs/CreateTranscriptionResponse.md)
 - [CreateTranslationResponse](docs/CreateTranslationResponse.md)
 - [DeleteFileResponse](docs/DeleteFileResponse.md)
 - [DeleteModelResponse](docs/DeleteModelResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FineTune](docs/FineTune.md)
 - [FineTuneEvent](docs/FineTuneEvent.md)
 - [ImagesResponse](docs/ImagesResponse.md)
 - [ImagesResponseDataInner](docs/ImagesResponseDataInner.md)
 - [ListFilesResponse](docs/ListFilesResponse.md)
 - [ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [ListModelsResponse](docs/ListModelsResponse.md)
 - [Model](docs/Model.md)
 - [OpenAIFile](docs/OpenAIFile.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

blah+oapicf@cliffano.com
