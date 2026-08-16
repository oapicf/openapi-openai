//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_delta_content_text_annotations_file_citation_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_citation_object_file_citation.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_path_object_file_path.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_path_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'message_delta_content_text_object_text_annotations_inner.g.dart';

/// MessageDeltaContentTextObjectTextAnnotationsInner
///
/// Properties:
/// * [index] - The index of the annotation in the text content part.
/// * [type] - Always `file_citation`.
/// * [text] - The text in the message content that needs to be replaced.
/// * [fileCitation] 
/// * [startIndex] 
/// * [endIndex] 
/// * [filePath] 
@BuiltValue()
abstract class MessageDeltaContentTextObjectTextAnnotationsInner implements Built<MessageDeltaContentTextObjectTextAnnotationsInner, MessageDeltaContentTextObjectTextAnnotationsInnerBuilder> {
  /// One Of [MessageDeltaContentTextAnnotationsFileCitationObject], [MessageDeltaContentTextAnnotationsFilePathObject]
  OneOf get oneOf;

  MessageDeltaContentTextObjectTextAnnotationsInner._();

  factory MessageDeltaContentTextObjectTextAnnotationsInner([void updates(MessageDeltaContentTextObjectTextAnnotationsInnerBuilder b)]) = _$MessageDeltaContentTextObjectTextAnnotationsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentTextObjectTextAnnotationsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentTextObjectTextAnnotationsInner> get serializer => _$MessageDeltaContentTextObjectTextAnnotationsInnerSerializer();
}

class _$MessageDeltaContentTextObjectTextAnnotationsInnerSerializer implements PrimitiveSerializer<MessageDeltaContentTextObjectTextAnnotationsInner> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentTextObjectTextAnnotationsInner, _$MessageDeltaContentTextObjectTextAnnotationsInner];

  @override
  final String wireName = r'MessageDeltaContentTextObjectTextAnnotationsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentTextObjectTextAnnotationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentTextObjectTextAnnotationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  MessageDeltaContentTextObjectTextAnnotationsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentTextObjectTextAnnotationsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(MessageDeltaContentTextAnnotationsFileCitationObject), FullType(MessageDeltaContentTextAnnotationsFilePathObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum extends EnumClass {

  /// Always `file_citation`.
  @BuiltValueEnumConst(wireName: r'file_citation')
  static const MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum fileCitation = _$messageDeltaContentTextObjectTextAnnotationsInnerTypeEnum_fileCitation;
  /// Always `file_citation`.
  @BuiltValueEnumConst(wireName: r'file_path')
  static const MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum filePath = _$messageDeltaContentTextObjectTextAnnotationsInnerTypeEnum_filePath;

  static Serializer<MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum> get serializer => _$messageDeltaContentTextObjectTextAnnotationsInnerTypeEnumSerializer;

  const MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum> get values => _$messageDeltaContentTextObjectTextAnnotationsInnerTypeEnumValues;
  static MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum valueOf(String name) => _$messageDeltaContentTextObjectTextAnnotationsInnerTypeEnumValueOf(name);
}

