//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_completion_request_model.g.dart';

/// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
@BuiltValue()
abstract class CreateCompletionRequestModel implements Built<CreateCompletionRequestModel, CreateCompletionRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateCompletionRequestModel._();

  factory CreateCompletionRequestModel([void updates(CreateCompletionRequestModelBuilder b)]) = _$CreateCompletionRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateCompletionRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateCompletionRequestModel> get serializer => _$CreateCompletionRequestModelSerializer();
}

class _$CreateCompletionRequestModelSerializer implements PrimitiveSerializer<CreateCompletionRequestModel> {
  @override
  final Iterable<Type> types = const [CreateCompletionRequestModel, _$CreateCompletionRequestModel];

  @override
  final String wireName = r'CreateCompletionRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateCompletionRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateCompletionRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateCompletionRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateCompletionRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

