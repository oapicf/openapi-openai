//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/image.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'images_response.g.dart';

/// ImagesResponse
///
/// Properties:
/// * [created] 
/// * [data] 
@BuiltValue()
abstract class ImagesResponse implements Built<ImagesResponse, ImagesResponseBuilder> {
  @BuiltValueField(wireName: r'created')
  int get created;

  @BuiltValueField(wireName: r'data')
  BuiltList<Image> get data;

  ImagesResponse._();

  factory ImagesResponse([void updates(ImagesResponseBuilder b)]) = _$ImagesResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ImagesResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ImagesResponse> get serializer => _$ImagesResponseSerializer();
}

class _$ImagesResponseSerializer implements PrimitiveSerializer<ImagesResponse> {
  @override
  final Iterable<Type> types = const [ImagesResponse, _$ImagesResponse];

  @override
  final String wireName = r'ImagesResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ImagesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'created';
    yield serializers.serialize(
      object.created,
      specifiedType: const FullType(int),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(Image)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ImagesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ImagesResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'created':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.created = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Image)]),
          ) as BuiltList<Image>;
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
  ImagesResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ImagesResponseBuilder();
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

