# OAIDefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](OAIDefaultApi.md#adminapikeyscreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](OAIDefaultApi.md#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](OAIDefaultApi.md#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](OAIDefaultApi.md#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys


# **adminApiKeysCreate**
```objc
-(NSURLSessionTask*) adminApiKeysCreateWithAdminApiKeysCreateRequest: (OAIAdminApiKeysCreateRequest*) adminApiKeysCreateRequest
        completionHandler: (void (^)(OAIAdminApiKey* output, NSError* error)) handler;
```

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAIAdminApiKeysCreateRequest* adminApiKeysCreateRequest = [[OAIAdminApiKeysCreateRequest alloc] init]; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Create an organization admin API key
[apiInstance adminApiKeysCreateWithAdminApiKeysCreateRequest:adminApiKeysCreateRequest
          completionHandler: ^(OAIAdminApiKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->adminApiKeysCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminApiKeysCreateRequest** | [**OAIAdminApiKeysCreateRequest***](OAIAdminApiKeysCreateRequest.md)|  | 

### Return type

[**OAIAdminApiKey***](OAIAdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysDelete**
```objc
-(NSURLSessionTask*) adminApiKeysDeleteWithKeyId: (NSString*) keyId
        completionHandler: (void (^)(OAIAdminApiKeysDelete200Response* output, NSError* error)) handler;
```

Delete an organization admin API key

Delete the specified admin API key.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* keyId = @"keyId_example"; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Delete an organization admin API key
[apiInstance adminApiKeysDeleteWithKeyId:keyId
          completionHandler: ^(OAIAdminApiKeysDelete200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->adminApiKeysDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **NSString***|  | 

### Return type

[**OAIAdminApiKeysDelete200Response***](OAIAdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysGet**
```objc
-(NSURLSessionTask*) adminApiKeysGetWithKeyId: (NSString*) keyId
        completionHandler: (void (^)(OAIAdminApiKey* output, NSError* error)) handler;
```

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* keyId = @"keyId_example"; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Retrieve a single organization API key
[apiInstance adminApiKeysGetWithKeyId:keyId
          completionHandler: ^(OAIAdminApiKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->adminApiKeysGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **NSString***|  | 

### Return type

[**OAIAdminApiKey***](OAIAdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysList**
```objc
-(NSURLSessionTask*) adminApiKeysListWithAfter: (NSString*) after
    order: (NSString*) order
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIApiKeyList* output, NSError* error)) handler;
```

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* after = @"after_example"; //  (optional)
NSString* order = @"asc"; //  (optional) (default to @"asc")
NSNumber* limit = @20; //  (optional) (default to @20)

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// List organization API keys
[apiInstance adminApiKeysListWithAfter:after
              order:order
              limit:limit
          completionHandler: ^(OAIApiKeyList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->adminApiKeysList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **NSString***|  | [optional] 
 **order** | **NSString***|  | [optional] [default to @&quot;asc&quot;]
 **limit** | **NSNumber***|  | [optional] [default to @20]

### Return type

[**OAIApiKeyList***](OAIApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

