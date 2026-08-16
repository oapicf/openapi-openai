//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistants_named_tool_choice_function.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_named_tool_choice.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'chat_completion_tool_choice_option.g.dart';

/// Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. 
///
/// Properties:
/// * [type] - The type of the tool. Currently, only `function` is supported.
/// * [function_] 
@BuiltValue()
abstract class ChatCompletionToolChoiceOption implements Built<ChatCompletionToolChoiceOption, ChatCompletionToolChoiceOptionBuilder> {
  /// One Of [ChatCompletionNamedToolChoice], [String]
  OneOf get oneOf;

  ChatCompletionToolChoiceOption._();

  factory ChatCompletionToolChoiceOption([void updates(ChatCompletionToolChoiceOptionBuilder b)]) = _$ChatCompletionToolChoiceOption;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionToolChoiceOptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionToolChoiceOption> get serializer => _$ChatCompletionToolChoiceOptionSerializer();
}

class _$ChatCompletionToolChoiceOptionSerializer implements PrimitiveSerializer<ChatCompletionToolChoiceOption> {
  @override
  final Iterable<Type> types = const [ChatCompletionToolChoiceOption, _$ChatCompletionToolChoiceOption];

  @override
  final String wireName = r'ChatCompletionToolChoiceOption';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionToolChoiceOption object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionToolChoiceOption object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChatCompletionToolChoiceOption deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionToolChoiceOptionBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(ChatCompletionNamedToolChoice), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class ChatCompletionToolChoiceOptionTypeEnum extends EnumClass {

  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueEnumConst(wireName: r'function')
  static const ChatCompletionToolChoiceOptionTypeEnum function_ = _$chatCompletionToolChoiceOptionTypeEnum_function_;

  static Serializer<ChatCompletionToolChoiceOptionTypeEnum> get serializer => _$chatCompletionToolChoiceOptionTypeEnumSerializer;

  const ChatCompletionToolChoiceOptionTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionToolChoiceOptionTypeEnum> get values => _$chatCompletionToolChoiceOptionTypeEnumValues;
  static ChatCompletionToolChoiceOptionTypeEnum valueOf(String name) => _$chatCompletionToolChoiceOptionTypeEnumValueOf(name);
}

