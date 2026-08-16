//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_content_image_url_object_image_url.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_image_url_object.g.dart';

/// References an image URL in the content of a message.
///
/// Properties:
/// * [type] - The type of the content part.
/// * [imageUrl] 
@BuiltValue()
abstract class MessageContentImageUrlObject implements Built<MessageContentImageUrlObject, MessageContentImageUrlObjectBuilder> {
  /// The type of the content part.
  @BuiltValueField(wireName: r'type')
  MessageContentImageUrlObjectTypeEnum get type;
  // enum typeEnum {  image_url,  };

  @BuiltValueField(wireName: r'image_url')
  MessageContentImageUrlObjectImageUrl get imageUrl;

  MessageContentImageUrlObject._();

  factory MessageContentImageUrlObject([void updates(MessageContentImageUrlObjectBuilder b)]) = _$MessageContentImageUrlObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentImageUrlObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentImageUrlObject> get serializer => _$MessageContentImageUrlObjectSerializer();
}

class _$MessageContentImageUrlObjectSerializer implements PrimitiveSerializer<MessageContentImageUrlObject> {
  @override
  final Iterable<Type> types = const [MessageContentImageUrlObject, _$MessageContentImageUrlObject];

  @override
  final String wireName = r'MessageContentImageUrlObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentImageUrlObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageContentImageUrlObjectTypeEnum),
    );
    yield r'image_url';
    yield serializers.serialize(
      object.imageUrl,
      specifiedType: const FullType(MessageContentImageUrlObjectImageUrl),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentImageUrlObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentImageUrlObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentImageUrlObjectTypeEnum),
          ) as MessageContentImageUrlObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentImageUrlObjectImageUrl),
          ) as MessageContentImageUrlObjectImageUrl;
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
  MessageContentImageUrlObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentImageUrlObjectBuilder();
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

class MessageContentImageUrlObjectTypeEnum extends EnumClass {

  /// The type of the content part.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const MessageContentImageUrlObjectTypeEnum imageUrl = _$messageContentImageUrlObjectTypeEnum_imageUrl;

  static Serializer<MessageContentImageUrlObjectTypeEnum> get serializer => _$messageContentImageUrlObjectTypeEnumSerializer;

  const MessageContentImageUrlObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageContentImageUrlObjectTypeEnum> get values => _$messageContentImageUrlObjectTypeEnumValues;
  static MessageContentImageUrlObjectTypeEnum valueOf(String name) => _$messageContentImageUrlObjectTypeEnumValueOf(name);
}

