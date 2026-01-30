# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key |
| [**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
| [**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
| [**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys |


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="adminApiKeysCreate"></a>
# **adminApiKeysCreate**
```java
Mono<AdminApiKey> DefaultApi.adminApiKeysCreate(adminApiKeysCreateRequest)
```

Create an organization admin API key

Create a new admin-level API key for the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  | |


### Return type
[**AdminApiKey**](AdminApiKey.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adminApiKeysDelete"></a>
# **adminApiKeysDelete**
```java
Mono<AdminApiKeysDelete200Response> DefaultApi.adminApiKeysDelete(keyId)
```

Delete an organization admin API key

Delete the specified admin API key.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyId** | `String`|  | |


### Return type
[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adminApiKeysGet"></a>
# **adminApiKeysGet**
```java
Mono<AdminApiKey> DefaultApi.adminApiKeysGet(keyId)
```

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyId** | `String`|  | |


### Return type
[**AdminApiKey**](AdminApiKey.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adminApiKeysList"></a>
# **adminApiKeysList**
```java
Mono<ApiKeyList> DefaultApi.adminApiKeysList(afterorderlimit)
```

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | `String`|  | [optional parameter] |
| **order** | `String`|  | [optional parameter] [default to `asc`] [enum: `asc`, `desc`] |
| **limit** | `Integer`|  | [optional parameter] [default to `20`] |


### Return type
[**ApiKeyList**](ApiKeyList.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

