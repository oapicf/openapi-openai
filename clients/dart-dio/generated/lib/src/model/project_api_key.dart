//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/project_api_key_owner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_api_key.g.dart';

/// Represents an individual API key in a project.
///
/// Properties:
/// * [object] - The object type, which is always `organization.project.api_key`
/// * [redactedValue] - The redacted value of the API key
/// * [name] - The name of the API key
/// * [createdAt] - The Unix timestamp (in seconds) of when the API key was created
/// * [id] - The identifier, which can be referenced in API endpoints
/// * [owner] 
@BuiltValue()
abstract class ProjectApiKey implements Built<ProjectApiKey, ProjectApiKeyBuilder> {
  /// The object type, which is always `organization.project.api_key`
  @BuiltValueField(wireName: r'object')
  ProjectApiKeyObjectEnum get object;
  // enum objectEnum {  organization.project.api_key,  };

  /// The redacted value of the API key
  @BuiltValueField(wireName: r'redacted_value')
  String get redactedValue;

  /// The name of the API key
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The Unix timestamp (in seconds) of when the API key was created
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The identifier, which can be referenced in API endpoints
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'owner')
  ProjectApiKeyOwner get owner;

  ProjectApiKey._();

  factory ProjectApiKey([void updates(ProjectApiKeyBuilder b)]) = _$ProjectApiKey;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectApiKeyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectApiKey> get serializer => _$ProjectApiKeySerializer();
}

class _$ProjectApiKeySerializer implements PrimitiveSerializer<ProjectApiKey> {
  @override
  final Iterable<Type> types = const [ProjectApiKey, _$ProjectApiKey];

  @override
  final String wireName = r'ProjectApiKey';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectApiKey object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectApiKeyObjectEnum),
    );
    yield r'redacted_value';
    yield serializers.serialize(
      object.redactedValue,
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
    yield r'owner';
    yield serializers.serialize(
      object.owner,
      specifiedType: const FullType(ProjectApiKeyOwner),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectApiKey object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectApiKeyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectApiKeyObjectEnum),
          ) as ProjectApiKeyObjectEnum;
          result.object = valueDes;
          break;
        case r'redacted_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.redactedValue = valueDes;
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
        case r'owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectApiKeyOwner),
          ) as ProjectApiKeyOwner;
          result.owner.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectApiKey deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectApiKeyBuilder();
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

class ProjectApiKeyObjectEnum extends EnumClass {

  /// The object type, which is always `organization.project.api_key`
  @BuiltValueEnumConst(wireName: r'organization.project.api_key')
  static const ProjectApiKeyObjectEnum organizationPeriodProjectPeriodApiKey = _$projectApiKeyObjectEnum_organizationPeriodProjectPeriodApiKey;

  static Serializer<ProjectApiKeyObjectEnum> get serializer => _$projectApiKeyObjectEnumSerializer;

  const ProjectApiKeyObjectEnum._(String name): super(name);

  static BuiltSet<ProjectApiKeyObjectEnum> get values => _$projectApiKeyObjectEnumValues;
  static ProjectApiKeyObjectEnum valueOf(String name) => _$projectApiKeyObjectEnumValueOf(name);
}

