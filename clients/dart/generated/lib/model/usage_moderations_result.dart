//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageModerationsResult {
  /// Returns a new [UsageModerationsResult] instance.
  UsageModerationsResult({
    required this.object,
    required this.inputTokens,
    required this.numModelRequests,
    this.projectId,
    this.userId,
    this.apiKeyId,
    this.model,
  });

  UsageModerationsResultObjectEnum object;

  /// The aggregated number of input tokens used.
  int inputTokens;

  /// The count of requests made to the model.
  int numModelRequests;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  String? projectId;

  /// When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  String? userId;

  /// When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  String? apiKeyId;

  /// When `group_by=model`, this field provides the model name of the grouped usage result.
  String? model;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageModerationsResult &&
    other.object == object &&
    other.inputTokens == inputTokens &&
    other.numModelRequests == numModelRequests &&
    other.projectId == projectId &&
    other.userId == userId &&
    other.apiKeyId == apiKeyId &&
    other.model == model;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (inputTokens.hashCode) +
    (numModelRequests.hashCode) +
    (projectId == null ? 0 : projectId!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (apiKeyId == null ? 0 : apiKeyId!.hashCode) +
    (model == null ? 0 : model!.hashCode);

  @override
  String toString() => 'UsageModerationsResult[object=$object, inputTokens=$inputTokens, numModelRequests=$numModelRequests, projectId=$projectId, userId=$userId, apiKeyId=$apiKeyId, model=$model]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'input_tokens'] = this.inputTokens;
      json[r'num_model_requests'] = this.numModelRequests;
    if (this.projectId != null) {
      json[r'project_id'] = this.projectId;
    } else {
      json[r'project_id'] = null;
    }
    if (this.userId != null) {
      json[r'user_id'] = this.userId;
    } else {
      json[r'user_id'] = null;
    }
    if (this.apiKeyId != null) {
      json[r'api_key_id'] = this.apiKeyId;
    } else {
      json[r'api_key_id'] = null;
    }
    if (this.model != null) {
      json[r'model'] = this.model;
    } else {
      json[r'model'] = null;
    }
    return json;
  }

  /// Returns a new [UsageModerationsResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageModerationsResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UsageModerationsResult[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UsageModerationsResult[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UsageModerationsResult(
        object: UsageModerationsResultObjectEnum.fromJson(json[r'object'])!,
        inputTokens: mapValueOfType<int>(json, r'input_tokens')!,
        numModelRequests: mapValueOfType<int>(json, r'num_model_requests')!,
        projectId: mapValueOfType<String>(json, r'project_id'),
        userId: mapValueOfType<String>(json, r'user_id'),
        apiKeyId: mapValueOfType<String>(json, r'api_key_id'),
        model: mapValueOfType<String>(json, r'model'),
      );
    }
    return null;
  }

  static List<UsageModerationsResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageModerationsResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageModerationsResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageModerationsResult> mapFromJson(dynamic json) {
    final map = <String, UsageModerationsResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageModerationsResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageModerationsResult-objects as value to a dart map
  static Map<String, List<UsageModerationsResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageModerationsResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageModerationsResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'input_tokens',
    'num_model_requests',
  };
}


class UsageModerationsResultObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UsageModerationsResultObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodUsagePeriodModerationsPeriodResult = UsageModerationsResultObjectEnum._(r'organization.usage.moderations.result');

  /// List of all possible values in this [enum][UsageModerationsResultObjectEnum].
  static const values = <UsageModerationsResultObjectEnum>[
    organizationPeriodUsagePeriodModerationsPeriodResult,
  ];

  static UsageModerationsResultObjectEnum? fromJson(dynamic value) => UsageModerationsResultObjectEnumTypeTransformer().decode(value);

  static List<UsageModerationsResultObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageModerationsResultObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageModerationsResultObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageModerationsResultObjectEnum] to String,
/// and [decode] dynamic data back to [UsageModerationsResultObjectEnum].
class UsageModerationsResultObjectEnumTypeTransformer {
  factory UsageModerationsResultObjectEnumTypeTransformer() => _instance ??= const UsageModerationsResultObjectEnumTypeTransformer._();

  const UsageModerationsResultObjectEnumTypeTransformer._();

  String encode(UsageModerationsResultObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UsageModerationsResultObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageModerationsResultObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.usage.moderations.result': return UsageModerationsResultObjectEnum.organizationPeriodUsagePeriodModerationsPeriodResult;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UsageModerationsResultObjectEnumTypeTransformer] instance.
  static UsageModerationsResultObjectEnumTypeTransformer? _instance;
}


