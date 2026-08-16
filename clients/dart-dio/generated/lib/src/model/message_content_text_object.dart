//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_content_text_object_text.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_text_object.g.dart';

/// The text content that is part of a message.
///
/// Properties:
/// * [type] - Always `text`.
/// * [text] 
@BuiltValue()
abstract class MessageContentTextObject implements Built<MessageContentTextObject, MessageContentTextObjectBuilder> {
  /// Always `text`.
  @BuiltValueField(wireName: r'type')
  MessageContentTextObjectTypeEnum get type;
  // enum typeEnum {  text,  };

  @BuiltValueField(wireName: r'text')
  MessageContentTextObjectText get text;

  MessageContentTextObject._();

  factory MessageContentTextObject([void updates(MessageContentTextObjectBuilder b)]) = _$MessageContentTextObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentTextObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentTextObject> get serializer => _$MessageContentTextObjectSerializer();
}

class _$MessageContentTextObjectSerializer implements PrimitiveSerializer<MessageContentTextObject> {
  @override
  final Iterable<Type> types = const [MessageContentTextObject, _$MessageContentTextObject];

  @override
  final String wireName = r'MessageContentTextObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentTextObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageContentTextObjectTypeEnum),
    );
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(MessageContentTextObjectText),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentTextObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentTextObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentTextObjectTypeEnum),
          ) as MessageContentTextObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentTextObjectText),
          ) as MessageContentTextObjectText;
          result.text.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageContentTextObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentTextObjectBuilder();
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

class MessageContentTextObjectTypeEnum extends EnumClass {

  /// Always `text`.
  @BuiltValueEnumConst(wireName: r'text')
  static const MessageContentTextObjectTypeEnum text = _$messageContentTextObjectTypeEnum_text;

  static Serializer<MessageContentTextObjectTypeEnum> get serializer => _$messageContentTextObjectTypeEnumSerializer;

  const MessageContentTextObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageContentTextObjectTypeEnum> get values => _$messageContentTextObjectTypeEnumValues;
  static MessageContentTextObjectTypeEnum valueOf(String name) => _$messageContentTextObjectTypeEnumValueOf(name);
}

