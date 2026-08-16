//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogServiceAccountUpdatedChangesRequested {
  /// Returns a new [AuditLogServiceAccountUpdatedChangesRequested] instance.
  AuditLogServiceAccountUpdatedChangesRequested({
    this.role,
  });

  /// The role of the service account. Is either `owner` or `member`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? role;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogServiceAccountUpdatedChangesRequested &&
    other.role == role;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (role == null ? 0 : role!.hashCode);

  @override
  String toString() => 'AuditLogServiceAccountUpdatedChangesRequested[role=$role]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.role != null) {
      json[r'role'] = this.role;
    } else {
      json[r'role'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogServiceAccountUpdatedChangesRequested] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogServiceAccountUpdatedChangesRequested? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogServiceAccountUpdatedChangesRequested[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogServiceAccountUpdatedChangesRequested[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogServiceAccountUpdatedChangesRequested(
        role: mapValueOfType<String>(json, r'role'),
      );
    }
    return null;
  }

  static List<AuditLogServiceAccountUpdatedChangesRequested> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogServiceAccountUpdatedChangesRequested>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogServiceAccountUpdatedChangesRequested.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogServiceAccountUpdatedChangesRequested> mapFromJson(dynamic json) {
    final map = <String, AuditLogServiceAccountUpdatedChangesRequested>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogServiceAccountUpdatedChangesRequested.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogServiceAccountUpdatedChangesRequested-objects as value to a dart map
  static Map<String, List<AuditLogServiceAccountUpdatedChangesRequested>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogServiceAccountUpdatedChangesRequested>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogServiceAccountUpdatedChangesRequested.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

