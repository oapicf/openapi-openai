//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_content_image_file_object_image_file.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_image_file_object.g.dart';

/// References an image [File](/docs/api-reference/files) in the content of a message.
///
/// Properties:
/// * [type] - Always `image_file`.
/// * [imageFile] 
@BuiltValue()
abstract class MessageContentImageFileObject implements Built<MessageContentImageFileObject, MessageContentImageFileObjectBuilder> {
  /// Always `image_file`.
  @BuiltValueField(wireName: r'type')
  MessageContentImageFileObjectTypeEnum get type;
  // enum typeEnum {  image_file,  };

  @BuiltValueField(wireName: r'image_file')
  MessageContentImageFileObjectImageFile get imageFile;

  MessageContentImageFileObject._();

  factory MessageContentImageFileObject([void updates(MessageContentImageFileObjectBuilder b)]) = _$MessageContentImageFileObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentImageFileObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentImageFileObject> get serializer => _$MessageContentImageFileObjectSerializer();
}

class _$MessageContentImageFileObjectSerializer implements PrimitiveSerializer<MessageContentImageFileObject> {
  @override
  final Iterable<Type> types = const [MessageContentImageFileObject, _$MessageContentImageFileObject];

  @override
  final String wireName = r'MessageContentImageFileObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentImageFileObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageContentImageFileObjectTypeEnum),
    );
    yield r'image_file';
    yield serializers.serialize(
      object.imageFile,
      specifiedType: const FullType(MessageContentImageFileObjectImageFile),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentImageFileObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentImageFileObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentImageFileObjectTypeEnum),
          ) as MessageContentImageFileObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'image_file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentImageFileObjectImageFile),
          ) as MessageContentImageFileObjectImageFile;
          result.imageFile.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageContentImageFileObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentImageFileObjectBuilder();
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

class MessageContentImageFileObjectTypeEnum extends EnumClass {

  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_file')
  static const MessageContentImageFileObjectTypeEnum imageFile = _$messageContentImageFileObjectTypeEnum_imageFile;

  static Serializer<MessageContentImageFileObjectTypeEnum> get serializer => _$messageContentImageFileObjectTypeEnumSerializer;

  const MessageContentImageFileObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageContentImageFileObjectTypeEnum> get values => _$messageContentImageFileObjectTypeEnumValues;
  static MessageContentImageFileObjectTypeEnum valueOf(String name) => _$messageContentImageFileObjectTypeEnumValueOf(name);
}

