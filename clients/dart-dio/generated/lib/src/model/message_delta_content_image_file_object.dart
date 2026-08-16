//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_delta_content_image_file_object_image_file.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_image_file_object.g.dart';

/// References an image [File](/docs/api-reference/files) in the content of a message.
///
/// Properties:
/// * [index] - The index of the content part in the message.
/// * [type] - Always `image_file`.
/// * [imageFile] 
@BuiltValue()
abstract class MessageDeltaContentImageFileObject implements Built<MessageDeltaContentImageFileObject, MessageDeltaContentImageFileObjectBuilder> {
  /// The index of the content part in the message.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `image_file`.
  @BuiltValueField(wireName: r'type')
  MessageDeltaContentImageFileObjectTypeEnum get type;
  // enum typeEnum {  image_file,  };

  @BuiltValueField(wireName: r'image_file')
  MessageDeltaContentImageFileObjectImageFile? get imageFile;

  MessageDeltaContentImageFileObject._();

  factory MessageDeltaContentImageFileObject([void updates(MessageDeltaContentImageFileObjectBuilder b)]) = _$MessageDeltaContentImageFileObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentImageFileObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentImageFileObject> get serializer => _$MessageDeltaContentImageFileObjectSerializer();
}

class _$MessageDeltaContentImageFileObjectSerializer implements PrimitiveSerializer<MessageDeltaContentImageFileObject> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentImageFileObject, _$MessageDeltaContentImageFileObject];

  @override
  final String wireName = r'MessageDeltaContentImageFileObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentImageFileObject object, {
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
      specifiedType: const FullType(MessageDeltaContentImageFileObjectTypeEnum),
    );
    if (object.imageFile != null) {
      yield r'image_file';
      yield serializers.serialize(
        object.imageFile,
        specifiedType: const FullType(MessageDeltaContentImageFileObjectImageFile),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentImageFileObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentImageFileObjectBuilder result,
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
            specifiedType: const FullType(MessageDeltaContentImageFileObjectTypeEnum),
          ) as MessageDeltaContentImageFileObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'image_file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaContentImageFileObjectImageFile),
          ) as MessageDeltaContentImageFileObjectImageFile;
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
  MessageDeltaContentImageFileObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentImageFileObjectBuilder();
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

class MessageDeltaContentImageFileObjectTypeEnum extends EnumClass {

  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_file')
  static const MessageDeltaContentImageFileObjectTypeEnum imageFile = _$messageDeltaContentImageFileObjectTypeEnum_imageFile;

  static Serializer<MessageDeltaContentImageFileObjectTypeEnum> get serializer => _$messageDeltaContentImageFileObjectTypeEnumSerializer;

  const MessageDeltaContentImageFileObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentImageFileObjectTypeEnum> get values => _$messageDeltaContentImageFileObjectTypeEnumValues;
  static MessageDeltaContentImageFileObjectTypeEnum valueOf(String name) => _$messageDeltaContentImageFileObjectTypeEnumValueOf(name);
}

