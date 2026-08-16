//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_delete_response.g.dart';

/// UserDeleteResponse
///
/// Properties:
/// * [object] 
/// * [id] 
/// * [deleted] 
@BuiltValue()
abstract class UserDeleteResponse implements Built<UserDeleteResponse, UserDeleteResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  UserDeleteResponseObjectEnum get object;
  // enum objectEnum {  organization.user.deleted,  };

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  UserDeleteResponse._();

  factory UserDeleteResponse([void updates(UserDeleteResponseBuilder b)]) = _$UserDeleteResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserDeleteResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserDeleteResponse> get serializer => _$UserDeleteResponseSerializer();
}

class _$UserDeleteResponseSerializer implements PrimitiveSerializer<UserDeleteResponse> {
  @override
  final Iterable<Type> types = const [UserDeleteResponse, _$UserDeleteResponse];

  @override
  final String wireName = r'UserDeleteResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UserDeleteResponseObjectEnum),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'deleted';
    yield serializers.serialize(
      object.deleted,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UserDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserDeleteResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserDeleteResponseObjectEnum),
          ) as UserDeleteResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.deleted = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UserDeleteResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserDeleteResponseBuilder();
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

class UserDeleteResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.user.deleted')
  static const UserDeleteResponseObjectEnum organizationPeriodUserPeriodDeleted = _$userDeleteResponseObjectEnum_organizationPeriodUserPeriodDeleted;

  static Serializer<UserDeleteResponseObjectEnum> get serializer => _$userDeleteResponseObjectEnumSerializer;

  const UserDeleteResponseObjectEnum._(String name): super(name);

  static BuiltSet<UserDeleteResponseObjectEnum> get values => _$userDeleteResponseObjectEnumValues;
  static UserDeleteResponseObjectEnum valueOf(String name) => _$userDeleteResponseObjectEnumValueOf(name);
}

