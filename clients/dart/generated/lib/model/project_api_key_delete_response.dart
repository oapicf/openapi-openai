//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectApiKeyDeleteResponse {
  /// Returns a new [ProjectApiKeyDeleteResponse] instance.
  ProjectApiKeyDeleteResponse({
    required this.object,
    required this.id,
    required this.deleted,
  });

  ProjectApiKeyDeleteResponseObjectEnum object;

  String id;

  bool deleted;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectApiKeyDeleteResponse &&
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
  String toString() => 'ProjectApiKeyDeleteResponse[object=$object, id=$id, deleted=$deleted]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
    return json;
  }

  /// Returns a new [ProjectApiKeyDeleteResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectApiKeyDeleteResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectApiKeyDeleteResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectApiKeyDeleteResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectApiKeyDeleteResponse(
        object: ProjectApiKeyDeleteResponseObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
      );
    }
    return null;
  }

  static List<ProjectApiKeyDeleteResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKeyDeleteResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKeyDeleteResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectApiKeyDeleteResponse> mapFromJson(dynamic json) {
    final map = <String, ProjectApiKeyDeleteResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectApiKeyDeleteResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectApiKeyDeleteResponse-objects as value to a dart map
  static Map<String, List<ProjectApiKeyDeleteResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectApiKeyDeleteResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectApiKeyDeleteResponse.listFromJson(entry.value, growable: growable,);
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


class ProjectApiKeyDeleteResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectApiKeyDeleteResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodProjectPeriodApiKeyPeriodDeleted = ProjectApiKeyDeleteResponseObjectEnum._(r'organization.project.api_key.deleted');

  /// List of all possible values in this [enum][ProjectApiKeyDeleteResponseObjectEnum].
  static const values = <ProjectApiKeyDeleteResponseObjectEnum>[
    organizationPeriodProjectPeriodApiKeyPeriodDeleted,
  ];

  static ProjectApiKeyDeleteResponseObjectEnum? fromJson(dynamic value) => ProjectApiKeyDeleteResponseObjectEnumTypeTransformer().decode(value);

  static List<ProjectApiKeyDeleteResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKeyDeleteResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKeyDeleteResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectApiKeyDeleteResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectApiKeyDeleteResponseObjectEnum].
class ProjectApiKeyDeleteResponseObjectEnumTypeTransformer {
  factory ProjectApiKeyDeleteResponseObjectEnumTypeTransformer() => _instance ??= const ProjectApiKeyDeleteResponseObjectEnumTypeTransformer._();

  const ProjectApiKeyDeleteResponseObjectEnumTypeTransformer._();

  String encode(ProjectApiKeyDeleteResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectApiKeyDeleteResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectApiKeyDeleteResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.project.api_key.deleted': return ProjectApiKeyDeleteResponseObjectEnum.organizationPeriodProjectPeriodApiKeyPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectApiKeyDeleteResponseObjectEnumTypeTransformer] instance.
  static ProjectApiKeyDeleteResponseObjectEnumTypeTransformer? _instance;
}


