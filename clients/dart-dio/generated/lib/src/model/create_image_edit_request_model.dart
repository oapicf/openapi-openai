//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_image_edit_request_model.g.dart';

/// The model to use for image generation. Only `dall-e-2` is supported at this time.
@BuiltValue()
abstract class CreateImageEditRequestModel implements Built<CreateImageEditRequestModel, CreateImageEditRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateImageEditRequestModel._();

  factory CreateImageEditRequestModel([void updates(CreateImageEditRequestModelBuilder b)]) = _$CreateImageEditRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateImageEditRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateImageEditRequestModel> get serializer => _$CreateImageEditRequestModelSerializer();
}

class _$CreateImageEditRequestModelSerializer implements PrimitiveSerializer<CreateImageEditRequestModel> {
  @override
  final Iterable<Type> types = const [CreateImageEditRequestModel, _$CreateImageEditRequestModel];

  @override
  final String wireName = r'CreateImageEditRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateImageEditRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateImageEditRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateImageEditRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateImageEditRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

