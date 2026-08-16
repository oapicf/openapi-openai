//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_content_text_object_text_annotations_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_text_object_text.g.dart';

/// MessageContentTextObjectText
///
/// Properties:
/// * [value] - The data that makes up the text.
/// * [annotations] 
@BuiltValue()
abstract class MessageContentTextObjectText implements Built<MessageContentTextObjectText, MessageContentTextObjectTextBuilder> {
  /// The data that makes up the text.
  @BuiltValueField(wireName: r'value')
  String get value;

  @BuiltValueField(wireName: r'annotations')
  BuiltList<MessageContentTextObjectTextAnnotationsInner> get annotations;

  MessageContentTextObjectText._();

  factory MessageContentTextObjectText([void updates(MessageContentTextObjectTextBuilder b)]) = _$MessageContentTextObjectText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentTextObjectTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentTextObjectText> get serializer => _$MessageContentTextObjectTextSerializer();
}

class _$MessageContentTextObjectTextSerializer implements PrimitiveSerializer<MessageContentTextObjectText> {
  @override
  final Iterable<Type> types = const [MessageContentTextObjectText, _$MessageContentTextObjectText];

  @override
  final String wireName = r'MessageContentTextObjectText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentTextObjectText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
    yield r'annotations';
    yield serializers.serialize(
      object.annotations,
      specifiedType: const FullType(BuiltList, [FullType(MessageContentTextObjectTextAnnotationsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentTextObjectText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentTextObjectTextBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(MessageContentTextObjectTextAnnotationsInner)]),
          ) as BuiltList<MessageContentTextObjectTextAnnotationsInner>;
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
  MessageContentTextObjectText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentTextObjectTextBuilder();
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

