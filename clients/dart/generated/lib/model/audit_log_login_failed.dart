//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogLoginFailed {
  /// Returns a new [AuditLogLoginFailed] instance.
  AuditLogLoginFailed({
    this.errorCode,
    this.errorMessage,
  });

  /// The error code of the failure.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? errorCode;

  /// The error message of the failure.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? errorMessage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogLoginFailed &&
    other.errorCode == errorCode &&
    other.errorMessage == errorMessage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errorCode == null ? 0 : errorCode!.hashCode) +
    (errorMessage == null ? 0 : errorMessage!.hashCode);

  @override
  String toString() => 'AuditLogLoginFailed[errorCode=$errorCode, errorMessage=$errorMessage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.errorCode != null) {
      json[r'error_code'] = this.errorCode;
    } else {
      json[r'error_code'] = null;
    }
    if (this.errorMessage != null) {
      json[r'error_message'] = this.errorMessage;
    } else {
      json[r'error_message'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogLoginFailed] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogLoginFailed? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogLoginFailed[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogLoginFailed[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogLoginFailed(
        errorCode: mapValueOfType<String>(json, r'error_code'),
        errorMessage: mapValueOfType<String>(json, r'error_message'),
      );
    }
    return null;
  }

  static List<AuditLogLoginFailed> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogLoginFailed>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogLoginFailed.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogLoginFailed> mapFromJson(dynamic json) {
    final map = <String, AuditLogLoginFailed>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogLoginFailed.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogLoginFailed-objects as value to a dart map
  static Map<String, List<AuditLogLoginFailed>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogLoginFailed>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogLoginFailed.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

