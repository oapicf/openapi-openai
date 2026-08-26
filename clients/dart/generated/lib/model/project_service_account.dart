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
        assert(json.containsKey(r'object'), 'Required key "ProjectServiceAccount[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "ProjectServiceAccount[object]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "ProjectServiceAccount[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ProjectServiceAccount[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "ProjectServiceAccount[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "ProjectServiceAccount[name]" has a null value in JSON.');
        assert(json.containsKey(r'role'), 'Required key "ProjectServiceAccount[role]" is missing from JSON.');
        assert(json[r'role'] != null, 'Required key "ProjectServiceAccount[role]" has a null value in JSON.');
        assert(json.containsKey(r'created_at'), 'Required key "ProjectServiceAccount[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "ProjectServiceAccount[created_at]" has a null value in JSON.');
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
enum ProjectServiceAccountObjectEnum {
  organizationPeriodProjectPeriodServiceAccount._(r'organization.project.service_account'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProjectServiceAccountObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProjectServiceAccountObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProjectServiceAccountObjectEnum? fromJson(dynamic value) => ProjectServiceAccountObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProjectServiceAccountObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(ProjectServiceAccountObjectEnum data) => data._value;

  /// Returns the instance of [ProjectServiceAccountObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProjectServiceAccountObjectEnum) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static ProjectServiceAccountObjectEnumTypeTransformer? _instance;
}


/// `owner` or `member`
enum ProjectServiceAccountRoleEnum {
  owner._(r'owner'),
  member._(r'member'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProjectServiceAccountRoleEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProjectServiceAccountRoleEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProjectServiceAccountRoleEnum? fromJson(dynamic value) => ProjectServiceAccountRoleEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProjectServiceAccountRoleEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(ProjectServiceAccountRoleEnum data) => data._value;

  /// Returns the instance of [ProjectServiceAccountRoleEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProjectServiceAccountRoleEnum) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static ProjectServiceAccountRoleEnumTypeTransformer? _instance;
}


