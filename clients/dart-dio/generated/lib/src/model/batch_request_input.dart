//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_request_input.g.dart';

/// The per-line object of the batch input file
///
/// Properties:
/// * [customId] - A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
/// * [method] - The HTTP method to be used for the request. Currently only `POST` is supported.
/// * [url] - The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
@BuiltValue()
abstract class BatchRequestInput implements Built<BatchRequestInput, BatchRequestInputBuilder> {
  /// A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
  @BuiltValueField(wireName: r'custom_id')
  String? get customId;

  /// The HTTP method to be used for the request. Currently only `POST` is supported.
  @BuiltValueField(wireName: r'method')
  BatchRequestInputMethodEnum? get method;
  // enum methodEnum {  POST,  };

  /// The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
  @BuiltValueField(wireName: r'url')
  String? get url;

  BatchRequestInput._();

  factory BatchRequestInput([void updates(BatchRequestInputBuilder b)]) = _$BatchRequestInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchRequestInputBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BatchRequestInput> get serializer => _$BatchRequestInputSerializer();
}

class _$BatchRequestInputSerializer implements PrimitiveSerializer<BatchRequestInput> {
  @override
  final Iterable<Type> types = const [BatchRequestInput, _$BatchRequestInput];

  @override
  final String wireName = r'BatchRequestInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BatchRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.customId != null) {
      yield r'custom_id';
      yield serializers.serialize(
        object.customId,
        specifiedType: const FullType(String),
      );
    }
    if (object.method != null) {
      yield r'method';
      yield serializers.serialize(
        object.method,
        specifiedType: const FullType(BatchRequestInputMethodEnum),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BatchRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchRequestInputBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'custom_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.customId = valueDes;
          break;
        case r'method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BatchRequestInputMethodEnum),
          ) as BatchRequestInputMethodEnum;
          result.method = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BatchRequestInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchRequestInputBuilder();
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

class BatchRequestInputMethodEnum extends EnumClass {

  /// The HTTP method to be used for the request. Currently only `POST` is supported.
  @BuiltValueEnumConst(wireName: r'POST')
  static const BatchRequestInputMethodEnum POST = _$batchRequestInputMethodEnum_POST;

  static Serializer<BatchRequestInputMethodEnum> get serializer => _$batchRequestInputMethodEnumSerializer;

  const BatchRequestInputMethodEnum._(String name): super(name);

  static BuiltSet<BatchRequestInputMethodEnum> get values => _$batchRequestInputMethodEnumValues;
  static BatchRequestInputMethodEnum valueOf(String name) => _$batchRequestInputMethodEnumValueOf(name);
}

