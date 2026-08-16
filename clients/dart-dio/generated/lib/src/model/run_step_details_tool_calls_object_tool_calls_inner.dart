//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_details_tool_calls_function_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_object_file_search.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_object_code_interpreter.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_function_object_function.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_step_details_tool_calls_object_tool_calls_inner.g.dart';

/// RunStepDetailsToolCallsObjectToolCallsInner
///
/// Properties:
/// * [id] - The ID of the tool call object.
/// * [type] - The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
/// * [codeInterpreter] 
/// * [fileSearch] 
/// * [function_] 
@BuiltValue()
abstract class RunStepDetailsToolCallsObjectToolCallsInner implements Built<RunStepDetailsToolCallsObjectToolCallsInner, RunStepDetailsToolCallsObjectToolCallsInnerBuilder> {
  /// One Of [RunStepDetailsToolCallsCodeObject], [RunStepDetailsToolCallsFileSearchObject], [RunStepDetailsToolCallsFunctionObject]
  OneOf get oneOf;

  RunStepDetailsToolCallsObjectToolCallsInner._();

  factory RunStepDetailsToolCallsObjectToolCallsInner([void updates(RunStepDetailsToolCallsObjectToolCallsInnerBuilder b)]) = _$RunStepDetailsToolCallsObjectToolCallsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsObjectToolCallsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsObjectToolCallsInner> get serializer => _$RunStepDetailsToolCallsObjectToolCallsInnerSerializer();
}

class _$RunStepDetailsToolCallsObjectToolCallsInnerSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsObjectToolCallsInner> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsObjectToolCallsInner, _$RunStepDetailsToolCallsObjectToolCallsInner];

  @override
  final String wireName = r'RunStepDetailsToolCallsObjectToolCallsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsObjectToolCallsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsObjectToolCallsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStepDetailsToolCallsObjectToolCallsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsObjectToolCallsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStepDetailsToolCallsCodeObject), FullType(RunStepDetailsToolCallsFileSearchObject), FullType(RunStepDetailsToolCallsFunctionObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum codeInterpreter = _$runStepDetailsToolCallsObjectToolCallsInnerTypeEnum_codeInterpreter;
  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'file_search')
  static const RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum fileSearch = _$runStepDetailsToolCallsObjectToolCallsInnerTypeEnum_fileSearch;
  /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'function')
  static const RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum function_ = _$runStepDetailsToolCallsObjectToolCallsInnerTypeEnum_function_;

  static Serializer<RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum> get serializer => _$runStepDetailsToolCallsObjectToolCallsInnerTypeEnumSerializer;

  const RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum> get values => _$runStepDetailsToolCallsObjectToolCallsInnerTypeEnumValues;
  static RunStepDetailsToolCallsObjectToolCallsInnerTypeEnum valueOf(String name) => _$runStepDetailsToolCallsObjectToolCallsInnerTypeEnumValueOf(name);
}

