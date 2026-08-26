//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantToolsCode {
  /// Returns a new [AssistantToolsCode] instance.
  AssistantToolsCode({
    required this.type,
  });

  /// The type of tool being defined: `code_interpreter`
  AssistantToolsCodeTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantToolsCode &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode);

  @override
  String toString() => 'AssistantToolsCode[type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [AssistantToolsCode] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantToolsCode? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'type'), 'Required key "AssistantToolsCode[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "AssistantToolsCode[type]" has a null value in JSON.');
        return true;
      }());

      return AssistantToolsCode(
        type: AssistantToolsCodeTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<AssistantToolsCode> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantToolsCode>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantToolsCode.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantToolsCode> mapFromJson(dynamic json) {
    final map = <String, AssistantToolsCode>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantToolsCode.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantToolsCode-objects as value to a dart map
  static Map<String, List<AssistantToolsCode>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantToolsCode>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantToolsCode.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The type of tool being defined: `code_interpreter`
enum AssistantToolsCodeTypeEnum {
  codeInterpreter._(r'code_interpreter'),
  ;

  /// Instantiate a new enum with the provided value.
  const AssistantToolsCodeTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AssistantToolsCodeTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AssistantToolsCodeTypeEnum? fromJson(dynamic value) => AssistantToolsCodeTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AssistantToolsCodeTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AssistantToolsCodeTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantToolsCodeTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantToolsCodeTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantToolsCodeTypeEnum] to String,
/// and [decode] dynamic data back to [AssistantToolsCodeTypeEnum].
class AssistantToolsCodeTypeEnumTypeTransformer {
  factory AssistantToolsCodeTypeEnumTypeTransformer() => _instance ??= const AssistantToolsCodeTypeEnumTypeTransformer._();

  const AssistantToolsCodeTypeEnumTypeTransformer._();

  String encode(AssistantToolsCodeTypeEnum data) => data._value;

  /// Returns the instance of [AssistantToolsCodeTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantToolsCodeTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is AssistantToolsCodeTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'code_interpreter': return AssistantToolsCodeTypeEnum.codeInterpreter;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AssistantToolsCodeTypeEnumTypeTransformer? _instance;
}


