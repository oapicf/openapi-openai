//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/chat_completion_function_call_option.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_chat_completion_request_function_call.g.dart';

/// Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model.  `none` means the model will not call a function and instead generates a message.  `auto` means the model can pick between generating a message or calling a function.  Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
///
/// Properties:
/// * [name] - The name of the function to call.
@Deprecated('CreateChatCompletionRequestFunctionCall has been deprecated')
@BuiltValue()
abstract class CreateChatCompletionRequestFunctionCall implements Built<CreateChatCompletionRequestFunctionCall, CreateChatCompletionRequestFunctionCallBuilder> {
  /// One Of [ChatCompletionFunctionCallOption], [String]
  OneOf get oneOf;

  CreateChatCompletionRequestFunctionCall._();

  factory CreateChatCompletionRequestFunctionCall([void updates(CreateChatCompletionRequestFunctionCallBuilder b)]) = _$CreateChatCompletionRequestFunctionCall;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionRequestFunctionCallBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionRequestFunctionCall> get serializer => _$CreateChatCompletionRequestFunctionCallSerializer();
}

class _$CreateChatCompletionRequestFunctionCallSerializer implements PrimitiveSerializer<CreateChatCompletionRequestFunctionCall> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionRequestFunctionCall, _$CreateChatCompletionRequestFunctionCall];

  @override
  final String wireName = r'CreateChatCompletionRequestFunctionCall';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionRequestFunctionCall object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionRequestFunctionCall object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateChatCompletionRequestFunctionCall deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionRequestFunctionCallBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(ChatCompletionFunctionCallOption), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

