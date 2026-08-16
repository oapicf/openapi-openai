//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_output_image_object_image.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_output_image_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_output_logs_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner.g.dart';

/// RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
///
/// Properties:
/// * [index] - The index of the output in the outputs array.
/// * [type] - Always `logs`.
/// * [logs] - The text output from the Code Interpreter tool call.
/// * [image] 
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner implements Built<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner, RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder> {
  /// One Of [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject], [RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject]
  OneOf get oneOf;

  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner._();

  factory RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner([void updates(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> get serializer => _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner, _$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject), FullType(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum extends EnumClass {

  /// Always `logs`.
  @BuiltValueEnumConst(wireName: r'logs')
  static const RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum logs = _$runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum_logs;
  /// Always `logs`.
  @BuiltValueEnumConst(wireName: r'image')
  static const RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum image = _$runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum_image;

  static Serializer<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumValueOf(name);
}

