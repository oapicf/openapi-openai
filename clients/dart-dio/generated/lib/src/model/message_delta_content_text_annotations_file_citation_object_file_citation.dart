//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_text_annotations_file_citation_object_file_citation.g.dart';

/// MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
///
/// Properties:
/// * [fileId] - The ID of the specific File the citation is from.
/// * [quote] - The specific quote in the file.
@BuiltValue()
abstract class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation implements Built<MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation, MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationBuilder> {
  /// The ID of the specific File the citation is from.
  @BuiltValueField(wireName: r'file_id')
  String? get fileId;

  /// The specific quote in the file.
  @BuiltValueField(wireName: r'quote')
  String? get quote;

  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation._();

  factory MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation([void updates(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationBuilder b)]) = _$MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation> get serializer => _$MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationSerializer();
}

class _$MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationSerializer implements PrimitiveSerializer<MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation, _$MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation];

  @override
  final String wireName = r'MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileId != null) {
      yield r'file_id';
      yield serializers.serialize(
        object.fileId,
        specifiedType: const FullType(String),
      );
    }
    if (object.quote != null) {
      yield r'quote';
      yield serializers.serialize(
        object.quote,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationBuilder result,
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
        case r'quote':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.quote = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationBuilder();
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

