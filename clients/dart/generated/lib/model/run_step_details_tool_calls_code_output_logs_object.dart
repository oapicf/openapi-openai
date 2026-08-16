//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsCodeOutputLogsObject {
  /// Returns a new [RunStepDetailsToolCallsCodeOutputLogsObject] instance.
  RunStepDetailsToolCallsCodeOutputLogsObject({
    required this.type,
    required this.logs,
  });

  /// Always `logs`.
  RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum type;

  /// The text output from the Code Interpreter tool call.
  String logs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsCodeOutputLogsObject &&
    other.type == type &&
    other.logs == logs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (logs.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsCodeOutputLogsObject[type=$type, logs=$logs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'logs'] = this.logs;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsCodeOutputLogsObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsCodeOutputLogsObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsCodeOutputLogsObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsCodeOutputLogsObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsCodeOutputLogsObject(
        type: RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.fromJson(json[r'type'])!,
        logs: mapValueOfType<String>(json, r'logs')!,
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsCodeOutputLogsObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeOutputLogsObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeOutputLogsObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsCodeOutputLogsObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsCodeOutputLogsObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsCodeOutputLogsObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsCodeOutputLogsObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsCodeOutputLogsObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsCodeOutputLogsObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsCodeOutputLogsObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'logs',
  };
}

/// Always `logs`.
class RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const logs = RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum._(r'logs');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum].
  static const values = <RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum>[
    logs,
  ];

  static RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum].
class RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'logs': return RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum.logs;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnumTypeTransformer? _instance;
}


