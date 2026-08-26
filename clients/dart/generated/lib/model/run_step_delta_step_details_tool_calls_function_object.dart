//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsToolCallsFunctionObject {
  /// Returns a new [RunStepDeltaStepDetailsToolCallsFunctionObject] instance.
  RunStepDeltaStepDetailsToolCallsFunctionObject({
    required this.index,
    this.id,
    required this.type,
    this.function_,
  });

  /// The index of the tool call in the tool calls array.
  int index;

  /// The ID of the tool call object.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The type of tool call. This is always going to be `function` for this type of tool call.
  RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction? function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsToolCallsFunctionObject &&
    other.index == index &&
    other.id == id &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (type.hashCode) +
    (function_ == null ? 0 : function_!.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsToolCallsFunctionObject[index=$index, id=$id, type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'type'] = this.type;
    if (this.function_ != null) {
      json[r'function'] = this.function_;
    } else {
      json[r'function'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsToolCallsFunctionObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsToolCallsFunctionObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'index'), 'Required key "RunStepDeltaStepDetailsToolCallsFunctionObject[index]" is missing from JSON.');
        assert(json[r'index'] != null, 'Required key "RunStepDeltaStepDetailsToolCallsFunctionObject[index]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "RunStepDeltaStepDetailsToolCallsFunctionObject[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RunStepDeltaStepDetailsToolCallsFunctionObject[type]" has a null value in JSON.');
        return true;
      }());

      return RunStepDeltaStepDetailsToolCallsFunctionObject(
        index: mapValueOfType<int>(json, r'index')!,
        id: mapValueOfType<String>(json, r'id'),
        type: RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum.fromJson(json[r'type'])!,
        function_: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.fromJson(json[r'function']),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsToolCallsFunctionObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsFunctionObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsFunctionObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsToolCallsFunctionObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsToolCallsFunctionObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsToolCallsFunctionObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsToolCallsFunctionObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsToolCallsFunctionObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsToolCallsFunctionObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsToolCallsFunctionObject.listFromJson(entry.value, growable: growable,);
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

/// The type of tool call. This is always going to be `function` for this type of tool call.
enum RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum {
  function_._(r'function'),
  ;

  /// Instantiate a new enum with the provided value.
  const RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum].
class RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum data) => data._value;

  /// Returns the instance of [RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'function': return RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer? _instance;
}


