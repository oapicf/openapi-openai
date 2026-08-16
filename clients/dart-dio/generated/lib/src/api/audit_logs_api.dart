//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/audit_log_event_type.dart';
import 'package:openapi/src/model/list_audit_logs_effective_at_parameter.dart';
import 'package:openapi/src/model/list_audit_logs_response.dart';

class AuditLogsApi {

  final Dio _dio;

  final Serializers _serializers;

  const AuditLogsApi(this._dio, this._serializers);

  /// List user actions and configuration changes within this organization.
  /// 
  ///
  /// Parameters:
  /// * [effectiveAt] - Return only events whose `effective_at` (Unix seconds) is in this range.
  /// * [projectIdsLeftSquareBracketRightSquareBracket] - Return only events for these projects.
  /// * [eventTypesLeftSquareBracketRightSquareBracket] - Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
  /// * [actorIdsLeftSquareBracketRightSquareBracket] - Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
  /// * [actorEmailsLeftSquareBracketRightSquareBracket] - Return only events performed by users with these emails.
  /// * [resourceIdsLeftSquareBracketRightSquareBracket] - Return only events performed on these targets. For example, a project ID updated.
  /// * [limit] - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  /// * [after] - A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  /// * [before] - A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [ListAuditLogsResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<ListAuditLogsResponse>> listAuditLogs({ 
    ListAuditLogsEffectiveAtParameter? effectiveAt,
    BuiltList<String>? projectIdsLeftSquareBracketRightSquareBracket,
    BuiltList<AuditLogEventType>? eventTypesLeftSquareBracketRightSquareBracket,
    BuiltList<String>? actorIdsLeftSquareBracketRightSquareBracket,
    BuiltList<String>? actorEmailsLeftSquareBracketRightSquareBracket,
    BuiltList<String>? resourceIdsLeftSquareBracketRightSquareBracket,
    int? limit = 20,
    String? after,
    String? before,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/organization/audit_logs';
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
      if (effectiveAt != null) r'effective_at': encodeQueryParameter(_serializers, effectiveAt, const FullType(ListAuditLogsEffectiveAtParameter)),
      if (projectIdsLeftSquareBracketRightSquareBracket != null) r'project_ids[]': encodeCollectionQueryParameter<String>(_serializers, projectIdsLeftSquareBracketRightSquareBracket, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (eventTypesLeftSquareBracketRightSquareBracket != null) r'event_types[]': encodeCollectionQueryParameter<AuditLogEventType>(_serializers, eventTypesLeftSquareBracketRightSquareBracket, const FullType(BuiltList, [FullType(AuditLogEventType)]), format: ListFormat.multi,),
      if (actorIdsLeftSquareBracketRightSquareBracket != null) r'actor_ids[]': encodeCollectionQueryParameter<String>(_serializers, actorIdsLeftSquareBracketRightSquareBracket, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (actorEmailsLeftSquareBracketRightSquareBracket != null) r'actor_emails[]': encodeCollectionQueryParameter<String>(_serializers, actorEmailsLeftSquareBracketRightSquareBracket, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (resourceIdsLeftSquareBracketRightSquareBracket != null) r'resource_ids[]': encodeCollectionQueryParameter<String>(_serializers, resourceIdsLeftSquareBracketRightSquareBracket, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (after != null) r'after': encodeQueryParameter(_serializers, after, const FullType(String)),
      if (before != null) r'before': encodeQueryParameter(_serializers, before, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    ListAuditLogsResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(ListAuditLogsResponse),
      ) as ListAuditLogsResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<ListAuditLogsResponse>(
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
