//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_content_text_object.dart';
import 'package:openapi/src/model/message_content_text_object_text.dart';
import 'package:openapi/src/model/message_content_image_file_object.dart';
import 'package:openapi/src/model/message_content_refusal_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_content_image_url_object_image_url.dart';
import 'package:openapi/src/model/message_content_image_url_object.dart';
import 'package:openapi/src/model/message_content_image_file_object_image_file.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'message_object_content_inner.g.dart';

/// MessageObjectContentInner
///
/// Properties:
/// * [type] - Always `image_file`.
/// * [imageFile] 
/// * [imageUrl] 
/// * [text] 
/// * [refusal] 
@BuiltValue()
abstract class MessageObjectContentInner implements Built<MessageObjectContentInner, MessageObjectContentInnerBuilder> {
  /// One Of [MessageContentImageFileObject], [MessageContentImageUrlObject], [MessageContentRefusalObject], [MessageContentTextObject]
  OneOf get oneOf;

  MessageObjectContentInner._();

  factory MessageObjectContentInner([void updates(MessageObjectContentInnerBuilder b)]) = _$MessageObjectContentInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageObjectContentInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageObjectContentInner> get serializer => _$MessageObjectContentInnerSerializer();
}

class _$MessageObjectContentInnerSerializer implements PrimitiveSerializer<MessageObjectContentInner> {
  @override
  final Iterable<Type> types = const [MessageObjectContentInner, _$MessageObjectContentInner];

  @override
  final String wireName = r'MessageObjectContentInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageObjectContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageObjectContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  MessageObjectContentInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageObjectContentInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(MessageContentImageFileObject), FullType(MessageContentImageUrlObject), FullType(MessageContentTextObject), FullType(MessageContentRefusalObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class MessageObjectContentInnerTypeEnum extends EnumClass {

  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_file')
  static const MessageObjectContentInnerTypeEnum imageFile = _$messageObjectContentInnerTypeEnum_imageFile;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const MessageObjectContentInnerTypeEnum imageUrl = _$messageObjectContentInnerTypeEnum_imageUrl;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'text')
  static const MessageObjectContentInnerTypeEnum text = _$messageObjectContentInnerTypeEnum_text;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'refusal')
  static const MessageObjectContentInnerTypeEnum refusal = _$messageObjectContentInnerTypeEnum_refusal;

  static Serializer<MessageObjectContentInnerTypeEnum> get serializer => _$messageObjectContentInnerTypeEnumSerializer;

  const MessageObjectContentInnerTypeEnum._(String name): super(name);

  static BuiltSet<MessageObjectContentInnerTypeEnum> get values => _$messageObjectContentInnerTypeEnumValues;
  static MessageObjectContentInnerTypeEnum valueOf(String name) => _$messageObjectContentInnerTypeEnumValueOf(name);
}

