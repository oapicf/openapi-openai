# WWW::OpenAPIClient::ModelsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ModelsApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_model**](ModelsApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**list_models**](ModelsApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_model**](ModelsApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **delete_model**
> DeleteModelResponse delete_model(model => $model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ModelsApi;
my $api_instance = WWW::OpenAPIClient::ModelsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $model = ft:gpt-3.5-turbo:acemeco:suffix:abc123; # string | The model to delete

eval {
    my $result = $api_instance->delete_model(model => $model);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ModelsApi->delete_model: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The model to delete | 

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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
use WWW::OpenAPIClient::ModelsApi;
my $api_instance = WWW::OpenAPIClient::ModelsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);


eval {
    my $result = $api_instance->list_models();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ModelsApi->list_models: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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
use WWW::OpenAPIClient::ModelsApi;
my $api_instance = WWW::OpenAPIClient::ModelsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $model = gpt-3.5-turbo; # string | The ID of the model to use for this request

eval {
    my $result = $api_instance->retrieve_model(model => $model);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ModelsApi->retrieve_model: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The ID of the model to use for this request | 

### Return type

[**Model**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

