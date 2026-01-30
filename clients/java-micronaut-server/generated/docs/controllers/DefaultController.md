# DefaultController

All URIs are relative to `"/v1"`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys

<a id="adminApiKeysCreate"></a>
# **adminApiKeysCreate**
```java
Mono<AdminApiKey> DefaultController.adminApiKeysCreate(adminApiKeysCreateRequest)
```

Create an organization admin API key

Create a new admin-level API key for the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](../../docs/models/AdminApiKeysCreateRequest.md) |  |

### Return type
[**AdminApiKey**](../../docs/models/AdminApiKey.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="adminApiKeysDelete"></a>
# **adminApiKeysDelete**
```java
Mono<AdminApiKeysDelete200Response> DefaultController.adminApiKeysDelete(keyId)
```

Delete an organization admin API key

Delete the specified admin API key.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**keyId** | `String` |  |

### Return type
[**AdminApiKeysDelete200Response**](../../docs/models/AdminApiKeysDelete200Response.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="adminApiKeysGet"></a>
# **adminApiKeysGet**
```java
Mono<AdminApiKey> DefaultController.adminApiKeysGet(keyId)
```

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**keyId** | `String` |  |

### Return type
[**AdminApiKey**](../../docs/models/AdminApiKey.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="adminApiKeysList"></a>
# **adminApiKeysList**
```java
Mono<ApiKeyList> DefaultController.adminApiKeysList(afterorderlimit)
```

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**after** | `String` |  | [optional parameter]
**order** | `String` |  | [optional parameter] [default to `asc`] [enum: `asc`, `desc`]
**limit** | `Integer` |  | [optional parameter] [default to `20`]

### Return type
[**ApiKeyList**](../../docs/models/ApiKeyList.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

