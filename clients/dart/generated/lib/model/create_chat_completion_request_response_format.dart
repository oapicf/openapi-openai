//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatCompletionRequestResponseFormat {
  /// Returns a new [CreateChatCompletionRequestResponseFormat] instance.
  CreateChatCompletionRequestResponseFormat({
    required this.type,
    required this.jsonSchema,
  });

  /// The type of response format being defined: `text`
  CreateChatCompletionRequestResponseFormatTypeEnum type;

  ResponseFormatJsonSchemaJsonSchema jsonSchema;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatCompletionRequestResponseFormat &&
    other.type == type &&
    other.jsonSchema == jsonSchema;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (jsonSchema.hashCode);

  @override
  String toString() => 'CreateChatCompletionRequestResponseFormat[type=$type, jsonSchema=$jsonSchema]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'json_schema'] = this.jsonSchema;
    return json;
  }

  /// Returns a new [CreateChatCompletionRequestResponseFormat] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatCompletionRequestResponseFormat? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateChatCompletionRequestResponseFormat[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateChatCompletionRequestResponseFormat[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateChatCompletionRequestResponseFormat(
        type: CreateChatCompletionRequestResponseFormatTypeEnum.fromJson(json[r'type'])!,
        jsonSchema: ResponseFormatJsonSchemaJsonSchema.fromJson(json[r'json_schema'])!,
      );
    }
    return null;
  }

  static List<CreateChatCompletionRequestResponseFormat> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionRequestResponseFormat>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionRequestResponseFormat.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatCompletionRequestResponseFormat> mapFromJson(dynamic json) {
    final map = <String, CreateChatCompletionRequestResponseFormat>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatCompletionRequestResponseFormat.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatCompletionRequestResponseFormat-objects as value to a dart map
  static Map<String, List<CreateChatCompletionRequestResponseFormat>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatCompletionRequestResponseFormat>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatCompletionRequestResponseFormat.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'json_schema',
  };
}

/// The type of response format being defined: `text`
class CreateChatCompletionRequestResponseFormatTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateChatCompletionRequestResponseFormatTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateChatCompletionRequestResponseFormatTypeEnum._(r'text');
  static const jsonObject = CreateChatCompletionRequestResponseFormatTypeEnum._(r'json_object');
  static const jsonSchema = CreateChatCompletionRequestResponseFormatTypeEnum._(r'json_schema');

  /// List of all possible values in this [enum][CreateChatCompletionRequestResponseFormatTypeEnum].
  static const values = <CreateChatCompletionRequestResponseFormatTypeEnum>[
    text,
    jsonObject,
    jsonSchema,
  ];

  static CreateChatCompletionRequestResponseFormatTypeEnum? fromJson(dynamic value) => CreateChatCompletionRequestResponseFormatTypeEnumTypeTransformer().decode(value);

  static List<CreateChatCompletionRequestResponseFormatTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionRequestResponseFormatTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionRequestResponseFormatTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionRequestResponseFormatTypeEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionRequestResponseFormatTypeEnum].
class CreateChatCompletionRequestResponseFormatTypeEnumTypeTransformer {
  factory CreateChatCompletionRequestResponseFormatTypeEnumTypeTransformer() => _instance ??= const CreateChatCompletionRequestResponseFormatTypeEnumTypeTransformer._();

  const CreateChatCompletionRequestResponseFormatTypeEnumTypeTransformer._();

  String encode(CreateChatCompletionRequestResponseFormatTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateChatCompletionRequestResponseFormatTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionRequestResponseFormatTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateChatCompletionRequestResponseFormatTypeEnum.text;
        case r'json_object': return CreateChatCompletionRequestResponseFormatTypeEnum.jsonObject;
        case r'json_schema': return CreateChatCompletionRequestResponseFormatTypeEnum.jsonSchema;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateChatCompletionRequestResponseFormatTypeEnumTypeTransformer] instance.
  static CreateChatCompletionRequestResponseFormatTypeEnumTypeTransformer? _instance;
}


