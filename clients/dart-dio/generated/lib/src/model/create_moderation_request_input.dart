//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_moderation_request_input.g.dart';

/// Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
@BuiltValue()
abstract class CreateModerationRequestInput implements Built<CreateModerationRequestInput, CreateModerationRequestInputBuilder> {
  /// One Of [BuiltList<CreateModerationRequestInputOneOfInner>], [BuiltList<String>], [String]
  OneOf get oneOf;

  CreateModerationRequestInput._();

  factory CreateModerationRequestInput([void updates(CreateModerationRequestInputBuilder b)]) = _$CreateModerationRequestInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationRequestInputBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationRequestInput> get serializer => _$CreateModerationRequestInputSerializer();
}

class _$CreateModerationRequestInputSerializer implements PrimitiveSerializer<CreateModerationRequestInput> {
  @override
  final Iterable<Type> types = const [CreateModerationRequestInput, _$CreateModerationRequestInput];

  @override
  final String wireName = r'CreateModerationRequestInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateModerationRequestInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationRequestInputBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(String)]), FullType(BuiltList, [FullType(CreateModerationRequestInputOneOfInner)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

