//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_delta_step_details_message_creation_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_message_creation_object_message_creation.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_object_tool_calls_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_step_delta_object_delta_step_details.g.dart';

/// The details of the run step.
///
/// Properties:
/// * [type] - Always `message_creation`.
/// * [messageCreation] 
/// * [toolCalls] - An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
@BuiltValue()
abstract class RunStepDeltaObjectDeltaStepDetails implements Built<RunStepDeltaObjectDeltaStepDetails, RunStepDeltaObjectDeltaStepDetailsBuilder> {
  /// One Of [RunStepDeltaStepDetailsMessageCreationObject], [RunStepDeltaStepDetailsToolCallsObject]
  OneOf get oneOf;

  RunStepDeltaObjectDeltaStepDetails._();

  factory RunStepDeltaObjectDeltaStepDetails([void updates(RunStepDeltaObjectDeltaStepDetailsBuilder b)]) = _$RunStepDeltaObjectDeltaStepDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaObjectDeltaStepDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaObjectDeltaStepDetails> get serializer => _$RunStepDeltaObjectDeltaStepDetailsSerializer();
}

class _$RunStepDeltaObjectDeltaStepDetailsSerializer implements PrimitiveSerializer<RunStepDeltaObjectDeltaStepDetails> {
  @override
  final Iterable<Type> types = const [RunStepDeltaObjectDeltaStepDetails, _$RunStepDeltaObjectDeltaStepDetails];

  @override
  final String wireName = r'RunStepDeltaObjectDeltaStepDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaObjectDeltaStepDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaObjectDeltaStepDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStepDeltaObjectDeltaStepDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaObjectDeltaStepDetailsBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStepDeltaStepDetailsMessageCreationObject), FullType(RunStepDeltaStepDetailsToolCallsObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStepDeltaObjectDeltaStepDetailsTypeEnum extends EnumClass {

  /// Always `message_creation`.
  @BuiltValueEnumConst(wireName: r'message_creation')
  static const RunStepDeltaObjectDeltaStepDetailsTypeEnum messageCreation = _$runStepDeltaObjectDeltaStepDetailsTypeEnum_messageCreation;
  /// Always `message_creation`.
  @BuiltValueEnumConst(wireName: r'tool_calls')
  static const RunStepDeltaObjectDeltaStepDetailsTypeEnum toolCalls = _$runStepDeltaObjectDeltaStepDetailsTypeEnum_toolCalls;

  static Serializer<RunStepDeltaObjectDeltaStepDetailsTypeEnum> get serializer => _$runStepDeltaObjectDeltaStepDetailsTypeEnumSerializer;

  const RunStepDeltaObjectDeltaStepDetailsTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaObjectDeltaStepDetailsTypeEnum> get values => _$runStepDeltaObjectDeltaStepDetailsTypeEnumValues;
  static RunStepDeltaObjectDeltaStepDetailsTypeEnum valueOf(String name) => _$runStepDeltaObjectDeltaStepDetailsTypeEnumValueOf(name);
}

