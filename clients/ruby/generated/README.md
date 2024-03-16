# openapi_openai

OpenApiOpenAIClient - the Ruby gem for the OpenAI API

APIs for sampling from and fine-tuning language models

This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- Package version: 0.9.0-pre.0
- Generator version: 7.4.0
- Build package: org.openapitools.codegen.languages.RubyClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-openai](https://github.com/oapicf/openapi-openai)

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build openapi_openai.gemspec
```

Then either install the gem locally:

```shell
gem install ./openapi_openai-0.9.0-pre.0.gem
```

(for development, run `gem install --dev ./openapi_openai-0.9.0-pre.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'openapi_openai', '~> 0.9.0-pre.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'openapi_openai', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:

```ruby
# Load the gem
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
fine_tune_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tune job to cancel 

begin
  #Immediately cancel a fine-tune job. 
  result = api_instance.cancel_fine_tune(fine_tune_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Exception when calling OpenAIApi->cancel_fine_tune: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenApiOpenAIClient::OpenAIApi* | [**cancel_fine_tune**](docs/OpenAIApi.md#cancel_fine_tune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
*OpenApiOpenAIClient::OpenAIApi* | [**create_chat_completion**](docs/OpenAIApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OpenApiOpenAIClient::OpenAIApi* | [**create_completion**](docs/OpenAIApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OpenApiOpenAIClient::OpenAIApi* | [**create_edit**](docs/OpenAIApi.md#create_edit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OpenApiOpenAIClient::OpenAIApi* | [**create_embedding**](docs/OpenAIApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OpenApiOpenAIClient::OpenAIApi* | [**create_file**](docs/OpenAIApi.md#create_file) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
*OpenApiOpenAIClient::OpenAIApi* | [**create_fine_tune**](docs/OpenAIApi.md#create_fine_tune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenApiOpenAIClient::OpenAIApi* | [**create_image**](docs/OpenAIApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt.
*OpenApiOpenAIClient::OpenAIApi* | [**create_image_edit**](docs/OpenAIApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenApiOpenAIClient::OpenAIApi* | [**create_image_variation**](docs/OpenAIApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image.
*OpenApiOpenAIClient::OpenAIApi* | [**create_moderation**](docs/OpenAIApi.md#create_moderation) | **POST** /moderations | Classifies if text violates OpenAI's Content Policy
*OpenApiOpenAIClient::OpenAIApi* | [**create_transcription**](docs/OpenAIApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OpenApiOpenAIClient::OpenAIApi* | [**create_translation**](docs/OpenAIApi.md#create_translation) | **POST** /audio/translations | Translates audio into English.
*OpenApiOpenAIClient::OpenAIApi* | [**delete_file**](docs/OpenAIApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file.
*OpenApiOpenAIClient::OpenAIApi* | [**delete_model**](docs/OpenAIApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenApiOpenAIClient::OpenAIApi* | [**download_file**](docs/OpenAIApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OpenApiOpenAIClient::OpenAIApi* | [**list_files**](docs/OpenAIApi.md#list_files) | **GET** /files | Returns a list of files that belong to the user's organization.
*OpenApiOpenAIClient::OpenAIApi* | [**list_fine_tune_events**](docs/OpenAIApi.md#list_fine_tune_events) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
*OpenApiOpenAIClient::OpenAIApi* | [**list_fine_tunes**](docs/OpenAIApi.md#list_fine_tunes) | **GET** /fine-tunes | List your organization's fine-tuning jobs 
*OpenApiOpenAIClient::OpenAIApi* | [**list_models**](docs/OpenAIApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenApiOpenAIClient::OpenAIApi* | [**retrieve_file**](docs/OpenAIApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file.
*OpenApiOpenAIClient::OpenAIApi* | [**retrieve_fine_tune**](docs/OpenAIApi.md#retrieve_fine_tune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenApiOpenAIClient::OpenAIApi* | [**retrieve_model**](docs/OpenAIApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Documentation for Models

 - [OpenApiOpenAIClient::ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [OpenApiOpenAIClient::ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [OpenApiOpenAIClient::ChatCompletionRequestMessageFunctionCall](docs/ChatCompletionRequestMessageFunctionCall.md)
 - [OpenApiOpenAIClient::ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [OpenApiOpenAIClient::ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [OpenApiOpenAIClient::CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [OpenApiOpenAIClient::CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [OpenApiOpenAIClient::CreateChatCompletionRequestFunctionCallOneOf](docs/CreateChatCompletionRequestFunctionCallOneOf.md)
 - [OpenApiOpenAIClient::CreateChatCompletionRequestModel](docs/CreateChatCompletionRequestModel.md)
 - [OpenApiOpenAIClient::CreateChatCompletionRequestStop](docs/CreateChatCompletionRequestStop.md)
 - [OpenApiOpenAIClient::CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [OpenApiOpenAIClient::CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [OpenApiOpenAIClient::CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [OpenApiOpenAIClient::CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [OpenApiOpenAIClient::CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [OpenApiOpenAIClient::CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [OpenApiOpenAIClient::CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [OpenApiOpenAIClient::CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [OpenApiOpenAIClient::CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [OpenApiOpenAIClient::CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [OpenApiOpenAIClient::CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [OpenApiOpenAIClient::CreateCompletionResponseUsage](docs/CreateCompletionResponseUsage.md)
 - [OpenApiOpenAIClient::CreateEditRequest](docs/CreateEditRequest.md)
 - [OpenApiOpenAIClient::CreateEditRequestModel](docs/CreateEditRequestModel.md)
 - [OpenApiOpenAIClient::CreateEditResponse](docs/CreateEditResponse.md)
 - [OpenApiOpenAIClient::CreateEditResponseChoicesInner](docs/CreateEditResponseChoicesInner.md)
 - [OpenApiOpenAIClient::CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [OpenApiOpenAIClient::CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [OpenApiOpenAIClient::CreateEmbeddingRequestModel](docs/CreateEmbeddingRequestModel.md)
 - [OpenApiOpenAIClient::CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [OpenApiOpenAIClient::CreateEmbeddingResponseDataInner](docs/CreateEmbeddingResponseDataInner.md)
 - [OpenApiOpenAIClient::CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [OpenApiOpenAIClient::CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [OpenApiOpenAIClient::CreateFineTuneRequestModel](docs/CreateFineTuneRequestModel.md)
 - [OpenApiOpenAIClient::CreateImageRequest](docs/CreateImageRequest.md)
 - [OpenApiOpenAIClient::CreateModerationRequest](docs/CreateModerationRequest.md)
 - [OpenApiOpenAIClient::CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [OpenApiOpenAIClient::CreateModerationRequestModel](docs/CreateModerationRequestModel.md)
 - [OpenApiOpenAIClient::CreateModerationResponse](docs/CreateModerationResponse.md)
 - [OpenApiOpenAIClient::CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [OpenApiOpenAIClient::CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [OpenApiOpenAIClient::CreateTranscriptionResponse](docs/CreateTranscriptionResponse.md)
 - [OpenApiOpenAIClient::CreateTranslationResponse](docs/CreateTranslationResponse.md)
 - [OpenApiOpenAIClient::DeleteFileResponse](docs/DeleteFileResponse.md)
 - [OpenApiOpenAIClient::DeleteModelResponse](docs/DeleteModelResponse.md)
 - [OpenApiOpenAIClient::Error](docs/Error.md)
 - [OpenApiOpenAIClient::ErrorResponse](docs/ErrorResponse.md)
 - [OpenApiOpenAIClient::FineTune](docs/FineTune.md)
 - [OpenApiOpenAIClient::FineTuneEvent](docs/FineTuneEvent.md)
 - [OpenApiOpenAIClient::ImagesResponse](docs/ImagesResponse.md)
 - [OpenApiOpenAIClient::ImagesResponseDataInner](docs/ImagesResponseDataInner.md)
 - [OpenApiOpenAIClient::ListFilesResponse](docs/ListFilesResponse.md)
 - [OpenApiOpenAIClient::ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [OpenApiOpenAIClient::ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [OpenApiOpenAIClient::ListModelsResponse](docs/ListModelsResponse.md)
 - [OpenApiOpenAIClient::Model](docs/Model.md)
 - [OpenApiOpenAIClient::OpenAIFile](docs/OpenAIFile.md)


## Documentation for Authorization

Endpoints do not require authorization.
