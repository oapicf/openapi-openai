//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantToolsFileSearch {
  /// Returns a new [AssistantToolsFileSearch] instance.
  AssistantToolsFileSearch({
    required this.type,
    this.fileSearch,
  });

  /// The type of tool being defined: `file_search`
  AssistantToolsFileSearchTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssistantToolsFileSearchFileSearch? fileSearch;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantToolsFileSearch &&
    other.type == type &&
    other.fileSearch == fileSearch;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (fileSearch == null ? 0 : fileSearch!.hashCode);

  @override
  String toString() => 'AssistantToolsFileSearch[type=$type, fileSearch=$fileSearch]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.fileSearch != null) {
      json[r'file_search'] = this.fileSearch;
    } else {
      json[r'file_search'] = null;
    }
    return json;
  }

  /// Returns a new [AssistantToolsFileSearch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantToolsFileSearch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssistantToolsFileSearch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssistantToolsFileSearch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssistantToolsFileSearch(
        type: AssistantToolsFileSearchTypeEnum.fromJson(json[r'type'])!,
        fileSearch: AssistantToolsFileSearchFileSearch.fromJson(json[r'file_search']),
      );
    }
    return null;
  }

  static List<AssistantToolsFileSearch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantToolsFileSearch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantToolsFileSearch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantToolsFileSearch> mapFromJson(dynamic json) {
    final map = <String, AssistantToolsFileSearch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantToolsFileSearch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantToolsFileSearch-objects as value to a dart map
  static Map<String, List<AssistantToolsFileSearch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantToolsFileSearch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantToolsFileSearch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The type of tool being defined: `file_search`
class AssistantToolsFileSearchTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AssistantToolsFileSearchTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fileSearch = AssistantToolsFileSearchTypeEnum._(r'file_search');

  /// List of all possible values in this [enum][AssistantToolsFileSearchTypeEnum].
  static const values = <AssistantToolsFileSearchTypeEnum>[
    fileSearch,
  ];

  static AssistantToolsFileSearchTypeEnum? fromJson(dynamic value) => AssistantToolsFileSearchTypeEnumTypeTransformer().decode(value);

  static List<AssistantToolsFileSearchTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantToolsFileSearchTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantToolsFileSearchTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantToolsFileSearchTypeEnum] to String,
/// and [decode] dynamic data back to [AssistantToolsFileSearchTypeEnum].
class AssistantToolsFileSearchTypeEnumTypeTransformer {
  factory AssistantToolsFileSearchTypeEnumTypeTransformer() => _instance ??= const AssistantToolsFileSearchTypeEnumTypeTransformer._();

  const AssistantToolsFileSearchTypeEnumTypeTransformer._();

  String encode(AssistantToolsFileSearchTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AssistantToolsFileSearchTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantToolsFileSearchTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_search': return AssistantToolsFileSearchTypeEnum.fileSearch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AssistantToolsFileSearchTypeEnumTypeTransformer] instance.
  static AssistantToolsFileSearchTypeEnumTypeTransformer? _instance;
}


