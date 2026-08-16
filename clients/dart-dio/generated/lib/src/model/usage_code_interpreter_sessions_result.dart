//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_code_interpreter_sessions_result.g.dart';

/// The aggregated code interpreter sessions usage details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [sessions] - The number of code interpreter sessions.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped usage result.
@BuiltValue()
abstract class UsageCodeInterpreterSessionsResult implements Built<UsageCodeInterpreterSessionsResult, UsageCodeInterpreterSessionsResultBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageCodeInterpreterSessionsResultObjectEnum get object;
  // enum objectEnum {  organization.usage.code_interpreter_sessions.result,  };

  /// The number of code interpreter sessions.
  @BuiltValueField(wireName: r'sessions')
  int get sessions;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  @BuiltValueField(wireName: r'project_id')
  String? get projectId;

  UsageCodeInterpreterSessionsResult._();

  factory UsageCodeInterpreterSessionsResult([void updates(UsageCodeInterpreterSessionsResultBuilder b)]) = _$UsageCodeInterpreterSessionsResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageCodeInterpreterSessionsResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageCodeInterpreterSessionsResult> get serializer => _$UsageCodeInterpreterSessionsResultSerializer();
}

class _$UsageCodeInterpreterSessionsResultSerializer implements PrimitiveSerializer<UsageCodeInterpreterSessionsResult> {
  @override
  final Iterable<Type> types = const [UsageCodeInterpreterSessionsResult, _$UsageCodeInterpreterSessionsResult];

  @override
  final String wireName = r'UsageCodeInterpreterSessionsResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageCodeInterpreterSessionsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageCodeInterpreterSessionsResultObjectEnum),
    );
    yield r'sessions';
    yield serializers.serialize(
      object.sessions,
      specifiedType: const FullType(int),
    );
    if (object.projectId != null) {
      yield r'project_id';
      yield serializers.serialize(
        object.projectId,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UsageCodeInterpreterSessionsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageCodeInterpreterSessionsResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageCodeInterpreterSessionsResultObjectEnum),
          ) as UsageCodeInterpreterSessionsResultObjectEnum;
          result.object = valueDes;
          break;
        case r'sessions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.sessions = valueDes;
          break;
        case r'project_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.projectId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UsageCodeInterpreterSessionsResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageCodeInterpreterSessionsResultBuilder();
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

class UsageCodeInterpreterSessionsResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.usage.code_interpreter_sessions.result')
  static const UsageCodeInterpreterSessionsResultObjectEnum organizationPeriodUsagePeriodCodeInterpreterSessionsPeriodResult = _$usageCodeInterpreterSessionsResultObjectEnum_organizationPeriodUsagePeriodCodeInterpreterSessionsPeriodResult;

  static Serializer<UsageCodeInterpreterSessionsResultObjectEnum> get serializer => _$usageCodeInterpreterSessionsResultObjectEnumSerializer;

  const UsageCodeInterpreterSessionsResultObjectEnum._(String name): super(name);

  static BuiltSet<UsageCodeInterpreterSessionsResultObjectEnum> get values => _$usageCodeInterpreterSessionsResultObjectEnumValues;
  static UsageCodeInterpreterSessionsResultObjectEnum valueOf(String name) => _$usageCodeInterpreterSessionsResultObjectEnumValueOf(name);
}

