//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_details_message_creation_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_message_creation_object_message_creation.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_object_tool_calls_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_step_object_step_details.g.dart';

/// The details of the run step.
///
/// Properties:
/// * [type] - Always `message_creation`.
/// * [messageCreation] 
/// * [toolCalls] - An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
@BuiltValue()
abstract class RunStepObjectStepDetails implements Built<RunStepObjectStepDetails, RunStepObjectStepDetailsBuilder> {
  /// One Of [RunStepDetailsMessageCreationObject], [RunStepDetailsToolCallsObject]
  OneOf get oneOf;

  RunStepObjectStepDetails._();

  factory RunStepObjectStepDetails([void updates(RunStepObjectStepDetailsBuilder b)]) = _$RunStepObjectStepDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepObjectStepDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepObjectStepDetails> get serializer => _$RunStepObjectStepDetailsSerializer();
}

class _$RunStepObjectStepDetailsSerializer implements PrimitiveSerializer<RunStepObjectStepDetails> {
  @override
  final Iterable<Type> types = const [RunStepObjectStepDetails, _$RunStepObjectStepDetails];

  @override
  final String wireName = r'RunStepObjectStepDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepObjectStepDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepObjectStepDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStepObjectStepDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepObjectStepDetailsBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStepDetailsMessageCreationObject), FullType(RunStepDetailsToolCallsObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStepObjectStepDetailsTypeEnum extends EnumClass {

  /// Always `message_creation`.
  @BuiltValueEnumConst(wireName: r'message_creation')
  static const RunStepObjectStepDetailsTypeEnum messageCreation = _$runStepObjectStepDetailsTypeEnum_messageCreation;
  /// Always `message_creation`.
  @BuiltValueEnumConst(wireName: r'tool_calls')
  static const RunStepObjectStepDetailsTypeEnum toolCalls = _$runStepObjectStepDetailsTypeEnum_toolCalls;

  static Serializer<RunStepObjectStepDetailsTypeEnum> get serializer => _$runStepObjectStepDetailsTypeEnumSerializer;

  const RunStepObjectStepDetailsTypeEnum._(String name): super(name);

  static BuiltSet<RunStepObjectStepDetailsTypeEnum> get values => _$runStepObjectStepDetailsTypeEnumValues;
  static RunStepObjectStepDetailsTypeEnum valueOf(String name) => _$runStepObjectStepDetailsTypeEnumValueOf(name);
}

