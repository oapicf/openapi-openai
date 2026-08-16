//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_user_update_request.g.dart';

/// ProjectUserUpdateRequest
///
/// Properties:
/// * [role] - `owner` or `member`
@BuiltValue()
abstract class ProjectUserUpdateRequest implements Built<ProjectUserUpdateRequest, ProjectUserUpdateRequestBuilder> {
  /// `owner` or `member`
  @BuiltValueField(wireName: r'role')
  ProjectUserUpdateRequestRoleEnum get role;
  // enum roleEnum {  owner,  member,  };

  ProjectUserUpdateRequest._();

  factory ProjectUserUpdateRequest([void updates(ProjectUserUpdateRequestBuilder b)]) = _$ProjectUserUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectUserUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectUserUpdateRequest> get serializer => _$ProjectUserUpdateRequestSerializer();
}

class _$ProjectUserUpdateRequestSerializer implements PrimitiveSerializer<ProjectUserUpdateRequest> {
  @override
  final Iterable<Type> types = const [ProjectUserUpdateRequest, _$ProjectUserUpdateRequest];

  @override
  final String wireName = r'ProjectUserUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectUserUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ProjectUserUpdateRequestRoleEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectUserUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectUserUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectUserUpdateRequestRoleEnum),
          ) as ProjectUserUpdateRequestRoleEnum;
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
  ProjectUserUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectUserUpdateRequestBuilder();
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

class ProjectUserUpdateRequestRoleEnum extends EnumClass {

  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'owner')
  static const ProjectUserUpdateRequestRoleEnum owner = _$projectUserUpdateRequestRoleEnum_owner;
  /// `owner` or `member`
  @BuiltValueEnumConst(wireName: r'member')
  static const ProjectUserUpdateRequestRoleEnum member = _$projectUserUpdateRequestRoleEnum_member;

  static Serializer<ProjectUserUpdateRequestRoleEnum> get serializer => _$projectUserUpdateRequestRoleEnumSerializer;

  const ProjectUserUpdateRequestRoleEnum._(String name): super(name);

  static BuiltSet<ProjectUserUpdateRequestRoleEnum> get values => _$projectUserUpdateRequestRoleEnumValues;
  static ProjectUserUpdateRequestRoleEnum valueOf(String name) => _$projectUserUpdateRequestRoleEnumValueOf(name);
}

