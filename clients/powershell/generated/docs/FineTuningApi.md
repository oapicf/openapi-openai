# PSOpenAPITools.PSOpenAPITools\Api.FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Stop-FineTuningJob**](FineTuningApi.md#Stop-FineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**New-FineTuningJob**](FineTuningApi.md#New-FineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**Invoke-ListFineTuningEvents**](FineTuningApi.md#Invoke-ListFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**Invoke-ListFineTuningJobCheckpoints**](FineTuningApi.md#Invoke-ListFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**Invoke-ListPaginatedFineTuningJobs**](FineTuningApi.md#Invoke-ListPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**Invoke-RetrieveFineTuningJob**](FineTuningApi.md#Invoke-RetrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


<a id="Stop-FineTuningJob"></a>
# **Stop-FineTuningJob**
> FineTuningJob Stop-FineTuningJob<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FineTuningJobId] <String><br>

Immediately cancel a fine-tune job. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$FineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # String | The ID of the fine-tuning job to cancel. 

# Immediately cancel a fine-tune job. 
try {
    $Result = Stop-FineTuningJob -FineTuningJobId $FineTuningJobId
} catch {
    Write-Host ("Exception occurred when calling Stop-FineTuningJob: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FineTuningJobId** | **String**| The ID of the fine-tuning job to cancel.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-FineTuningJob"></a>
# **New-FineTuningJob**
> FineTuningJob New-FineTuningJob<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateFineTuningJobRequest] <PSCustomObject><br>

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateFineTuningJobRequestModel = Initialize-CreateFineTuningJobRequestModel 

$CreateFineTuningJobRequestHyperparametersBatchSize = Initialize-CreateFineTuningJobRequestHyperparametersBatchSize 
$CreateFineTuningJobRequestHyperparametersLearningRateMultiplier = Initialize-CreateFineTuningJobRequestHyperparametersLearningRateMultiplier 
$CreateFineTuningJobRequestHyperparametersNEpochs = Initialize-CreateFineTuningJobRequestHyperparametersNEpochs 
$CreateFineTuningJobRequestHyperparameters = Initialize-CreateFineTuningJobRequestHyperparameters -BatchSize $CreateFineTuningJobRequestHyperparametersBatchSize -LearningRateMultiplier $CreateFineTuningJobRequestHyperparametersLearningRateMultiplier -NEpochs $CreateFineTuningJobRequestHyperparametersNEpochs

$CreateFineTuningJobRequestIntegrationsInnerWandb = Initialize-CreateFineTuningJobRequestIntegrationsInnerWandb -Project "my-wandb-project" -Name "MyName" -Entity "MyEntity" -Tags "custom-tag"
$CreateFineTuningJobRequestIntegrationsInner = Initialize-CreateFineTuningJobRequestIntegrationsInner -Type "wandb" -Wandb $CreateFineTuningJobRequestIntegrationsInnerWandb

$FineTuneMethod = Initialize-FineTuneMethod -Type "supervised" -Supervised  -Dpo 
$CreateFineTuningJobRequest = Initialize-CreateFineTuningJobRequest -Model $CreateFineTuningJobRequestModel -TrainingFile "file-abc123" -Hyperparameters $CreateFineTuningJobRequestHyperparameters -Suffix "MySuffix" -ValidationFile "file-abc123" -Integrations $CreateFineTuningJobRequestIntegrationsInner -Seed 42 -Method $FineTuneMethod # CreateFineTuningJobRequest | 

# Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
try {
    $Result = New-FineTuningJob -CreateFineTuningJobRequest $CreateFineTuningJobRequest
} catch {
    Write-Host ("Exception occurred when calling New-FineTuningJob: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  | 

### Return type

[**FineTuningJob**](FineTuningJob.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListFineTuningEvents"></a>
# **Invoke-ListFineTuningEvents**
> ListFineTuningJobEventsResponse Invoke-ListFineTuningEvents<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FineTuningJobId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

Get status updates for a fine-tuning job. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$FineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # String | The ID of the fine-tuning job to get events for. 
$After = "MyAfter" # String | Identifier for the last event from the previous pagination request. (optional)
$Limit = 56 # Int32 | Number of events to retrieve. (optional) (default to 20)

# Get status updates for a fine-tuning job. 
try {
    $Result = Invoke-ListFineTuningEvents -FineTuningJobId $FineTuningJobId -After $After -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFineTuningEvents: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FineTuningJobId** | **String**| The ID of the fine-tuning job to get events for.  | 
 **After** | **String**| Identifier for the last event from the previous pagination request. | [optional] 
 **Limit** | **Int32**| Number of events to retrieve. | [optional] [default to 20]

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListFineTuningJobCheckpoints"></a>
# **Invoke-ListFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse Invoke-ListFineTuningJobCheckpoints<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FineTuningJobId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

List checkpoints for a fine-tuning job. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$FineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # String | The ID of the fine-tuning job to get checkpoints for. 
$After = "MyAfter" # String | Identifier for the last checkpoint ID from the previous pagination request. (optional)
$Limit = 56 # Int32 | Number of checkpoints to retrieve. (optional) (default to 10)

# List checkpoints for a fine-tuning job. 
try {
    $Result = Invoke-ListFineTuningJobCheckpoints -FineTuningJobId $FineTuningJobId -After $After -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListFineTuningJobCheckpoints: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FineTuningJobId** | **String**| The ID of the fine-tuning job to get checkpoints for.  | 
 **After** | **String**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] 
 **Limit** | **Int32**| Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListPaginatedFineTuningJobs"></a>
# **Invoke-ListPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse Invoke-ListPaginatedFineTuningJobs<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

List your organization's fine-tuning jobs 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$After = "MyAfter" # String | Identifier for the last job from the previous pagination request. (optional)
$Limit = 56 # Int32 | Number of fine-tuning jobs to retrieve. (optional) (default to 20)

# List your organization's fine-tuning jobs 
try {
    $Result = Invoke-ListPaginatedFineTuningJobs -After $After -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListPaginatedFineTuningJobs: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **After** | **String**| Identifier for the last job from the previous pagination request. | [optional] 
 **Limit** | **Int32**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveFineTuningJob"></a>
# **Invoke-RetrieveFineTuningJob**
> FineTuningJob Invoke-RetrieveFineTuningJob<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FineTuningJobId] <String><br>

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$FineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # String | The ID of the fine-tuning job. 

# Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
try {
    $Result = Invoke-RetrieveFineTuningJob -FineTuningJobId $FineTuningJobId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveFineTuningJob: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FineTuningJobId** | **String**| The ID of the fine-tuning job.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

