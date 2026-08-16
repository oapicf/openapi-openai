//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/invite_request_projects_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_request.g.dart';

/// InviteRequest
///
/// Properties:
/// * [email] - Send an email to this address
/// * [role] - `owner` or `reader`
/// * [projects] - An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
@BuiltValue()
abstract class InviteRequest implements Built<InviteRequest, InviteRequestBuilder> {
  /// Send an email to this address
  @BuiltValueField(wireName: r'email')
  String get email;

  /// `owner` or `reader`
  @BuiltValueField(wireName: r'role')
  InviteRequestRoleEnum get role;
  // enum roleEnum {  reader,  owner,  };

  /// An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
  @BuiltValueField(wireName: r'projects')
  BuiltList<InviteRequestProjectsInner>? get projects;

  InviteRequest._();

  factory InviteRequest([void updates(InviteRequestBuilder b)]) = _$InviteRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteRequest> get serializer => _$InviteRequestSerializer();
}

class _$InviteRequestSerializer implements PrimitiveSerializer<InviteRequest> {
  @override
  final Iterable<Type> types = const [InviteRequest, _$InviteRequest];

  @override
  final String wireName = r'InviteRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'email';
    yield serializers.serialize(
      object.email,
      specifiedType: const FullType(String),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(InviteRequestRoleEnum),
    );
    if (object.projects != null) {
      yield r'projects';
      yield serializers.serialize(
        object.projects,
        specifiedType: const FullType(BuiltList, [FullType(InviteRequestProjectsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
            specifiedType: const FullType(InviteRequestRoleEnum),
          ) as InviteRequestRoleEnum;
          result.role = valueDes;
          break;
        case r'projects':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(InviteRequestProjectsInner)]),
          ) as BuiltList<InviteRequestProjectsInner>;
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
  InviteRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteRequestBuilder();
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

class InviteRequestRoleEnum extends EnumClass {

  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'reader')
  static const InviteRequestRoleEnum reader = _$inviteRequestRoleEnum_reader;
  /// `owner` or `reader`
  @BuiltValueEnumConst(wireName: r'owner')
  static const InviteRequestRoleEnum owner = _$inviteRequestRoleEnum_owner;

  static Serializer<InviteRequestRoleEnum> get serializer => _$inviteRequestRoleEnumSerializer;

  const InviteRequestRoleEnum._(String name): super(name);

  static BuiltSet<InviteRequestRoleEnum> get values => _$inviteRequestRoleEnumValues;
  static InviteRequestRoleEnum valueOf(String name) => _$inviteRequestRoleEnumValueOf(name);
}

