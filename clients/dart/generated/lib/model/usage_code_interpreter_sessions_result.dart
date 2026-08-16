//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageCodeInterpreterSessionsResult {
  /// Returns a new [UsageCodeInterpreterSessionsResult] instance.
  UsageCodeInterpreterSessionsResult({
    required this.object,
    required this.sessions,
    this.projectId,
  });

  UsageCodeInterpreterSessionsResultObjectEnum object;

  /// The number of code interpreter sessions.
  int sessions;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  String? projectId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageCodeInterpreterSessionsResult &&
    other.object == object &&
    other.sessions == sessions &&
    other.projectId == projectId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (sessions.hashCode) +
    (projectId == null ? 0 : projectId!.hashCode);

  @override
  String toString() => 'UsageCodeInterpreterSessionsResult[object=$object, sessions=$sessions, projectId=$projectId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'sessions'] = this.sessions;
    if (this.projectId != null) {
      json[r'project_id'] = this.projectId;
    } else {
      json[r'project_id'] = null;
    }
    return json;
  }

  /// Returns a new [UsageCodeInterpreterSessionsResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageCodeInterpreterSessionsResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UsageCodeInterpreterSessionsResult[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UsageCodeInterpreterSessionsResult[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UsageCodeInterpreterSessionsResult(
        object: UsageCodeInterpreterSessionsResultObjectEnum.fromJson(json[r'object'])!,
        sessions: mapValueOfType<int>(json, r'sessions')!,
        projectId: mapValueOfType<String>(json, r'project_id'),
      );
    }
    return null;
  }

  static List<UsageCodeInterpreterSessionsResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageCodeInterpreterSessionsResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageCodeInterpreterSessionsResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageCodeInterpreterSessionsResult> mapFromJson(dynamic json) {
    final map = <String, UsageCodeInterpreterSessionsResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageCodeInterpreterSessionsResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageCodeInterpreterSessionsResult-objects as value to a dart map
  static Map<String, List<UsageCodeInterpreterSessionsResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageCodeInterpreterSessionsResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageCodeInterpreterSessionsResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'sessions',
  };
}


class UsageCodeInterpreterSessionsResultObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UsageCodeInterpreterSessionsResultObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodUsagePeriodCodeInterpreterSessionsPeriodResult = UsageCodeInterpreterSessionsResultObjectEnum._(r'organization.usage.code_interpreter_sessions.result');

  /// List of all possible values in this [enum][UsageCodeInterpreterSessionsResultObjectEnum].
  static const values = <UsageCodeInterpreterSessionsResultObjectEnum>[
    organizationPeriodUsagePeriodCodeInterpreterSessionsPeriodResult,
  ];

  static UsageCodeInterpreterSessionsResultObjectEnum? fromJson(dynamic value) => UsageCodeInterpreterSessionsResultObjectEnumTypeTransformer().decode(value);

  static List<UsageCodeInterpreterSessionsResultObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageCodeInterpreterSessionsResultObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageCodeInterpreterSessionsResultObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageCodeInterpreterSessionsResultObjectEnum] to String,
/// and [decode] dynamic data back to [UsageCodeInterpreterSessionsResultObjectEnum].
class UsageCodeInterpreterSessionsResultObjectEnumTypeTransformer {
  factory UsageCodeInterpreterSessionsResultObjectEnumTypeTransformer() => _instance ??= const UsageCodeInterpreterSessionsResultObjectEnumTypeTransformer._();

  const UsageCodeInterpreterSessionsResultObjectEnumTypeTransformer._();

  String encode(UsageCodeInterpreterSessionsResultObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UsageCodeInterpreterSessionsResultObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageCodeInterpreterSessionsResultObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.usage.code_interpreter_sessions.result': return UsageCodeInterpreterSessionsResultObjectEnum.organizationPeriodUsagePeriodCodeInterpreterSessionsPeriodResult;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UsageCodeInterpreterSessionsResultObjectEnumTypeTransformer] instance.
  static UsageCodeInterpreterSessionsResultObjectEnumTypeTransformer? _instance;
}


