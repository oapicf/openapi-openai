//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/admin_api_key.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'api_key_list.g.dart';

/// ApiKeyList
///
/// Properties:
/// * [object] 
/// * [data] 
/// * [hasMore] 
/// * [firstId] 
/// * [lastId] 
@BuiltValue()
abstract class ApiKeyList implements Built<ApiKeyList, ApiKeyListBuilder> {
  @BuiltValueField(wireName: r'object')
  String? get object;

  @BuiltValueField(wireName: r'data')
  BuiltList<AdminApiKey>? get data;

  @BuiltValueField(wireName: r'has_more')
  bool? get hasMore;

  @BuiltValueField(wireName: r'first_id')
  String? get firstId;

  @BuiltValueField(wireName: r'last_id')
  String? get lastId;

  ApiKeyList._();

  factory ApiKeyList([void updates(ApiKeyListBuilder b)]) = _$ApiKeyList;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ApiKeyListBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ApiKeyList> get serializer => _$ApiKeyListSerializer();
}

class _$ApiKeyListSerializer implements PrimitiveSerializer<ApiKeyList> {
  @override
  final Iterable<Type> types = const [ApiKeyList, _$ApiKeyList];

  @override
  final String wireName = r'ApiKeyList';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ApiKeyList object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.object != null) {
      yield r'object';
      yield serializers.serialize(
        object.object,
        specifiedType: const FullType(String),
      );
    }
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(BuiltList, [FullType(AdminApiKey)]),
      );
    }
    if (object.hasMore != null) {
      yield r'has_more';
      yield serializers.serialize(
        object.hasMore,
        specifiedType: const FullType(bool),
      );
    }
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
  }

  @override
  Object serialize(
    Serializers serializers,
    ApiKeyList object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ApiKeyListBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdminApiKey)]),
          ) as BuiltList<AdminApiKey>;
          result.data.replace(valueDes);
          break;
        case r'has_more':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasMore = valueDes;
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ApiKeyList deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ApiKeyListBuilder();
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

