//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantsNamedToolChoice {
  /// Returns a new [AssistantsNamedToolChoice] instance.
  AssistantsNamedToolChoice({
    required this.type,
    this.function_,
  });

  /// The type of the tool. If type is `function`, the function name must be set
  AssistantsNamedToolChoiceTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssistantsNamedToolChoiceFunction? function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantsNamedToolChoice &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (function_ == null ? 0 : function_!.hashCode);

  @override
  String toString() => 'AssistantsNamedToolChoice[type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.function_ != null) {
      json[r'function'] = this.function_;
    } else {
      json[r'function'] = null;
    }
    return json;
  }

  /// Returns a new [AssistantsNamedToolChoice] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantsNamedToolChoice? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssistantsNamedToolChoice[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssistantsNamedToolChoice[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssistantsNamedToolChoice(
        type: AssistantsNamedToolChoiceTypeEnum.fromJson(json[r'type'])!,
        function_: AssistantsNamedToolChoiceFunction.fromJson(json[r'function']),
      );
    }
    return null;
  }

  static List<AssistantsNamedToolChoice> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantsNamedToolChoice>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantsNamedToolChoice.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantsNamedToolChoice> mapFromJson(dynamic json) {
    final map = <String, AssistantsNamedToolChoice>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantsNamedToolChoice.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantsNamedToolChoice-objects as value to a dart map
  static Map<String, List<AssistantsNamedToolChoice>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantsNamedToolChoice>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantsNamedToolChoice.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The type of the tool. If type is `function`, the function name must be set
class AssistantsNamedToolChoiceTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AssistantsNamedToolChoiceTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = AssistantsNamedToolChoiceTypeEnum._(r'function');
  static const codeInterpreter = AssistantsNamedToolChoiceTypeEnum._(r'code_interpreter');
  static const fileSearch = AssistantsNamedToolChoiceTypeEnum._(r'file_search');

  /// List of all possible values in this [enum][AssistantsNamedToolChoiceTypeEnum].
  static const values = <AssistantsNamedToolChoiceTypeEnum>[
    function_,
    codeInterpreter,
    fileSearch,
  ];

  static AssistantsNamedToolChoiceTypeEnum? fromJson(dynamic value) => AssistantsNamedToolChoiceTypeEnumTypeTransformer().decode(value);

  static List<AssistantsNamedToolChoiceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantsNamedToolChoiceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantsNamedToolChoiceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantsNamedToolChoiceTypeEnum] to String,
/// and [decode] dynamic data back to [AssistantsNamedToolChoiceTypeEnum].
class AssistantsNamedToolChoiceTypeEnumTypeTransformer {
  factory AssistantsNamedToolChoiceTypeEnumTypeTransformer() => _instance ??= const AssistantsNamedToolChoiceTypeEnumTypeTransformer._();

  const AssistantsNamedToolChoiceTypeEnumTypeTransformer._();

  String encode(AssistantsNamedToolChoiceTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AssistantsNamedToolChoiceTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantsNamedToolChoiceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return AssistantsNamedToolChoiceTypeEnum.function_;
        case r'code_interpreter': return AssistantsNamedToolChoiceTypeEnum.codeInterpreter;
        case r'file_search': return AssistantsNamedToolChoiceTypeEnum.fileSearch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AssistantsNamedToolChoiceTypeEnumTypeTransformer] instance.
  static AssistantsNamedToolChoiceTypeEnumTypeTransformer? _instance;
}


