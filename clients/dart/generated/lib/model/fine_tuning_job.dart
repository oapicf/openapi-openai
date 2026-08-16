//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuningJob {
  /// Returns a new [FineTuningJob] instance.
  FineTuningJob({
    required this.id,
    required this.createdAt,
    required this.error,
    required this.fineTunedModel,
    required this.finishedAt,
    required this.hyperparameters,
    required this.model,
    required this.object,
    required this.organizationId,
    this.resultFiles = const [],
    required this.status,
    required this.trainedTokens,
    required this.trainingFile,
    required this.validationFile,
    this.integrations = const [],
    required this.seed,
    this.estimatedFinish,
    this.method,
  });

  /// The object identifier, which can be referenced in the API endpoints.
  String id;

  /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
  int createdAt;

  FineTuningJobError? error;

  /// The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
  String? fineTunedModel;

  /// The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
  int? finishedAt;

  FineTuningJobHyperparameters hyperparameters;

  /// The base model that is being fine-tuned.
  String model;

  /// The object type, which is always \"fine_tuning.job\".
  FineTuningJobObjectEnum object;

  /// The organization that owns the fine-tuning job.
  String organizationId;

  /// The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
  List<String> resultFiles;

  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  FineTuningJobStatusEnum status;

  /// The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
  int? trainedTokens;

  /// The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
  String trainingFile;

  /// The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
  String? validationFile;

  /// A list of integrations to enable for this fine-tuning job.
  List<FineTuningJobIntegrationsInner>? integrations;

  /// The seed used for the fine-tuning job.
  int seed;

  /// The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
  int? estimatedFinish;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FineTuneMethod? method;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuningJob &&
    other.id == id &&
    other.createdAt == createdAt &&
    other.error == error &&
    other.fineTunedModel == fineTunedModel &&
    other.finishedAt == finishedAt &&
    other.hyperparameters == hyperparameters &&
    other.model == model &&
    other.object == object &&
    other.organizationId == organizationId &&
    _deepEquality.equals(other.resultFiles, resultFiles) &&
    other.status == status &&
    other.trainedTokens == trainedTokens &&
    other.trainingFile == trainingFile &&
    other.validationFile == validationFile &&
    _deepEquality.equals(other.integrations, integrations) &&
    other.seed == seed &&
    other.estimatedFinish == estimatedFinish &&
    other.method == method;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (createdAt.hashCode) +
    (error == null ? 0 : error!.hashCode) +
    (fineTunedModel == null ? 0 : fineTunedModel!.hashCode) +
    (finishedAt == null ? 0 : finishedAt!.hashCode) +
    (hyperparameters.hashCode) +
    (model.hashCode) +
    (object.hashCode) +
    (organizationId.hashCode) +
    (resultFiles.hashCode) +
    (status.hashCode) +
    (trainedTokens == null ? 0 : trainedTokens!.hashCode) +
    (trainingFile.hashCode) +
    (validationFile == null ? 0 : validationFile!.hashCode) +
    (integrations == null ? 0 : integrations!.hashCode) +
    (seed.hashCode) +
    (estimatedFinish == null ? 0 : estimatedFinish!.hashCode) +
    (method == null ? 0 : method!.hashCode);

  @override
  String toString() => 'FineTuningJob[id=$id, createdAt=$createdAt, error=$error, fineTunedModel=$fineTunedModel, finishedAt=$finishedAt, hyperparameters=$hyperparameters, model=$model, object=$object, organizationId=$organizationId, resultFiles=$resultFiles, status=$status, trainedTokens=$trainedTokens, trainingFile=$trainingFile, validationFile=$validationFile, integrations=$integrations, seed=$seed, estimatedFinish=$estimatedFinish, method=$method]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'created_at'] = this.createdAt;
    if (this.error != null) {
      json[r'error'] = this.error;
    } else {
      json[r'error'] = null;
    }
    if (this.fineTunedModel != null) {
      json[r'fine_tuned_model'] = this.fineTunedModel;
    } else {
      json[r'fine_tuned_model'] = null;
    }
    if (this.finishedAt != null) {
      json[r'finished_at'] = this.finishedAt;
    } else {
      json[r'finished_at'] = null;
    }
      json[r'hyperparameters'] = this.hyperparameters;
      json[r'model'] = this.model;
      json[r'object'] = this.object;
      json[r'organization_id'] = this.organizationId;
      json[r'result_files'] = this.resultFiles;
      json[r'status'] = this.status;
    if (this.trainedTokens != null) {
      json[r'trained_tokens'] = this.trainedTokens;
    } else {
      json[r'trained_tokens'] = null;
    }
      json[r'training_file'] = this.trainingFile;
    if (this.validationFile != null) {
      json[r'validation_file'] = this.validationFile;
    } else {
      json[r'validation_file'] = null;
    }
    if (this.integrations != null) {
      json[r'integrations'] = this.integrations;
    } else {
      json[r'integrations'] = null;
    }
      json[r'seed'] = this.seed;
    if (this.estimatedFinish != null) {
      json[r'estimated_finish'] = this.estimatedFinish;
    } else {
      json[r'estimated_finish'] = null;
    }
    if (this.method != null) {
      json[r'method'] = this.method;
    } else {
      json[r'method'] = null;
    }
    return json;
  }

  /// Returns a new [FineTuningJob] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuningJob? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuningJob[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuningJob[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuningJob(
        id: mapValueOfType<String>(json, r'id')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        error: FineTuningJobError.fromJson(json[r'error']),
        fineTunedModel: mapValueOfType<String>(json, r'fine_tuned_model'),
        finishedAt: mapValueOfType<int>(json, r'finished_at'),
        hyperparameters: FineTuningJobHyperparameters.fromJson(json[r'hyperparameters'])!,
        model: mapValueOfType<String>(json, r'model')!,
        object: FineTuningJobObjectEnum.fromJson(json[r'object'])!,
        organizationId: mapValueOfType<String>(json, r'organization_id')!,
        resultFiles: json[r'result_files'] is Iterable
            ? (json[r'result_files'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        status: FineTuningJobStatusEnum.fromJson(json[r'status'])!,
        trainedTokens: mapValueOfType<int>(json, r'trained_tokens'),
        trainingFile: mapValueOfType<String>(json, r'training_file')!,
        validationFile: mapValueOfType<String>(json, r'validation_file'),
        integrations: FineTuningJobIntegrationsInner.listFromJson(json[r'integrations']),
        seed: mapValueOfType<int>(json, r'seed')!,
        estimatedFinish: mapValueOfType<int>(json, r'estimated_finish'),
        method: FineTuneMethod.fromJson(json[r'method']),
      );
    }
    return null;
  }

  static List<FineTuningJob> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJob>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJob.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuningJob> mapFromJson(dynamic json) {
    final map = <String, FineTuningJob>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuningJob.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuningJob-objects as value to a dart map
  static Map<String, List<FineTuningJob>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuningJob>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuningJob.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'created_at',
    'error',
    'fine_tuned_model',
    'finished_at',
    'hyperparameters',
    'model',
    'object',
    'organization_id',
    'result_files',
    'status',
    'trained_tokens',
    'training_file',
    'validation_file',
    'seed',
  };
}

/// The object type, which is always \"fine_tuning.job\".
class FineTuningJobObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuningJobObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fineTuningPeriodJob = FineTuningJobObjectEnum._(r'fine_tuning.job');

  /// List of all possible values in this [enum][FineTuningJobObjectEnum].
  static const values = <FineTuningJobObjectEnum>[
    fineTuningPeriodJob,
  ];

  static FineTuningJobObjectEnum? fromJson(dynamic value) => FineTuningJobObjectEnumTypeTransformer().decode(value);

  static List<FineTuningJobObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuningJobObjectEnum] to String,
/// and [decode] dynamic data back to [FineTuningJobObjectEnum].
class FineTuningJobObjectEnumTypeTransformer {
  factory FineTuningJobObjectEnumTypeTransformer() => _instance ??= const FineTuningJobObjectEnumTypeTransformer._();

  const FineTuningJobObjectEnumTypeTransformer._();

  String encode(FineTuningJobObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuningJobObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuningJobObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'fine_tuning.job': return FineTuningJobObjectEnum.fineTuningPeriodJob;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuningJobObjectEnumTypeTransformer] instance.
  static FineTuningJobObjectEnumTypeTransformer? _instance;
}


/// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
class FineTuningJobStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuningJobStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const validatingFiles = FineTuningJobStatusEnum._(r'validating_files');
  static const queued = FineTuningJobStatusEnum._(r'queued');
  static const running = FineTuningJobStatusEnum._(r'running');
  static const succeeded = FineTuningJobStatusEnum._(r'succeeded');
  static const failed = FineTuningJobStatusEnum._(r'failed');
  static const cancelled = FineTuningJobStatusEnum._(r'cancelled');

  /// List of all possible values in this [enum][FineTuningJobStatusEnum].
  static const values = <FineTuningJobStatusEnum>[
    validatingFiles,
    queued,
    running,
    succeeded,
    failed,
    cancelled,
  ];

  static FineTuningJobStatusEnum? fromJson(dynamic value) => FineTuningJobStatusEnumTypeTransformer().decode(value);

  static List<FineTuningJobStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuningJobStatusEnum] to String,
/// and [decode] dynamic data back to [FineTuningJobStatusEnum].
class FineTuningJobStatusEnumTypeTransformer {
  factory FineTuningJobStatusEnumTypeTransformer() => _instance ??= const FineTuningJobStatusEnumTypeTransformer._();

  const FineTuningJobStatusEnumTypeTransformer._();

  String encode(FineTuningJobStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuningJobStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuningJobStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'validating_files': return FineTuningJobStatusEnum.validatingFiles;
        case r'queued': return FineTuningJobStatusEnum.queued;
        case r'running': return FineTuningJobStatusEnum.running;
        case r'succeeded': return FineTuningJobStatusEnum.succeeded;
        case r'failed': return FineTuningJobStatusEnum.failed;
        case r'cancelled': return FineTuningJobStatusEnum.cancelled;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuningJobStatusEnumTypeTransformer] instance.
  static FineTuningJobStatusEnumTypeTransformer? _instance;
}


