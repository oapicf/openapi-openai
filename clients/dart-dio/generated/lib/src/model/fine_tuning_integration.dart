//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_integrations_inner_wandb.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tuning_integration.g.dart';

/// FineTuningIntegration
///
/// Properties:
/// * [type] - The type of the integration being enabled for the fine-tuning job
/// * [wandb] 
@BuiltValue()
abstract class FineTuningIntegration implements Built<FineTuningIntegration, FineTuningIntegrationBuilder> {
  /// The type of the integration being enabled for the fine-tuning job
  @BuiltValueField(wireName: r'type')
  FineTuningIntegrationTypeEnum get type;
  // enum typeEnum {  wandb,  };

  @BuiltValueField(wireName: r'wandb')
  CreateFineTuningJobRequestIntegrationsInnerWandb get wandb;

  FineTuningIntegration._();

  factory FineTuningIntegration([void updates(FineTuningIntegrationBuilder b)]) = _$FineTuningIntegration;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningIntegrationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningIntegration> get serializer => _$FineTuningIntegrationSerializer();
}

class _$FineTuningIntegrationSerializer implements PrimitiveSerializer<FineTuningIntegration> {
  @override
  final Iterable<Type> types = const [FineTuningIntegration, _$FineTuningIntegration];

  @override
  final String wireName = r'FineTuningIntegration';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningIntegration object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(FineTuningIntegrationTypeEnum),
    );
    yield r'wandb';
    yield serializers.serialize(
      object.wandb,
      specifiedType: const FullType(CreateFineTuningJobRequestIntegrationsInnerWandb),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningIntegration object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuningIntegrationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningIntegrationTypeEnum),
          ) as FineTuningIntegrationTypeEnum;
          result.type = valueDes;
          break;
        case r'wandb':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateFineTuningJobRequestIntegrationsInnerWandb),
          ) as CreateFineTuningJobRequestIntegrationsInnerWandb;
          result.wandb.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuningIntegration deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningIntegrationBuilder();
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

class FineTuningIntegrationTypeEnum extends EnumClass {

  /// The type of the integration being enabled for the fine-tuning job
  @BuiltValueEnumConst(wireName: r'wandb')
  static const FineTuningIntegrationTypeEnum wandb = _$fineTuningIntegrationTypeEnum_wandb;

  static Serializer<FineTuningIntegrationTypeEnum> get serializer => _$fineTuningIntegrationTypeEnumSerializer;

  const FineTuningIntegrationTypeEnum._(String name): super(name);

  static BuiltSet<FineTuningIntegrationTypeEnum> get values => _$fineTuningIntegrationTypeEnumValues;
  static FineTuningIntegrationTypeEnum valueOf(String name) => _$fineTuningIntegrationTypeEnumValueOf(name);
}

