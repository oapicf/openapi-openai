//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'fine_tune_dpo_method_hyperparameters_n_epochs.g.dart';

/// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
@BuiltValue()
abstract class FineTuneDPOMethodHyperparametersNEpochs implements Built<FineTuneDPOMethodHyperparametersNEpochs, FineTuneDPOMethodHyperparametersNEpochsBuilder> {
  /// One Of [String], [int]
  OneOf get oneOf;

  FineTuneDPOMethodHyperparametersNEpochs._();

  factory FineTuneDPOMethodHyperparametersNEpochs([void updates(FineTuneDPOMethodHyperparametersNEpochsBuilder b)]) = _$FineTuneDPOMethodHyperparametersNEpochs;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneDPOMethodHyperparametersNEpochsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneDPOMethodHyperparametersNEpochs> get serializer => _$FineTuneDPOMethodHyperparametersNEpochsSerializer();
}

class _$FineTuneDPOMethodHyperparametersNEpochsSerializer implements PrimitiveSerializer<FineTuneDPOMethodHyperparametersNEpochs> {
  @override
  final Iterable<Type> types = const [FineTuneDPOMethodHyperparametersNEpochs, _$FineTuneDPOMethodHyperparametersNEpochs];

  @override
  final String wireName = r'FineTuneDPOMethodHyperparametersNEpochs';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersNEpochs object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneDPOMethodHyperparametersNEpochs object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  FineTuneDPOMethodHyperparametersNEpochs deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneDPOMethodHyperparametersNEpochsBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(int), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

