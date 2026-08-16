//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner_one_of1.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner_one_of_image_url.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner_one_of.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_moderation_request_input_one_of_inner.g.dart';

/// CreateModerationRequestInputOneOfInner
///
/// Properties:
/// * [type] - Always `image_url`.
/// * [imageUrl] 
/// * [text] - A string of text to classify.
@BuiltValue()
abstract class CreateModerationRequestInputOneOfInner implements Built<CreateModerationRequestInputOneOfInner, CreateModerationRequestInputOneOfInnerBuilder> {
  /// One Of [CreateModerationRequestInputOneOfInnerOneOf], [CreateModerationRequestInputOneOfInnerOneOf1]
  OneOf get oneOf;

  CreateModerationRequestInputOneOfInner._();

  factory CreateModerationRequestInputOneOfInner([void updates(CreateModerationRequestInputOneOfInnerBuilder b)]) = _$CreateModerationRequestInputOneOfInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationRequestInputOneOfInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationRequestInputOneOfInner> get serializer => _$CreateModerationRequestInputOneOfInnerSerializer();
}

class _$CreateModerationRequestInputOneOfInnerSerializer implements PrimitiveSerializer<CreateModerationRequestInputOneOfInner> {
  @override
  final Iterable<Type> types = const [CreateModerationRequestInputOneOfInner, _$CreateModerationRequestInputOneOfInner];

  @override
  final String wireName = r'CreateModerationRequestInputOneOfInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationRequestInputOneOfInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationRequestInputOneOfInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateModerationRequestInputOneOfInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationRequestInputOneOfInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CreateModerationRequestInputOneOfInnerOneOf), FullType(CreateModerationRequestInputOneOfInnerOneOf1), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CreateModerationRequestInputOneOfInnerTypeEnum extends EnumClass {

  /// Always `image_url`.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const CreateModerationRequestInputOneOfInnerTypeEnum imageUrl = _$createModerationRequestInputOneOfInnerTypeEnum_imageUrl;
  /// Always `image_url`.
  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationRequestInputOneOfInnerTypeEnum text = _$createModerationRequestInputOneOfInnerTypeEnum_text;

  static Serializer<CreateModerationRequestInputOneOfInnerTypeEnum> get serializer => _$createModerationRequestInputOneOfInnerTypeEnumSerializer;

  const CreateModerationRequestInputOneOfInnerTypeEnum._(String name): super(name);

  static BuiltSet<CreateModerationRequestInputOneOfInnerTypeEnum> get values => _$createModerationRequestInputOneOfInnerTypeEnumValues;
  static CreateModerationRequestInputOneOfInnerTypeEnum valueOf(String name) => _$createModerationRequestInputOneOfInnerTypeEnumValueOf(name);
}

