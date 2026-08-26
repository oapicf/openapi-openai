# UsageAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageAudioSpeeches**](UsageAPI.md#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioTranscriptions**](UsageAPI.md#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageCodeInterpreterSessions**](UsageAPI.md#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCompletions**](UsageAPI.md#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCosts**](UsageAPI.md#usagecosts) | **GET** /organization/costs | Get costs details for the organization.
[**usageEmbeddings**](UsageAPI.md#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageImages**](UsageAPI.md#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageModerations**](UsageAPI.md#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageVectorStores**](UsageAPI.md#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **usageAudioSpeeches**
```swift
    open class func usageAudioSpeeches(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageAudioSpeeches? = nil, projectIds: [String]? = nil, userIds: [String]? = nil, apiKeyIds: [String]? = nil, models: [String]? = nil, groupBy: [GroupBy_usageAudioSpeeches]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get audio speeches usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let userIds = ["inner_example"] // [String] | Return only usage for these users. (optional)
let apiKeyIds = ["inner_example"] // [String] | Return only usage for these API keys. (optional)
let models = ["inner_example"] // [String] | Return only usage for these models. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get audio speeches usage details for the organization.
UsageAPI.usageAudioSpeeches(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md) | Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md) | Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md) | Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageAudioTranscriptions**
```swift
    open class func usageAudioTranscriptions(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageAudioTranscriptions? = nil, projectIds: [String]? = nil, userIds: [String]? = nil, apiKeyIds: [String]? = nil, models: [String]? = nil, groupBy: [GroupBy_usageAudioTranscriptions]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get audio transcriptions usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let userIds = ["inner_example"] // [String] | Return only usage for these users. (optional)
let apiKeyIds = ["inner_example"] // [String] | Return only usage for these API keys. (optional)
let models = ["inner_example"] // [String] | Return only usage for these models. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get audio transcriptions usage details for the organization.
UsageAPI.usageAudioTranscriptions(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md) | Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md) | Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md) | Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCodeInterpreterSessions**
```swift
    open class func usageCodeInterpreterSessions(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageCodeInterpreterSessions? = nil, projectIds: [String]? = nil, groupBy: [GroupBy_usageCodeInterpreterSessions]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get code interpreter sessions usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get code interpreter sessions usage details for the organization.
UsageAPI.usageCodeInterpreterSessions(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCompletions**
```swift
    open class func usageCompletions(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageCompletions? = nil, projectIds: [String]? = nil, userIds: [String]? = nil, apiKeyIds: [String]? = nil, models: [String]? = nil, batch: Bool? = nil, groupBy: [GroupBy_usageCompletions]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get completions usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let userIds = ["inner_example"] // [String] | Return only usage for these users. (optional)
let apiKeyIds = ["inner_example"] // [String] | Return only usage for these API keys. (optional)
let models = ["inner_example"] // [String] | Return only usage for these models. (optional)
let batch = true // Bool | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get completions usage details for the organization.
UsageAPI.usageCompletions(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, batch: batch, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md) | Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md) | Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md) | Return only usage for these models. | [optional] 
 **batch** | **Bool** | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCosts**
```swift
    open class func usageCosts(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageCosts? = nil, projectIds: [String]? = nil, groupBy: [GroupBy_usageCosts]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get costs details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only costs for these projects. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional)
let limit = 987 // Int | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional) (default to 7)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get costs details for the organization.
UsageAPI.usageCosts(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only costs for these projects. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] 
 **limit** | **Int** | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7]
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageEmbeddings**
```swift
    open class func usageEmbeddings(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageEmbeddings? = nil, projectIds: [String]? = nil, userIds: [String]? = nil, apiKeyIds: [String]? = nil, models: [String]? = nil, groupBy: [GroupBy_usageEmbeddings]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get embeddings usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let userIds = ["inner_example"] // [String] | Return only usage for these users. (optional)
let apiKeyIds = ["inner_example"] // [String] | Return only usage for these API keys. (optional)
let models = ["inner_example"] // [String] | Return only usage for these models. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get embeddings usage details for the organization.
UsageAPI.usageEmbeddings(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md) | Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md) | Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md) | Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageImages**
```swift
    open class func usageImages(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageImages? = nil, sources: [Sources_usageImages]? = nil, sizes: [Sizes_usageImages]? = nil, projectIds: [String]? = nil, userIds: [String]? = nil, apiKeyIds: [String]? = nil, models: [String]? = nil, groupBy: [GroupBy_usageImages]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get images usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let sources = ["sources_example"] // [String] | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional)
let sizes = ["sizes_example"] // [String] | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let userIds = ["inner_example"] // [String] | Return only usage for these users. (optional)
let apiKeyIds = ["inner_example"] // [String] | Return only usage for these API keys. (optional)
let models = ["inner_example"] // [String] | Return only usage for these models. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get images usage details for the organization.
UsageAPI.usageImages(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, sources: sources, sizes: sizes, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **sources** | [**[String]**](String.md) | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] 
 **sizes** | [**[String]**](String.md) | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] 
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md) | Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md) | Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md) | Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageModerations**
```swift
    open class func usageModerations(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageModerations? = nil, projectIds: [String]? = nil, userIds: [String]? = nil, apiKeyIds: [String]? = nil, models: [String]? = nil, groupBy: [GroupBy_usageModerations]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get moderations usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let userIds = ["inner_example"] // [String] | Return only usage for these users. (optional)
let apiKeyIds = ["inner_example"] // [String] | Return only usage for these API keys. (optional)
let models = ["inner_example"] // [String] | Return only usage for these models. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get moderations usage details for the organization.
UsageAPI.usageModerations(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **userIds** | [**[String]**](String.md) | Return only usage for these users. | [optional] 
 **apiKeyIds** | [**[String]**](String.md) | Return only usage for these API keys. | [optional] 
 **models** | [**[String]**](String.md) | Return only usage for these models. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageVectorStores**
```swift
    open class func usageVectorStores(startTime: Int, endTime: Int? = nil, bucketWidth: BucketWidth_usageVectorStores? = nil, projectIds: [String]? = nil, groupBy: [GroupBy_usageVectorStores]? = nil, limit: Int? = nil, page: String? = nil, completion: @escaping (_ data: UsageResponse?, _ error: Error?) -> Void)
```

Get vector stores usage details for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startTime = 987 // Int | Start time (Unix seconds) of the query time range, inclusive.
let endTime = 987 // Int | End time (Unix seconds) of the query time range, exclusive. (optional)
let bucketWidth = "bucketWidth_example" // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to ._1d)
let projectIds = ["inner_example"] // [String] | Return only usage for these projects. (optional)
let groupBy = ["groupBy_example"] // [String] | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
let limit = 987 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
let page = "page_example" // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

// Get vector stores usage details for the organization.
UsageAPI.usageVectorStores(startTime: startTime, endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, groupBy: groupBy, limit: limit, page: page) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **Int** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to ._1d]
 **projectIds** | [**[String]**](String.md) | Return only usage for these projects. | [optional] 
 **groupBy** | [**[String]**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **Int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

