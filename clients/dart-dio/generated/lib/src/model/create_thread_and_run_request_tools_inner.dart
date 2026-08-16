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

part 'create_thread_and_run_request_tools_inner.g.dart';

/// CreateThreadAndRunRequestToolsInner
///
/// Properties:
/// * [type] - The type of tool being defined: `code_interpreter`
/// * [fileSearch] 
/// * [function_] 
@BuiltValue()
abstract class CreateThreadAndRunRequestToolsInner implements Built<CreateThreadAndRunRequestToolsInner, CreateThreadAndRunRequestToolsInnerBuilder> {
  /// One Of [AssistantToolsCode], [AssistantToolsFileSearch], [AssistantToolsFunction]
  OneOf get oneOf;

  CreateThreadAndRunRequestToolsInner._();

  factory CreateThreadAndRunRequestToolsInner([void updates(CreateThreadAndRunRequestToolsInnerBuilder b)]) = _$CreateThreadAndRunRequestToolsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateThreadAndRunRequestToolsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateThreadAndRunRequestToolsInner> get serializer => _$CreateThreadAndRunRequestToolsInnerSerializer();
}

class _$CreateThreadAndRunRequestToolsInnerSerializer implements PrimitiveSerializer<CreateThreadAndRunRequestToolsInner> {
  @override
  final Iterable<Type> types = const [CreateThreadAndRunRequestToolsInner, _$CreateThreadAndRunRequestToolsInner];

  @override
  final String wireName = r'CreateThreadAndRunRequestToolsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateThreadAndRunRequestToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateThreadAndRunRequestToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateThreadAndRunRequestToolsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateThreadAndRunRequestToolsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(AssistantToolsCode), FullType(AssistantToolsFileSearch), FullType(AssistantToolsFunction), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CreateThreadAndRunRequestToolsInnerTypeEnum extends EnumClass {

  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const CreateThreadAndRunRequestToolsInnerTypeEnum codeInterpreter = _$createThreadAndRunRequestToolsInnerTypeEnum_codeInterpreter;
  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'file_search')
  static const CreateThreadAndRunRequestToolsInnerTypeEnum fileSearch = _$createThreadAndRunRequestToolsInnerTypeEnum_fileSearch;
  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'function')
  static const CreateThreadAndRunRequestToolsInnerTypeEnum function_ = _$createThreadAndRunRequestToolsInnerTypeEnum_function_;

  static Serializer<CreateThreadAndRunRequestToolsInnerTypeEnum> get serializer => _$createThreadAndRunRequestToolsInnerTypeEnumSerializer;

  const CreateThreadAndRunRequestToolsInnerTypeEnum._(String name): super(name);

  static BuiltSet<CreateThreadAndRunRequestToolsInnerTypeEnum> get values => _$createThreadAndRunRequestToolsInnerTypeEnumValues;
  static CreateThreadAndRunRequestToolsInnerTypeEnum valueOf(String name) => _$createThreadAndRunRequestToolsInnerTypeEnumValueOf(name);
}

