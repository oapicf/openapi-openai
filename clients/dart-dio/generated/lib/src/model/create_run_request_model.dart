//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_run_request_model.g.dart';

/// The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
@BuiltValue()
abstract class CreateRunRequestModel implements Built<CreateRunRequestModel, CreateRunRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateRunRequestModel._();

  factory CreateRunRequestModel([void updates(CreateRunRequestModelBuilder b)]) = _$CreateRunRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateRunRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateRunRequestModel> get serializer => _$CreateRunRequestModelSerializer();
}

class _$CreateRunRequestModelSerializer implements PrimitiveSerializer<CreateRunRequestModel> {
  @override
  final Iterable<Type> types = const [CreateRunRequestModel, _$CreateRunRequestModel];

  @override
  final String wireName = r'CreateRunRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateRunRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateRunRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateRunRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateRunRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

