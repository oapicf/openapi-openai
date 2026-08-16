//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/costs_result_amount.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'costs_result.g.dart';

/// The aggregated costs details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [amount] 
/// * [lineItem] - When `group_by=line_item`, this field provides the line item of the grouped costs result.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped costs result.
@BuiltValue()
abstract class CostsResult implements Built<CostsResult, CostsResultBuilder> {
  @BuiltValueField(wireName: r'object')
  CostsResultObjectEnum get object;
  // enum objectEnum {  organization.costs.result,  };

  @BuiltValueField(wireName: r'amount')
  CostsResultAmount? get amount;

  /// When `group_by=line_item`, this field provides the line item of the grouped costs result.
  @BuiltValueField(wireName: r'line_item')
  String? get lineItem;

  /// When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  @BuiltValueField(wireName: r'project_id')
  String? get projectId;

  CostsResult._();

  factory CostsResult([void updates(CostsResultBuilder b)]) = _$CostsResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CostsResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CostsResult> get serializer => _$CostsResultSerializer();
}

class _$CostsResultSerializer implements PrimitiveSerializer<CostsResult> {
  @override
  final Iterable<Type> types = const [CostsResult, _$CostsResult];

  @override
  final String wireName = r'CostsResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CostsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(CostsResultObjectEnum),
    );
    if (object.amount != null) {
      yield r'amount';
      yield serializers.serialize(
        object.amount,
        specifiedType: const FullType(CostsResultAmount),
      );
    }
    if (object.lineItem != null) {
      yield r'line_item';
      yield serializers.serialize(
        object.lineItem,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.projectId != null) {
      yield r'project_id';
      yield serializers.serialize(
        object.projectId,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CostsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CostsResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CostsResultObjectEnum),
          ) as CostsResultObjectEnum;
          result.object = valueDes;
          break;
        case r'amount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CostsResultAmount),
          ) as CostsResultAmount;
          result.amount.replace(valueDes);
          break;
        case r'line_item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.lineItem = valueDes;
          break;
        case r'project_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.projectId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CostsResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CostsResultBuilder();
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

class CostsResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.costs.result')
  static const CostsResultObjectEnum organizationPeriodCostsPeriodResult = _$costsResultObjectEnum_organizationPeriodCostsPeriodResult;

  static Serializer<CostsResultObjectEnum> get serializer => _$costsResultObjectEnumSerializer;

  const CostsResultObjectEnum._(String name): super(name);

  static BuiltSet<CostsResultObjectEnum> get values => _$costsResultObjectEnumValues;
  static CostsResultObjectEnum valueOf(String name) => _$costsResultObjectEnumValueOf(name);
}

