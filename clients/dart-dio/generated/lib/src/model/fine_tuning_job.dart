//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/fine_tune_method.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/fine_tuning_job_hyperparameters.dart';
import 'package:openapi/src/model/fine_tuning_job_error.dart';
import 'package:openapi/src/model/fine_tuning_job_integrations_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tuning_job.g.dart';

/// The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
///
/// Properties:
/// * [id] - The object identifier, which can be referenced in the API endpoints.
/// * [createdAt] - The Unix timestamp (in seconds) for when the fine-tuning job was created.
/// * [error] 
/// * [fineTunedModel] - The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
/// * [finishedAt] - The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
/// * [hyperparameters] 
/// * [model] - The base model that is being fine-tuned.
/// * [object] - The object type, which is always \"fine_tuning.job\".
/// * [organizationId] - The organization that owns the fine-tuning job.
/// * [resultFiles] - The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
/// * [status] - The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
/// * [trainedTokens] - The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
/// * [trainingFile] - The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
/// * [validationFile] - The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
/// * [integrations] - A list of integrations to enable for this fine-tuning job.
/// * [seed] - The seed used for the fine-tuning job.
/// * [estimatedFinish] - The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
/// * [method] 
@BuiltValue()
abstract class FineTuningJob implements Built<FineTuningJob, FineTuningJobBuilder> {
  /// The object identifier, which can be referenced in the API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  @BuiltValueField(wireName: r'error')
  FineTuningJobError? get error;

  /// The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
  @BuiltValueField(wireName: r'fine_tuned_model')
  String? get fineTunedModel;

  /// The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
  @BuiltValueField(wireName: r'finished_at')
  int? get finishedAt;

  @BuiltValueField(wireName: r'hyperparameters')
  FineTuningJobHyperparameters get hyperparameters;

  /// The base model that is being fine-tuned.
  @BuiltValueField(wireName: r'model')
  String get model;

  /// The object type, which is always \"fine_tuning.job\".
  @BuiltValueField(wireName: r'object')
  FineTuningJobObjectEnum get object;
  // enum objectEnum {  fine_tuning.job,  };

  /// The organization that owns the fine-tuning job.
  @BuiltValueField(wireName: r'organization_id')
  String get organizationId;

  /// The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
  @BuiltValueField(wireName: r'result_files')
  BuiltList<String> get resultFiles;

  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  @BuiltValueField(wireName: r'status')
  FineTuningJobStatusEnum get status;
  // enum statusEnum {  validating_files,  queued,  running,  succeeded,  failed,  cancelled,  };

  /// The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
  @BuiltValueField(wireName: r'trained_tokens')
  int? get trainedTokens;

  /// The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
  @BuiltValueField(wireName: r'training_file')
  String get trainingFile;

  /// The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
  @BuiltValueField(wireName: r'validation_file')
  String? get validationFile;

  /// A list of integrations to enable for this fine-tuning job.
  @BuiltValueField(wireName: r'integrations')
  BuiltList<FineTuningJobIntegrationsInner>? get integrations;

  /// The seed used for the fine-tuning job.
  @BuiltValueField(wireName: r'seed')
  int get seed;

  /// The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
  @BuiltValueField(wireName: r'estimated_finish')
  int? get estimatedFinish;

  @BuiltValueField(wireName: r'method')
  FineTuneMethod? get method;

  FineTuningJob._();

  factory FineTuningJob([void updates(FineTuningJobBuilder b)]) = _$FineTuningJob;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningJobBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningJob> get serializer => _$FineTuningJobSerializer();
}

class _$FineTuningJobSerializer implements PrimitiveSerializer<FineTuningJob> {
  @override
  final Iterable<Type> types = const [FineTuningJob, _$FineTuningJob];

  @override
  final String wireName = r'FineTuningJob';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningJob object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'error';
    yield object.error == null ? null : serializers.serialize(
      object.error,
      specifiedType: const FullType.nullable(FineTuningJobError),
    );
    yield r'fine_tuned_model';
    yield object.fineTunedModel == null ? null : serializers.serialize(
      object.fineTunedModel,
      specifiedType: const FullType.nullable(String),
    );
    yield r'finished_at';
    yield object.finishedAt == null ? null : serializers.serialize(
      object.finishedAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'hyperparameters';
    yield serializers.serialize(
      object.hyperparameters,
      specifiedType: const FullType(FineTuningJobHyperparameters),
    );
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(FineTuningJobObjectEnum),
    );
    yield r'organization_id';
    yield serializers.serialize(
      object.organizationId,
      specifiedType: const FullType(String),
    );
    yield r'result_files';
    yield serializers.serialize(
      object.resultFiles,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(FineTuningJobStatusEnum),
    );
    yield r'trained_tokens';
    yield object.trainedTokens == null ? null : serializers.serialize(
      object.trainedTokens,
      specifiedType: const FullType.nullable(int),
    );
    yield r'training_file';
    yield serializers.serialize(
      object.trainingFile,
      specifiedType: const FullType(String),
    );
    yield r'validation_file';
    yield object.validationFile == null ? null : serializers.serialize(
      object.validationFile,
      specifiedType: const FullType.nullable(String),
    );
    if (object.integrations != null) {
      yield r'integrations';
      yield serializers.serialize(
        object.integrations,
        specifiedType: const FullType.nullable(BuiltList, [FullType(FineTuningJobIntegrationsInner)]),
      );
    }
    yield r'seed';
    yield serializers.serialize(
      object.seed,
      specifiedType: const FullType(int),
    );
    if (object.estimatedFinish != null) {
      yield r'estimated_finish';
      yield serializers.serialize(
        object.estimatedFinish,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.method != null) {
      yield r'method';
      yield serializers.serialize(
        object.method,
        specifiedType: const FullType(FineTuneMethod),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningJob object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuningJobBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(FineTuningJobError),
          ) as FineTuningJobError?;
          if (valueDes == null) continue;
          result.error.replace(valueDes);
          break;
        case r'fine_tuned_model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.fineTunedModel = valueDes;
          break;
        case r'finished_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.finishedAt = valueDes;
          break;
        case r'hyperparameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobHyperparameters),
          ) as FineTuningJobHyperparameters;
          result.hyperparameters.replace(valueDes);
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.model = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobObjectEnum),
          ) as FineTuningJobObjectEnum;
          result.object = valueDes;
          break;
        case r'organization_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.organizationId = valueDes;
          break;
        case r'result_files':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.resultFiles.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobStatusEnum),
          ) as FineTuningJobStatusEnum;
          result.status = valueDes;
          break;
        case r'trained_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.trainedTokens = valueDes;
          break;
        case r'training_file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.trainingFile = valueDes;
          break;
        case r'validation_file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.validationFile = valueDes;
          break;
        case r'integrations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(FineTuningJobIntegrationsInner)]),
          ) as BuiltList<FineTuningJobIntegrationsInner>?;
          if (valueDes == null) continue;
          result.integrations.replace(valueDes);
          break;
        case r'seed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.seed = valueDes;
          break;
        case r'estimated_finish':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.estimatedFinish = valueDes;
          break;
        case r'method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuneMethod),
          ) as FineTuneMethod;
          result.method.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuningJob deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningJobBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

class FineTuningJobObjectEnum extends EnumClass {

  /// The object type, which is always \"fine_tuning.job\".
  @BuiltValueEnumConst(wireName: r'fine_tuning.job')
  static const FineTuningJobObjectEnum fineTuningPeriodJob = _$fineTuningJobObjectEnum_fineTuningPeriodJob;

  static Serializer<FineTuningJobObjectEnum> get serializer => _$fineTuningJobObjectEnumSerializer;

  const FineTuningJobObjectEnum._(String name): super(name);

  static BuiltSet<FineTuningJobObjectEnum> get values => _$fineTuningJobObjectEnumValues;
  static FineTuningJobObjectEnum valueOf(String name) => _$fineTuningJobObjectEnumValueOf(name);
}

class FineTuningJobStatusEnum extends EnumClass {

  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  @BuiltValueEnumConst(wireName: r'validating_files')
  static const FineTuningJobStatusEnum validatingFiles = _$fineTuningJobStatusEnum_validatingFiles;
  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  @BuiltValueEnumConst(wireName: r'queued')
  static const FineTuningJobStatusEnum queued = _$fineTuningJobStatusEnum_queued;
  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  @BuiltValueEnumConst(wireName: r'running')
  static const FineTuningJobStatusEnum running = _$fineTuningJobStatusEnum_running;
  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  @BuiltValueEnumConst(wireName: r'succeeded')
  static const FineTuningJobStatusEnum succeeded = _$fineTuningJobStatusEnum_succeeded;
  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  @BuiltValueEnumConst(wireName: r'failed')
  static const FineTuningJobStatusEnum failed = _$fineTuningJobStatusEnum_failed;
  /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  @BuiltValueEnumConst(wireName: r'cancelled')
  static const FineTuningJobStatusEnum cancelled = _$fineTuningJobStatusEnum_cancelled;

  static Serializer<FineTuningJobStatusEnum> get serializer => _$fineTuningJobStatusEnumSerializer;

  const FineTuningJobStatusEnum._(String name): super(name);

  static BuiltSet<FineTuningJobStatusEnum> get values => _$fineTuningJobStatusEnumValues;
  static FineTuningJobStatusEnum valueOf(String name) => _$fineTuningJobStatusEnumValueOf(name);
}

