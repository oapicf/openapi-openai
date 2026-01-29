# openapiopenai.EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_embedding**](EmbeddingsApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **create_embedding**
> CreateEmbeddingResponse create_embedding(create_embedding_request)

Creates an embedding vector representing the input text.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.create_embedding_request import CreateEmbeddingRequest
from openapiopenai.models.create_embedding_response import CreateEmbeddingResponse
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
    api_instance = openapiopenai.EmbeddingsApi(api_client)
    create_embedding_request = openapiopenai.CreateEmbeddingRequest() # CreateEmbeddingRequest | 

    try:
        # Creates an embedding vector representing the input text.
        api_response = api_instance.create_embedding(create_embedding_request)
        print("The response of EmbeddingsApi->create_embedding:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EmbeddingsApi->create_embedding: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

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

