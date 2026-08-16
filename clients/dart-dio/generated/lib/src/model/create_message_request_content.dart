//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/array_of_content_parts_inner.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_message_request_content.g.dart';

/// CreateMessageRequestContent
@BuiltValue()
abstract class CreateMessageRequestContent implements Built<CreateMessageRequestContent, CreateMessageRequestContentBuilder> {
  /// One Of [BuiltList<ArrayOfContentPartsInner>], [String]
  OneOf get oneOf;

  CreateMessageRequestContent._();

  factory CreateMessageRequestContent([void updates(CreateMessageRequestContentBuilder b)]) = _$CreateMessageRequestContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateMessageRequestContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateMessageRequestContent> get serializer => _$CreateMessageRequestContentSerializer();
}

class _$CreateMessageRequestContentSerializer implements PrimitiveSerializer<CreateMessageRequestContent> {
  @override
  final Iterable<Type> types = const [CreateMessageRequestContent, _$CreateMessageRequestContent];

  @override
  final String wireName = r'CreateMessageRequestContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateMessageRequestContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateMessageRequestContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateMessageRequestContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateMessageRequestContentBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(ArrayOfContentPartsInner)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

