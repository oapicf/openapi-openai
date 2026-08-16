//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_user_message_content_part.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'chat_completion_request_user_message_content.g.dart';

/// The contents of the user message. 
@BuiltValue()
abstract class ChatCompletionRequestUserMessageContent implements Built<ChatCompletionRequestUserMessageContent, ChatCompletionRequestUserMessageContentBuilder> {
  /// One Of [BuiltList<ChatCompletionRequestUserMessageContentPart>], [String]
  OneOf get oneOf;

  ChatCompletionRequestUserMessageContent._();

  factory ChatCompletionRequestUserMessageContent([void updates(ChatCompletionRequestUserMessageContentBuilder b)]) = _$ChatCompletionRequestUserMessageContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestUserMessageContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestUserMessageContent> get serializer => _$ChatCompletionRequestUserMessageContentSerializer();
}

class _$ChatCompletionRequestUserMessageContentSerializer implements PrimitiveSerializer<ChatCompletionRequestUserMessageContent> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestUserMessageContent, _$ChatCompletionRequestUserMessageContent];

  @override
  final String wireName = r'ChatCompletionRequestUserMessageContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestUserMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestUserMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChatCompletionRequestUserMessageContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestUserMessageContentBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(ChatCompletionRequestUserMessageContentPart)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

