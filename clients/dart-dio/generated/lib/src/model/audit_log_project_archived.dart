//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_project_archived.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The project ID.
@BuiltValue()
abstract class AuditLogProjectArchived implements Built<AuditLogProjectArchived, AuditLogProjectArchivedBuilder> {
  /// The project ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  AuditLogProjectArchived._();

  factory AuditLogProjectArchived([void updates(AuditLogProjectArchivedBuilder b)]) = _$AuditLogProjectArchived;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogProjectArchivedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogProjectArchived> get serializer => _$AuditLogProjectArchivedSerializer();
}

class _$AuditLogProjectArchivedSerializer implements PrimitiveSerializer<AuditLogProjectArchived> {
  @override
  final Iterable<Type> types = const [AuditLogProjectArchived, _$AuditLogProjectArchived];

  @override
  final String wireName = r'AuditLogProjectArchived';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogProjectArchived object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogProjectArchived object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogProjectArchivedBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogProjectArchived deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogProjectArchivedBuilder();
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

