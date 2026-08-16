//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsFileSearchObject {
  /// Returns a new [RunStepDetailsToolCallsFileSearchObject] instance.
  RunStepDetailsToolCallsFileSearchObject({
    required this.id,
    required this.type,
    required this.fileSearch,
  });

  /// The ID of the tool call object.
  String id;

  /// The type of tool call. This is always going to be `file_search` for this type of tool call.
  RunStepDetailsToolCallsFileSearchObjectTypeEnum type;

  RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsFileSearchObject &&
    other.id == id &&
    other.type == type &&
    other.fileSearch == fileSearch;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (type.hashCode) +
    (fileSearch.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsFileSearchObject[id=$id, type=$type, fileSearch=$fileSearch]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'type'] = this.type;
      json[r'file_search'] = this.fileSearch;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsFileSearchObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsFileSearchObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsFileSearchObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsFileSearchObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsFileSearchObject(
        id: mapValueOfType<String>(json, r'id')!,
        type: RunStepDetailsToolCallsFileSearchObjectTypeEnum.fromJson(json[r'type'])!,
        fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch.fromJson(json[r'file_search'])!,
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsFileSearchObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsFileSearchObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsFileSearchObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsFileSearchObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsFileSearchObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsFileSearchObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsFileSearchObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsFileSearchObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'type',
    'file_search',
  };
}

/// The type of tool call. This is always going to be `file_search` for this type of tool call.
class RunStepDetailsToolCallsFileSearchObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsFileSearchObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fileSearch = RunStepDetailsToolCallsFileSearchObjectTypeEnum._(r'file_search');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsFileSearchObjectTypeEnum].
  static const values = <RunStepDetailsToolCallsFileSearchObjectTypeEnum>[
    fileSearch,
  ];

  static RunStepDetailsToolCallsFileSearchObjectTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsFileSearchObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsFileSearchObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsFileSearchObjectTypeEnum].
class RunStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsFileSearchObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsFileSearchObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsFileSearchObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_search': return RunStepDetailsToolCallsFileSearchObjectTypeEnum.fileSearch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsFileSearchObjectTypeEnumTypeTransformer? _instance;
}


