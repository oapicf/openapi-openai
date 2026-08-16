//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_content_text_annotations_file_path_object_file_path.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_text_annotations_file_path_object.g.dart';

/// A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
///
/// Properties:
/// * [type] - Always `file_path`.
/// * [text] - The text in the message content that needs to be replaced.
/// * [filePath] 
/// * [startIndex] 
/// * [endIndex] 
@BuiltValue()
abstract class MessageContentTextAnnotationsFilePathObject implements Built<MessageContentTextAnnotationsFilePathObject, MessageContentTextAnnotationsFilePathObjectBuilder> {
  /// Always `file_path`.
  @BuiltValueField(wireName: r'type')
  MessageContentTextAnnotationsFilePathObjectTypeEnum get type;
  // enum typeEnum {  file_path,  };

  /// The text in the message content that needs to be replaced.
  @BuiltValueField(wireName: r'text')
  String get text;

  @BuiltValueField(wireName: r'file_path')
  MessageContentTextAnnotationsFilePathObjectFilePath get filePath;

  @BuiltValueField(wireName: r'start_index')
  int get startIndex;

  @BuiltValueField(wireName: r'end_index')
  int get endIndex;

  MessageContentTextAnnotationsFilePathObject._();

  factory MessageContentTextAnnotationsFilePathObject([void updates(MessageContentTextAnnotationsFilePathObjectBuilder b)]) = _$MessageContentTextAnnotationsFilePathObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentTextAnnotationsFilePathObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentTextAnnotationsFilePathObject> get serializer => _$MessageContentTextAnnotationsFilePathObjectSerializer();
}

class _$MessageContentTextAnnotationsFilePathObjectSerializer implements PrimitiveSerializer<MessageContentTextAnnotationsFilePathObject> {
  @override
  final Iterable<Type> types = const [MessageContentTextAnnotationsFilePathObject, _$MessageContentTextAnnotationsFilePathObject];

  @override
  final String wireName = r'MessageContentTextAnnotationsFilePathObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentTextAnnotationsFilePathObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageContentTextAnnotationsFilePathObjectTypeEnum),
    );
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
    yield r'file_path';
    yield serializers.serialize(
      object.filePath,
      specifiedType: const FullType(MessageContentTextAnnotationsFilePathObjectFilePath),
    );
    yield r'start_index';
    yield serializers.serialize(
      object.startIndex,
      specifiedType: const FullType(int),
    );
    yield r'end_index';
    yield serializers.serialize(
      object.endIndex,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentTextAnnotationsFilePathObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentTextAnnotationsFilePathObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentTextAnnotationsFilePathObjectTypeEnum),
          ) as MessageContentTextAnnotationsFilePathObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        case r'file_path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentTextAnnotationsFilePathObjectFilePath),
          ) as MessageContentTextAnnotationsFilePathObjectFilePath;
          result.filePath.replace(valueDes);
          break;
        case r'start_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.startIndex = valueDes;
          break;
        case r'end_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.endIndex = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageContentTextAnnotationsFilePathObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentTextAnnotationsFilePathObjectBuilder();
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

class MessageContentTextAnnotationsFilePathObjectTypeEnum extends EnumClass {

  /// Always `file_path`.
  @BuiltValueEnumConst(wireName: r'file_path')
  static const MessageContentTextAnnotationsFilePathObjectTypeEnum filePath = _$messageContentTextAnnotationsFilePathObjectTypeEnum_filePath;

  static Serializer<MessageContentTextAnnotationsFilePathObjectTypeEnum> get serializer => _$messageContentTextAnnotationsFilePathObjectTypeEnumSerializer;

  const MessageContentTextAnnotationsFilePathObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageContentTextAnnotationsFilePathObjectTypeEnum> get values => _$messageContentTextAnnotationsFilePathObjectTypeEnumValues;
  static MessageContentTextAnnotationsFilePathObjectTypeEnum valueOf(String name) => _$messageContentTextAnnotationsFilePathObjectTypeEnumValueOf(name);
}

