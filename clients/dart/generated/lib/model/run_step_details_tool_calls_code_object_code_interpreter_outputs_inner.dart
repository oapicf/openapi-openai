//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  /// Returns a new [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] instance.
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner({
    required this.type,
    required this.logs,
    required this.image,
  });

  /// Always `logs`.
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum type;

  /// The text output from the Code Interpreter tool call.
  String logs;

  RunStepDetailsToolCallsCodeOutputImageObjectImage image;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner &&
    other.type == type &&
    other.logs == logs &&
    other.image == image;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (logs.hashCode) +
    (image.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[type=$type, logs=$logs, image=$image]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'logs'] = this.logs;
      json[r'image'] = this.image;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
        type: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum.fromJson(json[r'type'])!,
        logs: mapValueOfType<String>(json, r'logs')!,
        image: RunStepDetailsToolCallsCodeOutputImageObjectImage.fromJson(json[r'image'])!,
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'logs',
    'image',
  };
}

/// Always `logs`.
class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const logs = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum._(r'logs');
  static const image = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum._(r'image');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum].
  static const values = <RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum>[
    logs,
    image,
  ];

  static RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum].
class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'logs': return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum.logs;
        case r'image': return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumTypeTransformer? _instance;
}


