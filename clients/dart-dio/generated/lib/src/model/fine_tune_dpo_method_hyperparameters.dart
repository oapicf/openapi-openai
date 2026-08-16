//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_learning_rate_multiplier.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_n_epochs.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_beta.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_batch_size.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tune_dpo_method_hyperparameters.g.dart';

/// The hyperparameters used for the fine-tuning job.
///
/// Properties:
/// * [beta] 
/// * [batchSize] 
/// * [learningRateMultiplier] 
/// * [nEpochs] 
@BuiltValue()
abstract class FineTuneDPOMethodHyperparameters implements Built<FineTuneDPOMethodHyperparameters, FineTuneDPOMethodHyperparametersBuilder> {
  @BuiltValueField(wireName: r'beta')
  FineTuneDPOMethodHyperparametersBeta? get beta;

  @BuiltValueField(wireName: r'batch_size')
  FineTuneDPOMethodHyperparametersBatchSize? get batchSize;

  @BuiltValueField(wireName: r'learning_rate_multiplier')
  FineTuneDPOMethodHyperparametersLearningRateMultiplier? get learningRateMultiplier;

  @BuiltValueField(wireName: r'n_epochs')
  FineTuneDPOMethodHyperparametersNEpochs? get nEpochs;

  FineTuneDPOMethodHyperparameters._();

  factory FineTuneDPOMethodHyperparameters([void updates(FineTuneDPOMethodHyperparametersBuilder b)]) = _$FineTuneDPOMethodHyperparameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneDPOMethodHyperparametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneDPOMethodHyperparameters> get serializer => _$FineTuneDPOMethodHyperparametersSerializer();
}

class _$FineTuneDPOMethodHyperparametersSerializer implements PrimitiveSerializer<FineTuneDPOMethodHyperparameters> {
  @override
  final Iterable<Type> types = const [FineTuneDPOMethodHyperparameters, _$FineTuneDPOMethodHyperparameters];

  @override
  final String wireName = r'FineTuneDPOMethodHyperparameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneDPOMethodHyperparameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.beta != null) {
      yield r'beta';
      yield serializers.serialize(
        object.beta,
        specifiedType: const FullType(FineTuneDPOMethodHyperparametersBeta),
      );
    }
    if (object.batchSize != null) {
      yield r'batch_size';
      yield serializers.serialize(
        object.batchSize,
        specifiedType: const FullType(FineTuneDPOMethodHyperparametersBatchSize),
      );
    }
    if (object.learningRateMultiplier != null) {
      yield r'learning_rate_multiplier';
      yield serializers.serialize(
        object.learningRateMultiplier,
        specifiedType: const FullType(FineTuneDPOMethodHyperparametersLearningRateMultiplier),
      );
    }
    if (object.nEpochs != null) {
      yield r'n_epochs';
      yield serializers.serialize(
        object.nEpochs,
        specifiedType: const FullType(FineTuneDPOMethodHyperparametersNEpochs),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneDPOMethodHyperparameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuneDPOMethodHyperparametersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'beta':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuneDPOMethodHyperparametersBeta),
          ) as FineTuneDPOMethodHyperparametersBeta;
          result.beta.replace(valueDes);
          break;
        case r'batch_size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuneDPOMethodHyperparametersBatchSize),
          ) as FineTuneDPOMethodHyperparametersBatchSize;
          result.batchSize.replace(valueDes);
          break;
        case r'learning_rate_multiplier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuneDPOMethodHyperparametersLearningRateMultiplier),
          ) as FineTuneDPOMethodHyperparametersLearningRateMultiplier;
          result.learningRateMultiplier.replace(valueDes);
          break;
        case r'n_epochs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuneDPOMethodHyperparametersNEpochs),
          ) as FineTuneDPOMethodHyperparametersNEpochs;
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
  FineTuneDPOMethodHyperparameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneDPOMethodHyperparametersBuilder();
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

