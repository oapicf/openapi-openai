//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_delta_content_image_url_object_image_url.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_image_url_object.g.dart';

/// References an image URL in the content of a message.
///
/// Properties:
/// * [index] - The index of the content part in the message.
/// * [type] - Always `image_url`.
/// * [imageUrl] 
@BuiltValue()
abstract class MessageDeltaContentImageUrlObject implements Built<MessageDeltaContentImageUrlObject, MessageDeltaContentImageUrlObjectBuilder> {
  /// The index of the content part in the message.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `image_url`.
  @BuiltValueField(wireName: r'type')
  MessageDeltaContentImageUrlObjectTypeEnum get type;
  // enum typeEnum {  image_url,  };

  @BuiltValueField(wireName: r'image_url')
  MessageDeltaContentImageUrlObjectImageUrl? get imageUrl;

  MessageDeltaContentImageUrlObject._();

  factory MessageDeltaContentImageUrlObject([void updates(MessageDeltaContentImageUrlObjectBuilder b)]) = _$MessageDeltaContentImageUrlObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentImageUrlObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentImageUrlObject> get serializer => _$MessageDeltaContentImageUrlObjectSerializer();
}

class _$MessageDeltaContentImageUrlObjectSerializer implements PrimitiveSerializer<MessageDeltaContentImageUrlObject> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentImageUrlObject, _$MessageDeltaContentImageUrlObject];

  @override
  final String wireName = r'MessageDeltaContentImageUrlObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentImageUrlObject object, {
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
      specifiedType: const FullType(MessageDeltaContentImageUrlObjectTypeEnum),
    );
    if (object.imageUrl != null) {
      yield r'image_url';
      yield serializers.serialize(
        object.imageUrl,
        specifiedType: const FullType(MessageDeltaContentImageUrlObjectImageUrl),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentImageUrlObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentImageUrlObjectBuilder result,
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
            specifiedType: const FullType(MessageDeltaContentImageUrlObjectTypeEnum),
          ) as MessageDeltaContentImageUrlObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaContentImageUrlObjectImageUrl),
          ) as MessageDeltaContentImageUrlObjectImageUrl;
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
  MessageDeltaContentImageUrlObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentImageUrlObjectBuilder();
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

class MessageDeltaContentImageUrlObjectTypeEnum extends EnumClass {

  /// Always `image_url`.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const MessageDeltaContentImageUrlObjectTypeEnum imageUrl = _$messageDeltaContentImageUrlObjectTypeEnum_imageUrl;

  static Serializer<MessageDeltaContentImageUrlObjectTypeEnum> get serializer => _$messageDeltaContentImageUrlObjectTypeEnumSerializer;

  const MessageDeltaContentImageUrlObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentImageUrlObjectTypeEnum> get values => _$messageDeltaContentImageUrlObjectTypeEnumValues;
  static MessageDeltaContentImageUrlObjectTypeEnum valueOf(String name) => _$messageDeltaContentImageUrlObjectTypeEnumValueOf(name);
}

