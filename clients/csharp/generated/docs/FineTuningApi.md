# Org.OpenAPITools.Api.FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelFineTuningJob**](FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
| [**CreateFineTuningJob**](FineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| [**ListFineTuningEvents**](FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
| [**ListFineTuningJobCheckpoints**](FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
| [**ListPaginatedFineTuningJobs**](FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs  |
| [**RetrieveFineTuningJob**](FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |

<a id="cancelfinetuningjob"></a>
# **CancelFineTuningJob**
> FineTuningJob CancelFineTuningJob (string fineTuningJobId)

Immediately cancel a fine-tune job. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CancelFineTuningJobExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new FineTuningApi(config);
            var fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F;  // string | The ID of the fine-tuning job to cancel. 

            try
            {
                // Immediately cancel a fine-tune job. 
                FineTuningJob result = apiInstance.CancelFineTuningJob(fineTuningJobId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FineTuningApi.CancelFineTuningJob: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CancelFineTuningJobWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Immediately cancel a fine-tune job. 
    ApiResponse<FineTuningJob> response = apiInstance.CancelFineTuningJobWithHttpInfo(fineTuningJobId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FineTuningApi.CancelFineTuningJobWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job to cancel.  |  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createfinetuningjob"></a>
# **CreateFineTuningJob**
> FineTuningJob CreateFineTuningJob (CreateFineTuningJobRequest createFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateFineTuningJobExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new FineTuningApi(config);
            var createFineTuningJobRequest = new CreateFineTuningJobRequest(); // CreateFineTuningJobRequest | 

            try
            {
                // Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
                FineTuningJob result = apiInstance.CreateFineTuningJob(createFineTuningJobRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FineTuningApi.CreateFineTuningJob: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateFineTuningJobWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    ApiResponse<FineTuningJob> response = apiInstance.CreateFineTuningJobWithHttpInfo(createFineTuningJobRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FineTuningApi.CreateFineTuningJobWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md) |  |  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listfinetuningevents"></a>
# **ListFineTuningEvents**
> ListFineTuningJobEventsResponse ListFineTuningEvents (string fineTuningJobId, string? after = null, int? limit = null)

Get status updates for a fine-tuning job. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListFineTuningEventsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new FineTuningApi(config);
            var fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F;  // string | The ID of the fine-tuning job to get events for. 
            var after = "after_example";  // string? | Identifier for the last event from the previous pagination request. (optional) 
            var limit = 20;  // int? | Number of events to retrieve. (optional)  (default to 20)

            try
            {
                // Get status updates for a fine-tuning job. 
                ListFineTuningJobEventsResponse result = apiInstance.ListFineTuningEvents(fineTuningJobId, after, limit);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FineTuningApi.ListFineTuningEvents: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListFineTuningEventsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get status updates for a fine-tuning job. 
    ApiResponse<ListFineTuningJobEventsResponse> response = apiInstance.ListFineTuningEventsWithHttpInfo(fineTuningJobId, after, limit);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FineTuningApi.ListFineTuningEventsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job to get events for.  |  |
| **after** | **string?** | Identifier for the last event from the previous pagination request. | [optional]  |
| **limit** | **int?** | Number of events to retrieve. | [optional] [default to 20] |

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listfinetuningjobcheckpoints"></a>
# **ListFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse ListFineTuningJobCheckpoints (string fineTuningJobId, string? after = null, int? limit = null)

List checkpoints for a fine-tuning job. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListFineTuningJobCheckpointsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new FineTuningApi(config);
            var fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F;  // string | The ID of the fine-tuning job to get checkpoints for. 
            var after = "after_example";  // string? | Identifier for the last checkpoint ID from the previous pagination request. (optional) 
            var limit = 10;  // int? | Number of checkpoints to retrieve. (optional)  (default to 10)

            try
            {
                // List checkpoints for a fine-tuning job. 
                ListFineTuningJobCheckpointsResponse result = apiInstance.ListFineTuningJobCheckpoints(fineTuningJobId, after, limit);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FineTuningApi.ListFineTuningJobCheckpoints: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListFineTuningJobCheckpointsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List checkpoints for a fine-tuning job. 
    ApiResponse<ListFineTuningJobCheckpointsResponse> response = apiInstance.ListFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId, after, limit);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FineTuningApi.ListFineTuningJobCheckpointsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job to get checkpoints for.  |  |
| **after** | **string?** | Identifier for the last checkpoint ID from the previous pagination request. | [optional]  |
| **limit** | **int?** | Number of checkpoints to retrieve. | [optional] [default to 10] |

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listpaginatedfinetuningjobs"></a>
# **ListPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse ListPaginatedFineTuningJobs (string? after = null, int? limit = null)

List your organization's fine-tuning jobs 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListPaginatedFineTuningJobsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new FineTuningApi(config);
            var after = "after_example";  // string? | Identifier for the last job from the previous pagination request. (optional) 
            var limit = 20;  // int? | Number of fine-tuning jobs to retrieve. (optional)  (default to 20)

            try
            {
                // List your organization's fine-tuning jobs 
                ListPaginatedFineTuningJobsResponse result = apiInstance.ListPaginatedFineTuningJobs(after, limit);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FineTuningApi.ListPaginatedFineTuningJobs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListPaginatedFineTuningJobsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List your organization's fine-tuning jobs 
    ApiResponse<ListPaginatedFineTuningJobsResponse> response = apiInstance.ListPaginatedFineTuningJobsWithHttpInfo(after, limit);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FineTuningApi.ListPaginatedFineTuningJobsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **after** | **string?** | Identifier for the last job from the previous pagination request. | [optional]  |
| **limit** | **int?** | Number of fine-tuning jobs to retrieve. | [optional] [default to 20] |

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="retrievefinetuningjob"></a>
# **RetrieveFineTuningJob**
> FineTuningJob RetrieveFineTuningJob (string fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RetrieveFineTuningJobExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new FineTuningApi(config);
            var fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F;  // string | The ID of the fine-tuning job. 

            try
            {
                // Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
                FineTuningJob result = apiInstance.RetrieveFineTuningJob(fineTuningJobId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FineTuningApi.RetrieveFineTuningJob: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RetrieveFineTuningJobWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    ApiResponse<FineTuningJob> response = apiInstance.RetrieveFineTuningJobWithHttpInfo(fineTuningJobId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FineTuningApi.RetrieveFineTuningJobWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job.  |  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

