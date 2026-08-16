//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'admin_api_keys_create_request.g.dart';

/// AdminApiKeysCreateRequest
///
/// Properties:
/// * [name] 
@BuiltValue()
abstract class AdminApiKeysCreateRequest implements Built<AdminApiKeysCreateRequest, AdminApiKeysCreateRequestBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  AdminApiKeysCreateRequest._();

  factory AdminApiKeysCreateRequest([void updates(AdminApiKeysCreateRequestBuilder b)]) = _$AdminApiKeysCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdminApiKeysCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdminApiKeysCreateRequest> get serializer => _$AdminApiKeysCreateRequestSerializer();
}

class _$AdminApiKeysCreateRequestSerializer implements PrimitiveSerializer<AdminApiKeysCreateRequest> {
  @override
  final Iterable<Type> types = const [AdminApiKeysCreateRequest, _$AdminApiKeysCreateRequest];

  @override
  final String wireName = r'AdminApiKeysCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdminApiKeysCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdminApiKeysCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdminApiKeysCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdminApiKeysCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdminApiKeysCreateRequestBuilder();
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

