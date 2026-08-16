//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunObject {
  /// Returns a new [RunObject] instance.
  RunObject({
    required this.id,
    required this.object,
    required this.createdAt,
    required this.threadId,
    required this.assistantId,
    required this.status,
    required this.requiredAction,
    required this.lastError,
    required this.expiresAt,
    required this.startedAt,
    required this.cancelledAt,
    required this.failedAt,
    required this.completedAt,
    required this.incompleteDetails,
    required this.model,
    required this.instructions,
    this.tools = const [],
    required this.metadata,
    required this.usage,
    this.temperature,
    this.topP,
    required this.maxPromptTokens,
    required this.maxCompletionTokens,
    required this.truncationStrategy,
    required this.toolChoice,
    this.parallelToolCalls = true,
    required this.responseFormat,
  });

  /// The identifier, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `thread.run`.
  RunObjectObjectEnum object;

  /// The Unix timestamp (in seconds) for when the run was created.
  int createdAt;

  /// The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
  String threadId;

  /// The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
  String assistantId;

  /// The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
  RunObjectStatusEnum status;

  RunObjectRequiredAction? requiredAction;

  RunObjectLastError? lastError;

  /// The Unix timestamp (in seconds) for when the run will expire.
  int? expiresAt;

  /// The Unix timestamp (in seconds) for when the run was started.
  int? startedAt;

  /// The Unix timestamp (in seconds) for when the run was cancelled.
  int? cancelledAt;

  /// The Unix timestamp (in seconds) for when the run failed.
  int? failedAt;

  /// The Unix timestamp (in seconds) for when the run was completed.
  int? completedAt;

  RunObjectIncompleteDetails? incompleteDetails;

  /// The model that the [assistant](/docs/api-reference/assistants) used for this run.
  String model;

  /// The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
  String instructions;

  /// The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
  List<AssistantObjectToolsInner> tools;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  RunCompletionUsage? usage;

  /// The sampling temperature used for this run. If not set, defaults to 1.
  num? temperature;

  /// The nucleus sampling value used for this run. If not set, defaults to 1.
  num? topP;

  /// The maximum number of prompt tokens specified to have been used over the course of the run. 
  ///
  /// Minimum value: 256
  int? maxPromptTokens;

  /// The maximum number of completion tokens specified to have been used over the course of the run. 
  ///
  /// Minimum value: 256
  int? maxCompletionTokens;

  TruncationObject truncationStrategy;

  AssistantsApiToolChoiceOption toolChoice;

  /// Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  bool parallelToolCalls;

  AssistantsApiResponseFormatOption responseFormat;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunObject &&
    other.id == id &&
    other.object == object &&
    other.createdAt == createdAt &&
    other.threadId == threadId &&
    other.assistantId == assistantId &&
    other.status == status &&
    other.requiredAction == requiredAction &&
    other.lastError == lastError &&
    other.expiresAt == expiresAt &&
    other.startedAt == startedAt &&
    other.cancelledAt == cancelledAt &&
    other.failedAt == failedAt &&
    other.completedAt == completedAt &&
    other.incompleteDetails == incompleteDetails &&
    other.model == model &&
    other.instructions == instructions &&
    _deepEquality.equals(other.tools, tools) &&
    other.metadata == metadata &&
    other.usage == usage &&
    other.temperature == temperature &&
    other.topP == topP &&
    other.maxPromptTokens == maxPromptTokens &&
    other.maxCompletionTokens == maxCompletionTokens &&
    other.truncationStrategy == truncationStrategy &&
    other.toolChoice == toolChoice &&
    other.parallelToolCalls == parallelToolCalls &&
    other.responseFormat == responseFormat;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (createdAt.hashCode) +
    (threadId.hashCode) +
    (assistantId.hashCode) +
    (status.hashCode) +
    (requiredAction == null ? 0 : requiredAction!.hashCode) +
    (lastError == null ? 0 : lastError!.hashCode) +
    (expiresAt == null ? 0 : expiresAt!.hashCode) +
    (startedAt == null ? 0 : startedAt!.hashCode) +
    (cancelledAt == null ? 0 : cancelledAt!.hashCode) +
    (failedAt == null ? 0 : failedAt!.hashCode) +
    (completedAt == null ? 0 : completedAt!.hashCode) +
    (incompleteDetails == null ? 0 : incompleteDetails!.hashCode) +
    (model.hashCode) +
    (instructions.hashCode) +
    (tools.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode) +
    (usage == null ? 0 : usage!.hashCode) +
    (temperature == null ? 0 : temperature!.hashCode) +
    (topP == null ? 0 : topP!.hashCode) +
    (maxPromptTokens == null ? 0 : maxPromptTokens!.hashCode) +
    (maxCompletionTokens == null ? 0 : maxCompletionTokens!.hashCode) +
    (truncationStrategy.hashCode) +
    (toolChoice.hashCode) +
    (parallelToolCalls.hashCode) +
    (responseFormat.hashCode);

  @override
  String toString() => 'RunObject[id=$id, object=$object, createdAt=$createdAt, threadId=$threadId, assistantId=$assistantId, status=$status, requiredAction=$requiredAction, lastError=$lastError, expiresAt=$expiresAt, startedAt=$startedAt, cancelledAt=$cancelledAt, failedAt=$failedAt, completedAt=$completedAt, incompleteDetails=$incompleteDetails, model=$model, instructions=$instructions, tools=$tools, metadata=$metadata, usage=$usage, temperature=$temperature, topP=$topP, maxPromptTokens=$maxPromptTokens, maxCompletionTokens=$maxCompletionTokens, truncationStrategy=$truncationStrategy, toolChoice=$toolChoice, parallelToolCalls=$parallelToolCalls, responseFormat=$responseFormat]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'created_at'] = this.createdAt;
      json[r'thread_id'] = this.threadId;
      json[r'assistant_id'] = this.assistantId;
      json[r'status'] = this.status;
    if (this.requiredAction != null) {
      json[r'required_action'] = this.requiredAction;
    } else {
      json[r'required_action'] = null;
    }
    if (this.lastError != null) {
      json[r'last_error'] = this.lastError;
    } else {
      json[r'last_error'] = null;
    }
    if (this.expiresAt != null) {
      json[r'expires_at'] = this.expiresAt;
    } else {
      json[r'expires_at'] = null;
    }
    if (this.startedAt != null) {
      json[r'started_at'] = this.startedAt;
    } else {
      json[r'started_at'] = null;
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
    if (this.incompleteDetails != null) {
      json[r'incomplete_details'] = this.incompleteDetails;
    } else {
      json[r'incomplete_details'] = null;
    }
      json[r'model'] = this.model;
      json[r'instructions'] = this.instructions;
      json[r'tools'] = this.tools;
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
    if (this.temperature != null) {
      json[r'temperature'] = this.temperature;
    } else {
      json[r'temperature'] = null;
    }
    if (this.topP != null) {
      json[r'top_p'] = this.topP;
    } else {
      json[r'top_p'] = null;
    }
    if (this.maxPromptTokens != null) {
      json[r'max_prompt_tokens'] = this.maxPromptTokens;
    } else {
      json[r'max_prompt_tokens'] = null;
    }
    if (this.maxCompletionTokens != null) {
      json[r'max_completion_tokens'] = this.maxCompletionTokens;
    } else {
      json[r'max_completion_tokens'] = null;
    }
      json[r'truncation_strategy'] = this.truncationStrategy;
      json[r'tool_choice'] = this.toolChoice;
      json[r'parallel_tool_calls'] = this.parallelToolCalls;
      json[r'response_format'] = this.responseFormat;
    return json;
  }

  /// Returns a new [RunObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: RunObjectObjectEnum.fromJson(json[r'object'])!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        threadId: mapValueOfType<String>(json, r'thread_id')!,
        assistantId: mapValueOfType<String>(json, r'assistant_id')!,
        status: RunObjectStatusEnum.fromJson(json[r'status'])!,
        requiredAction: RunObjectRequiredAction.fromJson(json[r'required_action']),
        lastError: RunObjectLastError.fromJson(json[r'last_error']),
        expiresAt: mapValueOfType<int>(json, r'expires_at'),
        startedAt: mapValueOfType<int>(json, r'started_at'),
        cancelledAt: mapValueOfType<int>(json, r'cancelled_at'),
        failedAt: mapValueOfType<int>(json, r'failed_at'),
        completedAt: mapValueOfType<int>(json, r'completed_at'),
        incompleteDetails: RunObjectIncompleteDetails.fromJson(json[r'incomplete_details']),
        model: mapValueOfType<String>(json, r'model')!,
        instructions: mapValueOfType<String>(json, r'instructions')!,
        tools: AssistantObjectToolsInner.listFromJson(json[r'tools']),
        metadata: mapValueOfType<Object>(json, r'metadata'),
        usage: RunCompletionUsage.fromJson(json[r'usage']),
        temperature: json[r'temperature'] == null
            ? null
            : num.parse('${json[r'temperature']}'),
        topP: json[r'top_p'] == null
            ? null
            : num.parse('${json[r'top_p']}'),
        maxPromptTokens: mapValueOfType<int>(json, r'max_prompt_tokens'),
        maxCompletionTokens: mapValueOfType<int>(json, r'max_completion_tokens'),
        truncationStrategy: TruncationObject.fromJson(json[r'truncation_strategy'])!,
        toolChoice: AssistantsApiToolChoiceOption.fromJson(json[r'tool_choice'])!,
        parallelToolCalls: mapValueOfType<bool>(json, r'parallel_tool_calls')!,
        responseFormat: AssistantsApiResponseFormatOption.fromJson(json[r'response_format'])!,
      );
    }
    return null;
  }

  static List<RunObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunObject> mapFromJson(dynamic json) {
    final map = <String, RunObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunObject-objects as value to a dart map
  static Map<String, List<RunObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'created_at',
    'thread_id',
    'assistant_id',
    'status',
    'required_action',
    'last_error',
    'expires_at',
    'started_at',
    'cancelled_at',
    'failed_at',
    'completed_at',
    'incomplete_details',
    'model',
    'instructions',
    'tools',
    'metadata',
    'usage',
    'max_prompt_tokens',
    'max_completion_tokens',
    'truncation_strategy',
    'tool_choice',
    'parallel_tool_calls',
    'response_format',
  };
}

/// The object type, which is always `thread.run`.
class RunObjectObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const RunObjectObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRun = RunObjectObjectEnum._(r'thread.run');

  /// List of all possible values in this [enum][RunObjectObjectEnum].
  static const values = <RunObjectObjectEnum>[
    threadPeriodRun,
  ];

  static RunObjectObjectEnum? fromJson(dynamic value) => RunObjectObjectEnumTypeTransformer().decode(value);

  static List<RunObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunObjectObjectEnum] to String,
/// and [decode] dynamic data back to [RunObjectObjectEnum].
class RunObjectObjectEnumTypeTransformer {
  factory RunObjectObjectEnumTypeTransformer() => _instance ??= const RunObjectObjectEnumTypeTransformer._();

  const RunObjectObjectEnumTypeTransformer._();

  String encode(RunObjectObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunObjectObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run': return RunObjectObjectEnum.threadPeriodRun;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunObjectObjectEnumTypeTransformer] instance.
  static RunObjectObjectEnumTypeTransformer? _instance;
}


/// The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
class RunObjectStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const RunObjectStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const queued = RunObjectStatusEnum._(r'queued');
  static const inProgress = RunObjectStatusEnum._(r'in_progress');
  static const requiresAction = RunObjectStatusEnum._(r'requires_action');
  static const cancelling = RunObjectStatusEnum._(r'cancelling');
  static const cancelled = RunObjectStatusEnum._(r'cancelled');
  static const failed = RunObjectStatusEnum._(r'failed');
  static const completed = RunObjectStatusEnum._(r'completed');
  static const incomplete = RunObjectStatusEnum._(r'incomplete');
  static const expired = RunObjectStatusEnum._(r'expired');

  /// List of all possible values in this [enum][RunObjectStatusEnum].
  static const values = <RunObjectStatusEnum>[
    queued,
    inProgress,
    requiresAction,
    cancelling,
    cancelled,
    failed,
    completed,
    incomplete,
    expired,
  ];

  static RunObjectStatusEnum? fromJson(dynamic value) => RunObjectStatusEnumTypeTransformer().decode(value);

  static List<RunObjectStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunObjectStatusEnum] to String,
/// and [decode] dynamic data back to [RunObjectStatusEnum].
class RunObjectStatusEnumTypeTransformer {
  factory RunObjectStatusEnumTypeTransformer() => _instance ??= const RunObjectStatusEnumTypeTransformer._();

  const RunObjectStatusEnumTypeTransformer._();

  String encode(RunObjectStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunObjectStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunObjectStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'queued': return RunObjectStatusEnum.queued;
        case r'in_progress': return RunObjectStatusEnum.inProgress;
        case r'requires_action': return RunObjectStatusEnum.requiresAction;
        case r'cancelling': return RunObjectStatusEnum.cancelling;
        case r'cancelled': return RunObjectStatusEnum.cancelled;
        case r'failed': return RunObjectStatusEnum.failed;
        case r'completed': return RunObjectStatusEnum.completed;
        case r'incomplete': return RunObjectStatusEnum.incomplete;
        case r'expired': return RunObjectStatusEnum.expired;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunObjectStatusEnumTypeTransformer] instance.
  static RunObjectStatusEnumTypeTransformer? _instance;
}


