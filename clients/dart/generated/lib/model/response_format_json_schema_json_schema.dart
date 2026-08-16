//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ResponseFormatJsonSchemaJsonSchema {
  /// Returns a new [ResponseFormatJsonSchemaJsonSchema] instance.
  ResponseFormatJsonSchemaJsonSchema({
    this.description,
    required this.name,
    this.schema = const {},
    this.strict = false,
  });

  /// A description of what the response format is for, used by the model to determine how to respond in the format.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  String name;

  /// The schema for the response format, described as a JSON Schema object.
  Map<String, Object> schema;

  /// Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
  bool? strict;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ResponseFormatJsonSchemaJsonSchema &&
    other.description == description &&
    other.name == name &&
    _deepEquality.equals(other.schema, schema) &&
    other.strict == strict;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (name.hashCode) +
    (schema.hashCode) +
    (strict == null ? 0 : strict!.hashCode);

  @override
  String toString() => 'ResponseFormatJsonSchemaJsonSchema[description=$description, name=$name, schema=$schema, strict=$strict]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'name'] = this.name;
      json[r'schema'] = this.schema;
    if (this.strict != null) {
      json[r'strict'] = this.strict;
    } else {
      json[r'strict'] = null;
    }
    return json;
  }

  /// Returns a new [ResponseFormatJsonSchemaJsonSchema] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ResponseFormatJsonSchemaJsonSchema? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ResponseFormatJsonSchemaJsonSchema[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ResponseFormatJsonSchemaJsonSchema[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ResponseFormatJsonSchemaJsonSchema(
        description: mapValueOfType<String>(json, r'description'),
        name: mapValueOfType<String>(json, r'name')!,
        schema: mapCastOfType<String, Object>(json, r'schema') ?? const {},
        strict: mapValueOfType<bool>(json, r'strict') ?? false,
      );
    }
    return null;
  }

  static List<ResponseFormatJsonSchemaJsonSchema> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ResponseFormatJsonSchemaJsonSchema>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ResponseFormatJsonSchemaJsonSchema.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ResponseFormatJsonSchemaJsonSchema> mapFromJson(dynamic json) {
    final map = <String, ResponseFormatJsonSchemaJsonSchema>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ResponseFormatJsonSchemaJsonSchema.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ResponseFormatJsonSchemaJsonSchema-objects as value to a dart map
  static Map<String, List<ResponseFormatJsonSchemaJsonSchema>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ResponseFormatJsonSchemaJsonSchema>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ResponseFormatJsonSchemaJsonSchema.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

