//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_object_last_error.g.dart';

/// The last error associated with this run step. Will be `null` if there are no errors.
///
/// Properties:
/// * [code] - One of `server_error` or `rate_limit_exceeded`.
/// * [message] - A human-readable description of the error.
@BuiltValue()
abstract class RunStepObjectLastError implements Built<RunStepObjectLastError, RunStepObjectLastErrorBuilder> {
  /// One of `server_error` or `rate_limit_exceeded`.
  @BuiltValueField(wireName: r'code')
  RunStepObjectLastErrorCodeEnum get code;
  // enum codeEnum {  server_error,  rate_limit_exceeded,  };

  /// A human-readable description of the error.
  @BuiltValueField(wireName: r'message')
  String get message;

  RunStepObjectLastError._();

  factory RunStepObjectLastError([void updates(RunStepObjectLastErrorBuilder b)]) = _$RunStepObjectLastError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepObjectLastErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepObjectLastError> get serializer => _$RunStepObjectLastErrorSerializer();
}

class _$RunStepObjectLastErrorSerializer implements PrimitiveSerializer<RunStepObjectLastError> {
  @override
  final Iterable<Type> types = const [RunStepObjectLastError, _$RunStepObjectLastError];

  @override
  final String wireName = r'RunStepObjectLastError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepObjectLastError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(RunStepObjectLastErrorCodeEnum),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepObjectLastError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepObjectLastErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepObjectLastErrorCodeEnum),
          ) as RunStepObjectLastErrorCodeEnum;
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
  RunStepObjectLastError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepObjectLastErrorBuilder();
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

class RunStepObjectLastErrorCodeEnum extends EnumClass {

  /// One of `server_error` or `rate_limit_exceeded`.
  @BuiltValueEnumConst(wireName: r'server_error')
  static const RunStepObjectLastErrorCodeEnum serverError = _$runStepObjectLastErrorCodeEnum_serverError;
  /// One of `server_error` or `rate_limit_exceeded`.
  @BuiltValueEnumConst(wireName: r'rate_limit_exceeded')
  static const RunStepObjectLastErrorCodeEnum rateLimitExceeded = _$runStepObjectLastErrorCodeEnum_rateLimitExceeded;

  static Serializer<RunStepObjectLastErrorCodeEnum> get serializer => _$runStepObjectLastErrorCodeEnumSerializer;

  const RunStepObjectLastErrorCodeEnum._(String name): super(name);

  static BuiltSet<RunStepObjectLastErrorCodeEnum> get values => _$runStepObjectLastErrorCodeEnumValues;
  static RunStepObjectLastErrorCodeEnum valueOf(String name) => _$runStepObjectLastErrorCodeEnumValueOf(name);
}

