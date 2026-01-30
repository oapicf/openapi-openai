# UsageApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usageAudioSpeeches**](UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
| [**usageAudioTranscriptions**](UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
| [**usageCodeInterpreterSessions**](UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
| [**usageCompletions**](UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
| [**usageCosts**](UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization. |
| [**usageEmbeddings**](UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
| [**usageImages**](UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization. |
| [**usageModerations**](UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
| [**usageVectorStores**](UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |


## Creating UsageApi

To initiate an instance of `UsageApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.UsageApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(UsageApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    UsageApi usageApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="usageAudioSpeeches"></a>
# **usageAudioSpeeches**
```java
Mono<UsageResponse> UsageApi.usageAudioSpeeches(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get audio speeches usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional parameter] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional parameter] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageAudioTranscriptions"></a>
# **usageAudioTranscriptions**
```java
Mono<UsageResponse> UsageApi.usageAudioTranscriptions(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get audio transcriptions usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional parameter] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional parameter] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageCodeInterpreterSessions"></a>
# **usageCodeInterpreterSessions**
```java
Mono<UsageResponse> UsageApi.usageCodeInterpreterSessions(startTimeendTimebucketWidthprojectIdsgroupBylimitpage)
```

Get code interpreter sessions usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional parameter] [enum: `project_id`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageCompletions"></a>
# **usageCompletions**
```java
Mono<UsageResponse> UsageApi.usageCompletions(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsbatchgroupBylimitpage)
```

Get completions usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional parameter] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional parameter] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional parameter] |
| **batch** | `Boolean`| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`, `batch`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageCosts"></a>
# **usageCosts**
```java
Mono<UsageResponse> UsageApi.usageCosts(startTimeendTimebucketWidthprojectIdsgroupBylimitpage)
```

Get costs details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only costs for these projects. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional parameter] [enum: `project_id`, `line_item`] |
| **limit** | `Integer`| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional parameter] [default to `7`] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageEmbeddings"></a>
# **usageEmbeddings**
```java
Mono<UsageResponse> UsageApi.usageEmbeddings(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get embeddings usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional parameter] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional parameter] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageImages"></a>
# **usageImages**
```java
Mono<UsageResponse> UsageApi.usageImages(startTimeendTimebucketWidthsourcessizesprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get images usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **sources** | [**List&lt;String&gt;**](String.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional parameter] [enum: `image.generation`, `image.edit`, `image.variation`] |
| **sizes** | [**List&lt;String&gt;**](String.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional parameter] [enum: `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional parameter] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional parameter] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageModerations"></a>
# **usageModerations**
```java
Mono<UsageResponse> UsageApi.usageModerations(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get moderations usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional parameter] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional parameter] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="usageVectorStores"></a>
# **usageVectorStores**
```java
Mono<UsageResponse> UsageApi.usageVectorStores(startTimeendTimebucketWidthprojectIdsgroupBylimitpage)
```

Get vector stores usage details for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | `Integer`| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | `Integer`| End time (Unix seconds) of the query time range, exclusive. | [optional parameter] |
| **bucketWidth** | `String`| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional parameter] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional parameter] [enum: `project_id`] |
| **limit** | `Integer`| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter] |
| **page** | `String`| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter] |


### Return type
[**UsageResponse**](UsageResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

