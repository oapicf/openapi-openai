//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/invite.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_list_response.g.dart';

/// InviteListResponse
///
/// Properties:
/// * [object] - The object type, which is always `list`
/// * [data] 
/// * [firstId] - The first `invite_id` in the retrieved `list`
/// * [lastId] - The last `invite_id` in the retrieved `list`
/// * [hasMore] - The `has_more` property is used for pagination to indicate there are additional results.
@BuiltValue()
abstract class InviteListResponse implements Built<InviteListResponse, InviteListResponseBuilder> {
  /// The object type, which is always `list`
  @BuiltValueField(wireName: r'object')
  InviteListResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  @BuiltValueField(wireName: r'data')
  BuiltList<Invite> get data;

  /// The first `invite_id` in the retrieved `list`
  @BuiltValueField(wireName: r'first_id')
  String? get firstId;

  /// The last `invite_id` in the retrieved `list`
  @BuiltValueField(wireName: r'last_id')
  String? get lastId;

  /// The `has_more` property is used for pagination to indicate there are additional results.
  @BuiltValueField(wireName: r'has_more')
  bool? get hasMore;

  InviteListResponse._();

  factory InviteListResponse([void updates(InviteListResponseBuilder b)]) = _$InviteListResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteListResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteListResponse> get serializer => _$InviteListResponseSerializer();
}

class _$InviteListResponseSerializer implements PrimitiveSerializer<InviteListResponse> {
  @override
  final Iterable<Type> types = const [InviteListResponse, _$InviteListResponse];

  @override
  final String wireName = r'InviteListResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(InviteListResponseObjectEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(Invite)]),
    );
    if (object.firstId != null) {
      yield r'first_id';
      yield serializers.serialize(
        object.firstId,
        specifiedType: const FullType(String),
      );
    }
    if (object.lastId != null) {
      yield r'last_id';
      yield serializers.serialize(
        object.lastId,
        specifiedType: const FullType(String),
      );
    }
    if (object.hasMore != null) {
      yield r'has_more';
      yield serializers.serialize(
        object.hasMore,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteListResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteListResponseObjectEnum),
          ) as InviteListResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Invite)]),
          ) as BuiltList<Invite>;
          result.data.replace(valueDes);
          break;
        case r'first_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.firstId = valueDes;
          break;
        case r'last_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.lastId = valueDes;
          break;
        case r'has_more':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasMore = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InviteListResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteListResponseBuilder();
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

class InviteListResponseObjectEnum extends EnumClass {

  /// The object type, which is always `list`
  @BuiltValueEnumConst(wireName: r'list')
  static const InviteListResponseObjectEnum list = _$inviteListResponseObjectEnum_list;

  static Serializer<InviteListResponseObjectEnum> get serializer => _$inviteListResponseObjectEnumSerializer;

  const InviteListResponseObjectEnum._(String name): super(name);

  static BuiltSet<InviteListResponseObjectEnum> get values => _$inviteListResponseObjectEnumValues;
  static InviteListResponseObjectEnum valueOf(String name) => _$inviteListResponseObjectEnumValueOf(name);
}

