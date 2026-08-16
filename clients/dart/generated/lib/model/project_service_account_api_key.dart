//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectServiceAccountApiKey {
  /// Returns a new [ProjectServiceAccountApiKey] instance.
  ProjectServiceAccountApiKey({
    required this.object,
    required this.value,
    required this.name,
    required this.createdAt,
    required this.id,
  });

  /// The object type, which is always `organization.project.service_account.api_key`
  ProjectServiceAccountApiKeyObjectEnum object;

  String value;

  String name;

  int createdAt;

  String id;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectServiceAccountApiKey &&
    other.object == object &&
    other.value == value &&
    other.name == name &&
    other.createdAt == createdAt &&
    other.id == id;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (value.hashCode) +
    (name.hashCode) +
    (createdAt.hashCode) +
    (id.hashCode);

  @override
  String toString() => 'ProjectServiceAccountApiKey[object=$object, value=$value, name=$name, createdAt=$createdAt, id=$id]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'value'] = this.value;
      json[r'name'] = this.name;
      json[r'created_at'] = this.createdAt;
      json[r'id'] = this.id;
    return json;
  }

  /// Returns a new [ProjectServiceAccountApiKey] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectServiceAccountApiKey? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectServiceAccountApiKey[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectServiceAccountApiKey[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectServiceAccountApiKey(
        object: ProjectServiceAccountApiKeyObjectEnum.fromJson(json[r'object'])!,
        value: mapValueOfType<String>(json, r'value')!,
        name: mapValueOfType<String>(json, r'name')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        id: mapValueOfType<String>(json, r'id')!,
      );
    }
    return null;
  }

  static List<ProjectServiceAccountApiKey> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountApiKey>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountApiKey.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectServiceAccountApiKey> mapFromJson(dynamic json) {
    final map = <String, ProjectServiceAccountApiKey>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectServiceAccountApiKey.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectServiceAccountApiKey-objects as value to a dart map
  static Map<String, List<ProjectServiceAccountApiKey>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectServiceAccountApiKey>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectServiceAccountApiKey.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'value',
    'name',
    'created_at',
    'id',
  };
}

/// The object type, which is always `organization.project.service_account.api_key`
class ProjectServiceAccountApiKeyObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectServiceAccountApiKeyObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProjectPeriodServiceAccountPeriodApiKey = ProjectServiceAccountApiKeyObjectEnum._(r'organization.project.service_account.api_key');

  /// List of all possible values in this [enum][ProjectServiceAccountApiKeyObjectEnum].
  static const values = <ProjectServiceAccountApiKeyObjectEnum>[
    organizationPeriodProjectPeriodServiceAccountPeriodApiKey,
  ];

  static ProjectServiceAccountApiKeyObjectEnum? fromJson(dynamic value) => ProjectServiceAccountApiKeyObjectEnumTypeTransformer().decode(value);

  static List<ProjectServiceAccountApiKeyObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountApiKeyObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountApiKeyObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectServiceAccountApiKeyObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectServiceAccountApiKeyObjectEnum].
class ProjectServiceAccountApiKeyObjectEnumTypeTransformer {
  factory ProjectServiceAccountApiKeyObjectEnumTypeTransformer() => _instance ??= const ProjectServiceAccountApiKeyObjectEnumTypeTransformer._();

  const ProjectServiceAccountApiKeyObjectEnumTypeTransformer._();

  String encode(ProjectServiceAccountApiKeyObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectServiceAccountApiKeyObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountApiKeyObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project.service_account.api_key': return ProjectServiceAccountApiKeyObjectEnum.organizationPeriodProjectPeriodServiceAccountPeriodApiKey;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectServiceAccountApiKeyObjectEnumTypeTransformer] instance.
  static ProjectServiceAccountApiKeyObjectEnumTypeTransformer? _instance;
}


