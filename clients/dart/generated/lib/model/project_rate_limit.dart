//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProjectRateLimit {
  /// Returns a new [ProjectRateLimit] instance.
  ProjectRateLimit({
    required this.object,
    required this.id,
    required this.model,
    required this.maxRequestsPer1Minute,
    required this.maxTokensPer1Minute,
    this.maxImagesPer1Minute,
    this.maxAudioMegabytesPer1Minute,
    this.maxRequestsPer1Day,
    this.batch1DayMaxInputTokens,
  });

  /// The object type, which is always `project.rate_limit`
  ProjectRateLimitObjectEnum object;

  /// The identifier, which can be referenced in API endpoints.
  String id;

  /// The model this rate limit applies to.
  String model;

  /// The maximum requests per minute.
  int maxRequestsPer1Minute;

  /// The maximum tokens per minute.
  int maxTokensPer1Minute;

  /// The maximum images per minute. Only present for relevant models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxImagesPer1Minute;

  /// The maximum audio megabytes per minute. Only present for relevant models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxAudioMegabytesPer1Minute;

  /// The maximum requests per day. Only present for relevant models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxRequestsPer1Day;

  /// The maximum batch input tokens per day. Only present for relevant models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? batch1DayMaxInputTokens;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProjectRateLimit &&
    other.object == object &&
    other.id == id &&
    other.model == model &&
    other.maxRequestsPer1Minute == maxRequestsPer1Minute &&
    other.maxTokensPer1Minute == maxTokensPer1Minute &&
    other.maxImagesPer1Minute == maxImagesPer1Minute &&
    other.maxAudioMegabytesPer1Minute == maxAudioMegabytesPer1Minute &&
    other.maxRequestsPer1Day == maxRequestsPer1Day &&
    other.batch1DayMaxInputTokens == batch1DayMaxInputTokens;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (model.hashCode) +
    (maxRequestsPer1Minute.hashCode) +
    (maxTokensPer1Minute.hashCode) +
    (maxImagesPer1Minute == null ? 0 : maxImagesPer1Minute!.hashCode) +
    (maxAudioMegabytesPer1Minute == null ? 0 : maxAudioMegabytesPer1Minute!.hashCode) +
    (maxRequestsPer1Day == null ? 0 : maxRequestsPer1Day!.hashCode) +
    (batch1DayMaxInputTokens == null ? 0 : batch1DayMaxInputTokens!.hashCode);

  @override
  String toString() => 'ProjectRateLimit[object=$object, id=$id, model=$model, maxRequestsPer1Minute=$maxRequestsPer1Minute, maxTokensPer1Minute=$maxTokensPer1Minute, maxImagesPer1Minute=$maxImagesPer1Minute, maxAudioMegabytesPer1Minute=$maxAudioMegabytesPer1Minute, maxRequestsPer1Day=$maxRequestsPer1Day, batch1DayMaxInputTokens=$batch1DayMaxInputTokens]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'model'] = this.model;
      json[r'max_requests_per_1_minute'] = this.maxRequestsPer1Minute;
      json[r'max_tokens_per_1_minute'] = this.maxTokensPer1Minute;
    if (this.maxImagesPer1Minute != null) {
      json[r'max_images_per_1_minute'] = this.maxImagesPer1Minute;
    } else {
      json[r'max_images_per_1_minute'] = null;
    }
    if (this.maxAudioMegabytesPer1Minute != null) {
      json[r'max_audio_megabytes_per_1_minute'] = this.maxAudioMegabytesPer1Minute;
    } else {
      json[r'max_audio_megabytes_per_1_minute'] = null;
    }
    if (this.maxRequestsPer1Day != null) {
      json[r'max_requests_per_1_day'] = this.maxRequestsPer1Day;
    } else {
      json[r'max_requests_per_1_day'] = null;
    }
    if (this.batch1DayMaxInputTokens != null) {
      json[r'batch_1_day_max_input_tokens'] = this.batch1DayMaxInputTokens;
    } else {
      json[r'batch_1_day_max_input_tokens'] = null;
    }
    return json;
  }

  /// Returns a new [ProjectRateLimit] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProjectRateLimit? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProjectRateLimit[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProjectRateLimit[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProjectRateLimit(
        object: ProjectRateLimitObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        model: mapValueOfType<String>(json, r'model')!,
        maxRequestsPer1Minute: mapValueOfType<int>(json, r'max_requests_per_1_minute')!,
        maxTokensPer1Minute: mapValueOfType<int>(json, r'max_tokens_per_1_minute')!,
        maxImagesPer1Minute: mapValueOfType<int>(json, r'max_images_per_1_minute'),
        maxAudioMegabytesPer1Minute: mapValueOfType<int>(json, r'max_audio_megabytes_per_1_minute'),
        maxRequestsPer1Day: mapValueOfType<int>(json, r'max_requests_per_1_day'),
        batch1DayMaxInputTokens: mapValueOfType<int>(json, r'batch_1_day_max_input_tokens'),
      );
    }
    return null;
  }

  static List<ProjectRateLimit> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectRateLimit>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectRateLimit.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProjectRateLimit> mapFromJson(dynamic json) {
    final map = <String, ProjectRateLimit>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProjectRateLimit.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProjectRateLimit-objects as value to a dart map
  static Map<String, List<ProjectRateLimit>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProjectRateLimit>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProjectRateLimit.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'model',
    'max_requests_per_1_minute',
    'max_tokens_per_1_minute',
  };
}

/// The object type, which is always `project.rate_limit`
class ProjectRateLimitObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ProjectRateLimitObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const projectPeriodRateLimit = ProjectRateLimitObjectEnum._(r'project.rate_limit');

  /// List of all possible values in this [enum][ProjectRateLimitObjectEnum].
  static const values = <ProjectRateLimitObjectEnum>[
    projectPeriodRateLimit,
  ];

  static ProjectRateLimitObjectEnum? fromJson(dynamic value) => ProjectRateLimitObjectEnumTypeTransformer().decode(value);

  static List<ProjectRateLimitObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProjectRateLimitObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProjectRateLimitObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProjectRateLimitObjectEnum] to String,
/// and [decode] dynamic data back to [ProjectRateLimitObjectEnum].
class ProjectRateLimitObjectEnumTypeTransformer {
  factory ProjectRateLimitObjectEnumTypeTransformer() => _instance ??= const ProjectRateLimitObjectEnumTypeTransformer._();

  const ProjectRateLimitObjectEnumTypeTransformer._();

  String encode(ProjectRateLimitObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProjectRateLimitObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProjectRateLimitObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'project.rate_limit': return ProjectRateLimitObjectEnum.projectPeriodRateLimit;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProjectRateLimitObjectEnumTypeTransformer] instance.
  static ProjectRateLimitObjectEnumTypeTransformer? _instance;
}


