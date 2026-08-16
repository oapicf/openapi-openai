//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'auto_chunking_strategy.g.dart';

/// The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
///
/// Properties:
/// * [type] - Always `auto`.
@BuiltValue()
abstract class AutoChunkingStrategy implements Built<AutoChunkingStrategy, AutoChunkingStrategyBuilder> {
  /// Always `auto`.
  @BuiltValueField(wireName: r'type')
  AutoChunkingStrategyTypeEnum get type;
  // enum typeEnum {  auto,  };

  AutoChunkingStrategy._();

  factory AutoChunkingStrategy([void updates(AutoChunkingStrategyBuilder b)]) = _$AutoChunkingStrategy;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AutoChunkingStrategyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AutoChunkingStrategy> get serializer => _$AutoChunkingStrategySerializer();
}

class _$AutoChunkingStrategySerializer implements PrimitiveSerializer<AutoChunkingStrategy> {
  @override
  final Iterable<Type> types = const [AutoChunkingStrategy, _$AutoChunkingStrategy];

  @override
  final String wireName = r'AutoChunkingStrategy';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AutoChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AutoChunkingStrategyTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AutoChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AutoChunkingStrategyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AutoChunkingStrategyTypeEnum),
          ) as AutoChunkingStrategyTypeEnum;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AutoChunkingStrategy deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AutoChunkingStrategyBuilder();
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

class AutoChunkingStrategyTypeEnum extends EnumClass {

  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const AutoChunkingStrategyTypeEnum auto = _$autoChunkingStrategyTypeEnum_auto;

  static Serializer<AutoChunkingStrategyTypeEnum> get serializer => _$autoChunkingStrategyTypeEnumSerializer;

  const AutoChunkingStrategyTypeEnum._(String name): super(name);

  static BuiltSet<AutoChunkingStrategyTypeEnum> get values => _$autoChunkingStrategyTypeEnumValues;
  static AutoChunkingStrategyTypeEnum valueOf(String name) => _$autoChunkingStrategyTypeEnumValueOf(name);
}

