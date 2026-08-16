//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogOrganizationUpdated {
  /// Returns a new [AuditLogOrganizationUpdated] instance.
  AuditLogOrganizationUpdated({
    this.id,
    this.changesRequested,
  });

  /// The organization ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogOrganizationUpdatedChangesRequested? changesRequested;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogOrganizationUpdated &&
    other.id == id &&
    other.changesRequested == changesRequested;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (changesRequested == null ? 0 : changesRequested!.hashCode);

  @override
  String toString() => 'AuditLogOrganizationUpdated[id=$id, changesRequested=$changesRequested]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.changesRequested != null) {
      json[r'changes_requested'] = this.changesRequested;
    } else {
      json[r'changes_requested'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogOrganizationUpdated] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogOrganizationUpdated? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogOrganizationUpdated[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogOrganizationUpdated[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogOrganizationUpdated(
        id: mapValueOfType<String>(json, r'id'),
        changesRequested: AuditLogOrganizationUpdatedChangesRequested.fromJson(json[r'changes_requested']),
      );
    }
    return null;
  }

  static List<AuditLogOrganizationUpdated> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogOrganizationUpdated>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogOrganizationUpdated.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogOrganizationUpdated> mapFromJson(dynamic json) {
    final map = <String, AuditLogOrganizationUpdated>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogOrganizationUpdated.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogOrganizationUpdated-objects as value to a dart map
  static Map<String, List<AuditLogOrganizationUpdated>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogOrganizationUpdated>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogOrganizationUpdated.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

