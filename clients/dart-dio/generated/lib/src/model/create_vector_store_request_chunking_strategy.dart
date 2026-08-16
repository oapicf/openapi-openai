//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/static_chunking_strategy_request_param.dart';
import 'package:openapi/src/model/auto_chunking_strategy_request_param.dart';
import 'package:openapi/src/model/static_chunking_strategy.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_vector_store_request_chunking_strategy.g.dart';

/// The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
///
/// Properties:
/// * [type] - Always `auto`.
/// * [static_] 
@BuiltValue()
abstract class CreateVectorStoreRequestChunkingStrategy implements Built<CreateVectorStoreRequestChunkingStrategy, CreateVectorStoreRequestChunkingStrategyBuilder> {
  /// One Of [AutoChunkingStrategyRequestParam], [StaticChunkingStrategyRequestParam]
  OneOf get oneOf;

  CreateVectorStoreRequestChunkingStrategy._();

  factory CreateVectorStoreRequestChunkingStrategy([void updates(CreateVectorStoreRequestChunkingStrategyBuilder b)]) = _$CreateVectorStoreRequestChunkingStrategy;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateVectorStoreRequestChunkingStrategyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateVectorStoreRequestChunkingStrategy> get serializer => _$CreateVectorStoreRequestChunkingStrategySerializer();
}

class _$CreateVectorStoreRequestChunkingStrategySerializer implements PrimitiveSerializer<CreateVectorStoreRequestChunkingStrategy> {
  @override
  final Iterable<Type> types = const [CreateVectorStoreRequestChunkingStrategy, _$CreateVectorStoreRequestChunkingStrategy];

  @override
  final String wireName = r'CreateVectorStoreRequestChunkingStrategy';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateVectorStoreRequestChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateVectorStoreRequestChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateVectorStoreRequestChunkingStrategy deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateVectorStoreRequestChunkingStrategyBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(AutoChunkingStrategyRequestParam), FullType(StaticChunkingStrategyRequestParam), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CreateVectorStoreRequestChunkingStrategyTypeEnum extends EnumClass {

  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const CreateVectorStoreRequestChunkingStrategyTypeEnum auto = _$createVectorStoreRequestChunkingStrategyTypeEnum_auto;
  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'static')
  static const CreateVectorStoreRequestChunkingStrategyTypeEnum static_ = _$createVectorStoreRequestChunkingStrategyTypeEnum_static_;

  static Serializer<CreateVectorStoreRequestChunkingStrategyTypeEnum> get serializer => _$createVectorStoreRequestChunkingStrategyTypeEnumSerializer;

  const CreateVectorStoreRequestChunkingStrategyTypeEnum._(String name): super(name);

  static BuiltSet<CreateVectorStoreRequestChunkingStrategyTypeEnum> get values => _$createVectorStoreRequestChunkingStrategyTypeEnumValues;
  static CreateVectorStoreRequestChunkingStrategyTypeEnum valueOf(String name) => _$createVectorStoreRequestChunkingStrategyTypeEnumValueOf(name);
}

