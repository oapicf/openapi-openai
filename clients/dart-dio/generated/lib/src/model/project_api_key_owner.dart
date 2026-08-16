//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/project_user.dart';
import 'package:openapi/src/model/project_service_account.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_api_key_owner.g.dart';

/// ProjectApiKeyOwner
///
/// Properties:
/// * [type] - `user` or `service_account`
/// * [user] 
/// * [serviceAccount] 
@BuiltValue()
abstract class ProjectApiKeyOwner implements Built<ProjectApiKeyOwner, ProjectApiKeyOwnerBuilder> {
  /// `user` or `service_account`
  @BuiltValueField(wireName: r'type')
  ProjectApiKeyOwnerTypeEnum? get type;
  // enum typeEnum {  user,  service_account,  };

  @BuiltValueField(wireName: r'user')
  ProjectUser? get user;

  @BuiltValueField(wireName: r'service_account')
  ProjectServiceAccount? get serviceAccount;

  ProjectApiKeyOwner._();

  factory ProjectApiKeyOwner([void updates(ProjectApiKeyOwnerBuilder b)]) = _$ProjectApiKeyOwner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectApiKeyOwnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectApiKeyOwner> get serializer => _$ProjectApiKeyOwnerSerializer();
}

class _$ProjectApiKeyOwnerSerializer implements PrimitiveSerializer<ProjectApiKeyOwner> {
  @override
  final Iterable<Type> types = const [ProjectApiKeyOwner, _$ProjectApiKeyOwner];

  @override
  final String wireName = r'ProjectApiKeyOwner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectApiKeyOwner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(ProjectApiKeyOwnerTypeEnum),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(ProjectUser),
      );
    }
    if (object.serviceAccount != null) {
      yield r'service_account';
      yield serializers.serialize(
        object.serviceAccount,
        specifiedType: const FullType(ProjectServiceAccount),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectApiKeyOwner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectApiKeyOwnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectApiKeyOwnerTypeEnum),
          ) as ProjectApiKeyOwnerTypeEnum;
          result.type = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectUser),
          ) as ProjectUser;
          result.user.replace(valueDes);
          break;
        case r'service_account':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccount),
          ) as ProjectServiceAccount;
          result.serviceAccount.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectApiKeyOwner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectApiKeyOwnerBuilder();
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

class ProjectApiKeyOwnerTypeEnum extends EnumClass {

  /// `user` or `service_account`
  @BuiltValueEnumConst(wireName: r'user')
  static const ProjectApiKeyOwnerTypeEnum user = _$projectApiKeyOwnerTypeEnum_user;
  /// `user` or `service_account`
  @BuiltValueEnumConst(wireName: r'service_account')
  static const ProjectApiKeyOwnerTypeEnum serviceAccount = _$projectApiKeyOwnerTypeEnum_serviceAccount;

  static Serializer<ProjectApiKeyOwnerTypeEnum> get serializer => _$projectApiKeyOwnerTypeEnumSerializer;

  const ProjectApiKeyOwnerTypeEnum._(String name): super(name);

  static BuiltSet<ProjectApiKeyOwnerTypeEnum> get values => _$projectApiKeyOwnerTypeEnumValues;
  static ProjectApiKeyOwnerTypeEnum valueOf(String name) => _$projectApiKeyOwnerTypeEnumValueOf(name);
}

