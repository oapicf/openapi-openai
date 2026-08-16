//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsToolCallsObject {
  /// Returns a new [RunStepDeltaStepDetailsToolCallsObject] instance.
  RunStepDeltaStepDetailsToolCallsObject({
    required this.type,
    this.toolCalls = const [],
  });

  /// Always `tool_calls`.
  RunStepDeltaStepDetailsToolCallsObjectTypeEnum type;

  /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsToolCallsObject &&
    other.type == type &&
    _deepEquality.equals(other.toolCalls, toolCalls);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (toolCalls.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsToolCallsObject[type=$type, toolCalls=$toolCalls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'tool_calls'] = this.toolCalls;
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsToolCallsObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsToolCallsObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsToolCallsObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsToolCallsObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsToolCallsObject(
        type: RunStepDeltaStepDetailsToolCallsObjectTypeEnum.fromJson(json[r'type'])!,
        toolCalls: RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.listFromJson(json[r'tool_calls']),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsToolCallsObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsToolCallsObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsToolCallsObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsToolCallsObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsToolCallsObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsToolCallsObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsToolCallsObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsToolCallsObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// Always `tool_calls`.
class RunStepDeltaStepDetailsToolCallsObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaStepDetailsToolCallsObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const toolCalls = RunStepDeltaStepDetailsToolCallsObjectTypeEnum._(r'tool_calls');

  /// List of all possible values in this [enum][RunStepDeltaStepDetailsToolCallsObjectTypeEnum].
  static const values = <RunStepDeltaStepDetailsToolCallsObjectTypeEnum>[
    toolCalls,
  ];

  static RunStepDeltaStepDetailsToolCallsObjectTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsToolCallsObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaStepDetailsToolCallsObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsToolCallsObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsToolCallsObjectTypeEnum].
class RunStepDeltaStepDetailsToolCallsObjectTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsToolCallsObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsToolCallsObjectTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsToolCallsObjectTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsToolCallsObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaStepDetailsToolCallsObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsToolCallsObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'tool_calls': return RunStepDeltaStepDetailsToolCallsObjectTypeEnum.toolCalls;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaStepDetailsToolCallsObjectTypeEnumTypeTransformer] instance.
  static RunStepDeltaStepDetailsToolCallsObjectTypeEnumTypeTransformer? _instance;
}


