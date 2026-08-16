//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_user.g.dart';

/// Represents an individual user in a project.
///
/// Properties:
/// * [object] - The object type, which is always `organization.project.user`
/// * [id] - The identifier, which can be referenced in API endpoints
/// * [name] - The name of the user
/// * [email] - The email address of the user
/// * [role] - `owner` or `member`
/// * [addedAt] - The Unix timestamp (in seconds) of when the project was added.
@BuiltValue()
abstract class ProjectUser implements Built<ProjectUser, ProjectUserBuilder> {
  /// The object type, which is always `organization.project.user`
  @BuiltValueField(wireName: r'object')
  ProjectUserObjectEnum get object;
  // enum objectEnum {  organization.project.user,  };

  /// The identifier, which can be referenced in API endpoints
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The name of the user
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The email address of the user
  @BuiltValueField(wireName: r'email')
  String get email;

  /// `owner` or `member`
  @BuiltValueField(wireName: r'role')
  ProjectUserRoleEnum get role;
  // enum roleEnum {  owner,  member,  };

  /// The Unix timestamp (in seconds) of when the project was added.
  @BuiltValueField(wireName: r'added_at')
  int get addedAt;

  ProjectUser._();

  factory ProjectUser([void updates(ProjectUserBuilder b)]) = _$ProjectUser;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectUserBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectUser> get serializer => _$ProjectUserSerializer();
}

class _$ProjectUserSerializer implements PrimitiveSerializer<ProjectUser> {
  @override
  final Iterable<Type> types = const [ProjectUser, _$ProjectUser];

  @override
  final String wireName = r'ProjectUser';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectUser object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectUserObjectEnum),
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
    yield r'email';
    yield serializers.serialize(
      object.email,
      specifiedType: const FullType(String),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ProjectUserRoleEnum),
    );
    yield r'added_at';
    yield serializers.serialize(
      object.addedAt,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectUser object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectUserBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectUserObjectEnum),
          ) as ProjectUserObjectEnum;
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
        case r'email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.email = valueDes;
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectUserRoleEnum),
          ) as ProjectUserRoleEnum;
          result.role = valueDes;
          break;
        case r'added_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.addedAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectUser deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectUserBuilder();
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

class ProjectUserObjectEnum extends EnumClass {

  /// The object type, which is always `organization.project.user`
  @BuiltValueEnumConst(wireName: r'organization.project.user')
  static const ProjectUserObjectEnum organizationPeriodProjectPeriodUser = _$projectUserObjectEnum_organizationPeriodProjectPeriodUser;

  static Serializer<ProjectUserObjectEnum> get serializer => _$projectUserObjectEnumSerializer;

  const ProjectUserObjectEnum._(String name): super(name);

  static BuiltSet<ProjectUserObjectEnum> get values => _$projectUserObjectEnumValues;
  static ProjectUserObjectEnum valueOf(String name) => _$projectUserObjectEnumValueOf(name);
}

class ProjectUserRoleEnum extends EnumClass {

  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'owner')
  static const ProjectUserRoleEnum owner = _$projectUserRoleEnum_owner;
  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'member')
  static const ProjectUserRoleEnum member = _$projectUserRoleEnum_member;

  static Serializer<ProjectUserRoleEnum> get serializer => _$projectUserRoleEnumSerializer;

  const ProjectUserRoleEnum._(String name): super(name);

  static BuiltSet<ProjectUserRoleEnum> get values => _$projectUserRoleEnumValues;
  static ProjectUserRoleEnum valueOf(String name) => _$projectUserRoleEnumValueOf(name);
}

