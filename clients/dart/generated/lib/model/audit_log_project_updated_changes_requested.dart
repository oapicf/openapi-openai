//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogProjectUpdatedChangesRequested {
  /// Returns a new [AuditLogProjectUpdatedChangesRequested] instance.
  AuditLogProjectUpdatedChangesRequested({
    this.title,
  });

  /// The title of the project as seen on the dashboard.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogProjectUpdatedChangesRequested &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'AuditLogProjectUpdatedChangesRequested[title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogProjectUpdatedChangesRequested] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogProjectUpdatedChangesRequested? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogProjectUpdatedChangesRequested[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogProjectUpdatedChangesRequested[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogProjectUpdatedChangesRequested(
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<AuditLogProjectUpdatedChangesRequested> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogProjectUpdatedChangesRequested>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogProjectUpdatedChangesRequested.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogProjectUpdatedChangesRequested> mapFromJson(dynamic json) {
    final map = <String, AuditLogProjectUpdatedChangesRequested>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogProjectUpdatedChangesRequested.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogProjectUpdatedChangesRequested-objects as value to a dart map
  static Map<String, List<AuditLogProjectUpdatedChangesRequested>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogProjectUpdatedChangesRequested>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogProjectUpdatedChangesRequested.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

