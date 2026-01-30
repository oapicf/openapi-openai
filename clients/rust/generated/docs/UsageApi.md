# \UsageApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usage_audio_speeches**](UsageApi.md#usage_audio_speeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usage_audio_transcriptions**](UsageApi.md#usage_audio_transcriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usage_code_interpreter_sessions**](UsageApi.md#usage_code_interpreter_sessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usage_completions**](UsageApi.md#usage_completions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usage_costs**](UsageApi.md#usage_costs) | **GET** /organization/costs | Get costs details for the organization.
[**usage_embeddings**](UsageApi.md#usage_embeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usage_images**](UsageApi.md#usage_images) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usage_moderations**](UsageApi.md#usage_moderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usage_vector_stores**](UsageApi.md#usage_vector_stores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.



## usage_audio_speeches

> models::UsageResponse usage_audio_speeches(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)
Get audio speeches usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**user_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these users. |  |
**api_key_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these API keys. |  |
**models** | Option<[**Vec<String>**](String.md)> | Return only usage for these models. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_audio_transcriptions

> models::UsageResponse usage_audio_transcriptions(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)
Get audio transcriptions usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**user_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these users. |  |
**api_key_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these API keys. |  |
**models** | Option<[**Vec<String>**](String.md)> | Return only usage for these models. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_code_interpreter_sessions

> models::UsageResponse usage_code_interpreter_sessions(start_time, end_time, bucket_width, project_ids, group_by, limit, page)
Get code interpreter sessions usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_completions

> models::UsageResponse usage_completions(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, batch, group_by, limit, page)
Get completions usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**user_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these users. |  |
**api_key_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these API keys. |  |
**models** | Option<[**Vec<String>**](String.md)> | Return only usage for these models. |  |
**batch** | Option<**bool**> | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_costs

> models::UsageResponse usage_costs(start_time, end_time, bucket_width, project_ids, group_by, limit, page)
Get costs details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only costs for these projects. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. |  |
**limit** | Option<**i32**> | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  |  |[default to 7]
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_embeddings

> models::UsageResponse usage_embeddings(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)
Get embeddings usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**user_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these users. |  |
**api_key_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these API keys. |  |
**models** | Option<[**Vec<String>**](String.md)> | Return only usage for these models. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_images

> models::UsageResponse usage_images(start_time, end_time, bucket_width, sources, sizes, project_ids, user_ids, api_key_ids, models, group_by, limit, page)
Get images usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**sources** | Option<[**Vec<String>**](String.md)> | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. |  |
**sizes** | Option<[**Vec<String>**](String.md)> | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. |  |
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**user_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these users. |  |
**api_key_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these API keys. |  |
**models** | Option<[**Vec<String>**](String.md)> | Return only usage for these models. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_moderations

> models::UsageResponse usage_moderations(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)
Get moderations usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**user_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these users. |  |
**api_key_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these API keys. |  |
**models** | Option<[**Vec<String>**](String.md)> | Return only usage for these models. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usage_vector_stores

> models::UsageResponse usage_vector_stores(start_time, end_time, bucket_width, project_ids, group_by, limit, page)
Get vector stores usage details for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_time** | **i32** | Start time (Unix seconds) of the query time range, inclusive. | [required] |
**end_time** | Option<**i32**> | End time (Unix seconds) of the query time range, exclusive. |  |
**bucket_width** | Option<**String**> | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. |  |[default to 1d]
**project_ids** | Option<[**Vec<String>**](String.md)> | Return only usage for these projects. |  |
**group_by** | Option<[**Vec<String>**](String.md)> | Group the usage data by the specified fields. Support fields include `project_id`. |  |
**limit** | Option<**i32**> | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  |  |
**page** | Option<**String**> | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. |  |

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

