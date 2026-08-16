//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_request_content_text_object.g.dart';

/// The text content that is part of a message.
///
/// Properties:
/// * [type] - Always `text`.
/// * [text] - Text content to be sent to the model
@BuiltValue()
abstract class MessageRequestContentTextObject implements Built<MessageRequestContentTextObject, MessageRequestContentTextObjectBuilder> {
  /// Always `text`.
  @BuiltValueField(wireName: r'type')
  MessageRequestContentTextObjectTypeEnum get type;
  // enum typeEnum {  text,  };

  /// Text content to be sent to the model
  @BuiltValueField(wireName: r'text')
  String get text;

  MessageRequestContentTextObject._();

  factory MessageRequestContentTextObject([void updates(MessageRequestContentTextObjectBuilder b)]) = _$MessageRequestContentTextObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageRequestContentTextObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageRequestContentTextObject> get serializer => _$MessageRequestContentTextObjectSerializer();
}

class _$MessageRequestContentTextObjectSerializer implements PrimitiveSerializer<MessageRequestContentTextObject> {
  @override
  final Iterable<Type> types = const [MessageRequestContentTextObject, _$MessageRequestContentTextObject];

  @override
  final String wireName = r'MessageRequestContentTextObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageRequestContentTextObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageRequestContentTextObjectTypeEnum),
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
    MessageRequestContentTextObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageRequestContentTextObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageRequestContentTextObjectTypeEnum),
          ) as MessageRequestContentTextObjectTypeEnum;
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
  MessageRequestContentTextObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageRequestContentTextObjectBuilder();
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

class MessageRequestContentTextObjectTypeEnum extends EnumClass {

  /// Always `text`.
  @BuiltValueEnumConst(wireName: r'text')
  static const MessageRequestContentTextObjectTypeEnum text = _$messageRequestContentTextObjectTypeEnum_text;

  static Serializer<MessageRequestContentTextObjectTypeEnum> get serializer => _$messageRequestContentTextObjectTypeEnumSerializer;

  const MessageRequestContentTextObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageRequestContentTextObjectTypeEnum> get values => _$messageRequestContentTextObjectTypeEnumValues;
  static MessageRequestContentTextObjectTypeEnum valueOf(String name) => _$messageRequestContentTextObjectTypeEnumValueOf(name);
}

