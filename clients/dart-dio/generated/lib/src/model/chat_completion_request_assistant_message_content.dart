//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_assistant_message_content_part.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'chat_completion_request_assistant_message_content.g.dart';

/// The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
@BuiltValue()
abstract class ChatCompletionRequestAssistantMessageContent implements Built<ChatCompletionRequestAssistantMessageContent, ChatCompletionRequestAssistantMessageContentBuilder> {
  /// One Of [BuiltList<ChatCompletionRequestAssistantMessageContentPart>], [String]
  OneOf get oneOf;

  ChatCompletionRequestAssistantMessageContent._();

  factory ChatCompletionRequestAssistantMessageContent([void updates(ChatCompletionRequestAssistantMessageContentBuilder b)]) = _$ChatCompletionRequestAssistantMessageContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestAssistantMessageContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestAssistantMessageContent> get serializer => _$ChatCompletionRequestAssistantMessageContentSerializer();
}

class _$ChatCompletionRequestAssistantMessageContentSerializer implements PrimitiveSerializer<ChatCompletionRequestAssistantMessageContent> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestAssistantMessageContent, _$ChatCompletionRequestAssistantMessageContent];

  @override
  final String wireName = r'ChatCompletionRequestAssistantMessageContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestAssistantMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestAssistantMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChatCompletionRequestAssistantMessageContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestAssistantMessageContentBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(ChatCompletionRequestAssistantMessageContentPart)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

