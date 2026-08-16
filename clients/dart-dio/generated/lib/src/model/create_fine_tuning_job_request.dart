//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_fine_tuning_job_request_model.dart';
import 'package:openapi/src/model/fine_tune_method.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_integrations_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_fine_tuning_job_request.g.dart';

/// CreateFineTuningJobRequest
///
/// Properties:
/// * [model] 
/// * [trainingFile] - The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
/// * [hyperparameters] 
/// * [suffix] - A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
/// * [validationFile] - The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
/// * [integrations] - A list of integrations to enable for your fine-tuning job.
/// * [seed] - The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
/// * [method] 
@BuiltValue()
abstract class CreateFineTuningJobRequest implements Built<CreateFineTuningJobRequest, CreateFineTuningJobRequestBuilder> {
  @BuiltValueField(wireName: r'model')
  CreateFineTuningJobRequestModel get model;

  /// The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  @BuiltValueField(wireName: r'training_file')
  String get trainingFile;

  @Deprecated('hyperparameters has been deprecated')
  @BuiltValueField(wireName: r'hyperparameters')
  CreateFineTuningJobRequestHyperparameters? get hyperparameters;

  /// A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
  @BuiltValueField(wireName: r'suffix')
  String? get suffix;

  /// The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  @BuiltValueField(wireName: r'validation_file')
  String? get validationFile;

  /// A list of integrations to enable for your fine-tuning job.
  @BuiltValueField(wireName: r'integrations')
  BuiltList<CreateFineTuningJobRequestIntegrationsInner>? get integrations;

  /// The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
  @BuiltValueField(wireName: r'seed')
  int? get seed;

  @BuiltValueField(wireName: r'method')
  FineTuneMethod? get method;

  CreateFineTuningJobRequest._();

  factory CreateFineTuningJobRequest([void updates(CreateFineTuningJobRequestBuilder b)]) = _$CreateFineTuningJobRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateFineTuningJobRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateFineTuningJobRequest> get serializer => _$CreateFineTuningJobRequestSerializer();
}

class _$CreateFineTuningJobRequestSerializer implements PrimitiveSerializer<CreateFineTuningJobRequest> {
  @override
  final Iterable<Type> types = const [CreateFineTuningJobRequest, _$CreateFineTuningJobRequest];

  @override
  final String wireName = r'CreateFineTuningJobRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateFineTuningJobRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(CreateFineTuningJobRequestModel),
    );
    yield r'training_file';
    yield serializers.serialize(
      object.trainingFile,
      specifiedType: const FullType(String),
    );
    if (object.hyperparameters != null) {
      yield r'hyperparameters';
      yield serializers.serialize(
        object.hyperparameters,
        specifiedType: const FullType(CreateFineTuningJobRequestHyperparameters),
      );
    }
    if (object.suffix != null) {
      yield r'suffix';
      yield serializers.serialize(
        object.suffix,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.validationFile != null) {
      yield r'validation_file';
      yield serializers.serialize(
        object.validationFile,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.integrations != null) {
      yield r'integrations';
      yield serializers.serialize(
        object.integrations,
        specifiedType: const FullType.nullable(BuiltList, [FullType(CreateFineTuningJobRequestIntegrationsInner)]),
      );
    }
    if (object.seed != null) {
      yield r'seed';
      yield serializers.serialize(
        object.seed,
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
    CreateFineTuningJobRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateFineTuningJobRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateFineTuningJobRequestModel),
          ) as CreateFineTuningJobRequestModel;
          result.model.replace(valueDes);
          break;
        case r'training_file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.trainingFile = valueDes;
          break;
        case r'hyperparameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateFineTuningJobRequestHyperparameters),
          ) as CreateFineTuningJobRequestHyperparameters;
          result.hyperparameters.replace(valueDes);
          break;
        case r'suffix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.suffix = valueDes;
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
            specifiedType: const FullType.nullable(BuiltList, [FullType(CreateFineTuningJobRequestIntegrationsInner)]),
          ) as BuiltList<CreateFineTuningJobRequestIntegrationsInner>?;
          if (valueDes == null) continue;
          result.integrations.replace(valueDes);
          break;
        case r'seed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.seed = valueDes;
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
  CreateFineTuningJobRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateFineTuningJobRequestBuilder();
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

