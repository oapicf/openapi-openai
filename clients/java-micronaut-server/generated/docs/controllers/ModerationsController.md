# ModerationsController

All URIs are relative to `"/v1"`

The controller class is defined in **[ModerationsController.java](../../src/main/java/org/openapitools/controller/ModerationsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

<a id="createModeration"></a>
# **createModeration**
```java
Mono<CreateModerationResponse> ModerationsController.createModeration(createModerationRequest)
```

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createModerationRequest** | [**CreateModerationRequest**](../../docs/models/CreateModerationRequest.md) |  |

### Return type
[**CreateModerationResponse**](../../docs/models/CreateModerationResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

