//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_image_request_model.g.dart';

/// The model to use for image generation.
@BuiltValue()
abstract class CreateImageRequestModel implements Built<CreateImageRequestModel, CreateImageRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateImageRequestModel._();

  factory CreateImageRequestModel([void updates(CreateImageRequestModelBuilder b)]) = _$CreateImageRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateImageRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateImageRequestModel> get serializer => _$CreateImageRequestModelSerializer();
}

class _$CreateImageRequestModelSerializer implements PrimitiveSerializer<CreateImageRequestModel> {
  @override
  final Iterable<Type> types = const [CreateImageRequestModel, _$CreateImageRequestModel];

  @override
  final String wireName = r'CreateImageRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateImageRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateImageRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateImageRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateImageRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

