//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ProjectsApi {
  ProjectsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Archives a project in the organization. Archived projects cannot be used or updated.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  Future<Response> archiveProjectWithHttpInfo(String projectId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/archive'
      .replaceAll('{project_id}', projectId);

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

  /// Archives a project in the organization. Archived projects cannot be used or updated.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  Future<Project?> archiveProject(String projectId,) async {
    final response = await archiveProjectWithHttpInfo(projectId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Project',) as Project;
    
    }
    return null;
  }

  /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [ProjectCreateRequest] projectCreateRequest (required):
  ///   The project create request payload.
  Future<Response> createProjectWithHttpInfo(ProjectCreateRequest projectCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects';

    // ignore: prefer_final_locals
    Object? postBody = projectCreateRequest;

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

  /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
  ///
  /// Parameters:
  ///
  /// * [ProjectCreateRequest] projectCreateRequest (required):
  ///   The project create request payload.
  Future<Project?> createProject(ProjectCreateRequest projectCreateRequest,) async {
    final response = await createProjectWithHttpInfo(projectCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Project',) as Project;
    
    }
    return null;
  }

  /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [ProjectServiceAccountCreateRequest] projectServiceAccountCreateRequest (required):
  ///   The project service account create request payload.
  Future<Response> createProjectServiceAccountWithHttpInfo(String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/service_accounts'
      .replaceAll('{project_id}', projectId);

    // ignore: prefer_final_locals
    Object? postBody = projectServiceAccountCreateRequest;

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

  /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [ProjectServiceAccountCreateRequest] projectServiceAccountCreateRequest (required):
  ///   The project service account create request payload.
  Future<ProjectServiceAccountCreateResponse?> createProjectServiceAccount(String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest,) async {
    final response = await createProjectServiceAccountWithHttpInfo(projectId, projectServiceAccountCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectServiceAccountCreateResponse',) as ProjectServiceAccountCreateResponse;
    
    }
    return null;
  }

  /// Adds a user to the project. Users must already be members of the organization to be added to a project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [ProjectUserCreateRequest] projectUserCreateRequest (required):
  ///   The project user create request payload.
  Future<Response> createProjectUserWithHttpInfo(String projectId, ProjectUserCreateRequest projectUserCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/users'
      .replaceAll('{project_id}', projectId);

    // ignore: prefer_final_locals
    Object? postBody = projectUserCreateRequest;

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

  /// Adds a user to the project. Users must already be members of the organization to be added to a project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [ProjectUserCreateRequest] projectUserCreateRequest (required):
  ///   The project user create request payload.
  Future<ProjectUser?> createProjectUser(String projectId, ProjectUserCreateRequest projectUserCreateRequest,) async {
    final response = await createProjectUserWithHttpInfo(projectId, projectUserCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectUser',) as ProjectUser;
    
    }
    return null;
  }

  /// Deletes an API key from the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] keyId (required):
  ///   The ID of the API key.
  Future<Response> deleteProjectApiKeyWithHttpInfo(String projectId, String keyId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/api_keys/{key_id}'
      .replaceAll('{project_id}', projectId)
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

  /// Deletes an API key from the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] keyId (required):
  ///   The ID of the API key.
  Future<ProjectApiKeyDeleteResponse?> deleteProjectApiKey(String projectId, String keyId,) async {
    final response = await deleteProjectApiKeyWithHttpInfo(projectId, keyId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectApiKeyDeleteResponse',) as ProjectApiKeyDeleteResponse;
    
    }
    return null;
  }

  /// Deletes a service account from the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] serviceAccountId (required):
  ///   The ID of the service account.
  Future<Response> deleteProjectServiceAccountWithHttpInfo(String projectId, String serviceAccountId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/service_accounts/{service_account_id}'
      .replaceAll('{project_id}', projectId)
      .replaceAll('{service_account_id}', serviceAccountId);

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

  /// Deletes a service account from the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] serviceAccountId (required):
  ///   The ID of the service account.
  Future<ProjectServiceAccountDeleteResponse?> deleteProjectServiceAccount(String projectId, String serviceAccountId,) async {
    final response = await deleteProjectServiceAccountWithHttpInfo(projectId, serviceAccountId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectServiceAccountDeleteResponse',) as ProjectServiceAccountDeleteResponse;
    
    }
    return null;
  }

  /// Deletes a user from the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] userId (required):
  ///   The ID of the user.
  Future<Response> deleteProjectUserWithHttpInfo(String projectId, String userId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/users/{user_id}'
      .replaceAll('{project_id}', projectId)
      .replaceAll('{user_id}', userId);

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

  /// Deletes a user from the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] userId (required):
  ///   The ID of the user.
  Future<ProjectUserDeleteResponse?> deleteProjectUser(String projectId, String userId,) async {
    final response = await deleteProjectUserWithHttpInfo(projectId, userId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectUserDeleteResponse',) as ProjectUserDeleteResponse;
    
    }
    return null;
  }

  /// Returns a list of API keys in the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  Future<Response> listProjectApiKeysWithHttpInfo(String projectId, { int? limit, String? after, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/api_keys'
      .replaceAll('{project_id}', projectId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
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

  /// Returns a list of API keys in the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  Future<ProjectApiKeyListResponse?> listProjectApiKeys(String projectId, { int? limit, String? after, }) async {
    final response = await listProjectApiKeysWithHttpInfo(projectId,  limit: limit, after: after, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectApiKeyListResponse',) as ProjectApiKeyListResponse;
    
    }
    return null;
  }

  /// Returns the rate limits per model for a project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. The default is 100. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<Response> listProjectRateLimitsWithHttpInfo(String projectId, { int? limit, String? after, String? before, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/rate_limits'
      .replaceAll('{project_id}', projectId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
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

  /// Returns the rate limits per model for a project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. The default is 100. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<ProjectRateLimitListResponse?> listProjectRateLimits(String projectId, { int? limit, String? after, String? before, }) async {
    final response = await listProjectRateLimitsWithHttpInfo(projectId,  limit: limit, after: after, before: before, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectRateLimitListResponse',) as ProjectRateLimitListResponse;
    
    }
    return null;
  }

  /// Returns a list of service accounts in the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  Future<Response> listProjectServiceAccountsWithHttpInfo(String projectId, { int? limit, String? after, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/service_accounts'
      .replaceAll('{project_id}', projectId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
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

  /// Returns a list of service accounts in the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  Future<ProjectServiceAccountListResponse?> listProjectServiceAccounts(String projectId, { int? limit, String? after, }) async {
    final response = await listProjectServiceAccountsWithHttpInfo(projectId,  limit: limit, after: after, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectServiceAccountListResponse',) as ProjectServiceAccountListResponse;
    
    }
    return null;
  }

  /// Returns a list of users in the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  Future<Response> listProjectUsersWithHttpInfo(String projectId, { int? limit, String? after, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/users'
      .replaceAll('{project_id}', projectId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
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

  /// Returns a list of users in the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  Future<ProjectUserListResponse?> listProjectUsers(String projectId, { int? limit, String? after, }) async {
    final response = await listProjectUsersWithHttpInfo(projectId,  limit: limit, after: after, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectUserListResponse',) as ProjectUserListResponse;
    
    }
    return null;
  }

  /// Returns a list of projects.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [bool] includeArchived:
  ///   If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
  Future<Response> listProjectsWithHttpInfo({ int? limit, String? after, bool? includeArchived, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (includeArchived != null) {
      queryParams.addAll(_queryParams('', 'include_archived', includeArchived));
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

  /// Returns a list of projects.
  ///
  /// Parameters:
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [bool] includeArchived:
  ///   If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
  Future<ProjectListResponse?> listProjects({ int? limit, String? after, bool? includeArchived, }) async {
    final response = await listProjectsWithHttpInfo( limit: limit, after: after, includeArchived: includeArchived, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectListResponse',) as ProjectListResponse;
    
    }
    return null;
  }

  /// Modifies a project in the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [ProjectUpdateRequest] projectUpdateRequest (required):
  ///   The project update request payload.
  Future<Response> modifyProjectWithHttpInfo(String projectId, ProjectUpdateRequest projectUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}'
      .replaceAll('{project_id}', projectId);

    // ignore: prefer_final_locals
    Object? postBody = projectUpdateRequest;

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

  /// Modifies a project in the organization.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [ProjectUpdateRequest] projectUpdateRequest (required):
  ///   The project update request payload.
  Future<Project?> modifyProject(String projectId, ProjectUpdateRequest projectUpdateRequest,) async {
    final response = await modifyProjectWithHttpInfo(projectId, projectUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Project',) as Project;
    
    }
    return null;
  }

  /// Modifies a user's role in the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] userId (required):
  ///   The ID of the user.
  ///
  /// * [ProjectUserUpdateRequest] projectUserUpdateRequest (required):
  ///   The project user update request payload.
  Future<Response> modifyProjectUserWithHttpInfo(String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/users/{user_id}'
      .replaceAll('{project_id}', projectId)
      .replaceAll('{user_id}', userId);

    // ignore: prefer_final_locals
    Object? postBody = projectUserUpdateRequest;

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

  /// Modifies a user's role in the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] userId (required):
  ///   The ID of the user.
  ///
  /// * [ProjectUserUpdateRequest] projectUserUpdateRequest (required):
  ///   The project user update request payload.
  Future<ProjectUser?> modifyProjectUser(String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest,) async {
    final response = await modifyProjectUserWithHttpInfo(projectId, userId, projectUserUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectUser',) as ProjectUser;
    
    }
    return null;
  }

  /// Retrieves a project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  Future<Response> retrieveProjectWithHttpInfo(String projectId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}'
      .replaceAll('{project_id}', projectId);

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

  /// Retrieves a project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  Future<Project?> retrieveProject(String projectId,) async {
    final response = await retrieveProjectWithHttpInfo(projectId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Project',) as Project;
    
    }
    return null;
  }

  /// Retrieves an API key in the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] keyId (required):
  ///   The ID of the API key.
  Future<Response> retrieveProjectApiKeyWithHttpInfo(String projectId, String keyId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/api_keys/{key_id}'
      .replaceAll('{project_id}', projectId)
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

  /// Retrieves an API key in the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] keyId (required):
  ///   The ID of the API key.
  Future<ProjectApiKey?> retrieveProjectApiKey(String projectId, String keyId,) async {
    final response = await retrieveProjectApiKeyWithHttpInfo(projectId, keyId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectApiKey',) as ProjectApiKey;
    
    }
    return null;
  }

  /// Retrieves a service account in the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] serviceAccountId (required):
  ///   The ID of the service account.
  Future<Response> retrieveProjectServiceAccountWithHttpInfo(String projectId, String serviceAccountId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/service_accounts/{service_account_id}'
      .replaceAll('{project_id}', projectId)
      .replaceAll('{service_account_id}', serviceAccountId);

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

  /// Retrieves a service account in the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] serviceAccountId (required):
  ///   The ID of the service account.
  Future<ProjectServiceAccount?> retrieveProjectServiceAccount(String projectId, String serviceAccountId,) async {
    final response = await retrieveProjectServiceAccountWithHttpInfo(projectId, serviceAccountId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectServiceAccount',) as ProjectServiceAccount;
    
    }
    return null;
  }

  /// Retrieves a user in the project.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] userId (required):
  ///   The ID of the user.
  Future<Response> retrieveProjectUserWithHttpInfo(String projectId, String userId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/users/{user_id}'
      .replaceAll('{project_id}', projectId)
      .replaceAll('{user_id}', userId);

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

  /// Retrieves a user in the project.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] userId (required):
  ///   The ID of the user.
  Future<ProjectUser?> retrieveProjectUser(String projectId, String userId,) async {
    final response = await retrieveProjectUserWithHttpInfo(projectId, userId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectUser',) as ProjectUser;
    
    }
    return null;
  }

  /// Updates a project rate limit.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] rateLimitId (required):
  ///   The ID of the rate limit.
  ///
  /// * [ProjectRateLimitUpdateRequest] projectRateLimitUpdateRequest (required):
  ///   The project rate limit update request payload.
  Future<Response> updateProjectRateLimitsWithHttpInfo(String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/projects/{project_id}/rate_limits/{rate_limit_id}'
      .replaceAll('{project_id}', projectId)
      .replaceAll('{rate_limit_id}', rateLimitId);

    // ignore: prefer_final_locals
    Object? postBody = projectRateLimitUpdateRequest;

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

  /// Updates a project rate limit.
  ///
  /// Parameters:
  ///
  /// * [String] projectId (required):
  ///   The ID of the project.
  ///
  /// * [String] rateLimitId (required):
  ///   The ID of the rate limit.
  ///
  /// * [ProjectRateLimitUpdateRequest] projectRateLimitUpdateRequest (required):
  ///   The project rate limit update request payload.
  Future<ProjectRateLimit?> updateProjectRateLimits(String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest,) async {
    final response = await updateProjectRateLimitsWithHttpInfo(projectId, rateLimitId, projectRateLimitUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProjectRateLimit',) as ProjectRateLimit;
    
    }
    return null;
  }
}
