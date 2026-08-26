//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateThreadAndRunRequestToolsInner {
  /// Returns a new [CreateThreadAndRunRequestToolsInner] instance.
  CreateThreadAndRunRequestToolsInner({
    required this.type,
    this.fileSearch,
    required this.function_,
  });

  /// The type of tool being defined: `code_interpreter`
  CreateThreadAndRunRequestToolsInnerTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssistantToolsFileSearchFileSearch? fileSearch;

  FunctionObject function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateThreadAndRunRequestToolsInner &&
    other.type == type &&
    other.fileSearch == fileSearch &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (fileSearch == null ? 0 : fileSearch!.hashCode) +
    (function_.hashCode);

  @override
  String toString() => 'CreateThreadAndRunRequestToolsInner[type=$type, fileSearch=$fileSearch, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.fileSearch != null) {
      json[r'file_search'] = this.fileSearch;
    } else {
      json[r'file_search'] = null;
    }
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [CreateThreadAndRunRequestToolsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateThreadAndRunRequestToolsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'type'), 'Required key "CreateThreadAndRunRequestToolsInner[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "CreateThreadAndRunRequestToolsInner[type]" has a null value in JSON.');
        assert(json.containsKey(r'function'), 'Required key "CreateThreadAndRunRequestToolsInner[function]" is missing from JSON.');
        assert(json[r'function'] != null, 'Required key "CreateThreadAndRunRequestToolsInner[function]" has a null value in JSON.');
        return true;
      }());

      return CreateThreadAndRunRequestToolsInner(
        type: CreateThreadAndRunRequestToolsInnerTypeEnum.fromJson(json[r'type'])!,
        fileSearch: AssistantToolsFileSearchFileSearch.fromJson(json[r'file_search']),
        function_: FunctionObject.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<CreateThreadAndRunRequestToolsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateThreadAndRunRequestToolsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateThreadAndRunRequestToolsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateThreadAndRunRequestToolsInner> mapFromJson(dynamic json) {
    final map = <String, CreateThreadAndRunRequestToolsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateThreadAndRunRequestToolsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateThreadAndRunRequestToolsInner-objects as value to a dart map
  static Map<String, List<CreateThreadAndRunRequestToolsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateThreadAndRunRequestToolsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateThreadAndRunRequestToolsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'function',
  };
}

/// The type of tool being defined: `code_interpreter`
enum CreateThreadAndRunRequestToolsInnerTypeEnum {
  codeInterpreter._(r'code_interpreter'),
  fileSearch._(r'file_search'),
  function_._(r'function'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateThreadAndRunRequestToolsInnerTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateThreadAndRunRequestToolsInnerTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateThreadAndRunRequestToolsInnerTypeEnum? fromJson(dynamic value) => CreateThreadAndRunRequestToolsInnerTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateThreadAndRunRequestToolsInnerTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateThreadAndRunRequestToolsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateThreadAndRunRequestToolsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateThreadAndRunRequestToolsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateThreadAndRunRequestToolsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [CreateThreadAndRunRequestToolsInnerTypeEnum].
class CreateThreadAndRunRequestToolsInnerTypeEnumTypeTransformer {
  factory CreateThreadAndRunRequestToolsInnerTypeEnumTypeTransformer() => _instance ??= const CreateThreadAndRunRequestToolsInnerTypeEnumTypeTransformer._();

  const CreateThreadAndRunRequestToolsInnerTypeEnumTypeTransformer._();

  String encode(CreateThreadAndRunRequestToolsInnerTypeEnum data) => data._value;

  /// Returns the instance of [CreateThreadAndRunRequestToolsInnerTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateThreadAndRunRequestToolsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateThreadAndRunRequestToolsInnerTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'code_interpreter': return CreateThreadAndRunRequestToolsInnerTypeEnum.codeInterpreter;
        case r'file_search': return CreateThreadAndRunRequestToolsInnerTypeEnum.fileSearch;
        case r'function': return CreateThreadAndRunRequestToolsInnerTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateThreadAndRunRequestToolsInnerTypeEnumTypeTransformer? _instance;
}


