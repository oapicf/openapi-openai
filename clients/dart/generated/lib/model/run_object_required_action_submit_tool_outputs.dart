//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunObjectRequiredActionSubmitToolOutputs {
  /// Returns a new [RunObjectRequiredActionSubmitToolOutputs] instance.
  RunObjectRequiredActionSubmitToolOutputs({
    this.toolCalls = const [],
  });

  /// A list of the relevant tool calls.
  List<RunToolCallObject> toolCalls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunObjectRequiredActionSubmitToolOutputs &&
    _deepEquality.equals(other.toolCalls, toolCalls);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (toolCalls.hashCode);

  @override
  String toString() => 'RunObjectRequiredActionSubmitToolOutputs[toolCalls=$toolCalls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'tool_calls'] = this.toolCalls;
    return json;
  }

  /// Returns a new [RunObjectRequiredActionSubmitToolOutputs] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunObjectRequiredActionSubmitToolOutputs? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunObjectRequiredActionSubmitToolOutputs[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunObjectRequiredActionSubmitToolOutputs[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunObjectRequiredActionSubmitToolOutputs(
        toolCalls: RunToolCallObject.listFromJson(json[r'tool_calls']),
      );
    }
    return null;
  }

  static List<RunObjectRequiredActionSubmitToolOutputs> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectRequiredActionSubmitToolOutputs>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectRequiredActionSubmitToolOutputs.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunObjectRequiredActionSubmitToolOutputs> mapFromJson(dynamic json) {
    final map = <String, RunObjectRequiredActionSubmitToolOutputs>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunObjectRequiredActionSubmitToolOutputs.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunObjectRequiredActionSubmitToolOutputs-objects as value to a dart map
  static Map<String, List<RunObjectRequiredActionSubmitToolOutputs>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunObjectRequiredActionSubmitToolOutputs>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunObjectRequiredActionSubmitToolOutputs.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'tool_calls',
  };
}

