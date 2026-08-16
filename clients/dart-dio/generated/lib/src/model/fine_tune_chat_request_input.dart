//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/chat_completion_functions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_tool.dart';
import 'package:openapi/src/model/fine_tune_chat_request_input_messages_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tune_chat_request_input.g.dart';

/// The per-line training example of a fine-tuning input file for chat models using the supervised method.
///
/// Properties:
/// * [messages] 
/// * [tools] - A list of tools the model may generate JSON inputs for.
/// * [parallelToolCalls] - Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
/// * [functions] - A list of functions the model may generate JSON inputs for.
@BuiltValue()
abstract class FineTuneChatRequestInput implements Built<FineTuneChatRequestInput, FineTuneChatRequestInputBuilder> {
  @BuiltValueField(wireName: r'messages')
  BuiltList<FineTuneChatRequestInputMessagesInner>? get messages;

  /// A list of tools the model may generate JSON inputs for.
  @BuiltValueField(wireName: r'tools')
  BuiltList<ChatCompletionTool>? get tools;

  /// Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  @BuiltValueField(wireName: r'parallel_tool_calls')
  bool? get parallelToolCalls;

  /// A list of functions the model may generate JSON inputs for.
  @Deprecated('functions has been deprecated')
  @BuiltValueField(wireName: r'functions')
  BuiltList<ChatCompletionFunctions>? get functions;

  FineTuneChatRequestInput._();

  factory FineTuneChatRequestInput([void updates(FineTuneChatRequestInputBuilder b)]) = _$FineTuneChatRequestInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneChatRequestInputBuilder b) => b
      ..parallelToolCalls = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneChatRequestInput> get serializer => _$FineTuneChatRequestInputSerializer();
}

class _$FineTuneChatRequestInputSerializer implements PrimitiveSerializer<FineTuneChatRequestInput> {
  @override
  final Iterable<Type> types = const [FineTuneChatRequestInput, _$FineTuneChatRequestInput];

  @override
  final String wireName = r'FineTuneChatRequestInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneChatRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.messages != null) {
      yield r'messages';
      yield serializers.serialize(
        object.messages,
        specifiedType: const FullType(BuiltList, [FullType(FineTuneChatRequestInputMessagesInner)]),
      );
    }
    if (object.tools != null) {
      yield r'tools';
      yield serializers.serialize(
        object.tools,
        specifiedType: const FullType(BuiltList, [FullType(ChatCompletionTool)]),
      );
    }
    if (object.parallelToolCalls != null) {
      yield r'parallel_tool_calls';
      yield serializers.serialize(
        object.parallelToolCalls,
        specifiedType: const FullType(bool),
      );
    }
    if (object.functions != null) {
      yield r'functions';
      yield serializers.serialize(
        object.functions,
        specifiedType: const FullType(BuiltList, [FullType(ChatCompletionFunctions)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneChatRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuneChatRequestInputBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(FineTuneChatRequestInputMessagesInner)]),
          ) as BuiltList<FineTuneChatRequestInputMessagesInner>;
          result.messages.replace(valueDes);
          break;
        case r'tools':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ChatCompletionTool)]),
          ) as BuiltList<ChatCompletionTool>;
          result.tools.replace(valueDes);
          break;
        case r'parallel_tool_calls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.parallelToolCalls = valueDes;
          break;
        case r'functions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ChatCompletionFunctions)]),
          ) as BuiltList<ChatCompletionFunctions>;
          result.functions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuneChatRequestInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneChatRequestInputBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

