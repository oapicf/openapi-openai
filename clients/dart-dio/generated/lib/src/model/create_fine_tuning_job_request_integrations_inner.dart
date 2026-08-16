//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_integrations_inner_wandb.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_fine_tuning_job_request_integrations_inner.g.dart';

/// CreateFineTuningJobRequestIntegrationsInner
///
/// Properties:
/// * [type] 
/// * [wandb] 
@BuiltValue()
abstract class CreateFineTuningJobRequestIntegrationsInner implements Built<CreateFineTuningJobRequestIntegrationsInner, CreateFineTuningJobRequestIntegrationsInnerBuilder> {
  @BuiltValueField(wireName: r'type')
  CreateFineTuningJobRequestIntegrationsInnerTypeEnum get type;
  // enum typeEnum {  wandb,  };

  @BuiltValueField(wireName: r'wandb')
  CreateFineTuningJobRequestIntegrationsInnerWandb get wandb;

  CreateFineTuningJobRequestIntegrationsInner._();

  factory CreateFineTuningJobRequestIntegrationsInner([void updates(CreateFineTuningJobRequestIntegrationsInnerBuilder b)]) = _$CreateFineTuningJobRequestIntegrationsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateFineTuningJobRequestIntegrationsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateFineTuningJobRequestIntegrationsInner> get serializer => _$CreateFineTuningJobRequestIntegrationsInnerSerializer();
}

class _$CreateFineTuningJobRequestIntegrationsInnerSerializer implements PrimitiveSerializer<CreateFineTuningJobRequestIntegrationsInner> {
  @override
  final Iterable<Type> types = const [CreateFineTuningJobRequestIntegrationsInner, _$CreateFineTuningJobRequestIntegrationsInner];

  @override
  final String wireName = r'CreateFineTuningJobRequestIntegrationsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateFineTuningJobRequestIntegrationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(CreateFineTuningJobRequestIntegrationsInnerTypeEnum),
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
    CreateFineTuningJobRequestIntegrationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateFineTuningJobRequestIntegrationsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateFineTuningJobRequestIntegrationsInnerTypeEnum),
          ) as CreateFineTuningJobRequestIntegrationsInnerTypeEnum;
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
  CreateFineTuningJobRequestIntegrationsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateFineTuningJobRequestIntegrationsInnerBuilder();
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

class CreateFineTuningJobRequestIntegrationsInnerTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'wandb')
  static const CreateFineTuningJobRequestIntegrationsInnerTypeEnum wandb = _$createFineTuningJobRequestIntegrationsInnerTypeEnum_wandb;

  static Serializer<CreateFineTuningJobRequestIntegrationsInnerTypeEnum> get serializer => _$createFineTuningJobRequestIntegrationsInnerTypeEnumSerializer;

  const CreateFineTuningJobRequestIntegrationsInnerTypeEnum._(String name): super(name);

  static BuiltSet<CreateFineTuningJobRequestIntegrationsInnerTypeEnum> get values => _$createFineTuningJobRequestIntegrationsInnerTypeEnumValues;
  static CreateFineTuningJobRequestIntegrationsInnerTypeEnum valueOf(String name) => _$createFineTuningJobRequestIntegrationsInnerTypeEnumValueOf(name);
}

