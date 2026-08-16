//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepObjectStepDetails {
  /// Returns a new [RunStepObjectStepDetails] instance.
  RunStepObjectStepDetails({
    required this.type,
    required this.messageCreation,
    this.toolCalls = const [],
  });

  /// Always `message_creation`.
  RunStepObjectStepDetailsTypeEnum type;

  RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

  /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepObjectStepDetails &&
    other.type == type &&
    other.messageCreation == messageCreation &&
    _deepEquality.equals(other.toolCalls, toolCalls);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (messageCreation.hashCode) +
    (toolCalls.hashCode);

  @override
  String toString() => 'RunStepObjectStepDetails[type=$type, messageCreation=$messageCreation, toolCalls=$toolCalls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'message_creation'] = this.messageCreation;
      json[r'tool_calls'] = this.toolCalls;
    return json;
  }

  /// Returns a new [RunStepObjectStepDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepObjectStepDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepObjectStepDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepObjectStepDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepObjectStepDetails(
        type: RunStepObjectStepDetailsTypeEnum.fromJson(json[r'type'])!,
        messageCreation: RunStepDetailsMessageCreationObjectMessageCreation.fromJson(json[r'message_creation'])!,
        toolCalls: RunStepDetailsToolCallsObjectToolCallsInner.listFromJson(json[r'tool_calls']),
      );
    }
    return null;
  }

  static List<RunStepObjectStepDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObjectStepDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObjectStepDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepObjectStepDetails> mapFromJson(dynamic json) {
    final map = <String, RunStepObjectStepDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepObjectStepDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepObjectStepDetails-objects as value to a dart map
  static Map<String, List<RunStepObjectStepDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepObjectStepDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepObjectStepDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'message_creation',
    'tool_calls',
  };
}

/// Always `message_creation`.
class RunStepObjectStepDetailsTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepObjectStepDetailsTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const messageCreation = RunStepObjectStepDetailsTypeEnum._(r'message_creation');
  static const toolCalls = RunStepObjectStepDetailsTypeEnum._(r'tool_calls');

  /// List of all possible values in this [enum][RunStepObjectStepDetailsTypeEnum].
  static const values = <RunStepObjectStepDetailsTypeEnum>[
    messageCreation,
    toolCalls,
  ];

  static RunStepObjectStepDetailsTypeEnum? fromJson(dynamic value) => RunStepObjectStepDetailsTypeEnumTypeTransformer().decode(value);

  static List<RunStepObjectStepDetailsTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObjectStepDetailsTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObjectStepDetailsTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepObjectStepDetailsTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepObjectStepDetailsTypeEnum].
class RunStepObjectStepDetailsTypeEnumTypeTransformer {
  factory RunStepObjectStepDetailsTypeEnumTypeTransformer() => _instance ??= const RunStepObjectStepDetailsTypeEnumTypeTransformer._();

  const RunStepObjectStepDetailsTypeEnumTypeTransformer._();

  String encode(RunStepObjectStepDetailsTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepObjectStepDetailsTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepObjectStepDetailsTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'message_creation': return RunStepObjectStepDetailsTypeEnum.messageCreation;
        case r'tool_calls': return RunStepObjectStepDetailsTypeEnum.toolCalls;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepObjectStepDetailsTypeEnumTypeTransformer] instance.
  static RunStepObjectStepDetailsTypeEnumTypeTransformer? _instance;
}


