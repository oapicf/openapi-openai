//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_assistant_request_model.g.dart';

/// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
@BuiltValue()
abstract class CreateAssistantRequestModel implements Built<CreateAssistantRequestModel, CreateAssistantRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateAssistantRequestModel._();

  factory CreateAssistantRequestModel([void updates(CreateAssistantRequestModelBuilder b)]) = _$CreateAssistantRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssistantRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssistantRequestModel> get serializer => _$CreateAssistantRequestModelSerializer();
}

class _$CreateAssistantRequestModelSerializer implements PrimitiveSerializer<CreateAssistantRequestModel> {
  @override
  final Iterable<Type> types = const [CreateAssistantRequestModel, _$CreateAssistantRequestModel];

  @override
  final String wireName = r'CreateAssistantRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssistantRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssistantRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateAssistantRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssistantRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

