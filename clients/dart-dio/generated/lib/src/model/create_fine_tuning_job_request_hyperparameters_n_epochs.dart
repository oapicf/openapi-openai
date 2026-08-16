//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_fine_tuning_job_request_hyperparameters_n_epochs.g.dart';

/// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
@BuiltValue()
abstract class CreateFineTuningJobRequestHyperparametersNEpochs implements Built<CreateFineTuningJobRequestHyperparametersNEpochs, CreateFineTuningJobRequestHyperparametersNEpochsBuilder> {
  /// One Of [String], [int]
  OneOf get oneOf;

  CreateFineTuningJobRequestHyperparametersNEpochs._();

  factory CreateFineTuningJobRequestHyperparametersNEpochs([void updates(CreateFineTuningJobRequestHyperparametersNEpochsBuilder b)]) = _$CreateFineTuningJobRequestHyperparametersNEpochs;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateFineTuningJobRequestHyperparametersNEpochsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateFineTuningJobRequestHyperparametersNEpochs> get serializer => _$CreateFineTuningJobRequestHyperparametersNEpochsSerializer();
}

class _$CreateFineTuningJobRequestHyperparametersNEpochsSerializer implements PrimitiveSerializer<CreateFineTuningJobRequestHyperparametersNEpochs> {
  @override
  final Iterable<Type> types = const [CreateFineTuningJobRequestHyperparametersNEpochs, _$CreateFineTuningJobRequestHyperparametersNEpochs];

  @override
  final String wireName = r'CreateFineTuningJobRequestHyperparametersNEpochs';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateFineTuningJobRequestHyperparametersNEpochs object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateFineTuningJobRequestHyperparametersNEpochs object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateFineTuningJobRequestHyperparametersNEpochs deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateFineTuningJobRequestHyperparametersNEpochsBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(int), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

