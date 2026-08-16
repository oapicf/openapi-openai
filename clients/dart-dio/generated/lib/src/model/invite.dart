//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/invite_projects_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite.g.dart';

/// Represents an individual `invite` to the organization.
///
/// Properties:
/// * [object] - The object type, which is always `organization.invite`
/// * [id] - The identifier, which can be referenced in API endpoints
/// * [email] - The email address of the individual to whom the invite was sent
/// * [role] - `owner` or `reader`
/// * [status] - `accepted`,`expired`, or `pending`
/// * [invitedAt] - The Unix timestamp (in seconds) of when the invite was sent.
/// * [expiresAt] - The Unix timestamp (in seconds) of when the invite expires.
/// * [acceptedAt] - The Unix timestamp (in seconds) of when the invite was accepted.
/// * [projects] - The projects that were granted membership upon acceptance of the invite.
@BuiltValue()
abstract class Invite implements Built<Invite, InviteBuilder> {
  /// The object type, which is always `organization.invite`
  @BuiltValueField(wireName: r'object')
  InviteObjectEnum get object;
  // enum objectEnum {  organization.invite,  };

  /// The identifier, which can be referenced in API endpoints
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The email address of the individual to whom the invite was sent
  @BuiltValueField(wireName: r'email')
  String get email;

  /// `owner` or `reader`
  @BuiltValueField(wireName: r'role')
  InviteRoleEnum get role;
  // enum roleEnum {  owner,  reader,  };

  /// `accepted`,`expired`, or `pending`
  @BuiltValueField(wireName: r'status')
  InviteStatusEnum get status;
  // enum statusEnum {  accepted,  expired,  pending,  };

  /// The Unix timestamp (in seconds) of when the invite was sent.
  @BuiltValueField(wireName: r'invited_at')
  int get invitedAt;

  /// The Unix timestamp (in seconds) of when the invite expires.
  @BuiltValueField(wireName: r'expires_at')
  int get expiresAt;

  /// The Unix timestamp (in seconds) of when the invite was accepted.
  @BuiltValueField(wireName: r'accepted_at')
  int? get acceptedAt;

  /// The projects that were granted membership upon acceptance of the invite.
  @BuiltValueField(wireName: r'projects')
  BuiltList<InviteProjectsInner>? get projects;

  Invite._();

  factory Invite([void updates(InviteBuilder b)]) = _$Invite;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Invite> get serializer => _$InviteSerializer();
}

class _$InviteSerializer implements PrimitiveSerializer<Invite> {
  @override
  final Iterable<Type> types = const [Invite, _$Invite];

  @override
  final String wireName = r'Invite';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Invite object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(InviteObjectEnum),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
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
      specifiedType: const FullType(InviteRoleEnum),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(InviteStatusEnum),
    );
    yield r'invited_at';
    yield serializers.serialize(
      object.invitedAt,
      specifiedType: const FullType(int),
    );
    yield r'expires_at';
    yield serializers.serialize(
      object.expiresAt,
      specifiedType: const FullType(int),
    );
    if (object.acceptedAt != null) {
      yield r'accepted_at';
      yield serializers.serialize(
        object.acceptedAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.projects != null) {
      yield r'projects';
      yield serializers.serialize(
        object.projects,
        specifiedType: const FullType(BuiltList, [FullType(InviteProjectsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Invite object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteObjectEnum),
          ) as InviteObjectEnum;
          result.object = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
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
            specifiedType: const FullType(InviteRoleEnum),
          ) as InviteRoleEnum;
          result.role = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteStatusEnum),
          ) as InviteStatusEnum;
          result.status = valueDes;
          break;
        case r'invited_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.invitedAt = valueDes;
          break;
        case r'expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiresAt = valueDes;
          break;
        case r'accepted_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.acceptedAt = valueDes;
          break;
        case r'projects':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(InviteProjectsInner)]),
          ) as BuiltList<InviteProjectsInner>;
          result.projects.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Invite deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteBuilder();
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

class InviteObjectEnum extends EnumClass {

  /// The object type, which is always `organization.invite`
  @BuiltValueEnumConst(wireName: r'organization.invite')
  static const InviteObjectEnum organizationPeriodInvite = _$inviteObjectEnum_organizationPeriodInvite;

  static Serializer<InviteObjectEnum> get serializer => _$inviteObjectEnumSerializer;

  const InviteObjectEnum._(String name): super(name);

  static BuiltSet<InviteObjectEnum> get values => _$inviteObjectEnumValues;
  static InviteObjectEnum valueOf(String name) => _$inviteObjectEnumValueOf(name);
}

class InviteRoleEnum extends EnumClass {

  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'owner')
  static const InviteRoleEnum owner = _$inviteRoleEnum_owner;
  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'reader')
  static const InviteRoleEnum reader = _$inviteRoleEnum_reader;

  static Serializer<InviteRoleEnum> get serializer => _$inviteRoleEnumSerializer;

  const InviteRoleEnum._(String name): super(name);

  static BuiltSet<InviteRoleEnum> get values => _$inviteRoleEnumValues;
  static InviteRoleEnum valueOf(String name) => _$inviteRoleEnumValueOf(name);
}

class InviteStatusEnum extends EnumClass {

  /// `accepted`,`expired`, or `pending`
  @BuiltValueEnumConst(wireName: r'accepted')
  static const InviteStatusEnum accepted = _$inviteStatusEnum_accepted;
  /// `accepted`,`expired`, or `pending`
  @BuiltValueEnumConst(wireName: r'expired')
  static const InviteStatusEnum expired = _$inviteStatusEnum_expired;
  /// `accepted`,`expired`, or `pending`
  @BuiltValueEnumConst(wireName: r'pending')
  static const InviteStatusEnum pending = _$inviteStatusEnum_pending;

  static Serializer<InviteStatusEnum> get serializer => _$inviteStatusEnumSerializer;

  const InviteStatusEnum._(String name): super(name);

  static BuiltSet<InviteStatusEnum> get values => _$inviteStatusEnumValues;
  static InviteStatusEnum valueOf(String name) => _$inviteStatusEnumValueOf(name);
}

