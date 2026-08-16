//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
  /// Returns a new [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] instance.
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner({
    required this.index,
    this.id,
    required this.type,
    this.codeInterpreter,
    required this.fileSearch,
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

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? codeInterpreter;

  /// For now, this is always going to be an empty object.
  Object fileSearch;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction? function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsToolCallsObjectToolCallsInner &&
    other.index == index &&
    other.id == id &&
    other.type == type &&
    other.codeInterpreter == codeInterpreter &&
    other.fileSearch == fileSearch &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (type.hashCode) +
    (codeInterpreter == null ? 0 : codeInterpreter!.hashCode) +
    (fileSearch.hashCode) +
    (function_ == null ? 0 : function_!.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[index=$index, id=$id, type=$type, codeInterpreter=$codeInterpreter, fileSearch=$fileSearch, function_=$function_]';

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
      json[r'file_search'] = this.fileSearch;
    if (this.function_ != null) {
      json[r'function'] = this.function_;
    } else {
      json[r'function'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsToolCallsObjectToolCallsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(
        index: mapValueOfType<int>(json, r'index')!,
        id: mapValueOfType<String>(json, r'id'),
        type: RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum.fromJson(json[r'type'])!,
        codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(json[r'code_interpreter']),
        fileSearch: mapValueOfType<Object>(json, r'file_search')!,
        function_: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.fromJson(json[r'function']),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'index',
    'type',
    'file_search',
  };
}

/// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
class RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const codeInterpreter = RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(r'code_interpreter');
  static const fileSearch = RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(r'file_search');
  static const function_ = RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(r'function');

  /// List of all possible values in this [enum][RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum].
  static const values = <RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum>[
    codeInterpreter,
    fileSearch,
    function_,
  ];

  static RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum].
class RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'code_interpreter': return RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum.codeInterpreter;
        case r'file_search': return RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum.fileSearch;
        case r'function': return RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer] instance.
  static RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumTypeTransformer? _instance;
}


