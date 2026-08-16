//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'other_chunking_strategy_response_param.g.dart';

/// This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
///
/// Properties:
/// * [type] - Always `other`.
@BuiltValue()
abstract class OtherChunkingStrategyResponseParam implements Built<OtherChunkingStrategyResponseParam, OtherChunkingStrategyResponseParamBuilder> {
  /// Always `other`.
  @BuiltValueField(wireName: r'type')
  OtherChunkingStrategyResponseParamTypeEnum get type;
  // enum typeEnum {  other,  };

  OtherChunkingStrategyResponseParam._();

  factory OtherChunkingStrategyResponseParam([void updates(OtherChunkingStrategyResponseParamBuilder b)]) = _$OtherChunkingStrategyResponseParam;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OtherChunkingStrategyResponseParamBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OtherChunkingStrategyResponseParam> get serializer => _$OtherChunkingStrategyResponseParamSerializer();
}

class _$OtherChunkingStrategyResponseParamSerializer implements PrimitiveSerializer<OtherChunkingStrategyResponseParam> {
  @override
  final Iterable<Type> types = const [OtherChunkingStrategyResponseParam, _$OtherChunkingStrategyResponseParam];

  @override
  final String wireName = r'OtherChunkingStrategyResponseParam';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OtherChunkingStrategyResponseParam object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(OtherChunkingStrategyResponseParamTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OtherChunkingStrategyResponseParam object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OtherChunkingStrategyResponseParamBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OtherChunkingStrategyResponseParamTypeEnum),
          ) as OtherChunkingStrategyResponseParamTypeEnum;
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
  OtherChunkingStrategyResponseParam deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OtherChunkingStrategyResponseParamBuilder();
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

class OtherChunkingStrategyResponseParamTypeEnum extends EnumClass {

  /// Always `other`.
  @BuiltValueEnumConst(wireName: r'other')
  static const OtherChunkingStrategyResponseParamTypeEnum other = _$otherChunkingStrategyResponseParamTypeEnum_other;

  static Serializer<OtherChunkingStrategyResponseParamTypeEnum> get serializer => _$otherChunkingStrategyResponseParamTypeEnumSerializer;

  const OtherChunkingStrategyResponseParamTypeEnum._(String name): super(name);

  static BuiltSet<OtherChunkingStrategyResponseParamTypeEnum> get values => _$otherChunkingStrategyResponseParamTypeEnumValues;
  static OtherChunkingStrategyResponseParamTypeEnum valueOf(String name) => _$otherChunkingStrategyResponseParamTypeEnumValueOf(name);
}

