# PSOpenAPITools.PSOpenAPITools\Api.UsageApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-UsageAudioSpeeches**](UsageApi.md#Invoke-UsageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**Invoke-UsageAudioTranscriptions**](UsageApi.md#Invoke-UsageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**Invoke-UsageCodeInterpreterSessions**](UsageApi.md#Invoke-UsageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**Invoke-UsageCompletions**](UsageApi.md#Invoke-UsageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**Invoke-UsageCosts**](UsageApi.md#Invoke-UsageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**Invoke-UsageEmbeddings**](UsageApi.md#Invoke-UsageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**Invoke-UsageImages**](UsageApi.md#Invoke-UsageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**Invoke-UsageModerations**](UsageApi.md#Invoke-UsageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**Invoke-UsageVectorStores**](UsageApi.md#Invoke-UsageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


<a id="Invoke-UsageAudioSpeeches"></a>
# **Invoke-UsageAudioSpeeches**
> UsageResponse Invoke-UsageAudioSpeeches<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ApiKeyIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Models] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get audio speeches usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$UserIds = "MyUserIds" # String[] | Return only usage for these users. (optional)
$ApiKeyIds = "MyApiKeyIds" # String[] | Return only usage for these API keys. (optional)
$Models = "MyModels" # String[] | Return only usage for these models. (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get audio speeches usage details for the organization.
try {
    $Result = Invoke-UsageAudioSpeeches -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -UserIds $UserIds -ApiKeyIds $ApiKeyIds -Models $Models -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageAudioSpeeches: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **UserIds** | [**String[]**](String.md)| Return only usage for these users. | [optional] 
 **ApiKeyIds** | [**String[]**](String.md)| Return only usage for these API keys. | [optional] 
 **Models** | [**String[]**](String.md)| Return only usage for these models. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageAudioTranscriptions"></a>
# **Invoke-UsageAudioTranscriptions**
> UsageResponse Invoke-UsageAudioTranscriptions<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ApiKeyIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Models] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get audio transcriptions usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$UserIds = "MyUserIds" # String[] | Return only usage for these users. (optional)
$ApiKeyIds = "MyApiKeyIds" # String[] | Return only usage for these API keys. (optional)
$Models = "MyModels" # String[] | Return only usage for these models. (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get audio transcriptions usage details for the organization.
try {
    $Result = Invoke-UsageAudioTranscriptions -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -UserIds $UserIds -ApiKeyIds $ApiKeyIds -Models $Models -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageAudioTranscriptions: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **UserIds** | [**String[]**](String.md)| Return only usage for these users. | [optional] 
 **ApiKeyIds** | [**String[]**](String.md)| Return only usage for these API keys. | [optional] 
 **Models** | [**String[]**](String.md)| Return only usage for these models. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageCodeInterpreterSessions"></a>
# **Invoke-UsageCodeInterpreterSessions**
> UsageResponse Invoke-UsageCodeInterpreterSessions<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get code interpreter sessions usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get code interpreter sessions usage details for the organization.
try {
    $Result = Invoke-UsageCodeInterpreterSessions -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageCodeInterpreterSessions: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageCompletions"></a>
# **Invoke-UsageCompletions**
> UsageResponse Invoke-UsageCompletions<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ApiKeyIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Models] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Batch] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get completions usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$UserIds = "MyUserIds" # String[] | Return only usage for these users. (optional)
$ApiKeyIds = "MyApiKeyIds" # String[] | Return only usage for these API keys. (optional)
$Models = "MyModels" # String[] | Return only usage for these models. (optional)
$Batch = $true # Boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get completions usage details for the organization.
try {
    $Result = Invoke-UsageCompletions -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -UserIds $UserIds -ApiKeyIds $ApiKeyIds -Models $Models -Batch $Batch -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageCompletions: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **UserIds** | [**String[]**](String.md)| Return only usage for these users. | [optional] 
 **ApiKeyIds** | [**String[]**](String.md)| Return only usage for these API keys. | [optional] 
 **Models** | [**String[]**](String.md)| Return only usage for these models. | [optional] 
 **Batch** | **Boolean**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageCosts"></a>
# **Invoke-UsageCosts**
> UsageResponse Invoke-UsageCosts<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get costs details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1d" # String | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only costs for these projects. (optional)
$GroupBy = "project_id" # String[] | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional)
$Limit = 56 # Int32 | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional) (default to 7)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get costs details for the organization.
try {
    $Result = Invoke-UsageCosts -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageCosts: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only costs for these projects. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] 
 **Limit** | **Int32**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7]
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageEmbeddings"></a>
# **Invoke-UsageEmbeddings**
> UsageResponse Invoke-UsageEmbeddings<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ApiKeyIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Models] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get embeddings usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$UserIds = "MyUserIds" # String[] | Return only usage for these users. (optional)
$ApiKeyIds = "MyApiKeyIds" # String[] | Return only usage for these API keys. (optional)
$Models = "MyModels" # String[] | Return only usage for these models. (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get embeddings usage details for the organization.
try {
    $Result = Invoke-UsageEmbeddings -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -UserIds $UserIds -ApiKeyIds $ApiKeyIds -Models $Models -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageEmbeddings: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **UserIds** | [**String[]**](String.md)| Return only usage for these users. | [optional] 
 **ApiKeyIds** | [**String[]**](String.md)| Return only usage for these API keys. | [optional] 
 **Models** | [**String[]**](String.md)| Return only usage for these models. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageImages"></a>
# **Invoke-UsageImages**
> UsageResponse Invoke-UsageImages<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Sources] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Sizes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ApiKeyIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Models] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get images usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$Sources = "image.generation" # String[] | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional)
$Sizes = "256x256" # String[] | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional)
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$UserIds = "MyUserIds" # String[] | Return only usage for these users. (optional)
$ApiKeyIds = "MyApiKeyIds" # String[] | Return only usage for these API keys. (optional)
$Models = "MyModels" # String[] | Return only usage for these models. (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get images usage details for the organization.
try {
    $Result = Invoke-UsageImages -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -Sources $Sources -Sizes $Sizes -ProjectIds $ProjectIds -UserIds $UserIds -ApiKeyIds $ApiKeyIds -Models $Models -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageImages: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **Sources** | [**String[]**](String.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] 
 **Sizes** | [**String[]**](String.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] 
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **UserIds** | [**String[]**](String.md)| Return only usage for these users. | [optional] 
 **ApiKeyIds** | [**String[]**](String.md)| Return only usage for these API keys. | [optional] 
 **Models** | [**String[]**](String.md)| Return only usage for these models. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageModerations"></a>
# **Invoke-UsageModerations**
> UsageResponse Invoke-UsageModerations<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ApiKeyIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Models] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get moderations usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$UserIds = "MyUserIds" # String[] | Return only usage for these users. (optional)
$ApiKeyIds = "MyApiKeyIds" # String[] | Return only usage for these API keys. (optional)
$Models = "MyModels" # String[] | Return only usage for these models. (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get moderations usage details for the organization.
try {
    $Result = Invoke-UsageModerations -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -UserIds $UserIds -ApiKeyIds $ApiKeyIds -Models $Models -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageModerations: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **UserIds** | [**String[]**](String.md)| Return only usage for these users. | [optional] 
 **ApiKeyIds** | [**String[]**](String.md)| Return only usage for these API keys. | [optional] 
 **Models** | [**String[]**](String.md)| Return only usage for these models. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UsageVectorStores"></a>
# **Invoke-UsageVectorStores**
> UsageResponse Invoke-UsageVectorStores<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartTime] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndTime] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BucketWidth] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupBy] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Page] <String><br>

Get vector stores usage details for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$StartTime = 56 # Int32 | Start time (Unix seconds) of the query time range, inclusive.
$EndTime = 56 # Int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
$BucketWidth = "1m" # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
$ProjectIds = "MyProjectIds" # String[] | Return only usage for these projects. (optional)
$GroupBy = "project_id" # String[] | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
$Limit = 56 # Int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
$Page = "MyPage" # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

# Get vector stores usage details for the organization.
try {
    $Result = Invoke-UsageVectorStores -StartTime $StartTime -EndTime $EndTime -BucketWidth $BucketWidth -ProjectIds $ProjectIds -GroupBy $GroupBy -Limit $Limit -Page $Page
} catch {
    Write-Host ("Exception occurred when calling Invoke-UsageVectorStores: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartTime** | **Int32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **EndTime** | **Int32**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **BucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **ProjectIds** | [**String[]**](String.md)| Return only usage for these projects. | [optional] 
 **GroupBy** | [**String[]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **Limit** | **Int32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **Page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

