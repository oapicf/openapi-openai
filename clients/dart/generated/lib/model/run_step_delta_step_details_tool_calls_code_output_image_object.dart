//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
  /// Returns a new [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] instance.
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject({
    required this.index,
    required this.type,
    this.image,
  });

  /// The index of the output in the outputs array.
  int index;

  /// Always `image`.
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? image;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsToolCallsCodeOutputImageObject &&
    other.index == index &&
    other.type == type &&
    other.image == image;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (image == null ? 0 : image!.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObject[index=$index, type=$type, image=$image]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.image != null) {
      json[r'image'] = this.image;
    } else {
      json[r'image'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsToolCallsCodeOutputImageObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(
        index: mapValueOfType<int>(json, r'index')!,
        type: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum.fromJson(json[r'type'])!,
        image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.fromJson(json[r'image']),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsCodeOutputImageObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsToolCallsCodeOutputImageObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsToolCallsCodeOutputImageObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsToolCallsCodeOutputImageObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'index',
    'type',
  };
}

/// Always `image`.
class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const image = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum._(r'image');

  /// List of all possible values in this [enum][RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum].
  static const values = <RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum>[
    image,
  ];

  static RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum].
class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image': return RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer] instance.
  static RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumTypeTransformer? _instance;
}


