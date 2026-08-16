//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_image_image_url.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_message_content_part_image.g.dart';

/// Learn about [image inputs](/docs/guides/vision). 
///
/// Properties:
/// * [type] - The type of the content part.
/// * [imageUrl] 
@BuiltValue()
abstract class ChatCompletionRequestMessageContentPartImage implements Built<ChatCompletionRequestMessageContentPartImage, ChatCompletionRequestMessageContentPartImageBuilder> {
  /// The type of the content part.
  @BuiltValueField(wireName: r'type')
  ChatCompletionRequestMessageContentPartImageTypeEnum get type;
  // enum typeEnum {  image_url,  };

  @BuiltValueField(wireName: r'image_url')
  ChatCompletionRequestMessageContentPartImageImageUrl get imageUrl;

  ChatCompletionRequestMessageContentPartImage._();

  factory ChatCompletionRequestMessageContentPartImage([void updates(ChatCompletionRequestMessageContentPartImageBuilder b)]) = _$ChatCompletionRequestMessageContentPartImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestMessageContentPartImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestMessageContentPartImage> get serializer => _$ChatCompletionRequestMessageContentPartImageSerializer();
}

class _$ChatCompletionRequestMessageContentPartImageSerializer implements PrimitiveSerializer<ChatCompletionRequestMessageContentPartImage> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestMessageContentPartImage, _$ChatCompletionRequestMessageContentPartImage];

  @override
  final String wireName = r'ChatCompletionRequestMessageContentPartImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ChatCompletionRequestMessageContentPartImageTypeEnum),
    );
    yield r'image_url';
    yield serializers.serialize(
      object.imageUrl,
      specifiedType: const FullType(ChatCompletionRequestMessageContentPartImageImageUrl),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestMessageContentPartImageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestMessageContentPartImageTypeEnum),
          ) as ChatCompletionRequestMessageContentPartImageTypeEnum;
          result.type = valueDes;
          break;
        case r'image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestMessageContentPartImageImageUrl),
          ) as ChatCompletionRequestMessageContentPartImageImageUrl;
          result.imageUrl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionRequestMessageContentPartImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestMessageContentPartImageBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

class ChatCompletionRequestMessageContentPartImageTypeEnum extends EnumClass {

  /// The type of the content part.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const ChatCompletionRequestMessageContentPartImageTypeEnum imageUrl = _$chatCompletionRequestMessageContentPartImageTypeEnum_imageUrl;

  static Serializer<ChatCompletionRequestMessageContentPartImageTypeEnum> get serializer => _$chatCompletionRequestMessageContentPartImageTypeEnumSerializer;

  const ChatCompletionRequestMessageContentPartImageTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestMessageContentPartImageTypeEnum> get values => _$chatCompletionRequestMessageContentPartImageTypeEnumValues;
  static ChatCompletionRequestMessageContentPartImageTypeEnum valueOf(String name) => _$chatCompletionRequestMessageContentPartImageTypeEnumValueOf(name);
}

