//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectUserCreateRequest {
  /// Returns a new [ProjectUserCreateRequest] instance.
  ProjectUserCreateRequest({
    required this.userId,
    required this.role,
  });

  /// The ID of the user.
  String userId;

  /// `owner` or `member`
  ProjectUserCreateRequestRoleEnum role;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectUserCreateRequest &&
    other.userId == userId &&
    other.role == role;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (userId.hashCode) +
    (role.hashCode);

  @override
  String toString() => 'ProjectUserCreateRequest[userId=$userId, role=$role]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'user_id'] = this.userId;
      json[r'role'] = this.role;
    return json;
  }

  /// Returns a new [ProjectUserCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectUserCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectUserCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectUserCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectUserCreateRequest(
        userId: mapValueOfType<String>(json, r'user_id')!,
        role: ProjectUserCreateRequestRoleEnum.fromJson(json[r'role'])!,
      );
    }
    return null;
  }

  static List<ProjectUserCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectUserCreateRequest> mapFromJson(dynamic json) {
    final map = <String, ProjectUserCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectUserCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectUserCreateRequest-objects as value to a dart map
  static Map<String, List<ProjectUserCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectUserCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectUserCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'user_id',
    'role',
  };
}

/// `owner` or `member`
class ProjectUserCreateRequestRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectUserCreateRequestRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const owner = ProjectUserCreateRequestRoleEnum._(r'owner');
  static const member = ProjectUserCreateRequestRoleEnum._(r'member');

  /// List of all possible values in this [enum][ProjectUserCreateRequestRoleEnum].
  static const values = <ProjectUserCreateRequestRoleEnum>[
    owner,
    member,
  ];

  static ProjectUserCreateRequestRoleEnum? fromJson(dynamic value) => ProjectUserCreateRequestRoleEnumTypeTransformer().decode(value);

  static List<ProjectUserCreateRequestRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectUserCreateRequestRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectUserCreateRequestRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectUserCreateRequestRoleEnum] to String,
/// and [decode] dynamic data back to [ProjectUserCreateRequestRoleEnum].
class ProjectUserCreateRequestRoleEnumTypeTransformer {
  factory ProjectUserCreateRequestRoleEnumTypeTransformer() => _instance ??= const ProjectUserCreateRequestRoleEnumTypeTransformer._();

  const ProjectUserCreateRequestRoleEnumTypeTransformer._();

  String encode(ProjectUserCreateRequestRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectUserCreateRequestRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectUserCreateRequestRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'owner': return ProjectUserCreateRequestRoleEnum.owner;
        case r'member': return ProjectUserCreateRequestRoleEnum.member;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectUserCreateRequestRoleEnumTypeTransformer] instance.
  static ProjectUserCreateRequestRoleEnumTypeTransformer? _instance;
}


