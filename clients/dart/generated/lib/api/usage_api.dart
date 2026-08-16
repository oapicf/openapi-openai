//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class UsageApi {
  UsageApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get audio speeches usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageAudioSpeechesWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/audio_speeches';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (userIds != null) {
      queryParams.addAll(_queryParams('multi', 'user_ids', userIds));
    }
    if (apiKeyIds != null) {
      queryParams.addAll(_queryParams('multi', 'api_key_ids', apiKeyIds));
    }
    if (models != null) {
      queryParams.addAll(_queryParams('multi', 'models', models));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get audio speeches usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageAudioSpeeches(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageAudioSpeechesWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get audio transcriptions usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageAudioTranscriptionsWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/audio_transcriptions';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (userIds != null) {
      queryParams.addAll(_queryParams('multi', 'user_ids', userIds));
    }
    if (apiKeyIds != null) {
      queryParams.addAll(_queryParams('multi', 'api_key_ids', apiKeyIds));
    }
    if (models != null) {
      queryParams.addAll(_queryParams('multi', 'models', models));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get audio transcriptions usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageAudioTranscriptions(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageAudioTranscriptionsWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get code interpreter sessions usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageCodeInterpreterSessionsWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/code_interpreter_sessions';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get code interpreter sessions usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageCodeInterpreterSessions(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageCodeInterpreterSessionsWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get completions usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [bool] batch:
  ///   If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageCompletionsWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, bool? batch, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/completions';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (userIds != null) {
      queryParams.addAll(_queryParams('multi', 'user_ids', userIds));
    }
    if (apiKeyIds != null) {
      queryParams.addAll(_queryParams('multi', 'api_key_ids', apiKeyIds));
    }
    if (models != null) {
      queryParams.addAll(_queryParams('multi', 'models', models));
    }
    if (batch != null) {
      queryParams.addAll(_queryParams('', 'batch', batch));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get completions usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [bool] batch:
  ///   If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageCompletions(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, bool? batch, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageCompletionsWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, batch: batch, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get costs details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only costs for these projects.
  ///
  /// * [List<String>] groupBy:
  ///   Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
  ///
  /// * [int] limit:
  ///   A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageCostsWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/costs';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get costs details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only costs for these projects.
  ///
  /// * [List<String>] groupBy:
  ///   Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
  ///
  /// * [int] limit:
  ///   A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageCosts(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageCostsWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get embeddings usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageEmbeddingsWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/embeddings';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (userIds != null) {
      queryParams.addAll(_queryParams('multi', 'user_ids', userIds));
    }
    if (apiKeyIds != null) {
      queryParams.addAll(_queryParams('multi', 'api_key_ids', apiKeyIds));
    }
    if (models != null) {
      queryParams.addAll(_queryParams('multi', 'models', models));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get embeddings usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageEmbeddings(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageEmbeddingsWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get images usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] sources:
  ///   Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
  ///
  /// * [List<String>] sizes:
  ///   Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageImagesWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? sources, List<String>? sizes, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/images';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (sources != null) {
      queryParams.addAll(_queryParams('multi', 'sources', sources));
    }
    if (sizes != null) {
      queryParams.addAll(_queryParams('multi', 'sizes', sizes));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (userIds != null) {
      queryParams.addAll(_queryParams('multi', 'user_ids', userIds));
    }
    if (apiKeyIds != null) {
      queryParams.addAll(_queryParams('multi', 'api_key_ids', apiKeyIds));
    }
    if (models != null) {
      queryParams.addAll(_queryParams('multi', 'models', models));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get images usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] sources:
  ///   Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
  ///
  /// * [List<String>] sizes:
  ///   Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageImages(int startTime, { int? endTime, String? bucketWidth, List<String>? sources, List<String>? sizes, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageImagesWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, sources: sources, sizes: sizes, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get moderations usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageModerationsWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/moderations';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (userIds != null) {
      queryParams.addAll(_queryParams('multi', 'user_ids', userIds));
    }
    if (apiKeyIds != null) {
      queryParams.addAll(_queryParams('multi', 'api_key_ids', apiKeyIds));
    }
    if (models != null) {
      queryParams.addAll(_queryParams('multi', 'models', models));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get moderations usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] userIds:
  ///   Return only usage for these users.
  ///
  /// * [List<String>] apiKeyIds:
  ///   Return only usage for these API keys.
  ///
  /// * [List<String>] models:
  ///   Return only usage for these models.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageModerations(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? userIds, List<String>? apiKeyIds, List<String>? models, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageModerationsWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, userIds: userIds, apiKeyIds: apiKeyIds, models: models, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }

  /// Get vector stores usage details for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<Response> usageVectorStoresWithHttpInfo(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? groupBy, int? limit, String? page, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/usage/vector_stores';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_time', startTime));
    if (endTime != null) {
      queryParams.addAll(_queryParams('', 'end_time', endTime));
    }
    if (bucketWidth != null) {
      queryParams.addAll(_queryParams('', 'bucket_width', bucketWidth));
    }
    if (projectIds != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids', projectIds));
    }
    if (groupBy != null) {
      queryParams.addAll(_queryParams('multi', 'group_by', groupBy));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get vector stores usage details for the organization.
  ///
  /// Parameters:
  ///
  /// * [int] startTime (required):
  ///   Start time (Unix seconds) of the query time range, inclusive.
  ///
  /// * [int] endTime:
  ///   End time (Unix seconds) of the query time range, exclusive.
  ///
  /// * [String] bucketWidth:
  ///   Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  ///
  /// * [List<String>] projectIds:
  ///   Return only usage for these projects.
  ///
  /// * [List<String>] groupBy:
  ///   Group the usage data by the specified fields. Support fields include `project_id`.
  ///
  /// * [int] limit:
  ///   Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  ///
  /// * [String] page:
  ///   A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
  Future<UsageResponse?> usageVectorStores(int startTime, { int? endTime, String? bucketWidth, List<String>? projectIds, List<String>? groupBy, int? limit, String? page, }) async {
    final response = await usageVectorStoresWithHttpInfo(startTime,  endTime: endTime, bucketWidth: bucketWidth, projectIds: projectIds, groupBy: groupBy, limit: limit, page: page, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UsageResponse',) as UsageResponse;
    
    }
    return null;
  }
}
