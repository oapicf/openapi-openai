//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_path_object_file_path.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_text_annotations_file_path_object.g.dart';

/// A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
///
/// Properties:
/// * [index] - The index of the annotation in the text content part.
/// * [type] - Always `file_path`.
/// * [text] - The text in the message content that needs to be replaced.
/// * [filePath] 
/// * [startIndex] 
/// * [endIndex] 
@BuiltValue()
abstract class MessageDeltaContentTextAnnotationsFilePathObject implements Built<MessageDeltaContentTextAnnotationsFilePathObject, MessageDeltaContentTextAnnotationsFilePathObjectBuilder> {
  /// The index of the annotation in the text content part.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `file_path`.
  @BuiltValueField(wireName: r'type')
  MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum get type;
  // enum typeEnum {  file_path,  };

  /// The text in the message content that needs to be replaced.
  @BuiltValueField(wireName: r'text')
  String? get text;

  @BuiltValueField(wireName: r'file_path')
  MessageDeltaContentTextAnnotationsFilePathObjectFilePath? get filePath;

  @BuiltValueField(wireName: r'start_index')
  int? get startIndex;

  @BuiltValueField(wireName: r'end_index')
  int? get endIndex;

  MessageDeltaContentTextAnnotationsFilePathObject._();

  factory MessageDeltaContentTextAnnotationsFilePathObject([void updates(MessageDeltaContentTextAnnotationsFilePathObjectBuilder b)]) = _$MessageDeltaContentTextAnnotationsFilePathObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentTextAnnotationsFilePathObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentTextAnnotationsFilePathObject> get serializer => _$MessageDeltaContentTextAnnotationsFilePathObjectSerializer();
}

class _$MessageDeltaContentTextAnnotationsFilePathObjectSerializer implements PrimitiveSerializer<MessageDeltaContentTextAnnotationsFilePathObject> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentTextAnnotationsFilePathObject, _$MessageDeltaContentTextAnnotationsFilePathObject];

  @override
  final String wireName = r'MessageDeltaContentTextAnnotationsFilePathObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentTextAnnotationsFilePathObject object, {
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
      specifiedType: const FullType(MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum),
    );
    if (object.text != null) {
      yield r'text';
      yield serializers.serialize(
        object.text,
        specifiedType: const FullType(String),
      );
    }
    if (object.filePath != null) {
      yield r'file_path';
      yield serializers.serialize(
        object.filePath,
        specifiedType: const FullType(MessageDeltaContentTextAnnotationsFilePathObjectFilePath),
      );
    }
    if (object.startIndex != null) {
      yield r'start_index';
      yield serializers.serialize(
        object.startIndex,
        specifiedType: const FullType(int),
      );
    }
    if (object.endIndex != null) {
      yield r'end_index';
      yield serializers.serialize(
        object.endIndex,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentTextAnnotationsFilePathObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentTextAnnotationsFilePathObjectBuilder result,
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
            specifiedType: const FullType(MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum),
          ) as MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum;
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
            specifiedType: const FullType(MessageDeltaContentTextAnnotationsFilePathObjectFilePath),
          ) as MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
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
  MessageDeltaContentTextAnnotationsFilePathObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentTextAnnotationsFilePathObjectBuilder();
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

class MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum extends EnumClass {

  /// Always `file_path`.
  @BuiltValueEnumConst(wireName: r'file_path')
  static const MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum filePath = _$messageDeltaContentTextAnnotationsFilePathObjectTypeEnum_filePath;

  static Serializer<MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum> get serializer => _$messageDeltaContentTextAnnotationsFilePathObjectTypeEnumSerializer;

  const MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum> get values => _$messageDeltaContentTextAnnotationsFilePathObjectTypeEnumValues;
  static MessageDeltaContentTextAnnotationsFilePathObjectTypeEnum valueOf(String name) => _$messageDeltaContentTextAnnotationsFilePathObjectTypeEnumValueOf(name);
}

