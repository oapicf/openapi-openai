//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'fine_tune_dpo_method_hyperparameters_learning_rate_multiplier.g.dart';

/// Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
@BuiltValue()
abstract class FineTuneDPOMethodHyperparametersLearningRateMultiplier implements Built<FineTuneDPOMethodHyperparametersLearningRateMultiplier, FineTuneDPOMethodHyperparametersLearningRateMultiplierBuilder> {
  /// One Of [String], [num]
  OneOf get oneOf;

  FineTuneDPOMethodHyperparametersLearningRateMultiplier._();

  factory FineTuneDPOMethodHyperparametersLearningRateMultiplier([void updates(FineTuneDPOMethodHyperparametersLearningRateMultiplierBuilder b)]) = _$FineTuneDPOMethodHyperparametersLearningRateMultiplier;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneDPOMethodHyperparametersLearningRateMultiplierBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneDPOMethodHyperparametersLearningRateMultiplier> get serializer => _$FineTuneDPOMethodHyperparametersLearningRateMultiplierSerializer();
}

class _$FineTuneDPOMethodHyperparametersLearningRateMultiplierSerializer implements PrimitiveSerializer<FineTuneDPOMethodHyperparametersLearningRateMultiplier> {
  @override
  final Iterable<Type> types = const [FineTuneDPOMethodHyperparametersLearningRateMultiplier, _$FineTuneDPOMethodHyperparametersLearningRateMultiplier];

  @override
  final String wireName = r'FineTuneDPOMethodHyperparametersLearningRateMultiplier';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersLearningRateMultiplier object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersLearningRateMultiplier object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  FineTuneDPOMethodHyperparametersLearningRateMultiplier deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneDPOMethodHyperparametersLearningRateMultiplierBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(num), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

