//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateModerationRequestInputOneOfInnerOneOf1 {
  /// Returns a new [CreateModerationRequestInputOneOfInnerOneOf1] instance.
  CreateModerationRequestInputOneOfInnerOneOf1({
    required this.type,
    required this.text,
  });

  /// Always `text`.
  CreateModerationRequestInputOneOfInnerOneOf1TypeEnum type;

  /// A string of text to classify.
  String text;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateModerationRequestInputOneOfInnerOneOf1 &&
    other.type == type &&
    other.text == text;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (text.hashCode);

  @override
  String toString() => 'CreateModerationRequestInputOneOfInnerOneOf1[type=$type, text=$text]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'text'] = this.text;
    return json;
  }

  /// Returns a new [CreateModerationRequestInputOneOfInnerOneOf1] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateModerationRequestInputOneOfInnerOneOf1? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'type'), 'Required key "CreateModerationRequestInputOneOfInnerOneOf1[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "CreateModerationRequestInputOneOfInnerOneOf1[type]" has a null value in JSON.');
        assert(json.containsKey(r'text'), 'Required key "CreateModerationRequestInputOneOfInnerOneOf1[text]" is missing from JSON.');
        assert(json[r'text'] != null, 'Required key "CreateModerationRequestInputOneOfInnerOneOf1[text]" has a null value in JSON.');
        return true;
      }());

      return CreateModerationRequestInputOneOfInnerOneOf1(
        type: CreateModerationRequestInputOneOfInnerOneOf1TypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text')!,
      );
    }
    return null;
  }

  static List<CreateModerationRequestInputOneOfInnerOneOf1> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationRequestInputOneOfInnerOneOf1>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationRequestInputOneOfInnerOneOf1.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateModerationRequestInputOneOfInnerOneOf1> mapFromJson(dynamic json) {
    final map = <String, CreateModerationRequestInputOneOfInnerOneOf1>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateModerationRequestInputOneOfInnerOneOf1.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateModerationRequestInputOneOfInnerOneOf1-objects as value to a dart map
  static Map<String, List<CreateModerationRequestInputOneOfInnerOneOf1>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateModerationRequestInputOneOfInnerOneOf1>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateModerationRequestInputOneOfInnerOneOf1.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'text',
  };
}

/// Always `text`.
enum CreateModerationRequestInputOneOfInnerOneOf1TypeEnum {
  text._(r'text'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateModerationRequestInputOneOfInnerOneOf1TypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateModerationRequestInputOneOfInnerOneOf1TypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateModerationRequestInputOneOfInnerOneOf1TypeEnum? fromJson(dynamic value) => CreateModerationRequestInputOneOfInnerOneOf1TypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateModerationRequestInputOneOfInnerOneOf1TypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateModerationRequestInputOneOfInnerOneOf1TypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationRequestInputOneOfInnerOneOf1TypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationRequestInputOneOfInnerOneOf1TypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationRequestInputOneOfInnerOneOf1TypeEnum] to String,
/// and [decode] dynamic data back to [CreateModerationRequestInputOneOfInnerOneOf1TypeEnum].
class CreateModerationRequestInputOneOfInnerOneOf1TypeEnumTypeTransformer {
  factory CreateModerationRequestInputOneOfInnerOneOf1TypeEnumTypeTransformer() => _instance ??= const CreateModerationRequestInputOneOfInnerOneOf1TypeEnumTypeTransformer._();

  const CreateModerationRequestInputOneOfInnerOneOf1TypeEnumTypeTransformer._();

  String encode(CreateModerationRequestInputOneOfInnerOneOf1TypeEnum data) => data._value;

  /// Returns the instance of [CreateModerationRequestInputOneOfInnerOneOf1TypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationRequestInputOneOfInnerOneOf1TypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateModerationRequestInputOneOfInnerOneOf1TypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationRequestInputOneOfInnerOneOf1TypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateModerationRequestInputOneOfInnerOneOf1TypeEnumTypeTransformer? _instance;
}


