//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateModerationRequestInputOneOfInnerOneOf {
  /// Returns a new [CreateModerationRequestInputOneOfInnerOneOf] instance.
  CreateModerationRequestInputOneOfInnerOneOf({
    required this.type,
    required this.imageUrl,
  });

  /// Always `image_url`.
  CreateModerationRequestInputOneOfInnerOneOfTypeEnum type;

  CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateModerationRequestInputOneOfInnerOneOf &&
    other.type == type &&
    other.imageUrl == imageUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (imageUrl.hashCode);

  @override
  String toString() => 'CreateModerationRequestInputOneOfInnerOneOf[type=$type, imageUrl=$imageUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'image_url'] = this.imageUrl;
    return json;
  }

  /// Returns a new [CreateModerationRequestInputOneOfInnerOneOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateModerationRequestInputOneOfInnerOneOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'type'), 'Required key "CreateModerationRequestInputOneOfInnerOneOf[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "CreateModerationRequestInputOneOfInnerOneOf[type]" has a null value in JSON.');
        assert(json.containsKey(r'image_url'), 'Required key "CreateModerationRequestInputOneOfInnerOneOf[image_url]" is missing from JSON.');
        assert(json[r'image_url'] != null, 'Required key "CreateModerationRequestInputOneOfInnerOneOf[image_url]" has a null value in JSON.');
        return true;
      }());

      return CreateModerationRequestInputOneOfInnerOneOf(
        type: CreateModerationRequestInputOneOfInnerOneOfTypeEnum.fromJson(json[r'type'])!,
        imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl.fromJson(json[r'image_url'])!,
      );
    }
    return null;
  }

  static List<CreateModerationRequestInputOneOfInnerOneOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationRequestInputOneOfInnerOneOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationRequestInputOneOfInnerOneOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateModerationRequestInputOneOfInnerOneOf> mapFromJson(dynamic json) {
    final map = <String, CreateModerationRequestInputOneOfInnerOneOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateModerationRequestInputOneOfInnerOneOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateModerationRequestInputOneOfInnerOneOf-objects as value to a dart map
  static Map<String, List<CreateModerationRequestInputOneOfInnerOneOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateModerationRequestInputOneOfInnerOneOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateModerationRequestInputOneOfInnerOneOf.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'image_url',
  };
}

/// Always `image_url`.
enum CreateModerationRequestInputOneOfInnerOneOfTypeEnum {
  imageUrl._(r'image_url'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateModerationRequestInputOneOfInnerOneOfTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateModerationRequestInputOneOfInnerOneOfTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateModerationRequestInputOneOfInnerOneOfTypeEnum? fromJson(dynamic value) => CreateModerationRequestInputOneOfInnerOneOfTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateModerationRequestInputOneOfInnerOneOfTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateModerationRequestInputOneOfInnerOneOfTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationRequestInputOneOfInnerOneOfTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationRequestInputOneOfInnerOneOfTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationRequestInputOneOfInnerOneOfTypeEnum] to String,
/// and [decode] dynamic data back to [CreateModerationRequestInputOneOfInnerOneOfTypeEnum].
class CreateModerationRequestInputOneOfInnerOneOfTypeEnumTypeTransformer {
  factory CreateModerationRequestInputOneOfInnerOneOfTypeEnumTypeTransformer() => _instance ??= const CreateModerationRequestInputOneOfInnerOneOfTypeEnumTypeTransformer._();

  const CreateModerationRequestInputOneOfInnerOneOfTypeEnumTypeTransformer._();

  String encode(CreateModerationRequestInputOneOfInnerOneOfTypeEnum data) => data._value;

  /// Returns the instance of [CreateModerationRequestInputOneOfInnerOneOfTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationRequestInputOneOfInnerOneOfTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateModerationRequestInputOneOfInnerOneOfTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'image_url': return CreateModerationRequestInputOneOfInnerOneOfTypeEnum.imageUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateModerationRequestInputOneOfInnerOneOfTypeEnumTypeTransformer? _instance;
}


