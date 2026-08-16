//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/static_chunking_strategy.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'static_chunking_strategy_request_param.g.dart';

/// StaticChunkingStrategyRequestParam
///
/// Properties:
/// * [type] - Always `static`.
/// * [static_] 
@BuiltValue()
abstract class StaticChunkingStrategyRequestParam implements Built<StaticChunkingStrategyRequestParam, StaticChunkingStrategyRequestParamBuilder> {
  /// Always `static`.
  @BuiltValueField(wireName: r'type')
  StaticChunkingStrategyRequestParamTypeEnum get type;
  // enum typeEnum {  static,  };

  @BuiltValueField(wireName: r'static')
  StaticChunkingStrategy get static_;

  StaticChunkingStrategyRequestParam._();

  factory StaticChunkingStrategyRequestParam([void updates(StaticChunkingStrategyRequestParamBuilder b)]) = _$StaticChunkingStrategyRequestParam;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StaticChunkingStrategyRequestParamBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StaticChunkingStrategyRequestParam> get serializer => _$StaticChunkingStrategyRequestParamSerializer();
}

class _$StaticChunkingStrategyRequestParamSerializer implements PrimitiveSerializer<StaticChunkingStrategyRequestParam> {
  @override
  final Iterable<Type> types = const [StaticChunkingStrategyRequestParam, _$StaticChunkingStrategyRequestParam];

  @override
  final String wireName = r'StaticChunkingStrategyRequestParam';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StaticChunkingStrategyRequestParam object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(StaticChunkingStrategyRequestParamTypeEnum),
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
    StaticChunkingStrategyRequestParam object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StaticChunkingStrategyRequestParamBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StaticChunkingStrategyRequestParamTypeEnum),
          ) as StaticChunkingStrategyRequestParamTypeEnum;
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
  StaticChunkingStrategyRequestParam deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StaticChunkingStrategyRequestParamBuilder();
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

class StaticChunkingStrategyRequestParamTypeEnum extends EnumClass {

  /// Always `static`.
  @BuiltValueEnumConst(wireName: r'static')
  static const StaticChunkingStrategyRequestParamTypeEnum static_ = _$staticChunkingStrategyRequestParamTypeEnum_static_;

  static Serializer<StaticChunkingStrategyRequestParamTypeEnum> get serializer => _$staticChunkingStrategyRequestParamTypeEnumSerializer;

  const StaticChunkingStrategyRequestParamTypeEnum._(String name): super(name);

  static BuiltSet<StaticChunkingStrategyRequestParamTypeEnum> get values => _$staticChunkingStrategyRequestParamTypeEnumValues;
  static StaticChunkingStrategyRequestParamTypeEnum valueOf(String name) => _$staticChunkingStrategyRequestParamTypeEnumValueOf(name);
}

