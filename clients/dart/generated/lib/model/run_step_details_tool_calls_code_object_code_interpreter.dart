//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsCodeObjectCodeInterpreter {
  /// Returns a new [RunStepDetailsToolCallsCodeObjectCodeInterpreter] instance.
  RunStepDetailsToolCallsCodeObjectCodeInterpreter({
    required this.input,
    this.outputs = const [],
  });

  /// The input to the Code Interpreter tool call.
  String input;

  /// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsCodeObjectCodeInterpreter &&
    other.input == input &&
    _deepEquality.equals(other.outputs, outputs);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (input.hashCode) +
    (outputs.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsCodeObjectCodeInterpreter[input=$input, outputs=$outputs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'input'] = this.input;
      json[r'outputs'] = this.outputs;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsCodeObjectCodeInterpreter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsCodeObjectCodeInterpreter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsCodeObjectCodeInterpreter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsCodeObjectCodeInterpreter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsCodeObjectCodeInterpreter(
        input: mapValueOfType<String>(json, r'input')!,
        outputs: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.listFromJson(json[r'outputs']),
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsCodeObjectCodeInterpreter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeObjectCodeInterpreter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsCodeObjectCodeInterpreter> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsCodeObjectCodeInterpreter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsCodeObjectCodeInterpreter-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsCodeObjectCodeInterpreter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsCodeObjectCodeInterpreter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsCodeObjectCodeInterpreter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'input',
    'outputs',
  };
}

