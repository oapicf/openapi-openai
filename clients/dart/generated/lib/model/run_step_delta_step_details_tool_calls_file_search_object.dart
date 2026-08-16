//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsToolCallsFileSearchObject {
  /// Returns a new [RunStepDeltaStepDetailsToolCallsFileSearchObject] instance.
  RunStepDeltaStepDetailsToolCallsFileSearchObject({
    required this.index,
    this.id,
    required this.type,
    required this.fileSearch,
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

  /// The type of tool call. This is always going to be `file_search` for this type of tool call.
  RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum type;

  /// For now, this is always going to be an empty object.
  Object fileSearch;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsToolCallsFileSearchObject &&
    other.index == index &&
    other.id == id &&
    other.type == type &&
    other.fileSearch == fileSearch;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (type.hashCode) +
    (fileSearch.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsToolCallsFileSearchObject[index=$index, id=$id, type=$type, fileSearch=$fileSearch]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'type'] = this.type;
      json[r'file_search'] = this.fileSearch;
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsToolCallsFileSearchObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsToolCallsFileSearchObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsToolCallsFileSearchObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsToolCallsFileSearchObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsToolCallsFileSearchObject(
        index: mapValueOfType<int>(json, r'index')!,
        id: mapValueOfType<String>(json, r'id'),
        type: RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum.fromJson(json[r'type'])!,
        fileSearch: mapValueOfType<Object>(json, r'file_search')!,
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsToolCallsFileSearchObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsFileSearchObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsFileSearchObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsToolCallsFileSearchObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsToolCallsFileSearchObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsToolCallsFileSearchObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsToolCallsFileSearchObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsToolCallsFileSearchObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsToolCallsFileSearchObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsToolCallsFileSearchObject.listFromJson(entry.value, growable: growable,);
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

/// The type of tool call. This is always going to be `file_search` for this type of tool call.
class RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fileSearch = RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum._(r'file_search');

  /// List of all possible values in this [enum][RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum].
  static const values = <RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum>[
    fileSearch,
  ];

  static RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum].
class RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_search': return RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum.fileSearch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer] instance.
  static RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer? _instance;
}


