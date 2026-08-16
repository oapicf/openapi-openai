//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_citation_object_file_citation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_text_annotations_file_citation_object.g.dart';

/// A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
///
/// Properties:
/// * [type] - Always `file_citation`.
/// * [text] - The text in the message content that needs to be replaced.
/// * [fileCitation] 
/// * [startIndex] 
/// * [endIndex] 
@BuiltValue()
abstract class MessageContentTextAnnotationsFileCitationObject implements Built<MessageContentTextAnnotationsFileCitationObject, MessageContentTextAnnotationsFileCitationObjectBuilder> {
  /// Always `file_citation`.
  @BuiltValueField(wireName: r'type')
  MessageContentTextAnnotationsFileCitationObjectTypeEnum get type;
  // enum typeEnum {  file_citation,  };

  /// The text in the message content that needs to be replaced.
  @BuiltValueField(wireName: r'text')
  String get text;

  @BuiltValueField(wireName: r'file_citation')
  MessageContentTextAnnotationsFileCitationObjectFileCitation get fileCitation;

  @BuiltValueField(wireName: r'start_index')
  int get startIndex;

  @BuiltValueField(wireName: r'end_index')
  int get endIndex;

  MessageContentTextAnnotationsFileCitationObject._();

  factory MessageContentTextAnnotationsFileCitationObject([void updates(MessageContentTextAnnotationsFileCitationObjectBuilder b)]) = _$MessageContentTextAnnotationsFileCitationObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentTextAnnotationsFileCitationObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentTextAnnotationsFileCitationObject> get serializer => _$MessageContentTextAnnotationsFileCitationObjectSerializer();
}

class _$MessageContentTextAnnotationsFileCitationObjectSerializer implements PrimitiveSerializer<MessageContentTextAnnotationsFileCitationObject> {
  @override
  final Iterable<Type> types = const [MessageContentTextAnnotationsFileCitationObject, _$MessageContentTextAnnotationsFileCitationObject];

  @override
  final String wireName = r'MessageContentTextAnnotationsFileCitationObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentTextAnnotationsFileCitationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageContentTextAnnotationsFileCitationObjectTypeEnum),
    );
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
    yield r'file_citation';
    yield serializers.serialize(
      object.fileCitation,
      specifiedType: const FullType(MessageContentTextAnnotationsFileCitationObjectFileCitation),
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
    MessageContentTextAnnotationsFileCitationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentTextAnnotationsFileCitationObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageContentTextAnnotationsFileCitationObjectTypeEnum),
          ) as MessageContentTextAnnotationsFileCitationObjectTypeEnum;
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
            specifiedType: const FullType(MessageContentTextAnnotationsFileCitationObjectFileCitation),
          ) as MessageContentTextAnnotationsFileCitationObjectFileCitation;
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
  MessageContentTextAnnotationsFileCitationObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentTextAnnotationsFileCitationObjectBuilder();
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

class MessageContentTextAnnotationsFileCitationObjectTypeEnum extends EnumClass {

  /// Always `file_citation`.
  @BuiltValueEnumConst(wireName: r'file_citation')
  static const MessageContentTextAnnotationsFileCitationObjectTypeEnum fileCitation = _$messageContentTextAnnotationsFileCitationObjectTypeEnum_fileCitation;

  static Serializer<MessageContentTextAnnotationsFileCitationObjectTypeEnum> get serializer => _$messageContentTextAnnotationsFileCitationObjectTypeEnumSerializer;

  const MessageContentTextAnnotationsFileCitationObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageContentTextAnnotationsFileCitationObjectTypeEnum> get values => _$messageContentTextAnnotationsFileCitationObjectTypeEnumValues;
  static MessageContentTextAnnotationsFileCitationObjectTypeEnum valueOf(String name) => _$messageContentTextAnnotationsFileCitationObjectTypeEnumValueOf(name);
}

