//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/static_chunking_strategy.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'static_chunking_strategy_response_param.g.dart';

/// StaticChunkingStrategyResponseParam
///
/// Properties:
/// * [type] - Always `static`.
/// * [static_] 
@BuiltValue()
abstract class StaticChunkingStrategyResponseParam implements Built<StaticChunkingStrategyResponseParam, StaticChunkingStrategyResponseParamBuilder> {
  /// Always `static`.
  @BuiltValueField(wireName: r'type')
  StaticChunkingStrategyResponseParamTypeEnum get type;
  // enum typeEnum {  static,  };

  @BuiltValueField(wireName: r'static')
  StaticChunkingStrategy get static_;

  StaticChunkingStrategyResponseParam._();

  factory StaticChunkingStrategyResponseParam([void updates(StaticChunkingStrategyResponseParamBuilder b)]) = _$StaticChunkingStrategyResponseParam;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StaticChunkingStrategyResponseParamBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StaticChunkingStrategyResponseParam> get serializer => _$StaticChunkingStrategyResponseParamSerializer();
}

class _$StaticChunkingStrategyResponseParamSerializer implements PrimitiveSerializer<StaticChunkingStrategyResponseParam> {
  @override
  final Iterable<Type> types = const [StaticChunkingStrategyResponseParam, _$StaticChunkingStrategyResponseParam];

  @override
  final String wireName = r'StaticChunkingStrategyResponseParam';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StaticChunkingStrategyResponseParam object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(StaticChunkingStrategyResponseParamTypeEnum),
    );
    yield r'static';
    yield serializers.serialize(
      object.static_,
      specifiedType: const FullType(StaticChunkingStrategy),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StaticChunkingStrategyResponseParam object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StaticChunkingStrategyResponseParamBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StaticChunkingStrategyResponseParamTypeEnum),
          ) as StaticChunkingStrategyResponseParamTypeEnum;
          result.type = valueDes;
          break;
        case r'static':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StaticChunkingStrategy),
          ) as StaticChunkingStrategy;
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
  StaticChunkingStrategyResponseParam deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StaticChunkingStrategyResponseParamBuilder();
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

class StaticChunkingStrategyResponseParamTypeEnum extends EnumClass {

  /// Always `static`.
  @BuiltValueEnumConst(wireName: r'static')
  static const StaticChunkingStrategyResponseParamTypeEnum static_ = _$staticChunkingStrategyResponseParamTypeEnum_static_;

  static Serializer<StaticChunkingStrategyResponseParamTypeEnum> get serializer => _$staticChunkingStrategyResponseParamTypeEnumSerializer;

  const StaticChunkingStrategyResponseParamTypeEnum._(String name): super(name);

  static BuiltSet<StaticChunkingStrategyResponseParamTypeEnum> get values => _$staticChunkingStrategyResponseParamTypeEnumValues;
  static StaticChunkingStrategyResponseParamTypeEnum valueOf(String name) => _$staticChunkingStrategyResponseParamTypeEnumValueOf(name);
}

