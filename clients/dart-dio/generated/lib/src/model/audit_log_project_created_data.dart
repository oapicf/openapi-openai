//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_project_created_data.g.dart';

/// The payload used to create the project.
///
/// Properties:
/// * [name] - The project name.
/// * [title] - The title of the project as seen on the dashboard.
@BuiltValue()
abstract class AuditLogProjectCreatedData implements Built<AuditLogProjectCreatedData, AuditLogProjectCreatedDataBuilder> {
  /// The project name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The title of the project as seen on the dashboard.
  @BuiltValueField(wireName: r'title')
  String? get title;

  AuditLogProjectCreatedData._();

  factory AuditLogProjectCreatedData([void updates(AuditLogProjectCreatedDataBuilder b)]) = _$AuditLogProjectCreatedData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogProjectCreatedDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogProjectCreatedData> get serializer => _$AuditLogProjectCreatedDataSerializer();
}

class _$AuditLogProjectCreatedDataSerializer implements PrimitiveSerializer<AuditLogProjectCreatedData> {
  @override
  final Iterable<Type> types = const [AuditLogProjectCreatedData, _$AuditLogProjectCreatedData];

  @override
  final String wireName = r'AuditLogProjectCreatedData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogProjectCreatedData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogProjectCreatedData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogProjectCreatedDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.title = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogProjectCreatedData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogProjectCreatedDataBuilder();
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

