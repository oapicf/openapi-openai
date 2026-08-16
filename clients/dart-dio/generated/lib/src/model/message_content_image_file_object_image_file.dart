//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_image_file_object_image_file.g.dart';

/// MessageContentImageFileObjectImageFile
///
/// Properties:
/// * [fileId] - The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
/// * [detail] - Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
@BuiltValue()
abstract class MessageContentImageFileObjectImageFile implements Built<MessageContentImageFileObjectImageFile, MessageContentImageFileObjectImageFileBuilder> {
  /// The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  @BuiltValueField(wireName: r'file_id')
  String get fileId;

  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueField(wireName: r'detail')
  MessageContentImageFileObjectImageFileDetailEnum? get detail;
  // enum detailEnum {  auto,  low,  high,  };

  MessageContentImageFileObjectImageFile._();

  factory MessageContentImageFileObjectImageFile([void updates(MessageContentImageFileObjectImageFileBuilder b)]) = _$MessageContentImageFileObjectImageFile;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentImageFileObjectImageFileBuilder b) => b
      ..detail = MessageContentImageFileObjectImageFileDetailEnum.valueOf('auto');

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentImageFileObjectImageFile> get serializer => _$MessageContentImageFileObjectImageFileSerializer();
}

class _$MessageContentImageFileObjectImageFileSerializer implements PrimitiveSerializer<MessageContentImageFileObjectImageFile> {
  @override
  final Iterable<Type> types = const [MessageContentImageFileObjectImageFile, _$MessageContentImageFileObjectImageFile];

  @override
  final String wireName = r'MessageContentImageFileObjectImageFile';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentImageFileObjectImageFile object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'file_id';
    yield serializers.serialize(
      object.fileId,
      specifiedType: const FullType(String),
    );
    if (object.detail != null) {
      yield r'detail';
      yield serializers.serialize(
        object.detail,
        specifiedType: const FullType(MessageContentImageFileObjectImageFileDetailEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentImageFileObjectImageFile object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentImageFileObjectImageFileBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fileId = valueDes;
          break;
        case r'detail':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentImageFileObjectImageFileDetailEnum),
          ) as MessageContentImageFileObjectImageFileDetailEnum;
          result.detail = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageContentImageFileObjectImageFile deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentImageFileObjectImageFileBuilder();
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

class MessageContentImageFileObjectImageFileDetailEnum extends EnumClass {

  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const MessageContentImageFileObjectImageFileDetailEnum auto = _$messageContentImageFileObjectImageFileDetailEnum_auto;
  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'low')
  static const MessageContentImageFileObjectImageFileDetailEnum low = _$messageContentImageFileObjectImageFileDetailEnum_low;
  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'high')
  static const MessageContentImageFileObjectImageFileDetailEnum high = _$messageContentImageFileObjectImageFileDetailEnum_high;

  static Serializer<MessageContentImageFileObjectImageFileDetailEnum> get serializer => _$messageContentImageFileObjectImageFileDetailEnumSerializer;

  const MessageContentImageFileObjectImageFileDetailEnum._(String name): super(name);

  static BuiltSet<MessageContentImageFileObjectImageFileDetailEnum> get values => _$messageContentImageFileObjectImageFileDetailEnumValues;
  static MessageContentImageFileObjectImageFileDetailEnum valueOf(String name) => _$messageContentImageFileObjectImageFileDetailEnumValueOf(name);
}

