//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_request_content_text_object.dart';
import 'package:openapi/src/model/message_content_image_file_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_content_image_url_object_image_url.dart';
import 'package:openapi/src/model/message_content_image_url_object.dart';
import 'package:openapi/src/model/message_content_image_file_object_image_file.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'array_of_content_parts_inner.g.dart';

/// ArrayOfContentPartsInner
///
/// Properties:
/// * [type] - Always `image_file`.
/// * [imageFile] 
/// * [imageUrl] 
/// * [text] - Text content to be sent to the model
@BuiltValue()
abstract class ArrayOfContentPartsInner implements Built<ArrayOfContentPartsInner, ArrayOfContentPartsInnerBuilder> {
  /// One Of [MessageContentImageFileObject], [MessageContentImageUrlObject], [MessageRequestContentTextObject]
  OneOf get oneOf;

  ArrayOfContentPartsInner._();

  factory ArrayOfContentPartsInner([void updates(ArrayOfContentPartsInnerBuilder b)]) = _$ArrayOfContentPartsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ArrayOfContentPartsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ArrayOfContentPartsInner> get serializer => _$ArrayOfContentPartsInnerSerializer();
}

class _$ArrayOfContentPartsInnerSerializer implements PrimitiveSerializer<ArrayOfContentPartsInner> {
  @override
  final Iterable<Type> types = const [ArrayOfContentPartsInner, _$ArrayOfContentPartsInner];

  @override
  final String wireName = r'ArrayOfContentPartsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ArrayOfContentPartsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ArrayOfContentPartsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ArrayOfContentPartsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ArrayOfContentPartsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(MessageContentImageFileObject), FullType(MessageContentImageUrlObject), FullType(MessageRequestContentTextObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class ArrayOfContentPartsInnerTypeEnum extends EnumClass {

  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_file')
  static const ArrayOfContentPartsInnerTypeEnum imageFile = _$arrayOfContentPartsInnerTypeEnum_imageFile;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const ArrayOfContentPartsInnerTypeEnum imageUrl = _$arrayOfContentPartsInnerTypeEnum_imageUrl;
  /// Always `image_file`.
  @BuiltValueEnumConst(wireName: r'text')
  static const ArrayOfContentPartsInnerTypeEnum text = _$arrayOfContentPartsInnerTypeEnum_text;

  static Serializer<ArrayOfContentPartsInnerTypeEnum> get serializer => _$arrayOfContentPartsInnerTypeEnumSerializer;

  const ArrayOfContentPartsInnerTypeEnum._(String name): super(name);

  static BuiltSet<ArrayOfContentPartsInnerTypeEnum> get values => _$arrayOfContentPartsInnerTypeEnumValues;
  static ArrayOfContentPartsInnerTypeEnum valueOf(String name) => _$arrayOfContentPartsInnerTypeEnumValueOf(name);
}

