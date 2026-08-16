//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_errors_data_inner.g.dart';

/// BatchErrorsDataInner
///
/// Properties:
/// * [code] - An error code identifying the error type.
/// * [message] - A human-readable message providing more details about the error.
/// * [param] - The name of the parameter that caused the error, if applicable.
/// * [line] - The line number of the input file where the error occurred, if applicable.
@BuiltValue()
abstract class BatchErrorsDataInner implements Built<BatchErrorsDataInner, BatchErrorsDataInnerBuilder> {
  /// An error code identifying the error type.
  @BuiltValueField(wireName: r'code')
  String? get code;

  /// A human-readable message providing more details about the error.
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// The name of the parameter that caused the error, if applicable.
  @BuiltValueField(wireName: r'param')
  String? get param;

  /// The line number of the input file where the error occurred, if applicable.
  @BuiltValueField(wireName: r'line')
  int? get line;

  BatchErrorsDataInner._();

  factory BatchErrorsDataInner([void updates(BatchErrorsDataInnerBuilder b)]) = _$BatchErrorsDataInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchErrorsDataInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BatchErrorsDataInner> get serializer => _$BatchErrorsDataInnerSerializer();
}

class _$BatchErrorsDataInnerSerializer implements PrimitiveSerializer<BatchErrorsDataInner> {
  @override
  final Iterable<Type> types = const [BatchErrorsDataInner, _$BatchErrorsDataInner];

  @override
  final String wireName = r'BatchErrorsDataInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BatchErrorsDataInner object, {
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
    if (object.param != null) {
      yield r'param';
      yield serializers.serialize(
        object.param,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.line != null) {
      yield r'line';
      yield serializers.serialize(
        object.line,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BatchErrorsDataInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchErrorsDataInnerBuilder result,
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
        case r'line':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.line = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BatchErrorsDataInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchErrorsDataInnerBuilder();
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

