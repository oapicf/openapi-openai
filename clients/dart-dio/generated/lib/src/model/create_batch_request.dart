//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_batch_request.g.dart';

/// CreateBatchRequest
///
/// Properties:
/// * [inputFileId] - The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
/// * [endpoint] - The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
/// * [completionWindow] - The time frame within which the batch should be processed. Currently only `24h` is supported.
/// * [metadata] - Optional custom metadata for the batch.
@BuiltValue()
abstract class CreateBatchRequest implements Built<CreateBatchRequest, CreateBatchRequestBuilder> {
  /// The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
  @BuiltValueField(wireName: r'input_file_id')
  String get inputFileId;

  /// The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
  @BuiltValueField(wireName: r'endpoint')
  CreateBatchRequestEndpointEnum get endpoint;
  // enum endpointEnum {  /v1/chat/completions,  /v1/embeddings,  /v1/completions,  };

  /// The time frame within which the batch should be processed. Currently only `24h` is supported.
  @BuiltValueField(wireName: r'completion_window')
  CreateBatchRequestCompletionWindowEnum get completionWindow;
  // enum completionWindowEnum {  24h,  };

  /// Optional custom metadata for the batch.
  @BuiltValueField(wireName: r'metadata')
  BuiltMap<String, String>? get metadata;

  CreateBatchRequest._();

  factory CreateBatchRequest([void updates(CreateBatchRequestBuilder b)]) = _$CreateBatchRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateBatchRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateBatchRequest> get serializer => _$CreateBatchRequestSerializer();
}

class _$CreateBatchRequestSerializer implements PrimitiveSerializer<CreateBatchRequest> {
  @override
  final Iterable<Type> types = const [CreateBatchRequest, _$CreateBatchRequest];

  @override
  final String wireName = r'CreateBatchRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'input_file_id';
    yield serializers.serialize(
      object.inputFileId,
      specifiedType: const FullType(String),
    );
    yield r'endpoint';
    yield serializers.serialize(
      object.endpoint,
      specifiedType: const FullType(CreateBatchRequestEndpointEnum),
    );
    yield r'completion_window';
    yield serializers.serialize(
      object.completionWindow,
      specifiedType: const FullType(CreateBatchRequestCompletionWindowEnum),
    );
    if (object.metadata != null) {
      yield r'metadata';
      yield serializers.serialize(
        object.metadata,
        specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateBatchRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'input_file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inputFileId = valueDes;
          break;
        case r'endpoint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateBatchRequestEndpointEnum),
          ) as CreateBatchRequestEndpointEnum;
          result.endpoint = valueDes;
          break;
        case r'completion_window':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateBatchRequestCompletionWindowEnum),
          ) as CreateBatchRequestCompletionWindowEnum;
          result.completionWindow = valueDes;
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(String)]),
          ) as BuiltMap<String, String>?;
          if (valueDes == null) continue;
          result.metadata.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateBatchRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateBatchRequestBuilder();
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

class CreateBatchRequestEndpointEnum extends EnumClass {

  /// The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
  @BuiltValueEnumConst(wireName: r'/v1/chat/completions')
  static const CreateBatchRequestEndpointEnum slashV1SlashChatSlashCompletions = _$createBatchRequestEndpointEnum_slashV1SlashChatSlashCompletions;
  /// The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
  @BuiltValueEnumConst(wireName: r'/v1/embeddings')
  static const CreateBatchRequestEndpointEnum slashV1SlashEmbeddings = _$createBatchRequestEndpointEnum_slashV1SlashEmbeddings;
  /// The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
  @BuiltValueEnumConst(wireName: r'/v1/completions')
  static const CreateBatchRequestEndpointEnum slashV1SlashCompletions = _$createBatchRequestEndpointEnum_slashV1SlashCompletions;

  static Serializer<CreateBatchRequestEndpointEnum> get serializer => _$createBatchRequestEndpointEnumSerializer;

  const CreateBatchRequestEndpointEnum._(String name): super(name);

  static BuiltSet<CreateBatchRequestEndpointEnum> get values => _$createBatchRequestEndpointEnumValues;
  static CreateBatchRequestEndpointEnum valueOf(String name) => _$createBatchRequestEndpointEnumValueOf(name);
}

class CreateBatchRequestCompletionWindowEnum extends EnumClass {

  /// The time frame within which the batch should be processed. Currently only `24h` is supported.
  @BuiltValueEnumConst(wireName: r'24h')
  static const CreateBatchRequestCompletionWindowEnum n24h = _$createBatchRequestCompletionWindowEnum_n24h;

  static Serializer<CreateBatchRequestCompletionWindowEnum> get serializer => _$createBatchRequestCompletionWindowEnumSerializer;

  const CreateBatchRequestCompletionWindowEnum._(String name): super(name);

  static BuiltSet<CreateBatchRequestCompletionWindowEnum> get values => _$createBatchRequestCompletionWindowEnumValues;
  static CreateBatchRequestCompletionWindowEnum valueOf(String name) => _$createBatchRequestCompletionWindowEnumValueOf(name);
}

