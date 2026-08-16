//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_object_tool_calls_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_object.g.dart';

/// Details of the tool call.
///
/// Properties:
/// * [type] - Always `tool_calls`.
/// * [toolCalls] - An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsObject implements Built<RunStepDeltaStepDetailsToolCallsObject, RunStepDeltaStepDetailsToolCallsObjectBuilder> {
  /// Always `tool_calls`.
  @BuiltValueField(wireName: r'type')
  RunStepDeltaStepDetailsToolCallsObjectTypeEnum get type;
  // enum typeEnum {  tool_calls,  };

  /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  @BuiltValueField(wireName: r'tool_calls')
  BuiltList<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>? get toolCalls;

  RunStepDeltaStepDetailsToolCallsObject._();

  factory RunStepDeltaStepDetailsToolCallsObject([void updates(RunStepDeltaStepDetailsToolCallsObjectBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsObject> get serializer => _$RunStepDeltaStepDetailsToolCallsObjectSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsObjectSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsObject, _$RunStepDeltaStepDetailsToolCallsObject];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsObjectTypeEnum),
    );
    if (object.toolCalls != null) {
      yield r'tool_calls';
      yield serializers.serialize(
        object.toolCalls,
        specifiedType: const FullType(BuiltList, [FullType(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsObjectTypeEnum),
          ) as RunStepDeltaStepDetailsToolCallsObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'tool_calls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner)]),
          ) as BuiltList<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>;
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
  RunStepDeltaStepDetailsToolCallsObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsObjectBuilder();
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

class RunStepDeltaStepDetailsToolCallsObjectTypeEnum extends EnumClass {

  /// Always `tool_calls`.
  @BuiltValueEnumConst(wireName: r'tool_calls')
  static const RunStepDeltaStepDetailsToolCallsObjectTypeEnum toolCalls = _$runStepDeltaStepDetailsToolCallsObjectTypeEnum_toolCalls;

  static Serializer<RunStepDeltaStepDetailsToolCallsObjectTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsObjectTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsObjectTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsObjectTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsObjectTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsObjectTypeEnumValueOf(name);
}

