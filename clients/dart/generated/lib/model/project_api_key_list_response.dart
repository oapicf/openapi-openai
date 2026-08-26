//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectApiKeyListResponse {
  /// Returns a new [ProjectApiKeyListResponse] instance.
  ProjectApiKeyListResponse({
    required this.object,
    this.data = const [],
    required this.firstId,
    required this.lastId,
    required this.hasMore,
  });

  ProjectApiKeyListResponseObjectEnum object;

  List<ProjectApiKey> data;

  String firstId;

  String lastId;

  bool hasMore;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectApiKeyListResponse &&
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
  String toString() => 'ProjectApiKeyListResponse[object=$object, data=$data, firstId=$firstId, lastId=$lastId, hasMore=$hasMore]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'data'] = this.data;
      json[r'first_id'] = this.firstId;
      json[r'last_id'] = this.lastId;
      json[r'has_more'] = this.hasMore;
    return json;
  }

  /// Returns a new [ProjectApiKeyListResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectApiKeyListResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'object'), 'Required key "ProjectApiKeyListResponse[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "ProjectApiKeyListResponse[object]" has a null value in JSON.');
        assert(json.containsKey(r'data'), 'Required key "ProjectApiKeyListResponse[data]" is missing from JSON.');
        assert(json[r'data'] != null, 'Required key "ProjectApiKeyListResponse[data]" has a null value in JSON.');
        assert(json.containsKey(r'first_id'), 'Required key "ProjectApiKeyListResponse[first_id]" is missing from JSON.');
        assert(json[r'first_id'] != null, 'Required key "ProjectApiKeyListResponse[first_id]" has a null value in JSON.');
        assert(json.containsKey(r'last_id'), 'Required key "ProjectApiKeyListResponse[last_id]" is missing from JSON.');
        assert(json[r'last_id'] != null, 'Required key "ProjectApiKeyListResponse[last_id]" has a null value in JSON.');
        assert(json.containsKey(r'has_more'), 'Required key "ProjectApiKeyListResponse[has_more]" is missing from JSON.');
        assert(json[r'has_more'] != null, 'Required key "ProjectApiKeyListResponse[has_more]" has a null value in JSON.');
        return true;
      }());

      return ProjectApiKeyListResponse(
        object: ProjectApiKeyListResponseObjectEnum.fromJson(json[r'object'])!,
        data: ProjectApiKey.listFromJson(json[r'data']),
        firstId: mapValueOfType<String>(json, r'first_id')!,
        lastId: mapValueOfType<String>(json, r'last_id')!,
        hasMore: mapValueOfType<bool>(json, r'has_more')!,
      );
    }
    return null;
  }

  static List<ProjectApiKeyListResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKeyListResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKeyListResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectApiKeyListResponse> mapFromJson(dynamic json) {
    final map = <String, ProjectApiKeyListResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectApiKeyListResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectApiKeyListResponse-objects as value to a dart map
  static Map<String, List<ProjectApiKeyListResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectApiKeyListResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectApiKeyListResponse.listFromJson(entry.value, growable: growable,);
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


enum ProjectApiKeyListResponseObjectEnum {
  list._(r'list'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProjectApiKeyListResponseObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProjectApiKeyListResponseObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProjectApiKeyListResponseObjectEnum? fromJson(dynamic value) => ProjectApiKeyListResponseObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProjectApiKeyListResponseObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ProjectApiKeyListResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectApiKeyListResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectApiKeyListResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectApiKeyListResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectApiKeyListResponseObjectEnum].
class ProjectApiKeyListResponseObjectEnumTypeTransformer {
  factory ProjectApiKeyListResponseObjectEnumTypeTransformer() => _instance ??= const ProjectApiKeyListResponseObjectEnumTypeTransformer._();

  const ProjectApiKeyListResponseObjectEnumTypeTransformer._();

  String encode(ProjectApiKeyListResponseObjectEnum data) => data._value;

  /// Returns the instance of [ProjectApiKeyListResponseObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectApiKeyListResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProjectApiKeyListResponseObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'list': return ProjectApiKeyListResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ProjectApiKeyListResponseObjectEnumTypeTransformer? _instance;
}


