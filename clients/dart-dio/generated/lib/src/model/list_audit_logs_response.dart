//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audit_log.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_audit_logs_response.g.dart';

/// ListAuditLogsResponse
///
/// Properties:
/// * [object] 
/// * [data] 
/// * [firstId] 
/// * [lastId] 
/// * [hasMore] 
@BuiltValue()
abstract class ListAuditLogsResponse implements Built<ListAuditLogsResponse, ListAuditLogsResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ListAuditLogsResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  @BuiltValueField(wireName: r'data')
  BuiltList<AuditLog> get data;

  @BuiltValueField(wireName: r'first_id')
  String get firstId;

  @BuiltValueField(wireName: r'last_id')
  String get lastId;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  ListAuditLogsResponse._();

  factory ListAuditLogsResponse([void updates(ListAuditLogsResponseBuilder b)]) = _$ListAuditLogsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListAuditLogsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListAuditLogsResponse> get serializer => _$ListAuditLogsResponseSerializer();
}

class _$ListAuditLogsResponseSerializer implements PrimitiveSerializer<ListAuditLogsResponse> {
  @override
  final Iterable<Type> types = const [ListAuditLogsResponse, _$ListAuditLogsResponse];

  @override
  final String wireName = r'ListAuditLogsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListAuditLogsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ListAuditLogsResponseObjectEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(AuditLog)]),
    );
    yield r'first_id';
    yield serializers.serialize(
      object.firstId,
      specifiedType: const FullType(String),
    );
    yield r'last_id';
    yield serializers.serialize(
      object.lastId,
      specifiedType: const FullType(String),
    );
    yield r'has_more';
    yield serializers.serialize(
      object.hasMore,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ListAuditLogsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListAuditLogsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ListAuditLogsResponseObjectEnum),
          ) as ListAuditLogsResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AuditLog)]),
          ) as BuiltList<AuditLog>;
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
  ListAuditLogsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListAuditLogsResponseBuilder();
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

class ListAuditLogsResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ListAuditLogsResponseObjectEnum list = _$listAuditLogsResponseObjectEnum_list;

  static Serializer<ListAuditLogsResponseObjectEnum> get serializer => _$listAuditLogsResponseObjectEnumSerializer;

  const ListAuditLogsResponseObjectEnum._(String name): super(name);

  static BuiltSet<ListAuditLogsResponseObjectEnum> get values => _$listAuditLogsResponseObjectEnumValues;
  static ListAuditLogsResponseObjectEnum valueOf(String name) => _$listAuditLogsResponseObjectEnumValueOf(name);
}

