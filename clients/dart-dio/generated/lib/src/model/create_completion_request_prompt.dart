//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_completion_request_prompt.g.dart';

/// The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
@BuiltValue()
abstract class CreateCompletionRequestPrompt implements Built<CreateCompletionRequestPrompt, CreateCompletionRequestPromptBuilder> {
  /// One Of [BuiltList<BuiltList<int>>], [BuiltList<String>], [BuiltList<int>], [String]
  OneOf get oneOf;

  CreateCompletionRequestPrompt._();

  factory CreateCompletionRequestPrompt([void updates(CreateCompletionRequestPromptBuilder b)]) = _$CreateCompletionRequestPrompt;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateCompletionRequestPromptBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateCompletionRequestPrompt> get serializer => _$CreateCompletionRequestPromptSerializer();
}

class _$CreateCompletionRequestPromptSerializer implements PrimitiveSerializer<CreateCompletionRequestPrompt> {
  @override
  final Iterable<Type> types = const [CreateCompletionRequestPrompt, _$CreateCompletionRequestPrompt];

  @override
  final String wireName = r'CreateCompletionRequestPrompt';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateCompletionRequestPrompt object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateCompletionRequestPrompt object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateCompletionRequestPrompt deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateCompletionRequestPromptBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(String)]), FullType(BuiltList, [FullType(int)]), FullType(BuiltList, [FullType(BuiltList, [FullType(int)])]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

