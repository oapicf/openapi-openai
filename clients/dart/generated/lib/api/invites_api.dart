//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class InvitesApi {
  InvitesApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] inviteId (required):
  ///   The ID of the invite to delete.
  Future<Response> deleteInviteWithHttpInfo(String inviteId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/invites/{invite_id}'
      .replaceAll('{invite_id}', inviteId);

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

  /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
  ///
  /// Parameters:
  ///
  /// * [String] inviteId (required):
  ///   The ID of the invite to delete.
  Future<InviteDeleteResponse?> deleteInvite(String inviteId,) async {
    final response = await deleteInviteWithHttpInfo(inviteId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'InviteDeleteResponse',) as InviteDeleteResponse;
    
    }
    return null;
  }

  /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [InviteRequest] inviteRequest (required):
  ///   The invite request payload.
  Future<Response> inviteUserWithHttpInfo(InviteRequest inviteRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/invites';

    // ignore: prefer_final_locals
    Object? postBody = inviteRequest;

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

  /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
  ///
  /// Parameters:
  ///
  /// * [InviteRequest] inviteRequest (required):
  ///   The invite request payload.
  Future<Invite?> inviteUser(InviteRequest inviteRequest,) async {
    final response = await inviteUserWithHttpInfo(inviteRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Invite',) as Invite;
    
    }
    return null;
  }

  /// Returns a list of invites in the organization.
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
  Future<Response> listInvitesWithHttpInfo({ int? limit, String? after, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/invites';

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

  /// Returns a list of invites in the organization.
  ///
  /// Parameters:
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  Future<InviteListResponse?> listInvites({ int? limit, String? after, }) async {
    final response = await listInvitesWithHttpInfo( limit: limit, after: after, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'InviteListResponse',) as InviteListResponse;
    
    }
    return null;
  }

  /// Retrieves an invite.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] inviteId (required):
  ///   The ID of the invite to retrieve.
  Future<Response> retrieveInviteWithHttpInfo(String inviteId,) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/invites/{invite_id}'
      .replaceAll('{invite_id}', inviteId);

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

  /// Retrieves an invite.
  ///
  /// Parameters:
  ///
  /// * [String] inviteId (required):
  ///   The ID of the invite to retrieve.
  Future<Invite?> retrieveInvite(String inviteId,) async {
    final response = await retrieveInviteWithHttpInfo(inviteId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Invite',) as Invite;
    
    }
    return null;
  }
}
