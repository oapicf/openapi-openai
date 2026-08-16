//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_chat_completion_request_stop.g.dart';

/// Up to 4 sequences where the API will stop generating further tokens. 
@BuiltValue()
abstract class CreateChatCompletionRequestStop implements Built<CreateChatCompletionRequestStop, CreateChatCompletionRequestStopBuilder> {
  /// One Of [BuiltList<String>], [String]
  OneOf get oneOf;

  CreateChatCompletionRequestStop._();

  factory CreateChatCompletionRequestStop([void updates(CreateChatCompletionRequestStopBuilder b)]) = _$CreateChatCompletionRequestStop;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionRequestStopBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionRequestStop> get serializer => _$CreateChatCompletionRequestStopSerializer();
}

class _$CreateChatCompletionRequestStopSerializer implements PrimitiveSerializer<CreateChatCompletionRequestStop> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionRequestStop, _$CreateChatCompletionRequestStop];

  @override
  final String wireName = r'CreateChatCompletionRequestStop';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionRequestStop object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionRequestStop object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateChatCompletionRequestStop deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionRequestStopBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType.nullable(String), FullType(BuiltList, [FullType(String)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

