//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_tool.dart';
import 'package:openapi/src/model/fine_tune_chat_request_input_messages_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tune_preference_request_input_input.g.dart';

/// FineTunePreferenceRequestInputInput
///
/// Properties:
/// * [messages] 
/// * [tools] - A list of tools the model may generate JSON inputs for.
/// * [parallelToolCalls] - Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
@BuiltValue()
abstract class FineTunePreferenceRequestInputInput implements Built<FineTunePreferenceRequestInputInput, FineTunePreferenceRequestInputInputBuilder> {
  @BuiltValueField(wireName: r'messages')
  BuiltList<FineTuneChatRequestInputMessagesInner>? get messages;

  /// A list of tools the model may generate JSON inputs for.
  @BuiltValueField(wireName: r'tools')
  BuiltList<ChatCompletionTool>? get tools;

  /// Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  @BuiltValueField(wireName: r'parallel_tool_calls')
  bool? get parallelToolCalls;

  FineTunePreferenceRequestInputInput._();

  factory FineTunePreferenceRequestInputInput([void updates(FineTunePreferenceRequestInputInputBuilder b)]) = _$FineTunePreferenceRequestInputInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTunePreferenceRequestInputInputBuilder b) => b
      ..parallelToolCalls = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTunePreferenceRequestInputInput> get serializer => _$FineTunePreferenceRequestInputInputSerializer();
}

class _$FineTunePreferenceRequestInputInputSerializer implements PrimitiveSerializer<FineTunePreferenceRequestInputInput> {
  @override
  final Iterable<Type> types = const [FineTunePreferenceRequestInputInput, _$FineTunePreferenceRequestInputInput];

  @override
  final String wireName = r'FineTunePreferenceRequestInputInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTunePreferenceRequestInputInput object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTunePreferenceRequestInputInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTunePreferenceRequestInputInputBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTunePreferenceRequestInputInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTunePreferenceRequestInputInputBuilder();
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

