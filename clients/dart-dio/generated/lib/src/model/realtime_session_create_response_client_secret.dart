//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_session_create_response_client_secret.g.dart';

/// Ephemeral key returned by the API.
///
/// Properties:
/// * [value] - Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
/// * [expiresAt] - Timestamp for when the token expires. Currently, all tokens expire after one minute. 
@BuiltValue()
abstract class RealtimeSessionCreateResponseClientSecret implements Built<RealtimeSessionCreateResponseClientSecret, RealtimeSessionCreateResponseClientSecretBuilder> {
  /// Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
  @BuiltValueField(wireName: r'value')
  String? get value;

  /// Timestamp for when the token expires. Currently, all tokens expire after one minute. 
  @BuiltValueField(wireName: r'expires_at')
  int? get expiresAt;

  RealtimeSessionCreateResponseClientSecret._();

  factory RealtimeSessionCreateResponseClientSecret([void updates(RealtimeSessionCreateResponseClientSecretBuilder b)]) = _$RealtimeSessionCreateResponseClientSecret;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeSessionCreateResponseClientSecretBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeSessionCreateResponseClientSecret> get serializer => _$RealtimeSessionCreateResponseClientSecretSerializer();
}

class _$RealtimeSessionCreateResponseClientSecretSerializer implements PrimitiveSerializer<RealtimeSessionCreateResponseClientSecret> {
  @override
  final Iterable<Type> types = const [RealtimeSessionCreateResponseClientSecret, _$RealtimeSessionCreateResponseClientSecret];

  @override
  final String wireName = r'RealtimeSessionCreateResponseClientSecret';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeSessionCreateResponseClientSecret object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
    if (object.expiresAt != null) {
      yield r'expires_at';
      yield serializers.serialize(
        object.expiresAt,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeSessionCreateResponseClientSecret object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeSessionCreateResponseClientSecretBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        case r'expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiresAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeSessionCreateResponseClientSecret deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeSessionCreateResponseClientSecretBuilder();
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

