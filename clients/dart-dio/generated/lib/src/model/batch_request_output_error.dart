//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_request_output_error.g.dart';

/// For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
///
/// Properties:
/// * [code] - A machine-readable error code.
/// * [message] - A human-readable error message.
@BuiltValue()
abstract class BatchRequestOutputError implements Built<BatchRequestOutputError, BatchRequestOutputErrorBuilder> {
  /// A machine-readable error code.
  @BuiltValueField(wireName: r'code')
  String? get code;

  /// A human-readable error message.
  @BuiltValueField(wireName: r'message')
  String? get message;

  BatchRequestOutputError._();

  factory BatchRequestOutputError([void updates(BatchRequestOutputErrorBuilder b)]) = _$BatchRequestOutputError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchRequestOutputErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BatchRequestOutputError> get serializer => _$BatchRequestOutputErrorSerializer();
}

class _$BatchRequestOutputErrorSerializer implements PrimitiveSerializer<BatchRequestOutputError> {
  @override
  final Iterable<Type> types = const [BatchRequestOutputError, _$BatchRequestOutputError];

  @override
  final String wireName = r'BatchRequestOutputError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BatchRequestOutputError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(String),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BatchRequestOutputError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchRequestOutputErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BatchRequestOutputError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchRequestOutputErrorBuilder();
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

