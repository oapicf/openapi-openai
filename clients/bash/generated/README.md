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
*OpenAIApi* | [**cancelFineTune**](docs/OpenAIApi.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.
*OpenAIApi* | [**createChatCompletion**](docs/OpenAIApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*OpenAIApi* | [**createCompletion**](docs/OpenAIApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*OpenAIApi* | [**createEdit**](docs/OpenAIApi.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OpenAIApi* | [**createEmbedding**](docs/OpenAIApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OpenAIApi* | [**createFile**](docs/OpenAIApi.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
*OpenAIApi* | [**createFineTune**](docs/OpenAIApi.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)
*OpenAIApi* | [**createImage**](docs/OpenAIApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*OpenAIApi* | [**createImageEdit**](docs/OpenAIApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenAIApi* | [**createImageVariation**](docs/OpenAIApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*OpenAIApi* | [**createModeration**](docs/OpenAIApi.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
*OpenAIApi* | [**createTranscription**](docs/OpenAIApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OpenAIApi* | [**createTranslation**](docs/OpenAIApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English.
*OpenAIApi* | [**deleteFile**](docs/OpenAIApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*OpenAIApi* | [**deleteModel**](docs/OpenAIApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenAIApi* | [**downloadFile**](docs/OpenAIApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OpenAIApi* | [**listFiles**](docs/OpenAIApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
*OpenAIApi* | [**listFineTuneEvents**](docs/OpenAIApi.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.
*OpenAIApi* | [**listFineTunes**](docs/OpenAIApi.md#listfinetunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs
*OpenAIApi* | [**listModels**](docs/OpenAIApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**retrieveFile**](docs/OpenAIApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*OpenAIApi* | [**retrieveFineTune**](docs/OpenAIApi.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)
*OpenAIApi* | [**retrieveModel**](docs/OpenAIApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Documentation For Models

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


## Documentation For Authorization

 All endpoints do not require authorization.

