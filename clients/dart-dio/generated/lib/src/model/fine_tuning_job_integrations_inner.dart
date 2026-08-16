//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_integrations_inner_wandb.dart';
import 'package:openapi/src/model/fine_tuning_integration.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'fine_tuning_job_integrations_inner.g.dart';

/// FineTuningJobIntegrationsInner
///
/// Properties:
/// * [type] - The type of the integration being enabled for the fine-tuning job
/// * [wandb] 
@BuiltValue()
abstract class FineTuningJobIntegrationsInner implements Built<FineTuningJobIntegrationsInner, FineTuningJobIntegrationsInnerBuilder> {
  /// One Of [FineTuningIntegration]
  OneOf get oneOf;

  FineTuningJobIntegrationsInner._();

  factory FineTuningJobIntegrationsInner([void updates(FineTuningJobIntegrationsInnerBuilder b)]) = _$FineTuningJobIntegrationsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningJobIntegrationsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningJobIntegrationsInner> get serializer => _$FineTuningJobIntegrationsInnerSerializer();
}

class _$FineTuningJobIntegrationsInnerSerializer implements PrimitiveSerializer<FineTuningJobIntegrationsInner> {
  @override
  final Iterable<Type> types = const [FineTuningJobIntegrationsInner, _$FineTuningJobIntegrationsInner];

  @override
  final String wireName = r'FineTuningJobIntegrationsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningJobIntegrationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningJobIntegrationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  FineTuningJobIntegrationsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningJobIntegrationsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(FineTuningIntegration), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class FineTuningJobIntegrationsInnerTypeEnum extends EnumClass {

  /// The type of the integration being enabled for the fine-tuning job
  @BuiltValueEnumConst(wireName: r'wandb')
  static const FineTuningJobIntegrationsInnerTypeEnum wandb = _$fineTuningJobIntegrationsInnerTypeEnum_wandb;

  static Serializer<FineTuningJobIntegrationsInnerTypeEnum> get serializer => _$fineTuningJobIntegrationsInnerTypeEnumSerializer;

  const FineTuningJobIntegrationsInnerTypeEnum._(String name): super(name);

  static BuiltSet<FineTuningJobIntegrationsInnerTypeEnum> get values => _$fineTuningJobIntegrationsInnerTypeEnumValues;
  static FineTuningJobIntegrationsInnerTypeEnum valueOf(String name) => _$fineTuningJobIntegrationsInnerTypeEnumValueOf(name);
}

