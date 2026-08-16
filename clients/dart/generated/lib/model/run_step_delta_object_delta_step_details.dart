//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaObjectDeltaStepDetails {
  /// Returns a new [RunStepDeltaObjectDeltaStepDetails] instance.
  RunStepDeltaObjectDeltaStepDetails({
    required this.type,
    this.messageCreation,
    this.toolCalls = const [],
  });

  /// Always `message_creation`.
  RunStepDeltaObjectDeltaStepDetailsTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? messageCreation;

  /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaObjectDeltaStepDetails &&
    other.type == type &&
    other.messageCreation == messageCreation &&
    _deepEquality.equals(other.toolCalls, toolCalls);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (messageCreation == null ? 0 : messageCreation!.hashCode) +
    (toolCalls.hashCode);

  @override
  String toString() => 'RunStepDeltaObjectDeltaStepDetails[type=$type, messageCreation=$messageCreation, toolCalls=$toolCalls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.messageCreation != null) {
      json[r'message_creation'] = this.messageCreation;
    } else {
      json[r'message_creation'] = null;
    }
      json[r'tool_calls'] = this.toolCalls;
    return json;
  }

  /// Returns a new [RunStepDeltaObjectDeltaStepDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaObjectDeltaStepDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaObjectDeltaStepDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaObjectDeltaStepDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaObjectDeltaStepDetails(
        type: RunStepDeltaObjectDeltaStepDetailsTypeEnum.fromJson(json[r'type'])!,
        messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.fromJson(json[r'message_creation']),
        toolCalls: RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.listFromJson(json[r'tool_calls']),
      );
    }
    return null;
  }

  static List<RunStepDeltaObjectDeltaStepDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaObjectDeltaStepDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaObjectDeltaStepDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaObjectDeltaStepDetails> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaObjectDeltaStepDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaObjectDeltaStepDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaObjectDeltaStepDetails-objects as value to a dart map
  static Map<String, List<RunStepDeltaObjectDeltaStepDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaObjectDeltaStepDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaObjectDeltaStepDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// Always `message_creation`.
class RunStepDeltaObjectDeltaStepDetailsTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaObjectDeltaStepDetailsTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const messageCreation = RunStepDeltaObjectDeltaStepDetailsTypeEnum._(r'message_creation');
  static const toolCalls = RunStepDeltaObjectDeltaStepDetailsTypeEnum._(r'tool_calls');

  /// List of all possible values in this [enum][RunStepDeltaObjectDeltaStepDetailsTypeEnum].
  static const values = <RunStepDeltaObjectDeltaStepDetailsTypeEnum>[
    messageCreation,
    toolCalls,
  ];

  static RunStepDeltaObjectDeltaStepDetailsTypeEnum? fromJson(dynamic value) => RunStepDeltaObjectDeltaStepDetailsTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaObjectDeltaStepDetailsTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaObjectDeltaStepDetailsTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaObjectDeltaStepDetailsTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaObjectDeltaStepDetailsTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaObjectDeltaStepDetailsTypeEnum].
class RunStepDeltaObjectDeltaStepDetailsTypeEnumTypeTransformer {
  factory RunStepDeltaObjectDeltaStepDetailsTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaObjectDeltaStepDetailsTypeEnumTypeTransformer._();

  const RunStepDeltaObjectDeltaStepDetailsTypeEnumTypeTransformer._();

  String encode(RunStepDeltaObjectDeltaStepDetailsTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaObjectDeltaStepDetailsTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaObjectDeltaStepDetailsTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'message_creation': return RunStepDeltaObjectDeltaStepDetailsTypeEnum.messageCreation;
        case r'tool_calls': return RunStepDeltaObjectDeltaStepDetailsTypeEnum.toolCalls;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaObjectDeltaStepDetailsTypeEnumTypeTransformer] instance.
  static RunStepDeltaObjectDeltaStepDetailsTypeEnumTypeTransformer? _instance;
}


