//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_moderation_request_model.g.dart';

/// The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
@BuiltValue()
abstract class CreateModerationRequestModel implements Built<CreateModerationRequestModel, CreateModerationRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateModerationRequestModel._();

  factory CreateModerationRequestModel([void updates(CreateModerationRequestModelBuilder b)]) = _$CreateModerationRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationRequestModel> get serializer => _$CreateModerationRequestModelSerializer();
}

class _$CreateModerationRequestModelSerializer implements PrimitiveSerializer<CreateModerationRequestModel> {
  @override
  final Iterable<Type> types = const [CreateModerationRequestModel, _$CreateModerationRequestModel];

  @override
  final String wireName = r'CreateModerationRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateModerationRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

