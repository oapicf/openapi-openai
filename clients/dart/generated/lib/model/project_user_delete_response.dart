//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectUserDeleteResponse {
  /// Returns a new [ProjectUserDeleteResponse] instance.
  ProjectUserDeleteResponse({
    required this.object,
    required this.id,
    required this.deleted,
  });

  ProjectUserDeleteResponseObjectEnum object;

  String id;

  bool deleted;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectUserDeleteResponse &&
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
  String toString() => 'ProjectUserDeleteResponse[object=$object, id=$id, deleted=$deleted]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
    return json;
  }

  /// Returns a new [ProjectUserDeleteResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectUserDeleteResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectUserDeleteResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectUserDeleteResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectUserDeleteResponse(
        object: ProjectUserDeleteResponseObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
      );
    }
    return null;
  }

  static List<ProjectUserDeleteResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserDeleteResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserDeleteResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectUserDeleteResponse> mapFromJson(dynamic json) {
    final map = <String, ProjectUserDeleteResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectUserDeleteResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectUserDeleteResponse-objects as value to a dart map
  static Map<String, List<ProjectUserDeleteResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectUserDeleteResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectUserDeleteResponse.listFromJson(entry.value, growable: growable,);
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


class ProjectUserDeleteResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectUserDeleteResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProjectPeriodUserPeriodDeleted = ProjectUserDeleteResponseObjectEnum._(r'organization.project.user.deleted');

  /// List of all possible values in this [enum][ProjectUserDeleteResponseObjectEnum].
  static const values = <ProjectUserDeleteResponseObjectEnum>[
    organizationPeriodProjectPeriodUserPeriodDeleted,
  ];

  static ProjectUserDeleteResponseObjectEnum? fromJson(dynamic value) => ProjectUserDeleteResponseObjectEnumTypeTransformer().decode(value);

  static List<ProjectUserDeleteResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserDeleteResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserDeleteResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectUserDeleteResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectUserDeleteResponseObjectEnum].
class ProjectUserDeleteResponseObjectEnumTypeTransformer {
  factory ProjectUserDeleteResponseObjectEnumTypeTransformer() => _instance ??= const ProjectUserDeleteResponseObjectEnumTypeTransformer._();

  const ProjectUserDeleteResponseObjectEnumTypeTransformer._();

  String encode(ProjectUserDeleteResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectUserDeleteResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectUserDeleteResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project.user.deleted': return ProjectUserDeleteResponseObjectEnum.organizationPeriodProjectPeriodUserPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectUserDeleteResponseObjectEnumTypeTransformer] instance.
  static ProjectUserDeleteResponseObjectEnumTypeTransformer? _instance;
}


