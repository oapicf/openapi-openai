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
class AuditLogEventType {
  /// Instantiate a new enum with the provided [value].
  const AuditLogEventType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const apiKeyPeriodCreated = AuditLogEventType._(r'api_key.created');
  static const apiKeyPeriodUpdated = AuditLogEventType._(r'api_key.updated');
  static const apiKeyPeriodDeleted = AuditLogEventType._(r'api_key.deleted');
  static const invitePeriodSent = AuditLogEventType._(r'invite.sent');
  static const invitePeriodAccepted = AuditLogEventType._(r'invite.accepted');
  static const invitePeriodDeleted = AuditLogEventType._(r'invite.deleted');
  static const loginPeriodSucceeded = AuditLogEventType._(r'login.succeeded');
  static const loginPeriodFailed = AuditLogEventType._(r'login.failed');
  static const logoutPeriodSucceeded = AuditLogEventType._(r'logout.succeeded');
  static const logoutPeriodFailed = AuditLogEventType._(r'logout.failed');
  static const organizationPeriodUpdated = AuditLogEventType._(r'organization.updated');
  static const projectPeriodCreated = AuditLogEventType._(r'project.created');
  static const projectPeriodUpdated = AuditLogEventType._(r'project.updated');
  static const projectPeriodArchived = AuditLogEventType._(r'project.archived');
  static const serviceAccountPeriodCreated = AuditLogEventType._(r'service_account.created');
  static const serviceAccountPeriodUpdated = AuditLogEventType._(r'service_account.updated');
  static const serviceAccountPeriodDeleted = AuditLogEventType._(r'service_account.deleted');
  static const rateLimitPeriodUpdated = AuditLogEventType._(r'rate_limit.updated');
  static const rateLimitPeriodDeleted = AuditLogEventType._(r'rate_limit.deleted');
  static const userPeriodAdded = AuditLogEventType._(r'user.added');
  static const userPeriodUpdated = AuditLogEventType._(r'user.updated');
  static const userPeriodDeleted = AuditLogEventType._(r'user.deleted');

  /// List of all possible values in this [enum][AuditLogEventType].
  static const values = <AuditLogEventType>[
    apiKeyPeriodCreated,
    apiKeyPeriodUpdated,
    apiKeyPeriodDeleted,
    invitePeriodSent,
    invitePeriodAccepted,
    invitePeriodDeleted,
    loginPeriodSucceeded,
    loginPeriodFailed,
    logoutPeriodSucceeded,
    logoutPeriodFailed,
    organizationPeriodUpdated,
    projectPeriodCreated,
    projectPeriodUpdated,
    projectPeriodArchived,
    serviceAccountPeriodCreated,
    serviceAccountPeriodUpdated,
    serviceAccountPeriodDeleted,
    rateLimitPeriodUpdated,
    rateLimitPeriodDeleted,
    userPeriodAdded,
    userPeriodUpdated,
    userPeriodDeleted,
  ];

  static AuditLogEventType? fromJson(dynamic value) => AuditLogEventTypeTypeTransformer().decode(value);

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

  String encode(AuditLogEventType data) => data.value;

  /// Decodes a [dynamic value][data] to a AuditLogEventType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AuditLogEventType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [AuditLogEventTypeTypeTransformer] instance.
  static AuditLogEventTypeTypeTransformer? _instance;
}

