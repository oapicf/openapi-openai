//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectServiceAccount {
  /// Returns a new [ProjectServiceAccount] instance.
  ProjectServiceAccount({
    required this.object,
    required this.id,
    required this.name,
    required this.role,
    required this.createdAt,
  });

  /// The object type, which is always `organization.project.service_account`
  ProjectServiceAccountObjectEnum object;

  /// The identifier, which can be referenced in API endpoints
  String id;

  /// The name of the service account
  String name;

  /// `owner` or `member`
  ProjectServiceAccountRoleEnum role;

  /// The Unix timestamp (in seconds) of when the service account was created
  int createdAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectServiceAccount &&
    other.object == object &&
    other.id == id &&
    other.name == name &&
    other.role == role &&
    other.createdAt == createdAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (name.hashCode) +
    (role.hashCode) +
    (createdAt.hashCode);

  @override
  String toString() => 'ProjectServiceAccount[object=$object, id=$id, name=$name, role=$role, createdAt=$createdAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'role'] = this.role;
      json[r'created_at'] = this.createdAt;
    return json;
  }

  /// Returns a new [ProjectServiceAccount] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectServiceAccount? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectServiceAccount[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectServiceAccount[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectServiceAccount(
        object: ProjectServiceAccountObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        role: ProjectServiceAccountRoleEnum.fromJson(json[r'role'])!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
      );
    }
    return null;
  }

  static List<ProjectServiceAccount> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccount>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccount.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectServiceAccount> mapFromJson(dynamic json) {
    final map = <String, ProjectServiceAccount>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectServiceAccount.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectServiceAccount-objects as value to a dart map
  static Map<String, List<ProjectServiceAccount>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectServiceAccount>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectServiceAccount.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'name',
    'role',
    'created_at',
  };
}

/// The object type, which is always `organization.project.service_account`
class ProjectServiceAccountObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectServiceAccountObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProjectPeriodServiceAccount = ProjectServiceAccountObjectEnum._(r'organization.project.service_account');

  /// List of all possible values in this [enum][ProjectServiceAccountObjectEnum].
  static const values = <ProjectServiceAccountObjectEnum>[
    organizationPeriodProjectPeriodServiceAccount,
  ];

  static ProjectServiceAccountObjectEnum? fromJson(dynamic value) => ProjectServiceAccountObjectEnumTypeTransformer().decode(value);

  static List<ProjectServiceAccountObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectServiceAccountObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectServiceAccountObjectEnum].
class ProjectServiceAccountObjectEnumTypeTransformer {
  factory ProjectServiceAccountObjectEnumTypeTransformer() => _instance ??= const ProjectServiceAccountObjectEnumTypeTransformer._();

  const ProjectServiceAccountObjectEnumTypeTransformer._();

  String encode(ProjectServiceAccountObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectServiceAccountObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project.service_account': return ProjectServiceAccountObjectEnum.organizationPeriodProjectPeriodServiceAccount;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectServiceAccountObjectEnumTypeTransformer] instance.
  static ProjectServiceAccountObjectEnumTypeTransformer? _instance;
}


/// `owner` or `member`
class ProjectServiceAccountRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectServiceAccountRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const owner = ProjectServiceAccountRoleEnum._(r'owner');
  static const member = ProjectServiceAccountRoleEnum._(r'member');

  /// List of all possible values in this [enum][ProjectServiceAccountRoleEnum].
  static const values = <ProjectServiceAccountRoleEnum>[
    owner,
    member,
  ];

  static ProjectServiceAccountRoleEnum? fromJson(dynamic value) => ProjectServiceAccountRoleEnumTypeTransformer().decode(value);

  static List<ProjectServiceAccountRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectServiceAccountRoleEnum] to String,
/// and [decode] dynamic data back to [ProjectServiceAccountRoleEnum].
class ProjectServiceAccountRoleEnumTypeTransformer {
  factory ProjectServiceAccountRoleEnumTypeTransformer() => _instance ??= const ProjectServiceAccountRoleEnumTypeTransformer._();

  const ProjectServiceAccountRoleEnumTypeTransformer._();

  String encode(ProjectServiceAccountRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectServiceAccountRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'owner': return ProjectServiceAccountRoleEnum.owner;
        case r'member': return ProjectServiceAccountRoleEnum.member;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectServiceAccountRoleEnumTypeTransformer] instance.
  static ProjectServiceAccountRoleEnumTypeTransformer? _instance;
}


