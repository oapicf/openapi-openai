//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/model.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_models_response.g.dart';

/// ListModelsResponse
///
/// Properties:
/// * [object] 
/// * [data] 
@BuiltValue()
abstract class ListModelsResponse implements Built<ListModelsResponse, ListModelsResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ListModelsResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  @BuiltValueField(wireName: r'data')
  BuiltList<Model> get data;

  ListModelsResponse._();

  factory ListModelsResponse([void updates(ListModelsResponseBuilder b)]) = _$ListModelsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListModelsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListModelsResponse> get serializer => _$ListModelsResponseSerializer();
}

class _$ListModelsResponseSerializer implements PrimitiveSerializer<ListModelsResponse> {
  @override
  final Iterable<Type> types = const [ListModelsResponse, _$ListModelsResponse];

  @override
  final String wireName = r'ListModelsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListModelsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ListModelsResponseObjectEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(Model)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ListModelsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListModelsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ListModelsResponseObjectEnum),
          ) as ListModelsResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Model)]),
          ) as BuiltList<Model>;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ListModelsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListModelsResponseBuilder();
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

class ListModelsResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ListModelsResponseObjectEnum list = _$listModelsResponseObjectEnum_list;

  static Serializer<ListModelsResponseObjectEnum> get serializer => _$listModelsResponseObjectEnumSerializer;

  const ListModelsResponseObjectEnum._(String name): super(name);

  static BuiltSet<ListModelsResponseObjectEnum> get values => _$listModelsResponseObjectEnumValues;
  static ListModelsResponseObjectEnum valueOf(String name) => _$listModelsResponseObjectEnumValueOf(name);
}

