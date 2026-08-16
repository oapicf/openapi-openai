//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'auto_chunking_strategy_request_param.g.dart';

/// The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
///
/// Properties:
/// * [type] - Always `auto`.
@BuiltValue()
abstract class AutoChunkingStrategyRequestParam implements Built<AutoChunkingStrategyRequestParam, AutoChunkingStrategyRequestParamBuilder> {
  /// Always `auto`.
  @BuiltValueField(wireName: r'type')
  AutoChunkingStrategyRequestParamTypeEnum get type;
  // enum typeEnum {  auto,  };

  AutoChunkingStrategyRequestParam._();

  factory AutoChunkingStrategyRequestParam([void updates(AutoChunkingStrategyRequestParamBuilder b)]) = _$AutoChunkingStrategyRequestParam;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AutoChunkingStrategyRequestParamBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AutoChunkingStrategyRequestParam> get serializer => _$AutoChunkingStrategyRequestParamSerializer();
}

class _$AutoChunkingStrategyRequestParamSerializer implements PrimitiveSerializer<AutoChunkingStrategyRequestParam> {
  @override
  final Iterable<Type> types = const [AutoChunkingStrategyRequestParam, _$AutoChunkingStrategyRequestParam];

  @override
  final String wireName = r'AutoChunkingStrategyRequestParam';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AutoChunkingStrategyRequestParam object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AutoChunkingStrategyRequestParamTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AutoChunkingStrategyRequestParam object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AutoChunkingStrategyRequestParamBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AutoChunkingStrategyRequestParamTypeEnum),
          ) as AutoChunkingStrategyRequestParamTypeEnum;
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
  AutoChunkingStrategyRequestParam deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AutoChunkingStrategyRequestParamBuilder();
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

class AutoChunkingStrategyRequestParamTypeEnum extends EnumClass {

  /// Always `auto`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const AutoChunkingStrategyRequestParamTypeEnum auto = _$autoChunkingStrategyRequestParamTypeEnum_auto;

  static Serializer<AutoChunkingStrategyRequestParamTypeEnum> get serializer => _$autoChunkingStrategyRequestParamTypeEnumSerializer;

  const AutoChunkingStrategyRequestParamTypeEnum._(String name): super(name);

  static BuiltSet<AutoChunkingStrategyRequestParamTypeEnum> get values => _$autoChunkingStrategyRequestParamTypeEnumValues;
  static AutoChunkingStrategyRequestParamTypeEnum valueOf(String name) => _$autoChunkingStrategyRequestParamTypeEnumValueOf(name);
}

