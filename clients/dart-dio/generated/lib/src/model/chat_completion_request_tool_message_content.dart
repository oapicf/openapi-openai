//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_text.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'chat_completion_request_tool_message_content.g.dart';

/// The contents of the tool message.
@BuiltValue()
abstract class ChatCompletionRequestToolMessageContent implements Built<ChatCompletionRequestToolMessageContent, ChatCompletionRequestToolMessageContentBuilder> {
  /// One Of [BuiltList<ChatCompletionRequestMessageContentPartText>], [String]
  OneOf get oneOf;

  ChatCompletionRequestToolMessageContent._();

  factory ChatCompletionRequestToolMessageContent([void updates(ChatCompletionRequestToolMessageContentBuilder b)]) = _$ChatCompletionRequestToolMessageContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestToolMessageContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestToolMessageContent> get serializer => _$ChatCompletionRequestToolMessageContentSerializer();
}

class _$ChatCompletionRequestToolMessageContentSerializer implements PrimitiveSerializer<ChatCompletionRequestToolMessageContent> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestToolMessageContent, _$ChatCompletionRequestToolMessageContent];

  @override
  final String wireName = r'ChatCompletionRequestToolMessageContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestToolMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestToolMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChatCompletionRequestToolMessageContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestToolMessageContentBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(ChatCompletionRequestMessageContentPartText)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

