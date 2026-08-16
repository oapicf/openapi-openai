//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/static_chunking_strategy.dart';
import 'package:openapi/src/model/static_chunking_strategy_static.dart';
import 'package:openapi/src/model/auto_chunking_strategy.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy.g.dart';

/// The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
///
/// Properties:
/// * [type] - Always `auto`.
/// * [static_] 
@BuiltValue()
abstract class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy implements Built<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy, CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyBuilder> {
  /// One Of [AutoChunkingStrategy], [StaticChunkingStrategy]
  OneOf get oneOf;

  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy._();

  factory CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy([void updates(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyBuilder b)]) = _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy> get serializer => _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategySerializer();
}

class _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategySerializer implements PrimitiveSerializer<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy> {
  @override
  final Iterable<Type> types = const [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy, _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy];

  @override
  final String wireName = r'CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(AutoChunkingStrategy), FullType(StaticChunkingStrategy), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum extends EnumClass {

  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum auto = _$createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum_auto;
  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'static')
  static const CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum static_ = _$createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum_static_;

  static Serializer<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum> get serializer => _$createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumSerializer;

  const CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum._(String name): super(name);

  static BuiltSet<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum> get values => _$createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumValues;
  static CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum valueOf(String name) => _$createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumValueOf(name);
}

