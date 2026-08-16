//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_chat_completion_request_model.g.dart';

/// ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
@BuiltValue()
abstract class CreateChatCompletionRequestModel implements Built<CreateChatCompletionRequestModel, CreateChatCompletionRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateChatCompletionRequestModel._();

  factory CreateChatCompletionRequestModel([void updates(CreateChatCompletionRequestModelBuilder b)]) = _$CreateChatCompletionRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionRequestModel> get serializer => _$CreateChatCompletionRequestModelSerializer();
}

class _$CreateChatCompletionRequestModelSerializer implements PrimitiveSerializer<CreateChatCompletionRequestModel> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionRequestModel, _$CreateChatCompletionRequestModel];

  @override
  final String wireName = r'CreateChatCompletionRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateChatCompletionRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

