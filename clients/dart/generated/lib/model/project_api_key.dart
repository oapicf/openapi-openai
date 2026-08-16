//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectApiKey {
  /// Returns a new [ProjectApiKey] instance.
  ProjectApiKey({
    required this.object,
    required this.redactedValue,
    required this.name,
    required this.createdAt,
    required this.id,
    required this.owner,
  });

  /// The object type, which is always `organization.project.api_key`
  ProjectApiKeyObjectEnum object;

  /// The redacted value of the API key
  String redactedValue;

  /// The name of the API key
  String name;

  /// The Unix timestamp (in seconds) of when the API key was created
  int createdAt;

  /// The identifier, which can be referenced in API endpoints
  String id;

  ProjectApiKeyOwner owner;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectApiKey &&
    other.object == object &&
    other.redactedValue == redactedValue &&
    other.name == name &&
    other.createdAt == createdAt &&
    other.id == id &&
    other.owner == owner;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (redactedValue.hashCode) +
    (name.hashCode) +
    (createdAt.hashCode) +
    (id.hashCode) +
    (owner.hashCode);

  @override
  String toString() => 'ProjectApiKey[object=$object, redactedValue=$redactedValue, name=$name, createdAt=$createdAt, id=$id, owner=$owner]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'redacted_value'] = this.redactedValue;
      json[r'name'] = this.name;
      json[r'created_at'] = this.createdAt;
      json[r'id'] = this.id;
      json[r'owner'] = this.owner;
    return json;
  }

  /// Returns a new [ProjectApiKey] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectApiKey? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectApiKey[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectApiKey[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectApiKey(
        object: ProjectApiKeyObjectEnum.fromJson(json[r'object'])!,
        redactedValue: mapValueOfType<String>(json, r'redacted_value')!,
        name: mapValueOfType<String>(json, r'name')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        id: mapValueOfType<String>(json, r'id')!,
        owner: ProjectApiKeyOwner.fromJson(json[r'owner'])!,
      );
    }
    return null;
  }

  static List<ProjectApiKey> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKey>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKey.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectApiKey> mapFromJson(dynamic json) {
    final map = <String, ProjectApiKey>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectApiKey.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectApiKey-objects as value to a dart map
  static Map<String, List<ProjectApiKey>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectApiKey>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectApiKey.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'redacted_value',
    'name',
    'created_at',
    'id',
    'owner',
  };
}

/// The object type, which is always `organization.project.api_key`
class ProjectApiKeyObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectApiKeyObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProjectPeriodApiKey = ProjectApiKeyObjectEnum._(r'organization.project.api_key');

  /// List of all possible values in this [enum][ProjectApiKeyObjectEnum].
  static const values = <ProjectApiKeyObjectEnum>[
    organizationPeriodProjectPeriodApiKey,
  ];

  static ProjectApiKeyObjectEnum? fromJson(dynamic value) => ProjectApiKeyObjectEnumTypeTransformer().decode(value);

  static List<ProjectApiKeyObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKeyObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKeyObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectApiKeyObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectApiKeyObjectEnum].
class ProjectApiKeyObjectEnumTypeTransformer {
  factory ProjectApiKeyObjectEnumTypeTransformer() => _instance ??= const ProjectApiKeyObjectEnumTypeTransformer._();

  const ProjectApiKeyObjectEnumTypeTransformer._();

  String encode(ProjectApiKeyObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectApiKeyObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectApiKeyObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project.api_key': return ProjectApiKeyObjectEnum.organizationPeriodProjectPeriodApiKey;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectApiKeyObjectEnumTypeTransformer] instance.
  static ProjectApiKeyObjectEnumTypeTransformer? _instance;
}


