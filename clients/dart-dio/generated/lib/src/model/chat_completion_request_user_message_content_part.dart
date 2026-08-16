//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_audio.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_audio_input_audio.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_image.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_image_image_url.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'chat_completion_request_user_message_content_part.g.dart';

/// ChatCompletionRequestUserMessageContentPart
///
/// Properties:
/// * [type] - The type of the content part.
/// * [text] - The text content.
/// * [imageUrl] 
/// * [inputAudio] 
@BuiltValue()
abstract class ChatCompletionRequestUserMessageContentPart implements Built<ChatCompletionRequestUserMessageContentPart, ChatCompletionRequestUserMessageContentPartBuilder> {
  /// One Of [ChatCompletionRequestMessageContentPartAudio], [ChatCompletionRequestMessageContentPartImage], [ChatCompletionRequestMessageContentPartText]
  OneOf get oneOf;

  ChatCompletionRequestUserMessageContentPart._();

  factory ChatCompletionRequestUserMessageContentPart([void updates(ChatCompletionRequestUserMessageContentPartBuilder b)]) = _$ChatCompletionRequestUserMessageContentPart;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestUserMessageContentPartBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestUserMessageContentPart> get serializer => _$ChatCompletionRequestUserMessageContentPartSerializer();
}

class _$ChatCompletionRequestUserMessageContentPartSerializer implements PrimitiveSerializer<ChatCompletionRequestUserMessageContentPart> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestUserMessageContentPart, _$ChatCompletionRequestUserMessageContentPart];

  @override
  final String wireName = r'ChatCompletionRequestUserMessageContentPart';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestUserMessageContentPart object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestUserMessageContentPart object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChatCompletionRequestUserMessageContentPart deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestUserMessageContentPartBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(ChatCompletionRequestMessageContentPartText), FullType(ChatCompletionRequestMessageContentPartImage), FullType(ChatCompletionRequestMessageContentPartAudio), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class ChatCompletionRequestUserMessageContentPartTypeEnum extends EnumClass {

  /// The type of the content part.
  @BuiltValueEnumConst(wireName: r'text')
  static const ChatCompletionRequestUserMessageContentPartTypeEnum text = _$chatCompletionRequestUserMessageContentPartTypeEnum_text;
  /// The type of the content part.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const ChatCompletionRequestUserMessageContentPartTypeEnum imageUrl = _$chatCompletionRequestUserMessageContentPartTypeEnum_imageUrl;
  /// The type of the content part.
  @BuiltValueEnumConst(wireName: r'input_audio')
  static const ChatCompletionRequestUserMessageContentPartTypeEnum inputAudio = _$chatCompletionRequestUserMessageContentPartTypeEnum_inputAudio;

  static Serializer<ChatCompletionRequestUserMessageContentPartTypeEnum> get serializer => _$chatCompletionRequestUserMessageContentPartTypeEnumSerializer;

  const ChatCompletionRequestUserMessageContentPartTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestUserMessageContentPartTypeEnum> get values => _$chatCompletionRequestUserMessageContentPartTypeEnumValues;
  static ChatCompletionRequestUserMessageContentPartTypeEnum valueOf(String name) => _$chatCompletionRequestUserMessageContentPartTypeEnumValueOf(name);
}

