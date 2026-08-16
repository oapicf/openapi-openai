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

part 'chat_completion_request_developer_message_content.g.dart';

/// The contents of the developer message.
@BuiltValue()
abstract class ChatCompletionRequestDeveloperMessageContent implements Built<ChatCompletionRequestDeveloperMessageContent, ChatCompletionRequestDeveloperMessageContentBuilder> {
  /// One Of [BuiltList<ChatCompletionRequestMessageContentPartText>], [String]
  OneOf get oneOf;

  ChatCompletionRequestDeveloperMessageContent._();

  factory ChatCompletionRequestDeveloperMessageContent([void updates(ChatCompletionRequestDeveloperMessageContentBuilder b)]) = _$ChatCompletionRequestDeveloperMessageContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestDeveloperMessageContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestDeveloperMessageContent> get serializer => _$ChatCompletionRequestDeveloperMessageContentSerializer();
}

class _$ChatCompletionRequestDeveloperMessageContentSerializer implements PrimitiveSerializer<ChatCompletionRequestDeveloperMessageContent> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestDeveloperMessageContent, _$ChatCompletionRequestDeveloperMessageContent];

  @override
  final String wireName = r'ChatCompletionRequestDeveloperMessageContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestDeveloperMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestDeveloperMessageContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChatCompletionRequestDeveloperMessageContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestDeveloperMessageContentBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(ChatCompletionRequestMessageContentPartText)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

