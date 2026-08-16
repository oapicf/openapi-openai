//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'fine_tune_dpo_method_hyperparameters_batch_size.g.dart';

/// Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
@BuiltValue()
abstract class FineTuneDPOMethodHyperparametersBatchSize implements Built<FineTuneDPOMethodHyperparametersBatchSize, FineTuneDPOMethodHyperparametersBatchSizeBuilder> {
  /// One Of [String], [int]
  OneOf get oneOf;

  FineTuneDPOMethodHyperparametersBatchSize._();

  factory FineTuneDPOMethodHyperparametersBatchSize([void updates(FineTuneDPOMethodHyperparametersBatchSizeBuilder b)]) = _$FineTuneDPOMethodHyperparametersBatchSize;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneDPOMethodHyperparametersBatchSizeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneDPOMethodHyperparametersBatchSize> get serializer => _$FineTuneDPOMethodHyperparametersBatchSizeSerializer();
}

class _$FineTuneDPOMethodHyperparametersBatchSizeSerializer implements PrimitiveSerializer<FineTuneDPOMethodHyperparametersBatchSize> {
  @override
  final Iterable<Type> types = const [FineTuneDPOMethodHyperparametersBatchSize, _$FineTuneDPOMethodHyperparametersBatchSize];

  @override
  final String wireName = r'FineTuneDPOMethodHyperparametersBatchSize';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersBatchSize object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersBatchSize object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  FineTuneDPOMethodHyperparametersBatchSize deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneDPOMethodHyperparametersBatchSizeBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(int), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

