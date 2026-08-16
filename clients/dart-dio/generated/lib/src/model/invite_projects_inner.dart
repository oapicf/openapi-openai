//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_projects_inner.g.dart';

/// InviteProjectsInner
///
/// Properties:
/// * [id] - Project's public ID
/// * [role] - Project membership role
@BuiltValue()
abstract class InviteProjectsInner implements Built<InviteProjectsInner, InviteProjectsInnerBuilder> {
  /// Project's public ID
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Project membership role
  @BuiltValueField(wireName: r'role')
  InviteProjectsInnerRoleEnum? get role;
  // enum roleEnum {  member,  owner,  };

  InviteProjectsInner._();

  factory InviteProjectsInner([void updates(InviteProjectsInnerBuilder b)]) = _$InviteProjectsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteProjectsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteProjectsInner> get serializer => _$InviteProjectsInnerSerializer();
}

class _$InviteProjectsInnerSerializer implements PrimitiveSerializer<InviteProjectsInner> {
  @override
  final Iterable<Type> types = const [InviteProjectsInner, _$InviteProjectsInner];

  @override
  final String wireName = r'InviteProjectsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteProjectsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.role != null) {
      yield r'role';
      yield serializers.serialize(
        object.role,
        specifiedType: const FullType(InviteProjectsInnerRoleEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteProjectsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteProjectsInnerBuilder result,
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
            specifiedType: const FullType(InviteProjectsInnerRoleEnum),
          ) as InviteProjectsInnerRoleEnum;
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
  InviteProjectsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteProjectsInnerBuilder();
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

class InviteProjectsInnerRoleEnum extends EnumClass {

  /// Project membership role
  @BuiltValueEnumConst(wireName: r'member')
  static const InviteProjectsInnerRoleEnum member = _$inviteProjectsInnerRoleEnum_member;
  /// Project membership role
  @BuiltValueEnumConst(wireName: r'owner')
  static const InviteProjectsInnerRoleEnum owner = _$inviteProjectsInnerRoleEnum_owner;

  static Serializer<InviteProjectsInnerRoleEnum> get serializer => _$inviteProjectsInnerRoleEnumSerializer;

  const InviteProjectsInnerRoleEnum._(String name): super(name);

  static BuiltSet<InviteProjectsInnerRoleEnum> get values => _$inviteProjectsInnerRoleEnumValues;
  static InviteProjectsInnerRoleEnum valueOf(String name) => _$inviteProjectsInnerRoleEnumValueOf(name);
}

