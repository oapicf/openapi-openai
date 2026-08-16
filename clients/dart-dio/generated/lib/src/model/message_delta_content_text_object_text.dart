//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_delta_content_text_object_text_annotations_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_text_object_text.g.dart';

/// MessageDeltaContentTextObjectText
///
/// Properties:
/// * [value] - The data that makes up the text.
/// * [annotations] 
@BuiltValue()
abstract class MessageDeltaContentTextObjectText implements Built<MessageDeltaContentTextObjectText, MessageDeltaContentTextObjectTextBuilder> {
  /// The data that makes up the text.
  @BuiltValueField(wireName: r'value')
  String? get value;

  @BuiltValueField(wireName: r'annotations')
  BuiltList<MessageDeltaContentTextObjectTextAnnotationsInner>? get annotations;

  MessageDeltaContentTextObjectText._();

  factory MessageDeltaContentTextObjectText([void updates(MessageDeltaContentTextObjectTextBuilder b)]) = _$MessageDeltaContentTextObjectText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentTextObjectTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentTextObjectText> get serializer => _$MessageDeltaContentTextObjectTextSerializer();
}

class _$MessageDeltaContentTextObjectTextSerializer implements PrimitiveSerializer<MessageDeltaContentTextObjectText> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentTextObjectText, _$MessageDeltaContentTextObjectText];

  @override
  final String wireName = r'MessageDeltaContentTextObjectText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentTextObjectText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
    if (object.annotations != null) {
      yield r'annotations';
      yield serializers.serialize(
        object.annotations,
        specifiedType: const FullType(BuiltList, [FullType(MessageDeltaContentTextObjectTextAnnotationsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentTextObjectText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentTextObjectTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        case r'annotations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MessageDeltaContentTextObjectTextAnnotationsInner)]),
          ) as BuiltList<MessageDeltaContentTextObjectTextAnnotationsInner>;
          result.annotations.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageDeltaContentTextObjectText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentTextObjectTextBuilder();
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

