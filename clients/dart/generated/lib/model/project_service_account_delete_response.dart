//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectServiceAccountDeleteResponse {
  /// Returns a new [ProjectServiceAccountDeleteResponse] instance.
  ProjectServiceAccountDeleteResponse({
    required this.object,
    required this.id,
    required this.deleted,
  });

  ProjectServiceAccountDeleteResponseObjectEnum object;

  String id;

  bool deleted;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectServiceAccountDeleteResponse &&
    other.object == object &&
    other.id == id &&
    other.deleted == deleted;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (deleted.hashCode);

  @override
  String toString() => 'ProjectServiceAccountDeleteResponse[object=$object, id=$id, deleted=$deleted]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
    return json;
  }

  /// Returns a new [ProjectServiceAccountDeleteResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectServiceAccountDeleteResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectServiceAccountDeleteResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectServiceAccountDeleteResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectServiceAccountDeleteResponse(
        object: ProjectServiceAccountDeleteResponseObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
      );
    }
    return null;
  }

  static List<ProjectServiceAccountDeleteResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountDeleteResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountDeleteResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectServiceAccountDeleteResponse> mapFromJson(dynamic json) {
    final map = <String, ProjectServiceAccountDeleteResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectServiceAccountDeleteResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectServiceAccountDeleteResponse-objects as value to a dart map
  static Map<String, List<ProjectServiceAccountDeleteResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectServiceAccountDeleteResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectServiceAccountDeleteResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'deleted',
  };
}


class ProjectServiceAccountDeleteResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectServiceAccountDeleteResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProjectPeriodServiceAccountPeriodDeleted = ProjectServiceAccountDeleteResponseObjectEnum._(r'organization.project.service_account.deleted');

  /// List of all possible values in this [enum][ProjectServiceAccountDeleteResponseObjectEnum].
  static const values = <ProjectServiceAccountDeleteResponseObjectEnum>[
    organizationPeriodProjectPeriodServiceAccountPeriodDeleted,
  ];

  static ProjectServiceAccountDeleteResponseObjectEnum? fromJson(dynamic value) => ProjectServiceAccountDeleteResponseObjectEnumTypeTransformer().decode(value);

  static List<ProjectServiceAccountDeleteResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountDeleteResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountDeleteResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectServiceAccountDeleteResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectServiceAccountDeleteResponseObjectEnum].
class ProjectServiceAccountDeleteResponseObjectEnumTypeTransformer {
  factory ProjectServiceAccountDeleteResponseObjectEnumTypeTransformer() => _instance ??= const ProjectServiceAccountDeleteResponseObjectEnumTypeTransformer._();

  const ProjectServiceAccountDeleteResponseObjectEnumTypeTransformer._();

  String encode(ProjectServiceAccountDeleteResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectServiceAccountDeleteResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountDeleteResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project.service_account.deleted': return ProjectServiceAccountDeleteResponseObjectEnum.organizationPeriodProjectPeriodServiceAccountPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectServiceAccountDeleteResponseObjectEnumTypeTransformer] instance.
  static ProjectServiceAccountDeleteResponseObjectEnumTypeTransformer? _instance;
}


