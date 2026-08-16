//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectServiceAccountListResponse {
  /// Returns a new [ProjectServiceAccountListResponse] instance.
  ProjectServiceAccountListResponse({
    required this.object,
    this.data = const [],
    required this.firstId,
    required this.lastId,
    required this.hasMore,
  });

  ProjectServiceAccountListResponseObjectEnum object;

  List<ProjectServiceAccount> data;

  String firstId;

  String lastId;

  bool hasMore;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectServiceAccountListResponse &&
    other.object == object &&
    _deepEquality.equals(other.data, data) &&
    other.firstId == firstId &&
    other.lastId == lastId &&
    other.hasMore == hasMore;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (data.hashCode) +
    (firstId.hashCode) +
    (lastId.hashCode) +
    (hasMore.hashCode);

  @override
  String toString() => 'ProjectServiceAccountListResponse[object=$object, data=$data, firstId=$firstId, lastId=$lastId, hasMore=$hasMore]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'data'] = this.data;
      json[r'first_id'] = this.firstId;
      json[r'last_id'] = this.lastId;
      json[r'has_more'] = this.hasMore;
    return json;
  }

  /// Returns a new [ProjectServiceAccountListResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectServiceAccountListResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectServiceAccountListResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectServiceAccountListResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectServiceAccountListResponse(
        object: ProjectServiceAccountListResponseObjectEnum.fromJson(json[r'object'])!,
        data: ProjectServiceAccount.listFromJson(json[r'data']),
        firstId: mapValueOfType<String>(json, r'first_id')!,
        lastId: mapValueOfType<String>(json, r'last_id')!,
        hasMore: mapValueOfType<bool>(json, r'has_more')!,
      );
    }
    return null;
  }

  static List<ProjectServiceAccountListResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountListResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountListResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectServiceAccountListResponse> mapFromJson(dynamic json) {
    final map = <String, ProjectServiceAccountListResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectServiceAccountListResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectServiceAccountListResponse-objects as value to a dart map
  static Map<String, List<ProjectServiceAccountListResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectServiceAccountListResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectServiceAccountListResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'data',
    'first_id',
    'last_id',
    'has_more',
  };
}


class ProjectServiceAccountListResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectServiceAccountListResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = ProjectServiceAccountListResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][ProjectServiceAccountListResponseObjectEnum].
  static const values = <ProjectServiceAccountListResponseObjectEnum>[
    list,
  ];

  static ProjectServiceAccountListResponseObjectEnum? fromJson(dynamic value) => ProjectServiceAccountListResponseObjectEnumTypeTransformer().decode(value);

  static List<ProjectServiceAccountListResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectServiceAccountListResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectServiceAccountListResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectServiceAccountListResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectServiceAccountListResponseObjectEnum].
class ProjectServiceAccountListResponseObjectEnumTypeTransformer {
  factory ProjectServiceAccountListResponseObjectEnumTypeTransformer() => _instance ??= const ProjectServiceAccountListResponseObjectEnumTypeTransformer._();

  const ProjectServiceAccountListResponseObjectEnumTypeTransformer._();

  String encode(ProjectServiceAccountListResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectServiceAccountListResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectServiceAccountListResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return ProjectServiceAccountListResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectServiceAccountListResponseObjectEnumTypeTransformer] instance.
  static ProjectServiceAccountListResponseObjectEnumTypeTransformer? _instance;
}


