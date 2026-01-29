# openapiopenai.FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tuning_job**](FineTuningApi.md#cancel_fine_tuning_job) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**create_fine_tuning_job**](FineTuningApi.md#create_fine_tuning_job) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**list_fine_tuning_events**](FineTuningApi.md#list_fine_tuning_events) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**list_fine_tuning_job_checkpoints**](FineTuningApi.md#list_fine_tuning_job_checkpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**list_paginated_fine_tuning_jobs**](FineTuningApi.md#list_paginated_fine_tuning_jobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieve_fine_tuning_job**](FineTuningApi.md#retrieve_fine_tuning_job) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **cancel_fine_tuning_job**
> FineTuningJob cancel_fine_tuning_job(fine_tuning_job_id)

Immediately cancel a fine-tune job. 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.fine_tuning_job import FineTuningJob
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.FineTuningApi(api_client)
    fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # str | The ID of the fine-tuning job to cancel. 

    try:
        # Immediately cancel a fine-tune job. 
        api_response = api_instance.cancel_fine_tuning_job(fine_tuning_job_id)
        print("The response of FineTuningApi->cancel_fine_tuning_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FineTuningApi->cancel_fine_tuning_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **str**| The ID of the fine-tuning job to cancel.  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fine_tuning_job**
> FineTuningJob create_fine_tuning_job(create_fine_tuning_job_request)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.create_fine_tuning_job_request import CreateFineTuningJobRequest
from openapiopenai.models.fine_tuning_job import FineTuningJob
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.FineTuningApi(api_client)
    create_fine_tuning_job_request = openapiopenai.CreateFineTuningJobRequest() # CreateFineTuningJobRequest | 

    try:
        # Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
        api_response = api_instance.create_fine_tuning_job(create_fine_tuning_job_request)
        print("The response of FineTuningApi->create_fine_tuning_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FineTuningApi->create_fine_tuning_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tuning_job_request** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tuning_events**
> ListFineTuningJobEventsResponse list_fine_tuning_events(fine_tuning_job_id, after=after, limit=limit)

Get status updates for a fine-tuning job. 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.list_fine_tuning_job_events_response import ListFineTuningJobEventsResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.FineTuningApi(api_client)
    fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # str | The ID of the fine-tuning job to get events for. 
    after = 'after_example' # str | Identifier for the last event from the previous pagination request. (optional)
    limit = 20 # int | Number of events to retrieve. (optional) (default to 20)

    try:
        # Get status updates for a fine-tuning job. 
        api_response = api_instance.list_fine_tuning_events(fine_tuning_job_id, after=after, limit=limit)
        print("The response of FineTuningApi->list_fine_tuning_events:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FineTuningApi->list_fine_tuning_events: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **str**| The ID of the fine-tuning job to get events for.  | 
 **after** | **str**| Identifier for the last event from the previous pagination request. | [optional] 
 **limit** | **int**| Number of events to retrieve. | [optional] [default to 20]

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tuning_job_checkpoints**
> ListFineTuningJobCheckpointsResponse list_fine_tuning_job_checkpoints(fine_tuning_job_id, after=after, limit=limit)

List checkpoints for a fine-tuning job. 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.list_fine_tuning_job_checkpoints_response import ListFineTuningJobCheckpointsResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.FineTuningApi(api_client)
    fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # str | The ID of the fine-tuning job to get checkpoints for. 
    after = 'after_example' # str | Identifier for the last checkpoint ID from the previous pagination request. (optional)
    limit = 10 # int | Number of checkpoints to retrieve. (optional) (default to 10)

    try:
        # List checkpoints for a fine-tuning job. 
        api_response = api_instance.list_fine_tuning_job_checkpoints(fine_tuning_job_id, after=after, limit=limit)
        print("The response of FineTuningApi->list_fine_tuning_job_checkpoints:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FineTuningApi->list_fine_tuning_job_checkpoints: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **str**| The ID of the fine-tuning job to get checkpoints for.  | 
 **after** | **str**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] 
 **limit** | **int**| Number of checkpoints to retrieve. | [optional] [default to 10]

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_paginated_fine_tuning_jobs**
> ListPaginatedFineTuningJobsResponse list_paginated_fine_tuning_jobs(after=after, limit=limit)

List your organization's fine-tuning jobs 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.FineTuningApi(api_client)
    after = 'after_example' # str | Identifier for the last job from the previous pagination request. (optional)
    limit = 20 # int | Number of fine-tuning jobs to retrieve. (optional) (default to 20)

    try:
        # List your organization's fine-tuning jobs 
        api_response = api_instance.list_paginated_fine_tuning_jobs(after=after, limit=limit)
        print("The response of FineTuningApi->list_paginated_fine_tuning_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FineTuningApi->list_paginated_fine_tuning_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **str**| Identifier for the last job from the previous pagination request. | [optional] 
 **limit** | **int**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_fine_tuning_job**
> FineTuningJob retrieve_fine_tuning_job(fine_tuning_job_id)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.fine_tuning_job import FineTuningJob
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.FineTuningApi(api_client)
    fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # str | The ID of the fine-tuning job. 

    try:
        # Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
        api_response = api_instance.retrieve_fine_tuning_job(fine_tuning_job_id)
        print("The response of FineTuningApi->retrieve_fine_tuning_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FineTuningApi->retrieve_fine_tuning_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **str**| The ID of the fine-tuning job.  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

