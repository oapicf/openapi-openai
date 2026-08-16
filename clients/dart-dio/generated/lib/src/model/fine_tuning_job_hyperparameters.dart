//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters_batch_size.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters_n_epochs.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tuning_job_hyperparameters.g.dart';

/// The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
///
/// Properties:
/// * [batchSize] 
/// * [learningRateMultiplier] 
/// * [nEpochs] 
@BuiltValue()
abstract class FineTuningJobHyperparameters implements Built<FineTuningJobHyperparameters, FineTuningJobHyperparametersBuilder> {
  @BuiltValueField(wireName: r'batch_size')
  CreateFineTuningJobRequestHyperparametersBatchSize? get batchSize;

  @BuiltValueField(wireName: r'learning_rate_multiplier')
  CreateFineTuningJobRequestHyperparametersLearningRateMultiplier? get learningRateMultiplier;

  @BuiltValueField(wireName: r'n_epochs')
  CreateFineTuningJobRequestHyperparametersNEpochs? get nEpochs;

  FineTuningJobHyperparameters._();

  factory FineTuningJobHyperparameters([void updates(FineTuningJobHyperparametersBuilder b)]) = _$FineTuningJobHyperparameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningJobHyperparametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningJobHyperparameters> get serializer => _$FineTuningJobHyperparametersSerializer();
}

class _$FineTuningJobHyperparametersSerializer implements PrimitiveSerializer<FineTuningJobHyperparameters> {
  @override
  final Iterable<Type> types = const [FineTuningJobHyperparameters, _$FineTuningJobHyperparameters];

  @override
  final String wireName = r'FineTuningJobHyperparameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningJobHyperparameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.batchSize != null) {
      yield r'batch_size';
      yield serializers.serialize(
        object.batchSize,
        specifiedType: const FullType(CreateFineTuningJobRequestHyperparametersBatchSize),
      );
    }
    if (object.learningRateMultiplier != null) {
      yield r'learning_rate_multiplier';
      yield serializers.serialize(
        object.learningRateMultiplier,
        specifiedType: const FullType(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier),
      );
    }
    if (object.nEpochs != null) {
      yield r'n_epochs';
      yield serializers.serialize(
        object.nEpochs,
        specifiedType: const FullType(CreateFineTuningJobRequestHyperparametersNEpochs),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningJobHyperparameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuningJobHyperparametersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'batch_size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateFineTuningJobRequestHyperparametersBatchSize),
          ) as CreateFineTuningJobRequestHyperparametersBatchSize;
          result.batchSize.replace(valueDes);
          break;
        case r'learning_rate_multiplier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier),
          ) as CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
          result.learningRateMultiplier.replace(valueDes);
          break;
        case r'n_epochs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateFineTuningJobRequestHyperparametersNEpochs),
          ) as CreateFineTuningJobRequestHyperparametersNEpochs;
          result.nEpochs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuningJobHyperparameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningJobHyperparametersBuilder();
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

