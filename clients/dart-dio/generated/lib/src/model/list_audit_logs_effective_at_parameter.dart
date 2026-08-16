//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_audit_logs_effective_at_parameter.g.dart';

/// ListAuditLogsEffectiveAtParameter
///
/// Properties:
/// * [gt] - Return only events whose `effective_at` (Unix seconds) is greater than this value.
/// * [gte] - Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
/// * [lt] - Return only events whose `effective_at` (Unix seconds) is less than this value.
/// * [lte] - Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
@BuiltValue()
abstract class ListAuditLogsEffectiveAtParameter implements Built<ListAuditLogsEffectiveAtParameter, ListAuditLogsEffectiveAtParameterBuilder> {
  /// Return only events whose `effective_at` (Unix seconds) is greater than this value.
  @BuiltValueField(wireName: r'gt')
  int? get gt;

  /// Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
  @BuiltValueField(wireName: r'gte')
  int? get gte;

  /// Return only events whose `effective_at` (Unix seconds) is less than this value.
  @BuiltValueField(wireName: r'lt')
  int? get lt;

  /// Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
  @BuiltValueField(wireName: r'lte')
  int? get lte;

  ListAuditLogsEffectiveAtParameter._();

  factory ListAuditLogsEffectiveAtParameter([void updates(ListAuditLogsEffectiveAtParameterBuilder b)]) = _$ListAuditLogsEffectiveAtParameter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListAuditLogsEffectiveAtParameterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListAuditLogsEffectiveAtParameter> get serializer => _$ListAuditLogsEffectiveAtParameterSerializer();
}

class _$ListAuditLogsEffectiveAtParameterSerializer implements PrimitiveSerializer<ListAuditLogsEffectiveAtParameter> {
  @override
  final Iterable<Type> types = const [ListAuditLogsEffectiveAtParameter, _$ListAuditLogsEffectiveAtParameter];

  @override
  final String wireName = r'ListAuditLogsEffectiveAtParameter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListAuditLogsEffectiveAtParameter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.gt != null) {
      yield r'gt';
      yield serializers.serialize(
        object.gt,
        specifiedType: const FullType(int),
      );
    }
    if (object.gte != null) {
      yield r'gte';
      yield serializers.serialize(
        object.gte,
        specifiedType: const FullType(int),
      );
    }
    if (object.lt != null) {
      yield r'lt';
      yield serializers.serialize(
        object.lt,
        specifiedType: const FullType(int),
      );
    }
    if (object.lte != null) {
      yield r'lte';
      yield serializers.serialize(
        object.lte,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ListAuditLogsEffectiveAtParameter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListAuditLogsEffectiveAtParameterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'gt':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.gt = valueDes;
          break;
        case r'gte':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.gte = valueDes;
          break;
        case r'lt':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lt = valueDes;
          break;
        case r'lte':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lte = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ListAuditLogsEffectiveAtParameter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListAuditLogsEffectiveAtParameterBuilder();
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

