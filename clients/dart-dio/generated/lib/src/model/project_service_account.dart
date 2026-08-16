//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_service_account.g.dart';

/// Represents an individual service account in a project.
///
/// Properties:
/// * [object] - The object type, which is always `organization.project.service_account`
/// * [id] - The identifier, which can be referenced in API endpoints
/// * [name] - The name of the service account
/// * [role] - `owner` or `member`
/// * [createdAt] - The Unix timestamp (in seconds) of when the service account was created
@BuiltValue()
abstract class ProjectServiceAccount implements Built<ProjectServiceAccount, ProjectServiceAccountBuilder> {
  /// The object type, which is always `organization.project.service_account`
  @BuiltValueField(wireName: r'object')
  ProjectServiceAccountObjectEnum get object;
  // enum objectEnum {  organization.project.service_account,  };

  /// The identifier, which can be referenced in API endpoints
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The name of the service account
  @BuiltValueField(wireName: r'name')
  String get name;

  /// `owner` or `member`
  @BuiltValueField(wireName: r'role')
  ProjectServiceAccountRoleEnum get role;
  // enum roleEnum {  owner,  member,  };

  /// The Unix timestamp (in seconds) of when the service account was created
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  ProjectServiceAccount._();

  factory ProjectServiceAccount([void updates(ProjectServiceAccountBuilder b)]) = _$ProjectServiceAccount;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectServiceAccountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectServiceAccount> get serializer => _$ProjectServiceAccountSerializer();
}

class _$ProjectServiceAccountSerializer implements PrimitiveSerializer<ProjectServiceAccount> {
  @override
  final Iterable<Type> types = const [ProjectServiceAccount, _$ProjectServiceAccount];

  @override
  final String wireName = r'ProjectServiceAccount';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectServiceAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectServiceAccountObjectEnum),
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
      specifiedType: const FullType(ProjectServiceAccountRoleEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectServiceAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectServiceAccountBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccountObjectEnum),
          ) as ProjectServiceAccountObjectEnum;
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
            specifiedType: const FullType(ProjectServiceAccountRoleEnum),
          ) as ProjectServiceAccountRoleEnum;
          result.role = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectServiceAccount deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectServiceAccountBuilder();
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

class ProjectServiceAccountObjectEnum extends EnumClass {

  /// The object type, which is always `organization.project.service_account`
  @BuiltValueEnumConst(wireName: r'organization.project.service_account')
  static const ProjectServiceAccountObjectEnum organizationPeriodProjectPeriodServiceAccount = _$projectServiceAccountObjectEnum_organizationPeriodProjectPeriodServiceAccount;

  static Serializer<ProjectServiceAccountObjectEnum> get serializer => _$projectServiceAccountObjectEnumSerializer;

  const ProjectServiceAccountObjectEnum._(String name): super(name);

  static BuiltSet<ProjectServiceAccountObjectEnum> get values => _$projectServiceAccountObjectEnumValues;
  static ProjectServiceAccountObjectEnum valueOf(String name) => _$projectServiceAccountObjectEnumValueOf(name);
}

class ProjectServiceAccountRoleEnum extends EnumClass {

  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'owner')
  static const ProjectServiceAccountRoleEnum owner = _$projectServiceAccountRoleEnum_owner;
  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'member')
  static const ProjectServiceAccountRoleEnum member = _$projectServiceAccountRoleEnum_member;

  static Serializer<ProjectServiceAccountRoleEnum> get serializer => _$projectServiceAccountRoleEnumSerializer;

  const ProjectServiceAccountRoleEnum._(String name): super(name);

  static BuiltSet<ProjectServiceAccountRoleEnum> get values => _$projectServiceAccountRoleEnumValues;
  static ProjectServiceAccountRoleEnum valueOf(String name) => _$projectServiceAccountRoleEnumValueOf(name);
}

