//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_embedding_request_input.g.dart';

/// Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
@BuiltValue()
abstract class CreateEmbeddingRequestInput implements Built<CreateEmbeddingRequestInput, CreateEmbeddingRequestInputBuilder> {
  /// One Of [BuiltList<BuiltList<int>>], [BuiltList<String>], [BuiltList<int>], [String]
  OneOf get oneOf;

  CreateEmbeddingRequestInput._();

  factory CreateEmbeddingRequestInput([void updates(CreateEmbeddingRequestInputBuilder b)]) = _$CreateEmbeddingRequestInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateEmbeddingRequestInputBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateEmbeddingRequestInput> get serializer => _$CreateEmbeddingRequestInputSerializer();
}

class _$CreateEmbeddingRequestInputSerializer implements PrimitiveSerializer<CreateEmbeddingRequestInput> {
  @override
  final Iterable<Type> types = const [CreateEmbeddingRequestInput, _$CreateEmbeddingRequestInput];

  @override
  final String wireName = r'CreateEmbeddingRequestInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateEmbeddingRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateEmbeddingRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateEmbeddingRequestInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateEmbeddingRequestInputBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(String)]), FullType(BuiltList, [FullType(int)]), FullType(BuiltList, [FullType(BuiltList, [FullType(int)])]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

