//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_delete_response.g.dart';

/// InviteDeleteResponse
///
/// Properties:
/// * [object] - The object type, which is always `organization.invite.deleted`
/// * [id] 
/// * [deleted] 
@BuiltValue()
abstract class InviteDeleteResponse implements Built<InviteDeleteResponse, InviteDeleteResponseBuilder> {
  /// The object type, which is always `organization.invite.deleted`
  @BuiltValueField(wireName: r'object')
  InviteDeleteResponseObjectEnum get object;
  // enum objectEnum {  organization.invite.deleted,  };

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  InviteDeleteResponse._();

  factory InviteDeleteResponse([void updates(InviteDeleteResponseBuilder b)]) = _$InviteDeleteResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteDeleteResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteDeleteResponse> get serializer => _$InviteDeleteResponseSerializer();
}

class _$InviteDeleteResponseSerializer implements PrimitiveSerializer<InviteDeleteResponse> {
  @override
  final Iterable<Type> types = const [InviteDeleteResponse, _$InviteDeleteResponse];

  @override
  final String wireName = r'InviteDeleteResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(InviteDeleteResponseObjectEnum),
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
    InviteDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteDeleteResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteDeleteResponseObjectEnum),
          ) as InviteDeleteResponseObjectEnum;
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
  InviteDeleteResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteDeleteResponseBuilder();
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

class InviteDeleteResponseObjectEnum extends EnumClass {

  /// The object type, which is always `organization.invite.deleted`
  @BuiltValueEnumConst(wireName: r'organization.invite.deleted')
  static const InviteDeleteResponseObjectEnum organizationPeriodInvitePeriodDeleted = _$inviteDeleteResponseObjectEnum_organizationPeriodInvitePeriodDeleted;

  static Serializer<InviteDeleteResponseObjectEnum> get serializer => _$inviteDeleteResponseObjectEnumSerializer;

  const InviteDeleteResponseObjectEnum._(String name): super(name);

  static BuiltSet<InviteDeleteResponseObjectEnum> get values => _$inviteDeleteResponseObjectEnumValues;
  static InviteDeleteResponseObjectEnum valueOf(String name) => _$inviteDeleteResponseObjectEnumValueOf(name);
}

