//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_vector_stores_result.g.dart';

/// The aggregated vector stores usage details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [usageBytes] - The vector stores usage in bytes.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped usage result.
@BuiltValue()
abstract class UsageVectorStoresResult implements Built<UsageVectorStoresResult, UsageVectorStoresResultBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageVectorStoresResultObjectEnum get object;
  // enum objectEnum {  organization.usage.vector_stores.result,  };

  /// The vector stores usage in bytes.
  @BuiltValueField(wireName: r'usage_bytes')
  int get usageBytes;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  @BuiltValueField(wireName: r'project_id')
  String? get projectId;

  UsageVectorStoresResult._();

  factory UsageVectorStoresResult([void updates(UsageVectorStoresResultBuilder b)]) = _$UsageVectorStoresResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageVectorStoresResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageVectorStoresResult> get serializer => _$UsageVectorStoresResultSerializer();
}

class _$UsageVectorStoresResultSerializer implements PrimitiveSerializer<UsageVectorStoresResult> {
  @override
  final Iterable<Type> types = const [UsageVectorStoresResult, _$UsageVectorStoresResult];

  @override
  final String wireName = r'UsageVectorStoresResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageVectorStoresResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageVectorStoresResultObjectEnum),
    );
    yield r'usage_bytes';
    yield serializers.serialize(
      object.usageBytes,
      specifiedType: const FullType(int),
    );
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
    UsageVectorStoresResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageVectorStoresResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageVectorStoresResultObjectEnum),
          ) as UsageVectorStoresResultObjectEnum;
          result.object = valueDes;
          break;
        case r'usage_bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.usageBytes = valueDes;
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
  UsageVectorStoresResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageVectorStoresResultBuilder();
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

class UsageVectorStoresResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.usage.vector_stores.result')
  static const UsageVectorStoresResultObjectEnum organizationPeriodUsagePeriodVectorStoresPeriodResult = _$usageVectorStoresResultObjectEnum_organizationPeriodUsagePeriodVectorStoresPeriodResult;

  static Serializer<UsageVectorStoresResultObjectEnum> get serializer => _$usageVectorStoresResultObjectEnumSerializer;

  const UsageVectorStoresResultObjectEnum._(String name): super(name);

  static BuiltSet<UsageVectorStoresResultObjectEnum> get values => _$usageVectorStoresResultObjectEnumValues;
  static UsageVectorStoresResultObjectEnum valueOf(String name) => _$usageVectorStoresResultObjectEnumValueOf(name);
}

