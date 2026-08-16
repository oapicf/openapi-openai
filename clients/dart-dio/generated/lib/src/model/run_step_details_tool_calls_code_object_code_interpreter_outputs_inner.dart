//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_details_tool_calls_code_output_image_object_image.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_output_image_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_output_logs_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_step_details_tool_calls_code_object_code_interpreter_outputs_inner.g.dart';

/// RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
///
/// Properties:
/// * [type] - Always `logs`.
/// * [logs] - The text output from the Code Interpreter tool call.
/// * [image] 
@BuiltValue()
abstract class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner implements Built<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder> {
  /// One Of [RunStepDetailsToolCallsCodeOutputImageObject], [RunStepDetailsToolCallsCodeOutputLogsObject]
  OneOf get oneOf;

  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner._();

  factory RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner([void updates(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder b)]) = _$RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> get serializer => _$RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerSerializer();
}

class _$RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner, _$RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner];

  @override
  final String wireName = r'RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStepDetailsToolCallsCodeOutputLogsObject), FullType(RunStepDetailsToolCallsCodeOutputImageObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum extends EnumClass {

  /// Always `logs`.
  @BuiltValueEnumConst(wireName: r'logs')
  static const RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum logs = _$runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum_logs;
  /// Always `logs`.
  @BuiltValueEnumConst(wireName: r'image')
  static const RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum image = _$runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum_image;

  static Serializer<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum> get serializer => _$runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumSerializer;

  const RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum> get values => _$runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumValues;
  static RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnum valueOf(String name) => _$runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTypeEnumValueOf(name);
}

