//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectUser {
  /// Returns a new [ProjectUser] instance.
  ProjectUser({
    required this.object,
    required this.id,
    required this.name,
    required this.email,
    required this.role,
    required this.addedAt,
  });

  /// The object type, which is always `organization.project.user`
  ProjectUserObjectEnum object;

  /// The identifier, which can be referenced in API endpoints
  String id;

  /// The name of the user
  String name;

  /// The email address of the user
  String email;

  /// `owner` or `member`
  ProjectUserRoleEnum role;

  /// The Unix timestamp (in seconds) of when the project was added.
  int addedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectUser &&
    other.object == object &&
    other.id == id &&
    other.name == name &&
    other.email == email &&
    other.role == role &&
    other.addedAt == addedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (name.hashCode) +
    (email.hashCode) +
    (role.hashCode) +
    (addedAt.hashCode);

  @override
  String toString() => 'ProjectUser[object=$object, id=$id, name=$name, email=$email, role=$role, addedAt=$addedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'email'] = this.email;
      json[r'role'] = this.role;
      json[r'added_at'] = this.addedAt;
    return json;
  }

  /// Returns a new [ProjectUser] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectUser? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'object'), 'Required key "ProjectUser[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "ProjectUser[object]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "ProjectUser[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ProjectUser[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "ProjectUser[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "ProjectUser[name]" has a null value in JSON.');
        assert(json.containsKey(r'email'), 'Required key "ProjectUser[email]" is missing from JSON.');
        assert(json[r'email'] != null, 'Required key "ProjectUser[email]" has a null value in JSON.');
        assert(json.containsKey(r'role'), 'Required key "ProjectUser[role]" is missing from JSON.');
        assert(json[r'role'] != null, 'Required key "ProjectUser[role]" has a null value in JSON.');
        assert(json.containsKey(r'added_at'), 'Required key "ProjectUser[added_at]" is missing from JSON.');
        assert(json[r'added_at'] != null, 'Required key "ProjectUser[added_at]" has a null value in JSON.');
        return true;
      }());

      return ProjectUser(
        object: ProjectUserObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        email: mapValueOfType<String>(json, r'email')!,
        role: ProjectUserRoleEnum.fromJson(json[r'role'])!,
        addedAt: mapValueOfType<int>(json, r'added_at')!,
      );
    }
    return null;
  }

  static List<ProjectUser> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUser>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUser.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectUser> mapFromJson(dynamic json) {
    final map = <String, ProjectUser>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectUser.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectUser-objects as value to a dart map
  static Map<String, List<ProjectUser>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectUser>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectUser.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'name',
    'email',
    'role',
    'added_at',
  };
}

/// The object type, which is always `organization.project.user`
enum ProjectUserObjectEnum {
  organizationPeriodProjectPeriodUser._(r'organization.project.user'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProjectUserObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProjectUserObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProjectUserObjectEnum? fromJson(dynamic value) => ProjectUserObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProjectUserObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ProjectUserObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectUserObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectUserObjectEnum].
class ProjectUserObjectEnumTypeTransformer {
  factory ProjectUserObjectEnumTypeTransformer() => _instance ??= const ProjectUserObjectEnumTypeTransformer._();

  const ProjectUserObjectEnumTypeTransformer._();

  String encode(ProjectUserObjectEnum data) => data._value;

  /// Returns the instance of [ProjectUserObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectUserObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProjectUserObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'organization.project.user': return ProjectUserObjectEnum.organizationPeriodProjectPeriodUser;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ProjectUserObjectEnumTypeTransformer? _instance;
}


/// `owner` or `member`
enum ProjectUserRoleEnum {
  owner._(r'owner'),
  member._(r'member'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProjectUserRoleEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProjectUserRoleEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProjectUserRoleEnum? fromJson(dynamic value) => ProjectUserRoleEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProjectUserRoleEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ProjectUserRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectUserRoleEnum] to String,
/// and [decode] dynamic data back to [ProjectUserRoleEnum].
class ProjectUserRoleEnumTypeTransformer {
  factory ProjectUserRoleEnumTypeTransformer() => _instance ??= const ProjectUserRoleEnumTypeTransformer._();

  const ProjectUserRoleEnumTypeTransformer._();

  String encode(ProjectUserRoleEnum data) => data._value;

  /// Returns the instance of [ProjectUserRoleEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectUserRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProjectUserRoleEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'owner': return ProjectUserRoleEnum.owner;
        case r'member': return ProjectUserRoleEnum.member;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ProjectUserRoleEnumTypeTransformer? _instance;
}


