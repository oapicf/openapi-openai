//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantsApiResponseFormatOption {
  /// Returns a new [AssistantsApiResponseFormatOption] instance.
  AssistantsApiResponseFormatOption({
    required this.type,
    required this.jsonSchema,
  });

  /// The type of response format being defined: `text`
  AssistantsApiResponseFormatOptionTypeEnum type;

  ResponseFormatJsonSchemaJsonSchema jsonSchema;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantsApiResponseFormatOption &&
    other.type == type &&
    other.jsonSchema == jsonSchema;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (jsonSchema.hashCode);

  @override
  String toString() => 'AssistantsApiResponseFormatOption[type=$type, jsonSchema=$jsonSchema]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'json_schema'] = this.jsonSchema;
    return json;
  }

  /// Returns a new [AssistantsApiResponseFormatOption] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantsApiResponseFormatOption? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'type'), 'Required key "AssistantsApiResponseFormatOption[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "AssistantsApiResponseFormatOption[type]" has a null value in JSON.');
        assert(json.containsKey(r'json_schema'), 'Required key "AssistantsApiResponseFormatOption[json_schema]" is missing from JSON.');
        assert(json[r'json_schema'] != null, 'Required key "AssistantsApiResponseFormatOption[json_schema]" has a null value in JSON.');
        return true;
      }());

      return AssistantsApiResponseFormatOption(
        type: AssistantsApiResponseFormatOptionTypeEnum.fromJson(json[r'type'])!,
        jsonSchema: ResponseFormatJsonSchemaJsonSchema.fromJson(json[r'json_schema'])!,
      );
    }
    return null;
  }

  static List<AssistantsApiResponseFormatOption> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantsApiResponseFormatOption>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantsApiResponseFormatOption.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantsApiResponseFormatOption> mapFromJson(dynamic json) {
    final map = <String, AssistantsApiResponseFormatOption>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantsApiResponseFormatOption.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantsApiResponseFormatOption-objects as value to a dart map
  static Map<String, List<AssistantsApiResponseFormatOption>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantsApiResponseFormatOption>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantsApiResponseFormatOption.listFromJson(entry.value, growable: growable,);
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
enum AssistantsApiResponseFormatOptionTypeEnum {
  text._(r'text'),
  jsonObject._(r'json_object'),
  jsonSchema._(r'json_schema'),
  ;

  /// Instantiate a new enum with the provided value.
  const AssistantsApiResponseFormatOptionTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AssistantsApiResponseFormatOptionTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AssistantsApiResponseFormatOptionTypeEnum? fromJson(dynamic value) => AssistantsApiResponseFormatOptionTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AssistantsApiResponseFormatOptionTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AssistantsApiResponseFormatOptionTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantsApiResponseFormatOptionTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantsApiResponseFormatOptionTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantsApiResponseFormatOptionTypeEnum] to String,
/// and [decode] dynamic data back to [AssistantsApiResponseFormatOptionTypeEnum].
class AssistantsApiResponseFormatOptionTypeEnumTypeTransformer {
  factory AssistantsApiResponseFormatOptionTypeEnumTypeTransformer() => _instance ??= const AssistantsApiResponseFormatOptionTypeEnumTypeTransformer._();

  const AssistantsApiResponseFormatOptionTypeEnumTypeTransformer._();

  String encode(AssistantsApiResponseFormatOptionTypeEnum data) => data._value;

  /// Returns the instance of [AssistantsApiResponseFormatOptionTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantsApiResponseFormatOptionTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is AssistantsApiResponseFormatOptionTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'text': return AssistantsApiResponseFormatOptionTypeEnum.text;
        case r'json_object': return AssistantsApiResponseFormatOptionTypeEnum.jsonObject;
        case r'json_schema': return AssistantsApiResponseFormatOptionTypeEnum.jsonSchema;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AssistantsApiResponseFormatOptionTypeEnumTypeTransformer? _instance;
}


