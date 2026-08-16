//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_event_type.dart';
import 'package:openapi/src/model/audit_log_user_deleted.dart';
import 'package:openapi/src/model/audit_log_project_archived.dart';
import 'package:openapi/src/model/audit_log_project_created.dart';
import 'package:openapi/src/model/audit_log_project_updated.dart';
import 'package:openapi/src/model/audit_log_rate_limit_updated.dart';
import 'package:openapi/src/model/audit_log_service_account_deleted.dart';
import 'package:openapi/src/model/audit_log_invite_accepted.dart';
import 'package:openapi/src/model/audit_log_user_updated.dart';
import 'package:openapi/src/model/audit_log_rate_limit_deleted.dart';
import 'package:openapi/src/model/audit_log_service_account_updated.dart';
import 'package:openapi/src/model/audit_log_actor.dart';
import 'package:openapi/src/model/audit_log_project.dart';
import 'package:openapi/src/model/audit_log_service_account_created.dart';
import 'package:openapi/src/model/audit_log_organization_updated.dart';
import 'package:openapi/src/model/audit_log_api_key_updated.dart';
import 'package:openapi/src/model/audit_log_api_key_created.dart';
import 'package:openapi/src/model/audit_log_user_added.dart';
import 'package:openapi/src/model/audit_log_api_key_deleted.dart';
import 'package:openapi/src/model/audit_log_login_failed.dart';
import 'package:openapi/src/model/audit_log_invite_sent.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log.g.dart';

/// A log of a user action or configuration change within this organization.
///
/// Properties:
/// * [id] - The ID of this log.
/// * [type] 
/// * [effectiveAt] - The Unix timestamp (in seconds) of the event.
/// * [project] 
/// * [actor] 
/// * [apiKeyPeriodCreated] 
/// * [apiKeyPeriodUpdated] 
/// * [apiKeyPeriodDeleted] 
/// * [invitePeriodSent] 
/// * [invitePeriodAccepted] 
/// * [invitePeriodDeleted] 
/// * [loginPeriodFailed] 
/// * [logoutPeriodFailed] 
/// * [organizationPeriodUpdated] 
/// * [projectPeriodCreated] 
/// * [projectPeriodUpdated] 
/// * [projectPeriodArchived] 
/// * [rateLimitPeriodUpdated] 
/// * [rateLimitPeriodDeleted] 
/// * [serviceAccountPeriodCreated] 
/// * [serviceAccountPeriodUpdated] 
/// * [serviceAccountPeriodDeleted] 
/// * [userPeriodAdded] 
/// * [userPeriodUpdated] 
/// * [userPeriodDeleted] 
@BuiltValue()
abstract class AuditLog implements Built<AuditLog, AuditLogBuilder> {
  /// The ID of this log.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'type')
  AuditLogEventType get type;
  // enum typeEnum {  api_key.created,  api_key.updated,  api_key.deleted,  invite.sent,  invite.accepted,  invite.deleted,  login.succeeded,  login.failed,  logout.succeeded,  logout.failed,  organization.updated,  project.created,  project.updated,  project.archived,  service_account.created,  service_account.updated,  service_account.deleted,  rate_limit.updated,  rate_limit.deleted,  user.added,  user.updated,  user.deleted,  };

  /// The Unix timestamp (in seconds) of the event.
  @BuiltValueField(wireName: r'effective_at')
  int get effectiveAt;

  @BuiltValueField(wireName: r'project')
  AuditLogProject? get project;

  @BuiltValueField(wireName: r'actor')
  AuditLogActor get actor;

  @BuiltValueField(wireName: r'api_key.created')
  AuditLogApiKeyCreated? get apiKeyPeriodCreated;

  @BuiltValueField(wireName: r'api_key.updated')
  AuditLogApiKeyUpdated? get apiKeyPeriodUpdated;

  @BuiltValueField(wireName: r'api_key.deleted')
  AuditLogApiKeyDeleted? get apiKeyPeriodDeleted;

  @BuiltValueField(wireName: r'invite.sent')
  AuditLogInviteSent? get invitePeriodSent;

  @BuiltValueField(wireName: r'invite.accepted')
  AuditLogInviteAccepted? get invitePeriodAccepted;

  @BuiltValueField(wireName: r'invite.deleted')
  AuditLogInviteAccepted? get invitePeriodDeleted;

  @BuiltValueField(wireName: r'login.failed')
  AuditLogLoginFailed? get loginPeriodFailed;

  @BuiltValueField(wireName: r'logout.failed')
  AuditLogLoginFailed? get logoutPeriodFailed;

  @BuiltValueField(wireName: r'organization.updated')
  AuditLogOrganizationUpdated? get organizationPeriodUpdated;

  @BuiltValueField(wireName: r'project.created')
  AuditLogProjectCreated? get projectPeriodCreated;

  @BuiltValueField(wireName: r'project.updated')
  AuditLogProjectUpdated? get projectPeriodUpdated;

  @BuiltValueField(wireName: r'project.archived')
  AuditLogProjectArchived? get projectPeriodArchived;

  @BuiltValueField(wireName: r'rate_limit.updated')
  AuditLogRateLimitUpdated? get rateLimitPeriodUpdated;

  @BuiltValueField(wireName: r'rate_limit.deleted')
  AuditLogRateLimitDeleted? get rateLimitPeriodDeleted;

  @BuiltValueField(wireName: r'service_account.created')
  AuditLogServiceAccountCreated? get serviceAccountPeriodCreated;

  @BuiltValueField(wireName: r'service_account.updated')
  AuditLogServiceAccountUpdated? get serviceAccountPeriodUpdated;

  @BuiltValueField(wireName: r'service_account.deleted')
  AuditLogServiceAccountDeleted? get serviceAccountPeriodDeleted;

  @BuiltValueField(wireName: r'user.added')
  AuditLogUserAdded? get userPeriodAdded;

  @BuiltValueField(wireName: r'user.updated')
  AuditLogUserUpdated? get userPeriodUpdated;

  @BuiltValueField(wireName: r'user.deleted')
  AuditLogUserDeleted? get userPeriodDeleted;

  AuditLog._();

  factory AuditLog([void updates(AuditLogBuilder b)]) = _$AuditLog;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLog> get serializer => _$AuditLogSerializer();
}

class _$AuditLogSerializer implements PrimitiveSerializer<AuditLog> {
  @override
  final Iterable<Type> types = const [AuditLog, _$AuditLog];

  @override
  final String wireName = r'AuditLog';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLog object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AuditLogEventType),
    );
    yield r'effective_at';
    yield serializers.serialize(
      object.effectiveAt,
      specifiedType: const FullType(int),
    );
    if (object.project != null) {
      yield r'project';
      yield serializers.serialize(
        object.project,
        specifiedType: const FullType(AuditLogProject),
      );
    }
    yield r'actor';
    yield serializers.serialize(
      object.actor,
      specifiedType: const FullType(AuditLogActor),
    );
    if (object.apiKeyPeriodCreated != null) {
      yield r'api_key.created';
      yield serializers.serialize(
        object.apiKeyPeriodCreated,
        specifiedType: const FullType(AuditLogApiKeyCreated),
      );
    }
    if (object.apiKeyPeriodUpdated != null) {
      yield r'api_key.updated';
      yield serializers.serialize(
        object.apiKeyPeriodUpdated,
        specifiedType: const FullType(AuditLogApiKeyUpdated),
      );
    }
    if (object.apiKeyPeriodDeleted != null) {
      yield r'api_key.deleted';
      yield serializers.serialize(
        object.apiKeyPeriodDeleted,
        specifiedType: const FullType(AuditLogApiKeyDeleted),
      );
    }
    if (object.invitePeriodSent != null) {
      yield r'invite.sent';
      yield serializers.serialize(
        object.invitePeriodSent,
        specifiedType: const FullType(AuditLogInviteSent),
      );
    }
    if (object.invitePeriodAccepted != null) {
      yield r'invite.accepted';
      yield serializers.serialize(
        object.invitePeriodAccepted,
        specifiedType: const FullType(AuditLogInviteAccepted),
      );
    }
    if (object.invitePeriodDeleted != null) {
      yield r'invite.deleted';
      yield serializers.serialize(
        object.invitePeriodDeleted,
        specifiedType: const FullType(AuditLogInviteAccepted),
      );
    }
    if (object.loginPeriodFailed != null) {
      yield r'login.failed';
      yield serializers.serialize(
        object.loginPeriodFailed,
        specifiedType: const FullType(AuditLogLoginFailed),
      );
    }
    if (object.logoutPeriodFailed != null) {
      yield r'logout.failed';
      yield serializers.serialize(
        object.logoutPeriodFailed,
        specifiedType: const FullType(AuditLogLoginFailed),
      );
    }
    if (object.organizationPeriodUpdated != null) {
      yield r'organization.updated';
      yield serializers.serialize(
        object.organizationPeriodUpdated,
        specifiedType: const FullType(AuditLogOrganizationUpdated),
      );
    }
    if (object.projectPeriodCreated != null) {
      yield r'project.created';
      yield serializers.serialize(
        object.projectPeriodCreated,
        specifiedType: const FullType(AuditLogProjectCreated),
      );
    }
    if (object.projectPeriodUpdated != null) {
      yield r'project.updated';
      yield serializers.serialize(
        object.projectPeriodUpdated,
        specifiedType: const FullType(AuditLogProjectUpdated),
      );
    }
    if (object.projectPeriodArchived != null) {
      yield r'project.archived';
      yield serializers.serialize(
        object.projectPeriodArchived,
        specifiedType: const FullType(AuditLogProjectArchived),
      );
    }
    if (object.rateLimitPeriodUpdated != null) {
      yield r'rate_limit.updated';
      yield serializers.serialize(
        object.rateLimitPeriodUpdated,
        specifiedType: const FullType(AuditLogRateLimitUpdated),
      );
    }
    if (object.rateLimitPeriodDeleted != null) {
      yield r'rate_limit.deleted';
      yield serializers.serialize(
        object.rateLimitPeriodDeleted,
        specifiedType: const FullType(AuditLogRateLimitDeleted),
      );
    }
    if (object.serviceAccountPeriodCreated != null) {
      yield r'service_account.created';
      yield serializers.serialize(
        object.serviceAccountPeriodCreated,
        specifiedType: const FullType(AuditLogServiceAccountCreated),
      );
    }
    if (object.serviceAccountPeriodUpdated != null) {
      yield r'service_account.updated';
      yield serializers.serialize(
        object.serviceAccountPeriodUpdated,
        specifiedType: const FullType(AuditLogServiceAccountUpdated),
      );
    }
    if (object.serviceAccountPeriodDeleted != null) {
      yield r'service_account.deleted';
      yield serializers.serialize(
        object.serviceAccountPeriodDeleted,
        specifiedType: const FullType(AuditLogServiceAccountDeleted),
      );
    }
    if (object.userPeriodAdded != null) {
      yield r'user.added';
      yield serializers.serialize(
        object.userPeriodAdded,
        specifiedType: const FullType(AuditLogUserAdded),
      );
    }
    if (object.userPeriodUpdated != null) {
      yield r'user.updated';
      yield serializers.serialize(
        object.userPeriodUpdated,
        specifiedType: const FullType(AuditLogUserUpdated),
      );
    }
    if (object.userPeriodDeleted != null) {
      yield r'user.deleted';
      yield serializers.serialize(
        object.userPeriodDeleted,
        specifiedType: const FullType(AuditLogUserDeleted),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLog object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogEventType),
          ) as AuditLogEventType;
          result.type = valueDes;
          break;
        case r'effective_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.effectiveAt = valueDes;
          break;
        case r'project':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogProject),
          ) as AuditLogProject;
          result.project.replace(valueDes);
          break;
        case r'actor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActor),
          ) as AuditLogActor;
          result.actor.replace(valueDes);
          break;
        case r'api_key.created':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogApiKeyCreated),
          ) as AuditLogApiKeyCreated;
          result.apiKeyPeriodCreated.replace(valueDes);
          break;
        case r'api_key.updated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogApiKeyUpdated),
          ) as AuditLogApiKeyUpdated;
          result.apiKeyPeriodUpdated.replace(valueDes);
          break;
        case r'api_key.deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogApiKeyDeleted),
          ) as AuditLogApiKeyDeleted;
          result.apiKeyPeriodDeleted.replace(valueDes);
          break;
        case r'invite.sent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogInviteSent),
          ) as AuditLogInviteSent;
          result.invitePeriodSent.replace(valueDes);
          break;
        case r'invite.accepted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogInviteAccepted),
          ) as AuditLogInviteAccepted;
          result.invitePeriodAccepted.replace(valueDes);
          break;
        case r'invite.deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogInviteAccepted),
          ) as AuditLogInviteAccepted;
          result.invitePeriodDeleted.replace(valueDes);
          break;
        case r'login.failed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogLoginFailed),
          ) as AuditLogLoginFailed;
          result.loginPeriodFailed.replace(valueDes);
          break;
        case r'logout.failed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogLoginFailed),
          ) as AuditLogLoginFailed;
          result.logoutPeriodFailed.replace(valueDes);
          break;
        case r'organization.updated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogOrganizationUpdated),
          ) as AuditLogOrganizationUpdated;
          result.organizationPeriodUpdated.replace(valueDes);
          break;
        case r'project.created':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogProjectCreated),
          ) as AuditLogProjectCreated;
          result.projectPeriodCreated.replace(valueDes);
          break;
        case r'project.updated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogProjectUpdated),
          ) as AuditLogProjectUpdated;
          result.projectPeriodUpdated.replace(valueDes);
          break;
        case r'project.archived':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogProjectArchived),
          ) as AuditLogProjectArchived;
          result.projectPeriodArchived.replace(valueDes);
          break;
        case r'rate_limit.updated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogRateLimitUpdated),
          ) as AuditLogRateLimitUpdated;
          result.rateLimitPeriodUpdated.replace(valueDes);
          break;
        case r'rate_limit.deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogRateLimitDeleted),
          ) as AuditLogRateLimitDeleted;
          result.rateLimitPeriodDeleted.replace(valueDes);
          break;
        case r'service_account.created':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogServiceAccountCreated),
          ) as AuditLogServiceAccountCreated;
          result.serviceAccountPeriodCreated.replace(valueDes);
          break;
        case r'service_account.updated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogServiceAccountUpdated),
          ) as AuditLogServiceAccountUpdated;
          result.serviceAccountPeriodUpdated.replace(valueDes);
          break;
        case r'service_account.deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogServiceAccountDeleted),
          ) as AuditLogServiceAccountDeleted;
          result.serviceAccountPeriodDeleted.replace(valueDes);
          break;
        case r'user.added':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogUserAdded),
          ) as AuditLogUserAdded;
          result.userPeriodAdded.replace(valueDes);
          break;
        case r'user.updated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogUserUpdated),
          ) as AuditLogUserUpdated;
          result.userPeriodUpdated.replace(valueDes);
          break;
        case r'user.deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogUserDeleted),
          ) as AuditLogUserDeleted;
          result.userPeriodDeleted.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLog deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

