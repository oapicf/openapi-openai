//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
  /// Returns a new [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] instance.
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject({
    required this.index,
    required this.type,
    this.logs,
  });

  /// The index of the output in the outputs array.
  int index;

  /// Always `logs`.
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum type;

  /// The text output from the Code Interpreter tool call.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? logs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject &&
    other.index == index &&
    other.type == type &&
    other.logs == logs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (logs == null ? 0 : logs!.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject[index=$index, type=$type, logs=$logs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.logs != null) {
      json[r'logs'] = this.logs;
    } else {
      json[r'logs'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(
        index: mapValueOfType<int>(json, r'index')!,
        type: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.fromJson(json[r'type'])!,
        logs: mapValueOfType<String>(json, r'logs'),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.listFromJson(entry.value, growable: growable,);
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

/// Always `logs`.
class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const logs = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum._(r'logs');

  /// List of all possible values in this [enum][RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum].
  static const values = <RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum>[
    logs,
  ];

  static RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum].
class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'logs': return RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.logs;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer] instance.
  static RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer? _instance;
}


