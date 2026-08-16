//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'model.g.dart';

/// Describes an OpenAI model offering that can be used with the API.
///
/// Properties:
/// * [id] - The model identifier, which can be referenced in the API endpoints.
/// * [created] - The Unix timestamp (in seconds) when the model was created.
/// * [object] - The object type, which is always \"model\".
/// * [ownedBy] - The organization that owns the model.
@BuiltValue()
abstract class Model implements Built<Model, ModelBuilder> {
  /// The model identifier, which can be referenced in the API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The Unix timestamp (in seconds) when the model was created.
  @BuiltValueField(wireName: r'created')
  int get created;

  /// The object type, which is always \"model\".
  @BuiltValueField(wireName: r'object')
  ModelObjectEnum get object;
  // enum objectEnum {  model,  };

  /// The organization that owns the model.
  @BuiltValueField(wireName: r'owned_by')
  String get ownedBy;

  Model._();

  factory Model([void updates(ModelBuilder b)]) = _$Model;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Model> get serializer => _$ModelSerializer();
}

class _$ModelSerializer implements PrimitiveSerializer<Model> {
  @override
  final Iterable<Type> types = const [Model, _$Model];

  @override
  final String wireName = r'Model';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Model object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'created';
    yield serializers.serialize(
      object.created,
      specifiedType: const FullType(int),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ModelObjectEnum),
    );
    yield r'owned_by';
    yield serializers.serialize(
      object.ownedBy,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Model object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ModelBuilder result,
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
        case r'created':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.created = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ModelObjectEnum),
          ) as ModelObjectEnum;
          result.object = valueDes;
          break;
        case r'owned_by':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.ownedBy = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Model deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ModelBuilder();
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

class ModelObjectEnum extends EnumClass {

  /// The object type, which is always \"model\".
  @BuiltValueEnumConst(wireName: r'model')
  static const ModelObjectEnum model = _$modelObjectEnum_model;

  static Serializer<ModelObjectEnum> get serializer => _$modelObjectEnumSerializer;

  const ModelObjectEnum._(String name): super(name);

  static BuiltSet<ModelObjectEnum> get values => _$modelObjectEnumValues;
  static ModelObjectEnum valueOf(String name) => _$modelObjectEnumValueOf(name);
}

