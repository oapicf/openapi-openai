//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vector_store_expiration_after.g.dart';

/// The expiration policy for a vector store.
///
/// Properties:
/// * [anchor] - Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
/// * [days] - The number of days after the anchor time that the vector store will expire.
@BuiltValue()
abstract class VectorStoreExpirationAfter implements Built<VectorStoreExpirationAfter, VectorStoreExpirationAfterBuilder> {
  /// Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
  @BuiltValueField(wireName: r'anchor')
  VectorStoreExpirationAfterAnchorEnum get anchor;
  // enum anchorEnum {  last_active_at,  };

  /// The number of days after the anchor time that the vector store will expire.
  @BuiltValueField(wireName: r'days')
  int get days;

  VectorStoreExpirationAfter._();

  factory VectorStoreExpirationAfter([void updates(VectorStoreExpirationAfterBuilder b)]) = _$VectorStoreExpirationAfter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VectorStoreExpirationAfterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VectorStoreExpirationAfter> get serializer => _$VectorStoreExpirationAfterSerializer();
}

class _$VectorStoreExpirationAfterSerializer implements PrimitiveSerializer<VectorStoreExpirationAfter> {
  @override
  final Iterable<Type> types = const [VectorStoreExpirationAfter, _$VectorStoreExpirationAfter];

  @override
  final String wireName = r'VectorStoreExpirationAfter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VectorStoreExpirationAfter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'anchor';
    yield serializers.serialize(
      object.anchor,
      specifiedType: const FullType(VectorStoreExpirationAfterAnchorEnum),
    );
    yield r'days';
    yield serializers.serialize(
      object.days,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    VectorStoreExpirationAfter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VectorStoreExpirationAfterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'anchor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreExpirationAfterAnchorEnum),
          ) as VectorStoreExpirationAfterAnchorEnum;
          result.anchor = valueDes;
          break;
        case r'days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.days = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VectorStoreExpirationAfter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VectorStoreExpirationAfterBuilder();
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

class VectorStoreExpirationAfterAnchorEnum extends EnumClass {

  /// Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
  @BuiltValueEnumConst(wireName: r'last_active_at')
  static const VectorStoreExpirationAfterAnchorEnum lastActiveAt = _$vectorStoreExpirationAfterAnchorEnum_lastActiveAt;

  static Serializer<VectorStoreExpirationAfterAnchorEnum> get serializer => _$vectorStoreExpirationAfterAnchorEnumSerializer;

  const VectorStoreExpirationAfterAnchorEnum._(String name): super(name);

  static BuiltSet<VectorStoreExpirationAfterAnchorEnum> get values => _$vectorStoreExpirationAfterAnchorEnumValues;
  static VectorStoreExpirationAfterAnchorEnum valueOf(String name) => _$vectorStoreExpirationAfterAnchorEnumValueOf(name);
}

