//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsObjectToolCallsInner {
  /// Returns a new [RunStepDetailsToolCallsObjectToolCallsInner] instance.
  RunStepDetailsToolCallsObjectToolCallsInner({
    required this.id,
    required this.type,
    required this.codeInterpreter,
    required this.fileSearch,
    required this.function_,
  });

  /// The ID of the tool call object.
  String id;

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum type;

  RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  RunStepDetailsToolCallsFunctionObjectFunction function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsObjectToolCallsInner &&
    other.id == id &&
    other.type == type &&
    other.codeInterpreter == codeInterpreter &&
    other.fileSearch == fileSearch &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (type.hashCode) +
    (codeInterpreter.hashCode) +
    (fileSearch.hashCode) +
    (function_.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsObjectToolCallsInner[id=$id, type=$type, codeInterpreter=$codeInterpreter, fileSearch=$fileSearch, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'type'] = this.type;
      json[r'code_interpreter'] = this.codeInterpreter;
      json[r'file_search'] = this.fileSearch;
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsObjectToolCallsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsObjectToolCallsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsObjectToolCallsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsObjectToolCallsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsObjectToolCallsInner(
        id: mapValueOfType<String>(json, r'id')!,
        type: RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum.fromJson(json[r'type'])!,
        codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(json[r'code_interpreter'])!,
        fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch.fromJson(json[r'file_search'])!,
        function_: RunStepDetailsToolCallsFunctionObjectFunction.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsObjectToolCallsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsObjectToolCallsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsObjectToolCallsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsObjectToolCallsInner> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsObjectToolCallsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsObjectToolCallsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsObjectToolCallsInner-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsObjectToolCallsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsObjectToolCallsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsObjectToolCallsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'type',
    'code_interpreter',
    'file_search',
    'function',
  };
}

/// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
class RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const codeInterpreter = RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(r'code_interpreter');
  static const fileSearch = RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(r'file_search');
  static const function_ = RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(r'function');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum].
  static const values = <RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum>[
    codeInterpreter,
    fileSearch,
    function_,
  ];

  static RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum].
class RunStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'code_interpreter': return RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum.codeInterpreter;
        case r'file_search': return RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum.fileSearch;
        case r'function': return RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer? _instance;
}


