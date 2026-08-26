# DefaultAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](DefaultAPI.md#adminapikeyscreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](DefaultAPI.md#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](DefaultAPI.md#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](DefaultAPI.md#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys


# **adminApiKeysCreate**
```swift
    open class func adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest, completion: @escaping (_ data: AdminApiKey?, _ error: Error?) -> Void)
```

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adminApiKeysCreateRequest = admin_api_keys_create_request(name: "name_example") // AdminApiKeysCreateRequest | 

// Create an organization admin API key
DefaultAPI.adminApiKeysCreate(adminApiKeysCreateRequest: adminApiKeysCreateRequest) { (response, error) in
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
 **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md) |  | 

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysDelete**
```swift
    open class func adminApiKeysDelete(keyId: String, completion: @escaping (_ data: AdminApiKeysDelete200Response?, _ error: Error?) -> Void)
```

Delete an organization admin API key

Delete the specified admin API key.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let keyId = "keyId_example" // String | 

// Delete an organization admin API key
DefaultAPI.adminApiKeysDelete(keyId: keyId) { (response, error) in
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
 **keyId** | **String** |  | 

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysGet**
```swift
    open class func adminApiKeysGet(keyId: String, completion: @escaping (_ data: AdminApiKey?, _ error: Error?) -> Void)
```

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let keyId = "keyId_example" // String | 

// Retrieve a single organization API key
DefaultAPI.adminApiKeysGet(keyId: keyId) { (response, error) in
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
 **keyId** | **String** |  | 

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysList**
```swift
    open class func adminApiKeysList(after: String? = nil, order: Order_adminApiKeysList? = nil, limit: Int? = nil, completion: @escaping (_ data: ApiKeyList?, _ error: Error?) -> Void)
```

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let after = "after_example" // String |  (optional)
let order = "order_example" // String |  (optional) (default to .asc)
let limit = 987 // Int |  (optional) (default to 20)

// List organization API keys
DefaultAPI.adminApiKeysList(after: after, order: order, limit: limit) { (response, error) in
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
 **after** | **String** |  | [optional] 
 **order** | **String** |  | [optional] [default to .asc]
 **limit** | **Int** |  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

