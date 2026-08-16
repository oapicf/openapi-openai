//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsCodeOutputImageObject {
  /// Returns a new [RunStepDetailsToolCallsCodeOutputImageObject] instance.
  RunStepDetailsToolCallsCodeOutputImageObject({
    required this.type,
    required this.image,
  });

  /// Always `image`.
  RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum type;

  RunStepDetailsToolCallsCodeOutputImageObjectImage image;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsCodeOutputImageObject &&
    other.type == type &&
    other.image == image;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (image.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsCodeOutputImageObject[type=$type, image=$image]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'image'] = this.image;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsCodeOutputImageObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsCodeOutputImageObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsCodeOutputImageObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsCodeOutputImageObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsCodeOutputImageObject(
        type: RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum.fromJson(json[r'type'])!,
        image: RunStepDetailsToolCallsCodeOutputImageObjectImage.fromJson(json[r'image'])!,
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsCodeOutputImageObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeOutputImageObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeOutputImageObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsCodeOutputImageObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsCodeOutputImageObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsCodeOutputImageObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsCodeOutputImageObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsCodeOutputImageObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsCodeOutputImageObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsCodeOutputImageObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'image',
  };
}

/// Always `image`.
class RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const image = RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum._(r'image');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum].
  static const values = <RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum>[
    image,
  ];

  static RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum].
class RunStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image': return RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer? _instance;
}


