//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsToolCallsCodeObject {
  /// Returns a new [RunStepDeltaStepDetailsToolCallsCodeObject] instance.
  RunStepDeltaStepDetailsToolCallsCodeObject({
    required this.index,
    this.id,
    required this.type,
    this.codeInterpreter,
  });

  /// The index of the tool call in the tool calls array.
  int index;

  /// The ID of the tool call.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? codeInterpreter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsToolCallsCodeObject &&
    other.index == index &&
    other.id == id &&
    other.type == type &&
    other.codeInterpreter == codeInterpreter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (type.hashCode) +
    (codeInterpreter == null ? 0 : codeInterpreter!.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsToolCallsCodeObject[index=$index, id=$id, type=$type, codeInterpreter=$codeInterpreter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'type'] = this.type;
    if (this.codeInterpreter != null) {
      json[r'code_interpreter'] = this.codeInterpreter;
    } else {
      json[r'code_interpreter'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsToolCallsCodeObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsToolCallsCodeObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsToolCallsCodeObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsToolCallsCodeObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsToolCallsCodeObject(
        index: mapValueOfType<int>(json, r'index')!,
        id: mapValueOfType<String>(json, r'id'),
        type: RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum.fromJson(json[r'type'])!,
        codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(json[r'code_interpreter']),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsToolCallsCodeObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsCodeObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsCodeObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsToolCallsCodeObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsToolCallsCodeObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsToolCallsCodeObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsToolCallsCodeObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsToolCallsCodeObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsToolCallsCodeObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsToolCallsCodeObject.listFromJson(entry.value, growable: growable,);
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

/// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
class RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const codeInterpreter = RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum._(r'code_interpreter');

  /// List of all possible values in this [enum][RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum].
  static const values = <RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum>[
    codeInterpreter,
  ];

  static RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum].
class RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'code_interpreter': return RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum.codeInterpreter;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer] instance.
  static RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnumTypeTransformer? _instance;
}


