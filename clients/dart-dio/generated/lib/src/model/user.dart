//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user.g.dart';

/// Represents an individual `user` within an organization.
///
/// Properties:
/// * [object] - The object type, which is always `organization.user`
/// * [id] - The identifier, which can be referenced in API endpoints
/// * [name] - The name of the user
/// * [email] - The email address of the user
/// * [role] - `owner` or `reader`
/// * [addedAt] - The Unix timestamp (in seconds) of when the user was added.
@BuiltValue()
abstract class User implements Built<User, UserBuilder> {
  /// The object type, which is always `organization.user`
  @BuiltValueField(wireName: r'object')
  UserObjectEnum get object;
  // enum objectEnum {  organization.user,  };

  /// The identifier, which can be referenced in API endpoints
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The name of the user
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The email address of the user
  @BuiltValueField(wireName: r'email')
  String get email;

  /// `owner` or `reader`
  @BuiltValueField(wireName: r'role')
  UserRoleEnum get role;
  // enum roleEnum {  owner,  reader,  };

  /// The Unix timestamp (in seconds) of when the user was added.
  @BuiltValueField(wireName: r'added_at')
  int get addedAt;

  User._();

  factory User([void updates(UserBuilder b)]) = _$User;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<User> get serializer => _$UserSerializer();
}

class _$UserSerializer implements PrimitiveSerializer<User> {
  @override
  final Iterable<Type> types = const [User, _$User];

  @override
  final String wireName = r'User';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    User object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UserObjectEnum),
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
      specifiedType: const FullType(UserRoleEnum),
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
    User object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserObjectEnum),
          ) as UserObjectEnum;
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
            specifiedType: const FullType(UserRoleEnum),
          ) as UserRoleEnum;
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
  User deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserBuilder();
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

class UserObjectEnum extends EnumClass {

  /// The object type, which is always `organization.user`
  @BuiltValueEnumConst(wireName: r'organization.user')
  static const UserObjectEnum organizationPeriodUser = _$userObjectEnum_organizationPeriodUser;

  static Serializer<UserObjectEnum> get serializer => _$userObjectEnumSerializer;

  const UserObjectEnum._(String name): super(name);

  static BuiltSet<UserObjectEnum> get values => _$userObjectEnumValues;
  static UserObjectEnum valueOf(String name) => _$userObjectEnumValueOf(name);
}

class UserRoleEnum extends EnumClass {

  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'owner')
  static const UserRoleEnum owner = _$userRoleEnum_owner;
  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'reader')
  static const UserRoleEnum reader = _$userRoleEnum_reader;

  static Serializer<UserRoleEnum> get serializer => _$userRoleEnumSerializer;

  const UserRoleEnum._(String name): super(name);

  static BuiltSet<UserRoleEnum> get values => _$userRoleEnumValues;
  static UserRoleEnum valueOf(String name) => _$userRoleEnumValueOf(name);
}

