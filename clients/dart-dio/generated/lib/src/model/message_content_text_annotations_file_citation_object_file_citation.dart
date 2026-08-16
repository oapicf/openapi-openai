//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_text_annotations_file_citation_object_file_citation.g.dart';

/// MessageContentTextAnnotationsFileCitationObjectFileCitation
///
/// Properties:
/// * [fileId] - The ID of the specific File the citation is from.
@BuiltValue()
abstract class MessageContentTextAnnotationsFileCitationObjectFileCitation implements Built<MessageContentTextAnnotationsFileCitationObjectFileCitation, MessageContentTextAnnotationsFileCitationObjectFileCitationBuilder> {
  /// The ID of the specific File the citation is from.
  @BuiltValueField(wireName: r'file_id')
  String get fileId;

  MessageContentTextAnnotationsFileCitationObjectFileCitation._();

  factory MessageContentTextAnnotationsFileCitationObjectFileCitation([void updates(MessageContentTextAnnotationsFileCitationObjectFileCitationBuilder b)]) = _$MessageContentTextAnnotationsFileCitationObjectFileCitation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentTextAnnotationsFileCitationObjectFileCitationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentTextAnnotationsFileCitationObjectFileCitation> get serializer => _$MessageContentTextAnnotationsFileCitationObjectFileCitationSerializer();
}

class _$MessageContentTextAnnotationsFileCitationObjectFileCitationSerializer implements PrimitiveSerializer<MessageContentTextAnnotationsFileCitationObjectFileCitation> {
  @override
  final Iterable<Type> types = const [MessageContentTextAnnotationsFileCitationObjectFileCitation, _$MessageContentTextAnnotationsFileCitationObjectFileCitation];

  @override
  final String wireName = r'MessageContentTextAnnotationsFileCitationObjectFileCitation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentTextAnnotationsFileCitationObjectFileCitation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'file_id';
    yield serializers.serialize(
      object.fileId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentTextAnnotationsFileCitationObjectFileCitation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentTextAnnotationsFileCitationObjectFileCitationBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageContentTextAnnotationsFileCitationObjectFileCitation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentTextAnnotationsFileCitationObjectFileCitationBuilder();
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

