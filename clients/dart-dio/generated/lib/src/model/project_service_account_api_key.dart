//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_service_account_api_key.g.dart';

/// ProjectServiceAccountApiKey
///
/// Properties:
/// * [object] - The object type, which is always `organization.project.service_account.api_key`
/// * [value] 
/// * [name] 
/// * [createdAt] 
/// * [id] 
@BuiltValue()
abstract class ProjectServiceAccountApiKey implements Built<ProjectServiceAccountApiKey, ProjectServiceAccountApiKeyBuilder> {
  /// The object type, which is always `organization.project.service_account.api_key`
  @BuiltValueField(wireName: r'object')
  ProjectServiceAccountApiKeyObjectEnum get object;
  // enum objectEnum {  organization.project.service_account.api_key,  };

  @BuiltValueField(wireName: r'value')
  String get value;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  @BuiltValueField(wireName: r'id')
  String get id;

  ProjectServiceAccountApiKey._();

  factory ProjectServiceAccountApiKey([void updates(ProjectServiceAccountApiKeyBuilder b)]) = _$ProjectServiceAccountApiKey;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectServiceAccountApiKeyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectServiceAccountApiKey> get serializer => _$ProjectServiceAccountApiKeySerializer();
}

class _$ProjectServiceAccountApiKeySerializer implements PrimitiveSerializer<ProjectServiceAccountApiKey> {
  @override
  final Iterable<Type> types = const [ProjectServiceAccountApiKey, _$ProjectServiceAccountApiKey];

  @override
  final String wireName = r'ProjectServiceAccountApiKey';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectServiceAccountApiKey object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectServiceAccountApiKeyObjectEnum),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectServiceAccountApiKey object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectServiceAccountApiKeyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccountApiKeyObjectEnum),
          ) as ProjectServiceAccountApiKeyObjectEnum;
          result.object = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectServiceAccountApiKey deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectServiceAccountApiKeyBuilder();
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

class ProjectServiceAccountApiKeyObjectEnum extends EnumClass {

  /// The object type, which is always `organization.project.service_account.api_key`
  @BuiltValueEnumConst(wireName: r'organization.project.service_account.api_key')
  static const ProjectServiceAccountApiKeyObjectEnum organizationPeriodProjectPeriodServiceAccountPeriodApiKey = _$projectServiceAccountApiKeyObjectEnum_organizationPeriodProjectPeriodServiceAccountPeriodApiKey;

  static Serializer<ProjectServiceAccountApiKeyObjectEnum> get serializer => _$projectServiceAccountApiKeyObjectEnumSerializer;

  const ProjectServiceAccountApiKeyObjectEnum._(String name): super(name);

  static BuiltSet<ProjectServiceAccountApiKeyObjectEnum> get values => _$projectServiceAccountApiKeyObjectEnumValues;
  static ProjectServiceAccountApiKeyObjectEnum valueOf(String name) => _$projectServiceAccountApiKeyObjectEnumValueOf(name);
}

