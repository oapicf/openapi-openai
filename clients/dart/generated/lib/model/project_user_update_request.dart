//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectUserUpdateRequest {
  /// Returns a new [ProjectUserUpdateRequest] instance.
  ProjectUserUpdateRequest({
    required this.role,
  });

  /// `owner` or `member`
  ProjectUserUpdateRequestRoleEnum role;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectUserUpdateRequest &&
    other.role == role;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (role.hashCode);

  @override
  String toString() => 'ProjectUserUpdateRequest[role=$role]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'role'] = this.role;
    return json;
  }

  /// Returns a new [ProjectUserUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectUserUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectUserUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectUserUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectUserUpdateRequest(
        role: ProjectUserUpdateRequestRoleEnum.fromJson(json[r'role'])!,
      );
    }
    return null;
  }

  static List<ProjectUserUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectUserUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, ProjectUserUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectUserUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectUserUpdateRequest-objects as value to a dart map
  static Map<String, List<ProjectUserUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectUserUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectUserUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'role',
  };
}

/// `owner` or `member`
class ProjectUserUpdateRequestRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectUserUpdateRequestRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const owner = ProjectUserUpdateRequestRoleEnum._(r'owner');
  static const member = ProjectUserUpdateRequestRoleEnum._(r'member');

  /// List of all possible values in this [enum][ProjectUserUpdateRequestRoleEnum].
  static const values = <ProjectUserUpdateRequestRoleEnum>[
    owner,
    member,
  ];

  static ProjectUserUpdateRequestRoleEnum? fromJson(dynamic value) => ProjectUserUpdateRequestRoleEnumTypeTransformer().decode(value);

  static List<ProjectUserUpdateRequestRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserUpdateRequestRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserUpdateRequestRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectUserUpdateRequestRoleEnum] to String,
/// and [decode] dynamic data back to [ProjectUserUpdateRequestRoleEnum].
class ProjectUserUpdateRequestRoleEnumTypeTransformer {
  factory ProjectUserUpdateRequestRoleEnumTypeTransformer() => _instance ??= const ProjectUserUpdateRequestRoleEnumTypeTransformer._();

  const ProjectUserUpdateRequestRoleEnumTypeTransformer._();

  String encode(ProjectUserUpdateRequestRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectUserUpdateRequestRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectUserUpdateRequestRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'owner': return ProjectUserUpdateRequestRoleEnum.owner;
        case r'member': return ProjectUserUpdateRequestRoleEnum.member;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectUserUpdateRequestRoleEnumTypeTransformer] instance.
  static ProjectUserUpdateRequestRoleEnumTypeTransformer? _instance;
}


