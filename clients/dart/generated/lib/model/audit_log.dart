//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLog {
  /// Returns a new [AuditLog] instance.
  AuditLog({
    required this.id,
    required this.type,
    required this.effectiveAt,
    this.project,
    required this.actor,
    this.apiKeyPeriodCreated,
    this.apiKeyPeriodUpdated,
    this.apiKeyPeriodDeleted,
    this.invitePeriodSent,
    this.invitePeriodAccepted,
    this.invitePeriodDeleted,
    this.loginPeriodFailed,
    this.logoutPeriodFailed,
    this.organizationPeriodUpdated,
    this.projectPeriodCreated,
    this.projectPeriodUpdated,
    this.projectPeriodArchived,
    this.rateLimitPeriodUpdated,
    this.rateLimitPeriodDeleted,
    this.serviceAccountPeriodCreated,
    this.serviceAccountPeriodUpdated,
    this.serviceAccountPeriodDeleted,
    this.userPeriodAdded,
    this.userPeriodUpdated,
    this.userPeriodDeleted,
  });

  /// The ID of this log.
  String id;

  AuditLogEventType type;

  /// The Unix timestamp (in seconds) of the event.
  int effectiveAt;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogProject? project;

  AuditLogActor actor;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogApiKeyCreated? apiKeyPeriodCreated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogApiKeyUpdated? apiKeyPeriodUpdated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogApiKeyDeleted? apiKeyPeriodDeleted;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogInviteSent? invitePeriodSent;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogInviteAccepted? invitePeriodAccepted;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogInviteAccepted? invitePeriodDeleted;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogLoginFailed? loginPeriodFailed;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogLoginFailed? logoutPeriodFailed;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogOrganizationUpdated? organizationPeriodUpdated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogProjectCreated? projectPeriodCreated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogProjectUpdated? projectPeriodUpdated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogProjectArchived? projectPeriodArchived;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogRateLimitUpdated? rateLimitPeriodUpdated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogRateLimitDeleted? rateLimitPeriodDeleted;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogServiceAccountCreated? serviceAccountPeriodCreated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogServiceAccountUpdated? serviceAccountPeriodUpdated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogServiceAccountDeleted? serviceAccountPeriodDeleted;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogUserAdded? userPeriodAdded;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogUserUpdated? userPeriodUpdated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogUserDeleted? userPeriodDeleted;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLog &&
    other.id == id &&
    other.type == type &&
    other.effectiveAt == effectiveAt &&
    other.project == project &&
    other.actor == actor &&
    other.apiKeyPeriodCreated == apiKeyPeriodCreated &&
    other.apiKeyPeriodUpdated == apiKeyPeriodUpdated &&
    other.apiKeyPeriodDeleted == apiKeyPeriodDeleted &&
    other.invitePeriodSent == invitePeriodSent &&
    other.invitePeriodAccepted == invitePeriodAccepted &&
    other.invitePeriodDeleted == invitePeriodDeleted &&
    other.loginPeriodFailed == loginPeriodFailed &&
    other.logoutPeriodFailed == logoutPeriodFailed &&
    other.organizationPeriodUpdated == organizationPeriodUpdated &&
    other.projectPeriodCreated == projectPeriodCreated &&
    other.projectPeriodUpdated == projectPeriodUpdated &&
    other.projectPeriodArchived == projectPeriodArchived &&
    other.rateLimitPeriodUpdated == rateLimitPeriodUpdated &&
    other.rateLimitPeriodDeleted == rateLimitPeriodDeleted &&
    other.serviceAccountPeriodCreated == serviceAccountPeriodCreated &&
    other.serviceAccountPeriodUpdated == serviceAccountPeriodUpdated &&
    other.serviceAccountPeriodDeleted == serviceAccountPeriodDeleted &&
    other.userPeriodAdded == userPeriodAdded &&
    other.userPeriodUpdated == userPeriodUpdated &&
    other.userPeriodDeleted == userPeriodDeleted;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (type.hashCode) +
    (effectiveAt.hashCode) +
    (project == null ? 0 : project!.hashCode) +
    (actor.hashCode) +
    (apiKeyPeriodCreated == null ? 0 : apiKeyPeriodCreated!.hashCode) +
    (apiKeyPeriodUpdated == null ? 0 : apiKeyPeriodUpdated!.hashCode) +
    (apiKeyPeriodDeleted == null ? 0 : apiKeyPeriodDeleted!.hashCode) +
    (invitePeriodSent == null ? 0 : invitePeriodSent!.hashCode) +
    (invitePeriodAccepted == null ? 0 : invitePeriodAccepted!.hashCode) +
    (invitePeriodDeleted == null ? 0 : invitePeriodDeleted!.hashCode) +
    (loginPeriodFailed == null ? 0 : loginPeriodFailed!.hashCode) +
    (logoutPeriodFailed == null ? 0 : logoutPeriodFailed!.hashCode) +
    (organizationPeriodUpdated == null ? 0 : organizationPeriodUpdated!.hashCode) +
    (projectPeriodCreated == null ? 0 : projectPeriodCreated!.hashCode) +
    (projectPeriodUpdated == null ? 0 : projectPeriodUpdated!.hashCode) +
    (projectPeriodArchived == null ? 0 : projectPeriodArchived!.hashCode) +
    (rateLimitPeriodUpdated == null ? 0 : rateLimitPeriodUpdated!.hashCode) +
    (rateLimitPeriodDeleted == null ? 0 : rateLimitPeriodDeleted!.hashCode) +
    (serviceAccountPeriodCreated == null ? 0 : serviceAccountPeriodCreated!.hashCode) +
    (serviceAccountPeriodUpdated == null ? 0 : serviceAccountPeriodUpdated!.hashCode) +
    (serviceAccountPeriodDeleted == null ? 0 : serviceAccountPeriodDeleted!.hashCode) +
    (userPeriodAdded == null ? 0 : userPeriodAdded!.hashCode) +
    (userPeriodUpdated == null ? 0 : userPeriodUpdated!.hashCode) +
    (userPeriodDeleted == null ? 0 : userPeriodDeleted!.hashCode);

  @override
  String toString() => 'AuditLog[id=$id, type=$type, effectiveAt=$effectiveAt, project=$project, actor=$actor, apiKeyPeriodCreated=$apiKeyPeriodCreated, apiKeyPeriodUpdated=$apiKeyPeriodUpdated, apiKeyPeriodDeleted=$apiKeyPeriodDeleted, invitePeriodSent=$invitePeriodSent, invitePeriodAccepted=$invitePeriodAccepted, invitePeriodDeleted=$invitePeriodDeleted, loginPeriodFailed=$loginPeriodFailed, logoutPeriodFailed=$logoutPeriodFailed, organizationPeriodUpdated=$organizationPeriodUpdated, projectPeriodCreated=$projectPeriodCreated, projectPeriodUpdated=$projectPeriodUpdated, projectPeriodArchived=$projectPeriodArchived, rateLimitPeriodUpdated=$rateLimitPeriodUpdated, rateLimitPeriodDeleted=$rateLimitPeriodDeleted, serviceAccountPeriodCreated=$serviceAccountPeriodCreated, serviceAccountPeriodUpdated=$serviceAccountPeriodUpdated, serviceAccountPeriodDeleted=$serviceAccountPeriodDeleted, userPeriodAdded=$userPeriodAdded, userPeriodUpdated=$userPeriodUpdated, userPeriodDeleted=$userPeriodDeleted]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'type'] = this.type;
      json[r'effective_at'] = this.effectiveAt;
    if (this.project != null) {
      json[r'project'] = this.project;
    } else {
      json[r'project'] = null;
    }
      json[r'actor'] = this.actor;
    if (this.apiKeyPeriodCreated != null) {
      json[r'api_key.created'] = this.apiKeyPeriodCreated;
    } else {
      json[r'api_key.created'] = null;
    }
    if (this.apiKeyPeriodUpdated != null) {
      json[r'api_key.updated'] = this.apiKeyPeriodUpdated;
    } else {
      json[r'api_key.updated'] = null;
    }
    if (this.apiKeyPeriodDeleted != null) {
      json[r'api_key.deleted'] = this.apiKeyPeriodDeleted;
    } else {
      json[r'api_key.deleted'] = null;
    }
    if (this.invitePeriodSent != null) {
      json[r'invite.sent'] = this.invitePeriodSent;
    } else {
      json[r'invite.sent'] = null;
    }
    if (this.invitePeriodAccepted != null) {
      json[r'invite.accepted'] = this.invitePeriodAccepted;
    } else {
      json[r'invite.accepted'] = null;
    }
    if (this.invitePeriodDeleted != null) {
      json[r'invite.deleted'] = this.invitePeriodDeleted;
    } else {
      json[r'invite.deleted'] = null;
    }
    if (this.loginPeriodFailed != null) {
      json[r'login.failed'] = this.loginPeriodFailed;
    } else {
      json[r'login.failed'] = null;
    }
    if (this.logoutPeriodFailed != null) {
      json[r'logout.failed'] = this.logoutPeriodFailed;
    } else {
      json[r'logout.failed'] = null;
    }
    if (this.organizationPeriodUpdated != null) {
      json[r'organization.updated'] = this.organizationPeriodUpdated;
    } else {
      json[r'organization.updated'] = null;
    }
    if (this.projectPeriodCreated != null) {
      json[r'project.created'] = this.projectPeriodCreated;
    } else {
      json[r'project.created'] = null;
    }
    if (this.projectPeriodUpdated != null) {
      json[r'project.updated'] = this.projectPeriodUpdated;
    } else {
      json[r'project.updated'] = null;
    }
    if (this.projectPeriodArchived != null) {
      json[r'project.archived'] = this.projectPeriodArchived;
    } else {
      json[r'project.archived'] = null;
    }
    if (this.rateLimitPeriodUpdated != null) {
      json[r'rate_limit.updated'] = this.rateLimitPeriodUpdated;
    } else {
      json[r'rate_limit.updated'] = null;
    }
    if (this.rateLimitPeriodDeleted != null) {
      json[r'rate_limit.deleted'] = this.rateLimitPeriodDeleted;
    } else {
      json[r'rate_limit.deleted'] = null;
    }
    if (this.serviceAccountPeriodCreated != null) {
      json[r'service_account.created'] = this.serviceAccountPeriodCreated;
    } else {
      json[r'service_account.created'] = null;
    }
    if (this.serviceAccountPeriodUpdated != null) {
      json[r'service_account.updated'] = this.serviceAccountPeriodUpdated;
    } else {
      json[r'service_account.updated'] = null;
    }
    if (this.serviceAccountPeriodDeleted != null) {
      json[r'service_account.deleted'] = this.serviceAccountPeriodDeleted;
    } else {
      json[r'service_account.deleted'] = null;
    }
    if (this.userPeriodAdded != null) {
      json[r'user.added'] = this.userPeriodAdded;
    } else {
      json[r'user.added'] = null;
    }
    if (this.userPeriodUpdated != null) {
      json[r'user.updated'] = this.userPeriodUpdated;
    } else {
      json[r'user.updated'] = null;
    }
    if (this.userPeriodDeleted != null) {
      json[r'user.deleted'] = this.userPeriodDeleted;
    } else {
      json[r'user.deleted'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLog] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLog? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLog[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLog[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLog(
        id: mapValueOfType<String>(json, r'id')!,
        type: AuditLogEventType.fromJson(json[r'type'])!,
        effectiveAt: mapValueOfType<int>(json, r'effective_at')!,
        project: AuditLogProject.fromJson(json[r'project']),
        actor: AuditLogActor.fromJson(json[r'actor'])!,
        apiKeyPeriodCreated: AuditLogApiKeyCreated.fromJson(json[r'api_key.created']),
        apiKeyPeriodUpdated: AuditLogApiKeyUpdated.fromJson(json[r'api_key.updated']),
        apiKeyPeriodDeleted: AuditLogApiKeyDeleted.fromJson(json[r'api_key.deleted']),
        invitePeriodSent: AuditLogInviteSent.fromJson(json[r'invite.sent']),
        invitePeriodAccepted: AuditLogInviteAccepted.fromJson(json[r'invite.accepted']),
        invitePeriodDeleted: AuditLogInviteAccepted.fromJson(json[r'invite.deleted']),
        loginPeriodFailed: AuditLogLoginFailed.fromJson(json[r'login.failed']),
        logoutPeriodFailed: AuditLogLoginFailed.fromJson(json[r'logout.failed']),
        organizationPeriodUpdated: AuditLogOrganizationUpdated.fromJson(json[r'organization.updated']),
        projectPeriodCreated: AuditLogProjectCreated.fromJson(json[r'project.created']),
        projectPeriodUpdated: AuditLogProjectUpdated.fromJson(json[r'project.updated']),
        projectPeriodArchived: AuditLogProjectArchived.fromJson(json[r'project.archived']),
        rateLimitPeriodUpdated: AuditLogRateLimitUpdated.fromJson(json[r'rate_limit.updated']),
        rateLimitPeriodDeleted: AuditLogRateLimitDeleted.fromJson(json[r'rate_limit.deleted']),
        serviceAccountPeriodCreated: AuditLogServiceAccountCreated.fromJson(json[r'service_account.created']),
        serviceAccountPeriodUpdated: AuditLogServiceAccountUpdated.fromJson(json[r'service_account.updated']),
        serviceAccountPeriodDeleted: AuditLogServiceAccountDeleted.fromJson(json[r'service_account.deleted']),
        userPeriodAdded: AuditLogUserAdded.fromJson(json[r'user.added']),
        userPeriodUpdated: AuditLogUserUpdated.fromJson(json[r'user.updated']),
        userPeriodDeleted: AuditLogUserDeleted.fromJson(json[r'user.deleted']),
      );
    }
    return null;
  }

  static List<AuditLog> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLog>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLog.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLog> mapFromJson(dynamic json) {
    final map = <String, AuditLog>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLog.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLog-objects as value to a dart map
  static Map<String, List<AuditLog>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLog>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLog.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'type',
    'effective_at',
    'actor',
  };
}

