//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/usage_response.dart';

class UsageApi {

  final Dio _dio;

  final Serializers _serializers;

  const UsageApi(this._dio, this._serializers);

  /// Get audio speeches usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [projectIds] - Return only usage for these projects.
  /// * [userIds] - Return only usage for these users.
  /// * [apiKeyIds] - Return only usage for these API keys.
  /// * [models] - Return only usage for these models.
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageAudioSpeeches({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? userIds,
    BuiltList<String>? apiKeyIds,
    BuiltList<String>? models,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/audio_speeches';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (userIds != null) r'user_ids': encodeCollectionQueryParameter<String>(_serializers, userIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (apiKeyIds != null) r'api_key_ids': encodeCollectionQueryParameter<String>(_serializers, apiKeyIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (models != null) r'models': encodeCollectionQueryParameter<String>(_serializers, models, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get audio transcriptions usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [projectIds] - Return only usage for these projects.
  /// * [userIds] - Return only usage for these users.
  /// * [apiKeyIds] - Return only usage for these API keys.
  /// * [models] - Return only usage for these models.
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageAudioTranscriptions({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? userIds,
    BuiltList<String>? apiKeyIds,
    BuiltList<String>? models,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/audio_transcriptions';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (userIds != null) r'user_ids': encodeCollectionQueryParameter<String>(_serializers, userIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (apiKeyIds != null) r'api_key_ids': encodeCollectionQueryParameter<String>(_serializers, apiKeyIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (models != null) r'models': encodeCollectionQueryParameter<String>(_serializers, models, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get code interpreter sessions usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [projectIds] - Return only usage for these projects.
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageCodeInterpreterSessions({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/code_interpreter_sessions';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get completions usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [projectIds] - Return only usage for these projects.
  /// * [userIds] - Return only usage for these users.
  /// * [apiKeyIds] - Return only usage for these API keys.
  /// * [models] - Return only usage for these models.
  /// * [batch] - If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageCompletions({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? userIds,
    BuiltList<String>? apiKeyIds,
    BuiltList<String>? models,
    bool? batch,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/completions';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (userIds != null) r'user_ids': encodeCollectionQueryParameter<String>(_serializers, userIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (apiKeyIds != null) r'api_key_ids': encodeCollectionQueryParameter<String>(_serializers, apiKeyIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (models != null) r'models': encodeCollectionQueryParameter<String>(_serializers, models, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (batch != null) r'batch': encodeQueryParameter(_serializers, batch, const FullType(bool)),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get costs details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
  /// * [projectIds] - Return only costs for these projects.
  /// * [groupBy] - Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
  /// * [limit] - A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageCosts({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? groupBy,
    int? limit = 7,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/costs';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get embeddings usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [projectIds] - Return only usage for these projects.
  /// * [userIds] - Return only usage for these users.
  /// * [apiKeyIds] - Return only usage for these API keys.
  /// * [models] - Return only usage for these models.
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageEmbeddings({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? userIds,
    BuiltList<String>? apiKeyIds,
    BuiltList<String>? models,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/embeddings';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (userIds != null) r'user_ids': encodeCollectionQueryParameter<String>(_serializers, userIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (apiKeyIds != null) r'api_key_ids': encodeCollectionQueryParameter<String>(_serializers, apiKeyIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (models != null) r'models': encodeCollectionQueryParameter<String>(_serializers, models, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get images usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [sources] - Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
  /// * [sizes] - Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
  /// * [projectIds] - Return only usage for these projects.
  /// * [userIds] - Return only usage for these users.
  /// * [apiKeyIds] - Return only usage for these API keys.
  /// * [models] - Return only usage for these models.
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageImages({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? sources,
    BuiltList<String>? sizes,
    BuiltList<String>? projectIds,
    BuiltList<String>? userIds,
    BuiltList<String>? apiKeyIds,
    BuiltList<String>? models,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/images';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (sources != null) r'sources': encodeCollectionQueryParameter<String>(_serializers, sources, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (sizes != null) r'sizes': encodeCollectionQueryParameter<String>(_serializers, sizes, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (userIds != null) r'user_ids': encodeCollectionQueryParameter<String>(_serializers, userIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (apiKeyIds != null) r'api_key_ids': encodeCollectionQueryParameter<String>(_serializers, apiKeyIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (models != null) r'models': encodeCollectionQueryParameter<String>(_serializers, models, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get moderations usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [projectIds] - Return only usage for these projects.
  /// * [userIds] - Return only usage for these users.
  /// * [apiKeyIds] - Return only usage for these API keys.
  /// * [models] - Return only usage for these models.
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageModerations({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? userIds,
    BuiltList<String>? apiKeyIds,
    BuiltList<String>? models,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/moderations';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (userIds != null) r'user_ids': encodeCollectionQueryParameter<String>(_serializers, userIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (apiKeyIds != null) r'api_key_ids': encodeCollectionQueryParameter<String>(_serializers, apiKeyIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (models != null) r'models': encodeCollectionQueryParameter<String>(_serializers, models, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get vector stores usage details for the organization.
  /// 
  ///
  /// Parameters:
  /// * [startTime] - Start time (Unix seconds) of the query time range, inclusive.
  /// * [endTime] - End time (Unix seconds) of the query time range, exclusive.
  /// * [bucketWidth] - Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  /// * [projectIds] - Return only usage for these projects.
  /// * [groupBy] - Group the usage data by the specified fields. Support fields include `project_id`.
  /// * [limit] - Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  /// * [page] - A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UsageResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UsageResponse>> usageVectorStores({ 
    required int startTime,
    int? endTime,
    String? bucketWidth = '1d',
    BuiltList<String>? projectIds,
    BuiltList<String>? groupBy,
    int? limit,
    String? page,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/usage/vector_stores';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'bearer',
            'name': 'ApiKeyAuth',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'start_time': encodeQueryParameter(_serializers, startTime, const FullType(int)),
      if (endTime != null) r'end_time': encodeQueryParameter(_serializers, endTime, const FullType(int)),
      if (bucketWidth != null) r'bucket_width': encodeQueryParameter(_serializers, bucketWidth, const FullType(String)),
      if (projectIds != null) r'project_ids': encodeCollectionQueryParameter<String>(_serializers, projectIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (groupBy != null) r'group_by': encodeCollectionQueryParameter<String>(_serializers, groupBy, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (page != null) r'page': encodeQueryParameter(_serializers, page, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UsageResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UsageResponse),
      ) as UsageResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UsageResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

}
