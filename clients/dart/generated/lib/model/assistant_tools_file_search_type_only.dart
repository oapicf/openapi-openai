//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantToolsFileSearchTypeOnly {
  /// Returns a new [AssistantToolsFileSearchTypeOnly] instance.
  AssistantToolsFileSearchTypeOnly({
    required this.type,
  });

  /// The type of tool being defined: `file_search`
  AssistantToolsFileSearchTypeOnlyTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantToolsFileSearchTypeOnly &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode);

  @override
  String toString() => 'AssistantToolsFileSearchTypeOnly[type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [AssistantToolsFileSearchTypeOnly] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantToolsFileSearchTypeOnly? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssistantToolsFileSearchTypeOnly[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssistantToolsFileSearchTypeOnly[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssistantToolsFileSearchTypeOnly(
        type: AssistantToolsFileSearchTypeOnlyTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<AssistantToolsFileSearchTypeOnly> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantToolsFileSearchTypeOnly>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantToolsFileSearchTypeOnly.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantToolsFileSearchTypeOnly> mapFromJson(dynamic json) {
    final map = <String, AssistantToolsFileSearchTypeOnly>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantToolsFileSearchTypeOnly.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantToolsFileSearchTypeOnly-objects as value to a dart map
  static Map<String, List<AssistantToolsFileSearchTypeOnly>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantToolsFileSearchTypeOnly>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantToolsFileSearchTypeOnly.listFromJson(entry.value, growable: growable,);
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
class AssistantToolsFileSearchTypeOnlyTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AssistantToolsFileSearchTypeOnlyTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fileSearch = AssistantToolsFileSearchTypeOnlyTypeEnum._(r'file_search');

  /// List of all possible values in this [enum][AssistantToolsFileSearchTypeOnlyTypeEnum].
  static const values = <AssistantToolsFileSearchTypeOnlyTypeEnum>[
    fileSearch,
  ];

  static AssistantToolsFileSearchTypeOnlyTypeEnum? fromJson(dynamic value) => AssistantToolsFileSearchTypeOnlyTypeEnumTypeTransformer().decode(value);

  static List<AssistantToolsFileSearchTypeOnlyTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantToolsFileSearchTypeOnlyTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantToolsFileSearchTypeOnlyTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantToolsFileSearchTypeOnlyTypeEnum] to String,
/// and [decode] dynamic data back to [AssistantToolsFileSearchTypeOnlyTypeEnum].
class AssistantToolsFileSearchTypeOnlyTypeEnumTypeTransformer {
  factory AssistantToolsFileSearchTypeOnlyTypeEnumTypeTransformer() => _instance ??= const AssistantToolsFileSearchTypeOnlyTypeEnumTypeTransformer._();

  const AssistantToolsFileSearchTypeOnlyTypeEnumTypeTransformer._();

  String encode(AssistantToolsFileSearchTypeOnlyTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AssistantToolsFileSearchTypeOnlyTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantToolsFileSearchTypeOnlyTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_search': return AssistantToolsFileSearchTypeOnlyTypeEnum.fileSearch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AssistantToolsFileSearchTypeOnlyTypeEnumTypeTransformer] instance.
  static AssistantToolsFileSearchTypeOnlyTypeEnumTypeTransformer? _instance;
}


