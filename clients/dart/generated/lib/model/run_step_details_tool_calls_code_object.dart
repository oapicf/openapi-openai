//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsCodeObject {
  /// Returns a new [RunStepDetailsToolCallsCodeObject] instance.
  RunStepDetailsToolCallsCodeObject({
    required this.id,
    required this.type,
    required this.codeInterpreter,
  });

  /// The ID of the tool call.
  String id;

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  RunStepDetailsToolCallsCodeObjectTypeEnum type;

  RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsCodeObject &&
    other.id == id &&
    other.type == type &&
    other.codeInterpreter == codeInterpreter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (type.hashCode) +
    (codeInterpreter.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsCodeObject[id=$id, type=$type, codeInterpreter=$codeInterpreter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'type'] = this.type;
      json[r'code_interpreter'] = this.codeInterpreter;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsCodeObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsCodeObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsCodeObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsCodeObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsCodeObject(
        id: mapValueOfType<String>(json, r'id')!,
        type: RunStepDetailsToolCallsCodeObjectTypeEnum.fromJson(json[r'type'])!,
        codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(json[r'code_interpreter'])!,
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsCodeObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsCodeObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsCodeObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsCodeObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsCodeObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsCodeObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsCodeObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsCodeObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'type',
    'code_interpreter',
  };
}

/// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
class RunStepDetailsToolCallsCodeObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsCodeObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const codeInterpreter = RunStepDetailsToolCallsCodeObjectTypeEnum._(r'code_interpreter');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsCodeObjectTypeEnum].
  static const values = <RunStepDetailsToolCallsCodeObjectTypeEnum>[
    codeInterpreter,
  ];

  static RunStepDetailsToolCallsCodeObjectTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsCodeObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsCodeObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsCodeObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsCodeObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsCodeObjectTypeEnum].
class RunStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsCodeObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsCodeObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsCodeObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'code_interpreter': return RunStepDetailsToolCallsCodeObjectTypeEnum.codeInterpreter;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer? _instance;
}


