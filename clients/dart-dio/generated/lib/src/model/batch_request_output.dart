//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/batch_request_output_error.dart';
import 'package:openapi/src/model/batch_request_output_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_request_output.g.dart';

/// The per-line object of the batch output and error files
///
/// Properties:
/// * [id] 
/// * [customId] - A developer-provided per-request id that will be used to match outputs to inputs.
/// * [response] 
/// * [error] 
@BuiltValue()
abstract class BatchRequestOutput implements Built<BatchRequestOutput, BatchRequestOutputBuilder> {
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// A developer-provided per-request id that will be used to match outputs to inputs.
  @BuiltValueField(wireName: r'custom_id')
  String? get customId;

  @BuiltValueField(wireName: r'response')
  BatchRequestOutputResponse? get response;

  @BuiltValueField(wireName: r'error')
  BatchRequestOutputError? get error;

  BatchRequestOutput._();

  factory BatchRequestOutput([void updates(BatchRequestOutputBuilder b)]) = _$BatchRequestOutput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchRequestOutputBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BatchRequestOutput> get serializer => _$BatchRequestOutputSerializer();
}

class _$BatchRequestOutputSerializer implements PrimitiveSerializer<BatchRequestOutput> {
  @override
  final Iterable<Type> types = const [BatchRequestOutput, _$BatchRequestOutput];

  @override
  final String wireName = r'BatchRequestOutput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BatchRequestOutput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.customId != null) {
      yield r'custom_id';
      yield serializers.serialize(
        object.customId,
        specifiedType: const FullType(String),
      );
    }
    if (object.response != null) {
      yield r'response';
      yield serializers.serialize(
        object.response,
        specifiedType: const FullType.nullable(BatchRequestOutputResponse),
      );
    }
    if (object.error != null) {
      yield r'error';
      yield serializers.serialize(
        object.error,
        specifiedType: const FullType.nullable(BatchRequestOutputError),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BatchRequestOutput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchRequestOutputBuilder result,
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
        case r'custom_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.customId = valueDes;
          break;
        case r'response':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BatchRequestOutputResponse),
          ) as BatchRequestOutputResponse?;
          if (valueDes == null) continue;
          result.response.replace(valueDes);
          break;
        case r'error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BatchRequestOutputError),
          ) as BatchRequestOutputError?;
          if (valueDes == null) continue;
          result.error.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BatchRequestOutput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchRequestOutputBuilder();
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

