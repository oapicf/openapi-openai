//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/usage_time_bucket.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_response.g.dart';

/// UsageResponse
///
/// Properties:
/// * [object] 
/// * [data] 
/// * [hasMore] 
/// * [nextPage] 
@BuiltValue()
abstract class UsageResponse implements Built<UsageResponse, UsageResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageResponseObjectEnum get object;
  // enum objectEnum {  page,  };

  @BuiltValueField(wireName: r'data')
  BuiltList<UsageTimeBucket> get data;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  @BuiltValueField(wireName: r'next_page')
  String get nextPage;

  UsageResponse._();

  factory UsageResponse([void updates(UsageResponseBuilder b)]) = _$UsageResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageResponse> get serializer => _$UsageResponseSerializer();
}

class _$UsageResponseSerializer implements PrimitiveSerializer<UsageResponse> {
  @override
  final Iterable<Type> types = const [UsageResponse, _$UsageResponse];

  @override
  final String wireName = r'UsageResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageResponseObjectEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(UsageTimeBucket)]),
    );
    yield r'has_more';
    yield serializers.serialize(
      object.hasMore,
      specifiedType: const FullType(bool),
    );
    yield r'next_page';
    yield serializers.serialize(
      object.nextPage,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UsageResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageResponseObjectEnum),
          ) as UsageResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(UsageTimeBucket)]),
          ) as BuiltList<UsageTimeBucket>;
          result.data.replace(valueDes);
          break;
        case r'has_more':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasMore = valueDes;
          break;
        case r'next_page':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.nextPage = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UsageResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageResponseBuilder();
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

class UsageResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'page')
  static const UsageResponseObjectEnum page = _$usageResponseObjectEnum_page;

  static Serializer<UsageResponseObjectEnum> get serializer => _$usageResponseObjectEnumSerializer;

  const UsageResponseObjectEnum._(String name): super(name);

  static BuiltSet<UsageResponseObjectEnum> get values => _$usageResponseObjectEnumValues;
  static UsageResponseObjectEnum valueOf(String name) => _$usageResponseObjectEnumValueOf(name);
}

