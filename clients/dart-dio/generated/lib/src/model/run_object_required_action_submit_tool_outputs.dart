//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_tool_call_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_object_required_action_submit_tool_outputs.g.dart';

/// Details on the tool outputs needed for this run to continue.
///
/// Properties:
/// * [toolCalls] - A list of the relevant tool calls.
@BuiltValue()
abstract class RunObjectRequiredActionSubmitToolOutputs implements Built<RunObjectRequiredActionSubmitToolOutputs, RunObjectRequiredActionSubmitToolOutputsBuilder> {
  /// A list of the relevant tool calls.
  @BuiltValueField(wireName: r'tool_calls')
  BuiltList<RunToolCallObject> get toolCalls;

  RunObjectRequiredActionSubmitToolOutputs._();

  factory RunObjectRequiredActionSubmitToolOutputs([void updates(RunObjectRequiredActionSubmitToolOutputsBuilder b)]) = _$RunObjectRequiredActionSubmitToolOutputs;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunObjectRequiredActionSubmitToolOutputsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunObjectRequiredActionSubmitToolOutputs> get serializer => _$RunObjectRequiredActionSubmitToolOutputsSerializer();
}

class _$RunObjectRequiredActionSubmitToolOutputsSerializer implements PrimitiveSerializer<RunObjectRequiredActionSubmitToolOutputs> {
  @override
  final Iterable<Type> types = const [RunObjectRequiredActionSubmitToolOutputs, _$RunObjectRequiredActionSubmitToolOutputs];

  @override
  final String wireName = r'RunObjectRequiredActionSubmitToolOutputs';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunObjectRequiredActionSubmitToolOutputs object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'tool_calls';
    yield serializers.serialize(
      object.toolCalls,
      specifiedType: const FullType(BuiltList, [FullType(RunToolCallObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunObjectRequiredActionSubmitToolOutputs object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunObjectRequiredActionSubmitToolOutputsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'tool_calls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RunToolCallObject)]),
          ) as BuiltList<RunToolCallObject>;
          result.toolCalls.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunObjectRequiredActionSubmitToolOutputs deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunObjectRequiredActionSubmitToolOutputsBuilder();
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

