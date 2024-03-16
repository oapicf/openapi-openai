# WWW::OpenAPIClient::OpenAIApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::OpenAIApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tune**](OpenAIApi.md#cancel_fine_tune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**create_chat_completion**](OpenAIApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**create_completion**](OpenAIApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**create_edit**](OpenAIApi.md#create_edit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**create_embedding**](OpenAIApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**create_file**](OpenAIApi.md#create_file) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**create_fine_tune**](OpenAIApi.md#create_fine_tune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**create_image**](OpenAIApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt.
[**create_image_edit**](OpenAIApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](OpenAIApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image.
[**create_moderation**](OpenAIApi.md#create_moderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**create_transcription**](OpenAIApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**create_translation**](OpenAIApi.md#create_translation) | **POST** /audio/translations | Translates audio into English.
[**delete_file**](OpenAIApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file.
[**delete_model**](OpenAIApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**download_file**](OpenAIApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**list_files**](OpenAIApi.md#list_files) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**list_fine_tune_events**](OpenAIApi.md#list_fine_tune_events) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**list_fine_tunes**](OpenAIApi.md#list_fine_tunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**list_models**](OpenAIApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_file**](OpenAIApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieve_fine_tune**](OpenAIApi.md#retrieve_fine_tune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieve_model**](OpenAIApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **cancel_fine_tune**
> FineTune cancel_fine_tune(fine_tune_id => $fine_tune_id)

Immediately cancel a fine-tune job. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $fine_tune_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; # string | The ID of the fine-tune job to cancel 

eval {
    my $result = $api_instance->cancel_fine_tune(fine_tune_id => $fine_tune_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->cancel_fine_tune: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **string**| The ID of the fine-tune job to cancel  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_chat_completion**
> CreateChatCompletionResponse create_chat_completion(create_chat_completion_request => $create_chat_completion_request)

Creates a model response for the given chat conversation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $create_chat_completion_request = WWW::OpenAPIClient::Object::CreateChatCompletionRequest->new(); # CreateChatCompletionRequest | 

eval {
    my $result = $api_instance->create_chat_completion(create_chat_completion_request => $create_chat_completion_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_chat_completion: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_completion**
> CreateCompletionResponse create_completion(create_completion_request => $create_completion_request)

Creates a completion for the provided prompt and parameters.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $create_completion_request = WWW::OpenAPIClient::Object::CreateCompletionRequest->new(); # CreateCompletionRequest | 

eval {
    my $result = $api_instance->create_completion(create_completion_request => $create_completion_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_completion: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_edit**
> CreateEditResponse create_edit(create_edit_request => $create_edit_request)

Creates a new edit for the provided input, instruction, and parameters.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $create_edit_request = WWW::OpenAPIClient::Object::CreateEditRequest->new(); # CreateEditRequest | 

eval {
    my $result = $api_instance->create_edit(create_edit_request => $create_edit_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_edit: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_edit_request** | [**CreateEditRequest**](CreateEditRequest.md)|  | 

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_embedding**
> CreateEmbeddingResponse create_embedding(create_embedding_request => $create_embedding_request)

Creates an embedding vector representing the input text.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $create_embedding_request = WWW::OpenAPIClient::Object::CreateEmbeddingRequest->new(); # CreateEmbeddingRequest | 

eval {
    my $result = $api_instance->create_embedding(create_embedding_request => $create_embedding_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_embedding: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_file**
> OpenAIFile create_file(file => $file, purpose => $purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $file = "/path/to/file"; # string | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
my $purpose = "purpose_example"; # string | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

eval {
    my $result = $api_instance->create_file(file => $file, purpose => $purpose);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **string****string**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **purpose** | **string**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fine_tune**
> FineTune create_fine_tune(create_fine_tune_request => $create_fine_tune_request)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $create_fine_tune_request = WWW::OpenAPIClient::Object::CreateFineTuneRequest->new(); # CreateFineTuneRequest | 

eval {
    my $result = $api_instance->create_fine_tune(create_fine_tune_request => $create_fine_tune_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_fine_tune: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tune_request** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image**
> ImagesResponse create_image(create_image_request => $create_image_request)

Creates an image given a prompt.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $create_image_request = WWW::OpenAPIClient::Object::CreateImageRequest->new(); # CreateImageRequest | 

eval {
    my $result = $api_instance->create_image(create_image_request => $create_image_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_image: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_edit**
> ImagesResponse create_image_edit(image => $image, prompt => $prompt, mask => $mask, n => $n, size => $size, response_format => $response_format, user => $user)

Creates an edited or extended image given an original image and a prompt.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $image = "/path/to/file"; # string | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
my $prompt = "prompt_example"; # string | A text description of the desired image(s). The maximum length is 1000 characters.
my $mask = "/path/to/file"; # string | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
my $n = 1; # int | The number of images to generate. Must be between 1 and 10.
my $size = '1024x1024'; # string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
my $response_format = 'url'; # string | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
my $user = "user_example"; # string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

eval {
    my $result = $api_instance->create_image_edit(image => $image, prompt => $prompt, mask => $mask, n => $n, size => $size, response_format => $response_format, user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_image_edit: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **string****string**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **string**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **string****string**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_variation**
> ImagesResponse create_image_variation(image => $image, n => $n, size => $size, response_format => $response_format, user => $user)

Creates a variation of a given image.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $image = "/path/to/file"; # string | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
my $n = 1; # int | The number of images to generate. Must be between 1 and 10.
my $size = '1024x1024'; # string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
my $response_format = 'url'; # string | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
my $user = "user_example"; # string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

eval {
    my $result = $api_instance->create_image_variation(image => $image, n => $n, size => $size, response_format => $response_format, user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_image_variation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **string****string**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_moderation**
> CreateModerationResponse create_moderation(create_moderation_request => $create_moderation_request)

Classifies if text violates OpenAI's Content Policy

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $create_moderation_request = WWW::OpenAPIClient::Object::CreateModerationRequest->new(); # CreateModerationRequest | 

eval {
    my $result = $api_instance->create_moderation(create_moderation_request => $create_moderation_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_moderation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transcription**
> CreateTranscriptionResponse create_transcription(file => $file, model => $model, prompt => $prompt, response_format => $response_format, temperature => $temperature, language => $language)

Transcribes audio into the input language.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $file = "/path/to/file"; # string | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
my $model = new WWW::OpenAPIClient.CreateTranscriptionRequestModel(); # CreateTranscriptionRequestModel | 
my $prompt = "prompt_example"; # string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
my $response_format = 'json'; # string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
my $temperature = 0; # double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
my $language = "language_example"; # string | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 

eval {
    my $result = $api_instance->create_transcription(file => $file, model => $model, prompt => $prompt, response_format => $response_format, temperature => $temperature, language => $language);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_transcription: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **string****string**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **response_format** | **string**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
 **temperature** | **double**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **string**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_translation**
> CreateTranslationResponse create_translation(file => $file, model => $model, prompt => $prompt, response_format => $response_format, temperature => $temperature)

Translates audio into English.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $file = "/path/to/file"; # string | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
my $model = new WWW::OpenAPIClient.CreateTranscriptionRequestModel(); # CreateTranscriptionRequestModel | 
my $prompt = "prompt_example"; # string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
my $response_format = 'json'; # string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
my $temperature = 0; # double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 

eval {
    my $result = $api_instance->create_translation(file => $file, model => $model, prompt => $prompt, response_format => $response_format, temperature => $temperature);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->create_translation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **string****string**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **response_format** | **string**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
 **temperature** | **double**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_file**
> DeleteFileResponse delete_file(file_id => $file_id)

Delete a file.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $file_id = "file_id_example"; # string | The ID of the file to use for this request

eval {
    my $result = $api_instance->delete_file(file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->delete_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **string**| The ID of the file to use for this request | 

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model**
> DeleteModelResponse delete_model(model => $model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $model = curie:ft-acmeco-2021-03-03-21-44-20; # string | The model to delete

eval {
    my $result = $api_instance->delete_model(model => $model);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->delete_model: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The model to delete | 

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_file**
> string download_file(file_id => $file_id)

Returns the contents of the specified file

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $file_id = "file_id_example"; # string | The ID of the file to use for this request

eval {
    my $result = $api_instance->download_file(file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->download_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **string**| The ID of the file to use for this request | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_files**
> ListFilesResponse list_files()

Returns a list of files that belong to the user's organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);


eval {
    my $result = $api_instance->list_files();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->list_files: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tune_events**
> ListFineTuneEventsResponse list_fine_tune_events(fine_tune_id => $fine_tune_id, stream => $stream)

Get fine-grained status updates for a fine-tune job. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $fine_tune_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; # string | The ID of the fine-tune job to get events for. 
my $stream = false; # boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 

eval {
    my $result = $api_instance->list_fine_tune_events(fine_tune_id => $fine_tune_id, stream => $stream);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->list_fine_tune_events: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **string**| The ID of the fine-tune job to get events for.  | 
 **stream** | **boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tunes**
> ListFineTunesResponse list_fine_tunes()

List your organization's fine-tuning jobs 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);


eval {
    my $result = $api_instance->list_fine_tunes();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->list_fine_tunes: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_models**
> ListModelsResponse list_models()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);


eval {
    my $result = $api_instance->list_models();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->list_models: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_file**
> OpenAIFile retrieve_file(file_id => $file_id)

Returns information about a specific file.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $file_id = "file_id_example"; # string | The ID of the file to use for this request

eval {
    my $result = $api_instance->retrieve_file(file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->retrieve_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **string**| The ID of the file to use for this request | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_fine_tune**
> FineTune retrieve_fine_tune(fine_tune_id => $fine_tune_id)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $fine_tune_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; # string | The ID of the fine-tune job 

eval {
    my $result = $api_instance->retrieve_fine_tune(fine_tune_id => $fine_tune_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->retrieve_fine_tune: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **string**| The ID of the fine-tune job  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_model**
> Model retrieve_model(model => $model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OpenAIApi;
my $api_instance = WWW::OpenAPIClient::OpenAIApi->new(
);

my $model = text-davinci-001; # string | The ID of the model to use for this request

eval {
    my $result = $api_instance->retrieve_model(model => $model);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OpenAIApi->retrieve_model: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The ID of the model to use for this request | 

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

