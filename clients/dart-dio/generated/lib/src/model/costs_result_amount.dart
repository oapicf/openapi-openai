//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'costs_result_amount.g.dart';

/// The monetary value in its associated currency.
///
/// Properties:
/// * [value] - The numeric value of the cost.
/// * [currency] - Lowercase ISO-4217 currency e.g. \"usd\"
@BuiltValue()
abstract class CostsResultAmount implements Built<CostsResultAmount, CostsResultAmountBuilder> {
  /// The numeric value of the cost.
  @BuiltValueField(wireName: r'value')
  num? get value;

  /// Lowercase ISO-4217 currency e.g. \"usd\"
  @BuiltValueField(wireName: r'currency')
  String? get currency;

  CostsResultAmount._();

  factory CostsResultAmount([void updates(CostsResultAmountBuilder b)]) = _$CostsResultAmount;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CostsResultAmountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CostsResultAmount> get serializer => _$CostsResultAmountSerializer();
}

class _$CostsResultAmountSerializer implements PrimitiveSerializer<CostsResultAmount> {
  @override
  final Iterable<Type> types = const [CostsResultAmount, _$CostsResultAmount];

  @override
  final String wireName = r'CostsResultAmount';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CostsResultAmount object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(num),
      );
    }
    if (object.currency != null) {
      yield r'currency';
      yield serializers.serialize(
        object.currency,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CostsResultAmount object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CostsResultAmountBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.value = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.currency = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CostsResultAmount deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CostsResultAmountBuilder();
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

