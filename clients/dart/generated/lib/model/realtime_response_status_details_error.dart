//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeResponseStatusDetailsError {
  /// Returns a new [RealtimeResponseStatusDetailsError] instance.
  RealtimeResponseStatusDetailsError({
    this.type,
    this.code,
  });

  /// The type of error.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  /// Error code, if any.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? code;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeResponseStatusDetailsError &&
    other.type == type &&
    other.code == code;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (code == null ? 0 : code!.hashCode);

  @override
  String toString() => 'RealtimeResponseStatusDetailsError[type=$type, code=$code]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeResponseStatusDetailsError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeResponseStatusDetailsError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeResponseStatusDetailsError[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeResponseStatusDetailsError[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeResponseStatusDetailsError(
        type: mapValueOfType<String>(json, r'type'),
        code: mapValueOfType<String>(json, r'code'),
      );
    }
    return null;
  }

  static List<RealtimeResponseStatusDetailsError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseStatusDetailsError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseStatusDetailsError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeResponseStatusDetailsError> mapFromJson(dynamic json) {
    final map = <String, RealtimeResponseStatusDetailsError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeResponseStatusDetailsError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeResponseStatusDetailsError-objects as value to a dart map
  static Map<String, List<RealtimeResponseStatusDetailsError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeResponseStatusDetailsError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeResponseStatusDetailsError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

