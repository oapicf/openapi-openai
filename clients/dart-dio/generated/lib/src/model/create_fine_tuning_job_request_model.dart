//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_fine_tuning_job_request_model.g.dart';

/// The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
@BuiltValue()
abstract class CreateFineTuningJobRequestModel implements Built<CreateFineTuningJobRequestModel, CreateFineTuningJobRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateFineTuningJobRequestModel._();

  factory CreateFineTuningJobRequestModel([void updates(CreateFineTuningJobRequestModelBuilder b)]) = _$CreateFineTuningJobRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateFineTuningJobRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateFineTuningJobRequestModel> get serializer => _$CreateFineTuningJobRequestModelSerializer();
}

class _$CreateFineTuningJobRequestModelSerializer implements PrimitiveSerializer<CreateFineTuningJobRequestModel> {
  @override
  final Iterable<Type> types = const [CreateFineTuningJobRequestModel, _$CreateFineTuningJobRequestModel];

  @override
  final String wireName = r'CreateFineTuningJobRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateFineTuningJobRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateFineTuningJobRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateFineTuningJobRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateFineTuningJobRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

