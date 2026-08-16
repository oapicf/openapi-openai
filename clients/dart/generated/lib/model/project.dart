//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Project {
  /// Returns a new [Project] instance.
  Project({
    required this.id,
    required this.object,
    required this.name,
    required this.createdAt,
    this.archivedAt,
    required this.status,
  });

  /// The identifier, which can be referenced in API endpoints
  String id;

  /// The object type, which is always `organization.project`
  ProjectObjectEnum object;

  /// The name of the project. This appears in reporting.
  String name;

  /// The Unix timestamp (in seconds) of when the project was created.
  int createdAt;

  /// The Unix timestamp (in seconds) of when the project was archived or `null`.
  int? archivedAt;

  /// `active` or `archived`
  ProjectStatusEnum status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Project &&
    other.id == id &&
    other.object == object &&
    other.name == name &&
    other.createdAt == createdAt &&
    other.archivedAt == archivedAt &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (name.hashCode) +
    (createdAt.hashCode) +
    (archivedAt == null ? 0 : archivedAt!.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'Project[id=$id, object=$object, name=$name, createdAt=$createdAt, archivedAt=$archivedAt, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'name'] = this.name;
      json[r'created_at'] = this.createdAt;
    if (this.archivedAt != null) {
      json[r'archived_at'] = this.archivedAt;
    } else {
      json[r'archived_at'] = null;
    }
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [Project] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Project? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Project[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Project[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Project(
        id: mapValueOfType<String>(json, r'id')!,
        object: ProjectObjectEnum.fromJson(json[r'object'])!,
        name: mapValueOfType<String>(json, r'name')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        archivedAt: mapValueOfType<int>(json, r'archived_at'),
        status: ProjectStatusEnum.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<Project> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Project>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Project.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Project> mapFromJson(dynamic json) {
    final map = <String, Project>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Project.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Project-objects as value to a dart map
  static Map<String, List<Project>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Project>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Project.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'name',
    'created_at',
    'status',
  };
}

/// The object type, which is always `organization.project`
class ProjectObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProject = ProjectObjectEnum._(r'organization.project');

  /// List of all possible values in this [enum][ProjectObjectEnum].
  static const values = <ProjectObjectEnum>[
    organizationPeriodProject,
  ];

  static ProjectObjectEnum? fromJson(dynamic value) => ProjectObjectEnumTypeTransformer().decode(value);

  static List<ProjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectObjectEnum].
class ProjectObjectEnumTypeTransformer {
  factory ProjectObjectEnumTypeTransformer() => _instance ??= const ProjectObjectEnumTypeTransformer._();

  const ProjectObjectEnumTypeTransformer._();

  String encode(ProjectObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project': return ProjectObjectEnum.organizationPeriodProject;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectObjectEnumTypeTransformer] instance.
  static ProjectObjectEnumTypeTransformer? _instance;
}


/// `active` or `archived`
class ProjectStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const active = ProjectStatusEnum._(r'active');
  static const archived = ProjectStatusEnum._(r'archived');

  /// List of all possible values in this [enum][ProjectStatusEnum].
  static const values = <ProjectStatusEnum>[
    active,
    archived,
  ];

  static ProjectStatusEnum? fromJson(dynamic value) => ProjectStatusEnumTypeTransformer().decode(value);

  static List<ProjectStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectStatusEnum] to String,
/// and [decode] dynamic data back to [ProjectStatusEnum].
class ProjectStatusEnumTypeTransformer {
  factory ProjectStatusEnumTypeTransformer() => _instance ??= const ProjectStatusEnumTypeTransformer._();

  const ProjectStatusEnumTypeTransformer._();

  String encode(ProjectStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'active': return ProjectStatusEnum.active;
        case r'archived': return ProjectStatusEnum.archived;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectStatusEnumTypeTransformer] instance.
  static ProjectStatusEnumTypeTransformer? _instance;
}


