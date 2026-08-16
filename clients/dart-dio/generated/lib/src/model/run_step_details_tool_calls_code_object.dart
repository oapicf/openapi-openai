//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_object_code_interpreter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_code_object.g.dart';

/// Details of the Code Interpreter tool call the run step was involved in.
///
/// Properties:
/// * [id] - The ID of the tool call.
/// * [type] - The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
/// * [codeInterpreter] 
@BuiltValue()
abstract class RunStepDetailsToolCallsCodeObject implements Built<RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsCodeObjectBuilder> {
  /// The ID of the tool call.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsToolCallsCodeObjectTypeEnum get type;
  // enum typeEnum {  code_interpreter,  };

  @BuiltValueField(wireName: r'code_interpreter')
  RunStepDetailsToolCallsCodeObjectCodeInterpreter get codeInterpreter;

  RunStepDetailsToolCallsCodeObject._();

  factory RunStepDetailsToolCallsCodeObject([void updates(RunStepDetailsToolCallsCodeObjectBuilder b)]) = _$RunStepDetailsToolCallsCodeObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsCodeObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsCodeObject> get serializer => _$RunStepDetailsToolCallsCodeObjectSerializer();
}

class _$RunStepDetailsToolCallsCodeObjectSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsCodeObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsCodeObject, _$RunStepDetailsToolCallsCodeObject];

  @override
  final String wireName = r'RunStepDetailsToolCallsCodeObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsCodeObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDetailsToolCallsCodeObjectTypeEnum),
    );
    yield r'code_interpreter';
    yield serializers.serialize(
      object.codeInterpreter,
      specifiedType: const FullType(RunStepDetailsToolCallsCodeObjectCodeInterpreter),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsCodeObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsCodeObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
            specifiedType: const FullType(RunStepDetailsToolCallsCodeObjectTypeEnum),
          ) as RunStepDetailsToolCallsCodeObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'code_interpreter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsCodeObjectCodeInterpreter),
          ) as RunStepDetailsToolCallsCodeObjectCodeInterpreter;
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
  RunStepDetailsToolCallsCodeObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsCodeObjectBuilder();
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

class RunStepDetailsToolCallsCodeObjectTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const RunStepDetailsToolCallsCodeObjectTypeEnum codeInterpreter = _$runStepDetailsToolCallsCodeObjectTypeEnum_codeInterpreter;

  static Serializer<RunStepDetailsToolCallsCodeObjectTypeEnum> get serializer => _$runStepDetailsToolCallsCodeObjectTypeEnumSerializer;

  const RunStepDetailsToolCallsCodeObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsCodeObjectTypeEnum> get values => _$runStepDetailsToolCallsCodeObjectTypeEnumValues;
  static RunStepDetailsToolCallsCodeObjectTypeEnum valueOf(String name) => _$runStepDetailsToolCallsCodeObjectTypeEnumValueOf(name);
}

