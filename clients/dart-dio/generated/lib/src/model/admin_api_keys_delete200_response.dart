//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'admin_api_keys_delete200_response.g.dart';

/// AdminApiKeysDelete200Response
///
/// Properties:
/// * [id] 
/// * [object] 
/// * [deleted] 
@BuiltValue()
abstract class AdminApiKeysDelete200Response implements Built<AdminApiKeysDelete200Response, AdminApiKeysDelete200ResponseBuilder> {
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'object')
  String? get object;

  @BuiltValueField(wireName: r'deleted')
  bool? get deleted;

  AdminApiKeysDelete200Response._();

  factory AdminApiKeysDelete200Response([void updates(AdminApiKeysDelete200ResponseBuilder b)]) = _$AdminApiKeysDelete200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdminApiKeysDelete200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdminApiKeysDelete200Response> get serializer => _$AdminApiKeysDelete200ResponseSerializer();
}

class _$AdminApiKeysDelete200ResponseSerializer implements PrimitiveSerializer<AdminApiKeysDelete200Response> {
  @override
  final Iterable<Type> types = const [AdminApiKeysDelete200Response, _$AdminApiKeysDelete200Response];

  @override
  final String wireName = r'AdminApiKeysDelete200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdminApiKeysDelete200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.object != null) {
      yield r'object';
      yield serializers.serialize(
        object.object,
        specifiedType: const FullType(String),
      );
    }
    if (object.deleted != null) {
      yield r'deleted';
      yield serializers.serialize(
        object.deleted,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdminApiKeysDelete200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdminApiKeysDelete200ResponseBuilder result,
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
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.object = valueDes;
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
  AdminApiKeysDelete200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdminApiKeysDelete200ResponseBuilder();
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

