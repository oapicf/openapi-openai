//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.g.dart';

/// Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
@BuiltValue()
abstract class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier implements Built<CreateFineTuningJobRequestHyperparametersLearningRateMultiplier, CreateFineTuningJobRequestHyperparametersLearningRateMultiplierBuilder> {
  /// One Of [String], [num]
  OneOf get oneOf;

  CreateFineTuningJobRequestHyperparametersLearningRateMultiplier._();

  factory CreateFineTuningJobRequestHyperparametersLearningRateMultiplier([void updates(CreateFineTuningJobRequestHyperparametersLearningRateMultiplierBuilder b)]) = _$CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateFineTuningJobRequestHyperparametersLearningRateMultiplierBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateFineTuningJobRequestHyperparametersLearningRateMultiplier> get serializer => _$CreateFineTuningJobRequestHyperparametersLearningRateMultiplierSerializer();
}

class _$CreateFineTuningJobRequestHyperparametersLearningRateMultiplierSerializer implements PrimitiveSerializer<CreateFineTuningJobRequestHyperparametersLearningRateMultiplier> {
  @override
  final Iterable<Type> types = const [CreateFineTuningJobRequestHyperparametersLearningRateMultiplier, _$CreateFineTuningJobRequestHyperparametersLearningRateMultiplier];

  @override
  final String wireName = r'CreateFineTuningJobRequestHyperparametersLearningRateMultiplier';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplier object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplier object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateFineTuningJobRequestHyperparametersLearningRateMultiplier deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateFineTuningJobRequestHyperparametersLearningRateMultiplierBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(num), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

