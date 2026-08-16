//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepObject {
  /// Returns a new [RunStepObject] instance.
  RunStepObject({
    required this.id,
    required this.object,
    required this.createdAt,
    required this.assistantId,
    required this.threadId,
    required this.runId,
    required this.type,
    required this.status,
    required this.stepDetails,
    required this.lastError,
    required this.expiredAt,
    required this.cancelledAt,
    required this.failedAt,
    required this.completedAt,
    required this.metadata,
    required this.usage,
  });

  /// The identifier of the run step, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `thread.run.step`.
  RunStepObjectObjectEnum object;

  /// The Unix timestamp (in seconds) for when the run step was created.
  int createdAt;

  /// The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
  String assistantId;

  /// The ID of the [thread](/docs/api-reference/threads) that was run.
  String threadId;

  /// The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
  String runId;

  /// The type of run step, which can be either `message_creation` or `tool_calls`.
  RunStepObjectTypeEnum type;

  /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  RunStepObjectStatusEnum status;

  RunStepObjectStepDetails stepDetails;

  RunStepObjectLastError? lastError;

  /// The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
  int? expiredAt;

  /// The Unix timestamp (in seconds) for when the run step was cancelled.
  int? cancelledAt;

  /// The Unix timestamp (in seconds) for when the run step failed.
  int? failedAt;

  /// The Unix timestamp (in seconds) for when the run step completed.
  int? completedAt;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  RunStepCompletionUsage? usage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepObject &&
    other.id == id &&
    other.object == object &&
    other.createdAt == createdAt &&
    other.assistantId == assistantId &&
    other.threadId == threadId &&
    other.runId == runId &&
    other.type == type &&
    other.status == status &&
    other.stepDetails == stepDetails &&
    other.lastError == lastError &&
    other.expiredAt == expiredAt &&
    other.cancelledAt == cancelledAt &&
    other.failedAt == failedAt &&
    other.completedAt == completedAt &&
    other.metadata == metadata &&
    other.usage == usage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (createdAt.hashCode) +
    (assistantId.hashCode) +
    (threadId.hashCode) +
    (runId.hashCode) +
    (type.hashCode) +
    (status.hashCode) +
    (stepDetails.hashCode) +
    (lastError == null ? 0 : lastError!.hashCode) +
    (expiredAt == null ? 0 : expiredAt!.hashCode) +
    (cancelledAt == null ? 0 : cancelledAt!.hashCode) +
    (failedAt == null ? 0 : failedAt!.hashCode) +
    (completedAt == null ? 0 : completedAt!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode) +
    (usage == null ? 0 : usage!.hashCode);

  @override
  String toString() => 'RunStepObject[id=$id, object=$object, createdAt=$createdAt, assistantId=$assistantId, threadId=$threadId, runId=$runId, type=$type, status=$status, stepDetails=$stepDetails, lastError=$lastError, expiredAt=$expiredAt, cancelledAt=$cancelledAt, failedAt=$failedAt, completedAt=$completedAt, metadata=$metadata, usage=$usage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'created_at'] = this.createdAt;
      json[r'assistant_id'] = this.assistantId;
      json[r'thread_id'] = this.threadId;
      json[r'run_id'] = this.runId;
      json[r'type'] = this.type;
      json[r'status'] = this.status;
      json[r'step_details'] = this.stepDetails;
    if (this.lastError != null) {
      json[r'last_error'] = this.lastError;
    } else {
      json[r'last_error'] = null;
    }
    if (this.expiredAt != null) {
      json[r'expired_at'] = this.expiredAt;
    } else {
      json[r'expired_at'] = null;
    }
    if (this.cancelledAt != null) {
      json[r'cancelled_at'] = this.cancelledAt;
    } else {
      json[r'cancelled_at'] = null;
    }
    if (this.failedAt != null) {
      json[r'failed_at'] = this.failedAt;
    } else {
      json[r'failed_at'] = null;
    }
    if (this.completedAt != null) {
      json[r'completed_at'] = this.completedAt;
    } else {
      json[r'completed_at'] = null;
    }
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
    if (this.usage != null) {
      json[r'usage'] = this.usage;
    } else {
      json[r'usage'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: RunStepObjectObjectEnum.fromJson(json[r'object'])!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        assistantId: mapValueOfType<String>(json, r'assistant_id')!,
        threadId: mapValueOfType<String>(json, r'thread_id')!,
        runId: mapValueOfType<String>(json, r'run_id')!,
        type: RunStepObjectTypeEnum.fromJson(json[r'type'])!,
        status: RunStepObjectStatusEnum.fromJson(json[r'status'])!,
        stepDetails: RunStepObjectStepDetails.fromJson(json[r'step_details'])!,
        lastError: RunStepObjectLastError.fromJson(json[r'last_error']),
        expiredAt: mapValueOfType<int>(json, r'expired_at'),
        cancelledAt: mapValueOfType<int>(json, r'cancelled_at'),
        failedAt: mapValueOfType<int>(json, r'failed_at'),
        completedAt: mapValueOfType<int>(json, r'completed_at'),
        metadata: mapValueOfType<Object>(json, r'metadata'),
        usage: RunStepCompletionUsage.fromJson(json[r'usage']),
      );
    }
    return null;
  }

  static List<RunStepObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepObject> mapFromJson(dynamic json) {
    final map = <String, RunStepObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepObject-objects as value to a dart map
  static Map<String, List<RunStepObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'created_at',
    'assistant_id',
    'thread_id',
    'run_id',
    'type',
    'status',
    'step_details',
    'last_error',
    'expired_at',
    'cancelled_at',
    'failed_at',
    'completed_at',
    'metadata',
    'usage',
  };
}

/// The object type, which is always `thread.run.step`.
class RunStepObjectObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepObjectObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodStep = RunStepObjectObjectEnum._(r'thread.run.step');

  /// List of all possible values in this [enum][RunStepObjectObjectEnum].
  static const values = <RunStepObjectObjectEnum>[
    threadPeriodRunPeriodStep,
  ];

  static RunStepObjectObjectEnum? fromJson(dynamic value) => RunStepObjectObjectEnumTypeTransformer().decode(value);

  static List<RunStepObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepObjectObjectEnum] to String,
/// and [decode] dynamic data back to [RunStepObjectObjectEnum].
class RunStepObjectObjectEnumTypeTransformer {
  factory RunStepObjectObjectEnumTypeTransformer() => _instance ??= const RunStepObjectObjectEnumTypeTransformer._();

  const RunStepObjectObjectEnumTypeTransformer._();

  String encode(RunStepObjectObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepObjectObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.step': return RunStepObjectObjectEnum.threadPeriodRunPeriodStep;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepObjectObjectEnumTypeTransformer] instance.
  static RunStepObjectObjectEnumTypeTransformer? _instance;
}


/// The type of run step, which can be either `message_creation` or `tool_calls`.
class RunStepObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const messageCreation = RunStepObjectTypeEnum._(r'message_creation');
  static const toolCalls = RunStepObjectTypeEnum._(r'tool_calls');

  /// List of all possible values in this [enum][RunStepObjectTypeEnum].
  static const values = <RunStepObjectTypeEnum>[
    messageCreation,
    toolCalls,
  ];

  static RunStepObjectTypeEnum? fromJson(dynamic value) => RunStepObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepObjectTypeEnum].
class RunStepObjectTypeEnumTypeTransformer {
  factory RunStepObjectTypeEnumTypeTransformer() => _instance ??= const RunStepObjectTypeEnumTypeTransformer._();

  const RunStepObjectTypeEnumTypeTransformer._();

  String encode(RunStepObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'message_creation': return RunStepObjectTypeEnum.messageCreation;
        case r'tool_calls': return RunStepObjectTypeEnum.toolCalls;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepObjectTypeEnumTypeTransformer] instance.
  static RunStepObjectTypeEnumTypeTransformer? _instance;
}


/// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
class RunStepObjectStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepObjectStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inProgress = RunStepObjectStatusEnum._(r'in_progress');
  static const cancelled = RunStepObjectStatusEnum._(r'cancelled');
  static const failed = RunStepObjectStatusEnum._(r'failed');
  static const completed = RunStepObjectStatusEnum._(r'completed');
  static const expired = RunStepObjectStatusEnum._(r'expired');

  /// List of all possible values in this [enum][RunStepObjectStatusEnum].
  static const values = <RunStepObjectStatusEnum>[
    inProgress,
    cancelled,
    failed,
    completed,
    expired,
  ];

  static RunStepObjectStatusEnum? fromJson(dynamic value) => RunStepObjectStatusEnumTypeTransformer().decode(value);

  static List<RunStepObjectStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObjectStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObjectStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepObjectStatusEnum] to String,
/// and [decode] dynamic data back to [RunStepObjectStatusEnum].
class RunStepObjectStatusEnumTypeTransformer {
  factory RunStepObjectStatusEnumTypeTransformer() => _instance ??= const RunStepObjectStatusEnumTypeTransformer._();

  const RunStepObjectStatusEnumTypeTransformer._();

  String encode(RunStepObjectStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepObjectStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepObjectStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'in_progress': return RunStepObjectStatusEnum.inProgress;
        case r'cancelled': return RunStepObjectStatusEnum.cancelled;
        case r'failed': return RunStepObjectStatusEnum.failed;
        case r'completed': return RunStepObjectStatusEnum.completed;
        case r'expired': return RunStepObjectStatusEnum.expired;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepObjectStatusEnumTypeTransformer] instance.
  static RunStepObjectStatusEnumTypeTransformer? _instance;
}


