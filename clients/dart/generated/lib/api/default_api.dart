//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class DefaultApi {
  DefaultApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create an organization admin API key
  ///
  /// Create a new admin-level API key for the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [AdminApiKeysCreateRequest] adminApiKeysCreateRequest (required):
  Future<Response> adminApiKeysCreateWithHttpInfo(AdminApiKeysCreateRequest adminApiKeysCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/admin_api_keys';

    // ignore: prefer_final_locals
    Object? postBody = adminApiKeysCreateRequest;

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

  /// Create an organization admin API key
  ///
  /// Create a new admin-level API key for the organization.
  ///
  /// Parameters:
  ///
  /// * [AdminApiKeysCreateRequest] adminApiKeysCreateRequest (required):
  Future<AdminApiKey?> adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest,) async {
    final response = await adminApiKeysCreateWithHttpInfo(adminApiKeysCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdminApiKey',) as AdminApiKey;
    
    }
    return null;
  }

  /// Delete an organization admin API key
  ///
  /// Delete the specified admin API key.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] keyId (required):
  Future<Response> adminApiKeysDeleteWithHttpInfo(String keyId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/admin_api_keys/{key_id}'
      .replaceAll('{key_id}', keyId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete an organization admin API key
  ///
  /// Delete the specified admin API key.
  ///
  /// Parameters:
  ///
  /// * [String] keyId (required):
  Future<AdminApiKeysDelete200Response?> adminApiKeysDelete(String keyId,) async {
    final response = await adminApiKeysDeleteWithHttpInfo(keyId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdminApiKeysDelete200Response',) as AdminApiKeysDelete200Response;
    
    }
    return null;
  }

  /// Retrieve a single organization API key
  ///
  /// Get details for a specific organization API key by its ID.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] keyId (required):
  Future<Response> adminApiKeysGetWithHttpInfo(String keyId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/admin_api_keys/{key_id}'
      .replaceAll('{key_id}', keyId);

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

  /// Retrieve a single organization API key
  ///
  /// Get details for a specific organization API key by its ID.
  ///
  /// Parameters:
  ///
  /// * [String] keyId (required):
  Future<AdminApiKey?> adminApiKeysGet(String keyId,) async {
    final response = await adminApiKeysGetWithHttpInfo(keyId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdminApiKey',) as AdminApiKey;
    
    }
    return null;
  }

  /// List organization API keys
  ///
  /// Retrieve a paginated list of organization admin API keys.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] after:
  ///
  /// * [String] order:
  ///
  /// * [int] limit:
  Future<Response> adminApiKeysListWithHttpInfo({ String? after, String? order, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/admin_api_keys';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
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

  /// List organization API keys
  ///
  /// Retrieve a paginated list of organization admin API keys.
  ///
  /// Parameters:
  ///
  /// * [String] after:
  ///
  /// * [String] order:
  ///
  /// * [int] limit:
  Future<ApiKeyList?> adminApiKeysList({ String? after, String? order, int? limit, }) async {
    final response = await adminApiKeysListWithHttpInfo( after: after, order: order, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ApiKeyList',) as ApiKeyList;
    
    }
    return null;
  }
}
