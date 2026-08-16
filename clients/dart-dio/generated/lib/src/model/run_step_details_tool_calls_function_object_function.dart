//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_function_object_function.g.dart';

/// The definition of the function that was called.
///
/// Properties:
/// * [name] - The name of the function.
/// * [arguments] - The arguments passed to the function.
/// * [output] - The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
@BuiltValue()
abstract class RunStepDetailsToolCallsFunctionObjectFunction implements Built<RunStepDetailsToolCallsFunctionObjectFunction, RunStepDetailsToolCallsFunctionObjectFunctionBuilder> {
  /// The name of the function.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The arguments passed to the function.
  @BuiltValueField(wireName: r'arguments')
  String get arguments;

  /// The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  @BuiltValueField(wireName: r'output')
  String? get output;

  RunStepDetailsToolCallsFunctionObjectFunction._();

  factory RunStepDetailsToolCallsFunctionObjectFunction([void updates(RunStepDetailsToolCallsFunctionObjectFunctionBuilder b)]) = _$RunStepDetailsToolCallsFunctionObjectFunction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsFunctionObjectFunctionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsFunctionObjectFunction> get serializer => _$RunStepDetailsToolCallsFunctionObjectFunctionSerializer();
}

class _$RunStepDetailsToolCallsFunctionObjectFunctionSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsFunctionObjectFunction> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsFunctionObjectFunction, _$RunStepDetailsToolCallsFunctionObjectFunction];

  @override
  final String wireName = r'RunStepDetailsToolCallsFunctionObjectFunction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsFunctionObjectFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'arguments';
    yield serializers.serialize(
      object.arguments,
      specifiedType: const FullType(String),
    );
    yield r'output';
    yield object.output == null ? null : serializers.serialize(
      object.output,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsFunctionObjectFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsFunctionObjectFunctionBuilder result,
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
  RunStepDetailsToolCallsFunctionObjectFunction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsFunctionObjectFunctionBuilder();
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

