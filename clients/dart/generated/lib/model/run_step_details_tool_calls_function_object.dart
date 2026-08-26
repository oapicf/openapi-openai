//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsFunctionObject {
  /// Returns a new [RunStepDetailsToolCallsFunctionObject] instance.
  RunStepDetailsToolCallsFunctionObject({
    required this.id,
    required this.type,
    required this.function_,
  });

  /// The ID of the tool call object.
  String id;

  /// The type of tool call. This is always going to be `function` for this type of tool call.
  RunStepDetailsToolCallsFunctionObjectTypeEnum type;

  RunStepDetailsToolCallsFunctionObjectFunction function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsFunctionObject &&
    other.id == id &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (type.hashCode) +
    (function_.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsFunctionObject[id=$id, type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'type'] = this.type;
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsFunctionObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsFunctionObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "RunStepDetailsToolCallsFunctionObject[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "RunStepDetailsToolCallsFunctionObject[id]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "RunStepDetailsToolCallsFunctionObject[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RunStepDetailsToolCallsFunctionObject[type]" has a null value in JSON.');
        assert(json.containsKey(r'function'), 'Required key "RunStepDetailsToolCallsFunctionObject[function]" is missing from JSON.');
        assert(json[r'function'] != null, 'Required key "RunStepDetailsToolCallsFunctionObject[function]" has a null value in JSON.');
        return true;
      }());

      return RunStepDetailsToolCallsFunctionObject(
        id: mapValueOfType<String>(json, r'id')!,
        type: RunStepDetailsToolCallsFunctionObjectTypeEnum.fromJson(json[r'type'])!,
        function_: RunStepDetailsToolCallsFunctionObjectFunction.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsFunctionObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFunctionObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFunctionObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsFunctionObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsFunctionObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsFunctionObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsFunctionObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsFunctionObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsFunctionObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsFunctionObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'type',
    'function',
  };
}

/// The type of tool call. This is always going to be `function` for this type of tool call.
enum RunStepDetailsToolCallsFunctionObjectTypeEnum {
  function_._(r'function'),
  ;

  /// Instantiate a new enum with the provided value.
  const RunStepDetailsToolCallsFunctionObjectTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RunStepDetailsToolCallsFunctionObjectTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RunStepDetailsToolCallsFunctionObjectTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RunStepDetailsToolCallsFunctionObjectTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RunStepDetailsToolCallsFunctionObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFunctionObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFunctionObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsFunctionObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsFunctionObjectTypeEnum].
class RunStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsFunctionObjectTypeEnum data) => data._value;

  /// Returns the instance of [RunStepDetailsToolCallsFunctionObjectTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsFunctionObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RunStepDetailsToolCallsFunctionObjectTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'function': return RunStepDetailsToolCallsFunctionObjectTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RunStepDetailsToolCallsFunctionObjectTypeEnumTypeTransformer? _instance;
}


