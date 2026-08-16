//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunToolCallObjectFunction {
  /// Returns a new [RunToolCallObjectFunction] instance.
  RunToolCallObjectFunction({
    required this.name,
    required this.arguments,
  });

  /// The name of the function.
  String name;

  /// The arguments that the model expects you to pass to the function.
  String arguments;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunToolCallObjectFunction &&
    other.name == name &&
    other.arguments == arguments;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (arguments.hashCode);

  @override
  String toString() => 'RunToolCallObjectFunction[name=$name, arguments=$arguments]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'arguments'] = this.arguments;
    return json;
  }

  /// Returns a new [RunToolCallObjectFunction] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunToolCallObjectFunction? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunToolCallObjectFunction[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunToolCallObjectFunction[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunToolCallObjectFunction(
        name: mapValueOfType<String>(json, r'name')!,
        arguments: mapValueOfType<String>(json, r'arguments')!,
      );
    }
    return null;
  }

  static List<RunToolCallObjectFunction> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunToolCallObjectFunction>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunToolCallObjectFunction.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunToolCallObjectFunction> mapFromJson(dynamic json) {
    final map = <String, RunToolCallObjectFunction>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunToolCallObjectFunction.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunToolCallObjectFunction-objects as value to a dart map
  static Map<String, List<RunToolCallObjectFunction>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunToolCallObjectFunction>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunToolCallObjectFunction.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'arguments',
  };
}

