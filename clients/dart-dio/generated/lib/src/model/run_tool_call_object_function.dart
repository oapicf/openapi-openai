//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_tool_call_object_function.g.dart';

/// The function definition.
///
/// Properties:
/// * [name] - The name of the function.
/// * [arguments] - The arguments that the model expects you to pass to the function.
@BuiltValue()
abstract class RunToolCallObjectFunction implements Built<RunToolCallObjectFunction, RunToolCallObjectFunctionBuilder> {
  /// The name of the function.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The arguments that the model expects you to pass to the function.
  @BuiltValueField(wireName: r'arguments')
  String get arguments;

  RunToolCallObjectFunction._();

  factory RunToolCallObjectFunction([void updates(RunToolCallObjectFunctionBuilder b)]) = _$RunToolCallObjectFunction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunToolCallObjectFunctionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunToolCallObjectFunction> get serializer => _$RunToolCallObjectFunctionSerializer();
}

class _$RunToolCallObjectFunctionSerializer implements PrimitiveSerializer<RunToolCallObjectFunction> {
  @override
  final Iterable<Type> types = const [RunToolCallObjectFunction, _$RunToolCallObjectFunction];

  @override
  final String wireName = r'RunToolCallObjectFunction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunToolCallObjectFunction object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    RunToolCallObjectFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunToolCallObjectFunctionBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunToolCallObjectFunction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunToolCallObjectFunctionBuilder();
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

