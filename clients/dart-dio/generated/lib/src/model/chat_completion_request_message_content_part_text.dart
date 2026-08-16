//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_message_content_part_text.g.dart';

/// Learn about [text inputs](/docs/guides/text-generation). 
///
/// Properties:
/// * [type] - The type of the content part.
/// * [text] - The text content.
@BuiltValue()
abstract class ChatCompletionRequestMessageContentPartText implements Built<ChatCompletionRequestMessageContentPartText, ChatCompletionRequestMessageContentPartTextBuilder> {
  /// The type of the content part.
  @BuiltValueField(wireName: r'type')
  ChatCompletionRequestMessageContentPartTextTypeEnum get type;
  // enum typeEnum {  text,  };

  /// The text content.
  @BuiltValueField(wireName: r'text')
  String get text;

  ChatCompletionRequestMessageContentPartText._();

  factory ChatCompletionRequestMessageContentPartText([void updates(ChatCompletionRequestMessageContentPartTextBuilder b)]) = _$ChatCompletionRequestMessageContentPartText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestMessageContentPartTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestMessageContentPartText> get serializer => _$ChatCompletionRequestMessageContentPartTextSerializer();
}

class _$ChatCompletionRequestMessageContentPartTextSerializer implements PrimitiveSerializer<ChatCompletionRequestMessageContentPartText> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestMessageContentPartText, _$ChatCompletionRequestMessageContentPartText];

  @override
  final String wireName = r'ChatCompletionRequestMessageContentPartText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ChatCompletionRequestMessageContentPartTextTypeEnum),
    );
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestMessageContentPartTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestMessageContentPartTextTypeEnum),
          ) as ChatCompletionRequestMessageContentPartTextTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionRequestMessageContentPartText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestMessageContentPartTextBuilder();
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

class ChatCompletionRequestMessageContentPartTextTypeEnum extends EnumClass {

  /// The type of the content part.
  @BuiltValueEnumConst(wireName: r'text')
  static const ChatCompletionRequestMessageContentPartTextTypeEnum text = _$chatCompletionRequestMessageContentPartTextTypeEnum_text;

  static Serializer<ChatCompletionRequestMessageContentPartTextTypeEnum> get serializer => _$chatCompletionRequestMessageContentPartTextTypeEnumSerializer;

  const ChatCompletionRequestMessageContentPartTextTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestMessageContentPartTextTypeEnum> get values => _$chatCompletionRequestMessageContentPartTextTypeEnumValues;
  static ChatCompletionRequestMessageContentPartTextTypeEnum valueOf(String name) => _$chatCompletionRequestMessageContentPartTextTypeEnumValueOf(name);
}

