//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectApiKeyOwner {
  /// Returns a new [ProjectApiKeyOwner] instance.
  ProjectApiKeyOwner({
    this.type,
    this.user,
    this.serviceAccount,
  });

  /// `user` or `service_account`
  ProjectApiKeyOwnerTypeEnum? type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ProjectUser? user;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ProjectServiceAccount? serviceAccount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectApiKeyOwner &&
    other.type == type &&
    other.user == user &&
    other.serviceAccount == serviceAccount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (user == null ? 0 : user!.hashCode) +
    (serviceAccount == null ? 0 : serviceAccount!.hashCode);

  @override
  String toString() => 'ProjectApiKeyOwner[type=$type, user=$user, serviceAccount=$serviceAccount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.user != null) {
      json[r'user'] = this.user;
    } else {
      json[r'user'] = null;
    }
    if (this.serviceAccount != null) {
      json[r'service_account'] = this.serviceAccount;
    } else {
      json[r'service_account'] = null;
    }
    return json;
  }

  /// Returns a new [ProjectApiKeyOwner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectApiKeyOwner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectApiKeyOwner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectApiKeyOwner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectApiKeyOwner(
        type: ProjectApiKeyOwnerTypeEnum.fromJson(json[r'type']),
        user: ProjectUser.fromJson(json[r'user']),
        serviceAccount: ProjectServiceAccount.fromJson(json[r'service_account']),
      );
    }
    return null;
  }

  static List<ProjectApiKeyOwner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKeyOwner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKeyOwner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectApiKeyOwner> mapFromJson(dynamic json) {
    final map = <String, ProjectApiKeyOwner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectApiKeyOwner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectApiKeyOwner-objects as value to a dart map
  static Map<String, List<ProjectApiKeyOwner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectApiKeyOwner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectApiKeyOwner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// `user` or `service_account`
class ProjectApiKeyOwnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectApiKeyOwnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const user = ProjectApiKeyOwnerTypeEnum._(r'user');
  static const serviceAccount = ProjectApiKeyOwnerTypeEnum._(r'service_account');

  /// List of all possible values in this [enum][ProjectApiKeyOwnerTypeEnum].
  static const values = <ProjectApiKeyOwnerTypeEnum>[
    user,
    serviceAccount,
  ];

  static ProjectApiKeyOwnerTypeEnum? fromJson(dynamic value) => ProjectApiKeyOwnerTypeEnumTypeTransformer().decode(value);

  static List<ProjectApiKeyOwnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKeyOwnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKeyOwnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectApiKeyOwnerTypeEnum] to String,
/// and [decode] dynamic data back to [ProjectApiKeyOwnerTypeEnum].
class ProjectApiKeyOwnerTypeEnumTypeTransformer {
  factory ProjectApiKeyOwnerTypeEnumTypeTransformer() => _instance ??= const ProjectApiKeyOwnerTypeEnumTypeTransformer._();

  const ProjectApiKeyOwnerTypeEnumTypeTransformer._();

  String encode(ProjectApiKeyOwnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectApiKeyOwnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectApiKeyOwnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'user': return ProjectApiKeyOwnerTypeEnum.user;
        case r'service_account': return ProjectApiKeyOwnerTypeEnum.serviceAccount;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectApiKeyOwnerTypeEnumTypeTransformer] instance.
  static ProjectApiKeyOwnerTypeEnumTypeTransformer? _instance;
}


