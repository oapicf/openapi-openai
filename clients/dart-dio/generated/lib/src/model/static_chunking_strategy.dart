//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/static_chunking_strategy_static.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'static_chunking_strategy.g.dart';

/// StaticChunkingStrategy
///
/// Properties:
/// * [type] - Always `static`.
/// * [static_] 
@BuiltValue()
abstract class StaticChunkingStrategy implements Built<StaticChunkingStrategy, StaticChunkingStrategyBuilder> {
  /// Always `static`.
  @BuiltValueField(wireName: r'type')
  StaticChunkingStrategyTypeEnum get type;
  // enum typeEnum {  static,  };

  @BuiltValueField(wireName: r'static')
  StaticChunkingStrategyStatic get static_;

  StaticChunkingStrategy._();

  factory StaticChunkingStrategy([void updates(StaticChunkingStrategyBuilder b)]) = _$StaticChunkingStrategy;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StaticChunkingStrategyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StaticChunkingStrategy> get serializer => _$StaticChunkingStrategySerializer();
}

class _$StaticChunkingStrategySerializer implements PrimitiveSerializer<StaticChunkingStrategy> {
  @override
  final Iterable<Type> types = const [StaticChunkingStrategy, _$StaticChunkingStrategy];

  @override
  final String wireName = r'StaticChunkingStrategy';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StaticChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(StaticChunkingStrategyTypeEnum),
    );
    yield r'static';
    yield serializers.serialize(
      object.static_,
      specifiedType: const FullType(StaticChunkingStrategyStatic),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StaticChunkingStrategy object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StaticChunkingStrategyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StaticChunkingStrategyTypeEnum),
          ) as StaticChunkingStrategyTypeEnum;
          result.type = valueDes;
          break;
        case r'static':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StaticChunkingStrategyStatic),
          ) as StaticChunkingStrategyStatic;
          result.static_.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StaticChunkingStrategy deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StaticChunkingStrategyBuilder();
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

class StaticChunkingStrategyTypeEnum extends EnumClass {

  /// Always `static`.
  @BuiltValueEnumConst(wireName: r'static')
  static const StaticChunkingStrategyTypeEnum static_ = _$staticChunkingStrategyTypeEnum_static_;

  static Serializer<StaticChunkingStrategyTypeEnum> get serializer => _$staticChunkingStrategyTypeEnumSerializer;

  const StaticChunkingStrategyTypeEnum._(String name): super(name);

  static BuiltSet<StaticChunkingStrategyTypeEnum> get values => _$staticChunkingStrategyTypeEnumValues;
  static StaticChunkingStrategyTypeEnum valueOf(String name) => _$staticChunkingStrategyTypeEnumValueOf(name);
}

