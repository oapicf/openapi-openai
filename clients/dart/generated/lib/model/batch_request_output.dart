//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BatchRequestOutput {
  /// Returns a new [BatchRequestOutput] instance.
  BatchRequestOutput({
    this.id,
    this.customId,
    this.response,
    this.error,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// A developer-provided per-request id that will be used to match outputs to inputs.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? customId;

  BatchRequestOutputResponse? response;

  BatchRequestOutputError? error;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BatchRequestOutput &&
    other.id == id &&
    other.customId == customId &&
    other.response == response &&
    other.error == error;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (customId == null ? 0 : customId!.hashCode) +
    (response == null ? 0 : response!.hashCode) +
    (error == null ? 0 : error!.hashCode);

  @override
  String toString() => 'BatchRequestOutput[id=$id, customId=$customId, response=$response, error=$error]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.customId != null) {
      json[r'custom_id'] = this.customId;
    } else {
      json[r'custom_id'] = null;
    }
    if (this.response != null) {
      json[r'response'] = this.response;
    } else {
      json[r'response'] = null;
    }
    if (this.error != null) {
      json[r'error'] = this.error;
    } else {
      json[r'error'] = null;
    }
    return json;
  }

  /// Returns a new [BatchRequestOutput] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BatchRequestOutput? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BatchRequestOutput[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BatchRequestOutput[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BatchRequestOutput(
        id: mapValueOfType<String>(json, r'id'),
        customId: mapValueOfType<String>(json, r'custom_id'),
        response: BatchRequestOutputResponse.fromJson(json[r'response']),
        error: BatchRequestOutputError.fromJson(json[r'error']),
      );
    }
    return null;
  }

  static List<BatchRequestOutput> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchRequestOutput>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchRequestOutput.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BatchRequestOutput> mapFromJson(dynamic json) {
    final map = <String, BatchRequestOutput>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BatchRequestOutput.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BatchRequestOutput-objects as value to a dart map
  static Map<String, List<BatchRequestOutput>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BatchRequestOutput>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BatchRequestOutput.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

