//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_login_failed.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [errorCode] - The error code of the failure.
/// * [errorMessage] - The error message of the failure.
@BuiltValue()
abstract class AuditLogLoginFailed implements Built<AuditLogLoginFailed, AuditLogLoginFailedBuilder> {
  /// The error code of the failure.
  @BuiltValueField(wireName: r'error_code')
  String? get errorCode;

  /// The error message of the failure.
  @BuiltValueField(wireName: r'error_message')
  String? get errorMessage;

  AuditLogLoginFailed._();

  factory AuditLogLoginFailed([void updates(AuditLogLoginFailedBuilder b)]) = _$AuditLogLoginFailed;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogLoginFailedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogLoginFailed> get serializer => _$AuditLogLoginFailedSerializer();
}

class _$AuditLogLoginFailedSerializer implements PrimitiveSerializer<AuditLogLoginFailed> {
  @override
  final Iterable<Type> types = const [AuditLogLoginFailed, _$AuditLogLoginFailed];

  @override
  final String wireName = r'AuditLogLoginFailed';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogLoginFailed object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errorCode != null) {
      yield r'error_code';
      yield serializers.serialize(
        object.errorCode,
        specifiedType: const FullType(String),
      );
    }
    if (object.errorMessage != null) {
      yield r'error_message';
      yield serializers.serialize(
        object.errorMessage,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogLoginFailed object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogLoginFailedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'error_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.errorCode = valueDes;
          break;
        case r'error_message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.errorMessage = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogLoginFailed deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogLoginFailedBuilder();
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

