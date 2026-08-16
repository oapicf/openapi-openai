//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/other_chunking_strategy_response_param.dart';
import 'package:openapi/src/model/static_chunking_strategy_response_param.dart';
import 'package:openapi/src/model/static_chunking_strategy.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'vector_store_file_object_chunking_strategy.g.dart';

/// The strategy used to chunk the file.
///
/// Properties:
/// * [type] - Always `static`.
/// * [static_] 
@BuiltValue()
abstract class VectorStoreFileObjectChunkingStrategy implements Built<VectorStoreFileObjectChunkingStrategy, VectorStoreFileObjectChunkingStrategyBuilder> {
  /// One Of [OtherChunkingStrategyResponseParam], [StaticChunkingStrategyResponseParam]
  OneOf get oneOf;

  VectorStoreFileObjectChunkingStrategy._();

  factory VectorStoreFileObjectChunkingStrategy([void updates(VectorStoreFileObjectChunkingStrategyBuilder b)]) = _$VectorStoreFileObjectChunkingStrategy;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VectorStoreFileObjectChunkingStrategyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VectorStoreFileObjectChunkingStrategy> get serializer => _$VectorStoreFileObjectChunkingStrategySerializer();
}

class _$VectorStoreFileObjectChunkingStrategySerializer implements PrimitiveSerializer<VectorStoreFileObjectChunkingStrategy> {
  @override
  final Iterable<Type> types = const [VectorStoreFileObjectChunkingStrategy, _$VectorStoreFileObjectChunkingStrategy];

  @override
  final String wireName = r'VectorStoreFileObjectChunkingStrategy';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VectorStoreFileObjectChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    VectorStoreFileObjectChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  VectorStoreFileObjectChunkingStrategy deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VectorStoreFileObjectChunkingStrategyBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(StaticChunkingStrategyResponseParam), FullType(OtherChunkingStrategyResponseParam), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class VectorStoreFileObjectChunkingStrategyTypeEnum extends EnumClass {

  /// Always `static`.
  @BuiltValueEnumConst(wireName: r'static')
  static const VectorStoreFileObjectChunkingStrategyTypeEnum static_ = _$vectorStoreFileObjectChunkingStrategyTypeEnum_static_;
  /// Always `static`.
  @BuiltValueEnumConst(wireName: r'other')
  static const VectorStoreFileObjectChunkingStrategyTypeEnum other = _$vectorStoreFileObjectChunkingStrategyTypeEnum_other;

  static Serializer<VectorStoreFileObjectChunkingStrategyTypeEnum> get serializer => _$vectorStoreFileObjectChunkingStrategyTypeEnumSerializer;

  const VectorStoreFileObjectChunkingStrategyTypeEnum._(String name): super(name);

  static BuiltSet<VectorStoreFileObjectChunkingStrategyTypeEnum> get values => _$vectorStoreFileObjectChunkingStrategyTypeEnumValues;
  static VectorStoreFileObjectChunkingStrategyTypeEnum valueOf(String name) => _$vectorStoreFileObjectChunkingStrategyTypeEnumValueOf(name);
}

