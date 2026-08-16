//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FunctionObject {
  /// Returns a new [FunctionObject] instance.
  FunctionObject({
    this.description,
    required this.name,
    this.parameters = const {},
    this.strict = false,
  });

  /// A description of what the function does, used by the model to choose when and how to call the function.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  String name;

  /// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
  Map<String, Object> parameters;

  /// Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
  bool? strict;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FunctionObject &&
    other.description == description &&
    other.name == name &&
    _deepEquality.equals(other.parameters, parameters) &&
    other.strict == strict;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (name.hashCode) +
    (parameters.hashCode) +
    (strict == null ? 0 : strict!.hashCode);

  @override
  String toString() => 'FunctionObject[description=$description, name=$name, parameters=$parameters, strict=$strict]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'name'] = this.name;
      json[r'parameters'] = this.parameters;
    if (this.strict != null) {
      json[r'strict'] = this.strict;
    } else {
      json[r'strict'] = null;
    }
    return json;
  }

  /// Returns a new [FunctionObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FunctionObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FunctionObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FunctionObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FunctionObject(
        description: mapValueOfType<String>(json, r'description'),
        name: mapValueOfType<String>(json, r'name')!,
        parameters: mapCastOfType<String, Object>(json, r'parameters') ?? const {},
        strict: mapValueOfType<bool>(json, r'strict') ?? false,
      );
    }
    return null;
  }

  static List<FunctionObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FunctionObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FunctionObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FunctionObject> mapFromJson(dynamic json) {
    final map = <String, FunctionObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FunctionObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FunctionObject-objects as value to a dart map
  static Map<String, List<FunctionObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FunctionObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FunctionObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

