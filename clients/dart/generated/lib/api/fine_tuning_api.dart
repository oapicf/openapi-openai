//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class FineTuningApi {
  FineTuningApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Immediately cancel a fine-tune job. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job to cancel. 
  Future<Response> cancelFineTuningJobWithHttpInfo(String fineTuningJobId,) async {
    // ignore: prefer_const_declarations
    final path = r'/fine_tuning/jobs/{fine_tuning_job_id}/cancel'
      .replaceAll('{fine_tuning_job_id}', fineTuningJobId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Immediately cancel a fine-tune job. 
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job to cancel. 
  Future<FineTuningJob?> cancelFineTuningJob(String fineTuningJobId,) async {
    final response = await cancelFineTuningJobWithHttpInfo(fineTuningJobId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'FineTuningJob',) as FineTuningJob;
    
    }
    return null;
  }

  /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CreateFineTuningJobRequest] createFineTuningJobRequest (required):
  Future<Response> createFineTuningJobWithHttpInfo(CreateFineTuningJobRequest createFineTuningJobRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/fine_tuning/jobs';

    // ignore: prefer_final_locals
    Object? postBody = createFineTuningJobRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  ///
  /// Parameters:
  ///
  /// * [CreateFineTuningJobRequest] createFineTuningJobRequest (required):
  Future<FineTuningJob?> createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest,) async {
    final response = await createFineTuningJobWithHttpInfo(createFineTuningJobRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'FineTuningJob',) as FineTuningJob;
    
    }
    return null;
  }

  /// Get status updates for a fine-tuning job. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job to get events for. 
  ///
  /// * [String] after:
  ///   Identifier for the last event from the previous pagination request.
  ///
  /// * [int] limit:
  ///   Number of events to retrieve.
  Future<Response> listFineTuningEventsWithHttpInfo(String fineTuningJobId, { String? after, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/fine_tuning/jobs/{fine_tuning_job_id}/events'
      .replaceAll('{fine_tuning_job_id}', fineTuningJobId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
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

  /// Get status updates for a fine-tuning job. 
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job to get events for. 
  ///
  /// * [String] after:
  ///   Identifier for the last event from the previous pagination request.
  ///
  /// * [int] limit:
  ///   Number of events to retrieve.
  Future<ListFineTuningJobEventsResponse?> listFineTuningEvents(String fineTuningJobId, { String? after, int? limit, }) async {
    final response = await listFineTuningEventsWithHttpInfo(fineTuningJobId,  after: after, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListFineTuningJobEventsResponse',) as ListFineTuningJobEventsResponse;
    
    }
    return null;
  }

  /// List checkpoints for a fine-tuning job. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job to get checkpoints for. 
  ///
  /// * [String] after:
  ///   Identifier for the last checkpoint ID from the previous pagination request.
  ///
  /// * [int] limit:
  ///   Number of checkpoints to retrieve.
  Future<Response> listFineTuningJobCheckpointsWithHttpInfo(String fineTuningJobId, { String? after, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints'
      .replaceAll('{fine_tuning_job_id}', fineTuningJobId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
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

  /// List checkpoints for a fine-tuning job. 
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job to get checkpoints for. 
  ///
  /// * [String] after:
  ///   Identifier for the last checkpoint ID from the previous pagination request.
  ///
  /// * [int] limit:
  ///   Number of checkpoints to retrieve.
  Future<ListFineTuningJobCheckpointsResponse?> listFineTuningJobCheckpoints(String fineTuningJobId, { String? after, int? limit, }) async {
    final response = await listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId,  after: after, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListFineTuningJobCheckpointsResponse',) as ListFineTuningJobCheckpointsResponse;
    
    }
    return null;
  }

  /// List your organization's fine-tuning jobs 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] after:
  ///   Identifier for the last job from the previous pagination request.
  ///
  /// * [int] limit:
  ///   Number of fine-tuning jobs to retrieve.
  Future<Response> listPaginatedFineTuningJobsWithHttpInfo({ String? after, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/fine_tuning/jobs';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
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

  /// List your organization's fine-tuning jobs 
  ///
  /// Parameters:
  ///
  /// * [String] after:
  ///   Identifier for the last job from the previous pagination request.
  ///
  /// * [int] limit:
  ///   Number of fine-tuning jobs to retrieve.
  Future<ListPaginatedFineTuningJobsResponse?> listPaginatedFineTuningJobs({ String? after, int? limit, }) async {
    final response = await listPaginatedFineTuningJobsWithHttpInfo( after: after, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListPaginatedFineTuningJobsResponse',) as ListPaginatedFineTuningJobsResponse;
    
    }
    return null;
  }

  /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job. 
  Future<Response> retrieveFineTuningJobWithHttpInfo(String fineTuningJobId,) async {
    // ignore: prefer_const_declarations
    final path = r'/fine_tuning/jobs/{fine_tuning_job_id}'
      .replaceAll('{fine_tuning_job_id}', fineTuningJobId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  ///
  /// Parameters:
  ///
  /// * [String] fineTuningJobId (required):
  ///   The ID of the fine-tuning job. 
  Future<FineTuningJob?> retrieveFineTuningJob(String fineTuningJobId,) async {
    final response = await retrieveFineTuningJobWithHttpInfo(fineTuningJobId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'FineTuningJob',) as FineTuningJob;
    
    }
    return null;
  }
}
