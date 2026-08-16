//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BatchErrorsDataInner {
  /// Returns a new [BatchErrorsDataInner] instance.
  BatchErrorsDataInner({
    this.code,
    this.message,
    this.param,
    this.line,
  });

  /// An error code identifying the error type.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? code;

  /// A human-readable message providing more details about the error.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  /// The name of the parameter that caused the error, if applicable.
  String? param;

  /// The line number of the input file where the error occurred, if applicable.
  int? line;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BatchErrorsDataInner &&
    other.code == code &&
    other.message == message &&
    other.param == param &&
    other.line == line;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code == null ? 0 : code!.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (param == null ? 0 : param!.hashCode) +
    (line == null ? 0 : line!.hashCode);

  @override
  String toString() => 'BatchErrorsDataInner[code=$code, message=$message, param=$param, line=$line]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    if (this.param != null) {
      json[r'param'] = this.param;
    } else {
      json[r'param'] = null;
    }
    if (this.line != null) {
      json[r'line'] = this.line;
    } else {
      json[r'line'] = null;
    }
    return json;
  }

  /// Returns a new [BatchErrorsDataInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BatchErrorsDataInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BatchErrorsDataInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BatchErrorsDataInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BatchErrorsDataInner(
        code: mapValueOfType<String>(json, r'code'),
        message: mapValueOfType<String>(json, r'message'),
        param: mapValueOfType<String>(json, r'param'),
        line: mapValueOfType<int>(json, r'line'),
      );
    }
    return null;
  }

  static List<BatchErrorsDataInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchErrorsDataInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchErrorsDataInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BatchErrorsDataInner> mapFromJson(dynamic json) {
    final map = <String, BatchErrorsDataInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BatchErrorsDataInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BatchErrorsDataInner-objects as value to a dart map
  static Map<String, List<BatchErrorsDataInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BatchErrorsDataInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BatchErrorsDataInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

