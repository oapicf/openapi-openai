//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_code_output_logs_object.g.dart';

/// Text output from the Code Interpreter tool call as part of a run step.
///
/// Properties:
/// * [index] - The index of the output in the outputs array.
/// * [type] - Always `logs`.
/// * [logs] - The text output from the Code Interpreter tool call.
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject implements Built<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectBuilder> {
  /// The index of the output in the outputs array.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `logs`.
  @BuiltValueField(wireName: r'type')
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum get type;
  // enum typeEnum {  logs,  };

  /// The text output from the Code Interpreter tool call.
  @BuiltValueField(wireName: r'logs')
  String? get logs;

  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject._();

  factory RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject([void updates(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject> get serializer => _$RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject, _$RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum),
    );
    if (object.logs != null) {
      yield r'logs';
      yield serializers.serialize(
        object.logs,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectBuilder result,
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
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum),
          ) as RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'logs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.logs = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectBuilder();
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

class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum extends EnumClass {

  /// Always `logs`.
  @BuiltValueEnumConst(wireName: r'logs')
  static const RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum logs = _$runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum_logs;

  static Serializer<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectTypeEnumValueOf(name);
}

