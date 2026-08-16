//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistant_tools_code.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/assistant_tools_file_search_type_only.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_message_request_attachments_inner_tools_inner.g.dart';

/// CreateMessageRequestAttachmentsInnerToolsInner
///
/// Properties:
/// * [type] - The type of tool being defined: `code_interpreter`
@BuiltValue()
abstract class CreateMessageRequestAttachmentsInnerToolsInner implements Built<CreateMessageRequestAttachmentsInnerToolsInner, CreateMessageRequestAttachmentsInnerToolsInnerBuilder> {
  /// One Of [AssistantToolsCode], [AssistantToolsFileSearchTypeOnly]
  OneOf get oneOf;

  CreateMessageRequestAttachmentsInnerToolsInner._();

  factory CreateMessageRequestAttachmentsInnerToolsInner([void updates(CreateMessageRequestAttachmentsInnerToolsInnerBuilder b)]) = _$CreateMessageRequestAttachmentsInnerToolsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateMessageRequestAttachmentsInnerToolsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateMessageRequestAttachmentsInnerToolsInner> get serializer => _$CreateMessageRequestAttachmentsInnerToolsInnerSerializer();
}

class _$CreateMessageRequestAttachmentsInnerToolsInnerSerializer implements PrimitiveSerializer<CreateMessageRequestAttachmentsInnerToolsInner> {
  @override
  final Iterable<Type> types = const [CreateMessageRequestAttachmentsInnerToolsInner, _$CreateMessageRequestAttachmentsInnerToolsInner];

  @override
  final String wireName = r'CreateMessageRequestAttachmentsInnerToolsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateMessageRequestAttachmentsInnerToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateMessageRequestAttachmentsInnerToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateMessageRequestAttachmentsInnerToolsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateMessageRequestAttachmentsInnerToolsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(AssistantToolsCode), FullType(AssistantToolsFileSearchTypeOnly), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CreateMessageRequestAttachmentsInnerToolsInnerTypeEnum extends EnumClass {

  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const CreateMessageRequestAttachmentsInnerToolsInnerTypeEnum codeInterpreter = _$createMessageRequestAttachmentsInnerToolsInnerTypeEnum_codeInterpreter;
  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'file_search')
  static const CreateMessageRequestAttachmentsInnerToolsInnerTypeEnum fileSearch = _$createMessageRequestAttachmentsInnerToolsInnerTypeEnum_fileSearch;

  static Serializer<CreateMessageRequestAttachmentsInnerToolsInnerTypeEnum> get serializer => _$createMessageRequestAttachmentsInnerToolsInnerTypeEnumSerializer;

  const CreateMessageRequestAttachmentsInnerToolsInnerTypeEnum._(String name): super(name);

  static BuiltSet<CreateMessageRequestAttachmentsInnerToolsInnerTypeEnum> get values => _$createMessageRequestAttachmentsInnerToolsInnerTypeEnumValues;
  static CreateMessageRequestAttachmentsInnerToolsInnerTypeEnum valueOf(String name) => _$createMessageRequestAttachmentsInnerToolsInnerTypeEnumValueOf(name);
}

