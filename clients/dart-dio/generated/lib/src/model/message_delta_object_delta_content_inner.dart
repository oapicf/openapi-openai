//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_delta_content_text_object_text.dart';
import 'package:openapi/src/model/message_delta_content_image_file_object_image_file.dart';
import 'package:openapi/src/model/message_delta_content_image_url_object_image_url.dart';
import 'package:openapi/src/model/message_delta_content_image_file_object.dart';
import 'package:openapi/src/model/message_delta_content_refusal_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_delta_content_image_url_object.dart';
import 'package:openapi/src/model/message_delta_content_text_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'message_delta_object_delta_content_inner.g.dart';

/// MessageDeltaObjectDeltaContentInner
///
/// Properties:
/// * [index] - The index of the content part in the message.
/// * [type] - Always `image_file`.
/// * [imageFile] 
/// * [text] 
/// * [refusal] 
/// * [imageUrl] 
@BuiltValue()
abstract class MessageDeltaObjectDeltaContentInner implements Built<MessageDeltaObjectDeltaContentInner, MessageDeltaObjectDeltaContentInnerBuilder> {
  /// One Of [MessageDeltaContentImageFileObject], [MessageDeltaContentImageUrlObject], [MessageDeltaContentRefusalObject], [MessageDeltaContentTextObject]
  OneOf get oneOf;

  MessageDeltaObjectDeltaContentInner._();

  factory MessageDeltaObjectDeltaContentInner([void updates(MessageDeltaObjectDeltaContentInnerBuilder b)]) = _$MessageDeltaObjectDeltaContentInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaObjectDeltaContentInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaObjectDeltaContentInner> get serializer => _$MessageDeltaObjectDeltaContentInnerSerializer();
}

class _$MessageDeltaObjectDeltaContentInnerSerializer implements PrimitiveSerializer<MessageDeltaObjectDeltaContentInner> {
  @override
  final Iterable<Type> types = const [MessageDeltaObjectDeltaContentInner, _$MessageDeltaObjectDeltaContentInner];

  @override
  final String wireName = r'MessageDeltaObjectDeltaContentInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaObjectDeltaContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaObjectDeltaContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  MessageDeltaObjectDeltaContentInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaObjectDeltaContentInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(MessageDeltaContentImageFileObject), FullType(MessageDeltaContentTextObject), FullType(MessageDeltaContentRefusalObject), FullType(MessageDeltaContentImageUrlObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class MessageDeltaObjectDeltaContentInnerTypeEnum extends EnumClass {

  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_file')
  static const MessageDeltaObjectDeltaContentInnerTypeEnum imageFile = _$messageDeltaObjectDeltaContentInnerTypeEnum_imageFile;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'text')
  static const MessageDeltaObjectDeltaContentInnerTypeEnum text = _$messageDeltaObjectDeltaContentInnerTypeEnum_text;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'refusal')
  static const MessageDeltaObjectDeltaContentInnerTypeEnum refusal = _$messageDeltaObjectDeltaContentInnerTypeEnum_refusal;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const MessageDeltaObjectDeltaContentInnerTypeEnum imageUrl = _$messageDeltaObjectDeltaContentInnerTypeEnum_imageUrl;

  static Serializer<MessageDeltaObjectDeltaContentInnerTypeEnum> get serializer => _$messageDeltaObjectDeltaContentInnerTypeEnumSerializer;

  const MessageDeltaObjectDeltaContentInnerTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaObjectDeltaContentInnerTypeEnum> get values => _$messageDeltaObjectDeltaContentInnerTypeEnumValues;
  static MessageDeltaObjectDeltaContentInnerTypeEnum valueOf(String name) => _$messageDeltaObjectDeltaContentInnerTypeEnumValueOf(name);
}

