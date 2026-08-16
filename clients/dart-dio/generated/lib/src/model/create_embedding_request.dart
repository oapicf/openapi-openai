//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_embedding_request_model.dart';
import 'package:openapi/src/model/create_embedding_request_input.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_embedding_request.g.dart';

/// CreateEmbeddingRequest
///
/// Properties:
/// * [input] 
/// * [model] 
/// * [encodingFormat] - The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
/// * [dimensions] - The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
/// * [user] - A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
@BuiltValue()
abstract class CreateEmbeddingRequest implements Built<CreateEmbeddingRequest, CreateEmbeddingRequestBuilder> {
  @BuiltValueField(wireName: r'input')
  CreateEmbeddingRequestInput get input;

  @BuiltValueField(wireName: r'model')
  CreateEmbeddingRequestModel get model;

  /// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
  @BuiltValueField(wireName: r'encoding_format')
  CreateEmbeddingRequestEncodingFormatEnum? get encodingFormat;
  // enum encodingFormatEnum {  float,  base64,  };

  /// The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
  @BuiltValueField(wireName: r'dimensions')
  int? get dimensions;

  /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  @BuiltValueField(wireName: r'user')
  String? get user;

  CreateEmbeddingRequest._();

  factory CreateEmbeddingRequest([void updates(CreateEmbeddingRequestBuilder b)]) = _$CreateEmbeddingRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateEmbeddingRequestBuilder b) => b
      ..encodingFormat = CreateEmbeddingRequestEncodingFormatEnum.valueOf('float');

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateEmbeddingRequest> get serializer => _$CreateEmbeddingRequestSerializer();
}

class _$CreateEmbeddingRequestSerializer implements PrimitiveSerializer<CreateEmbeddingRequest> {
  @override
  final Iterable<Type> types = const [CreateEmbeddingRequest, _$CreateEmbeddingRequest];

  @override
  final String wireName = r'CreateEmbeddingRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateEmbeddingRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'input';
    yield serializers.serialize(
      object.input,
      specifiedType: const FullType(CreateEmbeddingRequestInput),
    );
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(CreateEmbeddingRequestModel),
    );
    if (object.encodingFormat != null) {
      yield r'encoding_format';
      yield serializers.serialize(
        object.encodingFormat,
        specifiedType: const FullType(CreateEmbeddingRequestEncodingFormatEnum),
      );
    }
    if (object.dimensions != null) {
      yield r'dimensions';
      yield serializers.serialize(
        object.dimensions,
        specifiedType: const FullType(int),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateEmbeddingRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateEmbeddingRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'input':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateEmbeddingRequestInput),
          ) as CreateEmbeddingRequestInput;
          result.input.replace(valueDes);
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateEmbeddingRequestModel),
          ) as CreateEmbeddingRequestModel;
          result.model.replace(valueDes);
          break;
        case r'encoding_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateEmbeddingRequestEncodingFormatEnum),
          ) as CreateEmbeddingRequestEncodingFormatEnum;
          result.encodingFormat = valueDes;
          break;
        case r'dimensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.dimensions = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.user = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateEmbeddingRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateEmbeddingRequestBuilder();
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

class CreateEmbeddingRequestEncodingFormatEnum extends EnumClass {

  /// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
  @BuiltValueEnumConst(wireName: r'float')
  static const CreateEmbeddingRequestEncodingFormatEnum float = _$createEmbeddingRequestEncodingFormatEnum_float;
  /// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
  @BuiltValueEnumConst(wireName: r'base64')
  static const CreateEmbeddingRequestEncodingFormatEnum base64 = _$createEmbeddingRequestEncodingFormatEnum_base64;

  static Serializer<CreateEmbeddingRequestEncodingFormatEnum> get serializer => _$createEmbeddingRequestEncodingFormatEnumSerializer;

  const CreateEmbeddingRequestEncodingFormatEnum._(String name): super(name);

  static BuiltSet<CreateEmbeddingRequestEncodingFormatEnum> get values => _$createEmbeddingRequestEncodingFormatEnumValues;
  static CreateEmbeddingRequestEncodingFormatEnum valueOf(String name) => _$createEmbeddingRequestEncodingFormatEnumValueOf(name);
}

