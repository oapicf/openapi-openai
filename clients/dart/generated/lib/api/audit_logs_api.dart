//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AuditLogsApi {
  AuditLogsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// List user actions and configuration changes within this organization.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [ListAuditLogsEffectiveAtParameter] effectiveAt:
  ///   Return only events whose `effective_at` (Unix seconds) is in this range.
  ///
  /// * [List<String>] projectIdsLeftSquareBracketRightSquareBracket:
  ///   Return only events for these projects.
  ///
  /// * [List<AuditLogEventType>] eventTypesLeftSquareBracketRightSquareBracket:
  ///   Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
  ///
  /// * [List<String>] actorIdsLeftSquareBracketRightSquareBracket:
  ///   Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
  ///
  /// * [List<String>] actorEmailsLeftSquareBracketRightSquareBracket:
  ///   Return only events performed by users with these emails.
  ///
  /// * [List<String>] resourceIdsLeftSquareBracketRightSquareBracket:
  ///   Return only events performed on these targets. For example, a project ID updated.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<Response> listAuditLogsWithHttpInfo({ ListAuditLogsEffectiveAtParameter? effectiveAt, List<String>? projectIdsLeftSquareBracketRightSquareBracket, List<AuditLogEventType>? eventTypesLeftSquareBracketRightSquareBracket, List<String>? actorIdsLeftSquareBracketRightSquareBracket, List<String>? actorEmailsLeftSquareBracketRightSquareBracket, List<String>? resourceIdsLeftSquareBracketRightSquareBracket, int? limit, String? after, String? before, }) async {
    // ignore: prefer_const_declarations
    final path = r'/organization/audit_logs';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (effectiveAt != null) {
      queryParams.addAll(_queryParams('', 'effective_at', effectiveAt));
    }
    if (projectIdsLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'project_ids[]', projectIdsLeftSquareBracketRightSquareBracket));
    }
    if (eventTypesLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'event_types[]', eventTypesLeftSquareBracketRightSquareBracket));
    }
    if (actorIdsLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'actor_ids[]', actorIdsLeftSquareBracketRightSquareBracket));
    }
    if (actorEmailsLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'actor_emails[]', actorEmailsLeftSquareBracketRightSquareBracket));
    }
    if (resourceIdsLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'resource_ids[]', resourceIdsLeftSquareBracketRightSquareBracket));
    }
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

  /// List user actions and configuration changes within this organization.
  ///
  /// Parameters:
  ///
  /// * [ListAuditLogsEffectiveAtParameter] effectiveAt:
  ///   Return only events whose `effective_at` (Unix seconds) is in this range.
  ///
  /// * [List<String>] projectIdsLeftSquareBracketRightSquareBracket:
  ///   Return only events for these projects.
  ///
  /// * [List<AuditLogEventType>] eventTypesLeftSquareBracketRightSquareBracket:
  ///   Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
  ///
  /// * [List<String>] actorIdsLeftSquareBracketRightSquareBracket:
  ///   Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
  ///
  /// * [List<String>] actorEmailsLeftSquareBracketRightSquareBracket:
  ///   Return only events performed by users with these emails.
  ///
  /// * [List<String>] resourceIdsLeftSquareBracketRightSquareBracket:
  ///   Return only events performed on these targets. For example, a project ID updated.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<ListAuditLogsResponse?> listAuditLogs({ ListAuditLogsEffectiveAtParameter? effectiveAt, List<String>? projectIdsLeftSquareBracketRightSquareBracket, List<AuditLogEventType>? eventTypesLeftSquareBracketRightSquareBracket, List<String>? actorIdsLeftSquareBracketRightSquareBracket, List<String>? actorEmailsLeftSquareBracketRightSquareBracket, List<String>? resourceIdsLeftSquareBracketRightSquareBracket, int? limit, String? after, String? before, }) async {
    final response = await listAuditLogsWithHttpInfo( effectiveAt: effectiveAt, projectIdsLeftSquareBracketRightSquareBracket: projectIdsLeftSquareBracketRightSquareBracket, eventTypesLeftSquareBracketRightSquareBracket: eventTypesLeftSquareBracketRightSquareBracket, actorIdsLeftSquareBracketRightSquareBracket: actorIdsLeftSquareBracketRightSquareBracket, actorEmailsLeftSquareBracketRightSquareBracket: actorEmailsLeftSquareBracketRightSquareBracket, resourceIdsLeftSquareBracketRightSquareBracket: resourceIdsLeftSquareBracketRightSquareBracket, limit: limit, after: after, before: before, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListAuditLogsResponse',) as ListAuditLogsResponse;
    
    }
    return null;
  }
}
