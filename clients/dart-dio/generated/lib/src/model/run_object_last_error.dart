//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_object_last_error.g.dart';

/// The last error associated with this run. Will be `null` if there are no errors.
///
/// Properties:
/// * [code] - One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
/// * [message] - A human-readable description of the error.
@BuiltValue()
abstract class RunObjectLastError implements Built<RunObjectLastError, RunObjectLastErrorBuilder> {
  /// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  @BuiltValueField(wireName: r'code')
  RunObjectLastErrorCodeEnum get code;
  // enum codeEnum {  server_error,  rate_limit_exceeded,  invalid_prompt,  };

  /// A human-readable description of the error.
  @BuiltValueField(wireName: r'message')
  String get message;

  RunObjectLastError._();

  factory RunObjectLastError([void updates(RunObjectLastErrorBuilder b)]) = _$RunObjectLastError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunObjectLastErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunObjectLastError> get serializer => _$RunObjectLastErrorSerializer();
}

class _$RunObjectLastErrorSerializer implements PrimitiveSerializer<RunObjectLastError> {
  @override
  final Iterable<Type> types = const [RunObjectLastError, _$RunObjectLastError];

  @override
  final String wireName = r'RunObjectLastError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunObjectLastError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(RunObjectLastErrorCodeEnum),
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
    RunObjectLastError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunObjectLastErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunObjectLastErrorCodeEnum),
          ) as RunObjectLastErrorCodeEnum;
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
  RunObjectLastError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunObjectLastErrorBuilder();
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

class RunObjectLastErrorCodeEnum extends EnumClass {

  /// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  @BuiltValueEnumConst(wireName: r'server_error')
  static const RunObjectLastErrorCodeEnum serverError = _$runObjectLastErrorCodeEnum_serverError;
  /// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  @BuiltValueEnumConst(wireName: r'rate_limit_exceeded')
  static const RunObjectLastErrorCodeEnum rateLimitExceeded = _$runObjectLastErrorCodeEnum_rateLimitExceeded;
  /// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  @BuiltValueEnumConst(wireName: r'invalid_prompt')
  static const RunObjectLastErrorCodeEnum invalidPrompt = _$runObjectLastErrorCodeEnum_invalidPrompt;

  static Serializer<RunObjectLastErrorCodeEnum> get serializer => _$runObjectLastErrorCodeEnumSerializer;

  const RunObjectLastErrorCodeEnum._(String name): super(name);

  static BuiltSet<RunObjectLastErrorCodeEnum> get values => _$runObjectLastErrorCodeEnumValues;
  static RunObjectLastErrorCodeEnum valueOf(String name) => _$runObjectLastErrorCodeEnumValueOf(name);
}

