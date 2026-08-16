//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsObject {
  /// Returns a new [RunStepDetailsToolCallsObject] instance.
  RunStepDetailsToolCallsObject({
    required this.type,
    this.toolCalls = const [],
  });

  /// Always `tool_calls`.
  RunStepDetailsToolCallsObjectTypeEnum type;

  /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsObject &&
    other.type == type &&
    _deepEquality.equals(other.toolCalls, toolCalls);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (toolCalls.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsObject[type=$type, toolCalls=$toolCalls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'tool_calls'] = this.toolCalls;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsObject(
        type: RunStepDetailsToolCallsObjectTypeEnum.fromJson(json[r'type'])!,
        toolCalls: RunStepDetailsToolCallsObjectToolCallsInner.listFromJson(json[r'tool_calls']),
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'tool_calls',
  };
}

/// Always `tool_calls`.
class RunStepDetailsToolCallsObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const toolCalls = RunStepDetailsToolCallsObjectTypeEnum._(r'tool_calls');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsObjectTypeEnum].
  static const values = <RunStepDetailsToolCallsObjectTypeEnum>[
    toolCalls,
  ];

  static RunStepDetailsToolCallsObjectTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsObjectTypeEnum].
class RunStepDetailsToolCallsObjectTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsObjectTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsObjectTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'tool_calls': return RunStepDetailsToolCallsObjectTypeEnum.toolCalls;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsObjectTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsObjectTypeEnumTypeTransformer? _instance;
}


