//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistant_tools_code.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/function_object.dart';
import 'package:openapi/src/model/assistant_tools_file_search.dart';
import 'package:openapi/src/model/assistant_tools_file_search_file_search.dart';
import 'package:openapi/src/model/assistant_tools_function.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'assistant_object_tools_inner.g.dart';

/// AssistantObjectToolsInner
///
/// Properties:
/// * [type] - The type of tool being defined: `code_interpreter`
/// * [fileSearch] 
/// * [function_] 
@BuiltValue()
abstract class AssistantObjectToolsInner implements Built<AssistantObjectToolsInner, AssistantObjectToolsInnerBuilder> {
  /// One Of [AssistantToolsCode], [AssistantToolsFileSearch], [AssistantToolsFunction]
  OneOf get oneOf;

  AssistantObjectToolsInner._();

  factory AssistantObjectToolsInner([void updates(AssistantObjectToolsInnerBuilder b)]) = _$AssistantObjectToolsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantObjectToolsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantObjectToolsInner> get serializer => _$AssistantObjectToolsInnerSerializer();
}

class _$AssistantObjectToolsInnerSerializer implements PrimitiveSerializer<AssistantObjectToolsInner> {
  @override
  final Iterable<Type> types = const [AssistantObjectToolsInner, _$AssistantObjectToolsInner];

  @override
  final String wireName = r'AssistantObjectToolsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantObjectToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantObjectToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  AssistantObjectToolsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantObjectToolsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(AssistantToolsCode), FullType(AssistantToolsFileSearch), FullType(AssistantToolsFunction), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class AssistantObjectToolsInnerTypeEnum extends EnumClass {

  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const AssistantObjectToolsInnerTypeEnum codeInterpreter = _$assistantObjectToolsInnerTypeEnum_codeInterpreter;
  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'file_search')
  static const AssistantObjectToolsInnerTypeEnum fileSearch = _$assistantObjectToolsInnerTypeEnum_fileSearch;
  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'function')
  static const AssistantObjectToolsInnerTypeEnum function_ = _$assistantObjectToolsInnerTypeEnum_function_;

  static Serializer<AssistantObjectToolsInnerTypeEnum> get serializer => _$assistantObjectToolsInnerTypeEnumSerializer;

  const AssistantObjectToolsInnerTypeEnum._(String name): super(name);

  static BuiltSet<AssistantObjectToolsInnerTypeEnum> get values => _$assistantObjectToolsInnerTypeEnumValues;
  static AssistantObjectToolsInnerTypeEnum valueOf(String name) => _$assistantObjectToolsInnerTypeEnumValueOf(name);
}

