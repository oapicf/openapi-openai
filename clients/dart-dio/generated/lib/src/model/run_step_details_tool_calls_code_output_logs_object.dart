//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_code_output_logs_object.g.dart';

/// Text output from the Code Interpreter tool call as part of a run step.
///
/// Properties:
/// * [type] - Always `logs`.
/// * [logs] - The text output from the Code Interpreter tool call.
@BuiltValue()
abstract class RunStepDetailsToolCallsCodeOutputLogsObject implements Built<RunStepDetailsToolCallsCodeOutputLogsObject, RunStepDetailsToolCallsCodeOutputLogsObjectBuilder> {
  /// Always `logs`.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum get type;
  // enum typeEnum {  logs,  };

  /// The text output from the Code Interpreter tool call.
  @BuiltValueField(wireName: r'logs')
  String get logs;

  RunStepDetailsToolCallsCodeOutputLogsObject._();

  factory RunStepDetailsToolCallsCodeOutputLogsObject([void updates(RunStepDetailsToolCallsCodeOutputLogsObjectBuilder b)]) = _$RunStepDetailsToolCallsCodeOutputLogsObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsCodeOutputLogsObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsCodeOutputLogsObject> get serializer => _$RunStepDetailsToolCallsCodeOutputLogsObjectSerializer();
}

class _$RunStepDetailsToolCallsCodeOutputLogsObjectSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsCodeOutputLogsObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsCodeOutputLogsObject, _$RunStepDetailsToolCallsCodeOutputLogsObject];

  @override
  final String wireName = r'RunStepDetailsToolCallsCodeOutputLogsObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsCodeOutputLogsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum),
    );
    yield r'logs';
    yield serializers.serialize(
      object.logs,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsCodeOutputLogsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsCodeOutputLogsObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum),
          ) as RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum;
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
  RunStepDetailsToolCallsCodeOutputLogsObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsCodeOutputLogsObjectBuilder();
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

class RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum extends EnumClass {

  /// Always `logs`.
  @BuiltValueEnumConst(wireName: r'logs')
  static const RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum logs = _$runStepDetailsToolCallsCodeOutputLogsObjectTypeEnum_logs;

  static Serializer<RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum> get serializer => _$runStepDetailsToolCallsCodeOutputLogsObjectTypeEnumSerializer;

  const RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum> get values => _$runStepDetailsToolCallsCodeOutputLogsObjectTypeEnumValues;
  static RunStepDetailsToolCallsCodeOutputLogsObjectTypeEnum valueOf(String name) => _$runStepDetailsToolCallsCodeOutputLogsObjectTypeEnumValueOf(name);
}

