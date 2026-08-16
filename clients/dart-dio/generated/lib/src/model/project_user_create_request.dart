//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_user_create_request.g.dart';

/// ProjectUserCreateRequest
///
/// Properties:
/// * [userId] - The ID of the user.
/// * [role] - `owner` or `member`
@BuiltValue()
abstract class ProjectUserCreateRequest implements Built<ProjectUserCreateRequest, ProjectUserCreateRequestBuilder> {
  /// The ID of the user.
  @BuiltValueField(wireName: r'user_id')
  String get userId;

  /// `owner` or `member`
  @BuiltValueField(wireName: r'role')
  ProjectUserCreateRequestRoleEnum get role;
  // enum roleEnum {  owner,  member,  };

  ProjectUserCreateRequest._();

  factory ProjectUserCreateRequest([void updates(ProjectUserCreateRequestBuilder b)]) = _$ProjectUserCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectUserCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectUserCreateRequest> get serializer => _$ProjectUserCreateRequestSerializer();
}

class _$ProjectUserCreateRequestSerializer implements PrimitiveSerializer<ProjectUserCreateRequest> {
  @override
  final Iterable<Type> types = const [ProjectUserCreateRequest, _$ProjectUserCreateRequest];

  @override
  final String wireName = r'ProjectUserCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectUserCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'user_id';
    yield serializers.serialize(
      object.userId,
      specifiedType: const FullType(String),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ProjectUserCreateRequestRoleEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectUserCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectUserCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.userId = valueDes;
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectUserCreateRequestRoleEnum),
          ) as ProjectUserCreateRequestRoleEnum;
          result.role = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectUserCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectUserCreateRequestBuilder();
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

class ProjectUserCreateRequestRoleEnum extends EnumClass {

  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'owner')
  static const ProjectUserCreateRequestRoleEnum owner = _$projectUserCreateRequestRoleEnum_owner;
  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'member')
  static const ProjectUserCreateRequestRoleEnum member = _$projectUserCreateRequestRoleEnum_member;

  static Serializer<ProjectUserCreateRequestRoleEnum> get serializer => _$projectUserCreateRequestRoleEnumSerializer;

  const ProjectUserCreateRequestRoleEnum._(String name): super(name);

  static BuiltSet<ProjectUserCreateRequestRoleEnum> get values => _$projectUserCreateRequestRoleEnumValues;
  static ProjectUserCreateRequestRoleEnum valueOf(String name) => _$projectUserCreateRequestRoleEnumValueOf(name);
}

