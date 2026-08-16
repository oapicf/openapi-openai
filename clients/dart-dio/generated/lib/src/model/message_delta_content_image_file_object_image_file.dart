//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_image_file_object_image_file.g.dart';

/// MessageDeltaContentImageFileObjectImageFile
///
/// Properties:
/// * [fileId] - The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
/// * [detail] - Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
@BuiltValue()
abstract class MessageDeltaContentImageFileObjectImageFile implements Built<MessageDeltaContentImageFileObjectImageFile, MessageDeltaContentImageFileObjectImageFileBuilder> {
  /// The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  @BuiltValueField(wireName: r'file_id')
  String? get fileId;

  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueField(wireName: r'detail')
  MessageDeltaContentImageFileObjectImageFileDetailEnum? get detail;
  // enum detailEnum {  auto,  low,  high,  };

  MessageDeltaContentImageFileObjectImageFile._();

  factory MessageDeltaContentImageFileObjectImageFile([void updates(MessageDeltaContentImageFileObjectImageFileBuilder b)]) = _$MessageDeltaContentImageFileObjectImageFile;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentImageFileObjectImageFileBuilder b) => b
      ..detail = MessageDeltaContentImageFileObjectImageFileDetailEnum.valueOf('auto');

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentImageFileObjectImageFile> get serializer => _$MessageDeltaContentImageFileObjectImageFileSerializer();
}

class _$MessageDeltaContentImageFileObjectImageFileSerializer implements PrimitiveSerializer<MessageDeltaContentImageFileObjectImageFile> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentImageFileObjectImageFile, _$MessageDeltaContentImageFileObjectImageFile];

  @override
  final String wireName = r'MessageDeltaContentImageFileObjectImageFile';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentImageFileObjectImageFile object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileId != null) {
      yield r'file_id';
      yield serializers.serialize(
        object.fileId,
        specifiedType: const FullType(String),
      );
    }
    if (object.detail != null) {
      yield r'detail';
      yield serializers.serialize(
        object.detail,
        specifiedType: const FullType(MessageDeltaContentImageFileObjectImageFileDetailEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentImageFileObjectImageFile object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentImageFileObjectImageFileBuilder result,
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
            specifiedType: const FullType(MessageDeltaContentImageFileObjectImageFileDetailEnum),
          ) as MessageDeltaContentImageFileObjectImageFileDetailEnum;
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
  MessageDeltaContentImageFileObjectImageFile deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentImageFileObjectImageFileBuilder();
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

class MessageDeltaContentImageFileObjectImageFileDetailEnum extends EnumClass {

  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const MessageDeltaContentImageFileObjectImageFileDetailEnum auto = _$messageDeltaContentImageFileObjectImageFileDetailEnum_auto;
  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'low')
  static const MessageDeltaContentImageFileObjectImageFileDetailEnum low = _$messageDeltaContentImageFileObjectImageFileDetailEnum_low;
  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'high')
  static const MessageDeltaContentImageFileObjectImageFileDetailEnum high = _$messageDeltaContentImageFileObjectImageFileDetailEnum_high;

  static Serializer<MessageDeltaContentImageFileObjectImageFileDetailEnum> get serializer => _$messageDeltaContentImageFileObjectImageFileDetailEnumSerializer;

  const MessageDeltaContentImageFileObjectImageFileDetailEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentImageFileObjectImageFileDetailEnum> get values => _$messageDeltaContentImageFileObjectImageFileDetailEnumValues;
  static MessageDeltaContentImageFileObjectImageFileDetailEnum valueOf(String name) => _$messageDeltaContentImageFileObjectImageFileDetailEnumValueOf(name);
}

