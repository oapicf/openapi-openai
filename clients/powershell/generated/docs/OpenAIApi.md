# PSOpenAPITools.PSOpenAPITools\Api.OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Stop-FineTune**](OpenAIApi.md#Stop-FineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**New-ChatCompletion**](OpenAIApi.md#New-ChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**New-Completion**](OpenAIApi.md#New-Completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**New-Edit**](OpenAIApi.md#New-Edit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**New-Embedding**](OpenAIApi.md#New-Embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**New-File**](OpenAIApi.md#New-File) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**New-FineTune**](OpenAIApi.md#New-FineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**New-Image**](OpenAIApi.md#New-Image) | **POST** /images/generations | Creates an image given a prompt.
[**New-ImageEdit**](OpenAIApi.md#New-ImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**New-ImageVariation**](OpenAIApi.md#New-ImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**New-Moderation**](OpenAIApi.md#New-Moderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**New-Transcription**](OpenAIApi.md#New-Transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**New-Translation**](OpenAIApi.md#New-Translation) | **POST** /audio/translations | Translates audio into English.
[**Invoke-DeleteFile**](OpenAIApi.md#Invoke-DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**Invoke-DeleteModel**](OpenAIApi.md#Invoke-DeleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**Invoke-DownloadFile**](OpenAIApi.md#Invoke-DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**Invoke-ListFiles**](OpenAIApi.md#Invoke-ListFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**Invoke-ListFineTuneEvents**](OpenAIApi.md#Invoke-ListFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**Invoke-ListFineTunes**](OpenAIApi.md#Invoke-ListFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**Invoke-ListModels**](OpenAIApi.md#Invoke-ListModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**Invoke-RetrieveFile**](OpenAIApi.md#Invoke-RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**Invoke-RetrieveFineTune**](OpenAIApi.md#Invoke-RetrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**Invoke-RetrieveModel**](OpenAIApi.md#Invoke-RetrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a id="Stop-FineTune"></a>
# **Stop-FineTune**
> FineTune Stop-FineTune<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FineTuneId] <String><br>

Immediately cancel a fine-tune job. 

### Example
```powershell
$FineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # String | The ID of the fine-tune job to cancel 

# Immediately cancel a fine-tune job. 
try {
    $Result = Stop-FineTune -FineTuneId $FineTuneId
} catch {
    Write-Host ("Exception occurred when calling Stop-FineTune: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FineTuneId** | **String**| The ID of the fine-tune job to cancel  | 

### Return type

[**FineTune**](FineTune.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ChatCompletion"></a>
# **New-ChatCompletion**
> CreateChatCompletionResponse New-ChatCompletion<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateChatCompletionRequest] <PSCustomObject><br>

Creates a model response for the given chat conversation.

### Example
```powershell
$CreateChatCompletionRequestModel = Initialize-CreateChatCompletionRequestModel 

$ChatCompletionRequestMessageFunctionCall = Initialize-ChatCompletionRequestMessageFunctionCall -Name "MyName" -Arguments "MyArguments"
$ChatCompletionRequestMessage = Initialize-ChatCompletionRequestMessage -Role "system" -Content "MyContent" -Name "MyName" -FunctionCall $ChatCompletionRequestMessageFunctionCall

$ChatCompletionFunctions = Initialize-ChatCompletionFunctions -Name "MyName" -Description "MyDescription" -Parameters @{ key_example =  }
$CreateChatCompletionRequestFunctionCall = Initialize-CreateChatCompletionRequestFunctionCall -Name "MyName"
$CreateChatCompletionRequestStop = Initialize-CreateChatCompletionRequestStop 
$CreateChatCompletionRequest = Initialize-CreateChatCompletionRequest -Model $CreateChatCompletionRequestModel -Messages $ChatCompletionRequestMessage -Functions $ChatCompletionFunctions -FunctionCall $CreateChatCompletionRequestFunctionCall -Temperature 1 -TopP 1 -N 1 -Stream $false -Stop $CreateChatCompletionRequestStop -MaxTokens 0 -PresencePenalty 0 -FrequencyPenalty 0 -LogitBias  -User "user-1234" # CreateChatCompletionRequest | 

# Creates a model response for the given chat conversation.
try {
    $Result = New-ChatCompletion -CreateChatCompletionRequest $CreateChatCompletionRequest
} catch {
    Write-Host ("Exception occurred when calling New-ChatCompletion: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Completion"></a>
# **New-Completion**
> CreateCompletionResponse New-Completion<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateCompletionRequest] <PSCustomObject><br>

Creates a completion for the provided prompt and parameters.

### Example
```powershell
$CreateCompletionRequestModel = Initialize-CreateCompletionRequestModel 
$CreateCompletionRequestPrompt = Initialize-CreateCompletionRequestPrompt 
$CreateCompletionRequestStop = Initialize-CreateCompletionRequestStop 
$CreateCompletionRequest = Initialize-CreateCompletionRequest -Model $CreateCompletionRequestModel -Prompt $CreateCompletionRequestPrompt -Suffix "test." -MaxTokens 16 -Temperature 1 -TopP 1 -N 1 -Stream $false -Logprobs 0 -Echo $false -Stop $CreateCompletionRequestStop -PresencePenalty 0 -FrequencyPenalty 0 -BestOf 0 -LogitBias  -User "user-1234" # CreateCompletionRequest | 

# Creates a completion for the provided prompt and parameters.
try {
    $Result = New-Completion -CreateCompletionRequest $CreateCompletionRequest
} catch {
    Write-Host ("Exception occurred when calling New-Completion: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Edit"></a>
# **New-Edit**
> CreateEditResponse New-Edit<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateEditRequest] <PSCustomObject><br>

Creates a new edit for the provided input, instruction, and parameters.

### Example
```powershell
$CreateEditRequestModel = Initialize-CreateEditRequestModel 
$CreateEditRequest = Initialize-CreateEditRequest -Model $CreateEditRequestModel -VarInput "What day of the wek is it?" -Instruction "Fix the spelling mistakes." -N 1 -Temperature 1 -TopP 1 # CreateEditRequest | 

# Creates a new edit for the provided input, instruction, and parameters.
try {
    $Result = New-Edit -CreateEditRequest $CreateEditRequest
} catch {
    Write-Host ("Exception occurred when calling New-Edit: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateEditRequest** | [**CreateEditRequest**](CreateEditRequest.md)|  | 

### Return type

[**CreateEditResponse**](CreateEditResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Embedding"></a>
# **New-Embedding**
> CreateEmbeddingResponse New-Embedding<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateEmbeddingRequest] <PSCustomObject><br>

Creates an embedding vector representing the input text.

### Example
```powershell
$CreateEmbeddingRequestModel = Initialize-CreateEmbeddingRequestModel 
$CreateEmbeddingRequestInput = Initialize-CreateEmbeddingRequestInput 
$CreateEmbeddingRequest = Initialize-CreateEmbeddingRequest -Model $CreateEmbeddingRequestModel -VarInput $CreateEmbeddingRequestInput -User "user-1234" # CreateEmbeddingRequest | 

# Creates an embedding vector representing the input text.
try {
    $Result = New-Embedding -CreateEmbeddingRequest $CreateEmbeddingRequest
} catch {
    Write-Host ("Exception occurred when calling New-Embedding: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-File"></a>
# **New-File**
> OpenAIFile New-File<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-File] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Purpose] <String><br>

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```powershell
$File =  # System.IO.FileInfo | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to """"fine-tune"""", each line is a JSON record with """"prompt"""" and """"completion"""" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
$Purpose = "MyPurpose" # String | The intended purpose of the uploaded documents.  Use """"fine-tune"""" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

# Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
try {
    $Result = New-File -File $File -Purpose $Purpose
} catch {
    Write-Host ("Exception occurred when calling New-File: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **File** | **System.IO.FileInfo****System.IO.FileInfo**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to &quot;&quot;&quot;&quot;fine-tune&quot;&quot;&quot;&quot;, each line is a JSON record with &quot;&quot;&quot;&quot;prompt&quot;&quot;&quot;&quot; and &quot;&quot;&quot;&quot;completion&quot;&quot;&quot;&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **Purpose** | **String**| The intended purpose of the uploaded documents.  Use &quot;&quot;&quot;&quot;fine-tune&quot;&quot;&quot;&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[**OpenAIFile**](OpenAIFile.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-FineTune"></a>
# **New-FineTune**
> FineTune New-FineTune<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateFineTuneRequest] <PSCustomObject><br>

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```powershell
$CreateFineTuneRequestModel = Initialize-CreateFineTuneRequestModel 
$CreateFineTuneRequest = Initialize-CreateFineTuneRequest -TrainingFile "file-ajSREls59WBbvgSzJSVWxMCB" -ValidationFile "file-XjSREls59WBbvgSzJSVWxMCa" -Model $CreateFineTuneRequestModel -NEpochs 0 -BatchSize 0 -LearningRateMultiplier 0 -PromptLossWeight 0 -ComputeClassificationMetrics $false -ClassificationNClasses 0 -ClassificationPositiveClass "MyClassificationPositiveClass" -ClassificationBetas 0 -Suffix "MySuffix" # CreateFineTuneRequest | 

# Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
try {
    $Result = New-FineTune -CreateFineTuneRequest $CreateFineTuneRequest
} catch {
    Write-Host ("Exception occurred when calling New-FineTune: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  | 

### Return type

[**FineTune**](FineTune.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Image"></a>
# **New-Image**
> ImagesResponse New-Image<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateImageRequest] <PSCustomObject><br>

Creates an image given a prompt.

### Example
```powershell
$CreateImageRequest = Initialize-CreateImageRequest -Prompt "A cute baby sea otter" -N 1 -Size "256x256" -ResponseFormat "url" -User "user-1234" # CreateImageRequest | 

# Creates an image given a prompt.
try {
    $Result = New-Image -CreateImageRequest $CreateImageRequest
} catch {
    Write-Host ("Exception occurred when calling New-Image: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

### Return type

[**ImagesResponse**](ImagesResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ImageEdit"></a>
# **New-ImageEdit**
> ImagesResponse New-ImageEdit<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Image] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Prompt] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Mask] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-N] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Size] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ResponseFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-User] <String><br>

Creates an edited or extended image given an original image and a prompt.

### Example
```powershell
$Image =  # System.IO.FileInfo | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
$Prompt = "MyPrompt" # String | A text description of the desired image(s). The maximum length is 1000 characters.
$Mask =  # System.IO.FileInfo | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
$N = 56 # Int32 | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
$Size = "256x256" # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
$ResponseFormat = "url" # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to "url")
$User = "MyUser" # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

# Creates an edited or extended image given an original image and a prompt.
try {
    $Result = New-ImageEdit -Image $Image -Prompt $Prompt -Mask $Mask -N $N -Size $Size -ResponseFormat $ResponseFormat -User $User
} catch {
    Write-Host ("Exception occurred when calling New-ImageEdit: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Image** | **System.IO.FileInfo****System.IO.FileInfo**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **Prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **Mask** | **System.IO.FileInfo****System.IO.FileInfo**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **N** | **Int32**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **Size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **ResponseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &quot;url&quot;]
 **User** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ImageVariation"></a>
# **New-ImageVariation**
> ImagesResponse New-ImageVariation<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Image] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-N] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Size] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ResponseFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-User] <String><br>

Creates a variation of a given image.

### Example
```powershell
$Image =  # System.IO.FileInfo | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
$N = 56 # Int32 | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
$Size = "256x256" # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
$ResponseFormat = "url" # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to "url")
$User = "MyUser" # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

# Creates a variation of a given image.
try {
    $Result = New-ImageVariation -Image $Image -N $N -Size $Size -ResponseFormat $ResponseFormat -User $User
} catch {
    Write-Host ("Exception occurred when calling New-ImageVariation: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Image** | **System.IO.FileInfo****System.IO.FileInfo**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **N** | **Int32**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **Size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **ResponseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &quot;url&quot;]
 **User** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Moderation"></a>
# **New-Moderation**
> CreateModerationResponse New-Moderation<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateModerationRequest] <PSCustomObject><br>

Classifies if text violates OpenAI's Content Policy

### Example
```powershell
$CreateModerationRequestInput = Initialize-CreateModerationRequestInput 
$CreateModerationRequestModel = Initialize-CreateModerationRequestModel 
$CreateModerationRequest = Initialize-CreateModerationRequest -VarInput $CreateModerationRequestInput -Model $CreateModerationRequestModel # CreateModerationRequest | 

# Classifies if text violates OpenAI's Content Policy
try {
    $Result = New-Moderation -CreateModerationRequest $CreateModerationRequest
} catch {
    Write-Host ("Exception occurred when calling New-Moderation: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Transcription"></a>
# **New-Transcription**
> CreateTranscriptionResponse New-Transcription<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-File] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Prompt] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ResponseFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Temperature] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Language] <String><br>

Transcribes audio into the input language.

### Example
```powershell
$File =  # System.IO.FileInfo | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
$CreateTranscriptionRequestModel = Initialize-CreateTranscriptionRequestModel # CreateTranscriptionRequestModel | 
$Prompt = "MyPrompt" # String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
$ResponseFormat = "MyResponseFormat" # String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to "json")
$Temperature = 8.14 # Decimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)
$Language = "MyLanguage" # String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)

# Transcribes audio into the input language.
try {
    $Result = New-Transcription -File $File -Model $Model -Prompt $Prompt -ResponseFormat $ResponseFormat -Temperature $Temperature -Language $Language
} catch {
    Write-Host ("Exception occurred when calling New-Transcription: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **File** | **System.IO.FileInfo****System.IO.FileInfo**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **Model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **Prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **ResponseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **Temperature** | **Decimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **Language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Translation"></a>
# **New-Translation**
> CreateTranslationResponse New-Translation<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-File] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Prompt] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ResponseFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Temperature] <System.Nullable[Decimal]><br>

Translates audio into English.

### Example
```powershell
$File =  # System.IO.FileInfo | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
$CreateTranscriptionRequestModel = Initialize-CreateTranscriptionRequestModel # CreateTranscriptionRequestModel | 
$Prompt = "MyPrompt" # String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
$ResponseFormat = "MyResponseFormat" # String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to "json")
$Temperature = 8.14 # Decimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)

# Translates audio into English.
try {
    $Result = New-Translation -File $File -Model $Model -Prompt $Prompt -ResponseFormat $ResponseFormat -Temperature $Temperature
} catch {
    Write-Host ("Exception occurred when calling New-Translation: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **File** | **System.IO.FileInfo****System.IO.FileInfo**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **Model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **Prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **ResponseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **Temperature** | **Decimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteFile"></a>
# **Invoke-DeleteFile**
> DeleteFileResponse Invoke-DeleteFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Delete a file.

### Example
```powershell
$FileId = "MyFileId" # String | The ID of the file to use for this request

# Delete a file.
try {
    $Result = Invoke-DeleteFile -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FileId** | **String**| The ID of the file to use for this request | 

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteModel"></a>
# **Invoke-DeleteModel**
> DeleteModelResponse Invoke-DeleteModel<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <String><br>

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```powershell
$Model = "curie:ft-acmeco-2021-03-03-21-44-20" # String | The model to delete

# Delete a fine-tuned model. You must have the Owner role in your organization.
try {
    $Result = Invoke-DeleteModel -Model $Model
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteModel: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Model** | **String**| The model to delete | 

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DownloadFile"></a>
# **Invoke-DownloadFile**
> String Invoke-DownloadFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Returns the contents of the specified file

### Example
```powershell
$FileId = "MyFileId" # String | The ID of the file to use for this request

# Returns the contents of the specified file
try {
    $Result = Invoke-DownloadFile -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DownloadFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FileId** | **String**| The ID of the file to use for this request | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListFiles"></a>
# **Invoke-ListFiles**
> ListFilesResponse Invoke-ListFiles<br>

Returns a list of files that belong to the user's organization.

### Example
```powershell

# Returns a list of files that belong to the user's organization.
try {
    $Result = Invoke-ListFiles
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFiles: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](ListFilesResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListFineTuneEvents"></a>
# **Invoke-ListFineTuneEvents**
> ListFineTuneEventsResponse Invoke-ListFineTuneEvents<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FineTuneId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Stream] <System.Nullable[Boolean]><br>

Get fine-grained status updates for a fine-tune job. 

### Example
```powershell
$FineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # String | The ID of the fine-tune job to get events for. 
$Stream = $true # Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional) (default to $false)

# Get fine-grained status updates for a fine-tune job. 
try {
    $Result = Invoke-ListFineTuneEvents -FineTuneId $FineTuneId -Stream $Stream
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFineTuneEvents: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FineTuneId** | **String**| The ID of the fine-tune job to get events for.  | 
 **Stream** | **Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to $false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListFineTunes"></a>
# **Invoke-ListFineTunes**
> ListFineTunesResponse Invoke-ListFineTunes<br>

List your organization's fine-tuning jobs 

### Example
```powershell

# List your organization's fine-tuning jobs 
try {
    $Result = Invoke-ListFineTunes
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFineTunes: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListModels"></a>
# **Invoke-ListModels**
> ListModelsResponse Invoke-ListModels<br>

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```powershell

# Lists the currently available models, and provides basic information about each one such as the owner and availability.
try {
    $Result = Invoke-ListModels
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListModels: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveFile"></a>
# **Invoke-RetrieveFile**
> OpenAIFile Invoke-RetrieveFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Returns information about a specific file.

### Example
```powershell
$FileId = "MyFileId" # String | The ID of the file to use for this request

# Returns information about a specific file.
try {
    $Result = Invoke-RetrieveFile -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FileId** | **String**| The ID of the file to use for this request | 

### Return type

[**OpenAIFile**](OpenAIFile.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveFineTune"></a>
# **Invoke-RetrieveFineTune**
> FineTune Invoke-RetrieveFineTune<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FineTuneId] <String><br>

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```powershell
$FineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # String | The ID of the fine-tune job 

# Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
try {
    $Result = Invoke-RetrieveFineTune -FineTuneId $FineTuneId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveFineTune: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FineTuneId** | **String**| The ID of the fine-tune job  | 

### Return type

[**FineTune**](FineTune.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveModel"></a>
# **Invoke-RetrieveModel**
> Model Invoke-RetrieveModel<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <String><br>

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```powershell
$Model = "text-davinci-001" # String | The ID of the model to use for this request

# Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
try {
    $Result = Invoke-RetrieveModel -Model $Model
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveModel: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Model** | **String**| The ID of the model to use for this request | 

### Return type

[**Model**](Model.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

