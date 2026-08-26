//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The event type.
enum AuditLogEventType {
  apiKeyPeriodCreated._(r'api_key.created'),
  apiKeyPeriodUpdated._(r'api_key.updated'),
  apiKeyPeriodDeleted._(r'api_key.deleted'),
  invitePeriodSent._(r'invite.sent'),
  invitePeriodAccepted._(r'invite.accepted'),
  invitePeriodDeleted._(r'invite.deleted'),
  loginPeriodSucceeded._(r'login.succeeded'),
  loginPeriodFailed._(r'login.failed'),
  logoutPeriodSucceeded._(r'logout.succeeded'),
  logoutPeriodFailed._(r'logout.failed'),
  organizationPeriodUpdated._(r'organization.updated'),
  projectPeriodCreated._(r'project.created'),
  projectPeriodUpdated._(r'project.updated'),
  projectPeriodArchived._(r'project.archived'),
  serviceAccountPeriodCreated._(r'service_account.created'),
  serviceAccountPeriodUpdated._(r'service_account.updated'),
  serviceAccountPeriodDeleted._(r'service_account.deleted'),
  rateLimitPeriodUpdated._(r'rate_limit.updated'),
  rateLimitPeriodDeleted._(r'rate_limit.deleted'),
  userPeriodAdded._(r'user.added'),
  userPeriodUpdated._(r'user.updated'),
  userPeriodDeleted._(r'user.deleted'),
  ;

  /// Instantiate a new enum with the provided value.
  const AuditLogEventType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AuditLogEventType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AuditLogEventType? fromJson(dynamic value) => AuditLogEventTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AuditLogEventType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AuditLogEventType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogEventType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogEventType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AuditLogEventType] to String,
/// and [decode] dynamic data back to [AuditLogEventType].
class AuditLogEventTypeTypeTransformer {
  factory AuditLogEventTypeTypeTransformer() => _instance ??= const AuditLogEventTypeTypeTransformer._();

  const AuditLogEventTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AuditLogEventType data) => data._value;

  /// Returns the instance of [AuditLogEventType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AuditLogEventType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AuditLogEventType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'api_key.created': return AuditLogEventType.apiKeyPeriodCreated;
        case r'api_key.updated': return AuditLogEventType.apiKeyPeriodUpdated;
        case r'api_key.deleted': return AuditLogEventType.apiKeyPeriodDeleted;
        case r'invite.sent': return AuditLogEventType.invitePeriodSent;
        case r'invite.accepted': return AuditLogEventType.invitePeriodAccepted;
        case r'invite.deleted': return AuditLogEventType.invitePeriodDeleted;
        case r'login.succeeded': return AuditLogEventType.loginPeriodSucceeded;
        case r'login.failed': return AuditLogEventType.loginPeriodFailed;
        case r'logout.succeeded': return AuditLogEventType.logoutPeriodSucceeded;
        case r'logout.failed': return AuditLogEventType.logoutPeriodFailed;
        case r'organization.updated': return AuditLogEventType.organizationPeriodUpdated;
        case r'project.created': return AuditLogEventType.projectPeriodCreated;
        case r'project.updated': return AuditLogEventType.projectPeriodUpdated;
        case r'project.archived': return AuditLogEventType.projectPeriodArchived;
        case r'service_account.created': return AuditLogEventType.serviceAccountPeriodCreated;
        case r'service_account.updated': return AuditLogEventType.serviceAccountPeriodUpdated;
        case r'service_account.deleted': return AuditLogEventType.serviceAccountPeriodDeleted;
        case r'rate_limit.updated': return AuditLogEventType.rateLimitPeriodUpdated;
        case r'rate_limit.deleted': return AuditLogEventType.rateLimitPeriodDeleted;
        case r'user.added': return AuditLogEventType.userPeriodAdded;
        case r'user.updated': return AuditLogEventType.userPeriodUpdated;
        case r'user.deleted': return AuditLogEventType.userPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AuditLogEventTypeTypeTransformer? _instance;
}

