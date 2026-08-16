//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageAudioTranscriptionsResult {
  /// Returns a new [UsageAudioTranscriptionsResult] instance.
  UsageAudioTranscriptionsResult({
    required this.object,
    required this.seconds,
    required this.numModelRequests,
    this.projectId,
    this.userId,
    this.apiKeyId,
    this.model,
  });

  UsageAudioTranscriptionsResultObjectEnum object;

  /// The number of seconds processed.
  int seconds;

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
  bool operator ==(Object other) => identical(this, other) || other is UsageAudioTranscriptionsResult &&
    other.object == object &&
    other.seconds == seconds &&
    other.numModelRequests == numModelRequests &&
    other.projectId == projectId &&
    other.userId == userId &&
    other.apiKeyId == apiKeyId &&
    other.model == model;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (seconds.hashCode) +
    (numModelRequests.hashCode) +
    (projectId == null ? 0 : projectId!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (apiKeyId == null ? 0 : apiKeyId!.hashCode) +
    (model == null ? 0 : model!.hashCode);

  @override
  String toString() => 'UsageAudioTranscriptionsResult[object=$object, seconds=$seconds, numModelRequests=$numModelRequests, projectId=$projectId, userId=$userId, apiKeyId=$apiKeyId, model=$model]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'seconds'] = this.seconds;
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

  /// Returns a new [UsageAudioTranscriptionsResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageAudioTranscriptionsResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UsageAudioTranscriptionsResult[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UsageAudioTranscriptionsResult[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UsageAudioTranscriptionsResult(
        object: UsageAudioTranscriptionsResultObjectEnum.fromJson(json[r'object'])!,
        seconds: mapValueOfType<int>(json, r'seconds')!,
        numModelRequests: mapValueOfType<int>(json, r'num_model_requests')!,
        projectId: mapValueOfType<String>(json, r'project_id'),
        userId: mapValueOfType<String>(json, r'user_id'),
        apiKeyId: mapValueOfType<String>(json, r'api_key_id'),
        model: mapValueOfType<String>(json, r'model'),
      );
    }
    return null;
  }

  static List<UsageAudioTranscriptionsResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageAudioTranscriptionsResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageAudioTranscriptionsResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageAudioTranscriptionsResult> mapFromJson(dynamic json) {
    final map = <String, UsageAudioTranscriptionsResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageAudioTranscriptionsResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageAudioTranscriptionsResult-objects as value to a dart map
  static Map<String, List<UsageAudioTranscriptionsResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageAudioTranscriptionsResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageAudioTranscriptionsResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'seconds',
    'num_model_requests',
  };
}


class UsageAudioTranscriptionsResultObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UsageAudioTranscriptionsResultObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodUsagePeriodAudioTranscriptionsPeriodResult = UsageAudioTranscriptionsResultObjectEnum._(r'organization.usage.audio_transcriptions.result');

  /// List of all possible values in this [enum][UsageAudioTranscriptionsResultObjectEnum].
  static const values = <UsageAudioTranscriptionsResultObjectEnum>[
    organizationPeriodUsagePeriodAudioTranscriptionsPeriodResult,
  ];

  static UsageAudioTranscriptionsResultObjectEnum? fromJson(dynamic value) => UsageAudioTranscriptionsResultObjectEnumTypeTransformer().decode(value);

  static List<UsageAudioTranscriptionsResultObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageAudioTranscriptionsResultObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageAudioTranscriptionsResultObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageAudioTranscriptionsResultObjectEnum] to String,
/// and [decode] dynamic data back to [UsageAudioTranscriptionsResultObjectEnum].
class UsageAudioTranscriptionsResultObjectEnumTypeTransformer {
  factory UsageAudioTranscriptionsResultObjectEnumTypeTransformer() => _instance ??= const UsageAudioTranscriptionsResultObjectEnumTypeTransformer._();

  const UsageAudioTranscriptionsResultObjectEnumTypeTransformer._();

  String encode(UsageAudioTranscriptionsResultObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UsageAudioTranscriptionsResultObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageAudioTranscriptionsResultObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.usage.audio_transcriptions.result': return UsageAudioTranscriptionsResultObjectEnum.organizationPeriodUsagePeriodAudioTranscriptionsPeriodResult;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UsageAudioTranscriptionsResultObjectEnumTypeTransformer] instance.
  static UsageAudioTranscriptionsResultObjectEnumTypeTransformer? _instance;
}


