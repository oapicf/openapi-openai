//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_function_object_function.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_object_code_interpreter.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_file_search_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_function_object.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_step_delta_step_details_tool_calls_object_tool_calls_inner.g.dart';

/// RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
///
/// Properties:
/// * [index] - The index of the tool call in the tool calls array.
/// * [id] - The ID of the tool call object.
/// * [type] - The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
/// * [codeInterpreter] 
/// * [fileSearch] - For now, this is always going to be an empty object.
/// * [function_] 
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner implements Built<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner, RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerBuilder> {
  /// One Of [RunStepDeltaStepDetailsToolCallsCodeObject], [RunStepDeltaStepDetailsToolCallsFileSearchObject], [RunStepDeltaStepDetailsToolCallsFunctionObject]
  OneOf get oneOf;

  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner._();

  factory RunStepDeltaStepDetailsToolCallsObjectToolCallsInner([void updates(RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> get serializer => _$RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner, _$RunStepDeltaStepDetailsToolCallsObjectToolCallsInner];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsObjectToolCallsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsObjectToolCallsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsObjectToolCallsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStepDeltaStepDetailsToolCallsCodeObject), FullType(RunStepDeltaStepDetailsToolCallsFileSearchObject), FullType(RunStepDeltaStepDetailsToolCallsFunctionObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum codeInterpreter = _$runStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum_codeInterpreter;
  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'file_search')
  static const RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum fileSearch = _$runStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum_fileSearch;
  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'function')
  static const RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum function_ = _$runStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum_function_;

  static Serializer<RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnumValueOf(name);
}

