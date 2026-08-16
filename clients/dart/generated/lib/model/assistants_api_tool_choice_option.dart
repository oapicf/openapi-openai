//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantsApiToolChoiceOption {
  /// Returns a new [AssistantsApiToolChoiceOption] instance.
  AssistantsApiToolChoiceOption({
    required this.type,
    this.function_,
  });

  /// The type of the tool. If type is `function`, the function name must be set
  AssistantsApiToolChoiceOptionTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssistantsNamedToolChoiceFunction? function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantsApiToolChoiceOption &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (function_ == null ? 0 : function_!.hashCode);

  @override
  String toString() => 'AssistantsApiToolChoiceOption[type=$type, function_=$function_]';

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

  /// Returns a new [AssistantsApiToolChoiceOption] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantsApiToolChoiceOption? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssistantsApiToolChoiceOption[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssistantsApiToolChoiceOption[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssistantsApiToolChoiceOption(
        type: AssistantsApiToolChoiceOptionTypeEnum.fromJson(json[r'type'])!,
        function_: AssistantsNamedToolChoiceFunction.fromJson(json[r'function']),
      );
    }
    return null;
  }

  static List<AssistantsApiToolChoiceOption> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantsApiToolChoiceOption>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantsApiToolChoiceOption.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantsApiToolChoiceOption> mapFromJson(dynamic json) {
    final map = <String, AssistantsApiToolChoiceOption>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantsApiToolChoiceOption.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantsApiToolChoiceOption-objects as value to a dart map
  static Map<String, List<AssistantsApiToolChoiceOption>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantsApiToolChoiceOption>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantsApiToolChoiceOption.listFromJson(entry.value, growable: growable,);
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
class AssistantsApiToolChoiceOptionTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AssistantsApiToolChoiceOptionTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = AssistantsApiToolChoiceOptionTypeEnum._(r'function');
  static const codeInterpreter = AssistantsApiToolChoiceOptionTypeEnum._(r'code_interpreter');
  static const fileSearch = AssistantsApiToolChoiceOptionTypeEnum._(r'file_search');

  /// List of all possible values in this [enum][AssistantsApiToolChoiceOptionTypeEnum].
  static const values = <AssistantsApiToolChoiceOptionTypeEnum>[
    function_,
    codeInterpreter,
    fileSearch,
  ];

  static AssistantsApiToolChoiceOptionTypeEnum? fromJson(dynamic value) => AssistantsApiToolChoiceOptionTypeEnumTypeTransformer().decode(value);

  static List<AssistantsApiToolChoiceOptionTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantsApiToolChoiceOptionTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantsApiToolChoiceOptionTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantsApiToolChoiceOptionTypeEnum] to String,
/// and [decode] dynamic data back to [AssistantsApiToolChoiceOptionTypeEnum].
class AssistantsApiToolChoiceOptionTypeEnumTypeTransformer {
  factory AssistantsApiToolChoiceOptionTypeEnumTypeTransformer() => _instance ??= const AssistantsApiToolChoiceOptionTypeEnumTypeTransformer._();

  const AssistantsApiToolChoiceOptionTypeEnumTypeTransformer._();

  String encode(AssistantsApiToolChoiceOptionTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AssistantsApiToolChoiceOptionTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantsApiToolChoiceOptionTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return AssistantsApiToolChoiceOptionTypeEnum.function_;
        case r'code_interpreter': return AssistantsApiToolChoiceOptionTypeEnum.codeInterpreter;
        case r'file_search': return AssistantsApiToolChoiceOptionTypeEnum.fileSearch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AssistantsApiToolChoiceOptionTypeEnumTypeTransformer] instance.
  static AssistantsApiToolChoiceOptionTypeEnumTypeTransformer? _instance;
}


