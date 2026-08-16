//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_content_text_annotations_file_path_object_file_path.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_citation_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_citation_object_file_citation.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_path_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'message_content_text_object_text_annotations_inner.g.dart';

/// MessageContentTextObjectTextAnnotationsInner
///
/// Properties:
/// * [type] - Always `file_citation`.
/// * [text] - The text in the message content that needs to be replaced.
/// * [fileCitation] 
/// * [startIndex] 
/// * [endIndex] 
/// * [filePath] 
@BuiltValue()
abstract class MessageContentTextObjectTextAnnotationsInner implements Built<MessageContentTextObjectTextAnnotationsInner, MessageContentTextObjectTextAnnotationsInnerBuilder> {
  /// One Of [MessageContentTextAnnotationsFileCitationObject], [MessageContentTextAnnotationsFilePathObject]
  OneOf get oneOf;

  MessageContentTextObjectTextAnnotationsInner._();

  factory MessageContentTextObjectTextAnnotationsInner([void updates(MessageContentTextObjectTextAnnotationsInnerBuilder b)]) = _$MessageContentTextObjectTextAnnotationsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentTextObjectTextAnnotationsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentTextObjectTextAnnotationsInner> get serializer => _$MessageContentTextObjectTextAnnotationsInnerSerializer();
}

class _$MessageContentTextObjectTextAnnotationsInnerSerializer implements PrimitiveSerializer<MessageContentTextObjectTextAnnotationsInner> {
  @override
  final Iterable<Type> types = const [MessageContentTextObjectTextAnnotationsInner, _$MessageContentTextObjectTextAnnotationsInner];

  @override
  final String wireName = r'MessageContentTextObjectTextAnnotationsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentTextObjectTextAnnotationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentTextObjectTextAnnotationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  MessageContentTextObjectTextAnnotationsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentTextObjectTextAnnotationsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(MessageContentTextAnnotationsFileCitationObject), FullType(MessageContentTextAnnotationsFilePathObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class MessageContentTextObjectTextAnnotationsInnerTypeEnum extends EnumClass {

  /// Always `file_citation`.
  @BuiltValueEnumConst(wireName: r'file_citation')
  static const MessageContentTextObjectTextAnnotationsInnerTypeEnum fileCitation = _$messageContentTextObjectTextAnnotationsInnerTypeEnum_fileCitation;
  /// Always `file_citation`.
  @BuiltValueEnumConst(wireName: r'file_path')
  static const MessageContentTextObjectTextAnnotationsInnerTypeEnum filePath = _$messageContentTextObjectTextAnnotationsInnerTypeEnum_filePath;

  static Serializer<MessageContentTextObjectTextAnnotationsInnerTypeEnum> get serializer => _$messageContentTextObjectTextAnnotationsInnerTypeEnumSerializer;

  const MessageContentTextObjectTextAnnotationsInnerTypeEnum._(String name): super(name);

  static BuiltSet<MessageContentTextObjectTextAnnotationsInnerTypeEnum> get values => _$messageContentTextObjectTextAnnotationsInnerTypeEnumValues;
  static MessageContentTextObjectTextAnnotationsInnerTypeEnum valueOf(String name) => _$messageContentTextObjectTextAnnotationsInnerTypeEnumValueOf(name);
}

