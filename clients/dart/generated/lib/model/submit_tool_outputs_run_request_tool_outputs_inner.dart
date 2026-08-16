//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SubmitToolOutputsRunRequestToolOutputsInner {
  /// Returns a new [SubmitToolOutputsRunRequestToolOutputsInner] instance.
  SubmitToolOutputsRunRequestToolOutputsInner({
    this.toolCallId,
    this.output,
  });

  /// The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? toolCallId;

  /// The output of the tool call to be submitted to continue the run.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? output;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SubmitToolOutputsRunRequestToolOutputsInner &&
    other.toolCallId == toolCallId &&
    other.output == output;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (toolCallId == null ? 0 : toolCallId!.hashCode) +
    (output == null ? 0 : output!.hashCode);

  @override
  String toString() => 'SubmitToolOutputsRunRequestToolOutputsInner[toolCallId=$toolCallId, output=$output]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.toolCallId != null) {
      json[r'tool_call_id'] = this.toolCallId;
    } else {
      json[r'tool_call_id'] = null;
    }
    if (this.output != null) {
      json[r'output'] = this.output;
    } else {
      json[r'output'] = null;
    }
    return json;
  }

  /// Returns a new [SubmitToolOutputsRunRequestToolOutputsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SubmitToolOutputsRunRequestToolOutputsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SubmitToolOutputsRunRequestToolOutputsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SubmitToolOutputsRunRequestToolOutputsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SubmitToolOutputsRunRequestToolOutputsInner(
        toolCallId: mapValueOfType<String>(json, r'tool_call_id'),
        output: mapValueOfType<String>(json, r'output'),
      );
    }
    return null;
  }

  static List<SubmitToolOutputsRunRequestToolOutputsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SubmitToolOutputsRunRequestToolOutputsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SubmitToolOutputsRunRequestToolOutputsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SubmitToolOutputsRunRequestToolOutputsInner> mapFromJson(dynamic json) {
    final map = <String, SubmitToolOutputsRunRequestToolOutputsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SubmitToolOutputsRunRequestToolOutputsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SubmitToolOutputsRunRequestToolOutputsInner-objects as value to a dart map
  static Map<String, List<SubmitToolOutputsRunRequestToolOutputsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SubmitToolOutputsRunRequestToolOutputsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SubmitToolOutputsRunRequestToolOutputsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

