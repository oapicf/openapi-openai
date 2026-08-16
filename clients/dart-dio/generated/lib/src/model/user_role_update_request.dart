//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_role_update_request.g.dart';

/// UserRoleUpdateRequest
///
/// Properties:
/// * [role] - `owner` or `reader`
@BuiltValue()
abstract class UserRoleUpdateRequest implements Built<UserRoleUpdateRequest, UserRoleUpdateRequestBuilder> {
  /// `owner` or `reader`
  @BuiltValueField(wireName: r'role')
  UserRoleUpdateRequestRoleEnum get role;
  // enum roleEnum {  owner,  reader,  };

  UserRoleUpdateRequest._();

  factory UserRoleUpdateRequest([void updates(UserRoleUpdateRequestBuilder b)]) = _$UserRoleUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserRoleUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserRoleUpdateRequest> get serializer => _$UserRoleUpdateRequestSerializer();
}

class _$UserRoleUpdateRequestSerializer implements PrimitiveSerializer<UserRoleUpdateRequest> {
  @override
  final Iterable<Type> types = const [UserRoleUpdateRequest, _$UserRoleUpdateRequest];

  @override
  final String wireName = r'UserRoleUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserRoleUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(UserRoleUpdateRequestRoleEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UserRoleUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserRoleUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserRoleUpdateRequestRoleEnum),
          ) as UserRoleUpdateRequestRoleEnum;
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
  UserRoleUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserRoleUpdateRequestBuilder();
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

class UserRoleUpdateRequestRoleEnum extends EnumClass {

  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'owner')
  static const UserRoleUpdateRequestRoleEnum owner = _$userRoleUpdateRequestRoleEnum_owner;
  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'reader')
  static const UserRoleUpdateRequestRoleEnum reader = _$userRoleUpdateRequestRoleEnum_reader;

  static Serializer<UserRoleUpdateRequestRoleEnum> get serializer => _$userRoleUpdateRequestRoleEnumSerializer;

  const UserRoleUpdateRequestRoleEnum._(String name): super(name);

  static BuiltSet<UserRoleUpdateRequestRoleEnum> get values => _$userRoleUpdateRequestRoleEnumValues;
  static UserRoleUpdateRequestRoleEnum valueOf(String name) => _$userRoleUpdateRequestRoleEnumValueOf(name);
}

