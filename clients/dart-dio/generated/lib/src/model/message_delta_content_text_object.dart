//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_delta_content_text_object_text.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_text_object.g.dart';

/// The text content that is part of a message.
///
/// Properties:
/// * [index] - The index of the content part in the message.
/// * [type] - Always `text`.
/// * [text] 
@BuiltValue()
abstract class MessageDeltaContentTextObject implements Built<MessageDeltaContentTextObject, MessageDeltaContentTextObjectBuilder> {
  /// The index of the content part in the message.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `text`.
  @BuiltValueField(wireName: r'type')
  MessageDeltaContentTextObjectTypeEnum get type;
  // enum typeEnum {  text,  };

  @BuiltValueField(wireName: r'text')
  MessageDeltaContentTextObjectText? get text;

  MessageDeltaContentTextObject._();

  factory MessageDeltaContentTextObject([void updates(MessageDeltaContentTextObjectBuilder b)]) = _$MessageDeltaContentTextObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentTextObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentTextObject> get serializer => _$MessageDeltaContentTextObjectSerializer();
}

class _$MessageDeltaContentTextObjectSerializer implements PrimitiveSerializer<MessageDeltaContentTextObject> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentTextObject, _$MessageDeltaContentTextObject];

  @override
  final String wireName = r'MessageDeltaContentTextObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentTextObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageDeltaContentTextObjectTypeEnum),
    );
    if (object.text != null) {
      yield r'text';
      yield serializers.serialize(
        object.text,
        specifiedType: const FullType(MessageDeltaContentTextObjectText),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentTextObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentTextObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaContentTextObjectTypeEnum),
          ) as MessageDeltaContentTextObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaContentTextObjectText),
          ) as MessageDeltaContentTextObjectText;
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
  MessageDeltaContentTextObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentTextObjectBuilder();
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

class MessageDeltaContentTextObjectTypeEnum extends EnumClass {

  /// Always `text`.
  @BuiltValueEnumConst(wireName: r'text')
  static const MessageDeltaContentTextObjectTypeEnum text = _$messageDeltaContentTextObjectTypeEnum_text;

  static Serializer<MessageDeltaContentTextObjectTypeEnum> get serializer => _$messageDeltaContentTextObjectTypeEnumSerializer;

  const MessageDeltaContentTextObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentTextObjectTypeEnum> get values => _$messageDeltaContentTextObjectTypeEnumValues;
  static MessageDeltaContentTextObjectTypeEnum valueOf(String name) => _$messageDeltaContentTextObjectTypeEnumValueOf(name);
}

