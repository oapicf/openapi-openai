//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_request_projects_inner.g.dart';

/// InviteRequestProjectsInner
///
/// Properties:
/// * [id] - Project's public ID
/// * [role] - Project membership role
@BuiltValue()
abstract class InviteRequestProjectsInner implements Built<InviteRequestProjectsInner, InviteRequestProjectsInnerBuilder> {
  /// Project's public ID
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Project membership role
  @BuiltValueField(wireName: r'role')
  InviteRequestProjectsInnerRoleEnum get role;
  // enum roleEnum {  member,  owner,  };

  InviteRequestProjectsInner._();

  factory InviteRequestProjectsInner([void updates(InviteRequestProjectsInnerBuilder b)]) = _$InviteRequestProjectsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteRequestProjectsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteRequestProjectsInner> get serializer => _$InviteRequestProjectsInnerSerializer();
}

class _$InviteRequestProjectsInnerSerializer implements PrimitiveSerializer<InviteRequestProjectsInner> {
  @override
  final Iterable<Type> types = const [InviteRequestProjectsInner, _$InviteRequestProjectsInner];

  @override
  final String wireName = r'InviteRequestProjectsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteRequestProjectsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(InviteRequestProjectsInnerRoleEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteRequestProjectsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteRequestProjectsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteRequestProjectsInnerRoleEnum),
          ) as InviteRequestProjectsInnerRoleEnum;
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
  InviteRequestProjectsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteRequestProjectsInnerBuilder();
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

class InviteRequestProjectsInnerRoleEnum extends EnumClass {

  /// Project membership role
  @BuiltValueEnumConst(wireName: r'member')
  static const InviteRequestProjectsInnerRoleEnum member = _$inviteRequestProjectsInnerRoleEnum_member;
  /// Project membership role
  @BuiltValueEnumConst(wireName: r'owner')
  static const InviteRequestProjectsInnerRoleEnum owner = _$inviteRequestProjectsInnerRoleEnum_owner;

  static Serializer<InviteRequestProjectsInnerRoleEnum> get serializer => _$inviteRequestProjectsInnerRoleEnumSerializer;

  const InviteRequestProjectsInnerRoleEnum._(String name): super(name);

  static BuiltSet<InviteRequestProjectsInnerRoleEnum> get values => _$inviteRequestProjectsInnerRoleEnumValues;
  static InviteRequestProjectsInnerRoleEnum valueOf(String name) => _$inviteRequestProjectsInnerRoleEnumValueOf(name);
}

