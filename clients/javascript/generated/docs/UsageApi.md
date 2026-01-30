# OpenapiOpenai.UsageApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageAudioSpeeches**](UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioTranscriptions**](UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageCodeInterpreterSessions**](UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCompletions**](UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCosts**](UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**usageEmbeddings**](UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageImages**](UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageModerations**](UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageVectorStores**](UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.



## usageAudioSpeeches

> UsageResponse usageAudioSpeeches(startTime, opts)

Get audio speeches usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'userIds': ["null"], // [String] | Return only usage for these users.
  'apiKeyIds': ["null"], // [String] | Return only usage for these API keys.
  'models': ["null"], // [String] | Return only usage for these models.
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageAudioSpeeches(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md)| Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageAudioTranscriptions

> UsageResponse usageAudioTranscriptions(startTime, opts)

Get audio transcriptions usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'userIds': ["null"], // [String] | Return only usage for these users.
  'apiKeyIds': ["null"], // [String] | Return only usage for these API keys.
  'models': ["null"], // [String] | Return only usage for these models.
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageAudioTranscriptions(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md)| Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageCodeInterpreterSessions

> UsageResponse usageCodeInterpreterSessions(startTime, opts)

Get code interpreter sessions usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageCodeInterpreterSessions(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageCompletions

> UsageResponse usageCompletions(startTime, opts)

Get completions usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'userIds': ["null"], // [String] | Return only usage for these users.
  'apiKeyIds': ["null"], // [String] | Return only usage for these API keys.
  'models': ["null"], // [String] | Return only usage for these models.
  'batch': true, // Boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageCompletions(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md)| Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md)| Return only usage for these models. | [optional] 
 **batch** | **Boolean**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageCosts

> UsageResponse usageCosts(startTime, opts)

Get costs details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only costs for these projects.
  'groupBy': ["null"], // [String] | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
  'limit': 7, // Number | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageCosts(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only costs for these projects. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] 
 **limit** | **Number**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageEmbeddings

> UsageResponse usageEmbeddings(startTime, opts)

Get embeddings usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'userIds': ["null"], // [String] | Return only usage for these users.
  'apiKeyIds': ["null"], // [String] | Return only usage for these API keys.
  'models': ["null"], // [String] | Return only usage for these models.
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageEmbeddings(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md)| Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageImages

> UsageResponse usageImages(startTime, opts)

Get images usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'sources': ["null"], // [String] | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
  'sizes': ["null"], // [String] | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'userIds': ["null"], // [String] | Return only usage for these users.
  'apiKeyIds': ["null"], // [String] | Return only usage for these API keys.
  'models': ["null"], // [String] | Return only usage for these models.
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageImages(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **sources** | [**[String]**](String.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] 
 **sizes** | [**[String]**](String.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] 
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md)| Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageModerations

> UsageResponse usageModerations(startTime, opts)

Get moderations usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'userIds': ["null"], // [String] | Return only usage for these users.
  'apiKeyIds': ["null"], // [String] | Return only usage for these API keys.
  'models': ["null"], // [String] | Return only usage for these models.
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageModerations(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md)| Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usageVectorStores

> UsageResponse usageVectorStores(startTime, opts)

Get vector stores usage details for the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.UsageApi();
let startTime = 56; // Number | Start time (Unix seconds) of the query time range, inclusive.
let opts = {
  'endTime': 56, // Number | End time (Unix seconds) of the query time range, exclusive.
  'bucketWidth': "'1d'", // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  'projectIds': ["null"], // [String] | Return only usage for these projects.
  'groupBy': ["null"], // [String] | Group the usage data by the specified fields. Support fields include `project_id`.
  'limit': 56, // Number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  'page': "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
};
apiInstance.usageVectorStores(startTime, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Number**| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Number**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**[String]**](String.md)| Return only usage for these projects. | [optional] 
 **groupBy** | [**[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **Number**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

