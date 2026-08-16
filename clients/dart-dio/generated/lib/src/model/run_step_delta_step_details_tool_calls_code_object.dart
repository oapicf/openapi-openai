//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_object_code_interpreter.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_code_object.g.dart';

/// Details of the Code Interpreter tool call the run step was involved in.
///
/// Properties:
/// * [index] - The index of the tool call in the tool calls array.
/// * [id] - The ID of the tool call.
/// * [type] - The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
/// * [codeInterpreter] 
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsCodeObject implements Built<RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsCodeObjectBuilder> {
  /// The index of the tool call in the tool calls array.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// The ID of the tool call.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueField(wireName: r'type')
  RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum get type;
  // enum typeEnum {  code_interpreter,  };

  @BuiltValueField(wireName: r'code_interpreter')
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? get codeInterpreter;

  RunStepDeltaStepDetailsToolCallsCodeObject._();

  factory RunStepDeltaStepDetailsToolCallsCodeObject([void updates(RunStepDeltaStepDetailsToolCallsCodeObjectBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsCodeObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsCodeObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsCodeObject> get serializer => _$RunStepDeltaStepDetailsToolCallsCodeObjectSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsCodeObjectSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsCodeObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsCodeObject, _$RunStepDeltaStepDetailsToolCallsCodeObject];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsCodeObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum),
    );
    if (object.codeInterpreter != null) {
      yield r'code_interpreter';
      yield serializers.serialize(
        object.codeInterpreter,
        specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsCodeObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum),
          ) as RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'code_interpreter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter),
          ) as RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
          result.codeInterpreter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsCodeObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsCodeObjectBuilder();
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

class RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum codeInterpreter = _$runStepDeltaStepDetailsToolCallsCodeObjectTypeEnum_codeInterpreter;

  static Serializer<RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsCodeObjectTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsCodeObjectTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsCodeObjectTypeEnumValueOf(name);
}

