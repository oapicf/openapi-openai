//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_object_tool_calls_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_object.g.dart';

/// Details of the tool call.
///
/// Properties:
/// * [type] - Always `tool_calls`.
/// * [toolCalls] - An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
@BuiltValue()
abstract class RunStepDetailsToolCallsObject implements Built<RunStepDetailsToolCallsObject, RunStepDetailsToolCallsObjectBuilder> {
  /// Always `tool_calls`.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsToolCallsObjectTypeEnum get type;
  // enum typeEnum {  tool_calls,  };

  /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  @BuiltValueField(wireName: r'tool_calls')
  BuiltList<RunStepDetailsToolCallsObjectToolCallsInner> get toolCalls;

  RunStepDetailsToolCallsObject._();

  factory RunStepDetailsToolCallsObject([void updates(RunStepDetailsToolCallsObjectBuilder b)]) = _$RunStepDetailsToolCallsObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsObject> get serializer => _$RunStepDetailsToolCallsObjectSerializer();
}

class _$RunStepDetailsToolCallsObjectSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsObject, _$RunStepDetailsToolCallsObject];

  @override
  final String wireName = r'RunStepDetailsToolCallsObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDetailsToolCallsObjectTypeEnum),
    );
    yield r'tool_calls';
    yield serializers.serialize(
      object.toolCalls,
      specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsObjectToolCallsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsObjectTypeEnum),
          ) as RunStepDetailsToolCallsObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'tool_calls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsObjectToolCallsInner)]),
          ) as BuiltList<RunStepDetailsToolCallsObjectToolCallsInner>;
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
  RunStepDetailsToolCallsObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsObjectBuilder();
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

class RunStepDetailsToolCallsObjectTypeEnum extends EnumClass {

  /// Always `tool_calls`.
  @BuiltValueEnumConst(wireName: r'tool_calls')
  static const RunStepDetailsToolCallsObjectTypeEnum toolCalls = _$runStepDetailsToolCallsObjectTypeEnum_toolCalls;

  static Serializer<RunStepDetailsToolCallsObjectTypeEnum> get serializer => _$runStepDetailsToolCallsObjectTypeEnumSerializer;

  const RunStepDetailsToolCallsObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsObjectTypeEnum> get values => _$runStepDetailsToolCallsObjectTypeEnumValues;
  static RunStepDetailsToolCallsObjectTypeEnum valueOf(String name) => _$runStepDetailsToolCallsObjectTypeEnumValueOf(name);
}

