//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tuning_job_error.g.dart';

/// For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
///
/// Properties:
/// * [code] - A machine-readable error code.
/// * [message] - A human-readable error message.
/// * [param] - The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
@BuiltValue()
abstract class FineTuningJobError implements Built<FineTuningJobError, FineTuningJobErrorBuilder> {
  /// A machine-readable error code.
  @BuiltValueField(wireName: r'code')
  String get code;

  /// A human-readable error message.
  @BuiltValueField(wireName: r'message')
  String get message;

  /// The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
  @BuiltValueField(wireName: r'param')
  String? get param;

  FineTuningJobError._();

  factory FineTuningJobError([void updates(FineTuningJobErrorBuilder b)]) = _$FineTuningJobError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningJobErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningJobError> get serializer => _$FineTuningJobErrorSerializer();
}

class _$FineTuningJobErrorSerializer implements PrimitiveSerializer<FineTuningJobError> {
  @override
  final Iterable<Type> types = const [FineTuningJobError, _$FineTuningJobError];

  @override
  final String wireName = r'FineTuningJobError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningJobError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(String),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
    yield r'param';
    yield object.param == null ? null : serializers.serialize(
      object.param,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningJobError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuningJobErrorBuilder result,
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
        case r'param':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.param = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuningJobError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningJobErrorBuilder();
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

