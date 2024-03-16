# Documentation for OpenAI API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *OpenAIApi* | [**cancelFineTune**](Apis/OpenAIApi.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.  |
*OpenAIApi* | [**createChatCompletion**](Apis/OpenAIApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |
*OpenAIApi* | [**createCompletion**](Apis/OpenAIApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
*OpenAIApi* | [**createEdit**](Apis/OpenAIApi.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters. |
*OpenAIApi* | [**createEmbedding**](Apis/OpenAIApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
*OpenAIApi* | [**createFile**](Apis/OpenAIApi.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  |
*OpenAIApi* | [**createFineTune**](Apis/OpenAIApi.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
*OpenAIApi* | [**createImage**](Apis/OpenAIApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt. |
*OpenAIApi* | [**createImageEdit**](Apis/OpenAIApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
*OpenAIApi* | [**createImageVariation**](Apis/OpenAIApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image. |
*OpenAIApi* | [**createModeration**](Apis/OpenAIApi.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI's Content Policy |
*OpenAIApi* | [**createTranscription**](Apis/OpenAIApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
*OpenAIApi* | [**createTranslation**](Apis/OpenAIApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English. |
*OpenAIApi* | [**deleteFile**](Apis/OpenAIApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file. |
*OpenAIApi* | [**deleteModel**](Apis/OpenAIApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization. |
*OpenAIApi* | [**downloadFile**](Apis/OpenAIApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file |
*OpenAIApi* | [**listFiles**](Apis/OpenAIApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user's organization. |
*OpenAIApi* | [**listFineTuneEvents**](Apis/OpenAIApi.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.  |
*OpenAIApi* | [**listFineTunes**](Apis/OpenAIApi.md#listfinetunes) | **GET** /fine-tunes | List your organization's fine-tuning jobs  |
*OpenAIApi* | [**listModels**](Apis/OpenAIApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
*OpenAIApi* | [**retrieveFile**](Apis/OpenAIApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file. |
*OpenAIApi* | [**retrieveFineTune**](Apis/OpenAIApi.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
*OpenAIApi* | [**retrieveModel**](Apis/OpenAIApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [ChatCompletionFunctions](./Models/ChatCompletionFunctions.md)
 - [ChatCompletionRequestMessage](./Models/ChatCompletionRequestMessage.md)
 - [ChatCompletionRequestMessage_function_call](./Models/ChatCompletionRequestMessage_function_call.md)
 - [ChatCompletionResponseMessage](./Models/ChatCompletionResponseMessage.md)
 - [ChatCompletionStreamResponseDelta](./Models/ChatCompletionStreamResponseDelta.md)
 - [CreateChatCompletionRequest](./Models/CreateChatCompletionRequest.md)
 - [CreateChatCompletionRequest_function_call](./Models/CreateChatCompletionRequest_function_call.md)
 - [CreateChatCompletionRequest_function_call_oneOf](./Models/CreateChatCompletionRequest_function_call_oneOf.md)
 - [CreateChatCompletionRequest_model](./Models/CreateChatCompletionRequest_model.md)
 - [CreateChatCompletionRequest_stop](./Models/CreateChatCompletionRequest_stop.md)
 - [CreateChatCompletionResponse](./Models/CreateChatCompletionResponse.md)
 - [CreateChatCompletionResponse_choices_inner](./Models/CreateChatCompletionResponse_choices_inner.md)
 - [CreateChatCompletionStreamResponse](./Models/CreateChatCompletionStreamResponse.md)
 - [CreateChatCompletionStreamResponse_choices_inner](./Models/CreateChatCompletionStreamResponse_choices_inner.md)
 - [CreateCompletionRequest](./Models/CreateCompletionRequest.md)
 - [CreateCompletionRequest_model](./Models/CreateCompletionRequest_model.md)
 - [CreateCompletionRequest_prompt](./Models/CreateCompletionRequest_prompt.md)
 - [CreateCompletionRequest_stop](./Models/CreateCompletionRequest_stop.md)
 - [CreateCompletionResponse](./Models/CreateCompletionResponse.md)
 - [CreateCompletionResponse_choices_inner](./Models/CreateCompletionResponse_choices_inner.md)
 - [CreateCompletionResponse_choices_inner_logprobs](./Models/CreateCompletionResponse_choices_inner_logprobs.md)
 - [CreateCompletionResponse_usage](./Models/CreateCompletionResponse_usage.md)
 - [CreateEditRequest](./Models/CreateEditRequest.md)
 - [CreateEditRequest_model](./Models/CreateEditRequest_model.md)
 - [CreateEditResponse](./Models/CreateEditResponse.md)
 - [CreateEditResponse_choices_inner](./Models/CreateEditResponse_choices_inner.md)
 - [CreateEmbeddingRequest](./Models/CreateEmbeddingRequest.md)
 - [CreateEmbeddingRequest_input](./Models/CreateEmbeddingRequest_input.md)
 - [CreateEmbeddingRequest_model](./Models/CreateEmbeddingRequest_model.md)
 - [CreateEmbeddingResponse](./Models/CreateEmbeddingResponse.md)
 - [CreateEmbeddingResponse_data_inner](./Models/CreateEmbeddingResponse_data_inner.md)
 - [CreateEmbeddingResponse_usage](./Models/CreateEmbeddingResponse_usage.md)
 - [CreateFineTuneRequest](./Models/CreateFineTuneRequest.md)
 - [CreateFineTuneRequest_model](./Models/CreateFineTuneRequest_model.md)
 - [CreateImageRequest](./Models/CreateImageRequest.md)
 - [CreateModerationRequest](./Models/CreateModerationRequest.md)
 - [CreateModerationRequest_input](./Models/CreateModerationRequest_input.md)
 - [CreateModerationRequest_model](./Models/CreateModerationRequest_model.md)
 - [CreateModerationResponse](./Models/CreateModerationResponse.md)
 - [CreateModerationResponse_results_inner](./Models/CreateModerationResponse_results_inner.md)
 - [CreateModerationResponse_results_inner_categories](./Models/CreateModerationResponse_results_inner_categories.md)
 - [CreateModerationResponse_results_inner_category_scores](./Models/CreateModerationResponse_results_inner_category_scores.md)
 - [CreateTranscriptionRequest_model](./Models/CreateTranscriptionRequest_model.md)
 - [CreateTranscriptionResponse](./Models/CreateTranscriptionResponse.md)
 - [CreateTranslationResponse](./Models/CreateTranslationResponse.md)
 - [DeleteFileResponse](./Models/DeleteFileResponse.md)
 - [DeleteModelResponse](./Models/DeleteModelResponse.md)
 - [Error](./Models/Error.md)
 - [ErrorResponse](./Models/ErrorResponse.md)
 - [FineTune](./Models/FineTune.md)
 - [FineTuneEvent](./Models/FineTuneEvent.md)
 - [ImagesResponse](./Models/ImagesResponse.md)
 - [ImagesResponse_data_inner](./Models/ImagesResponse_data_inner.md)
 - [ListFilesResponse](./Models/ListFilesResponse.md)
 - [ListFineTuneEventsResponse](./Models/ListFineTuneEventsResponse.md)
 - [ListFineTunesResponse](./Models/ListFineTunesResponse.md)
 - [ListModelsResponse](./Models/ListModelsResponse.md)
 - [Model](./Models/Model.md)
 - [OpenAIFile](./Models/OpenAIFile.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
