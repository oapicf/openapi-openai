//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_object_code_interpreter_outputs_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_code_object_code_interpreter.g.dart';

/// The Code Interpreter tool call definition.
///
/// Properties:
/// * [input] - The input to the Code Interpreter tool call.
/// * [outputs] - The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
@BuiltValue()
abstract class RunStepDetailsToolCallsCodeObjectCodeInterpreter implements Built<RunStepDetailsToolCallsCodeObjectCodeInterpreter, RunStepDetailsToolCallsCodeObjectCodeInterpreterBuilder> {
  /// The input to the Code Interpreter tool call.
  @BuiltValueField(wireName: r'input')
  String get input;

  /// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  @BuiltValueField(wireName: r'outputs')
  BuiltList<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> get outputs;

  RunStepDetailsToolCallsCodeObjectCodeInterpreter._();

  factory RunStepDetailsToolCallsCodeObjectCodeInterpreter([void updates(RunStepDetailsToolCallsCodeObjectCodeInterpreterBuilder b)]) = _$RunStepDetailsToolCallsCodeObjectCodeInterpreter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsCodeObjectCodeInterpreterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsCodeObjectCodeInterpreter> get serializer => _$RunStepDetailsToolCallsCodeObjectCodeInterpreterSerializer();
}

class _$RunStepDetailsToolCallsCodeObjectCodeInterpreterSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsCodeObjectCodeInterpreter> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsCodeObjectCodeInterpreter, _$RunStepDetailsToolCallsCodeObjectCodeInterpreter];

  @override
  final String wireName = r'RunStepDetailsToolCallsCodeObjectCodeInterpreter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsCodeObjectCodeInterpreter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'input';
    yield serializers.serialize(
      object.input,
      specifiedType: const FullType(String),
    );
    yield r'outputs';
    yield serializers.serialize(
      object.outputs,
      specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsCodeObjectCodeInterpreter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsCodeObjectCodeInterpreterBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)]),
          ) as BuiltList<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>;
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
  RunStepDetailsToolCallsCodeObjectCodeInterpreter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsCodeObjectCodeInterpreterBuilder();
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

