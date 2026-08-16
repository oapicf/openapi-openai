//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_fine_tuning_job_request_hyperparameters_batch_size.g.dart';

/// Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
@BuiltValue()
abstract class CreateFineTuningJobRequestHyperparametersBatchSize implements Built<CreateFineTuningJobRequestHyperparametersBatchSize, CreateFineTuningJobRequestHyperparametersBatchSizeBuilder> {
  /// One Of [String], [int]
  OneOf get oneOf;

  CreateFineTuningJobRequestHyperparametersBatchSize._();

  factory CreateFineTuningJobRequestHyperparametersBatchSize([void updates(CreateFineTuningJobRequestHyperparametersBatchSizeBuilder b)]) = _$CreateFineTuningJobRequestHyperparametersBatchSize;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateFineTuningJobRequestHyperparametersBatchSizeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateFineTuningJobRequestHyperparametersBatchSize> get serializer => _$CreateFineTuningJobRequestHyperparametersBatchSizeSerializer();
}

class _$CreateFineTuningJobRequestHyperparametersBatchSizeSerializer implements PrimitiveSerializer<CreateFineTuningJobRequestHyperparametersBatchSize> {
  @override
  final Iterable<Type> types = const [CreateFineTuningJobRequestHyperparametersBatchSize, _$CreateFineTuningJobRequestHyperparametersBatchSize];

  @override
  final String wireName = r'CreateFineTuningJobRequestHyperparametersBatchSize';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateFineTuningJobRequestHyperparametersBatchSize object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateFineTuningJobRequestHyperparametersBatchSize object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateFineTuningJobRequestHyperparametersBatchSize deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateFineTuningJobRequestHyperparametersBatchSizeBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(int), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

