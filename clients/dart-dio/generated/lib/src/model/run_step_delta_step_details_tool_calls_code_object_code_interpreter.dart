//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_code_object_code_interpreter.g.dart';

/// The Code Interpreter tool call definition.
///
/// Properties:
/// * [input] - The input to the Code Interpreter tool call.
/// * [outputs] - The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter implements Built<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter, RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterBuilder> {
  /// The input to the Code Interpreter tool call.
  @BuiltValueField(wireName: r'input')
  String? get input;

  /// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  @BuiltValueField(wireName: r'outputs')
  BuiltList<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>? get outputs;

  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter._();

  factory RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter([void updates(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter> get serializer => _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter, _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.input != null) {
      yield r'input';
      yield serializers.serialize(
        object.input,
        specifiedType: const FullType(String),
      );
    }
    if (object.outputs != null) {
      yield r'outputs';
      yield serializers.serialize(
        object.outputs,
        specifiedType: const FullType(BuiltList, [FullType(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'input':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.input = valueDes;
          break;
        case r'outputs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)]),
          ) as BuiltList<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>;
          result.outputs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterBuilder();
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

