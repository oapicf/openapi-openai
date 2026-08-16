//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_embedding_request_model.g.dart';

/// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
@BuiltValue()
abstract class CreateEmbeddingRequestModel implements Built<CreateEmbeddingRequestModel, CreateEmbeddingRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateEmbeddingRequestModel._();

  factory CreateEmbeddingRequestModel([void updates(CreateEmbeddingRequestModelBuilder b)]) = _$CreateEmbeddingRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateEmbeddingRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateEmbeddingRequestModel> get serializer => _$CreateEmbeddingRequestModelSerializer();
}

class _$CreateEmbeddingRequestModelSerializer implements PrimitiveSerializer<CreateEmbeddingRequestModel> {
  @override
  final Iterable<Type> types = const [CreateEmbeddingRequestModel, _$CreateEmbeddingRequestModel];

  @override
  final String wireName = r'CreateEmbeddingRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateEmbeddingRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateEmbeddingRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateEmbeddingRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateEmbeddingRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

