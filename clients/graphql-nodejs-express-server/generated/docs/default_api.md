# default_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminApiKeysCreate**](default_api.md#AdminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**AdminApiKeysDelete**](default_api.md#AdminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**AdminApiKeysGet**](default_api.md#AdminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**AdminApiKeysList**](default_api.md#AdminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys


<a name="AdminApiKeysCreate"></a>
# **AdminApiKeysCreate**
> AdminApiKey AdminApiKeysCreate(adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.
<a name="AdminApiKeysDelete"></a>
# **AdminApiKeysDelete**
> AdminApiKeysDelete200Response AdminApiKeysDelete(keyId)

Delete an organization admin API key

Delete the specified admin API key.
<a name="AdminApiKeysGet"></a>
# **AdminApiKeysGet**
> AdminApiKey AdminApiKeysGet(keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.
<a name="AdminApiKeysList"></a>
# **AdminApiKeysList**
> ApiKeyList AdminApiKeysList(after, order, limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.
