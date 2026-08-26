//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunToolCallObject {
  /// Returns a new [RunToolCallObject] instance.
  RunToolCallObject({
    required this.id,
    required this.type,
    required this.function_,
  });

  /// The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
  String id;

  /// The type of tool call the output is required for. For now, this is always `function`.
  RunToolCallObjectTypeEnum type;

  RunToolCallObjectFunction function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunToolCallObject &&
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
  String toString() => 'RunToolCallObject[id=$id, type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'type'] = this.type;
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [RunToolCallObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunToolCallObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "RunToolCallObject[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "RunToolCallObject[id]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "RunToolCallObject[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RunToolCallObject[type]" has a null value in JSON.');
        assert(json.containsKey(r'function'), 'Required key "RunToolCallObject[function]" is missing from JSON.');
        assert(json[r'function'] != null, 'Required key "RunToolCallObject[function]" has a null value in JSON.');
        return true;
      }());

      return RunToolCallObject(
        id: mapValueOfType<String>(json, r'id')!,
        type: RunToolCallObjectTypeEnum.fromJson(json[r'type'])!,
        function_: RunToolCallObjectFunction.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<RunToolCallObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunToolCallObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunToolCallObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunToolCallObject> mapFromJson(dynamic json) {
    final map = <String, RunToolCallObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunToolCallObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunToolCallObject-objects as value to a dart map
  static Map<String, List<RunToolCallObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunToolCallObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunToolCallObject.listFromJson(entry.value, growable: growable,);
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

/// The type of tool call the output is required for. For now, this is always `function`.
enum RunToolCallObjectTypeEnum {
  function_._(r'function'),
  ;

  /// Instantiate a new enum with the provided value.
  const RunToolCallObjectTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RunToolCallObjectTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RunToolCallObjectTypeEnum? fromJson(dynamic value) => RunToolCallObjectTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RunToolCallObjectTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RunToolCallObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunToolCallObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunToolCallObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunToolCallObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunToolCallObjectTypeEnum].
class RunToolCallObjectTypeEnumTypeTransformer {
  factory RunToolCallObjectTypeEnumTypeTransformer() => _instance ??= const RunToolCallObjectTypeEnumTypeTransformer._();

  const RunToolCallObjectTypeEnumTypeTransformer._();

  String encode(RunToolCallObjectTypeEnum data) => data._value;

  /// Returns the instance of [RunToolCallObjectTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunToolCallObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RunToolCallObjectTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'function': return RunToolCallObjectTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RunToolCallObjectTypeEnumTypeTransformer? _instance;
}


