//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/project_service_account_api_key.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_service_account_create_response.g.dart';

/// ProjectServiceAccountCreateResponse
///
/// Properties:
/// * [object] 
/// * [id] 
/// * [name] 
/// * [role] - Service accounts can only have one role of type `member`
/// * [createdAt] 
/// * [apiKey] 
@BuiltValue()
abstract class ProjectServiceAccountCreateResponse implements Built<ProjectServiceAccountCreateResponse, ProjectServiceAccountCreateResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ProjectServiceAccountCreateResponseObjectEnum get object;
  // enum objectEnum {  organization.project.service_account,  };

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  /// Service accounts can only have one role of type `member`
  @BuiltValueField(wireName: r'role')
  ProjectServiceAccountCreateResponseRoleEnum get role;
  // enum roleEnum {  member,  };

  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  @BuiltValueField(wireName: r'api_key')
  ProjectServiceAccountApiKey get apiKey;

  ProjectServiceAccountCreateResponse._();

  factory ProjectServiceAccountCreateResponse([void updates(ProjectServiceAccountCreateResponseBuilder b)]) = _$ProjectServiceAccountCreateResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectServiceAccountCreateResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectServiceAccountCreateResponse> get serializer => _$ProjectServiceAccountCreateResponseSerializer();
}

class _$ProjectServiceAccountCreateResponseSerializer implements PrimitiveSerializer<ProjectServiceAccountCreateResponse> {
  @override
  final Iterable<Type> types = const [ProjectServiceAccountCreateResponse, _$ProjectServiceAccountCreateResponse];

  @override
  final String wireName = r'ProjectServiceAccountCreateResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectServiceAccountCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectServiceAccountCreateResponseObjectEnum),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ProjectServiceAccountCreateResponseRoleEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'api_key';
    yield serializers.serialize(
      object.apiKey,
      specifiedType: const FullType(ProjectServiceAccountApiKey),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectServiceAccountCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectServiceAccountCreateResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccountCreateResponseObjectEnum),
          ) as ProjectServiceAccountCreateResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccountCreateResponseRoleEnum),
          ) as ProjectServiceAccountCreateResponseRoleEnum;
          result.role = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'api_key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccountApiKey),
          ) as ProjectServiceAccountApiKey;
          result.apiKey.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectServiceAccountCreateResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectServiceAccountCreateResponseBuilder();
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

class ProjectServiceAccountCreateResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.project.service_account')
  static const ProjectServiceAccountCreateResponseObjectEnum organizationPeriodProjectPeriodServiceAccount = _$projectServiceAccountCreateResponseObjectEnum_organizationPeriodProjectPeriodServiceAccount;

  static Serializer<ProjectServiceAccountCreateResponseObjectEnum> get serializer => _$projectServiceAccountCreateResponseObjectEnumSerializer;

  const ProjectServiceAccountCreateResponseObjectEnum._(String name): super(name);

  static BuiltSet<ProjectServiceAccountCreateResponseObjectEnum> get values => _$projectServiceAccountCreateResponseObjectEnumValues;
  static ProjectServiceAccountCreateResponseObjectEnum valueOf(String name) => _$projectServiceAccountCreateResponseObjectEnumValueOf(name);
}

class ProjectServiceAccountCreateResponseRoleEnum extends EnumClass {

  /// Service accounts can only have one role of type `member`
  @BuiltValueEnumConst(wireName: r'member')
  static const ProjectServiceAccountCreateResponseRoleEnum member = _$projectServiceAccountCreateResponseRoleEnum_member;

  static Serializer<ProjectServiceAccountCreateResponseRoleEnum> get serializer => _$projectServiceAccountCreateResponseRoleEnumSerializer;

  const ProjectServiceAccountCreateResponseRoleEnum._(String name): super(name);

  static BuiltSet<ProjectServiceAccountCreateResponseRoleEnum> get values => _$projectServiceAccountCreateResponseRoleEnumValues;
  static ProjectServiceAccountCreateResponseRoleEnum valueOf(String name) => _$projectServiceAccountCreateResponseRoleEnumValueOf(name);
}

