//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_citation_object_file_citation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_text_annotations_file_citation_object.g.dart';

/// A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
///
/// Properties:
/// * [index] - The index of the annotation in the text content part.
/// * [type] - Always `file_citation`.
/// * [text] - The text in the message content that needs to be replaced.
/// * [fileCitation] 
/// * [startIndex] 
/// * [endIndex] 
@BuiltValue()
abstract class MessageDeltaContentTextAnnotationsFileCitationObject implements Built<MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFileCitationObjectBuilder> {
  /// The index of the annotation in the text content part.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `file_citation`.
  @BuiltValueField(wireName: r'type')
  MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum get type;
  // enum typeEnum {  file_citation,  };

  /// The text in the message content that needs to be replaced.
  @BuiltValueField(wireName: r'text')
  String? get text;

  @BuiltValueField(wireName: r'file_citation')
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? get fileCitation;

  @BuiltValueField(wireName: r'start_index')
  int? get startIndex;

  @BuiltValueField(wireName: r'end_index')
  int? get endIndex;

  MessageDeltaContentTextAnnotationsFileCitationObject._();

  factory MessageDeltaContentTextAnnotationsFileCitationObject([void updates(MessageDeltaContentTextAnnotationsFileCitationObjectBuilder b)]) = _$MessageDeltaContentTextAnnotationsFileCitationObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentTextAnnotationsFileCitationObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentTextAnnotationsFileCitationObject> get serializer => _$MessageDeltaContentTextAnnotationsFileCitationObjectSerializer();
}

class _$MessageDeltaContentTextAnnotationsFileCitationObjectSerializer implements PrimitiveSerializer<MessageDeltaContentTextAnnotationsFileCitationObject> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentTextAnnotationsFileCitationObject, _$MessageDeltaContentTextAnnotationsFileCitationObject];

  @override
  final String wireName = r'MessageDeltaContentTextAnnotationsFileCitationObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentTextAnnotationsFileCitationObject object, {
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
      specifiedType: const FullType(MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum),
    );
    if (object.text != null) {
      yield r'text';
      yield serializers.serialize(
        object.text,
        specifiedType: const FullType(String),
      );
    }
    if (object.fileCitation != null) {
      yield r'file_citation';
      yield serializers.serialize(
        object.fileCitation,
        specifiedType: const FullType(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation),
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
    MessageDeltaContentTextAnnotationsFileCitationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentTextAnnotationsFileCitationObjectBuilder result,
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
            specifiedType: const FullType(MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum),
          ) as MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        case r'file_citation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation),
          ) as MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
          result.fileCitation.replace(valueDes);
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
  MessageDeltaContentTextAnnotationsFileCitationObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentTextAnnotationsFileCitationObjectBuilder();
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

class MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum extends EnumClass {

  /// Always `file_citation`.
  @BuiltValueEnumConst(wireName: r'file_citation')
  static const MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum fileCitation = _$messageDeltaContentTextAnnotationsFileCitationObjectTypeEnum_fileCitation;

  static Serializer<MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum> get serializer => _$messageDeltaContentTextAnnotationsFileCitationObjectTypeEnumSerializer;

  const MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum> get values => _$messageDeltaContentTextAnnotationsFileCitationObjectTypeEnumValues;
  static MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum valueOf(String name) => _$messageDeltaContentTextAnnotationsFileCitationObjectTypeEnumValueOf(name);
}

