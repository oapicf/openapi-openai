//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'fine_tune_dpo_method_hyperparameters_beta.g.dart';

/// The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
@BuiltValue()
abstract class FineTuneDPOMethodHyperparametersBeta implements Built<FineTuneDPOMethodHyperparametersBeta, FineTuneDPOMethodHyperparametersBetaBuilder> {
  /// One Of [String], [num]
  OneOf get oneOf;

  FineTuneDPOMethodHyperparametersBeta._();

  factory FineTuneDPOMethodHyperparametersBeta([void updates(FineTuneDPOMethodHyperparametersBetaBuilder b)]) = _$FineTuneDPOMethodHyperparametersBeta;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneDPOMethodHyperparametersBetaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneDPOMethodHyperparametersBeta> get serializer => _$FineTuneDPOMethodHyperparametersBetaSerializer();
}

class _$FineTuneDPOMethodHyperparametersBetaSerializer implements PrimitiveSerializer<FineTuneDPOMethodHyperparametersBeta> {
  @override
  final Iterable<Type> types = const [FineTuneDPOMethodHyperparametersBeta, _$FineTuneDPOMethodHyperparametersBeta];

  @override
  final String wireName = r'FineTuneDPOMethodHyperparametersBeta';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersBeta object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersBeta object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  FineTuneDPOMethodHyperparametersBeta deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneDPOMethodHyperparametersBetaBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(num), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

