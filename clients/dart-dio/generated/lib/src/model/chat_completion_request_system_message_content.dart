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

part 'chat_completion_request_system_message_content.g.dart';

/// The contents of the system message.
@BuiltValue()
abstract class ChatCompletionRequestSystemMessageContent implements Built<ChatCompletionRequestSystemMessageContent, ChatCompletionRequestSystemMessageContentBuilder> {
  /// One Of [BuiltList<ChatCompletionRequestMessageContentPartText>], [String]
  OneOf get oneOf;

  ChatCompletionRequestSystemMessageContent._();

  factory ChatCompletionRequestSystemMessageContent([void updates(ChatCompletionRequestSystemMessageContentBuilder b)]) = _$ChatCompletionRequestSystemMessageContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestSystemMessageContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestSystemMessageContent> get serializer => _$ChatCompletionRequestSystemMessageContentSerializer();
}

class _$ChatCompletionRequestSystemMessageContentSerializer implements PrimitiveSerializer<ChatCompletionRequestSystemMessageContent> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestSystemMessageContent, _$ChatCompletionRequestSystemMessageContent];

  @override
  final String wireName = r'ChatCompletionRequestSystemMessageContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestSystemMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestSystemMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChatCompletionRequestSystemMessageContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestSystemMessageContentBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(ChatCompletionRequestMessageContentPartText)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

