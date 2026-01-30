# UsageController

All URIs are relative to `"/v1"`

The controller class is defined in **[UsageController.java](../../src/main/java/org/openapitools/controller/UsageController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageAudioSpeeches**](#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioTranscriptions**](#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageCodeInterpreterSessions**](#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCompletions**](#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCosts**](#usageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**usageEmbeddings**](#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageImages**](#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageModerations**](#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageVectorStores**](#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.

<a id="usageAudioSpeeches"></a>
# **usageAudioSpeeches**
```java
Mono<UsageResponse> UsageController.usageAudioSpeeches(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get audio speeches usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**userIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these users. | [optional parameter]
**apiKeyIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these API keys. | [optional parameter]
**models** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these models. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageAudioTranscriptions"></a>
# **usageAudioTranscriptions**
```java
Mono<UsageResponse> UsageController.usageAudioTranscriptions(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get audio transcriptions usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**userIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these users. | [optional parameter]
**apiKeyIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these API keys. | [optional parameter]
**models** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these models. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageCodeInterpreterSessions"></a>
# **usageCodeInterpreterSessions**
```java
Mono<UsageResponse> UsageController.usageCodeInterpreterSessions(startTimeendTimebucketWidthprojectIdsgroupBylimitpage)
```

Get code interpreter sessions usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional parameter] [enum: `project_id`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageCompletions"></a>
# **usageCompletions**
```java
Mono<UsageResponse> UsageController.usageCompletions(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsbatchgroupBylimitpage)
```

Get completions usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**userIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these users. | [optional parameter]
**apiKeyIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these API keys. | [optional parameter]
**models** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these models. | [optional parameter]
**batch** | `Boolean` | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`, `batch`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageCosts"></a>
# **usageCosts**
```java
Mono<UsageResponse> UsageController.usageCosts(startTimeendTimebucketWidthprojectIdsgroupBylimitpage)
```

Get costs details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only costs for these projects. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional parameter] [enum: `project_id`, `line_item`]
**limit** | `Integer` | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional parameter] [default to `7`]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageEmbeddings"></a>
# **usageEmbeddings**
```java
Mono<UsageResponse> UsageController.usageEmbeddings(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get embeddings usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**userIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these users. | [optional parameter]
**apiKeyIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these API keys. | [optional parameter]
**models** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these models. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageImages"></a>
# **usageImages**
```java
Mono<UsageResponse> UsageController.usageImages(startTimeendTimebucketWidthsourcessizesprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get images usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**sources** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional parameter] [enum: `image.generation`, `image.edit`, `image.variation`]
**sizes** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional parameter] [enum: `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**userIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these users. | [optional parameter]
**apiKeyIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these API keys. | [optional parameter]
**models** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these models. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageModerations"></a>
# **usageModerations**
```java
Mono<UsageResponse> UsageController.usageModerations(startTimeendTimebucketWidthprojectIdsuserIdsapiKeyIdsmodelsgroupBylimitpage)
```

Get moderations usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**userIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these users. | [optional parameter]
**apiKeyIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these API keys. | [optional parameter]
**models** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these models. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional parameter] [enum: `project_id`, `user_id`, `api_key_id`, `model`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="usageVectorStores"></a>
# **usageVectorStores**
```java
Mono<UsageResponse> UsageController.usageVectorStores(startTimeendTimebucketWidthprojectIdsgroupBylimitpage)
```

Get vector stores usage details for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startTime** | `Integer` | Start time (Unix seconds) of the query time range, inclusive. |
**endTime** | `Integer` | End time (Unix seconds) of the query time range, exclusive. | [optional parameter]
**bucketWidth** | `String` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional parameter] [default to `1d`] [enum: `1m`, `1h`, `1d`]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only usage for these projects. | [optional parameter]
**groupBy** | [**List&lt;String&gt;**](../../docs/models/String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional parameter] [enum: `project_id`]
**limit** | `Integer` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional parameter]
**page** | `String` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional parameter]

### Return type
[**UsageResponse**](../../docs/models/UsageResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

