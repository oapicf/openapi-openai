//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'static_chunking_strategy_static.g.dart';

/// StaticChunkingStrategyStatic
///
/// Properties:
/// * [maxChunkSizeTokens] - The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
/// * [chunkOverlapTokens] - The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
@BuiltValue()
abstract class StaticChunkingStrategyStatic implements Built<StaticChunkingStrategyStatic, StaticChunkingStrategyStaticBuilder> {
  /// The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
  @BuiltValueField(wireName: r'max_chunk_size_tokens')
  int get maxChunkSizeTokens;

  /// The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
  @BuiltValueField(wireName: r'chunk_overlap_tokens')
  int get chunkOverlapTokens;

  StaticChunkingStrategyStatic._();

  factory StaticChunkingStrategyStatic([void updates(StaticChunkingStrategyStaticBuilder b)]) = _$StaticChunkingStrategyStatic;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StaticChunkingStrategyStaticBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StaticChunkingStrategyStatic> get serializer => _$StaticChunkingStrategyStaticSerializer();
}

class _$StaticChunkingStrategyStaticSerializer implements PrimitiveSerializer<StaticChunkingStrategyStatic> {
  @override
  final Iterable<Type> types = const [StaticChunkingStrategyStatic, _$StaticChunkingStrategyStatic];

  @override
  final String wireName = r'StaticChunkingStrategyStatic';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StaticChunkingStrategyStatic object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'max_chunk_size_tokens';
    yield serializers.serialize(
      object.maxChunkSizeTokens,
      specifiedType: const FullType(int),
    );
    yield r'chunk_overlap_tokens';
    yield serializers.serialize(
      object.chunkOverlapTokens,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StaticChunkingStrategyStatic object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StaticChunkingStrategyStaticBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max_chunk_size_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxChunkSizeTokens = valueDes;
          break;
        case r'chunk_overlap_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.chunkOverlapTokens = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StaticChunkingStrategyStatic deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StaticChunkingStrategyStaticBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

