//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogOrganizationUpdatedChangesRequestedSettings {
  /// Returns a new [AuditLogOrganizationUpdatedChangesRequestedSettings] instance.
  AuditLogOrganizationUpdatedChangesRequestedSettings({
    this.threadsUiVisibility,
    this.usageDashboardVisibility,
  });

  /// Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? threadsUiVisibility;

  /// Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? usageDashboardVisibility;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogOrganizationUpdatedChangesRequestedSettings &&
    other.threadsUiVisibility == threadsUiVisibility &&
    other.usageDashboardVisibility == usageDashboardVisibility;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (threadsUiVisibility == null ? 0 : threadsUiVisibility!.hashCode) +
    (usageDashboardVisibility == null ? 0 : usageDashboardVisibility!.hashCode);

  @override
  String toString() => 'AuditLogOrganizationUpdatedChangesRequestedSettings[threadsUiVisibility=$threadsUiVisibility, usageDashboardVisibility=$usageDashboardVisibility]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.threadsUiVisibility != null) {
      json[r'threads_ui_visibility'] = this.threadsUiVisibility;
    } else {
      json[r'threads_ui_visibility'] = null;
    }
    if (this.usageDashboardVisibility != null) {
      json[r'usage_dashboard_visibility'] = this.usageDashboardVisibility;
    } else {
      json[r'usage_dashboard_visibility'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogOrganizationUpdatedChangesRequestedSettings] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogOrganizationUpdatedChangesRequestedSettings? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogOrganizationUpdatedChangesRequestedSettings[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogOrganizationUpdatedChangesRequestedSettings[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogOrganizationUpdatedChangesRequestedSettings(
        threadsUiVisibility: mapValueOfType<String>(json, r'threads_ui_visibility'),
        usageDashboardVisibility: mapValueOfType<String>(json, r'usage_dashboard_visibility'),
      );
    }
    return null;
  }

  static List<AuditLogOrganizationUpdatedChangesRequestedSettings> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogOrganizationUpdatedChangesRequestedSettings>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogOrganizationUpdatedChangesRequestedSettings.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogOrganizationUpdatedChangesRequestedSettings> mapFromJson(dynamic json) {
    final map = <String, AuditLogOrganizationUpdatedChangesRequestedSettings>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogOrganizationUpdatedChangesRequestedSettings.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogOrganizationUpdatedChangesRequestedSettings-objects as value to a dart map
  static Map<String, List<AuditLogOrganizationUpdatedChangesRequestedSettings>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogOrganizationUpdatedChangesRequestedSettings>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogOrganizationUpdatedChangesRequestedSettings.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

