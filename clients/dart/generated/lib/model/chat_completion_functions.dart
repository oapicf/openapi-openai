//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionFunctions {
  /// Returns a new [ChatCompletionFunctions] instance.
  ChatCompletionFunctions({
    this.description,
    required this.name,
    this.parameters = const {},
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

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionFunctions &&
    other.description == description &&
    other.name == name &&
    _deepEquality.equals(other.parameters, parameters);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (name.hashCode) +
    (parameters.hashCode);

  @override
  String toString() => 'ChatCompletionFunctions[description=$description, name=$name, parameters=$parameters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'name'] = this.name;
      json[r'parameters'] = this.parameters;
    return json;
  }

  /// Returns a new [ChatCompletionFunctions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionFunctions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionFunctions[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionFunctions[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionFunctions(
        description: mapValueOfType<String>(json, r'description'),
        name: mapValueOfType<String>(json, r'name')!,
        parameters: mapCastOfType<String, Object>(json, r'parameters') ?? const {},
      );
    }
    return null;
  }

  static List<ChatCompletionFunctions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionFunctions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionFunctions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionFunctions> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionFunctions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionFunctions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionFunctions-objects as value to a dart map
  static Map<String, List<ChatCompletionFunctions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionFunctions>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionFunctions.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

