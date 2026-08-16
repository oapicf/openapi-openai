//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'embedding.g.dart';

/// Represents an embedding vector returned by embedding endpoint. 
///
/// Properties:
/// * [index] - The index of the embedding in the list of embeddings.
/// * [embedding] - The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
/// * [object] - The object type, which is always \"embedding\".
@BuiltValue()
abstract class Embedding implements Built<Embedding, EmbeddingBuilder> {
  /// The index of the embedding in the list of embeddings.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
  @BuiltValueField(wireName: r'embedding')
  BuiltList<num> get embedding;

  /// The object type, which is always \"embedding\".
  @BuiltValueField(wireName: r'object')
  EmbeddingObjectEnum get object;
  // enum objectEnum {  embedding,  };

  Embedding._();

  factory Embedding([void updates(EmbeddingBuilder b)]) = _$Embedding;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EmbeddingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Embedding> get serializer => _$EmbeddingSerializer();
}

class _$EmbeddingSerializer implements PrimitiveSerializer<Embedding> {
  @override
  final Iterable<Type> types = const [Embedding, _$Embedding];

  @override
  final String wireName = r'Embedding';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Embedding object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    yield r'embedding';
    yield serializers.serialize(
      object.embedding,
      specifiedType: const FullType(BuiltList, [FullType(num)]),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(EmbeddingObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Embedding object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EmbeddingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'embedding':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(num)]),
          ) as BuiltList<num>;
          result.embedding.replace(valueDes);
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EmbeddingObjectEnum),
          ) as EmbeddingObjectEnum;
          result.object = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Embedding deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EmbeddingBuilder();
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

class EmbeddingObjectEnum extends EnumClass {

  /// The object type, which is always \"embedding\".
  @BuiltValueEnumConst(wireName: r'embedding')
  static const EmbeddingObjectEnum embedding = _$embeddingObjectEnum_embedding;

  static Serializer<EmbeddingObjectEnum> get serializer => _$embeddingObjectEnumSerializer;

  const EmbeddingObjectEnum._(String name): super(name);

  static BuiltSet<EmbeddingObjectEnum> get values => _$embeddingObjectEnumValues;
  static EmbeddingObjectEnum valueOf(String name) => _$embeddingObjectEnumValueOf(name);
}

