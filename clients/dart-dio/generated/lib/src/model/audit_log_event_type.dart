//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_event_type.g.dart';

class AuditLogEventType extends EnumClass {

  /// The event type.
  @BuiltValueEnumConst(wireName: r'api_key.created')
  static const AuditLogEventType apiKeyPeriodCreated = _$apiKeyPeriodCreated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'api_key.updated')
  static const AuditLogEventType apiKeyPeriodUpdated = _$apiKeyPeriodUpdated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'api_key.deleted')
  static const AuditLogEventType apiKeyPeriodDeleted = _$apiKeyPeriodDeleted;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'invite.sent')
  static const AuditLogEventType invitePeriodSent = _$invitePeriodSent;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'invite.accepted')
  static const AuditLogEventType invitePeriodAccepted = _$invitePeriodAccepted;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'invite.deleted')
  static const AuditLogEventType invitePeriodDeleted = _$invitePeriodDeleted;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'login.succeeded')
  static const AuditLogEventType loginPeriodSucceeded = _$loginPeriodSucceeded;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'login.failed')
  static const AuditLogEventType loginPeriodFailed = _$loginPeriodFailed;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'logout.succeeded')
  static const AuditLogEventType logoutPeriodSucceeded = _$logoutPeriodSucceeded;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'logout.failed')
  static const AuditLogEventType logoutPeriodFailed = _$logoutPeriodFailed;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'organization.updated')
  static const AuditLogEventType organizationPeriodUpdated = _$organizationPeriodUpdated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'project.created')
  static const AuditLogEventType projectPeriodCreated = _$projectPeriodCreated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'project.updated')
  static const AuditLogEventType projectPeriodUpdated = _$projectPeriodUpdated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'project.archived')
  static const AuditLogEventType projectPeriodArchived = _$projectPeriodArchived;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'service_account.created')
  static const AuditLogEventType serviceAccountPeriodCreated = _$serviceAccountPeriodCreated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'service_account.updated')
  static const AuditLogEventType serviceAccountPeriodUpdated = _$serviceAccountPeriodUpdated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'service_account.deleted')
  static const AuditLogEventType serviceAccountPeriodDeleted = _$serviceAccountPeriodDeleted;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'rate_limit.updated')
  static const AuditLogEventType rateLimitPeriodUpdated = _$rateLimitPeriodUpdated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'rate_limit.deleted')
  static const AuditLogEventType rateLimitPeriodDeleted = _$rateLimitPeriodDeleted;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'user.added')
  static const AuditLogEventType userPeriodAdded = _$userPeriodAdded;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'user.updated')
  static const AuditLogEventType userPeriodUpdated = _$userPeriodUpdated;
  /// The event type.
  @BuiltValueEnumConst(wireName: r'user.deleted')
  static const AuditLogEventType userPeriodDeleted = _$userPeriodDeleted;

  static Serializer<AuditLogEventType> get serializer => _$auditLogEventTypeSerializer;

  const AuditLogEventType._(String name): super(name);

  static BuiltSet<AuditLogEventType> get values => _$values;
  static AuditLogEventType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AuditLogEventTypeMixin = Object with _$AuditLogEventTypeMixin;

