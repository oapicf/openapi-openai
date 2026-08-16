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

part 'chunking_strategy_request_param.g.dart';

/// The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
///
/// Properties:
/// * [type] - Always `auto`.
/// * [static_] 
@BuiltValue()
abstract class ChunkingStrategyRequestParam implements Built<ChunkingStrategyRequestParam, ChunkingStrategyRequestParamBuilder> {
  /// One Of [AutoChunkingStrategyRequestParam], [StaticChunkingStrategyRequestParam]
  OneOf get oneOf;

  ChunkingStrategyRequestParam._();

  factory ChunkingStrategyRequestParam([void updates(ChunkingStrategyRequestParamBuilder b)]) = _$ChunkingStrategyRequestParam;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChunkingStrategyRequestParamBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChunkingStrategyRequestParam> get serializer => _$ChunkingStrategyRequestParamSerializer();
}

class _$ChunkingStrategyRequestParamSerializer implements PrimitiveSerializer<ChunkingStrategyRequestParam> {
  @override
  final Iterable<Type> types = const [ChunkingStrategyRequestParam, _$ChunkingStrategyRequestParam];

  @override
  final String wireName = r'ChunkingStrategyRequestParam';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChunkingStrategyRequestParam object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ChunkingStrategyRequestParam object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ChunkingStrategyRequestParam deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChunkingStrategyRequestParamBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(AutoChunkingStrategyRequestParam), FullType(StaticChunkingStrategyRequestParam), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class ChunkingStrategyRequestParamTypeEnum extends EnumClass {

  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const ChunkingStrategyRequestParamTypeEnum auto = _$chunkingStrategyRequestParamTypeEnum_auto;
  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'static')
  static const ChunkingStrategyRequestParamTypeEnum static_ = _$chunkingStrategyRequestParamTypeEnum_static_;

  static Serializer<ChunkingStrategyRequestParamTypeEnum> get serializer => _$chunkingStrategyRequestParamTypeEnumSerializer;

  const ChunkingStrategyRequestParamTypeEnum._(String name): super(name);

  static BuiltSet<ChunkingStrategyRequestParamTypeEnum> get values => _$chunkingStrategyRequestParamTypeEnumValues;
  static ChunkingStrategyRequestParamTypeEnum valueOf(String name) => _$chunkingStrategyRequestParamTypeEnumValueOf(name);
}

