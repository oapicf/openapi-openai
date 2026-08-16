//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectServiceAccountCreateResponse {
  /// Returns a new [ProjectServiceAccountCreateResponse] instance.
  ProjectServiceAccountCreateResponse({
    required this.object,
    required this.id,
    required this.name,
    required this.role,
    required this.createdAt,
    required this.apiKey,
  });

  ProjectServiceAccountCreateResponseObjectEnum object;

  String id;

  String name;

  /// Service accounts can only have one role of type `member`
  ProjectServiceAccountCreateResponseRoleEnum role;

  int createdAt;

  ProjectServiceAccountApiKey apiKey;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectServiceAccountCreateResponse &&
    other.object == object &&
    other.id == id &&
    other.name == name &&
    other.role == role &&
    other.createdAt == createdAt &&
    other.apiKey == apiKey;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (name.hashCode) +
    (role.hashCode) +
    (createdAt.hashCode) +
    (apiKey.hashCode);

  @override
  String toString() => 'ProjectServiceAccountCreateResponse[object=$object, id=$id, name=$name, role=$role, createdAt=$createdAt, apiKey=$apiKey]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'role'] = this.role;
      json[r'created_at'] = this.createdAt;
      json[r'api_key'] = this.apiKey;
    return json;
  }

  /// Returns a new [ProjectServiceAccountCreateResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectServiceAccountCreateResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectServiceAccountCreateResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectServiceAccountCreateResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectServiceAccountCreateResponse(
        object: ProjectServiceAccountCreateResponseObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        role: ProjectServiceAccountCreateResponseRoleEnum.fromJson(json[r'role'])!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        apiKey: ProjectServiceAccountApiKey.fromJson(json[r'api_key'])!,
      );
    }
    return null;
  }

  static List<ProjectServiceAccountCreateResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountCreateResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountCreateResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectServiceAccountCreateResponse> mapFromJson(dynamic json) {
    final map = <String, ProjectServiceAccountCreateResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectServiceAccountCreateResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectServiceAccountCreateResponse-objects as value to a dart map
  static Map<String, List<ProjectServiceAccountCreateResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectServiceAccountCreateResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectServiceAccountCreateResponse.listFromJson(entry.value, growable: growable,);
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
    'api_key',
  };
}


class ProjectServiceAccountCreateResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectServiceAccountCreateResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProjectPeriodServiceAccount = ProjectServiceAccountCreateResponseObjectEnum._(r'organization.project.service_account');

  /// List of all possible values in this [enum][ProjectServiceAccountCreateResponseObjectEnum].
  static const values = <ProjectServiceAccountCreateResponseObjectEnum>[
    organizationPeriodProjectPeriodServiceAccount,
  ];

  static ProjectServiceAccountCreateResponseObjectEnum? fromJson(dynamic value) => ProjectServiceAccountCreateResponseObjectEnumTypeTransformer().decode(value);

  static List<ProjectServiceAccountCreateResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountCreateResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountCreateResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectServiceAccountCreateResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectServiceAccountCreateResponseObjectEnum].
class ProjectServiceAccountCreateResponseObjectEnumTypeTransformer {
  factory ProjectServiceAccountCreateResponseObjectEnumTypeTransformer() => _instance ??= const ProjectServiceAccountCreateResponseObjectEnumTypeTransformer._();

  const ProjectServiceAccountCreateResponseObjectEnumTypeTransformer._();

  String encode(ProjectServiceAccountCreateResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectServiceAccountCreateResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountCreateResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project.service_account': return ProjectServiceAccountCreateResponseObjectEnum.organizationPeriodProjectPeriodServiceAccount;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectServiceAccountCreateResponseObjectEnumTypeTransformer] instance.
  static ProjectServiceAccountCreateResponseObjectEnumTypeTransformer? _instance;
}


/// Service accounts can only have one role of type `member`
class ProjectServiceAccountCreateResponseRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectServiceAccountCreateResponseRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const member = ProjectServiceAccountCreateResponseRoleEnum._(r'member');

  /// List of all possible values in this [enum][ProjectServiceAccountCreateResponseRoleEnum].
  static const values = <ProjectServiceAccountCreateResponseRoleEnum>[
    member,
  ];

  static ProjectServiceAccountCreateResponseRoleEnum? fromJson(dynamic value) => ProjectServiceAccountCreateResponseRoleEnumTypeTransformer().decode(value);

  static List<ProjectServiceAccountCreateResponseRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountCreateResponseRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountCreateResponseRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectServiceAccountCreateResponseRoleEnum] to String,
/// and [decode] dynamic data back to [ProjectServiceAccountCreateResponseRoleEnum].
class ProjectServiceAccountCreateResponseRoleEnumTypeTransformer {
  factory ProjectServiceAccountCreateResponseRoleEnumTypeTransformer() => _instance ??= const ProjectServiceAccountCreateResponseRoleEnumTypeTransformer._();

  const ProjectServiceAccountCreateResponseRoleEnumTypeTransformer._();

  String encode(ProjectServiceAccountCreateResponseRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectServiceAccountCreateResponseRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountCreateResponseRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'member': return ProjectServiceAccountCreateResponseRoleEnum.member;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectServiceAccountCreateResponseRoleEnumTypeTransformer] instance.
  static ProjectServiceAccountCreateResponseRoleEnumTypeTransformer? _instance;
}


