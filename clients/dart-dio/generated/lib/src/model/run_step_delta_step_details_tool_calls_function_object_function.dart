//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_function_object_function.g.dart';

/// The definition of the function that was called.
///
/// Properties:
/// * [name] - The name of the function.
/// * [arguments] - The arguments passed to the function.
/// * [output] - The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction implements Built<RunStepDeltaStepDetailsToolCallsFunctionObjectFunction, RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionBuilder> {
  /// The name of the function.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The arguments passed to the function.
  @BuiltValueField(wireName: r'arguments')
  String? get arguments;

  /// The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  @BuiltValueField(wireName: r'output')
  String? get output;

  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction._();

  factory RunStepDeltaStepDetailsToolCallsFunctionObjectFunction([void updates(RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsFunctionObjectFunction> get serializer => _$RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsFunctionObjectFunction> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsFunctionObjectFunction, _$RunStepDeltaStepDetailsToolCallsFunctionObjectFunction];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsFunctionObjectFunction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsFunctionObjectFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.arguments != null) {
      yield r'arguments';
      yield serializers.serialize(
        object.arguments,
        specifiedType: const FullType(String),
      );
    }
    if (object.output != null) {
      yield r'output';
      yield serializers.serialize(
        object.output,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsFunctionObjectFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'arguments':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.arguments = valueDes;
          break;
        case r'output':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.output = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionBuilder();
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

